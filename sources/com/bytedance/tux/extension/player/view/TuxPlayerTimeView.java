package com.bytedance.tux.extension.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxPlayerTimeView extends ConstraintLayout {

    /* renamed from: g */
    HashMap f54699g;

    static {
        Covode.recordClassIndex(27039);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TuxPlayerTimeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154719c(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxPlayerTimeView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.biv, this, true);
    }
}
