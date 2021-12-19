package com.bytedance.ies.xbridge.p1322j.p1325c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.j.c.c */
public final class C18657c extends AbstractC18744a {

    /* renamed from: f */
    public static final C18658a f44431f = new C18658a((byte) 0);

    /* renamed from: a */
    public Integer f44432a;

    /* renamed from: b */
    public Map<String, ? extends Object> f44433b;

    /* renamed from: c */
    public Object f44434c;

    /* renamed from: d */
    public String f44435d;

    /* renamed from: e */
    public String f44436e;

    static {
        Covode.recordClassIndex(21351);
    }

    /* renamed from: com.bytedance.ies.xbridge.j.c.c$a */
    public static final class C18658a {
        static {
            Covode.recordClassIndex(21352);
        }

        private C18658a() {
        }

        public /* synthetic */ C18658a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Map<String, Object> m34636a(C18657c cVar) {
            C89219l.m154719c(cVar, "");
            Integer num = cVar.f44432a;
            if (num == null) {
                return null;
            }
            num.intValue();
            if (cVar.f44434c == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer num2 = cVar.f44432a;
            if (num2 == null) {
                C89219l.m154707a();
            }
            linkedHashMap.put("httpCode", num2);
            Object obj = cVar.f44434c;
            if (obj == null) {
                C89219l.m154707a();
            }
            linkedHashMap.put("response", obj);
            Map<String, ? extends Object> map = cVar.f44433b;
            if (map != null) {
                linkedHashMap.put("header", map);
            }
            String str = cVar.f44435d;
            if (str != null) {
                linkedHashMap.put("rawResponse", str);
            }
            String str2 = cVar.f44436e;
            if (str2 != null) {
                linkedHashMap.put("responseType", str2);
            }
            return linkedHashMap;
        }
    }

    @Override // com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a
    /* renamed from: a */
    public final List<String> mo29428a() {
        return C89070n.m154522b("httpCode", "header", "response", "rawResponse", "responseType");
    }
}
