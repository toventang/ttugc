package com.bytedance.android.live.adminsetting;

import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.adminsetting.b */
public interface AbstractC2915b extends AbstractC2953a {
    static {
        Covode.recordClassIndex(3347);
    }

    AbstractC11293v getAdminSettingDialog();

    DialogInterface$OnCancelListenerC0944d getMuteConfirmDialog(AbstractC89172b<? super C3265j, C89391z> bVar);

    Fragment getMuteDurationSettingFragment(View.OnClickListener onClickListener, AbstractC89172b<? super C3265j, C89391z> bVar);

    void reportDefaultMuteDurationChange(String str, C3265j jVar, String str2, long j, Long l);
}
