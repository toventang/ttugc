package androidx.recyclerview.widget;

import androidx.core.p036g.C0693f;
import androidx.p025c.C0489d;
import androidx.p025c.C0497g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.af */
public final class C1406af {

    /* renamed from: a */
    final C0497g<RecyclerView.ViewHolder, C1407a> f4642a = new C0497g<>();

    /* renamed from: b */
    final C0489d<RecyclerView.ViewHolder> f4643b = new C0489d<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.af$b */
    public interface AbstractC1408b {
        static {
            Covode.recordClassIndex(1546);
        }

        /* renamed from: a */
        void mo4534a(RecyclerView.ViewHolder viewHolder);

        /* renamed from: a */
        void mo4535a(RecyclerView.ViewHolder viewHolder, RecyclerView.AbstractC1356f.C1359c cVar, RecyclerView.AbstractC1356f.C1359c cVar2);

        /* renamed from: b */
        void mo4536b(RecyclerView.ViewHolder viewHolder, RecyclerView.AbstractC1356f.C1359c cVar, RecyclerView.AbstractC1356f.C1359c cVar2);

        /* renamed from: c */
        void mo4537c(RecyclerView.ViewHolder viewHolder, RecyclerView.AbstractC1356f.C1359c cVar, RecyclerView.AbstractC1356f.C1359c cVar2);
    }

    static {
        Covode.recordClassIndex(1544);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.af$a */
    public static class C1407a {

        /* renamed from: d */
        static C0693f.AbstractC0694a<C1407a> f4644d = new C0693f.C0695b(20);

        /* renamed from: a */
        int f4645a;

        /* renamed from: b */
        RecyclerView.AbstractC1356f.C1359c f4646b;

        /* renamed from: c */
        RecyclerView.AbstractC1356f.C1359c f4647c;

        private C1407a() {
        }

        static {
            Covode.recordClassIndex(1545);
        }

        /* renamed from: a */
        static C1407a m4820a() {
            C1407a acquire = f4644d.acquire();
            if (acquire == null) {
                return new C1407a();
            }
            return acquire;
        }

        /* renamed from: a */
        static void m4821a(C1407a aVar) {
            aVar.f4645a = 0;
            aVar.f4646b = null;
            aVar.f4647c = null;
            f4644d.release(aVar);
        }
    }

    C1406af() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4872a() {
        this.f4642a.clear();
        this.f4643b.mo2086c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo4870a(long j) {
        return this.f4643b.mo2078a(j, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4879c(RecyclerView.ViewHolder viewHolder) {
        C1407a aVar = this.f4642a.get(viewHolder);
        if (aVar == null) {
            aVar = C1407a.m4820a();
            this.f4642a.put(viewHolder, aVar);
        }
        aVar.f4645a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4881d(RecyclerView.ViewHolder viewHolder) {
        C1407a aVar = this.f4642a.get(viewHolder);
        if (aVar != null) {
            aVar.f4645a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo4878b(RecyclerView.ViewHolder viewHolder) {
        C1407a aVar = this.f4642a.get(viewHolder);
        if (aVar == null || (aVar.f4645a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo4882e(RecyclerView.ViewHolder viewHolder) {
        int b = this.f4643b.mo2080b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (viewHolder == this.f4643b.mo2085c(b)) {
                this.f4643b.mo2079a(b);
                break;
            } else {
                b--;
            }
        }
        C1407a remove = this.f4642a.remove(viewHolder);
        if (remove != null) {
            C1407a.m4821a(remove);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4875a(AbstractC1408b bVar) {
        for (int size = this.f4642a.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder b = this.f4642a.mo2162b(size);
            C1407a d = this.f4642a.mo2167d(size);
            if ((d.f4645a & 3) == 3) {
                bVar.mo4534a(b);
            } else if ((d.f4645a & 1) != 0) {
                if (d.f4646b == null) {
                    bVar.mo4534a(b);
                } else {
                    bVar.mo4535a(b, d.f4646b, d.f4647c);
                }
            } else if ((d.f4645a & 14) == 14) {
                bVar.mo4536b(b, d.f4646b, d.f4647c);
            } else if ((d.f4645a & 12) == 12) {
                bVar.mo4537c(b, d.f4646b, d.f4647c);
            } else if ((d.f4645a & 4) != 0) {
                bVar.mo4535a(b, d.f4646b, null);
            } else if ((d.f4645a & 8) != 0) {
                bVar.mo4536b(b, d.f4646b, d.f4647c);
            }
            C1407a.m4821a(d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4876a(RecyclerView.ViewHolder viewHolder) {
        C1407a aVar = this.f4642a.get(viewHolder);
        if (aVar == null || (aVar.f4645a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4873a(long j, RecyclerView.ViewHolder viewHolder) {
        this.f4643b.mo2083b(j, viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4877b(RecyclerView.ViewHolder viewHolder, RecyclerView.AbstractC1356f.C1359c cVar) {
        C1407a aVar = this.f4642a.get(viewHolder);
        if (aVar == null) {
            aVar = C1407a.m4820a();
            this.f4642a.put(viewHolder, aVar);
        }
        aVar.f4645a |= 2;
        aVar.f4646b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4874a(RecyclerView.ViewHolder viewHolder, RecyclerView.AbstractC1356f.C1359c cVar) {
        C1407a aVar = this.f4642a.get(viewHolder);
        if (aVar == null) {
            aVar = C1407a.m4820a();
            this.f4642a.put(viewHolder, aVar);
        }
        aVar.f4646b = cVar;
        aVar.f4645a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4880c(RecyclerView.ViewHolder viewHolder, RecyclerView.AbstractC1356f.C1359c cVar) {
        C1407a aVar = this.f4642a.get(viewHolder);
        if (aVar == null) {
            aVar = C1407a.m4820a();
            this.f4642a.put(viewHolder, aVar);
        }
        aVar.f4647c = cVar;
        aVar.f4645a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final RecyclerView.AbstractC1356f.C1359c mo4871a(RecyclerView.ViewHolder viewHolder, int i) {
        C1407a c;
        RecyclerView.AbstractC1356f.C1359c cVar;
        int a = this.f4642a.mo2158a(viewHolder);
        if (a < 0 || (c = this.f4642a.mo2163c(a)) == null || (c.f4645a & i) == 0) {
            return null;
        }
        c.f4645a &= i ^ -1;
        if (i == 4) {
            cVar = c.f4646b;
        } else if (i == 8) {
            cVar = c.f4647c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((c.f4645a & 12) == 0) {
            this.f4642a.mo2167d(a);
            C1407a.m4821a(c);
        }
        return cVar;
    }
}
