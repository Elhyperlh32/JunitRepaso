package es.iesmz.tests;

import java.util.Objects;

public class Time {
    private int hora;
    private int min;
    private int sec;
    public Time(int hora,int min,int sec) {
        this.hora = hora;
        this.min = min;
        this.sec = sec;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public Time nextSecond(){
        this.sec++;
        if(this.sec == 60){
            setSec(0);
            setMin(this.min + 1);
         if (this.min == 60) {
            setMin(0);
            setHora(this.hora + 1);

        if (this.hora == 24) {
            setHora(0);
        }}}
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hora == time.hora && min == time.min && sec == time.sec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, min, sec);
    }
}
