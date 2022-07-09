package com.example.application.views.list;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@PageTitle("Elijah Adams")
@Route(value = "resume", layout = ListView.class)
public class ResumeView extends VerticalLayout {

    public ResumeView() {

        setPadding(false);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("background", "#d7dfe2");

        Image resumeImage = new Image("images/resume.jpg", "Resume");
        resumeImage.setWidth("800px");
        resumeImage.getStyle().set("margin-top", "50px");

        add(resumeImage, new FooterLayout());

    }

}
