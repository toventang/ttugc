package com.bytedance.android.livesdk.p424a;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.a.h */
final /* synthetic */ class View$OnClickListenerC6427h implements View.OnClickListener {

    /* renamed from: a */
    private final C6424f f16021a;

    /* renamed from: b */
    private final int f16022b;

    static {
        Covode.recordClassIndex(7163);
    }

    View$OnClickListenerC6427h(C6424f fVar, int i) {
        this.f16021a = fVar;
        this.f16022b = i;
    }

    public final void onClick(View view) {
        String str;
        int i;
        String str2;
        String str3;
        C6424f fVar = this.f16021a;
        int i2 = this.f16022b;
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = C6424f.m13821e();
        }
        if (!C58029j.f132253e) {
            C11226ao.m19882a(fVar.f16012h, (int) R.string.edd);
        } else {
            User user = fVar.f16013i.get(i2);
            String str4 = fVar.f16014j;
            if (user != null) {
                fVar.f16015k = user;
                String a = TextUtils.isEmpty(C6424f.m13820a(user)) ? "" : C6424f.m13820a(user);
                if (str4.equals("activity_banned_talk")) {
                    str = fVar.f16012h.getString(R.string.e41, a);
                    i = R.string.dxf;
                } else {
                    str = fVar.f16012h.getString(R.string.gi9) + " " + a + " " + fVar.f16012h.getString(R.string.gia);
                    i = R.string.e_q;
                }
                Map<String, String> f = fVar.mo12581f();
                f.put("user_id", user.getIdStr());
                DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(fVar.f16012h);
                aVar.f22245b = str;
                aVar.mo15249b(R.string.e_p, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6428i(fVar, f), false).mo15244a(i, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6429j(fVar, f, str4, user), false).mo15247a().show();
                if ("activity_banned_talk".equals(fVar.f16014j)) {
                    str2 = "livesdk_anchor_mute_cancel_toast_show";
                } else {
                    str2 = "livesdk_anchor_blocklist_cancel_toast_show";
                }
                C6501b.C6502a.m13948a(str2).mo12652a(f).mo12655b();
                ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new C6430k(fVar, user, C11115u.m19743a().mo17915b().mo13161c() == fVar.f16017m ? "anchor" : "admin"));
            }
        }
        Map<String, String> f2 = fVar.mo12581f();
        f2.put("user_id", fVar.f16013i.get(i2).getIdStr());
        if ("activity_banned_talk".equals(fVar.f16014j)) {
            str3 = "livesdk_anchor_mute_cancel_click";
        } else {
            str3 = "livesdk_anchor_blocklist_cancel_click";
        }
        C6501b.C6502a.m13948a(str3).mo12652a(f2).mo12655b();
    }
}
