# DB_JAVA

## 📚 Sobre o Projeto

DB_JAVA é um projeto em Java para manipulação de banco de dados (CRUD), ideal para praticar conexão, inserção, leitura, atualização e remoção de dados usando JDBC ou outra camada de persistência. Serve como um sistema simples para armazenar dados de usuários (ou qualquer outra entidade) em um banco relacional.

Esse projeto pode ser usado tanto para estudo quanto como base para algo maior. Se você quiser adicionar autenticação, mais entidades ou até migrar para JPA/Hibernate no futuro, fica bem fácil.

---

## 🚀 Funcionalidades

- Conectar a um banco de dados relacional (MySQL, PostgreSQL, etc) via JDBC  
- Criar (INSERT) novos registros  
- Ler (SELECT) dados do banco  
- Atualizar (UPDATE) registros existentes  
- Deletar (DELETE) registros  
- Estrutura modular para adicionar novas entidades facilmente  

---

## 🛠️ Tecnologias

- Java (versão mínima: **Java 8**, mas pode usar versões mais recentes)  
- JDBC para conexão com o banco  
- Dependência para driver do banco (ex: MySQL Connector / PostgreSQL JDBC)  
- (Opcional) Maven ou Gradle para gerenciamento de dependências  

---

## 📋 Pré-requisitos

Antes de rodar o projeto no seu computador, você vai precisar de:

1. JDK instalado (Java 8+ ou a versão que o projeto usa)  
2. Um banco de dados relacional rodando (ex: MySQL, PostgreSQL)  
3. Driver JDBC do banco de dados (como o `.jar` do MySQL Connector)  
4. (Opcional, se estiver usando) Maven ou Gradle instalado  
5. IDE Java (IntelliJ IDEA, Eclipse, VSCode, etc)

---

## 🔧 Como Rodar

Aqui vai um passo a passo básico para botar esse projeto para funcionar:

1. Clone o repositório:  
   ```bash
   git clone https://github.com/LuizaGmz/DB_JAVA.git
