package com.p2082ss.android.ugc.aweme.favorites.p2927i;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.comment.util.C37218u;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.p2082ss.android.ugc.aweme.favorites.p2919a.C47183d;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2394bj.AbstractC34880b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.question.p3665g.C66530a;
import com.p2082ss.android.ugc.aweme.question.p3665g.C66532b;
import com.p2082ss.android.ugc.aweme.question.p3665g.C66533c;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.question.QuestionFavoriteServiceImpl;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.favorites.i.i */
public final class View$OnClickListenerC47454i extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener, AbstractC1214u<C66532b>, C47434a.AbstractC47435a {

    /* renamed from: a */
    public C66504c f110227a;

    /* renamed from: b */
    public String f110228b;

    /* renamed from: c */
    public Activity f110229c;

    /* renamed from: d */
    public Fragment f110230d;

    /* renamed from: e */
    public C47183d f110231e;

    /* renamed from: f */
    public AbstractC34880b f110232f;

    /* renamed from: g */
    public C66533c f110233g;

    /* renamed from: h */
    public TuxButton f110234h;

    /* renamed from: i */
    public ConstraintLayout f110235i;

    /* renamed from: j */
    public SmartCircleImageView f110236j;

    /* renamed from: k */
    public TuxTextView f110237k;

    /* renamed from: l */
    public TuxTextView f110238l;

    /* renamed from: m */
    public TuxTextView f110239m;

    /* renamed from: n */
    public CommentTranslationStatusView f110240n;

    /* renamed from: o */
    private C23208a f110241o;

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.i$g */
    static final class DialogInterface$OnCancelListenerC47461g implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47454i f110253a;

        static {
            Covode.recordClassIndex(56074);
        }

