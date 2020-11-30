package ru.otpbank.cards.claim.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;
import ru.otpbank.cards.claim.model.Claim;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClaimServiceImpl implements ClaimService, JavaDelegate {

    private final RuntimeService runtimeService;

    @Override
    public void create(Claim claim) {
        log.info("Claim was created.");
        runtimeService.startProcessInstanceByKey("my");
    }

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.info("HIIIII");
    }
}
