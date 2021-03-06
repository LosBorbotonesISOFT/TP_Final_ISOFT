import Controller.LoginController;
import Entity.KeyEntity;
import Entity.PasswordEntity;
import Model.ApacheGenerator;
import Model.RandomGenerator;
import Repository.KeyRepository;
import Repository.PasswordRepository;
import View.LoginView;
import Model.LoginModel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel();
        LoginController loginController = new LoginController(loginModel, loginView);
    }
}
