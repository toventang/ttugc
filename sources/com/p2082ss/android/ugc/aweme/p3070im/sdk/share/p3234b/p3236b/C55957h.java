package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.h */
public final class C55957h {

    /* renamed from: a */
    public static volatile boolean f127604a;

    /* renamed from: b */
    public static final C55957h f127605b = new C55957h();

    /* renamed from: c */
    private static final AbstractC89244h f127606c = C89250i.m154773a((AbstractC89171a) C55958a.f127608a);

    /* renamed from: d */
    private static int f127607d = -1;

    /* renamed from: a */
    private static List<Runnable> m101814a() {
        return (List) f127606c.getValue();
    }

    private C55957h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.h$a */
    static final class C55958a extends AbstractC89220m implements AbstractC89171a<List<Runnable>> {

        /* renamed from: a */
        public static final C55958a f127608a = new C55958a();

        static {
            Covode.recordClassIndex(65751);
        }

        C55958a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<Runnable> invoke() {
            return new ArrayList();
        }
    }

    static {
        Covode.recordClassIndex(65750);
    }

    /* renamed from: a */
    public static final synchronized void m101815a(boolean z) {
        int i;
        synchronized (C55957h.class) {
            MethodCollector.m26663i(3053);
            C56244a.m102190b("ShareStyle", "setShareHeadShow: ".concat(String.valueOf(z)));
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            f127607d = i;
            f127604a = false;
            Iterator<T> it = m101814a().iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            m101814a().clear();
            MethodCollector.m26664o(3053);
        }
    }
}
