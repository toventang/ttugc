package com.p2082ss.android.ugc.gamora.recorder.p4293a;

import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p938a.C14151k;
import com.bytedance.creativex.recorder.p938a.C14155m;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4096h.C77981d;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78047b;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.a.a */
public final class C83398a {

    /* renamed from: com.ss.android.ugc.gamora.recorder.a.a$d */
    static final class C83404d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C83404d f186274a = new C83404d();

        static {
            Covode.recordClassIndex(97290);
        }

        C83404d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return 0;
        }
    }

    static {
        Covode.recordClassIndex(97284);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.a.a$b */
    public static final class C83400b implements AbstractC77893a {
        static {
            Covode.recordClassIndex(97286);
        }

        C83400b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a
        /* renamed from: a */
        public final void mo22726a(AbstractC77893a.C77894a aVar) {
            C89219l.m154721d(aVar, "");
            C17197a.C17200a aVar2 = new C17197a.C17200a(aVar.f174765a);
            aVar2.f41070a = aVar.f174766b;
            aVar2.f41071b = aVar.f174767c;
            aVar2.mo27192a(aVar.f174768d, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83401a(aVar), false).mo27196b(aVar.f174769e, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83402b(aVar), false);
            Dialog c = aVar2.mo27193a().mo27185c();
            c.setCanceledOnTouchOutside(false);
            c.setCancelable(false);
            c.show();
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.a.a$b$a */
        static final class DialogInterface$OnClickListenerC83401a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC77893a.C77894a f186271a;

            static {
                Covode.recordClassIndex(97287);
            }

            DialogInterface$OnClickListenerC83401a(AbstractC77893a.C77894a aVar) {
                this.f186271a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC77893a.AbstractC77895b bVar = this.f186271a.f174770f;
                if (bVar != null) {
                    bVar.mo121546a();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.a.a$b$b */
        static final class DialogInterface$OnClickListenerC83402b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC77893a.C77894a f186272a;

            static {
                Covode.recordClassIndex(97288);
            }

            DialogInterface$OnClickListenerC83402b(AbstractC77893a.C77894a aVar) {
                this.f186272a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC77893a.AbstractC77895b bVar = this.f186272a.f174770f;
                if (bVar != null) {
                    bVar.mo121547b();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.a.a$c */
    static final class C83403c extends AbstractC89220m implements AbstractC89172b<AbstractC78056f.AbstractC78057a, C77981d> {

        /* renamed from: a */
        public static final C83403c f186273a = new C83403c();

        static {
            Covode.recordClassIndex(97289);
        }

        C83403c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C77981d invoke(AbstractC78056f.AbstractC78057a aVar) {
            AbstractC78056f.AbstractC78057a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return new C77981d(aVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.a.a$a */
    public static final class C83399a extends C14151k {

        /* renamed from: e */
        final /* synthetic */ C78047b f186265e;

        /* renamed from: f */
        final /* synthetic */ AbstractC77893a f186266f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89171a f186267g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89172b f186268h;

        /* renamed from: i */
        final /* synthetic */ AbstractC22186b f186269i;

        /* renamed from: j */
        final /* synthetic */ C21582f f186270j;

        static {
            Covode.recordClassIndex(97285);
        }

        @Override // com.bytedance.creativex.recorder.p938a.C14151k
        /* renamed from: a */
        public final C14155m mo22701a(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14155m(fVar, this.f186265e, this.f186266f, this.f186267g, this.f186268h);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83399a(C78047b bVar, AbstractC77893a aVar, AbstractC89171a aVar2, AbstractC89172b bVar2, AbstractC22186b bVar3, C21582f fVar, AbstractC22186b bVar4, C21582f fVar2) {
            super(bVar4, fVar2);
            this.f186265e = bVar;
            this.f186266f = aVar;
            this.f186267g = aVar2;
            this.f186268h = bVar2;
            this.f186269i = bVar3;
            this.f186270j = fVar;
        }
    }

    /* renamed from: a */
    public static final C14151k m143790a(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        Object a = fVar.mo35247a(ShortVideoContext.class);
        C89219l.m154716b(a, "");
        AVETParameter j = ((ShortVideoContext) a).mo110034j();
        C89219l.m154716b(j, "");
        return new C83399a(new C78047b(j), new C83400b(), C83404d.f186274a, C83403c.f186273a, bVar, fVar, bVar, fVar);
    }
}
