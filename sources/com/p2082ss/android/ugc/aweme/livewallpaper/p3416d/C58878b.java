package com.p2082ss.android.ugc.aweme.livewallpaper.p3416d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3416d.p3417a.C58876a;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3416d.p3417a.C58877b;
import com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.d.b */
public final class C58878b {

    /* renamed from: a */
    public static final C58878b f134043a = new C58878b();

    /* renamed from: b */
    private static final AbstractC89244h f134044b = C89250i.m154773a((AbstractC89171a) C58881a.f134046a);

    /* renamed from: a */
    public static AbstractC58875a[] m108177a() {
        return (AbstractC58875a[]) f134044b.getValue();
    }

    private C58878b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.d.b$a */
    static final class C58881a extends AbstractC89220m implements AbstractC89171a<AbstractC58875a[]> {

        /* renamed from: a */
        public static final C58881a f134046a = new C58881a();

        static {
            Covode.recordClassIndex(69197);
        }

        C58881a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC58875a[] invoke() {
            return new AbstractC58875a[]{new C58877b(), new C58876a()};
        }
    }

    static {
        Covode.recordClassIndex(69194);
        ColdLaunchRequestCombinerImpl.m104985b().mo95593a(new AbstractC67176a() {
            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3416d.C58878b.C588791 */

            static {
                Covode.recordClassIndex(69195);
            }

            @Override // com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a
            /* renamed from: a */
            public final void mo96312a(Throwable th) {
                C89219l.m154721d(th, "");
            }

            /* renamed from: com.ss.android.ugc.aweme.livewallpaper.d.b$1$a */
            static final class CallableC58880a<V> implements Callable {

                /* renamed from: a */
                public static final CallableC58880a f134045a = new CallableC58880a();

                static {
                    Covode.recordClassIndex(69196);
                }

                CallableC58880a() {
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    C58882c.m108183a();
                    return C89391z.f203057a;
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a
            /* renamed from: a */
            public final void mo96311a() {
                C1731i.m5640b(CallableC58880a.f134045a, C1731i.f5562a);
            }
        });
    }
}
