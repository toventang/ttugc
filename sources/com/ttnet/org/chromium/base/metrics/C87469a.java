package com.ttnet.org.chromium.base.metrics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.library_loader.LibraryLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ttnet.org.chromium.base.metrics.a */
public class C87469a {
    static {
        Covode.recordClassIndex(103413);
    }

    /* renamed from: com.ttnet.org.chromium.base.metrics.a$b */
    static abstract class AbstractC87471b {

        /* renamed from: a */
        public static final List<AbstractC87471b> f198398a = new ArrayList();

        /* renamed from: d */
        static final /* synthetic */ boolean f198399d = true;

        /* renamed from: b */
        protected final String f198400b;

        /* renamed from: c */
        protected boolean f198401c;

        static {
            Covode.recordClassIndex(103415);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo141536a() {
            if (!f198399d && !Thread.holdsLock(f198398a)) {
                throw new AssertionError();
            } else if (!this.f198401c) {
                f198398a.add(this);
                this.f198401c = true;
            }
        }

        protected AbstractC87471b(String str) {
            this.f198400b = str;
        }
    }

    /* renamed from: com.ttnet.org.chromium.base.metrics.a$a */
    public static class C87470a extends AbstractC87471b {

        /* renamed from: e */
        private final List<Boolean> f198397e = new ArrayList();

        static {
            Covode.recordClassIndex(103414);
        }

        public C87470a(String str) {
            super(str);
        }

        /* renamed from: a */
        public final void mo141535a(boolean z) {
            MethodCollector.m26663i(10301);
            synchronized (AbstractC87471b.f198398a) {
                try {
                    if (LibraryLoader.f198372b.f198375c) {
                        RecordHistogram.m151816a(this.f198400b, z);
                    } else {
                        this.f198397e.add(Boolean.valueOf(z));
                        mo141536a();
                    }
                } finally {
                    MethodCollector.m26664o(10301);
                }
            }
        }
    }

    /* renamed from: com.ttnet.org.chromium.base.metrics.a$c */
    public static class C87472c extends AbstractC87471b {

        /* renamed from: e */
        private final List<Integer> f198402e = new ArrayList();

        /* renamed from: f */
        private final int f198403f = 2;

        static {
            Covode.recordClassIndex(103416);
        }

        public C87472c(String str) {
            super(str);
        }
    }
}
