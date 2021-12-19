package com.bytedance.p1782z.p1783a.p1785b.p1788c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p1782z.p1783a.p1785b.AbstractC23729b;
import com.bytedance.p1782z.p1783a.p1790c.C23739c;
import com.bytedance.p1782z.p1783a.p1790c.C23740d;
import com.bytedance.p1782z.p1783a.p1790c.C23741e;
import com.bytedance.p1782z.p1783a.p1790c.C23742f;
import com.bytedance.p1782z.p1783a.p1791d.C23753c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.z.a.b.c.a */
public final class C23731a extends AbstractC23729b {

    /* renamed from: c */
    private boolean f56166c;

    /* renamed from: d */
    private C23741e f56167d = new C23741e();

    /* renamed from: e */
    private C23734d f56168e = new C23734d();

    /* renamed from: f */
    private Map<Long, C23741e> f56169f = new HashMap();

    /* renamed from: g */
    private Map<Long, C23734d> f56170g = new HashMap();

    /* renamed from: h */
    private C23742f f56171h = new C23742f();

    /* renamed from: i */
    private C23732b f56172i = new C23732b();

    /* renamed from: j */
    private C23739c f56173j = new C23739c();

    /* renamed from: k */
    private C23733c f56174k = new C23733c();

    /* renamed from: l */
    private Map<Long, C23740d> f56175l = new HashMap();

    /* renamed from: m */
    private Map<Long, C23735e> f56176m = new HashMap();

    static {
        Covode.recordClassIndex(27836);
    }

    @Override // com.bytedance.p1782z.p1783a.p1785b.AbstractC23729b
    /* renamed from: a */
    public final void mo39176a() {
        if (!this.f56166c) {
            this.f56166c = true;
            mo39178b();
        }
    }

    /* renamed from: b */
    public final void mo39178b() {
        if (this.f56166c) {
            if (this.f56158b.mo39163a().f56115c) {
                m44863e();
            }
            if (this.f56158b.mo39163a().f56114b) {
                m44864f();
            }
        }
    }

