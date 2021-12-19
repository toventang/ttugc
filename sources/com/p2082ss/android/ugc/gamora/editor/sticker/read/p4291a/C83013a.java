package com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.a */
public final class C83013a {

    /* renamed from: a */
    public final Map<String, String> f185476a;

    /* renamed from: b */
    public final List<String> f185477b;

    static {
        Covode.recordClassIndex(96886);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83013a)) {
            return false;
        }
        C83013a aVar = (C83013a) obj;
        return C89219l.m154714a(this.f185476a, aVar.f185476a) && C89219l.m154714a(this.f185477b, aVar.f185477b);
    }

    public final int hashCode() {
        Map<String, String> map = this.f185476a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        List<String> list = this.f185477b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UnLockTTSModel(lockMap=" + this.f185476a + ", unLocked=" + this.f185477b + ")";
    }

    /* renamed from: a */
    public final List<String> mo128096a() {
        return C89070n.m154590j(this.f185477b);
    }

    /* renamed from: a */
    public final String mo128095a(String str) {
        C89219l.m154721d(str, "");
        String str2 = this.f185476a.get(str);
        if (str2 == null) {
            return null;
        }
        Iterator<Map.Entry<String, String>> it = this.f185476a.entrySet().iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) it.next().getKey(), (Object) str)) {
                it.remove();
            }
        }
        this.f185477b.add(0, str2);
        return str2;
    }

    /* renamed from: b */
    public final List<String> mo128097b(String str) {
        C89219l.m154721d(str, "");
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f185476a.keySet()) {
            int a = C89361p.m154887a((CharSequence) str, str2, 0, true);
            if (a >= 0) {
                arrayList.add(C89387v.m154943a(str2, Integer.valueOf(a)));
            }
        }
        List<C89378p> a2 = C89070n.m154553a((Iterable) arrayList, (Comparator) new C83014a());
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) a2, 10));
        for (C89378p pVar : a2) {
            arrayList2.add(pVar.getFirst());
        }
        return arrayList2;
    }

    public C83013a(Map<String, String> map, List<String> list) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(list, "");
        this.f185476a = map;
        this.f185477b = list;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.a$a */
    public static final class C83014a<T> implements Comparator {
        static {
            Covode.recordClassIndex(96887);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a((Integer) t.getSecond(), (Integer) t2.getSecond());
        }
    }
}
