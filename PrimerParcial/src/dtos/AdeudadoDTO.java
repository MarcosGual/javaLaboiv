/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dtos;

public class AdeudadoDTO {
    int idCurso;
    float totalAdeudado;

    public AdeudadoDTO(int idCurso, float totalAdeudado) {
        this.idCurso = idCurso;
        this.totalAdeudado = totalAdeudado;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public float getTotalAdeudado() {
        return totalAdeudado;
    }

    public void setTotalAdeudado(float totalAdeudado) {
        this.totalAdeudado = totalAdeudado;
    }
    
    
}
