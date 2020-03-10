package edu.egg.libreria.repositorios;

import edu.egg.libreria.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String>{
    @Query("SELECT c FROM Autor c WHERE c.nombre=:nombre")
    public Autor buscarPorNombre(@Param("nombre") String nombre);
    
//    public void eliminar(@Param("nombre") String nombre);
}
