package com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a;

import android.os.Looper;
import android.p003ss.com.vboost.C0004a;
import android.p003ss.com.vboost.EnumC0044d;
import android.text.TextUtils;
import androidx.core.p033d.C0646a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p1999a.C27252o;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.AbstractExecutorServiceC27657s;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.AbstractRunnableC27634d;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.google.p1998c.p2006h.p2007a.C27659u;
import com.p2082ss.android.ttve.editorInfo.C30652a;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65367bg;
import com.p2082ss.android.ugc.aweme.property.C65370bj;
import com.p2082ss.android.ugc.aweme.publish.p3610a.p3611a.C65507b;
import com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3620g.C65618a;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3621a.C65619a;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3621a.C65620b;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.settings.C68750p;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j;
import com.p2082ss.android.ugc.aweme.shortvideo.C69767ab;
import com.p2082ss.android.ugc.aweme.shortvideo.C69807af;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C70646dq;
import com.p2082ss.android.ugc.aweme.shortvideo.C71797ee;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.C71813eq;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70504v;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73835a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73846af;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73852c;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73909k;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73913n;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73914o;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73923w;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73924x;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73927z;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.C73876e;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.C73884h;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.C73892j;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.p3883a.C73867a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73896b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73938ac;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73979bb;
import com.p2082ss.android.ugc.aweme.shoutouts.C74424f;
import com.p2082ss.android.ugc.aweme.utils.C80540hn;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.watermark.AbstractC81494g;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import dmt.p4542av.p4543a.C88136h;
import dmt.p4542av.video.C88168aj;
import dmt.p4542av.video.C88257f;
import dmt.p4542av.video.C88278m;
import dmt.p4542av.video.C88303z;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a.a */
public final class C72572a extends AbstractC71893j {

    /* renamed from: A */
    private final C73835a f162677A = new C73835a();

    /* renamed from: B */
    private C65618a f162678B;

    /* renamed from: C */
    private final int f162679C;

    /* renamed from: D */
    private C73909k f162680D;

    /* renamed from: E */
    private boolean f162681E;

    /* renamed from: F */
    private C73852c f162682F;

    /* renamed from: f */
    public volatile boolean f162683f;

    /* renamed from: g */
    public AbstractC73910l f162684g;

    /* renamed from: h */
    public C71813eq f162685h;

    /* renamed from: i */
    public final String f162686i;

    /* renamed from: j */
    public AbstractC65668b f162687j;

    /* renamed from: k */
    public boolean f162688k;

    /* renamed from: l */
    public final int f162689l;

    /* renamed from: m */
    public C73896b f162690m;

    /* renamed from: n */
    public C73846af f162691n;

    /* renamed from: o */
    public final boolean f162692o;

    /* renamed from: p */
    public final C72579a f162693p;

    /* renamed from: q */
    boolean f162694q;

    /* renamed from: r */
    final Object f162695r;

    /* renamed from: s */
    private C65512a<SynthetiseResult> f162696s;

    /* renamed from: t */
    private AbstractFutureC27655q<C65616g> f162697t;

    /* renamed from: u */
    private C65512a<C65616g> f162698u;

    /* renamed from: v */
    private C73927z f162699v;

    /* renamed from: w */
    private C0646a f162700w;

    /* renamed from: x */
    private final TTUploaderService f162701x;

    /* renamed from: y */
    private final C70646dq f162702y = new C70646dq();

    /* renamed from: z */
    private C73913n f162703z;

