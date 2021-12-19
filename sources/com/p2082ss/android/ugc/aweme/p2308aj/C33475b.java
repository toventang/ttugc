package com.p2082ss.android.ugc.aweme.p2308aj;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.p2082ss.android.ugc.aweme.sticker.p3953c.AbstractC75274a;
import com.p2082ss.android.vesdk.VEImageDetectUtils;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aj.b */
public final class C33475b implements AbstractC75274a {

    /* renamed from: a */
    public static final C33476a f79539a = new C33476a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f79540b = C89250i.m154773a((AbstractC89171a) C33477b.f79541a);

    static {
        Covode.recordClassIndex(40332);
    }

    /* renamed from: a */
    public final C33474a mo59557a() {
        return (C33474a) this.f79540b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.aj.b$a */
    public static final class C33476a {
        static {
            Covode.recordClassIndex(40333);
        }

        private C33476a() {
        }

        public /* synthetic */ C33476a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.aj.b$b */
    static final class C33477b extends AbstractC89220m implements AbstractC89171a<C33474a> {

        /* renamed from: a */
        public static final C33477b f79541a = new C33477b();

        static {
            Covode.recordClassIndex(40334);
        }

        C33477b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33474a invoke() {
            return new C33474a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3953c.AbstractC75274a
    /* renamed from: b */
    public final void mo59559b() {
        mo59557a().mo59555a();
    }

    /* renamed from: com.ss.android.ugc.aweme.aj.b$c */
    static final class C33478c implements VEImageDetectUtils.IDetectImageResultWithNumListener {

        /* renamed from: a */
        final /* synthetic */ C33475b f79542a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89188r f79543b;

        static {
            Covode.recordClassIndex(40335);
        }

        C33478c(C33475b bVar, AbstractC89188r rVar) {
            this.f79542a = bVar;
            this.f79543b = rVar;
        }

        @Override // com.p2082ss.android.vesdk.VEImageDetectUtils.IDetectImageResultWithNumListener
        public final void onDetectResult(String str, String str2, String str3, int i) {
            AbstractC89188r rVar = this.f79543b;
            C89219l.m154716b(str, "");
            C89219l.m154716b(str2, "");
            C89219l.m154716b(str3, "");
            rVar.mo8774a(str, str2, str3, Integer.valueOf(i));
            this.f79542a.mo59557a().mo59555a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3953c.AbstractC75274a
    /* renamed from: a */
    public final void mo59558a(String str, List<String> list, EffectSdkExtra effectSdkExtra, AbstractC89188r<? super String, ? super String, ? super String, ? super Integer, C89391z> rVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(effectSdkExtra, "");
        C89219l.m154721d(rVar, "");
        if (effectSdkExtra.getPl().getAlg().size() != 0) {
            mo59557a().mo59556a(str, list, effectSdkExtra.getPl().getAlg(), new C33478c(this, rVar));
        }
    }
}
