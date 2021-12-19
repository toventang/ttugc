package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class ChatResult {
    @AbstractC27891c(mo46611a = "background_image")
    private ImageModel background;
    @AbstractC27891c(mo46611a = "content")
    private String content;
    @AbstractC27891c(mo46611a = "display_text")
    private C9698b displayText;
    @AbstractC27891c(mo46611a = "fullscreen_text_color")
    private String fullScreenTextColor;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private long f18955id;
    @AbstractC27891c(mo46611a = "msg_id")
    private long msgId;
    @AbstractC27891c(mo46611a = "user")
    private User user;

    static {
        Covode.recordClassIndex(8430);
    }

    public ImageModel getBackground() {
        return this.background;
    }

    public String getContent() {
        return this.content;
    }

    public C9698b getDisplayText() {
        return this.displayText;
    }

    public String getFullScreenTextColor() {
        return this.fullScreenTextColor;
    }

    public long getId() {
        return this.f18955id;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public User getUser() {
        return this.user;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisplayText(C9698b bVar) {
        this.displayText = bVar;
    }

    public void setFullScreenTextColor(String str) {
        this.fullScreenTextColor = str;
    }

    public void setId(long j) {
        this.f18955id = j;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
