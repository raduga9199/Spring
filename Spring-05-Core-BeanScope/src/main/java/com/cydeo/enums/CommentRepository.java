package com.cydeo.enums;

import com.cydeo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
