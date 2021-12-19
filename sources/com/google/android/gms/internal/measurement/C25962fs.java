package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.fs */
final class C25962fs implements AbstractC26081jt {

    /* renamed from: a */
    private final AbstractC25958fq f61147a;

    static {
        Covode.recordClassIndex(31377);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final int mo42528a() {
        return AbstractC25981gj.C25986e.f61252j;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42542a(int i, boolean z) {
        this.f61147a.mo42507a(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42538a(int i, String str) {
        this.f61147a.mo42506a(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42541a(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC25958fq.m50393l(list.get(i4).intValue());
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42498a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42517b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42539a(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof AbstractC26005hb) {
            AbstractC26005hb hbVar = (AbstractC26005hb) list;
            while (i2 < list.size()) {
                Object b = hbVar.mo42652b(i2);
                if (b instanceof String) {
                    this.f61147a.mo42506a(i, (String) b);
                } else {
                    this.f61147a.mo42503a(i, (AbstractC25943fb) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42506a(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42540a(int i, List<?> list, AbstractC26041ik ikVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo42537a(i, list.get(i2), ikVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42529a(int i) {
        this.f61147a.mo42501a(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: b */
    public final void mo42543b(int i) {
        this.f61147a.mo42501a(i, 4);
    }

    C25962fs(AbstractC25958fq fqVar) {
        AbstractC25958fq fqVar2 = (AbstractC25958fq) C25989gm.m50601a((Object) fqVar, "output");
        this.f61147a = fqVar2;
        fqVar2.f61141a = this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: c */
    public final void mo42550c(int i, int i2) {
        this.f61147a.mo42517b(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: d */
    public final void mo42553d(int i, int i2) {
        this.f61147a.mo42527e(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: e */
    public final void mo42556e(int i, int i2) {
        this.f61147a.mo42522c(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: f */
    public final void mo42559f(int i, int i2) {
        this.f61147a.mo42526d(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42530a(int i, double d) {
        this.f61147a.mo42499a(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: b */
    public final void mo42544b(int i, int i2) {
        this.f61147a.mo42517b(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: c */
    public final void mo42551c(int i, long j) {
        this.f61147a.mo42502a(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: d */
    public final void mo42554d(int i, long j) {
        this.f61147a.mo42523c(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: e */
    public final void mo42557e(int i, long j) {
        this.f61147a.mo42518b(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42531a(int i, float f) {
        this.f61147a.mo42500a(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: b */
    public final void mo42545b(int i, long j) {
        this.f61147a.mo42523c(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42532a(int i, int i2) {
        this.f61147a.mo42527e(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42533a(int i, long j) {
        this.f61147a.mo42502a(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: b */
    public final void mo42547b(int i, List<AbstractC25943fb> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f61147a.mo42503a(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42534a(int i, AbstractC25943fb fbVar) {
        this.f61147a.mo42503a(i, fbVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42536a(int i, Object obj) {
        if (obj instanceof AbstractC25943fb) {
            this.f61147a.mo42519b(i, (AbstractC25943fb) obj);
        } else {
            this.f61147a.mo42504a(i, (AbstractC26020hq) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: b */
    public final void mo42546b(int i, Object obj, AbstractC26041ik ikVar) {
        AbstractC25958fq fqVar = this.f61147a;
        fqVar.mo42501a(i, 3);
        ikVar.mo42696a(obj, (AbstractC26081jt) fqVar.f61141a);
        fqVar.mo42501a(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: c */
    public final void mo42552c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC25958fq.m50378d(list.get(i4).longValue());
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42508a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42502a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: d */
    public final void mo42555d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC25958fq.m50378d(list.get(i4).longValue());
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42508a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42502a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: e */
    public final void mo42558e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42524c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42523c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: f */
    public final void mo42560f(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42497a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42500a(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: g */
    public final void mo42561g(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42496a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42499a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: h */
    public final void mo42562h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC25958fq.m50393l(list.get(i4).intValue());
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42498a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42517b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: i */
    public final void mo42563i(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42513a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42507a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: j */
    public final void mo42564j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC25958fq.m50394m(list.get(i4).intValue());
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42516b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42522c(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: k */
    public final void mo42565k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42525d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42527e(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: l */
    public final void mo42566l(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42524c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42523c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: m */
    public final void mo42567m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC25958fq.m50394m(AbstractC25958fq.m50395n(list.get(i4).intValue()));
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42521c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42526d(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: n */
    public final void mo42568n(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC25958fq.m50378d(AbstractC25958fq.m50381e(list.get(i4).longValue()));
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42520b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42518b(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: b */
    public final void mo42548b(int i, List<?> list, AbstractC26041ik ikVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo42546b(i, list.get(i2), ikVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final <K, V> void mo42535a(int i, C26015hl<K, V> hlVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f61147a.mo42501a(i, 2);
            this.f61147a.mo42516b(C26012hi.m50657a(hlVar, entry.getKey(), entry.getValue()));
            C26012hi.m50658a(this.f61147a, hlVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: b */
    public final void mo42549b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f61147a.mo42501a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f61147a.mo42516b(i3);
            while (i2 < list.size()) {
                this.f61147a.mo42525d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f61147a.mo42527e(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26081jt
    /* renamed from: a */
    public final void mo42537a(int i, Object obj, AbstractC26041ik ikVar) {
        this.f61147a.mo42505a(i, (AbstractC26020hq) obj, ikVar);
    }
}
