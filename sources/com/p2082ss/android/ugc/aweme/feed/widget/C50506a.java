package com.p2082ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50561z;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.a */
public final class C50506a extends BaseMovementMethod {

    /* renamed from: a */
    private static C50506a f116726a;

    static {
        Covode.recordClassIndex(59653);
    }

    private C50506a() {
    }

    /* renamed from: a */
    public static C50506a m94687a() {
        MethodCollector.m26663i(5884);
        if (f116726a == null) {
            synchronized (C50510d.class) {
                try {
                    if (f116726a == null) {
                        f116726a = new C50506a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5884);
                    throw th;
                }
            }
        }
        C50506a aVar = f116726a;
        MethodCollector.m26664o(5884);
        return aVar;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(totalPaddingTop + textView.getScrollY());
            float f = (float) scrollX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    if (f <= textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString())) {
                        ClickableSpan a = C50512f.m94695a(clickableSpanArr);
                        if (C50561z.m94794a(a)) {
                            a.onClick(textView);
                        }
                    }
                } else if (action == 0) {
                    C50561z.m94793a(layout, lineForVertical, scrollX, textView, clickableSpanArr);
                }
            }
        }
        return true;
    }
}
