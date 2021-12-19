package com.bytedance.webx.p1764h.p1767c;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.p1764h.p1765a.AbstractC23621c;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.webx.h.c.a */
public final class C23625a {

    /* renamed from: a */
    public String f55904a;

    /* renamed from: b */
    public final List<SoftReference<WebView>> f55905b;

    /* renamed from: c */
    public AbstractC23621c f55906c;

    /* renamed from: d */
    public int f55907d;

    /* renamed from: e */
    public boolean f55908e;

    static {
        Covode.recordClassIndex(27724);
    }

    /* renamed from: com.bytedance.webx.h.c.a$a */
    public static class C23626a {

        /* renamed from: a */
        AbstractC23621c f55909a;

        /* renamed from: b */
        int f55910b;

        /* renamed from: c */
        boolean f55911c;

        static {
            Covode.recordClassIndex(27725);
        }

        /* renamed from: a */
        public final C23625a mo39045a() {
            return new C23625a(this, (byte) 0);
        }

        /* renamed from: a */
        public final C23626a mo39042a(int i) {
            this.f55910b = i;
            return this;
        }

        /* renamed from: a */
        public final C23626a mo39043a(AbstractC23621c cVar) {
            this.f55909a = cVar;
            return this;
        }

        /* renamed from: a */
        public final C23626a mo39044a(boolean z) {
            this.f55911c = z;
            return this;
        }
    }

    private C23625a(C23626a aVar) {
        this.f55905b = new ArrayList();
        this.f55906c = aVar.f55909a;
        this.f55907d = aVar.f55910b;
        this.f55908e = aVar.f55911c;
    }

    /* synthetic */ C23625a(C23626a aVar, byte b) {
        this(aVar);
    }
}
