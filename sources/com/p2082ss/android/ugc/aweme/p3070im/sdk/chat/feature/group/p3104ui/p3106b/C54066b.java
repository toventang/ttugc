package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.p3106b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b.b */
public final class C54066b {

    /* renamed from: a */
    public final IMUser f123917a;

    /* renamed from: b */
    public final int f123918b;

    static {
        Covode.recordClassIndex(63741);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54066b)) {
            return false;
        }
        C54066b bVar = (C54066b) obj;
        return C89219l.m154714a(this.f123917a, bVar.f123917a) && this.f123918b == bVar.f123918b;
    }

    public final int hashCode() {
        IMUser iMUser = this.f123917a;
        return ((iMUser != null ? iMUser.hashCode() : 0) * 31) + this.f123918b;
    }

    public final String toString() {
        return "GroupGreetingItem(user=" + this.f123917a + ", count=" + this.f123918b + ")";
    }

    public /* synthetic */ C54066b(IMUser iMUser) {
        this(iMUser, 0);
    }

    public C54066b(IMUser iMUser, int i) {
        this.f123917a = iMUser;
        this.f123918b = i;
    }
}
