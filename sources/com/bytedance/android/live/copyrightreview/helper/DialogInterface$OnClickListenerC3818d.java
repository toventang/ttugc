package com.bytedance.android.live.copyrightreview.helper;

import android.content.DialogInterface;
import com.bytedance.android.live.copyrightreview.ReviewApi;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.copyrightreview.helper.d */
final /* synthetic */ class DialogInterface$OnClickListenerC3818d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final CopyrightViolationHelper f10555a;

    /* renamed from: b */
    private final C88411a f10556b;

    /* renamed from: c */
    private final Room f10557c;

    static {
        Covode.recordClassIndex(4347);
    }

    DialogInterface$OnClickListenerC3818d(CopyrightViolationHelper copyrightViolationHelper, C88411a aVar, Room room) {
        this.f10555a = copyrightViolationHelper;
        this.f10556b = aVar;
        this.f10557c = room;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CopyrightViolationHelper copyrightViolationHelper = this.f10555a;
        C88411a aVar = this.f10556b;
        Room room = this.f10557c;
        copyrightViolationHelper.f10548d = true;
        aVar.mo142945a(((ReviewApi) C5805e.m12718a().mo11572a(ReviewApi.class)).notifyOfConfirmCopyright(room.getId()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3824j(copyrightViolationHelper), new C3825k(copyrightViolationHelper)));
        dialogInterface.dismiss();
        CopyrightViolationHelper.m9377a(room, "confirm", false);
    }
}
