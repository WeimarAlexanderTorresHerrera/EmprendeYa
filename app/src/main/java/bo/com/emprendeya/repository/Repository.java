package bo.com.emprendeya.repository;

import androidx.lifecycle.LiveData;

import bo.com.emprendeya.model.Base;
import bo.com.emprendeya.model.users.User;

public class Repository implements RepositoryImpl {
    @Override
    public LiveData<Base<User>> loginWithEmailPassword(String email, String password) {
        return null;
    }

    @Override
    public LiveData<Base<User>> loginWithGoogle() {
        return null;
    }

    /*
    private static Repository instance;

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    private static String message = "Hola Mundo";

    public static boolean login() {
        return true;
    }
    */

}
