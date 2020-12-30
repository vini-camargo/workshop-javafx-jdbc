module workshopJavafxJdbc {
	requires javafx.controls;
	requires javafx.base;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.media;
	requires javafx.swing;
	requires javafx.web;
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens gui to javafx.controls, javafx.base, javafx.fxml, javafx.graphics, javafx.media, javafx.swing, javafx.web;
	
	opens model.entities to javafx.controls, javafx.base, javafx.fxml, javafx.graphics, javafx.media, javafx.swing, javafx.web;
	
	opens model.services to javafx.controls, javafx.base, javafx.fxml, javafx.graphics, javafx.media, javafx.swing, javafx.web;
}