    /* renamed from: e */
    private void m44863e() {
        C23732b bVar = (C23732b) this.f56171h.mo39192a();
        C23732b bVar2 = this.f56172i;
        if (bVar2 != null) {
            bVar.f56178b = bVar.mo39181a() - bVar2.mo39181a();
            if (bVar.f56179c == 0) {
                bVar.f56179c = bVar.f56178b;
            }
        }
        long j = bVar.f56178b;
        C23733c cVar = (C23733c) this.f56173j.mo39192a();
        cVar.mo39184a(this.f56174k);
        cVar.mo39183a(j);
        ArrayList<Long> a = C23753c.m44901a("/proc/self/task/");
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = a.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            C23740d dVar = this.f56175l.get(Long.valueOf(longValue));
            if (dVar == null) {
                dVar = new C23740d(longValue);
                this.f56175l.put(Long.valueOf(longValue), dVar);
            }
            C23735e eVar = (C23735e) dVar.mo39192a();
            if (eVar == null) {
                arrayList.add(Long.valueOf(longValue));
            } else {
                eVar.mo39184a(this.f56176m.get(Long.valueOf(longValue)));
                eVar.mo39183a(j);
                this.f56176m.put(Long.valueOf(longValue), eVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Long) it2.next()).longValue();
            this.f56175l.remove(Long.valueOf(longValue2));
            this.f56176m.remove(Long.valueOf(longValue2));
        }
        this.f56172i = bVar;
        this.f56174k = cVar;
    }

    /* renamed from: f */
    private void m44864f() {
        C23734d dVar = (C23734d) this.f56167d.mo39192a();
        dVar.mo39187a(this.f56168e);
        this.f56168e = dVar;
        ArrayList<Long> a = C23753c.m44901a("/proc/self/task/");
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = a.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            C23741e eVar = this.f56169f.get(Long.valueOf(longValue));
            if (eVar == null) {
                eVar = new C23741e((int) longValue);
                this.f56169f.put(Long.valueOf(longValue), eVar);
            }
            C23734d dVar2 = (C23734d) eVar.mo39192a();
            if (dVar2 == null) {
                arrayList.add(Long.valueOf(longValue));
            } else {
                dVar2.mo39187a(this.f56170g.get(Long.valueOf(longValue)));
                this.f56170g.put(Long.valueOf(longValue), dVar2);
                if (this.f56158b.mo39163a().f56114b) {
                    this.f56168e.mo39190b(dVar2);
                }
                dVar2.mo39186a();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Long) it2.next()).longValue();
            this.f56169f.remove(Long.valueOf(longValue2));
            this.f56170g.remove(Long.valueOf(longValue2));
        }
    }

    /* renamed from: c */
    public final List<List<Integer>> mo39179c() {
        ArrayList arrayList = null;
        if (this.f56158b.mo39163a().f56114b) {
            List<LinkedHashMap<Long, Long>> list = this.f56168e.f56189c;
            long b = this.f56168e.mo39189b();
            if (list != null && b > 0) {
                arrayList = new ArrayList();
                for (LinkedHashMap<Long, Long> linkedHashMap : list) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = linkedHashMap.size() / 4;
                    int i = 0;
                    long j = 0;
                    long j2 = 0;
                    int i2 = 0;
                    for (Map.Entry<Long, Long> entry : linkedHashMap.entrySet()) {
                        Long key = entry.getKey();
                        Long value = entry.getValue();
                        if (!(key == null || value == null)) {
                            j2 += value.longValue();
                            if (i < 3) {
                                if (i2 < size) {
                                    j += value.longValue();
                                    i2++;
                                } else {
                                    double d = (double) j;
                                    double d2 = (double) b;
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    arrayList2.add(Integer.valueOf((int) ((d / d2) * 100.0d)));
                                    j = value.longValue();
                                    i++;
                                    i2 = 1;
                                }
                            } else if (i == 3) {
                                j += value.longValue();
                            }
                        }
                    }
                    double d3 = (double) j;
                    double d4 = (double) b;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    arrayList2.add(Integer.valueOf((int) ((d3 / d4) * 100.0d)));
                    double d5 = (double) j2;
                    Double.isNaN(d5);
                    Double.isNaN(d4);
                    arrayList2.add(Integer.valueOf((int) ((d5 / d4) * 100.0d)));
                    arrayList.add(arrayList2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final AbstractC23724c.C23726b mo39180d() {
        boolean z;
        boolean z2;
        if (!this.f56158b.mo39163a().f56114b) {
            return null;
        }
        List<List<Integer>> c = mo39179c();
        if (c.size() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (c.size() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC23724c.C23726b bVar = new AbstractC23724c.C23726b();
        int i = 0;
        for (List<Integer> list : c) {
            if (list != null && list.size() >= 5) {
                if (i == 0) {
                    bVar.f56132a = (float) list.get(0).intValue();
                    bVar.f56133b = (float) list.get(1).intValue();
                    bVar.f56134c = (float) list.get(2).intValue();
                    bVar.f56135d = (float) list.get(3).intValue();
                    float intValue = (float) list.get(4).intValue();
                    bVar.f56132a = intValue;
                    bVar.f56136e = intValue;
                } else {
                    if (i == 1) {
                        if (z2) {
                            bVar.f56137f = (float) list.get(0).intValue();
                            bVar.f56138g = (float) list.get(1).intValue();
                            bVar.f56139h = (float) list.get(2).intValue();
                            bVar.f56140i = (float) list.get(3).intValue();
                            bVar.f56141j = (float) list.get(4).intValue();
                        }
                    } else if (i != 1) {
                        if (i == 2 && z2) {
                            bVar.f56142k = (float) list.get(0).intValue();
                            bVar.f56143l = (float) list.get(1).intValue();
                            bVar.f56144m = (float) list.get(2).intValue();
                            bVar.f56145n = (float) list.get(3).intValue();
                            bVar.f56146o = (float) list.get(4).intValue();
                        }
                    }
                    if (z) {
                        bVar.f56137f = 0.0f;
                        bVar.f56138g = 0.0f;
                        bVar.f56139h = 0.0f;
                        bVar.f56140i = 0.0f;
                        bVar.f56141j = 0.0f;
                        bVar.f56142k = (float) list.get(0).intValue();
                        bVar.f56143l = (float) list.get(1).intValue();
                        bVar.f56144m = (float) list.get(2).intValue();
                        bVar.f56145n = (float) list.get(3).intValue();
                        bVar.f56146o = (float) list.get(4).intValue();
                    }
                }
                i++;
            }
        }
        return bVar;
    }

    public C23731a(Context context, AbstractC23724c cVar) {
        super(context, cVar);
    }
}
