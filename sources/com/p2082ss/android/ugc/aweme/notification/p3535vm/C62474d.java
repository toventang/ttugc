package com.p2082ss.android.ugc.aweme.notification.p3535vm;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.api.NotificationApi;
import com.p2082ss.android.ugc.aweme.notification.bean.C61873h;
import com.p2082ss.android.ugc.aweme.notification.bean.C61886q;
import com.p2082ss.android.ugc.aweme.notification.bean.C61888r;
import com.p2082ss.android.ugc.aweme.notification.bean.EnumC61867b;
import com.p2082ss.android.ugc.aweme.notification.bean.EnumC61874i;
import com.p2082ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62381a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62401f;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62432h;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62261f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.d */
public class C62474d extends C62455c {

    /* renamed from: i */
    public static final C62475a f141719i = new C62475a((byte) 0);

    /* renamed from: d */
    public final C62432h f141720d = new C62432h();

    /* renamed from: e */
    public final C62401f f141721e = new C62401f(this.f141692b);

    /* renamed from: f */
    public final C62381a f141722f = new C62381a();

    /* renamed from: g */
    public volatile AbstractC62398e<?, List<MusNotice>> f141723g;

    /* renamed from: h */
    public volatile EnumC62476b f141724h;

    /* renamed from: j */
    private final AbstractC89244h f141725j = C89250i.m154773a((AbstractC89171a) C62495k.f141754a);

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$b */
    public enum EnumC62476b {
        PRELOAD_INJECT_CACHE,
        PRELOAD_REFRESH_EXCEPT_REC,
        PRELOAD_REFRESH_CLICK,
        REFRESH,
        LOAD_MORE,
        EXPAND,
        REFRESH_LIVE,
        REFRESH_FOLLOW_REQ;

        static {
            Covode.recordClassIndex(73266);
        }
    }

