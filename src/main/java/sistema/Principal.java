package sistema;
import java.time.LocalDate;
import java.util.Scanner;

import sistema.modelo.dao.aluno.AlunoDAO;
import sistema.modelo.dao.aluno.AlunoDAOImpl;
import sistema.modelo.dao.area.AreaDAO;
import sistema.modelo.dao.area.AreaDAOImpl;
import sistema.modelo.dao.contato.ContatoDAO;
import sistema.modelo.dao.contato.ContatoDAOImpl;
import sistema.modelo.dao.curso.CursoDAO;
import sistema.modelo.dao.curso.CursoDAOlmpl;
import sistema.modelo.dao.endereco.EnderecoDAO;
import sistema.modelo.dao.endereco.EnderecoDAOImpl;
import sistema.modelo.dao.instituicao.InstituicaoDAO;
import sistema.modelo.dao.instituicao.InstituicaoDAOImpl;
import sistema.modelo.entidade.aluno.Aluno;
import sistema.modelo.entidade.area.Area;
import sistema.modelo.entidade.contato.Contato;
import sistema.modelo.entidade.curso.Curso;
import sistema.modelo.entidade.endereco.Endereco;
import sistema.modelo.entidade.instituicao.Instituicao;
import sistema.modelo.enumeracao.Turno;
import sistema.modelo.enumeracao.genero.Genero;
import sistema.modelo.enumeracao.metodoentrada.MetodoEntrada;
import sistema.modelo.enumeracao.modalidade.Modalidade;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		InstituicaoDAO instituicaoDAO = new InstituicaoDAOImpl();
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		ContatoDAO contatoDAO = new ContatoDAOImpl();
		AreaDAO areaDAO = new AreaDAOImpl();
		CursoDAO cursoDAO = new CursoDAOlmpl();
		AlunoDAO alunoDAO = new AlunoDAOImpl();
		
		String nomeArea = "teste";
		
		Area area = new Area();
		
		area.setNomeArea(nomeArea);
		areaDAO.inserirArea(area);
		
		String nome = "Teste instituicao";
		String senha = "13ee3";
		
		
		String logeradouro = "teste";
		int numero = 43;
		String cep = "1234";
		String bairro = "bairro teste";
		String cidade = "blumenau";
		String estado = "Santa Catarina";
		String referencia = "referencia teste";
		
		Endereco endereco = new Endereco();
		
		
		String cnpj = "1223";
		String desc = "Somo uma instituicao de teste";
		
		Instituicao instituicao = new Instituicao();
		
		    instituicao.setNome(nome);
		    instituicao.setSenha(senha);
			instituicao.setCnpj(cnpj);
			instituicao.setDescricao(desc);
			
		instituicaoDAO.inserirInstituicao(instituicao);
		
		endereco.setLogradouro(logeradouro);
		endereco.setNumero(numero);
		endereco.setCep(cep);
		endereco.setBairro(bairro);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		endereco.setReferencia(referencia);
		endereco.setInstituicao(instituicao);
		
		enderecoDAO.inserirEndereco(endereco);
		
		String telefone = "3332-3232";
		String celular = "5432-3232";
		String email = "teste@email.com.br";
		
		Contato contato = new Contato();
		
		contato.setTelefone(telefone);
		contato.setCelular(celular);
		contato.setEmail(email);
		contato.setUsuario(instituicao);
		
		contatoDAO.inserirContato(contato);
		
		String nomeCurso = "nome curso";
		String descurso = "descri curso";
		int duracao = 23;
		MetodoEntrada enem = MetodoEntrada.ENEM;
		double preco = 12.3;
		String link = "zelda";
		Modalidade modal = Modalidade.AOVIVO;
		Turno turno = Turno.MATUTINO;
		
		Curso curso = new Curso();
		
		
		curso.setNomeCurso(nomeCurso);
		curso.setDescricaoCurso(descurso);
		curso.setDuracaoCurso(duracao);
		curso.setMetodoEntrada(enem);
		curso.setPreco(preco);
		curso.setLink(link);
		curso.setTipoModalidade(modal);
		curso.setTipoTurno(turno);
		curso.setArea(area);
		curso.setInstituicao(instituicao);
		
		cursoDAO.inserirCurso(curso);
		
		String alunoNome = "Aluno";
		String alunoSenha = "12345";
		String cpf = "342";
		String sobrenome = "sobrenome";
		LocalDate dataNasc = LocalDate.parse("2022-05-25");
		double notaCorte = 234.5;
		Genero genero = Genero.MASCULINO;

		Aluno aluno = new Aluno();

		aluno.setNome(alunoNome);
		aluno.setSenha(alunoSenha);
		aluno.setCpf(cpf);
		aluno.setSobrenome(sobrenome);
		aluno.setDataNascimento(dataNasc);
		aluno.setNotaCorte(notaCorte);
		aluno.setGenero(genero);
		
		alunoDAO.inserirAluno(aluno);
		
		int resposta;
		
		int sair = 0;
		
		while(sair != 1) {
			

			resposta = 0;
			
			System.out.println("atualizar area");
			resposta = leitor.nextInt();
			
			
				if(resposta != 0) {
					
					String areaNome = "testenome";
					
					area.setNomeArea(areaNome);
					
					areaDAO.atualizarArea(area);
				}
				
				resposta = 0;
				
				System.out.println("atualizar endere�o");
				resposta = leitor.nextInt();
				
				
				if(resposta != 0) {
						
					String logeradourotu = "teste tu";
					int numerotu = 3;
					String ceptu = "1234567";
					String bairrotu = "bairro teste tu";
					String cidadetu = "blumenau tu";
					String estadotu = "Santa Catarina tu";
					String referenciatu = "referencia teste tu";
					
					endereco.setLogradouro(logeradourotu);
					endereco.setNumero(numerotu);
					endereco.setCep(ceptu);
					endereco.setBairro(bairrotu);
					endereco.setCidade(cidadetu);
					endereco.setEstado(estadotu);
					endereco.setReferencia(referenciatu);
					
					enderecoDAO.atualizarEndereco(endereco);
			}
				
				resposta = 0;
				
				System.out.println("atualizar instituicao");
				resposta = leitor.nextInt();
				
					if(resposta != 0) {
					
						String nometu = "Teste instituicao tu";
						String senhatu = "13ee3 tu";
						String cnpjtu = "1223 tu";
						String desctu = "Somo uma instituicao tu";
					
					instituicao.setNome(nometu);
				    instituicao.setSenha(senhatu);
					instituicao.setCnpj(cnpjtu);
					instituicao.setDescricao(desctu);
					
					instituicaoDAO.atualizarInstituicao(instituicao);
					System.out.println("nome da instituicao" + instituicao.getNome());
				}
					resposta = 0;
					
					System.out.println("atualizar curso");
					resposta = leitor.nextInt();
					
					if(resposta != 0) {
						
						String nomeCursot = "nomet cursot";
						String descursot = "descrit cursot";
						int duracaot = 27;
						MetodoEntrada enemt = MetodoEntrada.FINACIAMENTO;
						double precot = 11.3;
						String linkt = "linkt";
						Modalidade modalt = Modalidade.SEMIPRESENCIAL;
						Turno turnot = Turno.INTEGRAL;
						
						curso.setNomeCurso(nomeCursot);
						curso.setDescricaoCurso(descursot);
						curso.setDuracaoCurso(duracaot);
						curso.setMetodoEntrada(enemt);
						curso.setPreco(precot);
						curso.setLink(linkt);
						curso.setTipoModalidade(modalt);
						curso.setTipoTurno(turnot);
						curso.setArea(area);
						curso.setInstituicao(instituicao);
						
						cursoDAO.atualizarCurso(curso);
				
				}
					resposta = 0;
					
					System.out.println("deletar area");
					resposta = leitor.nextInt();
		
					if(resposta != 0) {
						areaDAO.deletarArea(area);
					}

					resposta = 0;
					
					System.out.println("deletar endereco, instituica e contato");
					resposta = leitor.nextInt();
		
					if(resposta != 0) {
						instituicaoDAO.deletarInstituicao(instituicao);
						enderecoDAO.deletarEndereco(endereco);
						contatoDAO.deletarContato(contato);
					}	
					
					resposta = 0;
					
					System.out.println("deletar tudo");
					resposta = leitor.nextInt();
					
					if(resposta != 0) {
						
						enderecoDAO.deletarEndereco(endereco);
						contatoDAO.deletarContato(contato);
						instituicaoDAO.deletarInstituicao(instituicao);
						alunoDAO.deletarAluno(aluno);
			     		cursoDAO.deletarCurso(curso);
			     		areaDAO.deletarArea(area);
						instituicaoDAO.deletarInstituicao(instituicao);
					}
					
					
					System.out.println(sair);
					sair = leitor.nextInt();
		}
		
		
		
	leitor.close();
	}

}