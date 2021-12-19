package com.p2082ss.ugc.effectplatform.p4440a.p4443c;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.a.c.e */
public final class C86701e {

    /* renamed from: a */
    public final String f195511a;

    /* renamed from: b */
    public final EnumC86699c f195512b;

    /* renamed from: c */
    public final Map<String, String> f195513c;

    /* renamed from: d */
    public final Map<String, Object> f195514d;

    /* renamed from: e */
    public final String f195515e;

    /* renamed from: f */
    public final boolean f195516f;

    static {
        Covode.recordClassIndex(102399);
    }

    private C86701e(String str, EnumC86699c cVar, Map<String, ? extends Object> map, String str2, boolean z) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(str2, "");
        this.f195511a = str;
        this.f195512b = cVar;
        this.f195513c = null;
        this.f195514d = map;
        this.f195515e = str2;
        this.f195516f = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C86701e(String str, EnumC86699c cVar, Map map, String str2, boolean z, int i) {
        this(str, (i & 2) != 0 ? EnumC86699c.GET : cVar, (i & 8) != 0 ? null : map, (i & 16) != 0 ? "application/x-www-form-urlencoded" : str2, (i & 32) != 0 ? true : z);
    }
}
