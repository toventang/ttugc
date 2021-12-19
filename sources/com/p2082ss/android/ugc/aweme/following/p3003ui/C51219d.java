package com.p2082ss.android.ugc.aweme.following.p3003ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.d */
final /* synthetic */ class C51219d extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f118143a = new C51219d();

    static {
        Covode.recordClassIndex(60423);
    }

    C51219d() {
        super(FollowRelationState.class, "fanCount", "getFanCount()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((FollowRelationState) obj).getFanCount());
    }
}
