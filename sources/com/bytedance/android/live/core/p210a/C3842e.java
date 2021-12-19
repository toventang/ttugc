package com.bytedance.android.live.core.p210a;

import android.util.Pair;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88435h;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.live.core.a.e */
public final class C3842e<K, V> implements AbstractC3827a<K, V> {

    /* renamed from: a */
    private final AbstractC88434g<K, Integer> f10621a;

    /* renamed from: b */
    private final AbstractC88430c<K, V, Boolean> f10622b;

    /* renamed from: c */
    private final AbstractC88435h<K, V, Long, Boolean> f10623c;

    /* renamed from: d */
    private final AbstractC88430c<V, V, V> f10624d;

    /* renamed from: e */
    private final Map<Integer, Pair<V, Long>> f10625e;

    /* renamed from: f */
    private final ConcurrentMap<Integer, AbstractC88969g<V>> f10626f;

    static {
        Covode.recordClassIndex(4371);
    }

    public C3842e() {
        this((byte) 0);
    }

    private C3842e(byte b) {
        this(C3843f.f10627a);
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3827a
    /* renamed from: b */
    public final void mo9174b(K k) {
        this.f10625e.remove(C11195i.m19840a(this.f10621a, k));
    }

    private C3842e(AbstractC88430c<K, V, Boolean> cVar) {
        this(C3844g.f10628a, cVar, new C3845h(Long.MAX_VALUE), C3846i.f10630a);
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3827a
    /* renamed from: a */
    public final AbstractC88979t<V> mo9172a(K k) {
        int intValue = ((Integer) C11195i.m19840a(this.f10621a, k)).intValue();
        this.f10626f.putIfAbsent(Integer.valueOf(intValue), new C88960c());
        return this.f10626f.get(Integer.valueOf(intValue));
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3827a
    /* renamed from: c */
    public final V mo9175c(K k) {
        Pair<V, Long> pair = this.f10625e.get(C11195i.m19840a(this.f10621a, k));
        if (pair == null || ((Boolean) C11195i.m19841a(this.f10623c, k, pair.first, pair.second)).booleanValue()) {
            return null;
        }
        return (V) pair.first;
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3827a
    /* renamed from: a */
    public final void mo9173a(K k, V v) {
        if (!((Boolean) C11195i.m19839a(this.f10622b, k, v)).booleanValue()) {
            int intValue = ((Integer) C11195i.m19840a(this.f10621a, k)).intValue();
            Pair<V, Long> pair = this.f10625e.get(Integer.valueOf(intValue));
            if (pair != null && !((Boolean) C11195i.m19841a(this.f10623c, k, pair.first, pair.second)).booleanValue()) {
                Object obj = this.f10625e.get(Integer.valueOf(intValue)).first;
                if (!v.equals(obj)) {
                    v = (V) C11195i.m19839a(this.f10624d, obj, v);
                    if (v.equals(obj)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f10625e.put(Integer.valueOf(intValue), new Pair<>(v, Long.valueOf(System.currentTimeMillis())));
            if (this.f10626f.containsKey(Integer.valueOf(intValue))) {
                this.f10626f.get(Integer.valueOf(intValue)).onNext(v);
            }
        }
    }

    private C3842e(AbstractC88434g<K, Integer> gVar, AbstractC88430c<K, V, Boolean> cVar, AbstractC88435h<K, V, Long, Boolean> hVar, AbstractC88430c<V, V, V> cVar2) {
        this.f10625e = new ConcurrentHashMap();
        this.f10626f = new ConcurrentHashMap(20, 0.75f, 4);
        this.f10621a = gVar;
        this.f10622b = cVar;
        this.f10623c = hVar;
        this.f10624d = cVar2;
    }
}
