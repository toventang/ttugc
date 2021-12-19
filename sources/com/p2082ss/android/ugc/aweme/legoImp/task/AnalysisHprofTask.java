package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.liko.p1484b.C20840d;
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
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask */
public final class AnalysisHprofTask implements AbstractC58264w {

    /* renamed from: a */
    public static volatile boolean f132794a;

    /* renamed from: b */
    public static final C58306a f132795b = new C58306a((byte) 0);

    static {
        Covode.recordClassIndex(68392);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask$a */
    public static final class C58306a {
        static {
            Covode.recordClassIndex(68393);
        }

        private C58306a() {
        }

        public /* synthetic */ C58306a(byte b) {
            this();
        }
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
        if (C29911a.m60289c()) {
            LikoAnalysisConfig d = C29911a.m60290d();
            C89219l.m154716b(d, "");
            try {
                f132794a = true;
                JSONObject jSONObject = new JSONObject();
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (!SettingsManager.m29616a().mo25400a("enable_upload_hporf", false)) {
                        f132794a = false;
                        return;
                    }
                    jSONObject.put("strategy", 18);
                    jSONObject.put("aid", C17867d.f42590n);
                    jSONObject.put("channel", C17867d.f42595s);
                    jSONObject.put("device_id", AppLog.getServerDeviceId());
                    jSONObject.put("app_version", C17867d.m33085f());
                    jSONObject.put("update_version_code", String.valueOf(C17867d.m33083d()));
                    jSONObject.put("current_update_version_code", String.valueOf(C17867d.m33083d()));
                    jSONObject.put("os_version", Build.VERSION.RELEASE);
                    jSONObject.put("os_api", Build.VERSION.SDK_INT);
                    jSONObject.put("device_model", Build.MODEL);
                    jSONObject.put("device_brand", Build.BRAND);
                    jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                    jSONObject.put("process_name", C17867d.m33078a().getPackageName());
                    jSONObject.put("version_code", (int) C17867d.m33087h());
                    jSONObject.put("region", "");
                    jSONObject.put("oversea", true);
                    jSONObject.put("delete_dump_file", true);
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
                    jSONObject.put("bitmapLatitude", (long) d.getBitmapLatitude());
                    jSONObject.put("release_build", C30122a.m60926a(context).mo53499a("release_build", ""));
                    String i2 = C17867d.m33088i();
                    jSONObject.put("version_name", i2);
                    int charAt = i2.charAt(i2.length() - 1) - '0';
                    if (charAt > 0 && charAt < 4) {
                        jSONObject.put("env", "canary");
                    }
                    C20840d.m39190a(jSONObject);
                    f132794a = false;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } catch (Throwable unused) {
                f132794a = false;
            }
        }
    }
}
