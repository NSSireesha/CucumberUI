package Resources;

public enum Resources {

    ADDPlace("/maps/api/place/add/json"),
    GETPlace("/maps/api/place/get/json"),
    DeletePlace("/maps/api/place/delete/json");

 private String path;
    Resources(String path) {

    this.path= path;
    }

    public String getresource()
    {
        return path;

    }

}


