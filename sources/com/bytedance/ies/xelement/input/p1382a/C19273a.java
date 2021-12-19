package com.bytedance.ies.xelement.input.p1382a;

import android.text.Editable;
import android.text.Selection;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.input.AbstractC19289g;
import com.bytedance.ies.xelement.text.p1397a.C19420d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.input.a.a */
public final class C19273a implements AbstractC19289g {

    /* renamed from: a */
    public static final C19273a f45547a = new C19273a();

    private C19273a() {
    }

    static {
        Covode.recordClassIndex(22052);
    }

    @Override // com.bytedance.ies.xelement.input.AbstractC19289g
    /* renamed from: a */
    public final boolean mo30680a(Editable editable) {
        C89219l.m154719c(editable, "");
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        Object[] spans = editable.getSpans(selectionStart, selectionEnd, C19420d.class);
        C89219l.m154709a((Object) spans, "");
        int length = spans.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = spans[i];
            if (editable.getSpanEnd(obj) != selectionStart) {
                i++;
            } else if (obj != null) {
                if (selectionStart == selectionEnd) {
                    z = true;
                }
                editable.delete(editable.getSpanStart(obj), editable.getSpanEnd(obj));
            }
        }
        return z;
    }
}
