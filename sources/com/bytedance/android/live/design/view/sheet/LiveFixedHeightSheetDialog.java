package com.bytedance.android.live.design.view.sheet;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public class LiveFixedHeightSheetDialog extends LiveBaseSheetDialog implements AbstractC33974au {
    static {
        Covode.recordClassIndex(4663);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog
    public void onStart() {
        super.onStart();
        mo9590b().mo9582c(3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.appcompat.app.DialogC0240h
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo9569a(false);
    }
}
