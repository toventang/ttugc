package com.p2082ss.android.ugc.aweme.video.preload.enginepreloader;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80859l;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.l */
public final class C80905l extends C80908m {

    /* renamed from: a */
    public final C80902i f180899a;

    static {
        Covode.recordClassIndex(94204);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.C80908m
    /* renamed from: b */
    public final String mo124300b() {
        return "idle_preloader";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80905l(C80902i iVar, AbstractC80859l lVar) {
        super(iVar);
        C89219l.m154719c(iVar, "");
        this.f180899a = iVar;
        if (lVar != null) {
            lVar.mo124222a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.C80905l.C809061 */

                /* renamed from: a */
                final /* synthetic */ C80905l f180900a;

                static {
                    Covode.recordClassIndex(94205);
                }

                {
                    this.f180900a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f180900a.mo124302c().post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.C80905l.C809061.RunnableC809071 */

                        /* renamed from: a */
                        final /* synthetic */ C809061 f180901a;

                        static {
                            Covode.recordClassIndex(94206);
                        }

                        {
                            this.f180901a = r1;
                        }

                        public final void run() {
                            C80902i iVar = this.f180901a.f180900a.f180899a;
                            if (iVar.f180894a == EnumC80913n.Idle) {
                                iVar.f180895b.mo124298b();
                            }
                        }
                    });
                    return C89391z.f203057a;
                }
            });
        }
    }
}
