package com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61637k;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowRequest;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p2082ss.android.ugc.aweme.notification.bean.C61869d;
import com.p2082ss.android.ugc.aweme.notification.bean.C61871f;
import com.p2082ss.android.ugc.aweme.notification.bean.C61872g;
import com.p2082ss.android.ugc.aweme.notification.bean.C61884p;
import com.p2082ss.android.ugc.aweme.notification.bean.C61890t;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveMessage;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.p2082ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61994d;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e;
import com.p2082ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62269l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h */
public final class C62432h implements AbstractC62398e<C62434b, List<? extends MusNotice>> {

    /* renamed from: a */
    public static final C62433a f141655a = new C62433a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f141656b = C89250i.m154773a((AbstractC89171a) C62451p.f141684a);

    /* renamed from: c */
    private final AbstractC89244h f141657c = C89250i.m154773a((AbstractC89171a) C62435c.f141664a);

    /* renamed from: d */
    private final AbstractC89244h f141658d = C89250i.m154773a((AbstractC89171a) C62453r.f141686a);

    /* renamed from: e */
    private final AbstractC89244h f141659e = C89250i.m154773a((AbstractC89171a) C62438f.f141667a);

    /* renamed from: f */
    private final AbstractC89244h f141660f = C89250i.m154773a((AbstractC89171a) C62436d.f141665a);

    /* renamed from: g */
    private final AbstractC89244h f141661g = C89250i.m154773a((AbstractC89171a) C62437e.f141666a);

    /* renamed from: h */
    private final AbstractC89244h f141662h = C89250i.m154773a((AbstractC89171a) C62452q.f141685a);

    static {
        Covode.recordClassIndex(73222);
    }

    /* renamed from: j */
    private List<MusNotice> m112892j() {
        return (List) this.f141656b.getValue();
    }

    /* renamed from: k */
    private List<C61890t> m112893k() {
        return (List) this.f141658d.getValue();
    }

    /* renamed from: l */
    private List<C61884p> m112894l() {
        return (List) this.f141659e.getValue();
    }

