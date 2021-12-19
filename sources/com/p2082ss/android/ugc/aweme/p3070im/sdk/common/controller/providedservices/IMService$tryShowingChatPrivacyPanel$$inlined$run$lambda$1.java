package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import androidx.fragment.app.AbstractC0952i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.p3219a.C55703a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3216b.View$OnClickListenerC55692a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3217c.AbstractC55699a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3258h.AbstractC56229a;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$1 */
public final class IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$1 implements View$OnClickListenerC55692a.AbstractC55694b {
    final /* synthetic */ AbstractC56229a $callback$inlined;
    final /* synthetic */ C55703a $chatUserSetting$inlined;
    final /* synthetic */ String $enterFrom$inlined;
    final /* synthetic */ AbstractC0952i $fragmentManager$inlined;
    final /* synthetic */ View$OnClickListenerC55692a $this_apply;
    final /* synthetic */ C55219n $this_run$inlined;
    final /* synthetic */ C89233z.C89238e $tuxSheet$inlined;

    static {
        Covode.recordClassIndex(64895);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3216b.View$OnClickListenerC55692a.AbstractC55694b
    public final void onCancel() {
        C23226a.C23228b.m43789a(this.$this_apply, AbstractC55699a.C55700a.f127054a);
        T t = this.$tuxSheet$inlined.element;
        if (t != null) {
            t.dismissAllowingStateLoss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3216b.View$OnClickListenerC55692a.AbstractC55694b
    public final void onSetPrivacyValue(int i) {
        C23226a.C23228b.m43789a(this.$this_apply, new AbstractC55699a.C55701b(i));
        T t = this.$tuxSheet$inlined.element;
        if (t != null) {
            t.dismissAllowingStateLoss();
        }
    }

    IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$1(View$OnClickListenerC55692a aVar, C89233z.C89238e eVar, C55703a aVar2, C55219n nVar, String str, AbstractC56229a aVar3, AbstractC0952i iVar) {
        this.$this_apply = aVar;
        this.$tuxSheet$inlined = eVar;
        this.$chatUserSetting$inlined = aVar2;
        this.$this_run$inlined = nVar;
        this.$enterFrom$inlined = str;
        this.$callback$inlined = aVar3;
        this.$fragmentManager$inlined = iVar;
    }
}
