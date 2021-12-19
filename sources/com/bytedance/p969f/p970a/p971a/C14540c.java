package com.bytedance.p969f.p970a.p971a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.f.a.a.c */
public final class C14540c {

    /* renamed from: a */
    final List<C14544f> f35150a;

    /* renamed from: b */
    public final List<C14544f> f35151b;

    /* renamed from: c */
    final Comparator<C14544f> f35152c = C14541a.f35153a;

    static {
        Covode.recordClassIndex(16627);
    }

    public C14540c() {
        ArrayList arrayList = new ArrayList();
        this.f35150a = arrayList;
        this.f35151b = arrayList;
    }

    /* renamed from: com.bytedance.f.a.a.c$a */
    static final class C14541a<T> implements Comparator<C14544f> {

        /* renamed from: a */
        public static final C14541a f35153a = new C14541a();

        static {
            Covode.recordClassIndex(16628);
        }

        C14541a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C14544f fVar, C14544f fVar2) {
            C14544f fVar3 = fVar;
            C14544f fVar4 = fVar2;
            C89219l.m154721d(fVar3, "");
            C89219l.m154721d(fVar4, "");
            return fVar4.f35157a - fVar3.f35157a;
        }
    }
}
