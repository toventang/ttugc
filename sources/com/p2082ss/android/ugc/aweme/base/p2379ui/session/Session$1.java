package com.p2082ss.android.ugc.aweme.base.p2379ui.session;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.ui.session.Session$1 */
public class Session$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC34709b f81989a;

    /* renamed from: b */
    final /* synthetic */ C34708a f81990b;

    static {
        Covode.recordClassIndex(41695);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        C34708a aVar = this.f81990b;
        aVar.f81992a.remove(this.f81989a);
    }

    Session$1(C34708a aVar, AbstractC34709b bVar) {
        this.f81990b = aVar;
        this.f81989a = bVar;
    }
}
