package com.codewithmosh.rivision.myTube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService notify;

    public void process(Video video) {
        encoder.encode(video);

        database.store(video);

        notify.sendEmail(video.getUser());
    }

    public void setEncoder(VideoEncoder encoder) {
        this.encoder = encoder;
    }

    public void setDatabase(VideoDatabase database) {
        this.database = database;
    }

    public void setNotify(EmailService notify) {
        this.notify = notify;
    }
}

