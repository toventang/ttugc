package com.facebook.drawee.view;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.drawee.p1850b.C24192b;
import com.facebook.drawee.p1854e.AbstractC24244t;
import com.facebook.drawee.p1854e.AbstractC24245u;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.p1857h.AbstractC24256b;

/* renamed from: com.facebook.drawee.view.b */
public class C24261b<DH extends AbstractC24256b> implements AbstractC24245u {

    /* renamed from: a */
    public boolean f57518a;

    /* renamed from: b */
    public AbstractC24255a f57519b;

    /* renamed from: c */
    public final C24192b f57520c = C24192b.m45880a();

    /* renamed from: d */
    private boolean f57521d;

    /* renamed from: e */
    private boolean f57522e = true;

    /* renamed from: f */
    private DH f57523f;

    static {
        Covode.recordClassIndex(28393);
    }

    /* renamed from: e */
    public final boolean mo40007e() {
        if (this.f57523f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m46097g() {
        AbstractC24255a aVar = this.f57519b;
        if (aVar == null || aVar.mo39817e() != this.f57523f) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m46100j() {
        if (!this.f57518a || !this.f57522e) {
            m46099i();
        } else {
            m46098h();
        }
    }

    /* renamed from: b */
    public void mo40003b() {
        this.f57520c.mo39804a(C24192b.EnumC24193a.ON_HOLDER_ATTACH);
        this.f57518a = true;
        m46100j();
    }

    /* renamed from: c */
    public void mo40005c() {
        this.f57520c.mo39804a(C24192b.EnumC24193a.ON_HOLDER_DETACH);
        this.f57518a = false;
        m46100j();
    }

    /* renamed from: d */
    public final DH mo40006d() {
        return (DH) ((AbstractC24256b) C24091i.m45617a(this.f57523f));
    }

    /* renamed from: f */
    public Drawable mo40008f() {
        DH dh = this.f57523f;
        if (dh == null) {
            return null;
        }
        return dh.mo39950a();
    }

    /* renamed from: h */
    private void m46098h() {
        if (!this.f57521d) {
            this.f57520c.mo39804a(C24192b.EnumC24193a.ON_ATTACH_CONTROLLER);
            this.f57521d = true;
            AbstractC24255a aVar = this.f57519b;
            if (aVar != null && aVar.mo39817e() != null) {
                this.f57519b.mo39818f();
            }
        }
    }

    /* renamed from: i */
    private void m46099i() {
        if (this.f57521d) {
            this.f57520c.mo39804a(C24192b.EnumC24193a.ON_DETACH_CONTROLLER);
            this.f57521d = false;
            if (m46097g()) {
                this.f57519b.mo39819g();
            }
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24245u
    /* renamed from: a */
    public final void mo39948a() {
        if (!this.f57521d) {
            C24099a.m45649b(C24192b.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f57519b)), toString());
            this.f57518a = true;
            this.f57522e = true;
            m46100j();
        }
    }

    public String toString() {
        return C24088h.m45610a(this).mo39648a("controllerAttached", this.f57521d).mo39648a("holderAttached", this.f57518a).mo39648a("drawableVisible", this.f57522e).mo39647a("events", this.f57520c.toString()).toString();
    }

    /* renamed from: a */
    public static <DH extends AbstractC24256b> C24261b<DH> m46095a(DH dh) {
        return new C24261b<>(dh);
    }

    /* renamed from: a */
    private void m46096a(AbstractC24245u uVar) {
        Drawable f = mo40008f();
        if (f instanceof AbstractC24244t) {
            ((AbstractC24244t) f).mo39947a(uVar);
        }
    }

    public C24261b(DH dh) {
        if (dh != null) {
            mo40004b(dh);
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24245u
    /* renamed from: a */
    public final void mo39949a(boolean z) {
        C24192b.EnumC24193a aVar;
        if (this.f57522e != z) {
            C24192b bVar = this.f57520c;
            if (z) {
                aVar = C24192b.EnumC24193a.ON_DRAWABLE_SHOW;
            } else {
                aVar = C24192b.EnumC24193a.ON_DRAWABLE_HIDE;
            }
            bVar.mo39804a(aVar);
            this.f57522e = z;
            m46100j();
        }
    }

    /* renamed from: b */
    public final void mo40004b(DH dh) {
        boolean z;
        this.f57520c.mo39804a(C24192b.EnumC24193a.ON_SET_HIERARCHY);
        boolean g = m46097g();
        m46096a((AbstractC24245u) null);
        DH dh2 = (DH) ((AbstractC24256b) C24091i.m45617a(dh));
        this.f57523f = dh2;
        Drawable a = dh2.mo39950a();
        if (a == null || a.isVisible()) {
            z = true;
        } else {
            z = false;
        }
        mo39949a(z);
        m46096a(this);
        if (g) {
            this.f57519b.mo39783a(dh);
        }
    }

    /* renamed from: a */
    public final void mo40001a(AbstractC24255a aVar) {
        boolean z = this.f57521d;
        if (z) {
            m46099i();
        }
        if (m46097g()) {
            this.f57520c.mo39804a(C24192b.EnumC24193a.ON_CLEAR_OLD_CONTROLLER);
            this.f57519b.mo39783a((AbstractC24256b) null);
        }
        this.f57519b = aVar;
        if (aVar != null) {
            this.f57520c.mo39804a(C24192b.EnumC24193a.ON_SET_CONTROLLER);
            this.f57519b.mo39783a(this.f57523f);
        } else {
            this.f57520c.mo39804a(C24192b.EnumC24193a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m46098h();
        }
    }

    /* renamed from: a */
    public final boolean mo40002a(MotionEvent motionEvent) {
        if (!m46097g()) {
            return false;
        }
        return this.f57519b.mo39812a(motionEvent);
    }
}
