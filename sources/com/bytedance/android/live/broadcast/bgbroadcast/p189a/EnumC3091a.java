package com.bytedance.android.live.broadcast.bgbroadcast.p189a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.a */
public enum EnumC3091a {
    CMD_SNAPPED_TIMER_ENDED,
    CMD_HIDE_MSG_WINDOW,
    CMD_ORIENTATION_CHANGED,
    CMD_NEW_COMMON_MSG,
    CMD_NEW_REMIND_MSG,
    CMD_READ_REMIND_MSG,
    CMD_CLICK_FLOAT_BALL,
    CMD_CLICK_MSG_BTN_CHECKED,
    CMD_CLICK_MSG_BTN_UNCHECKED,
    CMD_CTRL_MENU_COLLAPSE,
    CMD_DRAG_MOVE_START,
    CMD_DRAG_ONGOING,
    CMD_DRAG_MOVE_END,
    CMD_TRANSITION_TO_INIT,
    CMD_TRANSITION_TO_HIDDEN,
    CMD_TRANSITION_TO_DESTROY,
    CMD_TRANSITION_TO_FLOATING;
    

    /* renamed from: b */
    private Object f8978b;

    static {
        Covode.recordClassIndex(3572);
    }

    public final Object getParam() {
        return this.f8978b;
    }

    public final void setParam(Object obj) {
        this.f8978b = obj;
    }
}
