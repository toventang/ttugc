package com.p4501vk.api.sdk.p4505d;

import android.content.Context;
import android.os.Looper;
import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p4501vk.api.sdk.AbstractC87907j;
import com.p4501vk.api.sdk.internal.C87906e;
import com.p4501vk.api.sdk.p4507f.C87881a;
import com.p4501vk.api.sdk.p4507f.p4508a.AbstractC87884c;
import java.util.concurrent.TimeUnit;
import okhttp3.C90208y;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.d.b */
public final class C87866b {

    /* renamed from: g */
    public static final C87867a f199578g = new C87867a((byte) 0);

    /* renamed from: a */
    public final int f199579a = 500;

    /* renamed from: b */
    public final Context f199580b;

    /* renamed from: c */
    public final String f199581c;

    /* renamed from: d */
    public volatile String f199582d;

    /* renamed from: e */
    public volatile String f199583e;

    /* renamed from: f */
    public final C87870c f199584f;

    /* renamed from: h */
    private final Object f199585h;

    /* renamed from: i */
    private final AbstractC89244h f199586i;

    /* renamed from: j */
    private final C0489d<C90208y> f199587j;

    static {
        Covode.recordClassIndex(103876);
    }

    /* renamed from: a */
    private final AbstractC87907j m152860a() {
        return (AbstractC87907j) this.f199586i.getValue();
    }

    /* renamed from: com.vk.api.sdk.d.b$a */
    public static final class C87867a {
        static {
            Covode.recordClassIndex(103877);
        }

        private C87867a() {
        }

        public /* synthetic */ C87867a(byte b) {
            this();
        }
    }

    /* renamed from: com.vk.api.sdk.d.b$b */
    static final class C87868b extends AbstractC89220m implements AbstractC89171a<AbstractC87907j> {

        /* renamed from: a */
        final /* synthetic */ C87866b f199588a;

