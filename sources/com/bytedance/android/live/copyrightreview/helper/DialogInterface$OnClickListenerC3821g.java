package com.bytedance.android.live.copyrightreview.helper;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.live.copyrightreview.helper.g */
final /* synthetic */ class DialogInterface$OnClickListenerC3821g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final CopyrightViolationHelper f10564a;

    /* renamed from: b */
    private final Room f10565b;

    /* renamed from: c */
    private final C88411a f10566c;

    /* renamed from: d */
    private final int f10567d;

    static {
        Covode.recordClassIndex(4350);
    }

    DialogInterface$OnClickListenerC3821g(CopyrightViolationHelper copyrightViolationHelper, Room room, C88411a aVar, int i) {
        this.f10564a = copyrightViolationHelper;
        this.f10565b = room;
        this.f10566c = aVar;
        this.f10567d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CopyrightViolationHelper copyrightViolationHelper = this.f10564a;
        Room room = this.f10565b;
        C88411a aVar = this.f10566c;
        int i2 = this.f10567d;
        if (copyrightViolationHelper.f10547c != null) {
            copyrightViolationHelper.f10547c.dispose();
        }
        CopyrightViolationHelper.m9377a(room, "end_live", true);
        dialogInterface.dismiss();
        aVar.mo142945a(copyrightViolationHelper.mo9162a(room, i2, 102));
        CopyrightViolationHelper.m9376a(room);
    }
}
