package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.m */
public abstract class AbstractC50367m extends AbstractC50357e {

    /* renamed from: f */
    public Aweme f116296f;

    /* renamed from: g */
    public String f116297g;

    static {
        Covode.recordClassIndex(59495);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC50367m(C50345a aVar, AbstractC50382f fVar) {
        super(new AbstractC89171a<C89391z>(fVar) {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50367m.C503681 */

            static {
                Covode.recordClassIndex(59496);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                ((AbstractC50382f) this.receiver).dismiss();
                return C89391z.f203057a;
            }
        });
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f116296f = aVar.f116264b;
        this.f116297g = aVar.f116265c;
    }
}
