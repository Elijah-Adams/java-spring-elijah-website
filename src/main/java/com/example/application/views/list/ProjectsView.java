package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Elijah Adams")
@Route(value = "projects", layout = ListView.class)
public class ProjectsView extends VerticalLayout {

    public ProjectsView() {

        setSizeFull();
        setPadding(false);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        H1 nameHeader = new H1("My Projects!");
        nameHeader.getStyle().set("margin-bottom", "40px");
        nameHeader.getStyle().set("margin-top", "55px");
        nameHeader.getStyle().set("font-family", "Helvetica");
        
        add(nameHeader, projectsGrid(), new FooterLayout());

    }

    public VerticalLayout projectsGrid() {

        VerticalLayout grid = new VerticalLayout();
        grid.setSizeFull();
        grid.setWidth("50%");;
        grid.setHeight("100%");
        grid.setPadding(false);

        HorizontalLayout rowOne = new HorizontalLayout();
        rowOne.setPadding(false);
        rowOne.setSizeFull();
        HorizontalLayout rowTwo = new HorizontalLayout();
        rowTwo.setPadding(false);
        rowTwo.setSizeFull();
        HorizontalLayout rowThree = new HorizontalLayout();
        rowThree.setPadding(false);
        rowThree.setSizeFull();

        rowOne.add(projectButton());
        rowOne.add(projectButton());
        rowTwo.add(projectButton());
        rowTwo.add(projectButton());
        rowThree.add(projectButton());
        rowThree.add(projectButton());
        
        grid.add(rowOne, rowTwo, rowThree);
        return grid;

    }

    public Button projectButton() {

        Image resumeImage = new Image("images/author.png", "Author");

        Button btn = new Button(resumeImage);
        btn.setWidth("50%");
        btn.setMinWidth("200px");
        btn.setHeight("100%");
        btn.setMinHeight("200px");
        btn.addFocusListener(e ->  {
            btn.getStyle().set("background-color", "red");
        });

        resumeImage.setWidth(btn.getMinHeight());
        resumeImage.setHeight(btn.getMinHeight());
        

        return btn;

    }

}