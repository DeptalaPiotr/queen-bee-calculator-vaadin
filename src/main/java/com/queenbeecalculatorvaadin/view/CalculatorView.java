package com.queenbeecalculatorvaadin.view;

import com.queenbeecalculatorvaadin.model.CalculatorModel;
import com.queenbeecalculatorvaadin.service.CalculatorService;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.logging.Logger;

@Route("")
public class CalculatorView extends VerticalLayout {

    private static final Logger LOGGER = Logger.getLogger(CalculatorView.class.getName());

    private CalculatorService calculatorService;

    public CalculatorView(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;

        var header = new H1("Bee Queen Calculator");
        var description = new Paragraph("Select the date and time for transferring the bee larvae");
        var button = new Button("Calculate");
        var pdfButton = new Button("Print");

        add(header);
        add(description);

        DateTimePicker dateTimePicker = new DateTimePicker();
        add(dateTimePicker);

        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        button.addClickShortcut(Key.ENTER);
        add(button);

        button.addClickListener(click -> {
            CalculatorModel calculate = calculatorService.calculate(dateTimePicker.getValue());

            MessageList list = new MessageList();

            // QUEEN ISOLATION
            Instant beeQueenIsolation = calculate.getBeeQueenIsolation()
                    .toInstant(ZoneOffset.UTC);

            MessageListItem beeQueenIsolationMessage = new MessageListItem(
                    "Isolation of the queen bee to obtain eggs.",
                    beeQueenIsolation, "QUEEN ISOLATION");
            beeQueenIsolationMessage.setUserColorIndex(1);

            // RAISING COLONY
            Instant raisingColony = calculate.getRaisingColony()
                    .toInstant(ZoneOffset.UTC);
            MessageListItem raisingColonyMessage = new MessageListItem(
                    "Taking the mother out of the raising family and making room for a frame with nursery cups.",
                    raisingColony, "RAISING COLONY");
            raisingColonyMessage.setUserColorIndex(2);

            //LARVAE TRANSFER
            Instant larvaeTransfer = calculate.getLarvaeTransfer()
                    .toInstant(ZoneOffset.UTC);
            MessageListItem larvaeTransferMessage = new MessageListItem(
                    "Transferring the larvae to the cups and placing the queen cell frame in the raising colony.",
                    larvaeTransfer, "LARVAE TRANSFER");
            larvaeTransferMessage.setUserColorIndex(3);

            // RETURNING QUEEN
            Instant returningQueen = calculate.getReturningQueen()
                    .toInstant(ZoneOffset.UTC);
            MessageListItem returningQueenMessage = new MessageListItem(
                    "Returning the mother to the raising family and isolating her from the nursery frame.",
                    returningQueen, "RETURNING QUEEN");
            returningQueenMessage.setUserColorIndex(4);

            // RETURNING QUEEN NO LATER
            Instant returningQueenNoLater = calculate.getReturningQueenNoLater()
                    .toInstant(ZoneOffset.UTC);
            MessageListItem returningQueenNoLaterMessage = new MessageListItem(
                    "Returning the mother to the raising family and isolating her from the nursery frame - no later than: " + returningQueenNoLater,
                    returningQueenNoLater, "RETURNING QUEEN NO LATER");
            returningQueenNoLaterMessage.setUserColorIndex(5);

            // SEALING WAX
            Instant sealingWax = calculate.getSealingWax()
                    .toInstant(ZoneOffset.UTC);
            MessageListItem sealingWaxMessage = new MessageListItem(
                    "Full sealing of bee cells.",
                    sealingWax, "SEALING WAX");
            sealingWaxMessage.setUserColorIndex(6);

            // HISTOLYSIS
            Instant histolysis = calculate.getHistolysis()
                    .toInstant(ZoneOffset.UTC);
            MessageListItem histolysisMessage = new MessageListItem(
                    "Do not schedule a bee colony review during this period!",
                    histolysis, "HISTOLYSIS");
            histolysisMessage.setUserColorIndex(4);

            // INSULATION
            Instant insulation = calculate.getInsulation()
                    .toInstant(ZoneOffset.UTC);
            MessageListItem insulationMessage = new MessageListItem(
                    "Isolation of bee nurseries to protect against the first bitten queen.",
                    insulation, "INSULATION");
            insulationMessage.setUserColorIndex(1);

            // POSSIBLE QUEEN HATCHING
            Instant possibleQueenHatching = calculate.getPossibleQueenHatching()
                    .toInstant(ZoneOffset.UTC);
            MessageListItem possibleQueenHatchingMessage = new MessageListItem(
                    "Possible exclusion of the first queen.",
                    possibleQueenHatching, "POSSIBLE QUEEN HATCHING.");
            possibleQueenHatchingMessage.setUserColorIndex(2);

            // QUEEN HATCHING
            Instant queenHatching = calculate.getQueenHatching()
                    .toInstant(ZoneOffset.UTC);
            MessageListItem queenHatchingMessage = new MessageListItem(
                    "Hatching queen bees.",
                    queenHatching, "QUEEN HATCHING");
            queenHatchingMessage.setUserColorIndex(3);



            list.setItems(Arrays.asList(
                    beeQueenIsolationMessage,
                    raisingColonyMessage,
                    larvaeTransferMessage,
                    returningQueenMessage,
                    returningQueenNoLaterMessage,
                    sealingWaxMessage,
                    histolysisMessage,
                    insulationMessage,
                    possibleQueenHatchingMessage,
                    queenHatchingMessage));

            add(list);

            pdfButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
            pdfButton.addClickShortcut(Key.ENTER);
            add(pdfButton);
        });


    }
}
