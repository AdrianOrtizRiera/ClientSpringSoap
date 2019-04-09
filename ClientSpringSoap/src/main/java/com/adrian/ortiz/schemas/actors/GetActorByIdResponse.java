//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.09 a las 01:25:04 PM CEST 
//


package com.adrian.ortiz.schemas.actors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actorType" type="{http://www.adrian.ortiz.com/actors-ws}actorType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "actorType"
})
@XmlRootElement(name = "getActorByIdResponse")
public class GetActorByIdResponse {

    @XmlElement(required = true)
    protected ActorType actorType;

    /**
     * Obtiene el valor de la propiedad actorType.
     * 
     * @return
     *     possible object is
     *     {@link ActorType }
     *     
     */
    public ActorType getActorType() {
        return actorType;
    }

    /**
     * Define el valor de la propiedad actorType.
     * 
     * @param value
     *     allowed object is
     *     {@link ActorType }
     *     
     */
    public void setActorType(ActorType value) {
        this.actorType = value;
    }

}
