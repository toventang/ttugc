package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.C26614b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.d */
public class C72919d extends C26614b {
    static {
        Covode.recordClassIndex(85619);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.google.android.material.bottomsheet.C26614b, androidx.appcompat.app.C0242i
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC72914c(getContext(), getTheme());
    }
}
