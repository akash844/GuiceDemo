package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
		bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
	}

}
