package com.ovchikov.mememanager.server.security;

public class JwtProperties {
    public static final String SECRET = "MyMemeManagerSecret";
    public static final int EXPIRATION_TIME = 864_000_000; // 10 дней
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String REFRESH_TOKEN_HEADER_STRING = "Refresh Token";
}
