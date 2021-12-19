package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70504v;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70447e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70464i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70483m;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70439e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69790a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VESize;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba */
public final class C70242ba implements AbstractC70298bt {

    /* renamed from: z */
    public static final C70243a f157045z = new C70243a((byte) 0);

    /* renamed from: a */
    public AbstractC70301bw f157046a;

    /* renamed from: b */
    public AbstractC70300bv f157047b;

    /* renamed from: c */
    public final C70467l f157048c = new C70467l();

    /* renamed from: d */
    public C69905c f157049d;

    /* renamed from: e */
    public AbstractC70441g f157050e;

    /* renamed from: f */
    public final C70447e f157051f = new C70447e();

    /* renamed from: g */
    public VideoSegment f157052g;

    /* renamed from: h */
    C69905c f157053h;

    /* renamed from: i */
    public String f157054i = "sync_page_recommend";

    /* renamed from: j */
    public boolean f157055j;

    /* renamed from: k */
    public long f157056k;

    /* renamed from: l */
    public C70483m f157057l;

    /* renamed from: m */
    List<C69905c> f157058m;

    /* renamed from: n */
    AbstractC70439e f157059n;

    /* renamed from: o */
    public AbstractC70527h f157060o;

    /* renamed from: p */
    public int f157061p;

    /* renamed from: q */
    C69790a f157062q;

    /* renamed from: r */
    public long f157063r;

    /* renamed from: s */
    public boolean f157064s;

    /* renamed from: t */
    public CutVideoStickerPointMusicViewModel f157065t;

    /* renamed from: u */
    CutVideoMultiModeViewModel f157066u;

    /* renamed from: v */
    CutVideoBottomBarViewModel f157067v;

    /* renamed from: w */
    CutVideoEditViewModel f157068w;

    /* renamed from: x */
    public boolean f157069x;

    /* renamed from: y */
    public boolean f157070y;

