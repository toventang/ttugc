package com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.AbstractC44487c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.a.b */
final /* synthetic */ class C44486b implements AbstractC34583a {

    /* renamed from: a */
    private final C44484a f103705a;

    /* renamed from: b */
    private final AbstractC44487c.AbstractC44489b f103706b;

    static {
        Covode.recordClassIndex(52834);
    }

    C44486b(C44484a aVar, AbstractC44487c.AbstractC44489b bVar) {
        this.f103705a = aVar;
        this.f103706b = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a
    /* renamed from: a */
    public final void mo61039a(Object obj) {
        AbstractC44487c.AbstractC44489b bVar = this.f103706b;
        Bitmap bitmap = (Bitmap) obj;
        if (bVar == null) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            bVar.mo75487a(null);
        } else {
            bVar.mo75487a(new BitmapDrawable(C44484a.m87169a(bitmap)));
        }
    }
}
