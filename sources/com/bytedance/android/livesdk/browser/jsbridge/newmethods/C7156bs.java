package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.C6878k;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bs */
public final class C7156bs extends AbstractC18334e<JSONObject, Object> {

    /* renamed from: a */
    private AbstractC88412b f17836a;

    static {
        Covode.recordClassIndex(7902);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17836a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13374a(C11688a aVar, Context context) {
        if (aVar != null) {
            if (!C11115u.m19743a().mo17915b().mo13165e()) {
                if (context instanceof ActivityC0945e) {
                    AbstractC6872f b = C11115u.m19743a().mo17915b();
                    C6876j.C6877a a = C6876j.m14732a();
                    a.f17232a = C3966y.m9657a((int) R.string.gsw);
                    a.f17234c = -1;
                    a.f17236e = "search_result";
                    a.f17235d = "recommend";
                    a.f17237f = "follow";
                    this.f17836a = b.mo13149a(context, a.mo13173a()).mo143254a(new C7158bu(this, aVar, context), new C7159bv(this));
                }
            } else if (aVar.f27936g) {
                this.f17836a = C11115u.m19743a().mo17915b().mo13150a(((C6865d.AbstractC6866a) new C6865d.C6867b().mo13134a(aVar.f27930a)).mo13138b(aVar.f27931b).mo13140c(aVar.f27932c).mo13141c()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C7160bw(this), new C7161bx(this));
            } else {
                this.f17836a = C11115u.m19743a().mo17915b().mo13152a(((C6878k.C6880b) ((C6878k.AbstractC6879a) new C6878k.C6880b().mo13134a(aVar.f27930a)).mo13176a(aVar.f27932c).mo13174a(aVar.f27934e)).mo13179c()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C7162by(this), new C7163bz(this));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString(StringSet.type);
        JSONObject optJSONObject = jSONObject2.optJSONObject("args");
        if (optJSONObject == null) {
            finishWithFailure();
        } else if (TextUtils.equals("follow", optString)) {
            Context context = gVar.f43859a;
            long parseLong = Long.parseLong(optJSONObject.getString("user_id"));
            long j = 0;
            try {
                j = Long.parseLong(optJSONObject.getString("room_id"));
            } catch (Exception e) {
                C6555i.m14021b();
                C3854a.m9455a(5, "ttlive_exception", e.getStackTrace());
            }
            String string = optJSONObject.getString("from_label");
            String optString2 = optJSONObject.optString("url");
            C11688a aVar = new C11688a();
            aVar.f27935f = C11688a.EnumC11689a.FromWeb;
            aVar.f27930a = parseLong;
            aVar.f27931b = j;
            aVar.f27933d = optString2;
            aVar.f27932c = string;
            aVar.f27936g = true;
            mo13374a(aVar, context);
        } else if (TextUtils.equals("unfollow", optString)) {
            Context context2 = gVar.f43859a;
            long parseLong2 = Long.parseLong(optJSONObject.getString("user_id"));
            String optString3 = optJSONObject.optString("from_label", "");
            C11115u.m19743a().mo17915b().mo13157a(C3966y.m9657a((int) R.string.gk1), new DialogInterface$OnClickListenerC7157bt(this, optJSONObject, parseLong2, optJSONObject.optString("url", ""), optString3, context2), context2, optString3, "", parseLong2);
        } else {
            finishWithFailure();
        }
    }
}
