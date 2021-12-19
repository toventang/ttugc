package com.bytedance.ies.xelement.input.p1383b;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import com.bytedance.covode.number.Covode;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.ies.xelement.input.b.d */
public final class C19278d<T> implements SpanWatcher {

    /* renamed from: a */
    private int f45557a;

    /* renamed from: b */
    private int f45558b;

    /* renamed from: c */
    private final AbstractC89277c<T> f45559c;

    static {
        Covode.recordClassIndex(22057);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }

    public C19278d(AbstractC89277c<T> cVar) {
        C89219l.m154719c(cVar, "");
        this.f45559c = cVar;
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        Object[] spans;
        Object d;
        Object[] spans2;
        Object d2;
        if (C89219l.m154714a(obj, Selection.SELECTION_END) && this.f45558b != i3) {
            this.f45558b = i3;
            if (!(spannable == null || (spans2 = spannable.getSpans(i3, i4, C89170a.m154665a(this.f45559c))) == null || (d2 = C89064i.m154503d(spans2)) == null)) {
                int spanStart = spannable.getSpanStart(d2);
                int spanEnd = spannable.getSpanEnd(d2);
                if (Math.abs(this.f45558b - spanEnd) <= Math.abs(this.f45558b - spanStart)) {
                    spanStart = spanEnd;
                }
                Selection.setSelection(spannable, Selection.getSelectionStart(spannable), spanStart);
            }
        }
        if (obj == Selection.SELECTION_START && this.f45557a != i3) {
            this.f45557a = i3;
            if (spannable != null && (spans = spannable.getSpans(i3, i4, C89170a.m154665a(this.f45559c))) != null && (d = C89064i.m154503d(spans)) != null) {
                int spanStart2 = spannable.getSpanStart(d);
                int spanEnd2 = spannable.getSpanEnd(d);
                if (Math.abs(this.f45557a - spanEnd2) <= Math.abs(this.f45557a - spanStart2)) {
                    spanStart2 = spanEnd2;
                }
                Selection.setSelection(spannable, spanStart2, Selection.getSelectionEnd(spannable));
            }
        }
    }
}
