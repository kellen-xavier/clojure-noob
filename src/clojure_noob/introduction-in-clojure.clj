(ns clojure-noob.core
  (:gen-class))

;;essas foram algumas aulas de clojure que não contemplam no livro

;;printa nome
((fn [nome] (str "Olá, " nome)) "Kellen Xavier")

;;Somar 1 a 10
(+ 1 2 3 4 5 6 7 8 9 10)

;;Crie uma função que recebe dois valores e retorna um vetor com eles na ordem inversa que eles foram recebidos
(defn ex [val1 val2] [val2 val1])
(ex 4 2)

;; Declaração de mapas - map - sempre dentro de chaves
(def meu-mapa
  {:fruta "banana"
   "animal" "Veio"})

(:fruta meu-mapa)
;;abaixo uma string também pode ser um map, porém precisa da função get para referenciar
(get meu-mapa "animal")

;;declarando listas com map
(defn shape-area [shape height width]
  ((shape {:rectangle (fn [h w] (* h w)) 
           :triangle (fn [h b] (/ (* b h) 2))
              }) height width))

;;chama (shape-area :rectangle 10 10)
;;chama (shape-area :triangle 10 10)