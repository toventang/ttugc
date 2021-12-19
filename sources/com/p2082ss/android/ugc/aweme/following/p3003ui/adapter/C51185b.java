package com.p2082ss.android.ugc.aweme.following.p3003ui.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notificationlive.ResponseState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.b */
final /* synthetic */ class C51185b extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f118066a = new C51185b();

    static {
        Covode.recordClassIndex(60388);
    }

    C51185b() {
        super(ResponseState.class, "pushState", "getPushState()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((ResponseState) obj).getPushState());
    }
}
