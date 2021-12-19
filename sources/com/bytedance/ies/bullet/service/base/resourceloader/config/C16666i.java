package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.resourceloader.config.i */
public final class C16666i {

    /* renamed from: a */
    public int f39822a;

    /* renamed from: b */
    public int f39823b;

    /* renamed from: c */
    public boolean f39824c;

    /* renamed from: d */
    public boolean f39825d;

    /* renamed from: e */
    public boolean f39826e;

    /* renamed from: f */
    public List<String> f39827f;

    /* renamed from: g */
    public String f39828g;

    /* renamed from: h */
    public String f39829h;

    /* renamed from: i */
    public List<String> f39830i;

    /* renamed from: j */
    public String f39831j;

    /* renamed from: k */
    public String f39832k;

    /* renamed from: l */
    public String f39833l;

    /* renamed from: m */
    public GeckoConfig f39834m;

    /* renamed from: n */
    public Map<String, GeckoConfig> f39835n;

    /* renamed from: o */
    public AbstractC16660c f39836o;

    /* renamed from: p */
    public Object f39837p;

    /* renamed from: q */
    public Object f39838q;

    static {
        Covode.recordClassIndex(19105);
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("{[host]=").append(this.f39828g).append(",[region]=").append(this.f39829h).append(",[prefix]=");
        Object[] array = this.f39830i.toArray(new String[0]);
        if (array != null) {
            String arrays = Arrays.toString(array);
            C89219l.m154709a((Object) arrays, "");
            return append.append(arrays).append(',').append("[appId]=").append(this.f39831j).append(",[appVersion]=").append(this.f39832k).append(",[did]=").append(this.f39833l).append('}').toString();
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    private C16666i(String str, String str2, List<String> list, String str3, String str4, String str5, GeckoConfig geckoConfig, Map<String, GeckoConfig> map, AbstractC16660c cVar, Object obj) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(str4, "");
        C89219l.m154719c(str5, "");
        C89219l.m154719c(geckoConfig, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(cVar, "");
        this.f39828g = str;
        this.f39829h = str2;
        this.f39830i = list;
        this.f39831j = str3;
        this.f39832k = str4;
        this.f39833l = str5;
        this.f39834m = geckoConfig;
        this.f39835n = map;
        this.f39836o = cVar;
        this.f39837p = null;
        this.f39838q = obj;
        this.f39822a = 10;
        this.f39823b = 83886080;
        this.f39827f = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16666i(String str, String str2, List list, String str3, String str4, String str5, GeckoConfig geckoConfig, Map map, AbstractC16660c cVar, Object obj, int i) {
        this(str, str2, list, str3, str4, str5, geckoConfig, (i & 128) != 0 ? new LinkedHashMap() : map, cVar, (i & 1024) != 0 ? null : obj);
    }
}
