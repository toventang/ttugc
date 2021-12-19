package com.facebook.drawee.p1845a.p1846a.p1848b;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.common.time.AbstractC24140b;
import com.facebook.drawee.p1845a.p1846a.C24184d;
import com.facebook.drawee.p1845a.p1846a.p1848b.p1849a.C24172a;
import com.facebook.drawee.p1845a.p1846a.p1848b.p1849a.C24173b;
import com.facebook.drawee.p1845a.p1846a.p1848b.p1849a.C24174c;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1857h.AbstractC24257c;
import com.facebook.imagepipeline.p1886k.AbstractC24462c;
import com.facebook.imagepipeline.p1886k.C24460a;
import com.facebook.imagepipeline.p1886k.C24461b;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.drawee.a.a.b.g */
public final class C24180g extends C24460a {

    /* renamed from: a */
    public final C24181h f57189a = new C24181h();

    /* renamed from: b */
    public List<AbstractC24179f> f57190b;

    /* renamed from: c */
    private final C24184d f57191c;

    /* renamed from: d */
    private final AbstractC24140b f57192d;

    /* renamed from: e */
    private C24176c f57193e;

    /* renamed from: f */
    private AbstractC24175b f57194f;

    /* renamed from: g */
    private C24174c f57195g;

    /* renamed from: h */
    private C24172a f57196h;

    /* renamed from: i */
    private C24461b f57197i;

    /* renamed from: j */
    private boolean f57198j;

    static {
        Covode.recordClassIndex(28311);
    }

    /* renamed from: a */
    private void m45833a() {
        if (this.f57196h == null) {
            this.f57196h = new C24172a(this.f57192d, this.f57189a, this);
        }
        if (this.f57195g == null) {
            this.f57195g = new C24174c(this.f57192d, this.f57189a);
        }
        if (this.f57194f == null) {
            this.f57194f = new C24173b(this.f57189a, this);
        }
        C24176c cVar = this.f57193e;
        if (cVar == null) {
            this.f57193e = new C24176c(this.f57191c.f57279k, this.f57194f);
        } else {
            cVar.f57168a = this.f57191c.f57279k;
        }
        if (this.f57197i == null) {
            this.f57197i = new C24461b(this.f57195g, this.f57193e);
        }
    }

    /* renamed from: a */
    public final void mo39772a(C24181h hVar) {
        List<AbstractC24179f> list;
        if (this.f57198j && (list = this.f57190b) != null && !list.isEmpty()) {
            hVar.mo39775a();
            Iterator<AbstractC24179f> it = this.f57190b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public final void mo39774a(boolean z) {
        this.f57198j = z;
        if (z) {
            m45833a();
            AbstractC24175b bVar = this.f57194f;
            if (bVar != null) {
                this.f57191c.mo39781a(bVar);
            }
            C24172a aVar = this.f57196h;
            if (aVar != null) {
                this.f57191c.mo39808a((AbstractC24203d) aVar);
            }
            C24461b bVar2 = this.f57197i;
            if (bVar2 != null) {
                this.f57191c.mo39784a((AbstractC24462c) bVar2);
                return;
            }
            return;
        }
        AbstractC24175b bVar3 = this.f57194f;
        if (bVar3 != null) {
            this.f57191c.mo39789b(bVar3);
        }
        C24172a aVar2 = this.f57196h;
        if (aVar2 != null) {
            this.f57191c.mo39815b((AbstractC24203d) aVar2);
        }
        C24461b bVar4 = this.f57197i;
        if (bVar4 != null) {
            this.f57191c.mo39790b((AbstractC24462c) bVar4);
        }
    }

    public C24180g(AbstractC24140b bVar, C24184d dVar) {
        this.f57192d = bVar;
        this.f57191c = dVar;
    }

    /* renamed from: a */
    public final void mo39773a(C24181h hVar, int i) {
        List<AbstractC24179f> list;
        AbstractC24257c cVar;
        hVar.f57215q = i;
        if (this.f57198j && (list = this.f57190b) != null && !list.isEmpty()) {
            if (!(i != 3 || (cVar = this.f57191c.f57277i) == null || cVar.mo39950a() == null)) {
                Rect bounds = cVar.mo39950a().getBounds();
                this.f57189a.f57213o = bounds.width();
                this.f57189a.f57214p = bounds.height();
            }
            hVar.mo39775a();
            Iterator<AbstractC24179f> it = this.f57190b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
