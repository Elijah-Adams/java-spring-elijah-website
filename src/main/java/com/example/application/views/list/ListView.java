package com.example.application.views.list;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("adminstuff")
@Route(value = "adminstuff")
public class ListView extends AppLayout {

    public ListView() {

        addToNavbar(new HeaderView());
        setContent(new BiographyView());
        getStyle().set("background", "#d7dfe2");

    }

}
