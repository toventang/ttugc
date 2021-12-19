package com.p2082ss.android.ugc.aweme.turbo.p4158vi;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p1910g.p1911a.C25039b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.turbo.api.brand.ITurboViApi;
import com.p2082ss.android.ugc.aweme.turbo.p4157a.C79337a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.turbo.vi.TurboViImpl */
public final class TurboViImpl implements ITurboViApi {

    /* renamed from: a */
    public final int f178257a = 1000;

    /* renamed from: b */
    public final int f178258b = 10000;

    /* renamed from: c */
    public final int f178259c = 3;

    /* renamed from: d */
    public volatile boolean f178260d;

    static {
        Covode.recordClassIndex(92538);
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void applicationOnCreate(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void openCamera() {
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void recordEnd() {
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void recordStart() {
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoComposeEnd() {
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoPlayEnd() {
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void waterMarkEnd() {
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void mainOnCreate() {
        m138150b();
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoComposeStart() {
        m138151c();
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoPlayStart() {
        m138150b();
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void waterMarkStart() {
        m138151c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.turbo.vi.TurboViImpl$b */
    public static final class CallableC79342b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ TurboViImpl f178262a;

        static {
            Covode.recordClassIndex(92540);
        }

        CallableC79342b(TurboViImpl turboViImpl) {
            this.f178262a = turboViImpl;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C25039b.m48010a(11, this.f178262a.f178258b, this.f178262a.f178259c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.turbo.vi.TurboViImpl$c */
    public static final class CallableC79343c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ TurboViImpl f178263a;

        static {
            Covode.recordClassIndex(92541);
        }

        CallableC79343c(TurboViImpl turboViImpl) {
            this.f178263a = turboViImpl;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C25039b.m48010a(12, this.f178263a.f178257a, this.f178263a.f178259c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m138150b() {
        if (this.f178260d) {
            C1731i.m5640b(new CallableC79343c(this), C1731i.f5562a);
        }
    }

    /* renamed from: c */
    private final void m138151c() {
        if (this.f178260d) {
            C1731i.m5640b(new CallableC79342b(this), C1731i.f5562a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.turbo.vi.TurboViImpl$a */
    static final class CallableC79341a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ TurboViImpl f178261a;

        static {
            Covode.recordClassIndex(92539);
        }

        CallableC79341a(TurboViImpl turboViImpl) {
            this.f178261a = turboViImpl;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f178261a.f178260d = C25039b.m48011a("10b824a48cd0655eda3dfab59f8ce989126de0da1e5306c0011afcd5779fcf4c");
            C39162r.m79460a("turbo_perf_init_result", new C33744d().mo59982a("is_success", Boolean.valueOf(this.f178261a.f178260d)).mo59983a("brand", "vivo").f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static ITurboViApi m138149a() {
        MethodCollector.m26663i(6661);
        Object a = C81908b.m141854a(ITurboViApi.class, false);
        if (a != null) {
            ITurboViApi iTurboViApi = (ITurboViApi) a;
            MethodCollector.m26664o(6661);
            return iTurboViApi;
        }
        if (C81908b.f183387eq == null) {
            synchronized (ITurboViApi.class) {
                try {
                    if (C81908b.f183387eq == null) {
                        C81908b.f183387eq = new TurboViImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6661);
                    throw th;
                }
            }
        }
        TurboViImpl turboViImpl = (TurboViImpl) C81908b.f183387eq;
        MethodCollector.m26664o(6661);
        return turboViImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void startNewPage(String str) {
        C89219l.m154721d(str, "");
        m138150b();
    }

    @Override // com.p2082ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void bootFinish(Context context) {
        C89219l.m154721d(context, "");
        if (((Boolean) C79337a.f178251a.getValue()).booleanValue()) {
            C1731i.m5640b(new CallableC79341a(this), C1731i.f5562a);
        }
    }
}
