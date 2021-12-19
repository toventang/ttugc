package com.p2082ss.android.ugc.aweme.kids.setting.items.account;

import android.content.DialogInterface;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.OpenSysDialogMethod */
public final class OpenSysDialogMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C57825a f131866b = new C57825a((byte) 0);

    /* renamed from: c */
    private final String f131867c = "openSysDialog";

    static {
        Covode.recordClassIndex(67830);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.OpenSysDialogMethod$a */
    public static final class C57825a {
        static {
            Covode.recordClassIndex(67831);
        }

        private C57825a() {
        }

        public /* synthetic */ C57825a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f131867c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenSysDialogMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.OpenSysDialogMethod$c */
    static final class DialogInterface$OnClickListenerC57827c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OpenSysDialogMethod f131872a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f131873b;

        /* renamed from: c */
        final /* synthetic */ boolean f131874c;

        /* renamed from: d */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f131875d;

        static {
            Covode.recordClassIndex(67833);
        }

        DialogInterface$OnClickListenerC57827c(OpenSysDialogMethod openSysDialogMethod, JSONObject jSONObject, boolean z, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f131872a = openSysDialogMethod;
            this.f131873b = jSONObject;
            this.f131874c = z;
            this.f131875d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            OpenSysDialogMethod.m104577a(this.f131874c, this.f131875d);
        }
    }

    /* renamed from: a */
    public static void m104577a(boolean z, BaseBridgeMethod.AbstractC34965a aVar) {
        aVar.mo61873a(null, z ? 1 : 0, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.OpenSysDialogMethod$b */
    static final class DialogInterface$OnClickListenerC57826b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OpenSysDialogMethod f131868a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f131869b;

        /* renamed from: c */
        final /* synthetic */ boolean f131870c;

        /* renamed from: d */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f131871d;

        static {
            Covode.recordClassIndex(67832);
        }

        DialogInterface$OnClickListenerC57826b(OpenSysDialogMethod openSysDialogMethod, JSONObject jSONObject, boolean z, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f131868a = openSysDialogMethod;
            this.f131869b = jSONObject;
            this.f131870c = z;
            this.f131871d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            OpenSysDialogMethod.m104577a(!this.f131870c, this.f131871d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        String str;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            if (mo26893e() != null) {
                String optString = jSONObject.optString("content");
                String optString2 = jSONObject.optString("title");
                String optString3 = jSONObject.optString("confirm_text");
                String optString4 = jSONObject.optString("cancel_text");
                boolean optBoolean = jSONObject.optBoolean("swap");
                C17197a.C17200a aVar2 = new C17197a.C17200a(mo26893e());
                aVar2.f41070a = optString2;
                aVar2.f41071b = optString;
                if (optBoolean) {
                    str = optString4;
                } else {
                    str = optString3;
                }
                C17197a.C17200a a = aVar2.mo27192a(str, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC57826b(this, jSONObject, optBoolean, aVar), false);
                if (!optBoolean) {
                    optString3 = optString4;
                }
                a.mo27196b(optString3, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC57827c(this, jSONObject, optBoolean, aVar), false);
                aVar2.mo27193a().mo27184b().setCancelable(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