    static {
        Covode.recordClassIndex(73264);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo100448b(EnumC62476b bVar) {
        C89219l.m154721d(bVar, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final List<EnumC62476b> mo100450k() {
        return (List) this.f141725j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$a */
    public static final class C62475a {
        static {
            Covode.recordClassIndex(73265);
        }

        private C62475a() {
        }

        public /* synthetic */ C62475a(byte b) {
            this();
        }
    }

    /* renamed from: n */
    private final boolean mo100455n() {
        if (this.f141723g != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c
    /* renamed from: i */
    public boolean mo100443i() {
        return mo100447a(EnumC62476b.REFRESH);
    }

    /* renamed from: o */
    private static boolean m112929o() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c
    /* renamed from: j */
    public final boolean mo100444j() {
        return mo100435a(new C62480f(this));
    }

    /* renamed from: l */
    public final boolean mo100451l() {
        return mo100435a(new C62492j(this));
    }

    /* renamed from: m */
    public final boolean mo100452m() {
        return mo100435a(new C62484h(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$k */
    static final class C62495k extends AbstractC89220m implements AbstractC89171a<List<? extends EnumC62476b>> {

        /* renamed from: a */
        public static final C62495k f141754a = new C62495k();

        static {
            Covode.recordClassIndex(73285);
        }

        C62495k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends EnumC62476b> invoke() {
            return C89070n.m154522b(EnumC62476b.PRELOAD_REFRESH_EXCEPT_REC, EnumC62476b.PRELOAD_REFRESH_CLICK, EnumC62476b.REFRESH);
        }
    }

    public C62474d() {
        super(C61530a.C61532b.m111445a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$g */
    public static final class CallableC62483g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C62474d f141733a;

        /* renamed from: b */
        final /* synthetic */ boolean f141734b;

        /* renamed from: c */
        final /* synthetic */ List f141735c;

        /* renamed from: d */
        final /* synthetic */ EnumC62476b f141736d;

        /* renamed from: e */
        final /* synthetic */ boolean f141737e;

        static {
            Covode.recordClassIndex(73273);
        }

        CallableC62483g(C62474d dVar, boolean z, List list, EnumC62476b bVar, boolean z2) {
            this.f141733a = dVar;
            this.f141734b = z;
            this.f141735c = list;
            this.f141736d = bVar;
            this.f141737e = z2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            EnumC61874i iVar;
            this.f141733a.mo100439e().setValue(Boolean.valueOf(this.f141734b));
            this.f141733a.mo100431a().setValue(this.f141735c);
            EnumC62476b bVar = this.f141736d;
            if (this.f141733a.mo100450k().contains(bVar)) {
                C33943c<EnumC61874i> b = this.f141733a.mo100436b();
                if (!this.f141735c.isEmpty() || !this.f141737e) {
                    iVar = EnumC61874i.SUCCESS;
                } else {
                    iVar = EnumC61874i.ERROR;
                }
                b.setValue(iVar);
                this.f141733a.f141724h = null;
            } else if (bVar == EnumC62476b.LOAD_MORE) {
                this.f141733a.mo100437c().setValue(EnumC61874i.SUCCESS);
            }
            this.f141733a.mo100448b(this.f141736d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$h */
    static final class C62484h extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C62474d f141738a;

        static {
            Covode.recordClassIndex(73274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62484h(C62474d dVar) {
            super(0);
            this.f141738a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.f141738a.mo100438d()) {
                C39109f.m79404c("NotificationTLModel", "refreshFollowReq but loading now");
                z = false;
            } else {
                C39109f.m79403b("NotificationTLModel", "refreshFollowReq start");
                AbstractC88979t f = AbstractC88979t.m154304a(FollowRequestApiManager.f140716b.fetchFollowRequestList(System.currentTimeMillis() / 1000, 1, 0)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C62432h.C62447l(this.f141738a.f141720d)).mo143299f(C62432h.C62448m.f141680a);
                C89219l.m154716b(f, "");
                AbstractC88412b a = f.mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d.C62484h.C624851 */

                    /* renamed from: a */
                    final /* synthetic */ C62484h f141739a;

                    static {
                        Covode.recordClassIndex(73275);
                    }

                    {
                        this.f141739a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        Boolean bool = (Boolean) obj;
                        C89219l.m154716b(bool, "");
                        if (bool.booleanValue()) {
                            this.f141739a.f141738a.mo100449b(EnumC62476b.REFRESH_FOLLOW_REQ, false);
                        }
                    }
                }, C624862.f141740a);
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, this.f141738a.mo100441g());
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$j */
    static final class C62492j extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C62474d f141751a;

        static {
            Covode.recordClassIndex(73282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62492j(C62474d dVar) {
            super(0);
            this.f141751a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.f141751a.mo100438d()) {
                C39109f.m79404c("NotificationTLModel", "refreshLive but loading now");
                z = false;
            } else {
                C39109f.m79403b("NotificationTLModel", "refreshLive start");
                AbstractC88979t<R> f = NotificationApi.m111994a().fetchLiveNotice("tiktok_message", 0, 3, 81).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C62432h.C62449n(this.f141751a.f141720d, SystemClock.elapsedRealtime())).mo143299f(C62432h.C62450o.f141683a);
                C89219l.m154716b(f, "");
                AbstractC88412b a = f.mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d.C62492j.C624931 */

                    /* renamed from: a */
                    final /* synthetic */ C62492j f141752a;

                    static {
                        Covode.recordClassIndex(73283);
                    }

                    {
                        this.f141752a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        Boolean bool = (Boolean) obj;
                        C89219l.m154716b(bool, "");
                        if (bool.booleanValue()) {
                            this.f141752a.f141751a.f141721e.mo100403b(this.f141752a.f141751a.f141720d.mo100421f());
                            this.f141752a.f141751a.mo100449b(EnumC62476b.REFRESH_LIVE, false);
                        }
                    }
                }, C624942.f141753a);
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, this.f141751a.mo100441g());
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$f */
    static final class C62480f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C62474d f141730a;

        static {
            Covode.recordClassIndex(73270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62480f(C62474d dVar) {
            super(0);
            this.f141730a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Object obj;
            boolean z = false;
            if (this.f141730a.mo100438d()) {
                C39109f.m79404c("NotificationTLModel", "loadMore but loading now");
            } else {
                AbstractC62398e<?, List<MusNotice>> eVar = this.f141730a.f141723g;
                if (eVar == null || true != eVar.mo100369d()) {
                    C39109f.m79404c("NotificationTLModel", "loadMore but now more");
                    List<MusNotice> value = this.f141730a.mo100431a().getValue();
                    if (value != null) {
                        obj = C89070n.m154588i((List) value);
                    } else {
                        obj = null;
                    }
                    if (obj instanceof C61873h) {
                        C33943c<List<MusNotice>> a = this.f141730a.mo100431a();
                        List<MusNotice> value2 = this.f141730a.mo100431a().getValue();
                        if (value2 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(value2, "");
                        List<MusNotice> g = C89070n.m154585g((Collection) value2);
                        C89070n.m154541d((List) g);
                        a.postValue(g);
                    }
                } else {
                    C39109f.m79403b("NotificationTLModel", "loadMore start");
                    C61862a.m111998a(this.f141730a.mo100437c(), EnumC61874i.LOADING);
                    AbstractC88412b a2 = eVar.mo100368c().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d.C62480f.C624811 */

                        /* renamed from: a */
                        final /* synthetic */ C62480f f141731a;

                        static {
                            Covode.recordClassIndex(73271);
                        }

                        {
                            this.f141731a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            this.f141731a.f141730a.mo100449b(EnumC62476b.LOAD_MORE, false);
                        }
                    }, new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d.C62480f.C624822 */

                        /* renamed from: a */
                        final /* synthetic */ C62480f f141732a;

                        static {
                            Covode.recordClassIndex(73272);
                        }

                        {
                            this.f141732a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            C39109f.m79401a("NotificationTLModel", "loadMore error", (Throwable) obj);
                            this.f141732a.f141730a.mo100437c().postValue(EnumC61874i.ERROR);
                        }
                    });
                    C89219l.m154716b(a2, "");
                    C88934a.m154195a(a2, this.f141730a.mo100441g());
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$i */
    public static final class C62487i extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C62474d f141741a;

        /* renamed from: b */
        final /* synthetic */ EnumC62476b f141742b;

        static {
            Covode.recordClassIndex(73277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62487i(C62474d dVar, EnumC62476b bVar) {
            super(0);
            this.f141741a = dVar;
            this.f141742b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            final boolean z;
            AbstractC88979t<AbstractC62398e.C62400b<List<MusNotice>>> b;
            boolean z2 = true;
            if (!this.f141741a.mo100450k().contains(this.f141742b) || this.f141741a.mo100438d()) {
                C39109f.m79404c("NotificationTLModel", "refresh illegal state, reason:" + this.f141742b + ", isLoading:" + this.f141741a.mo100438d());
                z2 = false;
            } else {
                C39109f.m79403b("NotificationTLModel", "refresh start, reason:" + this.f141742b);
                C61862a.m111998a(this.f141741a.mo100436b(), EnumC61874i.LOADING);
                this.f141741a.f141724h = this.f141742b;
                List<AbstractC62398e> c = C89070n.m154524c(this.f141741a.f141720d, this.f141741a.f141721e);
                if (C66652b.f149825a.mo105657c() && (this.f141742b == EnumC62476b.REFRESH || this.f141742b == EnumC62476b.PRELOAD_REFRESH_CLICK)) {
                    c.add(this.f141741a.f141722f);
                    this.f141741a.f141721e.f141604f = true;
                }
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) c, 10));
                for (AbstractC62398e eVar : c) {
                    if (this.f141742b == EnumC62476b.PRELOAD_REFRESH_EXCEPT_REC && (eVar instanceof C62401f)) {
                        b = ((C62401f) eVar).mo100400a(new C62401f.C62403b(false));
                    } else if (this.f141742b != EnumC62476b.PRELOAD_REFRESH_EXCEPT_REC || !(eVar instanceof C62432h)) {
                        b = eVar.mo100367b();
                    } else {
                        b = ((C62432h) eVar).mo100417a(new C62432h.C62434b(false));
                    }
                    arrayList.add(b);
                }
                ArrayList arrayList2 = arrayList;
                List<MusNotice> value = this.f141741a.mo100431a().getValue();
                if (value == null || value.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                final AtomicInteger atomicInteger = new AtomicInteger(-2);
                final C89233z.C89234a aVar = new C89233z.C89234a();
                aVar.element = false;
                AbstractC88412b a = AbstractC88979t.m154299a(arrayList2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new AbstractC88434g(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d.C62487i.C624881 */

                    /* renamed from: a */
                    final /* synthetic */ C62487i f141743a;

                    static {
                        Covode.recordClassIndex(73278);
                    }

                    {
                        this.f141743a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88434g
                    public final /* synthetic */ Object apply(Object obj) {
                        AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
                        C89219l.m154721d(bVar, "");
                        if (((bVar.f141595a instanceof C62432h) || (bVar.f141595a instanceof C62401f)) && atomicInteger.incrementAndGet() == 0) {
                            this.f141743a.f141741a.f141721e.mo100403b(this.f141743a.f141741a.f141720d.mo100421f());
                            this.f141743a.f141741a.f141721e.mo100402a(this.f141743a.f141741a.f141720d.mo100422g());
                        }
                        return new AbstractC62398e.C62400b(bVar.f141595a, bVar.f141595a.mo100366a(), bVar.f141597c);
                    }
                }).mo143255a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d.C62487i.C624892 */

                    /* renamed from: a */
                    final /* synthetic */ C62487i f141745a;

                    static {
                        Covode.recordClassIndex(73279);
                    }

                    {
                        this.f141745a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
                        if ((bVar.f141595a instanceof C62401f) && z && (!bVar.f141596b.isEmpty())) {
                            C39109f.m79403b("NotificationTLModel", "handle pre-refresh result, reason:" + this.f141745a.f141742b);
                            this.f141745a.f141741a.mo100449b(this.f141745a.f141742b, false);
                        }
                        if (bVar.f141597c != null) {
                            aVar.element = true;
                        }
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d.C62487i.C624903 */

                    /* renamed from: a */
                    final /* synthetic */ C62487i f141748a;

                    static {
                        Covode.recordClassIndex(73280);
                    }

                    {
                        this.f141748a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C39109f.m79401a("NotificationTLModel", "refresh error, reason:" + this.f141748a.f141742b, (Throwable) obj);
                        this.f141748a.f141741a.mo100446a(this.f141748a.f141742b, true);
                    }
                }, new AbstractC88428a(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d.C62487i.C624914 */

                    /* renamed from: a */
                    final /* synthetic */ C62487i f141749a;

                    static {
                        Covode.recordClassIndex(73281);
                    }

                    {
                        this.f141749a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88428a
                    /* renamed from: a */
                    public final void mo8579a() {
                        this.f141749a.f141741a.mo100446a(this.f141749a.f141742b, aVar.element);
                    }
                });
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, this.f141741a.mo100441g());
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: a */
    public final int mo100445a(String str) {
        return this.f141722f.mo100378a(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$d */
    public static final class C62478d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C62474d f141728a;

        static {
            Covode.recordClassIndex(73268);
        }

        public C62478d(C62474d dVar) {
            this.f141728a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f141728a.mo100449b(EnumC62476b.EXPAND, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$e */
    public static final class C62479e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C62479e f141729a = new C62479e();

        static {
            Covode.recordClassIndex(73269);
        }

        C62479e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39109f.m79401a("NotificationTLModel", "expand unknown error", (Throwable) obj);
        }
    }

    /* renamed from: a */
    public final boolean mo100447a(EnumC62476b bVar) {
        C89219l.m154721d(bVar, "");
        return mo100435a(new C62487i(this, bVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$c */
    public static final class C62477c<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62474d f141727a;

        static {
            Covode.recordClassIndex(73267);
        }

        public C62477c(C62474d dVar) {
            this.f141727a = dVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Boolean> vVar) {
            C89219l.m154721d(vVar, "");
            this.f141727a.f141721e.mo100407g();
            C39077ac.m79342a((AbstractC88982v) vVar, (Object) true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c
    /* renamed from: a */
    public final void mo100434a(MusNotice musNotice) {
        C89219l.m154721d(musNotice, "");
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112929o();
        }
        if (!C58029j.f132256h) {
            C39109f.m79404c("NotificationTLModel", "deleteData net unavailable");
            mo100440f().setValue(C89387v.m154943a(musNotice, EnumC61867b.NET_ERR));
            return;
        }
        int i = musNotice.type;
        if (i == 2001 || i == 2011) {
            C39109f.m79403b("NotificationTLModel", "deleteRecommend start");
            Objects.requireNonNull(musNotice, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.bean.RecommendNotice");
            User user = ((C61886q) musNotice).f140510b;
            if (user == null) {
                C89219l.m154715b();
            }
            C66652b bVar = C66652b.f149825a;
            String uid = user.getUid();
            C89219l.m154716b(uid, "");
            bVar.mo105655a(uid, user.getSecUid());
            C62259e.m112624b(user, Integer.valueOf(this.f141722f.mo100378a(user.getUid())), C62261f.m112632a(Integer.valueOf(this.f141692b)));
            List<MusNotice> value = mo100431a().getValue();
            if (value != null) {
                List<MusNotice> g = C89070n.m154585g((Collection) value);
                g.remove(musNotice);
                mo100442h().add(musNotice.nid);
                MusNotice musNotice2 = (MusNotice) C89070n.m154588i((List) g);
                if (musNotice2 != null && 2000 == musNotice2.type) {
                    mo100442h().add(((MusNotice) C89070n.m154541d((List) g)).nid);
                }
                mo100431a().setValue(g);
                mo100440f().setValue(C89387v.m154943a(musNotice, EnumC61867b.SUCCESS));
                return;
            }
            return;
        }
        super.mo100434a(musNotice);
    }

    /* renamed from: a */
    public final synchronized void mo100446a(EnumC62476b bVar, boolean z) {
        MethodCollector.m26663i(428);
        if (this.f141721e.f141604f && this.f141722f.mo100366a().isEmpty()) {
            this.f141721e.f141604f = false;
            this.f141721e.mo100407g();
        }
        mo100449b(bVar, z);
        MethodCollector.m26664o(428);
    }

    /* renamed from: b */
    public final synchronized void mo100449b(EnumC62476b bVar, boolean z) {
        MethodCollector.m26663i(529);
        C89219l.m154721d(bVar, "");
        List<MusNotice> h = this.f141720d.mo100366a();
        List<MusNotice> f = this.f141721e.mo100366a();
        List<MusNotice> f2 = this.f141722f.mo100366a();
        if (!h.isEmpty() || !f.isEmpty() || !f2.isEmpty()) {
            List<MusNotice> arrayList = new ArrayList<>();
            arrayList.add(new C61888r());
            arrayList.addAll(h);
            if (f.isEmpty()) {
                arrayList.add(new C61886q(2003, null, null, 0, 14));
            } else {
                arrayList.addAll(f);
            }
            this.f141723g = null;
            if (this.f141721e.f141602d || !this.f141721e.f141601c) {
                arrayList.addAll(f2);
                if (this.f141722f.mo100381e().mo100369d()) {
                    this.f141723g = this.f141722f;
                    arrayList.add(new C61873h());
                }
            } else {
                this.f141723g = this.f141721e;
                arrayList.add(new C61873h());
            }
            mo100432a(arrayList);
            C39109f.m79403b("NotificationTLModel", "handleCombine, reason:" + bVar + ", hasError:" + z + ", result:[" + arrayList.size() + ", " + mo100455n() + ", " + (this.f141723g instanceof C62401f) + "], top:[" + h.size() + "], middle:[" + f.size() + ", " + this.f141721e.f141601c + ", " + this.f141721e.f141602d + "], bottom:[" + f2.size() + ", " + this.f141722f.mo100381e().mo100369d() + ']');
            m112927a(bVar, arrayList, z);
            MethodCollector.m26664o(529);
            return;
        }
        m112927a(bVar, C89086z.INSTANCE, z);
        MethodCollector.m26664o(529);
    }

    /* renamed from: a */
    private final void m112927a(EnumC62476b bVar, List<? extends MusNotice> list, boolean z) {
        C1731i.m5640b(new CallableC62483g(this, mo100455n(), list, bVar, z), C1731i.f5564c);
    }
}
