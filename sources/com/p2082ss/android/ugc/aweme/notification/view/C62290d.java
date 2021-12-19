package com.p2082ss.android.ugc.aweme.notification.view;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;

/* renamed from: com.ss.android.ugc.aweme.notification.view.d */
public final class C62290d extends LinkMovementMethod {

    /* renamed from: b */
    private static C62290d f141387b;

    /* renamed from: a */
    private AbstractC33066c f141388a;

    static {
        Covode.recordClassIndex(73070);
    }

    /* renamed from: a */
    public static MovementMethod m112693a() {
        if (f141387b == null) {
            f141387b = new C62290d();
        }
        return f141387b;
    }

    /* renamed from: a */
    private static boolean m112695a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static AbstractC33066c m112694a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), (float) x);
        AbstractC33066c[] cVarArr = (AbstractC33066c[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, AbstractC33066c.class);
        if (cVarArr.length <= 0 || !m112695a(offsetForHorizontal, spannable, cVarArr[0])) {
            return null;
        }
        return cVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                AbstractC33066c a = m112694a(textView, spannable, motionEvent);
                this.f141388a = a;
                if (a != null) {
                    a.f78624d = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f141388a), spannable.getSpanEnd(this.f141388a));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                AbstractC33066c a2 = m112694a(textView, spannable, motionEvent);
                AbstractC33066c cVar = this.f141388a;
                if (!(cVar == null || a2 == cVar)) {
                    cVar.f78624d = false;
                    this.f141388a = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.printStackTrace();
                return false;
            }
        } else {
            AbstractC33066c cVar2 = this.f141388a;
            if (cVar2 != null) {
                cVar2.f78624d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f141388a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
