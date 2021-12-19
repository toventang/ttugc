package com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c;

import android.os.Looper;
import android.text.TextUtils;
import androidx.core.p033d.C0646a;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ttve.editorInfo.C30652a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65367bg;
import com.p2082ss.android.ugc.aweme.property.C65370bj;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65665i;
import com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.settings.C68750p;
import com.p2082ss.android.ugc.aweme.shortvideo.C69807af;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70504v;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73835a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73872d;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.C73878f;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.p3883a.C73867a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import dmt.p4542av.p4543a.C88136h;
import dmt.p4542av.video.C88168aj;
import dmt.p4542av.video.C88257f;
import dmt.p4542av.video.C88303z;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a */
public abstract class AbstractC73856a extends C65512a<SynthetiseResult> {

    /* renamed from: t */
    public static final C73857a f165807t = new C73857a((byte) 0);

    /* renamed from: b */
    public volatile EnumC73871c f165808b = EnumC73871c.BiChannelSynthesis;

    /* renamed from: c */
    protected AbstractC85541q f165809c;

    /* renamed from: i */
    protected AbstractC85541q f165810i;

    /* renamed from: j */
    public VEVideoEncodeSettings f165811j;

    /* renamed from: k */
    protected C88303z f165812k;

    /* renamed from: l */
    public final VideoPublishEditModel f165813l;

    /* renamed from: m */
    public final C73867a f165814m;

    /* renamed from: n */
    public final VEWatermarkParam f165815n;

    /* renamed from: o */
    public final AbstractC1204m f165816o;

    /* renamed from: p */
    public final List<String> f165817p;

    /* renamed from: q */
    public final C73835a f165818q;

    /* renamed from: r */
    public final AbstractC73910l f165819r;

    /* renamed from: s */
    public final String f165820s;

    /* renamed from: u */
    private final int f165821u;

