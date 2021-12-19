package com.bytedance.ies.bullet.service.p1172f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16594ae;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.bytedance.ies.bullet.service.f.f */
public final class C16861f implements AbstractC16594ae {

    /* renamed from: a */
    private final String f40075a;

    /* renamed from: b */
    private final List<String> f40076b;

    /* renamed from: c */
    private final AbstractC89171a<List<String>> f40077c;

    static {
        Covode.recordClassIndex(19301);
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16594ae
    /* renamed from: a */
    public final String mo26362a() {
        return this.f40075a;
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.f$a */
    public static final class C16862a {

        /* renamed from: a */
        public String f40078a = "unknown";

        /* renamed from: b */
        private List<String> f40079b = new ArrayList();

        /* renamed from: c */
        private AbstractC89171a<? extends List<String>> f40080c;

        static {
            Covode.recordClassIndex(19302);
        }

        /* renamed from: a */
        public final C16861f mo26660a() {
            return new C16861f(this.f40078a, this.f40079b, this.f40080c, (byte) 0);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16594ae
    /* renamed from: b */
    public final List<String> mo26363b() {
        List<String> invoke;
        AbstractC89171a<List<String>> aVar = this.f40077c;
        if (aVar == null || (invoke = aVar.invoke()) == null) {
            return this.f40076b;
        }
        return invoke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    private C16861f(String str, List<String> list, AbstractC89171a<? extends List<String>> aVar) {
        this.f40075a = str;
        this.f40076b = list;
        this.f40077c = aVar;
    }

    public /* synthetic */ C16861f(String str, List list, AbstractC89171a aVar, byte b) {
        this(str, list, aVar);
    }
}
