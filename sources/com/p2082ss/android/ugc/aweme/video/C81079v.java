package com.p2082ss.android.ugc.aweme.video;

import android.app.Activity;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.Surface;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.p2604n.AbstractC38263a;
import com.p2082ss.android.ugc.aweme.commercialize.p2604n.C38264b;
import com.p2082ss.android.ugc.aweme.experiment.C46929ff;
import com.p2082ss.android.ugc.aweme.feed.helper.C49656u;
import com.p2082ss.android.ugc.aweme.feed.model.Audio;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.p2397bm.C34888b;
import com.p2082ss.android.ugc.aweme.player.C62956e;
import com.p2082ss.android.ugc.aweme.player.p3549ab.abs.C62927e;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.C80775n;
import com.p2082ss.android.ugc.aweme.video.FeedPlayerManagerViewModel;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.aweme.video.p4209c.C80712b;
import com.p2082ss.android.ugc.aweme.video.p4209c.C80713c;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService$$CC;
import com.p2082ss.android.ugc.aweme.video.simplayer.p4225a.C80992a;
import com.p2082ss.android.ugc.aweme.video.simplayer.p4226b.C80995a;
import com.p2082ss.android.ugc.aweme.video.simplayer.p4226b.C80996b;
import com.p2082ss.android.ugc.aweme.video.util.C81078d;
import com.p2082ss.android.ugc.playerkit.C84175a;
import com.p2082ss.android.ugc.playerkit.C84180b;
import com.p2082ss.android.ugc.playerkit.model.C84200d;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.p4323c.C84184b;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.ttvideoengine.C86313ai;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.v */
public class C81079v implements AbstractC80747i {

    /* renamed from: d */
    private static C81079v f181201d;

    /* renamed from: j */
    private static boolean f181202j;

    /* renamed from: l */
    private static LruCache<String, C80647a> f181203l = new LruCache<String, C80647a>() {
        /* class com.p2082ss.android.ugc.aweme.video.C81079v.C810801 */

        static {
            Covode.recordClassIndex(94402);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, C80647a aVar) {
            return 1;
        }
    };

    /* renamed from: a */
    public AbstractC81002f f181204a;

    /* renamed from: b */
    public volatile boolean f181205b;

    /* renamed from: c */
    public AbstractC38263a f181206c;

    /* renamed from: e */
    private boolean f181207e;

    /* renamed from: f */
    private boolean f181208f;

    /* renamed from: g */
    private C80996b f181209g;

    /* renamed from: h */
    private String f181210h;

    /* renamed from: i */
    private String f181211i;

