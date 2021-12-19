package com.facebook.drawee.p1845a.p1846a.p1848b.p1849a;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.time.AbstractC24140b;
import com.facebook.drawee.p1845a.p1846a.p1848b.C24180g;
import com.facebook.drawee.p1845a.p1846a.p1848b.C24181h;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;

/* renamed from: com.facebook.drawee.a.a.b.a.a */
public final class C24172a extends C24202c<AbstractC24457f> {

    /* renamed from: a */
    private final AbstractC24140b f57161a;

    /* renamed from: b */
    private final C24181h f57162b;

    /* renamed from: c */
    private final C24180g f57163c;

    static {
        Covode.recordClassIndex(28303);
    }

    /* renamed from: a */
    private void m45829a(long j) {
        this.f57162b.mo39776a(false);
        this.f57162b.f57218t = j;
        this.f57163c.mo39772a(this.f57162b);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final void onRelease(String str) {
        super.onRelease(str);
        long now = this.f57161a.now();
        int i = this.f57162b.f57215q;
        if (!(i == 3 || i == 5)) {
            this.f57162b.f57208j = now;
            this.f57162b.f57199a = str;
            this.f57163c.mo39773a(this.f57162b, 4);
        }
        m45829a(now);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final void onFailure(String str, Throwable th) {
        long now = this.f57161a.now();
        this.f57162b.f57207i = now;
        this.f57162b.f57199a = str;
        this.f57163c.mo39773a(this.f57162b, 5);
        m45829a(now);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        this.f57162b.f57205g = this.f57161a.now();
        this.f57162b.f57199a = str;
        this.f57162b.f57203e = fVar;
        this.f57163c.mo39773a(this.f57162b, 2);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final void onSubmit(String str, Object obj) {
        long now = this.f57161a.now();
        this.f57162b.f57204f = now;
        this.f57162b.f57199a = str;
        this.f57162b.f57202d = obj;
        this.f57163c.mo39773a(this.f57162b, 0);
        this.f57162b.mo39776a(true);
        this.f57162b.f57217s = now;
        this.f57163c.mo39772a(this.f57162b);
    }

    public C24172a(AbstractC24140b bVar, C24181h hVar, C24180g gVar) {
        this.f57161a = bVar;
        this.f57162b = hVar;
        this.f57163c = gVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
        long now = this.f57161a.now();
        this.f57162b.f57206h = now;
        this.f57162b.f57210l = now;
        this.f57162b.f57199a = str;
        this.f57162b.f57203e = fVar;
        this.f57163c.mo39773a(this.f57162b, 3);
    }
}
