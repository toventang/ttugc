package com.bytedance.p1606r.p1607a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1606r.p1607a.p1608a.AbstractC21958a;
import com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.r.a.c */
public class C21961c {

    /* renamed from: a */
    public final List<String> f51964a;

    /* renamed from: b */
    public final AbstractC21959b f51965b;

    /* renamed from: c */
    public final AbstractC21958a f51966c;

    /* renamed from: d */
    public long f51967d;

    /* renamed from: e */
    public boolean f51968e;

    static {
        Covode.recordClassIndex(25627);
    }

    /* renamed from: com.bytedance.r.a.c$a */
    public static class C21962a {

        /* renamed from: a */
        public AbstractC21959b f51969a;

        /* renamed from: b */
        public AbstractC21958a f51970b;

        /* renamed from: c */
        private final List<String> f51971c;

        static {
            Covode.recordClassIndex(25628);
        }

        /* renamed from: a */
        public final C21961c mo35713a() {
            return new C21961c(this.f51971c, this.f51969a, this.f51970b, (byte) 0);
        }

        public C21962a(List<String> list) {
            ArrayList arrayList = new ArrayList();
            this.f51971c = arrayList;
            arrayList.addAll(list);
        }
    }

    private C21961c(List<String> list, AbstractC21959b bVar, AbstractC21958a aVar) {
        this.f51964a = list;
        this.f51965b = bVar;
        this.f51966c = aVar;
    }

    /* synthetic */ C21961c(List list, AbstractC21959b bVar, AbstractC21958a aVar, byte b) {
        this(list, bVar, aVar);
    }
}
