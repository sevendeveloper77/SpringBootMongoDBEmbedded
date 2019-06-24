package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class Product {
	@Id
	private String pid;
	
	@NonNull
	private Integer prodId;
	@NonNull
	private String prodCode;
	@NonNull
	private Double prodCost;
}
