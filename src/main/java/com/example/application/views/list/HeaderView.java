package com.example.application.views.list;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;

class HeaderView extends VerticalLayout {

    public HeaderView() {

        setJustifyContentMode(JustifyContentMode.CENTER);
        setPadding(false);
        setSizeFull();
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        H1 title = new H1("");
        title.getStyle()
            .set("font-size", "var(--lumo-font-size-l)")
            .set("left", "var(--lumo-space-l)")
            .set("margin", "0")
            .set("position", "absolute");
  
        Tab biography = new Tab("Home");
        Tab projects = new Tab("Projects");
        Tab resume = new Tab("Resume");
        Tab contact = new Tab("Contact");

        Tabs tabs = new Tabs(biography, projects, resume, contact);
        tabs.addThemeVariants(TabsVariant.LUMO_CENTERED);

        addClickListener(event-> {

            if(biography.isSelected())
                getUI().ifPresent(ui->ui.navigate(BiographyView.class));
            if(projects.isSelected())
                getUI().ifPresent(ui->ui.navigate(ProjectsView.class));
            if(resume.isSelected())
                getUI().ifPresent(ui->ui.navigate(ResumeView.class));
            if(contact.isSelected())
                getUI().ifPresent(ui->ui.navigate(ContactView.class));

        });

        add(tabs);

    }

}
