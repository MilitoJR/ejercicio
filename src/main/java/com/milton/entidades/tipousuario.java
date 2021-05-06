package com.milton.entidades;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class tipousuario {

    public int getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	public String getTipoUser() {
		return TipoUser;
	}
	public void setTipoUser(String tipoUser) {
		TipoUser = tipoUser;
	}
	protected int idTipoUsuario;
    protected String TipoUser;
}
