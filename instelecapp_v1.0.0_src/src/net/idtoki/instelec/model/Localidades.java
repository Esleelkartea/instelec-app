
package net.idtoki.instelec.model;


import java.util.logging.Logger;

import net.zylk.tools.format.FormatUtils;

import org.apache.torque.TorqueException;
import org.apache.torque.om.Persistent;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Thu Aug 10 13:35:35 CEST 2006]
 *
 * You should add additional methods to this class to meet the
 * application requirements.  This class will only be generated as
 * long as it does not already exist in the output directory.
 */
public  class Localidades
    extends net.idtoki.instelec.model.BaseLocalidades
    implements Persistent
{

private static final Logger logger = Logger.getLogger("net.idtoki.instelec.model.Localidades");


		
	public String getIdlocalidadLocalidadesParsed()
	{
		return FormatUtils.genericParsedStr(this.getIdlocalidad() + "");
		}					

		
	public String getIdprovinciaLocalidadesParsed()
	{
		String strFK=null;
		try
		{
			strFK=this.getProvincias().getULContentProvinciasParsed();
		}
		catch (TorqueException te) {
			logger.severe("No se ha podido localizar Provincias. getIdprovinciaLocalidadesParsed()" );
			te.printStackTrace();
		}
		return FormatUtils.genericParsedStr(strFK);		
		}					

		
	public String getNombreLocalidadesParsed()
	{
				return FormatUtils.genericParsedStr(this.getNombre());		
				}					


	public String getPathLocalidadesParsed(String strQueryString) throws TorqueException
	{	
	  String a = "";
	  if (strQueryString.indexOf("provincias") != -1)	  
	  	a = a + this.getProvincias().getPathProvinciasParsed(strQueryString) + "/";
	  a = a + this.getNombreLocalidadesParsed() + "(" + this.getProvincias().getNombreProvinciasParsed() + ")";  
	  return a;
	}

	public String getULContentLocalidadesParsed() throws TorqueException
	{
		return FormatUtils.genericParsedStr(this.getIdlocalidad() + "-" + this.getNombreLocalidadesParsed() + "(" + this.getProvincias().getNombreProvinciasParsed() + ")");	
	}	

	public String getHijosClientesLocalidades()
	{
		return "<a href='#' class='hijos' id='getHijosClientesLocalidades" + this.getIdlocalidad() + "' title='Clientes'>&#160;&#160;&#160;&#160;</a>";
	}
	public String getHijosTrabajadoresLocalidades()
	{
		return "<a href='#' class='hijos' id='getHijosTrabajadoresLocalidades" + this.getIdlocalidad() + "' title='Trabajadores'>&#160;&#160;&#160;&#160;</a>";
	}
	
	public String getDeleteLocalidades()
	{
		return "<a href='#' class='eliminar' id='getDeleteLocalidades" + this.getIdlocalidad() + "'>&#160;&#160;&#160;&#160;</a>";
	}	
	public String getEditLocalidades()
	{
		return "<a href='#' class='edicion' id='getEditLocalidades" + this.getIdlocalidad() + "'>&#160;&#160;&#160;&#160;</a>";
	}

}
