package com.thp.spring.simplecontext.dto;

public class ImageDTO {

	private Long imageId;
	private String nomFichier;
	private String path;

	public ImageDTO() {
		super();
	}

	public ImageDTO(Long imageId, String nomFichier, String path) {
		super();
		this.imageId = imageId;
		this.nomFichier = nomFichier;
		this.path = path;

	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getNomFichier() {
		return nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "ImageDTO [imageId=" + imageId + ", nomFichier=" + nomFichier + ", path=" + path + "]";
	}

}
