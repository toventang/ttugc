package com.p2082ss.android.ugc.aweme.qainvitation.p3635b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.C65796b;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3636a.C65783a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3636a.C65787b;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3636a.C65791c;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65812a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65813b;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.C65818d;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.C65820e;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65844a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.EnumC65848e;
import com.p2082ss.android.ugc.aweme.qainvitation.p3642g.C65855a;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.views.MultiAvatarView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a */
public final class C65761a extends ConstraintLayout implements AbstractC65813b {

    /* renamed from: l */
    public static final C65762a f148158l = new C65762a((byte) 0);

    /* renamed from: A */
    private final Activity f148159A;

    /* renamed from: B */
    private final String f148160B;

    /* renamed from: C */
    private final String f148161C;

    /* renamed from: D */
    private final EnumC65848e f148162D;

    /* renamed from: E */
    private final Long f148163E;

    /* renamed from: F */
    private final Long f148164F;

    /* renamed from: G */
    private final List<IMUser> f148165G;

    /* renamed from: H */
    private SparseArray f148166H;

    /* renamed from: g */
    public final C65796b f148167g;

    /* renamed from: h */
    public final C65783a f148168h;

    /* renamed from: i */
    public final C65791c f148169i;

    /* renamed from: j */
    public final C65787b f148170j;

    /* renamed from: k */
    public final AbstractC89172b<List<? extends IMUser>, C89391z> f148171k;

    /* renamed from: m */
    private final IQAInvitationService f148172m;

    /* renamed from: n */
    private final C88411a f148173n;

    /* renamed from: o */
    private LinearLayoutManager f148174o;

    /* renamed from: p */
    private final AbstractC89244h f148175p;

    /* renamed from: q */
    private final AbstractC89244h f148176q;

    /* renamed from: r */
    private AbstractC89172b<? super C65796b.C65797a.C65798a, C89391z> f148177r;

    /* renamed from: s */
    private AbstractC89172b<? super C65844a, C89391z> f148178s;

    /* renamed from: t */
    private AbstractC89172b<? super List<? extends IMUser>, C89391z> f148179t;

    /* renamed from: u */
    private AbstractC89171a<C89391z> f148180u;

    /* renamed from: v */
    private AbstractC89172b<? super List<? extends IMUser>, C89391z> f148181v;

    /* renamed from: w */
    private final int f148182w;

    /* renamed from: x */
    private final TuxStatusView.C23263c f148183x;

    /* renamed from: y */
    private final TuxStatusView.C23263c f148184y;

    /* renamed from: z */
    private final TuxStatusView.C23263c f148185z;

    static {
        Covode.recordClassIndex(77262);
    }

    private final String getSourceFrom() {
        return "at_user";
    }

    /* renamed from: d */
    public final View mo104884d(int i) {
        if (this.f148166H == null) {
            this.f148166H = new SparseArray();
        }
        View view = (View) this.f148166H.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f148166H.put(i, findViewById);
        return findViewById;
    }

    public final HashSet<String> getFetchedUidSet() {
        return (HashSet) this.f148175p.getValue();
    }

