package com.p2082ss.android.ugc.aweme.setting.page.diskmanager;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.c */
public final class C68294c extends AbstractView$OnClickListenerC68297d {
    static {
        Covode.recordClassIndex(80508);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.c$b */
    public static final class C68296b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ C68294c f152867a;

        /* renamed from: b */
        final /* synthetic */ Bundle f152868b;

        static {
            Covode.recordClassIndex(80510);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        C68296b(C68294c cVar, Bundle bundle) {
            this.f152867a = cVar;
            this.f152868b = bundle;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            ActivityC0945e g = this.f152867a.mo108773g();
            if (g != null) {
                IDraftService draftService = asyncAVService.uiService().draftService();
                C89219l.m154716b(g, "");
                draftService.enterDraftBoxActivity(g, this.f152868b);
            }
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34796d mo70128b() {
        return mo70128b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c
    /* renamed from: a */
    public final C34796d mo70133a() {
        return new C34796d(mo108768a(R.string.fn5, new Object[0]), null, this, null, false, mo108776j(), mo108775i(), false, null, true, mo108768a(R.string.fnb, new Object[0]), false, null, 127898);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.diskmanager.AbstractView$OnClickListenerC68297d
    /* renamed from: f */
    public final void mo108767f() {
        mo108770a(R.string.fn5);
        mo108771a("DRAFT");
        mo70126a(new C68295a(AVExternalServiceImpl.m113114a().draftService().draftList(false).size()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68294c(AbstractC68195a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.diskmanager.AbstractView$OnClickListenerC68297d
    /* renamed from: a */
    public final void mo108765a(View view) {
        C89219l.m154721d(view, "");
        IExternalService a = AVExternalServiceImpl.m113114a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_disk_manage_mode", true);
        a.asyncService("CleanDraft", new C68296b(this, bundle));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.c$a */
    static final class C68295a extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        final /* synthetic */ int f152866a;

        static {
            Covode.recordClassIndex(80509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68295a(int i) {
            super(1);
            this.f152866a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34796d invoke(C34796d dVar) {
            boolean z;
            C34796d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (this.f152866a > 0) {
                z = true;
            } else {
                z = false;
            }
            return C34796d.m71048a(dVar2, null, null, null, null, z, null, null, null, false, null, false, null, false, false, null, false, 0, 131055);
        }
    }
}
