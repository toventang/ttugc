package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.cd */
final /* synthetic */ class C25861cd implements AbstractC25871cn {

    /* renamed from: a */
    static final AbstractC25871cn f60992a = new C25861cd();

    static {
        Covode.recordClassIndex(31276);
    }

    private C25861cd() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25871cn
    /* renamed from: a */
    public final Object mo42201a() {
        Set<Map.Entry> entrySet = new C25904dt().f61047a.entrySet();
        if (entrySet.isEmpty()) {
            return C25892dh.f61029a;
        }
        C25900dp dpVar = new C25900dp(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            AbstractC25901dq zza = AbstractC25901dq.zza((Collection) entry.getValue());
            if (!zza.isEmpty()) {
                int i2 = (dpVar.f61044b + 1) << 1;
                if (i2 > dpVar.f61043a.length) {
                    Object[] objArr = dpVar.f61043a;
                    int length = dpVar.f61043a.length;
                    if (i2 >= 0) {
                        int i3 = length + (length >> 1) + 1;
                        if (i3 < i2) {
                            i3 = Integer.highestOneBit(i2 - 1) << 1;
                        }
                        if (i3 < 0) {
                            i3 = Integer.MAX_VALUE;
                        }
                        dpVar.f61043a = Arrays.copyOf(objArr, i3);
                        dpVar.f61045c = false;
                    } else {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                }
                C25878cu.m50082a(key, zza);
                dpVar.f61043a[dpVar.f61044b * 2] = key;
                dpVar.f61043a[(dpVar.f61044b * 2) + 1] = zza;
                dpVar.f61044b++;
                i += zza.size();
            }
        }
        dpVar.f61045c = true;
        return new C25905du(C25909dy.m50133a(dpVar.f61044b, dpVar.f61043a), i);
    }
}
