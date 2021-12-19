package com.bytedance.p1603q;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1603q.AbstractC21937f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.q.c */
public final class C21934c {
    static {
        Covode.recordClassIndex(25600);
    }

    /* renamed from: a */
    public static <IN> AbstractC21931b<IN> m41249a(List<C21940h> list) {
        if (list != null) {
            return new C21942i(Collections.unmodifiableList(new ArrayList(list)), 0, new AbstractC21937f.C21938a(), null);
        }
        throw new IllegalArgumentException("interceptors == null !");
    }

    /* renamed from: a */
    static <IN> AbstractC21931b<IN> m41250a(List<C21940h> list, AbstractC21931b bVar, AbstractC21935d dVar) {
        if (list != null) {
            C21942i iVar = (C21942i) bVar;
            AbstractC21937f fVar = iVar.f51930a;
            if (fVar == null) {
                fVar = new AbstractC21937f.C21938a();
            }
            C21942i iVar2 = new C21942i(Collections.unmodifiableList(new ArrayList(list)), 0, fVar, dVar);
            iVar2.f51931b = iVar.f51931b;
            return iVar2;
        }
        throw new IllegalArgumentException("interceptors == null !");
    }
}
