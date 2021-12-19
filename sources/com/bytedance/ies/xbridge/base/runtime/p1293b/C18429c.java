package com.bytedance.ies.xbridge.base.runtime.p1293b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18448g;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.base.runtime.b.c */
public final class C18429c {

    /* renamed from: a */
    public LinkedHashMap<String, String> f44039a;

    /* renamed from: b */
    public boolean f44040b;

    /* renamed from: c */
    public Map<String, String> f44041c;

    /* renamed from: d */
    public byte[] f44042d;

    /* renamed from: e */
    public String f44043e;

    /* renamed from: f */
    public String f44044f;

    /* renamed from: g */
    public long f44045g;

    /* renamed from: h */
    public long f44046h;

    /* renamed from: i */
    public long f44047i;

    /* renamed from: j */
    public LinkedHashMap<String, File> f44048j;

    /* renamed from: k */
    public String f44049k;

    static {
        Covode.recordClassIndex(21103);
    }

    /* renamed from: a */
    public final C18429c mo29465a(String str) {
        C89219l.m154719c(str, "");
        this.f44044f = str;
        return this;
    }

    public C18429c(String str) {
        C89219l.m154719c(str, "");
        this.f44049k = str;
    }

    /* renamed from: a */
    public final AbstractC18428b mo29464a(IHostNetworkDepend iHostNetworkDepend) {
        C89219l.m154719c(iHostNetworkDepend, "");
        return C18448g.m34311a(EnumC18434f.POST, this, iHostNetworkDepend);
    }

    /* renamed from: a */
    public final C18429c mo29466a(LinkedHashMap<String, String> linkedHashMap) {
        C89219l.m154719c(linkedHashMap, "");
        this.f44039a = linkedHashMap;
        return this;
    }

    /* renamed from: a */
    public final C18429c mo29467a(Map<String, String> map) {
        C89219l.m154719c(map, "");
        this.f44041c = map;
        return this;
    }
}
