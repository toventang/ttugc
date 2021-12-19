package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.feed.widget.C50512f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x.z */
public final class C50561z {

    /* renamed from: a */
    public static boolean f116851a = true;

    /* renamed from: b */
    public static boolean f116852b = true;

    /* renamed from: c */
    public static final int[] f116853c = new int[2];

    /* renamed from: d */
    public static final int[] f116854d = new int[2];

    /* renamed from: e */
    public static final C50561z f116855e = new C50561z();

    /* renamed from: f */
    private static boolean f116856f = true;

    /* renamed from: g */
    private static int f116857g;

    private C50561z() {
    }

    static {
        Covode.recordClassIndex(59708);
        int a = C16048b.m29633a().mo25412a(true, "feed_palm_rejection_2", 0);
        if (a == 1) {
        } else if (a != 2) {
            return;
        }
    }

    /* renamed from: a */
    public static boolean m94794a(ClickableSpan clickableSpan) {
        C89219l.m154721d(clickableSpan, "");
        if (!f116856f || f116857g == 0) {
            return true;
        }
        clickableSpan.hashCode();
        if (f116857g == clickableSpan.hashCode()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m94793a(Layout layout, int i, int i2, TextView textView, ClickableSpan[] clickableSpanArr) {
        C89219l.m154721d(layout, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(clickableSpanArr, "");
        if (f116856f) {
            int lineStart = layout.getLineStart(i);
            int lineEnd = layout.getLineEnd(i);
            TextPaint paint = textView.getPaint();
            C89219l.m154716b(paint, "");
            if (((float) i2) <= paint.measureText(textView.getText().subSequence(lineStart, lineEnd).toString())) {
                ClickableSpan a = C50512f.m94695a(clickableSpanArr);
                f116857g = a.hashCode();
                a.hashCode();
            }
        }
    }
}
