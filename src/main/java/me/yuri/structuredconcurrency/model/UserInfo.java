package me.yuri.structuredconcurrency.model;

import java.time.LocalDate;

public record UserInfo(String userId, String username, LocalDate birthDate) {}
