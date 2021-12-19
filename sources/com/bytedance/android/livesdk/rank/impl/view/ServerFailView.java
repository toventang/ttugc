package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.rank.impl.p609b.C10379b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class ServerFailView extends ConstraintLayout {

    /* renamed from: g */
    C10379b.AbstractC10380a f25514g;

    /* renamed from: h */
    private TextView f25515h;

    static {
        Covode.recordClassIndex(12151);
    }

    public void setContainer(C10379b.AbstractC10380a aVar) {
        this.f25514g = aVar;
    }

    public ServerFailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.bc0, this);
        TextView textView = (TextView) findViewById(R.id.f6h);
        this.f25515h = textView;
        textView.setOnClickListener(new View$OnClickListenerC10592f(this));
    }
}
