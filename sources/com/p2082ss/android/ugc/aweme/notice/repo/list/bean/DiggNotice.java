package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice */
public class DiggNotice implements Serializable {
    @AbstractC27891c(mo46611a = "aweme")
    Aweme aweme;
    @AbstractC27891c(mo46611a = "cid")
    String cid;
    @AbstractC27891c(mo46611a = UGCMonitor.EVENT_COMMENT)
    Comment comment;
    @AbstractC27891c(mo46611a = "content")
    String content;
    @AbstractC27891c(mo46611a = "digg_type")
    int diggType;
    @AbstractC27891c(mo46611a = "forward_id")
    String forwardId;
    @AbstractC27891c(mo46611a = "has_digg_list")
    Boolean hasDiggList;
    @AbstractC27891c(mo46611a = "label_text")
    private String mLabelText;
    @AbstractC27891c(mo46611a = "merge_count")
    int mergeCount;
    @AbstractC27891c(mo46611a = "relation_label")
    RelationDynamicLabel relationLabel;
    @AbstractC27891c(mo46611a = "from_user")
    List<User> users;

    static {
        Covode.recordClassIndex(72329);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getCid() {
        return this.cid;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getContent() {
        return this.content;
    }

    public int getDiggType() {
        return this.diggType;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public Boolean getHasDiggList() {
        return this.hasDiggList;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getMergeCount() {
        return this.mergeCount;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDiggType(int i) {
        this.diggType = i;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setMergeCount(int i) {
        this.mergeCount = i;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUsers(List<User> list) {
        this.users = list;
    }

    public DiggNotice(DiggNotice diggNotice) {
        this.aweme = diggNotice.aweme;
        this.users = diggNotice.users;
        this.content = diggNotice.content;
        this.mergeCount = diggNotice.mergeCount;
        this.diggType = diggNotice.diggType;
        this.cid = diggNotice.cid;
        this.relationLabel = diggNotice.relationLabel;
        this.forwardId = diggNotice.forwardId;
        this.mLabelText = diggNotice.mLabelText;
    }
}
