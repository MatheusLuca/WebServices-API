package br.com.fiap.api.DAO;

import br.com.fiap.api.model.ImovelModel;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository

public class ImovelDao {

    private final DataSource dataSource;

    public ImovelDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void inserir(ImovelModel imovel){
        String sql = "Insert into t_api_imovel(cd_imovel, ds_imovel, nr_dimensao, vl_imovel)" +
                "values (sq_t_api_imovel.NEXTVAL), ?, ?, ?";

        try{
            Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, imovel.getDescricao());
            stmt.setDouble(2, imovel.getDimensao());
            stmt.setDouble(3, imovel.getValor());
            stmt.execute(sql);
            ResultSet resultSet = stmt.getGeneratedKeys();
            if(resultSet.next()){
                imovel.setCodigo(resultSet.getInt(1, imovel.get))
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
