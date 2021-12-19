package com.bytedance.tux.p1710c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1719f.p1720a.C23127c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.c.a */
public final class C22999a {

    /* renamed from: a */
    public int f54431a;

    /* renamed from: b */
    public int f54432b = -1;

    /* renamed from: c */
    public int f54433c = -1;

    /* renamed from: d */
    public Integer f54434d;

    /* renamed from: e */
    public Integer f54435e;

    /* renamed from: f */
    public boolean f54436f;

    static {
        Covode.recordClassIndex(26919);
    }

    /* renamed from: b */
    public final C23127c mo37369b(Context context) {
        C89219l.m154719c(context, "");
        C23001b a = mo37368a(context);
        a.setBounds(0, 0, a.mo37370a(), a.mo37374b());
        return new C23127c(a, 2);
    }

    /* renamed from: com.bytedance.tux.c.a$a */
    public static final class C23000a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C22999a f54437a;

        static {
            Covode.recordClassIndex(26920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23000a(C22999a aVar) {
            super(1);
            this.f54437a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            aVar2.f54431a = this.f54437a.f54431a;
            aVar2.f54432b = this.f54437a.f54432b;
            aVar2.f54433c = this.f54437a.f54433c;
            aVar2.f54434d = this.f54437a.f54434d;
            aVar2.f54435e = this.f54437a.f54435e;
            aVar2.f54436f = this.f54437a.f54436f;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final C23001b mo37368a(Context context) {
        C89219l.m154719c(context, "");
        C23001b bVar = new C23001b(context, this.f54431a);
        int i = this.f54432b;
        if (i >= 0) {
            bVar.mo37371a(i);
        }
        int i2 = this.f54433c;
        if (i2 >= 0) {
            bVar.mo37375b(i2);
        }
        Integer num = this.f54434d;
        if (num != null) {
            bVar.mo37377c(num.intValue());
        }
        Integer num2 = this.f54435e;
        if (num2 != null) {
            bVar.mo37372a(context, num2.intValue());
        }
        bVar.mo37376b(this.f54436f);
        return bVar;
    }
}
