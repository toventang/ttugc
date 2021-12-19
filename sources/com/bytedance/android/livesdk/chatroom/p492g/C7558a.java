package com.bytedance.android.livesdk.chatroom.p492g;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdkapi.host.AbstractC11818m;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.a */
public final class C7558a {
    static {
        Covode.recordClassIndex(8331);
    }

    /* renamed from: a */
    public static void m15545a(final Activity activity, final String str, final AbstractC11818m mVar) {
        DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(activity);
        aVar.mo15243a(R.string.gm5).mo15249b(R.string.gm3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.bytedance.android.livesdk.chatroom.p492g.C7558a.DialogInterface$OnClickListenerC75602 */

            static {
                Covode.recordClassIndex(8333);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, false).mo15244a(R.string.gm4, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.bytedance.android.livesdk.chatroom.p492g.C7558a.DialogInterface$OnClickListenerC75591 */

            static {
                Covode.recordClassIndex(8332);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Activity activity = activity;
                String str = str;
                ((IHostApp) C6193a.m13435a(IHostApp.class)).startBindMobileFullFragment(activity, "live_detail", "live_detail", mVar);
                HashMap hashMap = new HashMap();
                hashMap.put("bind_page_source", str);
                C6501b.C6502a.m13948a("livesdk_phone_bind_page_show").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
            }
        }, false).f22256m = false;
        aVar.mo15247a().show();
    }
}
