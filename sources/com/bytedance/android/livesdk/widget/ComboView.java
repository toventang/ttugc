package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableFrameLayout;
import com.bytedance.android.livesdk.livesetting.rank.RankComboColorSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

public final class ComboView extends FrameLayout {

    /* renamed from: a */
    private HashMap f27173a;

    static {
        Covode.recordClassIndex(12988);
    }

    public ComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m20113a(int i) {
        if (this.f27173a == null) {
            this.f27173a = new HashMap();
        }
        View view = (View) this.f27173a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f27173a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo18155a(ImageModel imageModel, int i) {
        C89219l.m154721d(imageModel, "");
        C3951p.m9622a((ImageView) m20113a(R.id.a8n), imageModel, 0);
        LiveTextView liveTextView = (LiveTextView) m20113a(R.id.a8g);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(C3966y.m9660a((int) R.string.dro, Integer.valueOf(i)));
        ((ShapeControllableFrameLayout) m20113a(R.id.a8o)).setBackgroundColor(Color.parseColor(RankComboColorSetting.INSTANCE.getValue()));
    }

    private /* synthetic */ ComboView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ComboView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9510);
        LayoutInflater.from(context).inflate(R.layout.bak, this);
        MethodCollector.m26664o(9510);
    }
}
