package ministry_records_management_system.ministry_records_management_system.services;

import ministry_records_management_system.ministry_records_management_system.contracts.DocumentDTO;
import ministry_records_management_system.ministry_records_management_system.models.Document;
import ministry_records_management_system.ministry_records_management_system.repositories.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

	private DocumentRepository documentRepository;

	public DocumentService(DocumentRepository documentRepository) {
		this.documentRepository = documentRepository;
	}


	public Object createDocuments(List<DocumentDTO> createDocumentsList) {
		Document documentDTO = new Document();
		documentDTO.setTitle(documentDTO.getTitle());
		documentDTO.setDocumentNumber(documentDTO.getDocumentNumber());
		documentDTO.setDescription(documentDTO.getDescription());
		Document savedDocument = documentRepository.save(documentDTO);
		return new DocumentDTO(documentDTO.getId(),documentDTO.getDocumentNumber(), documentDTO.getTitle(), documentDTO.getDescription());
	}

	public Object getAllDocuments(Long documentNumber, String title) {
		return documentRepository.find_documents();
	}
}
