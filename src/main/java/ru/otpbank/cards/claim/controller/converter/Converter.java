package ru.otpbank.cards.claim.controller.converter;

import org.mapstruct.Mapper;
import ru.otpbank.cards.claim.controller.dto.ClaimCreationRequest;
import ru.otpbank.cards.claim.model.Claim;

@Mapper(componentModel = "spring")
public interface Converter {

    Claim toClaim(ClaimCreationRequest claimCreationRequest);
}
