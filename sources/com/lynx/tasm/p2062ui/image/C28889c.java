package com.lynx.tasm.p2062ui.image;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.view.C24261b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a;
import com.lynx.tasm.p2062ui.image.p2063a.C28875d;
import com.lynx.tasm.p2062ui.image.p2064b.C28884b;

/* renamed from: com.lynx.tasm.ui.image.c */
public final class C28889c extends AbstractC28676a {

    /* renamed from: f */
    private Drawable f68259f;

    /* renamed from: g */
    private final AbstractC24198b f68260g;

    /* renamed from: h */
    private final C24261b<C24246a> f68261h;

    /* renamed from: i */
    private final Object f68262i = null;

    /* renamed from: j */
    private final C24202c f68263j;

    /* renamed from: k */
    private Uri f68264k;

    /* renamed from: l */
    private C24229q.AbstractC24231b f68265l;

    static {
        Covode.recordClassIndex(35012);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a
    /* renamed from: a */
    public final Drawable mo49742a() {
        return this.f68259f;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a
    /* renamed from: b */
    public final void mo49744b() {
        this.f68261h.mo40005c();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a
    /* renamed from: c */
    public final void mo49745c() {
        this.f68261h.mo40005c();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a
    /* renamed from: d */
    public final void mo49746d() {
        this.f68261h.mo40003b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a
    /* renamed from: e */
    public final void mo49748e() {
        this.f68261h.mo40003b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a
    /* renamed from: a */
    public final void mo49743a(Drawable.Callback callback) {
        super.mo49743a(callback);
        if (callback != null && this.f68259f == null) {
            C24639c a = C24639c.m47149a(this.f68264k);
            C28884b.m57860a(a);
            AbstractC24198b bVar = this.f68260g;
            bVar.mo39825b();
            bVar.f57309m = this.f68261h.f57519b;
            bVar.f57298b = this.f68262i;
            bVar.f57299c = (REQUEST) C28875d.m57840a(a, null);
            bVar.f57303g = this.f68263j;
            this.f68261h.mo40001a(bVar.mo39827e());
            this.f68260g.mo39825b();
            Drawable f = this.f68261h.mo40008f();
            this.f68259f = f;
            if (f != null) {
                f.setBounds(0, 0, this.f67594b, this.f67593a);
                this.f68259f.setCallback(this.f67597e);
                this.f68261h.mo40006d().mo39958a(this.f68265l);
            }
        }
        Drawable drawable = this.f68259f;
        if (drawable != null) {
            drawable.setCallback(callback);
        }
    }

    public C28889c(Resources resources, int i, int i2, int[] iArr, Uri uri, C24229q.AbstractC24231b bVar, AbstractC24198b bVar2, C24202c cVar) {
        super(i, i2, iArr);
        this.f68261h = new C24261b<>(C24247b.m46042a(resources).mo39973a());
        this.f68260g = bVar2;
        this.f68264k = uri == null ? Uri.EMPTY : uri;
        this.f68265l = bVar;
        this.f68263j = cVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f67597e != null) {
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        }
    }
}
