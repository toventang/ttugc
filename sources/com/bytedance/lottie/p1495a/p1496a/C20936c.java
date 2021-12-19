package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20969o;
import com.bytedance.lottie.p1499c.AbstractC21034f;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1500a.C20988l;
import com.bytedance.lottie.p1499c.p1501b.AbstractC20993b;
import com.bytedance.lottie.p1499c.p1501b.C21008n;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.c */
public final class C20936c implements AbstractC20937d, AbstractC20946l, AbstractC20954a.AbstractC20955a, AbstractC21034f {

    /* renamed from: a */
    private final Matrix f49550a;

    /* renamed from: b */
    private final Path f49551b;

    /* renamed from: c */
    private final RectF f49552c;

    /* renamed from: d */
    private final String f49553d;

    /* renamed from: e */
    private final List<AbstractC20935b> f49554e;

    /* renamed from: f */
    private final C21106i f49555f;

    /* renamed from: g */
    private List<AbstractC20946l> f49556g;

    /* renamed from: h */
    private C20969o f49557h;

    static {
        Covode.recordClassIndex(24552);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49553d;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49555f.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Matrix mo34459d() {
        C20969o oVar = this.f49557h;
        if (oVar != null) {
            return oVar.mo34471a();
        }
        this.f49550a.reset();
        return this.f49550a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List<AbstractC20946l> mo34458c() {
        if (this.f49556g == null) {
            this.f49556g = new ArrayList();
            for (int i = 0; i < this.f49554e.size(); i++) {
                AbstractC20935b bVar = this.f49554e.get(i);
                if (bVar instanceof AbstractC20946l) {
                    this.f49556g.add(bVar);
                }
            }
        }
        return this.f49556g;
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20946l
    /* renamed from: e */
    public final Path mo34460e() {
        this.f49550a.reset();
        C20969o oVar = this.f49557h;
        if (oVar != null) {
            this.f49550a.set(oVar.mo34471a());
        }
        this.f49551b.reset();
        for (int size = this.f49554e.size() - 1; size >= 0; size--) {
            AbstractC20935b bVar = this.f49554e.get(size);
            if (bVar instanceof AbstractC20946l) {
                this.f49551b.addPath(((AbstractC20946l) bVar).mo34460e(), this.f49550a);
            }
        }
        return this.f49551b;
    }

    /* renamed from: a */
    private static C20988l m39415a(List<AbstractC20993b> list) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC20993b bVar = list.get(i);
            if (bVar instanceof C20988l) {
                return (C20988l) bVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        C20969o oVar = this.f49557h;
        if (oVar != null) {
            oVar.mo34475a(t, cVar);
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34453a(RectF rectF, Matrix matrix) {
        this.f49550a.set(matrix);
        C20969o oVar = this.f49557h;
        if (oVar != null) {
            this.f49550a.preConcat(oVar.mo34471a());
        }
        this.f49552c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f49554e.size() - 1; size >= 0; size--) {
            AbstractC20935b bVar = this.f49554e.get(size);
            if (bVar instanceof AbstractC20937d) {
                ((AbstractC20937d) bVar).mo34453a(this.f49552c, this.f49550a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f49552c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f49552c.left), Math.min(rectF.top, this.f49552c.top), Math.max(rectF.right, this.f49552c.right), Math.max(rectF.bottom, this.f49552c.bottom));
                }
            }
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f49554e.size());
        arrayList.addAll(list);
        for (int size = this.f49554e.size() - 1; size >= 0; size--) {
            AbstractC20935b bVar = this.f49554e.get(size);
            bVar.mo34456a(arrayList, this.f49554e.subList(0, size));
            arrayList.add(bVar);
        }
    }

    public C20936c(C21106i iVar, AbstractC21017a aVar, C21008n nVar) {
        this(iVar, aVar, nVar.f49800a, m39416a(iVar, aVar, nVar.f49801b), m39415a(nVar.f49801b));
    }

    /* renamed from: a */
    private static List<AbstractC20935b> m39416a(C21106i iVar, AbstractC21017a aVar, List<AbstractC20993b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            AbstractC20935b a = list.get(i).mo34483a(iVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34452a(Canvas canvas, Matrix matrix, int i) {
        this.f49550a.set(matrix);
        C20969o oVar = this.f49557h;
        if (oVar != null) {
            this.f49550a.preConcat(oVar.mo34471a());
            i = (int) ((((((float) this.f49557h.f49690e.mo34470d().intValue()) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
        }
        for (int size = this.f49554e.size() - 1; size >= 0; size--) {
            AbstractC20935b bVar = this.f49554e.get(size);
            if (bVar instanceof AbstractC20937d) {
                ((AbstractC20937d) bVar).mo34452a(canvas, this.f49550a, i);
            }
        }
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final void mo34454a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        if (eVar.mo34505a(this.f49553d, i)) {
            if (!"__container".equals(this.f49553d)) {
                eVar2 = eVar2.mo34504a(this.f49553d);
                if (eVar.mo34507c(this.f49553d, i)) {
                    list.add(eVar2.mo34503a(this));
                }
            }
            if (eVar.mo34508d(this.f49553d, i)) {
                int b = i + eVar.mo34506b(this.f49553d, i);
                for (int i2 = 0; i2 < this.f49554e.size(); i2++) {
                    AbstractC20935b bVar = this.f49554e.get(i2);
                    if (bVar instanceof AbstractC21034f) {
                        ((AbstractC21034f) bVar).mo34454a(eVar, b, list, eVar2);
                    }
                }
            }
        }
    }

    C20936c(C21106i iVar, AbstractC21017a aVar, String str, List<AbstractC20935b> list, C20988l lVar) {
        this.f49550a = new Matrix();
        this.f49551b = new Path();
        this.f49552c = new RectF();
        this.f49553d = str;
        this.f49555f = iVar;
        this.f49554e = list;
        if (lVar != null) {
            C20969o a = lVar.mo34484a();
            this.f49557h = a;
            a.mo34474a(aVar);
            this.f49557h.mo34473a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC20935b bVar = list.get(size);
            if (bVar instanceof AbstractC20942i) {
                arrayList.add(bVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((AbstractC20942i) arrayList.get(size2)).mo34461a(list.listIterator(list.size()));
        }
    }
}
