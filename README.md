# 🌊 LAB05 — Streams

Quinto laboratório da disciplina, com foco em **manipulação de streams** (fluxos de entrada e saída), aplicando conceitos de leitura, escrita e processamento sequencial de dados.

---

## 📌 Sobre o projeto

Este laboratório tem como objetivo explorar o uso de **streams** em linguagem C, abordando:

- Abertura e fechamento de streams (`fopen`, `fclose`)
- Leitura e escrita de dados (`fgetc`, `fputc`, `fgets`, `fputs`, `fread`, `fwrite`)
- Streams padrão (`stdin`, `stdout`, `stderr`)
- Redirecionamento de entrada/saída
- Manipulação de arquivos texto e binários
- Tratamento de erros em operações de E/S

---

## ⚙️ Funcionalidades

- [x] Abrir e ler arquivo de entrada
- [x] Escrever resultados em arquivo de saída
- [x] Processar dados linha a linha via stream
- [x] Tratamento de erros de abertura/leitura
- [x] Uso de streams padrão (`stdin` / `stdout`)
- [x] Fechamento seguro de arquivos

> Ajuste esta lista conforme as funções reais implementadas no laboratório.

---

## 📂 Estrutura do projeto

```bash
LAB05_STREAM/
│
├── src/
│   ├── main.c          # Ponto de entrada do programa
│   ├── stream.c        # Implementação das funções de stream
│   └── stream.h        # Protótipos e definições
│
├── input/
│   └── entrada.txt     # Arquivo de entrada de exemplo
│
├── output/
│   └── saida.txt       # Arquivo gerado pelo programa
│
├── Makefile            # Automação de compilação
└── README.md           # Documentação do projeto
```

> Ajuste esta estrutura conforme os arquivos reais do seu repositório.

---

## 🧠 Conceitos aplicados

```c
FILE *fp = fopen("entrada.txt", "r");
if (fp == NULL) {
    perror("Erro ao abrir arquivo");
    return 1;
}

int c;
while ((c = fgetc(fp)) != EOF) {
    fputc(c, stdout);
}

fclose(fp);
```

---

## 🚀 Como compilar e executar

### Pré-requisitos

- GCC instalado
- Make (opcional)

### Compilação manual

```bash
gcc src/*.c -o lab05
```

### Compilação com Makefile

```bash
make
```

### Executar

```bash
./lab05
```

### Executar com redirecionamento

```bash
./lab05 < input/entrada.txt > output/saida.txt
```

---

## 🖥️ Exemplo de uso

```text
$ ./lab05
Digite o nome do arquivo de entrada: entrada.txt
Lendo stream...
Processando dados...
Resultado salvo em saida.txt
```

---

## 📊 Complexidade

| Operação             | Complexidade |
|----------------------|--------------|
| Leitura sequencial   | O(n)         |
| Escrita sequencial   | O(n)         |
| Busca em stream      | O(n)         |

> Operações em stream são lineares, pois dependem da leitura sequencial dos dados.

---

## 🧪 Testes

Exemplo de arquivo de entrada (`input/entrada.txt`):

```text
linha 1
linha 2
linha 3
```

Saída esperada (`output/saida.txt`):

```text
linha 1
linha 2
linha 3
```

---

## 🤝 Contribuições

Contribuições são bem-vindas!

1. Faça um fork do projeto
2. Crie uma branch: `git checkout -b minha-feature`
3. Commit: `git commit -m "feat: minha nova funcionalidade"`
4. Push: `git push origin minha-feature`
5. Abra um Pull Request

---

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

---

## 👨‍💻 Autor

**Victor Hugo**

- GitHub: [@victorhugoEngineer](https://github.com/victorhugoEngineer)
