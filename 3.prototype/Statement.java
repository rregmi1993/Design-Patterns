package prototype;

import java.util.List;

public class Statement implements Cloneable{

	private String sql;
	private List<String> parameters;
	private Records record;
	
	public Statement(String sql, List<String> parameters, Records record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}
	
	public Statement clone() {
		try {
			return (Statement) super.clone();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	public Records getRecord() {
		return record;
	}

	public void setRecord(Records record) {
		this.record = record;
	}
	
	
	
}
