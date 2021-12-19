package com.bytedance.android.live.copyrightreview.helper;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.live.copyrightreview.helper.f */
final /* synthetic */ class DialogInterface$OnClickListenerC3820f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final CopyrightViolationHelper f10560a;

    /* renamed from: b */
    private final C88411a f10561b;

    /* renamed from: c */
    private final Room f10562c;

    /* renamed from: d */
    private final int f10563d;

    static {
        Covode.recordClassIndex(4349);
    }

    DialogInterface$OnClickListenerC3820f(CopyrightViolationHelper copyrightViolationHelper, C88411a aVar, Room room, int i) {
        this.f10560a = copyrightViolationHelper;
        this.f10561b = aVar;
        this.f10562c = room;
        this.f10563d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CopyrightViolationHelper copyrightViolationHelper = this.f10560a;
        C88411a aVar = this.f10561b;
        Room room = this.f10562c;
        int i2 = this.f10563d;
        copyrightViolationHelper.f10549e = true;
        if (copyrightViolationHelper.f10547c != null) {
            copyrightViolationHelper.f10547c.dispose();
        }
        aVar.mo142945a(copyrightViolationHelper.mo9162a(room, i2, 101));
        dialogInterface.dismiss();
        CopyrightViolationHelper.m9377a(room, "confirm", true);
    }
}
