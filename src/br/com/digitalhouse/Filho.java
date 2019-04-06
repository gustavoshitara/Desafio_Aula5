package br.com.digitalhouse;

public class Filho {
    private String nomeMae;
    private String nomePai;
    private String nome;

    public Filho(String novoNomeMae,String novoNomePai,String nomeFilho){
        nomeMae = novoNomeMae;
        nomePai = novoNomePai;
        nome = nomeFilho;
    }


    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}