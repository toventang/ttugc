package com.p2082ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50561z;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.b */
public final class C50507b extends ScrollingMovementMethod {

    /* renamed from: a */
    public static C50507b f116727a;

    /* renamed from: b */
    public static final C50508a f116728b = new C50508a((byte) 0);

    /* renamed from: c */
    private boolean f116729c = true;

    /* renamed from: d */
    private float f116730d;

    static {
        Covode.recordClassIndex(59654);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.b$a */
    public static final class C50508a {
        static {
            Covode.recordClassIndex(59655);
        }

        private C50508a() {
        }

        /* renamed from: a */
        public static C50507b m94688a() {
            MethodCollector.m26663i(5572);
            if (C50507b.f116727a == null) {
                synchronized (C89204ab.m154669a(C50511e.class)) {
                    try {
                        if (C50507b.f116727a == null) {
                            C50507b.f116727a = new C50507b();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5572);
                        throw th;
                    }
                }
            }
            C50507b bVar = C50507b.f116727a;
            MethodCollector.m26664o(5572);
            return bVar;
        }

        public /* synthetic */ C50508a(byte b) {
            this();
        }
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(spannable, "");
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 2) {
            if (Math.abs(motionEvent.getY() - this.f116730d) > 10.0f) {
                this.f116729c = false;
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
                    if (this.f116729c) {
                        int lineStart = layout.getLineStart(lineForVertical);
                        int lineEnd = layout.getLineEnd(lineForVertical);
                        TextPaint paint = textView.getPaint();
                        C89219l.m154716b(paint, "");
                        if (f <= paint.measureText(textView.getText().subSequence(lineStart, lineEnd).toString())) {
                            C89219l.m154716b(clickableSpanArr, "");
                            ClickableSpan a = C50512f.m94695a(clickableSpanArr);
                            if (C50561z.m94794a(a)) {
                                a.onClick(textView);
                            }
                        }
                    }
                } else if (action == 0) {
                    this.f116730d = motionEvent.getY();
                    C89219l.m154716b(clickableSpanArr, "");
                    C50561z.m94793a(layout, lineForVertical, scrollX, textView, clickableSpanArr);
                    this.f116729c = true;
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
