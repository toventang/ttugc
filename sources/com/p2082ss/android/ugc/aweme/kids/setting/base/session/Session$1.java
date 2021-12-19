package com.p2082ss.android.ugc.aweme.kids.setting.base.session;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.setting.base.session.Session$1 */
public class Session$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC34709b f131841a;

    /* renamed from: b */
    final /* synthetic */ C57806a f131842b;

    static {
        Covode.recordClassIndex(67808);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        C57806a aVar = this.f131842b;
        aVar.f131844a.remove(this.f131841a);
    }

    Session$1(C57806a aVar, AbstractC34709b bVar) {
        this.f131842b = aVar;
        this.f131841a = bVar;
    }
}
