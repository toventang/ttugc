package com.p2082ss.android.ugc.aweme.setting.services;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.services.IPrivacySettingService;

/* renamed from: com.ss.android.ugc.aweme.setting.services.b */
final /* synthetic */ class DialogInterface$OnClickListenerC68428b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final IPrivacySettingService.AbstractC68424a f153184a;

    static {
        Covode.recordClassIndex(80673);
    }

    DialogInterface$OnClickListenerC68428b(IPrivacySettingService.AbstractC68424a aVar) {
        this.f153184a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IPrivacySettingService.AbstractC68424a aVar = this.f153184a;
        if (aVar != null) {
            aVar.mo108499a();
        }
    }
}
