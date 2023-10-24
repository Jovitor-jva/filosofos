##ATIVIDADE JANTAR DOS FILOSOFOS##

Na literatura clássica de sistemas operacionais, existe um outro problema bastante conhecido, capaz de representar bem a concorrência entre processos. Ele é chamado de “jantar dos filósofos”.

Imagine 5 filósofos sentados em uma mesa redonda, conforme a Figura 31. Todos eles têm seu próprio prato de macarrão e/ou estão comendo ou estão pensando. Os filósofos compartilham os garfos que estão um de cada lado de seu prato e só podem comer se conseguirem pegar os dois talheres, à direita e à esquerda. Imagine que o primeiro filósofo consegue pegar dois talheres e, na sequência, no sentido anti-horário, o próximo filósofo já não poderia comer pois estaria sem o talher da esquerda, mas o filósofo seguinte conseguiria pegar seus talheres, mas inviabilizaria os próximos filósofos na sequência, o imediatamente seguinte pois ficaria sem o seu talher da esquerda e o outro que já está sem o seu talher da direita pois o primeiro filósofo já tinha pego. Assim quando esses dois filósofos encerrarem o jantar vão voltar a pensar e permitirão que outros possam comer.

· Eles se revezam neste processo de maneira que ninguém deve comer indefinidamente e deixe os outros morrerem de fome.

· Um problema grave que pode acontecer é o seguinte: se cada filósofo pega o seu talher à direita, por exemplo, o que vai acontecer é que todos vão ficar esperando o talher da esquerda e esse nunca será liberado. Em sistemas operacionais, essa condição é chamada de deadlock.

Existem várias soluções para o problema e Machado e Maia (2007) citam 3 possíveis soluções:

a) permitir que apenas 4 filósofos sentem à mesa simultaneamente.

b) permitir que um filósofo pegue o talher somente se o outro estiver disponível.

c) permitir que um filósofo par pegue o talher da esquerda primeiro e o filósofo ímpar pegue o talher da direita primeiro