    public final AbstractC65812a getSummonFriendSearchPresenter() {
        return (AbstractC65812a) this.f148176q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$a */
    public static final class C65762a {
        static {
            Covode.recordClassIndex(77263);
        }

        private C65762a() {
        }

        public /* synthetic */ C65762a(byte b) {
            this();
        }
    }

    public final Activity getActivity() {
        return this.f148159A;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.qainvitation.b.b$a$a, h.z>, h.f.a.b<com.ss.android.ugc.aweme.qainvitation.b.b$a$a, h.z> */
    public final AbstractC89172b<C65796b.C65797a.C65798a, C89391z> getAllContactsObserver() {
        return this.f148177r;
    }

    public final C88411a getCompositeDisposable() {
        return this.f148173n;
    }

    public final String getEnterFrom() {
        return this.f148161C;
    }

    public final String getEnterMethod() {
        return this.f148160B;
    }

    public final AbstractC89171a<C89391z> getHideKeyboardObserver() {
        return this.f148180u;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.qainvitation.e.a, h.z>, h.f.a.b<com.ss.android.ugc.aweme.qainvitation.e.a, h.z> */
    public final AbstractC89172b<C65844a, C89391z> getInviteUsersObserver() {
        return this.f148178s;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z>, h.f.a.b<java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z> */
    public final AbstractC89172b<List<? extends IMUser>, C89391z> getInviteeListObserver() {
        return this.f148179t;
    }

    public final List<IMUser> getPreviousSelectedUsers() {
        return this.f148165G;
    }

    public final IQAInvitationService getQaInviteService() {
        return this.f148172m;
    }

    public final Long getQuestionId() {
        return this.f148163E;
    }

    public final Long getQuestionUserId() {
        return this.f148164F;
    }

    public final EnumC65848e getRequestType() {
        return this.f148162D;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z>, h.f.a.b<java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z> */
    public final AbstractC89172b<List<? extends IMUser>, C89391z> getSearchObserver() {
        return this.f148181v;
    }

    public final TuxStatusView.C23263c getTuxStatusErrorView() {
        return this.f148183x;
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$c */
    static final class C65764c extends AbstractC89220m implements AbstractC89171a<HashSet<String>> {

        /* renamed from: a */
        public static final C65764c f148188a = new C65764c();

        static {
            Covode.recordClassIndex(77265);
        }

        C65764c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$q */
    static final class C65780q extends AbstractC89220m implements AbstractC89171a<C65818d> {

        /* renamed from: a */
        public static final C65780q f148206a = new C65780q();

        static {
            Covode.recordClassIndex(77281);
        }

        C65780q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65818d invoke() {
            return new C65818d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$d */
    static final class C65765d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65761a f148189a;

        static {
            Covode.recordClassIndex(77266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65765d(C65761a aVar) {
            super(0);
            this.f148189a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            KeyboardUtils.m70897c(this.f148189a.mo104884d(R.id.dqk));
            return C89391z.f203057a;
        }
    }

    /* renamed from: f */
    private final void m117690f() {
        RecyclerView recyclerView = (RecyclerView) mo104884d(R.id.dgn);
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        TuxStatusView tuxStatusView = (TuxStatusView) mo104884d(R.id.e77);
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
        }
    }

    /* renamed from: g */
    private final void m117691g() {
        RecyclerView recyclerView = (RecyclerView) mo104884d(R.id.dgn);
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        TuxStatusView tuxStatusView = (TuxStatusView) mo104884d(R.id.e77);
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final C67681g mo104882c() {
        return new C67681g(5, null, this.f148169i.f148238e, getSourceFrom(), 20, C89070n.m154590j(getFetchedUidSet()));
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65813b
    /* renamed from: e */
    public final void mo104886e() {
        if (isAttachedToWindow()) {
            if (this.f148169i.getItemCount() == 0) {
                mo104883c(1);
            }
            C39115e.m79412a(this.f148159A, mo104884d(R.id.dqk));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f148162D != EnumC65848e.NEW_QUESTION) {
            this.f148167g.f148264i.clear();
        }
        this.f148173n.dispose();
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$l */
    static final class C65774l implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C65761a f148200a;

        static {
            Covode.recordClassIndex(77275);
        }

        C65774l(C65761a aVar) {
            this.f148200a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            this.f148200a.getFetchedUidSet().size();
            this.f148200a.f148169i.ao_();
            this.f148200a.getSummonFriendSearchPresenter().mo104938a(false, this.f148200a.mo104882c());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65813b
    /* renamed from: d */
    public final void mo104885d() {
        if (isAttachedToWindow() && this.f148169i.getItemCount() == 0) {
            mo104883c(0);
        }
    }

    /* renamed from: b */
    public final void mo9139b() {
        Context context = getContext();
        C89219l.m154716b(context, "");
        if (!C80422fe.m139425a(context)) {
            mo9603b(2);
            return;
        }
        mo9603b(0);
        ArrayList arrayList = C89086z.INSTANCE;
        List<IMUser> list = this.f148165G;
        if (list != null && (!list.isEmpty())) {
            C65796b bVar = this.f148167g;
            List<IMUser> g = C89070n.m154585g((Collection) this.f148165G);
            C89219l.m154721d(g, "");
            bVar.f148264i = g;
            List<IMUser> list2 = this.f148165G;
            ArrayList arrayList2 = new ArrayList();
            for (T t : list2) {
                if (t.getIsUserNotInAllFriends()) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
            mo104880a(true);
            this.f148170j.mo104920a(this.f148167g.f148264i);
            this.f148170j.notifyDataSetChanged();
        }
        C65796b bVar2 = this.f148167g;
        C89219l.m154721d(arrayList, "");
        AbstractC88979t a = AbstractC88979t.m154294a(new C65796b.C65802c(bVar2, arrayList)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        this.f148173n.mo142945a(a.mo143289d(new C65768g(this)));
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        long j;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        C89219l.m154716b(parent, "");
        if (parent.getParent() != null) {
            ViewParent parent2 = getParent();
            C89219l.m154716b(parent2, "");
            ViewParent parent3 = parent2.getParent();
            Objects.requireNonNull(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
            View findViewById = ((ViewGroup) parent3).findViewById(R.id.dzj);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            C65796b bVar = this.f148167g;
            String str = this.f148160B;
            String str2 = this.f148161C;
            Long l = this.f148163E;
            long j2 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            Long l2 = this.f148164F;
            if (l2 != null) {
                j2 = l2.longValue();
            }
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            bVar.f148259d = str;
            bVar.f148260e = str2;
            bVar.f148261f = j;
            bVar.f148262g = j2;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            ((TuxStatusView) mo104884d(R.id.e77)).setTopMargin(TypedValue.applyDimension(1, 150.0f, system.getDisplayMetrics()));
            RecyclerView recyclerView = (RecyclerView) mo104884d(R.id.dbc);
            recyclerView.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            int i = 0;
            linearLayoutManager.mo4356b(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(this.f148170j);
            ((TuxButton) mo104884d(R.id.y0)).setOnClickListener(new View$OnClickListenerC65771j(this));
            C65820e.f148311a = String.valueOf(System.currentTimeMillis());
            ((DmtEditText) mo104884d(R.id.dqk)).setOnKeyListener(new View$OnKeyListenerC65775m(this));
            ((DmtEditText) mo104884d(R.id.dqk)).setOnClickListener(new View$OnClickListenerC65776n(this));
            ((DmtEditText) mo104884d(R.id.dqk)).addTextChangedListener(new C65777o(this));
            ((TuxIconView) mo104884d(R.id.a6_)).setOnClickListener(new View$OnClickListenerC65779p(this));
            getContext();
            this.f148174o = new LinearLayoutManager();
            RecyclerView recyclerView2 = (RecyclerView) mo104884d(R.id.dgn);
            C89219l.m154716b(recyclerView2, "");
            LinearLayoutManager linearLayoutManager2 = this.f148174o;
            if (linearLayoutManager2 == null) {
                C89219l.m154710a("linearLayoutManager");
            }
            recyclerView2.setLayoutManager(linearLayoutManager2);
            ((RecyclerView) mo104884d(R.id.dgn)).setHasFixedSize(true);
            ((RecyclerView) mo104884d(R.id.dgn)).mo4405a(new C65773k(this, getContext()));
            this.f148169i.mo67829d(true);
            this.f148169i.mo67813a(new C65774l(this));
            mo9139b();
            C33744d a = new C33744d().mo59983a("enter_from", this.f148161C).mo59983a("enter_method", this.f148160B);
            List<IMUser> list = this.f148165G;
            if (list != null) {
                i = list.size();
            }
            C39162r.m79460a("enter_qa_invite_panel", a.mo59980a("selected_invitee_cnt", i).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$o */
    public static final class C65777o extends C34699o {

        /* renamed from: a */
        final /* synthetic */ C65761a f148203a;

        static {
            Covode.recordClassIndex(77278);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65777o(C65761a aVar) {
            this.f148203a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$o$a */
        static final class C65778a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C65777o f148204a;

            static {
                Covode.recordClassIndex(77279);
            }

            C65778a(C65777o oVar) {
                this.f148204a = oVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f148204a.f148203a.getSearchObserver().invoke(obj);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            boolean z;
            int i;
            int i2;
            C89219l.m154721d(editable, "");
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            TuxIconView tuxIconView = (TuxIconView) this.f148203a.mo104884d(R.id.a6_);
            C89219l.m154716b(tuxIconView, "");
            if (tuxIconView.getVisibility() != i) {
                if (i == 8) {
                    C65761a aVar = this.f148203a;
                    if (aVar.f148168h.getItemCount() == 0) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    aVar.mo9603b(i2);
                }
                TuxIconView tuxIconView2 = (TuxIconView) this.f148203a.mo104884d(R.id.a6_);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(i);
            }
            String obj = editable.toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = C89361p.m154910b((CharSequence) obj).toString();
            if (!C89219l.m154714a((Object) this.f148203a.f148169i.f148238e, (Object) obj2)) {
                C65791c cVar = this.f148203a.f148169i;
                C89219l.m154721d(obj2, "");
                cVar.f148238e = obj2;
                if (obj2.length() > 0) {
                    Context context = this.f148203a.getContext();
                    C89219l.m154716b(context, "");
                    if (!C80422fe.m139425a(context)) {
                        this.f148203a.mo104883c(2);
                        return;
                    }
                    if (!this.f148203a.getSummonFriendSearchPresenter().mo104939a()) {
                        this.f148203a.getSummonFriendSearchPresenter().mo104937a(this.f148203a);
                    }
                    if (this.f148203a.f148168h.getItemCount() == 0) {
                        this.f148203a.mo104883c(0);
                    }
                    this.f148203a.getFetchedUidSet().size();
                    List g = C89070n.m154585g((Collection) this.f148203a.f148168h.f148212c);
                    if (true ^ this.f148203a.f148167g.f148265j.f148270a.isEmpty()) {
                        g.removeAll(this.f148203a.f148167g.f148265j.f148270a);
                    }
                    C65796b bVar = this.f148203a.f148167g;
                    C89219l.m154721d(obj2, "");
                    C89219l.m154721d(g, "");
                    AbstractC88979t a = AbstractC88979t.m154294a(new C65796b.C65809d(bVar, obj2, g)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
                    C89219l.m154716b(a, "");
                    this.f148203a.getCompositeDisposable().mo142945a(a.mo143289d(new C65778a(this)));
                }
            }
        }
    }

    public final void setAllContactsObserver(AbstractC89172b<? super C65796b.C65797a.C65798a, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f148177r = bVar;
    }

    public final void setHideKeyboardObserver(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f148180u = aVar;
    }

    public final void setInviteUsersObserver(AbstractC89172b<? super C65844a, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f148178s = bVar;
    }

    public final void setInviteeListObserver(AbstractC89172b<? super List<? extends IMUser>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f148179t = bVar;
    }

    public final void setSearchObserver(AbstractC89172b<? super List<? extends IMUser>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f148181v = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$j */
    static final class View$OnClickListenerC65771j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65761a f148197a;

        static {
            Covode.recordClassIndex(77272);
        }

        View$OnClickListenerC65771j(C65761a aVar) {
            this.f148197a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$j$a */
        static final class C65772a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC65771j f148198a;

            static {
                Covode.recordClassIndex(77273);
            }

            C65772a(View$OnClickListenerC65771j jVar) {
                this.f148198a = jVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f148198a.f148197a.getInviteUsersObserver().invoke(obj);
            }
        }

        public final void onClick(View view) {
            AbstractC89172b<List<? extends IMUser>, C89391z> bVar;
            ClickAgent.onClick(view);
            if (this.f148197a.getRequestType() == EnumC65848e.NEW_QUESTION || this.f148197a.getQuestionId() == null) {
                if (this.f148197a.f148167g.f148264i.size() > 0 && (bVar = this.f148197a.f148171k) != null) {
                    bVar.invoke(this.f148197a.f148167g.f148264i);
                }
                C23226a.C23228b.m43787a(this.f148197a);
                return;
            }
            AbstractC88979t a = AbstractC88979t.m154294a(new C65796b.C65799b(this.f148197a.f148167g, this.f148197a.getQuestionId().longValue())).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
            C89219l.m154716b(a, "");
            this.f148197a.getCompositeDisposable().mo142945a(a.mo143289d(new C65772a(this)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$f */
    static final class C65767f extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65761a f148192a;

        static {
            Covode.recordClassIndex(77268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65767f(C65761a aVar) {
            super(1);
            this.f148192a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends IMUser> list) {
            this.f148192a.setUpInvitedCellView(list);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$g */
    public static final class C65768g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C65761a f148193a;

        static {
            Covode.recordClassIndex(77269);
        }

        C65768g(C65761a aVar) {
            this.f148193a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f148193a.getAllContactsObserver().invoke(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$h */
    static final class C65769h extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65761a f148194a;

        static {
            Covode.recordClassIndex(77270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65769h(C65761a aVar) {
            super(1);
            this.f148194a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends IMUser> list) {
            List<? extends IMUser> list2 = list;
            if (list2 != null) {
                this.f148194a.f148169i.f148234a = list2;
                this.f148194a.mo104883c(-1);
                this.f148194a.f148169i.notifyDataSetChanged();
                list2.size();
            } else {
                this.f148194a.mo104883c(0);
            }
            this.f148194a.getFetchedUidSet().clear();
            this.f148194a.getSummonFriendSearchPresenter().mo104938a(true, this.f148194a.mo104882c());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$i */
    public static final class View$OnClickListenerC65770i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65761a f148195a;

        /* renamed from: b */
        final /* synthetic */ List f148196b;

        static {
            Covode.recordClassIndex(77271);
        }

        View$OnClickListenerC65770i(C65761a aVar, List list) {
            this.f148195a = aVar;
            this.f148196b = list;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f148195a.getQaInviteService().mo105004a(this.f148195a.getActivity(), this.f148195a.getEnterMethod(), this.f148195a.getEnterFrom(), this.f148195a.getQuestionId(), this.f148195a.getQuestionUserId(), this.f148196b, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$n */
    static final class View$OnClickListenerC65776n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65761a f148202a;

        static {
            Covode.recordClassIndex(77277);
        }

        View$OnClickListenerC65776n(C65761a aVar) {
            this.f148202a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("search_qa_invitee", new C33744d().mo59983a("enter_from", this.f148202a.getEnterFrom()).mo59983a("enter_method", this.f148202a.getEnterMethod()).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$p */
    static final class View$OnClickListenerC65779p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65761a f148205a;

        static {
            Covode.recordClassIndex(77280);
        }

        View$OnClickListenerC65779p(C65761a aVar) {
            this.f148205a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtEditText) this.f148205a.mo104884d(R.id.dqk)).setText("");
            ((DmtEditText) this.f148205a.mo104884d(R.id.dqk)).clearFocus();
            C39115e.m79412a(this.f148205a.getActivity(), this.f148205a.mo104884d(R.id.dqk));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$r */
    static final class C65781r extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65761a f148207a;

        /* renamed from: b */
        final /* synthetic */ Context f148208b;

        static {
            Covode.recordClassIndex(77282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65781r(C65761a aVar, Context context) {
            super(1);
            this.f148207a = aVar;
            this.f148208b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise));
            tuxButton2.setText(this.f148208b.getString(R.string.gzy));
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.qainvitation.p3635b.C65761a.C65781r.View$OnClickListenerC657821 */

                /* renamed from: a */
                final /* synthetic */ C65781r f148209a;

                static {
                    Covode.recordClassIndex(77283);
                }

                {
                    this.f148209a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f148209a.f148207a.mo9139b();
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$e */
    static final class C65766e extends AbstractC89220m implements AbstractC89172b<C65844a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65761a f148190a;

        /* renamed from: b */
        final /* synthetic */ Context f148191b;

        static {
            Covode.recordClassIndex(77267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65766e(C65761a aVar, Context context) {
            super(1);
            this.f148190a = aVar;
            this.f148191b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C65844a aVar) {
            C65844a aVar2 = aVar;
            if (aVar2 == null || aVar2.status_code != 0) {
                new C23144b(this.f148190a).mo37640e(R.string.fz3).mo37634a(3000L).mo37637b();
            } else {
                new C23144b(this.f148190a.getActivity()).mo37640e(R.string.f2l).mo37636b(R.raw.icon_tick_fill_small).mo37638c(C0643b.m2378c(this.f148191b, R.color.bf)).mo37634a(3000L).mo37637b();
                AbstractC89172b<List<? extends IMUser>, C89391z> bVar = this.f148190a.f148171k;
                if (bVar != null) {
                    bVar.invoke(this.f148190a.f148167g.f148264i);
                }
                C23226a.C23228b.m43787a(this.f148190a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo104880a(boolean z) {
        if (mo104884d(R.id.v8) != null) {
            View d = mo104884d(R.id.v8);
            C89219l.m154716b(d, "");
            ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
            if (z) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 162.0f, system.getDisplayMetrics()));
            } else {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics()));
            }
            View d2 = mo104884d(R.id.v8);
            C89219l.m154716b(d2, "");
            d2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo9603b(int i) {
        RecyclerView recyclerView = (RecyclerView) mo104884d(R.id.dgn);
        C89219l.m154716b(recyclerView, "");
        if (!C89219l.m154714a(recyclerView.getAdapter(), this.f148168h)) {
            RecyclerView recyclerView2 = (RecyclerView) mo104884d(R.id.dgn);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setAdapter(this.f148168h);
        }
        if (i == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) mo104884d(R.id.e77);
            if (tuxStatusView != null) {
                tuxStatusView.mo37867a();
            }
            m117690f();
        } else if (i == 1) {
            TuxStatusView tuxStatusView2 = (TuxStatusView) mo104884d(R.id.e77);
            if (tuxStatusView2 != null) {
                tuxStatusView2.setStatus(this.f148184y);
            }
            m117690f();
        } else if (i != 2) {
            m117691g();
        } else {
            TuxStatusView tuxStatusView3 = (TuxStatusView) mo104884d(R.id.e77);
            if (tuxStatusView3 != null) {
                tuxStatusView3.setStatus(this.f148183x);
            }
            m117690f();
        }
    }

    /* renamed from: c */
    public final void mo104883c(int i) {
        RecyclerView recyclerView = (RecyclerView) mo104884d(R.id.dgn);
        C89219l.m154716b(recyclerView, "");
        if (!C89219l.m154714a(recyclerView.getAdapter(), this.f148169i)) {
            RecyclerView recyclerView2 = (RecyclerView) mo104884d(R.id.dgn);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setAdapter(this.f148169i);
        }
        if (i == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) mo104884d(R.id.e77);
            if (tuxStatusView != null) {
                tuxStatusView.mo37867a();
            }
            m117690f();
        } else if (i == 1) {
            TuxStatusView tuxStatusView2 = (TuxStatusView) mo104884d(R.id.e77);
            if (tuxStatusView2 != null) {
                tuxStatusView2.setStatus(this.f148185z);
            }
            m117690f();
        } else if (i != 2) {
            m117691g();
        } else {
            TuxStatusView tuxStatusView3 = (TuxStatusView) mo104884d(R.id.e77);
            if (tuxStatusView3 != null) {
                tuxStatusView3.setStatus(this.f148183x);
            }
            m117690f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$b */
    static final class C65763b extends AbstractC89220m implements AbstractC89172b<C65796b.C65797a.C65798a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65761a f148186a;

        /* renamed from: b */
        final /* synthetic */ Context f148187b;

        static {
            Covode.recordClassIndex(77264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65763b(C65761a aVar, Context context) {
            super(1);
            this.f148186a = aVar;
            this.f148187b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C65796b.C65797a.C65798a aVar) {
            RecyclerView.AbstractC1350a aVar2;
            C65796b.C65797a.C65798a aVar3 = aVar;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (aVar3 != null) {
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                if (createIUserServicebyMonsterPlugin.isLogin()) {
                    C65783a aVar4 = this.f148186a.f148168h;
                    aVar4.f148210a = aVar3;
                    aVar4.f148212c = aVar3.f148275f;
                    RecyclerView recyclerView = (RecyclerView) this.f148186a.mo104884d(R.id.dgn);
                    RecyclerView.AbstractC1350a aVar5 = null;
                    if (recyclerView != null) {
                        aVar2 = recyclerView.getAdapter();
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 instanceof C65783a) {
                        if (this.f148186a.f148168h.getItemCount() == 0) {
                            this.f148186a.mo9603b(1);
                        } else {
                            this.f148186a.mo9603b(-1);
                        }
                    }
                    this.f148186a.f148168h.notifyDataSetChanged();
                    if (!this.f148186a.f148167g.f148264i.isEmpty()) {
                        this.f148186a.mo104880a(true);
                        String str = this.f148187b.getString(R.string.f1v) + " (" + this.f148186a.f148167g.f148264i.size() + ')';
                        TuxButton tuxButton = (TuxButton) this.f148186a.mo104884d(R.id.y0);
                        if (tuxButton != null) {
                            tuxButton.setText(str);
                        }
                    } else {
                        this.f148186a.mo104880a(false);
                    }
                    RecyclerView recyclerView2 = (RecyclerView) this.f148186a.mo104884d(R.id.dgn);
                    if (recyclerView2 != null) {
                        aVar5 = recyclerView2.getAdapter();
                    }
                    if (aVar5 instanceof C65791c) {
                        this.f148186a.f148169i.notifyDataSetChanged();
                    }
                    this.f148186a.f148170j.mo104920a(this.f148186a.f148167g.f148264i);
                    this.f148186a.f148170j.notifyDataSetChanged();
                    this.f148186a.getInviteeListObserver().invoke(aVar3.f148274e);
                    return C89391z.f203057a;
                }
            }
            this.f148186a.mo9603b(1);
            return C89391z.f203057a;
        }
    }

    public final void setUpInvitedCellView(List<? extends IMUser> list) {
        if (list != null) {
            View d = mo104884d(R.id.bqb);
            if (d == null || d.getVisibility() != 0) {
                List<User> b = C65855a.m117773b(list);
                if (!b.isEmpty()) {
                    MultiAvatarView multiAvatarView = (MultiAvatarView) mo104884d(R.id.cmo);
                    if (multiAvatarView != null) {
                        Resources system = Resources.getSystem();
                        C89219l.m154709a((Object) system, "");
                        int a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
                        Resources system2 = Resources.getSystem();
                        C89219l.m154709a((Object) system2, "");
                        multiAvatarView.mo125016a(a, C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system2.getDisplayMetrics())));
                    }
                    MultiAvatarView multiAvatarView2 = (MultiAvatarView) mo104884d(R.id.cmo);
                    if (multiAvatarView2 != null) {
                        multiAvatarView2.mo125017a(b, 0);
                    }
                    if (!list.isEmpty()) {
                        View d2 = mo104884d(R.id.bqb);
                        if (d2 != null) {
                            d2.setVisibility(0);
                        }
                        View d3 = mo104884d(R.id.bqb);
                        if (d3 != null) {
                            d3.setOnClickListener(new View$OnClickListenerC65770i(this, b));
                        }
                        String valueOf = String.valueOf(list.size());
                        if (C80471gb.m139483a(getContext())) {
                            TuxTextView tuxTextView = (TuxTextView) mo104884d(R.id.bq8);
                            C89219l.m154716b(tuxTextView, "");
                            tuxTextView.setText(getContext().getString(R.string.f22, String.valueOf(this.f148182w), valueOf));
                            return;
                        }
                        TuxTextView tuxTextView2 = (TuxTextView) mo104884d(R.id.bq8);
                        C89219l.m154716b(tuxTextView2, "");
                        tuxTextView2.setText(getContext().getString(R.string.f22, valueOf, String.valueOf(this.f148182w)));
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65813b
    /* renamed from: b */
    public final void mo104881b(boolean z) {
        ArrayList arrayList;
        Collection<? extends String> collection;
        String userId;
        if (z) {
            if (getFetchedUidSet().isEmpty()) {
                ((RecyclerView) mo104884d(R.id.dgn)).mo4413b(0);
            }
            this.f148169i.notifyDataSetChanged();
            C65791c cVar = this.f148169i;
            List<? extends IMUser> list = cVar.f148234a;
            ArrayList arrayList2 = null;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String uid = it.next().getUid();
                    if (uid != null) {
                        arrayList3.add(uid);
                    }
                }
                arrayList2 = arrayList3;
            }
            List<? extends C67679e> list2 = cVar.f148235b;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    C67684i iVar = it2.next().f151672g;
                    if (!(iVar == null || (userId = iVar.getUserId()) == null)) {
                        arrayList4.add(userId);
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = C89086z.INSTANCE;
            }
            if (arrayList2 != null) {
                collection = C89070n.m154572d((Collection) arrayList2, arrayList);
            } else {
                collection = C89086z.INSTANCE;
            }
            getFetchedUidSet().addAll(collection);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$k */
    public static final class C65773k extends C51425a {

        /* renamed from: a */
        final /* synthetic */ C65761a f148199a;

        static {
            Covode.recordClassIndex(77274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65773k(C65761a aVar, Context context) {
            super(context);
            this.f148199a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            C39115e.m79412a(this.f148199a.getActivity(), this.f148199a.mo104884d(R.id.dqk));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            if (((float) i2) > C13628n.m24520b(this.f148199a.getContext(), 10.0f)) {
                C39115e.m79412a(this.f148199a.getActivity(), this.f148199a.mo104884d(R.id.dqk));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65813b
    /* renamed from: a */
    public final void mo104879a(C67683h hVar, String str) {
        ArrayList arrayList;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(str, "");
        int i = 1;
        if (!(!C89219l.m154714a((Object) str, (Object) this.f148169i.f148238e)) && isAttachedToWindow() && !TextUtils.isEmpty(this.f148169i.f148238e)) {
            if (getSummonFriendSearchPresenter().mo104940d()) {
                this.f148169i.aq_();
            } else {
                this.f148169i.ap_();
            }
            List<? extends C67679e> list = hVar.f151688a;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    C65796b bVar = this.f148167g;
                    String userId = t.f151672g.getUserId();
                    if (userId == null) {
                        userId = "";
                    }
                    if (!bVar.mo104931a(userId)) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            C65791c cVar = this.f148169i;
            cVar.f148235b = arrayList;
            cVar.f148236c = hVar.f151689b;
            cVar.f148237d = hVar.f151690c;
            if (this.f148169i.getItemCount() != 0) {
                i = -1;
            }
            mo104883c(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a$m */
    static final class View$OnKeyListenerC65775m implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C65761a f148201a;

        static {
            Covode.recordClassIndex(77276);
        }

        View$OnKeyListenerC65775m(C65761a aVar) {
            this.f148201a = aVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66) {
                return false;
            }
            C39115e.m79412a(this.f148201a.getActivity(), this.f148201a.mo104884d(R.id.dqk));
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C65761a(Activity activity, String str, String str2, EnumC65848e eVar, Long l, Long l2, List<? extends IMUser> list, AbstractC89172b<? super List<? extends IMUser>, C89391z> bVar, Context context) {
        super(context, null, 0);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6753);
        this.f148159A = activity;
        this.f148160B = str;
        this.f148161C = str2;
        this.f148162D = eVar;
        this.f148163E = l;
        this.f148164F = l2;
        this.f148165G = list;
        this.f148171k = bVar;
        IQAInvitationService b = QAInvitationService.m117786b();
        C89219l.m154716b(b, "");
        this.f148172m = b;
        C88411a aVar = new C88411a();
        this.f148173n = aVar;
        this.f148175p = C89250i.m154773a((AbstractC89171a) C65764c.f148188a);
        this.f148176q = C89250i.m154773a((AbstractC89171a) C65780q.f148206a);
        LayoutInflater.from(context).inflate(R.layout.aqs, this);
        this.f148177r = new C65763b(this, context);
        this.f148178s = new C65766e(this, context);
        this.f148179t = new C65767f(this);
        this.f148180u = new C65765d(this);
        this.f148181v = new C65769h(this);
        C65796b bVar2 = new C65796b(aVar, this.f148177r, this.f148180u);
        this.f148167g = bVar2;
        this.f148182w = bVar2.mo104932b();
        this.f148168h = new C65783a(bVar2);
        this.f148169i = new C65791c(bVar2);
        this.f148170j = new C65787b(bVar2);
        TuxStatusView.C23263c a = C79440a.m138168a(new TuxStatusView.C23263c());
        a.f55132j = new C65781r(this, context);
        this.f148183x = a;
        TuxStatusView.C23263c b2 = C79440a.m138170b(new TuxStatusView.C23263c());
        String string = context.getString(R.string.f2_);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a2 = b2.mo37879a(string);
        String string2 = context.getString(R.string.f29);
        C89219l.m154716b(string2, "");
        this.f148184y = a2.mo37878a((CharSequence) string2);
        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
        String string3 = context.getString(R.string.cgx);
        C89219l.m154716b(string3, "");
        cVar.mo37878a((CharSequence) string3);
        this.f148185z = cVar;
        MethodCollector.m26664o(6753);
    }

    public /* synthetic */ C65761a(Activity activity, String str, String str2, EnumC65848e eVar, Long l, Long l2, List list, AbstractC89172b bVar, Context context, byte b) {
        this(activity, str, str2, eVar, l, l2, list, bVar, context);
    }
}
