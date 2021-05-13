package multimedia;

public class Multimedia {

    public enum formatos {
        wav, mp3, midi, avi, mov, mpg, cdAudio, dvd
    };

    protected String titulo;
    protected String autor;
    protected double duracion;
    protected formatos formato;

    public Multimedia(String titulo, String autor, double duracion, String formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        switch (formato) {
            case "wav" ->
                this.formato = formatos.wav;
            case "mp3" ->
                this.formato = formatos.mp3;
            case "midi" ->
                this.formato = formatos.midi;
            case "avi" ->
                this.formato = formatos.avi;
            case "mov" ->
                this.formato = formatos.mov;
            case "mpg" ->
                this.formato = formatos.mpg;
            case "cdAudio" ->
                this.formato = formatos.cdAudio;
            case "dvd" ->
                this.formato = formatos.dvd;
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public formatos getFormato() {
        return this.formato;
    }

    public void setFormato(formatos formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "multimedia{" + "titulo=" + this.titulo + ", autor=" + this.autor + ", duracion=" + this.duracion + ", formato=" + this.formato + '}';
    }

}
