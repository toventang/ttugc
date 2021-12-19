package com.p2082ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.google.firebase.C27695b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.task.InitFireBase */
public class InitFireBase implements AbstractC58084a, AbstractC58264w {
    static {
        Covode.recordClassIndex(68733);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: d */
    public final int mo28604d() {
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
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: e */
    public final EnumC58149ac mo28605e() {
        return EnumC58149ac.CPU;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return new String[]{"AccountInitializerTask"};
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        try {
            C27695b.m55373a(context);
        } catch (Exception e) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_reason", e.toString());
                C12290b.m22066a("firebase_initialize_error", jSONObject, (JSONObject) null, (JSONObject) null);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
        }
        if (C29843f.m60129a(context)) {
            try {
                FirebaseMessaging.m55759a();
                C34822d.m71158a(C27695b.m55376d().mo46324a(), "com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", true).apply();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            String serverDeviceId = AppLog.getServerDeviceId();
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
            if (!TextUtils.isEmpty(serverDeviceId)) {
                instance.mo46310a(serverDeviceId);
            }
            FirebaseAnalytics.getInstance(context).mo46309a().mo41870a(C58465c.f133100a);
            if (C80580in.m139687c()) {
                instance.mo46312a(false);
            } else {
                instance.mo46312a(true);
            }
        }
    }
}
