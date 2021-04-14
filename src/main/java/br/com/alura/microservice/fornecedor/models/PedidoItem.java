package br.com.alura.microservice.fornecedor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PedidoItem {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private Integer quantidade;

        @ManyToOne @JoinColumn(name = "produtoId")
        private Produto produto;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }


        public Integer getQuantidade() {
                return quantidade;
        }

        public void setQuantidade(Integer quantidade) {
                this.quantidade = quantidade;
        }

        public Produto getProduto() {
                return produto;
        }

        public void setProduto(Produto produto) {
                this.produto = produto;
        }

}
