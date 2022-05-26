package com.xworkz.athlete.dao;

import java.util.List;
import java.util.Optional;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import com.xworkz.athlete.connection.DBUConnection;
import com.xworkz.athlete.constants.SPORTS;
import com.xworkz.athlete.dto.AthleteDTO;

public class AthleteDAOImplimentaion implements AthleteDAO {

	@Override
	public boolean save(AthleteDTO dto) {
		String insertQuery = "insert into d(id,name,sport,noOfGames,country,level,olympics,age,retired,coachName,totalMedals,fit,salary) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection sqlConnection = DBUConnection.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(insertQuery)) {
			preparedStatement.setInt(1, dto.getId());
			preparedStatement.setString(2, dto.getName());
			preparedStatement.setString(3, dto.getSports());
			preparedStatement.setInt(4, dto.getNoOfGames());
			preparedStatement.setString(5, dto.getCountry());
			preparedStatement.setInt(6, dto.getLevel());
			preparedStatement.setString(7, dto.getOlympics());
			preparedStatement.setInt(8, dto.getAge());
			preparedStatement.setString(9, dto.getRetired());
			preparedStatement.setString(10, dto.getCoachName());
			preparedStatement.setInt(11, dto.getTotalMedals());
			preparedStatement.setString(12, dto.getFit());
			preparedStatement.setLong(13, dto.getSalary());
			int rowAffected = preparedStatement.executeUpdate();
			System.out.println(rowAffected);

			//return true;
			//return setDTOToPreparedStatement(dto, preparedStatement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/*private boolean setDTOToPreparedStatement(AthleteDTO dto, PreparedStatement preparedStatement) throws SQLException {
		preparedStatement.setString(1, dto.getName());
		preparedStatement.setString(2, dto.getSports());
		preparedStatement.setInt(3, dto.getNoOfGames());
		preparedStatement.setString(4, dto.getCountry());
		preparedStatement.setInt(5, dto.getLevel());
		preparedStatement.setString(6, dto.getOlympics());
		preparedStatement.setInt(7, dto.getAge());
		preparedStatement.setString(8, dto.getRetired());
		preparedStatement.setString(9, dto.getCoachName());
		preparedStatement.setInt(10, dto.getTotalMedals());
		preparedStatement.setString(11, dto.getFit());
		preparedStatement.setLong(12, dto.getSalary());

		int rowAffected = preparedStatement.executeUpdate();
		System.out.printf("Row affected are>0", rowAffected);

		return true;

	}
*/
	@Override
	public boolean saveList(List<AthleteDTO> list) {
		String insertQuery = "insert into d (id,name,sports,noOfGames,country,level,olympics,age,retired,coachName,totalMedals,fit,salary) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Iterator<AthleteDTO> itr = list.iterator();

		try (Connection sqlConnection = DBUConnection.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(insertQuery)) {

			while (itr.hasNext()) {
				AthleteDTO dto = itr.next();
				//return setDTOToPreparedStatement(dto, preparedStatement);
				preparedStatement.setInt(1, dto.getId());
				preparedStatement.setString(2, dto.getName());
				preparedStatement.setString(3, dto.getSports());
				preparedStatement.setInt(4, dto.getNoOfGames());
				preparedStatement.setString(5, dto.getCountry());
				preparedStatement.setInt(6, dto.getLevel());
				preparedStatement.setString(7, dto.getOlympics());
				preparedStatement.setInt(8, dto.getAge());
				preparedStatement.setString(9, dto.getRetired());
				preparedStatement.setString(10, dto.getCoachName());
				preparedStatement.setInt(11, dto.getTotalMedals());
				preparedStatement.setString(12, dto.getFit());
				preparedStatement.setLong(13, dto.getSalary());

				int rowAffected = preparedStatement.executeUpdate();
				System.out.println( rowAffected);

				//return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	// @Override
	public AthleteDTO findById(int id) {
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		String Mysql = "Select * from d where id=?";
      System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
      
      
		try (Connection connection = DBUConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Mysql)) {
			 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(resultSet);

			while (resultSet.next()) {
				 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
				int id1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String sport = resultSet.getString(3);
				int noOfGames = resultSet.getInt(4);
				String country = resultSet.getString(5);
				int level = resultSet.getInt(6);
				String olympics = resultSet.getString(7);
				int age = resultSet.getInt(8);
				String retired = resultSet.getString(9);
				String coachName = resultSet.getString(10);
				int totalMedals = resultSet.getInt(11);
				String fit = resultSet.getString(12);
				Long salary = resultSet.getLong(13);

				AthleteDTO dto = new AthleteDTO(id1, name, sport, noOfGames, country, level, olympics, age, retired,
						coachName, totalMedals, fit, salary);
				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

// @Override
	public Optional<AthleteDTO> findByNameAndId(String name, int id) {
		String selectQuery = " Select * from d  where name=? and id=?";

		try (Connection sqlConnection = DBUConnection.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(selectQuery);) {
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2,id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int a=resultSet.getInt(1);
				String b=resultSet.getString(2);
				String c=resultSet.getString(3);
				int d=resultSet.getInt(4);
				String e=resultSet.getString(5);
				int f=resultSet.getInt(6);
				String g= resultSet.getString(7);
				int h=resultSet.getInt(8);
				String i=resultSet.getString(9);
				String j=resultSet.getString(10);
				int k=resultSet.getInt(11);
				String l=resultSet.getString(12);
				long m=resultSet.getLong(13);
			
				AthleteDTO obj=new AthleteDTO(a,b,c,d,e,f,g,h,i,j,k,l,m);
						
				return Optional.of(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	// @Override

	public Optional<AthleteDTO> findByNameAndSports(String name, String sports) {
		String selectQuery = " Select *from d where name=? and sport=?";

		try (Connection sqlConnection = DBUConnection.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(selectQuery)) {

			preparedStatement.setString(1, name);
			preparedStatement.setString(2, sports);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int a=resultSet.getInt(1);
				String b=resultSet.getString(2);
				String c=resultSet.getString(3);
				int d=resultSet.getInt(4);
				String e=resultSet.getString(5);
				int f=resultSet.getInt(6);
				String g= resultSet.getString(7);
				int h=resultSet.getInt(8);
				String i=resultSet.getString(9);
				String j=resultSet.getString(10);
				int k=resultSet.getInt(11);
				String l=resultSet.getString(12);
				long m=resultSet.getLong(13);
			
				AthleteDTO obj=new AthleteDTO(a,b,c,d,e,f,g,h,i,j,k,l,m);
				
				
						return Optional.of(obj);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();

	
	}

//@Override
	public Optional<AthleteDTO> findByNameAndCountryAndSports(String name, String country, String sports) {
		String selectQuery = " Select * from d where name=? and country=? and sport=?";

		try (Connection sqlConnection = DBUConnection.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(selectQuery)) {
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, country);
			preparedStatement.setString(3, sports);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int a=resultSet.getInt(1);
				String b=resultSet.getString(2);
				String c=resultSet.getString(3);
				int d=resultSet.getInt(4);
				String e=resultSet.getString(5);
				int f=resultSet.getInt(6);
				String g= resultSet.getString(7);
				int h=resultSet.getInt(8);
				String i=resultSet.getString(9);
				String j=resultSet.getString(10);
				int k=resultSet.getInt(11);
				String l=resultSet.getString(12);
				long m=resultSet.getLong(13);
			
				AthleteDTO obj=new AthleteDTO(a,b,c,d,e,f,g,h,i,j,k,l,m);
				
						return Optional.of(obj);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();
		
	}

// @Override
	public Optional<String> findCoachNameByNameAndCountryAndSport(String name, String country, String sport) {
		String selectQuery = " Select coachName from d where name=? and country=? and sport=?";

		try (Connection sqlConnection = DBUConnection.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(selectQuery)) {
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, country);
			preparedStatement.setString(3, sport);

			ResultSet resultSet = preparedStatement.executeQuery();

			resultSet.next();

			return Optional.of(resultSet.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();

	}

// @Override
	public Optional<String> findNameByID(int id) {
		String selectQuery = " Select name from d where id=?";

		try (Connection sqlConnection = DBUConnection.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(selectQuery)) {
			preparedStatement.setInt(3, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();

			return Optional.of(resultSet.getString(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();

	}

// @Override
	public Optional<Integer> findIDByName(String name) {
		String selectQuery = " Select id from d where name=?";

		try (Connection sqlConnection = DBUConnection.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(selectQuery)) {
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();

			return Optional.of(resultSet.getInt(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();

	}

}
