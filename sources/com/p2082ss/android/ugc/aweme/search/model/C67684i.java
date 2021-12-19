package com.p2082ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.search.model.i */
public final class C67684i implements Serializable {
    @AbstractC27891c(mo46611a = "is_rich_sug")

    /* renamed from: a */
    private String f151692a = "";
    @AbstractC27891c(mo46611a = "sug_user_id")

    /* renamed from: b */
    private String f151693b = "";
    @AbstractC27891c(mo46611a = "sug_sec_user_id")

    /* renamed from: c */
    private String f151694c = "";
    @AbstractC27891c(mo46611a = "rich_sug_avatar_uri")

    /* renamed from: d */
    private String f151695d = "";
    @AbstractC27891c(mo46611a = "rich_sug_nickname")

    /* renamed from: e */
    private String f151696e = "";
    @AbstractC27891c(mo46611a = "sug_uniq_id")

    /* renamed from: f */
    private String f151697f = "";
    @AbstractC27891c(mo46611a = "relation_type")

    /* renamed from: g */
    private String f151698g = "";
    @AbstractC27891c(mo46611a = "rich_sug_follower_count")

    /* renamed from: h */
    private Long f151699h;
    @AbstractC27891c(mo46611a = "rich_sug_aweme_count")

    /* renamed from: i */
    private String f151700i = "";
    @AbstractC27891c(mo46611a = "rich_sug_type")

    /* renamed from: j */
    private String f151701j = "";
    @AbstractC27891c(mo46611a = "rich_sug_user_type")

    /* renamed from: k */
    private String f151702k = "";
    @AbstractC27891c(mo46611a = "recall_reason")

    /* renamed from: l */
    private String f151703l = "";
    @AbstractC27891c(mo46611a = "words_type")

    /* renamed from: m */
    private String f151704m = "";
    @AbstractC27891c(mo46611a = "mention_block_type")

    /* renamed from: n */
    private long f151705n;

    static {
        Covode.recordClassIndex(79329);
    }

    public static /* synthetic */ void getUserRelationType$annotations() {
    }

    public final long getMentionBlockType() {
        return this.f151705n;
    }

    public final String getSecUserId() {
        return this.f151694c;
    }

    public final Long getTotalFollowers() {
        return this.f151699h;
    }

    public final String getTotalVideos() {
        return this.f151700i;
    }

    public final String getUserAvatarUri() {
        return this.f151695d;
    }

    public final String getUserId() {
        return this.f151693b;
    }

    public final String getUserNickname() {
        return this.f151696e;
    }

    public final String getUserRelationType() {
        return this.f151698g;
    }

    public final String getUsername() {
        return this.f151697f;
    }

    public final String getWordsType() {
        return this.f151704m;
    }

    public final String isRichSugValue() {
        return this.f151692a;
    }

    public final boolean isRichSug() {
        return C89219l.m154714a((Object) this.f151692a, (Object) "1");
    }

    public final int getUserType() {
        Integer e;
        String str = this.f151702k;
        if (str == null || (e = C89361p.m154863e(str)) == null) {
            return -1;
        }
        return e.intValue();
    }

    public final boolean isRegularSugType() {
        Integer e;
        String str = this.f151701j;
        if (str == null || (e = C89361p.m154863e(str)) == null || e.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean isRelationSugType() {
        Integer e;
        String str = this.f151701j;
        if (str == null || (e = C89361p.m154863e(str)) == null || e.intValue() != 2) {
            return false;
        }
        return true;
    }

    public final boolean isVerifiedUser() {
        Integer e;
        String str = this.f151702k;
        if (str == null || (e = C89361p.m154863e(str)) == null || e.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean matchQuery() {
        return C89361p.m154915b(this.f151703l, new String[]{"|"}).contains("origin_query");
    }

    public final void setMentionBlockType(long j) {
        this.f151705n = j;
    }

    public final void setRichSugValue(String str) {
        this.f151692a = str;
    }

    public final void setSecUserId(String str) {
        this.f151694c = str;
    }

    public final void setTotalFollowers(Long l) {
        this.f151699h = l;
    }

    public final void setUserAvatarUri(String str) {
        this.f151695d = str;
    }

    public final void setUserId(String str) {
        this.f151693b = str;
    }

    public final void setUserNickname(String str) {
        this.f151696e = str;
    }

    public final void setUserRelationType(String str) {
        this.f151698g = str;
    }

    public final void setUsername(String str) {
        this.f151697f = str;
    }

    public final void setWordsType(String str) {
        this.f151704m = str;
    }

    public final void setTotalVideos(String str) {
        C89219l.m154721d(str, "");
        this.f151700i = str;
    }
}
