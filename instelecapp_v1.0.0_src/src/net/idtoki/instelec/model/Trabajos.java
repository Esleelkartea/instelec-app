
package net.idtoki.instelec.model;


import java.util.logging.Logger;

import net.idtoki.instelec.manager.TrabajosManager;
import net.zylk.tools.format.FormatUtils;

import org.apache.torque.TorqueException;
import org.apache.torque.om.Persistent;

import com.workingdogs.village.DataSetException;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Thu Aug 10 13:35:35 CEST 2006]
 *
 * You should add additional methods to this class to meet the
 * application requirements.  This class will only be generated as
 * long as it does not already exist in the output directory.
 */
public  class Trabajos
    extends net.idtoki.instelec.model.BaseTrabajos
    implements Persistent
{

private static final Logger logger = Logger.getLogger("net.idtoki.instelec.model.Trabajos");


		
	public String getIdtrabajoTrabajosParsed()
	{
		return FormatUtils.genericParsedStr(this.getIdtrabajo() + "");
		}					

		
	public String getIdclienteTrabajosParsed()
	{
		String strFK=null;
		try
		{
			strFK=this.getClientes().getULContentClientesParsed();
		}
		catch (TorqueException te) {
			logger.severe("No se ha podido localizar Clientes. getIdclienteTrabajosParsed()" );
			te.printStackTrace();
		}
		return FormatUtils.genericParsedStr(strFK);		
		}					

		
	public String getDescripcionTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(this.getDescripcion());		
				}					

		
	public String getFechaavisoTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(FormatUtils.aaaammdd2ddmmaaaa(this.getFechaaviso(),"-"));		
				}					

		
	public String getHoraavisoTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(this.getHoraaviso());		
				}					

		
	public String getFechapresupuestoTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(FormatUtils.aaaammdd2ddmmaaaa(this.getFechapresupuesto(),"-"));		
				}					

		
	public String getFechafintrabajoTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(FormatUtils.aaaammdd2ddmmaaaa(this.getFechafintrabajo(),"-"));		
				}					

		
	public String getFechafacturaTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(FormatUtils.aaaammdd2ddmmaaaa(this.getFechafactura(),"-"));		
				}					

		
	public String getDireccionTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(this.getDireccion());		
				}					

		
	public String getCpTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(this.getCp());		
				}					

		
	public String getTelefonoTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(this.getTelefono());		
				}					

		
	public String getEstadoTrabajosParsed()
	{
		String cadena="";
		switch (this.getEstado())
		{
		case 0:
			cadena="0-Abierto";
			break;
		case 1:
			cadena="1-Presupuestado";
			break;
		case 2:
			cadena="2-Rechazado";
			break;
		case 3:
			cadena="3-Facturado";
			break;
		}
		return cadena;	
		}
	
	public String getEstadoTrabajosParsedLabel()
	{
		String cadena="";
		switch (this.getEstado())
		{
		case 0:
			cadena="<span class='Estilo_00'>Abierto</span>";
			break;
		case 1:
			cadena="<span class='Estilo_01'>Presupuestado</span>";
			break;
		case 2:
			cadena="<span class='Estilo_02'>Rechazado</span>";
			break;
		case 3:
			cadena="<span class='Estilo_03'>Facturado</span>";
			break;			
		default:
			cadena="<span class='Estilo_03'>n/a</span>";
			break;
		}
		return cadena;		
		}		

		
	public String getImporteTrabajosParsed()
	{
		return FormatUtils.genericParsedStr(this.getImporte() + "");	 
		}					

		
	public String getObservacionesTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(this.getObservaciones());		
				}					

		
	public String getPersonacontactoTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(this.getPersonacontacto());		
				}					

		
	public String getPersonarecibeTrabajosParsed()
	{
				return FormatUtils.genericParsedStr(this.getPersonarecibe());		
				}					


	public String getPathTrabajosParsed(String strQueryString) throws TorqueException
	{	
	  String a = "";
	  if (strQueryString.indexOf("clientes") != -1)	  
	  	a = a + this.getClientes().getPathClientesParsed(strQueryString) + "/";
	  a = a + this.getDescripcionTrabajosParsed();  
	  return a;
	}

	public String getULContentTrabajosParsed() throws TorqueException
	{
		return FormatUtils.genericParsedStr(this.getIdtrabajo() + "-" + this.getDescripcionTrabajosParsed());	
	}	

	public String getHijosOrdenestrabajoTrabajos()
	{
		return "<a href='#' class='hijos' id='getHijosOrdenestrabajoTrabajos" + this.getIdtrabajo() + "' title='Ordenestrabajo'>&#160;&#160;&#160;&#160;</a>";
	}
	
	public String getDeleteTrabajos()
	{
		return "<a href='#' class='eliminar' id='getDeleteTrabajos" + this.getIdtrabajo() + "'>&#160;&#160;&#160;&#160;</a>";
	}	
	public String getEditTrabajos()
	{
		return "<a href='#' class='edicion' id='getEditTrabajos" + this.getIdtrabajo() + "'>&#160;&#160;&#160;&#160;</a>";
	}
	
	public String getClienteTrabajosParsed() throws TorqueException
	{
		return FormatUtils.genericParsedStr(this.getClientes().getNombreClientesParsed());
	}
	
	public String getImporteCalculadoMaterialesTrabajosParsed() throws TorqueException,DataSetException
	{
		double importeCalculado = TrabajosManager.getImporteCalculadoMaterialesTrabajos(this.getIdtrabajo());
		return importeCalculado+"";
	}	
	
	public String getImporteCalculadoManoObraTrabajosParsed() throws TorqueException,DataSetException
	{
		double importeCalculado = TrabajosManager.getImporteCalculadoManoObraTrabajos(this.getIdtrabajo());
		return importeCalculado+"";
	}	
	
	public String getImporteCalculadoTrabajosParsed() throws TorqueException,DataSetException
	{
		double importeCalculado = TrabajosManager.getImporteCalculadoTrabajos(this.getIdtrabajo());
		return importeCalculado+"";
	}		

}
