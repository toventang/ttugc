package com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73835a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.p3883a.C73867a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import dmt.p4542av.video.C88278m;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.e */
public final class C73876e extends AbstractC73856a {
    static {
        Covode.recordClassIndex(86622);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.e$a */
    public final class C73877a extends AbstractC73856a.AbstractC73858b {

        /* renamed from: e */
        final /* synthetic */ C73876e f165853e;

        static {
            Covode.recordClassIndex(86623);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a.AbstractC73858b
        /* renamed from: b */
        public final boolean mo116325b() {
            if (this.f165822a.incrementAndGet() == 2) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a.AbstractC73858b
        /* renamed from: a */
        public final void mo116324a(AbstractC31071f fVar, SynthetiseResult synthetiseResult) {
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(synthetiseResult, "");
            this.f165853e.mo116315b(synthetiseResult);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73877a(C73876e eVar, AbstractC31071f fVar, SynthetiseResult synthetiseResult) {
            super(eVar, fVar, synthetiseResult);
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(synthetiseResult, "");
            this.f165853e = eVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a
    /* renamed from: h */
    public final void mo116320h() {
        C80720e.m139931c(this.f165814m.mo116329b().getPath());
        this.f165815n.extFile = this.f165814m.mo116329b().getPath();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a
    /* renamed from: a */
    public final void mo116311a(SynthetiseResult synthetiseResult) {
        C89219l.m154721d(synthetiseResult, "");
        AbstractC31071f fVar = mo116319g().f200423w;
        C89219l.m154716b(fVar, "");
        mo116316b((AbstractC85541q) new C73877a(this, fVar, synthetiseResult));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.AbstractC73856a
    /* renamed from: a */
    public final VEVideoEncodeSettings mo116310a(AbstractC31071f fVar, SynthetiseResult synthetiseResult) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(synthetiseResult, "");
        return C88278m.m153398a(this.f165813l, synthetiseResult, this.f165815n, fVar, this.f165820s);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73876e(VideoPublishEditModel videoPublishEditModel, C73867a aVar, VEWatermarkParam vEWatermarkParam, AbstractC1204m mVar, int i, List<String> list, C73835a aVar2, AbstractC73910l lVar, String str) {
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
