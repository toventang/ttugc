package com.p2082ss.android.ugc.aweme.question.p3661c;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.question.api.C66500a;
import com.p2082ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.p2082ss.android.ugc.aweme.question.p3664f.C66526a;
import com.p2082ss.android.ugc.aweme.question.p3665g.C66530a;
import com.p2082ss.android.ugc.aweme.question.p3665g.C66532b;
import com.p2082ss.android.ugc.aweme.question.p3665g.C66533c;
import com.p2082ss.android.ugc.aweme.question.p3666h.p3667a.C66539c;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.service.IEOYService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79027a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79030c;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.views.MultiAvatarView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.question.c.c */
public final class C66512c extends FrameLayout implements AbstractC1214u<C66532b> {

    /* renamed from: a */
    public C66500a f149535a;

    /* renamed from: b */
    public C66504c f149536b;

    /* renamed from: c */
    public SmartImageView f149537c;

    /* renamed from: d */
    public LinearLayout f149538d;

    /* renamed from: e */
    public TuxTextView f149539e;

    /* renamed from: f */
    public TuxTextView f149540f;

    /* renamed from: g */
    public TuxTextView f149541g;

    /* renamed from: h */
    public TuxTextView f149542h;

    /* renamed from: i */
    public CommentTranslationStatusView f149543i;

    /* renamed from: j */
    public TuxTextView f149544j;

    /* renamed from: k */
    public C66505a f149545k;

    /* renamed from: l */
    public C66510b f149546l;

    /* renamed from: m */
    public FrameLayout f149547m;

    /* renamed from: n */
    public SmartImageView f149548n;

    /* renamed from: o */
    public ConstraintLayout f149549o;

    /* renamed from: p */
    public ConstraintLayout f149550p;

    /* renamed from: q */
    boolean f149551q;

    /* renamed from: r */
    String f149552r;

    /* renamed from: s */
    public C66533c f149553s;

    /* renamed from: t */
    public final C66539c f149554t;

    /* renamed from: u */
    private View f149555u;

    /* renamed from: v */
    private View f149556v;

    /* renamed from: w */
    private SparseArray f149557w;

    static {
        Covode.recordClassIndex(78055);
    }