    static {
        Covode.recordClassIndex(82685);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$a */
    public static final class C70243a {
        static {
            Covode.recordClassIndex(82686);
        }

        private C70243a() {
        }

        public /* synthetic */ C70243a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$h */
    public static final class C70250h implements AbstractC70440f {
        static {
            Covode.recordClassIndex(82693);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
        }

        C70250h() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70298bt
    /* renamed from: e */
    public final void mo110879e() {
        this.f157048c.mo111037c(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$c */
    public static final class C70245c implements C70467l.AbstractC70470b {

        /* renamed from: a */
        final /* synthetic */ C70242ba f157073a;

        static {
            Covode.recordClassIndex(82688);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.AbstractC70470b
        /* renamed from: a */
        public final boolean mo110890a() {
            return this.f157073a.mo110881g();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.AbstractC70470b
        /* renamed from: b */
        public final List<VideoSegment> mo110891b() {
            AbstractC70441g gVar = this.f157073a.f157050e;
            if (gVar == null) {
                C89219l.m154715b();
            }
            return gVar.mo110826c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70245c(C70242ba baVar) {
            this.f157073a = baVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.AbstractC70470b
        /* renamed from: a */
        public final void mo110889a(long j) {
            this.f157073a.f157048c.mo111026a(j);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            if (r3 != 6) goto L_0x0021;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.AbstractC70470b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo110888a(int r3) {
            /*
                r2 = this;
                r0 = 5
                if (r3 == r0) goto L_0x0021
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r0 = r2.f157073a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g r0 = r0.f157050e
                if (r0 == 0) goto L_0x001b
                boolean r0 = com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.m124303a(r3)
                if (r0 != 0) goto L_0x001b
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r0 = r2.f157073a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g r0 = r0.f157050e
                if (r0 != 0) goto L_0x0018
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0018:
                r0.mo110825b()
            L_0x001b:
                r0 = 7
                if (r3 == r0) goto L_0x002a
                r0 = 6
                if (r3 == r0) goto L_0x002a
            L_0x0021:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r0 = r2.f157073a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h r0 = r0.mo110870a()
                r0.mo111109f()
            L_0x002a:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r0 = r2.f157073a
                com.ss.android.ugc.aweme.shortvideo.cut.scene.bv r1 = r0.f157047b
                if (r1 != 0) goto L_0x0035
                java.lang.String r0 = "stickPointVideoSegController"
                p4600h.p4611f.p4613b.C89219l.m154710a(r0)
            L_0x0035:
                r1.mo110933c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70242ba.C70245c.mo110888a(int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$d */
    public static final class C70246d implements AbstractC70439e {

        /* renamed from: a */
        final /* synthetic */ C70242ba f157074a;

        static {
            Covode.recordClassIndex(82689);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70439e
        /* renamed from: b */
        public final VESize mo110894b() {
            AbstractC31071f fVar = this.f157074a.f157048c.f157448a;
            if (fVar != null) {
                return fVar.mo56330b();
            }
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70439e
        /* renamed from: a */
        public final int mo110892a() {
            if (this.f157074a.f157052g == null) {
                return 0;
            }
            VideoSegment videoSegment = this.f157074a.f157052g;
            if (videoSegment == null) {
                C89219l.m154715b();
            }
            return videoSegment.f156718j;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70246d(C70242ba baVar) {
            this.f157074a = baVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70439e
        /* renamed from: a */
        public final void mo110893a(float f, float f2, float f3, int i) {
            AbstractC31071f fVar = this.f157074a.f157048c.f157448a;
            if (fVar != null) {
                fVar.mo56302a(f, f2, f3, 0, i);
            }
            C70242ba.m123966a(this.f157074a).f157491a = f;
            C70242ba.m123966a(this.f157074a).f157492b = f2;
            C70242ba.m123966a(this.f157074a).f157493c = 0;
            C70242ba.m123966a(this.f157074a).f157494d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$i */
    public static final class C70251i implements AbstractC70440f {

        /* renamed from: a */
        final /* synthetic */ C70242ba f157078a;

        static {
            Covode.recordClassIndex(82694);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
            this.f157078a.f157048c.mo111026a(0L);
            this.f157078a.mo110874a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70251i(C70242ba baVar) {
            this.f157078a = baVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
            boolean z;
            C70242ba baVar = this.f157078a;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            baVar.mo110874a(z);
        }
    }

    /* renamed from: f */
    public final void mo110880f() {
        this.f157048c.mo111028a((AbstractC70440f) new C70251i(this), false);
    }

    /* renamed from: g */
    public final boolean mo110881g() {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f157066u;
        if (cutVideoMultiModeViewModel == null) {
            C89219l.m154710a("multiModeViewModel");
        }
        return cutVideoMultiModeViewModel.mo110720a();
    }

    /* renamed from: h */
    public final C70483m mo110882h() {
        C70483m mVar = this.f157057l;
        if (mVar == null) {
            C89219l.m154710a("stickPointVideoRotateData");
        }
        return mVar;
    }

    /* renamed from: i */
    public final C69905c mo110883i() {
        AbstractC70301bw bwVar = this.f157046a;
        if (bwVar == null) {
            C89219l.m154710a("musicViewController");
        }
        return bwVar.mo110895a();
    }

    /* renamed from: j */
    public final void mo110884j() {
        this.f157061p = this.f157048c.mo111039e();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70298bt
    /* renamed from: k */
    public final AbstractC70300bv mo110885k() {
        AbstractC70300bv bvVar = this.f157047b;
        if (bvVar == null) {
            C89219l.m154710a("stickPointVideoSegController");
        }
        return bvVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$b */
    public static final class C70244b implements C70447e.AbstractC70449b {

        /* renamed from: a */
        final /* synthetic */ C70242ba f157071a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f157072b;

        static {
            Covode.recordClassIndex(82687);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70447e.AbstractC70449b
        /* renamed from: a */
        public final void mo110886a() {
            if (this.f157071a.f157048c.mo111032a()) {
                this.f157071a.f157069x = true;
            }
            this.f157071a.f157048c.mo111034b();
            this.f157071a.f157056k = System.currentTimeMillis();
        }

        C70244b(C70242ba baVar, ActivityC0945e eVar) {
            this.f157071a = baVar;
            this.f157072b = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70447e.AbstractC70449b
        /* renamed from: a */
        public final void mo110887a(boolean z, boolean z2, boolean z3) {
            if (z) {
                this.f157071a.f157048c.mo111040f();
                new C79459a(this.f157072b).mo123050a(R.string.g4q).mo123053a();
                this.f157071a.f157055j = true;
            } else if (this.f157071a.f157069x) {
                this.f157071a.f157048c.mo111036c();
                this.f157071a.f157069x = false;
            }
            if (z3) {
                C80720e.m139931c(new File(C70455f.f157418b).getPath());
            }
            if (z2) {
                AbstractC70441g gVar = this.f157071a.f157050e;
                if (gVar == null) {
                    C89219l.m154715b();
                }
                List<VideoSegment> c = gVar.mo110826c();
                if (c != null && !c.isEmpty()) {
                    C70463h.m124293c(c);
                }
            }
            C70464i.m124297a(z, z2, System.currentTimeMillis() - this.f157071a.f157056k);
        }
    }

    /* renamed from: a */
    public final AbstractC70527h mo110870a() {
        AbstractC70527h hVar = this.f157060o;
        if (hVar == null) {
            C89219l.m154710a("videoEditView");
        }
        return hVar;
    }

    /* renamed from: c */
    public final List<VideoSegment> mo110877c() {
        AbstractC70441g gVar = this.f157050e;
        if (gVar == null || C84904k.m145909a(gVar.mo110826c())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC70441g gVar2 = this.f157050e;
        if (gVar2 == null) {
            C89219l.m154715b();
        }
        for (VideoSegment videoSegment : gVar2.mo110826c()) {
            if (!videoSegment.f156717i) {
                arrayList.add(videoSegment);
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70298bt
    /* renamed from: d */
    public final void mo110878d() {
        AbstractC70300bv bvVar = this.f157047b;
        if (bvVar == null) {
            C89219l.m154710a("stickPointVideoSegController");
        }
        bvVar.mo110932b(false);
        this.f157048c.mo111037c(1);
        this.f157048c.mo111041g();
        this.f157048c.mo111038d();
        AbstractC70441g gVar = this.f157050e;
        if (gVar != null) {
            gVar.mo110824a(false, true);
        }
    }

    /* renamed from: b */
    public final List<VideoSegment> mo110876b() {
        AbstractC70441g gVar = this.f157050e;
        if (gVar == null || C84904k.m145909a(gVar.mo110826c())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC70441g gVar2 = this.f157050e;
        if (gVar2 == null) {
            C89219l.m154715b();
        }
        for (VideoSegment videoSegment : gVar2.mo110826c()) {
            if (!videoSegment.f156717i && !videoSegment.f156724p && !this.f157051f.mo111014a(videoSegment) && !C84896h.m145866a(videoSegment.mo110571a(false), false)) {
                arrayList.add(videoSegment);
            }
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$g */
    public static final class C70249g implements AbstractC70440f {

        /* renamed from: a */
        final /* synthetic */ C70242ba f157077a;

        static {
            Covode.recordClassIndex(82692);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70249g(C70242ba baVar) {
            this.f157077a = baVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
            if (!this.f157077a.mo110881g() || this.f157077a.f157049d == null) {
                this.f157077a.f157048c.mo111038d();
                if (this.f157077a.mo110881g()) {
                    this.f157077a.f157048c.mo111026a(0L);
                } else {
                    this.f157077a.f157048c.mo111026a((long) this.f157077a.f157061p);
                }
            } else {
                CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f157077a.f157065t;
                if (cutVideoStickerPointMusicViewModel == null) {
                    C89219l.m154710a("musicViewModel");
                }
                cutVideoStickerPointMusicViewModel.mo110778a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$f */
    static final class C70248f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70242ba f157076a;

        static {
            Covode.recordClassIndex(82691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70248f(C70242ba baVar) {
            super(1);
            this.f157076a = baVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f157076a.f157064s = bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C70483m m123966a(C70242ba baVar) {
        C70483m mVar = baVar.f157057l;
        if (mVar == null) {
            C89219l.m154710a("stickPointVideoRotateData");
        }
        return mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$e */
    static final class C70247e extends AbstractC89220m implements AbstractC89172b<Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70242ba f157075a;

        static {
            Covode.recordClassIndex(82690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70247e(C70242ba baVar) {
            super(1);
            this.f157075a = baVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Float f) {
            this.f157075a.f157063r = (long) (f.floatValue() * 1000.0f);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo110874a(boolean z) {
        AbstractC70300bv bvVar = this.f157047b;
        if (bvVar == null) {
            C89219l.m154710a("stickPointVideoSegController");
        }
        bvVar.mo110932b(true);
        if (this.f157049d != null) {
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f157065t;
            if (cutVideoStickerPointMusicViewModel == null) {
                C89219l.m154710a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel.mo110778a();
        } else {
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.f157065t;
            if (cutVideoStickerPointMusicViewModel2 == null) {
                C89219l.m154710a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel2.mo110779a(false);
            this.f157048c.mo111026a(0L);
        }
        AbstractC70441g gVar = this.f157050e;
        if (gVar != null) {
            gVar.mo110824a(true, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70298bt
    /* renamed from: a */
    public final void mo110873a(int i, VideoSegment videoSegment) {
        this.f157048c.f157452e = i;
        this.f157052g = videoSegment;
        if (mo110881g()) {
            this.f157048c.mo111038d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70298bt
    /* renamed from: a */
    public final void mo110875a(boolean z, boolean z2) {
        if (z) {
            C70467l lVar = this.f157048c;
            VideoSegment videoSegment = this.f157052g;
            if (videoSegment == null) {
                Integer.valueOf(-201);
            } else {
                AbstractC31071f fVar = lVar.f157448a;
                if (fVar != null) {
                    Integer.valueOf(fVar.mo56325b(videoSegment.f156709a, C70504v.C70505a.m124383a(videoSegment.f156718j)));
                }
            }
        }
        if (mo110881g()) {
            AbstractC70441g gVar = this.f157050e;
            if (gVar != null) {
                gVar.mo110825b();
            }
            this.f157048c.mo111031a(z, z2, 0, new C70250h());
        }
        this.f157052g = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70298bt
    /* renamed from: a */
    public final void mo110872a(int i, int i2, AbstractC70440f fVar) {
        C89219l.m154721d(fVar, "");
        if (mo110881g()) {
            this.f157048c.mo111025a(i, i2, fVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 == null) goto L_0x001d;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70298bt
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo110871a(float r9, float r10, float r11) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70242ba.mo110871a(float, float, float):void");
    }
}
