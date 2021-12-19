package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.c */
public final class C53963c {
    static {
        Covode.recordClassIndex(63630);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.c$a */
    static final class C53964a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123721a;

        /* renamed from: b */
        final /* synthetic */ Context f123722b;

        /* renamed from: c */
        final /* synthetic */ String f123723c;

        /* renamed from: d */
        final /* synthetic */ int f123724d;

        static {
            Covode.recordClassIndex(63631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53964a(Context context, String str, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123722b = context;
            this.f123723c = str;
            this.f123724d = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53964a(this.f123722b, this.f123723c, this.f123724d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53964a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f123721a == 0) {
                C89382r.m154942a(obj);
                Toast toast = new C53962b(this.f123722b, this.f123723c, this.f123724d).f123718a;
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(toast);
                }
                toast.show();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final void m99178a(Context context, int i) {
        C89219l.m154721d(context, "");
        String string = context.getString(i);
        C89219l.m154716b(string, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(string, "");
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C53964a(context, string, 0, null), 2);
    }
}
