package com.p2082ss.android.ugc.aweme.setting.page.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.base.a */
public final class C68253a {

    /* renamed from: a */
    public List<AbstractC17641a> f152798a = new ArrayList();

    /* renamed from: b */
    public final HashMap<Class<? extends PowerCell<?>>, Object> f152799b = new HashMap<>();

    static {
        Covode.recordClassIndex(80461);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.base.a$b */
    public static final class C68255b extends AbstractC89220m implements AbstractC89172b<T, C89391z> {

        /* renamed from: a */
        public static final C68255b f152801a = new C68255b();

        static {
            Covode.recordClassIndex(80463);
        }

        C68255b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154721d(obj, "");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.base.a$a */
    public static final class C68254a extends AbstractC89220m implements AbstractC89172b<T, Boolean> {

        /* renamed from: a */
        public static final C68254a f152800a = new C68254a();

        static {
            Covode.recordClassIndex(80462);
        }

        C68254a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Object obj) {
            C89219l.m154721d(obj, "");
            return true;
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC17641a> void mo108757a(T t, AbstractC89172b<? super T, Boolean> bVar) {
        C89219l.m154721d(t, "");
        C89219l.m154721d(bVar, "");
        if (bVar.invoke(t).booleanValue() && t != null) {
            this.f152798a.add(t);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m120514a(C68253a aVar, AbstractC17641a aVar2, Class cls, AbstractC89172b bVar, AbstractC89172b bVar2, int i) {
        if ((i & 4) != 0) {
            bVar = C68254a.f152800a;
        }
        if ((i & 8) != 0) {
            bVar2 = C68255b.f152801a;
        }
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(cls, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        if (((Boolean) bVar.invoke(aVar2)).booleanValue() && aVar2 != null) {
            bVar2.invoke(aVar2);
            aVar.f152798a.add(aVar2);
            aVar.f152799b.put(cls, aVar2);
        }
    }
}
