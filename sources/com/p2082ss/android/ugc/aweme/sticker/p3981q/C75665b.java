package com.p2082ss.android.ugc.aweme.sticker.p3981q;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.RecordInvoker;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.AbstractC75955e;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.q.b */
public final class C75665b implements AbstractC75955e {

    /* renamed from: a */
    private final AbstractC31193a f170086a;

    static {
        Covode.recordClassIndex(88596);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.AbstractC75955e
    /* renamed from: a */
    public final void mo119400a() {
        this.f170086a.mo56787a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.q.b$a */
    static final class C75666a implements RecordInvoker.OnARTextCountCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f170087a;

        static {
            Covode.recordClassIndex(88597);
        }

        C75666a(AbstractC89172b bVar) {
            this.f170087a = bVar;
        }

        @Override // com.p2082ss.android.medialib.RecordInvoker.OnARTextCountCallback
        public final void onResult(int i) {
            this.f170087a.invoke(Integer.valueOf(i));
        }
    }

    public C75665b(AbstractC31193a aVar) {
        C89219l.m154721d(aVar, "");
        this.f170086a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.AbstractC75955e
    /* renamed from: a */
    public final void mo119401a(AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f170086a.mo56776a(new C75666a(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.AbstractC75955e
    /* renamed from: a */
    public final void mo119402a(String str) {
        C89219l.m154721d(str, "");
        this.f170086a.mo56806c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.AbstractC75955e
    /* renamed from: a */
    public final void mo119403a(String str, int i, int i2, String str2) {
        AbstractC31193a aVar = this.f170086a;
        if (str2 == null) {
            str2 = "";
        }
        aVar.mo56785a(str, i, i2, str2);
    }
}
