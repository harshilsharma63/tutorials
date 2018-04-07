package com.baeldung.performancetesting.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Nonnull;

@Data
@AllArgsConstructor
public class ResidentialDetail extends AddressDetail {
    @Nonnull
    private final String contact;
}
