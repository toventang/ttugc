package com.p2082ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65447ec;
import com.p2082ss.android.ugc.aweme.property.C65500w;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70979br;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71521v;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.gamora.editor.c */
public class C82041c {

    /* renamed from: c */
    public static final C82042a f183605c = new C82042a((byte) 0);

    /* renamed from: a */
    public CompileProbeConfig f183606a;

    /* renamed from: b */
    public C82057d f183607b;

    /* renamed from: com.ss.android.ugc.gamora.editor.c$c */
    public static abstract class AbstractC82044c {

        /* renamed from: a */
        public static final C82045a f183609a = new C82045a((byte) 0);

        static {
            Covode.recordClassIndex(95868);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$a */
        public static final class C82045a {
            static {
                Covode.recordClassIndex(95869);
            }

            private C82045a() {
            }

            public /* synthetic */ C82045a(byte b) {
                this();
            }
        }

        private AbstractC82044c() {
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b */
        public static abstract class AbstractC82046b extends AbstractC82044c {

            /* renamed from: b */
            public final int f183610b;

            static {
                Covode.recordClassIndex(95870);
            }

            /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$a */
            public static abstract class AbstractC82047a extends AbstractC82046b {
                static {
                    Covode.recordClassIndex(95871);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$a$b */
                public static final class C82049b extends AbstractC82047a {

                    /* renamed from: c */
                    public static final C82049b f183611c = new C82049b();

                    private C82049b() {
                        super(-234, (byte) 0);
                    }

                    static {
                        Covode.recordClassIndex(95873);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$a$a */
                public static final class C82048a extends AbstractC82047a {
                    static {
                        Covode.recordClassIndex(95872);
                    }

                    public C82048a(int i) {
                        super(i, (byte) 0);
                    }
                }

                private AbstractC82047a(int i) {
                    super(i, (byte) 0);
                }

                public /* synthetic */ AbstractC82047a(int i, byte b) {
                    this(i);
                }
            }

            /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$b */
            public static abstract class AbstractC82050b extends AbstractC82046b {
                static {
                    Covode.recordClassIndex(95874);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$b$a */
                public static final class C82051a extends AbstractC82050b {
                    static {
                        Covode.recordClassIndex(95875);
                    }

                    public C82051a(int i) {
                        super(i, (byte) 0);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$b$b */
                public static final class C82052b extends AbstractC82050b {
                    static {
                        Covode.recordClassIndex(95876);
                    }

                    public C82052b(int i) {
                        super(i, (byte) 0);
                    }
                }

                private AbstractC82050b(int i) {
                    super(i, (byte) 0);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$b$c */
                public static final class C82053c extends AbstractC82050b {

                    /* renamed from: c */
                    public final String f183612c;

                    static {
                        Covode.recordClassIndex(95877);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C82053c(String str) {
                        super(-233, (byte) 0);
                        C89219l.m154721d(str, "");
                        this.f183612c = str;
                    }
                }

                public /* synthetic */ AbstractC82050b(int i, byte b) {
                    this(i);
                }
            }

            private AbstractC82046b(int i) {
                super((byte) 0);
                this.f183610b = i;
            }

            public /* synthetic */ AbstractC82046b(int i, byte b) {
                this(i);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$c */
        public static final class C82054c extends AbstractC82044c {

            /* renamed from: b */
            public static final C82054c f183613b = new C82054c();

            private C82054c() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(95878);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$d */
        public static final class C82055d extends AbstractC82044c {

            /* renamed from: b */
            public static final C82055d f183614b = new C82055d();

            private C82055d() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(95879);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$e */
        public static final class C82056e extends AbstractC82044c {

            /* renamed from: b */
            public static final C82056e f183615b = new C82056e();

            private C82056e() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(95880);
            }
        }

        public /* synthetic */ AbstractC82044c(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(95865);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c$a */
    public static final class C82042a {
        static {
            Covode.recordClassIndex(95866);
        }

        private C82042a() {
        }

        public /* synthetic */ C82042a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m142086a(String str) {
            C84911q.m145921a("CompileProbe + ".concat(String.valueOf(str)));
        }

        /* renamed from: a */
        public static boolean m142088a(VideoPublishEditModel videoPublishEditModel) {
            C89219l.m154721d(videoPublishEditModel, "");
            m142087a("isSingleSegmentVideo: " + videoPublishEditModel.mIsMultiVideo + ' ' + videoPublishEditModel.mFromCut + ' ' + videoPublishEditModel.mVideoSegmentsDesc, false);
            if (videoPublishEditModel.mIsMultiVideo) {
                return false;
            }
            if (videoPublishEditModel.mFromCut) {
                return true;
            }
            String str = videoPublishEditModel.mVideoSegmentsDesc;
            if (str == null || str.length() == 0 || CameraComponentModel.m123137a(videoPublishEditModel.mVideoSegmentsDesc).size() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static void m142087a(String str, boolean z) {
            C89219l.m154721d(str, "");
            if (z) {
                C84911q.m145921a("CompileProbe + ".concat(String.valueOf(str)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c$b */
    public static final class C82043b extends RuntimeException {

        /* renamed from: a */
        private final AbstractC82044c.AbstractC82046b f183608a;

        static {
            Covode.recordClassIndex(95867);
        }

        public final AbstractC82044c.AbstractC82046b getFailed() {
            return this.f183608a;
        }

        public C82043b(AbstractC82044c.AbstractC82046b bVar) {
            C89219l.m154721d(bVar, "");
            this.f183608a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c$e */
    static final class C82058e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82041c f183620a;

        static {
            Covode.recordClassIndex(95882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82058e(C82041c cVar) {
            super(0);
            this.f183620a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo127294a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127294a() {
            String a = C65500w.m117228a();
            if (a != null && a.length() != 0) {
                try {
                    this.f183620a.f183606a = (CompileProbeConfig) C63244g.m114602a().mo73261G().mo46670a(a, CompileProbeConfig.class);
                } catch (Exception unused) {
                    C82042a.m142086a("solveCompileProbeConfig failed: ".concat(String.valueOf(a)));
                }
                C82042a.m142087a("solveCompileProbeConfig config: " + this.f183620a.f183606a, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c$h */
    static final class C82064h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82041c f183630a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f183631b;

        /* renamed from: c */
        final /* synthetic */ C82060g f183632c;

        static {
            Covode.recordClassIndex(95888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82064h(C82041c cVar, C89233z.C89238e eVar, C82060g gVar) {
            super(0);
            this.f183630a = cVar;
            this.f183631b = eVar;
            this.f183632c = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo127299a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127299a() {
            C82042a.m142087a("Start", true);
            this.f183631b.element = (T) this.f183632c.invoke().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.C82041c.C82064h.C820651 */

                /* renamed from: a */
                final /* synthetic */ C82064h f183633a;

                static {
                    Covode.recordClassIndex(95889);
                }

                {
                    this.f183633a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
                    C82057d dVar = this.f183633a.f183630a.f183607b;
                    if (dVar != null) {
                        C89219l.m154716b(compileProbeResult, "");
                        dVar.mo127291a(compileProbeResult);
                    }
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.C82041c.C82064h.C820662 */

                /* renamed from: a */
                final /* synthetic */ C82064h f183634a;

                static {
                    Covode.recordClassIndex(95890);
                }

                {
                    this.f183634a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th instanceof C82043b) {
                        C82057d dVar = this.f183634a.f183630a.f183607b;
                        if (dVar != null) {
                            dVar.mo127292a(((C82043b) th).getFailed());
                            return;
                        }
                        return;
                    }
                    C82057d dVar2 = this.f183634a.f183630a.f183607b;
                    if (dVar2 != null) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "FailedNoMessage";
                        }
                        dVar2.mo127292a(new AbstractC82044c.AbstractC82046b.AbstractC82050b.C82053c(message));
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c$i */
    static final class C82067i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f183635a;

        static {
            Covode.recordClassIndex(95891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82067i(C89233z.C89238e eVar) {
            super(0);
            this.f183635a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo127300a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127300a() {
            MethodCollector.m26663i(12139);
            C82042a.m142087a("ManualCancel", true);
            T t = this.f183635a.element;
            if (t != null) {
                t.dispose();
            }
            TEVideoUtils.nativeCancelCompileProbe();
            MethodCollector.m26664o(12139);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c$k */
    static final class C82069k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82041c f183637a;

        /* renamed from: b */
        final /* synthetic */ C82064h f183638b;

        /* renamed from: c */
        final /* synthetic */ C82067i f183639c;

        /* renamed from: d */
        final /* synthetic */ C82068j f183640d;

        static {
            Covode.recordClassIndex(95893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82069k(C82041c cVar, C82064h hVar, C82067i iVar, C82068j jVar) {
            super(0);
            this.f183637a = cVar;
            this.f183638b = hVar;
            this.f183639c = iVar;
            this.f183640d = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo127302a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127302a() {
            if (this.f183637a.f183607b == null) {
                this.f183637a.f183607b = new C82057d(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.C82041c.C82069k.C820701 */

                    /* renamed from: a */
                    final /* synthetic */ C82069k f183641a;

                    static {
                        Covode.recordClassIndex(95894);
                    }

                    {
                        this.f183641a = r7;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f183641a.f183638b.mo127299a();
                        return C89391z.f203057a;
                    }
                }, new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.C82041c.C82069k.C820712 */

                    /* renamed from: a */
                    final /* synthetic */ C82069k f183642a;

                    static {
                        Covode.recordClassIndex(95895);
                    }

                    {
                        this.f183642a = r7;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f183642a.f183639c.mo127300a();
                        return C89391z.f203057a;
                    }
                }, new AbstractC89172b<CompileProbeResult, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.C82041c.C82069k.C820723 */

                    /* renamed from: a */
                    final /* synthetic */ C82069k f183643a;

                    static {
                        Covode.recordClassIndex(95896);
                    }

                    {
                        this.f183643a = r7;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(CompileProbeResult compileProbeResult) {
                        CompileProbeResult compileProbeResult2 = compileProbeResult;
                        C89219l.m154721d(compileProbeResult2, "");
                        this.f183643a.f183640d.mo127301a(compileProbeResult2);
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c$f */
    static final class C82059f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f183621a;

        static {
            Covode.recordClassIndex(95883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82059f(VideoPublishEditModel videoPublishEditModel) {
            super(0);
            this.f183621a = videoPublishEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(mo127295a());
        }

        /* renamed from: a */
        public final boolean mo127295a() {
            AbstractC70977bq a = C70979br.m125332a(this.f183621a);
            if (this.f183621a.videoWidth() + this.f183621a.videoHeight() == a.mo112111c() + a.mo112112d()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo127286a() {
        C82057d dVar = this.f183607b;
        if (dVar != null) {
            dVar.mo127290a();
        }
        C82057d dVar2 = this.f183607b;
        if (dVar2 != null) {
            dVar2.mo127293b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.c$g */
    public static final class C82060g extends AbstractC89220m implements AbstractC89171a<AbstractC88403ab<CompileProbeResult>> {

        /* renamed from: a */
        final /* synthetic */ C82041c f183622a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f183623b;

        static {
            Covode.recordClassIndex(95884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82060g(C82041c cVar, VideoPublishEditModel videoPublishEditModel) {
            super(0);
            this.f183622a = cVar;
            this.f183623b = videoPublishEditModel;
        }

        /* renamed from: a */
        public final AbstractC88403ab<CompileProbeResult> invoke() {
            final C89233z.C89237d dVar = new C89233z.C89237d();
            dVar.element = 0;
            final C820611 r1 = new AbstractC89171a<Integer>() {
                /* class com.p2082ss.android.ugc.gamora.editor.C82041c.C82060g.C820611 */

                static {
                    Covode.recordClassIndex(95885);
                }

                /* renamed from: a */
                public final int mo127297a() {
                    return (int) (System.currentTimeMillis() - dVar.element);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ Integer invoke() {
                    return Integer.valueOf(mo127297a());
                }
            };
            AbstractC88403ab<CompileProbeResult> a = AbstractC88403ab.m153596a((AbstractC88407af) new AbstractC88407af(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.C82041c.C82060g.C820622 */

                /* renamed from: a */
                final /* synthetic */ C82060g f183625a;

                static {
                    Covode.recordClassIndex(95886);
                }

                {
                    this.f183625a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88407af
                public final void subscribe(AbstractC88405ad<CompileProbeResult> adVar) {
                    List<EditVideoSegment> videoList;
                    EditVideoSegment editVideoSegment;
                    String videoPath;
                    MethodCollector.m26663i(12286);
                    String str = "";
                    C89219l.m154721d(adVar, str);
                    TEVideoUtils.nativeCancelCompileProbe();
                    AbstractC70977bq a = C70979br.m125332a(this.f183625a.f183623b);
                    dVar.element = System.currentTimeMillis();
                    EditPreviewInfo previewInfo = this.f183625a.f183623b.getPreviewInfo();
                    if (!(previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = videoList.get(0)) == null || (videoPath = editVideoSegment.getVideoPath()) == null)) {
                        str = videoPath;
                    }
                    String b = C71521v.C71522a.m126404b();
                    int c = a.mo112111c();
                    int d = a.mo112112d();
                    CompileProbeConfig compileProbeConfig = this.f183625a.f183622a.f183606a;
                    if (compileProbeConfig == null) {
                        C89219l.m154715b();
                    }
                    long startPointMs = compileProbeConfig.getStartPointMs();
                    CompileProbeConfig compileProbeConfig2 = this.f183625a.f183622a.f183606a;
                    if (compileProbeConfig2 == null) {
                        C89219l.m154715b();
                    }
                    int a2 = C85581w.m147490a(str, b, c, d, startPointMs, compileProbeConfig2.getEndPointMs(), C65447ec.m117166a(), new C82063a(this, adVar));
                    if (a2 != 0) {
                        adVar.mo142933b(new C82043b(new AbstractC82044c.AbstractC82046b.AbstractC82050b.C82051a(a2)));
                    }
                    MethodCollector.m26664o(12286);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$g$2$a */
                static final class C82063a implements VEListener.AbstractC85244m {

                    /* renamed from: a */
                    final /* synthetic */ C820622 f183628a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC88405ad f183629b;

                    static {
                        Covode.recordClassIndex(95887);
                    }

                    C82063a(C820622 r1, AbstractC88405ad adVar) {
                        this.f183628a = r1;
                        this.f183629b = adVar;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: f.a.ad */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85244m
                    /* renamed from: a */
                    public final void mo127298a(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, float f2, int i8, int i9, double d) {
                        if (i == -10000) {
                            this.f183629b.mo142933b(new C82043b(new AbstractC82044c.AbstractC82046b.AbstractC82047a.C82048a(i)));
                        } else if (i != 0) {
                            this.f183629b.mo142933b(new C82043b(new AbstractC82044c.AbstractC82046b.AbstractC82050b.C82052b(i)));
                        } else {
                            this.f183629b.mo142931a(new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.SUCCESS, i, 0, null, 12, null), new CompileProbeResult.ResultData(i2, f, i3, i4, i5, i6, i7, f2, i8, i9, d, r1.mo127297a(), 0.0f, null, 0, 28672, null)));
                        }
                    }
                }
            });
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c$d */
    public static final class C82057d {

        /* renamed from: a */
        public AbstractC82044c f183616a = AbstractC82044c.C82054c.f183613b;

        /* renamed from: b */
        public final AbstractC89171a<C89391z> f183617b;

        /* renamed from: c */
        private final AbstractC89171a<C89391z> f183618c;

        /* renamed from: d */
        private final AbstractC89172b<CompileProbeResult, C89391z> f183619d;

        static {
            Covode.recordClassIndex(95881);
        }

        /* renamed from: a */
        public final void mo127290a() {
            if (C89219l.m154714a(this.f183616a, AbstractC82044c.C82055d.f183614b)) {
                AbstractC82044c.AbstractC82046b.AbstractC82047a.C82049b bVar = AbstractC82044c.AbstractC82046b.AbstractC82047a.C82049b.f183611c;
                this.f183616a = bVar;
                this.f183618c.invoke();
                this.f183619d.invoke(new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.CANCEL, bVar.f183610b, bVar.f183610b, "OuterCancel"), null, 2, null));
            }
        }

        /* renamed from: b */
        public final void mo127293b() {
            AbstractC82044c cVar = this.f183616a;
            if (C89219l.m154714a(cVar, AbstractC82044c.C82054c.f183613b) || C89219l.m154714a(cVar, AbstractC82044c.C82056e.f183615b) || (cVar instanceof AbstractC82044c.AbstractC82046b)) {
                this.f183616a = AbstractC82044c.C82054c.f183613b;
            } else if (C89219l.m154714a(cVar, AbstractC82044c.C82055d.f183614b)) {
                C82042a.m142086a("clear on running");
            }
        }

        /* renamed from: a */
        public final void mo127291a(CompileProbeResult compileProbeResult) {
            C89219l.m154721d(compileProbeResult, "");
            if (C89219l.m154714a(this.f183616a, AbstractC82044c.C82055d.f183614b)) {
                this.f183616a = AbstractC82044c.C82056e.f183615b;
                this.f183619d.invoke(compileProbeResult);
                return;
            }
            C82042a.m142086a("Success on not running");
        }

        /* renamed from: a */
        public final void mo127292a(AbstractC82044c.AbstractC82046b bVar) {
            CompileProbeResult compileProbeResult;
            C89219l.m154721d(bVar, "");
            if (C89219l.m154714a(this.f183616a, AbstractC82044c.C82055d.f183614b)) {
                this.f183616a = bVar;
                AbstractC89172b<CompileProbeResult, C89391z> bVar2 = this.f183619d;
                if ((bVar instanceof AbstractC82044c.AbstractC82046b.AbstractC82050b.C82051a) || (bVar instanceof AbstractC82044c.AbstractC82046b.AbstractC82050b.C82052b)) {
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.ERROR, bVar.f183610b, 0, null, 12, null), null, 2, null);
                } else if (bVar instanceof AbstractC82044c.AbstractC82046b.AbstractC82050b.C82053c) {
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.ERROR, bVar.f183610b, bVar.f183610b, ((AbstractC82044c.AbstractC82046b.AbstractC82050b.C82053c) bVar).f183612c), null, 2, null);
                } else if (bVar instanceof AbstractC82044c.AbstractC82046b.AbstractC82047a.C82048a) {
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.CANCEL, bVar.f183610b, 0, null, 12, null), null, 2, null);
                } else if (C89219l.m154714a(bVar, AbstractC82044c.AbstractC82046b.AbstractC82047a.C82049b.f183611c)) {
                    C82042a.m142086a("OuterCancel on inner Failed");
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.CANCEL, bVar.f183610b, bVar.f183610b, "OuterCancel"), null, 2, null);
                } else {
                    throw new C89376n();
                }
                bVar2.invoke(compileProbeResult);
                return;
            }
            C82042a.m142086a("Failed on not running");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public C82057d(AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super CompileProbeResult, C89391z> bVar) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(bVar, "");
            this.f183617b = aVar;
            this.f183618c = aVar2;
            this.f183619d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c$j */
    static final class C82068j extends AbstractC89220m implements AbstractC89172b<CompileProbeResult, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f183636a;

        static {
            Covode.recordClassIndex(95892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82068j(VideoPublishEditModel videoPublishEditModel) {
            super(1);
            this.f183636a = videoPublishEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(CompileProbeResult compileProbeResult) {
            mo127301a(compileProbeResult);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127301a(CompileProbeResult compileProbeResult) {
            C89219l.m154721d(compileProbeResult, "");
            C82042a.m142087a("onResult: ".concat(String.valueOf(compileProbeResult)), true);
            this.f183636a.compileProbeResult = compileProbeResult;
        }
    }

    /* renamed from: a */
    public boolean mo127287a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C82058e eVar = new C82058e(this);
        C82059f fVar = new C82059f(videoPublishEditModel);
        eVar.mo127294a();
        if (this.f183606a != null && C82042a.m142088a(videoPublishEditModel) && fVar.mo127295a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo127288b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        new C82069k(this, new C82064h(this, eVar, new C82060g(this, videoPublishEditModel)), new C82067i(eVar), new C82068j(videoPublishEditModel)).mo127302a();
    }
}
