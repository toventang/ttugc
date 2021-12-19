package com.facebook.drawee.p1845a.p1846a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1833e.C24099a;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24206g;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24420i;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.imageutils.C24658b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.IOException;

/* renamed from: com.facebook.drawee.a.a.c */
public class C24182c {

    /* renamed from: a */
    public static final Class<?> f57219a = C24182c.class;

    /* renamed from: b */
    public static volatile boolean f57220b;

    /* renamed from: c */
    public static boolean f57221c = true;

    /* renamed from: d */
    private static C24187f f57222d;

    /* renamed from: e */
    private static AbstractC24206g f57223e;

    private C24182c() {
    }

    /* renamed from: d */
    public static boolean m45846d() {
        return f57220b;
    }

    static {
        Covode.recordClassIndex(28313);
    }

    /* renamed from: c */
    public static C24413h m45844c() {
        return C24428k.m46551a().mo40247e();
    }

    /* renamed from: a */
    public static void m45839a() {
        AbstractC24206g gVar;
        if (f57222d == null && (gVar = f57223e) != null) {
            f57222d = (C24187f) gVar.mo39777a();
        }
    }

    /* renamed from: b */
    public static C24185e m45843b() {
        m45839a();
        return f57222d.mo34217b();
    }

    /* renamed from: a */
    public static void m45840a(Context context) {
        m45841a(context, null);
    }

    /* renamed from: b */
    public static Context m45842b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: c */
    public static void m45845c(Context context) {
        C24644b.m47156a();
        C241831 r1 = new AbstractC24206g(context, null) {
            /* class com.facebook.drawee.p1845a.p1846a.C24182c.C241831 */

            /* renamed from: a */
            final /* synthetic */ Context f57224a;

            /* renamed from: b */
            final /* synthetic */ C24170b f57225b = null;

            /* renamed from: c */
            private volatile C24187f f57226c;

            static {
                Covode.recordClassIndex(28314);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24206g
            /* renamed from: a */
            public final AbstractC24093k<? extends AbstractC24198b> mo39777a() {
                MethodCollector.m26663i(6250);
                if (this.f57226c == null) {
                    synchronized (this) {
                        try {
                            if (this.f57226c == null) {
                                this.f57226c = new C24187f(this.f57224a, this.f57225b);
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(6250);
                            throw th;
                        }
                    }
                }
                C24187f fVar = this.f57226c;
                MethodCollector.m26664o(6250);
                return fVar;
            }

            {
                this.f57224a = r2;
            }
        };
        f57223e = r1;
        SimpleDraweeView.initialize(r1);
        C24644b.m47156a();
    }

    /* renamed from: a */
    public static void m45841a(Context context, C24420i iVar) {
        C24644b.m47156a();
        if (f57220b) {
            C24099a.m45654c(f57219a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            if (!f57221c) {
                C24644b.m47156a();
                return;
            }
        } else {
            f57220b = true;
        }
        try {
            C24644b.m47156a();
            C24658b.m47174a(context);
            C24644b.m47156a();
        } catch (IOException e) {
            C24099a.m45641a(f57219a, e, "Could not initialize SoLoader", new Object[0]);
            C24644b.m47156a();
        }
        Context b = m45842b(context);
        if (iVar == null) {
            C24428k.m46553a(b);
        } else {
            C24428k.m46555a(iVar);
        }
        m45845c(b);
        C24644b.m47156a();
    }
}
