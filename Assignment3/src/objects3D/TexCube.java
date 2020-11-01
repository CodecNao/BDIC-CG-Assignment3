package objects3D;

import java.io.IOException;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import GraphicsObjects.Point4f;
import GraphicsObjects.Vector4f;

public class TexCube {

	Texture texture;
	 
	/*
	 * Any additional textures for your assignment should be written in here. 
	 * Make a new texture variable for each one so they can be loaded in at the beginning 
	 */
	public void init() throws IOException {
	         
	  texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/earthspace.png"));
	  //System.out.println("Texture loaded okay ");
	}
	public TexCube() {

	}
	
	// Implement using notes  and looking at TexSphere
	public void DrawTexCube() 
 {
		
		
		 try {
				init();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //load in texture
		 //bottom face
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(0,0); 
		GL11.glVertex3f(1,1,0);
		GL11.glTexCoord2f(1,0);
		GL11.glVertex3f(2,1,0);
		GL11.glTexCoord2f(1,1);
		GL11.glVertex3f(2,2,0);
		GL11.glTexCoord2f(0,1);
		GL11.glVertex3f(1,2,0);
		GL11.glEnd();
		//right face
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(0,0); 
		GL11.glVertex3f(2,1,0);
		GL11.glTexCoord2f(1,0);
		GL11.glVertex3f(2,2,0);
		GL11.glTexCoord2f(1,1);
		GL11.glVertex3f(2,2,1);
		GL11.glTexCoord2f(0,1);
		GL11.glVertex3f(2,1,1);
		GL11.glEnd();
		//left face
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(0,0); 
		GL11.glVertex3f(1,1,0);
		GL11.glTexCoord2f(1,0);
		GL11.glVertex3f(1,2,0);
		GL11.glTexCoord2f(1,1);
		GL11.glVertex3f(1,2,1);
		GL11.glTexCoord2f(0,1);
		GL11.glVertex3f(1,1,1);
		GL11.glEnd();
		//up face
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(0,0);
		GL11.glVertex3f(1,1,1);
		GL11.glTexCoord2f(1,0);
		GL11.glVertex3f(2,1,1);
		GL11.glTexCoord2f(1,1);
		GL11.glVertex3f(2,2,1);
		GL11.glTexCoord2f(0,1);
		GL11.glVertex3f(1,2,1);
		GL11.glEnd();
		//front face
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(0,0); 
		GL11.glVertex3f(1,1,0);
		GL11.glTexCoord2f(1,0);
		GL11.glVertex3f(2,1,0);
		GL11.glTexCoord2f(1,1);
		GL11.glVertex3f(2,1,1);
		GL11.glTexCoord2f(0,1);
		GL11.glVertex3f(1,1,1);
		GL11.glEnd();
		//back face
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(0,0); 
		GL11.glVertex3f(1,2,0);
		GL11.glTexCoord2f(1,0);
		GL11.glVertex3f(2,2,0);
		GL11.glTexCoord2f(1,1);
		GL11.glVertex3f(2,2,1);
		GL11.glTexCoord2f(0,1);
		GL11.glVertex3f(1,2,1);
		GL11.glEnd();
		

	}
	
	
	
}
 
	/*
	 
	 
}

	*/
	 