package net.idtoki.instelec.group;

import net.idtoki.instelec.model.MaterialesPeer;
import net.idtoki.instelec.model.Materiales;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed Jul 26 13:47:22 CEST 2006]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class MaterialesGroupBean
    extends net.idtoki.instelec.group.BaseMaterialesGroupBean
{
  public MaterialesGroupBean(){
        this.dbField = MaterialesPeer.IDMATERIAL;
            
//podemos fijar el numero de elementos por pagina recogiendo el entero de un archivo de configuracion
//this.setNumeroElementosPorPagina(int);
//si no se utiliza this.setNumeroElementosPorPagina(); el numero por defecto es 10

  }
}


