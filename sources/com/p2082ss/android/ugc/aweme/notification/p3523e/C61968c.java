package com.p2082ss.android.ugc.aweme.notification.p3523e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.C34406ba;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.notice.api.services.AbstractC61610a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p077b.C1731i;
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
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.notification.e.c */
public final class C61968c implements IAccountUserService.AbstractC31278a {

    /* renamed from: a */
    public static final C61992d f140657a = new C61992d((byte) 0);

    /* renamed from: b */
    public static final C61968c f140658b;

    /* renamed from: c */
    private static final AbstractC89244h f140659c = C89250i.m154773a((AbstractC89171a) C61993e.f140705a);

    /* renamed from: d */
    private static HandlerC61971c f140660d;

    /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c */
    public static final class HandlerC61971c extends Handler implements AbstractC61610a {

        /* renamed from: c */
        public static final C61973a f140665c = new C61973a((byte) 0);

        /* renamed from: a */
        public boolean f140666a;

        /* renamed from: b */
        public final String f140667b;

        /* renamed from: d */
        private final AbstractC89244h f140668d = C89250i.m154773a((AbstractC89171a) C61978f.f140683a);

        /* renamed from: e */
        private final AbstractC89244h f140669e = C89250i.m154773a((AbstractC89171a) C61979g.f140684a);

        /* renamed from: f */
        private final AbstractC89244h f140670f = C89250i.m154773a((AbstractC89171a) C61988l.f140694a);

        /* renamed from: g */
        private final AbstractC89244h f140671g = C89250i.m154773a((AbstractC89171a) C61974b.f140676a);

        /* renamed from: h */
        private final AbstractC89244h f140672h = C89250i.m154773a((AbstractC89171a) C61989m.f140695a);

        /* renamed from: i */
        private final AbstractC89244h f140673i = C89250i.m154773a((AbstractC89171a) C61991o.f140698a);

        /* renamed from: j */
        private final AbstractC89244h f140674j = C89250i.m154773a((AbstractC89171a) C61987k.f140693a);

        static {
            Covode.recordClassIndex(72720);
        }

        /* renamed from: b */
        public final LruCache<String, C61970b> mo100033b() {
            return (LruCache) this.f140668d.getValue();
        }

        /* renamed from: c */
        public final LruCache<String, C61970b> mo100035c() {
            return (LruCache) this.f140669e.getValue();
        }

        /* renamed from: d */
        public final LruCache<String, C61970b> mo100036d() {
            return (LruCache) this.f140670f.getValue();
        }

        /* renamed from: e */
        public final LruCache<String, Integer> mo100037e() {
            return (LruCache) this.f140671g.getValue();
        }

        /* renamed from: f */
        public final CopyOnWriteArrayList<C61969a> mo100038f() {
            return (CopyOnWriteArrayList) this.f140672h.getValue();
        }

        /* renamed from: g */
        public final CopyOnWriteArraySet<String> mo100039g() {
            return (CopyOnWriteArraySet) this.f140673i.getValue();
        }

