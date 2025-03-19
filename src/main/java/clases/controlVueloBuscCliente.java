/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class controlVueloBuscCliente implements Serializable {
    private int _posicionVuelo;
    private int _posicionOrigen;
    private int _posicionDestino;
    private String _codigoVuelo;
    private int _escalas;
    public controlVueloBuscCliente(int _posicionVuelo, int _posicionOrigen, int _posicionDestino, String _codigoVuelo,int _escalas) {
        this._posicionVuelo = _posicionVuelo;
        this._posicionOrigen = _posicionOrigen;
        this._posicionDestino = _posicionDestino;
        this._codigoVuelo = _codigoVuelo;
        this._escalas=_escalas;
    }

    public int getEscalas() {
        return _escalas;
    }

    public void setEscalas(int _escalas) {
        this._escalas = _escalas;
    }
    
    public int getPosicionVuelo() {
        return _posicionVuelo;
    }

    public void setPosicionVuelo(int _posicionVuelo) {
        this._posicionVuelo = _posicionVuelo;
    }

    

    public int getPosicionOrigen() {
        return _posicionOrigen;
    }

    public void setPosicionOrigen(int _posicionOrigen) {
        this._posicionOrigen = _posicionOrigen;
    }

    public int getPosicionDestino() {
        return _posicionDestino;
    }

    public void setPosicionDestino(int _posicionDestino) {
        this._posicionDestino = _posicionDestino;
    }

    public String getCodigoVuelo() {
        return _codigoVuelo;
    }

    public void setCodigoVuelo(String _codigoVuelo) {
        this._codigoVuelo = _codigoVuelo;
    }

    public controlVueloBuscCliente() {
        super();
    }

    @Override
    public String toString() {
        return "controlVueloBuscCliente{" + "_posicionVuelo=" + _posicionVuelo + ", _posicionOrigen=" + _posicionOrigen + ", _posicionDestino=" + _posicionDestino + ", _codigoVuelo=" + _codigoVuelo + ", _escalas=" + _escalas + '}';
    }
     

    
}
