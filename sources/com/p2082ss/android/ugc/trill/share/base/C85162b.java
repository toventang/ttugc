package com.p2082ss.android.ugc.trill.share.base;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.C33854u;
import com.p2082ss.android.ugc.aweme.app.p2324e.C33730a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33740a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33741b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49955a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49966c;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.C49925a;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p2082ss.android.ugc.aweme.share.C68852ac;
import com.p2082ss.android.ugc.aweme.share.C68900c;
import com.p2082ss.android.ugc.aweme.share.C69272k;
import com.p2082ss.android.ugc.aweme.share.C69486v;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68906a;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68907b;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.share.p3752h.C68957b;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.AbstractC71843h;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71842g;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71844i;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71849n;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.EnumC71847l;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import com.p2082ss.android.ugc.aweme.shortvideo.view.AlertDialogC74139b;
import com.p2082ss.android.ugc.aweme.turbo.api.C79340b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.local.C80754a;
import com.p2082ss.android.ugc.aweme.video.util.C81076b;
import com.p2082ss.android.ugc.aweme.watermark.AbstractC81509s;
import com.p2082ss.android.ugc.aweme.watermark.C81506p;
import com.p2082ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.share.base.C85174d;
import com.p2082ss.android.ugc.trill.share.base.C85179g;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p077b.C1743j;
import p078c.p080b.C1756d;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.trill.share.base.b */
public final class C85162b extends AbsDownloadListener {

    /* renamed from: A */
    public static final C85163a f190525A = new C85163a((byte) 0);

    /* renamed from: z */
    public static boolean f190526z;

    /* renamed from: B */
    private final String f190527B;

    /* renamed from: C */
    private final String f190528C;

    /* renamed from: D */
    private String f190529D;

    /* renamed from: E */
    private int f190530E;

    /* renamed from: F */
    private C89378p<Integer, String> f190531F;

    /* renamed from: G */
    private String f190532G;

    /* renamed from: H */
    private UrlModel f190533H;

    /* renamed from: I */
    private boolean f190534I;

    /* renamed from: J */
    private final C39088c<?, ?> f190535J;

    /* renamed from: K */
    private String f190536K;

    /* renamed from: L */
    private ACLCommonShare f190537L;

    /* renamed from: M */
    private C85174d f190538M;

    /* renamed from: N */
    private String f190539N;

    /* renamed from: O */
    private final Handler f190540O;

    /* renamed from: P */
    private long f190541P;

    /* renamed from: Q */
    private String f190542Q;

    /* renamed from: R */
    private String f190543R;

    /* renamed from: S */
    private JSONObject f190544S;

    /* renamed from: T */
    private final Runnable f190545T;

    /* renamed from: a */
    public final String f190546a;

    /* renamed from: b */
    public String f190547b;

    /* renamed from: c */
    public String f190548c;

    /* renamed from: d */
    public int f190549d;

    /* renamed from: e */
    public AlertDialogC74139b f190550e;

    /* renamed from: f */
    public String f190551f;

    /* renamed from: g */
    public String f190552g;

    /* renamed from: h */
    public AbstractC49927b f190553h;

    /* renamed from: i */
    public boolean f190554i;

    /* renamed from: j */
    public boolean f190555j;

    /* renamed from: k */
    public int f190556k;

    /* renamed from: l */
    public Aweme f190557l;

    /* renamed from: m */
    public AbstractC71843h f190558m;

    /* renamed from: n */
    long f190559n;

    /* renamed from: o */
    long f190560o;

    /* renamed from: p */
    int f190561p;

    /* renamed from: q */
    public C85179g f190562q;

    /* renamed from: r */
    public C81506p f190563r;

    /* renamed from: s */
    public final C80754a f190564s;

    /* renamed from: t */
    public boolean f190565t;

    /* renamed from: u */
    public final AbstractC27255q<IWaterMarkService> f190566u;

    /* renamed from: v */
    public String f190567v;

    /* renamed from: w */
    public String f190568w;

    /* renamed from: x */
    public AbstractC81509s f190569x;

    /* renamed from: y */
    public Context f190570y;

    static {
        Covode.recordClassIndex(99206);
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.b$a */
    public static final class C85163a {
        static {
            Covode.recordClassIndex(99207);
        }

        private C85163a() {
        }

        public /* synthetic */ C85163a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m146451a(boolean z) {
            ShareDependService.C68822a.m121324a().mo109344a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.b$i */
    public static final class C85172i implements AbstractC27255q<IWaterMarkService> {

        /* renamed from: a */
        public IWaterMarkService f190579a;

        static {
            Covode.recordClassIndex(99216);
        }

        C85172i() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ IWaterMarkService mo5560b() {
            if (this.f190579a == null) {
                this.f190579a = WaterMarkServiceImpl.m141254b();
            }
            return this.f190579a;
        }
    }

    /* renamed from: a */
    public final void mo130086a(String str) {
        C89219l.m154721d(str, "");
        this.f190567v = str;
        C68909c.f154158f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r5 != null) goto L_0x0046;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo130087a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.trill.share.base.C85162b.mo130087a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):boolean");
    }

    /* renamed from: e */
    public final void mo130093e() {
        C80720e.m139931c(this.f190547b);
    }

    /* renamed from: i */
    private final void m146437i() {
        C1731i.m5640b(new CallableC85171h(this), C40780g.m82241a());
    }

    /* renamed from: j */
    private static boolean m146438j() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.trill.share.base.b$b */
    public static final class CallableC85164b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C85162b f190571a;

        static {
            Covode.recordClassIndex(99208);
        }

        CallableC85164b(C85162b bVar) {
            this.f190571a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            IWaterMarkService b = this.f190571a.f190566u.mo5560b();
            if (b == null) {
                return null;
            }
            C81506p pVar = this.f190571a.f190563r;
            if (pVar == null) {
                C89219l.m154715b();
            }
            b.prepareDataForI18n(pVar);
            return null;
        }
    }

