package com.p2082ss.android.ugc.aweme.compliance.business.policynotice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39248i;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j;
import com.p2082ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.p2082ss.android.ugc.aweme.compliance.api.p2638b.C39229c;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2654a.C39465a;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39487b;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.DialogC39480a;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.PolicyNoticeFullscreenActivity;
import com.p2082ss.android.ugc.aweme.compliance.common.C39591a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a */
public final class C39456a {

    /* renamed from: a */
    public static C39248i f93105a;

    /* renamed from: b */
    public static C39248i f93106b;

    /* renamed from: c */
    public static C39248i f93107c;

    /* renamed from: d */
    public static C39248i f93108d;

    /* renamed from: e */
    public static List<C39248i> f93109e = C89086z.INSTANCE;

    /* renamed from: f */
    public static int f93110f;

    /* renamed from: g */
    public static final C39456a f93111g = new C39456a();

    /* renamed from: h */
    private static final AbstractC89244h f93112h = C89250i.m154773a((AbstractC89171a) C39464g.f93128a);

    /* renamed from: a */
    public static C39465a m80151a() {
        return (C39465a) f93112h.getValue();
    }

    private C39456a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a$e */
    public static final class RunnableC39462e implements Runnable {

        /* renamed from: a */
        public static final RunnableC39462e f93120a = new RunnableC39462e();

        static {
            Covode.recordClassIndex(47151);
        }

        RunnableC39462e() {
        }

