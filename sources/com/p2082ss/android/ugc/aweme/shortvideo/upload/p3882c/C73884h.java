package com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import androidx.core.p033d.C0646a;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.asve.editor.C31079j;
import com.p2082ss.android.ugc.aweme.photo.C62860d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73835a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.p3883a.C73867a;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.sticker.data.EnumC75306a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import dmt.p4542av.video.C88257f;
import dmt.p4542av.video.C88278m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89376n;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.h */
public class C73884h extends AbstractC73856a {

    /* renamed from: v */
    public static final C73885a f165877v = new C73885a((byte) 0);

    /* renamed from: u */
    public final List<Integer> f165878u = new ArrayList();

    static {
        Covode.recordClassIndex(86630);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a
    /* renamed from: i */
    public String mo116321i() {
        return "SerialPublishWithEndingWatermarkFuture";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.h$a */
    public static final class C73885a {
        static {
            Covode.recordClassIndex(86631);
        }

        private C73885a() {
        }

        public /* synthetic */ C73885a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.h$b */
    public final class C73886b extends AbstractC73856a.AbstractC73858b {

        /* renamed from: e */
        final /* synthetic */ C73884h f165879e;

        /* renamed from: f */
        private final boolean f165880f = true;

        /* renamed from: g */
        private final int f165881g;

        static {
            Covode.recordClassIndex(86632);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a.AbstractC73858b
        /* renamed from: a */
        public final int mo116323a() {
            return this.f165881g;
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a.AbstractC73858b
        /* renamed from: b */
        public final boolean mo116325b() {
            return this.f165880f;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a.AbstractC73858b
        /* renamed from: a */
        public final void mo116324a(AbstractC31071f fVar, SynthetiseResult synthetiseResult) {
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(synthetiseResult, "");
            this.f165879e.mo116337c(synthetiseResult);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73886b(C73884h hVar, AbstractC31071f fVar, SynthetiseResult synthetiseResult) {
            super(hVar, fVar, synthetiseResult);
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(synthetiseResult, "");
            this.f165879e = hVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a
    /* renamed from: h */
    public void mo116320h() {
        C80720e.m139931c(this.f165814m.mo116329b().getPath());
        this.f165815n.extFile = this.f165814m.mo116329b().getPath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.h$f */
    public static final class C73890f implements C0646a.AbstractC0647a {

        /* renamed from: a */
        final /* synthetic */ C73884h f165899a;

        /* renamed from: b */
        final /* synthetic */ C31060a f165900b;

        static {
            Covode.recordClassIndex(86636);
        }

        C73890f(C73884h hVar, C31060a aVar) {
            this.f165899a = hVar;
            this.f165900b = aVar;
        }

        @Override // androidx.core.p033d.C0646a.AbstractC0647a
        /* renamed from: a */
        public final void mo2678a() {
            C84911q.m145928d(this.f165899a.mo116321i() + " cancel compile video with captions and watermark");
            this.f165900b.mo56387s();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a
    /* renamed from: a */
    public void mo116311a(SynthetiseResult synthetiseResult) {
        C89219l.m154721d(synthetiseResult, "");
        AbstractC31071f fVar = mo116319g().f200423w;
        C89219l.m154716b(fVar, "");
        mo116316b((AbstractC85541q) new C73886b(this, fVar, synthetiseResult));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.h$c */
    public static final class C73887c implements VEListener.VEInfoStickerBufferListener {

        /* renamed from: a */
        final /* synthetic */ C73884h f165882a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f165883b;

        /* renamed from: c */
        final /* synthetic */ VideoPublishEditModel f165884c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f165885d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89236c f165886e;

        /* renamed from: f */
        final /* synthetic */ C89233z.C89236c f165887f;

        /* renamed from: g */
        final /* synthetic */ C89233z.C89236c f165888g;

        /* renamed from: h */
        final /* synthetic */ C89233z.C89236c f165889h;

        /* renamed from: i */
        final /* synthetic */ int f165890i = 720;

        /* renamed from: j */
        final /* synthetic */ int f165891j;

        /* renamed from: k */
        final /* synthetic */ AbstractC31071f f165892k;

        static {
            Covode.recordClassIndex(86633);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.VEInfoStickerBufferListener
        public final Bitmap onGetBuffer(int i) {
            String str;
            float measuredHeight;
            int i2;
            float measuredWidth;
            int i3;
            C75313h hVar;
            MethodCollector.m26663i(10643);
            Context context = (Context) this.f165883b.get();
            if (context != null) {
                List<C75313h> utterances = this.f165884c.captionStruct.getUtterances();
                if (utterances == null || (hVar = (C75313h) C89070n.m154561b((List) utterances, this.f165882a.f165878u.indexOf(Integer.valueOf(i)))) == null) {
                    str = null;
                } else {
                    str = hVar.getText();
                }
                if (TextUtils.isEmpty(str)) {
                    MethodCollector.m26664o(10643);
                    return null;
                }
                C89219l.m154716b(context, "");
                TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
                tuxTextView.setTuxFont(32);
                tuxTextView.setText(str);
                Application application = C63238c.f143574a;
                C89219l.m154716b(application, "");
                tuxTextView.setTextColor(application.getResources().getColor(R.color.l));
                int a = (int) C84912r.m145930a(context, 8.0f);
                tuxTextView.setPadding(a, a, a, a);
                tuxTextView.setBackground(context.getResources().getDrawable(R.drawable.du));
                tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(C83090d.f185670v, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                if (this.f165884c.captionStruct.getLocation() == EnumC75306a.LEFT_TOP.getValue()) {
                    measuredHeight = ((float) (this.f165885d.element + (tuxTextView.getMeasuredHeight() / 2))) * 1.0f;
                    i2 = this.f165886e.element;
                } else {
                    measuredHeight = ((float) ((this.f165886e.element - this.f165887f.element) - (tuxTextView.getMeasuredHeight() / 2))) * 1.0f;
                    i2 = this.f165886e.element;
                }
                float f = measuredHeight / ((float) i2);
                if (C80471gb.m139482a()) {
                    measuredWidth = ((float) ((this.f165888g.element - this.f165889h.element) - (tuxTextView.getMeasuredWidth() / 2))) * 1.0f;
                    i3 = this.f165888g.element;
                } else {
                    measuredWidth = ((float) (this.f165889h.element + (tuxTextView.getMeasuredWidth() / 2))) * 1.0f;
                    i3 = this.f165888g.element;
                }
                float f2 = measuredWidth / ((float) i3);
                float f3 = (((float) this.f165890i) * 1.0f) / ((float) this.f165888g.element);
                C84911q.m145928d(this.f165882a.mo116321i() + " getbuffer index " + i + " text " + str + " posX " + f2 + " posY " + f + ' ' + " width " + tuxTextView.getMeasuredWidth() + " height " + tuxTextView.getMeasuredHeight() + " videowidth " + this.f165890i + " videoHeight " + this.f165891j + " startmargin " + this.f165889h.element + " savedVideoWidth " + this.f165888g.element + " savedVideoHeight " + this.f165886e.element + " finalMargin " + ((((float) this.f165890i) * f2) - ((((float) tuxTextView.getMeasuredWidth()) * f3) / 2.0f)));
                this.f165892k.mo56254a(i, f2, f);
                Bitmap createBitmap = Bitmap.createBitmap(tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
                tuxTextView.draw(canvas);
                Bitmap a2 = C62860d.m113277a(createBitmap, (int) (((float) tuxTextView.getMeasuredWidth()) * f3), (int) (((float) tuxTextView.getMeasuredHeight()) * f3));
                MethodCollector.m26664o(10643);
                return a2;
            }
            MethodCollector.m26664o(10643);
            return null;
        }

        C73887c(C73884h hVar, WeakReference weakReference, VideoPublishEditModel videoPublishEditModel, C89233z.C89236c cVar, C89233z.C89236c cVar2, C89233z.C89236c cVar3, C89233z.C89236c cVar4, C89233z.C89236c cVar5, int i, AbstractC31071f fVar) {
            this.f165882a = hVar;
            this.f165883b = weakReference;
            this.f165884c = videoPublishEditModel;
            this.f165885d = cVar;
            this.f165886e = cVar2;
            this.f165887f = cVar3;
            this.f165888g = cVar4;
            this.f165889h = cVar5;
            this.f165891j = i;
            this.f165892k = fVar;
        }
    }

    /* renamed from: c */
    public final void mo116337c(SynthetiseResult synthetiseResult) {
        int i;
        int addInfoStickerWithBuffer;
        VESize watermarkVideoRes;
        VESize watermarkVideoRes2;
        mo116312a(EnumC73871c.CaptionSynthesis);
        C84911q.m145928d(mo116321i() + " startAddCaptionsAndWaterMark");
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
        C31060a aVar = new C31060a(new C73883g(a, b2, outputFile, draftDir, localTempPath).f165875d);
        this.f165815n.needExtFile = false;
        C31079j jVar = new C31079j(new String[]{synthetiseResult.outputFile});
        jVar.mo56409a(C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
        jVar.f74439a = new int[]{0};
        jVar.f74440b = new int[]{(int) synthetiseResult.videoLength};
        jVar.f74441c = null;
        aVar.mo56274a(jVar);
        this.f165811j = C88278m.m153398a(this.f165813l, synthetiseResult, this.f165815n, aVar, this.f165820s);
        List<InteractStickerStruct> a2 = C71073b.m125565a(this.f165813l.getMainBusinessContext(), 11, EnumC71088d.TRACK_PAGE_EDIT);
        if (a2 != null && a2.size() > 0) {
            this.f165813l.captionStruct = a2.get(0).getCaptionStruct();
        }
        if (this.f165813l.captionStruct != null) {
            C75309d dVar = this.f165813l.captionStruct;
            if (dVar == null) {
                C89219l.m154715b();
            }
            List<C75313h> utterances = dVar.getUtterances();
            if (utterances == null) {
                utterances = C89086z.INSTANCE;
            }
            for (C75313h hVar : utterances) {
                C85581w E = aVar.mo56244E();
                if (E.f191835b == null) {
                    C85315al.m146642d("VEEditor", "addInfoStickerWithBuffer STICKER IS NOT SUPPORT !!!");
                    addInfoStickerWithBuffer = -901;
                } else {
                    addInfoStickerWithBuffer = E.f191835b.addInfoStickerWithBuffer();
                }
                this.f165878u.add(Integer.valueOf(addInfoStickerWithBuffer));
                aVar.mo56255a(addInfoStickerWithBuffer, (int) hVar.getStartTime(), (int) hVar.getEndTime());
            }
        }
        mo116316b((AbstractC85541q) new C73888d(this, aVar, synthetiseResult));
        mo116313a((AbstractC85541q) new C73889e(this, synthetiseResult, aVar));
        aVar.mo56344c(mo116318f());
        aVar.mo56310a(mo116317e());
        this.f165818q.mo116294a(new C73890f(this, aVar));
        String str = this.f165815n.extFile;
        VEVideoEncodeSettings vEVideoEncodeSettings3 = this.f165811j;
        if (vEVideoEncodeSettings3 == null) {
            C89219l.m154715b();
        }
        aVar.mo56315a(str, vEVideoEncodeSettings3);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a
    /* renamed from: a */
    public final VEVideoEncodeSettings mo116310a(AbstractC31071f fVar, SynthetiseResult synthetiseResult) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(synthetiseResult, "");
        return C88278m.m153398a(this.f165813l, synthetiseResult, (VEWatermarkParam) null, fVar, this.f165820s);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a
    /* renamed from: a */
    public int mo116309a(EnumC73871c cVar, int i) {
        C89219l.m154721d(cVar, "");
        int i2 = C73891i.f165901a[cVar.ordinal()];
        if (i2 == 1) {
            return Math.min(60, C89241a.m154730a(((float) (i * 60)) / 100.0f));
        }
        if (i2 == 2) {
            return Math.min(80, C89241a.m154730a((((float) (i * 20)) / 100.0f) + 60.0f));
        }
        if (i2 == 3) {
            return Math.min(95, C89241a.m154730a((((float) (i * 15)) / 100.0f) + 80.0f));
        }
        if (i2 == 4) {
            return Math.min(100, C89241a.m154730a((((float) (i * 5)) / 100.0f) + 95.0f));
        }
        throw new C89376n();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.h$d */
    public static final class C73888d implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ C73884h f165893a;

        /* renamed from: b */
        final /* synthetic */ C31060a f165894b;

        /* renamed from: c */
        final /* synthetic */ SynthetiseResult f165895c;

        static {
            Covode.recordClassIndex(86634);
        }

        C73888d(C73884h hVar, C31060a aVar, SynthetiseResult synthetiseResult) {
            this.f165893a = hVar;
            this.f165894b = aVar;
            this.f165895c = synthetiseResult;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            int i3;
            Integer videoWidth;
            if (i == 4116) {
                C84911q.m145928d("ParallelWithEndWatermark onCallback: serial compile watermark video prepared");
                C73884h hVar = this.f165893a;
                C31060a aVar = this.f165894b;
                Application application = C63238c.f143574a;
                C89219l.m154716b(application, "");
                VideoPublishEditModel videoPublishEditModel = this.f165893a.f165813l;
                C89219l.m154721d(aVar, "");
                C89219l.m154721d(application, "");
                C89219l.m154721d(videoPublishEditModel, "");
                WeakReference weakReference = new WeakReference(application);
                List<InteractStickerStruct> a = C71073b.m125565a(hVar.f165813l.getMainBusinessContext(), 11, EnumC71088d.TRACK_PAGE_EDIT);
                if (a != null && a.size() > 0) {
                    VideoPublishEditModel videoPublishEditModel2 = hVar.f165813l;
                    InteractStickerStruct interactStickerStruct = a.get(0);
                    C89219l.m154716b(interactStickerStruct, "");
                    videoPublishEditModel2.captionStruct = interactStickerStruct.getCaptionStruct();
                }
                int[] b = C88257f.m153369b(videoPublishEditModel);
                if (b[1] == 0 || b[0] == 0) {
                    i3 = 1280;
                } else {
                    i3 = (int) (((((float) b[1]) * 1.0f) / ((float) b[0])) * 720.0f);
                }
                float f2 = (((float) i3) * 1.0f) / 720.0f;
                C89233z.C89236c cVar = new C89233z.C89236c();
                cVar.element = C70636dh.m124831b(application);
                C89233z.C89236c cVar2 = new C89233z.C89236c();
                cVar2.element = (int) (((float) cVar.element) * f2);
                C89233z.C89236c cVar3 = new C89233z.C89236c();
                cVar3.element = C83090d.f185668t;
                C89233z.C89236c cVar4 = new C89233z.C89236c();
                cVar4.element = C83090d.f185667s;
                C89233z.C89236c cVar5 = new C89233z.C89236c();
                cVar5.element = C83090d.f185666r;
                C75309d dVar = hVar.f165813l.captionStruct;
                if (!(dVar == null || dVar.getVideoWidth() == null || ((videoWidth = dVar.getVideoWidth()) != null && videoWidth.intValue() == 0))) {
                    Integer marginStart = dVar.getMarginStart();
                    if (marginStart == null) {
                        C89219l.m154715b();
                    }
                    cVar3.element = marginStart.intValue();
                    Integer videoWidth2 = dVar.getVideoWidth();
                    if (videoWidth2 == null) {
                        C89219l.m154715b();
                    }
                    cVar.element = videoWidth2.intValue();
                    cVar2.element = (int) (((float) cVar.element) * f2);
                    Integer marginTop = dVar.getMarginTop();
                    if (marginTop == null) {
                        C89219l.m154715b();
                    }
                    cVar4.element = marginTop.intValue();
                    Integer marginBottom = dVar.getMarginBottom();
                    if (marginBottom == null) {
                        C89219l.m154715b();
                    }
                    cVar5.element = marginBottom.intValue();
                }
                aVar.mo56275a(new C73887c(hVar, weakReference, videoPublishEditModel, cVar4, cVar2, cVar5, cVar, cVar3, i3, aVar));
            } else if (i == 4103) {
                C84911q.m145928d(this.f165893a.mo116321i() + " compile watermark video with captions done");
                this.f165894b.mo56349d(this.f165893a.mo116318f());
                this.f165894b.mo56387s();
                this.f165893a.mo116315b(this.f165895c);
            } else if (i == 4105) {
                this.f165893a.mo116314b(C89241a.m154730a(f * 100.0f));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.h$e */
    public static final class C73889e implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ C73884h f165896a;

        /* renamed from: b */
        final /* synthetic */ SynthetiseResult f165897b;

        /* renamed from: c */
        final /* synthetic */ C31060a f165898c;

        static {
            Covode.recordClassIndex(86635);
        }

        C73889e(C73884h hVar, SynthetiseResult synthetiseResult, C31060a aVar) {
            this.f165896a = hVar;
            this.f165897b = synthetiseResult;
            this.f165898c = aVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            C89219l.m154721d(str, "");
            if (((AbstractC73856a) this.f165896a).f165808b == EnumC73871c.CaptionSynthesis) {
                SynthetiseResult clone = this.f165897b.clone();
                C89219l.m154716b(clone, "");
                clone.ret = C89241a.m154730a(f);
                if (this.f165896a.mo46226a((Throwable) new C71798ef("compile video with captions failed. type = " + i + " ext = " + i2 + " f = " + f + " msg = " + str, clone))) {
                    if (i2 == -214) {
                        C65357b.f147489a = true;
                    }
                    this.f165898c.mo56387s();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73884h(VideoPublishEditModel videoPublishEditModel, C73867a aVar, VEWatermarkParam vEWatermarkParam, AbstractC1204m mVar, int i, List<String> list, C73835a aVar2, AbstractC73910l lVar, String str) {
        super(videoPublishEditModel, aVar, vEWatermarkParam, mVar, i, list, aVar2, lVar, str);
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(vEWatermarkParam, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(str, "");
    }
}
