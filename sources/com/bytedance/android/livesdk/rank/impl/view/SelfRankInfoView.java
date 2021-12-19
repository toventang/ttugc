package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.rank.api.model.C10348b;
import com.bytedance.android.livesdk.rank.impl.p609b.C10379b;
import com.bytedance.android.livesdk.rank.impl.widget.EnumC10608a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;

public class SelfRankInfoView extends ConstraintLayout {

    /* renamed from: g */
    public LiveTextView f25502g = ((LiveTextView) findViewById(R.id.esg));

    /* renamed from: h */
    public LiveTextView f25503h = ((LiveTextView) findViewById(R.id.esf));

    /* renamed from: i */
    public ImageView f25504i = ((ImageView) findViewById(R.id.bsp));

    /* renamed from: j */
    public LiveTextView f25505j = ((LiveTextView) findViewById(R.id.ese));

    /* renamed from: k */
    public LiveTextView f25506k = ((LiveTextView) findViewById(R.id.esd));

    /* renamed from: l */
    public View f25507l = findViewById(R.id.x1);

    /* renamed from: m */
    public DataChannel f25508m;

    /* renamed from: n */
    public C10379b.AbstractC10380a f25509n;

    /* renamed from: o */
    public Room f25510o;

    /* renamed from: p */
    public C10348b f25511p;

    /* renamed from: q */
    public String f25512q;

    /* renamed from: r */
    public EnumC10608a f25513r;

    static {
        Covode.recordClassIndex(12150);
    }

    public SelfRankInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.bet, this);
    }
}
