package com.p2082ss.android.ugc.aweme.notification.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61634i;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.bean.C61865a;
import com.p2082ss.android.ugc.aweme.notification.bean.C61869d;
import com.p2082ss.android.ugc.aweme.notification.bean.C61871f;
import com.p2082ss.android.ugc.aweme.notification.bean.C61884p;
import com.p2082ss.android.ugc.aweme.notification.bean.C61886q;
import com.p2082ss.android.ugc.aweme.notification.bean.C61890t;
import com.p2082ss.android.ugc.aweme.notification.p3521c.C61917a;
import com.p2082ss.android.ugc.aweme.notification.p3521c.C61922e;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62100e;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62028aa;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62060ar;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62061as;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62065at;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62068au;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62070av;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62077aw;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62087b;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62096c;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62172z;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62029ab;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62031ac;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62032ad;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62034af;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62036ah;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62040ai;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62041aj;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62044ak;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62046al;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62048am;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62050an;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62053ao;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62056ap;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62059aq;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62120m;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62123n;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62126o;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62137r;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62141s;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62143t;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62150u;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62155v;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62167x;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62232h;
import com.p2082ss.android.ugc.aweme.notification.utils.C62261f;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89266e;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.f */
public final class C61840f implements AbstractC62100e {

    /* renamed from: a */
    public final AbstractC61841a f140403a;

    /* renamed from: b */
    private final AbstractC89244h f140404b = C89250i.m154773a((AbstractC89171a) C61842b.f140406a);

    /* renamed from: c */
    private final AbstractC89244h f140405c = C89250i.m154773a((AbstractC89171a) C61843c.f140407a);

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.f$a */
    public interface AbstractC61841a {
        static {
            Covode.recordClassIndex(72577);
        }

        /* renamed from: a */
        List<MusNotice> mo99901a();

        /* renamed from: a */
        void mo99902a(int i);

        /* renamed from: b */
        BaseNotificationVM mo99903b();

        /* renamed from: c */
        Fragment mo99904c();

        /* renamed from: d */
        DmtStatusView mo99905d();

        /* renamed from: e */
        AbstractC34478k<User> mo99906e();

        /* renamed from: f */
        C62061as.AbstractC62063b mo99907f();

        /* renamed from: g */
        void mo99908g();
    }

    static {
        Covode.recordClassIndex(72576);
    }

    /* renamed from: e */
    private final AbstractC62329c m111957e() {
        return (AbstractC62329c) this.f140404b.getValue();
    }

