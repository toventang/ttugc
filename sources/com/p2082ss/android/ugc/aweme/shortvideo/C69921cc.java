package com.p2082ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cc */
public final class C69921cc {

    /* renamed from: a */
    final C1213t<Integer> f156247a = new C1213t<>();

    /* renamed from: b */
    final C1213t<Integer> f156248b = new C1213t<>();

    /* renamed from: c */
    final C1213t<Bitmap> f156249c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<Bitmap> f156250d = new C1213t<>();

    /* renamed from: e */
    final C1213t<Bitmap> f156251e = new C1213t<>();

    static {
        Covode.recordClassIndex(82330);
    }

    /* renamed from: b */
    public final void mo110330b(Bitmap bitmap) {
        this.f156250d.setValue(bitmap);
    }

    /* renamed from: c */
    public final void mo110331c(Bitmap bitmap) {
        this.f156251e.setValue(bitmap);
    }

    /* renamed from: a */
    public final void mo110328a(int i) {
        this.f156247a.setValue(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo110329a(Bitmap bitmap) {
        C89219l.m154721d(bitmap, "");
        this.f156249c.setValue(bitmap);
    }
}
