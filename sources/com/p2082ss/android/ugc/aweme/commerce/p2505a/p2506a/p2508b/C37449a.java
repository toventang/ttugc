package com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2508b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2508b.C37450b;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2509c.C37454a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a.b.a */
public final class C37449a {
    static {
        Covode.recordClassIndex(44834);
    }

    /* renamed from: a */
    public static float m75536a(C37450b bVar) {
        Context context;
        if (!bVar.f88409c || (context = C37454a.f88421a.f88424d.get()) == null) {
            return 0.0f;
        }
        C37450b.C37451a a = bVar.f88410d.mo65164a(new C37450b.C37451a(0, 0, C17234b.m31806a(context), C17234b.m31808b(context)));
        ArrayList<C37450b.C37451a> arrayList = bVar.f88411e;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C37450b.C37451a> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a.mo65164a(it.next()));
        }
        return ((float) m75537a(a, arrayList2)) / ((float) bVar.f88410d.mo65163a());
    }

    /* renamed from: a */
    private static int m75537a(C37450b.C37451a aVar, ArrayList<C37450b.C37451a> arrayList) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<C37450b.C37451a> it = arrayList.iterator();
        while (it.hasNext()) {
            C37450b.C37451a next = it.next();
            hashSet.add(Integer.valueOf(next.f88412a));
            hashSet.add(Integer.valueOf(next.f88414c));
            hashSet2.add(Integer.valueOf(next.f88413b));
            hashSet2.add(Integer.valueOf(next.f88415d));
        }
        ArrayList arrayList2 = new ArrayList(hashSet);
        ArrayList arrayList3 = new ArrayList(hashSet2);
        Collections.sort(arrayList2);
        Collections.sort(arrayList3);
        int i = 0;
        for (int i2 = 0; i2 < arrayList2.size() - 1; i2++) {
            int i3 = 0;
            while (i3 < arrayList3.size() - 1) {
                int i4 = i2 + 1;
                int intValue = ((Integer) arrayList2.get(i4)).intValue() - ((Integer) arrayList2.get(i2)).intValue();
                int i5 = i3 + 1;
                int intValue2 = ((Integer) arrayList3.get(i5)).intValue() - ((Integer) arrayList3.get(i3)).intValue();
                Iterator<C37450b.C37451a> it2 = arrayList.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    C37450b.C37451a next2 = it2.next();
                    if (next2.f88412a <= ((Integer) arrayList2.get(i2)).intValue() && next2.f88414c >= ((Integer) arrayList2.get(i4)).intValue() && next2.f88415d >= ((Integer) arrayList3.get(i5)).intValue() && next2.f88413b <= ((Integer) arrayList3.get(i3)).intValue()) {
                        z = true;
                    }
                }
                if (z) {
                    i += intValue * intValue2;
                }
                i3 = i5;
            }
        }
        return aVar.mo65163a() - i;
    }
}
