package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.AVTextView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.views.AlwaysMarqueeTextView */
public final class AlwaysMarqueeTextView extends AVTextView {
    static {
        Covode.recordClassIndex(94735);
    }

    public final boolean isFocused() {
        return true;
    }

    /* renamed from: a */
    private final boolean m141084a() {
        int right = ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        if (right > 0) {
            Layout layout = getLayout();
            Float f = null;
            if (!(layout == null || Float.valueOf(layout.getLineWidth(0)) == null)) {
                Layout layout2 = getLayout();
                if (layout2 == null || (f = Float.valueOf(layout2.getLineWidth(0))) == null) {
                    C89219l.m154715b();
                }
                if (f.floatValue() > ((float) right)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m141083a(boolean z) {
        setSelected(!z);
        setSelected(z);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m141083a(m141084a());
        } else {
            setSelected(false);
        }
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            m141083a(m141084a());
        } else {
            setSelected(false);
        }
    }
}
