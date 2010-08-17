package org.springframework.roo.addon.dbre.model.dialect;

import org.springframework.roo.addon.dbre.model.Schema;

/**
 * An SQL dialect for the MySQL database.
 * 
 * @author Alan Stewart
 * @since 1.1
 */
public class MySQLDialect extends AbstractDialect implements Dialect {
	
	public boolean supportsSequences() {
		return false;
	}

	public String getQuerySequencesString(Schema schema) {
		throw new UnsupportedOperationException("MySQL does not support sequences");
	}
}
