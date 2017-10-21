/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author T-107
*/
@SpringUI
@Theme("valo")
public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout= new VerticalLayout();
        //generamos una etiqueta
        Label etiqueta = new Label("c(*u*c)");
        etiqueta.addStyleName(ValoTheme.LABEL_H1);
        layout.addComponent(etiqueta);
        setContent(layout);
        
        Label etiquetaGuardar=new Label("aplicacion mensaje");
         etiqueta.addStyleName(ValoTheme.LABEL_H2);
         TextField textoTitulo=new TextField();
         
         //el siguiente es un pplaceholder
         textoTitulo.setPlaceholder("Escribe el titulo");
         TextArea textoCuerpo=new TextArea();
         textoCuerpo.setPlaceholder("cuerpo del mensaje");
         Button  boton=new Button("Guardar mensaje");
         
         //Manejamos el evento del boton
         
         boton.addClickListener(evento->{
         Notification.show("se guardo el mensaje!!", Notification.TYPE_ERROR_MESSAGE);});
         
         //Agregamos los layout
         
         layout.addComponent(etiqueta);
         layout.addComponent(etiquetaGuardar);
         layout.addComponent(textoTitulo);
         layout.addComponent(textoCuerpo);
         layout.addComponent(boton);
         setContent(layout);
         
        
        
        
        
        
        
    }
    
}
