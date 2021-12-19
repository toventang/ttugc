package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice */
public class UserTextNotice {
    @AbstractC27891c(mo46611a = "content")
    String content;
    @AbstractC27891c(mo46611a = "image_url")
    UrlModel imageUrl;
    @AbstractC27891c(mo46611a = "object_id")
    String objectId;
    @AbstractC27891c(mo46611a = "schema_url")
    String schemaUrl;
    @AbstractC27891c(mo46611a = "sub_type")
    int subType;
    @AbstractC27891c(mo46611a = "task_id")
    long taskId;
    @AbstractC27891c(mo46611a = "title")
    String title;
    @AbstractC27891c(mo46611a = "user_info")
    User user;

    static {
        Covode.recordClassIndex(72352);
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setObjectId(String str) {
        this.objectId = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
