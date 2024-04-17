package org.example.simplex1.lab.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import org.example.simplex1.lab.helpers.Observer;


public class MainController implements Observer {
    @FXML
    private TabPane tabPane;
    @FXML
    private Tab conditionsTab;
    @FXML
    private ConditionsController conditionsTabPageController;
    @FXML
    private Tab simplexTab;
    @FXML
    private SimplexController simplexTabPageController;
    @FXML
    private Tab extraSimplexTab;
    @FXML
    private ExtraSimplexController extraSimplexTabPageController;
    @FXML
    private Tab graphTab;
    @FXML
    private GraphController graphTabPageController;

    @FXML
    private void initialize() {
        conditionsTabPageController.addObserver(this);
    }

    @Override
    public void onConditionChanged(String type) {
        if (type.equals("conditionsApply")) {
            simplexTabPageController.reset();
//            extraSimplexTabPageController.reset();
            graphTabPageController.reset(true);
        }
    }



}
