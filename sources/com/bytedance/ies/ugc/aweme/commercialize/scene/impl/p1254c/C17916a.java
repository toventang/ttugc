package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1254c;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17889b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17890c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17892a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17893b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.C17894c;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.a */
public final class C17916a implements AbstractC17892a {

    /* renamed from: k */
    public static final C17917a f42693k = new C17917a((byte) 0);

    /* renamed from: a */
    public AbstractC17893b f42694a;

    /* renamed from: b */
    public Aweme f42695b;

    /* renamed from: c */
    public int f42696c;

    /* renamed from: d */
    public int f42697d;

    /* renamed from: e */
    public int f42698e;

    /* renamed from: f */
    public Runnable f42699f;

    /* renamed from: g */
    public Runnable f42700g;

    /* renamed from: h */
    public boolean f42701h = true;

    /* renamed from: i */
    public boolean f42702i;

    /* renamed from: j */
    public boolean f42703j;

    /* renamed from: l */
    private C17894c f42704l;

    /* renamed from: m */
    private AwemeRawAd f42705m;

    /* renamed from: n */
    private AwemeSearchAdModel f42706n;

    /* renamed from: o */
    private Long f42707o;

    /* renamed from: p */
    private int f42708p;

    /* renamed from: q */
    private int f42709q;

    /* renamed from: r */
    private Integer f42710r = 0;

    /* renamed from: s */
    private Runnable f42711s;

    /* renamed from: t */
    private final AbstractC89244h f42712t = C89250i.m154773a((AbstractC89171a) C17920d.f42716a);

    /* renamed from: u */
    private boolean f42713u = true;

    static {
        Covode.recordClassIndex(20526);
    }

