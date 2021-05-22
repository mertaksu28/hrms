package javakamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "systemusers")
public class SystemWorker {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "userid")
	private int userid;

	@Column(name = "workername")
	private String workerName;

}
