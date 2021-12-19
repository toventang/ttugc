package com.p2082ss.android.ugc.aweme.lancet;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1007g.C14853c;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.setting.C68052ce;
import com.p2082ss.android.ugc.aweme.setting.model.C68185n;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.lancet.I18nLancet */
public final class I18nLancet {

    /* renamed from: a */
    public static String f132194a;

    static {
        Covode.recordClassIndex(68035);
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.I18nLancet$AmeActivityResumeRun */
    public static class AmeActivityResumeRun implements AbstractC58264w {

        /* renamed from: a */
        private WeakReference<Activity> f132195a;

        static {
            Covode.recordClassIndex(68036);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
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

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            if (C14853c.f36267d && C16048b.m29633a().mo25420a("fix_active_user_experiment", ClientExpManager.fix_active_user_experiment())) {
                return EnumC58151ae.MAIN;
            }
            return EnumC58151ae.BOOT_FINISH;
        }

        public AmeActivityResumeRun(Activity activity) {
            this.f132195a = new WeakReference<>(activity);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            Activity activity = this.f132195a.get();
            if (!(Build.VERSION.SDK_INT == 18 || activity == null)) {
                TTNetInit.onActivityResume(activity);
            }
            if (C16048b.m29633a().mo25412a(true, "use_new_app_alert", 0) == 0) {
                AppLog.activeUser(C17867d.m33078a());
            }
            C68052ce ceVar = C68052ce.f152437b;
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = C68052ce.m120353b();
            }
            if (C58029j.f132256h) {
                for (int i = 0; i < ceVar.f152438c.size(); i++) {
                    C68185n valueAt = ceVar.f152438c.valueAt(i);
                    int keyAt = ceVar.f152438c.keyAt(i);
                    if (valueAt != null && !valueAt.f152665a) {
                        if (valueAt.f152667c == 3) {
                            valueAt.f152665a = true;
                            valueAt.f152667c = 0;
                        } else {
                            if (System.currentTimeMillis() - valueAt.f152666b > ((long) (30000 >> valueAt.f152667c))) {
                                valueAt.f152667c++;
                                C33830n.m70668a("aweme_setting_retry_policy", new C33743c().mo59976a("group_id", String.valueOf(keyAt)).mo59974a("fetch_url_retry_count", Integer.valueOf(valueAt.f152667c)).mo59975a("time_interval", Long.valueOf(System.currentTimeMillis() - valueAt.f152666b)).mo59977a());
                                valueAt.f152668d.cG_();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m104816a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.isNull(str)) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
