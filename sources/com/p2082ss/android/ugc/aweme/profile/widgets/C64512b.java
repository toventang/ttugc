package com.p2082ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.widgets.b */
public final /* synthetic */ class C64512b extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f146179a = new C64512b();

    static {
        Covode.recordClassIndex(75976);
    }

    C64512b() {
        super(ProfileState.class, "firstRefreshPublishAwemeList", "getFirstRefreshPublishAwemeList()Ljava/util/List;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((ProfileState) obj).getFirstRefreshPublishAwemeList();
    }
}
