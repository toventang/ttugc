package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.facebook.applinks.C24009a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.ActivityRouterServiceImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.money.growth.C60180e;
import com.p2082ss.android.ugc.aweme.net.C61305b;
import com.p2082ss.android.ugc.aweme.net.EnumC61379i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.p4372b.C85078a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AppLinkDataTask */
public class AppLinkDataTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68399);
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

    /* renamed from: b */
    private void m105447b(final Context context) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        C24009a.m45434a(context, new C24009a.AbstractC24011a() {
            /* class com.p2082ss.android.ugc.aweme.legoImp.task.AppLinkDataTask.C583081 */

            static {
                Covode.recordClassIndex(68400);
            }

            @Override // com.facebook.applinks.C24009a.AbstractC24011a
            /* renamed from: a */
            public final void mo39531a(C24009a aVar) {
                Bundle bundle;
                String uri;
                if (aVar != null && (bundle = aVar.f56853d) != null) {
                    String string = bundle.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                    if (!TextUtils.isEmpty(string) && !C60180e.f137181g.mo97855a(string)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("channel", "facebook");
                            jSONObject.put("url", string);
                            if (aVar.f56851b == null) {
                                uri = "";
                            } else {
                                uri = aVar.f56851b.toString();
                            }
                            jSONObject.put("target", uri);
                            jSONObject.put("total_time", SystemClock.uptimeMillis() - C58945a.C58947b.f134185a.f134181h);
                            jSONObject.put("fetch_time", SystemClock.uptimeMillis() - uptimeMillis);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C12290b.m22064a("deep_link", jSONObject);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C29934d("facebook_code_start_url", string));
                        new C61305b(C85078a.f190360a, EnumC61379i.POST, arrayList, String.class).mo98934a(C17867d.m33078a());
                        Intent intent = new Intent(context, ActivityRouterServiceImpl.m65216b().mo57026a());
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(aVar.f56851b);
                        intent.putExtra("dl_from", "facebook");
                        intent.addFlags(268435456);
                        intent.putExtra("from_notification", false);
                        intent.putExtra("from_task", true);
                        Context context = context;
                        C84349a.m145093a(intent, context);
                        context.startActivity(intent);
                    }
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (SettingsManager.m29616a().mo25400a("fb_ddl_switch", true)) {
            try {
                m105447b(context);
            } catch (C24798j | NullPointerException e) {
                C13468b.m24211a(e, "fetchDeferredAppLinkData first failed");
                try {
                    C24872m.f59041a = "1862952583919182";
                    m105447b(context);
                } catch (C24798j | NullPointerException e2) {
                    C13468b.m24211a(e2, "fetchDeferredAppLinkData retry failed");
                }
            }
        }
    }
}
