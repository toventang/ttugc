package com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61632g;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.p2082ss.android.ugc.aweme.notification.api.NotificationApi;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61804f;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61994d;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62394d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f */
public final class C62401f implements AbstractC62398e<C62403b, List<? extends MusNotice>> {

    /* renamed from: h */
    public static final C62402a f141598h = new C62402a((byte) 0);

    /* renamed from: a */
    public final Object f141599a = new Object();

    /* renamed from: b */
    public C62394d.C62396b f141600b = new C62394d.C62396b();

    /* renamed from: c */
    public boolean f141601c;

    /* renamed from: d */
    public volatile boolean f141602d;

    /* renamed from: e */
    public volatile boolean f141603e;

    /* renamed from: f */
    public boolean f141604f;

    /* renamed from: g */
    public final int f141605g;

    /* renamed from: i */
    private final AbstractC89244h f141606i = C89250i.m154773a((AbstractC89171a) C62405d.f141616a);

    /* renamed from: j */
    private final AbstractC89244h f141607j = C89250i.m154773a((AbstractC89171a) C62406e.f141617a);

    /* renamed from: k */
    private final AbstractC89244h f141608k = C89250i.m154773a((AbstractC89171a) C62408g.f141619a);

    /* renamed from: l */
    private final AbstractC89244h f141609l = C89250i.m154773a((AbstractC89171a) C62407f.f141618a);

    /* renamed from: m */
    private LogPbBean f141610m;

    /* renamed from: n */
    private int f141611n;

    /* renamed from: o */
    private long f141612o;

    /* renamed from: p */
    private volatile boolean f141613p;

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$c */
    public enum EnumC62404c {
        GROUP,
        REPORT,
        SHOP_IM;

        static {
            Covode.recordClassIndex(73194);
        }
    }

    static {
        Covode.recordClassIndex(73191);
    }

    /* renamed from: h */
    private final List<MusNotice> m112859h() {
        return (List) this.f141606i.getValue();
    }

    /* renamed from: i */
    private final List<MusNotice> m112860i() {
        return (List) this.f141607j.getValue();
    }

    /* renamed from: j */
    private final List<MusNotice> m112861j() {
        return (List) this.f141608k.getValue();
    }

