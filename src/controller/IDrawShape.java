package controller;

import controller.commands.CreateShapeCommand;

import java.awt.*;

public interface IDrawShape {

	public void draw(CreateShapeCommand shape, Graphics2D graphics2d);

}
