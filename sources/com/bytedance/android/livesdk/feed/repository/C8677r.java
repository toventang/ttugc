package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.livesdk.feed.AbstractC8470a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.feed.repository.r */
final /* synthetic */ class C8677r implements AbstractC88433f {

    /* renamed from: a */
    private final FeedRepository.C8658a f21426a;

    /* renamed from: b */
    private final boolean f21427b;

    static {
        Covode.recordClassIndex(9543);
    }

    C8677r(FeedRepository.C8658a aVar, boolean z) {
        this.f21426a = aVar;
        this.f21427b = z;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC8470a.EnumC8471a aVar;
        String str;
        FeedRepository.C8658a aVar2 = this.f21426a;
        boolean z = this.f21427b;
        Throwable th = (Throwable) obj;
        AbstractC8470a aVar3 = aVar2.f21400i;
        if (z) {
            aVar = AbstractC8470a.EnumC8471a.REFRESH;
            str = aVar2.f21394c;
        } else {
            aVar = AbstractC8470a.EnumC8471a.LOAD_MORE;
            str = aVar2.f21395d;
        }
        aVar3.mo14803a(aVar, str, th);
    }
}
