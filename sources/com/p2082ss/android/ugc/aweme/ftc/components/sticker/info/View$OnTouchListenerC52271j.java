package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.j */
final /* synthetic */ class View$OnTouchListenerC52271j implements View.OnTouchListener {

    /* renamed from: a */
    private final C52264i f120460a;

    static {
        Covode.recordClassIndex(61659);
    }

    View$OnTouchListenerC52271j(C52264i iVar) {
        this.f120460a = iVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C52264i iVar = this.f120460a;
        Rect rect = new Rect();
        iVar.f120445p.getHitRect(rect);
        if (motionEvent.getY() < ((float) rect.top) - C13628n.m24520b(iVar.f120432c, 20.0f) || motionEvent.getY() > ((float) rect.bottom) + C13628n.m24520b(iVar.f120432c, 20.0f)) {
            return false;
        }
        float height = (float) (rect.top + (rect.height() / 2));
        float x = motionEvent.getX() - ((float) rect.left);
        if (x < 0.0f) {
            x = 0.0f;
        } else if (x > ((float) rect.width())) {
            x = (float) rect.width();
        }
        return iVar.f120445p.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x, height, motionEvent.getMetaState()));
    }
}
