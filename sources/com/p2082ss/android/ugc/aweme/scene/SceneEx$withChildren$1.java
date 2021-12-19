package com.p2082ss.android.ugc.aweme.scene;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.ArrayList;
import p4600h.C89386u;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.scene.SceneEx$withChildren$1 */
public final class SceneEx$withChildren$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC22186b f150763a;

    /* renamed from: b */
    final /* synthetic */ AbstractC89172b f150764b;

    static {
        Covode.recordClassIndex(78898);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            oActivityCreated();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void oActivityCreated() {
        ArrayList<C89386u> arrayList = new ArrayList();
        this.f150764b.invoke(arrayList);
        for (C89386u uVar : arrayList) {
            this.f150763a.mo36387a(((Number) uVar.getFirst()).intValue(), (AbstractC22219j) uVar.getSecond(), (String) uVar.getThird());
        }
    }
}
