package com.bytedance.ies.dmt.p1194ui.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar */
public class ButtonTitleBar extends AbstractC17250a implements View.OnClickListener {

    /* renamed from: c */
    private ImageView f41191c;

    /* renamed from: d */
    private DmtTextView f41192d;

    /* renamed from: e */
    private AbstractC17251a f41193e;

    /* renamed from: f */
    private Drawable f41194f;

    /* renamed from: g */
    private View f41195g;

    /* renamed from: h */
    private int f41196h;

    static {
        Covode.recordClassIndex(19713);
    }

    public DmtTextView getEndBtn() {
        return this.f41192d;
    }

    public ImageView getStartBtn() {
        return this.f41191c;
    }

    public void setOnTitleBarClickListener(AbstractC17251a aVar) {
        this.f41193e = aVar;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a
    public void setDividerLineBackground(int i) {
        this.f41195g.setBackgroundColor(i);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a
    /* renamed from: a */
    public final void mo27298a(boolean z) {
        int i;
        View view = this.f41195g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d, com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a
    /* renamed from: a */
    public final void mo27128a(int i) {
        int i2;
        ImageView imageView = this.f41191c;
        if (C17175b.m31706a(i)) {
            i2 = R.drawable.ccw;
        } else {
            i2 = R.drawable.ccv;
        }
        imageView.setImageResource(i2);
    }

    public void onClick(View view) {
        if (this.f41193e == null) {
            return;
        }
        if (view.getId() == R.id.pi) {
            this.f41193e.mo27339a(view);
        } else if (view.getId() == R.id.dk5) {
            this.f41193e.mo27340b(view);
        }
    }

    public ButtonTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ButtonTitleBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        inflate(context, R.layout.bib, this);
        this.f41191c = (ImageView) findViewById(R.id.pi);
        this.f41213a = (DmtTextView) findViewById(R.id.title);
        this.f41192d = (DmtTextView) findViewById(R.id.dk5);
        this.f41195g = findViewById(R.id.c93);
        this.f41191c.setOnClickListener(this);
        this.f41192d.setOnClickListener(this);
        View$OnTouchListenerC17271b bVar = new View$OnTouchListenerC17271b();
        this.f41191c.setOnTouchListener(bVar);
        this.f41192d.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sm, R.attr.sn, R.attr.so, R.attr.sp, R.attr.sq, R.attr.sr, R.attr.a2d, R.attr.a2h, R.attr.aj5, R.attr.aj7, R.attr.aj8});
            String string = obtainStyledAttributes.getString(8);
            float dimension = obtainStyledAttributes.getDimension(10, C13628n.m24520b(context, 17.0f));
            int color = obtainStyledAttributes.getColor(9, C0643b.m2378c(context, R.color.bx));
            this.f41213a.setText(string);
            this.f41213a.setTextSize(0, dimension);
            this.f41213a.setTextColor(color);
            String string2 = obtainStyledAttributes.getString(0);
            int i = obtainStyledAttributes.getInt(4, 1);
            float dimension2 = obtainStyledAttributes.getDimension(3, C13628n.m24520b(context, 17.0f));
            int color2 = obtainStyledAttributes.getColor(2, 0);
            this.f41194f = obtainStyledAttributes.getDrawable(1);
            int i2 = obtainStyledAttributes.getInt(5, 0);
            this.f41192d.setText(string2);
            if (i == 1) {
                this.f41192d.setTypeface(Typeface.defaultFromStyle(1));
                this.f41192d.setTextColor(C0643b.m2378c(context, R.color.bh));
            } else {
                this.f41192d.setTypeface(Typeface.defaultFromStyle(0));
                this.f41192d.setTextColor(C0643b.m2378c(context, R.color.bx));
            }
            this.f41192d.setTextSize(0, dimension2);
            if (color2 != 0) {
                this.f41192d.setTextColor(color2);
            }
            Drawable drawable = this.f41194f;
            if (drawable != null) {
                this.f41192d.setBackground(drawable);
            }
            this.f41192d.setVisibility(i2);
            this.f41195g.setVisibility(obtainStyledAttributes.getInt(7, 0));
            int color3 = obtainStyledAttributes.getColor(6, C0643b.m2378c(context, R.color.b2));
            this.f41196h = color3;
            this.f41195g.setBackgroundColor(color3);
            obtainStyledAttributes.recycle();
        }
        setColorMode(C17175b.C17176a.f40922a.f40921a);
    }
}
