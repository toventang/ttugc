package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.ui.h */
public final class C34688h extends LinkMovementMethod {

    /* renamed from: a */
    public static C34688h f81945a;

    /* renamed from: b */
    private AbstractC34707s f81946b;

    static {
        Covode.recordClassIndex(41675);
    }

    /* renamed from: a */
    private static boolean m70855a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static AbstractC34707s m70854a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), (float) x);
        AbstractC34707s[] sVarArr = (AbstractC34707s[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, AbstractC34707s.class);
        if (sVarArr.length <= 0 || !m70855a(offsetForHorizontal, spannable, sVarArr[0])) {
            return null;
        }
        return sVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                AbstractC34707s a = m70854a(textView, spannable, motionEvent);
                this.f81946b = a;
                if (a != null) {
                    a.f81986a = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f81946b), spannable.getSpanEnd(this.f81946b));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                AbstractC34707s a2 = m70854a(textView, spannable, motionEvent);
                AbstractC34707s sVar = this.f81946b;
                if (!(sVar == null || a2 == sVar)) {
                    sVar.f81986a = false;
                    this.f81946b = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.printStackTrace();
                return false;
            }
        } else {
            AbstractC34707s sVar2 = this.f81946b;
            if (sVar2 != null) {
                sVar2.f81986a = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f81946b = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
