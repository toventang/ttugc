package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.port.in.bq */
public final class C63234bq {
    static {
        Covode.recordClassIndex(74507);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.port.in.bq$a */
    public static final class C63235a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f143554a;

        /* renamed from: b */
        final /* synthetic */ File f143555b;

        static {
            Covode.recordClassIndex(74508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63235a(File file, AbstractC89124d dVar) {
            super(2, dVar);
            this.f143555b = file;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C63235a(this.f143555b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C63235a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f143554a == 0) {
                C89382r.m154942a(obj);
                C89159j.m154656g(this.f143555b);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final void m114583a(Context context) {
        C89219l.m154721d(context, "");
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        File file = C58016d.f132222c;
        C89219l.m154716b(file, "");
        File a = C89159j.m154651a(C89159j.m154651a(file, "vesdk"), "models");
        if (a.exists()) {
            AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C63235a(a, null), 3);
        }
    }
}
