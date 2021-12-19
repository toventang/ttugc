package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.metrics.u */
public final class C59256u extends AbstractC59242h<C59256u> {

    /* renamed from: X */
    private int f135347X = -1;

    /* renamed from: Y */
    private String f135348Y = "";

    /* renamed from: Z */
    private String f135349Z = "";

    /* renamed from: a */
    public EnumC59259c f135350a;

    /* renamed from: aa */
    private String f135351aa = "";

    /* renamed from: b */
    public EnumC59257a f135352b;

    /* renamed from: c */
    private String f135353c = "";

    /* renamed from: d */
    private EnumC59258b f135354d;

    /* renamed from: e */
    private String f135355e = "";

    /* renamed from: p */
    private String f135356p = "";

    /* renamed from: q */
    private String f135357q = "";

    /* renamed from: r */
    private String f135358r = "";

    /* renamed from: s */
    private String f135359s = "";

    /* renamed from: t */
    private String f135360t = "";

    /* renamed from: u */
    private String f135361u = "";

    /* renamed from: v */
    private AwemeRelationRecommendModel f135362v;

    static {
        Covode.recordClassIndex(69619);
    }

    /* renamed from: com.ss.android.ugc.aweme.metrics.u$a */
    public enum EnumC59257a {
        SHOW("show"),
        FOLLOW("follow"),
        ENTER_PROFILE("enter_profile"),
        PROFILE_FOLLOW("profile_follow"),
        CLOSE("close"),
        FOLLOW_CANCEL("follow_cancel"),
        PROFILE_FOLLOW_CANCEL("profile_follow_cancel"),
        DISLIKE("dislike"),
        ENTER_CHAT("enter_chat"),
        SHARE_POP_UP("share_pop_up");
        

        /* renamed from: b */
        private final String f135364b;

        public final String getType() {
            return this.f135364b;
        }

        static {
            Covode.recordClassIndex(69620);
        }

