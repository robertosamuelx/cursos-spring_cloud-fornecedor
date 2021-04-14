package br.com.alura.microservice.fornecedor.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private Integer tempoDePreparo;

        @Enumerated(EnumType.STRING)
        private PedidoStatus status;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "pedidoId")
        private List<PedidoItem> itens;

        public Pedido(List<PedidoItem> itens) {
                this.itens = itens;
                this.status = PedidoStatus.RECEBIDO;
        }

        public Pedido() {
        }

        public List<PedidoItem> getItens() {
                return itens;
        }

        public void setItens(List<PedidoItem> itens) {
                this.itens = itens;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public PedidoStatus getStatus() {
                return status;
        }

        public void setStatus(PedidoStatus status) {
                this.status = status;
        }

        public Integer getTempoDePreparo() {
                return tempoDePreparo;
        }

        public void setTempoDePreparo(Integer tempoDePreparo) {
                this.tempoDePreparo = tempoDePreparo;
        }
}
