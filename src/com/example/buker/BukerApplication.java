package com.example.buker;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class BukerApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Buker Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
