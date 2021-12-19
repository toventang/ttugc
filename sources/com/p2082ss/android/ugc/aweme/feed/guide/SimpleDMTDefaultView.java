package com.p2082ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.SimpleDMTDefaultView */
public class SimpleDMTDefaultView extends FrameLayout {

    /* renamed from: a */
    AutoCenterDmtIconButton f114082a;

    /* renamed from: b */
    ImageView f114083b;

    /* renamed from: c */
    private TuxTextView f114084c;

    /* renamed from: d */
    private TextView f114085d;

    static {
        Covode.recordClassIndex(58427);
    }

    /* renamed from: c */
    public final SimpleDMTDefaultView mo81369c() {
        this.f114084c.setTuxFont(22);
        return this;
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo81362a() {
        this.f114083b.setImageResource(2131232657);
        this.f114083b.setVisibility(0);
        return this;
    }

    /* renamed from: b */
    public final SimpleDMTDefaultView mo81367b() {
        this.f114082a.mo81323a(EnumC17270a.SOLID, -1, "");
        this.f114082a.setVisibility(8);
        return this;
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo81363a(int i) {
        this.f114082a.setMinimumWidth(i);
        return this;
    }

    /* renamed from: b */
    public final SimpleDMTDefaultView mo81368b(int i) {
        this.f114084c.setText(i);
        return this;
    }

    /* renamed from: d */
    public final SimpleDMTDefaultView mo81371d(int i) {
        setPadding(0, i, 0, 0);
        return this;
    }

    /* renamed from: c */
    public final SimpleDMTDefaultView mo81370c(int i) {
        this.f114085d.setText(i);
        return this;
    }

    /* renamed from: e */
    public final SimpleDMTDefaultView mo81372e(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f114085d.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.f114085d.setLayoutParams(marginLayoutParams);
        return this;
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo81364a(View.OnClickListener onClickListener) {
        this.f114082a.setOnClickListener(onClickListener);
        return this;
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo81366a(String str) {
        this.f114084c.setText(str);
        return this;
    }

    public SimpleDMTDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo81365a(EnumC17270a aVar, int i, int i2) {
        this.f114082a.setVisibility(0);
        this.f114082a.mo81322a(aVar, i, i2);
        return this;
    }

    private SimpleDMTDefaultView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(6990);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ahd, this, true);
        this.f114084c = (TuxTextView) findViewById(R.id.f63);
        this.f114085d = (TextView) findViewById(R.id.ev0);
        this.f114082a = (AutoCenterDmtIconButton) findViewById(R.id.bge);
        this.f114083b = (ImageView) findViewById(R.id.blw);
        MethodCollector.m26664o(6990);
    }
}
