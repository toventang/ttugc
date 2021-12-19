package com.p2082ss.android.ugc.aweme.effectplatform;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.p2082ss.android.ugc.effectmanager.knadapt.DataPreProcess;
import com.p2082ss.ugc.effectplatform.p4447d.C86761a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.c */
public final class C46404c {

    /* renamed from: a */
    private static final AbstractC89244h f108137a = C89250i.m154773a((AbstractC89171a) C46405a.f108139a);

    /* renamed from: b */
    private static final AbstractC89244h f108138b = C89250i.m154773a((AbstractC89171a) C46406b.f108140a);

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.c$a */
    static final class C46405a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46405a f108139a = new C46405a();

        static {
            Covode.recordClassIndex(54986);
        }

        C46405a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "creative_tools_open_effect_callback", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.c$b */
    static final class C46406b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46406b f108140a = new C46406b();

        static {
            Covode.recordClassIndex(54987);
        }

        C46406b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "creative_tools_open_effect_decryption", false));
        }
    }

    static {
        Covode.recordClassIndex(54985);
    }

    /* renamed from: a */
    public static final AbstractC46415f m89554a(Context context, AbstractC89172b<? super EffectPlatformBuilder, C89391z> bVar) {
        C89219l.m154721d(context, "");
        IEffectPlatformFactory a = EffectPlatformFactory.m89604a();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(context);
        DataPreProcess.enable = ((Boolean) f108137a.getValue()).booleanValue();
        C86761a.f195659a = ((Boolean) f108138b.getValue()).booleanValue();
        if (bVar != null) {
            bVar.invoke(effectPlatformBuilder);
        }
        return a.create(effectPlatformBuilder);
    }
}
