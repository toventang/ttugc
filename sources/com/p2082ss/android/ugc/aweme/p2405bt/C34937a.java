package com.p2082ss.android.ugc.aweme.p2405bt;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.bt.a */
public class C34937a extends BaseMovementMethod {

    /* renamed from: a */
    private static C34937a f82423a;

    static {
        Covode.recordClassIndex(41958);
    }

    private C34937a() {
    }

    /* renamed from: a */
    public static C34937a m71327a() {
        MethodCollector.m26663i(11639);
        if (f82423a == null) {
            synchronized (C34937a.class) {
                try {
                    if (f82423a == null) {
                        f82423a = new C34937a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11639);
                    throw th;
                }
            }
        }
        C34937a aVar = f82423a;
        MethodCollector.m26664o(11639);
        return aVar;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(totalPaddingTop + textView.getScrollY()), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr == null || clickableSpanArr.length == 0)) {
                if (action == 1 && (clickableSpan = clickableSpanArr[0]) != null) {
                    clickableSpan.onClick(textView);
                }
                return true;
            }
        }
        return false;
    }
}
