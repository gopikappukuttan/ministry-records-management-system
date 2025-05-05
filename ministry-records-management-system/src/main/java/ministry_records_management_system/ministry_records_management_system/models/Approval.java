package ministry_records_management_system.ministry_records_management_system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ministry_records_management_system.ministry_records_management_system.enums.ApprovalStatus;

import java.time.LocalDate;

@Entity
@Table(name = "approvals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Approval {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Department department;

	@Enumerated(EnumType.STRING)
	private ApprovalStatus approvalStatus;

	private LocalDate approvalDate;

	private Long approverId;
}
