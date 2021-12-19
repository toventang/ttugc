package com.p2082ss.android.ugc.aweme.p2363ba;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ba.a */
public final class C34408a implements InputFilter {

    /* renamed from: a */
    private boolean f81326a;

    /* renamed from: b */
    private final AbstractC34409a f81327b;

    /* renamed from: c */
    private final EditText f81328c;

    /* renamed from: d */
    private final int f81329d;

    /* renamed from: com.ss.android.ugc.aweme.ba.a$a */
    public interface AbstractC34409a {
        static {
            Covode.recordClassIndex(41353);
        }

        /* renamed from: a */
        void mo60828a();
    }

    static {
        Covode.recordClassIndex(41352);
    }

    public C34408a(AbstractC34409a aVar, EditText editText, int i) {
        C89219l.m154721d(editText, "");
        this.f81327b = aVar;
        this.f81328c = editText;
        this.f81329d = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(spanned, "");
        if (i3 == i4 && C89219l.m154714a((Object) charSequence, (Object) "")) {
            return null;
        }
        if (i3 == i4 && this.f81326a) {
            this.f81326a = false;
            return null;
        } else if (i3 >= this.f81329d) {
            return charSequence;
        } else {
            AbstractC34409a aVar = this.f81327b;
            if (aVar != null) {
                aVar.mo60828a();
            }
            this.f81326a = true;
            this.f81328c.setText(spanned);
            return spanned.subSequence(i3, i4);
        }
    }
}
