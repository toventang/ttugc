package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.epoxy;

import android.content.Context;
import com.airbnb.epoxy.AbstractC1944n;
import com.airbnb.epoxy.C1943m;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54693b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.ChooseAdminController */
public final class ChooseAdminController extends Typed2EpoxyController<List<? extends IMUser>, IMUser> {
    private final Context context;
    public final AbstractC89172b<IMUser, C89391z> onSelectStateChange;

    static {
        Covode.recordClassIndex(64454);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.ChooseAdminController$a */
    public static final class C54739a extends AbstractC89220m implements AbstractC89172b<IMUser, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChooseAdminController f125477a;

        /* renamed from: b */
        final /* synthetic */ IMUser f125478b;

        static {
            Covode.recordClassIndex(64455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54739a(ChooseAdminController chooseAdminController, IMUser iMUser) {
            super(1);
            this.f125477a = chooseAdminController;
            this.f125478b = iMUser;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(IMUser iMUser) {
            AbstractC89172b<IMUser, C89391z> bVar = this.f125477a.onSelectStateChange;
            C89219l.m154716b(iMUser, "");
            bVar.invoke(iMUser);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.service.model.IMUser, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChooseAdminController(Context context2, AbstractC89172b<? super IMUser, C89391z> bVar) {
        super(C1943m.m6166a(), C1943m.m6166a());
        C89219l.m154721d(context2, "");
        C89219l.m154721d(bVar, "");
        this.context = context2;
        this.onSelectStateChange = bVar;
    }

    /* access modifiers changed from: protected */
    public final void buildModels(List<? extends IMUser> list, IMUser iMUser) {
        String str;
        C89219l.m154721d(list, "");
        for (T t : list) {
            C54693b a = new C54693b().mo91719b((CharSequence) t.getUid()).mo91716a((IMUser) t);
            if (iMUser != null) {
                str = iMUser.getUid();
            } else {
                str = null;
            }
            a.mo91718a(C89219l.m154714a((Object) str, (Object) t.getUid())).mo91717a((AbstractC89172b<? super IMUser, C89391z>) new C54739a(this, iMUser)).mo5787a((AbstractC1944n) this);
        }
    }
}
