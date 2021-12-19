package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.b */
public final class C14678b implements Serializable {
    public List<String> ipv4List = new ArrayList();
    public List<String> ipv6List = new ArrayList();
    public EnumC14679a source = EnumC14679a.HTTPDNS_CACHE;

    static {
        Covode.recordClassIndex(16775);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.b$a */
    public enum EnumC14679a {
        UNKNOWN,
        HTTPDNS_CACHE,
        HTTPDNS_STALE_CACHE,
        HTTPDNS_REQUEST,
        LOCALDNS_REQUEST,
        LOCALDNS_CACHE,
        HARDCODE_IPS;

        static {
            Covode.recordClassIndex(16776);
        }
    }
}
