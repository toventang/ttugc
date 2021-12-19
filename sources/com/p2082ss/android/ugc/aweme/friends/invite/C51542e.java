package com.p2082ss.android.ugc.aweme.friends.invite;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.e */
public class C51542e implements Serializable {
    @AbstractC27891c(mo46611a = "show_invite_all")

    /* renamed from: a */
    private boolean f118780a;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: b */
    private String f118781b;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: c */
    private String f118782c;
    @AbstractC27891c(mo46611a = "footer_invite_all")

    /* renamed from: d */
    private boolean f118783d;
    @AbstractC27891c(mo46611a = "limit_invite_all")

    /* renamed from: e */
    private int f118784e;

    static {
        Covode.recordClassIndex(60808);
    }

    public int getLimitInviteAllCount() {
        return this.f118784e;
    }

    public String getText() {
        return this.f118781b;
    }

    public String getUrl() {
        return this.f118782c;
    }

    public boolean isFloatInviteAll() {
        return this.f118783d;
    }

    public boolean isShowInviteAll() {
        return this.f118780a;
    }

    public void setFloatInviteAll(boolean z) {
        this.f118783d = z;
    }

    public void setShowInviteAll(boolean z) {
        this.f118780a = z;
    }

    public void setText(String str) {
        this.f118781b = str;
    }

    public void setUrl(String str) {
        this.f118782c = str;
    }
}
