package school.sptech;

public class Time {
    public String nome;
    public Integer vitorias;
    public Integer empates;
    public Integer derrotas;

    public Time(){
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

    public Time(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

    public void registrarVitoria() {
        this.vitorias++;
    }

    public void registrarEmpate() {
        this.empates++;
    }

    public void registrarDerrota() {
        this.derrotas++;
    }

    public Integer getPontos() {
        return (this.vitorias * 3) + this.empates;
    }

    public Integer getTotalPartidas() {
        return this.vitorias + this.empates + this.derrotas;
    }

    public Integer getAproveitamento() {
        Integer totalPartidas = getTotalPartidas();
        return (this.vitorias * 100) / totalPartidas;
    }

    public void compararAproveitamento(Time adversario){
        Integer aproveitamentoTime1 = getAproveitamento();
        Integer aproveitamentoTime2 = adversario.getAproveitamento();

        if(aproveitamentoTime1 > aproveitamentoTime2){
            System.out.printf("O time %s tem um aproveitamento maior que o time %s", nome, adversario.nome);
        } else if(aproveitamentoTime2 > aproveitamentoTime1){
            System.out.printf("O time %s tem um aproveitamento maior que o time %s", adversario.nome, nome);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Time: " + this.nome);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Empates: " + this.empates);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Pontos: " + getPontos());
        System.out.println("Total de Partidas: " + getTotalPartidas());
        System.out.println("Aproveitamento: " + getAproveitamento() + "%");
        System.out.println();
    }
}
