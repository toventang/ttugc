package com.p2082ss.android.ugc.aweme.setting.unit.privacy;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68353e;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.RemoveContactsUnit$1 */
public final class RemoveContactsUnit$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ View$OnClickListenerC68647d f153611a;

    static {
        Covode.recordClassIndex(80902);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    RemoveContactsUnit$1(View$OnClickListenerC68647d dVar) {
        this.f153611a = dVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            C68353e eVar = this.f153611a.f153618c;
            if (eVar != null) {
                eVar.ck_();
            }
            AbstractC88412b bVar = this.f153611a.f153623h;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }
}
