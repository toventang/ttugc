package com.bytedance.p1782z.p1783a.p1785b.p1788c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1790c.AbstractC23738b;
import com.bytedance.p1782z.p1783a.p1791d.C23743a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.z.a.b.c.d */
public final class C23734d implements AbstractC23738b {

    /* renamed from: a */
    public List<LinkedHashMap<Long, Long>> f56187a = new ArrayList();

    /* renamed from: b */
    public List<LinkedHashMap<Long, Long>> f56188b = new ArrayList();

    /* renamed from: c */
    public List<LinkedHashMap<Long, Long>> f56189c = new ArrayList();

    /* renamed from: d */
    private List<Integer> f56190d = C23743a.m44892b();

    /* renamed from: e */
    private long f56191e = 0;

    /* renamed from: f */
    private long f56192f = 0;

    /* renamed from: g */
    private long f56193g = 0;

    static {
        Covode.recordClassIndex(27839);
    }

    /* renamed from: c */
    private long m44873c() {
        if (this.f56191e == 0) {
            this.f56191e = m44872a(this.f56187a);
        }
        return this.f56191e;
    }

    /* renamed from: a */
    public final long mo39186a() {
        if (this.f56192f == 0) {
            this.f56192f = m44872a(this.f56188b);
        }
        return this.f56192f;
    }

    /* renamed from: b */
    public final long mo39189b() {
        if (this.f56193g == 0) {
            this.f56193g = m44872a(this.f56189c);
        }
        return this.f56193g;
    }

    public final String toString() {
        return "ProcTimeInStateInfo{freqTimeMapList=" + this.f56187a + ", freqDeltaTimeMapList=" + this.f56188b + ", totalCpuTime=" + m44873c() + ", totalDeltaCpuTime=" + mo39186a() + ", totalMergeCpuTime=" + mo39189b() + '}';
    }

    /* renamed from: a */
    public final void mo39188a(LinkedHashMap<Long, Long> linkedHashMap) {
        if (linkedHashMap != null) {
            this.f56187a.add(linkedHashMap);
        }
    }

    /* renamed from: a */
    private long m44872a(List<LinkedHashMap<Long, Long>> list) {
        int size;
        long j = 0;
        if (list != null && !list.isEmpty() && (size = list.size()) == this.f56190d.size()) {
            for (int i = 0; i != size; i++) {
                for (Map.Entry<Long, Long> entry : list.get(i).entrySet()) {
                    j += entry.getValue().longValue();
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public final void mo39187a(AbstractC23738b bVar) {
        if (bVar == null) {
            this.f56188b.addAll(this.f56187a);
            return;
        }
        List<LinkedHashMap<Long, Long>> list = ((C23734d) bVar).f56187a;
        if (!list.isEmpty() && this.f56187a.size() == list.size()) {
            this.f56188b.clear();
            for (int i = 0; i != this.f56187a.size(); i++) {
                LinkedHashMap<Long, Long> linkedHashMap = list.get(i);
                LinkedHashMap<Long, Long> linkedHashMap2 = new LinkedHashMap<>();
                for (Map.Entry<Long, Long> entry : this.f56187a.get(i).entrySet()) {
                    Long key = entry.getKey();
                    Long value = entry.getValue();
                    Long l = linkedHashMap.get(key);
                    if (l != null) {
                        linkedHashMap2.put(key, Long.valueOf(value.longValue() - l.longValue()));
                    }
                }
                this.f56188b.add(linkedHashMap2);
            }
        }
    }

    /* renamed from: b */
    public final void mo39190b(AbstractC23738b bVar) {
        if (bVar != null) {
            C23734d dVar = (C23734d) bVar;
            List<LinkedHashMap<Long, Long>> list = dVar.f56187a;
            List<LinkedHashMap<Long, Long>> list2 = dVar.f56188b;
            if (!list2.isEmpty()) {
                list = list2;
            }
            if (this.f56189c.isEmpty()) {
                this.f56189c.addAll(list);
                return;
            }
            int size = this.f56189c.size();
            if (size == list.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i != size; i++) {
                    LinkedHashMap<Long, Long> linkedHashMap = list.get(i);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<Long, Long> entry : this.f56189c.get(i).entrySet()) {
                        Long key = entry.getKey();
                        Long value = entry.getValue();
                        Long l = linkedHashMap.get(key);
                        if (l != null) {
                            linkedHashMap2.put(key, Long.valueOf(value.longValue() + l.longValue()));
                        }
                    }
                    arrayList.add(linkedHashMap2);
                }
                this.f56189c = arrayList;
            }
        }
    }
}
