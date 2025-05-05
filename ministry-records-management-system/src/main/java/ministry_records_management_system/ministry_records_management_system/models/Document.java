package ministry_records_management_system.ministry_records_management_system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ministry_records_management_system.ministry_records_management_system.enums.DocumentType;
import ministry_records_management_system.ministry_records_management_system.enums.SecurityClassification;

import java.time.LocalDate;

@Entity
@Table(name = "documents")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false,unique = true)
	private Long documentNumber;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String description;

 	private LocalDate creationDate;

	@Enumerated(EnumType.STRING)
	private DocumentType documentType;

	@Enumerated(EnumType.STRING)
	private SecurityClassification securityClassification;

	private String digitalFileLocation;


}