    /* renamed from: k */
    private boolean f181212k;

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: B */
    public final void mo123908B() {
        mo124537P();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: L */
    public final AbstractC81002f mo123918L() {
        return this.f181204a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: a */
    public final C84209m.EnumC84214e mo123877a() {
        return C84209m.EnumC84214e.TT;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: f */
    public final String mo123883f() {
        return this.f181210h;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: p */
    public final boolean mo123893p() {
        return this.f181205b;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123937a(OnUIPlayListener onUIPlayListener) {
        this.f181204a.mo124447a(onUIPlayListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123940a(boolean z) {
        this.f181212k = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123928a(Video video, boolean z) {
        return mo123923a(video, null, false, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123930a(C80712b bVar) {
        Video video = bVar.f180448a;
        Audio audio = bVar.f180449b;
        if (C80695q.m139908a()) {
            C34888b.m71265a("PlayerManager", "tryPlay aid:" + C62956e.m113375a(video));
        }
        if (video == null) {
            return null;
        }
        int i = bVar.f180451d;
        boolean z = bVar.f180452e.f180441b;
        boolean z2 = bVar.f180452e.f180443d;
        boolean z3 = bVar.f180452e.f180442c;
        EnumC63056b resolution = bVar.f180450c.getResolution();
        EnumC81083x xVar = EnumC81083x.Normal;
        boolean z4 = bVar.f180452e.f180444e;
        boolean z5 = bVar.f180452e.f180445f;
        String str = bVar.f180452e.f180447h;
        if (!TextUtils.isEmpty(video.getVideoAdTag())) {
            str = video.getVideoAdTag();
        }
        xVar.setLoop(z4);
        xVar.setTag(str);
        C80666b.m139900a(video);
        C80666b.m139901a(this);
        boolean z6 = video.getPlayAddr() != null && TextUtils.equals(video.getPlayAddr().getSourceId(), this.f181211i) && C62927e.f142831a && !f181202j;
        C80775n.C80777b c = new C80775n.C80777b().mo123983a(C80942a.m140477a(video)).mo123981a(i).mo123993e(z2).mo123991c(z3);
        c.f180650a.f180626e = resolution;
        C80775n.C80777b m = c.mo123982a(xVar).mo123994f(video.isNeedSetCookie()).mo123999k(z6).mo123989b(z5).mo123992d(z).mo123985a(Audio.convertToSimAudio(video, audio)).mo123990c((bVar.f180454g ? Audio.InfoIdType.TRANSLATED : Audio.InfoIdType.ORIGINAL).getInfoId()).mo124001m(bVar.f180455h);
        if (bVar.f180453f != null) {
            C80713c cVar = bVar.f180453f;
            m.mo124000l(cVar.f180456a).mo123987b(cVar.f180457b).mo123988b(cVar.f180458c);
        }
        if (this.f181212k) {
            m.f180650a.f180620R = false;
        }
        this.f181204a.mo124450a(m.f180650a);
        f181202j = true;
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123938a(C80775n nVar) {
        String str;
        C84241i playAddr;
        if (nVar != null && nVar.f180623b != null) {
            if (C80695q.m139908a()) {
                StringBuilder sb = new StringBuilder("tryPrepareNext aid:");
                C84240h hVar = nVar.f180623b;
                if (hVar == null || (playAddr = hVar.getPlayAddr()) == null) {
                    str = "null";
                } else {
                    str = playAddr.getSourceId() == null ? "nullid" : playAddr.getSourceId();
                }
                C34888b.m71265a("PlayerManager", sb.append(str).toString());
            }
            this.f181204a.mo124454b(nVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123929a(VideoUrlModel videoUrlModel, boolean z, C80713c cVar) {
        EnumC81083x xVar = EnumC81083x.Normal;
        if (C80995a.m140554a("tryPlayWithInitialStart")) {
            return "155";
        }
        if (C80695q.m139908a()) {
            C34888b.m71265a("PlayerManager", "tryPlayWithInitialStart aid:" + (videoUrlModel != null ? videoUrlModel.getSourceId() : "null"));
        }
        if (!C84180b.m144763a(C80942a.m140476a((UrlModel) videoUrlModel))) {
            return "156";
        }
        if (!this.f181207e && !TextUtils.isEmpty(videoUrlModel.getSourceId())) {
            f181203l.put(videoUrlModel.getSourceId(), new C80647a());
        }
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        String uri = videoUrlModel.getUri();
        C84184b.f187863b = bitRatedRatioUri;
        C84184b.m144764a(bitRatedRatioUri);
        C84175a.f187857a.mo128994a(uri, "player_try_play");
        boolean z2 = TextUtils.equals(videoUrlModel.getSourceId(), this.f181211i) && C62927e.f142831a && !f181202j;
        C80775n.C80777b bVar = new C80775n.C80777b();
        bVar.f180650a.f180627f = C80942a.m140478a(videoUrlModel);
        C80775n.C80777b c = bVar.mo123991c(true);
        c.f180650a.f180641t = true;
        C80775n.C80777b m = c.mo123982a(xVar).mo123981a(0).mo123992d(true).mo123994f(z).mo123984a(videoUrlModel.getVideoAdTag()).mo123999k(z2).mo123986a(false).mo124001m(false);
        if (cVar != null) {
            m.mo124000l(cVar.f180456a).mo123987b(cVar.f180457b).mo123988b(cVar.f180458c);
        }
        this.f181204a.mo124450a(m.f180650a);
        this.f181205b = true;
        f181202j = true;
        return "prepareWithInitialStart";
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123927a(Video video, OnUIPlayListener onUIPlayListener, int i) {
        return m140779a(video, (Audio) null, false, onUIPlayListener, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123934a(Surface surface) {
        this.f181204a.mo124446a(surface);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123933a(int i) {
        this.f181204a.mo124460h().mo124414a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123932a(float f, float f2) {
        this.f181204a.mo124461i().mo124437a(f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123939a(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            arrayList.add(C80942a.m140477a(aweme.getVideo()));
        }
        C84231a.f188310b.execute(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0028: INVOKE  
              (wrap: java.util.concurrent.ExecutorService : 0x0021: SGET  (r1v1 java.util.concurrent.ExecutorService) =  com.ss.android.ugc.playerkit.simapicommon.a.b java.util.concurrent.ExecutorService)
              (wrap: com.ss.android.ugc.aweme.video.simplayer.s$2 : 0x0025: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.video.simplayer.s$2) = (r2v0 'arrayList' java.util.ArrayList) call: com.ss.android.ugc.aweme.video.simplayer.s.2.<init>(java.util.List):void type: CONSTRUCTOR)
             type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.video.v.a(java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>):void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0025: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.video.simplayer.s$2) = (r2v0 'arrayList' java.util.ArrayList) call: com.ss.android.ugc.aweme.video.simplayer.s.2.<init>(java.util.List):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.v.a(java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>):void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.simplayer.s, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r4.iterator()
        L_0x0009:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p2082ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            com.ss.android.ugc.playerkit.simapicommon.a.h r0 = com.p2082ss.android.ugc.aweme.video.simcommon.C80942a.m140477a(r0)
            r2.add(r0)
            goto L_0x0009
        L_0x0021:
            java.util.concurrent.ExecutorService r1 = com.p2082ss.android.ugc.playerkit.simapicommon.C84231a.f188310b
            com.ss.android.ugc.aweme.video.simplayer.s$2 r0 = new com.ss.android.ugc.aweme.video.simplayer.s$2
            r0.<init>(r2)
            r1.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.C81079v.mo123939a(java.util.List):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: a */
    public final void mo123878a(String str) {
        this.f181204a.mo124461i().mo124438a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123936a(Aweme aweme) {
        if (TextUtils.isEmpty(this.f181210h) && aweme != null) {
            this.f181210h = aweme.getAid();
        }
        this.f181209g.mo124433a(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123935a(Audio.InfoIdType infoIdType) {
        this.f181204a.mo124453b(infoIdType.getInfoId());
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final void mo123931a(float f) {
        if (C80695q.m139908a()) {
            C34888b.m71265a("PlayerManager", "seek aid:" + (this.f181204a.mo124465m().mo124467b() != null ? this.f181204a.mo124465m().mo124467b().getSourceId() : "null") + ", progress:" + f);
        }
        this.f181204a.mo124444a(f);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123926a(Video video, OnUIPlayListener onUIPlayListener) {
        return mo123942b(video, onUIPlayListener, 0);
    }

    public C81079v() {
        this(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: D */
    public final void mo123910D() {
        this.f181204a.mo124443a();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: E */
    public final void mo123911E() {
        this.f181204a.mo124459g();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: H */
    public final void mo123914H() {
        this.f181204a.mo124457e();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: v */
    public final void mo123947v() {
        this.f181209g.mo124435b(C46929ff.f109365a);
    }

    static {
        Covode.recordClassIndex(94401);
    }

    /* renamed from: R */
    private int m140778R() {
        return this.f181204a.mo124465m().mo124466a().mo101021o();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: F */
    public final void mo123912F() {
        this.f181204a.mo124461i().mo124436a();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: G */
    public final void mo123913G() {
        this.f181204a.mo124461i().mo124439b();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: I */
    public final void mo123915I() {
        this.f181204a.mo124460h().mo124419f();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: J */
    public final void mo123916J() {
        this.f181204a.mo124460h().mo124420g();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: b */
    public final String mo123879b() {
        return this.f181204a.mo124460h().mo124422i();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: d */
    public final int mo123881d() {
        return this.f181204a.mo124460h().mo124424k();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: e */
    public final String mo123882e() {
        return this.f181204a.mo124460h().mo124425l();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: g */
    public final float mo123884g() {
        return this.f181204a.mo124460h().mo124426m();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: h */
    public final float mo123885h() {
        return this.f181204a.mo124460h().mo124427n();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: i */
    public final float mo123886i() {
        return this.f181204a.mo124460h().mo124428o();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: j */
    public final long mo123887j() {
        return this.f181204a.mo124460h().mo124417d();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: k */
    public final int mo123888k() {
        return this.f181204a.mo124460h().mo124421h();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: l */
    public final int mo123889l() {
        return this.f181204a.mo124460h().mo124413a();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: m */
    public final int mo123890m() {
        return this.f181204a.mo124460h().mo124415b();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: n */
    public final long mo123891n() {
        return this.f181204a.mo124460h().mo124418e();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: o */
    public final boolean mo123892o() {
        return this.f181204a.mo124462j().mo124469a();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: q */
    public final VideoUrlModel mo123894q() {
        return C80942a.m140472a(this.f181204a.mo124465m().mo124467b());
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: r */
    public final boolean mo123895r() {
        return this.f181204a.mo124460h().mo124429p();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: s */
    public final AbstractC63042j.C63048f mo123896s() {
        return this.f181204a.mo124460h().mo124416c();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: t */
    public final int mo123897t() {
        return this.f181204a.mo124460h().mo124430q();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: u */
    public final boolean mo123898u() {
        return this.f181204a.mo124460h().mo124431r();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: A */
    public final void mo123907A() {
        this.f181204a.mo124457e();
        C86313ai.m148637a();
        this.f181204a.mo124455c();
        this.f181205b = false;
        this.f181209g.f181045a = 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: C */
    public final void mo123909C() {
        this.f181204a.mo124457e();
        this.f181204a.mo124458f();
        this.f181205b = false;
        this.f181209g.f181045a = 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: K */
    public final long mo123917K() {
        AbstractC63042j.C63048f v = this.f181204a.mo124465m().mo124466a().mo101028v();
        if (v != null) {
            return v.f143214g;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: M */
    public final int mo123919M() {
        return (int) this.f181204a.mo124465m().mo124466a().mo100974a(13);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: N */
    public final int mo123920N() {
        return (int) this.f181204a.mo124465m().mo124466a().mo100974a(14);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80732h
    /* renamed from: c */
    public final int mo123880c() {
        return this.f181204a.mo124460h().mo124423j();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: w */
    public final void mo123948w() {
        if (C16048b.m29633a().mo25412a(true, "cold_launch_player_opt_exp", 2) == 1) {
            this.f181209g.mo124434a(false);
        } else if (C16048b.m29633a().mo25412a(true, "cold_launch_player_opt_exp", 2) == 2) {
            this.f181204a.mo124465m().mo124466a().mo101008c(new C80992a());
        }
    }

    /* renamed from: O */
    public static AbstractC80747i m140776O() {
        MethodCollector.m26663i(1875);
        AbstractC80747i a = C49656u.m93101a(C17873f.m33102j());
        if (a != null) {
            MethodCollector.m26664o(1875);
            return a;
        }
        if (C80779o.m140115c()) {
            Activity j = C17873f.m33102j();
            if (j instanceof ActivityC0945e) {
                ActivityC0945e eVar = (ActivityC0945e) j;
                C89219l.m154721d(eVar, "");
                AbstractC80747i iVar = FeedPlayerManagerViewModel.C80645a.m139833a(eVar).f180313a;
                if (iVar != null) {
                    MethodCollector.m26664o(1875);
                    return iVar;
                }
            }
        }
        if (f181201d == null) {
            synchronized (C81079v.class) {
                try {
                    if (f181201d == null) {
                        C81079v vVar = new C81079v(false);
                        f181201d = vVar;
                        vVar.f181204a.mo124463k();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1875);
                    throw th;
                }
            }
        }
        C81079v vVar2 = f181201d;
        MethodCollector.m26664o(1875);
        return vVar2;
    }

    /* renamed from: Q */
    private void m140777Q() {
        long n = mo123891n();
        if (!this.f181207e && this.f181204a.mo124465m().mo124467b() != null && !TextUtils.isEmpty(this.f181204a.mo124465m().mo124467b().getSourceId()) && n >= 0) {
            C80647a aVar = f181203l.get(this.f181204a.mo124465m().mo124467b().getSourceId());
            if (aVar == null) {
                aVar = new C80647a();
            }
            aVar.f180323a = n;
            aVar.f180324b = m140778R();
            f181203l.put(this.f181204a.mo124465m().mo124467b().getSourceId(), aVar);
        }
    }

    /* renamed from: P */
    public final void mo124537P() {
        String str;
        this.f181206c.mo66031b();
        if (C80695q.m139908a()) {
            StringBuilder sb = new StringBuilder("tryPausePlay aid:");
            if (this.f181204a.mo124465m().mo124467b() != null) {
                str = this.f181204a.mo124465m().mo124467b().getSourceId();
            } else {
                str = "null";
            }
            C34888b.m71265a("PlayerManager", sb.append(str).toString());
        }
        this.f181204a.mo124452b();
        this.f181205b = false;
        m140777Q();
        this.f181208f = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: x */
    public final void mo123949x() {
        String str;
        if (C80695q.m139908a()) {
            StringBuilder sb = new StringBuilder("render aid:");
            if (this.f181204a.mo124465m().mo124467b() != null) {
                str = this.f181204a.mo124465m().mo124467b().getSourceId();
            } else {
                str = "null";
            }
            C34888b.m71265a("PlayerManager", sb.append(str).toString());
        }
        this.f181204a.mo124465m().mo124466a().mo101006c();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: y */
    public final void mo123950y() {
        String str;
        if (!C80995a.m140554a("resumePlay")) {
            this.f181206c.mo66030a();
            if (C80695q.m139908a()) {
                StringBuilder sb = new StringBuilder("resumePlay aid:");
                if (this.f181204a.mo124465m().mo124467b() != null) {
                    str = this.f181204a.mo124465m().mo124467b().getSourceId();
                } else {
                    str = "null";
                }
                C34888b.m71265a("PlayerManager", sb.append(str).toString());
            }
            this.f181204a.mo124456d();
            this.f181205b = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: z */
    public final void mo123951z() {
        String str;
        if (C80695q.m139908a()) {
            StringBuilder sb = new StringBuilder("stopPlay aid:");
            if (this.f181204a.mo124465m().mo124467b() != null) {
                str = this.f181204a.mo124465m().mo124467b().getSourceId();
            } else {
                str = "null";
            }
            C34888b.m71265a("PlayerManager", sb.append(str).toString());
        }
        if (C80996b.f181044b) {
            C80996b.f181044b = false;
            return;
        }
        m140777Q();
        this.f181204a.mo124465m().mo124466a().mo101011e();
        this.f181205b = false;
    }

    /* renamed from: c */
    private static C80647a m140784c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C80647a();
        }
        C80647a aVar = f181203l.get(str);
        if (aVar == null) {
            return new C80647a();
        }
        return aVar;
    }

    public C81079v(AbstractC81002f fVar) {
        this.f181206c = C38264b.f90432b;
        this.f181204a = fVar;
        C62960a.f142907a = C80695q.m139908a();
        this.f181209g = new C80996b(this, this.f181204a.mo124465m().mo124466a());
    }

    /* renamed from: a */
    private boolean m140782a(C84200d dVar) {
        if (dVar == null || TextUtils.isEmpty(dVar.f187984c)) {
            return false;
        }
        return this.f181204a.mo124465m().mo124466a().mo100998a(dVar.f187984c, dVar.f187984c);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: b */
    public final String mo123943b(C80775n nVar) {
        if (nVar == null || nVar.f180623b == null) {
            return "160";
        }
        this.f181204a.mo124450a(nVar);
        return "tryPlayWithInitialStart pr";
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: c */
    public final void mo123946c(OnUIPlayListener onUIPlayListener) {
        String str;
        this.f181206c.mo66031b();
        if (C80695q.m139908a()) {
            StringBuilder sb = new StringBuilder("tryPausePlay aid:");
            if (this.f181204a.mo124465m().mo124467b() != null) {
                str = this.f181204a.mo124465m().mo124467b().getSourceId();
            } else {
                str = "null";
            }
            C34888b.m71265a("PlayerManager", sb.append(str).toString());
        }
        if (onUIPlayListener != null && this.f181204a.mo124465m().mo124466a().mo101005b(onUIPlayListener)) {
            this.f181204a.mo124452b();
            this.f181205b = false;
            m140777Q();
        }
    }

    public C81079v(boolean z) {
        boolean z2;
        this.f181206c = C38264b.f90432b;
        this.f181207e = false;
        C62960a.f142907a = C80695q.m139908a();
        if (C16048b.m29633a().mo25412a(true, "player_v3_up_enable", 0) != 1 || (C62956e.m113382f() && !C62956e.m113380d())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (C16048b.m29633a().mo25412a(true, "player_v3_up_force_enable", 0) == 1 || (C62956e.m113381e() && C62956e.m113380d())) {
            z2 = true;
        }
        if (C80695q.m139908a()) {
            C34888b.m71265a("PlayerManager", "PlayerManager con useV3:".concat(String.valueOf(z2)));
        }
        if (z2) {
            this.f181204a = ISimPlayerService$$CC.get$$STATIC$$().mo124397a(z, !this.f181207e);
        } else {
            this.f181204a = ISimPlayerService$$CC.get$$STATIC$$().mo124396a();
        }
        this.f181209g = new C80996b(this, this.f181204a.mo124465m().mo124466a());
    }

    /* renamed from: a */
    private boolean m140781a(VideoUrlModel videoUrlModel) {
        String bitRatedRatioUri;
        if (videoUrlModel == null) {
            return false;
        }
        if (C80695q.m139908a()) {
            C34888b.m71265a("PlayerManager", "checkResumePlay aid:" + videoUrlModel.getSourceId());
        }
        if (this.f181204a.mo124465m().mo124467b() != null && TextUtils.equals(videoUrlModel.getUri(), this.f181204a.mo124465m().mo124467b().getUri()) && TextUtils.equals(videoUrlModel.getRatio(), this.f181204a.mo124465m().mo124467b().getRatio())) {
            if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
                bitRatedRatioUri = videoUrlModel.getDashVideoId();
            } else {
                bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
            }
            if (TextUtils.isEmpty(videoUrlModel.getSourceId()) || !this.f181204a.mo124465m().mo124466a().mo100998a(videoUrlModel.getSourceId(), bitRatedRatioUri)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80748j
    /* renamed from: b */
    public final String mo123952b(String str) {
        AbstractC63042j.C63049g u;
        AbstractC63051l a = this.f181204a.mo124465m().mo124466a();
        AbstractC63042j.C63049g gVar = null;
        if (!(a == null || (u = a.mo101027u()) == null)) {
            gVar = u;
        }
        return C80653aa.m139872a(gVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: b */
    public final void mo123944b(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Audio.InfoIdType infoIdType;
        Video video;
        Audio.InfoIdType infoIdType2;
        if (aweme != null) {
            String aid = aweme.getAid();
            if (this.f181211i == null) {
                this.f181211i = aid;
            }
        }
        if (C16048b.m29633a().mo25412a(true, "cold_launch_player_opt_exp", 2) == 1) {
            C80996b bVar = this.f181209g;
            if (C80695q.m139908a()) {
                C34888b.m71265a("PreCreateHelper", "tryPrerenderVideoColdStart aweme:".concat(String.valueOf(aweme)));
            }
            bVar.mo124434a(true);
            if (!bVar.f181047d && aweme != null && !aweme.isLive() && (video = aweme.getVideo()) != null && aweme.getVideo().getProperPlayAddr() != null) {
                video.setRationAndSourceId(aweme.getAid());
                boolean a = C81078d.m140774a(aweme);
                C80775n.C80777b a2 = new C80775n.C80777b().mo123983a(C80942a.m140477a(video)).mo123994f(video.isNeedSetCookie()).mo123985a(Audio.Companion.convertToSimAudio(aweme.getVideo(), aweme.getAudio()));
                if (a) {
                    infoIdType2 = Audio.InfoIdType.TRANSLATED;
                } else {
                    infoIdType2 = Audio.InfoIdType.ORIGINAL;
                }
                bVar.f181046c.mo123938a(a2.mo123990c(infoIdType2.getInfoId()).f180650a);
                bVar.f181047d = true;
            }
        } else if (C16048b.m29633a().mo25412a(true, "cold_launch_player_opt_exp", 2) == 2 && aweme != null && !aweme.isLive()) {
            C80713c a3 = C81078d.m140772a(aweme.getVideo(), true);
            boolean a4 = C81078d.m140774a(aweme);
            Video video2 = aweme.getVideo();
            Audio audio = aweme.getAudio();
            if (video2 != null && aweme.getVideo().getProperPlayAddr() != null) {
                video2.setRationAndSourceId(aweme.getAid());
                if (C16048b.m29633a().mo25412a(true, "feed_cold_start_pre_decode_not_render", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (C16048b.m29633a().mo25412a(true, "feed_cold_start_prerender_range_enable", 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (C16048b.m29633a().mo25412a(true, "force_first_video_soft_decode", 0) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (C16048b.m29633a().mo25412a(true, "force_first_video_hardware_decode", 0) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C80775n.C80777b bVar2 = new C80775n.C80777b();
                C80775n.C80777b f = bVar2.mo123983a(C80942a.m140477a(video2)).mo123994f(video2.isNeedSetCookie());
                f.f180650a.f180608F = true;
                C80775n.C80777b j = f.mo123998j(z);
                j.f180650a.f180629h = z3;
                j.f180650a.f180621S = z4;
                C80775n.C80777b a5 = j.mo123995g(z2).mo123984a(video2.getVideoAdTag()).mo123985a(Audio.convertToSimAudio(video2, audio));
                if (a4) {
                    infoIdType = Audio.InfoIdType.TRANSLATED;
                } else {
                    infoIdType = Audio.InfoIdType.ORIGINAL;
                }
                a5.mo123990c(infoIdType.getInfoId()).mo124001m(false);
                if (a3 != null) {
                    bVar2.mo124000l(a3.f180456a).mo123987b(a3.f180457b).mo123988b(a3.f180458c);
                }
                mo123938a(bVar2.f180650a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: b */
    public final boolean mo123945b(OnUIPlayListener onUIPlayListener) {
        return this.f181204a.mo124465m().mo124466a().mo101005b(onUIPlayListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: b */
    public final String mo123941b(Video video, OnUIPlayListener onUIPlayListener) {
        return mo123942b(video, onUIPlayListener, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123921a(Video video, int i) {
        return mo123924a(video, (Audio) null, false, true, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: b */
    public final String mo123942b(Video video, OnUIPlayListener onUIPlayListener, int i) {
        return m140779a(video, (Audio) null, false, onUIPlayListener, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123923a(Video video, Audio audio, boolean z, boolean z2) {
        return mo123924a(video, audio, z, z2, 0);
    }

    /* renamed from: b */
    private String m140783b(Video video, Audio audio, boolean z, boolean z2, int i) {
        return m140785c(video, audio, z, z2, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123924a(Video video, Audio audio, boolean z, boolean z2, int i) {
        return m140783b(video, audio, z, z2, i);
    }

    /* renamed from: a */
    private String m140779a(Video video, Audio audio, boolean z, OnUIPlayListener onUIPlayListener, int i) {
        return mo123922a(video, (Audio) null, false, onUIPlayListener, i, (C80713c) null);
    }

    /* renamed from: c */
    private String m140785c(Video video, Audio audio, boolean z, boolean z2, int i) {
        return m140780a(video, audio, z, z2, i, true);
    }

    /* renamed from: a */
    private String m140780a(Video video, Audio audio, boolean z, boolean z2, int i, boolean z3) {
        return mo123925a(video, audio, z, z2, i, true, true, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123922a(Video video, Audio audio, boolean z, OnUIPlayListener onUIPlayListener, int i, C80713c cVar) {
        String sourceId;
        String sourceId2;
        if (C80995a.m140554a("tryResumePlay")) {
            return "101";
        }
        if (C80695q.m139908a()) {
            C34888b.m71265a("PlayerManager", "tryResumePlay aid:" + C62956e.m113375a(video));
        }
        this.f181206c.mo66030a();
        if (onUIPlayListener == null) {
            return "102";
        }
        if (!this.f181204a.mo124465m().mo124466a().mo101005b(onUIPlayListener)) {
            return "103";
        }
        if (video == null) {
            return "104";
        }
        VideoUrlModel playAddrBytevc1 = video.getPlayAddrBytevc1();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrBytevc1 == null && playAddrH264 == null && this.f181204a.mo124465m().mo124468c() == null) {
            return "105";
        }
        if (i > 0) {
            mo123925a(video, audio, z, true, i, true, true, cVar);
            return "106";
        } else if (m140782a(this.f181204a.mo124465m().mo124468c())) {
            this.f181204a.mo124465m().mo124466a().mo100995a(this.f181204a.mo124465m().mo124468c().f187984c);
            this.f181205b = false;
            return "107";
        } else if (m140781a(playAddrBytevc1) || m140781a(playAddrH264)) {
            AbstractC63051l a = this.f181204a.mo124465m().mo124466a();
            if (playAddrBytevc1 != null) {
                sourceId = playAddrBytevc1.getSourceId();
            } else {
                sourceId = playAddrH264.getSourceId();
            }
            a.mo100995a(sourceId);
            this.f181205b = false;
            return "108";
        } else if (this.f181208f) {
            this.f181208f = false;
            if (playAddrBytevc1 != null) {
                sourceId2 = playAddrBytevc1.getSourceId();
            } else {
                sourceId2 = playAddrH264.getSourceId();
            }
            C80647a c = m140784c(sourceId2);
            if (c != null) {
                mo123925a(video, audio, z, true, (int) c.f180323a, false, true, cVar);
                return "";
            }
            mo123925a(video, audio, z, true, 0, true, true, cVar);
            return "";
        } else {
            mo123925a(video, audio, z, true, 0, true, true, cVar);
            return "";
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.AbstractC80747i
    /* renamed from: a */
    public final String mo123925a(Video video, Audio audio, boolean z, boolean z2, int i, boolean z3, boolean z4, C80713c cVar) {
        boolean z5;
        boolean z6;
        Audio.InfoIdType infoIdType;
        if (video == null) {
            return null;
        }
        if (C80695q.m139908a()) {
            C34888b.m71265a("PlayerManager", "tryPlayWithInitialStart aid:" + C62956e.m113375a(video));
        }
        C80666b.m139900a(video);
        C80666b.m139901a(this);
        if (video.getPlayAddr() == null || !TextUtils.equals(video.getPlayAddr().getSourceId(), this.f181211i) || !C62927e.f142831a || f181202j) {
            z5 = false;
        } else {
            z5 = true;
        }
        C80775n.C80777b c = new C80775n.C80777b().mo123983a(C80942a.m140477a(video)).mo123991c(z2);
        if (this.f181209g.f181045a == 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        C80775n.C80777b a = c.mo123996h(z6).mo123981a(i).mo123992d(z3).mo123994f(video.isNeedSetCookie()).mo123999k(z5).mo123993e(z4).mo123984a(video.getVideoAdTag()).mo123985a(Audio.convertToSimAudio(video, audio));
        if (z) {
            infoIdType = Audio.InfoIdType.TRANSLATED;
        } else {
            infoIdType = Audio.InfoIdType.ORIGINAL;
        }
        C80775n.C80777b m = a.mo123990c(infoIdType.getInfoId()).mo124001m(false);
        if (cVar != null) {
            m.mo124000l(cVar.f180456a).mo123987b(cVar.f180457b).mo123988b(cVar.f180458c);
        }
        this.f181204a.mo124450a(m.f180650a);
        f181202j = true;
        return "";
    }
}
