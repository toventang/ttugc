package com.gyf.barlibrary;

import com.bytedance.covode.number.Covode;

public interface OnKeyboardListener {
    static {
        Covode.recordClassIndex(33745);
    }

    void onKeyboardChange(boolean z, int i);
}
