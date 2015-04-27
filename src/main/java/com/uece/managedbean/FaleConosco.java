package com.uece.managedbean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class FaleConosco implements Serializable {

	private static final long serialVersionUID = 1L;

	public void gravar() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação:", "Operação realizada com sucesso."));
	}
}
