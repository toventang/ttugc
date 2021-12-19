package com.p2082ss.android.ugc.aweme.qna.p3646d;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.api.C66011h;
import com.p2082ss.android.ugc.aweme.qna.api.QnaApiV2;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.d.e */
public final class C66040e implements AbstractC12644a<AbstractC66039d> {

    /* renamed from: a */
    public QnaApiV2 f148700a = QnaApiV2.C66002a.m117823b();

    /* renamed from: b */
    public final AbstractC66039d f148701b = new C66041a(this);

    static {
        Covode.recordClassIndex(77546);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC66039d mo20458a() {
        return this.f148701b;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.e$a */
    public static final class C66041a implements AbstractC66039d {

        /* renamed from: a */
        final /* synthetic */ C66040e f148702a;

        static {
            Covode.recordClassIndex(77547);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C66041a(C66040e eVar) {
            this.f148702a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.qna.p3646d.AbstractC66039d
        /* renamed from: a */
        public final AbstractC88979t<C66011h> mo105100a(Long l, String str) {
            C89219l.m154721d(str, "");
            return this.f148702a.f148700a.getBannerData(l, str);
        }
    }
}
