package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commerce.p2513b.DialogC37485a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenHalfDialogMethod */
public final class OpenHalfDialogMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35075a f82761b = new C35075a((byte) 0);

    /* renamed from: c */
    private final String f82762c = "openHalfDialog";

    static {
        Covode.recordClassIndex(42201);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenHalfDialogMethod$a */
    public static final class C35075a {
        static {
            Covode.recordClassIndex(42202);
        }

        private C35075a() {
        }

        public /* synthetic */ C35075a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82762c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenHalfDialogMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        int i;
        int i2;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Context e = mo26893e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity == null) {
            aVar.mo61871a(0, "activity is null");
            return;
        }
        AbstractC28019l a = C28024q.m56139a(jSONObject.toString());
        C89219l.m154716b(a, "");
        C28022o j = a.mo46789j();
        AbstractC28019l c = j.mo46803c("height");
        C89219l.m154716b(c, "");
        int a2 = C34728n.m70947a(activity, c.mo46694g());
        AbstractC28019l c2 = j.mo46803c("schema");
        C89219l.m154716b(c2, "");
        String c3 = c2.mo46689c();
        C89219l.m154716b(c3, "");
        AbstractC28019l c4 = j.mo46803c("borderRadius");
        if (c4 == null || (c4 instanceof C28021n)) {
            i = C34728n.m70946a(8.0d);
        } else {
            i = C34728n.m70947a(activity, c4.mo46694g());
        }
        float f = (float) i;
        AbstractC28019l c5 = j.mo46803c("bgColor");
        if (c5 == null || (c5 instanceof C28021n)) {
            i2 = -1;
        } else {
            i2 = Color.parseColor(c5.mo46689c());
        }
        new DialogC37485a(activity, a2, c3, f, i2).show();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo61874a(jSONObject2);
    }
}
