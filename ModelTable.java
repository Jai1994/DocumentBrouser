package com.adil.ModelTable;

import com.jfoenix.controls.JFXButton;

import javafx.scene.control.Hyperlink;

public class ModelTable {

	String FileName, FileSize, FileRating, FileDownlaoded;
	JFXButton FileDownlaod;
	String FileURL;

	public ModelTable(String FileName, String FileSize, String FileRating, String FileDownloaded, String FileURL,
			JFXButton FileDownlaod) {
		this.FileName = FileName;
		this.FileSize = FileSize;
		this.FileRating = FileRating;
		this.FileDownlaoded = FileDownloaded;
		this.FileURL = FileURL;
		this.FileDownlaod = FileDownlaod;

	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public String getFileSize() {
		return FileSize;
	}

	public void setFileSize(String fileSize) {
		FileSize = fileSize;
	}

	public String getFileURL() {
		return FileURL;
	}

	public void setFileURL(String fileURL) {
		FileURL = fileURL;
	}

	public String getFileRating() {
		return FileRating;
	}

	public void setFileRating(String fileRating) {
		FileRating = fileRating;
	}

	public String getFileDownlaoded() {
		return FileDownlaoded;
	}

	public void setFileDownlaoded(String fileDownlaoded) {
		FileDownlaoded = fileDownlaoded;
	}

	public JFXButton getFileDownlaod() {
		return FileDownlaod;
	}

	public void setFileDownlaod(JFXButton fileDownlaod) {
		FileDownlaod = fileDownlaod;
	}
}
