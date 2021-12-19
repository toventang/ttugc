package com.p4501vk.api.sdk;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.vk.api.sdk.i */
public final class C87897i {

    /* renamed from: f */
    public static final C87899b f199633f = new C87899b((byte) 0);

    /* renamed from: a */
    public final String f199634a;

    /* renamed from: b */
    public final String f199635b;

    /* renamed from: c */
    public final Map<String, String> f199636c;

    /* renamed from: d */
    public final int f199637d;

    /* renamed from: e */
    public final boolean f199638e;

    static {
        Covode.recordClassIndex(103907);
    }

    /* renamed from: com.vk.api.sdk.i$b */
    public static final class C87899b {
        static {
            Covode.recordClassIndex(103909);
        }

        private C87899b() {
        }

        public /* synthetic */ C87899b(byte b) {
            this();
        }
    }

    /* renamed from: com.vk.api.sdk.i$a */
    public static class C87898a {

        /* renamed from: a */
        public String f199639a = "";

        /* renamed from: b */
        public String f199640b = "";

        /* renamed from: c */
        public Map<String, String> f199641c = new LinkedHashMap();

        /* renamed from: d */
        public int f199642d = 4;

        /* renamed from: e */
        public boolean f199643e;

        static {
            Covode.recordClassIndex(103908);
        }

        /* renamed from: a */
        public final C87897i mo142376a() {
            return new C87897i(this);
        }
    }

    public final int hashCode() {
        return (this.f199634a.hashCode() * 31) + this.f199636c.hashCode();
    }

    public final String toString() {
        return "VKMethodCall(method='" + this.f199634a + "', args=" + this.f199636c + ')';
    }

    protected C87897i(C87898a aVar) {
        C89219l.m154719c(aVar, "");
        if (C89361p.m154870a((CharSequence) aVar.f199639a)) {
            throw new IllegalArgumentException("method is null or empty");
        } else if (!C89361p.m154870a((CharSequence) aVar.f199640b)) {
            this.f199634a = aVar.f199639a;
            this.f199635b = aVar.f199640b;
            this.f199636c = aVar.f199641c;
            this.f199637d = aVar.f199642d;
            this.f199638e = aVar.f199643e;
        } else {
            throw new IllegalArgumentException("version is null or empty");
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            C87897i iVar = (C87897i) obj;
            if (!(!C89219l.m154714a((Object) this.f199634a, (Object) iVar.f199634a)) && !(!C89219l.m154714a(this.f199636c, iVar.f199636c))) {
                return true;
            }
            return false;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
