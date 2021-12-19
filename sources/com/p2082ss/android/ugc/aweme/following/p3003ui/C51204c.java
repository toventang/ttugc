package com.p2082ss.android.ugc.aweme.following.p3003ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.c */
final /* synthetic */ class C51204c extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f118113a = new C51204c();

    static {
        Covode.recordClassIndex(60407);
    }

    C51204c() {
        super(FollowRelationState.class, "connectedRelationCount", "getConnectedRelationCount()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((FollowRelationState) obj).getConnectedRelationCount());
    }
}
