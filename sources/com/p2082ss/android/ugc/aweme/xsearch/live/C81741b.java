package com.p2082ss.android.ugc.aweme.xsearch.live;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.lynx.react.bridge.JavaOnlyMap;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34205d;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34215e;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34216f;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34218g;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34222i;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.aweme.xsearch.C81688c;
import com.p2082ss.android.ugc.aweme.xsearch.C81689d;
import com.p2082ss.android.ugc.aweme.xsearch.C81690e;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.live.b */
public final class C81741b extends FrameLayout implements AbstractC34186b.AbstractC34192d, AbstractC34203b {

    /* renamed from: a */
    public static final C81742a f182784a = new C81742a((byte) 0);

    /* renamed from: b */
    private boolean f182785b;

    /* renamed from: c */
    private int f182786c;

    /* renamed from: d */
    private boolean f182787d;

    /* renamed from: e */
    private AbstractC89183m<? super String, ? super Map<String, ? extends Object>, C89391z> f182788e;

    /* renamed from: f */
    private String f182789f;

    /* renamed from: g */
    private SmartImageView f182790g;

    /* renamed from: h */
    private final AbstractC89244h f182791h;

    /* renamed from: i */
    private final AbstractC89244h f182792i;

    /* renamed from: j */
    private boolean f182793j;

