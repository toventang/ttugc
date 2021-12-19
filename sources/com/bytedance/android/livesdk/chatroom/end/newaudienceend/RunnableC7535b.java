package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.b */
final /* synthetic */ class RunnableC7535b implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC7532a f18746a;

    static {
        Covode.recordClassIndex(8308);
    }

    RunnableC7535b(View$OnClickListenerC7532a aVar) {
        this.f18746a = aVar;
    }

    public final void run() {
        View$OnClickListenerC7532a aVar = this.f18746a;
        if (aVar.f18728l == null) {
            return;
        }
        if (aVar.f18729m == 0) {
            if (aVar.f18724c != null) {
                C7554p.m15532a(aVar.f18724c, aVar.getContext(), aVar.f18722a, true);
            }
            aVar.f18729m--;
            aVar.f18728l.setText(C3966y.m9657a((int) R.string.e06));
        } else if (aVar.f18729m > 0) {
            aVar.f18729m--;
            aVar.f18728l.setText(C3966y.m9660a((int) R.string.e05, Integer.valueOf(aVar.f18729m)));
            if (aVar.f18730n) {
                aVar.f18723b.removeCallbacksAndMessages(null);
            } else if (aVar.f18723b != null) {
                aVar.f18723b.postDelayed(aVar.f18731o, 1000);
            }
        }
    }
}
