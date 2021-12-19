package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.rank.impl.p609b.C10379b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class NoNetworkView extends ConstraintLayout {

    /* renamed from: g */
    C10379b.AbstractC10380a f25500g;

    /* renamed from: h */
    private TextView f25501h;

    static {
        Covode.recordClassIndex(12149);
    }

    public void setContainer(C10379b.AbstractC10380a aVar) {
        this.f25500g = aVar;
    }

    public NoNetworkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.bbz, this);
        TextView textView = (TextView) findViewById(R.id.f6h);
        this.f25501h = textView;
        textView.setOnClickListener(new View$OnClickListenerC10588b(this));
    }
}
