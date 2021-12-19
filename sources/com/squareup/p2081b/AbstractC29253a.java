package com.squareup.p2081b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.C29299t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.a */
public abstract class AbstractC29253a<T> {

    /* renamed from: a */
    public final C29299t f69374a;

    /* renamed from: b */
    public final C29312w f69375b;

    /* renamed from: c */
    final WeakReference<T> f69376c;

    /* renamed from: d */
    final boolean f69377d;

    /* renamed from: e */
    public final int f69378e;

    /* renamed from: f */
    public final int f69379f;

    /* renamed from: g */
    final int f69380g;

    /* renamed from: h */
    final Drawable f69381h;

    /* renamed from: i */
    public final String f69382i;

    /* renamed from: j */
    public final Object f69383j;

    /* renamed from: k */
    public boolean f69384k;

    /* renamed from: l */
    public boolean f69385l;

    static {
        Covode.recordClassIndex(35602);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo51046a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo51047a(Bitmap bitmap, C29299t.EnumC29305d dVar);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51048b() {
        this.f69385l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final T mo51049c() {
        WeakReference<T> weakReference = this.f69376c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: com.squareup.b.a$a */
    static class C29254a<M> extends WeakReference<M> {

        /* renamed from: a */
        final AbstractC29253a f69386a;

        static {
            Covode.recordClassIndex(35603);
        }

        public C29254a(AbstractC29253a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f69386a = aVar;
        }
    }

    AbstractC29253a(C29299t tVar, T t, C29312w wVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        C29254a aVar;
        this.f69374a = tVar;
        this.f69375b = wVar;
        if (t == null) {
            aVar = null;
        } else {
            aVar = new C29254a(this, t, tVar.f69523j);
        }
        this.f69376c = aVar;
        this.f69378e = i;
        this.f69379f = i2;
        this.f69377d = z;
        this.f69380g = i3;
        this.f69381h = drawable;
        this.f69382i = str;
        this.f69383j = obj == null ? this : obj;
    }
}