    /* renamed from: g */
    private final boolean m146435g() {
        if (C89219l.m154714a((Object) this.f190536K, (Object) "download_action") || C89219l.m154714a((Object) this.f190536K, (Object) "share_download")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo130094f() {
        int i = this.f190549d;
        if (i >= 100) {
            this.f190549d = 100;
        } else if (i < 0) {
            this.f190549d = 0;
        }
        C29339a.m58754b(this.f190545T);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.trill.share.base.b$d */
    public static final class RunnableC85166d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C85162b f190573a;

        static {
            Covode.recordClassIndex(99210);
        }

        RunnableC85166d(C85162b bVar) {
            this.f190573a = bVar;
        }

        public final void run() {
            this.f190573a.mo130083a();
            C85163a.m146451a(false);
            if (this.f190573a.f190553h != null) {
                AbstractC49927b bVar = this.f190573a.f190553h;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                bVar.mo84976a(this.f190573a.f190548c);
            }
            C68909c.m121603a(C68906a.m121601a(4, C85162b.m146428a(this.f190573a), 0));
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.b$g */
    static final class RunnableC85170g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C85162b f190577a;

        static {
            Covode.recordClassIndex(99214);
        }

        RunnableC85170g(C85162b bVar) {
            this.f190577a = bVar;
        }

        public final void run() {
            if (this.f190577a.f190550e != null) {
                AlertDialogC74139b bVar = this.f190577a.f190550e;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                if (bVar.isShowing()) {
                    AlertDialogC74139b bVar2 = this.f190577a.f190550e;
                    if (bVar2 == null) {
                        C89219l.m154715b();
                    }
                    bVar2.mo116602a(this.f190577a.f190549d);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo130088b() {
        C68909c.f154153a = false;
        C68909c.f154154b = false;
        if (this.f190540O.hasMessages(1)) {
            this.f190540O.removeMessages(1);
        }
        if (C68909c.f154155c) {
            C80720e.m139931c(this.f190548c);
            mo130093e();
        }
        C29339a.m58754b(new RunnableC85165c(this));
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.b$f */
    public static final class HandlerC85168f extends Handler {

        /* renamed from: a */
        final /* synthetic */ C85162b f190575a;

        static {
            Covode.recordClassIndex(99212);
        }

        /* renamed from: com.ss.android.ugc.trill.share.base.b$f$a */
        static final class C85169a implements AlertDialogC74139b.AbstractC74143a {

            /* renamed from: a */
            final /* synthetic */ HandlerC85168f f190576a;

            static {
                Covode.recordClassIndex(99213);
            }

            C85169a(HandlerC85168f fVar) {
                this.f190576a = fVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.AlertDialogC74139b.AbstractC74143a
            /* renamed from: a */
            public final void mo116613a() {
                C68909c.f154155c = true;
                C85162b.f190526z = true;
                if (C68909c.f154153a) {
                    C80754a aVar = this.f190576a.f190575a.f190564s;
                    Context context = this.f190576a.f190575a.f190570y;
                    C89219l.m154721d(context, "");
                    Downloader.getInstance(context).cancel(aVar.f180563a);
                    C68909c.f154153a = false;
                    RuntimeBehaviorServiceImpl.m94812c().mo85865a("download_cancel");
                } else {
                    if (C68909c.f154154b) {
                        IWaterMarkService b = this.f190576a.f190575a.f190566u.mo5560b();
                        if (b != null) {
                            b.cancelWaterMark();
                        }
                        C68909c.f154154b = false;
                    }
                    RuntimeBehaviorServiceImpl.m94812c().mo85865a("water_mark_cancel");
                }
                this.f190576a.f190575a.mo130088b();
                C39162r.m79460a("download_cancel", new C33744d().mo59983a("enter_from", this.f190576a.f190575a.f190567v).mo59983a("group_id", C85162b.m146428a(this.f190576a.f190575a).getAid()).f79943a);
            }
        }

        public final void handleMessage(Message message) {
            AlertDialogC74139b bVar;
            ImageView imageView;
            ValueAnimator valueAnimator;
            ObjectAnimator objectAnimator;
            ObjectAnimator objectAnimator2;
            C89219l.m154721d(message, "");
            if (1 == message.what && (bVar = this.f190575a.f190550e) != null && bVar.isShowing()) {
                bVar.f166520c = new C85169a(this);
                int b = (int) C13628n.m24520b(this.f190575a.f190570y, 180.0f);
                if (bVar.f166519b) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    bVar.f166523f = bVar.findViewById(R.id.dnb);
                    ObjectAnimator objectAnimator3 = null;
                    if (bVar.f166523f != null) {
                        valueAnimator = ValueAnimator.ofInt(bVar.f166523f.getWidth(), b);
                        valueAnimator.addUpdateListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005b: INVOKE  
                              (r11v3 'valueAnimator' android.animation.ValueAnimator)
                              (wrap: com.ss.android.ugc.aweme.shortvideo.view.b$2 : 0x0058: CONSTRUCTOR  (r4v10 com.ss.android.ugc.aweme.shortvideo.view.b$2) = (r5v0 'bVar' com.ss.android.ugc.aweme.shortvideo.view.b) call: com.ss.android.ugc.aweme.shortvideo.view.b.2.<init>(com.ss.android.ugc.aweme.shortvideo.view.b):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.animation.ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener):void in method: com.ss.android.ugc.trill.share.base.b.f.handleMessage(android.os.Message):void, file: classes5.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0058: CONSTRUCTOR  (r4v10 com.ss.android.ugc.aweme.shortvideo.view.b$2) = (r5v0 'bVar' com.ss.android.ugc.aweme.shortvideo.view.b) call: com.ss.android.ugc.aweme.shortvideo.view.b.2.<init>(com.ss.android.ugc.aweme.shortvideo.view.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.trill.share.base.b.f.handleMessage(android.os.Message):void, file: classes5.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 31 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.view.b, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 37 more
                            */
                        /*
                        // Method dump skipped, instructions count: 310
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.trill.share.base.C85162b.HandlerC85168f.handleMessage(android.os.Message):void");
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    HandlerC85168f(C85162b bVar, Looper looper) {
                        super(looper);
                        this.f190575a = bVar;
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.android.ugc.trill.share.base.b$c */
                public static final class RunnableC85165c implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C85162b f190572a;

                    static {
                        Covode.recordClassIndex(99209);
                    }

                    RunnableC85165c(C85162b bVar) {
                        this.f190572a = bVar;
                    }

                    public final void run() {
                        this.f190572a.mo130093e();
                        C85163a.m146451a(false);
                        if (this.f190572a.f190553h != null) {
                            AbstractC49927b bVar = this.f190572a.f190553h;
                            if (bVar == null) {
                                C89219l.m154715b();
                            }
                            bVar.mo84975a();
                        }
                        this.f190572a.mo130083a();
                        if (this.f190572a.f190565t) {
                            return;
                        }
                        if (this.f190572a.f190556k == -113) {
                            new C79459a(this.f190572a.f190570y).mo123050a(R.string.fq8).mo123053a();
                        } else {
                            new C79459a(this.f190572a.f190570y).mo123050a(R.string.fe1).mo123053a();
                        }
                    }
                }

                /* renamed from: h */
                private final void m146436h() {
                    if (this.f190555j || this.f190554i) {
                        C81506p pVar = new C81506p();
                        this.f190563r = pVar;
                        pVar.f182235a = this.f190547b;
                        pVar.f182236b = this.f190548c;
                        ShareDependService a = ShareDependService.C68822a.m121324a();
                        Aweme aweme = this.f190557l;
                        if (aweme == null) {
                            C89219l.m154710a("mAweme");
                        }
                        User author = aweme.getAuthor();
                        C89219l.m154716b(author, "");
                        AbstractC32846a a2 = a.mo109323a(author);
                        Aweme aweme2 = this.f190557l;
                        if (aweme2 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        C81506p a3 = pVar.mo125223a(a2, aweme2.getVideo());
                        a3.f182239e = this.f190555j;
                        a3.f182242h = this.f190554i;
                        a3.f182244j = false;
                        C71849n a4 = C71849n.m126865a();
                        C89219l.m154716b(a4, "");
                        a3.f182243i = a4.mo113497c();
                        a3.f182241g = this.f190569x;
                        a3.f182245k = true;
                        a3.f182246l = this.f190532G;
                    }
                }

                /* renamed from: c */
                public final void mo130090c() {
                    C68909c.f154153a = false;
                    C68909c.f154154b = false;
                    if (this.f190540O.hasMessages(1)) {
                        this.f190540O.removeMessages(1);
                    }
                    if (C68909c.f154155c) {
                        C80720e.m139931c(this.f190548c);
                        mo130093e();
                        C68909c.f154155c = false;
                        return;
                    }
                    mo130093e();
                    C29339a.m58754b(new RunnableC85166d(this));
                    if (C89219l.m154714a((Object) this.f190568w, (Object) "long_press_download")) {
                        Aweme aweme = this.f190557l;
                        if (aweme == null) {
                            C89219l.m154710a("mAweme");
                        }
                        C33741b.m69070a(aweme, "mask", this.f190532G);
                        return;
                    }
                    Aweme aweme2 = this.f190557l;
                    if (aweme2 == null) {
                        C89219l.m154710a("mAweme");
                    }
                    C33741b.m69070a(aweme2, this.f190552g, this.f190532G);
                }

                /* renamed from: d */
                public final boolean mo130092d() {
                    boolean z;
                    this.f190529D = this.f190528C + this.f190551f + "_mute.mp4";
                    String str = this.f190548c;
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    String str2 = this.f190529D;
                    if (str2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(str2, "");
                    C1743j jVar = new C1743j();
                    AVExternalServiceImpl.m113114a().abilityService().processService().muteVideo(str, str2, new C69486v.C69487a(jVar));
                    C1731i<TResult> iVar = jVar.f5610a;
                    C89219l.m154716b(iVar, "");
                    try {
                        iVar.mo5547f();
                        C80720e.m139931c(this.f190548c);
                        TResult d = iVar.mo5545d();
                        if (d != null) {
                            if (d.intValue() == 0) {
                                this.f190548c = this.f190529D;
                                return true;
                            }
                        }
                        String str3 = this.f190548c;
                        Long valueOf = Long.valueOf(this.f190559n);
                        String str4 = this.f190532G;
                        if (!this.f190555j) {
                            if (!this.f190554i) {
                                z = false;
                                C1731i.m5640b(new C68852ac.C68853a.CallableC68855b(str3, valueOf, iVar.mo5545d(), str4, z), C1731i.f5562a);
                                C80720e.m139931c(this.f190529D);
                                return false;
                            }
                        }
                        z = true;
                        C1731i.m5640b(new C68852ac.C68853a.CallableC68855b(str3, valueOf, iVar.mo5545d(), str4, z), C1731i.f5562a);
                        C80720e.m139931c(this.f190529D);
                        return false;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return false;
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.android.ugc.trill.share.base.b$h */
                public static final class CallableC85171h<V> implements Callable {

                    /* renamed from: a */
                    final /* synthetic */ C85162b f190578a;

                    static {
                        Covode.recordClassIndex(99215);
                    }

                    CallableC85171h(C85162b bVar) {
                        this.f190578a = bVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        C85162b.m146429a(this.f190578a, "download_time", "add_watermark");
                        C80720e.m139917a(this.f190578a.f190546a, false);
                        if (this.f190578a.f190555j) {
                            C85162b bVar = this.f190578a;
                            C85179g.C85180a aVar = new C85179g.C85180a(C85162b.m146428a(this.f190578a), this.f190578a.f190551f);
                            aVar.f190599f = this.f190578a.f190555j;
                            boolean z = this.f190578a.f190554i;
                            StringBuilder sb = new StringBuilder();
                            if (z) {
                                sb.append("ins_special");
                            } else {
                                sb.append("topleft");
                            }
                            if (!C71842g.m126860a() && z && C68957b.m121641a()) {
                                sb.append(",ins_ending");
                            }
                            aVar.f190597d = sb.toString();
                            int i = 1;
                            aVar.f190595b = 1;
                            bVar.f190562q = new C85179g(aVar);
                            C85179g gVar = this.f190578a.f190562q;
                            if (gVar != null) {
                                gVar.f190593a.f190594a = System.currentTimeMillis();
                                C39162r.m79460a("client_watermark_start", new C33744d().mo59981a("start_watermark", gVar.f190593a.f190594a).mo59983a("watermark_id", gVar.f190593a.f190596c).mo59980a("watermark_sdk", gVar.f190593a.f190595b).mo59983a("watermark_type", gVar.f190593a.f190597d).mo59980a("is_self_video", gVar.f190593a.f190598e).f79943a);
                            }
                            RuntimeBehaviorServiceImpl.m94812c().mo85865a("water_mark_start");
                            C85162b bVar2 = this.f190578a;
                            C68909c.f154153a = false;
                            C68909c.f154154b = true;
                            C81506p pVar = bVar2.f190563r;
                            if (pVar == null) {
                                C89219l.m154715b();
                            }
                            pVar.f182248n = bVar2.f190559n;
                            pVar.f182247m = bVar2.f190560o;
                            if (bVar2.f190554i && C68957b.m121641a()) {
                                i = 2;
                            }
                            bVar2.f190561p = i;
                            Aweme aweme = bVar2.f190557l;
                            if (aweme == null) {
                                C89219l.m154710a("mAweme");
                            }
                            C68852ac.C68853a.m121522a(aweme.getAid(), bVar2.f190567v, bVar2.f190552g, "short", null, bVar2.f190561p);
                            C79340b.m138147a().waterMarkStart();
                            IWaterMarkService b = bVar2.f190566u.mo5560b();
                            if (b != null) {
                                C81506p pVar2 = bVar2.f190563r;
                                if (pVar2 == null) {
                                    C89219l.m154715b();
                                }
                                b.waterMark(pVar2);
                            }
                        } else {
                            C80720e.m139932c(this.f190578a.f190547b, this.f190578a.f190548c);
                            C85162b bVar3 = this.f190578a;
                            if (!bVar3.mo130087a(C85162b.m146428a(bVar3), this.f190578a.f190552g) || this.f190578a.mo130092d()) {
                                this.f190578a.mo130090c();
                            } else {
                                this.f190578a.mo130088b();
                            }
                        }
                        return C89391z.f203057a;
                    }
                }

                /* renamed from: a */
                public final void mo130083a() {
                    Context context = this.f190570y;
                    if (context instanceof Activity) {
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        if (!((Activity) context).isFinishing()) {
                            int i = Build.VERSION.SDK_INT;
                            Context context2 = this.f190570y;
                            Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                            if (((Activity) context2).isDestroyed()) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    AlertDialogC74139b bVar = this.f190550e;
                    if (bVar != null && bVar.isShowing()) {
                        AlertDialogC74139b bVar2 = this.f190550e;
                        if (bVar2 == null) {
                            C89219l.m154715b();
                        }
                        bVar2.dismiss();
                    }
                }

                /* renamed from: com.ss.android.ugc.trill.share.base.b$e */
                public static final class C85167e implements AbstractC81509s {

                    /* renamed from: a */
                    final /* synthetic */ C85162b f190574a;

                    static {
                        Covode.recordClassIndex(99211);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    C85167e(C85162b bVar) {
                        this.f190574a = bVar;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81509s
                    /* renamed from: a */
                    public final void mo125226a(int i) {
                        C85162b bVar = this.f190574a;
                        AbstractC71843h hVar = bVar.f190558m;
                        if (hVar == null) {
                            C89219l.m154715b();
                        }
                        bVar.f190549d = hVar.mo113491a(EnumC71847l.VIDEO_WATER_TYPE, i);
                        C68909c.m121603a(C68906a.m121601a(2, C85162b.m146428a(this.f190574a), this.f190574a.f190549d));
                        this.f190574a.mo130094f();
                    }

                    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81509s
                    /* renamed from: a */
                    public final void mo125227a(String str) {
                        C89219l.m154721d(str, "");
                        C68909c.f154154b = false;
                        if (C68909c.f154155c) {
                            C68909c.f154155c = false;
                            return;
                        }
                        C85179g gVar = this.f190574a.f190562q;
                        if (gVar != null) {
                            gVar.mo130106a(1);
                        }
                        RuntimeBehaviorServiceImpl.m94812c().mo85865a("water_mark_success");
                        C85162b bVar = this.f190574a;
                        if (!bVar.mo130087a(C85162b.m146428a(bVar), this.f190574a.f190552g) || this.f190574a.mo130092d()) {
                            this.f190574a.mo130090c();
                        } else {
                            this.f190574a.mo130088b();
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81509s
                    /* renamed from: b */
                    public final void mo125228b(int i) {
                        C68909c.f154154b = false;
                        this.f190574a.f190556k = i;
                        C68909c.m121603a(C68906a.m121601a(5, C85162b.m146428a(this.f190574a), 0));
                        C85179g gVar = this.f190574a.f190562q;
                        if (gVar != null) {
                            gVar.mo130106a(0);
                        }
                        RuntimeBehaviorServiceImpl.m94812c().mo85865a("water_mark_error");
                        String str = this.f190574a.f190547b;
                        String str2 = this.f190574a.f190548c;
                        Aweme a = C85162b.m146428a(this.f190574a);
                        StringBuilder sb = new StringBuilder("WaterMark:");
                        sb.append("inputPath:").append(str);
                        sb.append(",");
                        sb.append("outputPath:").append(str2);
                        if (a != null) {
                            sb.append(",");
                            sb.append("aweme_id:").append(a.getAid());
                        }
                        C33854u.m69292a(sb.toString(), "");
                        if (C68909c.f154155c) {
                            C80720e.m139931c(this.f190574a.f190548c);
                            this.f190574a.mo130093e();
                            C68909c.f154155c = false;
                            return;
                        }
                        this.f190574a.mo130088b();
                    }
                }

                /* renamed from: a */
                public final void mo130085a(AbstractC49927b bVar) {
                    this.f190553h = bVar;
                    C68907b.f154147a = bVar;
                }

                /* renamed from: b */
                public final void mo130089b(String str) {
                    C89219l.m154721d(str, "");
                    this.f190568w = str;
                }

                /* renamed from: c */
                public final void mo130091c(String str) {
                    C89219l.m154721d(str, "");
                    this.f190539N = str;
                }

                /* renamed from: a */
                public static final /* synthetic */ Aweme m146428a(C85162b bVar) {
                    Aweme aweme = bVar.f190557l;
                    if (aweme == null) {
                        C89219l.m154710a("mAweme");
                    }
                    return aweme;
                }

                /* renamed from: b */
                private static boolean m146433b(ACLCommonShare aCLCommonShare) {
                    if (aCLCommonShare != null && aCLCommonShare.getTranscode() == 1) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: c */
                private static boolean m146434c(ACLCommonShare aCLCommonShare) {
                    if (aCLCommonShare == null) {
                        return false;
                    }
                    int transcode = aCLCommonShare.getTranscode();
                    if (transcode == 2 || transcode == 3) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: a */
                private static boolean m146431a(ACLCommonShare aCLCommonShare) {
                    if (aCLCommonShare != null && aCLCommonShare.getTranscode() == 2) {
                        return true;
                    }
                    return false;
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onCanceled(DownloadInfo downloadInfo) {
                    C89219l.m154721d(downloadInfo, "");
                    super.onCanceled(downloadInfo);
                    Aweme aweme = this.f190557l;
                    if (aweme == null) {
                        C89219l.m154710a("mAweme");
                    }
                    C68909c.m121603a(C68906a.m121601a(3, aweme, 0));
                    C68909c.f154153a = false;
                    this.f190564s.mo123964a(this.f190570y);
                    if (C68909c.f154155c) {
                        C80720e.m139931c(this.f190548c);
                        mo130093e();
                        C68909c.f154155c = false;
                    }
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                    C89219l.m154721d(downloadInfo, "");
                    super.onProgress(downloadInfo);
                    int curBytes = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
                    AbstractC71843h hVar = this.f190558m;
                    if (hVar == null) {
                        C89219l.m154715b();
                    }
                    this.f190549d = hVar.mo113491a(EnumC71847l.VIDEO_DOWNLOAD_TYPE, curBytes);
                    mo130094f();
                    Aweme aweme = this.f190557l;
                    if (aweme == null) {
                        C89219l.m154710a("mAweme");
                    }
                    C68909c.m121603a(C68906a.m121601a(2, aweme, this.f190549d));
                }

                /* renamed from: a */
                private final ACLCommonShare m146427a(Aweme aweme) {
                    String str;
                    if (!m146435g()) {
                        return null;
                    }
                    if (C89219l.m154714a((Object) this.f190536K, (Object) "download_action")) {
                        if (C89219l.m154714a((Object) C68900c.f154110a, (Object) "long_press_download")) {
                            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
                            if (awemeACLShareInfo != null) {
                                return awemeACLShareInfo.getDownloadMaskPanel();
                            }
                            return null;
                        }
                        AwemeACLShare awemeACLShareInfo2 = aweme.getAwemeACLShareInfo();
                        if (awemeACLShareInfo2 != null) {
                            return awemeACLShareInfo2.getDownloadGeneral();
                        }
                        return null;
                    } else if (!C89219l.m154714a((Object) this.f190536K, (Object) "share_download") || (str = this.f190552g) == null) {
                        return null;
                    } else {
                        return C69157h.C69158a.m122266b(aweme, str);
                    }
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    C89219l.m154721d(downloadInfo, "");
                    super.onStart(downloadInfo);
                    Aweme aweme = this.f190557l;
                    if (aweme == null) {
                        C89219l.m154710a("mAweme");
                    }
                    C68909c.m121603a(C68906a.m121601a(1, aweme, 0));
                    C68909c.f154153a = true;
                    C85174d dVar = this.f190538M;
                    if (dVar != null) {
                        dVar.f190582b = System.currentTimeMillis();
                        C33744d a = new C33744d().mo59981a("start_download", dVar.f190582b).mo59980a("is_self_video", dVar.f190583c).mo59980a("is_server_watermark", dVar.f190581a);
                        Aweme aweme2 = dVar.f190584d;
                        if (aweme2 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        C39162r.m79460a("download_start", a.mo59983a("aweme_id", aweme2.getAid()).mo59983a("download_url", dVar.f190585e).f79943a);
                    }
                }

                /* renamed from: a */
                private final void m146430a(boolean z) {
                    C85163a.m146451a(true);
                    Aweme aweme = this.f190557l;
                    if (aweme == null) {
                        C89219l.m154710a("mAweme");
                    }
                    C68909c.f154157e = aweme;
                    if (z) {
                        C80720e.m139917a(this.f190527B, false);
                        m146429a(this, "download_time", "download");
                        C33830n.m70668a("ug_save_video_start", new JSONObject());
                        this.f190532G = C81076b.m140766a(this.f190532G);
                        C85174d dVar = new C85174d();
                        Aweme aweme2 = this.f190557l;
                        if (aweme2 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        C85174d a = dVar.mo130103a(C49925a.m93732a(aweme2)).mo130101a(this.f190537L);
                        Aweme aweme3 = this.f190557l;
                        if (aweme3 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        this.f190538M = a.mo130102a(aweme3);
                        C68909c.f154153a = true;
                        this.f190564s.mo123967a(this);
                        Aweme aweme4 = this.f190557l;
                        if (aweme4 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        String a2 = C33730a.m69052a(aweme4, this.f190532G);
                        this.f190532G = a2;
                        C85174d dVar2 = this.f190538M;
                        if (dVar2 != null) {
                            dVar2.f190585e = a2;
                        }
                        C80754a aVar = this.f190564s;
                        Context context = this.f190570y;
                        Aweme aweme5 = this.f190557l;
                        if (aweme5 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        String aid = aweme5.getAid();
                        C89219l.m154716b(aid, "");
                        String str = this.f190532G;
                        if (str == null) {
                            C89219l.m154715b();
                        }
                        aVar.mo123966a(context, aid, str, C89219l.m154704a(this.f190551f, (Object) ".mp4"), this.f190527B);
                        RuntimeBehaviorServiceImpl.m94812c().mo85865a("download_start");
                        if (this.f190555j) {
                            C1731i.m5640b(new CallableC85164b(this), C40780g.m82241a());
                            return;
                        }
                        return;
                    }
                    this.f190558m = new C71844i(false, true);
                    m146437i();
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    C89219l.m154721d(downloadInfo, "");
                    super.onSuccessed(downloadInfo);
                    C68909c.f154153a = false;
                    this.f190564s.mo123964a(this.f190570y);
                    if (C68909c.f154155c) {
                        C80720e.m139931c(this.f190548c);
                        mo130093e();
                        C68909c.f154155c = false;
                        return;
                    }
                    Aweme aweme = this.f190557l;
                    if (aweme == null) {
                        C89219l.m154710a("mAweme");
                    }
                    String aid = aweme.getAid();
                    C89219l.m154716b(aid, "");
                    Aweme aweme2 = this.f190557l;
                    if (aweme2 == null) {
                        C89219l.m154710a("mAweme");
                    }
                    int awemeType = aweme2.getAwemeType();
                    C49966c.C49967a aVar = new C49966c.C49967a();
                    aVar.f115215a = aid;
                    aVar.f115218d = 1;
                    aVar.f115219e = awemeType;
                    C89378p<Integer, String> pVar = this.f190531F;
                    if (pVar == null) {
                        C89219l.m154715b();
                    }
                    aVar.f115220f = pVar.getFirst().intValue();
                    this.f190535J.mo57616a(aVar.mo85008a());
                    String targetFilePath = downloadInfo.getTargetFilePath();
                    if (targetFilePath != null) {
                        this.f190547b = targetFilePath;
                        if (targetFilePath.length() != 0) {
                            File file = new File(targetFilePath);
                            C85174d dVar = this.f190538M;
                            if (dVar == null) {
                                C89219l.m154715b();
                            }
                            if (dVar.f190582b != 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                C85174d dVar2 = this.f190538M;
                                if (dVar2 == null) {
                                    C89219l.m154715b();
                                }
                                this.f190559n = currentTimeMillis - dVar2.f190582b;
                                this.f190560o = file.length() / this.f190559n;
                                RuntimeBehaviorServiceImpl.m94812c().mo85865a("download_success");
                                C85174d dVar3 = this.f190538M;
                                if (dVar3 == null) {
                                    C89219l.m154715b();
                                }
                                String str = this.f190567v;
                                C89219l.m154721d(str, "");
                                long currentTimeMillis2 = System.currentTimeMillis();
                                C1731i.m5640b(new C85174d.CallableC85176b(dVar3, targetFilePath, currentTimeMillis2, str, currentTimeMillis2 - dVar3.f190582b), C1731i.f5562a);
                                if (!this.f190555j && !this.f190554i) {
                                    long length = file.length();
                                    Long valueOf = Long.valueOf(this.f190559n);
                                    String str2 = this.f190532G;
                                    Aweme aweme3 = this.f190557l;
                                    if (aweme3 == null) {
                                        C89219l.m154710a("mAweme");
                                    }
                                    Boolean valueOf2 = Boolean.valueOf(mo130087a(aweme3, this.f190552g));
                                    UrlModel urlModel = this.f190533H;
                                    Aweme aweme4 = this.f190557l;
                                    if (aweme4 == null) {
                                        C89219l.m154710a("mAweme");
                                    }
                                    C68852ac.C68853a.m121521a(targetFilePath, length, valueOf, str2, false, -1, "success", valueOf2, urlModel, C68852ac.C68853a.m121523a(aweme4));
                                    Aweme aweme5 = this.f190557l;
                                    if (aweme5 == null) {
                                        C89219l.m154710a("mAweme");
                                    }
                                    C68852ac.C68853a.m121522a(aweme5.getAid(), this.f190567v, this.f190552g, "short", C68852ac.C68853a.m121520a(this.f190533H), 0);
                                }
                            }
                            C39162r.onEvent(MobClick.obtain().setEventName(this.f190542Q).setLabelName(this.f190543R).setValue(String.valueOf(System.currentTimeMillis() - this.f190541P)).setJsonObject(this.f190544S));
                            if (file.length() < InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                                C89219l.m154716b(iESSettingsProxy, "");
                                Boolean supportFilterErrorFile = iESSettingsProxy.getSupportFilterErrorFile();
                                C89219l.m154716b(supportFilterErrorFile, "");
                                if (supportFilterErrorFile.booleanValue()) {
                                    mo130093e();
                                    String str3 = this.f190532G;
                                    if (str3 == null) {
                                        C89219l.m154715b();
                                    }
                                    if (C89361p.m154874b(str3, "http://", false)) {
                                        String str4 = this.f190532G;
                                        if (str4 == null) {
                                            C89219l.m154715b();
                                        }
                                        this.f190532G = C89361p.m154868a(str4, "http://", "https://");
                                        this.f190564s.mo123967a(this);
                                        Aweme aweme6 = this.f190557l;
                                        if (aweme6 == null) {
                                            C89219l.m154710a("mAweme");
                                        }
                                        String a = C33730a.m69052a(aweme6, this.f190532G);
                                        this.f190532G = a;
                                        C85174d dVar4 = this.f190538M;
                                        if (dVar4 != null) {
                                            dVar4.f190585e = a;
                                        }
                                        C80754a aVar2 = this.f190564s;
                                        Context context = this.f190570y;
                                        Aweme aweme7 = this.f190557l;
                                        if (aweme7 == null) {
                                            C89219l.m154710a("mAweme");
                                        }
                                        String aid2 = aweme7.getAid();
                                        C89219l.m154716b(aid2, "");
                                        String str5 = this.f190532G;
                                        if (str5 == null) {
                                            C89219l.m154715b();
                                        }
                                        aVar2.mo123966a(context, aid2, str5, C89219l.m154704a(this.f190551f, (Object) ".mp4"), this.f190527B);
                                        return;
                                    }
                                    this.f190530E = 3;
                                    onFailed(null, new BaseException(-1, "Download hijacked"));
                                    return;
                                }
                            }
                            m146437i();
                        }
                    }
                }

                private C85162b(Context context, boolean z) {
                    C89219l.m154721d(context, "");
                    this.f190570y = context;
                    this.f190564s = new C80754a();
                    this.f190566u = new C85172i();
                    this.f190539N = "";
                    this.f190567v = "";
                    this.f190568w = "download_to_share";
                    this.f190540O = new HandlerC85168f(this, Looper.getMainLooper());
                    this.f190541P = -1;
                    this.f190545T = new RunnableC85170g(this);
                    this.f190569x = new C85167e(this);
                    this.f190554i = z;
                    String e = C73955am.m130073e(this.f190570y);
                    C89219l.m154716b(e, "");
                    this.f190527B = e;
                    String f = C73955am.m130076f(this.f190570y);
                    C89219l.m154716b(f, "");
                    this.f190546a = f;
                    String g = C73955am.m130077g(this.f190570y);
                    C89219l.m154716b(g, "");
                    this.f190528C = g;
                    C39088c<?, ?> cVar = new C39088c<>();
                    this.f190535J = cVar;
                    cVar.mo67838a(new C49955a());
                }

                /* renamed from: a */
                private final boolean m146432a(ACLCommonShare aCLCommonShare, boolean z) {
                    if (!m146435g()) {
                        Aweme aweme = this.f190557l;
                        if (aweme == null) {
                            C89219l.m154710a("mAweme");
                        }
                        return C49925a.m93733a(aweme, z);
                    } else if (z) {
                        return m146434c(aCLCommonShare);
                    } else {
                        return m146431a(aCLCommonShare);
                    }
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    boolean z;
                    super.onFailed(downloadInfo, baseException);
                    C68909c.f154153a = false;
                    this.f190564s.mo123964a(this.f190570y);
                    if (baseException == null) {
                        mo130088b();
                    } else if (C68909c.f154155c) {
                        C80720e.m139931c(this.f190548c);
                        mo130093e();
                        C68909c.f154155c = false;
                    } else {
                        Aweme aweme = this.f190557l;
                        if (aweme == null) {
                            C89219l.m154710a("mAweme");
                        }
                        String str = this.f190532G;
                        StringBuilder sb = new StringBuilder("DownloaderError:");
                        sb.append("error_code:").append(baseException.getErrorCode());
                        sb.append(",");
                        sb.append("error_message:").append(baseException.getMessage());
                        if (aweme != null) {
                            sb.append(",");
                            sb.append("aweme_id:").append(aweme.getAid());
                        }
                        C33854u.m69292a(sb.toString(), str);
                        int errorCode = baseException.getErrorCode();
                        long currentTimeMillis = System.currentTimeMillis();
                        C85174d dVar = this.f190538M;
                        if (dVar == null) {
                            C89219l.m154715b();
                        }
                        Long valueOf = Long.valueOf(currentTimeMillis - dVar.f190582b);
                        String str2 = this.f190532G;
                        if (this.f190555j || this.f190554i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Integer valueOf2 = Integer.valueOf(errorCode);
                        String errorMessage = baseException.getErrorMessage();
                        Aweme aweme2 = this.f190557l;
                        if (aweme2 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        Boolean valueOf3 = Boolean.valueOf(mo130087a(aweme2, this.f190552g));
                        UrlModel urlModel = this.f190533H;
                        Aweme aweme3 = this.f190557l;
                        if (aweme3 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        C68852ac.C68853a.m121521a(null, -1, valueOf, str2, z, valueOf2, errorMessage, valueOf3, urlModel, C68852ac.C68853a.m121523a(aweme3));
                        if (this.f190530E < 3) {
                            C85174d dVar2 = this.f190538M;
                            if (dVar2 != null) {
                                dVar2.mo130104a(System.currentTimeMillis(), -1, errorCode, baseException.getErrorMessage(), false, this.f190567v);
                            }
                            this.f190530E++;
                            UrlModel urlModel2 = this.f190533H;
                            if (urlModel2 != null && !C13603b.m24435a((Collection) urlModel2.getUrlList())) {
                                UrlModel urlModel3 = this.f190533H;
                                if (urlModel3 == null) {
                                    C89219l.m154715b();
                                }
                                List<String> urlList = urlModel3.getUrlList();
                                int i = this.f190530E;
                                UrlModel urlModel4 = this.f190533H;
                                if (urlModel4 == null) {
                                    C89219l.m154715b();
                                }
                                this.f190532G = urlList.get(i % urlModel4.getUrlList().size());
                            }
                            this.f190532G = C81076b.m140766a(this.f190532G);
                            this.f190564s.mo123967a(this);
                            Aweme aweme4 = this.f190557l;
                            if (aweme4 == null) {
                                C89219l.m154710a("mAweme");
                            }
                            String a = C33730a.m69052a(aweme4, this.f190532G);
                            this.f190532G = a;
                            C85174d dVar3 = this.f190538M;
                            if (dVar3 != null) {
                                dVar3.f190585e = a;
                            }
                            C80754a aVar = this.f190564s;
                            Context context = this.f190570y;
                            Aweme aweme5 = this.f190557l;
                            if (aweme5 == null) {
                                C89219l.m154710a("mAweme");
                            }
                            String aid = aweme5.getAid();
                            C89219l.m154716b(aid, "");
                            String str3 = this.f190532G;
                            if (str3 == null) {
                                C89219l.m154715b();
                            }
                            aVar.mo123966a(context, aid, str3, C89219l.m154704a(this.f190551f, (Object) ".mp4"), this.f190527B);
                            return;
                        }
                        Aweme aweme6 = this.f190557l;
                        if (aweme6 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        C68909c.m121603a(C68906a.m121601a(5, aweme6, 0));
                        mo130088b();
                        String str4 = baseException.getErrorMessage() + "    ***  Number of Retries *** :" + this.f190530E;
                        C17867d.m33078a();
                        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132256h = m146438j();
                        }
                        if (C58029j.f132256h) {
                            JSONObject a2 = new C33743c().mo59974a("errorCode", Integer.valueOf(errorCode)).mo59976a("errorDes", str4).mo59977a();
                            if (errorCode == 1052) {
                                a2.putOpt("availableStorageSize", Long.valueOf(C1756d.m5895b(C17867d.m33078a())));
                                a2.putOpt("totalStorageSize", Long.valueOf(C1756d.m5897c(C17867d.m33078a())));
                            }
                            C12290b.m22060a("aweme_download_error_rate", 1, a2);
                        }
                        String str5 = String.valueOf(errorCode);
                        if (errorCode > 0) {
                            Aweme aweme7 = this.f190557l;
                            if (aweme7 == null) {
                                C89219l.m154710a("mAweme");
                            }
                            if (C68852ac.C68853a.m121523a(aweme7)) {
                                str5 = str5 + "P";
                            }
                        }
                        RuntimeBehaviorServiceImpl.m94812c().mo85866a("download_error", str5);
                        C33740a.m69069a("aweme_movie_download_log", "", str4, this.f190532G);
                        C85174d dVar4 = this.f190538M;
                        if (dVar4 == null) {
                            C89219l.m154715b();
                        }
                        dVar4.mo130104a(System.currentTimeMillis(), -1, errorCode, baseException.getErrorMessage(), true, this.f190567v);
                    }
                }

                /* renamed from: a */
                static /* synthetic */ void m146429a(C85162b bVar, String str, String str2) {
                    bVar.f190541P = System.currentTimeMillis();
                    bVar.f190542Q = str;
                    bVar.f190543R = str2;
                    bVar.f190544S = null;
                }

                /* renamed from: a */
                public final void mo130084a(Aweme aweme, String str, boolean z) {
                    boolean z2;
                    boolean z3;
                    String str2;
                    boolean z4;
                    String builder;
                    String str3 = "";
                    C89219l.m154721d(aweme, str3);
                    C89219l.m154721d(str, str3);
                    this.f190557l = aweme;
                    this.f190536K = str;
                    this.f190537L = m146427a(aweme);
                    boolean z5 = false;
                    C68909c.f154155c = false;
                    this.f190565t = C68909c.m121607b("download");
                    if (!this.f190554i || !m146432a(this.f190537L, true)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    this.f190554i = z2;
                    this.f190555j = m146432a(this.f190537L, false);
                    if (z || m146433b(this.f190537L)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f190534I = z3;
                    if (C71842g.m126860a()) {
                        this.f190555j = true;
                    }
                    C85160a aVar = new C85160a();
                    aVar.f190524e = this.f190552g;
                    Aweme aweme2 = this.f190557l;
                    if (aweme2 == null) {
                        C89219l.m154710a("mAweme");
                    }
                    aVar.mo130082a(aweme2, this.f190555j, this.f190554i, m146435g(), this.f190537L, this.f190534I);
                    this.f190555j = aVar.f190522c;
                    this.f190551f = aVar.f190521b;
                    UrlModel urlModel = aVar.f190520a;
                    this.f190533H = urlModel;
                    if (urlModel == null || C13603b.m24435a((Collection) urlModel.getUrlList())) {
                        C33854u.EnumC33855a aVar2 = C33854u.EnumC33855a.DOWNLOAD_URL;
                        Aweme aweme3 = this.f190557l;
                        if (aweme3 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        C33854u.m69291a(aVar2, aweme3);
                        return;
                    }
                    UrlModel urlModel2 = this.f190533H;
                    if (urlModel2 != null && !C13603b.m24435a((Collection) urlModel2.getUrlList())) {
                        UrlModel urlModel3 = this.f190533H;
                        if (urlModel3 == null) {
                            C89219l.m154715b();
                        }
                        String str4 = urlModel3.getUrlList().get(0);
                        this.f190532G = str4;
                        if (str4 != null) {
                            Aweme aweme4 = this.f190557l;
                            if (aweme4 == null) {
                                C89219l.m154710a("mAweme");
                            }
                            if (C80635y.m139810e(aweme4)) {
                                UrlModel urlModel4 = this.f190533H;
                                if (urlModel4 == null) {
                                    C89219l.m154715b();
                                }
                                List<String> urlList = urlModel4.getUrlList();
                                UrlModel urlModel5 = this.f190533H;
                                if (urlModel5 == null) {
                                    C89219l.m154715b();
                                }
                                this.f190532G = urlList.get(urlModel5.getUrlList().size() - 1);
                                if (C89361p.m154908a((CharSequence) str4, (CharSequence) "ratio", false)) {
                                    builder = new C89350l("(ratio=[^&]*)").replace(str4, "ratio=default");
                                } else {
                                    Uri.Builder buildUpon = Uri.parse(this.f190532G).buildUpon();
                                    buildUpon.appendQueryParameter("ratio", "default");
                                    builder = buildUpon.toString();
                                }
                                this.f190532G = builder;
                            }
                        }
                    }
                    Aweme aweme5 = this.f190557l;
                    if (aweme5 == null) {
                        C89219l.m154710a("mAweme");
                    }
                    C69272k.m122468a(aweme5, this.f190567v, this.f190568w, this.f190539N, FeedParamProvider.C49809a.m93270a(this.f190570y).getFromGroupId(), FeedParamProvider.C49809a.m93270a(this.f190570y).getNewsId());
                    if (!this.f190554i) {
                        str2 = this.f190528C + this.f190551f + ".mp4";
                    } else {
                        str2 = this.f190528C + this.f190551f + "_ins.mp4";
                    }
                    this.f190548c = str2;
                    if (C80720e.m139927b(str2)) {
                        Aweme aweme6 = this.f190557l;
                        if (aweme6 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        C68909c.f154157e = aweme6;
                        Aweme aweme7 = this.f190557l;
                        if (aweme7 == null) {
                            C89219l.m154710a("mAweme");
                        }
                        C68909c.m121603a(C68906a.m121601a(1, aweme7, 0));
                        mo130090c();
                        return;
                    }
                    if (!this.f190565t) {
                        if (this.f190550e == null) {
                            Context context = this.f190570y;
                            if (context == null) {
                                C89219l.m154715b();
                            }
                            this.f190550e = AlertDialogC74139b.m130363a(context, context.getResources().getString(R.string.fe0));
                            C33744d a = new C33744d().mo59983a("enter_from", this.f190567v).mo59980a("is_long_item", 0);
                            if (this.f190557l == null) {
                                C89219l.m154710a("mAweme");
                            } else {
                                Aweme aweme8 = this.f190557l;
                                if (aweme8 == null) {
                                    C89219l.m154710a("mAweme");
                                    C89219l.m154715b();
                                }
                                str3 = aweme8.getAid();
                            }
                            C39162r.m79460a("download_process_popup_show", a.mo59983a("group_id", str3).mo59983a("download_method", this.f190568w).f79943a);
                        }
                        AlertDialogC74139b bVar = this.f190550e;
                        if (bVar != null) {
                            bVar.mo116602a(0);
                        }
                    }
                    String str5 = this.f190527B + this.f190551f + ".mp4";
                    this.f190547b = str5;
                    C68907b.f154148b = this.f190548c;
                    C68907b.f154149c = this.f190547b;
                    if (!C80720e.m139927b(str5) || f190526z) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.f190555j && !z) {
                        z5 = true;
                    }
                    this.f190558m = new C71844i(z4, z5);
                    m146436h();
                    m146430a(z4);
                    if (!this.f190565t) {
                        this.f190540O.sendEmptyMessageDelayed(1, 30000);
                    }
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public C85162b(Context context, boolean z, int i, String str) {
                    this(context, z);
                    String str2 = "";
                    C89219l.m154721d(context, str2);
                    this.f190552g = str;
                    C68909c.f154159g = str;
                    int i2 = 2;
                    if (i == 0) {
                        i2 = 0;
                        str2 = "homepage_hot";
                    } else if (i == 1) {
                        str2 = "homepage_follow";
                        i2 = 1;
                    } else if (i != 2) {
                        if (i != 1000) {
                            if (i != 1001) {
                                if (i != 2000) {
                                    if (i != 2001) {
                                        if (i == 3002) {
                                            i2 = 5;
                                            str2 = "challenge_hot";
                                        } else if (i == 3003) {
                                            i2 = 9;
                                            str2 = "challenge";
                                        } else if (i == 4000) {
                                            i2 = 6;
                                            str2 = "music_hot";
                                        } else if (i == 4001) {
                                            i2 = 8;
                                            str2 = "music_new";
                                        } else if (i == 5000) {
                                            i2 = 7;
                                            str2 = "found";
                                        } else if (i != 8000) {
                                            i2 = -1;
                                        } else {
                                            i2 = 20;
                                            str2 = "window_follow";
                                        }
                                    }
                                }
                            }
                            i2 = 4;
                            str2 = "personal_collection";
                        }
                        i2 = 3;
                        str2 = "personal_homepage";
                    } else {
                        str2 = "homepage_fresh";
                    }
                    this.f190531F = new C89378p<>(Integer.valueOf(i2), str2);
                }
            }
