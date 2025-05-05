package ministry_records_management_system.ministry_records_management_system.repositories;

import ministry_records_management_system.ministry_records_management_system.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Long> {

	@Query("SELECT u FROM Document u WHERE u.documentNumber = :documentNumber " +
			"AND u.creationDate = :creationDate AND u.documentType = :documentType" +
			"AND u.securityClassification = :securityClassification ")
	List<Document>find_documents(@Param("documentNumber") String documentNumber,
								 @Param("creationDate") String creationDate,
								 @Param("documentType") String documentType,
								 @Param("securityClassification") String securityClassification);

}
