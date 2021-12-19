package com.p2082ss.android.ugc.aweme.trending.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.e */
public final class C79158e {

    /* renamed from: a */
    public static final C79158e f177910a = new C79158e();

    /* renamed from: b */
    private static final C89378p<C67590l, Integer> f177911b = new C89378p<>(null, -1);

    private C79158e() {
    }

    static {
        Covode.recordClassIndex(92344);
    }

    /* renamed from: a */
    public static C89378p<C67590l, Integer> m137989a(String str, ArrayList<C67590l> arrayList) {
        if (arrayList != null) {
            int i = 0;
            if (!(str == null || str.length() == 0)) {
                for (T t : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (C89219l.m154714a((Object) str, (Object) t2.getEventId())) {
                        return new C89378p<>(t2, Integer.valueOf(i));
                    }
                    i = i2;
                }
                return f177911b;
            }
        }
        return f177911b;
    }

    /* renamed from: b */
    public static C67590l m137991b(String str, ArrayList<C67590l> arrayList) {
        if (!(arrayList == null || str == null || str.length() == 0)) {
            Iterator<C67590l> it = arrayList.iterator();
            while (it.hasNext()) {
                C67590l next = it.next();
                if (C89219l.m154714a((Object) str, (Object) next.getEventId())) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static int m137992c(String str, ArrayList<C67590l> arrayList) {
        if (arrayList == null) {
            return -1;
        }
        int i = 0;
        for (T t : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (C89219l.m154714a((Object) str, (Object) t.getEventId())) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m137990a(Aweme aweme, List<? extends Aweme> list) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) aweme.getAid(), (Object) it.next().getAid())) {
                aweme.getAid();
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static C67590l m137993d(String str, ArrayList<C67590l> arrayList) {
        int i;
        if (arrayList == null) {
            return null;
        }
        int i2 = 0;
        int i3 = -1;
        for (T t : arrayList) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                C89070n.m154520a();
            }
            if (C89219l.m154714a((Object) str, (Object) t.getEventId())) {
                i3 = i2;
            }
            i2 = i4;
        }
        arrayList.size();
        if (i3 != -1 && (i = i3 + 1) >= 0 && i < arrayList.size()) {
            return arrayList.get(i);
        }
        return null;
    }
}
