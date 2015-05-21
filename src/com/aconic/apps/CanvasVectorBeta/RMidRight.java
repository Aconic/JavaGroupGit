package com.aconic.apps.CanvasVectorBeta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class RMidRight extends JPanel implements MouseMotionListener, MouseListener, SizeMoveListener
{
    int mX;
    PanelFigures panelFigures;

    public RMidRight(PanelFigures panelFigures)
    {
        this.panelFigures = panelFigures;
        setLayout(null);
        setCursor(Cursor.getPredefinedCursor(Cursor.W_RESIZE_CURSOR));
        setBackground(Color.YELLOW);
        setBounds(panelFigures.getWidth()- 8, panelFigures.getHeight()/2 - 4, 8, 8);
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        mX = e.getX();
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        panelFigures.setSize(e.getX()- mX + panelFigures.getWidth(), panelFigures.getHeight());
    }

    @Override
    public void checkMove()
    {
        JPanel parent = (JPanel) getParent();
        this.setLocation(parent.getWidth()-8, parent.getHeight()/2 - 4);
    }


    @Override
    public void mouseClicked(MouseEvent e)    {

    }
    @Override
    public void mouseMoved(MouseEvent e)     {

    }
    @Override
    public void mouseReleased(MouseEvent e)    {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e)    {
    }

}
