package adapater;

import java.util.Calendar;

public class FaixaEtaria implements ICalculadoraInformacoesIdade {

    Pessoa pessoa;

    public FaixaEtaria(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public Integer calcularIdade() {

        if (this.pessoa.getDataNascimento() == null) {
            return null;
        }

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(this.pessoa.getDataNascimento());
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            idade--;
        } else {
            if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }
        return idade;
    }

    @Override
    public String calcularFaixaEtaria() {
        Integer idade = this.calcularIdade();
        if (idade == null) {
            return "OPS!!! Parece que a data de nascimento desta pessoa"
                    + " não foi informada...  :( ";
        } else if (idade < 20) {
            return "FAIXA ETÁRIA...: JOVEM";
        } else if (idade < 60) {
            return "FAIXA ETÁRIA...: ADULTO(A)";
        } else {
            return "FAIXA ETÁRIA...: IDOSO(A)";
        }
    }
}
