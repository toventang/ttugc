package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod */
public final class NoticePermissionMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35032a f82639b = new C35032a((byte) 0);

    /* renamed from: c */
    private final String f82640c = "noticePermission";

    static {
        Covode.recordClassIndex(42130);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod$a */
    public static final class C35032a {
        static {
            Covode.recordClassIndex(42131);
        }

        private C35032a() {
        }

        public /* synthetic */ C35032a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82640c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticePermissionMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Activity activity;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Context e = mo26893e();
        if (e != null && (e instanceof Activity) && (activity = (Activity) e) != null && C33067a.m67726a(activity, true)) {
            boolean optBoolean = jSONObject.optBoolean("toOpen");
            if (!C80428fg.m139432a(e)) {
                if (optBoolean) {
                    try {
                        C80428fg.m139435c(e);
                    } catch (Exception unused) {
                        Intent intent = new Intent("android.settings.SETTINGS");
                        C84349a.m145093a(intent, e);
                        e.startActivity(intent);
                    }
                }
                aVar.mo61871a(0, "");
                return;
            }
            aVar.mo61872a("");
        }
    }
}
