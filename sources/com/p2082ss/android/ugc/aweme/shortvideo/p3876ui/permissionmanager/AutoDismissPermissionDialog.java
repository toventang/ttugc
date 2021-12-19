package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.AutoDismissPermissionDialog */
public final class AutoDismissPermissionDialog implements AbstractC33974au {

    /* renamed from: a */
    public C23013a f165613a;

    /* renamed from: b */
    public AbstractC89172b<? super C23013a, C89391z> f165614b;

    /* renamed from: c */
    public final ActivityC0945e f165615c;

    /* renamed from: d */
    private final C23023b f165616d;

    static {
        Covode.recordClassIndex(86501);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        C23013a aVar = this.f165613a;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo116236a() {
        if (this.f165613a == null) {
            this.f165615c.getLifecycle().mo4012a(this);
            this.f165616d.mo37481a(new C73763a(this));
            C23013a a = this.f165616d.mo37405a();
            this.f165613a = a;
            if (a != null) {
                a.mo37396b().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.AutoDismissPermissionDialog$a */
    public static final class C73763a extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AutoDismissPermissionDialog f165617a;

        static {
            Covode.recordClassIndex(86502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73763a(AutoDismissPermissionDialog autoDismissPermissionDialog) {
            super(1);
            this.f165617a = autoDismissPermissionDialog;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            AbstractC89172b<? super C23013a, C89391z> bVar;
            C89219l.m154721d(aVar, "");
            C23013a aVar2 = this.f165617a.f165613a;
            if (!(aVar2 == null || (bVar = this.f165617a.f165614b) == null)) {
                bVar.invoke(aVar2);
            }
            this.f165617a.f165613a = null;
            this.f165617a.f165615c.getLifecycle().mo4013b(this.f165617a);
            return C89391z.f203057a;
        }
    }

    public AutoDismissPermissionDialog(ActivityC0945e eVar, C23023b bVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bVar, "");
        this.f165615c = eVar;
        this.f165616d = bVar;
    }
}