    /* renamed from: d */
    public final Handler mo28565d() {
        return (Handler) this.f42712t.getValue();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.a$a */
    public static final class C17917a {
        static {
            Covode.recordClassIndex(20527);
        }

        private C17917a() {
        }

        public /* synthetic */ C17917a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.a$b */
    static final class RunnableC17918b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17916a f42714a;

        static {
            Covode.recordClassIndex(20528);
        }

        RunnableC17918b(C17916a aVar) {
            this.f42714a = aVar;
        }

        public final void run() {
            AbstractC17893b bVar = this.f42714a.f42694a;
            if (bVar != null) {
                bVar.mo28488b();
            }
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.a$c */
    static final class RunnableC17919c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17916a f42715a;

        static {
            Covode.recordClassIndex(20529);
        }

        RunnableC17919c(C17916a aVar) {
            this.f42715a = aVar;
        }

        public final void run() {
            AbstractC17893b bVar = this.f42715a.f42694a;
            if (bVar != null) {
                bVar.mo28489c();
            }
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.a$d */
    static final class C17920d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C17920d f42716a = new C17920d();

        static {
            Covode.recordClassIndex(20530);
        }

        C17920d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17892a
    /* renamed from: c */
    public final void mo28486c() {
        Handler d;
        Runnable runnable = this.f42711s;
        if (runnable != null && (d = mo28565d()) != null) {
            d.removeCallbacks(runnable);
        }
    }

    /* renamed from: e */
    public final long mo28566e() {
        AbstractC17893b bVar = this.f42694a;
        if (bVar != null) {
            return (long) bVar.mo28487a();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0041;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m33230f() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f42695b
            r2 = 0
            if (r0 == 0) goto L_0x0041
            r1 = 0
            boolean r0 = r0.isAd()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0013
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0013:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f42695b
            if (r0 == 0) goto L_0x0061
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r0.getWebUrl()
        L_0x0027:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f42695b
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = r0.getOpenUrl()
        L_0x003b:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            return r2
        L_0x0042:
            java.lang.Integer r0 = r3.f42710r
            if (r0 == 0) goto L_0x0041
            int r1 = r3.f42708p
            int r0 = r0.intValue()
            if (r1 < r0) goto L_0x0041
            boolean r0 = r3.f42713u
            if (r0 != 0) goto L_0x0041
            java.lang.Integer r0 = r3.f42710r
            if (r0 != 0) goto L_0x0059
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0059:
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0041
            r0 = 1
            return r0
        L_0x0061:
            r0 = r1
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1254c.C17916a.m33230f():boolean");
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.a$e */
    public static final class RunnableC17921e implements Runnable {

        /* renamed from: a */
        public final Aweme f42717a;

        /* renamed from: b */
        public long f42718b;

        /* renamed from: c */
        final /* synthetic */ C17916a f42719c;

        static {
            Covode.recordClassIndex(20531);
        }

        public final void run() {
            long e;
            if (C89219l.m154714a(this.f42717a, this.f42719c.f42695b)) {
                if (this.f42719c.f42701h) {
                    e = 0;
                    this.f42719c.f42701h = false;
                } else {
                    e = this.f42719c.mo28566e();
                }
                if (!this.f42719c.f42702i && (e >= ((long) this.f42719c.f42697d) || (e < this.f42718b && this.f42719c.f42696c > 0))) {
                    C17916a.m33229a(this.f42719c.f42699f);
                    this.f42719c.f42702i = true;
                    this.f42718b = e;
                    Handler d = this.f42719c.mo28565d();
                    if (d != null) {
                        d.postDelayed(this, 100);
                    }
                } else if (this.f42719c.f42703j || (e < ((long) this.f42719c.f42698e) && (e >= this.f42718b || this.f42719c.f42696c <= 0))) {
                    this.f42718b = e;
                    Handler d2 = this.f42719c.mo28565d();
                    if (d2 != null) {
                        d2.postDelayed(this, 100);
                    }
                } else {
                    this.f42719c.f42703j = true;
                    C17916a.m33229a(this.f42719c.f42700g);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC17921e(C17916a aVar) {
            this.f42719c = aVar;
            this.f42717a = aVar.f42695b;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17892a
    /* renamed from: a */
    public final void mo28483a() {
        long j;
        Boolean bool;
        this.f42696c++;
        int i = this.f42708p + 1;
        this.f42708p = i;
        C49625h a = C49625h.m93072a();
        C89219l.m154716b(a, "");
        this.f42708p = i + a.f114193e;
        C49625h a2 = C49625h.m93072a();
        C89219l.m154716b(a2, "");
        a2.f114193e = this.f42708p;
        m33230f();
        if (m33230f()) {
            AbstractC17893b bVar = this.f42694a;
            if (bVar != null) {
                bVar.mo28490d();
            }
            this.f42713u = true;
        }
        long e = mo28566e();
        long j2 = (long) (this.f42696c - 1);
        Long l = this.f42707o;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long.signum(j2);
        C18129a.m33746a("result_ad", "over", this.f42705m).mo28897a("duration", Long.valueOf(e + (j2 * j))).mo28897a("video_length", this.f42707o).mo28901b();
        AbstractC17893b bVar2 = this.f42694a;
        if (bVar2 != null) {
            bool = bVar2.mo28492f();
        } else {
            bool = null;
        }
        if (!C89219l.m154714a((Object) bool, (Object) true)) {
            C18129a.m33746a("result_ad", "auto_play", this.f42705m).mo28901b();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17892a
    /* renamed from: b */
    public final void mo28485b() {
        Boolean bool;
        String str;
        Integer animationType;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AbstractC17893b bVar = this.f42694a;
        String str2 = null;
        if (bVar != null) {
            bool = bVar.mo28492f();
        } else {
            bool = null;
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            AbstractC17893b bVar2 = this.f42694a;
            if (bVar2 != null) {
                bVar2.mo28491e();
            }
            C18129a.m33746a("result_ad", "auto_play", this.f42705m).mo28901b();
        }
        Aweme aweme = this.f42695b;
        if (aweme != null) {
            m33228a(aweme);
            this.f42696c = 0;
            Aweme aweme2 = this.f42695b;
            if (aweme2 != null) {
                Boolean valueOf = Boolean.valueOf(aweme2.isAd());
                if (valueOf == null) {
                    C89219l.m154715b();
                }
                if (valueOf.booleanValue()) {
                    Aweme aweme3 = this.f42695b;
                    if (aweme3 == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null) {
                        str = null;
                    } else {
                        str = awemeRawAd2.getWebUrl();
                    }
                    if (TextUtils.isEmpty(str)) {
                        Aweme aweme4 = this.f42695b;
                        if (!(aweme4 == null || (awemeRawAd = aweme4.getAwemeRawAd()) == null)) {
                            str2 = awemeRawAd.getOpenUrl();
                        }
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                    }
                    AwemeSearchAdModel awemeSearchAdModel = this.f42706n;
                    if (awemeSearchAdModel != null && (animationType = awemeSearchAdModel.getAnimationType()) != null && animationType.intValue() == 1 && this.f42696c == this.f42709q) {
                        this.f42711s = new RunnableC17921e(this);
                        Handler d = mo28565d();
                        if (d != null) {
                            Runnable runnable = this.f42711s;
                            Objects.requireNonNull(runnable, "null cannot be cast to non-null type java.lang.Runnable");
                            d.post(runnable);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m33229a(Runnable runnable) {
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static long m33228a(Aweme aweme) {
        if (aweme == null || aweme.getVideo() == null) {
            return 1;
        }
        Video video = aweme.getVideo();
        C89219l.m154716b(video, "");
        video.getDuration();
        Video video2 = aweme.getVideo();
        C89219l.m154716b(video2, "");
        return (long) video2.getDuration();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17888a
    /* renamed from: a */
    public final void mo28473a(AbstractC17890c cVar) {
        AbstractC17889b bVar;
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        AwemeSearchAdModel awemeSearchAdModel;
        float f;
        C89219l.m154721d(cVar, "");
        C17894c cVar2 = (C17894c) cVar;
        this.f42704l = cVar2;
        Integer num = null;
        if (cVar2 != null) {
            bVar = cVar2.f42655b;
        } else {
            bVar = null;
        }
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.search_player.ISearchAdVideoPlayerSceneCallBack");
        this.f42694a = (AbstractC17893b) bVar;
        C17894c cVar3 = this.f42704l;
        if (cVar3 != null) {
            awemeRawAd = cVar3.f42656a;
        } else {
            awemeRawAd = null;
        }
        this.f42705m = awemeRawAd;
        C17894c cVar4 = this.f42704l;
        if (cVar4 != null) {
            aweme = cVar4.f42657c;
        } else {
            aweme = null;
        }
        this.f42695b = aweme;
        AwemeRawAd awemeRawAd2 = this.f42705m;
        if (awemeRawAd2 != null) {
            awemeSearchAdModel = awemeRawAd2.getSearchAdInfo();
        } else {
            awemeSearchAdModel = null;
        }
        this.f42706n = awemeSearchAdModel;
        this.f42707o = Long.valueOf(m33228a(this.f42695b));
        AwemeSearchAdModel awemeSearchAdModel2 = this.f42706n;
        float f2 = 0.0f;
        if (awemeSearchAdModel2 != null) {
            f = awemeSearchAdModel2.getShowButtonSeconds();
        } else {
            f = 0.0f;
        }
        this.f42697d = (int) (f * 1000.0f);
        AwemeSearchAdModel awemeSearchAdModel3 = this.f42706n;
        if (awemeSearchAdModel3 != null) {
            f2 = awemeSearchAdModel3.getButtonColorShowSeconds();
        }
        this.f42698e = (int) (f2 * 1000.0f);
        this.f42699f = new RunnableC17918b(this);
        this.f42700g = new RunnableC17919c(this);
        AwemeSearchAdModel awemeSearchAdModel4 = this.f42706n;
        if (awemeSearchAdModel4 != null) {
            num = awemeSearchAdModel4.getShowMaskTimes();
        }
        this.f42710r = num;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17892a
    /* renamed from: a */
    public final void mo28484a(C84215n nVar) {
        Integer animationType;
        C89219l.m154721d(nVar, "");
        C49625h a = C49625h.m93072a();
        C89219l.m154716b(a, "");
        a.f114193e = 0;
        C49625h a2 = C49625h.m93072a();
        C89219l.m154716b(a2, "");
        a2.f114194f = false;
        AwemeSearchAdModel awemeSearchAdModel = this.f42706n;
        if (!(awemeSearchAdModel == null || (animationType = awemeSearchAdModel.getAnimationType()) == null || animationType.intValue() != 1)) {
            this.f42703j = false;
            this.f42702i = false;
            this.f42713u = false;
            this.f42701h = true;
            this.f42708p = 0;
            this.f42696c = 0;
        }
        AbstractC17893b bVar = this.f42694a;
        if (bVar != null) {
            bVar.mo28493g();
        }
        C18129a.m33746a("result_ad", "auto_play", this.f42705m).mo28901b();
    }
}
