package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.i */
public final /* synthetic */ class View$OnTouchListenerC35977i implements View.OnTouchListener {

    /* renamed from: a */
    private final AbstractC35966c f84947a;

    static {
        Covode.recordClassIndex(43223);
    }

    View$OnTouchListenerC35977i(AbstractC35966c cVar) {
        this.f84947a = cVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC35966c cVar = this.f84947a;
        if (motionEvent.getAction() == 1 && cVar.f84916j != null) {
            String obj = cVar.f84916j.getText().toString();
            if (cVar.f84907a != null) {
                if (!TextUtils.isEmpty(obj)) {
                    cVar.f84907a.mo62812d();
                } else {
                    cVar.f84907a.mo62811c();
                }
            }
            cVar.f84911e.setVisibility(8);
            cVar.f84914h.setVisibility(0);
            cVar.f84913g.setVisibility(8);
            cVar.mo63110f();
            cVar.mo63106b();
            if (cVar.f84924r != null) {
                cVar.f84924r.setVisibility(0);
            }
            if (cVar.f84925s != null) {
                cVar.f84925s.setVisibility(8);
            }
        }
        return false;
    }
}