    /* renamed from: f */
    private final AbstractC62329c m111958f() {
        return (AbstractC62329c) this.f140405c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.f$b */
    static final class C61842b extends AbstractC89220m implements AbstractC89171a<C61917a> {

        /* renamed from: a */
        public static final C61842b f140406a = new C61842b();

        static {
            Covode.recordClassIndex(72578);
        }

        C61842b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61917a invoke() {
            return new C61917a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.f$c */
    static final class C61843c extends AbstractC89220m implements AbstractC89171a<C61922e> {

        /* renamed from: a */
        public static final C61843c f140407a = new C61843c();

        static {
            Covode.recordClassIndex(72579);
        }

        C61843c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61922e invoke() {
            return new C61922e();
        }
    }

    /* renamed from: b */
    private final List<MusNotice> m111949b() {
        return this.f140403a.mo99901a();
    }

    /* renamed from: c */
    private final BaseNotificationVM m111952c() {
        return this.f140403a.mo99903b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Fragment mo99914a() {
        return this.f140403a.mo99904c();
    }

    /* renamed from: d */
    private final long[] m111955d() {
        User user;
        Long valueOf;
        List<MusNotice> b = m111949b();
        ArrayList<MusNotice> arrayList = new ArrayList();
        for (T t : b) {
            if (((MusNotice) t).type == 1001) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (MusNotice musNotice : arrayList) {
            if (!(musNotice instanceof C61871f)) {
                musNotice = null;
            }
            C61871f fVar = (C61871f) musNotice;
            if (!(fVar == null || (user = fVar.f140462a) == null || (valueOf = Long.valueOf(user.roomId)) == null)) {
                arrayList2.add(valueOf);
            }
        }
        return C89070n.m154582f((Collection<Long>) arrayList2);
    }

    /* renamed from: e */
    private int m111956e(int i) {
        return i - m111954d(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.f$d */
    public static final class View$OnClickListenerC61844d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C61840f f140408a;

        static {
            Covode.recordClassIndex(72580);
        }

        View$OnClickListenerC61844d(C61840f fVar) {
            this.f140408a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140408a.f140403a.mo99908g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.f$f */
    public static final class C61846f extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61840f f140410a;

        static {
            Covode.recordClassIndex(72582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61846f(C61840f fVar) {
            super(1);
            this.f140410a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f140410a.f140403a.mo99902a(num.intValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.f$e */
    public static final class C61845e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DmtStatusView f140409a;

        static {
            Covode.recordClassIndex(72581);
        }

        C61845e(DmtStatusView dmtStatusView) {
            this.f140409a = dmtStatusView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f140409a.mo27384f();
            } else {
                this.f140409a.mo27382d();
            }
        }
    }

    public C61840f(AbstractC61841a aVar) {
        C89219l.m154721d(aVar, "");
        this.f140403a = aVar;
    }

    /* renamed from: b */
    private final List<AbstractC62329c> m111950b(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 212) {
            arrayList.add(m111957e());
        } else if (i == 225) {
            arrayList.add(m111958f());
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.f$g */
    static final class View$OnClickListenerC61847g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C61840f f140411a;

        /* renamed from: b */
        final /* synthetic */ int f140412b;

        static {
            Covode.recordClassIndex(72583);
        }

        View$OnClickListenerC61847g(C61840f fVar, int i) {
            this.f140411a = fVar;
            this.f140412b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140411a.f140403a.mo99902a(this.f140412b);
            AbstractC0952i fragmentManager = this.f140411a.mo99914a().getFragmentManager();
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

    /* renamed from: d */
    private final int m111954d(int i) {
        List<Object> d = C89070n.m154571d((Iterable) m111949b(), i);
        int i2 = 0;
        if ((d instanceof Collection) && d.isEmpty()) {
            return 0;
        }
        for (Object obj : d) {
            if ((obj instanceof C61634i) && (i2 = i2 + 1) < 0) {
                C89070n.m154523b();
            }
        }
        return i2;
    }

    /* renamed from: c */
    private final boolean m111953c(int i) {
        if (i > 0) {
            C89266e a = C89266e.C89267a.m154754a(i - 1, 0, -1);
            ArrayList<MusNotice> arrayList = new ArrayList(C89070n.m154526a(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(m111949b().get(((AbstractC89040af) it).mo143429a()));
            }
            for (MusNotice musNotice : arrayList) {
                if (musNotice instanceof C61634i) {
                    if (musNotice.timeLineType == 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62100e
    /* renamed from: a */
    public final void mo93497a(int i) {
        if (i < m111949b().size() && mo99914a().getContext() != null) {
            View$OnClickListenerC61847g gVar = new View$OnClickListenerC61847g(this, i);
            new C23208a.C23211b().mo37797a(new C23208a.C23214e().mo37785a(R.string.b4w).mo37789b(1).mo37786a(gVar)).mo37800b().show(mo99914a().getFragmentManager(), "DELETE_NOTICE_ACTION_SHEET_TAG");
        }
    }

    /* renamed from: a */
    public static View m111948a(int i, ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    private static void m111951b(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder != null) {
            try {
                ((C62129p) viewHolder).mo100157c(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewBaseNotificationHolder");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder mo99915a(android.view.ViewGroup r6, int r7) {
        /*
        // Method dump skipped, instructions count: 794
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.mo99915a(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo99916a(RecyclerView.ViewHolder viewHolder, int i) {
        String string;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (!(viewHolder2 instanceof C62028aa)) {
            if (viewHolder2 instanceof AbstractView$OnLongClickListenerC62118k) {
                ((AbstractView$OnLongClickListenerC62118k) viewHolder2).mo100142a(m111949b().get(i), i);
            }
            String a = C62261f.m112631a(m111949b().get(i).timeLineType);
            int a2 = C61848g.m111971a(m111949b().get(i));
            boolean z = true;
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 == 81) {
                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewPromoteNotificationHolder");
                        View$OnClickListenerC62050an anVar = (View$OnClickListenerC62050an) viewHolder2;
                        MusNotice musNotice = m111949b().get(i);
                        if (C62232h.m112535b().mo99309a(81) > 0) {
                            z = false;
                        }
                        anVar.mo100112a(musNotice, z, i, C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())));
                        return;
                    } else if (a2 != 82) {
                        C61865a aVar = null;
                        switch (a2) {
                            case -10000:
                                if (!(viewHolder2 instanceof View$OnClickListenerC62167x)) {
                                    viewHolder2 = null;
                                }
                                View$OnClickListenerC62167x xVar = (View$OnClickListenerC62167x) viewHolder2;
                                if (xVar != null) {
                                    xVar.mo100167a(m111949b().get(i), i, a, C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())), m111952c().f141488a, false, (List<? extends AbstractC62329c>) m111950b(m111949b().get(i).type));
                                    return;
                                }
                                return;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusAdHelperNotificationHolder");
                                ((View$OnClickListenerC62031ac) viewHolder2).mo100101a(m111949b().get(i));
                                return;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTVoteNotificationHolder");
                                ((View$OnClickListenerC62029ab) viewHolder2).mo100099a(m111949b().get(i), m111953c(i), C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())), m111952c().f141488a);
                                return;
                            case 31:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewCommentsNotificationHolder");
                                ((View$OnClickListenerC62137r) viewHolder2).mo100159a(m111949b().get(i), C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())), m111952c().f141488a);
                                m111951b(viewHolder2, a2);
                                return;
                            case 33:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewFansNotificationHolder");
                                ((View$OnClickListenerC62143t) viewHolder2).mo100161a(m111949b().get(i), C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())), m111952c().f141488a);
                                m111951b(viewHolder2, a2);
                                return;
                            case 41:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewLikesNotificationHolder");
                                ((View$OnClickListenerC62150u) viewHolder2).mo100162a(m111949b().get(i), m111953c(i), C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())), m111952c().f141488a);
                                m111951b(viewHolder2, a2);
                                return;
                            case 45:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewMentionNotificationHolder");
                                ((View$OnClickListenerC62155v) viewHolder2).mo100163a(m111949b().get(i), C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())), m111952c().f141488a);
                                m111951b(viewHolder2, a2);
                                return;
                            case 50:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusLiveRecommendAvatarNotificationHolder");
                                View$OnClickListenerC62034af afVar = (View$OnClickListenerC62034af) viewHolder2;
                                MusNotice musNotice2 = m111949b().get(i);
                                if (musNotice2 instanceof C61884p) {
                                    aVar = musNotice2;
                                }
                                afVar.mo100104a(aVar);
                                return;
                            case 61:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewTcmNotificationHolder");
                                View$OnClickListenerC62053ao aoVar = (View$OnClickListenerC62053ao) viewHolder2;
                                MusNotice musNotice3 = m111949b().get(i);
                                if (C62232h.m112535b().mo99309a(61) > 0) {
                                    z = false;
                                }
                                aoVar.mo100113a(musNotice3, z);
                                return;
                            case 69:
                                if (viewHolder2 instanceof View$OnClickListenerC62126o) {
                                    ((View$OnClickListenerC62126o) viewHolder2).mo100150a(m111949b().get(i), C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())), m111952c().f141488a);
                                    return;
                                }
                                return;
                            case 101:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewAssistantNotificationHolder");
                                ((View$OnClickListenerC62041aj) viewHolder2).mo100108a(m111949b().get(i));
                                return;
                            default:
                                switch (a2) {
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                        break;
                                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                        break;
                                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusMixedFollowRequestHolder");
                                        MusNotice musNotice4 = m111949b().get(i);
                                        Objects.requireNonNull(musNotice4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.bean.FollowRequestNotice");
                                        m111952c();
                                        ((View$OnClickListenerC62036ah) viewHolder2).mo100106a((C61869d) musNotice4);
                                        return;
                                    default:
                                        switch (a2) {
                                            case 21:
                                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewDuetNotificationHolder");
                                                ((View$OnClickListenerC62141s) viewHolder2).mo100160a(m111949b().get(i));
                                                m111951b(viewHolder2, a2);
                                                return;
                                            case 22:
                                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewCreateAwemeNotificationHolder");
                                                ((View$OnClickListenerC62046al) viewHolder2).mo100110a(m111949b().get(i));
                                                return;
                                            case 23:
                                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewApproveFollowNotificationHolder");
                                                ((View$OnClickListenerC62040ai) viewHolder2).mo100107a(m111949b().get(i));
                                                return;
                                            case 24:
                                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusFriendNotificationHolder");
                                                ((View$OnClickListenerC62032ad) viewHolder2).mo100102a(m111949b().get(i));
                                                return;
                                            default:
                                                switch (a2) {
                                                    case 999:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTTitleHeadHolder");
                                                        MusNotice musNotice5 = m111949b().get(i);
                                                        Objects.requireNonNull(musNotice5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTitle");
                                                        ((C62172z) viewHolder2).mo100170a((C61634i) musNotice5);
                                                        return;
                                                    case 1000:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusTutorialVideoHolder");
                                                        View$OnClickListenerC62059aq aqVar = (View$OnClickListenerC62059aq) viewHolder2;
                                                        MusNotice musNotice6 = m111949b().get(i);
                                                        if (musNotice6 instanceof C61890t) {
                                                            aVar = musNotice6;
                                                        }
                                                        aqVar.mo100115a(aVar);
                                                        return;
                                                    case 1001:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewLiveNotificationHolder");
                                                        View$OnClickListenerC62048am amVar = (View$OnClickListenerC62048am) viewHolder2;
                                                        MusNotice musNotice7 = m111949b().get(i);
                                                        if (musNotice7 instanceof C61871f) {
                                                            aVar = musNotice7;
                                                        }
                                                        amVar.mo100111a(aVar, m111955d(), m111956e(i));
                                                        return;
                                                    case 1002:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewCheckProfileNotificationHolder");
                                                        ((View$OnClickListenerC62044ak) viewHolder2).mo100109a(m111949b().get(i));
                                                        return;
                                                    case 1003:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTCommentReplyWithVideoNotificationHolder");
                                                        ((View$OnClickListenerC62123n) viewHolder2).mo100148a(m111949b().get(i), C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())), m111952c().f141488a);
                                                        return;
                                                    default:
                                                        switch (a2) {
                                                            case LiveNetAdaptiveHurryTimeSetting.DEFAULT:
                                                                if (viewHolder2 instanceof C62068au) {
                                                                    if (C56318b.m102312c()) {
                                                                        string = mo99914a().getString(R.string.c10);
                                                                    } else {
                                                                        string = mo99914a().getString(R.string.evs);
                                                                    }
                                                                    C89219l.m154716b(string, "");
                                                                    ((C62068au) viewHolder2).mo100121b(string);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2001:
                                                                break;
                                                            case 2002:
                                                                if (viewHolder2 instanceof C62060ar) {
                                                                    String string2 = mo99914a().getString(R.string.fhb);
                                                                    C89219l.m154716b(string2, "");
                                                                    ((C62060ar) viewHolder2).mo100116b(string2);
                                                                    viewHolder2.itemView.setOnClickListener(new View$OnClickListenerC61844d(this));
                                                                    return;
                                                                }
                                                                return;
                                                            case 2003:
                                                                if (viewHolder2 instanceof C62061as) {
                                                                    C61631f f = m111952c().mo100347f();
                                                                    if (f != null) {
                                                                        ((C62061as) viewHolder2).mo100117a(f.f139902d, f.f139903e, f.f139904f);
                                                                    } else {
                                                                        ((C62061as) viewHolder2).mo100117a(R.string.dia, R.string.dim, 2131231276);
                                                                    }
                                                                    C62061as.AbstractC62063b f2 = this.f140403a.mo99907f();
                                                                    if (f2 != null) {
                                                                        ((C62061as) viewHolder2).f140890a = f2;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                switch (a2) {
                                                                    case 2006:
                                                                        MusNotice musNotice8 = m111949b().get(i);
                                                                        Objects.requireNonNull(musNotice8, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.bean.RecommendNotice");
                                                                        C61886q qVar = (C61886q) musNotice8;
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.RecommendAggregateViewHolder");
                                                                        ((C62065at) viewHolder2).mo100119a(qVar.f140511c, qVar.f140512d);
                                                                        return;
                                                                    case 2007:
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.ThirdPartInvitationViewHolder");
                                                                        C62077aw awVar = (C62077aw) viewHolder2;
                                                                        if (awVar != null) {
                                                                            awVar.mo100067c();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2008:
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.ContactPermissionVH");
                                                                        C62087b bVar = (C62087b) viewHolder2;
                                                                        if (bVar != null) {
                                                                            bVar.mo100067c();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2009:
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTTitleHeadHolder");
                                                                        C62172z zVar = (C62172z) viewHolder2;
                                                                        if (zVar != null) {
                                                                            String string3 = mo99914a().getString(R.string.cla);
                                                                            C89219l.m154716b(string3, "");
                                                                            zVar.mo100171b(string3);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2010:
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.ContactViewHolder");
                                                                        C62096c cVar = (C62096c) viewHolder2;
                                                                        if (cVar != null) {
                                                                            MusNotice musNotice9 = m111949b().get(i);
                                                                            if (musNotice9 instanceof C61865a) {
                                                                                aVar = musNotice9;
                                                                            }
                                                                            cVar.mo100132a(aVar);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2011:
                                                                        break;
                                                                    default:
                                                                        return;
                                                                }
                                                        }
                                                        if (viewHolder2 instanceof C62070av) {
                                                            MusNotice musNotice10 = m111949b().get(i);
                                                            Objects.requireNonNull(musNotice10, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.bean.RecommendNotice");
                                                            User user = ((C61886q) musNotice10).f140510b;
                                                            C62070av avVar = (C62070av) viewHolder2;
                                                            avVar.mo100123a(this.f140403a.mo99906e());
                                                            avVar.mo100124a(user, a2);
                                                            return;
                                                        }
                                                        return;
                                                }
                                        }
                                }
                        }
                    } else {
                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTBusinessAccountHolder");
                        View$OnClickListenerC62120m mVar = (View$OnClickListenerC62120m) viewHolder2;
                        MusNotice musNotice11 = m111949b().get(i);
                        if (C62232h.m112535b().mo99309a(82) > 0) {
                            z = false;
                        }
                        mVar.mo100147a(musNotice11, z, i, C62261f.m112632a(Integer.valueOf(m111952c().mo100337a())));
                        return;
                    }
                }
                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewTextNotificationHolder");
                ((View$OnClickListenerC62056ap) viewHolder2).mo100114a(m111949b().get(i));
                return;
            }
            Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewAssistantNotificationHolder");
            ((View$OnClickListenerC62041aj) viewHolder2).mo100108a(m111949b().get(i));
        }
    }
}
