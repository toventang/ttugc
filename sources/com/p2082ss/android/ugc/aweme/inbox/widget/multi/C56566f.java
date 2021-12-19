package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.keva.Keva;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.inbox.C56465k;
import com.p2082ss.android.ugc.aweme.inbox.C56511t;
import com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61851j;
import com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p2082ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b.C62011b;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62100e;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62028aa;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62060ar;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62143t;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62167x;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62256c;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f */
public final class C56566f extends AbstractC39060f<FollowPageData> implements AbstractC61851j, AbstractC62100e {

    /* renamed from: a */
    public final C62256c f128976a = new C62256c();

    /* renamed from: b */
    public final NotificationVM f128977b;

    /* renamed from: c */
    boolean f128978c;

    /* renamed from: d */
    boolean f128979d;

    /* renamed from: e */
    FollowPageData f128980e;

    /* renamed from: f */
    List<FollowPageData> f128981f;

    /* renamed from: g */
    public final Fragment f128982g;

    /* renamed from: h */
    private final AbstractC89244h f128983h = C89250i.m154773a((AbstractC89171a) C56570d.f128992a);

    /* renamed from: i */
    private final AbstractC89244h f128984i = C89250i.m154773a((AbstractC89171a) C56567a.f128989a);

    /* renamed from: j */
    private final AbstractC89244h f128985j = C89250i.m154773a((AbstractC89171a) C56568b.f128990a);

    /* renamed from: k */
    private final AbstractC89244h f128986k = C89250i.m154773a((AbstractC89171a) C56569c.f128991a);

    /* renamed from: w */
    private FollowPageData f128987w;

    /* renamed from: x */
    private int f128988x;

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$e */
    public enum EnumC56571e {
        UNKNOWN,
        EMPTY,
        SOME;

