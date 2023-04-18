# AED_20230404_4
  Considerando a biblioteca FilaObject (https://github.com/algorithmadrock/AED_20230404_2), já criada, faça:
      Criar um projeto Java (ChamadoSim) e importe a biblioteca. Esse novo projeto simulará uma necessidade de muitas empresas e instituições que atendem clientes, que é criar um canal de geração de senhas para pessoas com alguma prioridade e pessoas que não tem nenhuma prioridade.
      A classe Principal, no package view, deve ter na Main, a criação de 2 filas, a fila e a filaPrioritarios, a inicialização das senhas dos prioritários e dos não prioritários e, por fim, deve dar ao usuário a possibilidade de inserir uma nova senha na fila, uma nova senha na fila de prioritários ou chamar uma pessoa para o atendimento. Um menu deve ser criado.
      A classe FilaController deve ter os métodos de validação das operações oferecidas na Main da Classe Principal.Todos os métodos devem receber a fila criada no método Main como parâmetro.
     1) O método de inserir um novo elemento na fila;
     2) O método de remover o primeiro elemento da fila, que será atendido. A fila não pode estar vazia;
     3) O método de chamado que deve seguir a seguinte regra:
        Fazer 3 chamadas prioritárias para 1 da fila não prioritária
        Se não houver prioritários, já se deve chamar dos não prioritários
        Se não houver ninguém nas 2 filas, deve-se gerar um avis
