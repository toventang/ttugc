package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.dy */
public final class C25909dy<K, V> extends AbstractC25897dm<K, V> {

    /* renamed from: a */
    static final AbstractC25897dm<Object, Object> f61051a = new C25909dy(null, new Object[0], 0);

    /* renamed from: b */
    private final transient Object f61052b;

    /* renamed from: c */
    private final transient Object[] f61053c;

    /* renamed from: d */
    private final transient int f61054d;

    public final int size() {
        return this.f61054d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25897dm
    /* renamed from: a */
    public final AbstractC25901dq<Map.Entry<K, V>> mo42308a() {
        return new C25913eb(this, this.f61053c, this.f61054d);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25897dm
    /* renamed from: b */
    public final AbstractC25901dq<K> mo42309b() {
        return new C25915ed(this, new C25914ec(this.f61053c, 0, this.f61054d));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25897dm
    /* renamed from: c */
    public final AbstractC25894dj<V> mo42310c() {
        return new C25914ec(this.f61053c, 1, this.f61054d);
    }

    static {
        Covode.recordClassIndex(31324);
    }

    @Override // java.util.Map, com.google.android.gms.internal.measurement.AbstractC25897dm
    public final V get(Object obj) {
        Object obj2 = this.f61052b;
        Object[] objArr = this.f61053c;
        int i = this.f61054d;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int a = C25891dg.m50108a(obj.hashCode());
                while (true) {
                    int i2 = a & length;
                    int i3 = bArr[i2] & 255;
                    if (i3 == 255) {
                        return null;
                    }
                    if (objArr[i3].equals(obj)) {
                        return (V) objArr[i3 ^ 1];
                    }
                    a = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int a2 = C25891dg.m50108a(obj.hashCode());
                while (true) {
                    int i4 = a2 & length2;
                    int i5 = sArr[i4] & 65535;
                    if (i5 == 65535) {
                        return null;
                    }
                    if (objArr[i5].equals(obj)) {
                        return (V) objArr[i5 ^ 1];
                    }
                    a2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int a3 = C25891dg.m50108a(obj.hashCode());
                while (true) {
                    int i6 = a3 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (objArr[i7].equals(obj)) {
                        return (V) objArr[i7 ^ 1];
                    }
                    a3 = i6 + 1;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x002b */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r6[r2] = (byte) r5;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r6[r2] = (short) r5;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r6[r2] = r5;
        r7 = r7 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.gms.internal.measurement.C25909dy<K, V> m50133a(int r10, java.lang.Object[] r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C25909dy.m50133a(int, java.lang.Object[]):com.google.android.gms.internal.measurement.dy");
    }

    private C25909dy(Object obj, Object[] objArr, int i) {
        this.f61052b = obj;
        this.f61053c = objArr;
        this.f61054d = i;
    }

    /* renamed from: a */
    private static IllegalArgumentException m50134a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        return new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length()).append("Multiple entries with same key: ").append(valueOf).append("=").append(valueOf2).append(" and ").append(valueOf3).append("=").append(valueOf4).toString());
    }
}
