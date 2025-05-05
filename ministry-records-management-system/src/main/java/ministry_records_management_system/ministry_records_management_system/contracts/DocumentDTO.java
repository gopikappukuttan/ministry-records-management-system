package ministry_records_management_system.ministry_records_management_system.contracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentDTO {
	private Long id;

	private Long documentNumber;

	private String title;

	private String description;
}
