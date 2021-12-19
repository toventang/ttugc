package com.bytedance.ies.xbridge.p1343n.p1345b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18768e;
import com.bytedance.ies.xbridge.p1343n.p1346c.p1347a.C18787a;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18798d;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18800e;
import com.bytedance.ies.xbridge.p1349o.C18806a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.b.e */
public final class C18782e extends AbstractC18768e {
    static {
        Covode.recordClassIndex(21478);
    }

    /* renamed from: com.bytedance.ies.xbridge.n.b.e$b */
    static final class DialogInterface$OnCancelListenerC18784b implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC18768e.AbstractC18769a f44559a;

        static {
            Covode.recordClassIndex(21480);
        }

        DialogInterface$OnCancelListenerC18784b(AbstractC18768e.AbstractC18769a aVar) {
            this.f44559a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            AbstractC18768e.AbstractC18769a aVar = this.f44559a;
            C18800e eVar = new C18800e();
            eVar.f44587a = "mask";
            aVar.mo29811a(eVar, "");
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.n.b.e$a */
    static final class DialogInterface$OnClickListenerC18783a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC18768e.AbstractC18769a f44558a;

        static {
            Covode.recordClassIndex(21479);
        }

        DialogInterface$OnClickListenerC18783a(AbstractC18768e.AbstractC18769a aVar) {
            this.f44558a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC18768e.AbstractC18769a aVar = this.f44558a;
            C18800e eVar = new C18800e();
            eVar.f44587a = "cancel";
            aVar.mo29811a(eVar, "");
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.n.b.e$c */
    static final class DialogInterface$OnClickListenerC18785c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC18768e.AbstractC18769a f44560a;

        static {
            Covode.recordClassIndex(21481);
        }

        DialogInterface$OnClickListenerC18785c(AbstractC18768e.AbstractC18769a aVar) {
            this.f44560a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC18768e.AbstractC18769a aVar = this.f44560a;
            C18800e eVar = new C18800e();
            eVar.f44587a = "confirm";
            aVar.mo29811a(eVar, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18768e
    /* renamed from: a */
    public final void mo29810a(C18798d dVar, AbstractC18768e.AbstractC18769a aVar, EnumC18483e eVar) {
        String str;
        String str2;
        DialogInterface$OnClickListenerC18783a aVar2;
        DialogInterface$OnCancelListenerC18784b bVar;
        IHostStyleUIDepend iHostStyleUIDepend;
        C18465b bVar2;
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Activity a = C18806a.m34902a((Context) mo29616a(Context.class));
        if (a == null) {
            aVar.mo29812a("Context not provided in host");
            return;
        }
        boolean z = dVar.f44585f;
        if (dVar.mo29822b().length() > 0) {
            str = dVar.mo29822b();
        } else {
            str = "confirm";
        }
        String str3 = dVar.f44581b;
        if (str3 == null) {
            C89219l.m154710a("content");
        }
        String str4 = dVar.f44580a;
        if (str4 == null) {
            C89219l.m154710a("title");
        }
        DialogInterface$OnClickListenerC18785c cVar = new DialogInterface$OnClickListenerC18785c(aVar);
        Boolean bool = null;
        if (dVar.f44582c) {
            if (dVar.mo29821a().length() > 0) {
                str2 = dVar.mo29821a();
            } else {
                str2 = "cancel";
            }
            aVar2 = new DialogInterface$OnClickListenerC18783a(aVar);
        } else {
            str2 = null;
            aVar2 = null;
        }
        if (z) {
            bVar = new DialogInterface$OnCancelListenerC18784b(aVar);
        } else {
            bVar = null;
        }
        DialogBuilder dialogBuilder = new DialogBuilder(a, str4, str3, str, cVar, str2, aVar2, bVar, z);
        C18465b bVar3 = (C18465b) mo29616a(C18465b.class);
        if (!((bVar3 == null || (iHostStyleUIDepend = bVar3.f44103f) == null) && ((bVar2 = C18465b.f44096l) == null || (iHostStyleUIDepend = bVar2.f44103f) == null))) {
            bool = iHostStyleUIDepend.showDialog(dialogBuilder);
        }
        if (!C89219l.m154714a((Object) bool, (Object) true)) {
            new C18787a().showDialog(dialogBuilder);
        }
    }
}
