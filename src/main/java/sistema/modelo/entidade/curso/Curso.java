package sistema.modelo.entidade.curso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sistema.modelo.entidade.aluno.Aluno;
import sistema.modelo.entidade.area.Area;
import sistema.modelo.entidade.instituicao.Instituicao;
import sistema.modelo.enumeracao.Turno;
import sistema.modelo.enumeracao.metodoentrada.MetodoEntrada;
import sistema.modelo.enumeracao.modalidade.Modalidade;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso")
	private Long idCurso;

	@Column(name = "nome_curso", length = 45, nullable = false)
	private String nomeCurso;

	@Column(name = "descricao_curso", length = 45, nullable = false)
	private String descricaoCurso;

	@Column(name = "duracao_curso", nullable = false)
	private int duracaoCurso;
	
	@Column(name = "tipo_metodo_entrada_curso", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private MetodoEntrada metodoEntrada;
	
	@Column(name = "nota_corte_curso", scale = 5, precision = 2,nullable = false)
	private double notaCorte;

	@Column(name = "preco_curso", scale = 6, precision = 2, nullable = false)
	private double preco;

	@Column(name = "link_curso", length = 45, nullable = false)
	private String link;

	@Column(name = "tipo_modalidade_curso", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private Modalidade tipoModalidade;
	
	@Column(name = "tipo_turno_curso", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private Turno tipoTurno;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "area_curso", nullable = false)
	private Area area;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Instituicao instituicao;
	
	@ManyToMany(mappedBy = "cursosFavorito")
	private List<Aluno> alunos = new ArrayList<Aluno>();

	public Curso() {

	}
	
	public Curso(String nomeCurso, Area area, String descricaoCurso, int duracaoCurso,
			MetodoEntrada metodoEntrada, double preco, double notaCorte,String link, Modalidade tipoModalidade, Turno tipoTurno,
			Instituicao instituicao) {

		setNomeCurso(nomeCurso);
		setArea(area);
		setDescricaoCurso(descricaoCurso);
		setDuracaoCurso(duracaoCurso);
		setMetodoEntrada(metodoEntrada);
		setPreco(preco);
		setNotaCorte(notaCorte);
		setLink(link);
		setTipoModalidade(tipoModalidade);
		setTipoTurno(tipoTurno);
		setInstituicao(instituicao);

	}

	public Curso(Long idCurso, String nomeCurso, Area area, String descricaoCurso, int duracaoCurso,
			MetodoEntrada metodoEntrada, double preco, double notaCorte,String link, Modalidade tipoModalidade, Turno tipoTurno,
			Instituicao instituicao) {

		setIdCurso(idCurso);
		setNomeCurso(nomeCurso);
		setArea(area);
		setDescricaoCurso(descricaoCurso);
		setDuracaoCurso(duracaoCurso);
		setMetodoEntrada(metodoEntrada);
		setPreco(preco);
		setLink(link);
		setTipoModalidade(tipoModalidade);
		setTipoTurno(tipoTurno);
		setInstituicao(instituicao);

	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getDescricaoCurso() {
		return descricaoCurso;
	}

	public void setDescricaoCurso(String descricaoCurso) {
		this.descricaoCurso = descricaoCurso;
	}

	public int getDuracaoCurso() {
		return duracaoCurso;
	}

	public void setDuracaoCurso(int duracaoCurso) {
		this.duracaoCurso = duracaoCurso;
	}

	public MetodoEntrada getMetodoEntrada() {
		return metodoEntrada;
	}

	public void setMetodoEntrada(MetodoEntrada metodoEntrada) {
		this.metodoEntrada = metodoEntrada;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double setNotaCorte() {
		return notaCorte;
	}
	
	public void setNotaCorte(double notaCorte) {
		this.notaCorte = notaCorte;
	}

	public String link() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Modalidade getTipoModalidade() {
		return tipoModalidade;
	}

	public void setTipoModalidade(Modalidade tipoModalidade) {
		this.tipoModalidade = tipoModalidade;
	}

	public Turno getTipoTurno() {
		return tipoTurno;
	}

	public void setTipoTurno(Turno tipoTurno) {
		this.tipoTurno = tipoTurno;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void adicionarAlunos(Aluno alunos) {
		this.alunos.add(alunos);
	}
}