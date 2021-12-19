package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2727db.C40937d;
import com.p2082ss.android.ugc.aweme.p3070im.C53602f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.NotificationManagerServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56212h;
import com.p2082ss.android.ugc.aweme.setting.p3713a.C67968a;
import com.p2082ss.android.ugc.aweme.setting.p3717e.C68075a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.cell.CommonItemViewCell;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68546a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68368j;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68375m;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3730c.C68376a;
import com.p2082ss.android.ugc.aweme.setting.services.C68431e;
import com.p2082ss.android.ugc.aweme.setting.services.C68434h;
import com.p2082ss.android.ugc.aweme.setting.unit.p3736a.C68616a;
import com.p2082ss.android.ugc.aweme.setting.utils.C68689d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.aweme.utils.C80429fh;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.a */
public final class C68378a extends AbstractC34586a implements AbstractC68350b, AbstractC68351c {

    /* renamed from: A */
    C40937d f153029A;

    /* renamed from: B */
    C40937d f153030B;

    /* renamed from: C */
    C40937d f153031C;

    /* renamed from: D */
    C40937d f153032D;

    /* renamed from: E */
    C68415n f153033E;

    /* renamed from: F */
    C68368j f153034F;

    /* renamed from: G */
    private boolean f153035G;

    /* renamed from: H */
    private List<CommonItemView> f153036H = new ArrayList();

    /* renamed from: I */
    private C68375m f153037I;

    /* renamed from: J */
    private List<String> f153038J;

    /* renamed from: K */
    private JSONObject f153039K;

    /* renamed from: a */
    TextView f153040a;

    /* renamed from: b */
    ImageView f153041b;

    /* renamed from: c */
    PowerList f153042c;

    /* renamed from: d */
    C43047dm f153043d;

    /* renamed from: e */
    C68415n f153044e;

    /* renamed from: j */
    C68415n f153045j;

    /* renamed from: k */
    C68415n f153046k;

    /* renamed from: l */
    C68415n f153047l;

    /* renamed from: m */
    C68415n f153048m;

    /* renamed from: n */
    C68415n f153049n;

    /* renamed from: o */
    C68415n f153050o;

    /* renamed from: p */
    C68415n f153051p;

    /* renamed from: q */
    C68415n f153052q;

    /* renamed from: r */
    C68415n f153053r;

    /* renamed from: s */
    C68415n f153054s;

    /* renamed from: t */
    C68415n f153055t;

    /* renamed from: u */
    C68415n f153056u;

    /* renamed from: v */
    C68415n f153057v;

    /* renamed from: w */
    C68616a f153058w;

    /* renamed from: y */
    C40937d f153059y;

    /* renamed from: z */
    C40937d f153060z;

