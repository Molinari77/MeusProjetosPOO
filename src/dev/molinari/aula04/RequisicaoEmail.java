package dev.molinari.aula04;

public interface RequisicaoEmail {

    void sucesso();
    void error(Exception e);
    void loading();
    void complete(boolean isComplete);


}
