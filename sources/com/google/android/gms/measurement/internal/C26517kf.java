package com.google.android.gms.measurement.internal;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25802av;
import com.google.android.gms.internal.measurement.C26123lh;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.kf */
public final class C26517kf {

    /* renamed from: a */
    BitSet f62416a;

    /* renamed from: b */
    private String f62417b;

    /* renamed from: c */
    private boolean f62418c;

    /* renamed from: d */
    private C25802av.C25820i f62419d;

    /* renamed from: e */
    private BitSet f62420e;

    /* renamed from: f */
    private Map<Integer, Long> f62421f;

    /* renamed from: g */
    private Map<Integer, List<Long>> f62422g;

    /* renamed from: h */
    private final /* synthetic */ C26515kd f62423h;

    static {
        Covode.recordClassIndex(31939);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x003b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C25802av.C25803a mo43622a(int r9) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26517kf.mo43622a(int):com.google.android.gms.internal.measurement.av$a");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43623a(AbstractC26522kk kkVar) {
        int a = kkVar.mo43624a();
        if (kkVar.f62436c != null) {
            this.f62420e.set(a, kkVar.f62436c.booleanValue());
        }
        if (kkVar.f62437d != null) {
            this.f62416a.set(a, kkVar.f62437d.booleanValue());
        }
        if (kkVar.f62438e != null) {
            Long l = this.f62421f.get(Integer.valueOf(a));
            long longValue = kkVar.f62438e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f62421f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (kkVar.f62439f != null) {
            List<Long> list = this.f62422g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList<>();
                this.f62422g.put(Integer.valueOf(a), list);
            }
            if (kkVar.mo43626b()) {
                list.clear();
            }
            C26123lh.m51205b();
            if (this.f62423h.mo43018s().mo43641d(this.f62417b, C26530p.f62521ag) && kkVar.mo43627c()) {
                list.clear();
            }
            C26123lh.m51205b();
            if (this.f62423h.mo43018s().mo43641d(this.f62417b, C26530p.f62521ag)) {
                long longValue2 = kkVar.f62439f.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                    return;
                }
                return;
            }
            list.add(Long.valueOf(kkVar.f62439f.longValue() / 1000));
        }
    }

    private C26517kf(C26515kd kdVar, String str) {
        this.f62423h = kdVar;
        this.f62417b = str;
        this.f62418c = true;
        this.f62416a = new BitSet();
        this.f62420e = new BitSet();
        this.f62421f = new C0484a();
        this.f62422g = new C0484a();
    }

    /* synthetic */ C26517kf(C26515kd kdVar, String str, byte b) {
        this(kdVar, str);
    }

    private C26517kf(C26515kd kdVar, String str, C25802av.C25820i iVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f62423h = kdVar;
        this.f62417b = str;
        this.f62416a = bitSet;
        this.f62420e = bitSet2;
        this.f62421f = map;
        this.f62422g = new C0484a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f62422g.put(num, arrayList);
            }
        }
        this.f62418c = false;
        this.f62419d = iVar;
    }

    /* synthetic */ C26517kf(C26515kd kdVar, String str, C25802av.C25820i iVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte b) {
        this(kdVar, str, iVar, bitSet, bitSet2, map, map2);
    }
}
