package com.bytedance.tux.p1719f;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1719f.p1720a.AbstractC23124a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.f.b */
public final class C23136b extends BaseMovementMethod {

    /* renamed from: a */
    public static final C23136b f54757a = new C23136b();

    private C23136b() {
    }

    static {
        Covode.recordClassIndex(27065);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Integer valueOf;
        if (textView == null || spannable == null) {
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null || (valueOf.intValue() != 1 && valueOf.intValue() != 0))) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(totalPaddingTop + textView.getScrollY()), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            C89219l.m154709a((Object) clickableSpanArr, "");
            boolean z = false;
            if (clickableSpanArr.length == 0) {
                Selection.removeSelection(spannable);
            } else {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                if (clickableSpan instanceof AbstractC23124a.AbstractC23125a) {
                    if (valueOf.intValue() == 1) {
                        ((AbstractC23124a.AbstractC23125a) clickableSpan).mo37610b(textView, spannable);
                    } else if (valueOf.intValue() == 0) {
                        ((AbstractC23124a.AbstractC23125a) clickableSpan).mo37609a(textView, spannable);
                    }
                    z = true;
                }
                if (valueOf.intValue() == 1) {
                    clickableSpan.onClick(textView);
                }
                if (z) {
                    textView.invalidate();
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
