package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f */
public final class C50358f extends AbstractC50367m implements AbstractC50365k {

    /* renamed from: a */
    public final C50345a f116287a;

    /* renamed from: b */
    public final AbstractC50382f f116288b;

    static {
        Covode.recordClassIndex(59486);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50365k
    /* renamed from: a */
    public final void mo85538a(Exception exc) {
        C89219l.m154721d(exc, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50365k
    /* renamed from: a */
    public final void mo85539a(String str) {
        C89219l.m154721d(str, "");
        new C79459a(C34729o.m70950a(this.f116288b.getContext())).mo123050a(R.string.buc).mo123053a();
        AbstractC81915c.m141874a(new C49677e(this.f116287a.f116264b));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50358f(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f116287a = aVar;
        this.f116288b = fVar;
    }
}
