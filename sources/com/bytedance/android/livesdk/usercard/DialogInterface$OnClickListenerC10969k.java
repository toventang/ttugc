package com.bytedance.android.livesdk.usercard;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.livesdk.p456as.C6878k;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.usercard.k */
final /* synthetic */ class DialogInterface$OnClickListenerC10969k implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final View$OnClickListenerC10962f f26397a;

    /* renamed from: b */
    private final String f26398b;

    static {
        Covode.recordClassIndex(12584);
    }

    DialogInterface$OnClickListenerC10969k(View$OnClickListenerC10962f fVar, String str) {
        this.f26397a = fVar;
        this.f26398b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        View$OnClickListenerC10962f fVar = this.f26397a;
        String str = this.f26398b;
        dialogInterface.dismiss();
        if (fVar.f26368d.getFollowInfo() != null) {
            C10992x xVar = fVar.f26375k;
            Activity activity = fVar.f26366b;
            xVar.f26464a.mo142945a(C11115u.m19743a().mo17915b().mo13152a(((C6878k.C6880b) ((C6878k.AbstractC6879a) new C6878k.C6880b().mo13175a(activity).mo13134a(fVar.f26371g)).mo13174a((int) fVar.f26368d.getFollowInfo().getFollowStatus()).mo13176a(str).mo13178b(fVar.f26372h.getId())).mo13179c()).mo143254a(new C10949af(xVar), new C10950ag(xVar)));
            fVar.f26373i.mo17842a(false, fVar.f26371g, fVar.f26377m, fVar.f26370f, fVar.f26369e, C4384b.C4385a.m10496a().f11958f == fVar.f26368d.getId(), fVar.f26368d.getFollowInfo().getFollowStatus(), fVar.f26374j);
            if (C11199a.m19850a(fVar.f26367c) && fVar.f26372h.getOwner() != null && fVar.f26371g == fVar.f26372h.getOwner().getId()) {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", String.valueOf(fVar.f26372h.getOwner().getId()));
                hashMap.put("room_id", String.valueOf(fVar.f26372h.getId()));
                C11199a.m19849a("live_ad", "unfollow", null, hashMap);
            }
        }
    }
}
