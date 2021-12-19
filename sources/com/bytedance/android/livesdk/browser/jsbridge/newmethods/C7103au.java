package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.kakao.usermgmt.StringSet;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88838v;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.au */
public final class C7103au extends AbstractC18334e<JSONObject, Object> {

    /* renamed from: a */
    DialogC9146a f17707a;

    /* renamed from: b */
    private AbstractC88412b f17708b;

    static {
        Covode.recordClassIndex(7849);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17708b;
        if (bVar != null) {
            bVar.dispose();
        }
        DialogC9146a aVar = this.f17707a;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString(StringSet.type);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
        string.hashCode();
        if (string.equals("show")) {
            DialogC9146a aVar = this.f17707a;
            if (aVar != null) {
                aVar.dismiss();
            }
            DialogC9146a.C9147a aVar2 = new DialogC9146a.C9147a(gVar.f43859a);
            aVar2.f22148c = false;
            aVar2.f22147b = jSONObject3.getString("message");
            DialogC9146a a = aVar2.mo15240a();
            this.f17707a = a;
            a.setCancelable(false);
            this.f17707a.show();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            AbstractC88398aa a2 = C88925a.m154160a(C88946a.f201990b);
            C88466b.m153697a((Object) timeUnit, "unit is null");
            C88466b.m153697a((Object) a2, "scheduler is null");
            this.f17708b = C88925a.m154163a(new C88838v(timeUnit, a2)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C7104av(this), C7105aw.f17710a);
        } else if (string.equals("dismiss")) {
            AbstractC88412b bVar = this.f17708b;
            if (bVar != null) {
                bVar.dispose();
            }
            DialogC9146a aVar3 = this.f17707a;
            if (aVar3 != null) {
                aVar3.dismiss();
            }
            this.f17708b = null;
            this.f17707a = null;
        }
        finishWithSuccess();
    }
}
