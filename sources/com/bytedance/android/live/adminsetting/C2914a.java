package com.bytedance.android.live.adminsetting;

import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.adminsetting.a */
public class C2914a implements AbstractC2915b {
    static {
        Covode.recordClassIndex(3346);
    }

    @Override // com.bytedance.android.live.adminsetting.AbstractC2915b
    public AbstractC11293v getAdminSettingDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.adminsetting.AbstractC2915b
    public DialogInterface$OnCancelListenerC0944d getMuteConfirmDialog(AbstractC89172b<? super C3265j, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.adminsetting.AbstractC2915b
    public Fragment getMuteDurationSettingFragment(View.OnClickListener onClickListener, AbstractC89172b<? super C3265j, C89391z> bVar) {
        C89219l.m154721d(onClickListener, "");
        C89219l.m154721d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.adminsetting.AbstractC2915b
    public void reportDefaultMuteDurationChange(String str, C3265j jVar, String str2, long j, Long l) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str2, "");
    }
}
