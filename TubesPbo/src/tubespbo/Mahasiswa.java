/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Irlangga
 */
public class Mahasiswa {
    private long Nim;
    private String nama;
	
    public Mahasiswa(String nama,long Nim){
	this.nama = nama;
	this.Nim = Nim;
    }
	
    public void setNim(long Nim){
	this.Nim = Nim;
    }
	
    public long getNim(){
	return Nim;
    }
}
