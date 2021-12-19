package com.lynx.tasm;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.p2047b.C28443a;
import com.lynx.tasm.p2047b.C28445b;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class TemplateData {

    /* renamed from: a */
    public long f66711a;

    /* renamed from: b */
    public String f66712b = null;

    /* renamed from: c */
    public boolean f66713c;

    /* renamed from: d */
    private Map<String, Object> f66714d;

    /* renamed from: e */
    private Map<String, Object> f66715e;

    /* renamed from: f */
    private volatile boolean f66716f;

    static {
        Covode.recordClassIndex(34381);
    }

    private static native long nativeParseData(ByteBuffer byteBuffer, int i);

    private static native long nativeParseStringData(String str);

    private static native void nativeReleaseData(long j);

    private static native void nativeUpdateData(long j, ByteBuffer byteBuffer, int i);

    /* renamed from: a */
    public static TemplateData m56770a() {
        return new TemplateData(0, null);
    }

    public final void finalize() {
        MethodCollector.m26663i(847);
        if (LynxEnv.m56706b().mo48573f()) {
            long j = this.f66711a;
            if (j != 0) {
                nativeReleaseData(j);
            }
        }
        MethodCollector.m26664o(847);
    }

    /* renamed from: b */
    public final void mo48813b() {
        MethodCollector.m26663i(844);
        if (this.f66711a == 0) {
            ByteBuffer a = C28443a.f66899a.mo48885a(this.f66714d);
            if (a != null && a.position() > 0) {
                this.f66711a = nativeParseData(a, a.position());
            }
            MethodCollector.m26664o(844);
            return;
        }
        Map<String, Object> map = this.f66715e;
        if (map == null || map.size() == 0 || this.f66714d == null) {
            MethodCollector.m26664o(844);
            return;
        }
        ByteBuffer a2 = C28443a.f66899a.mo48885a(this.f66715e);
        this.f66714d.putAll(this.f66715e);
        this.f66715e.clear();
        long j = this.f66711a;
        if (j == 0) {
            LLog.m56856a(6, "TemplateData", "mNative Data is null");
            MethodCollector.m26664o(844);
            return;
        }
        if (!(a2 == null || j == 0)) {
            nativeUpdateData(j, a2, a2.position());
        }
        MethodCollector.m26664o(844);
    }

    /* renamed from: a */
    public static TemplateData m56771a(String str) {
        MethodCollector.m26663i(821);
        if (!LynxEnv.m56706b().mo48573f() || TextUtils.isEmpty(str)) {
            TemplateData templateData = new TemplateData(0, null);
            MethodCollector.m26664o(821);
            return templateData;
        }
        TemplateData templateData2 = new TemplateData(nativeParseStringData(str), null);
        MethodCollector.m26664o(821);
        return templateData2;
    }

    /* renamed from: a */
    public static TemplateData m56772a(Map<String, Object> map) {
        ByteBuffer a;
        MethodCollector.m26663i(812);
        if (!LynxEnv.m56706b().mo48573f() || map == null || (a = C28443a.f66899a.mo48885a(map)) == null || a.position() <= 0) {
            TemplateData templateData = new TemplateData(0, null);
            MethodCollector.m26664o(812);
            return templateData;
        }
        TemplateData templateData2 = new TemplateData(nativeParseData(a, a.position()), map);
        MethodCollector.m26664o(812);
        return templateData2;
    }

    private TemplateData(long j, Map<String, Object> map) {
        LynxEnv.m56706b();
        this.f66711a = j;
        if (j != 0) {
            this.f66714d = map;
        }
    }

    /* renamed from: a */
    public final void mo48812a(String str, Object obj) {
        if (this.f66713c) {
            LLog.m56856a(5, "Lynx", "can not update readOnly TemplateData");
        } else {
            m56774b(str, obj);
        }
    }

    /* renamed from: b */
    private void m56774b(String str, Object obj) {
        Map<String, Object> hashMap;
        Map<String, Object> hashMap2;
        if (this.f66713c) {
            LLog.m56856a(5, "Lynx", "can not update readOnly TemplateData");
            return;
        }
        if (this.f66714d == null) {
            if (this.f66716f) {
                hashMap2 = new C28445b<>();
            } else {
                hashMap2 = new HashMap<>();
            }
            this.f66714d = hashMap2;
        }
        if (this.f66715e == null) {
            if (this.f66716f) {
                hashMap = new C28445b<>();
            } else {
                hashMap = new HashMap<>();
            }
            this.f66715e = hashMap;
        }
        if (this.f66711a == 0) {
            this.f66714d.put(str, obj);
            return;
        }
        Object obj2 = this.f66715e.get(str);
        if (obj2 == null) {
            obj2 = this.f66714d.get(str);
        }
        if (obj == null) {
            if (obj2 != null) {
                this.f66715e.put(str, null);
            }
        } else if (obj == obj2) {
        } else {
            if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                this.f66715e.put(str, obj);
            } else {
                m56773a(str, (Map) obj2, (Map) obj);
            }
        }
    }

    /* renamed from: a */
    private void m56773a(String str, Map<String, Object> map, Map<String, Object> map2) {
        HashMap hashMap = null;
        for (String str2 : map2.keySet()) {
            Object obj = map.get(str2);
            Object obj2 = map2.get(str2);
            if (obj != obj2) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(str2, obj2);
            }
        }
        if (hashMap != null) {
            this.f66715e.put(str, hashMap);
        }
    }
}
