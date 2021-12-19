package com.bytedance.ies.dmt.p1194ui.titlebar;

import android.content.Context;
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
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.TextTitleBar */
public class TextTitleBar extends AbstractC17250a implements View.OnClickListener {

    /* renamed from: c */
    public DmtTextView f41203c;

    /* renamed from: d */
    public DmtTextView f41204d;

    /* renamed from: e */
    public boolean f41205e;

    /* renamed from: f */
    public View f41206f;

    /* renamed from: g */
    private AbstractC17251a f41207g;

    /* renamed from: h */
    private ImageView f41208h;

    /* renamed from: i */
    private TuxIconView f41209i;

    /* renamed from: j */
    private int f41210j;

    static {
        Covode.recordClassIndex(19715);
    }

    public ImageView getBackBtn() {
        return this.f41208h;
    }

    public DmtTextView getEndText() {
        return this.f41204d;
    }

    public DmtTextView getStartText() {
        return this.f41203c;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        final int a = C13628n.m24504a(getContext());
        post(new Runnable() {
            /* class com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar.RunnableC172491 */

            static {
                Covode.recordClassIndex(19716);
            }

            public final void run() {
                TextTitleBar.this.f41213a.setMaxWidth((int) Math.max((float) (((a / 2) - Math.max(TextTitleBar.this.f41203c.getWidth(), TextTitleBar.this.f41204d.getWidth())) * 2), C13628n.m24520b(TextTitleBar.this.getContext(), 112.0f)));
            }
        });
    }

    public void setOnTitleBarClickListener(AbstractC17251a aVar) {
        this.f41207g = aVar;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a
    public void setDividerLineBackground(int i) {
        this.f41206f.setBackgroundColor(i);
    }

    public void setEndBtnClickListener(View.OnClickListener onClickListener) {
        this.f41209i.setOnClickListener(onClickListener);
    }

    public void setEndBtnImageResource(int i) {
        this.f41209i.setIconRes(i);
    }

    public void setEndText(int i) {
        this.f41204d.setText(i);
    }

    public void setEndTextColor(int i) {
        this.f41204d.setTextColor(i);
    }

    public void setEndTextSize(float f) {
        this.f41204d.setTextSize(f);
    }

    public void setLineBackground(int i) {
        this.f41206f.setBackgroundColor(i);
    }

    public void setStartText(int i) {
        this.f41203c.setText(i);
    }

    public void setStartTextColor(int i) {
        this.f41203c.setTextColor(i);
    }

    public void setStartTextSize(float f) {
        this.f41203c.setTextSize(f);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a
    /* renamed from: a */
    public final void mo27298a(boolean z) {
        int i;
        View view = this.f41206f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setEndBtnVisibility(int i) {
        if (i == 0) {
            this.f41209i.setVisibility(i);
            this.f41204d.setVisibility(8);
        }
    }

    public void setEndText(CharSequence charSequence) {
        this.f41204d.setText(charSequence);
    }

    public void setStartText(CharSequence charSequence) {
        this.f41203c.setText(charSequence);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d, com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a
    /* renamed from: a */
    public final void mo27128a(int i) {
        int i2;
        ImageView imageView = this.f41208h;
        if (C17175b.m31706a(i)) {
            i2 = R.drawable.ccw;
        } else {
            i2 = 2131234964;
        }
        imageView.setImageResource(i2);
    }

    public void setUseBackIcon(boolean z) {
        int i;
        if (this.f41205e != z) {
            this.f41205e = z;
            ImageView imageView = this.f41208h;
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            DmtTextView dmtTextView = this.f41203c;
            if (this.f41205e) {
                i2 = 8;
            }
            dmtTextView.setVisibility(i2);
        }
    }

    public void onClick(View view) {
        if (this.f41207g == null) {
            return;
        }
        if (view.getId() == R.id.pi || view.getId() == R.id.egf) {
            this.f41207g.mo27339a(view);
        } else if (view.getId() == R.id.egn) {
            this.f41207g.mo27340b(view);
        }
    }

    public TextTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private TextTitleBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        inflate(context, R.layout.bjd, this);
        this.f41203c = (DmtTextView) findViewById(R.id.egf);
        this.f41213a = (DmtTextView) findViewById(R.id.title);
        this.f41204d = (DmtTextView) findViewById(R.id.egn);
        this.f41208h = (ImageView) findViewById(R.id.pi);
        this.f41209i = (TuxIconView) findViewById(R.id.avk);
        this.f41206f = findViewById(R.id.c93);
        this.f41208h.setOnClickListener(this);
        this.f41203c.setOnClickListener(this);
        this.f41204d.setOnClickListener(this);
        View$OnTouchListenerC17271b bVar = new View$OnTouchListenerC17271b();
        this.f41208h.setOnTouchListener(bVar);
        this.f41203c.setOnTouchListener(bVar);
        this.f41204d.setOnTouchListener(bVar);
        this.f41209i.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sq, R.attr.sw, R.attr.sx, R.attr.sy, R.attr.sz, R.attr.a2d, R.attr.a2h, R.attr.af_, R.attr.afa, R.attr.afb, R.attr.aj5, R.attr.aj7, R.attr.aj8, R.attr.ask});
            String string = obtainStyledAttributes.getString(10);
            float dimension = obtainStyledAttributes.getDimension(12, C13628n.m24520b(context, 17.0f));
            int color = obtainStyledAttributes.getColor(11, C0643b.m2378c(context, R.color.bx));
            this.f41213a.setText(string);
            this.f41213a.setTextSize(0, dimension);
            this.f41213a.setTextColor(color);
            boolean z = obtainStyledAttributes.getBoolean(13, false);
            this.f41205e = z;
            if (z) {
                this.f41208h.setVisibility(0);
                this.f41203c.setVisibility(8);
            } else {
                String string2 = obtainStyledAttributes.getString(7);
                float dimension2 = obtainStyledAttributes.getDimension(9, C13628n.m24520b(context, 15.0f));
                int color2 = obtainStyledAttributes.getColor(8, C0643b.m2378c(context, R.color.bx));
                this.f41208h.setVisibility(8);
                this.f41203c.setVisibility(0);
                this.f41203c.setText(string2);
                this.f41203c.setTextSize(0, dimension2);
                this.f41203c.setTextColor(color2);
            }
            String string3 = obtainStyledAttributes.getString(1);
            float dimension3 = obtainStyledAttributes.getDimension(3, C13628n.m24520b(context, 15.0f));
            int color3 = obtainStyledAttributes.getColor(2, C0643b.m2378c(context, R.color.bx));
            int i = obtainStyledAttributes.getInt(4, 0);
            this.f41204d.setText(string3);
            this.f41204d.setTextSize(0, dimension3);
            this.f41204d.setTextColor(color3);
            this.f41204d.setVisibility(i);
            if (obtainStyledAttributes.getInt(0, 1) == 1) {
                this.f41204d.setFontWeight(2);
                this.f41204d.setTextColor(C0643b.m2378c(context, R.color.bh));
            } else {
                this.f41204d.setFontWeight(1);
                this.f41204d.setTextColor(C0643b.m2378c(context, R.color.bx));
            }
            this.f41206f.setVisibility(obtainStyledAttributes.getInt(6, 0));
            int color4 = obtainStyledAttributes.getColor(5, C0643b.m2378c(context, R.color.b2));
            this.f41210j = color4;
            this.f41206f.setBackgroundColor(color4);
            obtainStyledAttributes.recycle();
        }
        setColorMode(C17175b.C17176a.f40922a.f40921a);
    }
}
