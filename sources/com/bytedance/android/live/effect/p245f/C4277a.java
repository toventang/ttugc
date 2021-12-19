package com.bytedance.android.live.effect.p245f;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.f.a */
public final class C4277a {

    /* renamed from: a */
    public static final C4277a f11801a = new C4277a();

    private C4277a() {
    }

    static {
        Covode.recordClassIndex(4847);
    }

    /* renamed from: a */
    public static final String[] m10376a(List<C11672a> list, String[] strArr) {
        T t;
        String str;
        C89219l.m154721d(list, "");
        C89219l.m154721d(strArr, "");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.f27899g, (Object) str2)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 == null || (str = t2.f27885A) == null) {
                str = "";
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr2 = (String[]) array;
        StringBuilder sb = new StringBuilder("effect extra list:");
        String arrays = Arrays.toString(strArr2);
        C89219l.m154716b(arrays, "");
        C3854a.m9453a(3, "ComposerUtils", sb.append(arrays).toString());
        return strArr2;
    }

    /* renamed from: a */
    public static final String[] m10375a(List<C11672a> list, Map<C11672a, ? extends Map<String, Float>> map) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(map, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            Iterator<T> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.equals(t)) {
                    if (next != null) {
                        Map map2 = (Map) map.get(next);
                        if (map2 != null) {
                            for (Map.Entry entry : map2.entrySet()) {
                                arrayList.add(t.f27899g + ':' + ((String) entry.getKey()) + ':' + ((Number) entry.getValue()).floatValue());
                            }
                        }
                    }
                }
            }
            arrayList.add(t.f27899g);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }
}
