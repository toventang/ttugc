package androidx.recyclerview.widget;

import androidx.core.p036g.C0697g;
import androidx.recyclerview.widget.AbstractC1395ad;
import androidx.recyclerview.widget.AbstractC1409ag;
import androidx.recyclerview.widget.C1428g;
import androidx.recyclerview.widget.C1486v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
final class C1432h implements C1486v.AbstractC1488a {

    /* renamed from: a */
    final AbstractC1409ag f4700a;

    /* renamed from: b */
    List<WeakReference<RecyclerView>> f4701b = new ArrayList();

    /* renamed from: c */
    final IdentityHashMap<RecyclerView.ViewHolder, C1486v> f4702c = new IdentityHashMap<>();

    /* renamed from: d */
    List<C1486v> f4703d = new ArrayList();

    /* renamed from: e */
    private final C1428g f4704e;

    /* renamed from: f */
    private C1433a f4705f = new C1433a();

    /* renamed from: g */
    private final C1428g.C1429a.EnumC1431b f4706g;

    /* renamed from: h */
    private final AbstractC1395ad f4707h;

    static {
        Covode.recordClassIndex(1570);
    }

    /* renamed from: androidx.recyclerview.widget.h$a */
    static class C1433a {

        /* renamed from: a */
        C1486v f4708a;

        /* renamed from: b */
        int f4709b;

        /* renamed from: c */
        boolean f4710c;

        static {
            Covode.recordClassIndex(1571);
        }

        C1433a() {
        }
    }

    @Override // androidx.recyclerview.widget.C1486v.AbstractC1488a
    /* renamed from: b */
    public final void mo4925b() {
        m4892d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4924a(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        return m4890a(this.f4703d.size(), aVar);
    }

    /* renamed from: d */
    private void m4892d() {
        RecyclerView.AbstractC1350a.EnumC1351a e = m4893e();
        if (e != this.f4704e.mStateRestorationPolicy) {
            this.f4704e.mo4914a(e);
        }
    }

    @Override // androidx.recyclerview.widget.C1486v.AbstractC1488a
    /* renamed from: a */
    public final void mo4920a() {
        this.f4704e.notifyDataSetChanged();
        m4892d();
    }

    /* renamed from: c */
    public final boolean mo4928c() {
        if (this.f4706g != C1428g.C1429a.EnumC1431b.NO_STABLE_IDS) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private RecyclerView.AbstractC1350a.EnumC1351a m4893e() {
        for (C1486v vVar : this.f4703d) {
            RecyclerView.AbstractC1350a.EnumC1351a aVar = vVar.f4926c.mStateRestorationPolicy;
            if (aVar == RecyclerView.AbstractC1350a.EnumC1351a.PREVENT) {
                return RecyclerView.AbstractC1350a.EnumC1351a.PREVENT;
            }
            if (aVar == RecyclerView.AbstractC1350a.EnumC1351a.PREVENT_WHEN_EMPTY && vVar.f4928e == 0) {
                return RecyclerView.AbstractC1350a.EnumC1351a.PREVENT;
            }
        }
        return RecyclerView.AbstractC1350a.EnumC1351a.ALLOW;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo4917a(C1486v vVar) {
        C1486v next;
        Iterator<C1486v> it = this.f4703d.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != vVar) {
            i += next.f4928e;
        }
        return i;
    }

    /* renamed from: b */
    private C1486v m4891b(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        int size = this.f4703d.size();
        for (int i = 0; i < size; i++) {
            if (this.f4703d.get(i).f4926c == aVar) {
                if (i == -1) {
                    return null;
                } else {
                    return this.f4703d.get(i);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1486v mo4919a(RecyclerView.ViewHolder viewHolder) {
        C1486v vVar = this.f4702c.get(viewHolder);
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1433a mo4918a(int i) {
        C1433a aVar;
        if (this.f4705f.f4710c) {
            aVar = new C1433a();
        } else {
            this.f4705f.f4710c = true;
            aVar = this.f4705f;
        }
        Iterator<C1486v> it = this.f4703d.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1486v next = it.next();
            if (next.f4928e > i2) {
                aVar.f4708a = next;
                aVar.f4709b = i2;
                break;
            }
            i2 -= next.f4928e;
        }
        if (aVar.f4708a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for ".concat(String.valueOf(i)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4921a(C1433a aVar) {
        aVar.f4710c = false;
        aVar.f4708a = null;
        aVar.f4709b = -1;
        this.f4705f = aVar;
    }

    C1432h(C1428g gVar, C1428g.C1429a aVar) {
        this.f4704e = gVar;
        if (aVar.f4695a) {
            this.f4700a = new AbstractC1409ag.C1410a();
        } else {
            this.f4700a = new AbstractC1409ag.C1412b();
        }
        this.f4706g = aVar.f4696b;
        if (aVar.f4696b == C1428g.C1429a.EnumC1431b.NO_STABLE_IDS) {
            this.f4707h = new AbstractC1395ad.C1398b();
        } else if (aVar.f4696b == C1428g.C1429a.EnumC1431b.ISOLATED_STABLE_IDS) {
            this.f4707h = new AbstractC1395ad.C1396a();
        } else if (aVar.f4696b == C1428g.C1429a.EnumC1431b.SHARED_STABLE_IDS) {
            this.f4707h = new AbstractC1395ad.C1400c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    /* renamed from: a */
    private boolean m4890a(int i, RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        if (i < 0 || i > this.f4703d.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f4703d.size() + ". Given:" + i);
        }
        if (mo4928c()) {
            C0697g.m2454a(aVar.mHasStableIds, (Object) "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        }
        if (m4891b(aVar) != null) {
            return false;
        }
        C1486v vVar = new C1486v(aVar, this, this.f4700a, this.f4707h.mo4863a());
        this.f4703d.add(i, vVar);
        for (WeakReference<RecyclerView> weakReference : this.f4701b) {
            RecyclerView recyclerView = weakReference.get();
            if (recyclerView != null) {
                aVar.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (vVar.f4928e > 0) {
            this.f4704e.notifyItemRangeInserted(mo4917a(vVar), vVar.f4928e);
        }
        m4892d();
        return true;
    }

    @Override // androidx.recyclerview.widget.C1486v.AbstractC1488a
    /* renamed from: b */
    public final void mo4926b(C1486v vVar, int i, int i2) {
        this.f4704e.notifyItemRangeRemoved(i + mo4917a(vVar), i2);
    }

    @Override // androidx.recyclerview.widget.C1486v.AbstractC1488a
    /* renamed from: c */
    public final void mo4927c(C1486v vVar, int i, int i2) {
        int a = mo4917a(vVar);
        this.f4704e.notifyItemMoved(i + a, i2 + a);
    }

    @Override // androidx.recyclerview.widget.C1486v.AbstractC1488a
    /* renamed from: a */
    public final void mo4922a(C1486v vVar, int i, int i2) {
        this.f4704e.notifyItemRangeInserted(i + mo4917a(vVar), i2);
    }

    @Override // androidx.recyclerview.widget.C1486v.AbstractC1488a
    /* renamed from: a */
    public final void mo4923a(C1486v vVar, int i, int i2, Object obj) {
        this.f4704e.notifyItemRangeChanged(i + mo4917a(vVar), i2, obj);
    }
}
