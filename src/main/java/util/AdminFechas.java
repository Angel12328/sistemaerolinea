package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdminFechas {

	 /**
     * Obtiene fecha actual
     * @return 
     */
    public static String getFechaActualString() {
        Date fechaActual = new Date();
        SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");
        return format2.format(fechaActual);
    }
    //"dd-MM-yyyy hh_mm_ss"
     /**
     * Obtiene fecha actual
     * @return 
     */
    public static Date getFechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }
    /**
     * Obtiene la hora Actual
     * @return 
     */
    public static String getHoraActual() {
        Date fechaActual = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        return format.format(fechaActual);
    }
/**
 * Agrega cantidad de d�as a una fecha determinada
 * Si cantidadDias es negativo realizar� una resta
 * @param fecha
 * @param cantidadDias
 * @return 
 */
   
    /*public static java.sql.Date agregarDias(java.sql.Date fecha, int cantidadDias) {
        Calendar calendario = new GregorianCalendar();
        calendario.setTimeInMillis(fecha.getTime());
        calendario.add(Calendar.DATE, cantidadDias);
        return new java.sql.Date(calendario.getTimeInMillis()); 
    } */
    
    /**
     * Realiza la resta entre dos fechas
     * @param fechaInicial
     * @param fechaFinal
     * @return Cantidad de dias
     */
    public static  int restarFechasDias(Date fechaInicial, Date fechaFinal) {
        long diferencia_ms=fechaFinal.getTime()-fechaInicial.getTime();
        double dias = Math.floor(diferencia_ms / (1000 * 60 * 60 * 24));
        return ((int) dias);
    }
 public static  int restarFechasHoras(Date fechaInicial, Date fechaFinal) {
        long diferencia_ms=fechaFinal.getTime()-fechaInicial.getTime();
        double horas = Math.floor(diferencia_ms / (1000 * 60 * 60));
        return ((int) horas);
    }
    /**
     * Realiza la resta entre dos fechas
     * @param fechaInicial
     * @param fechaFinal
     * @return Cantidad de a�os
     */
    public static  int restarFechasAnios(Date fechaInicial, Date fechaFinal) {
        int anios =restarFechasDias(fechaInicial,fechaFinal)/365;
        return ((int) anios);
    }
    /**
     * Convierte de String a fecha
     * @param fechaString
     * @return Date
     */
    public static java.util.Date stringToDate(String fechaString) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Date fechaResult = null;
        try {
            fechaResult = format.parse(fechaString);
            return fechaResult;
        } catch (ParseException ex) {
            System.out.println("Error "+ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }
    
    //Obtiene el anio actual
    public static int getAnioActual() {
        Date fechaActual = new Date();
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy");
        return Integer.parseInt(format2.format(fechaActual));
    }
}
