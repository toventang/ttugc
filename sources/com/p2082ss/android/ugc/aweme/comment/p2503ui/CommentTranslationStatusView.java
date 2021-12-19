package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView */
public class CommentTranslationStatusView extends FrameLayout {

    /* renamed from: a */
    private LinearLayout f87156a;

    /* renamed from: b */
    private ObjectAnimator f87157b;

    /* renamed from: c */
    private boolean f87158c;

    /* renamed from: d */
    private TuxTextView f87159d;

    static {
        Covode.recordClassIndex(44357);
    }

    public void setLoadingText(int i) {
        this.f87159d.setText(i);
    }

    public void setLoading(boolean z) {
        int i;
        if (this.f87158c != z) {
            if (z) {
                this.f87157b.start();
                i = 0;
            } else {
                this.f87157b.cancel();
                i = 8;
            }
            setVisibility(i);
            this.f87158c = z;
        }
    }

    public CommentTranslationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CommentTranslationStatusView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9236);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f87156a = linearLayout;
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.f87156a.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131231206);
        ObjectAnimator duration = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f).setDuration(800L);
        this.f87157b = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.f87157b.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        this.f87156a.addView(imageView);
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.bg);
        this.f87159d = tuxTextView;
        tuxTextView.setText(R.string.am9);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) C13628n.m24520b(getContext(), 1.0f);
        layoutParams2.gravity = 16;
        this.f87159d.setLayoutParams(layoutParams2);
        this.f87156a.addView(this.f87159d);
        addView(this.f87156a);
        setLoading(false);
        MethodCollector.m26664o(9236);
    }
}
