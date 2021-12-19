package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.x */
public final class C42445x {

    /* renamed from: a */
    static List<C42411h> f98918a;

    /* renamed from: b */
    static boolean f98919b;

    /* renamed from: c */
    public static final C42445x f98920c = new C42445x();

    private C42445x() {
    }

    /* renamed from: a */
    public static void m84847a() {
        f98918a = null;
        f98919b = false;
    }

    static {
        Covode.recordClassIndex(50392);
    }

    /* renamed from: a */
    public static void m84848a(List<C42411h> list) {
        if (list != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (C42411h hVar : list) {
                if (hVar.getFeedType() == 65515 && hVar.f98792b.size() < 3) {
                    arrayList.add(hVar);
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: a */
    public static boolean m84849a(C42411h hVar) {
        Integer valueOf;
        if (hVar == null || (valueOf = Integer.valueOf(hVar.getFeedType())) == null) {
            return false;
        }
        if (valueOf.intValue() == 65280 || valueOf.intValue() == 1048336) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo71654b(List<C42411h> list) {
        int i;
        if (list != null && (!list.isEmpty())) {
            int i2 = 0;
            if (f98919b) {
                f98919b = false;
                i = 1;
            } else {
                i = 0;
            }
            Iterator<T> it = list.iterator();
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (!it.hasNext()) {
                    i2 = i;
                    break;
                }
                if (m84849a((C42411h) it.next())) {
                    i++;
                } else {
                    i4 = i3;
                }
                if (i4 != -1) {
                    if (i % 2 == 0) {
                        i = 0;
                        i4 = -1;
                    } else if (!(i4 == -1 || i % 2 == 0)) {
                        int i5 = i3 + 1;
                        if (i5 < list.size()) {
                            Iterator<C42411h> it2 = list.subList(i5, list.size()).iterator();
                            int i6 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (!m84849a(it2.next())) {
                                    i6++;
                                } else if (i6 != -1) {
                                    list.add(i4, list.remove(i5 + i6));
                                    int i7 = i4 + 2;
                                    if (i7 < list.size()) {
                                        mo71654b(list.subList(i7, list.size()));
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        f98918a = arrayList;
                        arrayList.addAll(list.subList(i4, list.size()));
                        List<C42411h> list2 = f98918a;
                        if (list2 == null) {
                            C89219l.m154715b();
                        }
                        list.removeAll(list2);
                    }
                }
                i3++;
            }
            if (i2 % 2 != 0) {
                f98918a = new ArrayList();
            }
        }
    }
}
