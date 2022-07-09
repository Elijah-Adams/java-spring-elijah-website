package com.example.application.views.list;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Elijah Adams")
@Route(value = "", layout = ListView.class)
public class BiographyView extends VerticalLayout {

    public BiographyView() {

        setSizeFull();
        setPadding(false);
        add(new Body(), new FooterLayout());

    }

}

class Body extends VerticalLayout {

    public Body() {

        setSizeFull();
        getStyle().set("margin-top", "50px");
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        H1 nameHeader = new H1("Elijah Adams");
        nameHeader.setHeight("20px");
        nameHeader.getStyle().set("margin-bottom", "10px");
        nameHeader.getStyle().set("margin-top", "10px");
        nameHeader.getStyle().set("font-family", "Helvetica");

        H3 description = new H3("Tech, Board Games, and Entrepreneurship");
        description.getStyle().set("font-style", "italic");
        description.getStyle().set("font-family", "Times New Roman");

        Paragraph funfact = new Paragraph("Fun Fact: This website was coded in Java with Spring Boot, Maven, and Vaadin!");
        funfact.setWidth("450px");

        Image authorImage = new Image("images/author.png", "author image");
        authorImage.setWidth("200px");
        authorImage.getStyle().set("border" , "6px dotted CadetBlue");
        
        // Main contains horizontal, which contains inner and image
        HorizontalLayout hor = new HorizontalLayout();
        hor.setDefaultVerticalComponentAlignment(Alignment.CENTER);
        hor.setSpacing(false);
        hor.setWidth("700px");

        VerticalLayout innerVert = new VerticalLayout();
        innerVert.setPadding(false);
        innerVert.setWidth("500px");
        innerVert.setHeight("200px");
        innerVert.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        innerVert.setDefaultHorizontalComponentAlignment(Alignment.STRETCH);
        innerVert.add(nameHeader, description, funfact);

        hor.add(innerVert, authorImage);

        Paragraph body = new Paragraph("Passionate programmer and learning enthusiast! Highly motivated and well-organized Ohio Wesleyan University Senior Computer Science major who works independently and productively to adapt to changing priorities. A goal-oriented student with strong communication and teamwork skills gained through leadership in club sports and restaurant experience. Quick learner with well-developed problem-solving skills and a willingness to ask questions and take initiative on the fly.");
        body.setWidth("700px");

        add(hor, body);

    }
    
}
