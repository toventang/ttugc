package com.p2082ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.common.C30647g;
import com.p2082ss.android.ttve.common.TECloudCtrlInvoker;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.runtime.p4393a.C85551a;
import java.text.SimpleDateFormat;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.runtime.a */
public class C85550a {

    /* renamed from: a */
    private static String f191668a = "VECloudCtrlManager";

    /* renamed from: d */
    private static volatile C85550a f191669d;

    /* renamed from: e */
    private static String[] f191670e = {"vesdk_log_command"};

    /* renamed from: b */
    private boolean f191671b;

    /* renamed from: c */
    private TECloudCtrlInvoker f191672c = new TECloudCtrlInvoker();

    /* renamed from: f */
    private String f191673f;

    private C85550a() {
    }

    static {
        Covode.recordClassIndex(99724);
    }

    /* renamed from: a */
    public static C85550a m147438a() {
        MethodCollector.m26663i(4138);
        if (f191669d == null) {
            synchronized (C85550a.class) {
                try {
                    if (f191669d == null) {
                        f191669d = new C85550a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4138);
                    throw th;
                }
            }
        }
        C85550a aVar = f191669d;
        MethodCollector.m26664o(4138);
        return aVar;
    }

    /* renamed from: a */
    public final void mo131518a(String str) {
        this.f191673f = str;
        String[] strArr = f191670e;
        for (String str2 : strArr) {
            String str3 = (String) C85551a.EnumC85552a.INSTANCE.f191679b.mo131519a(str2, "");
            if (!str3.isEmpty()) {
                m147440b(str2, str3);
            }
        }
    }

    /* renamed from: a */
    private static void m147439a(String str, String str2) {
        C85551a.EnumC85552a.INSTANCE.f191679b.mo131520a(str, str2, false);
    }

    /* renamed from: b */
    private int m147440b(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        C30647g.EnumC30648a aVar;
        MethodCollector.m26663i(4238);
        int i = -1;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (str.hashCode() == 2043549244 && str.equals("vesdk_log_command")) {
                if (jSONObject.has("enable")) {
                    str3 = jSONObject.getString("enable");
                } else {
                    str3 = "false";
                }
                String str7 = "2018-12-08 00:00:00";
                if (jSONObject.has("starttime")) {
                    str4 = jSONObject.getString("starttime");
                } else {
                    str4 = str7;
                }
                if (jSONObject.has("endtime")) {
                    str7 = jSONObject.getString("endtime");
                }
                if (jSONObject.has("level")) {
                    str5 = jSONObject.getString("level");
                } else {
                    str5 = "";
                }
                if (jSONObject.has("sign")) {
                    str6 = jSONObject.getString("sign");
                } else {
                    str6 = "";
                }
                String str8 = str + str3 + str4 + str7 + str5;
                TECloudCtrlInvoker tECloudCtrlInvoker = this.f191672c;
                if (str8.isEmpty() || str6.isEmpty() || tECloudCtrlInvoker.nativeVerifyJson(str8.getBytes(), str6.getBytes()) != 0) {
                    m147439a(str, "");
                    C85315al.m146642d(f191668a, "Cloud Ctrl Command Json is doctored");
                    MethodCollector.m26664o(4238);
                    return -1;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = simpleDateFormat.parse(str4).getTime();
                long time2 = simpleDateFormat.parse(str7).getTime();
                long currentTimeMillis = System.currentTimeMillis();
                if (str5.hashCode() == 68 && str5.equals("D")) {
                    aVar = C30647g.EnumC30648a.LEVEL0;
                } else {
                    aVar = C30647g.EnumC30648a.LEVEL3;
                }
                if (!this.f191671b && str3.equals("true") && currentTimeMillis >= time && currentTimeMillis < time2) {
                    String str9 = this.f191673f + "/vesdklog";
                    C85315al.m146639b(f191668a, str9);
                    int initSpdLog = C30647g.m62989a().f73269a.initSpdLog(str9, aVar.ordinal(), 3);
                    if (initSpdLog < 0) {
                        C85315al.m146642d(f191668a, " TESpdLog init fail ".concat(String.valueOf(initSpdLog)));
                        MethodCollector.m26664o(4238);
                        return -3;
                    }
                    C30647g.m62989a().f73269a.setLevel(aVar.ordinal());
                    this.f191671b = true;
                } else if (str3.equals("false") || (currentTimeMillis < time && currentTimeMillis >= time2)) {
                    if (this.f191671b) {
                        C30647g.m62989a().f73269a.close();
                        this.f191671b = false;
                    }
                    C85315al.m146639b(f191668a, str + " expired");
                    m147439a(str, "");
                }
                i = 0;
                MethodCollector.m26664o(4238);
                return i;
            }
            C85315al.m146642d(f191668a, " json contail invalid command ");
            i = -2;
            MethodCollector.m26664o(4238);
            return i;
        } catch (Exception e) {
            C85315al.m146642d(f191668a, " json parse failed " + e.toString());
            m147439a(str, "");
        }
    }
}
