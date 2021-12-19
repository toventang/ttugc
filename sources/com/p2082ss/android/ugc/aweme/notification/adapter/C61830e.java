package com.p2082ss.android.ugc.aweme.notification.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56346e;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.adapter.C61840f;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61994d;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62061as;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62081ax;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62116j;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.e */
public final class C61830e extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: f */
    public static final C61831a f140382f = new C61831a((byte) 0);

    /* renamed from: a */
    public DmtStatusView f140383a;

    /* renamed from: b */
    public AbstractC34478k<User> f140384b;

    /* renamed from: c */
    public C62061as.AbstractC62063b f140385c;

    /* renamed from: d */
    public volatile boolean f140386d;

    /* renamed from: e */
    public final Fragment f140387e;

    /* renamed from: g */
    private final AbstractC89244h f140388g = C61862a.m111996a(new C61839i(this));

    /* renamed from: h */
    private final AbstractC89244h f140389h = C61862a.m111996a(C61833c.f140393a);

    /* renamed from: i */
    private final C61840f f140390i = new C61840f(new C61834d(this));

    static {
        Covode.recordClassIndex(72566);
    }

    /* renamed from: a */
    public final NotificationVM mo99912a() {
        return (NotificationVM) this.f140388g.getValue();
    }

    /* renamed from: b */
    public final List<MusNotice> mo99913b() {
        return (List) this.f140389h.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m111932a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$a */
    public static final class C61831a {
        static {
            Covode.recordClassIndex(72567);
        }

        private C61831a() {
        }

        public /* synthetic */ C61831a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$b */
    public static final class C61832b extends C1445j.AbstractC1447a {

        /* renamed from: a */
        public final List<MusNotice> f140391a;

        /* renamed from: b */
        public final List<MusNotice> f140392b;

        static {
            Covode.recordClassIndex(72568);
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: a */
        public final int mo3768a() {
            return this.f140391a.size();
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: b */
        public final int mo3770b() {
            return this.f140392b.size();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
        /* JADX WARN: Multi-variable type inference failed */
        public C61832b(List<? extends MusNotice> list, List<? extends MusNotice> list2) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            this.f140391a = list;
            this.f140392b = list2;
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: b */
        public final boolean mo3771b(int i, int i2) {
            if (this.f140391a.get(i).getUniqueId() == this.f140392b.get(i2).getUniqueId()) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: c */
        public final boolean mo3772c(int i, int i2) {
            return C89219l.m154714a(this.f140391a.get(i), this.f140392b.get(i2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$c */
    static final class C61833c extends AbstractC89220m implements AbstractC89171a<List<MusNotice>> {

        /* renamed from: a */
        public static final C61833c f140393a = new C61833c();

        static {
            Covode.recordClassIndex(72569);
        }

        C61833c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$d */
    public static final class C61834d implements C61840f.AbstractC61841a {

        /* renamed from: a */
        final /* synthetic */ C61830e f140394a;

        static {
            Covode.recordClassIndex(72570);
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: a */
        public final List<MusNotice> mo99901a() {
            return this.f140394a.mo99913b();
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: b */
        public final /* synthetic */ BaseNotificationVM mo99903b() {
            return this.f140394a.mo99912a();
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: c */
        public final Fragment mo99904c() {
            return this.f140394a.f140387e;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: d */
        public final DmtStatusView mo99905d() {
            DmtStatusView dmtStatusView = this.f140394a.f140383a;
            if (dmtStatusView == null) {
                C89219l.m154710a("statusView");
            }
            return dmtStatusView;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: e */
        public final AbstractC34478k<User> mo99906e() {
            AbstractC34478k<User> kVar = this.f140394a.f140384b;
            if (kVar == null) {
                C89219l.m154710a("recommendListener");
            }
            return kVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: f */
        public final C62061as.AbstractC62063b mo99907f() {
            C62061as.AbstractC62063b bVar = this.f140394a.f140385c;
            if (bVar == null) {
                C89219l.m154710a("turnOnQAListener");
            }
            return bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: g */
        public final void mo99908g() {
            C62455c j = this.f140394a.mo99912a().mo100354j();
            if (!(j instanceof C62474d)) {
                j = null;
            }
            C62474d dVar = (C62474d) j;
            if (dVar != null) {
                C39109f.m79403b("NotificationTLModel", "expand start");
                AbstractC88412b a = AbstractC88979t.m154294a(new C62474d.C62477c(dVar)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C62474d.C62478d(dVar), C62474d.C62479e.f141729a);
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, dVar.mo100441g());
            }
            C62259e.m112629c(this.f140394a.mo99912a().mo100343b());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61834d(C61830e eVar) {
            this.f140394a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: a */
        public final void mo99902a(int i) {
            this.f140394a.mo99912a().mo100354j().mo100433a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$e */
    static final class C61835e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C61835e f140395a = new C61835e();

        static {
            Covode.recordClassIndex(72571);
        }

        C61835e() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m111947a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m111947a();
            }
            return Boolean.valueOf(C58029j.f132256h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$g */
    public static final class C61837g extends AbstractC89220m implements AbstractC89171a<C1445j.C1450d> {

        /* renamed from: a */
        final /* synthetic */ List f140397a;

        /* renamed from: b */
        final /* synthetic */ List f140398b;

        static {
            Covode.recordClassIndex(72573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61837g(List list, List list2) {
            super(0);
            this.f140397a = list;
            this.f140398b = list2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1445j.C1450d invoke() {
            return C1445j.m4922a(new C61832b(this.f140397a, this.f140398b), true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$i */
    static final class C61839i extends AbstractC89220m implements AbstractC89171a<NotificationVM> {

        /* renamed from: a */
        final /* synthetic */ C61830e f140402a;

        static {
            Covode.recordClassIndex(72575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61839i(C61830e eVar) {
            super(0);
            this.f140402a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.C62378a.m112820a(this.f140402a.f140387e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return mo99913b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return mo99913b().get(i).getUniqueId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return C61848g.m111971a(mo99913b().get(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$f */
    static final class C61836f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61830e f140396a;

        static {
            Covode.recordClassIndex(72572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61836f(C61830e eVar) {
            super(1);
            this.f140396a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                this.f140396a.mo99912a().mo100354j().mo100444j();
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof View$OnClickListenerC62026a)) {
            viewHolder = null;
        }
        View$OnClickListenerC62026a aVar = (View$OnClickListenerC62026a) viewHolder;
        if (aVar != null) {
            aVar.mo100081d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$h */
    public static final class C61838h extends AbstractC89220m implements AbstractC89172b<C1445j.C1450d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61830e f140399a;

        /* renamed from: b */
        final /* synthetic */ List f140400b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f140401c;

        static {
            Covode.recordClassIndex(72574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61838h(C61830e eVar, List list, AbstractC89171a aVar) {
            super(1);
            this.f140399a = eVar;
            this.f140400b = list;
            this.f140401c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C1445j.C1450d dVar) {
            C1445j.C1450d dVar2 = dVar;
            if (dVar2 == null || this.f140399a.f140386d) {
                C39109f.m79404c("NotificationAdapter", "submitListByDiffer but data changed again");
            } else {
                this.f140399a.mo99913b().clear();
                this.f140399a.mo99913b().addAll(this.f140400b);
                dVar2.mo4951a(this.f140399a);
                AbstractC89171a aVar = this.f140401c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            return C89391z.f203057a;
        }
    }

    public C61830e(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f140387e = fragment;
        setHasStableIds(C61933a.m112075a().f140622a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2;
        BaseNotice baseNotice;
        int a;
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        C56346e.m102340e();
        if (!(viewHolder instanceof View$OnClickListenerC62026a)) {
            viewHolder2 = null;
        } else {
            viewHolder2 = viewHolder;
        }
        View$OnClickListenerC62026a aVar = (View$OnClickListenerC62026a) viewHolder2;
        if (aVar != null) {
            aVar.cf_();
        }
        if (!(viewHolder instanceof AbstractView$OnLongClickListenerC62118k)) {
            viewHolder = null;
        }
        AbstractView$OnLongClickListenerC62118k kVar = (AbstractView$OnLongClickListenerC62118k) viewHolder;
        if (kVar != null && (baseNotice = kVar.f140984j) != null && C61933a.m112075a().f140623b && !mo99912a().mo100354j().mo100438d() && !(!C89219l.m154714a((Object) mo99912a().mo100354j().mo100439e().getValue(), (Object) true)) && (a = C89070n.m154546a((List) mo99913b(), (Object) baseNotice)) > 0 && mo99913b().size() - a <= 10) {
            C61994d.m112121a(C61835e.f140395a, new C61836f(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C62116j) {
            C62116j jVar = (C62116j) viewHolder;
            jVar.f140768h = NotificationVM.C62378a.m112820a(jVar.f140978a);
            return;
        }
        this.f140390i.mo99916a(viewHolder, i);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m111932a(C61830e eVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(1042);
        C89219l.m154721d(viewGroup, "");
        if (i == 9999) {
            viewHolder = new C62116j(C61840f.m111948a((int) R.layout.k_, viewGroup), eVar.f140387e);
        } else if (i != 99999) {
            viewHolder = eVar.f140390i.mo99915a(viewGroup, i);
        } else {
            viewHolder = new C62081ax(C61840f.m111948a((int) R.layout.kf, viewGroup));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(1042);
        return viewHolder;
    }
}
