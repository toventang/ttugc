package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58865n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.s */
public final class C58872s implements C58865n.AbstractC58867b {

    /* renamed from: a */
    public final int f134030a;

    /* renamed from: b */
    public final int f134031b;

    /* renamed from: c */
    public String f134032c = "TextureQueue";

    /* renamed from: d */
    private final int f134033d;

    /* renamed from: e */
    private final boolean f134034e;

    /* renamed from: f */
    private List<AbstractC58858h> f134035f;

    /* renamed from: g */
    private List<AbstractC58858h> f134036g;

    static {
        Covode.recordClassIndex(69186);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.s$a */
    public static class C58873a extends C58865n implements C58865n.AbstractC58867b {
        static {
            Covode.recordClassIndex(69187);
        }

        @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58865n
        /* renamed from: e */
        public final void mo96296e() {
            super.mo96296e();
        }

        @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58865n.AbstractC58867b
        /* renamed from: a */
        public final void mo96297a(AbstractC58858h hVar) {
            this.f134001a = null;
        }

        private C58873a(int i, int i2, int i3, C58865n.AbstractC58867b bVar) {
            super(i, i2, i3, bVar);
        }

        /* renamed from: a */
        public static AbstractC58858h m108160a(int i, int i2, int i3, C58865n.AbstractC58867b bVar) {
            return new C58873a(i3, i, i2, bVar);
        }
    }

    /* renamed from: b */
    public final void mo96304b() {
        MethodCollector.m26663i(7497);
        synchronized (this) {
            try {
                m108156a(this.f134035f);
                m108156a(this.f134036g);
                synchronized (this.f134035f) {
                    try {
                        Iterator<AbstractC58858h> it = this.f134035f.iterator();
                        while (it.hasNext()) {
                            ((C58873a) it.next()).mo96296e();
                        }
                        this.f134035f.clear();
                    } finally {
                        MethodCollector.m26664o(7497);
                    }
                }
                synchronized (this.f134036g) {
                    try {
                        this.f134036g.clear();
                        this.f134036g.notifyAll();
                    } finally {
                        MethodCollector.m26664o(7497);
                    }
                }
            } finally {
                MethodCollector.m26664o(7497);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008a, code lost:
        if (r6 == null) goto L_0x008f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074 A[Catch:{ all -> 0x007e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58858h mo96303a() {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58872s.mo96303a():com.ss.android.ugc.aweme.livewallpaper.c.h");
    }

    /* renamed from: a */
    private static int m108156a(List<AbstractC58858h> list) {
        int size;
        MethodCollector.m26663i(7195);
        synchronized (list) {
            try {
                size = list.size();
            } finally {
                MethodCollector.m26664o(7195);
            }
        }
        return size;
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58865n.AbstractC58867b
    /* renamed from: a */
    public final void mo96297a(AbstractC58858h hVar) {
        MethodCollector.m26663i(7671);
        synchronized (this.f134036g) {
            try {
                this.f134036g.add(hVar);
                this.f134036g.notifyAll();
            } finally {
                MethodCollector.m26664o(7671);
            }
        }
    }

    public C58872s(int i, int i2, int i3) {
        this.f134030a = i2;
        this.f134031b = i3;
        this.f134033d = i;
        this.f134034e = false;
        this.f134035f = new ArrayList();
        this.f134036g = new ArrayList();
    }
}
