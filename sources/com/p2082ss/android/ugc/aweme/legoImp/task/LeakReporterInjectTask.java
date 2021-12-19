package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.liko.p1484b.C20837a;
import com.bytedance.liko.p1484b.C20839c;
import com.bytedance.liko.p1484b.C20840d;
import com.bytedance.liko.p1484b.C20841e;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.newmedia.p2163a.C30122a;
import com.p2082ss.android.p2143g.C29911a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.settings.LikoAnalysisConfig;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LeakReporterInjectTask */
public class LeakReporterInjectTask implements AbstractC58264w {

    /* renamed from: a */
    private final String f132890a = "LeakDetector";

    /* renamed from: b */
    private final long f132891b = 134217728;

    /* renamed from: c */
    private final int f132892c = 2;

    /* renamed from: d */
    private final int f132893d = 18;

    /* renamed from: e */
    private final int f132894e = 9;

    /* renamed from: f */
    private final int f132895f = 9900;

    static {
        Covode.recordClassIndex(68525);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (TextUtils.equals(C17867d.f42595s, "local_test") && C20840d.f49287a) {
            LikoAnalysisConfig d = C29911a.m60290d();
            JSONObject jSONObject = new JSONObject();
            long d2 = C17867d.m33083d();
            try {
                jSONObject.put("strategy", 18);
                jSONObject.put("aid", C17867d.f42590n);
                jSONObject.put("channel", C17867d.f42595s);
                jSONObject.put("device_id", AppLog.getServerDeviceId());
                jSONObject.put("app_version", C17867d.m33085f());
                jSONObject.put("update_version_code", String.valueOf(d2));
                jSONObject.put("current_update_version_code", String.valueOf(C17867d.m33083d()));
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("os_api", Build.VERSION.SDK_INT);
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put("device_brand", Build.BRAND);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put("process_name", C17867d.m33078a().getPackageName());
                jSONObject.put("version_name", C17867d.m33088i());
                jSONObject.put("version_code", (int) C17867d.m33087h());
                jSONObject.put("region", "");
                jSONObject.put("oversea", true);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put("android.app.Activity");
                jSONArray.put("android.app.Fragment");
                jSONArray.put("androidx.fragment.app.Fragment");
                jSONObject.put("detect_leak_classes", jSONArray);
                jSONObject.put("supportBigObjectAnalysis", d.isSupportBigObjectAnalysis());
                jSONObject.put("bigObjectFilterSystem", d.isBigObjectFilterSystem());
                jSONObject.put("bigObjectLatitude", d.getBigObjectLatitude());
                jSONObject.put("supportObjectInstanceAnalysis", d.isSupportObjectInstanceAnalysis());
                jSONObject.put("objectInstanceFilterSystem", d.isObjectInstanceFilterSystem());
                jSONObject.put("objectInstanceLatitude", d.getObjectInstanceLatitude());
                jSONObject.put("supportBitmapAnalysis", d.isSupportBitmapAnalysis());
                jSONObject.put("bitmapLatitude", d.getBitmapLatitude());
                jSONObject.put("release_build", C30122a.m60926a(context).mo53499a("release_build", ""));
                jSONObject.put("bigObjectFilterSystem", false);
                jSONObject.put("objectInstanceFilterSystem", false);
                if (d2 % 9900 != 0) {
                    jSONObject.put("env", "canary");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C20840d.m39190a(jSONObject);
            C20840d.f49288b = 20;
            C20841e.f49294a = new C58441n(this);
            C20837a.f49274b = 300;
            C20837a.f49275c = 10;
            C20837a.f49276d = 60000;
            C20837a.f49273a = true;
            C20841e.f49295b = new C58442o(this);
            C20839c.f49278a = true;
        }
    }
}
