package com.example.application.views.list;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class MediaImages extends HorizontalLayout {
    
    public MediaImages() {

        setWidth("350px");
        setJustifyContentMode(JustifyContentMode.EVENLY);
        getStyle().set("margin-top", "30px");

        Image githubImage = LinkImage("icons/github.png", "GitHub Icon", "https://github.com/Elijah-Adams");
        Image linkedinImage = LinkImage("icons/linkedin.png", "LinkedIn Icon", "https://www.linkedin.com/in/elijahthomasadams/");
        Image instagramImage = LinkImage("icons/instagram.png", "Instagram Icon", "https://www.instagram.com/elijah_adams/");
        Image stackoverflowImage = LinkImage("icons/stackoverflow.png", "Stack Overflow Icon", "https://stackoverflow.com/users/7024947/elijah-adams");

        add(githubImage, linkedinImage, instagramImage, stackoverflowImage);

    }

    public Image LinkImage(String imagePath, String imageAlt, String url) {
        
        Image mediaImage = new Image(imagePath, imageAlt);
        mediaImage.setWidth("35px");
        mediaImage.addClickListener(e ->  {
            getUI().ifPresent(ui -> ui.getPage().open(url));
        });
        mediaImage.setTitle(url);

        return mediaImage;
    }

}
