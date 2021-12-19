package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.utils.C34721g;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice */
public class BaseNotice {
    public static final int RECOMMEND_LIVE = 50;
    @AbstractC27891c(mo46611a = "ad")
    public C61627b adHelperNotice;
    @AbstractC27891c(mo46611a = "announcement")
    public AnnouncementNotice announcement;
    @AbstractC27891c(mo46611a = "at")
    public AtMe atMe;
    @AbstractC27891c(mo46611a = "biz_notice")
    public C61628c businessAccountNotice;
    @AbstractC27891c(mo46611a = "check_profile")
    public CheckProfileNotice checkProfileNotice;
    public transient int clientOrder = -1;
    @AbstractC27891c(mo46611a = UGCMonitor.EVENT_COMMENT)
    public CommentNotice commentNotice;
    @AbstractC27891c(mo46611a = "create_time")
    public long createTime;
    @AbstractC27891c(mo46611a = "digg")
    public DiggNotice diggNotice;
    @AbstractC27891c(mo46611a = "donation")
    public C61629d donationNotice;
    @AbstractC27891c(mo46611a = "duet")
    public DuetNotice duetNotice;
    @AbstractC27891c(mo46611a = "follow_request_approve")
    public FollowApproveNotice followApproveNotice;
    @AbstractC27891c(mo46611a = "follow")
    public FollowNotice followNotice;
    @AbstractC27891c(mo46611a = "follow_request")
    public FollowRequestNotice followRequestNotice;
    @AbstractC27891c(mo46611a = "friend")
    public FriendNotice friendNotice;
    @AbstractC27891c(mo46611a = "has_read")
    public boolean hasRead;
    public transient long lastReadTime;
    public transient LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "lowest_position")
    public int lowestPosition;
    public transient boolean needCollapse;
    @AbstractC27891c(mo46611a = "nid")
    public String nid;
    public transient int noticeListType;
    @AbstractC27891c(mo46611a = "create_aweme")
    public PostNotice postNotice;
    public transient int priority;
    @AbstractC27891c(mo46611a = "promote_notice")
    public C61636j promoteNotice;
    @AbstractC27891c(mo46611a = "task_id")
    public long taskId;
    @AbstractC27891c(mo46611a = "tcm_notice")
    public C61638l tcmNotice;
    @AbstractC27891c(mo46611a = "template_id")
    public String templateId;
    @AbstractC27891c(mo46611a = "template_notice")
    public C61630e templateNotice;
    @AbstractC27891c(mo46611a = "text")
    public UserTextNotice textNotice;
    public transient int timeLineType = -1;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    public transient int unreadCount;
    @AbstractC27891c(mo46611a = "user_id")
    public String userId;
    @AbstractC27891c(mo46611a = "vote_notice")
    public C61639m voteNotice;

    static {
        Covode.recordClassIndex(72323);
    }

    public String getLabelText() {
        DiggNotice diggNotice2 = this.diggNotice;
        if (diggNotice2 != null) {
            return diggNotice2.getLabelText();
        }
        AtMe atMe2 = this.atMe;
        if (atMe2 != null) {
            return atMe2.getLabelText();
        }
        CommentNotice commentNotice2 = this.commentNotice;
        if (commentNotice2 != null) {
            return commentNotice2.getLabelText();
        }
        return "";
    }

    public boolean needForceInsert() {
        int i = this.type;
        if ((i == 1 || i == 2 || i == 1002) && this.lowestPosition > 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.type), this.nid, Long.valueOf(this.createTime), Boolean.valueOf(this.hasRead), this.followNotice});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseNotice baseNotice = (BaseNotice) obj;
            if (this.type == baseNotice.type && C34721g.m70920a(this.nid, baseNotice.nid) && this.createTime == baseNotice.createTime && this.hasRead == baseNotice.hasRead && C34721g.m70920a(this.followNotice, baseNotice.followNotice)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
