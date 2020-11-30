package ru.otpbank.cards.claim.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.otpbank.cards.claim.controller.converter.Converter;
import ru.otpbank.cards.claim.controller.dto.ClaimCreationRequest;
import ru.otpbank.cards.claim.service.ClaimService;

import static ru.otpbank.cards.claim.controller.ClaimController.ROOT_PATH;

@RestController
@RequestMapping(ROOT_PATH)
@RequiredArgsConstructor
public class ClaimController {

    public static final String ROOT_PATH = "/claims";
    public static final String CREATE_PATH = "/create";

    private final ClaimService claimService;
    private final Converter converter;

    @PostMapping(CREATE_PATH)
    public void create(@RequestBody ClaimCreationRequest request) {
        claimService.create(converter.toClaim(request));
    }
}
