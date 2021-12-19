package com.bytedance.apm.p789q;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.apm.q.h */
public final class C12585h {

    /* renamed from: com.bytedance.apm.q.h$a */
    public interface AbstractC12586a<A, B> {
        static {
            Covode.recordClassIndex(14403);
        }

        /* renamed from: a */
        boolean mo20401a(A a, B b);
    }

    static {
        Covode.recordClassIndex(14402);
    }

    /* renamed from: a */
    public static boolean m22682a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String[] m22683a(Set<String> set) {
        String[] strArr = new String[set.size()];
        int i = 0;
        for (String str : set) {
            strArr[i] = str;
            i++;
        }
        return strArr;
    }

    /* renamed from: a */
    public static String m22679a(Collection collection, String str) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m22680a(Object[] objArr, String str) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static <L, O> boolean m22681a(Collection<L> collection, O o, AbstractC12586a<? super L, O> aVar) {
        Iterator<L> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.mo20401a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
