# Desafio-Sicredi-Digital

Projeto criado para processo seletivo projeto Sicredi.

# Descriçao do projeto:

Desenvolver automação de teste para o processo de simulação de investimento.  

# Tecnologias

* Java 8
* Maven
* Rest Assured 4.3.0
* Junit 4.13
* Google Chrome

# Executar testes
```bash
`mvn test`
```
# Origanização do Projeto

1. Criei um pacote para incluir as pageObjects. 
    1.1 Foi criado duas pageObjects, uma que representa a tela inicial do site e que contem todos os elementos necessários para ela e outra para representar a segunda tela, que representa a tabela de simulação.
2. Criei um pacote para incluir os Steps. 
    2.1 Existem duas classes de steps. Uma que representa os steps relacionados a primeira pageObject e outro representando os steps da segunda pageObject.
3. Criei um pacote para incluir o testCase.
    3.1 Existem dois testes case. Um represetando o teste de API e outro para o teste de interface.  
4. Criei um pacote com utils.
    4.1 Nele existem duas classes, uma que gerencia o WaitElement, e outra que representa os dados da simulação.

# Nota

Para executar o teste de serviço, quebrei teste por teste para facilitar a análise do  código. 




