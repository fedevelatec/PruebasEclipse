package com.fedevela.imagenurl;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ImagenUrl extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5071957417776666660L;

	public ImagenUrl() throws IOException {
	       
        super("ImagenUrl"); //establece nombre a JFrame
        URL url = new URL( "http://3.bp.blogspot.com/-meSXQb5yfoI/UBAwBTc_lPI/AAAAAAAAANU/Z2vsRi9fozM/s1600/1.jpg" );
       
        Image image = ImageIO.read(url);
       
        //Creal el JLabel y ingresa la imagen sobre el.
        JLabel label = new JLabel(new ImageIcon(image));
 
        //Establece las barras de desplazamiento de la imagen
        JScrollPane scroll = new JScrollPane(label);
        add(scroll);
    }
	
	public static void main(String[] args) throws IOException {
        ImagenUrl imagen = new ImagenUrl();
        imagen.setSize(400, 400);
        imagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imagen.setVisible(true);
        imagen.setLocationRelativeTo(null);
        System.out.print("HOLA");
    }

}