        DialogInterface$OnCancelListenerC47461g(View$OnClickListenerC47454i iVar) {
            this.f110253a = iVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    static {
        Covode.recordClassIndex(56067);
    }

    /* renamed from: a */
    public final void mo79725a() {
        C23208a aVar = this.f110241o;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.i$a */
    public static final class C47455a implements AbstractC34880b {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47454i f110242a;

        static {
            Covode.recordClassIndex(56068);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2394bj.AbstractC34880b
        /* renamed from: b */
        public final void mo61761b() {
            C66533c cVar;
            View$OnClickListenerC47454i iVar = this.f110242a;
            C66504c cVar2 = iVar.f110227a;
            if (cVar2 != null && (cVar = iVar.f110233g) != null) {
                cVar.mo105519a(cVar2);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2394bj.AbstractC34880b
        /* renamed from: d */
        public final void mo61763d() {
            C66504c cVar = this.f110242a.f110227a;
            if (cVar != null) {
                this.f110242a.mo79726a(cVar, 1);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2394bj.AbstractC34880b
        /* renamed from: e */
        public final void mo61764e() {
            C66504c cVar = this.f110242a.f110227a;
            if (cVar != null) {
                this.f110242a.mo79726a(cVar, 0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2394bj.AbstractC34880b
        /* renamed from: a */
        public final void mo61760a() {
            View$OnClickListenerC47454i iVar = this.f110242a;
            C66504c cVar = iVar.f110227a;
            if (cVar != null) {
                C33744d a = new C33744d().mo59983a("enter_from", "collection_question");
                Object id = cVar.getId();
                if (id == null) {
                    id = "";
                }
                C39162r.m79460a("translate_question", a.mo59982a("question_id", id).f79943a);
                C66530a aVar = new C66530a();
                aVar.f149593b = SettingServiceImpl.m120782v().mo108872h();
                aVar.mo105517a(cVar.getContent());
                C66533c cVar2 = iVar.f110233g;
                if (cVar2 != null) {
                    cVar2.mo105520a(cVar, aVar, iVar.f110240n);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2394bj.AbstractC34880b
        /* renamed from: c */
        public final void mo61762c() {
            long j;
            long j2;
            long j3;
            UrlModel urlModel;
            String aid;
            String uid;
            C66504c cVar = this.f110242a.f110227a;
            if (cVar != null && cVar.getCreator() != null) {
                Activity activity = this.f110242a.f110229c;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type android.content.Context");
                Long id = cVar.getId();
                if (id != null) {
                    j = id.longValue();
                } else {
                    j = 0;
                }
                User creator = cVar.getCreator();
                if (creator == null || (uid = creator.getUid()) == null) {
                    j2 = 0;
                } else {
                    j2 = Long.parseLong(uid);
                }
                Aweme video = cVar.getVideo();
                if (video == null || (aid = video.getAid()) == null) {
                    j3 = 0;
                } else {
                    j3 = Long.parseLong(aid);
                }
                User creator2 = cVar.getCreator();
                String str = null;
                if (creator2 != null) {
                    urlModel = creator2.getAvatarThumb();
                } else {
                    urlModel = null;
                }
                String e = C80580in.m139690e(cVar.getCreator());
                String str2 = this.f110242a.f110228b;
                if (str2 == null) {
                    str2 = "";
                }
                User creator3 = cVar.getCreator();
                if (creator3 != null) {
                    str = creator3.getSecUid();
                }
                C37218u.m75213a(activity, new QaStruct(j, j2, j3, urlModel, e, str2, str, C89086z.INSTANCE, null, 256, null), "collection_question", "click_favorite", "answer");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C47455a(View$OnClickListenerC47454i iVar) {
            this.f110242a = iVar;
        }
    }

    /* renamed from: d */
    private static boolean m90505d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private final boolean m90504b() {
        if (this.f110229c == null) {
            return true;
        }
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m90505d();
        }
        if (C58029j.f132256h) {
            return false;
        }
        Activity activity = this.f110229c;
        if (activity != null) {
            new C23144b(activity).mo37635a(activity.getString(R.string.dcq)).mo37637b();
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a.AbstractC47435a
    /* renamed from: c */
    public final void mo79706c() {
        C66504c cVar = this.f110227a;
        if (cVar != null) {
            C39162r.m79460a(C47434a.m90444a(1), C47434a.m90452b("question", "collection_question").mo59983a("question_id", String.valueOf(cVar.getId())).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.i$b */
    static final class View$OnClickListenerC47456b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47454i f110243a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34880b f110244b;

        static {
            Covode.recordClassIndex(56069);
        }

        View$OnClickListenerC47456b(View$OnClickListenerC47454i iVar, AbstractC34880b bVar) {
            this.f110243a = iVar;
            this.f110244b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f110243a.mo79725a();
            this.f110244b.mo61760a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.i$c */
    static final class View$OnClickListenerC47457c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47454i f110245a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34880b f110246b;

        static {
            Covode.recordClassIndex(56070);
        }

        View$OnClickListenerC47457c(View$OnClickListenerC47454i iVar, AbstractC34880b bVar) {
            this.f110245a = iVar;
            this.f110246b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f110245a.mo79725a();
            this.f110246b.mo61761b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.i$d */
    static final class View$OnClickListenerC47458d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47454i f110247a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34880b f110248b;

        static {
            Covode.recordClassIndex(56071);
        }

        View$OnClickListenerC47458d(View$OnClickListenerC47454i iVar, AbstractC34880b bVar) {
            this.f110247a = iVar;
            this.f110248b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f110247a.mo79725a();
            this.f110248b.mo61762c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.i$e */
    static final class View$OnClickListenerC47459e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47454i f110249a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34880b f110250b;

        static {
            Covode.recordClassIndex(56072);
        }

        View$OnClickListenerC47459e(View$OnClickListenerC47454i iVar, AbstractC34880b bVar) {
            this.f110249a = iVar;
            this.f110250b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f110249a.mo79725a();
            this.f110250b.mo61763d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.i$f */
    static final class View$OnClickListenerC47460f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47454i f110251a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34880b f110252b;

        static {
            Covode.recordClassIndex(56073);
        }

        View$OnClickListenerC47460f(View$OnClickListenerC47454i iVar, AbstractC34880b bVar) {
            this.f110251a = iVar;
            this.f110252b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f110251a.mo79725a();
            this.f110252b.mo61764e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.i$i */
    public static final class View$OnClickListenerC47463i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47454i f110257a;

        static {
            Covode.recordClassIndex(56076);
        }

        public View$OnClickListenerC47463i(View$OnClickListenerC47454i iVar) {
            this.f110257a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC34880b bVar = this.f110257a.f110232f;
            if (bVar != null) {
                bVar.mo61762c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.i.i$h */
    public static final class C47462h<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47454i f110254a;

        /* renamed from: b */
        final /* synthetic */ C66504c f110255b;

        /* renamed from: c */
        final /* synthetic */ int f110256c;

        static {
            Covode.recordClassIndex(56075);
        }

        C47462h(View$OnClickListenerC47454i iVar, C66504c cVar, int i) {
            this.f110254a = iVar;
            this.f110255b = cVar;
            this.f110256c = i;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            if (!iVar.mo5544c() && !iVar.mo5539b()) {
                C47183d dVar = this.f110254a.f110231e;
                if (dVar != null) {
                    C66504c cVar = this.f110255b;
                    C89219l.m154721d(cVar, "");
                    dVar.mo63369e().remove(cVar);
                    dVar.notifyDataSetChanged();
                    if (dVar.mo63369e().isEmpty()) {
                        Fragment fragment = dVar.f109821a;
                        Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.ui.QuestionCollectListFragment");
                        ((AbstractC47599a) fragment).mo59525f();
                    }
                }
                if (this.f110256c == 1) {
                    this.f110255b.setCollectStatus(1);
                } else {
                    this.f110255b.setCollectStatus(0);
                }
                QuestionFavoriteServiceImpl.m129023a().mo105438a(String.valueOf(this.f110255b.getId()), this.f110256c);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC47454i(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.dwp);
        C89219l.m154716b(findViewById, "");
        this.f110234h = (TuxButton) findViewById;
        View findViewById2 = view.findViewById(R.id.dwj);
        C89219l.m154716b(findViewById2, "");
        this.f110235i = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.dwi);
        C89219l.m154716b(findViewById3, "");
        this.f110236j = (SmartCircleImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.dwr);
        C89219l.m154716b(findViewById4, "");
        this.f110237k = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dwq);
        C89219l.m154716b(findViewById5, "");
        this.f110238l = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dws);
        C89219l.m154716b(findViewById6, "");
        this.f110239m = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.eng);
        C89219l.m154716b(findViewById7, "");
        this.f110240n = (CommentTranslationStatusView) findViewById7;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C66532b bVar) {
        Activity activity;
        C66532b bVar2 = bVar;
        if (bVar2 != null && bVar2.f149596a != null && (activity = this.f110229c) != null && !activity.isFinishing()) {
            if (bVar2.f149597b) {
                C66504c cVar = bVar2.f149596a;
                this.f110240n.setLoading(false);
                C66504c cVar2 = this.f110227a;
                if (cVar2 != null) {
                    cVar2.setTranslated(cVar.isTranslated());
                }
                this.f110238l.setText(cVar.getContent());
                EOYServiceImpl.m120048b().mo106960a(this.f110238l);
                return;
            }
            this.f110240n.setLoading(false);
            Activity activity2 = this.f110229c;
            if (activity2 != null) {
                C33615a.m68848a((Context) activity2, (Throwable) bVar2.f149598c, (int) R.string.g1i);
            }
        }
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        SmartRoute buildRoute = SmartRouter.buildRoute(this.f110229c, "//qna/detail/");
        C66504c cVar = this.f110227a;
        Long l = null;
        if (cVar != null) {
            l = cVar.getId();
        }
        SmartRoute withParam = buildRoute.withParam("id", String.valueOf(l)).withParam("enter_from", "collection_question").withParam("enter_method", "click_favorite");
        C66504c cVar2 = this.f110227a;
        if (cVar2 == null || cVar2.getVideo() == null) {
            str = "textual";
        } else {
            str = "video";
        }
        withParam.withParam("question_type", str).open();
    }

    public final boolean onLongClick(View view) {
        C66504c cVar;
        boolean z;
        String str;
        String content;
        String content2;
        String str2;
        C23208a.C23209a a;
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        Resources resources5;
        User creator;
        if (!(view == null || this.f110229c == null || this.f110232f == null || (cVar = this.f110227a) == null)) {
            AbstractC0952i iVar = null;
            if (cVar.getCreator() != null) {
                C66504c cVar2 = this.f110227a;
                String uid = (cVar2 == null || (creator = cVar2.getCreator()) == null) ? null : creator.getUid();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                z = TextUtils.equals(uid, g.getCurUserId());
            } else {
                z = false;
            }
            ArrayList<String> arrayList = new ArrayList();
            Activity activity = this.f110229c;
            if (activity != null) {
                String string = activity.getString(R.string.c9);
                C89219l.m154716b(string, "");
                arrayList.add(string);
                String string2 = activity.getString(R.string.brv);
                C89219l.m154716b(string2, "");
                arrayList.add(string2);
                if (!z) {
                    C66504c cVar3 = this.f110227a;
                    if (C89219l.m154714a((Object) (cVar3 != null ? cVar3.isTranslated() : null), (Object) true)) {
                        String string3 = activity.getString(R.string.alq);
                        C89219l.m154716b(string3, "");
                        arrayList.add(string3);
                    } else {
                        String string4 = activity.getString(R.string.am8);
                        C89219l.m154716b(string4, "");
                        arrayList.add(string4);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : arrayList) {
                AbstractC34880b bVar = this.f110232f;
                if (!(bVar == null || this.f110227a == null)) {
                    Activity activity2 = this.f110229c;
                    if (TextUtils.equals(str3, (activity2 == null || (resources5 = activity2.getResources()) == null) ? null : resources5.getString(R.string.am8))) {
                        a = ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str3)).mo37801c(R.raw.icon_globe).mo37786a(new View$OnClickListenerC47456b(this, bVar));
                    } else {
                        Activity activity3 = this.f110229c;
                        if (TextUtils.equals(str3, (activity3 == null || (resources4 = activity3.getResources()) == null) ? null : resources4.getString(R.string.alq))) {
                            a = ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str3)).mo37801c(R.raw.icon_globe).mo37786a(new View$OnClickListenerC47457c(this, bVar));
                        } else {
                            Activity activity4 = this.f110229c;
                            if (TextUtils.equals(str3, (activity4 == null || (resources3 = activity4.getResources()) == null) ? null : resources3.getString(R.string.c9))) {
                                a = ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str3)).mo37801c(R.raw.icon_video).mo37786a(new View$OnClickListenerC47458d(this, bVar));
                            } else {
                                Activity activity5 = this.f110229c;
                                if (!TextUtils.equals(str3, (activity5 == null || (resources2 = activity5.getResources()) == null) ? null : resources2.getString(R.string.brs))) {
                                    Activity activity6 = this.f110229c;
                                    if (!TextUtils.equals(str3, (activity6 == null || (resources = activity6.getResources()) == null) ? null : resources.getString(R.string.brt))) {
                                        Fragment fragment = this.f110230d;
                                        if (fragment == null) {
                                            C89219l.m154715b();
                                        }
                                        if (TextUtils.equals(str3, fragment.getString(R.string.brv))) {
                                            a = ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str3)).mo37801c(R.raw.icon_bookmark_fill).mo37786a(new View$OnClickListenerC47460f(this, bVar));
                                        }
                                    }
                                }
                                a = ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str3)).mo37801c(R.raw.icon_bookmark).mo37786a(new View$OnClickListenerC47459e(this, bVar));
                            }
                        }
                    }
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
            }
            C66504c cVar4 = this.f110227a;
            if ((cVar4 != null ? cVar4.getCreator() : null) != null) {
                C66504c cVar5 = this.f110227a;
                if (!(cVar5 == null || (content2 = cVar5.getContent()) == null || content2.length() <= 0)) {
                    C17191a.C17192a aVar = new C17191a.C17192a();
                    C66504c cVar6 = this.f110227a;
                    String a2 = C80580in.m139677a(cVar6 != null ? cVar6.getCreator() : null, false);
                    C89219l.m154716b(a2, "");
                    C17191a.C17192a b = aVar.mo27179b(a2);
                    if (C80471gb.m139482a()) {
                        str2 = " :";
                    } else {
                        str2 = ": ";
                    }
                    str = b.mo27179b(str2).mo27177a(new C89350l("(?m)^[ \t]*\r?\n").replace(content2, "")).f40973a.toString();
                    C89219l.m154716b(str, "");
                }
                str = "";
            } else {
                C66504c cVar7 = this.f110227a;
                if (!(cVar7 == null || (content = cVar7.getContent()) == null || content.length() <= 0)) {
                    str = new C17191a.C17192a().mo27177a(new C89350l("(?m)^[ \t]*\r?\n").replace(content, "")).f40973a.toString();
                    C89219l.m154716b(str, "");
                }
                str = "";
            }
            this.f110241o = new C23208a.C23211b().mo37794a(str).mo37791a().mo37795a(arrayList2).mo37793a(new DialogInterface$OnCancelListenerC47461g(this)).mo37798b("").mo37800b();
            if (!arrayList2.isEmpty()) {
                C23208a aVar2 = this.f110241o;
                if (aVar2 != null) {
                    Fragment fragment2 = this.f110230d;
                    if (fragment2 != null) {
                        iVar = fragment2.getFragmentManager();
                    }
                    aVar2.show(iVar, "QuestionCollectViewHolder");
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo79726a(C66504c cVar, int i) {
        Long id;
        C1731i<BaseResponse> collectQuestion;
        if (!m90504b() && (id = cVar.getId()) != null && (collectQuestion = UserFavoritesApi.f109832a.collectQuestion(id.longValue(), i)) != null) {
            collectQuestion.mo5534a(new C47462h(this, cVar, i), C1731i.f5564c, null);
        }
    }
}
