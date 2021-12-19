package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1716e.C23056g;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi;
import com.p2082ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel;
import com.p2082ss.android.ugc.aweme.p2386be.C34798f;
import com.p2082ss.android.ugc.aweme.p2727db.C40941f;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g */
public final class C40474g {

    /* renamed from: f */
    public static final C40475a f94717f = new C40475a((byte) 0);

    /* renamed from: a */
    final View f94718a;

    /* renamed from: b */
    final int f94719b;

    /* renamed from: c */
    public final ActivityC0945e f94720c;

    /* renamed from: d */
    public final String f94721d;

    /* renamed from: e */
    final C43047dm f94722e;

    /* renamed from: g */
    private final AbstractC89244h f94723g = C89250i.m154773a((AbstractC89171a) new C40487h(this));

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$b */
    public final class View$OnClickListenerC40476b implements View.OnClickListener {

        /* renamed from: a */
        public final C40470c f94724a;

        /* renamed from: b */
        final /* synthetic */ C40474g f94725b;

        static {
            Covode.recordClassIndex(48283);
        }

        /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$b$a */
        static final class C40477a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            public static final C40477a f94726a = new C40477a();

            static {
                Covode.recordClassIndex(48284);
            }

            C40477a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ C89391z invoke() {
                return C89391z.f203057a;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (C89219l.m154714a((Object) this.f94724a.f94707c, (Object) true)) {
                C40474g gVar = this.f94725b;
                C40470c cVar = this.f94724a;
                String str = cVar.f94710f;
                if (str != null && !C89361p.m154870a((CharSequence) str)) {
                    SmartRouter.buildRoute(gVar.f94720c, cVar.f94710f).open();
                    return;
                }
                return;
            }
            ActivityC0945e eVar = this.f94725b.f94720c;
            C40470c cVar2 = this.f94724a;
            C40477a aVar = C40477a.f94726a;
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(cVar2, "");
            C89219l.m154721d("", "");
            C89219l.m154721d(aVar, "");
            DialogC40466a aVar2 = new DialogC40466a(eVar, cVar2, "", aVar);
            Window window = aVar2.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 17;
                attributes.flags = attributes.flags | 2 | 32 | 262144;
                window.setAttributes(attributes);
                window.setBackgroundDrawableResource(R.drawable.a3f);
            }
            aVar2.show();
        }

