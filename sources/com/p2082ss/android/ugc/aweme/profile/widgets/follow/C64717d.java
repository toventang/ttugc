package com.p2082ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64135cz;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.d */
public final class C64717d implements AbstractC12798a {

    /* renamed from: a */
    public final C64135cz f146461a;

    static {
        Covode.recordClassIndex(76184);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C64717d) && C89219l.m154714a(this.f146461a, ((C64717d) obj).f146461a);
        }
        return true;
    }

    public final int hashCode() {
        C64135cz czVar = this.f146461a;
        if (czVar != null) {
            return czVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FollowProfileData(extraBtnHelper=" + this.f146461a + ")";
    }

    public /* synthetic */ C64717d() {
        this(null);
    }

    public C64717d(C64135cz czVar) {
        this.f146461a = czVar;
    }
}