        /* renamed from: h */
        public final CopyOnWriteArraySet<String> mo100040h() {
            return (CopyOnWriteArraySet) this.f140674j.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$a */
        public static final class C61973a {
            static {
                Covode.recordClassIndex(72722);
            }

            private C61973a() {
            }

            public /* synthetic */ C61973a(byte b) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$b */
        static final class C61974b extends AbstractC89220m implements AbstractC89171a<LruCache<String, Integer>> {

            /* renamed from: a */
            public static final C61974b f140676a = new C61974b();

            static {
                Covode.recordClassIndex(72723);
            }

            C61974b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LruCache<String, Integer> invoke() {
                return new LruCache(50);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$f */
        static final class C61978f extends AbstractC89220m implements AbstractC89171a<LruCache<String, C61970b>> {

            /* renamed from: a */
            public static final C61978f f140683a = new C61978f();

            static {
                Covode.recordClassIndex(72727);
            }

            C61978f() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LruCache<String, C61970b> invoke() {
                return new LruCache(12);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$k */
        static final class C61987k extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<String>> {

            /* renamed from: a */
            public static final C61987k f140693a = new C61987k();

            static {
                Covode.recordClassIndex(72736);
            }

            C61987k() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ CopyOnWriteArraySet<String> invoke() {
                return new CopyOnWriteArraySet();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$m */
        static final class C61989m extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArrayList<C61969a>> {

            /* renamed from: a */
            public static final C61989m f140695a = new C61989m();

            static {
                Covode.recordClassIndex(72738);
            }

            C61989m() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ CopyOnWriteArrayList<C61969a> invoke() {
                return new CopyOnWriteArrayList();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$o */
        static final class C61991o extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<String>> {

            /* renamed from: a */
            public static final C61991o f140698a = new C61991o();

            static {
                Covode.recordClassIndex(72740);
            }

            C61991o() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ CopyOnWriteArraySet<String> invoke() {
                return new CopyOnWriteArraySet();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$g */
        static final class C61979g extends AbstractC89220m implements AbstractC89171a<LruCache<String, C61970b>> {

            /* renamed from: a */
            public static final C61979g f140684a = new C61979g();

            static {
                Covode.recordClassIndex(72728);
            }

            C61979g() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LruCache<String, C61970b> invoke() {
                return new LruCache(C61968c.m112096a().f140702d);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$l */
        static final class C61988l extends AbstractC89220m implements AbstractC89171a<LruCache<String, C61970b>> {

            /* renamed from: a */
            public static final C61988l f140694a = new C61988l();

            static {
                Covode.recordClassIndex(72737);
            }

            C61988l() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LruCache<String, C61970b> invoke() {
                return new LruCache(C61968c.m112096a().f140703e);
            }
        }

        /* renamed from: i */
        public final C1731i<C89391z> mo100042i() {
            return C61994d.m112120a(new C61980h(this));
        }

        /* renamed from: j */
        public final C1731i<C89391z> mo100043j() {
            return C61994d.m112120a(new C61975c(this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$c */
        public static final class C61975c extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ HandlerC61971c f140677a;

            static {
                Covode.recordClassIndex(72724);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C61975c(HandlerC61971c cVar) {
                super(0);
                this.f140677a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                HandlerC61971c.m112100a(this.f140677a.mo100035c());
                HandlerC61971c.m112100a(this.f140677a.mo100036d());
                this.f140677a.mo100035c().size();
                this.f140677a.mo100036d().size();
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Keva mo100031a() {
            return Keva.getRepo("preload_notice_video_" + this.f140667b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$d */
        public static final class C61976d extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ HandlerC61971c f140678a;

            /* renamed from: b */
            final /* synthetic */ BaseNotice f140679b;

            static {
                Covode.recordClassIndex(72725);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C61976d(HandlerC61971c cVar, BaseNotice baseNotice) {
                super(0);
                this.f140678a = cVar;
                this.f140679b = baseNotice;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                int i;
                BaseNotice baseNotice = this.f140679b;
                if (baseNotice != null && HandlerC61971c.m112101a(baseNotice)) {
                    String c = HandlerC61971c.m112103c(this.f140679b);
                    if (C80538hl.m139614a(c)) {
                        Integer num = this.f140678a.mo100037e().get(c);
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        this.f140678a.mo100037e().put(c, Integer.valueOf(i + 1));
                        HandlerC61971c cVar = this.f140678a;
                        try {
                            cVar.mo100031a().storeString("notice_click_times", C80342dg.m139300a().mo46674b(cVar.mo100037e().snapshot()));
                            C89379q.m157068constructorimpl(0);
                        } catch (Throwable th) {
                            C89379q.m157068constructorimpl(C89382r.m154941a(th));
                        }
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$h */
        public static final class C61980h extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ HandlerC61971c f140685a;

            static {
                Covode.recordClassIndex(72729);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C61980h(HandlerC61971c cVar) {
                super(0);
                this.f140685a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C39109f.m79403b("NoticeVideoManager", "release:" + this.f140685a.f140667b);
                this.f140685a.mo100033b().evictAll();
                this.f140685a.mo100035c().evictAll();
                this.f140685a.mo100036d().evictAll();
                this.f140685a.mo100037e().evictAll();
                this.f140685a.mo100038f().clear();
                this.f140685a.mo100039g().clear();
                this.f140685a.mo100040h().clear();
                this.f140685a.f140666a = false;
                this.f140685a.removeCallbacksAndMessages(null);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$e */
        public static final class C61977e extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ HandlerC61971c f140680a;

            /* renamed from: b */
            final /* synthetic */ BaseNotice f140681b;

            /* renamed from: c */
            final /* synthetic */ int f140682c;

            static {
                Covode.recordClassIndex(72726);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61977e(HandlerC61971c cVar, BaseNotice baseNotice, int i) {
                super(0);
                this.f140680a = cVar;
                this.f140681b = baseNotice;
                this.f140682c = i;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
                if (r2 < com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c.m112096a().f140701c) goto L_0x000a;
             */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ p4600h.C89391z invoke() {
                /*
                // Method dump skipped, instructions count: 249
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c.HandlerC61971c.C61977e.invoke():java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$i */
        static final class C61981i extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ HandlerC61971c f140686a;

            static {
                Covode.recordClassIndex(72730);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C61981i(HandlerC61971c cVar) {
                super(0);
                this.f140686a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                final List j;
                if (this.f140686a.mo100039g().isEmpty()) {
                    C39109f.m79403b("NoticeVideoManager", "requestData but aid list empty");
                } else {
                    List g = C89070n.m154585g((Collection) this.f140686a.mo100039g());
                    List g2 = C89070n.m154585g((Collection) g);
                    this.f140686a.mo100039g().clear();
                    this.f140686a.mo100040h().addAll(g);
                    ArrayList arrayList = new ArrayList();
                    while (!g.isEmpty()) {
                        if (g.size() >= 10) {
                            j = C89070n.m154590j(g.subList(0, 10));
                        } else {
                            j = C89070n.m154590j(g);
                        }
                        g.removeAll(j);
                        AbstractC88979t b = AbstractC88979t.m154294a(new C61986j(j)).mo143278b(C88925a.m154180b(C88946a.f201991c));
                        C89219l.m154716b(b, "");
                        AbstractC88979t d = b.mo143292d(new AbstractC88434g(this) {
                            /* class com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c.HandlerC61971c.C61981i.C619821 */

                            /* renamed from: a */
                            final /* synthetic */ C61981i f140687a;

                            static {
                                Covode.recordClassIndex(72731);
                            }

                            {
                                this.f140687a = r1;
                            }

                            @Override // p4560f.p4561a.p4567d.AbstractC88434g
                            public final /* synthetic */ Object apply(Object obj) {
                                C89219l.m154721d(obj, "");
                                this.f140687a.f140686a.mo100040h().removeAll(j);
                                return obj;
                            }
                        });
                        C89219l.m154716b(d, "");
                        arrayList.add(d);
                    }
                    C39109f.m79403b("NoticeVideoManager", "requestData, aids:" + g2 + ", requests:" + arrayList.size());
                    AbstractC88979t.m154299a(arrayList).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143255a(new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c.HandlerC61971c.C61981i.C619832 */

                        /* renamed from: a */
                        final /* synthetic */ C61981i f140689a;

                        static {
                            Covode.recordClassIndex(72732);
                        }

                        {
                            this.f140689a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            List<? extends Aweme> list = (List) obj;
                            StringBuilder sb = new StringBuilder("requestData onNext:");
                            C89219l.m154716b(list, "");
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next().getAid());
                            }
                            C39109f.m79403b("NoticeVideoManager", sb.append(arrayList).toString());
                            this.f140689a.f140686a.mo100030a(list);
                        }
                    }, C619843.f140690a, new AbstractC88428a(this) {
                        /* class com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c.HandlerC61971c.C61981i.C619854 */

                        /* renamed from: a */
                        final /* synthetic */ C61981i f140691a;

                        static {
                            Covode.recordClassIndex(72734);
                        }

                        {
                            this.f140691a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88428a
                        /* renamed from: a */
                        public final void mo8579a() {
                            C39109f.m79403b("NoticeVideoManager", "requestData finished, " + this.f140691a.f140686a.mo100039g().size() + ", " + this.f140691a.f140686a.mo100040h().size() + ", " + this.f140691a.f140686a.mo100035c().size() + ", " + this.f140691a.f140686a.mo100036d().size());
                        }
                    });
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$n */
        public static final class C61990n extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ HandlerC61971c f140696a;

            /* renamed from: b */
            final /* synthetic */ List f140697b;

            static {
                Covode.recordClassIndex(72739);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C61990n(HandlerC61971c cVar, List list) {
                super(0);
                this.f140696a = cVar;
                this.f140697b = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                LruCache<String, C61970b> d;
                LruCache<String, C61970b> c;
                this.f140697b.size();
                this.f140696a.mo100038f();
                for (Aweme aweme : this.f140697b) {
                    String aid = aweme.getAid();
                    int i = 0;
                    if (!(aid == null || aid.length() == 0)) {
                        HandlerC61971c cVar = this.f140696a;
                        String aid2 = aweme.getAid();
                        C89219l.m154716b(aid2, "");
                        Iterator<C61969a> it = cVar.mo100038f().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (!C89219l.m154714a((Object) it.next().f140661a, (Object) aid2)) {
                                i++;
                            } else if (i >= 0 && i < C61968c.m112096a().f140702d) {
                                d = this.f140696a.mo100035c();
                                c = this.f140696a.mo100036d();
                            }
                        }
                        d = this.f140696a.mo100036d();
                        c = this.f140696a.mo100035c();
                        aweme.getAid();
                        d.put(aweme.getAid(), new C61970b(aweme, System.currentTimeMillis()));
                        C61970b bVar = c.get(aweme.getAid());
                        if (bVar != null) {
                            C89219l.m154721d(aweme, "");
                            bVar.f140663a = aweme;
                            bVar.f140664b = System.currentTimeMillis();
                        }
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public final C1731i<C89391z> mo100030a(List<? extends Aweme> list) {
            return C61994d.m112120a(new C61990n(this, list));
        }

        /* renamed from: a */
        public static boolean m112101a(BaseNotice baseNotice) {
            Long g;
            String str = baseNotice.nid;
            if (str == null || (g = C89361p.m154865g(str)) == null || g.longValue() <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final C1731i<C89391z> mo100034b(BaseNotice baseNotice) {
            return C61994d.m112120a(new C61976d(this, baseNotice));
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$j */
        static final class C61986j<T> implements AbstractC88983w {

            /* renamed from: a */
            final /* synthetic */ List f140692a;

            static {
                Covode.recordClassIndex(72735);
            }

            C61986j(List list) {
                this.f140692a = list;
            }

            @Override // p4560f.p4561a.AbstractC88983w
            public final void subscribe(AbstractC88982v<List<Aweme>> vVar) {
                C89219l.m154721d(vVar, "");
                try {
                    Object obj = C34406ba.m70397a().mo57055a(this.f140692a.toString()).f96125a;
                    if (obj == null) {
                        obj = new ArrayList();
                    }
                    C39077ac.m79342a(vVar, obj);
                } catch (Throwable th) {
                    C39109f.m79401a("NoticeVideoManager", "requestDataReal error", th);
                    C39077ac.m79342a(vVar, new ArrayList());
                }
            }
        }

        /* renamed from: b */
        private static String m112102b(String str) {
            if (!C80538hl.m139614a(str)) {
                return null;
            }
            if (str == null) {
                C89219l.m154715b();
            }
            if (!C89361p.m154874b(str, "aweme://aweme/detail/", false)) {
                return null;
            }
            Matcher matcher = Pattern.compile("\\d+\\d").matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
            return null;
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            if (message.what == 0) {
                removeMessages(0);
                if (!this.f140666a) {
                    C61994d.m112120a(new C61981i(this));
                } else {
                    sendEmptyMessageDelayed(0, C61968c.m112096a().f140704f / 2);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC61971c(String str) {
            super(Looper.getMainLooper());
            C89219l.m154721d(str, "");
            this.f140667b = str;
            C61994d.m112120a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c.HandlerC61971c.C619721 */

                /* renamed from: a */
                final /* synthetic */ HandlerC61971c f140675a;

                static {
                    Covode.recordClassIndex(72721);
                }

                {
                    this.f140675a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    HandlerC61971c cVar = this.f140675a;
                    try {
                        cVar.mo100037e().evictAll();
                        Map map = (Map) C80342dg.m139301a(cVar.mo100031a().getString("notice_click_times", ""), Map.class);
                        C89219l.m154716b(map, "");
                        for (Map.Entry entry : map.entrySet()) {
                            LruCache<String, Integer> e = cVar.mo100037e();
                            String valueOf = String.valueOf(entry.getKey());
                            Object value = entry.getValue();
                            if (value != null) {
                                e.put(valueOf, Integer.valueOf(((Number) value).intValue()));
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                            }
                        }
                        new StringBuilder("readClickTimesFile:").append(map).append('}');
                        C89379q.m157068constructorimpl(0);
                    } catch (Throwable th) {
                        C89379q.m157068constructorimpl(C89382r.m154941a(th));
                    }
                    return C89391z.f203057a;
                }
            });
        }

        /* renamed from: a */
        public static void m112100a(LruCache<String, C61970b> lruCache) {
            Map<String, C61970b> snapshot = lruCache.snapshot();
            C89219l.m154716b(snapshot, "");
            for (Map.Entry<String, C61970b> entry : snapshot.entrySet()) {
                if (System.currentTimeMillis() - entry.getValue().f140664b > C61968c.m112096a().f140700b) {
                    C39109f.m79403b("NoticeVideoManager", "remove expired:" + entry.getKey());
                    lruCache.remove(entry.getKey());
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            if (p4600h.C89391z.f203057a == null) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
            if (p4600h.C89391z.f203057a == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
            if (r0 == null) goto L_0x0013;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ java.lang.String m112103c(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r4) {
            /*
            // Method dump skipped, instructions count: 151
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c.HandlerC61971c.m112103c(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice):java.lang.String");
        }

        @Override // com.p2082ss.android.ugc.aweme.notice.api.services.AbstractC61610a
        /* renamed from: a */
        public final Aweme mo99385a(String str) {
            C89219l.m154721d(str, "");
            C61970b bVar = mo100035c().get(str);
            if (bVar == null && (bVar = mo100036d().get(str)) == null && (bVar = mo100033b().get(str)) == null) {
                return null;
            }
            return bVar.f140663a;
        }

        @Override // com.p2082ss.android.ugc.aweme.notice.api.services.AbstractC61610a
        /* renamed from: a */
        public final void mo99386a(Aweme aweme) {
            C89219l.m154721d(aweme, "");
            mo100030a(C89070n.m154524c(aweme));
        }

        /* renamed from: a */
        public final void mo100032a(boolean z) {
            this.f140666a = z;
            if (!z) {
                sendEmptyMessageDelayed(0, C61968c.m112096a().f140704f / 2);
            }
        }
    }

    /* renamed from: a */
    public static C61992d m112096a() {
        return (C61992d) f140659c.getValue();
    }

    private C61968c() {
    }

    /* renamed from: c */
    public static final void m112098c() {
        HandlerC61971c cVar = f140660d;
        if (cVar != null) {
            cVar.mo100042i();
        }
        f140660d = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.c$d */
    public static final class C61992d {
        @AbstractC27891c(mo46611a = "enabled")

        /* renamed from: a */
        public final boolean f140699a;
        @AbstractC27891c(mo46611a = "expire_duration")

        /* renamed from: b */
        public final long f140700b;
        @AbstractC27891c(mo46611a = "trigger_preload_condition")

        /* renamed from: c */
        public final int f140701c;
        @AbstractC27891c(mo46611a = "preserved_cache_count")

        /* renamed from: d */
        public final int f140702d;
        @AbstractC27891c(mo46611a = "rolling_cache_count")

        /* renamed from: e */
        public final int f140703e;
        @AbstractC27891c(mo46611a = "request_alignment_delay")

        /* renamed from: f */
        public final long f140704f;

        static {
            Covode.recordClassIndex(72741);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61992d)) {
                return false;
            }
            C61992d dVar = (C61992d) obj;
            return this.f140699a == dVar.f140699a && this.f140700b == dVar.f140700b && this.f140701c == dVar.f140701c && this.f140702d == dVar.f140702d && this.f140703e == dVar.f140703e && this.f140704f == dVar.f140704f;
        }

        public final String toString() {
            return "Meta(isEnabled=" + this.f140699a + ", expireDuration=" + this.f140700b + ", triggerPreloadCondition=" + this.f140701c + ", preservedCacheCount=" + this.f140702d + ", rollingCacheCount=" + this.f140703e + ", alignmentDelay=" + this.f140704f + ")";
        }

        private C61992d() {
            this.f140699a = false;
            this.f140700b = 180;
            this.f140701c = 2;
            this.f140702d = 10;
            this.f140703e = 20;
            this.f140704f = 400;
        }

        public final int hashCode() {
            boolean z = this.f140699a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            long j = this.f140700b;
            long j2 = this.f140704f;
            return (((((((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f140701c) * 31) + this.f140702d) * 31) + this.f140703e) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public /* synthetic */ C61992d(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.c$e */
    static final class C61993e extends AbstractC89220m implements AbstractC89171a<C61992d> {

        /* renamed from: a */
        public static final C61993e f140705a = new C61993e();

        static {
            Covode.recordClassIndex(72742);
        }

        C61993e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61992d invoke() {
            Object a = C16048b.m29633a().mo25416a(true, "preload_notice_video", C61992d.class, C61968c.f140657a);
            if (a == null) {
                return C61968c.f140657a;
            }
            return a;
        }
    }

    static {
        Covode.recordClassIndex(72717);
        C61968c cVar = new C61968c();
        f140658b = cVar;
        C31575b.m65865g().addUserChangeListener(cVar);
    }

    /* renamed from: b */
    public static final HandlerC61971c m112097b() {
        String str = null;
        if (!m112096a().f140699a) {
            return null;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            m112098c();
        } else {
            HandlerC61971c cVar = f140660d;
            if (cVar != null) {
                str = cVar.f140667b;
            }
            if (!C89219l.m154714a((Object) str, (Object) curUserId)) {
                m112098c();
                f140660d = new HandlerC61971c(curUserId);
            }
        }
        return f140660d;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.c$a */
    public static final class C61969a implements Comparable<C61969a> {

        /* renamed from: a */
        public final String f140661a;

        /* renamed from: b */
        public int f140662b = Integer.MAX_VALUE;

        static {
            Covode.recordClassIndex(72718);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61969a)) {
                return false;
            }
            C61969a aVar = (C61969a) obj;
            return C89219l.m154714a(this.f140661a, aVar.f140661a) && this.f140662b == aVar.f140662b;
        }

        public final int hashCode() {
            String str = this.f140661a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.f140662b;
        }

        public final String toString() {
            return "AidPosInfo(aid=" + this.f140661a + ", minPosition=" + this.f140662b + ")";
        }

        public C61969a(String str) {
            C89219l.m154721d(str, "");
            this.f140661a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(C61969a aVar) {
            C61969a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return this.f140662b - aVar2.f140662b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.c$b */
    public static final class C61970b {

        /* renamed from: a */
        public Aweme f140663a;

        /* renamed from: b */
        public long f140664b;

        static {
            Covode.recordClassIndex(72719);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61970b)) {
                return false;
            }
            C61970b bVar = (C61970b) obj;
            return C89219l.m154714a(this.f140663a, bVar.f140663a) && this.f140664b == bVar.f140664b;
        }

        public final int hashCode() {
            Aweme aweme = this.f140663a;
            int hashCode = aweme != null ? aweme.hashCode() : 0;
            long j = this.f140664b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "CacheInfo(data=" + this.f140663a + ", updateTime=" + this.f140664b + ")";
        }

        public C61970b(Aweme aweme, long j) {
            C89219l.m154721d(aweme, "");
            this.f140663a = aweme;
            this.f140664b = j;
        }
    }

    /* renamed from: a */
    public static SmartRoute m112094a(SmartRoute smartRoute, String str) {
        C89219l.m154721d(smartRoute, "");
        C89219l.m154721d(str, "");
        if (m112096a().f140699a) {
            smartRoute.withParam("video_from", "from_notification_page");
        }
        return smartRoute;
    }

    /* renamed from: a */
    public static C36131u m112095a(C36131u uVar, String str) {
        C89219l.m154721d(uVar, "");
        C89219l.m154721d(str, "");
        if (m112096a().f140699a && C89361p.m154874b(str, "aweme://aweme/detail/", false)) {
            uVar.mo63248a("video_from", "from_notification_page");
        }
        return uVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService.AbstractC31278a
    /* renamed from: a */
    public final void mo57195a(int i, User user, User user2) {
        String str;
        String str2;
        String str3;
        HandlerC61971c cVar = f140660d;
        String str4 = null;
        if (cVar != null) {
            str = cVar.f140667b;
        } else {
            str = null;
        }
        if (user2 != null) {
            str2 = user2.getUid();
        } else {
            str2 = null;
        }
        if (!C89219l.m154714a((Object) str, (Object) str2)) {
            StringBuilder sb = new StringBuilder("user changed:");
            HandlerC61971c cVar2 = f140660d;
            if (cVar2 != null) {
                str3 = cVar2.f140667b;
            } else {
                str3 = null;
            }
            StringBuilder append = sb.append(str3).append(", ");
            if (user2 != null) {
                str4 = user2.getUid();
            }
            C39109f.m79404c("NoticeVideoManager", append.append(str4).toString());
            m112098c();
        }
    }
}