        public View$OnClickListenerC40476b(C40474g gVar, C40470c cVar) {
            C89219l.m154721d(cVar, "");
            this.f94725b = gVar;
            this.f94724a = cVar;
        }
    }

    static {
        Covode.recordClassIndex(48281);
    }

    /* renamed from: a */
    public final CreatorPlusViewModel mo69565a() {
        return (CreatorPlusViewModel) this.f94723g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$a */
    public static final class C40475a {
        static {
            Covode.recordClassIndex(48282);
        }

        private C40475a() {
        }

        public /* synthetic */ C40475a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$h */
    static final class C40487h extends AbstractC89220m implements AbstractC89171a<CreatorPlusViewModel> {

        /* renamed from: a */
        final /* synthetic */ C40474g f94737a;

        static {
            Covode.recordClassIndex(48294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40487h(C40474g gVar) {
            super(0);
            this.f94737a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CreatorPlusViewModel invoke() {
            return C1181ae.m3881a(this.f94737a.f94720c, (C1175ad.AbstractC1177b) null).mo3983a(CreatorPlusViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$f */
    static final class RunnableC40483f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40474g f94732a;

        static {
            Covode.recordClassIndex(48290);
        }

        RunnableC40483f(C40474g gVar) {
            this.f94732a = gVar;
        }

        public final void run() {
            C40474g gVar = this.f94732a;
            ActivityC0945e eVar = gVar.f94720c;
            C23023b bVar = new C23023b(eVar);
            C89219l.m154719c(bVar, "");
            bVar.mo37409a(new C23056g(bVar.f54592n, 2131231128));
            C23028c.m43435a(bVar.mo37411b(eVar.getString(R.string.b2r)).mo37413d(eVar.getString(R.string.b2q)), new C40484g(gVar, eVar)).mo37405a().mo37396b().show();
            C33744d dVar = new C33744d();
            String str = "notifications";
            if (!C89219l.m154714a((Object) gVar.f94721d, (Object) str)) {
                str = "creator_tools";
            }
            C33744d a = dVar.mo59983a("enter_from", str);
            C89219l.m154716b(a, "");
            C39162r.m79460a("show_creator_plus_welcome_popup", a.f79943a);
            Keva.getRepo("keva_cplus_repo").storeBoolean(C40472e.m81699a("ENROLL_DIALOG_SHOW_KEY"), true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$d */
    public static final class C40479d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C40474g f94728a;

        static {
            Covode.recordClassIndex(48286);
        }

        public C40479d(C40474g gVar) {
            this.f94728a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse == null || baseResponse.status_code != 0) {
                new C23144b(this.f94728a.f94720c).mo37640e(R.string.fz3).mo37634a(3000L).mo37637b();
                return;
            }
            C40469b a = C40472e.m81698a();
            if (a != null) {
                str = a.f94704c;
            } else {
                str = null;
            }
            SmartRouter.buildRoute(this.f94728a.f94720c, str).open(124, new OnActivityResultCallback(this) {
                /* class com.p2082ss.android.ugc.aweme.creatortools.creatorplus.C40474g.C40479d.C404801 */

                /* renamed from: a */
                final /* synthetic */ C40479d f94729a;

                static {
                    Covode.recordClassIndex(48287);
                }

                {
                    this.f94729a = r1;
                }

                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i, int i2, Intent intent) {
                    if (this.f94729a.f94728a.f94720c != null && !this.f94729a.f94728a.f94720c.isFinishing() && !this.f94729a.f94728a.f94720c.isDestroyed()) {
                        this.f94729a.f94728a.mo69565a().mo69551c();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$g */
    static final class C40484g extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C40474g f94733a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f94734b;

        static {
            Covode.recordClassIndex(48291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40484g(C40474g gVar, ActivityC0945e eVar) {
            super(1);
            this.f94733a = gVar;
            this.f94734b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f94734b.getString(R.string.b2p);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.creatortools.creatorplus.C40474g.C40484g.C404851 */

                /* renamed from: a */
                final /* synthetic */ C40484g f94735a;

                static {
                    Covode.recordClassIndex(48292);
                }

                {
                    this.f94735a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    CreatorPlusViewModel a = this.f94735a.f94733a.mo69565a();
                    a.f94687a.mo142945a(CreatorPlusApi.C40458a.m81693b().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new CreatorPlusViewModel.C40460a(a), new CreatorPlusViewModel.C40461b(a)));
                    C33744d dVar = new C33744d();
                    String str = "notifications";
                    if (!C89219l.m154714a((Object) this.f94735a.f94733a.f94721d, (Object) str)) {
                        str = "creator_tools";
                    }
                    C33744d a2 = dVar.mo59983a("enter_from", str).mo59983a("action", "agree");
                    C89219l.m154716b(a2, "");
                    C39162r.m79460a("click_creator_plus_welcome_popup", a2.f79943a);
                    return C89391z.f203057a;
                }
            });
            String string2 = this.f94734b.getString(R.string.b2m);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.creatortools.creatorplus.C40474g.C40484g.C404862 */

                /* renamed from: a */
                final /* synthetic */ C40484g f94736a;

                static {
                    Covode.recordClassIndex(48293);
                }

                {
                    this.f94736a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C33744d dVar = new C33744d();
                    String str = "notifications";
                    if (!C89219l.m154714a((Object) this.f94736a.f94733a.f94721d, (Object) str)) {
                        str = "creator_tools";
                    }
                    C33744d a = dVar.mo59983a("enter_from", str).mo59983a("action", "cancel");
                    C89219l.m154716b(a, "");
                    C39162r.m79460a("click_creator_plus_welcome_popup", a.f79943a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$e */
    static final class View$OnClickListenerC40481e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40474g f94730a;

        static {
            Covode.recordClassIndex(48288);
        }

        View$OnClickListenerC40481e(C40474g gVar) {
            this.f94730a = gVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C40469b a = C40472e.m81698a();
            if (a != null) {
                str = a.f94703b;
            } else {
                str = null;
            }
            SmartRouter.buildRoute(this.f94730a.f94720c, C89219l.m154704a(str, (Object) "?enter_from=creator_tools")).open(123, new OnActivityResultCallback(this) {
                /* class com.p2082ss.android.ugc.aweme.creatortools.creatorplus.C40474g.View$OnClickListenerC40481e.C404821 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC40481e f94731a;

                static {
                    Covode.recordClassIndex(48289);
                }

                {
                    this.f94731a = r1;
                }

                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i, int i2, Intent intent) {
                    if (this.f94731a.f94730a.f94720c != null && !this.f94731a.f94730a.f94720c.isFinishing() && !this.f94731a.f94730a.f94720c.isDestroyed()) {
                        this.f94731a.f94730a.mo69565a().mo69551c();
                    }
                }
            });
            C33744d a2 = new C33744d().mo59983a("enter_from", "creator_tools").mo59983a("enter_method", "click_apply");
            C89219l.m154716b(a2, "");
            C39162r.m79460a("click_creator_plus_banner", a2.f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$c */
    public static final class C40478c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C40474g f94727a;

        static {
            Covode.recordClassIndex(48285);
        }

        public C40478c(C40474g gVar) {
            this.f94727a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num;
            boolean z2;
            List<String> urlList;
            C40471d dVar = (C40471d) obj;
            C40474g gVar = this.f94727a;
            if (!(gVar.f94720c.isDestroyed() || gVar.f94720c.isFinishing())) {
                List<C40470c> list = dVar != null ? dVar.f94712b : null;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        View$OnClickListenerC40476b bVar = new View$OnClickListenerC40476b(gVar, t);
                        UrlModel urlModel = t.f94706b;
                        String str = (urlModel == null || (urlList = urlModel.getUrlList()) == null) ? null : (String) C89070n.m154583g((List) urlList);
                        String str2 = t.f94709e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        Boolean bool = t.f94707c;
                        if (bool != null) {
                            z2 = bool.booleanValue();
                        } else {
                            z2 = false;
                        }
                        arrayList.add(new C40941f(new C34798f("", false, str, str2, null, null, false, z2, bVar, bVar, 1522)));
                    }
                    gVar.f94722e.mo73246a(gVar.f94719b, arrayList);
                } else {
                    new C23144b(gVar.f94720c).mo37640e(R.string.b2u).mo37634a(3000L).mo37637b();
                }
                if (!(dVar == null || (num = dVar.f94711a) == null)) {
                    num.intValue();
                    Integer num2 = dVar.f94711a;
                    int ordinal = EnumC40473f.CreatorPlusStatusEnrolled.ordinal();
                    if (num2 != null && num2.intValue() == ordinal) {
                        View findViewById = gVar.f94718a.findViewById(R.id.ag9);
                        C89219l.m154716b(findViewById, "");
                        findViewById.setVisibility(8);
                    } else {
                        View findViewById2 = gVar.f94718a.findViewById(R.id.ag9);
                        C89219l.m154716b(findViewById2, "");
                        findViewById2.setVisibility(0);
                        if (C80471gb.m139482a()) {
                            View findViewById3 = gVar.f94718a.findViewById(R.id.ag9);
                            C89219l.m154716b(findViewById3, "");
                            TuxTextView tuxTextView = (TuxTextView) findViewById3.findViewById(R.id.title);
                            C89219l.m154716b(tuxTextView, "");
                            tuxTextView.setGravity(8388613);
                        }
                        View findViewById4 = gVar.f94718a.findViewById(R.id.ag9);
                        C89219l.m154716b(findViewById4, "");
                        ((TuxButton) findViewById4.findViewById(R.id.ag_)).setOnClickListener(new View$OnClickListenerC40481e(gVar));
                        C33744d a = new C33744d().mo59983a("enter_from", "creator_tools");
                        C89219l.m154716b(a, "");
                        C39162r.m79460a("show_creator_plus_banner", a.f79943a);
                    }
                    int ordinal2 = EnumC40473f.CreatorPlusStatusMeetsAllRequirements.ordinal();
                    if (num2 != null && num2.intValue() == ordinal2 && !Keva.getRepo("keva_cplus_repo").getBoolean(C40472e.m81699a("ENROLL_DIALOG_SHOW_KEY"), false)) {
                        new Handler().postDelayed(new RunnableC40483f(gVar), 200);
                    }
                }
            }
        }
    }

    public C40474g(View view, int i, ActivityC0945e eVar, String str, C43047dm dmVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(dmVar, "");
        this.f94718a = view;
        this.f94719b = i;
        this.f94720c = eVar;
        this.f94721d = str;
        this.f94722e = dmVar;
        mo69565a().mo69551c();
    }
}
