package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$onActivityCreated$1 */
public final class PreviewImageScene$onActivityCreated$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C72367e f162233a;

    static {
        Covode.recordClassIndex(85033);
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
        if (this.f162233a.mo114662F().getVisibility() == 0 && (bVar = this.f162233a.f162237f) != null) {
            bVar.mo114649a(R.string.doo);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PreviewImageScene$onActivityCreated$1(C72367e eVar) {
        this.f162233a = eVar;
    }
}
