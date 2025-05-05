package ministry_records_management_system.ministry_records_management_system.contracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
	private Long id;
	private Long departmentCode;
	private String departmentName;
}
