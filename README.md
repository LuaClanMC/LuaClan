<div align="center">
    <img src="lua_clan.jpg" alt="LuaClan Banner">
</div>

# 🌙 LuaClanCore

![Build Status](https://github.com/LuaClanMC/LuaClan/actions/workflows/build.yml/badge.svg)
![Docker Image](https://img.shields.io/badge/Docker-Ready-blue?logo=docker)
![Version](https://img.shields.io/badge/Minecraft-1.21.1-green)
![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)

O **LuaClanCore** é o núcleo tecnológico do servidor LuaClan. Este server foi desenvolvido do zero para garantir alta performance, segurança e funcionalidades exclusivas para a nossa comunidade, utilizando as tecnologias mais modernas de desenvolvimento para Minecraft.

---

## 🚀 Tecnologias e Frameworks

O projeto utiliza o que há de mais estável e potente no mercado:

* **Java 21**: Aproveitando as últimas melhorias de performance da JVM.
* **Paper API (1.21.1)**: Garantindo um servidor leve e sem lag.
* **Gradle**: Gerenciamento de dependências e automação de build.
* **Docker**: Containerização para facilitar o deploy em qualquer hospedagem.
* **GitHub Actions**: Integração contínua (CI) que gera o arquivo `.jar` e a imagem Docker automaticamente.

---

## 🛠️ Como Compilar o Projeto

Se você é um desenvolvedor e deseja testar o código localmente:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/LuaClanMC/LuaClan.git](https://github.com/LuaClanMC/LuaClan.git)
    ```
2.  **Compile via Gradle:**
    No terminal da pasta raiz, execute:
    ```bash
    ./gradlew build
    ```
3.  **Localize o arquivo:**
    O JAR compilado estará em: `build/libs/LuaClanCore.jar`

---

## 🐳 Deploy com Docker

Nossa imagem oficial é publicada automaticamente no **GitHub Container Registry (GHCR)**.

Para baixar a imagem mais recente:
```bash
docker pull ghcr.io/luaclanmc/luaclan/luaclan-core:latest
```

**Feito com ❤️ pela equipe da LuaClan.**
