package com.rubypaper.exception;

//검색된 Board 엔티티가 없을 때 발생하는 예외
public class BoardNotFoundException extends BoardException {
	private static final long serialVersionUID = 1L;
	
	public BoardNotFoundException(String message) {
		super(message);
	}
}
