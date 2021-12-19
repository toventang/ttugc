package com.p2082ss.android.ugc.aweme.friends.p3012b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.common.AbstractC39145n;
import com.p2082ss.android.ugc.aweme.experiment.C46914ev;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.friends.model.LocalContact;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.b.a */
public final class C51476a implements AbstractC39145n, AbstractC51499g {

    /* renamed from: a */
    public static final C51476a f118658a = new C51476a();

    /* renamed from: b */
    private static final AbstractC89244h f118659b = C89250i.m154773a((AbstractC89171a) C51477a.f118664a);

    /* renamed from: c */
    private static final MessageDigest f118660c = MessageDigest.getInstance("SHA-256");

    /* renamed from: d */
    private static boolean f118661d;

    /* renamed from: e */
    private static boolean f118662e;

    /* renamed from: f */
    private static final ConcurrentHashMap<String, LocalContact> f118663f = new ConcurrentHashMap<>();

    private C51476a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39145n
    /* renamed from: a */
    public final boolean mo67908a() {
        return f118661d;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.b.a$a */
    static final class C51477a extends AbstractC89220m implements AbstractC89171a<AbstractC89516am> {

        /* renamed from: a */
        public static final C51477a f118664a = new C51477a();

        static {
            Covode.recordClassIndex(60742);
        }

        C51477a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89516am invoke() {
            return C89517an.m155448a(C89599cu.m155531a().plus(C89546bf.f203267b));
        }
    }

    static {
        Covode.recordClassIndex(60741);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0064 A[SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39145n
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67909b() {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3012b.C51476a.mo67909b():java.lang.Object");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39145n
    /* renamed from: a */
    public final LocalContact mo67907a(String str) {
        LocalContact localContact;
        MethodCollector.m26663i(10656);
        C89219l.m154721d(str, "");
        synchronized (this) {
            try {
                localContact = f118663f.get(str);
            } finally {
                MethodCollector.m26664o(10656);
            }
        }
        return localContact;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.b.a$b */
    static final class C51478b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f118665a;

        static {
            Covode.recordClassIndex(60743);
        }

        C51478b(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C51478b(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C51478b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f118665a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C51476a aVar2 = C51476a.f118658a;
                this.f118665a = 1;
                if (aVar2.mo67909b() == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51499g
    /* renamed from: a */
    public final void mo86981a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        if (fVar == EnumC66622f.CONTACT && C51648a.f118980a.mo87322d().mo86984c() && C46914ev.f109330a) {
            AbstractC89568bz unused = C89624i.m155555a((AbstractC89516am) f118659b.getValue(), C89546bf.f203267b, null, new C51478b(null), 2);
            C51648a.f118980a.mo87315b(this);
        }
    }
}
