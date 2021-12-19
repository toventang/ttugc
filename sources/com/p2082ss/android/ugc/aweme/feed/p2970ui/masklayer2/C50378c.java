package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.c */
public final class C50378c extends AbstractC50357e {

    /* renamed from: a */
    private final AbstractC69693h f116319a;

    /* renamed from: b */
    private final AbstractC50382f f116320b;

    /* renamed from: c */
    private final AbstractC50385i f116321c;

    static {
        Covode.recordClassIndex(59509);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        Context context;
        C89219l.m154721d(view, "");
        AbstractC50382f fVar = this.f116320b;
        if (fVar != null && (context = fVar.getContext()) != null) {
            this.f116319a.mo61915a(context, this.f116321c.mo85527a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50378c(AbstractC69693h hVar, final AbstractC50382f fVar, AbstractC50385i iVar) {
        super(new AbstractC89171a<C89391z>() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50378c.C503791 */

            static {
                Covode.recordClassIndex(59510);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC50382f fVar = fVar;
                if (fVar != null) {
                    fVar.dismiss();
                }
                return C89391z.f203057a;
            }
        });
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(iVar, "");
        this.f116319a = hVar;
        this.f116320b = fVar;
        this.f116321c = iVar;
    }
}
