package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderDescription */
public final class ShoutoutsReviewHeaderDescription extends LinearLayout {

    /* renamed from: a */
    private TuxTextView f167703a;

    static {
        Covode.recordClassIndex(87390);
    }

    public ShoutoutsReviewHeaderDescription(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.e0b);
        C89219l.m154716b(findViewById, "");
        this.f167703a = (TuxTextView) findViewById;
    }

    public final void setDescription(String str) {
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str)) {
            setVisibility(0);
            TuxTextView tuxTextView = this.f167703a;
            if (tuxTextView == null) {
                C89219l.m154710a("tvDescription");
            }
            tuxTextView.setText(str);
        }
    }

    private /* synthetic */ ShoutoutsReviewHeaderDescription(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsReviewHeaderDescription(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2619);
        MethodCollector.m26664o(2619);
    }
}
