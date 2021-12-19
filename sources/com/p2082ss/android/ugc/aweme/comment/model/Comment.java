package com.p2082ss.android.ugc.aweme.comment.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.Comment */
public class Comment extends AbstractC34479a implements Serializable, Cloneable {
    private static final long serialVersionUID = -8417684736500467488L;
    @AbstractC27891c(mo46611a = "ad_flag")
    int adFlag;
    @AbstractC27891c(mo46611a = "alias_aweme")
    Aweme aliasAweme;
    @AbstractC27891c(mo46611a = "author_pin")
    boolean authorPin;
    @AbstractC27891c(mo46611a = "aweme_id")
    String awemeId;
    @AbstractC27891c(mo46611a = "cid")
    String cid;
    @AbstractC27891c(mo46611a = "collect_stat")
    int collectStat;
    @AbstractC27891c(mo46611a = "comment_type")
    int commentStructType;
    @AbstractC27891c(mo46611a = "commerce_info")
    private CommerceCommentStruct commerceInfo;
    @AbstractC27891c(mo46611a = "create_time")
    int createTime;
    @AbstractC27891c(mo46611a = "digg_count")
    int diggCount;
    private transient long fakeGiftId;
    private transient String fakeId = "";
    @AbstractC27891c(mo46611a = "forward_id")
    String forwardId;
    @AbstractC27891c(mo46611a = "gift")
    CommentGiftStruct gift;
    private transient String giftEffectPath = "";
    private transient boolean ignoreToast;
    @AbstractC27891c(mo46611a = "is_author_digged")
    public boolean isAuthorDigged;
    private transient boolean isStoryEmojiComment;
    boolean isTranslated;
    @AbstractC27891c(mo46611a = "label_info")
    String labelInfo;
    @AbstractC27891c(mo46611a = "label_text")
    String labelText;
    @AbstractC27891c(mo46611a = "label_type")
    int labelType;
    private int mCommentType;
    @AbstractC27891c(mo46611a = "label_list")
    List<CommentLabel> mLabelList;
    private boolean mNeedHint;
    public String mTimeDesc;
    public String mUserNamePrefix;
    public transient int offset;
    private transient int postStatus = -1;
    @AbstractC27891c(mo46611a = "relation_label")
    RelationDynamicLabel relationLabel;
    @AbstractC27891c(mo46611a = "reply_comment_total")
    long replyCommentTotal;
    @AbstractC27891c(mo46611a = "reply_comment")
    List<Comment> replyComments;
    @AbstractC27891c(mo46611a = "reply_id")
    String replyId;
    @AbstractC27891c(mo46611a = "reply_to_reply_id")
    String replyToReplyId;
    @AbstractC27891c(mo46611a = "reply_to_userid")
    String replyToUserId;
    @AbstractC27891c(mo46611a = "reply_to_username")
    String replyToUserName;
    private transient boolean shouldDisplayFakeComment;
    @AbstractC27891c(mo46611a = "status")
    int status = -1;
    @AbstractC27891c(mo46611a = "stick_position")
    int stickPosition;
    @AbstractC27891c(mo46611a = "text")
    String text;
    @AbstractC27891c(mo46611a = "text_extra")
    List<TextExtraStruct> textExtra;
    private transient String timeFormat = "";
    @AbstractC27891c(mo46611a = "reply_collapse_count")
    Integer topCount;
    @AbstractC27891c(mo46611a = "user")
    User user;
    @AbstractC27891c(mo46611a = "user_digged")
    int userDigged;

    /* renamed from: com.ss.android.ugc.aweme.comment.model.Comment$LabelType */
    public interface LabelType {
        static {
            Covode.recordClassIndex(43851);
        }
    }

    static {
        Covode.recordClassIndex(43849);
    }

    public int getAdFlag() {
        return this.adFlag;
    }