        private EnumC59257a(String str) {
            this.f135364b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.metrics.u$b */
    public enum EnumC59258b {
        SINGLE("single"),
        MUTUAL("mutual"),
        NO_RELATION("");
        

        /* renamed from: b */
        private final String f135366b;

        public final String getType() {
            return this.f135366b;
        }

        static {
            Covode.recordClassIndex(69621);
        }

        private EnumC59258b(String str) {
            this.f135366b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.metrics.u$c */
    public enum EnumC59259c {
        CARD("card"),
        POP_UP("pop_up"),
        ITEM("item"),
        SHARE_LINK("share_link"),
        LOGIN("login"),
        PUSH("push"),
        INBOX_NOTICE("inbox_notice");
        

        /* renamed from: b */
        private final String f135368b;

        public final String getType() {
            return this.f135368b;
        }

        static {
            Covode.recordClassIndex(69622);
        }

        private EnumC59259c(String str) {
            this.f135368b = str;
        }
    }

    /* renamed from: b */
    public final void mo96835b() {
        if (!TextUtils.isEmpty(this.f135360t) || !TextUtils.isEmpty(this.f135203C)) {
            mo96792f();
        }
    }

    public C59256u() {
        super("follow_recommend");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        String str2;
        mo96790a("enter_from", this.f135169h, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page", this.f135353c, AbstractC59233c.AbstractC59234a.f135177a);
        EnumC59259c cVar = this.f135350a;
        String str3 = null;
        if (cVar != null) {
            str = cVar.getType();
        } else {
            str = null;
        }
        mo96790a("scene_type", str, AbstractC59233c.AbstractC59234a.f135177a);
        EnumC59257a aVar = this.f135352b;
        if (aVar != null) {
            str2 = aVar.getType();
        } else {
            str2 = null;
        }
        mo96790a("action_type", str2, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("rec_type", this.f135203C, AbstractC59233c.AbstractC59234a.f135177a);
        EnumC59258b bVar = this.f135354d;
        if (bVar != null) {
            str3 = bVar.getType();
        }
        mo96790a("follow_type", str3, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("to_user_id", this.f135355e, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("group_id", this.f135356p, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("author_id", this.f135357q, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("req_id", this.f135358r, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("homepage_user_id", this.f135359s, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("relation_type", this.f135360t, AbstractC59233c.AbstractC59234a.f135177a);
        mo96785a("follow_status", this.f135347X);
        mo96786a("position", this.f135351aa);
        if (!TextUtils.isEmpty(this.f135361u)) {
            mo96786a("enter_method", this.f135361u);
        }
    }

    /* renamed from: a */
    public final C59256u mo96834a(String str) {
        if (str == null) {
            str = "";
        }
        this.f135169h = str;
        return this;
    }

    /* renamed from: o */
    public final C59256u mo96837o(String str) {
        if (str == null) {
            str = "";
        }
        this.f135361u = str;
        return this;
    }

    /* renamed from: p */
    public final C59256u mo96838p(String str) {
        if (str == null) {
            str = "";
        }
        this.f135351aa = str;
        return this;
    }

    /* renamed from: q */
    public final C59256u mo96839q(String str) {
        if (str == null) {
            str = "";
        }
        this.f135353c = str;
        return this;
    }

    /* renamed from: r */
    public final C59256u mo96840r(String str) {
        if (str == null) {
            str = "";
        }
        this.f135356p = str;
        return this;
    }

    /* renamed from: s */
    public final C59256u mo96841s(String str) {
        if (str == null) {
            str = "";
        }
        this.f135358r = str;
        return this;
    }

    /* renamed from: t */
    public final C59256u mo96842t(String str) {
        if (str == null) {
            str = "";
        }
        this.f135359s = str;
        return this;
    }

    /* renamed from: b */
    public static EnumC59258b m108931b(User user) {
        if (user != null) {
            if (user.getFollowerStatus() == 1 && user.getFollowStatus() != 0 && user.getFollowStatus() != 4) {
                return EnumC59258b.MUTUAL;
            }
            if (user.getFollowerStatus() != 1 && (user.getFollowStatus() == 0 || user.getFollowStatus() == 4)) {
                return EnumC59258b.NO_RELATION;
            }
        }
        return EnumC59258b.SINGLE;
    }

    /* renamed from: f */
    public final C59256u mo96749g(Aweme aweme) {
        String str;
        String str2;
        super.mo96749g(aweme);
        if (aweme != null) {
            AwemeRelationRecommendModel relationRecommendInfo = aweme.getRelationRecommendInfo();
            this.f135362v = relationRecommendInfo;
            String str3 = "";
            if (relationRecommendInfo == null || (str = relationRecommendInfo.getFriendTypeStr()) == null) {
                str = str3;
            }
            this.f135360t = str;
            AwemeRelationRecommendModel awemeRelationRecommendModel = this.f135362v;
            if (awemeRelationRecommendModel == null || (str2 = awemeRelationRecommendModel.getRecType()) == null) {
                str2 = str3;
            }
            this.f135203C = str2;
            String groupId = aweme.getGroupId();
            if (groupId == null) {
                groupId = str3;
            }
            this.f135356p = groupId;
            String authorUid = aweme.getAuthorUid();
            if (authorUid != null) {
                str3 = authorUid;
            }
            this.f135357q = str3;
        }
        return this;
    }

    /* renamed from: a */
    public final C59256u mo96832a(User user) {
        if (user != null) {
            String uid = user.getUid();
            String str = "";
            if (uid == null) {
                uid = str;
            }
            this.f135355e = uid;
            if (TextUtils.isEmpty(this.f135360t)) {
                String friendTypeStr = user.getFriendTypeStr();
                if (friendTypeStr == null) {
                    friendTypeStr = str;
                }
                this.f135360t = friendTypeStr;
            }
            if (TextUtils.isEmpty(this.f135203C)) {
                String recType = user.getRecType();
                if (recType == null) {
                    recType = str;
                }
                this.f135203C = recType;
            }
            String requestId = user.getRequestId();
            if (requestId != null) {
                str = requestId;
            }
            this.f135358r = str;
            this.f135354d = m108931b(user);
            C80409eu.m139391a(this, user);
        }
        return this;
    }

    /* renamed from: a */
    public final C59256u mo96833a(C66623g gVar) {
        String str = "";
        C89219l.m154721d(gVar, str);
        String enterFrom = gVar.getEnterFrom();
        if (enterFrom == null) {
            enterFrom = str;
        }
        this.f135169h = enterFrom;
        String previousPage = gVar.getPreviousPage();
        if (previousPage == null) {
            previousPage = str;
        }
        this.f135353c = previousPage;
        this.f135350a = gVar.getSceneType();
        String recType = gVar.getRecType();
        if (recType == null) {
            recType = str;
        }
        this.f135203C = recType;
        this.f135354d = gVar.getFollowType();
        String toUserId = gVar.getToUserId();
        if (toUserId == null) {
            toUserId = str;
        }
        this.f135355e = toUserId;
        String groupId = gVar.getGroupId();
        if (groupId == null) {
            groupId = str;
        }
        this.f135356p = groupId;
        String authorId = gVar.getAuthorId();
        if (authorId == null) {
            authorId = str;
        }
        this.f135357q = authorId;
        String reqId = gVar.getReqId();
        if (reqId == null) {
            reqId = str;
        }
        this.f135358r = reqId;
        String homepageUserId = gVar.getHomepageUserId();
        if (homepageUserId == null) {
            homepageUserId = str;
        }
        this.f135359s = homepageUserId;
        String friendTypeStr = gVar.getFriendTypeStr();
        if (friendTypeStr != null) {
            str = friendTypeStr;
        }
        this.f135360t = str;
        if (gVar.getSocialInfo() != null) {
            User user = new User();
            user.setSocialInfo(gVar.getSocialInfo());
            C80409eu.m139391a(this, user);
        }
        return this;
    }
}
