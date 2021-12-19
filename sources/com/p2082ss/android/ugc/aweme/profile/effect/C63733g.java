package com.p2082ss.android.ugc.aweme.profile.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.g */
public final class C63733g {

    /* renamed from: a */
    public static final C63733g f144486a = new C63733g();

    /* renamed from: b */
    private static EffectProfileListApi f144487b;

    private C63733g() {
    }

    static {
        Covode.recordClassIndex(75060);
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(EffectProfileListApi.class);
        C89219l.m154716b(create, "");
        f144487b = (EffectProfileListApi) create;
    }

    /* renamed from: a */
    public static AbstractC88979t<StickerItemList> m115263a(String str, long j) {
        C89219l.m154721d(str, "");
        return f144487b.fetch(str, j, 10);
    }
}
