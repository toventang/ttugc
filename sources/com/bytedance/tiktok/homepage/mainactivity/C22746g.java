package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C57058z;
import com.p2082ss.android.ugc.aweme.services.MandatoryLoginService;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.g */
public final class C22746g {

    /* renamed from: c */
    public static final C22747a f53725c = new C22747a((byte) 0);

    /* renamed from: a */
    public boolean f53726a;

    /* renamed from: b */
    public final Activity f53727b;

    static {
        Covode.recordClassIndex(26639);
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainactivity.g$a */
    public static final class C22747a {
        static {
            Covode.recordClassIndex(26640);
        }

        private C22747a() {
        }

        public /* synthetic */ C22747a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainactivity.g$c */
    public static final class CallableC22750c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C22746g f53733a;

        /* renamed from: b */
        final /* synthetic */ boolean f53734b;

        /* renamed from: c */
        final /* synthetic */ boolean f53735c;

        /* renamed from: d */
        final /* synthetic */ boolean f53736d;

        /* renamed from: e */
        final /* synthetic */ int f53737e;

        static {
            Covode.recordClassIndex(26643);
        }

        public CallableC22750c(C22746g gVar, boolean z, boolean z2, boolean z3, int i) {
            this.f53733a = gVar;
            this.f53734b = z;
            this.f53735c = z2;
            this.f53736d = z3;
            this.f53737e = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if ((AbstractC56869p.C56870a.m103133a().mo63253d() != 2 && !this.f53734b && !this.f53735c) || this.f53736d) {
                this.f53733a.mo37067a(this.f53736d, this.f53737e);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainactivity.g$d */
    public static final class C22751d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f53738a;

        static {
            Covode.recordClassIndex(26644);
        }

        public C22751d(C89233z.C89238e eVar) {
            this.f53738a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t = this.f53738a.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    public C22746g(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f53727b = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainactivity.g$b */
    public static final class C22748b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C22746g f53728a;

        /* renamed from: b */
        final /* synthetic */ boolean f53729b;

        /* renamed from: c */
        final /* synthetic */ int f53730c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f53731d;

        static {
            Covode.recordClassIndex(26641);
        }

        C22748b(C22746g gVar, boolean z, int i, C89233z.C89238e eVar) {
            this.f53728a = gVar;
            this.f53729b = z;
            this.f53730c = i;
            this.f53731d = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x001d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 209
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainactivity.C22746g.C22748b.accept(java.lang.Object):void");
        }

        /* renamed from: com.bytedance.tiktok.homepage.mainactivity.g$b$a */
        static final class C22749a implements IAccountService.AbstractC31277g {

            /* renamed from: a */
            final /* synthetic */ C22748b f53732a;

            static {
                Covode.recordClassIndex(26642);
            }

            C22749a(C22748b bVar) {
                this.f53732a = bVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
            public final void onResult(int i, int i2, Object obj) {
                if (i == 1 && i2 == 1 && AbstractC56869p.C56870a.m103133a().mo94055h()) {
                    C57058z.f129923a.mo57264a(this.f53732a.f53728a.f53727b, true, false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo37067a(boolean z, int i) {
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        eVar.element = (T) AbstractC88979t.m154310b(MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C22748b(this, z, i, eVar));
    }
}
