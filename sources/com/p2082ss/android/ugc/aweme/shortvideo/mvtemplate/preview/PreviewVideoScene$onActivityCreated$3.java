package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C72403n;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene$onActivityCreated$3 */
public final class PreviewVideoScene$onActivityCreated$3 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C72403n f162234a;

    static {
        Covode.recordClassIndex(85034);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        AbstractC72363b bVar;
        if (this.f162234a.f162315h == C72403n.EnumC72405b.FILE_DELETED) {
            AbstractC72363b bVar2 = this.f162234a.f162316i;
            if (bVar2 != null) {
                bVar2.mo114649a(R.string.cc7);
            }
        } else if (this.f162234a.f162315h == C72403n.EnumC72405b.DISABLE_4K && (bVar = this.f162234a.f162316i) != null) {
            bVar.mo114649a(R.string.h3c);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PreviewVideoScene$onActivityCreated$3(C72403n nVar) {
        this.f162234a = nVar;
    }
}
