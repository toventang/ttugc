package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.f */
public final class C55208f {

    /* renamed from: a */
    public static final C55208f f126276a = new C55208f();

    private C55208f() {
    }

    static {
        Covode.recordClassIndex(64953);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.f$a */
    public static final class C55209a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f126277a = R.string.cgk;

        /* renamed from: b */
        final /* synthetic */ Runnable f126278b;

        /* renamed from: c */
        final /* synthetic */ int f126279c;

        static {
            Covode.recordClassIndex(64954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55209a(Runnable runnable) {
            super(1);
            this.f126278b = runnable;
            this.f126279c = R.string.cck;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(this.f126277a, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55208f.C55209a.C552101 */

                /* renamed from: a */
                final /* synthetic */ C55209a f126280a;

                static {
                    Covode.recordClassIndex(64955);
                }

                {
                    this.f126280a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    Runnable runnable = this.f126280a.f126278b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(this.f126279c, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }
}
