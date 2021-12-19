package com.p2082ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.widgets.n */
public final /* synthetic */ class C64934n extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f146755a = new C64934n();

    static {
        Covode.recordClassIndex(76401);
    }

    C64934n() {
        super(ProfileState.class, "isGuideUserCard", "isGuideUserCard()Ljava/lang/Boolean;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((ProfileState) obj).isGuideUserCard();
    }
}
