package com.p2082ss.android.ugc.aweme.find.p2992ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.find.ui.a */
final /* synthetic */ class C50988a extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f117631a = new C50988a();

    static {
        Covode.recordClassIndex(60166);
    }

    C50988a() {
        super(FindFriendsState.class, "hasMore", "getHasMore()Z", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Boolean.valueOf(((FindFriendsState) obj).getHasMore());
    }
}
