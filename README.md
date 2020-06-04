# Desafio-Sicredi-Digital

Projeto criado para processo seletivo projeto Sicredi.

# Descriçao do projeto:

Desenvolver automação de teste para o processo de simulação de investimento. 

```bash
`https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/`
```

# Tecnologias

* Java 8
* Maven
* Rest Assured 4.3.0
* Junit 4.13
* Selenium 3.141.59
* Google Chrome

# Executar testes
```bash
`mvn test`
```
# Origanização do Projeto

1. Criei um pacote para incluir as pageObjects. Foi criado duas pageObjects, uma que representa a tela inicial do site e que contem todos os elementos necessários para ela e outra para representar a segunda tela, que representa a tabela de simulação.
    
2. Criei um pacote para incluir os Steps. Existem duas classes de steps. Uma que representa os steps relacionados a primeira pageObject e outro representando os steps da segunda pageObject.

3. Criei um pacote para incluir o testCase. Existem dois testes case. Um represetando o teste de API e outro para o teste de interface.  
4. Criei um pacote com utils.Nele existem duas classes, uma que gerencia o WaitElement, e outra que representa os dados da simulação.
    
# Cenários de Teste Interface

    Cenário 1: Usuário simula investimento com dados  válidos
    
    Dado que o usuário está no site de simulação de investimento
    E o usuário insere dados  válidos no sistema
    Quando o os dados forem enviados
    Então o usuário acessa o valor do seu investimento
    E acessa a tabela de investimento
    
    Cenário 2: Usuário simula investimento com valores inválidos
    
    Dado que o usuário está no site de simulação de investimento
    E o usuário insere valores inválidos no sistema
    Quando o sistema validar o campo
    Então o sistema mostra uma mensagem informando que o valor está incorreto
    
# Cenário de Teste API

    Cenário: Usuário busca simulação
    Dado que o usuário faça a simulação
    Quando o serviço é consultado
    Então é retornado o Id, valores e meses
    
# Nota

Para executar o teste de serviço, quebrei teste por teste para facilitar a análise do  código. 




