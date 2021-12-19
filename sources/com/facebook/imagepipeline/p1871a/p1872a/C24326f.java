package com.facebook.imagepipeline.p1871a.p1872a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.a.a.f */
public final class C24326f {

    /* renamed from: a */
    public final AbstractC24323c f57685a;

    /* renamed from: b */
    public C24117a<Bitmap> f57686b;

    /* renamed from: c */
    List<C24117a<Bitmap>> f57687c;

    /* renamed from: d */
    public int f57688d;

    static {
        Covode.recordClassIndex(28468);
    }

    /* renamed from: a */
    public final C24325e mo40129a() {
        try {
            return new C24325e(this);
        } finally {
            C24117a.m45712c(this.f57686b);
            this.f57686b = null;
            C24117a.m45709a((Iterable<? extends C24117a<?>>) this.f57687c);
            this.f57687c = null;
        }
    }

    public C24326f(AbstractC24323c cVar) {
        this.f57685a = cVar;
    }

    /* renamed from: a */
    public final C24326f mo40130a(List<C24117a<Bitmap>> list) {
        this.f57687c = C24117a.m45708a((Collection) list);
        return this;
    }
}
