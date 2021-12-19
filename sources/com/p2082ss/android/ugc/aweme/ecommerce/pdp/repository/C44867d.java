package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.d */
public final class C44867d {

    /* renamed from: e */
    public static final C44868a f104623e = new C44868a((byte) 0);

    /* renamed from: a */
    public final String f104624a;

    /* renamed from: b */
    public final int f104625b;

    /* renamed from: c */
    public AbstractC88979t<ProductPackStruct> f104626c;

    /* renamed from: d */
    public ProductPackStruct f104627d;

    static {
        Covode.recordClassIndex(53254);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.d$a */
    public static final class C44868a {
        static {
            Covode.recordClassIndex(53255);
        }

        private C44868a() {
        }

        public /* synthetic */ C44868a(byte b) {
            this();
        }
    }

    private C44867d(String str, int i, AbstractC88979t<ProductPackStruct> tVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(tVar, "");
        this.f104624a = str;
        this.f104625b = i;
        this.f104626c = tVar;
        this.f104627d = null;
    }

    public /* synthetic */ C44867d(String str, int i, AbstractC88979t tVar, byte b) {
        this(str, i, tVar);
    }
}
