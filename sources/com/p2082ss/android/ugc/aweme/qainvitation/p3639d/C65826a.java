package com.p2082ss.android.ugc.aweme.qainvitation.p3639d;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3639d.C65839c;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.d.a */
public final class C65826a extends ConstraintLayout {

    /* renamed from: i */
    public static final C65828a f148330i = new C65828a((byte) 0);

    /* renamed from: g */
    public final C65839c f148331g;

    /* renamed from: h */
    final C65833b f148332h;

    /* renamed from: j */
    private final C88411a f148333j;

    /* renamed from: k */
    private final IQAInvitationService f148334k;

    /* renamed from: l */
    private AbstractC89172b<? super List<? extends IMUser>, C89391z> f148335l;

    /* renamed from: m */
    private final TuxStatusView.C23263c f148336m;

    /* renamed from: n */
    private String f148337n;

    /* renamed from: o */
    private String f148338o;

    /* renamed from: p */
    private long f148339p;

    /* renamed from: q */
    private long f148340q;

    /* renamed from: r */
    private List<? extends User> f148341r;

    /* renamed from: s */
    private SparseArray f148342s;

    static {
        Covode.recordClassIndex(77327);
    }

    /* renamed from: c */
    public final View mo104956c(int i) {
        if (this.f148342s == null) {
            this.f148342s = new SparseArray();
        }
        View view = (View) this.f148342s.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f148342s.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.a$a */
    public static final class C65828a {
        static {
            Covode.recordClassIndex(77329);
        }

        private C65828a() {
        }

        public /* synthetic */ C65828a(byte b) {
            this();
        }
    }

    public final C65833b getAdapter() {
        return this.f148332h;
    }

    public final C88411a getCompositeDisposable() {
        return this.f148333j;
    }

    public final String getEnterFrom() {
        return this.f148338o;
    }

    public final String getEnterMethod() {
        return this.f148337n;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z>, h.f.a.b<java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, h.z> */
    public final AbstractC89172b<List<? extends IMUser>, C89391z> getInvitedUsersObserver() {
        return this.f148335l;
    }

    public final IQAInvitationService getQaInviteService() {
        return this.f148334k;
    }

    public final long getQuestionId() {
        return this.f148339p;
    }

    public final long getQuestionUserId() {
        return this.f148340q;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getUsers() {
        return this.f148341r;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
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
        }
    }

    public final void setQuestionId(long j) {
        this.f148339p = j;
    }

    public final void setQuestionUserId(long j) {
        this.f148340q = j;
    }

    public final void setEnterFrom(String str) {
        C89219l.m154721d(str, "");
        this.f148338o = str;
    }

    public final void setEnterMethod(String str) {
        C89219l.m154721d(str, "");
        this.f148337n = str;
    }

    public final void setInvitedUsersObserver(AbstractC89172b<? super List<? extends IMUser>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f148335l = bVar;
    }

    public final void setUsers(List<? extends User> list) {
        C89219l.m154721d(list, "");
        this.f148341r = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.a$b */
    public static final class C65829b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C65826a f148344a;

        static {
            Covode.recordClassIndex(77330);
        }

        C65829b(C65826a aVar) {
            this.f148344a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC89172b<List<? extends IMUser>, C89391z> invitedUsersObserver = this.f148344a.getInvitedUsersObserver();
            C89219l.m154716b(obj, "");
            invitedUsersObserver.invoke(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.a$d */
    static final class C65831d extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65826a f148346a;

        /* renamed from: b */
        final /* synthetic */ Context f148347b;

        static {
            Covode.recordClassIndex(77332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65831d(C65826a aVar, Context context) {
            super(1);
            this.f148346a = aVar;
            this.f148347b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise));
            tuxButton2.setText(this.f148347b.getString(R.string.gzy));
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.qainvitation.p3639d.C65826a.C65831d.View$OnClickListenerC658321 */

                /* renamed from: a */
                final /* synthetic */ C65831d f148348a;

                static {
                    Covode.recordClassIndex(77333);
                }

                {
                    this.f148348a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f148348a.f148346a.mo104955a(true);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo104955a(boolean z) {
        if (z) {
            mo9603b(0);
        }
        AbstractC88979t a = AbstractC88979t.m154294a(new C65839c.C65841b(this.f148331g)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        this.f148333j.mo142945a(a.mo143289d(new C65829b(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9603b(int i) {
        TuxStatusView tuxStatusView;
        if (i == 0) {
            TuxStatusView tuxStatusView2 = (TuxStatusView) mo104956c(R.id.e77);
            if (tuxStatusView2 != null) {
                tuxStatusView2.mo37867a();
            }
        } else if (i == 2 && (tuxStatusView = (TuxStatusView) mo104956c(R.id.e77)) != null) {
            tuxStatusView.setStatus(this.f148336m);
        }
        RecyclerView recyclerView = (RecyclerView) mo104956c(R.id.dgn);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        TuxStatusView tuxStatusView3 = (TuxStatusView) mo104956c(R.id.e77);
        if (tuxStatusView3 != null) {
            tuxStatusView3.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.a$c */
    static final class C65830c extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65826a f148345a;

        static {
            Covode.recordClassIndex(77331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65830c(C65826a aVar) {
            super(1);
            this.f148345a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends IMUser> list) {
            List<? extends IMUser> list2 = list;
            C89219l.m154721d(list2, "");
            C65826a aVar = this.f148345a;
            if (aVar.getContext() != null) {
                RecyclerView recyclerView = (RecyclerView) aVar.mo104956c(R.id.dgn);
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                TuxStatusView tuxStatusView = (TuxStatusView) aVar.mo104956c(R.id.e77);
                if (tuxStatusView != null) {
                    tuxStatusView.setVisibility(8);
                }
                if (list2.isEmpty()) {
                    aVar.mo9603b(2);
                } else {
                    aVar.f148332h.aq_();
                    aVar.f148332h.mo104974a(list2);
                    aVar.f148332h.notifyDataSetChanged();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C65826a(String str, String str2, long j, long j2, List<? extends User> list, Context context) {
        super(context, null, 0);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5483);
        this.f148337n = str;
        this.f148338o = str2;
        this.f148339p = j;
        this.f148340q = j2;
        this.f148341r = list;
        C88411a aVar = new C88411a();
        this.f148333j = aVar;
        C65839c cVar = new C65839c(aVar);
        this.f148331g = cVar;
        IQAInvitationService b = QAInvitationService.m117786b();
        C89219l.m154716b(b, "");
        this.f148334k = b;
        C65833b bVar = new C65833b(C89086z.INSTANCE);
        this.f148332h = bVar;
        this.f148335l = new C65830c(this);
        TuxStatusView.C23263c cVar2 = new TuxStatusView.C23263c();
        String string = context.getString(R.string.fz3);
        C89219l.m154716b(string, "");
        cVar2.mo37878a((CharSequence) string);
        cVar2.f55132j = new C65831d(this, context);
        this.f148336m = cVar2;
        View inflate = LayoutInflater.from(context).inflate(R.layout.aqy, this);
        C89219l.m154716b(inflate, "");
        List<IMUser> a = b.mo105001a(this.f148341r);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.dgn);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) inflate.findViewById(R.id.dgn)).setHasFixedSize(true);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.dgn);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(bVar);
        bVar.mo104974a(a);
        bVar.notifyDataSetChanged();
        C39162r.m79460a("enter_qa_invited_you_users_panel", new C33744d().mo59983a("enter_from", this.f148338o).mo59983a("enter_method", this.f148337n).mo59981a("question_id", this.f148339p).mo59981a("question_user_id", this.f148340q).mo59980a("invitee_count", a.size()).f79943a);
        String str3 = this.f148337n;
        String str4 = this.f148338o;
        long j3 = this.f148339p;
        long j4 = this.f148340q;
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(a, "");
        cVar.f148371a = str3;
        cVar.f148372b = str4;
        cVar.f148373c = j3;
        cVar.f148374d = j4;
        cVar.f148375e = a;
        mo104955a(true);
        bVar.mo67813a(new AbstractC39063h.AbstractC39067a(this) {
            /* class com.p2082ss.android.ugc.aweme.qainvitation.p3639d.C65826a.C658271 */

            /* renamed from: a */
            final /* synthetic */ C65826a f148343a;

            static {
                Covode.recordClassIndex(77328);
            }

            {
                this.f148343a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
            /* renamed from: l */
            public final void mo62679l() {
                if (this.f148343a.f148331g.f148376f) {
                    this.f148343a.getAdapter().ao_();
                    this.f148343a.mo104955a(false);
                }
            }
        });
        MethodCollector.m26664o(5483);
    }

    public /* synthetic */ C65826a(String str, String str2, long j, long j2, List list, Context context, byte b) {
        this(str, str2, j, j2, list, context);
    }
}
