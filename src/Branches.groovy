import groovy.json.*;

class Branches {
    public static void main(String []args) {
        def project_id = 321
        def private_token = "xasxasxasxasxascads"
        def branches = new JsonSlurper().parseText(new URL("https://gitlab.com/api/v4/projects/"+project_id+"/repository/branches?private_token="+private_token).text).name
        println(branches)
    }
}