    public Aweme getAliasAweme() {
        return this.aliasAweme;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCommentStructType() {
        return this.commentStructType;
    }

    public int getCommentType() {
        return this.mCommentType;
    }

    public CommerceCommentStruct getCommerceInfo() {
        return this.commerceInfo;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getFakeGiftId() {
        return this.fakeGiftId;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public CommentGiftStruct getGift() {
        return this.gift;
    }

    public String getGiftEffectPath() {
        return this.giftEffectPath;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public List<CommentLabel> getLabelList() {
        return this.mLabelList;
    }

    public String getLabelText() {
        return this.labelText;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public int getPostStatus() {
        return this.postStatus;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public long getReplyCommentTotal() {
        return this.replyCommentTotal;
    }

    public List<Comment> getReplyComments() {
        return this.replyComments;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getReplyToReplyCommentId() {
        return this.replyToReplyId;
    }

    public String getReplyToUserId() {
        return this.replyToUserId;
    }

    public String getReplyToUserName() {
        return this.replyToUserName;
    }

    public boolean getShouldDisplayFakeComment() {
        return this.shouldDisplayFakeComment;
    }

    public int getStatus() {
        return this.status;
    }

    public int getStickPosition() {
        return this.stickPosition;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public String getTimeFormat() {
        return this.timeFormat;
    }

    public Integer getTopCount() {
        return this.topCount;
    }

    public User getUser() {
        return this.user;
    }

    public int getUserDigged() {
        return this.userDigged;
    }

    public boolean isAuthorDigged() {
        return this.isAuthorDigged;
    }

    public boolean isAuthorPin() {
        return this.authorPin;
    }

    public boolean isIgnoreToast() {
        return this.ignoreToast;
    }

    public boolean isNeedHint() {
        return this.mNeedHint;
    }

    public boolean isStoryEmojiComment() {
        return this.isStoryEmojiComment;
    }

    public boolean isTranslated() {
        return this.isTranslated;
    }

    public String getFakeId() {
        String str = this.fakeId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public boolean isCollected() {
        if (this.collectStat == 1) {
            return true;
        }
        return false;
    }

    public boolean isUserDigged() {
        if (this.userDigged == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Object
    public Comment clone() {
        C365451 r0;
        Comment comment = new Comment();
        comment.cid = this.cid;
        comment.text = this.text;
        comment.awemeId = this.awemeId;
        comment.createTime = this.createTime;
        comment.diggCount = this.diggCount;
        comment.status = this.status;
        comment.user = this.user;
        comment.replyId = this.replyId;
        comment.userDigged = this.userDigged;
        if (this.replyComments != null) {
            ArrayList arrayList = new ArrayList(this.replyComments.size());
            for (Comment comment2 : this.replyComments) {
                arrayList.add(comment2.clone());
            }
            comment.replyComments = arrayList;
        }
        if (this.textExtra != null) {
            ArrayList arrayList2 = new ArrayList(this.textExtra.size());
            for (TextExtraStruct textExtraStruct : this.textExtra) {
                arrayList2.add(textExtraStruct.clone());
            }
            comment.textExtra = arrayList2;
        }
        comment.labelText = this.labelText;
        comment.labelType = this.labelType;
        if (this.relationLabel == null) {
            r0 = null;
        } else {
            r0 = new RelationDynamicLabel() {
                /* class com.p2082ss.android.ugc.aweme.comment.model.Comment.C365451 */

                static {
                    Covode.recordClassIndex(43850);
                }

                {
                    setNickname(Comment.this.relationLabel.getNickname());
                    setLabelInfo(Comment.this.relationLabel.getLabelInfo());
                    setUserId(Comment.this.relationLabel.getUserId());
                    setCount(Comment.this.relationLabel.getCount());
                }
            };
        }
        comment.relationLabel = r0;
        comment.forwardId = this.forwardId;
        comment.replyCommentTotal = this.replyCommentTotal;
        comment.replyToReplyId = this.replyToReplyId;
        comment.replyToUserName = this.replyToUserName;
        comment.replyToUserId = this.replyToUserId;
        comment.mCommentType = this.mCommentType;
        comment.commentStructType = this.commentStructType;
        comment.stickPosition = this.stickPosition;
        comment.aliasAweme = this.aliasAweme;
        comment.mLabelList = this.mLabelList;
        comment.topCount = this.topCount;
        comment.commerceInfo = this.commerceInfo;
        return comment;
    }

    public void setAliasAweme(Aweme aweme) {
        this.aliasAweme = aweme;
    }

    public void setAuthorDigged(boolean z) {
        this.isAuthorDigged = z;
    }

    public void setAuthorPin(boolean z) {
        this.authorPin = z;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCollectStatus(int i) {
        this.collectStat = i;
    }

    public void setCommentStructType(int i) {
        this.commentStructType = i;
    }

    public void setCommentType(int i) {
        this.mCommentType = i;
    }

    public void setCommerceInfo(CommerceCommentStruct commerceCommentStruct) {
        this.commerceInfo = commerceCommentStruct;
    }

    public void setCreateTime(int i) {
        this.createTime = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setFakeGiftId(long j) {
        this.fakeGiftId = j;
    }

    public void setFakeId(String str) {
        this.fakeId = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setGift(CommentGiftStruct commentGiftStruct) {
        this.gift = commentGiftStruct;
    }

    public void setGiftEffectPath(String str) {
        this.giftEffectPath = str;
    }

    public void setIgnoreToast(boolean z) {
        this.ignoreToast = z;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setLabelList(List<CommentLabel> list) {
        this.mLabelList = list;
    }

    public void setLabelText(String str) {
        this.labelText = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setNeedHint(boolean z) {
        this.mNeedHint = z;
    }

    public void setPostStatus(int i) {
        this.postStatus = i;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyCommentTotal(long j) {
        this.replyCommentTotal = j;
    }

    public void setReplyComments(List<Comment> list) {
        this.replyComments = list;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setReplyToUserId(String str) {
        this.replyToUserId = str;
    }

    public void setReplyToUserName(String str) {
        this.replyToUserName = str;
    }

    public void setShouldDisplayFakeComment(boolean z) {
        this.shouldDisplayFakeComment = z;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStickPosition(int i) {
        this.stickPosition = i;
    }

    public void setStoryEmojiComment(boolean z) {
        this.isStoryEmojiComment = z;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTimeFormat(String str) {
        this.timeFormat = str;
    }

    public void setTranslated(boolean z) {
        this.isTranslated = z;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public void setUserDigged(int i) {
        this.userDigged = i;
    }

    public static String getAuthorUid(Comment comment) {
        User user2;
        if (comment == null || (user2 = comment.getUser()) == null) {
            return "";
        }
        return user2.getUid();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Comment) obj).cid);
    }
}
