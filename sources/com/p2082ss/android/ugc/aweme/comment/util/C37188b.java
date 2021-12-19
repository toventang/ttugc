package com.p2082ss.android.ugc.aweme.comment.util;

import android.text.TextUtils;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.util.b */
public final class C37188b {
    static {
        Covode.recordClassIndex(44543);
    }

    /* renamed from: b */
    public static void m75154b(Comment comment, TextView textView) {
        if (!TextUtils.isEmpty(comment.getLabelText())) {
            String a = C1764a.m5928a(textView.getResources().getString(R.string.akf), new Object[]{""});
            if (!TextUtils.isEmpty(a)) {
                textView.setVisibility(0);
                textView.setText(a);
                if (textView instanceof TuxTextView) {
                    ((TuxTextView) textView).setTuxFont(62);
                    return;
                }
                return;
            }
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public static void m75153a(Comment comment, TextView textView) {
        String labelText = comment.getLabelText();
        if (TextUtils.isEmpty(labelText) || comment.getLabelType() == 9) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(labelText);
        if (comment.getLabelType() == 1) {
            textView.setTextColor(textView.getResources().getColor(R.color.bh));
        } else {
            textView.setTextColor(textView.getResources().getColor(R.color.c5));
        }
        if (textView instanceof TuxTextView) {
            ((TuxTextView) textView).setTuxFont(72);
        }
    }
}