        public final void run() {
            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.POLICY_NOTICE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a$g */
    static final class C39464g extends AbstractC89220m implements AbstractC89171a<C39465a> {

        /* renamed from: a */
        public static final C39464g f93128a = new C39464g();

        static {
            Covode.recordClassIndex(47153);
        }

        C39464g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39465a invoke() {
            return new C39465a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a$b */
    public static final class RunnableC39459b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39248i f93115a;

        /* renamed from: b */
        final /* synthetic */ Activity f93116b;

        static {
            Covode.recordClassIndex(47148);
        }

        RunnableC39459b(C39248i iVar, Activity activity) {
            this.f93115a = iVar;
            this.f93116b = activity;
        }

        public final void run() {
            new DialogC39480a(this.f93116b, this.f93115a).show();
            C39456a.f93106b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a$c */
    public static final class RunnableC39460c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39248i f93117a;

        /* renamed from: b */
        final /* synthetic */ Activity f93118b;

        static {
            Covode.recordClassIndex(47149);
        }

        RunnableC39460c(C39248i iVar, Activity activity) {
            this.f93117a = iVar;
            this.f93118b = activity;
        }

        public final void run() {
            new C39487b(this.f93118b, this.f93117a).mo68934a();
            C39456a.f93107c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a$d */
    public static final class RunnableC39461d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f93119a;

        static {
            Covode.recordClassIndex(47150);
        }

        RunnableC39461d(Activity activity) {
            this.f93119a = activity;
        }

        public final void run() {
            SmartRouter.buildRoute(this.f93119a, "//policynotice/fullscreen").open();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a$a */
    public static final class C39457a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39249j f93113a;

        static {
            Covode.recordClassIndex(47146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39457a(C39249j jVar) {
            super(0);
            this.f93113a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a((Object) this.f93113a.f92726k, (Object) true)) {
                new Handler().postDelayed(RunnableC394581.f93114a, 500);
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(47145);
    }

    /* renamed from: c */
    public static void m80160c() {
        AbstractC81915c.m141874a(new C47959j("notification", new JSONObject().put("eventName", "cancel_post_success")));
    }

    /* renamed from: b */
    public static void m80159b() {
        Activity j = C17873f.m33102j();
        if (f93108d == null) {
            C39248i iVar = f93105a;
            if (iVar != null) {
                AbstractC81915c.m141874a(new C39229c(iVar));
                f93105a = null;
                return;
            }
            C39248i iVar2 = f93106b;
            if (iVar2 == null) {
                C39248i iVar3 = f93107c;
                if (iVar3 == null) {
                    if (j != null) {
                        j.runOnUiThread(RunnableC39462e.f93120a);
                    }
                    C39591a.m80380a(null);
                } else if (j != null) {
                    j.runOnUiThread(new RunnableC39460c(iVar3, j));
                }
            } else if (j != null) {
                j.runOnUiThread(new RunnableC39459b(iVar2, j));
            }
        } else if (j != null) {
            j.runOnUiThread(new RunnableC39461d(j));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a$f */
    public static final class C39463f extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f93121a;

        /* renamed from: b */
        final /* synthetic */ String f93122b;

        /* renamed from: c */
        final /* synthetic */ PolicyBodyLinkList f93123c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f93124d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f93125e;

        /* renamed from: f */
        final /* synthetic */ int f93126f;

        /* renamed from: g */
        final /* synthetic */ int f93127g;

        static {
            Covode.recordClassIndex(47152);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            Boolean bool;
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f93121a, this.f93122b).withParam("use_webview_title", true).open();
            PolicyBodyLinkList policyBodyLinkList = this.f93123c;
            Boolean bool2 = null;
            if (policyBodyLinkList != null) {
                bool = policyBodyLinkList.getApprove();
            } else {
                bool = null;
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                this.f93124d.invoke(new C39249j(null, null, null, this.f93123c.getExtra(), this.f93123c.getOperation(), null, null, null, null, 1967));
            }
            PolicyBodyLinkList policyBodyLinkList2 = this.f93123c;
            if (policyBodyLinkList2 != null) {
                bool2 = policyBodyLinkList2.getDismiss();
            }
            if (C89219l.m154714a((Object) bool2, (Object) true)) {
                this.f93125e.invoke();
            }
        }

        C39463f(Context context, String str, PolicyBodyLinkList policyBodyLinkList, AbstractC89172b bVar, AbstractC89171a aVar, int i, int i2) {
            this.f93121a = context;
            this.f93122b = str;
            this.f93123c = policyBodyLinkList;
            this.f93124d = bVar;
            this.f93125e = aVar;
            this.f93126f = i;
            this.f93127g = i2;
        }
    }

    /* renamed from: a */
    private static void m80152a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m80157a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("tns_general_dialog_show", new C33744d().mo59983a("business", str).mo59983a("style", str2).f79943a);
    }

    /* renamed from: a */
    private static void m80156a(String str, Context context) {
        T t;
        String style;
        Iterator<T> it = f93109e.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
        } while (!C89219l.m154714a((Object) t.getBusiness(), (Object) str));
        T t2 = t;
        if (t2 != null && (style = t2.getStyle()) != null) {
            switch (style.hashCode()) {
                case -1383228885:
                    if (style.equals("bottom")) {
                        new DialogC39480a(context, t2).show();
                        return;
                    }
                    return;
                case 111185:
                    if (style.equals("pop")) {
                        new C39487b(context, t2).mo68934a();
                        return;
                    }
                    return;
                case 97526364:
                    if (style.equals("float")) {
                        AbstractC81915c.m141874a(new C39229c(t2));
                        return;
                    }
                    return;
                case 110066619:
                    if (style.equals("fullscreen")) {
                        f93108d = t2;
                        m80152a(context, new Intent(context, PolicyNoticeFullscreenActivity.class));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static void m80154a(C39248i iVar, C39249j jVar, int i) {
        String str;
        String str2;
        C89219l.m154721d(jVar, "");
        C39465a aVar = new C39465a();
        String str3 = null;
        if (iVar != null) {
            str3 = iVar.getBusiness();
            str = iVar.getPolicyVersion();
            str2 = iVar.getStyle();
        } else {
            str = null;
            str2 = null;
        }
        aVar.mo68919a(str3, str, str2, jVar.f92720e, jVar.f92722g, Integer.valueOf(i), new C39457a(jVar));
    }

    /* renamed from: a */
    public static void m80158a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a("qa_tns_general_dialog_click", new C33744d().mo59983a("business", str2).mo59983a("style", str3).mo59983a("button_info", str).f79943a);
    }

    /* renamed from: a */
    public static void m80155a(C39249j jVar, Context context, AbstractC89172b<? super C39249j, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        String str = jVar.f92718c;
        int hashCode = str.hashCode();
        if (hashCode != -1052618729) {
            if (hashCode != -172220347) {
                if (hashCode != 3277) {
                    if (hashCode == 111185 && str.equals("pop")) {
                        m80156a(jVar.f92723h, context);
                    }
                } else if (str.equals("h5")) {
                    Intent intent = new Intent(context, CrossPlatformActivity.class);
                    intent.setData(Uri.parse(jVar.f92719d));
                    intent.putExtra("use_webview_title", true);
                    m80152a(context, intent);
                }
            } else if (str.equals("callback")) {
                bVar.invoke(jVar);
            }
        } else if (str.equals("native")) {
            SmartRouter.buildRoute(context, jVar.f92719d).open();
        }
        if (jVar.f92721f) {
            bVar.invoke(jVar);
        }
        if (C89219l.m154714a((Object) jVar.f92724i, (Object) true)) {
            aVar.invoke();
        }
        if (C89219l.m154714a((Object) jVar.f92725j, (Object) true)) {
            m80160c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r1 == null) goto L_0x005f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder m80150a(android.content.Context r17, java.lang.String r18, java.util.List<com.p2082ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList> r19, p4600h.p4611f.p4612a.AbstractC89172b<? super com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j, p4600h.C89391z> r20, p4600h.p4611f.p4612a.AbstractC89171a<p4600h.C89391z> r21) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a.m80150a(android.content.Context, java.lang.String, java.util.List, h.f.a.b, h.f.a.a):android.text.SpannableStringBuilder");
    }
}
