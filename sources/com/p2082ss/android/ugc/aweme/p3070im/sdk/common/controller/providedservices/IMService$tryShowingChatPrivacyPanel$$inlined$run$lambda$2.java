package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import android.content.DialogInterface;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.p3219a.C55703a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3217c.AbstractC55699a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3258h.AbstractC56229a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$2 */
final class IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$2 implements DialogInterface.OnDismissListener {
    final /* synthetic */ AbstractC56229a $callback$inlined;
    final /* synthetic */ C55703a $chatUserSetting$inlined;
    final /* synthetic */ String $enterFrom$inlined;
    final /* synthetic */ AbstractC0952i $fragmentManager$inlined;
    final /* synthetic */ C55219n $this_run$inlined;

    static {
        Covode.recordClassIndex(64896);
    }

    IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$2(C55703a aVar, C55219n nVar, String str, AbstractC56229a aVar2, AbstractC0952i iVar) {
        this.$chatUserSetting$inlined = aVar;
        this.$this_run$inlined = nVar;
        this.$enterFrom$inlined = str;
        this.$callback$inlined = aVar2;
        this.$fragmentManager$inlined = iVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        AbstractC56229a aVar;
        C56244a.m102190b("follow_status", "PrivacyPanel dismiss");
        C89219l.m154716b(dialogInterface, "");
        AbstractC23219c a = C23226a.C23228b.m43785a(dialogInterface);
        if ((a instanceof AbstractC55699a.C55701b) && (aVar = this.$callback$inlined) != null) {
            aVar.mo93049a(((AbstractC55699a.C55701b) a).f127055a);
        }
    }
}
