package com.p2082ss.android.ugc.aweme.ecommerce.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.i */
public class C45564i implements TextWatcher {

    /* renamed from: a */
    private final EditText f106115a;

    /* renamed from: b */
    private final int f106116b;

    /* renamed from: c */
    private final String f106117c;

    /* renamed from: d */
    private final int f106118d;

    static {
        Covode.recordClassIndex(54057);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C89219l.m154721d(charSequence, "");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C89219l.m154721d(charSequence, "");
    }

    public void afterTextChanged(Editable editable) {
        C89219l.m154721d(editable, "");
        if (this.f106116b > 0) {
            String obj = editable.toString();
            int selectionStart = this.f106115a.getSelectionStart();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
            int i = 0;
            String substring = obj.substring(0, selectionStart);
            C89219l.m154716b(substring, "");
            int length = C89361p.m154868a(substring, this.f106117c, "").length();
            StringBuilder sb = new StringBuilder();
            int length2 = obj.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length2; i3++) {
                char charAt = obj.charAt(i3);
                if (charAt != this.f106117c.charAt(0)) {
                    sb.append(charAt);
                    if ((sb.length() - i2) % this.f106116b == 0) {
                        sb.append(this.f106117c);
                        i2++;
                    }
                }
            }
            int lastIndexOf = sb.lastIndexOf(this.f106117c);
            if (lastIndexOf >= 0 && lastIndexOf == sb.length() - 1) {
                sb.deleteCharAt(lastIndexOf);
            }
            String sb2 = sb.toString();
            if (sb2.length() > this.f106118d) {
                C89219l.m154716b(sb2, "");
                int i4 = this.f106118d;
                Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
                sb2 = sb2.substring(0, i4);
                C89219l.m154716b(sb2, "");
            } else {
                C89219l.m154716b(sb2, "");
            }
            int i5 = this.f106116b;
            int i6 = ((length / i5) * (i5 + 1)) + (length % i5);
            if (i6 % (i5 + 1) == 0) {
                i6--;
            }
            int length3 = sb2.length();
            if (i6 >= 0) {
                i = i6;
            }
            if (i <= length3) {
                length3 = i;
            }
            if (!C89219l.m154714a((Object) sb2, (Object) obj)) {
                this.f106115a.setText(sb2);
            }
            this.f106115a.setSelection(length3);
        }
    }

    public C45564i(EditText editText, int i, String str, int i2) {
        int i3;
        C89219l.m154721d(editText, "");
        C89219l.m154721d(str, "");
        this.f106115a = editText;
        this.f106116b = i;
        this.f106117c = str;
        int i4 = (i2 / i) + i2;
        if (i2 % i > 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        this.f106118d = i4 - i3;
    }
}
