//1Cálculo do IMC (Índice de Massa Corporal)*
//O que faz esse programa:

 //Pede para o usuário digitar o peso (em quilos) e a altura (em metros).
 //Calcula o IMC usando a fórmula:
  //IMC = peso / (altura * altura)
//Mostra o resultado do IMC e diz em qual categoria ele está (magreza, normal, sobrepeso ou obesidade).

//java
//Scanner input = new Scanner(System.in);

//Essa linha serve para criar um jeito de ler o que o usuário digita.

//java
//double peso = input.nextDouble();

//Aqui, o programa está esperando o usuário digitar um número com vírgula (por exemplo, 70.5 kg). Esse número vai ser guardado na variável peso.

//java
//double imc = peso / (altura * altura);

//Essa é a fórmula do IMC. Multiplica a altura por ela mesma, depois divide o peso por esse resultado.

//java
//if (imc < 18.5) {
//System.out.println("Classificação: Magreza");}

//Essas partes com if (se) servem para saber em qual faixa o IMC do usuário se encaixa.)









//2Comparar o preço do Etanol com o da Gasolina*
//O que esse programa faz:

// Pergunta ao usuário o preço do Etanol e da Gasolina.
// Verifica se o Etanol vale a pena. A regra é:

// O Etanol só vale a pena *se estiver custando menos que 70% do valor da gasolina.
// Mostra qual combustível é mais vantajoso.

//java
//double limite = gasolina * 0.7;

//Aqui ele calcula qual seria o valor máximo que o etanol pode custar para valer a pena.

//java
//f (etanol < limite) {
//  System.out.println("É mais vantajoso abastecer com Etanol.");}

//Esse if compara o preço real do etanol com esse limite calculado










//Verificar se 3 lados formam um triângulo e qual o tipo*
//O que esse programa faz:*

// Lê três números inteiros (os lados do triângulo).
// Verifica se eles formam um triângulo válido.

// Regra: a soma de dois lados tem que ser *maior* que o terceiro.
//Se formar, ele mostra se o triângulo é:

  // *Equilátero* (3 lados iguais)
  //*Isósceles* (2 lados iguais)
  // *Escaleno* (todos diferentes)

//java
//if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)

//Aqui ele testa a regra principal de existência do triângulo.

//java
//if (lado1 == lado2 && lado2 == lado3)

//Essa linha checa se todos os lados são iguais → equilátero.

//java
//else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)

//Aqui ele vê se *pelo menos dois lados são iguais* → isósceles.

//java
//else {
//System.out.println("Tipo: Escaleno");}

//Se nenhum dos lados for igual → escaleno.