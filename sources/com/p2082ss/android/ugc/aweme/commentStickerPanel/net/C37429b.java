package com.p2082ss.android.ugc.aweme.commentStickerPanel.net;

import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37363j;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.EnumC37361h;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.b */
public final class C37429b {

    /* renamed from: a */
    public QuestionStickerPanelRequestApi f88342a = new QuestionStickerPanelRequestApi();

    /* renamed from: b */
    public List<QaStruct> f88343b = new ArrayList();

    /* renamed from: c */
    public List<QaStruct> f88344c = new ArrayList();

    /* renamed from: d */
    public List<QaStruct> f88345d = new ArrayList();

    /* renamed from: e */
    public final C2563k<Boolean> f88346e = new C2563k<>();

    static {
        Covode.recordClassIndex(44814);
    }

    /* renamed from: b */
    public final boolean mo65073b() {
        return this.f88345d.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo65071a() {
        if (!this.f88343b.isEmpty() || !this.f88344c.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo65070a(List<QaStruct> list) {
        C89219l.m154721d(list, "");
        this.f88343b = list;
    }

    /* renamed from: b */
    public final void mo65072b(List<QaStruct> list) {
        C89219l.m154721d(list, "");
        this.f88344c = list;
    }

    /* renamed from: c */
    public final void mo65074c(List<QaStruct> list) {
        C89219l.m154721d(list, "");
        this.f88345d = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.b$a */
    public static final class C37430a extends AbstractC89220m implements AbstractC89172b<C37363j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37429b f88347a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f88348b;

        static {
            Covode.recordClassIndex(44815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37430a(C37429b bVar, AbstractC89172b bVar2) {
            super(1);
            this.f88347a = bVar;
            this.f88348b = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37363j jVar) {
            C37363j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            this.f88347a.mo65070a(new ArrayList());
            this.f88347a.mo65072b(new ArrayList());
            this.f88347a.mo65074c(new ArrayList());
            for (T t : jVar2.f88160b) {
                int i = t.f88150a;
                if (i == EnumC37361h.QuestionCollectionRECOMMEND.ordinal()) {
                    this.f88347a.mo65072b(t.f88151b);
                } else if (i == EnumC37361h.QuestionCollectionINVITATION.ordinal()) {
                    this.f88347a.mo65070a(t.f88151b);
                } else if (i == EnumC37361h.QuestionCollectionFAVORITE.ordinal()) {
                    this.f88347a.mo65074c(t.f88151b);
                }
            }
            AbstractC89172b bVar = this.f88348b;
            if (bVar != null) {
                bVar.invoke(jVar2);
            }
            return C89391z.f203057a;
        }
    }
}