    /* renamed from: m */
    private final TutorialVideoViewModel m112895m() {
        return (TutorialVideoViewModel) this.f141662h.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: d */
    public final boolean mo100369d() {
        return false;
    }

    /* renamed from: e */
    public final List<C61869d> mo100420e() {
        return (List) this.f141657c.getValue();
    }

    /* renamed from: f */
    public final List<C61871f> mo100421f() {
        return (List) this.f141660f.getValue();
    }

    /* renamed from: g */
    public final List<NoticeItems> mo100422g() {
        return (List) this.f141661g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$a */
    public static final class C62433a {
        static {
            Covode.recordClassIndex(73223);
        }

        private C62433a() {
        }

        public /* synthetic */ C62433a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$b */
    public static final class C62434b {

        /* renamed from: a */
        public final boolean f141663a;

        static {
            Covode.recordClassIndex(73224);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C62434b) && this.f141663a == ((C62434b) obj).f141663a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f141663a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ReqParam(markRead=" + this.f141663a + ")";
        }

        private /* synthetic */ C62434b() {
            this(true);
        }

        public C62434b(boolean z) {
            this.f141663a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$c */
    static final class C62435c extends AbstractC89220m implements AbstractC89171a<List<C61869d>> {

        /* renamed from: a */
        public static final C62435c f141664a = new C62435c();

        static {
            Covode.recordClassIndex(73225);
        }

        C62435c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C61869d> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$d */
    static final class C62436d extends AbstractC89220m implements AbstractC89171a<List<C61871f>> {

        /* renamed from: a */
        public static final C62436d f141665a = new C62436d();

        static {
            Covode.recordClassIndex(73226);
        }

        C62436d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C61871f> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$e */
    static final class C62437e extends AbstractC89220m implements AbstractC89171a<List<NoticeItems>> {

        /* renamed from: a */
        public static final C62437e f141666a = new C62437e();

        static {
            Covode.recordClassIndex(73227);
        }

        C62437e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<NoticeItems> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$f */
    static final class C62438f extends AbstractC89220m implements AbstractC89171a<List<C61884p>> {

        /* renamed from: a */
        public static final C62438f f141667a = new C62438f();

        static {
            Covode.recordClassIndex(73228);
        }

        C62438f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C61884p> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$p */
    static final class C62451p extends AbstractC89220m implements AbstractC89171a<List<MusNotice>> {

        /* renamed from: a */
        public static final C62451p f141684a = new C62451p();

        static {
            Covode.recordClassIndex(73241);
        }

        C62451p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$r */
    static final class C62453r extends AbstractC89220m implements AbstractC89171a<List<C61890t>> {

        /* renamed from: a */
        public static final C62453r f141686a = new C62453r();

        static {
            Covode.recordClassIndex(73243);
        }

        C62453r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C61890t> invoke() {
            return new ArrayList();
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: b */
    public final /* synthetic */ AbstractC88979t<AbstractC62398e.C62400b<List<? extends MusNotice>>> mo100367b() {
        return mo100417a((C62434b) null);
    }

    /* Return type fixed from 'f.a.t' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: c */
    public final /* synthetic */ AbstractC88979t<AbstractC62398e.C62400b<List<? extends MusNotice>>> mo100368c() {
        return AbstractC62398e.C62399a.m112856a();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$q */
    static final class C62452q extends AbstractC89220m implements AbstractC89171a<TutorialVideoViewModel> {

        /* renamed from: a */
        public static final C62452q f141685a = new C62452q();

        static {
            Covode.recordClassIndex(73242);
        }

        C62452q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TutorialVideoViewModel invoke() {
            TutorialVideoViewModel tutorialVideoViewModel = new TutorialVideoViewModel();
            tutorialVideoViewModel.mo100241a(C17873f.m33102j());
            return tutorialVideoViewModel;
        }
    }

    /* renamed from: h */
    public final synchronized List<MusNotice> mo100366a() {
        List<MusNotice> j;
        MethodCollector.m26663i(1856);
        j = C89070n.m154590j(m112892j());
        MethodCollector.m26664o(1856);
        return j;
    }

    /* renamed from: i */
    public final synchronized void mo100424i() {
        MethodCollector.m26663i(1997);
        m112892j().clear();
        m112892j().addAll(mo100420e());
        m112892j().addAll(m112893k());
        m112892j().addAll(m112894l());
        MethodCollector.m26664o(1997);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$j */
    public static final class C62445j<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C62432h f141677a;

        static {
            Covode.recordClassIndex(73235);
        }

        C62445j(C62432h hVar) {
            this.f141677a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            TutorialVideoResp tutorialVideoResp = (TutorialVideoResp) obj;
            C89219l.m154721d(tutorialVideoResp, "");
            this.f141677a.mo100418a(tutorialVideoResp);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$g */
    public static final class C62439g<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62432h f141668a;

        /* renamed from: b */
        final /* synthetic */ List f141669b;

        static {
            Covode.recordClassIndex(73229);
        }

        C62439g(C62432h hVar, List list) {
            this.f141668a = hVar;
            this.f141669b = list;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<AbstractC62398e.C62400b<List<MusNotice>>> vVar) {
            C89219l.m154721d(vVar, "");
            AbstractC88979t.m154299a(this.f141669b).mo143255a(C624401.f141670a, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62432h.C62439g.C624412 */

                /* renamed from: a */
                final /* synthetic */ C62439g f141671a;

                static {
                    Covode.recordClassIndex(73231);
                }

                {
                    this.f141671a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    C39109f.m79401a("TopDataSource", "refresh error", th);
                    this.f141671a.f141668a.mo100424i();
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    C39077ac.m79342a(vVar, this.f141671a.f141668a.mo100365a(this.f141671a.f141668a.mo100366a(), th));
                }
            }, new AbstractC88428a(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62432h.C62439g.C624423 */

                /* renamed from: a */
                final /* synthetic */ C62439g f141673a;

                static {
                    Covode.recordClassIndex(73232);
                }

                {
                    this.f141673a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88428a
                /* renamed from: a */
                public final void mo8579a() {
                    this.f141673a.f141668a.mo100424i();
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    C62432h hVar = this.f141673a.f141668a;
                    List<MusNotice> h = this.f141673a.f141668a.mo100366a();
                    C89219l.m154721d(h, "");
                    C39077ac.m79342a(vVar, AbstractC62398e.C62399a.m112854a(hVar, h));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$h */
    public static final class C62443h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C62432h f141675a;

        static {
            Covode.recordClassIndex(73233);
        }

        C62443h(C62432h hVar) {
            this.f141675a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            NoticeCombineResponse noticeCombineResponse = (NoticeCombineResponse) obj;
            C89219l.m154721d(noticeCombineResponse, "");
            C61933a.C61935b b = C61933a.m112077b();
            if (b != null) {
                C89219l.m154721d(noticeCombineResponse, "");
                C61994d.m112123b(new C61933a.C61935b.C61940e(b, noticeCombineResponse));
            }
            this.f141675a.mo100419a(noticeCombineResponse);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$i */
    public static final class C62444i<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62444i f141676a = new C62444i();

        static {
            Covode.recordClassIndex(73234);
        }

        C62444i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C39109f.m79401a("TopDataSource", "refresh janus error", th);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$k */
    public static final class C62446k<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62446k f141678a = new C62446k();

        static {
            Covode.recordClassIndex(73236);
        }

        C62446k() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C39109f.m79401a("TopDataSource", "refresh tutorial error", th);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$m */
    public static final class C62448m<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62448m f141680a = new C62448m();

        static {
            Covode.recordClassIndex(73238);
        }

        C62448m() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C39109f.m79401a("TopDataSource", "refreshFollowReq error", th);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$o */
    public static final class C62450o<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62450o f141683a = new C62450o();

        static {
            Covode.recordClassIndex(73240);
        }

        C62450o() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C39109f.m79401a("TopDataSource", "refreshLive error", th);
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo100418a(TutorialVideoResp tutorialVideoResp) {
        MethodCollector.m26663i(1959);
        m112893k().clear();
        if (tutorialVideoResp.getInfo() != null) {
            List<C61890t> k = m112893k();
            TutorialVideoInfo info = tutorialVideoResp.getInfo();
            if (info == null) {
                C89219l.m154715b();
            }
            k.add(C61890t.C61891a.m112015a(info));
        }
        MethodCollector.m26664o(1959);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$l */
    public static final class C62447l<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C62432h f141679a;

        static {
            Covode.recordClassIndex(73237);
        }

        public C62447l(C62432h hVar) {
            this.f141679a = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean apply(FollowRequestResponse followRequestResponse) {
            int i;
            Boolean valueOf;
            MethodCollector.m26663i(1605);
            C89219l.m154721d(followRequestResponse, "");
            int i2 = followRequestResponse.total;
            synchronized (this.f141679a) {
                try {
                    C61869d dVar = (C61869d) C89070n.m154583g((List) this.f141679a.mo100420e());
                    boolean z = false;
                    if (dVar != null) {
                        i = dVar.f140454a;
                    } else {
                        i = 0;
                    }
                    if (i2 != i) {
                        this.f141679a.mo100420e().clear();
                        if (i2 > 0) {
                            this.f141679a.mo100420e().add(new C61869d(i2, C89086z.INSTANCE));
                        }
                        this.f141679a.mo100424i();
                        z = true;
                    }
                    valueOf = Boolean.valueOf(z);
                } finally {
                    MethodCollector.m26664o(1605);
                }
            }
            return valueOf;
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<AbstractC62398e.C62400b<List<MusNotice>>> mo100417a(C62434b bVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            z = bVar.f141663a;
        } else {
            z = true;
        }
        AbstractC88979t f = AbstractC88979t.m154304a(MusNotificationApiManager.m111988a(z)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C62443h(this)).mo143299f(C62444i.f141676a);
        C89219l.m154716b(f, "");
        arrayList.add(f);
        if (!C62269l.m112652a() && C16048b.m29633a().mo25421a(true, "inbox_has_top_msg", false)) {
            AbstractC88979t<R> f2 = m112895m().mo100240a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C62445j(this)).mo143299f(C62446k.f141678a);
            C89219l.m154716b(f2, "");
            arrayList.add(f2);
        }
        AbstractC88979t<AbstractC62398e.C62400b<List<MusNotice>>> a = AbstractC88979t.m154294a(new C62439g(this, arrayList));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$n */
    public static final class C62449n<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C62432h f141681a;

        /* renamed from: b */
        final /* synthetic */ long f141682b;

        static {
            Covode.recordClassIndex(73239);
        }

        public C62449n(C62432h hVar, long j) {
            this.f141681a = hVar;
            this.f141682b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean apply(LiveNoticeMessageResponse liveNoticeMessageResponse) {
            List<CombineLiveNotice> list;
            boolean z;
            MethodCollector.m26663i(1361);
            C89219l.m154721d(liveNoticeMessageResponse, "");
            C62259e.m112614a(liveNoticeMessageResponse, SystemClock.elapsedRealtime() - this.f141682b);
            LiveMessage liveMessage = liveNoticeMessageResponse.liveMessage;
            if (liveMessage != null) {
                list = liveMessage.liveNotice;
            } else {
                list = null;
            }
            boolean z2 = false;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                synchronized (this.f141681a) {
                    try {
                        this.f141681a.mo100421f().clear();
                        List<C61871f> f = this.f141681a.mo100421f();
                        LiveMessage liveMessage2 = liveNoticeMessageResponse.liveMessage;
                        if (liveMessage2 == null) {
                            C89219l.m154715b();
                        }
                        List<CombineLiveNotice> list2 = liveMessage2.liveNotice;
                        if (list2 == null) {
                            C89219l.m154715b();
                        }
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C61872g.m112009a(it.next()));
                        }
                        f.addAll(arrayList);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1361);
                        throw th;
                    }
                }
                z2 = true;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            MethodCollector.m26664o(1361);
            return valueOf;
        }
    }

    /* renamed from: a */
    public final synchronized void mo100419a(NoticeCombineResponse noticeCombineResponse) {
        MethodCollector.m26663i(1946);
        NoticeCombineDatas data = noticeCombineResponse.getData();
        if (data == null) {
            MethodCollector.m26664o(1946);
            return;
        }
        mo100420e().clear();
        m112894l().clear();
        mo100421f().clear();
        mo100422g().clear();
        FollowRequest followRequest = data.getFollowRequest();
        if (followRequest != null && followRequest.getFollowRequestCount() > 0) {
            mo100420e().add(new C61869d(followRequest.getFollowRequestCount(), C89086z.INSTANCE));
        }
        C61637k recommendAvatars = data.getRecommendAvatars();
        if (recommendAvatars != null) {
            LiveOuterService.m107269s();
            List<UrlModel> list = recommendAvatars.f139917a;
            if (list != null && !list.isEmpty()) {
                m112894l().add(C61884p.C61885a.m112013a(recommendAvatars));
            }
        }
        List<CombineLiveNotice> liveNotices = data.getLiveNotices();
        if (liveNotices != null) {
            Iterator<T> it = liveNotices.iterator();
            while (it.hasNext()) {
                mo100421f().add(C61872g.m112009a(it.next()));
            }
        }
        List<NoticeItems> shopNotice = data.getShopNotice();
        if (shopNotice != null) {
            mo100422g().addAll(shopNotice);
        }
        List<NoticeItems> reportNotice = data.getReportNotice();
        if (reportNotice != null) {
            mo100422g().addAll(reportNotice);
            MethodCollector.m26664o(1946);
            return;
        }
        MethodCollector.m26664o(1946);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: a */
    public final /* synthetic */ AbstractC62398e.C62400b<List<? extends MusNotice>> mo100365a(List<? extends MusNotice> list, Throwable th) {
        C89219l.m154721d(list, "");
        return AbstractC62398e.C62399a.m112855a(this, list, th);
    }
}
