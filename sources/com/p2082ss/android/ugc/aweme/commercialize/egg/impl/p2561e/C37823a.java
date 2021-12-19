package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2561e;

import android.net.Uri;
import android.text.TextUtils;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2207l;
import com.airbnb.lottie.p103f.C2120c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.C37779a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2560d.C37820a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37787a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37791c;
import com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38002b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.e.a */
public final class C37823a {

    /* renamed from: a */
    public static final C37823a f89308a = new C37823a();

    private C37823a() {
    }

    static {
        Covode.recordClassIndex(45270);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.e.a$a */
    public static final class CallableC37824a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C37787a f89309a;

        static {
            Covode.recordClassIndex(45271);
        }

        CallableC37824a(C37787a aVar) {
            this.f89309a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (TextUtils.isEmpty(this.f89309a.f89211a)) {
                this.f89309a.f89220j.set(false);
                C37823a.m76483a(this.f89309a, false);
            } else if (C38002b.m77063a(Uri.parse(this.f89309a.f89211a))) {
                this.f89309a.f89220j.set(true);
                C37823a.m76483a(this.f89309a, true);
            } else {
                C38002b.m77062a(this.f89309a.f89211a, new C38002b.AbstractC38004a(this) {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2561e.C37823a.CallableC37824a.C378251 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC37824a f89310a;

                    static {
                        Covode.recordClassIndex(45272);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38002b.AbstractC38004a
                    /* renamed from: a */
                    public final void mo59242a() {
                        this.f89310a.f89309a.f89220j.set(true);
                        C37823a.m76483a(this.f89310a.f89309a, true);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38002b.AbstractC38004a
                    /* renamed from: b */
                    public final void mo59243b() {
                        this.f89310a.f89309a.f89220j.set(false);
                        C37823a.m76483a(this.f89310a.f89309a, false);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f89310a = r1;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.e.a$b */
    public static final class RunnableC37826b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37787a f89311a;

        static {
            Covode.recordClassIndex(45273);
        }

        RunnableC37826b(C37787a aVar) {
            this.f89311a = aVar;
        }

        public final void run() {
            try {
                C51423a.m95791b(3, null, "CommerceLikeLayout:setCommerceDigg url = " + this.f89311a.f89211a);
                final C2207l<C2044e> a = new C2120c(C17867d.m33078a(), this.f89311a.f89211a).mo6001a();
                C89219l.m154716b(a, "");
                if (a.f6622b != null || a.f6621a == null) {
                    C29339a.m58754b(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2561e.C37823a.RunnableC37826b.RunnableC378282 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC37826b f89314a;

                        static {
                            Covode.recordClassIndex(45275);
                        }

                        {
                            this.f89314a = r1;
                        }

                        public final void run() {
                            this.f89314a.f89311a.f89220j.set(false);
                            C37823a.m76483a(this.f89314a.f89311a, false);
                        }
                    });
                } else {
                    C29339a.m58754b(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2561e.C37823a.RunnableC37826b.RunnableC378271 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC37826b f89312a;

                        static {
                            Covode.recordClassIndex(45274);
                        }

                        {
                            this.f89312a = r1;
                        }

                        public final void run() {
                            this.f89312a.f89311a.f89220j.set(true);
                            C37787a aVar = this.f89312a.f89311a;
                            C2207l lVar = a;
                            C89219l.m154716b(lVar, "");
                            aVar.f89221k = new C37791c(lVar.f6621a);
                            C37823a.m76483a(this.f89312a.f89311a, true);
                        }
                    });
                }
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                e.printStackTrace();
                C37823a.m76483a(this.f89311a, false);
            }
        }
    }

    /* renamed from: b */
    private static void m76484b(C37787a aVar) {
        C1731i.m5640b(new CallableC37824a(aVar), C1731i.f5562a);
    }

    /* renamed from: c */
    private static void m76485c(C37787a aVar) {
        C29339a.m58752a(new RunnableC37826b(aVar));
    }

    /* renamed from: a */
    public static void m76482a(C37787a aVar) {
        C37820a.m76473a(aVar);
        if (aVar == null) {
            return;
        }
        if (C89219l.m154714a((Object) aVar.f89212b, (Object) C37779a.C37780a.f89201a)) {
            m76485c(aVar);
        } else {
            m76484b(aVar);
        }
    }

    /* renamed from: a */
    static void m76483a(C37787a aVar, boolean z) {
        if (!C37820a.m76478a() && aVar != null) {
            C37820a.m76476a("preload_result", aVar.f89222l, !z ? 1 : 0, 8);
            C37820a.m76475a("aweme_ad_egg_preload_error_rate", aVar, z);
        }
    }
}
