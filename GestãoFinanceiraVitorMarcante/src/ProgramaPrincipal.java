//Vitor Marcante//

import java.util.Scanner;

public class ProgramaPrincipal {
    public ProgramaPrincipal() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Despesas gas = new Despesas();
        Rendas gan = new Rendas();
        DataRenda dataRenda = new DataRenda();
        DataDespesa dataDespesa = new DataDespesa();
        RelatorioDespesas relDespesa = new RelatorioDespesas();
        RelatorioRendas relRenda = new RelatorioRendas();
        Total total = new Total();

        String pagamento = "";

        int count_Despesa = 0;
        int count_renda = 0;

        while(true) {
            System.out.println(" ");
            System.out.println("Gestão Financeira");
            System.out.println("-----------------------");
            System.out.println("1 - Adicionar Despesas");
            System.out.println("2 - Adicionar Rendas");
            System.out.println("3 - Relatório de Despesas");
            System.out.println("4 - Relatório de Rendas");
            System.out.println("5 - Relatório Mensal");
            System.out.println("6 - sair");
            System.out.println(" ");
            System.out.println("Selecione uma opção: ");
            int resposta = scan.nextInt();

            if (resposta == 6) {
                System.out.println("Obrigado por utilizar o programa!");
                return;
            }

            if (resposta == 1) {
                System.out.println("Insira o nome do Despesa:");
                scan.nextLine();
                String nomeDespesa = scan.nextLine();
                gas.setNomeDespesa(nomeDespesa, count_Despesa);


                System.out.println("Insira o tipo do Despesa:");
                String tipoDespesa = scan.nextLine();
                gas.setTipoDespesa(tipoDespesa, count_Despesa);


                System.out.println("Insira o dia: EX - 20");
                int dia = scan.nextInt();
                System.out.println("Insira o mês: EX - 04");
                int mes = scan.nextInt();
                System.out.println("Insira o ano: EX - 2023");
                int ano = scan.nextInt();

                dataDespesa.setDia(dia);
                dataDespesa.setMes(mes);
                dataDespesa.setAno(ano);
                dataDespesa.setFormData(dia,mes,ano, count_Despesa);


                System.out.println("Insira o valor do Despesa:");
                double valorDespesa = scan.nextDouble();
                gas.setValorDespesa(valorDespesa, count_Despesa);


                System.out.println("Insira a forma de pagamento do Despesa: \n1 - PIX\n2 - Boleto \n3 - Credito");
                int pagamentoDespesa = scan.nextInt();
                gas.setPagamentoDespesa(pagamentoDespesa, count_Despesa);


                while (pagamentoDespesa != 1 && pagamentoDespesa != 2 && pagamentoDespesa != 3) {
                    System.out.println("\n\nO valor inserido não é valido!");
                    System.out.println("Insira a forma de pagamento do Despesa: \n1 - PIX\n2 - Boleto \n3 - Credito");
                    pagamentoDespesa = scan.nextInt();
                }

                System.out.printf("\n\n\n\n %30s: %15s","Nome",nomeDespesa);
                System.out.printf("\n %30s: %15s","Tipo",tipoDespesa);
                System.out.printf("\n %30s: %15s","Data",dataDespesa.getFormData(count_Despesa));
                System.out.printf("\n %30s: %15.2f","Valor",valorDespesa);
                System.out.printf("\n %30s: %15s\n\n\n\n","Forma de Pagamento",pagamentoDespesa);

                ++count_Despesa;
            } else if (resposta == 2) {
                System.out.println("Insira o nome da rendas:");
                scan.nextLine();
                String nomeRenda = scan.nextLine();
                gan.setNomeRenda(nomeRenda, count_renda);


                System.out.println("Insira o tipo da renda:");
                String tipoRenda = scan.nextLine();
                gan.setTipoRenda(tipoRenda, count_renda);


                System.out.println("Insira o dia: EX - 20");
                int dia = scan.nextInt();
                System.out.println("Insira o mês: EX - 04");
                int mes = scan.nextInt();
                System.out.println("Insira o ano: EX - 2023");
                int ano = scan.nextInt();

                dataRenda.setDia(dia);
                dataRenda.setMes(mes);
                dataRenda.setAno(ano);
                dataRenda.setFormData(dia,mes,ano, count_renda);



                System.out.println("Insira o valor da renda:");
                double valorRenda = scan.nextDouble();
                gan.setValorRenda(valorRenda, count_renda);



                System.out.printf("\n\n\n\n %30s: %10s","Nome",nomeRenda);
                System.out.printf("\n %30s: %10s","Tipo",tipoRenda);
                System.out.printf("\n %30s: %10s","Data",dataRenda.getFormData(count_renda));
                System.out.printf("\n %30s: %10.2f\n\n\n\n","Valor",valorRenda);

                ++count_renda;
            } else {
                int i;
                if (resposta == 3) {
                    System.out.printf("%30s%15s%15s%15s%25s \n", "Despesas", "Tipo", "Data", "Valor", "Forma de Pagamento");

                    for (i = 0; i < count_Despesa; ++i) {
                        if (gas.getPagamentoDespesa(i) == 1) {
                            pagamento = "Boleto";
                        } else if (gas.getPagamentoDespesa(i) == 2) {
                            pagamento = "PIX";
                        } else if (gas.getPagamentoDespesa(i) == 3) {
                            pagamento = "Crédito";
                        }
                        relDespesa.setRelatorio(gas.getNomeDespesa(i), gas.getTipoDespesa(i), dataDespesa.getFormData(i), gas.getValorDespesa(i), pagamento, i);
                        relDespesa.getRelatorio(i);
                    }
                } else if (resposta == 4) {
                    System.out.printf("%30s%15s%15s%15s \n", "Renda", "Tipo", "Data", "Valor");

                    for (i = 0; i < count_renda; ++i) {
                        relRenda.setRelatorio(gan.getNomeRenda(i), gan.getTipoRenda(i), dataRenda.getFormData(i), gan.getValorRenda(i), i);
                        relRenda.getRelatorio(i);
                    }
                } else if (resposta == 5) {
                    System.out.println("\n\n\n\nEscolha qual o mês referente ao relatório: " +
                            "\n 01-Janeiro" +
                            "\n 02-Fevereiro" +
                            "\n 03-Março" +
                            "\n 04-Abril" +
                            "\n 05-Maio" +
                            "\n 06-Junho" +
                            "\n 07-Julho" +
                            "\n 08-Agosto" +
                            "\n 09-Setembro" +
                            "\n 10-Outubro" +
                            "\n 11-Novembro" +
                            "\n 12-Dezembro");
                    System.out.println("\nResposta: ");
                    scan.nextLine();
                    int mensal = scan.nextInt();

                    System.out.println("Escolha o ano referente ao relatório: EX - 2020");
                    int ano = scan.nextInt();

                    System.out.printf("%30s%15s%15s%15s%25s \n", "Despesas", "Tipo", "Data", "Valor", "Forma de Pagamento");
                    for (i = 0; i < count_Despesa; ++i) {
                        if (dataDespesa.getFormData(i).contains("/" + mensal + "/" + ano)) {
                            if (gas.getPagamentoDespesa(i) == 1) {
                                pagamento = "PIX";
                            } else if (gas.getPagamentoDespesa(i) == 2) {
                                pagamento = "Boleto";
                            } else if (gas.getPagamentoDespesa(i) == 3) {
                                pagamento = "Crédito";
                            }

                            relDespesa.setRelatorio(gas.getNomeDespesa(i), gas.getTipoDespesa(i), dataDespesa.getFormData(i), gas.getValorDespesa(i), pagamento, i);
                            relDespesa.getRelatorio(i);
                            total.setDespesas(gas.getValorDespesa(i));

                        } else {
                            System.out.printf("\n%100s", "Não existe registro de Despesas nesse mês!");
                        }
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.printf("%30s%15s%15s%15s \n", "Rendas", "Tipo", "Data", "Valor");

                    for (i = 0; i < count_renda; ++i) {
                        if (dataRenda.getFormData(i).contains("/" + mensal + "/" + ano)) {
                            relRenda.setRelatorio(gan.getNomeRenda(i), gan.getTipoRenda(i), dataDespesa.getFormData(i), gan.getValorRenda(i), i);
                            relRenda.getRelatorio(i);
                            total.setRendas(gan.getValorRenda(i));

                        } else {
                            System.out.printf("\n%100s", "Não existe registro de Rendas nesse mês!");
                        }
                    }
                    total.setTotalgg();
                    total.getTotalgg();
                }
            }
        }
    }
}
