# WeatherWise - Serviço de Meteorologia

## Autor
**Jorge Luiz Madeira Pires**

## Descrição
O WeatherWise é um serviço de meteorologia desenvolvido em Java utilizando o framework Spring. O projeto fornece rotas para consultas sobre o clima em diferentes cidades e inclui um endpoint específico que fornece informações sobre o autor do projeto.

## Funcionalidades
- **GET /weather/{city}**: Retorna informações sobre o clima da cidade especificada.
- **POST /weather**: Envia o nome de uma cidade para processamento e retorna uma mensagem de confirmação.
- **GET /weather/ajuda**: Retorna informações sobre o autor e o nome do projeto.

## Estrutura do Projeto
- **package config**: Contém a classe `AppConfig` que configura o `RestTemplate` utilizado para chamadas à API de clima.
- **package controller**: Contém a classe `WeatherController`, que define as rotas do serviço.
- **package model**: Contém a classe `WeatherRequest`, que representa a estrutura dos dados recebidos.
- **package service**: Contém a classe `WeatherService`, que implementa a lógica de obtenção de dados de clima e tratamento de erros.

## Como Executar o Projeto
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/JorgePires279/back-end-2024-2-AV2.git
   cd weatherwise
