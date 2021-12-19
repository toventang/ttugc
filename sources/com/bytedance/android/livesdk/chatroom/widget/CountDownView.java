package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;

public class CountDownView extends FrameLayout {

    /* renamed from: a */
    public Animation f20161a;

    /* renamed from: b */
    public TextView f20162b;

    /* renamed from: c */
    public AbstractC8132a f20163c;

    /* renamed from: d */
    int f20164d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.CountDownView$a */
    public interface AbstractC8132a {
        static {
            Covode.recordClassIndex(8943);
        }

        /* renamed from: a */
        void mo14239a();
    }

    static {
        Covode.recordClassIndex(8939);
    }

    public void setCountDownListener(AbstractC8132a aVar) {
        this.f20163c = aVar;
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9231);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.q4}, 0, 0);
        this.f20164d = obtainStyledAttributes.getInteger(0, 4000);
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        LiveTextView liveTextView = new LiveTextView(getContext());
        this.f20162b = liveTextView;
        liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        this.f20162b.setTextColor(getResources().getColor(R.color.wc));
        this.f20162b.setTextSize(60.0f);
        this.f20162b.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f20162b, layoutParams);
        this.f20161a = AnimationUtils.loadAnimation(context2, R.anim.ec);
        MethodCollector.m26664o(9231);
    }
}
