package com.p2082ss.android.ugc.aweme.notificationlive.p3537ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notificationlive.ResponseState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.g */
final /* synthetic */ class C62659g extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f142072a = new C62659g();

    static {
        Covode.recordClassIndex(73462);
    }

    C62659g() {
        super(ResponseState.class, "statusCode", "getStatusCode()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((ResponseState) obj).getStatusCode());
    }
}
