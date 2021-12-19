package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.o */
final /* synthetic */ class C62559o extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f141882a = new C62559o();

    static {
        Covode.recordClassIndex(73355);
    }

    C62559o() {
        super(ResponseState.class, "pushState", "getPushState()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((ResponseState) obj).getPushState());
    }
}
