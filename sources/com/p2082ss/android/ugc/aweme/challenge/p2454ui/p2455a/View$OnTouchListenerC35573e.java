package com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.e */
public final class View$OnTouchListenerC35573e implements View.OnTouchListener {

    /* renamed from: a */
    private static View$OnTouchListenerC35573e f83888a;

    static {
        Covode.recordClassIndex(42797);
    }

    /* renamed from: a */
    public static View$OnTouchListenerC35573e m72677a() {
        if (f83888a == null) {
            f83888a = new View$OnTouchListenerC35573e();
        }
        return f83888a;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TextView textView = (TextView) view;
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
        int action = motionEvent.getAction();
        if (action != 1 && action != 0) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(totalPaddingTop + textView.getScrollY()), (float) scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) newSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            return false;
        }
        if (action == 1) {
            clickableSpanArr[0].onClick(textView);
        }
        return true;
    }
}
