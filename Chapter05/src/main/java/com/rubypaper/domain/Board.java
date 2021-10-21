package com.rubypaper.domain;

import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@ToString
@Entity
public class Board {
	@Id @GeneratedValue
	private Long seq;
	private String title;
	private String writer;
	private String content;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createDate;
	private Long cnt;
}
