package com.p2082ss.android.ugc.aweme.comment.util;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.util.m */
public final class C37208m {

    /* renamed from: a */
    public static final C37208m f87730a = new C37208m();

    private C37208m() {
    }

    static {
        Covode.recordClassIndex(44563);
    }

    /* renamed from: a */
    public static TuxTextView m75197a(Context context) {
        C89219l.m154721d(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.bj);
        return tuxTextView;
    }

    /* renamed from: a */
    public static void m75198a(TextView textView, RelationDynamicLabel relationDynamicLabel) {
        String labelInfo;
        C89219l.m154721d(textView, "");
        if (relationDynamicLabel == null || (labelInfo = relationDynamicLabel.getLabelInfo()) == null || labelInfo.length() <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(labelInfo);
        textView.setVisibility(0);
    }
}
