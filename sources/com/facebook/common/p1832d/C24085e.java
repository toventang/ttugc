package com.facebook.common.p1832d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.common.d.e */
public class C24085e<E> extends ArrayList<E> {
    static {
        Covode.recordClassIndex(28213);
    }

    private C24085e(int i) {
        super(i);
    }

    private C24085e(List<E> list) {
        super(list);
    }

    public static <E> C24085e<E> copyOf(List<E> list) {
        return new C24085e<>(list);
    }

    /* renamed from: of */
    public static <E> C24085e<E> m45601of(E... eArr) {
        C24085e<E> eVar = new C24085e<>(eArr.length);
        Collections.addAll(eVar, eArr);
        return eVar;
    }
}