    static {
        Covode.recordClassIndex(95147);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60366a(View view, int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void ak_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void al_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: f */
    public final void mo60523f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: g */
    public final void mo60524g() {
    }

    public final C34215e getDataProvider() {
        return (C34215e) this.f182792i.getValue();
    }

    public final C34205d getLiveCore() {
        return (C34205d) this.f182791h.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: h */
    public final void mo60530h() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: i */
    public final void mo60531i() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: k */
    public final void mo60533k() {
        this.f182793j = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: l */
    public final void mo60534l() {
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.live.b$a */
    public static final class C81742a {
        static {
            Covode.recordClassIndex(95148);
        }

        private C81742a() {
        }

        public /* synthetic */ C81742a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void am_() {
        m141611m();
    }

    public final boolean getOutCorner() {
        return this.f182785b;
    }

    private final Aweme getMAweme() {
        return getDataProvider().f80898g;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: e */
    public final void mo60522e() {
        getLiveCore().mo60541e();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m141612n();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return getLiveCore();
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.live.b$b */
    static final class C81743b extends AbstractC89220m implements AbstractC89171a<C34215e> {

        /* renamed from: a */
        final /* synthetic */ C81741b f182794a;

        static {
            Covode.recordClassIndex(95149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81743b(C81741b bVar) {
            super(0);
            this.f182794a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34215e invoke() {
            return this.f182794a.getLiveCore().getDataProvider();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.live.b$c */
    static final class C81744c extends AbstractC89220m implements AbstractC89171a<AbstractC34203b> {

        /* renamed from: a */
        final /* synthetic */ C81741b f182795a;

        static {
            Covode.recordClassIndex(95150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81744c(C81741b bVar) {
            super(0);
            this.f182795a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC34203b invoke() {
            return new C34216f(this.f182795a.getDataProvider());
        }
    }

    /* renamed from: m */
    private final void m141611m() {
        this.f182793j = true;
        getLiveCore().mo60542g();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        AbstractC34186b.AbstractC34189c cVar = getDataProvider().f80896e;
        if (cVar != null) {
            cVar.mo60340a(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        AbstractC34186b.AbstractC34189c cVar = getDataProvider().f80896e;
        if (cVar != null) {
            cVar.mo60344e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        return getLiveCore().getMLiveStarted();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
        AbstractC34186b.AbstractC34189c cVar = getDataProvider().f80896e;
        if (cVar != null) {
            cVar.bg_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        AbstractC34186b.AbstractC34189c cVar = getDataProvider().f80896e;
        if (cVar != null) {
            cVar.bi_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: j */
    public final void mo60532j() {
        m141611m();
        m141608a(this, "ended");
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.live.b$e */
    static final class C81747e extends AbstractC89220m implements AbstractC89171a<C34205d> {

        /* renamed from: a */
        final /* synthetic */ C81741b f182798a;

        /* renamed from: b */
        final /* synthetic */ Context f182799b;

        /* renamed from: c */
        final /* synthetic */ AttributeSet f182800c = null;

        /* renamed from: d */
        final /* synthetic */ int f182801d = 0;

        static {
            Covode.recordClassIndex(95153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81747e(C81741b bVar, Context context, AttributeSet attributeSet, int i) {
            super(0);
            this.f182798a = bVar;
            this.f182799b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34205d invoke() {
            C34205d dVar = new C34205d(this.f182799b, this.f182800c, this.f182801d);
            dVar.mo60540a(new AbstractC89171a<AbstractC34203b>(this) {
                /* class com.p2082ss.android.ugc.aweme.xsearch.live.C81741b.C81747e.C817481 */

                /* renamed from: a */
                final /* synthetic */ C81747e f182802a;

                static {
                    Covode.recordClassIndex(95154);
                }

                {
                    this.f182802a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ AbstractC34203b invoke() {
                    return this.f182802a.f182798a;
                }
            });
            this.f182798a.addView(dVar);
            return dVar;
        }
    }

    /* renamed from: n */
    private final void m141612n() {
        C34181a.m69859b(getLiveCore());
        AbstractC34186b.AbstractC34189c cVar = getDataProvider().f80896e;
        if (cVar != null) {
            cVar.mo60344e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60365a() {
        LiveRoomStruct b = getDataProvider().mo60575b();
        if ((b == null || !b.liveTypeAudio) && this.f182793j) {
            this.f182793j = false;
            getLiveCore().mo60556h();
        }
        m141608a(this, "play");
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        if (this.f182787d) {
            mo60425B();
            C34181a.m69857a(getLiveCore());
        }
        ConcurrentHashMap<String, WeakReference<C67568r>> concurrentHashMap = C67704b.f151780n;
        Aweme mAweme = getMAweme();
        if (mAweme == null || (str = mAweme.getAid()) == null) {
            str = "";
        }
        concurrentHashMap.put(str, new WeakReference<>(getDataProvider().f80899h));
    }

    public final void setEventChangeListener(AbstractC89183m<? super String, ? super Map<String, ? extends Object>, C89391z> mVar) {
        this.f182788e = mVar;
    }

    public final void setOutCorner(boolean z) {
        this.f182785b = z;
    }

    private final void setMAweme(Aweme aweme) {
        getDataProvider().f80898g = aweme;
    }

    public final void setAutoPlay(boolean z) {
        this.f182787d = z;
        if (!z) {
            m141612n();
        }
    }

    public final void setMuted(boolean z) {
        getLiveCore().setMute(z);
    }

    /* renamed from: b */
    private final boolean m141610b(String str) {
        if (!TextUtils.equals(this.f182789f, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.live.b$d */
    static final class C81745d extends AbstractC89220m implements AbstractC89172b<C34222i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81741b f182796a;

        static {
            Covode.recordClassIndex(95151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81745d(C81741b bVar) {
            super(1);
            this.f182796a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C34222i iVar) {
            C34222i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.mo60580a(new AbstractC89171a<C34205d>(this) {
                /* class com.p2082ss.android.ugc.aweme.xsearch.live.C81741b.C81745d.C817461 */

                /* renamed from: a */
                final /* synthetic */ C81745d f182797a;

                static {
                    Covode.recordClassIndex(95152);
                }

                {
                    this.f182797a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C34205d invoke() {
                    return this.f182797a.f182796a.getLiveCore();
                }
            });
            return C89391z.f203057a;
        }
    }

    public final void setObjectFit(String str) {
        int i;
        C89219l.m154721d(str, "");
        C34205d liveCore = getLiveCore();
        if (str.hashCode() == 3143043 && str.equals("fill")) {
            i = 0;
        } else {
            i = 1;
        }
        liveCore.setFitType(i);
    }

    public final void setLogExtra(HashMap<String, Object> hashMap) {
        C89219l.m154721d(hashMap, "");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                if (entry.getValue() instanceof JavaOnlyMap) {
                    String key = entry.getKey();
                    GsonProvider c = GsonHolder.m138943c();
                    C89219l.m154716b(c, "");
                    String b = c.mo123620b().mo46674b(entry.getValue());
                    C89219l.m154716b(b, "");
                    hashMap2.put(key, b);
                } else {
                    hashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        C67568r rVar = getDataProvider().f80899h;
        if (rVar != null) {
            rVar.mo106511a(hashMap2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r3 != null) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSessionId(int r5) {
        /*
            r4 = this;
            r4.f182786c = r5
            com.ss.android.ugc.aweme.xsearch.d r1 = com.p2082ss.android.ugc.aweme.xsearch.C81689d.f182658b
            int r0 = r4.f182786c
            com.ss.android.ugc.aweme.xsearch.c r3 = r1.mo125341b(r0)
            if (r3 == 0) goto L_0x0013
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.f182650d = r0
        L_0x0013:
            com.ss.android.ugc.aweme.autoplay.player.live.e r0 = r4.getDataProvider()
            com.ss.android.ugc.aweme.autoplay.player.b$c r1 = r0.f80896e
            if (r1 == 0) goto L_0x004e
            if (r3 == 0) goto L_0x002f
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r3.f182651e = r0
        L_0x0024:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            com.ss.android.ugc.aweme.autoplay.player.live.d r0 = r4.getLiveCore()
            r1.<init>(r0)
            r3.f182655i = r1
        L_0x002f:
            r2 = 0
            if (r3 == 0) goto L_0x004c
            com.ss.android.ugc.aweme.search.k.r r1 = r3.f182649c
        L_0x0034:
            com.ss.android.ugc.aweme.autoplay.player.live.e r0 = r4.getDataProvider()
            com.ss.android.ugc.aweme.search.k.r r0 = r0.f80899h
            if (r0 == 0) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f151329x
        L_0x003e:
            if (r1 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x0045
            r1.mo106511a(r2)
        L_0x0045:
            com.ss.android.ugc.aweme.autoplay.player.live.e r0 = r4.getDataProvider()
            r0.f80899h = r1
        L_0x004b:
            return
        L_0x004c:
            r1 = r2
            goto L_0x0034
        L_0x004e:
            if (r3 == 0) goto L_0x002f
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.xsearch.live.C81741b.setSessionId(int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C81741b(Context context) {
        super(context, null, 0);
        C81688c b;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8928);
        this.f182786c = -1;
        this.f182787d = true;
        this.f182791h = C89250i.m154773a((AbstractC89171a) new C81747e(this, context, null, 0));
        this.f182792i = C89250i.m154773a((AbstractC89171a) new C81743b(this));
        this.f182793j = true;
        getDataProvider().f80899h = C67568r.C67569a.m119673a();
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.awv, this, true);
        this.f182790g = (SmartImageView) findViewById(R.id.bqv);
        getLiveCore().setMCoverView(this.f182790g);
        getDataProvider().f80896e = C34218g.m69958a(new C81745d(this));
        AbstractC34186b.AbstractC34189c cVar = getDataProvider().f80896e;
        if (!(cVar == null || (b = C81689d.f182658b.mo125341b(this.f182786c)) == null)) {
            b.f182651e = new WeakReference<>(cVar);
        }
        getDataProvider().f80893b = new C81690e(getLiveCore());
        getLiveCore().mo60540a(new C81744c(this));
        MethodCollector.m26664o(8928);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60519a(String str) {
        C89219l.m154721d(str, "");
        m141609a("error", C89041ag.m154428c(C89387v.m154943a("error", str)));
    }

    public final void setAwemeIndex(C81740a aVar) {
        C42345d dVar;
        List<Aweme> awemeList;
        UrlModel urlModel;
        String str = "";
        C89219l.m154721d(aVar, str);
        getDataProvider().f80897f = aVar.f182782a;
        C81688c b = C81689d.f182658b.mo125341b(this.f182786c);
        if (b != null && (dVar = b.f182656j) != null && (awemeList = dVar.getAwemeList()) != null) {
            Aweme aweme = awemeList.get(aVar.f182783b);
            C89219l.m154716b(aweme, str);
            Aweme aweme2 = aweme;
            C89219l.m154721d(aweme2, str);
            mo60425B();
            this.f182793j = true;
            SmartImageView smartImageView = this.f182790g;
            User author = aweme2.getAuthor();
            C67568r rVar = null;
            if (author != null) {
                urlModel = author.roomCover;
            } else {
                urlModel = null;
            }
            if (smartImageView != null) {
                smartImageView.setPlaceholderImage(R.drawable.b2g);
                if (urlModel != null) {
                    C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
                    a.f49092E = smartImageView;
                    a.mo34186c();
                }
            }
            getLiveCore().mo60539a(aweme2);
            getLiveCore().mo60541e();
            ConcurrentHashMap<String, WeakReference<C67568r>> concurrentHashMap = C67704b.f151780n;
            String aid = aweme2.getAid();
            if (aid != null) {
                str = aid;
            }
            C34215e dataProvider = getDataProvider();
            if (dataProvider != null) {
                rVar = dataProvider.f80899h;
            }
            concurrentHashMap.put(str, new WeakReference<>(rVar));
            setMAweme(aweme2);
        }
    }

    public /* synthetic */ C81741b(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    private static /* synthetic */ void m141608a(C81741b bVar, String str) {
        bVar.m141609a(str, new HashMap());
    }

    /* renamed from: a */
    private final void m141609a(String str, Map<String, ? extends Object> map) {
        if (m141610b(str)) {
            this.f182789f = str;
            AbstractC89183m<? super String, ? super Map<String, ? extends Object>, C89391z> mVar = this.f182788e;
            if (mVar != null) {
                mVar.invoke(str, map);
            }
        }
    }

    /* renamed from: a */
    public final void mo125418a(AbstractC51043a aVar, C67568r rVar) {
        String str;
        User author;
        getDataProvider().f80892a = aVar;
        getDataProvider().f80899h = rVar;
        C67568r rVar2 = getDataProvider().f80899h;
        if (rVar2 != null) {
            Aweme mAweme = getMAweme();
            if (mAweme == null || (author = mAweme.getAuthor()) == null) {
                str = null;
            } else {
                str = author.roomIdStr;
            }
            rVar2.mo106514c(str);
        }
    }
}
