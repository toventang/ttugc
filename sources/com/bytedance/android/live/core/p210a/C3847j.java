package com.bytedance.android.live.core.p210a;

import android.util.Pair;
import com.bytedance.android.live.core.p210a.AbstractC3838b;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88436i;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.live.core.a.j */
public final class C3847j<K, V> implements AbstractC3838b<K, V> {

    /* renamed from: a */
    private final AbstractC88434g<K, Integer> f10631a;

    /* renamed from: b */
    private final AbstractC88430c<K, List<V>, List<V>> f10632b;

    /* renamed from: c */
    private final AbstractC88436i<K, List<V>, Integer, List<V>, List<V>> f10633c;

    /* renamed from: d */
    private final Map<Integer, List<V>> f10634d;

    /* renamed from: e */
    private final ConcurrentMap<Integer, C88960c<AbstractC3838b.C3839a>> f10635e;

    /* renamed from: f */
    private final C88960c<Pair<K, AbstractC3838b.C3839a>> f10636f;

    static {
        Covode.recordClassIndex(4376);
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3838b
    /* renamed from: a */
    public final AbstractC88979t<Pair<K, AbstractC3838b.C3839a>> mo9200a() {
        return this.f10636f;
    }

    public C3847j() {
        this(C3848k.f10637a);
    }

    private C3847j(AbstractC88434g<K, Integer> gVar) {
        this(gVar, C3849l.f10638a, C3850m.f10639a);
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3838b
    /* renamed from: b */
    public final List<V> mo9205b(K k) {
        int intValue = ((Integer) C11195i.m19840a(this.f10631a, k)).intValue();
        if (!this.f10634d.containsKey(Integer.valueOf(intValue))) {
            this.f10634d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return this.f10634d.get(Integer.valueOf(intValue));
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3838b
    /* renamed from: c */
    public final int mo9206c(K k) {
        int intValue = ((Integer) C11195i.m19840a(this.f10631a, k)).intValue();
        if (!this.f10634d.containsKey(Integer.valueOf(intValue))) {
            this.f10634d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return this.f10634d.get(Integer.valueOf(intValue)).size();
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3838b
    /* renamed from: d */
    public final void mo9207d(K k) {
        int intValue = ((Integer) C11195i.m19840a(this.f10631a, k)).intValue();
        if (!this.f10634d.containsKey(Integer.valueOf(intValue))) {
            this.f10634d.put(Integer.valueOf(intValue), new ArrayList());
        }
        this.f10634d.get(Integer.valueOf(intValue)).clear();
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3838b
    /* renamed from: a */
    public final void mo9203a(K k) {
        int intValue = ((Integer) C11195i.m19840a(this.f10631a, k)).intValue();
        if (!this.f10634d.containsKey(Integer.valueOf(intValue))) {
            this.f10634d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List<V> list = this.f10634d.get(Integer.valueOf(intValue));
        if (list.size() >= 0) {
            V remove = list.remove(0);
            if (this.f10635e.containsKey(Integer.valueOf(intValue))) {
                this.f10635e.get(Integer.valueOf(intValue)).onNext(new AbstractC3838b.C3839a(2, 0, Collections.singletonList(remove)));
            }
        }
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3838b
    /* renamed from: a */
    public final List<V> mo9202a(K k, List<V> list) {
        int intValue = ((Integer) C11195i.m19840a(this.f10631a, k)).intValue();
        if (!this.f10634d.containsKey(Integer.valueOf(intValue))) {
            this.f10634d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return m9435a(k, this.f10634d.get(Integer.valueOf(intValue)).size(), list);
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3838b
    /* renamed from: a */
    public final V mo9201a(K k, AbstractC3851n<V> nVar) {
        int intValue = ((Integer) C11195i.m19840a(this.f10631a, k)).intValue();
        if (!this.f10634d.containsKey(Integer.valueOf(intValue))) {
            this.f10634d.put(Integer.valueOf(intValue), new ArrayList());
        }
        for (V v : this.f10634d.get(Integer.valueOf(intValue))) {
            try {
                if (nVar.mo9213a(v)) {
                    return v;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3838b
    /* renamed from: a */
    public final void mo9204a(K k, V v) {
        int intValue = ((Integer) C11195i.m19840a(this.f10631a, k)).intValue();
        if (!this.f10634d.containsKey(Integer.valueOf(intValue))) {
            this.f10634d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List<V> list = this.f10634d.get(Integer.valueOf(intValue));
        int indexOf = list.indexOf(v);
        if (list.remove(v)) {
            AbstractC3838b.C3839a aVar = new AbstractC3838b.C3839a(2, indexOf, Collections.singletonList(v));
            if (this.f10635e.containsKey(Integer.valueOf(intValue))) {
                this.f10635e.get(Integer.valueOf(intValue)).onNext(aVar);
            }
            this.f10636f.onNext(Pair.create(k, aVar));
        }
    }

    private C3847j(AbstractC88434g<K, Integer> gVar, AbstractC88436i<K, List<V>, Integer, List<V>, List<V>> iVar, AbstractC88430c<K, List<V>, List<V>> cVar) {
        this.f10634d = new ConcurrentHashMap();
        this.f10635e = new ConcurrentHashMap(20, 0.75f, 4);
        this.f10636f = new C88960c<>();
        this.f10631a = gVar;
        this.f10633c = iVar;
        this.f10632b = cVar;
    }

    /* renamed from: a */
    private synchronized List<V> m9435a(K k, int i, List<V> list) {
        MethodCollector.m26663i(12386);
        int intValue = ((Integer) C11195i.m19840a(this.f10631a, k)).intValue();
        if (!this.f10634d.containsKey(Integer.valueOf(intValue))) {
            this.f10634d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List<V> list2 = this.f10634d.get(Integer.valueOf(intValue));
        AbstractC88436i<K, List<V>, Integer, List<V>, List<V>> iVar = this.f10633c;
        Integer.valueOf(i);
        List<V> list3 = (List) C11195i.m19842a(iVar, (List) C11195i.m19839a(this.f10632b, k, list));
        if (C13617h.m24465a(list3)) {
            MethodCollector.m26664o(12386);
            return list3;
        }
        int min = Math.min(i, list2.size());
        list2.addAll(min, list3);
        this.f10634d.put(Integer.valueOf(intValue), list2);
        AbstractC3838b.C3839a aVar = new AbstractC3838b.C3839a(1, min, list3);
        if (this.f10635e.containsKey(Integer.valueOf(intValue))) {
            this.f10635e.get(Integer.valueOf(intValue)).onNext(aVar);
        }
        this.f10636f.onNext(Pair.create(k, aVar));
        this.f10636f.onNext(Pair.create(k, new AbstractC3838b.C3839a(5, min, list2)));
        MethodCollector.m26664o(12386);
        return list3;
    }
}