    static {
        Covode.recordClassIndex(80607);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68832a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void aD_() {
    }

    /* renamed from: c */
    private void m120663c() {
        this.f153037I.mo108820a(C80428fg.m139432a(getContext()));
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f153034F.ck_();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void cm_() {
        new C79459a(C17867d.m33078a()).mo123050a(R.string.dck).mo123053a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.a$2 */
    static /* synthetic */ class C683802 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153064a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 80609(0x13ae1, float:1.12957E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.setting.serverpush.b.l[] r0 = com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.EnumC68374l.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68378a.C683802.f153064a = r2
                com.ss.android.ugc.aweme.setting.serverpush.b.l r0 = com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.EnumC68374l.WITH_TEXT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68378a.C683802.f153064a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.setting.serverpush.b.l r0 = com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.EnumC68374l.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68378a.C683802.<clinit>():void");
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m120663c();
        boolean a = C80428fg.m139432a(getContext());
        this.f153046k.mo70129c(a);
        this.f153047l.mo70129c(a);
        this.f153048m.mo70129c(a);
        this.f153049n.mo70129c(a);
        this.f153044e.mo70129c(a);
        this.f153050o.mo70129c(a);
        this.f153051p.mo70129c(a);
        this.f153052q.mo70129c(a);
        this.f153053r.mo70129c(a);
        this.f153056u.mo70129c(a);
        this.f153058w.mo70129c(a);
        this.f153055t.mo70129c(a);
        C68368j jVar = this.f153034F;
        if (jVar != null) {
            jVar.mo57616a(new Object[0]);
        }
    }

    /* renamed from: a */
    public static boolean m120661a(Context context) {
        if (C80428fg.m139432a(context)) {
            return true;
        }
        C80429fh.m139440a(context, true, null, true);
        return false;
    }

    /* renamed from: b */
    private void m120662b(C68348f fVar) {
        if (this.f153035G) {
            fVar.f152987i = 0;
            fVar.f152990l = 0;
            fVar.f152993o = 0;
        }
        m120659a(this.f153046k, fVar.f152964a);
        m120659a(this.f153047l, fVar.f152980b);
        m120659a(this.f153048m, fVar.f152981c);
        m120659a(this.f153049n, fVar.f152982d);
        m120659a(this.f153044e, fVar.f152978an);
        m120659a(this.f153050o, fVar.f152986h);
        m120659a(this.f153051p, fVar.f152987i);
        m120659a(this.f153052q, fVar.f152988j);
        m120659a(this.f153053r, fVar.f152992n);
        m120659a(this.f153033E, fVar.f152990l);
        m120659a(this.f153056u, fVar.f152993o);
        m120659a(this.f153056u, fVar.f152994p);
        m120659a(this.f153055t, fVar.f152991m);
        NotificationManagerServiceImpl.m101386d().mo90141c(Integer.valueOf(fVar.f152990l));
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68831a(C68348f fVar) {
        try {
            this.f153039K = new JSONObject(C80342dg.m139300a().mo46674b(fVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m120662b(fVar);
        C68434h.f153192a.mo108583a(this.f153039K);
    }

    /* renamed from: a */
    private static void m120659a(C68415n nVar, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        nVar.mo108844b(z);
    }

    /* renamed from: a */
    private void m120660a(final C68415n nVar, String str) {
        nVar.mo108841a((Object) str);
        nVar.mo108840a((View.OnClickListener) new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68378a.View$OnClickListenerC683791 */

            /* renamed from: c */
            private C88960c f153063c;

            static {
                Covode.recordClassIndex(80608);
            }

            public final void onClick(View view) {
                String str;
                String curUserId;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                if (C68378a.this.af_() && C68378a.this.getContext() != null) {
                    String str4 = (String) ((C34800h) nVar.f95762k).f82204g;
                    String str5 = "off";
                    if (TextUtils.equals(str4, "live_inner_push")) {
                        if (((C34800h) nVar.f95762k).f82200c) {
                            str3 = str5;
                        } else {
                            str3 = "on";
                        }
                        C53602f.m98841b(str3);
                        NotificationManagerServiceImpl.m101386d().mo90141c(Integer.valueOf(!((C34800h) nVar.f95762k).f82200c ? 1 : 0));
                    } else if (TextUtils.equals(str4, "im_inner_push")) {
                        if (((C34800h) nVar.f95762k).f82200c) {
                            str2 = str5;
                        } else {
                            str2 = "on";
                        }
                        C53602f.m98838a(str2);
                        NotificationManagerServiceImpl.m101386d().mo90138b(Integer.valueOf(!((C34800h) nVar.f95762k).f82200c ? 1 : 0));
                    } else if (TextUtils.equals(str4, "im_push")) {
                        if (((C34800h) nVar.f95762k).f82200c) {
                            str = str5;
                        } else {
                            str = "on";
                        }
                        C53602f.m98838a(str);
                        NotificationManagerServiceImpl.m101386d().mo90134a(Integer.valueOf(!((C34800h) nVar.f95762k).f82200c ? 1 : 0));
                        Boolean valueOf = Boolean.valueOf(((C34800h) nVar.f95762k).f82200c);
                        IAccountUserService e = AccountService.m65215a().mo57069e();
                        if (AccountService.m65215a().mo57069e() == null) {
                            curUserId = "-1";
                        } else {
                            curUserId = e.getCurUserId();
                        }
                        SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "imbase_".concat(String.valueOf(Long.parseLong(curUserId.toString()))), 0);
                        if (valueOf.booleanValue()) {
                            a.edit().putBoolean("key_mt_inner_push_switch_on", false).commit();
                        } else {
                            a.edit().putBoolean("key_mt_inner_push_switch_on", true).commit();
                        }
                    } else if (!C68378a.m120661a(C68378a.this.getContext())) {
                        return;
                    }
                    if (this.f153063c == null) {
                        C88960c cVar = new C88960c();
                        this.f153063c = cVar;
                        cVar.mo143291d(400, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C68385f(this));
                    }
                    C68415n nVar = nVar;
                    nVar.mo108844b(true ^ ((C34800h) nVar.f95762k).f82200c);
                    C68434h.f153192a.mo108582a(str4, ((C34800h) nVar.f95762k).f82200c ? 1 : 0);
                    this.f153063c.onNext(nVar);
                    if (((C34800h) nVar.f95762k).f82200c) {
                        str5 = "on";
                    }
                    C39162r.m79460a("notification_switch", new C33744d().mo59983a("label", str4).mo59983a("to_status", str5).f79943a);
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.f153042c = (PowerList) view.findViewById(R.id.dau);
        this.f153045j = new C68415n(new C34800h(getString(R.string.ez_), new View$OnClickListenerC68382c(this), (byte) 0));
        this.f153059y = new C40937d(new C34797e(getString(R.string.ezf)));
        this.f153060z = new C40937d(new C34797e(getString(R.string.ezf), false, false));
        this.f153046k = new C68415n(new C34800h(getString(R.string.ez7)));
        this.f153047l = new C68415n(new C34800h(getString(R.string.ez6), "item_push_comment"));
        this.f153048m = new C68415n(new C34800h(getString(R.string.ez8), "item_push_follow"));
        this.f153049n = new C68415n(new C34800h(getString(R.string.ez5)));
        this.f153044e = new C68415n(new C34800h(getString(R.string.f6r), (View.OnClickListener) null));
        this.f153029A = new C40937d(new C34797e(getString(R.string.ezg)));
        this.f153053r = new C68415n(new C34800h(getString(R.string.ezc)));
        this.f153054s = new C68415n(new C34800h(getString(R.string.acb), (View.OnClickListener) null));
        this.f153055t = new C68415n(new C34800h(getString(R.string.f05), (View.OnClickListener) null));
        this.f153030B = new C40937d(new C34797e(getString(R.string.ezh)));
        this.f153050o = new C68415n(new C34800h(getString(R.string.ez9)));
        this.f153051p = new C68415n(new C34800h(getString(R.string.ezd)));
        this.f153031C = new C40937d(new C34797e(getString(R.string.eze)));
        this.f153052q = new C68415n(new C34800h(getString(R.string.ezj)));
        this.f153033E = new C68415n(new C34800h(getString(R.string.acd)));
        this.f153058w = new C68616a(new C68546a(0, getString(R.string.edt), new View$OnClickListenerC68383d(this), null));
        this.f153032D = new C40937d(new C34797e(getString(R.string.foo)));
        this.f153057v = new C68415n(new C34800h(getString(R.string.f5y)));
        this.f153056u = new C68415n(new C34800h(getString(R.string.fop)));
        C43047dm dmVar = new C43047dm(this.f153042c);
        this.f153043d = dmVar;
        dmVar.f100359a.mo28083a(CommonItemViewCell.class);
        this.f153043d.mo73247a(this.f153045j);
        this.f153043d.mo73247a(this.f153059y);
        this.f153043d.mo73247a(this.f153060z);
        this.f153043d.mo73247a(this.f153046k);
        this.f153043d.mo73247a(this.f153047l);
        this.f153043d.mo73247a(this.f153048m);
        this.f153043d.mo73247a(this.f153049n);
        this.f153043d.mo73247a(this.f153044e);
        this.f153043d.mo73247a(this.f153029A);
        this.f153043d.mo73247a(this.f153053r);
        this.f153043d.mo73247a(this.f153054s);
        this.f153043d.mo73247a(this.f153055t);
        this.f153043d.mo73247a(this.f153030B);
        this.f153043d.mo73247a(this.f153050o);
        this.f153043d.mo73247a(this.f153051p);
        this.f153043d.mo73247a(this.f153031C);
        this.f153043d.mo73247a(this.f153052q);
        this.f153043d.mo73247a(this.f153033E);
        this.f153043d.mo73247a(this.f153058w);
        this.f153043d.mo73247a(this.f153032D);
        this.f153043d.mo73247a(this.f153057v);
        this.f153043d.mo73247a(this.f153056u);
        this.f153046k.mo108843b(getString(R.string.ma));
        this.f153057v.mo108845c(getString(R.string.f5z));
        this.f153040a = (TextView) view.findViewById(R.id.title);
        this.f153041b = (ImageView) view.findViewById(R.id.pi);
        View findViewById = view.findViewById(R.id.pi);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC68381b(this));
        }
        super.onViewCreated(view, bundle);
        this.f153035G = TextUtils.equals(getArguments().getString("enter_from"), "policy_notice");
        this.f153037I = new C68375m();
        this.f153040a.setText(R.string.fl4);
        this.f153037I.f153024a.observe(this, new C68384e(this));
        this.f153052q.mo70127a(false);
        this.f153058w.mo70127a(true);
        m120663c();
        m120660a(this.f153046k, "digg_push");
        m120660a(this.f153047l, "comment_push");
        m120660a(this.f153048m, "follow_push");
        m120660a(this.f153049n, "mention_push");
        m120660a(this.f153044e, "friend_upvote_push");
        m120660a(this.f153050o, "follow_new_video_push");
        m120660a(this.f153051p, "recommend_video_push");
        m120660a(this.f153052q, "live_push");
        m120660a(this.f153053r, "im_push");
        m120660a(this.f153033E, "live_inner_push");
        m120660a(this.f153056u, "other_channel");
        m120660a(this.f153057v, "friend_suggestions");
        m120660a(this.f153055t, "im_push_preview");
        this.f153053r.mo108842a(C17867d.m33078a().getResources().getString(R.string.ezc));
        this.f153052q.mo108842a(C17867d.m33078a().getResources().getString(R.string.ezj));
        this.f153054s.mo70127a(false);
        this.f153054s.mo70127a(false);
        if (C67968a.m120299a()) {
            this.f153033E.mo108842a(getContext().getString(R.string.u7));
            this.f153033E.mo70127a(true);
        } else {
            this.f153033E.mo70127a(false);
        }
        if (C56212h.m102127a()) {
            this.f153055t.mo70127a(true);
        } else {
            this.f153055t.mo70127a(false);
        }
        if (this.f153038J == null) {
            this.f153038J = C68431e.f153187a.mo108853a();
        }
        List<String> list = this.f153038J;
        if (list != null) {
            C68689d.m121122a(this.f153043d, list);
            this.f153029A.mo70127a(false);
            this.f153030B.mo70127a(false);
            this.f153031C.mo70127a(false);
        }
        C68348f a = C68434h.f153192a.mo108581a();
        if (a != null) {
            m120662b(a);
        }
        C68368j jVar = new C68368j();
        this.f153034F = jVar;
        jVar.mo67839a_(this);
        this.f153034F.mo57616a(new Object[0]);
        this.f153040a.setText(R.string.foc);
        this.f153045j.mo108842a(((Context) Objects.requireNonNull(getContext())).getString(R.string.foc));
        this.f153059y.mo70134a(getString(R.string.fog));
        this.f153059y.mo70127a(false);
        this.f153060z.mo70134a(getString(R.string.fog));
        this.f153060z.mo70127a(true);
        this.f153046k.mo108842a(getContext().getString(R.string.foh));
        this.f153047l.mo108842a(getContext().getString(R.string.fod));
        this.f153048m.mo108842a(getContext().getString(R.string.fof));
        this.f153049n.mo108842a(getContext().getString(R.string.fok));
        this.f153029A.mo70134a(getContext().getString(R.string.fol));
        if (C68376a.m120654a()) {
            this.f153044e.mo70127a(true);
            this.f153044e.mo108842a(C68376a.m120655b());
        } else {
            this.f153044e.mo70127a(false);
        }
        this.f153053r.mo108842a(getContext().getString(R.string.foe));
        this.f153030B.mo70134a(getString(R.string.fou));
        this.f153050o.mo108842a(getContext().getString(R.string.fov));
        this.f153051p.mo108842a(getContext().getString(R.string.fow));
        this.f153031C.mo70134a(getString(R.string.foi));
        this.f153052q.mo108842a(getContext().getString(R.string.foj));
        if (!C16048b.m29633a().mo25421a(true, "enable_other_push_settings", false)) {
            this.f153032D.mo70127a(false);
            this.f153056u.mo70127a(false);
        } else {
            this.f153032D.mo70127a(true);
            this.f153056u.mo70127a(true);
            if (C68075a.m120374a()) {
                this.f153057v.mo70127a(true);
                return;
            }
        }
        this.f153057v.mo70127a(false);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.axz, viewGroup, false);
    }
}
