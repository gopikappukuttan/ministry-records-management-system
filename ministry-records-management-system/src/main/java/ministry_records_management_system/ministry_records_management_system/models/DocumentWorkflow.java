package ministry_records_management_system.ministry_records_management_system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ministry_records_management_system.ministry_records_management_system.enums.CurrentState;

import java.time.LocalDate;

@Entity
@Table(name = "document_work_flow")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentWorkflow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "document_id")
	private Document document;

	@Enumerated(EnumType.STRING)
	private CurrentState currentState;

	private LocalDate lastModifiedDate;

	private String comments;
}
