package com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a;

import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77128g;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77129h;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.clip.a.d */
public abstract class AbstractC77121d<Api extends AbstractC2547b, Clip extends AbstractC77128g<?>, Cluster extends AbstractC77129h<Clip>> extends AbstractC2562j<Api> implements AbstractC77117a<Cluster, Clip> {

    /* renamed from: a */
    private final AbstractC89244h f172968a = C89250i.m154773a((AbstractC89171a) new C77122a(this));

    static {
        Covode.recordClassIndex(90124);
    }

    /* renamed from: a */
    private final AbstractC2565m<C89378p<Clip, Boolean>> mo114795a() {
        return (AbstractC2565m) this.f172968a.getValue();
    }

    /* renamed from: a */
    public void mo120452a(Clip clip) {
        C89219l.m154721d(clip, "");
    }

    /* renamed from: b */
    public void mo120462b(Clip clip) {
        C89219l.m154721d(clip, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.clip.a.d$a */
    static final class C77122a extends AbstractC89220m implements AbstractC89171a<AbstractC2565m<C89378p<? extends Clip, ? extends Boolean>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC77121d f172969a;

        static {
            Covode.recordClassIndex(90125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77122a(AbstractC77121d dVar) {
            super(0);
            this.f172969a = dVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return new AbstractC2565m(this) {
                /* class com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d.C77122a.C771231 */

                /* renamed from: a */
                final /* synthetic */ C77122a f172970a;

                static {
                    Covode.recordClassIndex(90126);
                }

                {
                    this.f172970a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.edit.clip.a.d */
                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.ugc.aweme.story.edit.clip.a.d */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
                public final /* synthetic */ void onChanged(Object obj) {
                    C89378p pVar = (C89378p) obj;
                    if (((Boolean) pVar.getSecond()).booleanValue()) {
                        this.f172970a.f172969a.mo120452a((AbstractC77128g) pVar.getFirst());
                    } else {
                        this.f172970a.f172969a.mo120462b((AbstractC77128g) pVar.getFirst());
                    }
                }
            };
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        mo120637U();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo120638V() {
        cF_().mo120642c().removeObserver(mo114795a());
    }

    /* renamed from: U */
    public final void mo120637U() {
        cF_().mo120642c().observe(this, mo114795a());
    }
}
