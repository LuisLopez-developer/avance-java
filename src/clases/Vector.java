package clases;
public class Vector {
    private float valorX;
    private float valorY;

    public Vector() {
    }

    public Vector(float valorX, float valorY) {
        this.valorX = valorX;
        this.valorY = valorY;
    }

    public float getValorX() {
        return this.valorX;
    }

    public void setValorX(float valorX) {
        this.valorX = valorX;
    }

    public float getValorY() {
        return this.valorY;
    }

    public void setValorY(float valorY) {
        this.valorY = valorY;
    }
    
    public String MostrarVector(){
        return this.valorX + "i + " + this.valorY + "j";
    }
    
    public float CalcularModulo(){
        float suma = (float) (Math.pow(this.valorX, 2) + Math.pow(this.valorY, 2));
        float raiz = (float) Math.sqrt(suma);
        
        return raiz;
    }
    
    public float CalcularAngulo(){
    float cociente = this.valorY / this.valorX;
    
    float angulo_rad = (float) Math.atan(cociente);
    
    float angulo = (float) Math.toDegrees(angulo_rad);
    
    if (angulo < 0)
        angulo = 180 - Math.abs(angulo);
    
    return angulo;
}

    @Override
    public String toString() {
        return "Vector{" + "valorX=" + this.valorX + ", valorY=" + this.valorY + '}';
    }
    
}
