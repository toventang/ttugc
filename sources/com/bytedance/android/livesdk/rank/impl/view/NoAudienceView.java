package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class NoAudienceView extends ConstraintLayout {
    static {
        Covode.recordClassIndex(12148);
    }

    public NoAudienceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = inflate(getContext(), R.layout.bby, this);
        ((LiveTextView) inflate.findViewById(R.id.ewd)).setText(C3966y.m9658a((int) R.plurals.gm, 2));
    }
}
