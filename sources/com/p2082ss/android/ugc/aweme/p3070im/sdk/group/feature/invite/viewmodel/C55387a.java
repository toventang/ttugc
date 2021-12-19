package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.a */
public final class C55387a implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    private final String f126639a;

    static {
        Covode.recordClassIndex(65158);
    }

    public C55387a(String str) {
        C89219l.m154721d(str, "");
        this.f126639a = str;
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return new GroupShareViewModel(this.f126639a);
    }
}
