package com.dewarim.reddit;

/**
 *
 */
public class CountingCommentConsumer implements CommentConsumer {

    Long counter = 0L;

    @Override
    public void consume(Comment comment) {
        counter++;
        if(counter % 10000 == 0){
            System.out.print(".");
            System.out.println(Comment.createLink(comment.subreddit, comment.link_id, comment.id));
        }
    }

    public Long getCounter() {
        return counter;
    }
}
