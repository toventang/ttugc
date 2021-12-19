package com.p2082ss.android.ugc.aweme.profile.effect;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListApi */
public interface EffectProfileListApi {

    /* renamed from: a */
    public static final C63681a f144386a = C63681a.f144387a;

    static {
        Covode.recordClassIndex(75003);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/original/effect/list/")
    AbstractC88979t<StickerItemList> fetch(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i);

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListApi$a */
    public static final class C63681a {

        /* renamed from: a */
        static final /* synthetic */ C63681a f144387a = new C63681a();

        private C63681a() {
        }

        static {
            Covode.recordClassIndex(75004);
        }
    }
}
