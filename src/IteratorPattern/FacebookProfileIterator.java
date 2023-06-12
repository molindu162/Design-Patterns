package IteratorPattern;

import java.util.List;

public class FacebookProfileIterator implements Iterator {
    private int pointer = 0;
    private List<Profile> profiles;

    public FacebookProfileIterator(Facebook facebook) {
        this.profiles = facebook.getProfiles();
    }

    public void getProfileNames(){
        System.out.println(this.getCurrent().getName());
        while (this.hasNext()){
            System.out.println(this.getNext().getName());
        }
    }

    @Override
    public boolean hasNext() {
        if (this.pointer < this.profiles.size() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public Profile getNext() {
        pointer++;
        Profile nextProfile = profiles.get(pointer);
        return nextProfile;
    }

    @Override
    public Profile getCurrent(){
        return profiles.get(pointer);
    }
}
