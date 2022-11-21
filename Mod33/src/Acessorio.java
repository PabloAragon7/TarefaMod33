
public class Acessorio {

package br.com.rpires.domain;

import javax.persistence.*;
import java.util.List;


    @Entity
    @Table(name = "TB_ACESSORIO")
    public class Acessorio {

        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="acessorio_seq")
        @SequenceGenerator(name="acessorio_seq", sequenceName="pd_acessorio", initialValue = 1, allocationSize = 1)
        private Long id;

        @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
        private String codigo;

        @Column(name = "NOME", length = 50, nullable = false)
        private String nome;

        @Column(name = "DESCRICAO", length = 100, nullable = false)
        private String descricao;

    }
