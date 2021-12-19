package com.p2082ss.android.ugc.aweme.question;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.c */
public final class C66504c implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private final Long f149501a;
    @AbstractC27891c(mo46611a = "creator")

    /* renamed from: b */
    private final User f149502b;
    @AbstractC27891c(mo46611a = "video")

    /* renamed from: c */
    private final Aweme f149503c;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: d */
    private String f149504d;
    @AbstractC27891c(mo46611a = "videos_count")

    /* renamed from: e */
    private final Integer f149505e;
    @AbstractC27891c(mo46611a = "collect_status")

    /* renamed from: f */
    private Integer f149506f;
    @AbstractC27891c(mo46611a = "share_info")

    /* renamed from: g */
    private final ShareInfo f149507g;
    @AbstractC27891c(mo46611a = "invite_info")

    /* renamed from: h */
    private final C66517d f149508h;
    @AbstractC27891c(mo46611a = "language")

    /* renamed from: i */
    private final String f149509i;
    @AbstractC27891c(mo46611a = "create_time")

    /* renamed from: j */
    private final Long f149510j;

    /* renamed from: k */
    private Boolean f149511k;

    static {
        Covode.recordClassIndex(78047);
    }

    public C66504c() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final Integer getCollectStatus() {
        return this.f149506f;
    }

    public final String getContent() {
        return this.f149504d;
    }

    public final Long getCreateTime() {
        return this.f149510j;
    }

    public final User getCreator() {
        return this.f149502b;
    }

    public final Long getId() {
        return this.f149501a;
    }

    public final C66517d getInviteInfo() {
        return this.f149508h;
    }

    public final String getLanguage() {
        return this.f149509i;
    }

    public final ShareInfo getShareInfo() {
        return this.f149507g;
    }

    public final Aweme getVideo() {
        return this.f149503c;
    }

    public final Integer getVideosCount() {
        return this.f149505e;
    }

    public final Boolean isTranslated() {
        return this.f149511k;
    }

    public final String getQuestionType() {
        if (this.f149503c == null) {
            return "textual";
        }
        return "video";
    }

    public final boolean isCollected() {
        Integer num = this.f149506f;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public final C66504c clone() {
        return new C66504c(this.f149501a, this.f149502b, this.f149503c, this.f149504d, this.f149505e, this.f149506f, this.f149507g, this.f149508h, this.f149509i, this.f149510j, this.f149511k);
    }

    public final Integer getAnswerCount() {
        Integer num = this.f149505e;
        if (num != null) {
            num.intValue();
            if (C89219l.m154714a((Object) getQuestionType(), (Object) "video")) {
                this.f149505e.intValue();
            }
        }
        return this.f149505e;
    }

    public final void setCollectStatus(Integer num) {
        this.f149506f = num;
    }

    public final void setContent(String str) {
        this.f149504d = str;
    }

    public final void setTranslated(Boolean bool) {
        this.f149511k = bool;
    }

    public final void setCollectStatus(int i) {
        this.f149506f = Integer.valueOf(i);
    }

    public C66504c(Long l, User user, Aweme aweme, String str, Integer num, Integer num2, ShareInfo shareInfo, C66517d dVar, String str2, Long l2, Boolean bool) {
        this.f149501a = l;
        this.f149502b = user;
        this.f149503c = aweme;
        this.f149504d = str;
        this.f149505e = num;
        this.f149506f = num2;
        this.f149507g = shareInfo;
        this.f149508h = dVar;
        this.f149509i = str2;
        this.f149510j = l2;
        this.f149511k = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C66504c(Long l, User user, Aweme aweme, String str, Integer num, Integer num2, ShareInfo shareInfo, C66517d dVar, String str2, Long l2, Boolean bool, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : user, (i & 4) != 0 ? null : aweme, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : shareInfo, (i & 128) != 0 ? null : dVar, (i & 256) != 0 ? null : str2, (i & 512) == 0 ? l2 : null, (i & 1024) != 0 ? false : bool);
    }
}
