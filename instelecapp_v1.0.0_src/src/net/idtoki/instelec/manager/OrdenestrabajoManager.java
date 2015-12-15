package net.idtoki.instelec.manager;

import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import com.workingdogs.village.DataSetException;

import net.idtoki.instelec.model.CategoriasPeer;
import net.idtoki.instelec.model.MaterialesPeer;
import net.idtoki.instelec.model.OrdenestrabajoPeer;
import net.idtoki.instelec.model.TareasPeer;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed Jul 26 13:47:22 CEST 2006]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class OrdenestrabajoManager
    extends BaseOrdenestrabajoManager
{


//Borrado de un elemento
	public static boolean borraOrdenestrabajo(int idBorrar) {

		Criteria c=new Criteria();
		c.add(OrdenestrabajoPeer.IDORDEN, idBorrar);
		boolean bRet = false;
		try {
			OrdenestrabajoPeer.doDelete(c);
			bRet = true;
		} catch (TorqueException e) {
			logger.info("No se ha podido borrar en la tabla Ordenestrabajo");
			e.printStackTrace();
			bRet = false;
		}
		return bRet;
	}
	
	public static double getImporteCalculadoOrdenestrabajo(int idOrden) throws TorqueException,DataSetException
	{
		Criteria c=new Criteria();
		c.add(OrdenestrabajoPeer.IDORDEN, idOrden);	
		c.addJoin(TareasPeer.IDORDEN, OrdenestrabajoPeer.IDORDEN);
		c.addJoin(MaterialesPeer.IDTAREA, TareasPeer.IDTAREA);
		c.addSelectColumn("SUM(" + MaterialesPeer.IMPORTE + "*" + MaterialesPeer.CANTIDAD + ")");
		  java.util.List result = MaterialesPeer.doSelectVillageRecords(c);
		  com.workingdogs.village.Record record = (com.workingdogs.village.Record) result.get(0);
		  return record.getValue(1).asDouble();		
	}		
	
	public static double getManoObraCalculadoOrdenestrabajo(int idOrden) throws TorqueException,DataSetException
	{
		Criteria c=new Criteria();
		c.add(OrdenestrabajoPeer.IDORDEN, idOrden);	
		c.addJoin(TareasPeer.IDORDEN, OrdenestrabajoPeer.IDORDEN);
		c.addJoin(CategoriasPeer.IDCATEGORIA, TareasPeer.IDCATEGORIA);
		c.addSelectColumn("SUM(" + TareasPeer.HORAS + "*" + CategoriasPeer.COSTE + ")");
		  java.util.List result = MaterialesPeer.doSelectVillageRecords(c);
		  com.workingdogs.village.Record record = (com.workingdogs.village.Record) result.get(0);
		  return record.getValue(1).asDouble();		
	}		

}

