package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.h */
public final class C74215h {
    static {
        Covode.recordClassIndex(86974);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.h$a */
    public static final class C74216a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f166719a;

        static {
            Covode.recordClassIndex(86975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74216a(ASCameraView aSCameraView) {
            super(1);
            this.f166719a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            num.intValue();
            this.f166719a.mo56936e(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m130482a(CameraComponentModel cameraComponentModel, ASCameraView aSCameraView, boolean z, EnumC78601i iVar, long j, C74172g.C74180b bVar, AbstractC89172b<? super Integer, C89391z> bVar2) {
        C89219l.m154721d(cameraComponentModel, "");
        C89219l.m154721d(aSCameraView, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        if (cameraComponentModel.f155665u == 1) {
            aSCameraView.mo56914a(new C74216a(aSCameraView));
        }
        C74224j jVar = bVar.f166661b;
        float f = jVar.f166730b;
        int i = jVar.f166731c;
        int i2 = jVar.f166732d;
        if (!cameraComponentModel.mo109889b() && !cameraComponentModel.mo109890c()) {
            aSCameraView.setRecordMaxDuration(j);
        }
        if (cameraComponentModel.f155641F) {
            C89219l.m154716b(cameraComponentModel.f155652h, "");
            C89219l.m154716b(null, "");
            throw new NullPointerException("getAbsolutePath");
        }
        aSCameraView.mo56899a((double) iVar.value(), !z, f, i, i2, bVar2);
    }
}
