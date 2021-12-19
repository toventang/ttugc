package com.facebook.drawee.p1845a.p1846a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24219i;
import com.facebook.imagepipeline.p1883h.AbstractC24450a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1891p.C24644b;

/* renamed from: com.facebook.drawee.a.a.a */
public final class C24168a implements AbstractC24450a {

    /* renamed from: a */
    private final Resources f57154a;

    /* renamed from: b */
    private final AbstractC24450a f57155b;

    static {
        Covode.recordClassIndex(28299);
    }

    @Override // com.facebook.imagepipeline.p1883h.AbstractC24450a
    /* renamed from: a */
    public final boolean mo39767a(AbstractC24454c cVar) {
        return true;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.p1883h.AbstractC24450a
    /* renamed from: b */
    public final Drawable mo39768b(AbstractC24454c cVar) {
        boolean z;
        try {
            C24644b.m47156a();
            if (cVar instanceof C24455d) {
                C24455d dVar = (C24455d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f57154a, dVar.f58089a);
                boolean z2 = false;
                if (dVar.f58090b == 0 || dVar.f58090b == -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (!(dVar.f58091c == 1 || dVar.f58091c == 0)) {
                        z2 = true;
                    }
                    if (!z2) {
                        C24644b.m47156a();
                        return bitmapDrawable;
                    }
                }
                C24219i iVar = new C24219i(bitmapDrawable, dVar.f58090b, dVar.f58091c);
                C24644b.m47156a();
                return iVar;
            }
            AbstractC24450a aVar = this.f57155b;
            if (aVar == null || !aVar.mo39767a(cVar)) {
                C24644b.m47156a();
                return null;
            }
            Drawable b = this.f57155b.mo39768b(cVar);
            C24644b.m47156a();
            return b;
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }

    public C24168a(Resources resources, AbstractC24450a aVar) {
        this.f57154a = resources;
        this.f57155b = aVar;
    }
}
