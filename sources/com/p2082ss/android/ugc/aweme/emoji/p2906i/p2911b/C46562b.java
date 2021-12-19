package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a.C46560c;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.b.b */
public final class C46562b {

    /* renamed from: a */
    public static final C46563a f108568a = new C46563a((byte) 0);

    /* renamed from: b */
    private final boolean f108569b;

    /* renamed from: c */
    private final AbstractC89244h f108570c;

    /* renamed from: d */
    private final AbstractC89244h f108571d;

    /* renamed from: e */
    private final C46560c f108572e;

    static {
        Covode.recordClassIndex(55149);
    }

    /* renamed from: a */
    private final LruCache<String, Bitmap> m89859a() {
        return (LruCache) this.f108570c.getValue();
    }

    /* renamed from: b */
    private final HashMap<String, WeakReference<Bitmap>> m89862b() {
        return (HashMap) this.f108571d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.b$a */
    public static final class C46563a {
        static {
            Covode.recordClassIndex(55150);
        }

        private C46563a() {
        }

        public /* synthetic */ C46563a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.b$c */
    static final class C46565c extends AbstractC89220m implements AbstractC89171a<HashMap<String, WeakReference<Bitmap>>> {

        /* renamed from: a */
        public static final C46565c f108574a = new C46565c();

        static {
            Covode.recordClassIndex(55152);
        }

        C46565c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, WeakReference<Bitmap>> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.b$b */
    static final class C46564b extends AbstractC89220m implements AbstractC89171a<LruCache<String, Bitmap>> {

        /* renamed from: a */
        public static final C46564b f108573a = new C46564b();

        static {
            Covode.recordClassIndex(55151);
        }

        C46564b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LruCache<String, Bitmap> invoke() {
            int i;
            if (C62845i.m113257a()) {
                i = 20;
            } else {
                i = 40;
            }
            return new LruCache(i);
        }
    }

    /* renamed from: b */
    private final Bitmap m89861b(String str) {
        Bitmap b = C46566c.m89869b(this.f108572e.getPicFileDirPath(), str);
        if (b != null) {
            m89860a(str, b);
        }
        return b;
    }

    private C46562b(C46560c cVar) {
        this.f108572e = cVar;
        this.f108569b = true;
        this.f108570c = C89250i.m154773a((AbstractC89171a) C46564b.f108573a);
        this.f108571d = C89250i.m154773a((AbstractC89171a) C46565c.f108574a);
    }

    /* renamed from: a */
    private final synchronized Bitmap m89858a(String str) {
        MethodCollector.m26663i(12417);
        if (this.f108569b) {
            Bitmap bitmap = m89859a().get(str);
            MethodCollector.m26664o(12417);
            return bitmap;
        }
        ArrayList<String> arrayList = new ArrayList();
        Bitmap bitmap2 = null;
        for (Map.Entry<String, WeakReference<Bitmap>> entry : m89862b().entrySet()) {
            Bitmap bitmap3 = entry.getValue().get();
            if (bitmap3 == null) {
                arrayList.add(entry.getKey());
            } else if (C89219l.m154714a((Object) str, (Object) entry.getKey())) {
                bitmap2 = bitmap3;
            }
        }
        for (String str2 : arrayList) {
            m89862b().remove(str2);
        }
        MethodCollector.m26664o(12417);
        return bitmap2;
    }

    public /* synthetic */ C46562b(C46560c cVar, byte b) {
        this(cVar);
    }

    /* renamed from: a */
    public final Bitmap mo79167a(String str, boolean z) {
        if (str == null) {
            return null;
        }
        Bitmap a = m89858a(str);
        if (a != null) {
            return a;
        }
        if (z) {
            return m89861b(str);
        }
        return null;
    }

    /* renamed from: a */
    private final synchronized void m89860a(String str, Bitmap bitmap) {
        MethodCollector.m26663i(12419);
        if (this.f108569b) {
            m89859a().put(str, bitmap);
            MethodCollector.m26664o(12419);
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, WeakReference<Bitmap>> entry : m89862b().entrySet()) {
            if (entry.getValue().get() == null) {
                arrayList.add(entry.getKey());
            }
        }
        for (String str2 : arrayList) {
            m89862b().remove(str2);
        }
        m89862b().put(str, new WeakReference<>(bitmap));
        MethodCollector.m26664o(12419);
    }
}
