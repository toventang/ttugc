package com.p2082ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.io.File;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.f */
public final class C35377f {

    /* renamed from: a */
    public final String f83459a = C63244g.m114602a().mo73279g().mo69470c().mo69475a("canvas");

    /* renamed from: b */
    public final AbstractC35372c f83460b;

    /* renamed from: c */
    public final boolean f83461c;

    static {
        Covode.recordClassIndex(42548);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.canvas.f$a */
    public static final class CallableC35378a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C35377f f83462a;

        /* renamed from: b */
        final /* synthetic */ String f83463b;

        /* renamed from: c */
        final /* synthetic */ String f83464c;

        /* renamed from: d */
        final /* synthetic */ boolean f83465d;

        /* renamed from: e */
        final /* synthetic */ int f83466e;

        /* renamed from: f */
        final /* synthetic */ int f83467f;

        static {
            Covode.recordClassIndex(42549);
        }

        CallableC35378a(C35377f fVar, String str, String str2, boolean z, int i, int i2) {
            this.f83462a = fVar;
            this.f83463b = str;
            this.f83464c = str2;
            this.f83465d = z;
            this.f83466e = i;
            this.f83467f = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d2, code lost:
            if (r5 == false) goto L_0x00d4;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 234
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.canvas.C35377f.CallableC35378a.call():java.lang.Object");
        }

        /* renamed from: a */
        private static boolean m72406a(File file) {
            MethodCollector.m26663i(7496);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(7496);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(7496);
            return delete;
        }
    }

    public C35377f(AbstractC35372c cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        this.f83460b = cVar;
        this.f83461c = z;
    }

    /* renamed from: a */
    public final AbstractC88979t<C35413x> mo62282a(String str, int i, int i2, boolean z, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC88979t<C35413x> a = AbstractC88979t.m154314c(new CallableC35378a(this, str2, str, z, i, i2)).mo143261a(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(a, "");
        return a;
    }
}
