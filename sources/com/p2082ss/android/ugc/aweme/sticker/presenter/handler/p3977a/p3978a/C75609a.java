package com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3977a.p3978a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.a.a.a */
public final class C75609a implements AbstractC75633m.AbstractC75634a {

    /* renamed from: a */
    private int f170006a;

    /* renamed from: b */
    private final List<AbstractC75633m> f170007b;

    /* renamed from: c */
    private final int f170008c;

    /* renamed from: d */
    private final AbstractC84903j f170009d;

    static {
        Covode.recordClassIndex(88540);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m.AbstractC75634a
    /* renamed from: a */
    public final C75619b mo119345a(AbstractC75620c cVar) {
        AbstractC84903j jVar;
        C89219l.m154721d(cVar, "");
        boolean z = false;
        if (this.f170008c < this.f170007b.size()) {
            int i = this.f170006a + 1;
            this.f170006a = i;
            if (i <= 1) {
                z = true;
            }
            if (z) {
                C75609a aVar = new C75609a(this.f170007b, this.f170008c + 1, this.f170009d);
                AbstractC75633m mVar = this.f170007b.get(this.f170008c);
                C75619b a = mVar.mo23184a(cVar, aVar);
                if (this.f170008c + 1 < this.f170007b.size() && aVar.f170006a <= 0 && (jVar = this.f170009d) != null) {
                    jVar.mo123661c("handler:" + mVar + " must call proceed() at least once");
                }
                return a;
            }
            throw new IllegalStateException(("handler:" + this.f170007b.get(this.f170008c - 1) + " must called useSticker() exactly once").toString());
        }
        throw new IllegalStateException("chain response beyond handlers size".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.sticker.presenter.handler.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75609a(List<? extends AbstractC75633m> list, int i, AbstractC84903j jVar) {
        C89219l.m154721d(list, "");
        this.f170007b = list;
        this.f170008c = i;
        this.f170009d = jVar;
    }
}
