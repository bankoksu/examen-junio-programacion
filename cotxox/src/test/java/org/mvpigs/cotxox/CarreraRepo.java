package org.mvpigs.cotxox;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public class CarreraRepo {

	@Query("select * from t_conductores where t_conductores != 0 ")
	public void conductorID() {
	}
}
