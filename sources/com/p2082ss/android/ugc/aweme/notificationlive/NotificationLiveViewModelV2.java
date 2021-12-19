package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModelV2 */
public final class NotificationLiveViewModelV2 extends AssemViewModel<C62687y> {

    /* renamed from: j */
    private final C62590u f141780j = new C62590u();

    static {
        Covode.recordClassIndex(73305);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C62687y mo20674f() {
        return new C62687y();
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModelV2$a */
    public static final class C62511a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NotificationLiveViewModelV2 f141781a;

        static {
            Covode.recordClassIndex(73306);
        }

        public C62511a(NotificationLiveViewModelV2 notificationLiveViewModelV2) {
            this.f141781a = notificationLiveViewModelV2;
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModelV2$a$a */
        static final class C62512a extends AbstractC89220m implements AbstractC89172b<C62687y, C62687y> {

            /* renamed from: a */
            final /* synthetic */ C62683w f141782a;

            static {
                Covode.recordClassIndex(73307);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62512a(C62683w wVar) {
                super(1);
                this.f141782a = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C62687y invoke(C62687y yVar) {
                C62687y yVar2 = yVar;
                C89219l.m154721d(yVar2, "");
                return new C62687y(this.f141782a.f142112a.f142115a, this.f141782a.f142114c, new C62562r(), yVar2.f142121d);
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C62683w wVar = (C62683w) ((C20169f) obj).mo33486a();
            if (wVar != null) {
                this.f141781a.mo20662a(new C62512a(wVar));
            }
        }
    }
}
