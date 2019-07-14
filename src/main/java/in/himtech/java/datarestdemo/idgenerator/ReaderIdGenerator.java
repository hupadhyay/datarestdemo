package in.himtech.java.datarestdemo.idgenerator;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ReaderIdGenerator implements IdentifierGenerator{
	
	private static int counter = 1;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "R";
		return prefix + String.format("%03d", counter++);
	}
	
	
}
