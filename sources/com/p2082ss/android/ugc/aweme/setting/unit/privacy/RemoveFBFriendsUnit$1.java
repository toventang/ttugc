package com.p2082ss.android.ugc.aweme.setting.unit.privacy;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68356f;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit$1 */
public final class RemoveFBFriendsUnit$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ View$OnClickListenerC68661e f153612a;

    static {
        Covode.recordClassIndex(80903);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    RemoveFBFriendsUnit$1(View$OnClickListenerC68661e eVar) {
        this.f153612a = eVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            C68356f fVar = this.f153612a.f153644c;
            if (fVar != null) {
                fVar.ck_();
            }
            AbstractC88412b bVar = this.f153612a.f153649h;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }
}
