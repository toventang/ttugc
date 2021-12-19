package com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.watermark.AbstractC81510t;
import com.p2082ss.android.ugc.aweme.watermark.C81503m;
import com.p2082ss.android.ugc.aweme.watermark.C81505o;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.af.a.b */
public final class C69816b implements AbstractC69822f {

    /* renamed from: a */
    private volatile boolean f156031a;

    /* renamed from: b */
    private C81505o f156032b;

    /* renamed from: c */
    private C31060a f156033c;

    /* renamed from: d */
    private final String f156034d;

    static {
        Covode.recordClassIndex(82222);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.af.a.b$a */
    public static final class C69817a implements VEListener.AbstractC85248q {

        /* renamed from: a */
        final /* synthetic */ C69816b f156035a;

        /* renamed from: b */
        final /* synthetic */ AbstractC81510t f156036b;

        /* renamed from: c */
        final /* synthetic */ AbstractC69820d f156037c;

        static {
            Covode.recordClassIndex(82223);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileDone() {
            AbstractC69820d dVar = this.f156037c;
            if (dVar != null) {
                dVar.mo110171a();
            }
            this.f156035a.mo110168a((C81505o) this.f156036b);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileProgress(float f) {
            AbstractC69820d dVar = this.f156037c;
            if (dVar != null) {
                dVar.mo110172a(f);
            }
        }

        C69817a(C69816b bVar, AbstractC81510t tVar, AbstractC69820d dVar) {
            this.f156035a = bVar;
            this.f156036b = tVar;
            this.f156037c = dVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileError(int i, int i2, float f, String str) {
            AbstractC69820d dVar = this.f156037c;
            if (dVar != null) {
                if (str == null) {
                    str = "";
                }
                dVar.mo110173a(i, str, i2);
            }
            this.f156035a.mo110168a((C81505o) this.f156036b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69822f
    /* renamed from: a */
    public final void mo110167a() {
        if (this.f156031a) {
            C81505o oVar = this.f156032b;
            if (oVar != null) {
                m123373b(oVar);
            }
            C31060a aVar = this.f156033c;
            if (aVar != null) {
                aVar.mo56387s();
            }
            this.f156033c = null;
            this.f156031a = false;
        }
    }

    public C69816b(String str) {
        C89219l.m154721d(str, "");
        this.f156034d = str;
    }

    /* renamed from: a */
    public final void mo110168a(C81505o oVar) {
        this.f156031a = false;
        C31060a aVar = this.f156033c;
        if (aVar != null) {
            aVar.mo56387s();
        }
        this.f156033c = null;
        m123373b(oVar);
    }

    /* renamed from: b */
    private static void m123373b(C81505o oVar) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        VEWatermarkParam vEWatermarkParam = oVar.f182233f;
        if (!(vEWatermarkParam == null || (strArr2 = vEWatermarkParam.images) == null || strArr2.length == 0)) {
            for (String str3 : strArr2) {
                C80720e.m139931c(str3);
            }
        }
        VEWatermarkParam vEWatermarkParam2 = oVar.f182233f;
        if (!(vEWatermarkParam2 == null || (strArr = vEWatermarkParam2.secondHalfImages) == null || strArr.length == 0)) {
            for (String str4 : strArr) {
                C80720e.m139931c(str4);
            }
        }
        C81503m mVar = oVar.f182229b;
        if (!(mVar == null || (str2 = mVar.f182216a) == null)) {
            C80720e.m139931c(str2);
        }
        C81503m mVar2 = oVar.f182229b;
        if (!(mVar2 == null || (str = mVar2.f182217b) == null)) {
            C80720e.m139931c(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        if (r0 == null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0126, code lost:
        if (r0 == null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0139, code lost:
        if (r0 == null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014c, code lost:
        if (r0 == null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0164, code lost:
        if (r0 == null) goto L_0x0166;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69822f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo110169a(com.p2082ss.android.ugc.aweme.watermark.AbstractC81510t r20, com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69820d r21) {
        /*
        // Method dump skipped, instructions count: 590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.C69816b.mo110169a(com.ss.android.ugc.aweme.watermark.t, com.ss.android.ugc.aweme.shortvideo.af.a.d):void");
    }
}
