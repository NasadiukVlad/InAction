package net.lermex.inaction.model;

import javax.persistence.*;

/**
 * Created by Vlad on 08.02.2016.
 */
public class Comments {

        private long usernameId;


        private String username;

        private String userComment;

        public Comments(String username, String userComment) {
            this.username = username;
            this.userComment = userComment;
        }

        public Comments() {
        }

        public String getUserComment() {
            return userComment;
        }

        public void setUserComment(String userComment) {
            this.userComment = userComment;
        }

        public long getUsernameId() {
            return usernameId;
        }

        public void setUsernameId(long usernameId) {
            this.usernameId = usernameId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }


    }


