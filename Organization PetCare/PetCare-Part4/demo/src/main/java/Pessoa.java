// Faça o mesmo para todos os objetos cachorros e verifique:
// a. Quantos cachorros estão desnutridos;
// b. Quantos cachorros são vira latas;
// c. Quantos cachorros são da cor Amarela.

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Sexo sexo;
    
    
    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, String email, Sexo sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    
}
