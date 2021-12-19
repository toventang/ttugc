package com.p2082ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.r */
final /* synthetic */ class C67015r extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f150344a = new C67015r();

    static {
        Covode.recordClassIndex(78592);
    }

    C67015r() {
        super(SocialRecRequestState.class, "isOverStayTime", "isOverStayTime()Z", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Boolean.valueOf(((SocialRecRequestState) obj).isOverStayTime());
    }
}