    /* renamed from: e */
    public final Map<Integer, NoticeItems> mo100405e() {
        return (Map) this.f141609l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$a */
    public static final class C62402a {
        static {
            Covode.recordClassIndex(73192);
        }

        private C62402a() {
        }

        public /* synthetic */ C62402a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: d */
    public final boolean mo100369d() {
        return this.f141601c;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$b */
    public static final class C62403b {

        /* renamed from: a */
        public final boolean f141614a;

        static {
            Covode.recordClassIndex(73193);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C62403b) && this.f141614a == ((C62403b) obj).f141614a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f141614a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ReqParam(markRead=" + this.f141614a + ")";
        }

        private /* synthetic */ C62403b() {
            this(true);
        }

        public C62403b(boolean z) {
            this.f141614a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$d */
    static final class C62405d extends AbstractC89220m implements AbstractC89171a<List<MusNotice>> {

        /* renamed from: a */
        public static final C62405d f141616a = new C62405d();

        static {
            Covode.recordClassIndex(73195);
        }

        C62405d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$e */
    static final class C62406e extends AbstractC89220m implements AbstractC89171a<List<MusNotice>> {

        /* renamed from: a */
        public static final C62406e f141617a = new C62406e();

        static {
            Covode.recordClassIndex(73196);
        }

        C62406e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$f */
    static final class C62407f extends AbstractC89220m implements AbstractC89171a<Map<Integer, NoticeItems>> {

        /* renamed from: a */
        public static final C62407f f141618a = new C62407f();

        static {
            Covode.recordClassIndex(73197);
        }

        C62407f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, NoticeItems> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$g */
    static final class C62408g extends AbstractC89220m implements AbstractC89171a<List<MusNotice>> {

        /* renamed from: a */
        public static final C62408g f141619a = new C62408g();

        static {
            Covode.recordClassIndex(73198);
        }

        C62408g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: b */
    public final /* synthetic */ AbstractC88979t<AbstractC62398e.C62400b<List<? extends MusNotice>>> mo100367b() {
        return mo100400a((C62403b) null);
    }

    /* renamed from: g */
    public final List<MusNotice> mo100407g() {
        MethodCollector.m26663i(366);
        synchronized (this.f141599a) {
            try {
                this.f141604f = false;
                this.f141602d = false;
            } catch (Throwable th) {
                MethodCollector.m26664o(366);
                throw th;
            }
        }
        List<MusNotice> f = mo100366a();
        MethodCollector.m26664o(366);
        return f;
    }

    /* renamed from: f */
    public final List<MusNotice> mo100366a() {
        List<MusNotice> h;
        List<MusNotice> j;
        MethodCollector.m26663i(2639);
        synchronized (this.f141599a) {
            try {
                if (this.f141602d) {
                    h = m112860i();
                } else {
                    h = m112859h();
                }
                j = C89070n.m154590j(h);
            } finally {
                MethodCollector.m26664o(2639);
            }
        }
        return j;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: c */
    public final /* synthetic */ AbstractC88979t<AbstractC62398e.C62400b<List<? extends MusNotice>>> mo100368c() {
        if (this.f141602d || this.f141600b.f141592a <= 0 || this.f141613p || this.f141603e) {
            C39109f.m79404c("MiddleDataSource", "loadMore blocked by:" + this.f141602d + ", " + this.f141600b + ", " + this.f141613p + ", " + this.f141603e);
            AbstractC88979t a = AbstractC88979t.m154294a(new C62409h(this));
            C89219l.m154716b(a, "");
            return a;
        }
        this.f141603e = true;
        AbstractC88979t a2 = AbstractC88979t.m154294a(new C62410i(this));
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$k */
    public static final class C62414k<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62414k f141627a = new C62414k();

        static {
            Covode.recordClassIndex(73204);
        }

        C62414k() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return C89387v.m154943a(EnumC62404c.REPORT, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$m */
    public static final class C62416m<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62416m f141629a = new C62416m();

        static {
            Covode.recordClassIndex(73206);
        }

        C62416m() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return C89387v.m154943a(EnumC62404c.SHOP_IM, obj);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ AbstractC62398e.C62400b mo100399a(Object obj) {
        C89219l.m154721d(obj, "");
        return AbstractC62398e.C62399a.m112854a(this, obj);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$h */
    static final class C62409h<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62401f f141620a;

        static {
            Covode.recordClassIndex(73199);
        }

        C62409h(C62401f fVar) {
            this.f141620a = fVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<AbstractC62398e.C62400b<List<MusNotice>>> vVar) {
            C89219l.m154721d(vVar, "");
            C62401f fVar = this.f141620a;
            C39077ac.m79342a(vVar, fVar.mo100399a(fVar.mo100366a()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$j */
    public static final class C62413j<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62401f f141626a;

        static {
            Covode.recordClassIndex(73203);
        }

        C62413j(C62401f fVar) {
            this.f141626a = fVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<AbstractC62398e.C62400b<List<MusNotice>>> vVar) {
            C89219l.m154721d(vVar, "");
            C62401f fVar = this.f141626a;
            C39077ac.m79342a(vVar, fVar.mo100399a(fVar.mo100366a()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$l */
    public static final class C62415l<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62415l f141628a = new C62415l();

        static {
            Covode.recordClassIndex(73205);
        }

        C62415l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C39109f.m79401a("MiddleDataSource", "refresh report error", th);
            return C89387v.m154943a(EnumC62404c.REPORT, new NoticeListsResponse(null, null, null, 7, null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$n */
    public static final class C62417n<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62417n f141630a = new C62417n();

        static {
            Covode.recordClassIndex(73207);
        }

        C62417n() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C39109f.m79401a("MiddleDataSource", "refresh shop error", th);
            return C89387v.m154943a(EnumC62404c.SHOP_IM, new NoticeListsResponse(null, null, null, 7, null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$o */
    public static final class C62418o<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62401f f141631a;

        /* renamed from: b */
        final /* synthetic */ List f141632b;

        static {
            Covode.recordClassIndex(73208);
        }

        C62418o(C62401f fVar, List list) {
            this.f141631a = fVar;
            this.f141632b = list;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<AbstractC62398e.C62400b<List<MusNotice>>> vVar) {
            C89219l.m154721d(vVar, "");
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            AbstractC88979t.m154299a(this.f141632b).mo143255a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62401f.C62418o.C624191 */

                /* renamed from: a */
                final /* synthetic */ C62418o f141633a;

                static {
                    Covode.recordClassIndex(73209);
                }

                {
                    this.f141633a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    MethodCollector.m26663i(1983);
                    C89378p pVar = (C89378p) obj;
                    if (pVar.getFirst() == EnumC62404c.GROUP) {
                        eVar.element = (T) pVar.getSecond();
                        synchronized (this.f141633a.f141631a.f141599a) {
                            try {
                                List<NoticeItems> notices = ((NoticeListsResponse) pVar.getSecond()).getNotices();
                                if (notices != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (T t : notices) {
                                        if (t.getGroup() != this.f141633a.f141631a.f141605g) {
                                            arrayList.add(t);
                                        }
                                    }
                                    for (T t2 : arrayList) {
                                        this.f141633a.f141631a.mo100405e().put(Integer.valueOf(t2.getGroup()), t2);
                                    }
                                }
                            } finally {
                                MethodCollector.m26664o(1983);
                            }
                        }
                        return;
                    }
                    synchronized (this.f141633a.f141631a.f141599a) {
                        try {
                            List<NoticeItems> notices2 = ((NoticeListsResponse) pVar.getSecond()).getNotices();
                            if (notices2 != null) {
                                for (T t3 : notices2) {
                                    this.f141633a.f141631a.mo100405e().put(Integer.valueOf(t3.getGroup()), t3);
                                }
                            }
                        } finally {
                            MethodCollector.m26664o(1983);
                        }
                    }
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62401f.C62418o.C624202 */

                /* renamed from: a */
                final /* synthetic */ C62418o f141635a;

                static {
                    Covode.recordClassIndex(73210);
                }

                {
                    this.f141635a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    C39109f.m79401a("MiddleDataSource", "refresh error", th);
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    C39077ac.m79342a(vVar, this.f141635a.f141631a.mo100365a(this.f141635a.f141631a.mo100401a((NoticeListsResponse) eVar.element, true), th));
                }
            }, new AbstractC88428a(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62401f.C62418o.C624213 */

                /* renamed from: a */
                final /* synthetic */ C62418o f141638a;

                static {
                    Covode.recordClassIndex(73211);
                }

                {
                    this.f141638a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88428a
                /* renamed from: a */
                public final void mo8579a() {
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    C39077ac.m79342a(vVar, this.f141638a.f141631a.mo100399a(this.f141638a.f141631a.mo100401a((NoticeListsResponse) eVar.element, true)));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$p */
    public static final class C62422p<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C62401f f141641a;

        static {
            Covode.recordClassIndex(73212);
        }

        C62422p(C62401f fVar) {
            this.f141641a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C61933a.C61935b b;
            NoticeListsResponse noticeListsResponse = (NoticeListsResponse) obj;
            C89219l.m154721d(noticeListsResponse, "");
            if (this.f141641a.f141605g == C61530a.C61532b.m111445a() && (b = C61933a.m112077b()) != null) {
                C89219l.m154721d(noticeListsResponse, "");
                C61994d.m112123b(new C61933a.C61935b.C61941f(b, noticeListsResponse));
            }
            return C89387v.m154943a(EnumC62404c.GROUP, noticeListsResponse);
        }
    }

    public C62401f(int i) {
        this.f141605g = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$i */
    static final class C62410i<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62401f f141621a;

        static {
            Covode.recordClassIndex(73200);
        }

        C62410i(C62401f fVar) {
            this.f141621a = fVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<AbstractC62398e.C62400b<List<MusNotice>>> vVar) {
            C89219l.m154721d(vVar, "");
            NotificationApi.m111994a().fetchGroupNotice(new C61632g(this.f141621a.f141605g, this.f141621a.f141600b.f141592a, this.f141621a.f141600b.f141593b, 0, 0, 24, null).toReqStr()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62401f.C62410i.C624111 */

                /* renamed from: a */
                final /* synthetic */ C62410i f141622a;

                static {
                    Covode.recordClassIndex(73201);
                }

                {
                    this.f141622a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    C39077ac.m79342a(vVar, this.f141622a.f141621a.mo100399a(this.f141622a.f141621a.mo100401a((NoticeListsResponse) obj, false)));
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62401f.C62410i.C624122 */

                /* renamed from: a */
                final /* synthetic */ C62410i f141624a;

                static {
                    Covode.recordClassIndex(73202);
                }

                {
                    this.f141624a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    this.f141624a.f141621a.f141603e = false;
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    C89219l.m154716b(th, "");
                    C39077ac.m79343a(vVar, th);
                }
            });
        }
    }

    /* renamed from: a */
    private final NoticeItems m112857a(NoticeListsResponse noticeListsResponse) {
        MusNotice musNotice;
        T t = null;
        if (this.f141605g == 37) {
            ArrayList arrayList = new ArrayList();
            List<NoticeItems> notices = noticeListsResponse.getNotices();
            if (notices != null) {
                Iterator<T> it = notices.iterator();
                while (it.hasNext()) {
                    List<MusNotice> items = it.next().getItems();
                    if (!(items == null || (musNotice = (MusNotice) C89070n.m154583g((List) items)) == null)) {
                        C61630e eVar = musNotice.templateNotice;
                        if (eVar != null) {
                            eVar.f139897m = this.f141605g;
                        }
                        arrayList.add(musNotice);
                    }
                }
            }
            return new NoticeItems(arrayList, false, 0, 0, 0, 0, this.f141605g, 0, BuildConfig.VERSION_CODE, null);
        }
        List<NoticeItems> notices2 = noticeListsResponse.getNotices();
        if (notices2 == null) {
            return null;
        }
        Iterator<T> it2 = notices2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (next.getGroup() == this.f141605g) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* renamed from: a */
    private final void m112858a(C62394d.C62395a aVar) {
        boolean z;
        MethodCollector.m26663i(275);
        synchronized (this.f141599a) {
            try {
                m112859h().clear();
                m112859h().addAll(aVar.f141590p);
                m112860i().clear();
                m112860i().addAll(aVar.f141591q);
                if (!aVar.f141591q.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f141602d = z;
                this.f141610m = aVar.f141578d;
                this.f141612o = aVar.f141579e;
                this.f141611n = aVar.f141581g;
                this.f141600b = aVar.f141582h;
                this.f141601c = aVar.f141583i;
            } finally {
                MethodCollector.m26664o(275);
            }
        }
    }

    /* renamed from: b */
    public final List<MusNotice> mo100403b(List<? extends MusNotice> list) {
        MethodCollector.m26663i(363);
        C89219l.m154721d(list, "");
        if (this.f141613p) {
            C39109f.m79404c("MiddleDataSource", "cannot call insertLive when refreshing:" + list.size());
            List<MusNotice> f = mo100366a();
            MethodCollector.m26664o(363);
            return f;
        }
        synchronized (this.f141599a) {
            try {
                if (!m112861j().isEmpty() || !list.isEmpty()) {
                    m112861j().clear();
                    m112861j().addAll(list);
                    C62394d.m112839a(m112861j(), m112859h());
                    if (!m112860i().isEmpty()) {
                        C62394d.m112839a(m112861j(), m112860i());
                    }
                    List<MusNotice> f2 = mo100366a();
                    MethodCollector.m26664o(363);
                    return f2;
                }
                return mo100366a();
            } finally {
                MethodCollector.m26664o(363);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<AbstractC62398e.C62400b<List<MusNotice>>> mo100400a(C62403b bVar) {
        int i;
        if (this.f141613p || this.f141603e) {
            C39109f.m79404c("MiddleDataSource", "refresh blocked by loading now ");
            AbstractC88979t<AbstractC62398e.C62400b<List<MusNotice>>> a = AbstractC88979t.m154294a(new C62413j(this));
            C89219l.m154716b(a, "");
            return a;
        }
        this.f141613p = true;
        if (bVar == null || bVar.f141614a) {
            i = 1;
        } else {
            i = 0;
        }
        List c = C89070n.m154524c(NotificationApi.m111994a().fetchGroupNotice(new C61632g(this.f141605g, 0, 0, 0, i, 14, null).toReqStr()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C62422p(this)));
        if (this.f141605g == 37 && C61804f.m111867a()) {
            c.add(NotificationApi.m111994a().fetchReportInboxNotice().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(C62414k.f141627a).mo143299f(C62415l.f141628a));
        } else if (this.f141605g == 599) {
            c.add(NotificationApi.m111994a().fetchShopInboxNotice().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(C62416m.f141629a).mo143299f(C62417n.f141630a));
        }
        AbstractC88979t<AbstractC62398e.C62400b<List<MusNotice>>> a2 = AbstractC88979t.m154294a(new C62418o(this, c));
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: a */
    public final List<MusNotice> mo100402a(List<NoticeItems> list) {
        C62394d.C62395a aVar;
        MethodCollector.m26663i(318);
        C89219l.m154721d(list, "");
        if (this.f141613p) {
            C39109f.m79404c("MiddleDataSource", "cannot call insertExtra when refreshing:" + list.size());
            List<MusNotice> f = mo100366a();
            MethodCollector.m26664o(318);
            return f;
        } else if (list.isEmpty()) {
            C39109f.m79403b("MiddleDataSource", "insertExtraListByJanus item empty");
            List<MusNotice> f2 = mo100366a();
            MethodCollector.m26664o(318);
            return f2;
        } else {
            synchronized (this.f141599a) {
                try {
                    for (T t : list) {
                        mo100405e().put(Integer.valueOf(t.getGroup()), t);
                    }
                    aVar = new C62394d.C62395a(m112861j(), C89041ag.m154429c(mo100405e()), C89086z.INSTANCE, this.f141610m, this.f141612o, false, this.f141611n, this.f141600b, this.f141601c, this.f141604f);
                    for (T t2 : m112859h()) {
                        if (!(((MusNotice) t2).type == 1001 || ((MusNotice) t2).type == 999 || t2.isMock())) {
                            aVar.mo100385a(t2);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(318);
                    throw th;
                }
            }
            C62394d.m112838a(aVar);
            m112858a(aVar);
            List<MusNotice> f3 = mo100366a();
            MethodCollector.m26664o(318);
            return f3;
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: a */
    public final /* synthetic */ AbstractC62398e.C62400b<List<? extends MusNotice>> mo100365a(List<? extends MusNotice> list, Throwable th) {
        C89219l.m154721d(list, "");
        return AbstractC62398e.C62399a.m112855a(this, list, th);
    }

    /* renamed from: a */
    public final List<MusNotice> mo100401a(NoticeListsResponse noticeListsResponse, boolean z) {
        mo100404b(noticeListsResponse, z);
        this.f141613p = false;
        this.f141603e = false;
        return mo100366a();
    }

    /* renamed from: b */
    public final void mo100404b(NoticeListsResponse noticeListsResponse, boolean z) {
        NoticeItems a;
        Throwable th;
        MethodCollector.m26663i(247);
        if (noticeListsResponse == null || (a = m112857a(noticeListsResponse)) == null) {
            MethodCollector.m26664o(247);
            return;
        }
        synchronized (this.f141599a) {
            try {
                List<MusNotice> j = m112861j();
                Map c = C89041ag.m154429c(mo100405e());
                List<MusNotice> items = a.getItems();
                if (items == null) {
                    items = C89086z.INSTANCE;
                }
                try {
                    C62394d.C62395a aVar = new C62394d.C62395a(j, c, items, noticeListsResponse.getLobPb(), Math.max(a.getLastReadTime(), this.f141612o), z, a.getTotal(), new C62394d.C62396b(a.getMaxTime(), a.getMinTime()), a.getHasMore(), this.f141604f);
                    if (!z) {
                        for (T t : m112859h()) {
                            if (!(((MusNotice) t).type == 1001 || ((MusNotice) t).type == 999 || t.isMock())) {
                                aVar.mo100385a(t);
                            }
                        }
                    }
                    C62394d.m112838a(aVar);
                    m112858a(aVar);
                    MethodCollector.m26664o(247);
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.m26664o(247);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(247);
                throw th;
            }
        }
    }
}
