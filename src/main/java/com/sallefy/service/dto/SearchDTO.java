package com.sallefy.service.dto;

import java.io.Serializable;
import java.util.List;

public class SearchDTO implements Serializable {

    private List<PlaylistDTO> playlists;

    private List<UserSimplifiedDTO> users;

    private List<TrackDTO> tracks;

    public List<PlaylistDTO> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<PlaylistDTO> playlists) {
        this.playlists = playlists;
    }

    public List<UserSimplifiedDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserSimplifiedDTO> users) {
        this.users = users;
    }

    public List<TrackDTO> getTracks() {
        return tracks;
    }

    public void setTracks(List<TrackDTO> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "SearchDTO{" +
            "playlists=" + playlists +
            ", users=" + users +
            ", tracks=" + tracks +
            '}';
    }
}
