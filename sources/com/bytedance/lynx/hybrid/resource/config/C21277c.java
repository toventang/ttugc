package com.bytedance.lynx.hybrid.resource.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21156j;
import com.bytedance.lynx.hybrid.p1515a.C21147a;
import com.bytedance.lynx.hybrid.resource.p1531g.p1532a.C21315a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.config.c */
public final class C21277c implements AbstractC21156j {

    /* renamed from: a */
    public AbstractC21278d f50494a;

    /* renamed from: b */
    public int f50495b;

    /* renamed from: c */
    public int f50496c;

    /* renamed from: d */
    public boolean f50497d;

    /* renamed from: e */
    public boolean f50498e;

    /* renamed from: f */
    public boolean f50499f;

    /* renamed from: g */
    public List<String> f50500g;

    /* renamed from: h */
    public String f50501h;

    /* renamed from: i */
    public List<String> f50502i;

    /* renamed from: j */
    public GeckoConfig f50503j;

    /* renamed from: k */
    public Map<String, GeckoConfig> f50504k;

    /* renamed from: l */
    public Object f50505l;

    /* renamed from: m */
    public Object f50506m;

    static {
        Covode.recordClassIndex(24895);
    }

    /* renamed from: a */
    public static String m39979a() {
        String appId;
        C21147a aVar = C21170d.C21171a.m39868a().f50223d;
        if (aVar == null || (appId = aVar.getAppId()) == null) {
            return "";
        }
        return appId;
    }

    /* renamed from: b */
    public static String m39980b() {
        String appVersion;
        C21147a aVar = C21170d.C21171a.m39868a().f50223d;
        if (aVar == null || (appVersion = aVar.getAppVersion()) == null) {
            return "";
        }
        return appVersion;
    }

    /* renamed from: c */
    public static String m39981c() {
        String did;
        C21147a aVar = C21170d.C21171a.m39868a().f50223d;
        if (aVar == null || (did = aVar.getDid()) == null) {
            return "";
        }
        return did;
    }

    /* renamed from: d */
    public static String m39982d() {
        String region;
        C21147a aVar = C21170d.C21171a.m39868a().f50223d;
        if (aVar == null || (region = aVar.getRegion()) == null) {
            return "";
        }
        return region;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("{[host]=").append(this.f50501h).append(",[region]=").append(m39982d()).append(",[prefix]=");
        Object[] array = this.f50502i.toArray(new String[0]);
        if (array != null) {
            String arrays = Arrays.toString(array);
            C89219l.m154709a((Object) arrays, "");
            return append.append(arrays).append(',').append("[appId]=").append(m39979a()).append(",[appVersion]=").append(m39980b()).append(",[did]=").append(m39981c()).append('}').toString();
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    private C21277c(String str, List<String> list, GeckoConfig geckoConfig, Map<String, GeckoConfig> map, Object obj) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(geckoConfig, "");
        C89219l.m154719c(map, "");
        this.f50501h = str;
        this.f50502i = list;
        this.f50503j = geckoConfig;
        this.f50504k = map;
        this.f50505l = null;
        this.f50506m = obj;
        this.f50495b = 10;
        this.f50496c = 83886080;
        this.f50500g = new ArrayList();
        this.f50494a = new C21315a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21277c(String str, List list, GeckoConfig geckoConfig, Map map, Object obj, int i) {
        this(str, list, geckoConfig, (i & 8) != 0 ? new LinkedHashMap() : map, (i & 32) != 0 ? null : obj);
    }
}
