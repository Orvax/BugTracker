package com.example.buker;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class BukerApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Bug Tracker Application");
		Label label = new Label("Hello user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
