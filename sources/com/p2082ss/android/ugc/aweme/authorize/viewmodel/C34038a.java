package com.p2082ss.android.ugc.aweme.authorize.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1631b.p1633b.AbstractC22335a;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.p2082ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.a */
public final class C34038a implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    private final AwemeAuthorizePlatformDepend f80500a;

    /* renamed from: b */
    private final AbstractC22335a.AbstractC22336a f80501b;

    /* renamed from: c */
    private final C22349c.C22350a f80502c;

    static {
        Covode.recordClassIndex(40972);
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return new AuthCommonViewModel(this.f80500a, this.f80501b, this.f80502c);
    }

    public C34038a(AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend, AbstractC22335a.AbstractC22336a aVar, C22349c.C22350a aVar2) {
        C89219l.m154721d(awemeAuthorizePlatformDepend, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f80500a = awemeAuthorizePlatformDepend;
        this.f80501b = aVar;
        this.f80502c = aVar2;
    }
}
