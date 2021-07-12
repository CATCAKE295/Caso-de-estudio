
package modelo;

import formulario.FrmPrincipal;
import javax.swing.JOptionPane;


public class Usuario 
{
    
    public String[] usuario = new String[1];
    public String[] contraseña = new String[1];

    public Usuario() {
    }

    public String[] getUsuario() {
        return usuario;
    }

    public void setUsuario(String[] usuario) {
        this.usuario = usuario;
    }

    public String[] getContraseña() {
        return contraseña;
    }

    public void setContraseña(String[] contraseña) {
        this.contraseña = contraseña;
    }
       
          public void comparar(String usuario, String contraseña)
    {
        
        String msn = "Bienvenido ";
        String msne =  "Error datos incorrectos, saliendo del sistema";
        
        
        for(int i = 0; i < this.usuario.length; i++)
       {
           for(int j = 0; j < this.contraseña.length; j++)
           {
           
                if ((this.usuario[i].equals(usuario) && (this.contraseña[j].equals(contraseña)))) 
            {
                FrmPrincipal frmp = new FrmPrincipal();
                 
                
                JOptionPane.showMessageDialog(null, msn + usuario);
                frmp.setVisible(true);
                
                
               break;
            }
            else
            {
                
                   
                 JOptionPane.showMessageDialog(null, msne);
                 System.exit(0);
                
            }
    
    
    }
   
    
    
    }

   
    }
          
}

