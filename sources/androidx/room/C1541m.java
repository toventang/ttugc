package androidx.room;

import androidx.p054j.p055a.AbstractC1067d;
import androidx.p054j.p055a.AbstractC1068e;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: androidx.room.m */
public final class C1541m implements AbstractC1067d, AbstractC1068e {

    /* renamed from: h */
    static final TreeMap<Integer, C1541m> f5067h = new TreeMap<>();

    /* renamed from: a */
    final long[] f5068a;

    /* renamed from: b */
    final double[] f5069b;

    /* renamed from: c */
    final String[] f5070c;

    /* renamed from: d */
    final byte[][] f5071d;

    /* renamed from: e */
    public final int[] f5072e;

    /* renamed from: f */
    final int f5073f;

    /* renamed from: g */
    int f5074g;

    /* renamed from: i */
    private volatile String f5075i;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.p054j.p055a.AbstractC1068e
    /* renamed from: b */
    public final String mo3778b() {
        return this.f5075i;
    }

    static {
        Covode.recordClassIndex(1680);
    }

    /* renamed from: a */
    public final void mo5106a() {
        TreeMap<Integer, C1541m> treeMap = f5067h;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f5073f), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3803a(int i) {
        this.f5072e[i] = 1;
    }

    private C1541m(int i) {
        this.f5073f = i;
        int i2 = i + 1;
        this.f5072e = new int[i2];
        this.f5068a = new long[i2];
        this.f5069b = new double[i2];
        this.f5070c = new String[i2];
        this.f5071d = new byte[i2][];
    }

    @Override // androidx.p054j.p055a.AbstractC1068e
    /* renamed from: a */
    public final void mo3777a(AbstractC1067d dVar) {
        for (int i = 1; i <= this.f5074g; i++) {
            int i2 = this.f5072e[i];
            if (i2 == 1) {
                dVar.mo3803a(i);
            } else if (i2 == 2) {
                dVar.mo3805a(i, this.f5068a[i]);
            } else if (i2 == 3) {
                dVar.mo3804a(i, this.f5069b[i]);
            } else if (i2 == 4) {
                dVar.mo3806a(i, this.f5070c[i]);
            } else if (i2 == 5) {
                dVar.mo3807a(i, this.f5071d[i]);
            }
        }
    }

    /* renamed from: b */
    private void m5202b(String str, int i) {
        this.f5075i = str;
        this.f5074g = i;
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3804a(int i, double d) {
        this.f5072e[i] = 3;
        this.f5069b[i] = d;
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3805a(int i, long j) {
        this.f5072e[i] = 2;
        this.f5068a[i] = j;
    }

    /* renamed from: a */
    public static C1541m m5201a(String str, int i) {
        TreeMap<Integer, C1541m> treeMap = f5067h;
        synchronized (treeMap) {
            Map.Entry<Integer, C1541m> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C1541m value = ceilingEntry.getValue();
                value.m5202b(str, i);
                return value;
            }
            C1541m mVar = new C1541m(i);
            mVar.m5202b(str, i);
            return mVar;
        }
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3806a(int i, String str) {
        this.f5072e[i] = 4;
        this.f5070c[i] = str;
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3807a(int i, byte[] bArr) {
        this.f5072e[i] = 5;
        this.f5071d[i] = bArr;
    }
}
