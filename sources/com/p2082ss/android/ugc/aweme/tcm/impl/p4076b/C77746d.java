package com.p2082ss.android.ugc.aweme.tcm.impl.p4076b;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.p2082ss.android.ugc.aweme.profile.model.BcUsageConfirmThreshold;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77759b;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77762e;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.d */
public final class C77746d {

    /* renamed from: a */
    public static final C77746d f174341a = new C77746d();

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.d$a */
    public static final class C77747a implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f174342a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f174343b;

        /* renamed from: c */
        private final String f174344c = "notification";

        static {
            Covode.recordClassIndex(90807);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f174344c;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f174342a;
        }

        C77747a(JSONObject jSONObject) {
            this.f174343b = jSONObject;
            this.f174342a = jSONObject;
        }
    }

    private C77746d() {
    }

    static {
        Covode.recordClassIndex(90806);
    }

    /* renamed from: a */
    public static boolean m135842a() {
        TcmConfig a;
        TcmConfig a2 = C77762e.m135852a();
        if (a2 == null || !a2.isTcmCreator() || (a = C77762e.m135852a()) == null || !a.getUseNewTcmToggle()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m135843b() {
        BcUsageConfirmThreshold bcUsageConfirmThreshold;
        TcmConfig a = C77762e.m135852a();
        if (a == null || (bcUsageConfirmThreshold = a.getBcUsageConfirmThreshold()) == null) {
            return false;
        }
        return bcUsageConfirmThreshold.getApp();
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.d$d */
    public static final class C77750d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f174349a;

        static {
            Covode.recordClassIndex(90810);
        }

        public C77750d(Context context) {
            this.f174349a = context;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f174349a, R.color.a2));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            String str;
            C89219l.m154721d(view, "");
            BrandedContentToolSchema a = C77759b.m135850a();
            if (a == null || (str = a.brandedContentPolicy) == null) {
                str = "https://www.tiktok.com/falcon/forest/nebula/content_tool?hide_nav_bar=1";
            }
            SmartRouter.buildRoute(this.f174349a, "aweme://webview/").withParam("url", Uri.parse(str).buildUpon().appendQueryParameter("page", "music").appendQueryParameter("music_type", "general").build().toString()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.d$b */
    public static final class DialogInterface$OnClickListenerC77748b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C18288a f174345a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16208i f174346b;

        static {
            Covode.recordClassIndex(90808);
        }

        public DialogInterface$OnClickListenerC77748b(C18288a aVar, AbstractC16208i iVar) {
            this.f174345a = aVar;
            this.f174346b = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C77746d.m135841a(this.f174345a, this.f174346b, "1");
            C39162r.m79460a("tcm_bctoggle_msc_popup_click", new C33744d().mo59983a("click_button", "accept_confirmation").f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.d$c */
    public static final class DialogInterface$OnClickListenerC77749c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C18288a f174347a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16208i f174348b;

        static {
            Covode.recordClassIndex(90809);
        }

        public DialogInterface$OnClickListenerC77749c(C18288a aVar, AbstractC16208i iVar) {
            this.f174347a = aVar;
            this.f174348b = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C77746d.m135841a(this.f174347a, this.f174348b, "0");
            C39162r.m79460a("tcm_bctoggle_msc_popup_click", new C33744d().mo59983a("click_button", "cancel").f79943a);
        }
    }

    /* renamed from: a */
    public static void m135841a(C18288a aVar, AbstractC16208i iVar, String str) {
        JSONObject jSONObject = new JSONObject();
        new HashMap();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_agreed", str);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "bc_music_alert_confirm");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (aVar != null) {
            aVar.mo29252b("notification", jSONObject);
        }
        if (iVar != null) {
            iVar.onEvent(new C77747a(jSONObject));
        }
    }
}
