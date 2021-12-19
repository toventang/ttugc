package com.p2082ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.widgets.e */
public final /* synthetic */ class C64667e extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f146391a = new C64667e();

    static {
        Covode.recordClassIndex(76133);
    }

    C64667e() {
        super(ProfileState.class, "loadAvatar", "getLoadAvatar()Lcom/bytedance/jedi/arch/Async;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((ProfileState) obj).getLoadAvatar();
    }
}
