package com.p2082ss.android.ugc.aweme.ftc.p3032d;

import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC0216c;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.p2306ah.C33449c;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.d.c */
public final class C52512c implements AbstractC52525e {

    /* renamed from: a */
    private final ActivityC0945e f120921a;

    /* renamed from: b */
    private final AbstractC14193m f120922b;

    static {
        Covode.recordClassIndex(61908);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3032d.AbstractC52525e
    /* renamed from: b */
    public final void mo88301b() {
        this.f120922b.mo22893c(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3032d.AbstractC52525e
    /* renamed from: a */
    public final void mo88298a() {
        C33449c.m68557a();
        this.f120922b.mo22886a(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.c$a */
    static final class C52513a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f120923a;

        static {
            Covode.recordClassIndex(61909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52513a(AbstractC89171a aVar) {
            super(1);
            this.f120923a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37418b(R.string.ct1, C525141.f120924a);
            bVar2.mo37420c(R.string.ct0, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3032d.C52512c.C52513a.C525152 */

                /* renamed from: a */
                final /* synthetic */ C52513a f120925a;

                static {
                    Covode.recordClassIndex(61911);
                }

                {
                    this.f120925a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f120925a.f120923a.invoke();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3032d.AbstractC52525e
    /* renamed from: a */
    public final void mo88299a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        C23028c.m43435a((C23023b) new C23023b(this.f120921a).mo37483b(R.string.csz), new C52513a(aVar)).mo37405a().mo37396b().show();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.c$b */
    static final class DialogInterface$OnClickListenerC52516b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f120926a;

        static {
            Covode.recordClassIndex(61912);
        }

        DialogInterface$OnClickListenerC52516b(AbstractC89171a aVar) {
            this.f120926a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f120926a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.c$c */
    static final class DialogInterface$OnClickListenerC52517c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f120927a;

        static {
            Covode.recordClassIndex(61913);
        }

        DialogInterface$OnClickListenerC52517c(AbstractC89171a aVar) {
            this.f120927a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f120927a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.c$d */
    static final class DialogInterface$OnClickListenerC52518d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f120928a;

        static {
            Covode.recordClassIndex(61914);
        }

        DialogInterface$OnClickListenerC52518d(AbstractC89171a aVar) {
            this.f120928a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f120928a.invoke();
        }
    }

    public C52512c(ActivityC0945e eVar, AbstractC14193m mVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(mVar, "");
        this.f120921a = eVar;
        this.f120922b = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3032d.AbstractC52525e
    /* renamed from: a */
    public final void mo88300a(AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        try {
            new DialogInterfaceC0216c.C0217a(this.f120921a, R.style.wr).mo454b(R.string.c48).mo455b(R.string.a8y, new DialogInterface$OnClickListenerC52516b(aVar)).mo446a(R.string.yc, new DialogInterface$OnClickListenerC52517c(aVar2)).mo459c(R.string.y6, new DialogInterface$OnClickListenerC52518d(aVar3)).mo458b();
        } catch (Exception e) {
            C40970e.m82485a(e.toString());
        }
    }
}
