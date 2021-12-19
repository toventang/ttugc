package com.p2082ss.android.ugc.aweme.editSticker.p2883f;

import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.method.KeyListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.f.d */
public final class C45886d {
    static {
        Covode.recordClassIndex(54410);
    }

    /* renamed from: a */
    public static final void m88527a(EditText editText) {
        if (editText != null) {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            editText.setCursorVisible(true);
        }
    }

    /* renamed from: a */
    public static final int m88526a(EditText editText, int i) {
        int paddingLeft;
        int i2;
        if (editText == null) {
            return i;
        }
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            paddingLeft = i - editText.getPaddingLeft();
            i2 = editText.getPaddingRight();
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            paddingLeft = ((i - editText.getPaddingLeft()) - editText.getPaddingRight()) - marginLayoutParams.leftMargin;
            i2 = marginLayoutParams.rightMargin;
        }
        return paddingLeft - i2;
    }

    /* renamed from: b */
    private static final int m88530b(EditText editText, int i) {
        if (editText == null) {
            return 0;
        }
        try {
            if (editText.getLayout() == null) {
                return new StaticLayout(editText.getText(), editText.getPaint(), i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
            }
            Layout layout = editText.getLayout();
            C89219l.m154716b(layout, "");
            return layout.getLineCount();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static final void m88529a(EditText editText, boolean z) {
        if (editText != null) {
            if (!z) {
                if (editText.getKeyListener() != null) {
                    editText.setTag(-1043131756, editText.getKeyListener());
                }
                editText.setKeyListener(null);
                return;
            }
            Object tag = editText.getTag(-1043131756);
            if (tag instanceof KeyListener) {
                editText.setKeyListener((KeyListener) tag);
            }
        }
    }

    /* renamed from: a */
    public static final void m88528a(EditText editText, int i, int i2, Integer num) {
        Editable text;
        int a;
        if (editText != null && (text = editText.getText()) != null && text.length() != 0) {
            if (num != null) {
                a = num.intValue();
            } else {
                a = m88526a(editText, editText.getMaxWidth());
            }
            if (m88530b(editText, a) > i || editText.getText().length() > i2) {
                String obj = editText.getText().toString();
                int i3 = i * 50;
                if (obj.length() >= i3) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    obj = obj.substring(0, i3);
                    C89219l.m154716b(obj, "");
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String substring = obj.substring(0, obj.length() - 1);
                C89219l.m154716b(substring, "");
                int length = substring.length() - 1;
                while (length >= 0 && Character.isHighSurrogate(substring.charAt(length))) {
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    substring = substring.substring(0, length);
                    C89219l.m154716b(substring, "");
                    length--;
                }
                editText.setText(substring);
                editText.setSelection(editText.getText().length());
            }
        }
    }
}
