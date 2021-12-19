package com.p2082ss.android.ugc.aweme.watermark;

import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.u */
public final class C81511u implements AbstractC81495h {
    static {
        Covode.recordClassIndex(94884);
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.u$a */
    public static final class C81512a implements AbstractC81494g {

        /* renamed from: a */
        final /* synthetic */ VEWatermarkParam f182255a;

        /* renamed from: b */
        private final VEWatermarkParam f182256b;

        static {
            Covode.recordClassIndex(94885);
        }

        @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81494g
        /* renamed from: b */
        public final VEWatermarkParam mo125213b() {
            return this.f182256b;
        }

        @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81494g
        /* renamed from: a */
        public final int mo125211a() {
            return this.f182256b.yOffset;
        }

        C81512a(VEWatermarkParam vEWatermarkParam) {
            this.f182255a = vEWatermarkParam;
            this.f182256b = vEWatermarkParam;
        }

        @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81494g
        /* renamed from: a */
        public final void mo125212a(int i) {
            this.f182256b.yOffset = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81495h
    /* renamed from: a */
    public final void mo125215a(String str) {
        MethodCollector.m26663i(6217);
        C89219l.m154721d(str, "");
        C81489c cVar = new C81489c();
        cVar.f182196a = BitmapFactory.decodeResource(C63238c.f143574a.getResources(), 2131232089);
        cVar.mo125202a(str);
        MethodCollector.m26664o(6217);
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81495h
    /* renamed from: a */
    public final AbstractC81494g mo125214a(int i, String str, boolean z, AbstractC32846a aVar, int[] iArr, String str2, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(str2, "");
        VEWatermarkParam a = C81502l.m141338a(C81502l.m141336a(i, str, z, iArr), aVar, iArr, true, str2, z2);
        if (a != null) {
            return new C81512a(a);
        }
        return null;
    }
}
