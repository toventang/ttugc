package com.bytedance.crash.util;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.o */
public final class C14063o {

    /* renamed from: a */
    private final Writer f34238a;

    /* renamed from: b */
    private final List<EnumC14064a> f34239b = new ArrayList();

    static {
        Covode.recordClassIndex(16130);
    }

    public final String toString() {
        return "";
    }

    /* renamed from: a */
    public static void m25610a(JSONObject jSONObject, Writer writer) {
        new C14063o(writer).m25609a(jSONObject);
        writer.flush();
    }

    /* renamed from: a */
    private C14063o m25602a() {
        return m25603a(EnumC14064a.EMPTY_ARRAY, "[");
    }

    /* renamed from: b */
    private C14063o m25611b() {
        return m25603a(EnumC14064a.EMPTY_OBJECT, "{");
    }

    /* renamed from: c */
    private EnumC14064a m25613c() {
        List<EnumC14064a> list = this.f34239b;
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.util.o$a */
    public enum EnumC14064a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL;

        static {
            Covode.recordClassIndex(16131);
        }
    }

    /* renamed from: d */
    private void m25615d() {
        MethodCollector.m26663i(1422);
        if (this.f34239b.isEmpty()) {
            MethodCollector.m26664o(1422);
            return;
        }
        EnumC14064a c = m25613c();
        if (c == EnumC14064a.EMPTY_ARRAY) {
            m25606a(EnumC14064a.NONEMPTY_ARRAY);
            MethodCollector.m26664o(1422);
        } else if (c == EnumC14064a.NONEMPTY_ARRAY) {
            this.f34238a.write(44);
            MethodCollector.m26664o(1422);
        } else if (c == EnumC14064a.DANGLING_KEY) {
            this.f34238a.write(":");
            m25606a(EnumC14064a.NONEMPTY_OBJECT);
            MethodCollector.m26664o(1422);
        } else if (c == EnumC14064a.NULL) {
            MethodCollector.m26664o(1422);
        } else {
            JSONException jSONException = new JSONException("Nesting problem");
            MethodCollector.m26664o(1422);
            throw jSONException;
        }
    }

    private C14063o(Writer writer) {
        this.f34238a = writer;
    }

    /* renamed from: a */
    private C14063o m25605a(String str) {
        MethodCollector.m26663i(1378);
        m25613c();
        List<EnumC14064a> list = this.f34239b;
        list.remove(list.size() - 1);
        this.f34238a.write(str);
        MethodCollector.m26664o(1378);
        return this;
    }

    /* renamed from: c */
    private C14063o m25614c(String str) {
        MethodCollector.m26663i(1414);
        EnumC14064a c = m25613c();
        if (c == EnumC14064a.NONEMPTY_OBJECT) {
            this.f34238a.write(44);
        } else if (c != EnumC14064a.EMPTY_OBJECT) {
            JSONException jSONException = new JSONException("Nesting problem");
            MethodCollector.m26664o(1414);
            throw jSONException;
        }
        m25606a(EnumC14064a.DANGLING_KEY);
        m25612b(str);
        MethodCollector.m26664o(1414);
        return this;
    }

    /* renamed from: a */
    private C14063o m25604a(Object obj) {
        MethodCollector.m26663i(1402);
        if (obj instanceof JSONArray) {
            m25607a((JSONArray) obj);
            MethodCollector.m26664o(1402);
            return this;
        } else if (obj instanceof JSONObject) {
            m25609a((JSONObject) obj);
            MethodCollector.m26664o(1402);
            return this;
        } else {
            m25615d();
            if (obj == null || obj == JSONObject.NULL) {
                this.f34238a.write("null");
            } else if (obj instanceof Boolean) {
                this.f34238a.write(String.valueOf(obj));
            } else if (obj instanceof Number) {
                this.f34238a.write(JSONObject.numberToString((Number) obj));
            } else {
                m25612b(obj.toString());
            }
            MethodCollector.m26664o(1402);
            return this;
        }
    }

    /* renamed from: a */
    private void m25606a(EnumC14064a aVar) {
        List<EnumC14064a> list = this.f34239b;
        list.set(list.size() - 1, aVar);
    }

    /* renamed from: b */
    private void m25612b(String str) {
        MethodCollector.m26663i(1411);
        this.f34238a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                this.f34238a.write("\\f");
            } else if (charAt != '\r') {
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            this.f34238a.write("\\b");
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            this.f34238a.write("\\t");
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            this.f34238a.write("\\n");
                            break;
                        default:
                            if (charAt <= 31) {
                                this.f34238a.write(C1764a.m5928a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f34238a.write(92);
                }
                this.f34238a.write(charAt);
            } else {
                this.f34238a.write("\\r");
            }
        }
        this.f34238a.write("\"");
        MethodCollector.m26664o(1411);
    }

    /* renamed from: a */
    private void m25607a(JSONArray jSONArray) {
        m25602a();
        for (int i = 0; i < jSONArray.length(); i++) {
            m25604a(jSONArray.get(i));
        }
        m25605a("]");
    }

    /* renamed from: a */
    private void m25609a(JSONObject jSONObject) {
        m25611b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            m25614c(next).m25604a(jSONObject.get(next));
        }
        m25605a("}");
    }

    /* renamed from: a */
    private C14063o m25603a(EnumC14064a aVar, String str) {
        MethodCollector.m26663i(1371);
        m25615d();
        this.f34239b.add(aVar);
        this.f34238a.write(str);
        MethodCollector.m26664o(1371);
        return this;
    }

    /* renamed from: a */
    public static void m25608a(JSONArray jSONArray, Writer writer) {
        new C14063o(writer).m25607a(jSONArray);
        writer.flush();
    }
}
