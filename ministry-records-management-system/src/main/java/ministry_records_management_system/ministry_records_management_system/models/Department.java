package ministry_records_management_system.ministry_records_management_system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ministry_records_management_system.ministry_records_management_system.enums.ActiveStatus;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false,unique = true)
	private Long departmentCode;

	@Column(nullable = false)
	private String departmentName;

	@Column(nullable = false)
	private String description;

	@Enumerated(EnumType.STRING)
	private ActiveStatus accountStatus;


}
