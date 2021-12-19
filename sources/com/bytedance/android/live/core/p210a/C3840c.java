package com.bytedance.android.live.core.p210a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.live.core.a.c */
public class C3840c<K, V> implements AbstractC3827a<K, V> {

    /* renamed from: a */
    private Map<K, V> f10617a;

    /* renamed from: b */
    private int f10618b;

    /* renamed from: c */
    private int f10619c;

    static {
        Covode.recordClassIndex(4369);
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3827a
    /* renamed from: a */
    public final AbstractC88979t<V> mo9172a(K k) {
        return null;
    }

    public C3840c() {
        this((byte) 0);
    }

    public final synchronized String toString() {
        String sb;
        MethodCollector.m26663i(13208);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<K, V> entry : this.f10617a.entrySet()) {
            sb2.append((Object) entry.getKey()).append('=').append((Object) entry.getValue()).append(",");
        }
        sb2.append("maxMemory=").append(this.f10618b).append(",memorySize=").append(this.f10619c);
        sb = sb2.toString();
        MethodCollector.m26664o(13208);
        return sb;
    }

    private C3840c(byte b) {
        try {
            this.f10617a = new C3841d(8);
            this.f10618b = 8;
        } catch (OutOfMemoryError unused) {
            this.f10617a = new C3841d(10);
            this.f10618b = 10;
        }
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3827a
    /* renamed from: b */
    public final void mo9174b(K k) {
        MethodCollector.m26663i(13144);
        synchronized (this) {
            try {
                if (this.f10617a.remove(k) != null) {
                    this.f10619c--;
                }
            } finally {
                MethodCollector.m26664o(13144);
            }
        }
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3827a
    /* renamed from: c */
    public final V mo9175c(K k) {
        MethodCollector.m26663i(13073);
        synchronized (this) {
            try {
                V v = this.f10617a.get(k);
                if (v != null) {
                    return v;
                }
                MethodCollector.m26664o(13073);
                return null;
            } finally {
                MethodCollector.m26664o(13073);
            }
        }
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3827a
    /* renamed from: a */
    public final void mo9173a(K k, V v) {
        MethodCollector.m26663i(13143);
        synchronized (this) {
            try {
                V put = this.f10617a.put(k, v);
                int i = this.f10619c + 1;
                this.f10619c = i;
                if (put != null) {
                    this.f10619c = i - 1;
                }
                int i2 = this.f10618b;
                while (this.f10619c > i2 && !this.f10617a.isEmpty()) {
                    if (this.f10619c < 0 || (this.f10617a.isEmpty() && this.f10619c != 0)) {
                        IllegalStateException illegalStateException = new IllegalStateException(C3840c.class.getName() + ".getValueSize() is reporting inconsistent results");
                        MethodCollector.m26664o(13143);
                        throw illegalStateException;
                    }
                    Map.Entry<K, V> next = this.f10617a.entrySet().iterator().next();
                    this.f10617a.remove(next.getKey());
                    int i3 = this.f10619c;
                    next.getValue();
                    this.f10619c = i3 - 1;
                }
            } finally {
                MethodCollector.m26664o(13143);
            }
        }
    }
}
