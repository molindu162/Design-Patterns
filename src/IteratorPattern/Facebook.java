package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Facebook {
    private List<Profile> profiles = new ArrayList<>();
    public List<Profile> getProfiles() {
        return profiles;
    }
    public void addProfile(Profile profile){
        this.profiles.add(profile);
    }

    public void get(){
        for (int i = 0; i < profiles.size(); i++){
            System.out.println(profiles.get(i));
        }
    }
}
