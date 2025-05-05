package ministry_records_management_system.ministry_records_management_system.controllers;

import ministry_records_management_system.ministry_records_management_system.contracts.DocumentDTO;
import ministry_records_management_system.ministry_records_management_system.services.DocumentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentController {

	private DocumentService documentService;

	public DocumentController(DocumentService documentService) {
		this.documentService = documentService;
	}

	@GetMapping
	public ResponseEntity<List<DocumentDTO>> getAllDocuments(@PathVariable DocumentDTO documentDTO) {
		return ResponseEntity.ok(documentService.getAllDocuments());
	}

	@PostMapping
	public ResponseEntity<?> createDocuments(@RequestBody List<DocumentDTO> createDocumentsList) {
		if (createDocumentsList == null || createDocumentsList.isEmpty()) {
			return ResponseEntity.badRequest().body("User list cannot be empty.");
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(documentService.createDocuments(createDocumentsList));
	}

}
