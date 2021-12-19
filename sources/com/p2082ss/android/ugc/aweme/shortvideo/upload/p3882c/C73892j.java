package com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73835a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.p3883a.C73867a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.j */
public final class C73892j extends C73884h {
    static {
        Covode.recordClassIndex(86638);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a, com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.C73884h
    /* renamed from: i */
    public final String mo116321i() {
        return "SerialPublishWithWatermarkFuture";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a, com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.C73884h
    /* renamed from: h */
    public final void mo116320h() {
        super.mo116320h();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a, com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.C73884h
    /* renamed from: a */
    public final void mo116311a(SynthetiseResult synthetiseResult) {
        C89219l.m154721d(synthetiseResult, "");
        super.mo116311a(synthetiseResult);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a
    /* renamed from: b */
    public final void mo116315b(SynthetiseResult synthetiseResult) {
        C89219l.m154721d(synthetiseResult, "");
        C84911q.m145922a("ParallelWithEndWatermark", "onBiChannelSynthesisFinished result ".concat(String.valueOf(synthetiseResult)));
        C80720e.m139932c(this.f165815n.extFile, this.f165813l.getLocalTempPath());
        C80720e.m139931c(this.f165815n.extFile);
        mo116312a(EnumC73871c.EndingWatermarkSynthesis);
        mo46227b((Object) synthetiseResult);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a, com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.C73884h
    /* renamed from: a */
    public final int mo116309a(EnumC73871c cVar, int i) {
        C89219l.m154721d(cVar, "");
        if (C73893k.f165902a[cVar.ordinal()] != 1) {
            return Math.min(100, C89241a.m154730a((((float) (i * 40)) / 100.0f) + 60.0f));
        }
        return Math.min(60, C89241a.m154730a(((float) (i * 60)) / 100.0f));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73892j(VideoPublishEditModel videoPublishEditModel, C73867a aVar, VEWatermarkParam vEWatermarkParam, AbstractC1204m mVar, int i, List<String> list, C73835a aVar2, AbstractC73910l lVar, String str) {
        super(videoPublishEditModel, new C73867a(), vEWatermarkParam, mVar, i, list, aVar2, lVar, str);
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(vEWatermarkParam, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(str, "");
    }
}
