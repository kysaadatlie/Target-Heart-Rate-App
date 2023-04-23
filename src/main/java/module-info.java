module com.example.thr {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.thr to javafx.fxml;
    exports com.example.thr;
}