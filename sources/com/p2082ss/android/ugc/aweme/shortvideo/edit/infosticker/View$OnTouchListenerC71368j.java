package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.j */
public final /* synthetic */ class View$OnTouchListenerC71368j implements View.OnTouchListener {

    /* renamed from: a */
    private final C71056i f159946a;

    static {
        Covode.recordClassIndex(83893);
    }

    public View$OnTouchListenerC71368j(C71056i iVar) {
        this.f159946a = iVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C71056i iVar = this.f159946a;
        Rect rect = new Rect();
        iVar.f159134p.getHitRect(rect);
        if (motionEvent.getY() < ((float) rect.top) - C13628n.m24520b(iVar.f159121c, 20.0f) || motionEvent.getY() > ((float) rect.bottom) + C13628n.m24520b(iVar.f159121c, 20.0f)) {
            return false;
        }
        float height = (float) (rect.top + (rect.height() / 2));
        float x = motionEvent.getX() - ((float) rect.left);
        if (x < 0.0f) {
            x = 0.0f;
        } else if (x > ((float) rect.width())) {
            x = (float) rect.width();
        }
        return iVar.f159134p.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x, height, motionEvent.getMetaState()));
    }
}
