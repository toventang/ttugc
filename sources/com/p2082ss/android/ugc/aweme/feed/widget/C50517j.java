package com.p2082ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.j */
public final class C50517j extends ScrollingMovementMethod {

    /* renamed from: a */
    public static C50517j f116751a;

    /* renamed from: b */
    public static final C50518a f116752b = new C50518a((byte) 0);

    /* renamed from: c */
    private boolean f116753c = true;

    /* renamed from: d */
    private float f116754d;

    static {
        Covode.recordClassIndex(59664);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.j$a */
    public static final class C50518a {
        static {
            Covode.recordClassIndex(59665);
        }

        private C50518a() {
        }

        /* renamed from: a */
        public static C50517j m94697a() {
            if (C50517j.f116751a == null) {
                C50517j.f116751a = new C50517j();
            }
            return C50517j.f116751a;
        }

        public /* synthetic */ C50518a(byte b) {
            this();
        }
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(spannable, "");
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 2) {
            if (Math.abs(motionEvent.getY() - this.f116754d) > 10.0f) {
                this.f116753c = false;
            }
        } else if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            C89219l.m154716b(layout, "");
            int lineForVertical = layout.getLineForVertical(totalPaddingTop + textView.getScrollY());
            float f = (float) scrollX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    if (this.f116753c) {
                        int lineStart = layout.getLineStart(lineForVertical);
                        int lineEnd = layout.getLineEnd(lineForVertical);
                        TextPaint paint = textView.getPaint();
                        C89219l.m154716b(paint, "");
                        if (f >= ((float) textView.getWidth()) - paint.measureText(textView.getText().subSequence(lineStart, lineEnd).toString())) {
                            C89219l.m154716b(clickableSpanArr, "");
                            C50512f.m94695a(clickableSpanArr).onClick(textView);
                        }
                    }
                } else if (action == 0) {
                    this.f116754d = motionEvent.getY();
                    this.f116753c = true;
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
