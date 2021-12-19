package com.bytedance.ies.dmt.p1194ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
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

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar */
public class NormalTitleBar extends AbstractC17250a implements View.OnClickListener {

    /* renamed from: c */
    private ImageView f41197c;

    /* renamed from: d */
    private ImageView f41198d;

    /* renamed from: e */
    private AbstractC17251a f41199e;

    /* renamed from: f */
    private View f41200f;

    /* renamed from: g */
    private int f41201g;

    /* renamed from: h */
    private DmtTextView f41202h;

    static {
        Covode.recordClassIndex(19714);
    }

    public ImageView getEndBtn() {
        return this.f41198d;
    }

    public ImageView getStartBtn() {
        return this.f41197c;
    }

    public void setOnTitleBarClickListener(AbstractC17251a aVar) {
        this.f41199e = aVar;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a
    public void setDividerLineBackground(int i) {
        this.f41200f.setBackgroundColor(i);
    }

    public void setEndBtnIcon(int i) {
        this.f41198d.setImageResource(i);
    }

    public void setStartBtnIcon(int i) {
        this.f41197c.setImageResource(i);
    }

    public void setStartTextSize(float f) {
        this.f41202h.setTextSize(0, f);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a
    /* renamed from: a */
    public final void mo27298a(boolean z) {
        int i;
        View view = this.f41200f;
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
        ImageView imageView = this.f41197c;
        if (C17175b.m31706a(i)) {
            i2 = R.drawable.ccw;
        } else {
            i2 = R.drawable.ccv;
        }
        imageView.setImageResource(i2);
    }

    public void setStartText(String str) {
        this.f41197c.setVisibility(8);
        this.f41202h.setVisibility(0);
        this.f41202h.setText(str);
    }

    public void onClick(View view) {
        if (this.f41199e == null) {
            return;
        }
        if (view.getId() == R.id.pi || view.getId() == R.id.egf) {
            this.f41199e.mo27339a(view);
        } else if (view.getId() == R.id.dk5) {
            this.f41199e.mo27340b(view);
        }
    }

    public NormalTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NormalTitleBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        int i;
        inflate(context, R.layout.bir, this);
        this.f41197c = (ImageView) findViewById(R.id.pi);
        this.f41213a = (DmtTextView) findViewById(R.id.title);
        this.f41198d = (ImageView) findViewById(R.id.dk5);
        this.f41200f = findViewById(R.id.c93);
        this.f41202h = (DmtTextView) findViewById(R.id.egf);
        this.f41197c.setOnClickListener(this);
        this.f41198d.setOnClickListener(this);
        this.f41202h.setOnClickListener(this);
        View$OnTouchListenerC17271b bVar = new View$OnTouchListenerC17271b();
        this.f41197c.setOnTouchListener(bVar);
        this.f41198d.setOnTouchListener(bVar);
        this.f41202h.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ss, R.attr.a2d, R.attr.a2h, R.attr.aj5, R.attr.aj7, R.attr.aj8});
            String string = obtainStyledAttributes.getString(3);
            float dimension = obtainStyledAttributes.getDimension(5, C13628n.m24520b(context, 17.0f));
            int color = obtainStyledAttributes.getColor(4, C0643b.m2378c(context, R.color.bx));
            this.f41213a.setText(string);
            this.f41213a.setTextSize(0, dimension);
            this.f41213a.setTextColor(color);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            if (resourceId != -1) {
                this.f41198d.setImageResource(resourceId);
            }
            this.f41200f.setVisibility(obtainStyledAttributes.getInt(2, 0));
            Resources resources = getResources();
            if (C17175b.m31708b(null)) {
                i = R.color.b2;
            } else {
                i = R.color.a0;
            }
            int color2 = obtainStyledAttributes.getColor(1, resources.getColor(i));
            this.f41201g = color2;
            this.f41200f.setBackgroundColor(color2);
            obtainStyledAttributes.recycle();
        }
        setColorMode(C17175b.C17176a.f40922a.f40921a);
    }
}