    static {
        Covode.recordClassIndex(85255);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a.a$a */
    static class C72579a {

        /* renamed from: a */
        boolean f162722a;

        /* renamed from: b */
        Object f162723b;

        /* renamed from: c */
        C65616g f162724c;

        static {
            Covode.recordClassIndex(85262);
        }

        private C72579a() {
        }

        /* synthetic */ C72579a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo114889a(boolean z, boolean z2) {
        C73924x.f165970a.mo116372a("shutDown ".concat(String.valueOf(z)));
        if (z) {
            this.f162684g.mo110155a(true);
            this.f162678B.mo104798a(true);
        } else if (!this.f162683f) {
            this.f162683f = true;
            if (!this.f162696s.isDone()) {
                this.f162700w.mo2676b();
            }
            if (!z2) {
                this.f162684g.mo110155a(false);
            }
            this.f162678B.mo104798a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: b */
    public final long mo113550b() {
        C71813eq eqVar = this.f162685h;
        if (eqVar == null) {
            return -1;
        }
        return eqVar.f160942a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: c */
    public final long mo113554c() {
        C73896b bVar = this.f162690m;
        if (bVar == null) {
            return -1;
        }
        return bVar.mo116345d();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: d */
    public final long mo113556d() {
        C73896b bVar = this.f162690m;
        if (bVar == null) {
            return -1;
        }
        return bVar.mo116343b().mo116300c();
    }

    /* renamed from: e */
    public final synchronized boolean mo114890e() {
        MethodCollector.m26663i(7326);
        C73909k kVar = this.f162680D;
        if (kVar == null) {
            this.f162681E = true;
            MethodCollector.m26664o(7326);
            return true;
        }
        boolean a = kVar.mo116348a();
        MethodCollector.m26664o(7326);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: a */
    public final void mo113547a() {
        AbstractC65668b bVar;
        MethodCollector.m26663i(7662);
        this.f162688k = true;
        C73846af afVar = this.f162691n;
        if (afVar != null) {
            afVar.f165771d = true;
        }
        C84911q.m145921a("ConcurrentUploadFutureFactoryV2 merge Mode:" + this.f162689l + " isAllowMerge:" + this.f162688k);
        if (this.f162689l > 0 && (bVar = this.f162687j) != null) {
            bVar.mo104673e();
        }
        C73896b bVar2 = this.f162690m;
        C27252o oVar = bVar2.f165907a;
        C89219l.m154716b(oVar, "");
        synchronized (oVar) {
            try {
                bVar2.f165913g = true;
                C27252o oVar2 = bVar2.f165907a;
                C89219l.m154716b(oVar2, "");
                if (oVar2.f64413a) {
                    bVar2.f165907a.mo45341c();
                }
            } finally {
                MethodCollector.m26664o(7662);
            }
        }
        if (!this.f162683f && this.f162693p.f162722a) {
            mo113546a(this.f162693p.f162723b, this.f162693p.f162724c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: a */
    public final C65512a<SynthetiseResult> mo113545a(Object obj) {
        return mo113551b(obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: b */
    public final C65512a<SynthetiseResult> mo113551b(Object obj) {
        return m128034a((VideoPublishEditModel) obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: e */
    public final boolean mo113558e(Object obj) {
        return C70646dq.m124872a(obj);
    }

    /* renamed from: a */
    static AbstractFutureC27655q<? extends C69831ai> m128033a(LinkedHashMap<String, String> linkedHashMap) {
        return C63253l.f143623a.mo73316l().mo104772a().mo104630a(linkedHashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: b */
    public final void mo113553b(C73914o oVar) {
        C73852c cVar = this.f162682F;
        if (cVar != null && cVar.f165795n) {
            C84911q.m145921a("ConcurrentUploadCompiler resume");
            cVar.f165793l.f200423w.mo56388t();
            oVar.onParallelPublishResume();
            cVar.f165795n = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: d */
    public final long mo113557d(Object obj) {
        return new File(((VideoPublishEditModel) obj).mParallelUploadOutputFile).length();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: c */
    public final synchronized AbstractFutureC27655q<C65616g> mo113555c(final Object obj) {
        AbstractFutureC27655q<C65616g> qVar;
        MethodCollector.m26663i(7325);
        if (this.f162697t == null) {
            C84911q.m145921a("PublishDurationMonitor AuthKey Start");
            AbstractFutureC27655q<C65616g> a = this.f162701x.mo110066a();
            this.f162697t = a;
            C27646l.m55298a(a, new AbstractC27645k<C65616g>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a.C72572a.C725753 */

                static {
                    Covode.recordClassIndex(85258);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                    C84911q.m145921a("PublishDurationMonitor AuthKey End failed");
                    C72572a.this.mo114889a(false, false);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(C65616g gVar) {
                    C65616g gVar2 = gVar;
                    C84911q.m145921a("PublishDurationMonitor AuthKey End success");
                    if (C72572a.this.f162683f) {
                        return;
                    }
                    if (C72572a.this.f162688k) {
                        C72572a.this.mo113546a(obj, gVar2);
                        return;
                    }
                    C72579a aVar = C72572a.this.f162693p;
                    Object obj = obj;
                    aVar.f162722a = true;
                    aVar.f162723b = obj;
                    aVar.f162724c = gVar2;
                }
            }, ExecutorC34605m.f81660a);
            C73909k kVar = new C73909k(this.f161078d, this.f162681E, this.f161079e, this.f162694q, (VideoPublishEditModel) obj, this.f162690m);
            this.f162680D = kVar;
            C27646l.m55298a(this.f162697t, kVar, ExecutorC34605m.f81660a);
            this.f162677A.mo116294a(new C72581c(this));
        }
        qVar = this.f162697t;
        MethodCollector.m26664o(7325);
        return qVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|24|22|3|2) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7321);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000a */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x000a A[LOOP:0: B:2:0x000a->B:22:0x000a, LOOP_START, SYNTHETIC, Splitter:B:2:0x000a] */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113548a(androidx.core.p033d.C0646a r4) {
        /*
            r3 = this;
            r2 = 7321(0x1c99, float:1.0259E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            r3.f162700w = r4
            com.ss.android.ugc.aweme.shortvideo.upload.a r1 = r3.f162677A
            monitor-enter(r4)
        L_0x000a:
            boolean r0 = r4.f2646c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0012
            r4.wait()     // Catch:{ InterruptedException -> 0x000a }
            goto L_0x000a
        L_0x0012:
            androidx.core.d.a$a r0 = r4.f2645b
            if (r0 != r1) goto L_0x0018
            monitor-exit(r4)
            goto L_0x0026
        L_0x0018:
            r4.f2645b = r1
            boolean r0 = r4.f2644a
            if (r0 == 0) goto L_0x0020
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            monitor-exit(r4)
            goto L_0x0026
        L_0x0022:
            monitor-exit(r4)
            r1.mo2678a()
        L_0x0026:
            com.ss.android.ugc.aweme.shortvideo.upload.a r1 = r3.f162677A
            com.ss.android.ugc.aweme.shortvideo.publish.a.b r0 = new com.ss.android.ugc.aweme.shortvideo.publish.a.b
            r0.<init>(r3)
            r1.mo116294a(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a.C72572a.mo113548a(androidx.core.d.a):void");
    }

    /* renamed from: a */
    private C65512a<SynthetiseResult> m128034a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        AbstractC81494g gVar;
        boolean z2;
        C73852c cVar;
        AbstractC73856a eVar;
        int i;
        this.f162703z = new C73913n();
        this.f162694q = C88278m.m153410b(videoPublishEditModel);
        this.f162703z.f165941a = C27252o.m54253a();
        String str = this.f162686i;
        boolean z3 = true;
        if (this.f162679C != 0) {
            z = true;
        } else {
            z = false;
        }
        C65618a aVar = new C65618a(videoPublishEditModel, str, z);
        this.f162678B = aVar;
        if (aVar.f147922b) {
            aVar.f147921a = C27252o.m54255b(C80540hn.f180153b);
        }
        VEWatermarkParam vEWatermarkParam = null;
        if (videoPublishEditModel.isSaveLocalWithWaterMark()) {
            int[] c = C88257f.m153370c(videoPublishEditModel);
            C88278m.m153402a(videoPublishEditModel, new Integer[]{Integer.valueOf(c[0]), Integer.valueOf(c[1])});
            int[] iArr = {videoPublishEditModel.mWatermarkVideoWidth, videoPublishEditModel.mWatermarkVideoHeight};
            int saveType = ((AVUploadSaveModel) Objects.requireNonNull(videoPublishEditModel.getSaveModel())).getSaveType();
            boolean a = C65507b.m117236a(saveType);
            gVar = C63244g.m114602a().mo73288p().mo125205a().mo125214a(saveType, videoPublishEditModel.getLocalTempPath(), C74424f.m130882a(videoPublishEditModel), C63238c.f143594u.mo93906e(), iArr, videoPublishEditModel.getLocalTempPath(), a);
            if (a && gVar != null && (i = iArr[1] - iArr[0]) > 0) {
                gVar.mo125212a(gVar.mo125211a() + (i / 2));
            }
        } else {
            gVar = null;
        }
        try {
            this.f162684g = new C69807af(videoPublishEditModel.mParallelUploadOutputFile, this.f161078d);
            C63238c.m114595e();
            C73852c cVar2 = new C73852c(this.f162684g, this.f162677A, this.f161078d, this.f161079e, this.f162690m);
            this.f162682F = cVar2;
            if (gVar != null) {
                vEWatermarkParam = gVar.mo125213b();
            }
            C73867a aVar2 = new C73867a();
            if (videoPublishEditModel.getSaveModel() == null || !videoPublishEditModel.getSaveModel().isSaveWithCaption()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!aVar2.mo116330c() || vEWatermarkParam == null || C74424f.m130882a(videoPublishEditModel)) {
                cVar = cVar2;
                StringBuilder append = new StringBuilder("ConcurrentUploadCompiler not hit ending watermark ab,isSaveWithCapiton enable: ").append(z2).append(" has caption ").append(videoPublishEditModel.hasSubtitle()).append(" watermarkParam is null ");
                if (vEWatermarkParam != null) {
                    z3 = false;
                }
                C84911q.m145928d(append.append(z3).toString());
                if (!z2 || vEWatermarkParam == null || !videoPublishEditModel.hasSubtitle()) {
                    cVar.f165794m = new C65512a<SynthetiseResult>("ConcurrentUploadCompiler", videoPublishEditModel, vEWatermarkParam) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.upload.C73852c.C738531 */

                        /* renamed from: b */
                        final /* synthetic */ VideoPublishEditModel f165797b;

                        /* renamed from: c */
                        final /* synthetic */ VEWatermarkParam f165798c;

                        static {
                            Covode.recordClassIndex(86599);
                        }

                        /* renamed from: a */
                        public static boolean m129927a(File file) {
                            MethodCollector.m26663i(10967);
                            try {
                                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                                }
                                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                                    MethodCollector.m26664o(10967);
                                    return false;
                                }
                            } catch (Throwable unused) {
                            }
                            boolean delete = file.delete();
                            MethodCollector.m26664o(10967);
                            return delete;
                        }

                        {
                            final C88303z zVar;
                            this.f165797b = r15;
                            this.f165798c = r16;
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                C1731i b = C1731i.m5640b(new CallableC73894d(this, r15), ExecutorC34605m.f81660a);
                                try {
                                    b.mo5547f();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                if (b.mo5544c()) {
                                    C84911q.m145923a("ConcurrentUploadCompiler", b.mo5546e());
                                }
                                zVar = (C88303z) b.mo5545d();
                                if (zVar == null) {
                                    C63244g.m114602a().mo73287o().mo104789i().mo104813a("publish create VEEditor failed", b.mo5546e());
                                }
                            } else {
                                zVar = C88257f.m153366a(r15, C73852c.this);
                            }
                            C73852c.this.f165793l = zVar;
                            final SynthetiseResult synthetiseResult = new SynthetiseResult();
                            synthetiseResult.draftHardEncode = this.f165797b.mHardEncode;
                            synthetiseResult.outputFile = this.f165797b.getOutputFile();
                            synthetiseResult.needRecode = C88257f.m153371d(this.f165797b);
                            int i = 1;
                            synthetiseResult.flags |= 1;
                            synthetiseResult.isEnableFpsSet = C65367bg.m117063a();
                            synthetiseResult.editPreviewInfo = this.f165797b.getPreviewInfo();
                            synthetiseResult.isFastImport = this.f165797b.isFastImport;
                            synthetiseResult.isFastImportForLog = C71817eu.m126805p(this.f165797b);
                            synthetiseResult.isTTStory = this.f165797b.isStoryEditMode;
                            synthetiseResult.segmentCount = this.f165797b.segmentCounts();
                            synthetiseResult.hasSubtitle = this.f165797b.hasSubtitle();
                            if (synthetiseResult.isFastImport) {
                                C70504v.C70505a.m124385a(this.f165797b.getPreviewInfo().getVideoList(), zVar.f200423w);
                            }
                            C71073b.m125567a(zVar.f200423w, this.f165797b.getMainBusinessContext());
                            zVar.f200423w.mo56342c(C73852c.this.f165786e);
                            if (C73852c.this.f165787f == null) {
                                C73852c.this.f165787f = new C73900e(this, synthetiseResult, zVar);
                            }
                            zVar.f200423w.mo56310a(C73852c.this.f165787f);
                            if (C73852c.this.f165788g == null) {
                                C73852c.this.f165788g = new AbstractC85541q() {
                                    /* class com.p2082ss.android.ugc.aweme.shortvideo.upload.C73852c.C738531.C738541 */

                                    /* renamed from: a */
                                    final AtomicInteger f165800a = new AtomicInteger(0);

                                    static {
                                        Covode.recordClassIndex(86600);
                                    }

                                    @Override // com.p2082ss.android.vesdk.AbstractC85541q
                                    public final void onCallback(int i, int i2, float f, String str) {
                                        int i3;
                                        String str2;
                                        String str3;
                                        if (C738531.this.f165798c == null) {
                                            i3 = 0;
                                        } else {
                                            i3 = 1;
                                        }
                                        if (i == 4103) {
                                            C84911q.m145928d("TE_INFO_COMPILE_DONE ext:" + i2 + " videoExt:" + i3 + " isDone():" + C738531.this.isDone());
                                        } else if (i == 4118) {
                                            String str4 = "TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:" + i2 + " videoExt:" + i3;
                                            C84911q.m145926b(str4);
                                            C34611o.m70668a("aweme_synthesis_compile_log_vesdk", new C69840ar().mo110189a("log", str4).mo110191a());
                                        }
                                        if (C738531.this.isDone()) {
                                            return;
                                        }
                                        if (i == 4103) {
                                            if (i2 == 0) {
                                                synthetiseResult.videoLength = f;
                                            }
                                            if (C738531.this.f165798c == null || this.f165800a.incrementAndGet() == 2) {
                                                synthetiseResult.outputVideoFileInfo = C88168aj.m153238b(C738531.this.f165797b.mOutputFile);
                                                try {
                                                    if (!C68750p.f153786a) {
                                                        new C88136h().mo142639a(C738531.this.f165797b);
                                                    }
                                                    if (C738531.this.f165797b.isSaveLocalWithoutWaterMark()) {
                                                        C80720e.m139938e(C70638dj.f158108k);
                                                        C80720e.m139932c(synthetiseResult.outputFile, C738531.this.f165797b.getLocalTempPath());
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                                if (C738531.this.mo46227b(synthetiseResult)) {
                                                    C1731i.m5640b(new CallableC73902g(zVar), C1731i.f5562a);
                                                }
                                            }
                                        } else if (i == 4105) {
                                            if (i2 == i3) {
                                                C738531.this.mo104628a((int) (f * 100.0f));
                                            }
                                        } else if (i == 4112) {
                                            synthetiseResult.synthetiseCPUEncode = i2 ^ 1;
                                            StringBuilder sb = new StringBuilder("SynthesisMode NotSkip: ");
                                            if (i2 == 1) {
                                                str3 = "Hw";
                                            } else {
                                                str3 = "Sw";
                                            }
                                            C84911q.m145921a(sb.append(str3).toString());
                                        } else if (i == 4113) {
                                            synthetiseResult.audioLength = f;
                                        } else if (i == 4114) {
                                            C1731i.m5640b(new CallableC73903h(this, i, i2, f), C1731i.f5564c);
                                        } else if (i == 4116) {
                                            if (C65370bj.m117066a()) {
                                                if (C738531.this.f165797b.metadataMap == null) {
                                                    C738531.this.f165797b.metadataMap = C30652a.m63003a();
                                                } else {
                                                    C738531.this.f165797b.metadataMap.putAll(C30652a.m63003a());
                                                }
                                            }
                                            C51423a.m95787a("receive prepare done event in vecomplier");
                                        } else if (i == 4130) {
                                            synthetiseResult.unableRemuxCode = i2;
                                            StringBuilder sb2 = new StringBuilder("SynthesisMode IsSkipReEncode: ");
                                            if (i2 == 0) {
                                                str2 = "true";
                                            } else {
                                                str2 = "false";
                                            }
                                            C84911q.m145921a(sb2.append(str2).toString());
                                        }
                                    }
                                };
                            }
                            zVar.f200423w.mo56344c(C73852c.this.f165788g);
                            C73852c.this.f165785d.mo116294a(new C73901f(this, synthetiseResult, this.f165797b, zVar, this.f165798c));
                            zVar.f200423w.mo56308a(new VEListener.AbstractC85251t() {
                                /* class com.p2082ss.android.ugc.aweme.shortvideo.upload.C73852c.C738531.C738552 */

                                static {
                                    Covode.recordClassIndex(86601);
                                }

                                @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85251t
                                /* renamed from: a */
                                public final void mo116308a(byte[] bArr, int i, int i2, boolean z) {
                                    if (C73852c.this.f165783b != null) {
                                        try {
                                            C73852c.this.f165783b.mo110156a(bArr, i, i2, z);
                                        } catch (Exception e) {
                                            SynthetiseResult clone = synthetiseResult.clone();
                                            long min = Math.min(C80720e.m139940f(), 2147483647L);
                                            if (C68743i.m121176a()) {
                                                C12290b.m22060a("parallel_upload_write_data_error_left_space", (int) min, new C69840ar().mo110189a("error_info", e.getCause().getMessage()).mo110191a());
                                            }
                                            if (C65630a.m117452a(e)) {
                                                clone.ret = 100101;
                                            } else {
                                                clone.ret = 1001;
                                            }
                                            if (C738531.this.mo46226a((Throwable) new C71798ef(e, clone))) {
                                                zVar.f200423w.mo56387s();
                                            }
                                        }
                                    }
                                }
                            });
                            try {
                                C0004a.m2a(EnumC0044d.TT_CONCURRENT_UPLOAD_COMPILE, 10000);
                                C73852c.this.f165789h = C88278m.m153398a(this.f165797b, synthetiseResult, this.f165798c, zVar.f200423w, C73852c.this.f165790i);
                                C84911q.m145921a("PublishDurationMonitor SynthetiseStart " + C73852c.this.f165789h.toString());
                                zVar.f200423w.mo56288a("te_is_fast_import", String.valueOf(!C71817eu.m126805p(this.f165797b) ? 0 : i));
                                if (this.f165797b.isMultiVideoEdit() && !TextUtils.isEmpty(this.f165797b.multiEditVideoRecordData.videoMetaData)) {
                                    zVar.f200423w.mo56288a("description", this.f165797b.multiEditVideoRecordData.videoMetaData);
                                }
                                C43213k.m86181a("mVEEditor.compile source.getOutputFile() : " + this.f165797b.getOutputFile());
                                zVar.f200423w.mo56315a(this.f165797b.getOutputFile(), C73852c.this.f165789h);
                            } catch (Throwable th) {
                                mo46226a(th);
                                C84911q.m145926b("CompileFailed " + th.getMessage());
                            }
                        }
                    };
                } else {
                    C73892j jVar = new C73892j(videoPublishEditModel, aVar2, vEWatermarkParam, cVar, cVar.f165786e, cVar.f165784c, cVar.f165785d, cVar.f165783b, cVar.f165790i);
                    cVar.f165793l = jVar.mo116322j();
                    cVar.f165794m = jVar;
                }
            } else {
                C84911q.m145928d("ConcurrentUploadCompiler hit ending watermark ab,isSaveWithCapiton enable: " + z2 + " has caption " + videoPublishEditModel.hasSubtitle());
                if (!z2 || !videoPublishEditModel.hasSubtitle()) {
                    cVar = cVar2;
                    eVar = new C73876e(videoPublishEditModel, aVar2, vEWatermarkParam, cVar, cVar.f165786e, cVar.f165784c, cVar.f165785d, cVar.f165783b, cVar.f165790i);
                } else {
                    cVar = cVar2;
                    eVar = new C73884h(videoPublishEditModel, aVar2, vEWatermarkParam, cVar2, cVar2.f165786e, cVar2.f165784c, cVar2.f165785d, cVar2.f165783b, cVar2.f165790i);
                }
                cVar.f165793l = eVar.mo116322j();
                cVar.f165794m = eVar;
            }
            boolean isMvThemeVideoType = videoPublishEditModel.isMvThemeVideoType();
            C73923w wVar = new C73923w(cVar.f165790i, cVar.f165791j, videoPublishEditModel, cVar.f165792k, cVar.f165784c);
            if (isMvThemeVideoType && videoPublishEditModel.uploadMiscInfoStruct != null) {
                wVar.f165963a = videoPublishEditModel.uploadMiscInfoStruct.mvThemeId;
            }
            C65512a<SynthetiseResult> aVar3 = cVar.f165794m;
            C89219l.m154721d(aVar3, "");
            C63244g.m114602a();
            cVar.f165794m = aVar3;
            C27646l.m55298a(cVar.f165794m, wVar, C1731i.f5564c);
            C27646l.m55298a(cVar.f165794m, new C71797ee(), C1731i.f5564c);
            C27646l.m55298a(cVar.f165794m, new C65620b(cVar.f165784c), C1731i.f5564c);
            this.f162696s = cVar.f165794m;
            C73896b bVar = this.f162690m;
            if (bVar.mo116341a().f64413a) {
                C73896b.m129982a("repeat startSynthetic");
            } else {
                bVar.mo116341a().mo45340b();
                bVar.f165908b = System.currentTimeMillis();
            }
            C27646l.m55298a(this.f162696s, new AbstractC27645k<SynthetiseResult>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a.C72572a.C725742 */

                static {
                    Covode.recordClassIndex(85257);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                    boolean z;
                    C84911q.m145921a("ConcurrentUploadCompiler onFailure");
                    C72572a aVar = C72572a.this;
                    C89219l.m154721d(th, "");
                    int b = C65630a.m117453b(th);
                    if (b == -66666 || b == -6666601) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo114889a(false, z);
                    C72572a.this.f162690m.mo116342a(C65630a.m117453b(th));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                    C72572a.this.f162690m.mo116342a(0);
                    C72572a.this.f162690m.f165911e = C72572a.this.f162684g.mo110160d();
                    C72572a.this.f162690m.f165912f = C72572a.this.f162684g.mo110161e() - C72572a.this.f162684g.mo110160d();
                }
            }, ExecutorC34605m.f81660a);
            mo113555c(videoPublishEditModel);
            return this.f162696s;
        } catch (Exception unused) {
            return new C65512a<SynthetiseResult>(videoPublishEditModel) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a.C72572a.C725731 */

                /* renamed from: b */
                final /* synthetic */ VideoPublishEditModel f162704b;

                static {
                    Covode.recordClassIndex(85256);
                }

                {
                    this.f162704b = r5;
                    mo46226a((Throwable) new C71798ef("unable to mkdir " + r5.mParallelUploadOutputFile, new SynthetiseResult()));
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: a */
    public final void mo113549a(C73914o oVar) {
        C73852c cVar = this.f162682F;
        if (cVar != null && cVar.f165794m != null && !cVar.f165794m.isDone() && !cVar.f165795n) {
            cVar.f165795n = true;
            C84911q.m145921a("ConcurrentUploadCompiler pause");
            cVar.f165793l.f200423w.mo56391v();
            oVar.onParallelPublishPause();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractFutureC27655q<? extends C69831ai> mo114888a(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        C84911q.m145921a("PublishDurationMonitor CreateAweme start");
        AbstractFutureC27655q<C69831ai> a = C73979bb.m130113a(C27646l.m55294a(m128033a(linkedHashMap), IOException.class, new C72586h(this, linkedHashMap), C27659u.EnumC27662a.INSTANCE));
        C27646l.m55298a(a, new C65619a(this.f162703z, this.f161078d, this.f161079e, this.f162694q, videoPublishEditModel), C27659u.EnumC27662a.INSTANCE);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0337  */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a<com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g> mo113546a(java.lang.Object r41, com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g r42) {
        /*
        // Method dump skipped, instructions count: 836
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a.C72572a.mo113546a(java.lang.Object, com.ss.android.ugc.aweme.publish.f.g):com.ss.android.ugc.aweme.publish.b.a.a");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j
    /* renamed from: a */
    public final AbstractFutureC27655q<? extends C69831ai> mo113544a(Object obj, C65616g gVar, SynthetiseResult synthetiseResult) {
        AbstractRunnableC27634d.C27635a aVar;
        AbstractExecutorServiceC27657s bVar;
        AbstractExecutorServiceC27657s sVar;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (C16048b.m29633a().mo25421a(true, "studio_build_create_aweme_fields_async", false)) {
            ExecutorService executorService = C1731i.f5562a;
            if (executorService instanceof AbstractExecutorServiceC27657s) {
                sVar = (AbstractExecutorServiceC27657s) executorService;
            } else {
                if (executorService instanceof ScheduledExecutorService) {
                    bVar = new C27659u.C27664c((ScheduledExecutorService) executorService);
                } else {
                    bVar = new C27659u.C27663b(executorService);
                }
                sVar = bVar;
            }
            AbstractFutureC27655q a = sVar.mo46246a(new CallableC72584f(videoPublishEditModel, gVar, synthetiseResult));
            C72585g gVar2 = new C72585g(this, videoPublishEditModel);
            ExecutorService executorService2 = C1731i.f5562a;
            C27245k.m54229a(executorService2);
            AbstractRunnableC27634d.C27635a aVar2 = new AbstractRunnableC27634d.C27635a(a, gVar2);
            a.mo5481a(aVar2, C27659u.m55306a(executorService2, aVar2));
            aVar = aVar2;
        } else {
            aVar = mo114888a(videoPublishEditModel, new C73938ac(videoPublishEditModel, gVar, synthetiseResult).mo116385a());
        }
        return C27646l.m55294a(aVar, C34485a.class, new C69767ab(new C72583e(this, obj, gVar, synthetiseResult)), ExecutorC34605m.f81660a);
    }

    public C72572a(TTUploaderService tTUploaderService, String str, int i, int i2, int i3, Object obj) {
        super(i2, i3);
        this.f162695r = obj;
        this.f162701x = tTUploaderService;
        this.f162686i = str;
        this.f162679C = i;
        this.f162689l = C63244g.m114602a().mo73277e().getPreUploadEncryptionMode(0);
        this.f161075a = i2;
        this.f161076b = i3;
        this.f162690m = new C73896b();
        this.f162693p = new C72579a((byte) 0);
        this.f162692o = C16048b.m29633a().mo25421a(true, "enable_only_report_key_upload_log", false);
    }
}
