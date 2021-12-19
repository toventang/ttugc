package com.p2082ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;
import com.p2082ss.android.ugc.aweme.property.C65447ec;
import com.p2082ss.android.ugc.aweme.property.C65501x;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71521v;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV2;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.gamora.editor.C82041c;
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
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.gamora.editor.d */
public final class C82130d extends C82041c {

    /* renamed from: d */
    public final String f183762d = "HardcodeAdaptive";

    /* renamed from: e */
    public CompileProbeConfigV2 f183763e;

    static {
        Covode.recordClassIndex(95958);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$a */
    static final class C82131a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82130d f183764a;

        static {
            Covode.recordClassIndex(95959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82131a(C82130d dVar) {
            super(0);
            this.f183764a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo127350a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127350a() {
            Long l;
            Long l2;
            Integer num;
            Integer num2;
            this.f183764a.f183763e = C65501x.m117229a();
            StringBuilder append = new StringBuilder().append(this.f183764a.f183762d).append(" -> compileProbeConfigV2.endPointMs = ");
            CompileProbeConfigV2 compileProbeConfigV2 = this.f183764a.f183763e;
            String str = null;
            if (compileProbeConfigV2 != null) {
                l = Long.valueOf(compileProbeConfigV2.getEndPointMs());
            } else {
                l = null;
            }
            StringBuilder append2 = append.append(l).append("; compileProbeConfigV2.startPointMs = ");
            CompileProbeConfigV2 compileProbeConfigV22 = this.f183764a.f183763e;
            if (compileProbeConfigV22 != null) {
                l2 = Long.valueOf(compileProbeConfigV22.getStartPointMs());
            } else {
                l2 = null;
            }
            StringBuilder append3 = append2.append(l2).append(';').append("compileProbeConfigV2.bitrateStrategy = ");
            CompileProbeConfigV2 compileProbeConfigV23 = this.f183764a.f183763e;
            if (compileProbeConfigV23 != null) {
                num = Integer.valueOf(compileProbeConfigV23.getBitrateStrategy());
            } else {
                num = null;
            }
            StringBuilder append4 = append3.append(num).append("; compileProbeConfigV2.probeType = ");
            CompileProbeConfigV2 compileProbeConfigV24 = this.f183764a.f183763e;
            if (compileProbeConfigV24 != null) {
                num2 = Integer.valueOf(compileProbeConfigV24.getProbeType());
            } else {
                num2 = null;
            }
            StringBuilder append5 = append4.append(num2).append(';').append("compileProbeConfigV2.bitrateRange = ");
            CompileProbeConfigV2 compileProbeConfigV25 = this.f183764a.f183763e;
            if (compileProbeConfigV25 != null) {
                str = compileProbeConfigV25.getBitrateRange();
            }
            C84911q.m145921a(append5.append(str).toString());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$c */
    static final class C82136c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82130d f183773a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f183774b;

        /* renamed from: c */
        final /* synthetic */ C82132b f183775c;

        static {
            Covode.recordClassIndex(95964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82136c(C82130d dVar, C89233z.C89238e eVar, C82132b bVar) {
            super(0);
            this.f183773a = dVar;
            this.f183774b = eVar;
            this.f183775c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo127354a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127354a() {
            C82041c.C82042a.m142087a("Start", true);
            this.f183774b.element = (T) this.f183775c.invoke().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.C82130d.C82136c.C821371 */

                /* renamed from: a */
                final /* synthetic */ C82136c f183776a;

                static {
                    Covode.recordClassIndex(95965);
                }

                {
                    this.f183776a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
                    C82041c.C82057d dVar = this.f183776a.f183773a.f183607b;
                    if (dVar != null) {
                        C89219l.m154716b(compileProbeResult, "");
                        dVar.mo127291a(compileProbeResult);
                    }
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.C82130d.C82136c.C821382 */

                /* renamed from: a */
                final /* synthetic */ C82136c f183777a;

                static {
                    Covode.recordClassIndex(95966);
                }

                {
                    this.f183777a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th instanceof C82041c.C82043b) {
                        C82041c.C82057d dVar = this.f183777a.f183773a.f183607b;
                        if (dVar != null) {
                            dVar.mo127292a(((C82041c.C82043b) th).getFailed());
                            return;
                        }
                        return;
                    }
                    C82041c.C82057d dVar2 = this.f183777a.f183773a.f183607b;
                    if (dVar2 != null) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "FailedNoMessage";
                        }
                        dVar2.mo127292a(new C82041c.AbstractC82044c.AbstractC82046b.AbstractC82050b.C82053c(message));
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$d */
    static final class C82139d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f183778a;

        static {
            Covode.recordClassIndex(95967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82139d(C89233z.C89238e eVar) {
            super(0);
            this.f183778a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo127355a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127355a() {
            MethodCollector.m26663i(11997);
            C82041c.C82042a.m142087a("ManualCancel", true);
            T t = this.f183778a.element;
            if (t != null) {
                t.dispose();
            }
            TEVideoUtils.nativeCancelCompileProbe();
            MethodCollector.m26664o(11997);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$f */
    static final class C82141f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82130d f183780a;

        /* renamed from: b */
        final /* synthetic */ C82136c f183781b;

        /* renamed from: c */
        final /* synthetic */ C82139d f183782c;

        /* renamed from: d */
        final /* synthetic */ C82140e f183783d;

        static {
            Covode.recordClassIndex(95969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82141f(C82130d dVar, C82136c cVar, C82139d dVar2, C82140e eVar) {
            super(0);
            this.f183780a = dVar;
            this.f183781b = cVar;
            this.f183782c = dVar2;
            this.f183783d = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo127357a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127357a() {
            if (this.f183780a.f183607b == null) {
                this.f183780a.f183607b = new C82041c.C82057d(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.C82130d.C82141f.C821421 */

                    /* renamed from: a */
                    final /* synthetic */ C82141f f183784a;

                    static {
                        Covode.recordClassIndex(95970);
                    }

                    {
                        this.f183784a = r7;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f183784a.f183781b.mo127354a();
                        return C89391z.f203057a;
                    }
                }, new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.C82130d.C82141f.C821432 */

                    /* renamed from: a */
                    final /* synthetic */ C82141f f183785a;

                    static {
                        Covode.recordClassIndex(95971);
                    }

                    {
                        this.f183785a = r7;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f183785a.f183782c.mo127355a();
                        return C89391z.f203057a;
                    }
                }, new AbstractC89172b<CompileProbeResult, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.C82130d.C82141f.C821443 */

                    /* renamed from: a */
                    final /* synthetic */ C82141f f183786a;

                    static {
                        Covode.recordClassIndex(95972);
                    }

                    {
                        this.f183786a = r7;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(CompileProbeResult compileProbeResult) {
                        CompileProbeResult compileProbeResult2 = compileProbeResult;
                        C89219l.m154721d(compileProbeResult2, "");
                        this.f183786a.f183783d.mo127356a(compileProbeResult2);
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.d$b */
    public static final class C82132b extends AbstractC89220m implements AbstractC89171a<AbstractC88403ab<CompileProbeResult>> {

        /* renamed from: a */
        final /* synthetic */ C82130d f183765a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f183766b;

        static {
            Covode.recordClassIndex(95960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82132b(C82130d dVar, VideoPublishEditModel videoPublishEditModel) {
            super(0);
            this.f183765a = dVar;
            this.f183766b = videoPublishEditModel;
        }

        /* renamed from: a */
        public final AbstractC88403ab<CompileProbeResult> invoke() {
            final C89233z.C89237d dVar = new C89233z.C89237d();
            dVar.element = 0;
            final C821331 r1 = new AbstractC89171a<Integer>() {
                /* class com.p2082ss.android.ugc.gamora.editor.C82130d.C82132b.C821331 */

                static {
                    Covode.recordClassIndex(95961);
                }

                /* renamed from: a */
                public final int mo127352a() {
                    return (int) (System.currentTimeMillis() - dVar.element);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ Integer invoke() {
                    return Integer.valueOf(mo127352a());
                }
            };
            AbstractC88403ab<CompileProbeResult> a = AbstractC88403ab.m153596a((AbstractC88407af) new AbstractC88407af(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.C82130d.C82132b.C821342 */

                /* renamed from: a */
                final /* synthetic */ C82132b f183768a;

                static {
                    Covode.recordClassIndex(95962);
                }

                {
                    this.f183768a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88407af
                public final void subscribe(AbstractC88405ad<CompileProbeResult> adVar) {
                    List<EditVideoSegment> videoList;
                    EditVideoSegment editVideoSegment;
                    String videoPath;
                    MethodCollector.m26663i(12137);
                    String str = "";
                    C89219l.m154721d(adVar, str);
                    TEVideoUtils.nativeCancelCompileProbe();
                    dVar.element = System.currentTimeMillis();
                    EditPreviewInfo previewInfo = this.f183768a.f183766b.getPreviewInfo();
                    if (!(previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = videoList.get(0)) == null || (videoPath = editVideoSegment.getVideoPath()) == null)) {
                        str = videoPath;
                    }
                    String b = C71521v.C71522a.m126404b();
                    CompileProbeConfigV2 compileProbeConfigV2 = this.f183768a.f183765a.f183763e;
                    if (compileProbeConfigV2 == null) {
                        C89219l.m154715b();
                    }
                    long startPointMs = compileProbeConfigV2.getStartPointMs();
                    CompileProbeConfigV2 compileProbeConfigV22 = this.f183768a.f183765a.f183763e;
                    if (compileProbeConfigV22 == null) {
                        C89219l.m154715b();
                    }
                    long endPointMs = compileProbeConfigV22.getEndPointMs();
                    String a = C65447ec.m117166a();
                    CompileProbeConfigV2 compileProbeConfigV23 = this.f183768a.f183765a.f183763e;
                    if (compileProbeConfigV23 == null) {
                        C89219l.m154715b();
                    }
                    int probeType = compileProbeConfigV23.getProbeType();
                    CompileProbeConfigV2 compileProbeConfigV24 = this.f183768a.f183765a.f183763e;
                    if (compileProbeConfigV24 == null) {
                        C89219l.m154715b();
                    }
                    compileProbeConfigV24.getBitrateStrategy();
                    int a2 = C85581w.m147491a(str, b, startPointMs, endPointMs, a, probeType, new C82135a(this, adVar));
                    C84911q.m145921a(this.f183768a.f183765a.f183762d + " -> CompileProbeV2: compileProbe() method is called, checkResult = " + a2);
                    if (a2 != 0) {
                        adVar.mo142933b(new C82041c.C82043b(new C82041c.AbstractC82044c.AbstractC82046b.AbstractC82050b.C82051a(a2)));
                    }
                    MethodCollector.m26664o(12137);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.d$b$2$a */
                static final class C82135a implements VEListener.AbstractC85245n {

                    /* renamed from: a */
                    final /* synthetic */ C821342 f183771a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC88405ad f183772b;

                    static {
                        Covode.recordClassIndex(95963);
                    }

                    C82135a(C821342 r1, AbstractC88405ad adVar) {
                        this.f183771a = r1;
                        this.f183772b = adVar;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: f.a.ad */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARNING: Code restructure failed: missing block: B:29:0x022b, code lost:
                        if (com.p2082ss.android.ugc.aweme.property.C65346ap.m117032a() != false) goto L_0x0147;
                     */
                    /* JADX WARNING: Removed duplicated region for block: B:22:0x0168  */
                    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85245n
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo127353a(int r33, int r34, float r35, float r36, int r37, int r38, int r39, int r40, int r41, float r42, int r43, int r44, double r45) {
                        /*
                        // Method dump skipped, instructions count: 608
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82130d.C82132b.C821342.C82135a.mo127353a(int, int, float, float, int, int, int, int, int, float, int, int, double):void");
                    }
                }
            });
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$e */
    static final class C82140e extends AbstractC89220m implements AbstractC89172b<CompileProbeResult, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f183779a;

        static {
            Covode.recordClassIndex(95968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82140e(VideoPublishEditModel videoPublishEditModel) {
            super(1);
            this.f183779a = videoPublishEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(CompileProbeResult compileProbeResult) {
            mo127356a(compileProbeResult);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo127356a(CompileProbeResult compileProbeResult) {
            C89219l.m154721d(compileProbeResult, "");
            C82041c.C82042a.m142087a("onResult: ".concat(String.valueOf(compileProbeResult)), true);
            this.f183779a.compileProbeResult = compileProbeResult;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.C82041c
    /* renamed from: a */
    public final boolean mo127287a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        new C82131a(this).mo127350a();
        if (this.f183763e == null) {
            return false;
        }
        return C82041c.C82042a.m142088a(videoPublishEditModel);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.C82041c
    /* renamed from: b */
    public final void mo127288b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        new C82141f(this, new C82136c(this, eVar, new C82132b(this, videoPublishEditModel)), new C82139d(eVar), new C82140e(videoPublishEditModel)).mo127357a();
    }
}
