package com.bytedance.android.live.publicscreen.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class WarningInfoView extends RelativeLayout {

    /* renamed from: a */
    private LiveTextView f15116a = ((LiveTextView) findViewById(R.id.f72));

    static {
        Covode.recordClassIndex(6650);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.view.WarningInfoView$a */
    public enum EnumC6037a {
        BLACK,
        WHITE;

        static {
            Covode.recordClassIndex(6651);
        }
    }

    public void setInfoText(CharSequence charSequence) {
        this.f15116a.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo11908a(EnumC6037a aVar) {
        if (aVar == EnumC6037a.BLACK) {
            setBackgroundResource(R.drawable.bvl);
        } else if (aVar == EnumC6037a.WHITE) {
            setBackgroundResource(R.drawable.bvm);
        }
    }

    public WarningInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(5666);
        inflate(getContext(), R.layout.bfg, this);
        MethodCollector.m26664o(5666);
    }
}
