package com.p2082ss.android.ugc.aweme.qna.p3646d;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.p2082ss.android.ugc.aweme.question.model.C66575a;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.d.g */
public final class C66043g implements AbstractC12644a<AbstractC66042f> {

    /* renamed from: a */
    public QnaApiV2 f148703a = QnaApiV2.C66002a.m117823b();

    /* renamed from: b */
    public final AbstractC66042f f148704b = new C66044a(this);

    static {
        Covode.recordClassIndex(77549);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC66042f mo20458a() {
        return this.f148704b;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.g$a */
    public static final class C66044a implements AbstractC66042f {

        /* renamed from: a */
        final /* synthetic */ C66043g f148705a;

        static {
            Covode.recordClassIndex(77550);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C66044a(C66043g gVar) {
            this.f148705a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.qna.p3646d.AbstractC66042f
        /* renamed from: a */
        public final AbstractC88979t<C66575a> mo105101a(Long l, String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return this.f148705a.f148703a.createQuestion(l, str, str2);
        }
    }
}
