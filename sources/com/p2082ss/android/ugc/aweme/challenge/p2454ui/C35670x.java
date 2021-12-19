package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.x */
public final class C35670x extends LinkMovementMethod {

    /* renamed from: a */
    public static C35670x f84156a;

    /* renamed from: b */
    private AbstractC33066c f84157b;

    static {
        Covode.recordClassIndex(42894);
    }

    /* renamed from: a */
    private static boolean m72817a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static AbstractC33066c m72816a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), (float) x);
        AbstractC33066c[] cVarArr = (AbstractC33066c[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, AbstractC33066c.class);
        if (cVarArr.length <= 0 || !m72817a(offsetForHorizontal, spannable, cVarArr[0])) {
            return null;
        }
        return cVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                AbstractC33066c a = m72816a(textView, spannable, motionEvent);
                this.f84157b = a;
                if (a != null) {
                    a.f78624d = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f84157b), spannable.getSpanEnd(this.f84157b));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                AbstractC33066c a2 = m72816a(textView, spannable, motionEvent);
                AbstractC33066c cVar = this.f84157b;
                if (!(cVar == null || a2 == cVar)) {
                    cVar.f78624d = false;
                    this.f84157b = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.printStackTrace();
                return false;
            }
        } else {
            AbstractC33066c cVar2 = this.f84157b;
            if (cVar2 != null) {
                cVar2.f78624d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f84157b = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