        static {
            Covode.recordClassIndex(66394);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$f */
    public enum EnumC56572f {
        INVALID,
        FOLLOW_REQUEST,
        FOLLOWER,
        EMPTY,
        COLLAPSE,
        TEMPLATE;

        static {
            Covode.recordClassIndex(66395);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$j */
    public static final class C56576j implements WeakHandler.IHandler {

        /* renamed from: a */
        public static final C56576j f128999a = new C56576j();

        static {
            Covode.recordClassIndex(66399);
        }

        C56576j() {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    }

    static {
        Covode.recordClassIndex(66389);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$a */
    static final class C56567a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56567a f128989a = new C56567a();

        static {
            Covode.recordClassIndex(66390);
        }

        C56567a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C34722h.m70923b(R.string.fhb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$b */
    static final class C56568b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C56568b f128990a = new C56568b();

        static {
            Covode.recordClassIndex(66391);
        }

        C56568b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C56511t.m102471a().f128747c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$c */
    static final class C56569c extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C56569c f128991a = new C56569c();

        static {
            Covode.recordClassIndex(66392);
        }

        C56569c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(((long) C56511t.m102471a().f128748d) * 3600000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$d */
    static final class C56570d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56570d f128992a = new C56570d();

        static {
            Covode.recordClassIndex(66393);
        }

        C56570d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C34722h.m70923b(R.string.fiu) + " ";
        }
    }

    /* renamed from: m */
    private final void m102542m() {
        this.f128979d = false;
        List<FollowPageData> list = this.f128981f;
        if (list != null) {
            mo63369e().addAll(list);
            mo67829d(this.f128978c);
            notifyDataSetChanged();
        }
    }

    /* renamed from: l */
    public final void mo93502l() {
        List e = mo63369e();
        if (e == null || e.isEmpty()) {
            mo62377b_(C89070n.m154524c(this.f128987w));
        } else {
            mo63369e().clear();
            mo63369e().add(this.f128987w);
        }
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$h */
    static final class C56574h extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56566f f128996a;

        static {
            Covode.recordClassIndex(66397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56574h(C56566f fVar) {
            super(1);
            this.f128996a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f128996a.mo93500b(num.intValue());
            return C89391z.f203057a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (!(viewHolder instanceof View$OnClickListenerC62026a)) {
            viewHolder = null;
        }
        View$OnClickListenerC62026a aVar = (View$OnClickListenerC62026a) viewHolder;
        if (aVar != null) {
            aVar.cf_();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$i */
    public static final class C56575i<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C56566f f128997a;

        /* renamed from: b */
        final /* synthetic */ Context f128998b;

        static {
            Covode.recordClassIndex(66398);
        }

        C56575i(C56566f fVar, Context context) {
            this.f128997a = fVar;
            this.f128998b = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5546e() != null) {
                new C23144b(this.f128997a.f128982g).mo37635a(this.f128998b.getString(R.string.clo)).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$k */
    static final class View$OnClickListenerC56577k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56566f f129000a;

        /* renamed from: b */
        final /* synthetic */ int f129001b;

        static {
            Covode.recordClassIndex(66400);
        }

        View$OnClickListenerC56577k(C56566f fVar, int i) {
            this.f129000a = fVar;
            this.f129001b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129000a.mo93500b(this.f129001b);
            AbstractC0952i fragmentManager = this.f129000a.f128982g.getFragmentManager();
            if (fragmentManager != null) {
                AbstractC0976n a = fragmentManager.mo3552a();
                C89219l.m154716b(a, "");
                Fragment a2 = fragmentManager.mo3551a("DELETE_NOTICE_ACTION_SHEET_TAG");
                if (a2 != null) {
                    a.mo3455a(a2).mo3473c();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        FollowPageData followPageData = (FollowPageData) mo63369e().get(i);
        MusNotice notice = followPageData.getNotice();
        if (notice != null && notice.templateNotice != null) {
            return EnumC56572f.TEMPLATE.ordinal();
        }
        if (followPageData.getNotice() != null) {
            return EnumC56572f.FOLLOWER.ordinal();
        }
        if (followPageData.getFollowRequest() != null) {
            return EnumC56572f.FOLLOW_REQUEST.ordinal();
        }
        return followPageData.getType();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61851j
    /* renamed from: d */
    public final void mo93501d(int i) {
        if (i >= 0 && i < mo63369e().size()) {
            mo63369e().remove(i);
            if (mo63369e().isEmpty()) {
                notifyDataSetChanged();
            } else {
                notifyItemRemoved(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$g */
    static final class View$OnClickListenerC56573g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56566f f128995a;

        static {
            Covode.recordClassIndex(66396);
        }

        View$OnClickListenerC56573g(C56566f fVar) {
            this.f128995a = fVar;
        }

        public final void onClick(View view) {
            List<FollowPageData> list;
            ClickAgent.onClick(view);
            Keva b = C56465k.m102444b();
            b.storeInt("expand_times", b.getInt("expand_times", 0) + 1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", "notification_page");
            C39162r.m79460a("click_see_all_followers", linkedHashMap);
            C56566f fVar = this.f128995a;
            fVar.f128979d = false;
            int indexOf = fVar.mo63369e().indexOf(fVar.f128980e);
            if (indexOf != -1 && (list = fVar.f128981f) != null) {
                fVar.mo63369e().remove(indexOf);
                fVar.mo63369e().addAll(indexOf, list);
                fVar.mo67829d(fVar.f128978c);
                fVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56566f(Fragment fragment) {
        super((byte) 0);
        C89219l.m154721d(fragment, "");
        this.f128982g = fragment;
        this.f128977b = NotificationVM.C62378a.m112820a(fragment);
        this.f128987w = new FollowPageData(EnumC56572f.EMPTY.ordinal(), null, null, 0, 14, null);
        this.f128979d = true;
        this.f128980e = new FollowPageData(EnumC56572f.COLLAPSE.ordinal(), null, null, 0, 14, null);
    }

    /* renamed from: b */
    public final void mo93500b(int i) {
        User user;
        Context context = this.f128982g.getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            int size = this.f92236l.size();
            if (size > 0 && i >= 0 && i < size) {
                FollowPageData followPageData = (FollowPageData) this.f92236l.get(i);
                MusNotice notice = followPageData.getNotice();
                if (notice != null) {
                    MusNotificationApiManager.m111987a(notice.nid).mo5534a(new C56575i(this, context), C1731i.f5564c, null);
                }
                FollowRequestData followRequest = followPageData.getFollowRequest();
                if (!(followRequest == null || (user = followRequest.getUser()) == null)) {
                    FollowRequestApiManager.m112153a(new WeakHandler(C56576j.f128999a), user.getUid());
                    LogHelper a = LogHelperImpl.m77303a();
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    a.mo66438d("follow_request_page", uid);
                }
                this.f92236l.remove(i);
                notifyItemRemoved(i);
            }
            List e = mo63369e();
            if (e == null || e.isEmpty()) {
                mo93502l();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62100e
    /* renamed from: a */
    public final void mo93497a(int i) {
        if (i < mo63369e().size()) {
            FollowPageData followPageData = (FollowPageData) mo63369e().get(i);
            if ((followPageData.getNotice() != null || followPageData.getFollowRequest() != null) && this.f128982g.getContext() != null) {
                View$OnClickListenerC56577k kVar = new View$OnClickListenerC56577k(this, i);
                new C23208a.C23211b().mo37797a(new C23208a.C23214e().mo37785a(R.string.b4w).mo37789b(1).mo37786a(kVar)).mo37800b().show(this.f128982g.getFragmentManager(), "DELETE_NOTICE_ACTION_SHEET_TAG");
            }
        }
    }

    /* renamed from: a */
    public final void mo93498a(EnumC56571e eVar) {
        List<FollowPageData> list;
        List e;
        C89219l.m154721d(eVar, "");
        List e2 = mo63369e();
        if (e2 != null && !e2.isEmpty()) {
            int i = C56578g.f129002a[eVar.ordinal()];
            if (i == 1) {
                m102542m();
            } else if (i == 2 && this.f128979d && (list = this.f128981f) != null && !list.isEmpty() && (e = mo63369e()) != null) {
                e.add(this.f128980e);
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    private static View m102540a(int i, ViewGroup viewGroup) {
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    private final void m102541a(List<FollowPageData> list, List<FollowPageData> list2) {
        int i;
        int size = list.size() - 1;
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = -1;
        int i3 = 0;
        for (T t : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C89070n.m154520a();
            }
            if (currentTimeMillis - (t.getCreateTime() * 1000) <= ((Number) this.f128986k.getValue()).longValue()) {
                i2 = i4;
            }
            i3 = i4;
        }
        if (i2 < 0) {
            i2 = ((Number) this.f128985j.getValue()).intValue();
        }
        if (i2 >= size) {
            this.f128981f = null;
            return;
        }
        List<FollowPageData> g = C89070n.m154585g((Collection) list.subList(i2, size));
        this.f128981f = g;
        if (g != null) {
            i = g.size();
        } else {
            i = 0;
        }
        this.f128988x = i;
        list2.clear();
        list2.addAll(list.subList(0, i2));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        View$OnClickListenerC62026a aaVar;
        C89219l.m154721d(viewGroup, "");
        if (i == EnumC56572f.FOLLOW_REQUEST.ordinal()) {
            aaVar = new C62011b(m102540a((int) R.layout.ke, viewGroup), this, this.f128976a);
            aaVar.mo100078a(this);
        } else if (i == EnumC56572f.TEMPLATE.ordinal()) {
            aaVar = new View$OnClickListenerC62167x(m102540a((int) R.layout.l4, viewGroup), new C56574h(this));
            aaVar.mo100078a(this);
        } else if (i == EnumC56572f.FOLLOWER.ordinal()) {
            aaVar = new View$OnClickListenerC62143t(m102540a((int) R.layout.kw, viewGroup));
            aaVar.mo100078a(this);
        } else if (i == EnumC56572f.EMPTY.ordinal()) {
            aaVar = new View$OnClickListenerC62026a(m102540a((int) R.layout.k6, viewGroup));
        } else if (i == EnumC56572f.COLLAPSE.ordinal()) {
            aaVar = new C62060ar(m102540a((int) R.layout.kb, viewGroup));
        } else {
            aaVar = new C62028aa(m102540a((int) R.layout.l_, viewGroup));
        }
        aaVar.f140768h = this.f128977b;
        return aaVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        MusNotice notice;
        FollowPageData followPageData = (FollowPageData) mo63369e().get(i);
        AbstractView$OnLongClickListenerC62118k kVar = null;
        if (!(followPageData == null || (notice = followPageData.getNotice()) == null)) {
            if (viewHolder instanceof AbstractView$OnLongClickListenerC62118k) {
                kVar = viewHolder;
            }
            AbstractView$OnLongClickListenerC62118k kVar2 = kVar;
            if (kVar2 != null) {
                kVar2.mo100142a(notice, i);
            }
        }
        if (viewHolder instanceof View$OnClickListenerC62167x) {
            MusNotice notice2 = ((FollowPageData) mo63369e().get(i)).getNotice();
            if (notice2 != null) {
                ((View$OnClickListenerC62167x) viewHolder).mo100167a(notice2, i, "", "", "notification_page", false, (List<? extends AbstractC62329c>) C89086z.INSTANCE);
            }
        } else if (viewHolder instanceof View$OnClickListenerC62143t) {
            MusNotice notice3 = ((FollowPageData) mo63369e().get(i)).getNotice();
            if (notice3 != null) {
                ((View$OnClickListenerC62143t) viewHolder).mo100161a(notice3, "", "notification_page");
            }
        } else if (viewHolder instanceof C62011b) {
            FollowRequestData followRequest = ((FollowPageData) mo63369e().get(i)).getFollowRequest();
            if (followRequest != null && followRequest.getUser() != null) {
                followRequest.getUser().setFollowFrom(29);
                User user = followRequest.getUser();
                C17191a.C17192a b = new C17191a.C17192a().mo27179b((String) this.f128983h.getValue());
                C62011b bVar = (C62011b) viewHolder;
                String a = AbstractView$OnLongClickListenerC62118k.m112310a(followRequest.getCreateTime(), bVar.f140983i);
                C89219l.m154716b(a, "");
                user.setFollowFromMsg(b.mo27177a(a).f40973a.toString());
                bVar.mo100065a(followRequest.getUser(), "notification_page");
            }
        } else if (viewHolder instanceof C62060ar) {
            ((C62060ar) viewHolder).mo100116b((String) this.f128984i.getValue());
            viewHolder.itemView.setOnClickListener(new View$OnClickListenerC56573g(this));
        }
    }

    /* renamed from: a */
    public final void mo93499a(List<FollowPageData> list, boolean z, EnumC56571e eVar) {
        C89219l.m154721d(eVar, "");
        this.f128978c = z;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
            if (this.f128979d && eVar != EnumC56571e.EMPTY) {
                if (!C56465k.m102443a()) {
                    this.f128979d = false;
                } else {
                    m102541a(list, arrayList);
                    if (eVar == EnumC56571e.SOME && this.f128988x > 0) {
                        arrayList.add(this.f128980e);
                    }
                }
            }
        }
        super.mo62377b_(arrayList);
    }
}
