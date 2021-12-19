package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41235i;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41237j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.qrcode.view.ProgressDialogC66468a;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod */
public final class OpenLongVideoMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35076a f82763b = new C35076a((byte) 0);

    /* renamed from: c */
    private ProgressDialogC66468a f82764c;

    /* renamed from: d */
    private String f82765d = "";

    /* renamed from: e */
    private final String f82766e = "open_long_video";

    /* renamed from: f */
    private AbstractC16183k.EnumC16184a f82767f = AbstractC16183k.EnumC16184a.PRIVATE;

    static {
        Covode.recordClassIndex(42203);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e, com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod$a */
    public static final class C35076a {
        static {
            Covode.recordClassIndex(42204);
        }

        private C35076a() {
        }

        public /* synthetic */ C35076a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82767f;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82766e;
    }

    /* renamed from: g */
    public final void mo61906g() {
        ProgressDialogC66468a aVar;
        Context e = mo26893e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null && !activity.isFinishing() && (aVar = this.f82764c) != null && aVar.isShowing()) {
            try {
                ProgressDialogC66468a aVar2 = this.f82764c;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82767f = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod$b */
    public static final class C35077b implements AbstractC41240m {

        /* renamed from: a */
        final /* synthetic */ OpenLongVideoMethod f82768a;

        /* renamed from: b */
        final /* synthetic */ C41237j f82769b;

        static {
            Covode.recordClassIndex(42205);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
        /* renamed from: a */
        public final void mo61907a(Aweme aweme) {
            C89219l.m154721d(aweme, "");
            this.f82768a.mo61906g();
            this.f82769b.mo67840h();
            this.f82769b.ck_();
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
        /* renamed from: b_ */
        public final void mo61908b_(Exception exc) {
            C89219l.m154721d(exc, "");
            this.f82768a.mo61906g();
            this.f82769b.mo67840h();
            this.f82769b.ck_();
        }

        C35077b(OpenLongVideoMethod openLongVideoMethod, C41237j jVar) {
            this.f82768a = openLongVideoMethod;
            this.f82769b = jVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenLongVideoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String str = null;
        if (!jSONObject.has("aweme_id")) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.f82765d = jSONObject.optString("react_id");
            String optString = jSONObject.optString("aweme_id");
            jSONObject.optDouble("current_time");
            jSONObject.optString("enter_from");
            Context e = mo26893e();
            if (e != null) {
                C89219l.m154716b(optString, "");
                Resources resources = e.getResources();
                if (resources != null) {
                    str = resources.getString(R.string.cxn);
                }
                ProgressDialogC66468a a = ProgressDialogC66468a.m118220a(e, str);
                this.f82764c = a;
                if (a != null) {
                    a.setIndeterminate(false);
                }
                C41237j jVar = new C41237j();
                jVar.mo67839a_(new C35077b(this, jVar));
                jVar.mo67838a(new C41235i());
                jVar.mo57616a(optString);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo61874a(jSONObject2);
    }
}