    static {
        Covode.recordClassIndex(86602);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract VEVideoEncodeSettings mo116310a(AbstractC31071f fVar, SynthetiseResult synthetiseResult);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo116311a(SynthetiseResult synthetiseResult);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo116320h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo116321i() {
        return "ParallelWithEndWatermark";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$a */
    public static final class C73857a {
        static {
            Covode.recordClassIndex(86603);
        }

        private C73857a() {
        }

        public /* synthetic */ C73857a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$b */
    public abstract class AbstractC73858b implements AbstractC85541q {

        /* renamed from: a */
        public AtomicInteger f165822a = new AtomicInteger(0);

        /* renamed from: b */
        public final AbstractC31071f f165823b;

        /* renamed from: c */
        public final SynthetiseResult f165824c;

        /* renamed from: d */
        final /* synthetic */ AbstractC73856a f165825d;

        /* renamed from: e */
        private final int f165826e;

        static {
            Covode.recordClassIndex(86604);
        }

        /* renamed from: a */
        public abstract void mo116324a(AbstractC31071f fVar, SynthetiseResult synthetiseResult);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo116325b();

        /* renamed from: a */
        public int mo116323a() {
            return this.f165826e;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$b$a */
        static final class CallableC73859a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ AbstractC73858b f165827a;

            /* renamed from: b */
            final /* synthetic */ int f165828b;

            /* renamed from: c */
            final /* synthetic */ int f165829c;

            /* renamed from: d */
            final /* synthetic */ float f165830d;

            static {
                Covode.recordClassIndex(86605);
            }

            CallableC73859a(AbstractC73858b bVar, int i, int i2, float f) {
                this.f165827a = bVar;
                this.f165828b = i;
                this.f165829c = i2;
                this.f165830d = f;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f165827a.f165825d.f165817p.add("type:" + this.f165828b + " ext:" + this.f165829c + " f:" + this.f165830d);
                return null;
            }
        }

        public AbstractC73858b(AbstractC73856a aVar, AbstractC31071f fVar, SynthetiseResult synthetiseResult) {
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(synthetiseResult, "");
            this.f165825d = aVar;
            this.f165823b = fVar;
            this.f165824c = synthetiseResult;
            int i = 0;
            this.f165826e = aVar.f165815n != null ? 1 : i;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public void onCallback(int i, int i2, float f, String str) {
            String str2;
            String str3;
            if (this.f165825d.f165808b == EnumC73871c.BiChannelSynthesis) {
                if (i == 4103) {
                    C84911q.m145928d("TE_INFO_COMPILE_DONE ext:" + i2 + " videoExt:" + mo116323a() + " isDone():" + this.f165825d.isDone());
                } else if (i == 4118) {
                    String str4 = "TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:" + i2 + " videoExt:" + mo116323a();
                    C84911q.m145926b(str4);
                    C34611o.m70668a("aweme_synthesis_compile_log_vesdk", new C69840ar().mo110189a("log", str4).mo110191a());
                }
                if (this.f165825d.isDone()) {
                    return;
                }
                if (i == 4103) {
                    if (i2 == 0) {
                        this.f165824c.videoLength = f;
                    }
                    if (mo116325b()) {
                        this.f165824c.outputVideoFileInfo = C88168aj.m153238b(this.f165825d.f165813l.mOutputFile);
                        try {
                            if (!C68750p.f153786a) {
                                new C88136h().mo142639a(this.f165825d.f165813l);
                            }
                            if (this.f165825d.f165813l.isSaveLocalWithoutWaterMark()) {
                                C80720e.m139938e(C70638dj.f158108k);
                                C80720e.m139932c(this.f165824c.outputFile, this.f165825d.f165813l.getLocalTempPath());
                            }
                        } catch (Throwable unused) {
                        }
                        C84911q.m145928d("ParallelWithEndWatermark onCallback: onCompileDone outputFile " + this.f165824c.outputFile + " watermarkFile " + this.f165825d.f165815n.extFile);
                        this.f165823b.mo56308a((VEListener.AbstractC85251t) null);
                        this.f165823b.mo56349d(this.f165825d.mo116318f());
                        this.f165823b.mo56333b(this.f165825d.mo116317e());
                        this.f165823b.mo56387s();
                        mo116324a(this.f165823b, this.f165824c);
                    }
                } else if (i == 4105) {
                    if (i2 == mo116323a()) {
                        this.f165825d.mo116314b(C89241a.m154730a(f * 100.0f));
                    }
                } else if (i == 4112) {
                    this.f165824c.synthetiseCPUEncode = i2 ^ 1;
                    StringBuilder sb = new StringBuilder("SynthesisMode NotSkip: ");
                    if (i2 == 1) {
                        str3 = "Hw";
                    } else {
                        str3 = "Sw";
                    }
                    C84911q.m145921a(sb.append(str3).toString());
                } else if (i == 4113) {
                    this.f165824c.audioLength = f;
                } else if (i == 4114) {
                    C1731i.m5640b(new CallableC73859a(this, i, i2, f), C1731i.f5564c);
                } else if (i == 4116) {
                    if (C65370bj.m117066a()) {
                        if (this.f165825d.f165813l.metadataMap == null) {
                            this.f165825d.f165813l.metadataMap = C30652a.m63003a();
                        } else {
                            Map<String, Object> map = this.f165825d.f165813l.metadataMap;
                            Map<String, Object> a = C30652a.m63003a();
                            C89219l.m154716b(a, "");
                            map.putAll(a);
                        }
                    }
                    C51423a.m95787a("receive prepare done event in vecomplier");
                } else if (i == 4130) {
                    this.f165824c.unableRemuxCode = i2;
                    StringBuilder sb2 = new StringBuilder("SynthesisMode IsSkipReEncode: ");
                    if (i2 == 0) {
                        str2 = "true";
                    } else {
                        str2 = "false";
                    }
                    C84911q.m145921a(sb2.append(str2).toString());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$f */
    static final class CallableC73863f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC73856a f165840a;

        static {
            Covode.recordClassIndex(86609);
        }

        CallableC73863f(AbstractC73856a aVar) {
            this.f165840a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return C88257f.m153366a(this.f165840a.f165813l, this.f165840a.f165816o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final AbstractC85541q mo116317e() {
        AbstractC85541q qVar = this.f165809c;
        if (qVar == null) {
            C89219l.m154710a("mErrorCallback");
        }
        return qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final AbstractC85541q mo116318f() {
        AbstractC85541q qVar = this.f165810i;
        if (qVar == null) {
            C89219l.m154710a("mInfoCallback");
        }
        return qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C88303z mo116319g() {
        C88303z zVar = this.f165812k;
        if (zVar == null) {
            C89219l.m154710a("mVEVideoPublishEditPresenter");
        }
        return zVar;
    }

    /* renamed from: j */
    public final C88303z mo116322j() {
        C88303z zVar = this.f165812k;
        if (zVar == null) {
            C89219l.m154710a("mVEVideoPublishEditPresenter");
        }
        return zVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$g */
    static final class C73864g implements C0646a.AbstractC0647a {

        /* renamed from: a */
        final /* synthetic */ AbstractC88412b f165841a;

        static {
            Covode.recordClassIndex(86610);
        }

        C73864g(AbstractC88412b bVar) {
            this.f165841a = bVar;
        }

        @Override // androidx.core.p033d.C0646a.AbstractC0647a
        /* renamed from: a */
        public final void mo2678a() {
            AbstractC88412b bVar = this.f165841a;
            C89219l.m154716b(bVar, "");
            if (!bVar.isDisposed()) {
                this.f165841a.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$d */
    static final class C73861d implements C0646a.AbstractC0647a {

        /* renamed from: a */
        final /* synthetic */ AbstractC73856a f165834a;

        /* renamed from: b */
        final /* synthetic */ SynthetiseResult f165835b;

        /* renamed from: c */
        final /* synthetic */ C88303z f165836c;

        static {
            Covode.recordClassIndex(86607);
        }

        C73861d(AbstractC73856a aVar, SynthetiseResult synthetiseResult, C88303z zVar) {
            this.f165834a = aVar;
            this.f165835b = synthetiseResult;
            this.f165836c = zVar;
        }

        @Override // androidx.core.p033d.C0646a.AbstractC0647a
        /* renamed from: a */
        public final void mo2678a() {
            String str;
            int i;
            SynthetiseResult clone = this.f165835b.clone();
            C89219l.m154716b(clone, "");
            clone.ret = -66666;
            if (!(this.f165834a.f165819r instanceof C69807af) || ((C69807af) this.f165834a.f165819r).f156001o != -1) {
                str = "VECompiler canceled";
            } else {
                str = "VECompiler stuck; " + this.f165834a.f165811j;
                EditPreviewInfo previewInfo = this.f165834a.f165813l.getPreviewInfo();
                if (previewInfo != null) {
                    i = previewInfo.getVideoList().size();
                } else {
                    i = 0;
                }
                String a = C1764a.m5929a(Locale.US, "-6666601 videoSize:%d isRecordToEditFrameOptimizeAB:%b", Arrays.copyOf(new Object[]{Integer.valueOf(i), true}, 2));
                C89219l.m154716b(a, "");
                C84911q.m145926b(a);
                C40971f.m82489a(a);
                clone.ret = -6666601;
            }
            if (this.f165834a.mo46226a((Throwable) new C71798ef(str, clone))) {
                C84911q.m145921a("ParallelWithEndWatermark cancelUpload");
                AbstractC73910l lVar = this.f165834a.f165819r;
                if (lVar != null) {
                    lVar.mo110157b();
                }
                this.f165836c.f200423w.mo56387s();
            }
            if (this.f165835b.outputFile != null) {
                File file = new File(this.f165835b.outputFile);
                if (file.exists()) {
                    m129948a(file);
                    C43213k.m86181a("incompleteFile delete incompleteFile : ".concat(String.valueOf(file)));
                }
                File file2 = new File(this.f165834a.f165815n.extFile);
                if (file2.exists()) {
                    m129948a(file2);
                    C43213k.m86181a("incompleteWatermarkFile delete incompleteWatermarkFile : ".concat(String.valueOf(file2)));
                }
            }
        }

        /* renamed from: a */
        private static boolean m129948a(File file) {
            MethodCollector.m26663i(8230);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(8230);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(8230);
            return delete;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo116316b(AbstractC85541q qVar) {
        C89219l.m154721d(qVar, "");
        this.f165810i = qVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$i */
    static final class C73866i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC73856a f165843a;

        static {
            Covode.recordClassIndex(86612);
        }

        C73866i(AbstractC73856a aVar) {
            this.f165843a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                this.f165843a.mo46226a(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo116312a(EnumC73871c cVar) {
        C89219l.m154721d(cVar, "");
        this.f165808b = cVar;
    }

    /* renamed from: b */
    public final void mo116314b(int i) {
        mo104628a(mo116309a(this.f165808b, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo116313a(AbstractC85541q qVar) {
        C89219l.m154721d(qVar, "");
        this.f165809c = qVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$h */
    static final class C73865h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC73856a f165842a;

        static {
            Covode.recordClassIndex(86611);
        }

        C73865h(AbstractC73856a aVar) {
            this.f165842a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC73872d dVar = (AbstractC73872d) obj;
            if (dVar != null) {
                if (dVar instanceof AbstractC73872d.C73873a) {
                    this.f165842a.mo116314b(((AbstractC73872d.C73873a) dVar).f165850a);
                } else if (dVar instanceof AbstractC73872d.C73875c) {
                    this.f165842a.mo46227b((Object) ((AbstractC73872d.C73875c) dVar).f165852a);
                } else if (dVar instanceof AbstractC73872d.C73874b) {
                    this.f165842a.mo116312a(((AbstractC73872d.C73874b) dVar).f165851a);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m129930a(Exception exc) {
        String str;
        String str2;
        long min = Math.min(C80720e.m139940f(), 2147483647L);
        if (C68743i.m121176a()) {
            int i = (int) min;
            C69840ar arVar = new C69840ar();
            Throwable cause = exc.getCause();
            if (cause == null || (str2 = cause.getMessage()) == null) {
                str2 = "empty message";
            }
            C12290b.m22060a("parallel_upload_write_data_error_left_space", i, arVar.mo110189a("error_info", str2).mo110191a());
        }
        if (!(exc.getCause() instanceof IOException)) {
            return false;
        }
        Throwable cause2 = exc.getCause();
        if (cause2 != null) {
            str = cause2.getMessage();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "write failed: ENOSPC (No space left on device)") || min < 100) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo116315b(SynthetiseResult synthetiseResult) {
        int i;
        VESize watermarkVideoRes;
        VESize watermarkVideoRes2;
        C89219l.m154721d(synthetiseResult, "");
        this.f165808b = EnumC73871c.EndingWatermarkSynthesis;
        C84911q.m145922a("ParallelWithEndWatermark", "bi-channel(watermark & origin video) synthesis finished.");
        List b = C89070n.m154522b(Integer.valueOf(this.f165813l.sourceVideoWidth()), Integer.valueOf(this.f165813l.sourceVideoHeight()));
        Integer[] numArr = new Integer[2];
        VEVideoEncodeSettings vEVideoEncodeSettings = this.f165811j;
        int i2 = -1;
        if (vEVideoEncodeSettings == null || (watermarkVideoRes2 = vEVideoEncodeSettings.getWatermarkVideoRes()) == null) {
            i = -1;
        } else {
            i = watermarkVideoRes2.width;
        }
        numArr[0] = Integer.valueOf(i);
        VEVideoEncodeSettings vEVideoEncodeSettings2 = this.f165811j;
        if (!(vEVideoEncodeSettings2 == null || (watermarkVideoRes = vEVideoEncodeSettings2.getWatermarkVideoRes()) == null)) {
            i2 = watermarkVideoRes.height;
        }
        numArr[1] = Integer.valueOf(i2);
        List b2 = C89070n.m154522b(numArr);
        List<Integer> a = m129929a(b, b2);
        String outputFile = this.f165813l.getOutputFile();
        C89219l.m154716b(outputFile, "");
        String draftDir = this.f165813l.draftDir();
        C89219l.m154716b(draftDir, "");
        String localTempPath = this.f165813l.getLocalTempPath();
        C89219l.m154716b(localTempPath, "");
        C73883g gVar = new C73883g(a, b2, outputFile, draftDir, localTempPath);
        VEVideoEncodeSettings vEVideoEncodeSettings3 = this.f165811j;
        C73867a aVar = this.f165814m;
        String str = this.f165815n.extFile;
        C89219l.m154716b(str, "");
        C73878f fVar = new C73878f(gVar, synthetiseResult, vEVideoEncodeSettings3, aVar, str);
        fVar.f165856b = System.currentTimeMillis();
        C88958b a2 = C88958b.m154214a(new AbstractC73872d.C73873a(0));
        C89219l.m154716b(a2, "");
        fVar.f165855a = a2;
        SynthetiseResult synthetiseResult2 = fVar.f165858d;
        VEVideoEncodeSettings vEVideoEncodeSettings4 = fVar.f165859e;
        if (vEVideoEncodeSettings4 == null) {
            fVar.mo116332a(-100, synthetiseResult2, null);
        } else {
            AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
            if (e == null) {
                fVar.mo116332a(-101, synthetiseResult2, null);
            } else {
                C63244g.m114602a().mo73288p().mo125206a(fVar.f165857c.f165873b, fVar.f165857c.f165874c.toString(), e, new C73878f.C73881c(fVar, vEVideoEncodeSettings4, synthetiseResult2), new C73878f.C73882d(fVar, synthetiseResult2));
            }
        }
        AbstractC88969g<AbstractC73872d> gVar2 = fVar.f165855a;
        if (gVar2 == null) {
            C89219l.m154710a("mSubject");
        }
        this.f165818q.mo116294a(new C73864g(gVar2.mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C73865h(this), new C73866i(this))));
    }

    /* renamed from: a */
    protected static List<Integer> m129929a(List<Integer> list, List<Integer> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        if (list.get(0).intValue() > list.get(1).intValue()) {
            return C89070n.m154522b(list2.get(0), Integer.valueOf((int) ((list2.get(0).floatValue() * 1.0f) / ((list.get(0).floatValue() * 1.0f) / list.get(1).floatValue()))));
        }
        return C89070n.m154522b(list2.get(0), Integer.valueOf(Math.min((int) ((list2.get(0).floatValue() * 1.0f) / ((list.get(0).floatValue() * 1.0f) / list.get(1).floatValue())), list2.get(1).intValue())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo116309a(EnumC73871c cVar, int i) {
        C89219l.m154721d(cVar, "");
        int i2 = C73870b.f165848a[cVar.ordinal()];
        if (i2 == 1) {
            return Math.min(80, C89241a.m154730a(((float) (i * 80)) / 100.0f));
        }
        if (i2 != 2) {
            return Math.min(100, C89241a.m154730a((((float) (i * 5)) / 100.0f) + 95.0f));
        }
        return Math.min(95, C89241a.m154730a((((float) (i * 15)) / 100.0f) + 80.0f));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$e */
    static final class C73862e implements VEListener.AbstractC85251t {

        /* renamed from: a */
        final /* synthetic */ AbstractC73856a f165837a;

        /* renamed from: b */
        final /* synthetic */ SynthetiseResult f165838b;

        /* renamed from: c */
        final /* synthetic */ C88303z f165839c;

        static {
            Covode.recordClassIndex(86608);
        }

        C73862e(AbstractC73856a aVar, SynthetiseResult synthetiseResult, C88303z zVar) {
            this.f165837a = aVar;
            this.f165838b = synthetiseResult;
            this.f165839c = zVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85251t
        /* renamed from: a */
        public final void mo116308a(byte[] bArr, int i, int i2, boolean z) {
            try {
                AbstractC73910l lVar = this.f165837a.f165819r;
                if (lVar != null) {
                    lVar.mo110156a(bArr, i, i2, z);
                }
            } catch (Exception e) {
                SynthetiseResult clone = this.f165838b.clone();
                C89219l.m154716b(clone, "");
                if (AbstractC73856a.m129930a(e)) {
                    clone.ret = 100101;
                } else {
                    clone.ret = 1001;
                }
                if (this.f165837a.mo46226a((Throwable) new C71798ef(e, clone))) {
                    this.f165839c.f200423w.mo56387s();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a$c */
    static final class C73860c implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ AbstractC73856a f165831a;

        /* renamed from: b */
        final /* synthetic */ SynthetiseResult f165832b;

        /* renamed from: c */
        final /* synthetic */ C88303z f165833c;

        static {
            Covode.recordClassIndex(86606);
        }

        C73860c(AbstractC73856a aVar, SynthetiseResult synthetiseResult, C88303z zVar) {
            this.f165831a = aVar;
            this.f165832b = synthetiseResult;
            this.f165833c = zVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            C89219l.m154721d(str, "");
            if (this.f165831a.f165808b == EnumC73871c.BiChannelSynthesis) {
                SynthetiseResult clone = this.f165832b.clone();
                C89219l.m154716b(clone, "");
                clone.ret = C89241a.m154730a(f);
                if (this.f165831a.mo46226a((Throwable) new C71798ef("VECompiler failed. type = " + i + " ext = " + i2 + " f = " + f + " msg = " + str, clone))) {
                    if (i2 == -214) {
                        C65357b.f147489a = true;
                    }
                    this.f165833c.f200423w.mo56387s();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC73856a(VideoPublishEditModel videoPublishEditModel, C73867a aVar, VEWatermarkParam vEWatermarkParam, AbstractC1204m mVar, int i, List<String> list, C73835a aVar2, AbstractC73910l lVar, String str) {
        super("ParallelWithEndWatermark");
        C88303z zVar;
        String str2;
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(vEWatermarkParam, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(str, "");
        this.f165813l = videoPublishEditModel;
        this.f165814m = aVar;
        this.f165815n = vEWatermarkParam;
        this.f165816o = mVar;
        this.f165821u = i;
        this.f165817p = list;
        this.f165818q = aVar2;
        this.f165819r = lVar;
        this.f165820s = str;
        mo116320h();
        if (!C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            C1731i b = C1731i.m5640b(new CallableC73863f(this), ExecutorC34605m.f81660a);
            C89219l.m154716b(b, "");
            try {
                b.mo5547f();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (b.mo5544c()) {
                C84911q.m145923a("ParallelWithEndWatermark", b.mo5546e());
            }
            if (b.mo5545d() == null) {
                AbstractC65665i i2 = C63244g.m114602a().mo73287o().mo104789i();
                Exception e2 = b.mo5546e();
                C89219l.m154716b(e2, "");
                i2.mo104813a("publish create VEEditor failed", e2);
            }
            Object d = b.mo5545d();
            C89219l.m154716b(d, "");
            zVar = (C88303z) d;
        } else {
            zVar = C88257f.m153366a(videoPublishEditModel, mVar);
        }
        this.f165812k = zVar;
        SynthetiseResult synthetiseResult = new SynthetiseResult();
        synthetiseResult.draftHardEncode = this.f165813l.mHardEncode;
        synthetiseResult.outputFile = this.f165813l.getOutputFile().toString();
        synthetiseResult.needRecode = C88257f.m153371d(this.f165813l);
        synthetiseResult.flags |= 1;
        synthetiseResult.isEnableFpsSet = C65367bg.m117063a();
        synthetiseResult.editPreviewInfo = this.f165813l.getPreviewInfo();
        synthetiseResult.isFastImport = this.f165813l.isFastImport;
        synthetiseResult.isFastImportForLog = C71817eu.m126805p(this.f165813l);
        synthetiseResult.segmentCount = this.f165813l.segmentCounts();
        if (synthetiseResult.isFastImport) {
            List<EditVideoSegment> videoList = this.f165813l.getPreviewInfo().getVideoList();
            AbstractC31071f fVar = zVar.f200423w;
            C89219l.m154716b(fVar, "");
            C70504v.C70505a.m124385a(videoList, fVar);
        }
        C71073b.m125567a(zVar.f200423w, this.f165813l.getMainBusinessContext());
        zVar.f200423w.mo56342c(this.f165821u);
        this.f165809c = new C73860c(this, synthetiseResult, zVar);
        AbstractC31071f fVar2 = zVar.f200423w;
        AbstractC85541q qVar = this.f165809c;
        if (qVar == null) {
            C89219l.m154710a("mErrorCallback");
        }
        fVar2.mo56310a(qVar);
        mo116311a(synthetiseResult);
        AbstractC31071f fVar3 = zVar.f200423w;
        AbstractC85541q qVar2 = this.f165810i;
        if (qVar2 == null) {
            C89219l.m154710a("mInfoCallback");
        }
        fVar3.mo56344c(qVar2);
        this.f165818q.mo116294a(new C73861d(this, synthetiseResult, zVar));
        zVar.f200423w.mo56308a(new C73862e(this, synthetiseResult, zVar));
        try {
            AbstractC31071f fVar4 = zVar.f200423w;
            C89219l.m154716b(fVar4, "");
            this.f165811j = mo116310a(fVar4, synthetiseResult);
            C84911q.m145921a("PublishDurationMonitor SynthetiseStart " + String.valueOf(this.f165811j));
            AbstractC31071f fVar5 = zVar.f200423w;
            if (C71817eu.m126805p(this.f165813l)) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            fVar5.mo56288a("te_is_fast_import", str2);
            if (this.f165813l.isMultiVideoEdit() && !TextUtils.isEmpty(this.f165813l.multiEditVideoRecordData.videoMetaData)) {
                AbstractC31071f fVar6 = zVar.f200423w;
                String str3 = this.f165813l.multiEditVideoRecordData.videoMetaData;
                C89219l.m154716b(str3, "");
                fVar6.mo56288a("description", str3);
            }
            C43213k.m86181a("mVEEditor.compile mModel.getOutputFile() : " + this.f165813l.getOutputFile());
            AbstractC31071f fVar7 = zVar.f200423w;
            String str4 = this.f165813l.getOutputFile().toString();
            VEVideoEncodeSettings vEVideoEncodeSettings = this.f165811j;
            if (vEVideoEncodeSettings == null) {
                C89219l.m154715b();
            }
            fVar7.mo56315a(str4, vEVideoEncodeSettings);
        } catch (Throwable th) {
            mo46226a(th);
            C84911q.m145926b("CompileFailed " + th.getMessage());
        }
    }
}
