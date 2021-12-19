package com.bytedance.android.live.core.p210a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.live.core.a.b */
public interface AbstractC3838b<K, V> {
    static {
        Covode.recordClassIndex(4367);
    }

    /* renamed from: a */
    AbstractC88979t<Pair<K, C3839a>> mo9200a();

    /* renamed from: a */
    V mo9201a(K k, AbstractC3851n<V> nVar);

    /* renamed from: a */
    List<V> mo9202a(K k, List<V> list);

    /* renamed from: a */
    void mo9203a(K k);

    /* renamed from: a */
    void mo9204a(K k, V v);

    /* renamed from: b */
    List<V> mo9205b(K k);

    /* renamed from: c */
    int mo9206c(K k);

    /* renamed from: d */
    void mo9207d(K k);

    /* renamed from: com.bytedance.android.live.core.a.b$a */
    public static class C3839a<V> {

        /* renamed from: a */
        public int f10614a;

        /* renamed from: b */
        public int f10615b;

        /* renamed from: c */
        public List<V> f10616c;

        static {
            Covode.recordClassIndex(4368);
        }

        C3839a(int i, int i2, List<V> list) {
            this.f10614a = i;
            this.f10615b = i2;
            this.f10616c = list;
        }
    }
}
