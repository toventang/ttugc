package com.bytedance.android.livesdk.p424a;

import android.view.View;
import com.bytedance.android.live.adminsetting.AbstractC2915b;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.a */
public class C6418a implements AbstractC2915b {
    static {
        Covode.recordClassIndex(7154);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.adminsetting.AbstractC2915b
    public AbstractC11293v getAdminSettingDialog() {
        return new C6431l();
    }

    @Override // com.bytedance.android.live.adminsetting.AbstractC2915b
    public C6486t getMuteConfirmDialog(AbstractC89172b<? super C3265j, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
        C6486t tVar = new C6486t();
        tVar.f16123a = bVar;
        return tVar;
    }

    @Override // com.bytedance.android.live.adminsetting.AbstractC2915b
    public C6470q getMuteDurationSettingFragment(View.OnClickListener onClickListener, AbstractC89172b<? super C3265j, C89391z> bVar) {
        C89219l.m154721d(onClickListener, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(onClickListener, "");
        C89219l.m154721d(bVar, "");
        C6470q qVar = new C6470q();
        qVar.f16100b = onClickListener;
        qVar.f16101c = bVar;
        return qVar;
    }

    @Override // com.bytedance.android.live.adminsetting.AbstractC2915b
    public void reportDefaultMuteDurationChange(String str, C3265j jVar, String str2, long j, Long l) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str2, "");
        C6501b a = C6501b.C6502a.m13948a("livesdk_mute_default_select").mo12651a("admin_type", str).mo12646a("default_mute_set", jVar.f9352a).mo12651a("event_page", str2).mo12646a("anchor_id", j);
        if (l != null) {
            a.mo12650a("room_id", (Number) l);
        }
        a.mo12655b();
    }
}
