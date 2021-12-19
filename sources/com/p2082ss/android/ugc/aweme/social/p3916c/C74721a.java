package com.p2082ss.android.ugc.aweme.social.p3916c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.social.c.a */
public final class C74721a extends IMUser {
    @AbstractC27891c(mo46611a = "mutual_relation")

    /* renamed from: a */
    private MutualStruct f167950a;
    @AbstractC27891c(mo46611a = "friend_type_str")

    /* renamed from: b */
    private String f167951b;
    @AbstractC27891c(mo46611a = "rid")

    /* renamed from: c */
    private String f167952c;
    @AbstractC27891c(mo46611a = "social_info")

    /* renamed from: d */
    private String f167953d;
    @AbstractC27891c(mo46611a = "is_private_account")

    /* renamed from: e */
    private boolean f167954e;

    /* renamed from: f */
    private int f167955f;

    static {
        Covode.recordClassIndex(87558);
    }

    public final String getFriendTypeStr() {
        return this.f167951b;
    }

    public final MutualStruct getMMutualStruct() {
        return this.f167950a;
    }

    public final String getRequestId() {
        return this.f167952c;
    }

    public final String getSocialInfo() {
        return this.f167953d;
    }

    public final int getSortIndex() {
        return this.f167955f;
    }

    public final boolean isPrivateAccount() {
        return this.f167954e;
    }

    public final void setFriendTypeStr(String str) {
        this.f167951b = str;
    }

    public final void setMMutualStruct(MutualStruct mutualStruct) {
        this.f167950a = mutualStruct;
    }

    public final void setPrivateAccount(boolean z) {
        this.f167954e = z;
    }

    public final void setRequestId(String str) {
        this.f167952c = str;
    }

    public final void setSocialInfo(String str) {
        this.f167953d = str;
    }

    public final void setSortIndex(int i) {
        this.f167955f = i;
    }
}
