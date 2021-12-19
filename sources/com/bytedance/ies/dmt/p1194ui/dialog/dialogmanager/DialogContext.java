package com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager;

import android.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.List;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext */
public class DialogContext implements AbstractC17207b.AbstractC17211c, AbstractC33974au {

    /* renamed from: a */
    public final AbstractC17207b.EnumC17208a f41099a;

    /* renamed from: b */
    public final Enum f41100b;

    /* renamed from: c */
    public final AbstractC1204m f41101c;

    /* renamed from: d */
    public final AbstractC17207b.EnumC17212d f41102d;

    /* renamed from: e */
    public final AbstractC17207b.AbstractC17211c f41103e;

    /* renamed from: f */
    public boolean f41104f;

    /* renamed from: g */
    public boolean f41105g;

    static {
        Covode.recordClassIndex(19664);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
    /* renamed from: a */
    public final void mo27201a() {
        AbstractC17207b.AbstractC17211c cVar = this.f41103e;
        if (cVar != null) {
            cVar.mo27201a();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f41104f = false;
        C17205a.C17206a.f41116a.mo27210a(this.f41099a);
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        AbstractC1204m mVar = this.f41101c;
        if (mVar instanceof Fragment) {
            this.f41104f = ((Fragment) mVar).getTargetFragment().getUserVisibleHint();
        } else {
            this.f41104f = true;
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
        AbstractC1204m mVar = this.f41101c;
        if (mVar instanceof Fragment) {
            this.f41104f = ((Fragment) mVar).getTargetFragment().getUserVisibleHint();
        } else {
            this.f41104f = false;
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext$a */
    public static class C17204a {

        /* renamed from: a */
        public AbstractC17207b.EnumC17208a f41106a;

        /* renamed from: b */
        AbstractC1204m f41107b;

        /* renamed from: c */
        Enum f41108c;

        /* renamed from: d */
        AbstractC17207b.AbstractC17211c f41109d;

        /* renamed from: e */
        public AbstractC17207b.EnumC17212d f41110e;

        static {
            Covode.recordClassIndex(19665);
        }

        public C17204a(AbstractC1204m mVar) {
            this.f41107b = mVar;
        }

        /* renamed from: a */
        public final DialogContext mo27207a(AbstractC17207b.AbstractC17211c cVar) {
            this.f41109d = cVar;
            return new DialogContext(this, (byte) 0);
        }

        /* renamed from: a */
        public final DialogContext mo27208a(AbstractC17207b.AbstractC17211c cVar, boolean z) {
            this.f41109d = cVar;
            return new DialogContext(this, z, (byte) 0);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
    /* renamed from: a */
    public final void mo27202a(List<Integer> list) {
        AbstractC17207b.AbstractC17211c cVar = this.f41103e;
        if (cVar != null) {
            cVar.mo27202a(list);
        }
    }

    private DialogContext(C17204a aVar) {
        this.f41105g = true;
        this.f41099a = aVar.f41106a;
        AbstractC1204m mVar = aVar.f41107b;
        this.f41101c = mVar;
        this.f41103e = aVar.f41109d;
        this.f41100b = aVar.f41108c;
        mVar.getLifecycle().mo4012a(this);
        this.f41102d = aVar.f41110e;
    }

    /* synthetic */ DialogContext(C17204a aVar, byte b) {
        this(aVar);
    }

    private DialogContext(C17204a aVar, boolean z) {
        this(aVar);
        this.f41105g = z;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
    /* renamed from: a */
    public final void mo27203a(List<Integer> list, int i) {
        AbstractC17207b.AbstractC17211c cVar = this.f41103e;
        if (cVar != null) {
            cVar.mo27203a(list, i);
        }
    }

    /* synthetic */ DialogContext(C17204a aVar, boolean z, byte b) {
        this(aVar, z);
    }
}
