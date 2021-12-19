package com.p2082ss.android.ugc.aweme.following.p3003ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import com.p2082ss.android.ugc.aweme.following.p3002a.EnumC51102a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.following.ui.o */
public final class C51273o implements Serializable {

    /* renamed from: a */
    private String f118230a;

    /* renamed from: b */
    private String f118231b;

    /* renamed from: c */
    private boolean f118232c;

    /* renamed from: d */
    private EnumC51102a f118233d;

    static {
        Covode.recordClassIndex(60477);
    }

    public final EnumC51102a getPageType() {
        return this.f118233d;
    }

    public final String getSecUid() {
        return this.f118231b;
    }

    public final String getUid() {
        return this.f118230a;
    }

    public final User getUser() {
        return C50540h.f116811c;
    }

    public final boolean isMine() {
        return this.f118232c;
    }

    public final Boolean isPageTypeFollower() {
        boolean z;
        if (this.f118233d == EnumC51102a.FOLLOWER) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void setMine(boolean z) {
        this.f118232c = z;
    }

    public final void setPageType(EnumC51102a aVar) {
        this.f118233d = aVar;
    }

    public final void setSecUid(String str) {
        this.f118231b = str;
    }

    public final void setUid(String str) {
        this.f118230a = str;
    }

    public C51273o(String str, boolean z, EnumC51102a aVar) {
        this.f118230a = str;
        this.f118232c = z;
        this.f118233d = aVar;
    }
}
