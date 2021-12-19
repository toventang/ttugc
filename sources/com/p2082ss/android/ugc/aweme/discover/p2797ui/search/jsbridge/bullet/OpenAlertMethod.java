package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42912b;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenAlertMethod */
public final class OpenAlertMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public AbstractC16183k.AbstractC16185b f100082b;

    /* renamed from: c */
    private final String f100083c = "openAlert";

    static {
        Covode.recordClassIndex(51037);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenAlertMethod$d */
    public static final class C42926d implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f100090a;

        /* renamed from: b */
        final /* synthetic */ String f100091b;

        /* renamed from: c */
        final /* synthetic */ String f100092c;

        /* renamed from: d */
        private final String f100093d = "onAlertButtonClickAction";

        static {
            Covode.recordClassIndex(51041);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f100093d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f100090a;
        }

        C42926d(String str, String str2) {
            this.f100091b = str;
            this.f100092c = str2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op_args", str);
            jSONObject.put("alert_id", str2);
            this.f100090a = jSONObject;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100083c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAlertMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenAlertMethod$a */
    static final class DialogInterface$OnClickListenerC42923a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OpenAlertMethod f100084a;

        /* renamed from: b */
        final /* synthetic */ String f100085b;

        static {
            Covode.recordClassIndex(51038);
        }

        DialogInterface$OnClickListenerC42923a(OpenAlertMethod openAlertMethod, String str) {
            this.f100084a = openAlertMethod;
            this.f100085b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f100084a.mo73135a("cancel", this.f100085b);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenAlertMethod$b */
    static final class DialogInterface$OnClickListenerC42924b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OpenAlertMethod f100086a;

        /* renamed from: b */
        final /* synthetic */ String f100087b;

        static {
            Covode.recordClassIndex(51039);
        }

        DialogInterface$OnClickListenerC42924b(OpenAlertMethod openAlertMethod, String str) {
            this.f100086a = openAlertMethod;
            this.f100087b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f100086a.mo73135a("center", this.f100087b);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenAlertMethod$c */
    static final class DialogInterface$OnClickListenerC42925c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OpenAlertMethod f100088a;

        /* renamed from: b */
        final /* synthetic */ String f100089b;

        static {
            Covode.recordClassIndex(51040);
        }

        DialogInterface$OnClickListenerC42925c(OpenAlertMethod openAlertMethod, String str) {
            this.f100088a = openAlertMethod;
            this.f100089b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f100088a.mo73135a("confirm", this.f100089b);
            dialogInterface.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        super.mo25748a(jSONObject, bVar);
        this.f100082b = bVar;
    }

    /* renamed from: a */
    public final void mo73135a(String str, String str2) {
        try {
            C42926d dVar = new C42926d(str, str2);
            AbstractC16208i h = mo61867h();
            if (h != null) {
                h.onEvent(dVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        JSONObject jSONObject2;
        String str;
        String str2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("content");
            boolean optBoolean = jSONObject.optBoolean("cancelable");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("buttons");
            String optString3 = jSONObject.optString("id");
            String str3 = null;
            if (optJSONObject3 != null) {
                jSONObject2 = optJSONObject3.optJSONObject("cancel");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                str = jSONObject2.optString("text");
            } else {
                str = null;
            }
            if (optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("center")) == null) {
                str2 = null;
            } else {
                str2 = optJSONObject2.optString("text");
            }
            if (!(optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("confirm")) == null)) {
                str3 = optJSONObject.optString("text");
            }
            Activity j = C17873f.m33102j();
            if (j != null) {
                C17197a.C17200a aVar2 = new C17197a.C17200a(j);
                if (!TextUtils.isEmpty(optString)) {
                    aVar2.f41070a = optString;
                }
                if (!TextUtils.isEmpty(optString2)) {
                    aVar2.f41071b = optString2;
                }
                aVar2.f41067M = optBoolean;
                if (!TextUtils.isEmpty(str)) {
                    aVar2.mo27196b(str, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC42923a(this, optString3), false);
                }
                if (!TextUtils.isEmpty(str2)) {
                    aVar2.f41059E = true;
                }
                aVar2.mo27197c(str2, new DialogInterface$OnClickListenerC42924b(this, optString3), false);
                if (!TextUtils.isEmpty(str3)) {
                    aVar2.mo27192a(str3, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC42925c(this, optString3), false);
                }
                aVar2.mo27193a().mo27185c();
            }
        } catch (Exception e) {
            C42912b.m85668a(e, "GetSearchHistoryMethod");
            aVar.mo61871a(0, e.getMessage());
            e.printStackTrace();
        }
    }
}
