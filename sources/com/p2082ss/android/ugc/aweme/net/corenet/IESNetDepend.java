package com.p2082ss.android.ugc.aweme.net.corenet;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.ttnet.AbstractC22938d;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.common.util.MultiProcessSharedProvider;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.net.p3489b.C61308a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.IESNetDepend */
public class IESNetDepend implements AbstractC22938d {

    /* renamed from: a */
    private static volatile IESNetDepend f139289a;

    /* renamed from: b */
    private static Map<String, String> f139290b = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.net.corenet.IESNetDepend$IESNetDependApi */
    interface IESNetDependApi {
        static {
            Covode.recordClassIndex(71963);
        }

        @AbstractC22000h
        AbstractFutureC27655q<String> doGet(@AbstractC21993ag String str);
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: c */
    public final String mo37265c() {
        return ".tiktokv.com";
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: d */
    public final String mo37266d() {
        return "";
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: e */
    public final int mo37267e() {
        return C17867d.f42590n;
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: a */
    public final Context mo37259a() {
        return C17867d.m33078a();
    }

    static {
        Covode.recordClassIndex(71962);
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: b */
    public final String[] mo37264b() {
        if (C61308a.f139236a == null) {
            C61308a.f139236a = C61308a.f139241f;
        }
        return C61308a.f139236a;
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: f */
    public final Map<String, String> mo37268f() {
        HashMap hashMap = new HashMap();
        hashMap.put("httpdns", "34.102.215.99");
        hashMap.put("netlog", "ttnet.tiktokv.com");
        hashMap.put("boe", "xxx");
        return hashMap;
    }

    /* renamed from: g */
    public static IESNetDepend m111015g() {
        MethodCollector.m26663i(4020);
        if (f139289a == null) {
            synchronized (IESNetDepend.class) {
                try {
                    if (f139289a == null) {
                        f139289a = new IESNetDepend();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4020);
                    throw th;
                }
            }
        }
        IESNetDepend iESNetDepend = f139289a;
        MethodCollector.m26664o(4020);
        return iESNetDepend;
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: a */
    public final void mo37262a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            String[] split = str.split(",");
            if (split.length > 0) {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.length() > 1 && str2.startsWith(".")) {
                            str2 = str2.substring(1);
                        }
                        arrayList.add(str2);
                    }
                }
            }
            C30628d.m62923a(arrayList);
        }
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: a */
    public final void mo37263a(String str, JSONObject jSONObject) {
        C33830n.m70668a(str, jSONObject);
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: a */
    public final void mo37261a(Context context, Map<String, ?> map) {
        try {
            MultiProcessSharedProvider.C29825a aVar = new MultiProcessSharedProvider.C29825a(context, (byte) 0);
            if (map != null) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        int intValue = ((Integer) value).intValue();
                        aVar.f71174b.put(entry.getKey(), Integer.valueOf(intValue));
                    } else if (value instanceof Long) {
                        long longValue = ((Long) value).longValue();
                        aVar.f71174b.put(entry.getKey(), Long.valueOf(longValue));
                    } else if (value instanceof Float) {
                        float floatValue = ((Float) value).floatValue();
                        aVar.f71174b.put(entry.getKey(), Float.valueOf(floatValue));
                    } else if (value instanceof Boolean) {
                        boolean booleanValue = ((Boolean) value).booleanValue();
                        aVar.f71174b.put(entry.getKey(), Boolean.valueOf(booleanValue));
                    } else if (value instanceof String) {
                        aVar.f71174b.put(entry.getKey(), (String) value);
                    }
                }
                aVar.mo52108a();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: a */
    public final int mo37258a(Context context, String str, int i) {
        return MultiProcessSharedProvider.m60091a(context).mo52109a(str, i);
    }

    @Override // com.bytedance.ttnet.AbstractC22938d
    /* renamed from: a */
    public final String mo37260a(Context context, String str, String str2) {
        return MultiProcessSharedProvider.m60091a(context).mo52110a(str, str2);
    }
}
