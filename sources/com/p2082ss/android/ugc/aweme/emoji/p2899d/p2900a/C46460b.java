package com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46642d;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.d.a.b */
public final class C46460b {

    /* renamed from: a */
    public static final C46460b f108237a = new C46460b();

    private C46460b() {
    }

    static {
        Covode.recordClassIndex(55043);
    }

    /* renamed from: a */
    public static final void m89694a(C46534a aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C46461a(aVar, null), 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.d.a.b$a */
    public static final class C46461a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f108238a;

        /* renamed from: b */
        final /* synthetic */ C46534a f108239b;

        static {
            Covode.recordClassIndex(55044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46461a(C46534a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f108239b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46461a(this.f108239b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46461a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f108238a == 0) {
                C89382r.m154942a(obj);
                C46642d a = C46642d.m90028a();
                C46534a aVar = this.f108239b;
                List b = C80342dg.m139302b(a.f108763a.getString("recent_gif_emojis", ""), C46534a[].class);
                if (b.isEmpty()) {
                    b.add(aVar);
                } else {
                    b.remove(aVar);
                    b.add(0, aVar);
                    if (b.size() > 8) {
                        b = b.subList(0, 8);
                    }
                }
                a.f108763a.edit().putString("recent_gif_emojis", C80342dg.m139300a().mo46674b(b)).commit();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
