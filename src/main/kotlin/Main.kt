import models.Data
import models.Rule
import utils.readRules
import utils.readInputs

// https://osprogramadores.com/desafios/d10/

fun main(args: Array<String>) {
    val rules = readRules()
    val inputs = readInputs()

    /*
        current_state & current_symbol: Esta regra só deverá ser executada se current_state casar com o estado corrente da máquina e current_symbol casar com o símbolo lido da fita de dados.
            O valor de current_state pode ser “*” indicando “case qualquer estado”.
            O valor de current_symbol pode ser “*”, indicando “case qualquer valor”.
            O valor de current_symbol pode ser “_” (underscore) para casar o espaço.
            No caso de duas regras com o mesmo current_state casando um símbolo de entrada, a mais específica deverá ser usada. Exemplo típico: duas regras, uma com current_symbol=* e outra com current_symbol=A. No caso, para todos os valores de entrada, exceto “A”, a primeira regra deverá ser usada. Se o valor de entrada for “A”, a segunda deverá ser usada por ser mais específica.
            Caso existam duas regras genéricas (i.e, usando “*” no current_state ou current_symbol válidas, apenas a primeira deverá ser usada.

        new_symbol: Se a regra corrente for executada, substitua o símbolo corrente por este símbolo.

        new_symbol=_ indica “troque por espaço”.

        new_symbol=* indica “não substitua”.

        direction: Pode ser “l” para “left” (esquerda), “r” para “right” (direita), ou “*” para indicar “não mova a posição”. Qualquer outro valor devera resultar em erro.

        new_state: O novo estado da máquina. Pode ser qualquer valor alfanumérico. Qualquer string começando com halt causa a finalização do programa após a execução desta regra.
    */
}