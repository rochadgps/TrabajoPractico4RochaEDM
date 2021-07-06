package ar.edu.unju.edm.service.imp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;
import ar.edu.unju.edm.util.ListadoProductos;
@Service
public class ProductoServiceimp implements ProductoService {
	//como se hace
	//guardar en array
	//guarde en BD
	
	@Autowired
	Producto unProducto;
	private List<Producto> listaDeProductos = ListadoProductos.productos;
	//ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	
	@Override
	public void guardarProducto(Producto unProducto) {
		System.out.println(unProducto.getNombre());
		listaDeProductos.add(unProducto);
		System.out.println(listaDeProductos.size());
	}


	@Override
	public Producto obtenerProducto(String nombreProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> obtenerTodoProducto() {
		// TODO Auto-generated method stub
		return listaDeProductos;
	}

	@Override
	public Producto obtenerProductoNuevo() {
		return unProducto;
	}

	@Override
	public Producto obtenerUltimoProducto() {
	int i = listaDeProductos.size() - 1;
	return listaDeProductos.get(i);
	}

	@Override
	public Producto encontrarUnProducto(int codigo) {
		for (int i=0; i < listaDeProductos.size();i++)
		{
			if(listaDeProductos.get(i).getCodigo() == codigo)
			{
				unProducto = listaDeProductos.get(i);
	    	}
		}
		return unProducto;
	
	}
	@Override
	public void modificarProducto(Producto productoModificado) {
		// TODO Auto-generated method stub
		for (int i=0; i< listaDeProductos.size();i++)
		{//no modifica el codigo, porque no lo encuentra 
			if(listaDeProductos.get(i).getCodigo() == productoModificado.getCodigo())
			{
				listaDeProductos.set(i, productoModificado);
			}
	
		}	
	}


	@Override
	public Producto crearProducto() {
		// TODO Auto-generated method stub
		return unProducto;
	}



	@Override
	public Producto obtenerProductoCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void eliminarProducto(int codigo) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
