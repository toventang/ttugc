package com.bytedance.android.livesdk.feed.drawerfeed.p528a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.b */
final /* synthetic */ class View$OnTouchListenerC8535b implements View.OnTouchListener {

    /* renamed from: a */
    private final C8534a f21110a;

    static {
        Covode.recordClassIndex(9390);
    }

    View$OnTouchListenerC8535b(C8534a aVar) {
        this.f21110a = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C8534a aVar = this.f21110a;
        int action = motionEvent.getAction();
        if (action == 0) {
            aVar.f21096a.removeCallbacks(aVar.f21098c);
            return false;
        } else if (action != 3 && action != 1) {
            return false;
        } else {
            aVar.f21096a.postDelayed(aVar.f21098c, 5000);
            return false;
        }
    }
}
