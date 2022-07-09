package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class FooterLayout extends VerticalLayout {

    public FooterLayout() {

        setSizeFull();
        getStyle().set("margin-top", "50px");
        getStyle().set("background" , "#F4F7F9");
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        
        HorizontalLayout collabLayout = new HorizontalLayout();
        collabLayout.setDefaultVerticalComponentAlignment(Alignment.CENTER);
        collabLayout.getStyle().set("margin-bottom", "5px");
        collabLayout.getStyle().set("margin-top", "20px");

        Paragraph collabFooter = new Paragraph("Interested in collaborating? ");
        collabFooter.setHeight("20px");

        Button contactFooter = new Button("Get in touch!");
        contactFooter.setHeight("40px");
        contactFooter.getStyle().set("color", "CadetBlue");

        contactFooter.addClickListener(event-> {
            getUI().ifPresent(ui->ui.navigate(ContactView.class));
        });

        collabLayout.add(collabFooter, contactFooter);

        Paragraph bodyFooter = new Paragraph("Made with ❤️ in Cleveland, Ohio");
        bodyFooter.setHeight("20px");
        bodyFooter.getStyle().set("margin-top", "10px");
        
        Paragraph copyrightFooter = new Paragraph("© Elijah Adams 2022");
        copyrightFooter.setHeight("20px");
        copyrightFooter.getStyle().set("margin-top", "-25px");


        add(new MediaImages(), collabLayout, bodyFooter, copyrightFooter);

    }

}
