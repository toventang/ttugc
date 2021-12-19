package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.graphics.Paint;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.tools.utils.KeyboardUtils;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.e */
public final class C71243e {

    /* renamed from: a */
    public static int f159669a = 200;

    /* renamed from: b */
    public static int f159670b;

    /* renamed from: c */
    public static int f159671c = 1;

    /* renamed from: d */
    public static int f159672d = 2;

    /* renamed from: e */
    public static int f159673e = 3;

    /* renamed from: f */
    public static int f159674f;

    static {
        Covode.recordClassIndex(83758);
    }

    /* renamed from: b */
    public static final void m125889b(EditText editText) {
        if (editText != null) {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            KeyboardUtils.m145809b(editText, C63247i.f143610a);
            editText.setSelection(editText.getText().length());
        }
    }

    /* renamed from: a */
    public static final int m125885a(EditText editText) {
        if (editText == null) {
            return 0;
        }
        try {
            String obj = editText.getText().toString();
            Editable text = editText.getText();
            C89219l.m154716b(text, "");
            if (C89361p.m154923c(text, " ")) {
                obj = C89361p.m154898a(obj, new C89269g(0, obj.length() - 2)) + '-';
            }
            return new StaticLayout(obj, editText.getPaint(), editText.getMaxWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static final void m125886a(EditText editText, double d) {
        if (editText != null) {
            if (!TextUtils.isEmpty(editText.getText().toString()) || editText.getHint() == null) {
                editText.setGravity(17);
                m125888a(editText, C71812ep.m126783a(d, C63247i.f143610a), C71812ep.m126783a(d, C63247i.f143610a));
                return;
            }
            Paint paint = new Paint();
            paint.setTextSize(editText.getTextSize());
            paint.setTypeface(editText.getTypeface());
            int measureText = (int) ((((float) editText.getLayoutParams().width) - paint.measureText(editText.getHint().toString())) / 2.0f);
            if (measureText < 0) {
                m125888a(editText, 0, 0);
                editText.setGravity(8388659);
                return;
            }
            m125888a(editText, measureText, 0);
            editText.setGravity(8388627);
        }
    }

    /* renamed from: a */
    public static final void m125887a(EditText editText, int i) {
        Editable text;
        if (editText != null && (text = editText.getText()) != null && text.length() != 0 && m125885a(editText) > i) {
            String obj = editText.getText().toString();
            int i2 = i * 50;
            if (obj.length() >= i2) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                obj = obj.substring(0, i2);
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

    /* renamed from: a */
    private static void m125888a(EditText editText, int i, int i2) {
        if (editText != null) {
            int i3 = Build.VERSION.SDK_INT;
            editText.setPaddingRelative(i, 0, i2, 0);
        }
    }
}
