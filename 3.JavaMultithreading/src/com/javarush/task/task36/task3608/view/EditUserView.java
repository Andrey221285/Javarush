package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

import java.util.List;

public class EditUserView implements View {
    private Controller controller;

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser().toString());
        for (int i = 0; i < 51; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    public void fireEventUserDeleted(long id) {
        controller.onUserDelete(id);
    }

    public void fireEventUserChanged(String name, long id, int level) {
        controller.onUserChange(name, id, level);

    }
}
