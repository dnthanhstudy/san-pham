package com.laptrinhjavaweb.exception;

import com.laptrinhjavaweb.dto.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;


@ControllerAdvice

public class ControllerAdvisor extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DataAlreadyExistException.class)
    public ResponseEntity<ErrorResponseDTO> handleFiledErrorException(
    		DataAlreadyExistException ex) {
		ErrorResponseDTO error = new ErrorResponseDTO();
        error.setError(ex.getMessage());
		List<String> details = new ArrayList<>();
		error.setDetails(details);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ErrorResponseDTO> handleEntityNotFoundException(EntityNotFoundException ex){
		ErrorResponseDTO error = new ErrorResponseDTO();
		error.setError(ex.getMessage());
		List<String> details = new ArrayList<>();
		error.setDetails(details);
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ClientError.class)
    public ResponseEntity<ErrorResponseDTO> clientErrorException(
    		ClientError ex) {
		ErrorResponseDTO error = new ErrorResponseDTO();
        error.setError(ex.getMessage());
		List<String> details = new ArrayList<>();
		error.setDetails(details);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
