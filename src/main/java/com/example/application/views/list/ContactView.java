package com.example.application.views.list;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Elijah Adams")
@Route(value = "contact", layout = ListView.class)
public class ContactView extends VerticalLayout {

    public ContactView() {

        setSizeFull();
        setMargin(false);
        getStyle().set("background", "#d7dfe2");
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        add(new Body(), new FooterLayout());

    }
    
    class Body extends VerticalLayout {

        public Body() {
    
            setSizeFull();
            setMargin(false);
            setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    
            H1 nameHeader = new H1("Get in Touch");
            nameHeader.setHeight("20px");
            nameHeader.getStyle().set("margin-bottom", "30px");
            nameHeader.getStyle().set("font-family", "Helvetica");
    
            Paragraph funfact = new Paragraph("Hey there! Looking to get in touch? I'd love to hear from you.");

            VerticalLayout innerVert = new VerticalLayout();
            innerVert.setPadding(false);
            innerVert.setWidth("700px");
            innerVert.setJustifyContentMode(FlexComponent.JustifyContentMode.START);
            innerVert.setDefaultHorizontalComponentAlignment(Alignment.STRETCH);
            innerVert.add(nameHeader, funfact);
    
            Paragraph body = new Paragraph("You can find me online here:");

            HorizontalLayout MediaLayout = new MediaImages();
            MediaLayout.getStyle().set("margin-top", "-5px");
            MediaLayout.setWidth("700px");

            Paragraph email = new Paragraph("You can also send me an email at elijahthomasadams@gmail.com, or fill out the form below.");

            innerVert.add(nameHeader, funfact, body, MediaLayout, email, new EmailForm());

            add(innerVert);
    
        }

        class EmailForm extends VerticalLayout {

            public EmailForm() {

                Paragraph comingsoon = new Paragraph("Email form coming soon!");

                add(comingsoon);                
            }

        }
        
    }

}