        static {
            Covode.recordClassIndex(103878);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C87868b(C87866b bVar) {
            super(0);
            this.f199588a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC87907j invoke() {
            if (!C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                C87866b bVar = this.f199588a;
                bVar.f199584f.f199590a.f199520f.mo142385a(new C87869c(bVar));
                return this.f199588a.f199584f.f199590a.f199520f;
            }
            throw new IllegalStateException("UI thread");
        }
    }

    /* renamed from: com.vk.api.sdk.d.b$c */
    public static final class C87869c implements AbstractC87907j.AbstractC87908a {

        /* renamed from: a */
        final /* synthetic */ C87866b f199589a;

        static {
            Covode.recordClassIndex(103879);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C87869c(C87866b bVar) {
            this.f199589a = bVar;
        }

        @Override // com.p4501vk.api.sdk.AbstractC87907j.AbstractC87908a
        /* renamed from: a */
        public final C90208y.C90210a mo142344a(C90208y.C90210a aVar) {
            C89219l.m154719c(aVar, "");
            if (AbstractC87884c.EnumC87885a.NONE != this.f199589a.f199584f.f199590a.f199523i.mo142363a().getValue()) {
                aVar.mo145096a(new C87862a(this.f199589a.f199584f.f199590a.f199526l, this.f199589a.f199584f.f199590a.f199523i));
            }
            return aVar;
        }
    }

    /* renamed from: b */
    private final C90208y m152862b(long j) {
        return this.f199587j.mo2077a(j);
    }

    public C87866b(C87870c cVar) {
        C89219l.m154719c(cVar, "");
        this.f199584f = cVar;
        this.f199580b = cVar.f199590a.f199515a;
        this.f199585h = new Object();
        this.f199586i = C89250i.m154773a((AbstractC89171a) new C87868b(this));
        this.f199581c = cVar.mo142345a();
        this.f199582d = cVar.mo142346b();
        this.f199583e = cVar.mo142347c();
        this.f199587j = new C0489d<>();
    }

    /* renamed from: c */
    private final C90208y m152863c(long j) {
        C90208y d = m152860a().mo142384a().mo145086b().mo145098b(j, TimeUnit.MILLISECONDS).mo145088a(j, TimeUnit.MILLISECONDS).mo145103d();
        C0489d<C90208y> dVar = this.f199587j;
        C89219l.m154709a((Object) d, "");
        C87881a.m152883a(dVar, j, d);
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        p4600h.p4610e.C89146c.m154636a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m152861a(okhttp3.C90029ac r4) {
        /*
            java.lang.String r2 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r4, r2)
            int r1 = r4.f204107c
            r0 = 413(0x19d, float:5.79E-43)
            if (r1 == r0) goto L_0x003a
            okhttp3.ad r2 = r4.f204111g
            r3 = 0
            if (r2 == 0) goto L_0x0023
            r0 = r2
            okhttp3.ad r0 = (okhttp3.AbstractC90031ad) r0     // Catch:{ all -> 0x0018 }
            java.lang.String r0 = r0.string()     // Catch:{ all -> 0x0018 }
            goto L_0x001f
        L_0x0018:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001a }
        L_0x001a:
            r0 = move-exception
            p4600h.p4610e.C89146c.m154636a(r2, r1)
            throw r0
        L_0x001f:
            p4600h.p4610e.C89146c.m154636a(r2, r3)
            r3 = r0
        L_0x0023:
            r2 = 599(0x257, float:8.4E-43)
            r1 = 500(0x1f4, float:7.0E-43)
            int r0 = r4.f204107c
            if (r1 <= r0) goto L_0x002c
        L_0x002b:
            return r3
        L_0x002c:
            if (r2 < r0) goto L_0x002b
            com.vk.api.sdk.c.d r1 = new com.vk.api.sdk.c.d
            int r0 = r4.f204107c
            if (r3 != 0) goto L_0x0036
            java.lang.String r3 = "null"
        L_0x0036:
            r1.<init>(r0, r3)
            throw r1
        L_0x003a:
            com.vk.api.sdk.c.e r1 = new com.vk.api.sdk.c.e
            java.lang.String r0 = r4.f204108d
            p4600h.p4611f.p4613b.C89219l.m154709a(r0, r2)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p4501vk.api.sdk.p4505d.C87866b.m152861a(okhttp3.ac):java.lang.String");
    }

    /* renamed from: a */
    public final C90208y mo142342a(long j) {
        boolean z;
        C90208y b;
        MethodCollector.m26663i(11816);
        synchronized (this.f199585h) {
            try {
                C90208y a = m152860a().mo142384a();
                long j2 = this.f199584f.f199590a.f199521g;
                C90208y b2 = m152862b(j2);
                if (b2 == null) {
                    b2 = m152863c(j2);
                }
                if (a.f204901A != b2.f204901A || a.f204902B != b2.f204902B || a.f204903C != b2.f204903C || a.f204904D != b2.f204904D || !C89219l.m154714a(a.f204906d, b2.f204906d) || !C89219l.m154714a(a.f204912j, b2.f204912j) || !C89219l.m154714a(a.f204913k, b2.f204913k) || !C89219l.m154714a(a.f204914l, b2.f204914l) || !C89219l.m154714a(a.f204924v, b2.f204924v) || !C89219l.m154714a(a.f204916n, b2.f204916n) || !C89219l.m154714a(a.f204917o, b2.f204917o) || !C89219l.m154714a(a.f204917o, b2.f204917o) || !C89219l.m154714a(a.f204919q, b2.f204919q) || !C89219l.m154714a(a.f204920r, b2.f204920r) || !C89219l.m154714a(a.f204922t, b2.f204922t) || !C89219l.m154714a(a.f204921s, b2.f204921s) || !C89219l.m154714a(a.f204923u, b2.f204923u) || a.f204925w != b2.f204925w || a.f204926x != b2.f204926x || a.f204927y != b2.f204927y || !C89219l.m154714a(a.f204905c, b2.f204905c) || !C89219l.m154714a(a.f204907e, b2.f204907e) || !C89219l.m154714a(a.f204908f, b2.f204908f) || !C89219l.m154714a(a.f204909g, b2.f204909g) || !C89219l.m154714a(a.f204910h, b2.f204910h)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    this.f199587j.mo2086c();
                }
                long j3 = j + ((long) this.f199579a);
                b = m152862b(j3);
                if (b == null) {
                    b = m152863c(j3);
                }
            } finally {
                MethodCollector.m26664o(11816);
            }
        }
        return b;
    }

    /* renamed from: a */
    public final void mo142343a(String str, String str2) {
        C89219l.m154719c(str, "");
        C87906e.m152919a(str);
        this.f199582d = str;
        this.f199583e = str2;
    }
}
