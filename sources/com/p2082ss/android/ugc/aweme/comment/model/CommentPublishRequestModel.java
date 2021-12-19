package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentPublishRequestModel */
public class CommentPublishRequestModel implements Serializable {
    @AbstractC27891c(mo46611a = "action_type")
    int actionType;
    @AbstractC27891c(mo46611a = "ad_info")
    String adInfo;
    @AbstractC27891c(mo46611a = "aweme_id")
    String aid;
    @AbstractC27891c(mo46611a = "channel_id")
    int channelId;
    @AbstractC27891c(mo46611a = "is_self_see")
    int isSelfSee;
    @AbstractC27891c(mo46611a = "reply_id")
    String replyId;
    @AbstractC27891c(mo46611a = "reply_to_reply_id")
    String replyToReplyId;
    @AbstractC27891c(mo46611a = "text")
    String text;
    @AbstractC27891c(mo46611a = "text_extra")
    List<TextExtraStruct> textExtraList;

    static {
        Covode.recordClassIndex(43861);
    }

    public int getActionType() {
        return this.actionType;
    }

    public String getAdInfo() {
        return this.adInfo;
    }

    public String getAid() {
        return this.aid;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public int getIsSelfSee() {
        return this.isSelfSee;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getReplyToReplyId() {
        return this.replyToReplyId;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtraList() {
        return this.textExtraList;
    }

    public void setActionType(int i) {
        this.actionType = i;
    }

    public void setAdInfo(String str) {
        this.adInfo = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setChannelId(int i) {
        this.channelId = i;
    }

    public void setIsSelfSee(int i) {
        this.isSelfSee = i;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setStructList(List<TextExtraStruct> list) {
        this.textExtraList = list;
    }

    public void setText(String str) {
        this.text = str;
    }
}
