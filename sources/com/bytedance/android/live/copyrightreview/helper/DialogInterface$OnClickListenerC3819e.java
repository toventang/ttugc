package com.bytedance.android.live.copyrightreview.helper;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.copyrightreview.helper.e */
final /* synthetic */ class DialogInterface$OnClickListenerC3819e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final CopyrightViolationHelper f10558a;

    /* renamed from: b */
    private final Room f10559b;

    static {
        Covode.recordClassIndex(4348);
    }

    DialogInterface$OnClickListenerC3819e(CopyrightViolationHelper copyrightViolationHelper, Room room) {
        this.f10558a = copyrightViolationHelper;
        this.f10559b = room;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Room room = this.f10559b;
        dialogInterface.dismiss();
        CopyrightViolationHelper.m9377a(room, "cancel", false);
    }
}
