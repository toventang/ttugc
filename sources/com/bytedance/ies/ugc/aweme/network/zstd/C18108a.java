package com.bytedance.ies.ugc.aweme.network.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.zoin.zstd.ZstdInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.a */
public final class C18108a implements C14731e.AbstractC14741j {

    /* renamed from: a */
    public static final C18109a f43102a = new C18109a((byte) 0);

    static {
        Covode.recordClassIndex(20748);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.a$a */
    public static final class C18109a {
        static {
            Covode.recordClassIndex(20749);
        }

        private C18109a() {
        }

        public /* synthetic */ C18109a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static String m33715a(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null) {
            Locale locale = Locale.US;
            C89219l.m154716b(locale, "");
            String lowerCase = str.toLowerCase(locale);
            C89219l.m154716b(lowerCase, "");
            list = map.get(lowerCase);
            if (list == null) {
                return null;
            }
        }
        return list.get(list.size() - 1);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14741j
    /* renamed from: a */
    public final InputStream mo23742a(InputStream inputStream, Map<String, List<String>> map, C22096s sVar) {
        Map<String, Long> map2;
        Map<String, Long> map3;
        C89219l.m154721d(inputStream, "");
        C89219l.m154721d(map, "");
        try {
            if (!C89219l.m154714a((Object) "ttzip", (Object) m33715a(map, "Content-Encoding"))) {
                return inputStream;
            }
            String a = m33715a(map, "ttzip-version");
            ZstdInputStream zstdInputStream = new ZstdInputStream(inputStream);
            if (a != null) {
                zstdInputStream.setDict(C18114c.f43110a.mo28872a(a));
            }
            if (!(sVar == null || (map3 = sVar.f52170M) == null)) {
                map3.put("zstd_err_code", 0L);
            }
            return zstdInputStream;
        } catch (Exception e) {
            if (!(sVar == null || (map2 = sVar.f52170M) == null)) {
                map2.put("zstd_err_code", 1L);
            }
            throw e;
        }
    }
}
