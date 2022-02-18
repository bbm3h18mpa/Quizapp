package de.florianten.quizapp.model;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import de.florianten.quizapp.view.home.HomeActivityView;
import de.florianten.quizapp.view.login.LoginActivityView;
import de.florianten.quizapp.view.start.StartActivityView;

public class Model {

    public static final Model model = new Model();

    private final HttpHandler httpHandler = new HttpHandler();

    public Model() {}

    public static Model getInstance() {
        return model;
    }

    public class LoginModel {

    }

    public void readLoginToken() {

    }

    public class HttpHandler {

        public void loginRequest(){
            String url ="https://www.google.com";
            StartActivityView s = new StartActivityView();
            // Request a string response from the provided URL.
            StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            // Display the first 500 characters of the response string.
                            s.switchPage(HomeActivityView.class);
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                    switch (error.networkResponse.statusCode){
                        case 200:
                            s.switchPage(HomeActivityView.class);
                            break;
                        case 400:
                            s.switchPage(LoginActivityView.class);
                            break;
                    }

                }
            });
        }

    }
}
