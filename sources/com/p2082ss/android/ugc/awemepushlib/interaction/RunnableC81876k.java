package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.push.C21757a;
import com.bytedance.push.C21761b;
import com.bytedance.push.C21767c;
import com.bytedance.push.C21788d;
import com.bytedance.push.PushBody;
import com.bytedance.push.notification.C21879h;
import com.bytedance.push.p1589b.C21765d;
import com.bytedance.push.p1590c.AbstractC21777h;
import com.bytedance.push.p1590c.AbstractC21783n;
import com.bytedance.push.p1590c.AbstractC21785p;
import com.bytedance.push.p1599j.C21847a;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.newmedia.redbadge.C30191g;
import com.p2082ss.android.pushmanager.p2173b.C30215b;
import com.p2082ss.android.pushmanager.setting.C30221b;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.awemepushlib.manager.C81900a;
import com.p2082ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.awemepushlib.interaction.k */
public final /* synthetic */ class RunnableC81876k implements Runnable {

    /* renamed from: a */
    private final boolean f183040a;

    /* renamed from: b */
    private final Context f183041b;

    static {
        Covode.recordClassIndex(95290);
    }

    RunnableC81876k(boolean z, Context context) {
        this.f183040a = z;
        this.f183041b = context;
    }

    public final void run() {
        Throwable th;
        boolean z = this.f183040a;
        Context context = this.f183041b;
        C81859c.m141752a("method_push_start_on_application");
        try {
            AbstractC21777h hVar = C21761b.f51571a;
            C21757a aVar = new C21757a();
            aVar.f51561a = C17867d.f42590n;
            aVar.f51566f = C17867d.m33081b();
            aVar.f51565e = C17867d.f42595s;
            aVar.f51564d = (int) C17867d.m33083d();
            aVar.f51562b = (int) C17867d.m33087h();
            aVar.f51563c = C17867d.m33088i();
            C21767c.C21768a aVar2 = new C21767c.C21768a((Application) C17867d.m33078a(), aVar);
            aVar2.f51608b = false;
            aVar2.f51617k = true;
            aVar2.f51628v = true;
            aVar2.f51627u = new C81865h();
            aVar2.f51615i = C81887u.f183051a;
            aVar2.f51609c = C29843f.m60132b(C17867d.m33078a());
            aVar2.f51610d = new C21767c.C21769b("push", "");
            aVar2.f51621o = C81888v.f183052a;
            aVar2.f51613g = new AbstractC21783n() {
                /* class com.p2082ss.android.ugc.awemepushlib.interaction.C81885t.C818861 */

                static {
                    Covode.recordClassIndex(95300);
                }

                @Override // com.bytedance.push.p1590c.AbstractC21783n
                /* renamed from: a */
                public final boolean mo35461a(Context context, int i, PushBody pushBody) {
                    MessageShowHandler.m141810a(context, 1, pushBody.mo35387a(), i);
                    return true;
                }
            };
            aVar2.f51612f = new C81860d();
            C30191g gVar = new C30191g();
            if (!aVar2.f51611e.contains(gVar)) {
                aVar2.f51611e.add(gVar);
            }
            aVar2.f51622p = C81889w.f183053a;
            C21757a aVar3 = aVar2.f51624r;
            if (aVar3 == null) {
                aVar2.mo35411a("appinfo is null");
            } else {
                if (aVar3.f51561a <= 0) {
                    aVar2.mo35411a(" aid {" + aVar3.f51561a + "} is invalid");
                }
                if (TextUtils.isEmpty(aVar3.f51566f)) {
                    aVar2.mo35411a("appName {" + aVar3.f51566f + "} is invalid");
                }
                if (TextUtils.isEmpty(aVar3.f51563c)) {
                    aVar2.mo35411a("versionName {" + aVar3.f51563c + "} is invalid");
                }
                if (aVar3.f51562b <= 0) {
                    aVar2.mo35411a("versionCode {" + aVar3.f51562b + "} is invalid");
                }
                if (aVar3.f51564d <= 0) {
                    aVar2.mo35411a("updateVersionCode {" + aVar3.f51564d + "} is invalid");
                }
                if (TextUtils.isEmpty(aVar3.f51565e)) {
                    aVar2.mo35411a("channel {" + aVar3.f51565e + "} is invalid");
                }
            }
            if (aVar2.f51612f == null) {
                aVar2.mo35411a("please implement the event callback");
            }
            if (aVar2.f51621o == null) {
                aVar2.mo35411a("click event listener is null, you'll not receive the event when user click notifications.Please implement it.");
            }
            if (TextUtils.isEmpty(aVar2.f51609c)) {
                aVar2.f51609c = C29843f.m60132b(aVar2.f51607a);
            }
            if (aVar2.f51618l == null) {
                aVar2.f51618l = new C21788d();
            }
            if (aVar2.f51620n == null) {
                aVar2.f51620n = new C21765d();
            }
            if (aVar2.f51623q == null) {
                aVar2.f51623q = new AbstractC21785p.C21786a();
            }
            if (aVar2.f51627u == null) {
                aVar2.f51627u = new C21847a();
            }
            C21879h hVar2 = new C21879h(aVar2.f51613g, aVar2.f51620n);
            try {
                hVar.mo35436a(new C21767c(aVar2.f51607a, aVar2.f51624r, aVar2.f51608b, aVar2.f51609c, aVar2.f51610d, aVar2.f51611e, aVar2.f51612f, hVar2, aVar2.f51614h, aVar2.f51615i, aVar2.f51616j, aVar2.f51618l, aVar2.f51619m, aVar2.f51621o, aVar2.f51622p, aVar2.f51623q, aVar2.f51625s, aVar2.f51626t, aVar2.f51627u, aVar2, (byte) 0));
                if (z) {
                    C30215b.m61118a();
                    C30221b.m61148b().mo35444a(C81900a.m141823a().mo125553a(context));
                    C81900a.m141823a().mo125560e(context);
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            C21761b.m40732a(context).mo35442a();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("location", "constructInitPush");
                    jSONObject.put("errorDesc", th.getMessage());
                    C34611o.m70668a("aweme_nofatal_track", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                C81859c.m141753b("method_push_start_on_application");
            }
        } catch (Throwable th3) {
            th = th3;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("location", "constructInitPush");
            jSONObject2.put("errorDesc", th.getMessage());
            C34611o.m70668a("aweme_nofatal_track", jSONObject2);
            C81859c.m141753b("method_push_start_on_application");
        }
        C81859c.m141753b("method_push_start_on_application");
    }
}
