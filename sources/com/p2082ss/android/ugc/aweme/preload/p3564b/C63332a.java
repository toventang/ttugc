package com.p2082ss.android.ugc.aweme.preload.p3564b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Preload;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadCommentV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadProfileV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadCommentV2Experiment;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadProfileV2Experiment;
import com.p2082ss.android.ugc.aweme.preload.p3563a.C63311a;
import com.p2082ss.android.ugc.aweme.preload.p3563a.C63329e;
import com.p2082ss.android.ugc.aweme.preload.p3564b.C63339b;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.preload.b.a */
public final class C63332a {

    /* renamed from: g */
    public static final AbstractC89244h f143742g = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C63334b.f143753a);

    /* renamed from: h */
    public static final C63333a f143743h = new C63333a((byte) 0);

    /* renamed from: a */
    public volatile boolean f143744a;

    /* renamed from: b */
    public final Map<String, Boolean> f143745b = new ConcurrentHashMap();

    /* renamed from: c */
    public volatile Aweme f143746c;

    /* renamed from: d */
    public volatile boolean f143747d;

    /* renamed from: e */
    public volatile boolean f143748e;

    /* renamed from: f */
    public boolean f143749f;

    /* renamed from: i */
    private final Map<String, C63329e> f143750i = new ConcurrentHashMap();

    /* renamed from: j */
    private volatile boolean f143751j;

    /* renamed from: k */
    private long f143752k;

    /* renamed from: com.ss.android.ugc.aweme.preload.b.a$a */
    public static final class C63333a {
        static {
            Covode.recordClassIndex(74616);
        }

        /* renamed from: a */
        public static C63332a m114832a() {
            return (C63332a) C63332a.f143742g.getValue();
        }

        private C63333a() {
        }

        public /* synthetic */ C63333a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.b.a$b */
    static final class C63334b extends AbstractC89220m implements AbstractC89171a<C63332a> {

        /* renamed from: a */
        public static final C63334b f143753a = new C63334b();

        static {
            Covode.recordClassIndex(74617);
        }

        C63334b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63332a invoke() {
            return new C63332a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.b.a$c */
    public static final class RunnableC63335c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C63332a f143754a;

        static {
            Covode.recordClassIndex(74618);
        }

        public RunnableC63335c(C63332a aVar) {
            this.f143754a = aVar;
        }

        public final void run() {
            this.f143754a.f143748e = SmartPreloadCommentV2Service.C60009b.f136665a.ensureEvaluatorAvailable();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.b.a$d */
    public static final class RunnableC63336d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C63332a f143755a;

        static {
            Covode.recordClassIndex(74619);
        }

        public RunnableC63336d(C63332a aVar) {
            this.f143755a = aVar;
        }

        public final void run() {
            this.f143755a.f143749f = SmartPreloadProfileV2Service.C60011b.f136667a.ensureEvaluatorAvailable();
        }
    }

    /* renamed from: a */
    public final void mo101920a() {
        if (true != this.f143744a) {
            m114826d();
        }
        this.f143744a = true;
    }

    static {
        Covode.recordClassIndex(74615);
    }

    /* renamed from: c */
    public static void m114825c() {
        if (SmartPreloadCommentV2Experiment.C59983a.m109505c() || SmartPreloadProfileV2Experiment.C59985a.m109508c()) {
            CommentServiceImpl.m73664e().mo63285a();
            C63419ae.f143971a.mo101968f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.preload.b.a$f */
    public static final class RunnableC63338f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f143761a;

        /* renamed from: b */
        final /* synthetic */ C63332a f143762b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f143763c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f143764d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89234a f143765e;

        /* renamed from: f */
        final /* synthetic */ String f143766f;

        static {
            Covode.recordClassIndex(74621);
        }

        RunnableC63338f(String str, C63332a aVar, C89233z.C89234a aVar2, C89233z.C89238e eVar, C89233z.C89234a aVar3, String str2) {
            this.f143761a = str;
            this.f143762b = aVar;
            this.f143763c = aVar2;
            this.f143764d = eVar;
            this.f143765e = aVar3;
            this.f143766f = str2;
        }

        public final void run() {
            if (this.f143765e.element) {
                this.f143762b.f143745b.put(this.f143766f, true);
                this.f143762b.mo101922a((C63329e) this.f143764d.element, this.f143761a);
            }
        }
    }

    /* renamed from: d */
    private final void m114826d() {
        if (!this.f143750i.isEmpty()) {
            for (Map.Entry<String, C63329e> entry : this.f143750i.entrySet()) {
                m114823a(entry.getValue().f143733b, entry.getKey(), true);
            }
            this.f143750i.clear();
        }
    }

    /* renamed from: e */
    private final void m114827e() {
        if (Math.abs(System.currentTimeMillis() - this.f143752k) > 5000) {
            this.f143752k = System.currentTimeMillis();
            this.f143751j = C80422fe.m139427c(C17867d.m33078a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.preload.b.a$e */
    public static final class RunnableC63337e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C63332a f143756a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f143757b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f143758c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89234a f143759d;

        /* renamed from: e */
        final /* synthetic */ String f143760e;

        static {
            Covode.recordClassIndex(74620);
        }

        RunnableC63337e(C63332a aVar, C89233z.C89234a aVar2, C89233z.C89238e eVar, C89233z.C89234a aVar3, String str) {
            this.f143756a = aVar;
            this.f143757b = aVar2;
            this.f143758c = eVar;
            this.f143759d = aVar3;
            this.f143760e = str;
        }

        public final void run() {
            if (C89219l.m154714a((Object) "comment_preload_task", (Object) this.f143758c.element.f143732a)) {
                this.f143759d.element = C63339b.C63340a.m114834a().mo101928a(this.f143756a.f143746c, this.f143756a.f143747d, false);
            } else if (C89219l.m154714a((Object) "profile_preload_task", (Object) this.f143758c.element.f143732a)) {
                this.f143759d.element = C63339b.C63340a.m114834a().mo101928a(this.f143756a.f143746c, this.f143756a.f143747d, true);
            }
        }
    }

    /* renamed from: b */
    public final void mo101923b() {
        String aid;
        String aid2;
        Aweme aweme = this.f143746c;
        if (!(aweme == null || (aid2 = aweme.getAid()) == null)) {
            CommentServiceImpl.m73664e().mo63293a(aid2);
        }
        Aweme aweme2 = this.f143746c;
        if (aweme2 != null) {
            m114824a(aweme2.getSecAuthorUid(), aweme2.getAuthorUid());
        }
        this.f143744a = false;
        this.f143747d = false;
        this.f143750i.clear();
        this.f143745b.clear();
        Aweme aweme3 = this.f143746c;
        if (!(aweme3 == null || (aid = aweme3.getAid()) == null)) {
            C63311a.m114809a(aid);
        }
        this.f143746c = null;
        C63339b.C63340a.m114834a().f143770b = false;
        C63339b.C63340a.m114834a().f143771c = false;
    }

    /* renamed from: a */
    public final void mo101921a(int i) {
        if (this.f143746c != null) {
            switch (i) {
                case 1:
                    m114823a(i, "comment_preload_task", false);
                    m114823a(i, "profile_preload_task", false);
                    return;
                case 2:
                    m114823a(i, "comment_preload_task", false);
                    m114823a(i, "profile_preload_task", false);
                    return;
                case 3:
                    m114823a(i, "comment_preload_task", false);
                    m114823a(i, "profile_preload_task", false);
                    return;
                case 4:
                    m114823a(i, "profile_preload_task", false);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    m114823a(i, "comment_preload_task", false);
                    m114823a(i, "profile_preload_task", false);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    m114823a(i, "comment_preload_task", false);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    m114823a(i, "profile_preload_task", false);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    m114823a(i, "comment_preload_task", false);
                    m114823a(i, "profile_preload_task", false);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static void m114824a(String str, String str2) {
        C63419ae.f143971a.mo101959a(str, str2);
    }

    /* renamed from: a */
    public final void mo101922a(C63329e eVar, String str) {
        String str2;
        m114827e();
        if (this.f143751j && (str2 = eVar.f143732a) != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1607013413) {
                if (hashCode == -1216448303 && str2.equals("profile_preload_task")) {
                    C63419ae.f143971a.mo101958a(this.f143746c, 300000, eVar.f143733b, "homepage_hot");
                }
            } else if (str2.equals("comment_preload_task")) {
                CommentServiceImpl.m73664e().mo63295a(str, (Integer) 300000, eVar.f143733b, "homepage_hot", "homepage_hot");
            }
        }
    }

    /* renamed from: a */
    private final void m114823a(int i, String str, boolean z) {
        Integer num;
        String aid;
        Preload preload;
        String str2;
        SmartPreloadProfileV2Experiment.PreloadProfileMLModel a;
        boolean z2;
        SmartPreloadCommentV2Experiment.PreloadCommentMLModel a2;
        boolean z3;
        SmartPreloadProfileV2Experiment.PreloadProfileMLModel a3;
        try {
            if ((!this.f143745b.isEmpty()) && this.f143745b.containsKey(str)) {
                return;
            }
            if (C89219l.m154714a((Object) "comment_preload_task", (Object) str) && C63339b.C63340a.m114834a().f143770b) {
                return;
            }
            if (!C89219l.m154714a((Object) "profile_preload_task", (Object) str) || !C63339b.C63340a.m114834a().f143771c) {
                if (C89219l.m154714a((Object) "comment_preload_task", (Object) str)) {
                    SmartPreloadCommentV2Experiment.PreloadCommentMLModel a4 = SmartPreloadCommentV2Experiment.C59983a.m109503a();
                    if (a4 != null) {
                        num = Integer.valueOf(a4.groupId);
                    } else {
                        return;
                    }
                } else if (C89219l.m154714a((Object) "profile_preload_task", (Object) str) && (a3 = SmartPreloadProfileV2Experiment.C59985a.m109506a()) != null) {
                    num = Integer.valueOf(a3.groupId);
                } else {
                    return;
                }
                if (num != null && num.intValue() > 0) {
                    if (num.intValue() <= 6) {
                        if (i != 1 || num.intValue() == 1 || num.intValue() == 4) {
                            C89233z.C89238e eVar = new C89233z.C89238e();
                            eVar.element = (T) C63329e.C63331b.m114822a(str, i);
                            if (this.f143744a || z) {
                                C89233z.C89234a aVar = new C89233z.C89234a();
                                aVar.element = false;
                                C89233z.C89234a aVar2 = new C89233z.C89234a();
                                aVar2.element = false;
                                if (num.intValue() == 1) {
                                    if (i == 1) {
                                        aVar2.element = true;
                                    }
                                } else if (num.intValue() == 2) {
                                    if (i != 2) {
                                        if (i >= 4 && i <= 7) {
                                        }
                                    }
                                    aVar2.element = true;
                                } else if (num.intValue() == 3) {
                                    if (i >= 3 && i <= 7) {
                                        aVar2.element = true;
                                    }
                                } else if (num.intValue() == 4) {
                                    if (i == 1) {
                                        eVar.element = (T) C63329e.C63331b.m114822a(str, 8);
                                        Aweme aweme = this.f143746c;
                                        if (!(aweme == null || (preload = aweme.getPreload()) == null || (str2 = preload.predictConfig) == null)) {
                                            AbstractC28019l a5 = C28024q.m56139a(str2);
                                            C89219l.m154716b(a5, "");
                                            C28022o j = a5.mo46789j();
                                            if (C89219l.m154714a((Object) "comment_preload_task", (Object) eVar.element.f143732a) && (a2 = SmartPreloadCommentV2Experiment.C59983a.m109503a()) != null) {
                                                float f = a2.recommendThreshold;
                                                AbstractC28019l c = j.mo46803c("click_comment");
                                                C89219l.m154716b(c, "");
                                                if (c.mo46690d() >= ((double) f)) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                aVar2.element = z3;
                                            }
                                            if (C89219l.m154714a((Object) "profile_preload_task", (Object) eVar.element.f143732a) && (a = SmartPreloadProfileV2Experiment.C59985a.m109506a()) != null) {
                                                float f2 = a.recommendThreshold;
                                                AbstractC28019l c2 = j.mo46803c("head");
                                                C89219l.m154716b(c2, "");
                                                if (c2.mo46690d() >= ((double) f2)) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                aVar2.element = z2;
                                            }
                                        }
                                    }
                                } else if (!((num.intValue() != 5 && num.intValue() != 6) || i == 1 || i == 3)) {
                                    aVar.element = true;
                                }
                                Aweme aweme2 = this.f143746c;
                                if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                                    if (aVar.element) {
                                        C63311a.m114811a(aid, eVar.element, new RunnableC63337e(this, aVar, eVar, aVar2, str), new RunnableC63338f(aid, this, aVar, eVar, aVar2, str));
                                    } else if (aVar2.element) {
                                        this.f143745b.put(str, true);
                                        mo101922a((C63329e) eVar.element, aid);
                                    }
                                }
                            } else if (!this.f143750i.containsKey(str)) {
                                this.f143750i.put(str, eVar.element);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
