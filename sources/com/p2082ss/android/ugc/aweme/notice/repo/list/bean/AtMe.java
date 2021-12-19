package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe */
public class AtMe {
    @AbstractC27891c(mo46611a = "aweme")
    Aweme aweme;
    @AbstractC27891c(mo46611a = "reply_comment")
    Comment comment;
    @AbstractC27891c(mo46611a = "comment_status")
    int commentStatus = -1;
    @AbstractC27891c(mo46611a = "content")
    String content;
    @AbstractC27891c(mo46611a = "sticker")
    C46534a emoji;
    @AbstractC27891c(mo46611a = "image_url")
    UrlModel imageUrl;
    @AbstractC27891c(mo46611a = "item_status")
    int itemStatus;
    @AbstractC27891c(mo46611a = "level1_comment")
    Comment level1Comment;
    @AbstractC27891c(mo46611a = "label_text")
    private String mLabelText;
    @AbstractC27891c(mo46611a = "label_type")
    private int mLabelType;
    @AbstractC27891c(mo46611a = "relation_label")
    RelationDynamicLabel relationLabel;
    @AbstractC27891c(mo46611a = "schema_url")
    String schemaUrl;
    @AbstractC27891c(mo46611a = "sub_type")
    int subType;
    @AbstractC27891c(mo46611a = "title")
    String title;
    @AbstractC27891c(mo46611a = "user_info")
    User user;

    static {
        Covode.recordClassIndex(72322);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentStatus() {
        return this.commentStatus;
    }

    public String getContent() {
        return this.content;
    }

    public C46534a getEmoji() {
        return this.emoji;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public int getItemStatus() {
        return this.itemStatus;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getLabelType() {
        return this.mLabelType;
    }

    public Comment getLevel1Comment() {
        return this.level1Comment;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setCommentStatus(int i) {
        this.commentStatus = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setEmoji(C46534a aVar) {
        this.emoji = aVar;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setItemStatus(int i) {
        this.itemStatus = i;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setLabelType(int i) {
        this.mLabelType = i;
    }

    public void setLevel1Comment(Comment comment2) {
        this.level1Comment = comment2;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
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
