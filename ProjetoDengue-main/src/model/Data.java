package model;

public class Data {

    private String municipio;
    private int cod;
    private int crs;
    private String numeracao;
    private int qtdNumeracao;
    private String email;
    private String codConsulta;

    public Data(String municipio, int cod, int crs, String numeracao, int qtdNumeracao, String email, String codConsulta){
        this.municipio = municipio;
        this.cod = cod;
        this.crs = crs;
        this.numeracao = numeracao;
        this.qtdNumeracao = qtdNumeracao;
        this.email = email;
        this.codConsulta = codConsulta;
    }

    public Data(){

    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCrs() {
        return crs;
    }

    public void setCrs(int crs) {
        this.crs = crs;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public int getQtdNumeracao() {
        return qtdNumeracao;
    }

    public void setQtdNumeracao(int qtdNumeracao) {
        this.qtdNumeracao = qtdNumeracao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(String codConsulta) {
        this.codConsulta = codConsulta;
    }

    public String toString(){
        return municipio+";"+cod+";"+crs+";"+qtdNumeracao+";"+numeracao+";"+email+"\r\n";
    }

    public String imprimeConsulta(String[] corta){
        return "Município: "+corta[0]+"\n"+"Código IBGE: "+corta[1]+"\n"+
                "CRS: "+corta[2]+"\n"+"Qtd Numeração: "+corta[3]+"\n"+
                "Numeração: "+corta[4]+"\n"+"E-mail: "+corta[5]+"\n"+
                "-----------------------------"+"\n";
    }
}
