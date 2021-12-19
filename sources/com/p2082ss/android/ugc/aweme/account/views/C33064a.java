package com.p2082ss.android.ugc.aweme.account.views;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.views.a */
public final class C33064a extends LinkMovementMethod {

    /* renamed from: b */
    private static C33064a f78617b;

    /* renamed from: a */
    private AbstractC33066c f78618a;

    static {
        Covode.recordClassIndex(39873);
    }

    /* renamed from: a */
    public static MovementMethod m67722a() {
        if (f78617b == null) {
            f78617b = new C33064a();
        }
        return f78617b;
    }

    /* renamed from: a */
    private static boolean m67724a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static AbstractC33066c m67723a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), (float) x);
        AbstractC33066c[] cVarArr = (AbstractC33066c[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, AbstractC33066c.class);
        if (cVarArr.length <= 0 || !m67724a(offsetForHorizontal, spannable, cVarArr[0])) {
            return null;
        }
        return cVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            AbstractC33066c a = m67723a(textView, spannable, motionEvent);
            this.f78618a = a;
            if (a != null) {
                a.f78624d = true;
                Selection.setSelection(spannable, spannable.getSpanStart(this.f78618a), spannable.getSpanEnd(this.f78618a));
            }
        } else if (motionEvent.getAction() == 2) {
            AbstractC33066c a2 = m67723a(textView, spannable, motionEvent);
            AbstractC33066c cVar = this.f78618a;
            if (!(cVar == null || a2 == cVar)) {
                cVar.f78624d = false;
                this.f78618a = null;
                Selection.removeSelection(spannable);
            }
        } else {
            AbstractC33066c cVar2 = this.f78618a;
            if (cVar2 != null) {
                cVar2.f78624d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f78618a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
