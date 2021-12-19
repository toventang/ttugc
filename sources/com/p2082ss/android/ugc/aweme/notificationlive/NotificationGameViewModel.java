package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.C20466f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationGameViewModel */
public final class NotificationGameViewModel extends AssemViewModel<C62514b> {

    /* renamed from: j */
    private final AbstractC89244h f141764j = C12646c.m22777a(this, C62504c.f141771a);

    static {
        Covode.recordClassIndex(73291);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationGameViewModel$c */
    static final class C62504c extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC62519f>> {

        /* renamed from: a */
        public static final C62504c f141771a = new C62504c();

        static {
            Covode.recordClassIndex(73296);
        }

        C62504c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC62519f> invoke() {
            return new C62517e();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C62514b mo20674f() {
        return new C62514b();
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationGameViewModel$b */
    static final class C62502b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NotificationGameViewModel f141769a;

        static {
            Covode.recordClassIndex(73294);
        }

        C62502b(NotificationGameViewModel notificationGameViewModel) {
            this.f141769a = notificationGameViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            this.f141769a.mo20662a(new AbstractC89172b<C62514b, C62514b>() {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.NotificationGameViewModel.C62502b.C625031 */

                static {
                    Covode.recordClassIndex(73295);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C62514b invoke(C62514b bVar) {
                    C62514b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    Throwable th = th;
                    C89219l.m154716b(th, "");
                    return C62514b.m112954a(bVar2, new C20466f(th), -1, new C62516d());
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationGameViewModel$a */
    static final class C62500a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NotificationGameViewModel f141765a;

        /* renamed from: b */
        final /* synthetic */ C62520g f141766b;

        static {
            Covode.recordClassIndex(73292);
        }

        C62500a(NotificationGameViewModel notificationGameViewModel, C62520g gVar) {
            this.f141765a = notificationGameViewModel;
            this.f141766b = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C62521h hVar = (C62521h) obj;
            this.f141765a.mo20662a(new AbstractC89172b<C62514b, C62514b>(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.NotificationGameViewModel.C62500a.C625011 */

                /* renamed from: a */
                final /* synthetic */ C62500a f141767a;

                static {
                    Covode.recordClassIndex(73293);
                }

                {
                    this.f141767a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C62514b invoke(C62514b bVar) {
                    C62514b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    return C62514b.m112954a(bVar2, new C20372aj(Boolean.valueOf(this.f141767a.f141766b.f141799a)), hVar.f141803b, new C62516d());
                }
            });
            if (hVar.f141803b == 0) {
                AbstractC81915c.m141874a(new C62522i(this.f141766b.f141800b, this.f141766b.f141799a));
            }
        }
    }

    /* renamed from: a */
    public final void mo100457a(C62520g gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC88412b a = ((AbstractC62519f) ((AbstractC12644a) this.f141764j.getValue()).mo20458a()).mo100480a(gVar.f141799a, gVar.f141800b, gVar.f141801c).mo143254a(new C62500a(this, gVar), new C62502b(this));
        C89219l.m154716b(a, "");
        mo20659a(a);
    }
}
