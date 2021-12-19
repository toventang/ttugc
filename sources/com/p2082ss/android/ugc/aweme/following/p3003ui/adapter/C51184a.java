package com.p2082ss.android.ugc.aweme.following.p3003ui.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notificationlive.ResponseState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.a */
final /* synthetic */ class C51184a extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f118065a = new C51184a();

    static {
        Covode.recordClassIndex(60387);
    }

    C51184a() {
        super(ResponseState.class, "cacheEvent", "getCacheEvent()Lcom/ss/android/ugc/aweme/notificationlive/NotificationLiveEvent;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((ResponseState) obj).getCacheEvent();
    }
}
