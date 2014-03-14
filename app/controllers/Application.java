package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import net.sf.sprockets.Sprockets;
import net.sf.sprockets.google.Place;
import net.sf.sprockets.google.Places;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Result query() throws IOException{
		String queryStr = Form.form().bindFromRequest().get("searchq");
		if(queryStr != null && !queryStr.equals("")){
    		net.sf.sprockets.google.Places.Response<List<Place>> resp;
        	resp = Places.textSearch(new Places.Params().query(queryStr));
        	List<Place> places = resp.getResult();
    		return ok(result.render(queryStr,places));
    	}
    	return ok(result.render("",new ArrayList<Place>()));
    }

    public static Result result(){
    	return ok("");
    }
  
}
