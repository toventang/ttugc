package com.p2082ss.android.ugc.aweme.autoplay.p2345a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34205d;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34218g;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34222i;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.SearchLiveView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.a.c */
public class C34043c extends C34055d {

    /* renamed from: a */
    public Aweme f80511a;

    /* renamed from: e */
    private final AbstractC89244h f80512e = C89250i.m154773a((AbstractC89171a) new C34054b(this));

    static {
        Covode.recordClassIndex(40977);
    }

    /* renamed from: a */
    public final SearchLiveView mo60336a() {
        return (SearchLiveView) this.f80512e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c, com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34055d
    public boolean aZ_() {
        return mo60336a().f80861a.getMLiveStarted();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.a.c$b */
    static final class C34054b extends AbstractC89220m implements AbstractC89171a<SearchLiveView> {

        /* renamed from: a */
        final /* synthetic */ C34043c f80526a;

        static {
            Covode.recordClassIndex(40988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34054b(C34043c cVar) {
            super(0);
            this.f80526a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchLiveView invoke() {
            View findViewById = this.f80526a.itemView.findViewById(R.id.fe8);
            C89219l.m154716b(findViewById, "");
            return findViewById;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public void onViewAttachedToWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewAttachedToWindow(view);
        C34181a.m69857a(mo60336a().getLiveCore());
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public void onViewDetachedFromWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewDetachedFromWindow(view);
        C34181a.m69859b(mo60336a().getLiveCore());
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.a.c$a */
    static final class C34044a extends AbstractC89220m implements AbstractC89172b<C34222i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C34043c f80513a;

        /* renamed from: b */
        final /* synthetic */ AbstractC51043a f80514b;

        /* renamed from: c */
        final /* synthetic */ AbstractC51044b f80515c;

        static {
            Covode.recordClassIndex(40978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34044a(C34043c cVar, AbstractC51043a aVar, AbstractC51044b bVar) {
            super(1);
            this.f80513a = cVar;
            this.f80514b = aVar;
            this.f80515c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C34222i iVar) {
            final C34222i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.mo60580a(new AbstractC89171a<C34205d>(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c.C34044a.C340451 */

                /* renamed from: a */
                final /* synthetic */ C34044a f80516a;

                static {
                    Covode.recordClassIndex(40979);
                }

                {
                    this.f80516a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C34205d invoke() {
                    return this.f80516a.f80513a.mo60336a().getLiveCore();
                }
            });
            this.f80513a.mo60336a().setOutCorner(false);
            iVar2.mo60581b(new AbstractC89171a<AbstractC51043a>(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c.C34044a.C340462 */

                /* renamed from: a */
                final /* synthetic */ C34044a f80517a;

                static {
                    Covode.recordClassIndex(40980);
                }

                {
                    this.f80517a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ AbstractC51043a invoke() {
                    return this.f80517a.f80514b;
                }
            });
            iVar2.mo60582c(new AbstractC89171a<AbstractC51044b>(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c.C34044a.C340473 */

                /* renamed from: a */
                final /* synthetic */ C34044a f80518a;

                static {
                    Covode.recordClassIndex(40981);
                }

                {
                    this.f80518a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ AbstractC51044b invoke() {
                    return this.f80518a.f80515c;
                }
            });
            iVar2.mo60583d(new AbstractC89171a<AbstractC51064i>(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c.C34044a.C340484 */

                /* renamed from: a */
                final /* synthetic */ C34044a f80519a;

                static {
                    Covode.recordClassIndex(40982);
                }

                {
                    this.f80519a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC51064i invoke() {
                    C34039a a = C34042b.m69627a(new AbstractC89172b<C34039a, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c.C34044a.C340484.C340491 */

                        /* renamed from: a */
                        final /* synthetic */ C340484 f80521a;

                        static {
                            Covode.recordClassIndex(40983);
                        }

                        {
                            this.f80521a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C34039a aVar) {
                            C34039a aVar2 = aVar;
                            C89219l.m154721d(aVar2, "");
                            aVar2.mo60328a(new AbstractC89171a<AbstractC34186b.AbstractC34192d>(this) {
                                /* class com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c.C34044a.C340484.C340491.C340501 */

                                /* renamed from: a */
                                final /* synthetic */ C340491 f80522a;

                                static {
                                    Covode.recordClassIndex(40984);
                                }

                                {
                                    this.f80522a = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                                public final /* bridge */ /* synthetic */ AbstractC34186b.AbstractC34192d invoke() {
                                    return iVar2.f80913a;
                                }
                            });
                            aVar2.mo60335d(new AbstractC89171a<Aweme>(this) {
                                /* class com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c.C34044a.C340484.C340491.C340512 */

                                /* renamed from: a */
                                final /* synthetic */ C340491 f80523a;

                                static {
                                    Covode.recordClassIndex(40985);
                                }

                                {
                                    this.f80523a = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                                public final /* bridge */ /* synthetic */ Aweme invoke() {
                                    return this.f80523a.f80521a.f80519a.f80513a.f80511a;
                                }
                            });
                            aVar2.mo60333c(new AbstractC89171a<Integer>(this) {
                                /* class com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c.C34044a.C340484.C340491.C340523 */

                                /* renamed from: a */
                                final /* synthetic */ C340491 f80524a;

                                static {
                                    Covode.recordClassIndex(40986);
                                }

                                {
                                    this.f80524a = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                                public final /* synthetic */ Integer invoke() {
                                    return Integer.valueOf(this.f80524a.f80521a.f80519a.f80513a.getAdapterPosition());
                                }
                            });
                            aVar2.mo60331b(new AbstractC89171a<AbstractC34186b.AbstractC34189c>(this) {
                                /* class com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c.C34044a.C340484.C340491.C340534 */

                                /* renamed from: a */
                                final /* synthetic */ C340491 f80525a;

                                static {
                                    Covode.recordClassIndex(40987);
                                }

                                {
                                    this.f80525a = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                                public final /* bridge */ /* synthetic */ AbstractC34186b.AbstractC34189c invoke() {
                                    return iVar2;
                                }
                            });
                            return C89391z.f203057a;
                        }
                    });
                    ((C34055d) this.f80519a.f80513a).f80528b = a;
                    return a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34043c(View view, AbstractC51043a aVar, AbstractC51044b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f80529c = C34218g.m69958a(new C34044a(this, aVar, bVar));
    }
}
