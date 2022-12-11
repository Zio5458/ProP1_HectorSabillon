/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prop1_hectorsabillon;


public class Cancion {
    

    
    public String cancion;
    public String album;
    public String artista;
    public int lanzamiento;
    public int duracion;
    
    public void leercancion(String input){
        this.cancion = input;
    }
    
    public void leeralbum(String input){
        this.album = input;
    }
    
    public void leerartista(String input){
        this.artista = input;
    }
    
    public void lanzamiento(int input){
        this.lanzamiento = input;
    }
    
    public void duracion(int input){
        this.duracion = input;
    }
    
    public String getName(){
        return cancion;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public String getArtist(){
        return artista;
    }
    
    public int getLaunch(){
        return lanzamiento;
    }
    
    public int getDuration(){
        return duracion;
    }
    
    public void setName(String input){
        this.cancion = input;
    }
    
    public void setAlbum(String input){
        this.album = input;
    }
    
    public void setArtist(String input){
        this.artista = input;
    }
    
    public void setLaunch(int input){
        this.lanzamiento = input;
    }
    
    public void setDuration(int input){
        this.duracion = input;
    }
    
}
