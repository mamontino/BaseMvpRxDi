package com.medhelp.mamontino.baseprojectrxdagger.data.network;


interface ApiEndPoint
{
    String BASE_URL = "http://192.168.0.110/api/v1/";

    //    POST AUTH

    String LOGIN = BASE_URL + "login";

    String SEND_TOKEN = BASE_URL + "send/token";
}
