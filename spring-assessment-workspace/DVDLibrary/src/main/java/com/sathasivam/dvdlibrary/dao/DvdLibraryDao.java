package com.sathasivam.dvdlibrary.dao;

import java.time.LocalDate;
import java.util.List;


import com.sathasivam.dvdlibrary.dto.Dvd;


public interface DvdLibraryDao {
	
	Dvd addDvd(String title, Dvd dvd) throws DvdLibraryDaoException;
	
	List<Dvd> getAllDvd()throws DvdLibraryDaoException;
	
	Dvd modifyReleaseDate(String title, LocalDate releaseDate);

	Dvd modifyMpaaRating(String title, String mpaaRating);
	
	Dvd modifyDirectorName(String title, String directorName);
	
	Dvd modifyStudio(String title, String studio);
	
	Dvd modifyUserRating(String title, String userRating);
	
	Dvd getDvd(String title)throws DvdLibraryDaoException;
	
	Dvd removeDvd(String title) throws DvdLibraryDaoException;
	
}