    /* renamed from: c */
    public final View mo105493c() {
        if (this.f149557w == null) {
            this.f149557w = new SparseArray();
        }
        View view = (View) this.f149557w.get(R.id.be4);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.be4);
        this.f149557w.put(R.id.be4, findViewById);
        return findViewById;
    }

    public final int getButtonResId() {
        return R.layout.aqo;
    }

    public final int getLayoutResId() {
        return R.layout.aqq;
    }

    public final int getMultiAvatarViewResId() {
        return R.layout.aqp;
    }

    public final C66539c getMHeaderParam() {
        return this.f149554t;
    }

    public final QuestionDetailParam getDetailParam() {
        return this.f149554t.f149614f;
    }

    public final int getAvatarContainerHeight() {
        SmartImageView smartImageView = this.f149537c;
        if (smartImageView == null) {
            C89219l.m154710a("mAvatar");
        }
        return smartImageView.getHeight();
    }

    /* renamed from: b */
    public final void mo105492b() {
        C66504c cVar = this.f149536b;
        if (cVar == null) {
            C89219l.m154710a("mQuestion");
        }
        C66533c cVar2 = this.f149553s;
        if (cVar2 != null) {
            cVar2.mo105519a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo105490a() {
        int i;
        C66504c cVar = this.f149536b;
        if (cVar == null) {
            C89219l.m154710a("mQuestion");
        }
        String content = cVar.getContent();
        if (content != null) {
            TuxTextView tuxTextView = this.f149541g;
            if (tuxTextView == null) {
                C89219l.m154710a("mContent");
            }
            tuxTextView.setText(new C89350l("(?m)^[ \t]*\r?\n").replace(content, ""));
            TuxTextView tuxTextView2 = this.f149541g;
            if (tuxTextView2 == null) {
                C89219l.m154710a("mContent");
            }
            if (C80471gb.m139482a()) {
                i = 4;
            } else {
                i = 3;
            }
            tuxTextView2.setTextDirection(i);
            IEOYService b = EOYServiceImpl.m120048b();
            TuxTextView tuxTextView3 = this.f149541g;
            if (tuxTextView3 == null) {
                C89219l.m154710a("mContent");
            }
            b.mo106960a(tuxTextView3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.c.c$a */
    public static final class C66513a implements AbstractC27645k<C79027a> {

        /* renamed from: a */
        final /* synthetic */ C66512c f149558a;

        static {
            Covode.recordClassIndex(78056);
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C89219l.m154721d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C66513a(C66512c cVar) {
            this.f149558a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final /* synthetic */ void onSuccess(C79027a aVar) {
            List<C79030c> list;
            C79030c cVar;
            C79027a aVar2 = aVar;
            if (aVar2 != null) {
                list = aVar2.f177634a;
            } else {
                list = null;
            }
            if (!C13603b.m24435a((Collection) list) && list != null && (cVar = list.get(0)) != null) {
                C66512c cVar2 = this.f149558a;
                CommentService e = CommentServiceImpl.m73664e();
                String str = cVar.f177641a;
                C89219l.m154716b(str, "");
                String b = e.mo63301b(str);
                C66504c cVar3 = cVar2.f149536b;
                if (cVar3 == null) {
                    C89219l.m154710a("mQuestion");
                }
                if (!C89219l.m154714a((Object) cVar3.getContent(), (Object) b)) {
                    cVar2.f149552r = b;
                    TuxTextView tuxTextView = cVar2.f149542h;
                    if (tuxTextView == null) {
                        C89219l.m154710a("mTranslationButton");
                    }
                    Context context = cVar2.getContext();
                    C89219l.m154716b(context, "");
                    tuxTextView.setText(context.getResources().getString(R.string.fhh));
                    TuxTextView tuxTextView2 = cVar2.f149542h;
                    if (tuxTextView2 == null) {
                        C89219l.m154710a("mTranslationButton");
                    }
                    tuxTextView2.setVisibility(0);
                    TuxTextView tuxTextView3 = cVar2.f149542h;
                    if (tuxTextView3 == null) {
                        C89219l.m154710a("mTranslationButton");
                    }
                    tuxTextView3.setOnClickListener(new View$OnClickListenerC66515c(cVar2));
                    C66526a.m118276c("qa_detail", cVar2.getDetailParam().getId());
                    return;
                }
                TuxTextView tuxTextView4 = cVar2.f149542h;
                if (tuxTextView4 == null) {
                    C89219l.m154710a("mTranslationButton");
                }
                tuxTextView4.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C66504c m118263a(C66512c cVar) {
        C66504c cVar2 = cVar.f149536b;
        if (cVar2 == null) {
            C89219l.m154710a("mQuestion");
        }
        return cVar2;
    }

    /* renamed from: b */
    public static final /* synthetic */ TuxTextView m118264b(C66512c cVar) {
        TuxTextView tuxTextView = cVar.f149542h;
        if (tuxTextView == null) {
            C89219l.m154710a("mTranslationButton");
        }
        return tuxTextView;
    }

    /* renamed from: com.ss.android.ugc.aweme.question.c.c$b */
    public static final class View$OnClickListenerC66514b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66512c f149559a;

        static {
            Covode.recordClassIndex(78057);
        }

        public View$OnClickListenerC66514b(C66512c cVar) {
            this.f149559a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Boolean isTranslated = C66512c.m118263a(this.f149559a).isTranslated();
            if (isTranslated != null) {
                boolean booleanValue = isTranslated.booleanValue();
                C66512c.m118264b(this.f149559a).setVisibility(8);
                if (booleanValue) {
                    this.f149559a.mo105492b();
                    TuxTextView b = C66512c.m118264b(this.f149559a);
                    Context context = this.f149559a.getContext();
                    C89219l.m154716b(context, "");
                    b.setText(context.getResources().getString(R.string.fhh));
                    return;
                }
                C66512c cVar = this.f149559a;
                C66504c cVar2 = cVar.f149536b;
                if (cVar2 == null) {
                    C89219l.m154710a("mQuestion");
                }
                C66530a aVar = new C66530a();
                aVar.f149593b = SettingServiceImpl.m120782v().mo108872h();
                aVar.mo105517a(cVar2.getContent());
                C66533c cVar3 = cVar.f149553s;
                if (cVar3 != null) {
                    CommentTranslationStatusView commentTranslationStatusView = cVar.f149543i;
                    if (commentTranslationStatusView == null) {
                        C89219l.m154710a("mTranslateStatusView");
                    }
                    cVar3.mo105520a(cVar2, aVar, commentTranslationStatusView);
                }
                TuxTextView b2 = C66512c.m118264b(this.f149559a);
                Context context2 = this.f149559a.getContext();
                C89219l.m154716b(context2, "");
                b2.setText(context2.getResources().getString(R.string.fhg));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.c.c$c */
    static final class View$OnClickListenerC66515c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66512c f149560a;

        static {
            Covode.recordClassIndex(78058);
        }

        View$OnClickListenerC66515c(C66512c cVar) {
            this.f149560a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C66512c cVar = this.f149560a;
            if (cVar.f149552r != null) {
                if (cVar.f149551q) {
                    TuxTextView tuxTextView = cVar.f149542h;
                    if (tuxTextView == null) {
                        C89219l.m154710a("mTranslationButton");
                    }
                    Context context = cVar.getContext();
                    C89219l.m154716b(context, "");
                    tuxTextView.setText(context.getResources().getString(R.string.fhh));
                    TuxTextView tuxTextView2 = cVar.f149541g;
                    if (tuxTextView2 == null) {
                        C89219l.m154710a("mContent");
                    }
                    C66504c cVar2 = cVar.f149536b;
                    if (cVar2 == null) {
                        C89219l.m154710a("mQuestion");
                    }
                    tuxTextView2.setText(cVar2.getContent());
                    cVar.f149551q = false;
                    C66526a.m118275b("qa_detail", cVar.getDetailParam().getId());
                    C66526a.m118276c("qa_detail", cVar.getDetailParam().getId());
                } else {
                    TuxTextView tuxTextView3 = cVar.f149542h;
                    if (tuxTextView3 == null) {
                        C89219l.m154710a("mTranslationButton");
                    }
                    Context context2 = cVar.getContext();
                    C89219l.m154716b(context2, "");
                    tuxTextView3.setText(context2.getResources().getString(R.string.fhg));
                    TuxTextView tuxTextView4 = cVar.f149541g;
                    if (tuxTextView4 == null) {
                        C89219l.m154710a("mContent");
                    }
                    tuxTextView4.setText(cVar.f149552r);
                    cVar.f149551q = true;
                    C66526a.m118277d("qa_detail", cVar.getDetailParam().getId());
                    C66526a.m118274a("qa_detail", cVar.getDetailParam().getId());
                }
                IEOYService b = EOYServiceImpl.m120048b();
                TuxTextView tuxTextView5 = cVar.f149541g;
                if (tuxTextView5 == null) {
                    C89219l.m154710a("mContent");
                }
                b.mo106960a(tuxTextView5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.question.c.c$d */
    public static final class View$OnClickListenerC66516d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66512c f149561a;

        /* renamed from: b */
        final /* synthetic */ String f149562b;

        static {
            Covode.recordClassIndex(78059);
        }

        View$OnClickListenerC66516d(C66512c cVar, String str) {
            this.f149561a = cVar;
            this.f149562b = str;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                IAccountUserService g = C31575b.m65865g();
                String str4 = null;
                if (g != null) {
                    str = g.getCurUserId();
                } else {
                    str = null;
                }
                User creator = C66512c.m118263a(this.f149561a).getCreator();
                if (creator != null) {
                    str2 = creator.getUid();
                } else {
                    str2 = null;
                }
                if (C89219l.m154714a((Object) str, (Object) str2)) {
                    String str5 = this.f149562b;
                    C33744d dVar = new C33744d();
                    dVar.mo59983a("enter_from", "qa_detail");
                    if (str5 != null) {
                        dVar.mo59983a("question_id", str5);
                    }
                    C39162r.m79460a("enter_personal_homepage", dVar.f79943a);
                } else {
                    String str6 = this.f149562b;
                    C33744d dVar2 = new C33744d();
                    dVar2.mo59983a("enter_from", "qa_detail");
                    if (str6 != null) {
                        dVar2.mo59983a("enter_method", str6);
                    }
                    C39162r.m79460a("enter_personal_detail", dVar2.f79943a);
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(C17867d.m33078a(), "aweme://user/profile/");
                User creator2 = C66512c.m118263a(this.f149561a).getCreator();
                if (creator2 != null) {
                    str3 = creator2.getUid();
                } else {
                    str3 = null;
                }
                SmartRoute withParam = buildRoute.withParam("uid", str3);
                User creator3 = C66512c.m118263a(this.f149561a).getCreator();
                if (creator3 != null) {
                    str4 = creator3.getSecUid();
                }
                withParam.withParam("sec_user_id", str4).withParam("enter_from", "qa_detail").open();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C66532b bVar) {
        C66532b bVar2 = bVar;
        if (bVar2 != null && bVar2.f149596a != null) {
            if (bVar2.f149597b) {
                C66504c cVar = bVar2.f149596a;
                if (C89219l.m154714a((Object) cVar.isTranslated(), (Object) true)) {
                    C66526a.m118277d("qa_detail", getDetailParam().getId());
                    C66526a.m118274a("qa_detail", getDetailParam().getId());
                } else {
                    C66526a.m118275b("qa_detail", getDetailParam().getId());
                    C66526a.m118276c("qa_detail", getDetailParam().getId());
                }
                CommentTranslationStatusView commentTranslationStatusView = this.f149543i;
                if (commentTranslationStatusView == null) {
                    C89219l.m154710a("mTranslateStatusView");
                }
                commentTranslationStatusView.setLoading(false);
                TuxTextView tuxTextView = this.f149542h;
                if (tuxTextView == null) {
                    C89219l.m154710a("mTranslationButton");
                }
                tuxTextView.setVisibility(0);
                C66504c cVar2 = this.f149536b;
                if (cVar2 == null) {
                    C89219l.m154710a("mQuestion");
                }
                cVar2.setTranslated(cVar.isTranslated());
                C66504c cVar3 = this.f149536b;
                if (cVar3 == null) {
                    C89219l.m154710a("mQuestion");
                }
                cVar3.setContent(cVar.getContent());
                mo105490a();
                return;
            }
            CommentTranslationStatusView commentTranslationStatusView2 = this.f149543i;
            if (commentTranslationStatusView2 == null) {
                C89219l.m154710a("mTranslateStatusView");
            }
            commentTranslationStatusView2.setLoading(false);
            Context context = getContext();
            if (context != null) {
                C33615a.m68848a(context, (Throwable) bVar2.f149598c, (int) R.string.g1i);
            }
        }
    }

    /* renamed from: a */
    public final void mo105491a(View view, String str) {
        view.setOnClickListener(new View$OnClickListenerC66516d(this, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C66512c(Context context, C66539c cVar) {
        super(context, null);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12147);
        if (cVar == null) {
            C89219l.m154715b();
        }
        this.f149554t = cVar;
        C1764a.m5927a(LayoutInflater.from(context), getLayoutResId(), this, true);
        View findViewById = findViewById(R.id.nz);
        C89219l.m154716b(findViewById, "");
        this.f149537c = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.ok);
        C89219l.m154716b(findViewById2, "");
        this.f149547m = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.oj);
        C89219l.m154716b(findViewById3, "");
        this.f149548n = (SmartImageView) findViewById3;
        View findViewById4 = findViewById(R.id.title);
        C89219l.m154716b(findViewById4, "");
        this.f149538d = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(R.id.ejk);
        C89219l.m154716b(findViewById5, "");
        this.f149539e = (TuxTextView) findViewById5;
        View findViewById6 = findViewById(R.id.ejl);
        C89219l.m154716b(findViewById6, "");
        this.f149540f = (TuxTextView) findViewById6;
        View findViewById7 = findViewById(R.id.eix);
        C89219l.m154716b(findViewById7, "");
        this.f149556v = findViewById7;
        View findViewById8 = findViewById(R.id.acq);
        C89219l.m154716b(findViewById8, "");
        this.f149541g = (TuxTextView) findViewById8;
        View findViewById9 = findViewById(R.id.fgs);
        C89219l.m154716b(findViewById9, "");
        this.f149544j = (TuxTextView) findViewById9;
        View findViewById10 = findViewById(R.id.en_);
        C89219l.m154716b(findViewById10, "");
        this.f149542h = (TuxTextView) findViewById10;
        View findViewById11 = findViewById(R.id.eng);
        C89219l.m154716b(findViewById11, "");
        this.f149543i = (CommentTranslationStatusView) findViewById11;
        View findViewById12 = findViewById(R.id.be3);
        C89219l.m154716b(findViewById12, "");
        this.f149549o = (ConstraintLayout) findViewById12;
        View findViewById13 = findViewById(R.id.bdv);
        C89219l.m154716b(findViewById13, "");
        this.f149550p = (ConstraintLayout) findViewById13;
        View findViewById14 = findViewById(R.id.a06);
        C89219l.m154716b(findViewById14, "");
        ViewStub viewStub = (ViewStub) findViewById14;
        viewStub.setLayoutResource(getButtonResId());
        View inflate = viewStub.inflate();
        View findViewById15 = inflate.findViewById(R.id.a7n);
        C89219l.m154716b(findViewById15, "");
        View findViewById16 = inflate.findViewById(R.id.bu9);
        C89219l.m154716b(findViewById16, "");
        this.f149545k = new C66505a(findViewById15, (CheckableImageView) findViewById16, (TextView) inflate.findViewById(R.id.etu), getDetailParam());
        C89219l.m154716b(inflate, "");
        this.f149555u = inflate;
        View findViewById17 = findViewById(R.id.cmq);
        C89219l.m154716b(findViewById17, "");
        ViewStub viewStub2 = (ViewStub) findViewById17;
        viewStub2.setLayoutResource(getMultiAvatarViewResId());
        View inflate2 = viewStub2.inflate();
        View findViewById18 = inflate2.findViewById(R.id.dd2);
        C89219l.m154716b(findViewById18, "");
        View findViewById19 = inflate2.findViewById(R.id.dd0);
        C89219l.m154716b(findViewById19, "");
        MultiAvatarView multiAvatarView = (MultiAvatarView) findViewById19;
        Context context2 = getContext();
        if (context2 != null) {
            this.f149546l = new C66510b((Activity) context2, findViewById18, multiAvatarView, getDetailParam());
            MethodCollector.m26664o(12147);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        MethodCollector.m26664o(12147);
        throw nullPointerException;
    }

    public /* synthetic */ C66512c(Context context, C66539c cVar, byte b) {
        this(context, cVar);
    }
}
