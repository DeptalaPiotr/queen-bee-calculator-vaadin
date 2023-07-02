package com.queenbeecalculatorvaadin.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class CalculatorView extends VerticalLayout {

    CalculatorView() {
        add(new H1("Hello, world"));
    }
}
