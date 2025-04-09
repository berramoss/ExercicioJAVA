public class carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;

    public carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("O carro acelerou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Incremento de velocidade deve ser positivo.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("O carro freou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Decremento de velocidade deve ser positivo.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
