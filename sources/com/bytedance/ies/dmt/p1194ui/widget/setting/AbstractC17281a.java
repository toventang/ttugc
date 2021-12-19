package com.bytedance.ies.dmt.p1194ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.a */
public abstract class AbstractC17281a extends RelativeLayout {

    /* renamed from: a */
    private boolean f41419a;

    /* renamed from: e */
    protected String f41420e;

    /* renamed from: f */
    protected View f41421f;

    /* renamed from: g */
    protected RelativeLayout f41422g;

    /* renamed from: h */
    protected FrameLayout f41423h;

    /* renamed from: i */
    protected ViewGroup f41424i;

    /* renamed from: j */
    protected FrameLayout f41425j;

    /* renamed from: k */
    protected TextView f41426k;

    /* renamed from: l */
    protected TextView f41427l;

    /* renamed from: m */
    protected View f41428m;

    /* renamed from: n */
    protected ImageView f41429n;

    /* renamed from: o */
    protected AbstractC17283a f41430o;

    /* renamed from: p */
    protected int f41431p;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.a$a */
    public interface AbstractC17283a {
        static {
            Covode.recordClassIndex(19763);
        }

        /* renamed from: a */
        void mo27494a();
    }

    static {
        Covode.recordClassIndex(19761);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27480a(Context context, AttributeSet attributeSet) {
    }

    /* access modifiers changed from: protected */
    public abstract int getRightLayoutId();

    public TextView getTxtRight() {
        return null;
    }

    public FrameLayout getDecorLayout() {
        return this.f41425j;
    }

    public void setRightTxt(String str) {
        this.f41420e = str;
    }

    public void setStartText(String str) {
        this.f41426k.setText(str);
    }

    public void setOnSettingItemClickListener(AbstractC17283a aVar) {
        this.f41430o = aVar;
        this.f41422g.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a.View$OnClickListenerC172821 */

            static {
                Covode.recordClassIndex(19762);
            }

            public final void onClick(View view) {
                if (AbstractC17281a.this.f41430o != null) {
                    AbstractC17281a.this.f41430o.mo27494a();
                }
            }
        });
    }

    public void setRightLayoutVisibility(int i) {
        ((ViewGroup) findViewById(R.id.dkc)).setVisibility(i);
    }

    public void setSubText(String str) {
        this.f41427l.setVisibility(0);
        this.f41427l.setText(str);
    }

    public void setStartIcon(int i) {
        if (getContext() != null && getContext().getResources() != null) {
            this.f41429n.setImageResource(i);
        }
    }

    public void setStartTextColor(int i) {
        if (getContext() != null) {
            this.f41426k.setTextColor(C0643b.m2378c(getContext(), i));
        }
    }

    public void setSubTextColor(int i) {
        if (getContext() != null) {
            this.f41427l.setTextColor(C0643b.m2378c(getContext(), i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27479a(Context context) {
        View inflate = View.inflate(context, R.layout.bh4, this);
        this.f41421f = inflate;
        this.f41422g = (RelativeLayout) inflate.findViewById(R.id.dnh);
        this.f41426k = (TextView) this.f41421f.findViewById(R.id.eyf);
        this.f41427l = (TextView) this.f41421f.findViewById(R.id.eye);
        this.f41424i = (ViewGroup) this.f41421f.findViewById(R.id.dm5);
        this.f41425j = (FrameLayout) this.f41421f.findViewById(R.id.b4s);
        this.f41429n = (ImageView) this.f41421f.findViewById(R.id.bx7);
        this.f41428m = this.f41421f.findViewById(R.id.f92);
        this.f41423h = (FrameLayout) findViewById(R.id.dk8);
        int rightLayoutId = getRightLayoutId();
        if (rightLayoutId != 0) {
            C1764a.m5927a(LayoutInflater.from(context), rightLayoutId, this.f41423h, true);
        }
    }

    public AbstractC17281a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC17281a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo27479a(context);
        new StringBuilder("getBaseStyle() called with: context = [").append(context).append("], attrs = [").append(attributeSet).append("]");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sv, R.attr.sw, R.attr.vj, R.attr.xj, R.attr.af7, R.attr.af9, R.attr.af_, R.attr.afr, R.attr.afs, R.attr.ai8, R.attr.aif});
        this.f41422g.setBackground(C17177c.m31711c(context));
        this.f41426k.setText(obtainStyledAttributes.getString(6));
        this.f41426k.setTextColor(obtainStyledAttributes.getColor(9, C17177c.m31709a(context)));
        String string = obtainStyledAttributes.getString(5);
        int i2 = 8;
        if (!TextUtils.isEmpty(string)) {
            this.f41427l.setText(string);
            this.f41426k.setMaxLines(1);
            this.f41422g.getLayoutParams().height = (int) C13628n.m24520b(getContext(), 70.0f);
        } else {
            this.f41427l.setVisibility(8);
        }
        int color = obtainStyledAttributes.getColor(7, C17177c.m31710b(context));
        this.f41431p = color;
        this.f41427l.setTextColor(color);
        if (obtainStyledAttributes.hasValue(4)) {
            this.f41429n.setImageResource(obtainStyledAttributes.getResourceId(4, -1));
        } else {
            this.f41429n.setVisibility(8);
            int b = (int) C13628n.m24520b(context, 16.0f);
            int i3 = Build.VERSION.SDK_INT;
            ((ViewGroup.MarginLayoutParams) this.f41424i.getLayoutParams()).setMarginStart(b);
        }
        if (!obtainStyledAttributes.getBoolean(3, false)) {
            this.f41428m.setVisibility(8);
        }
        this.f41428m.setBackgroundColor(C0643b.m2378c(context, R.color.b2));
        this.f41420e = obtainStyledAttributes.getString(1);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        this.f41419a = z;
        setRightLayoutVisibility(!z ? 0 : i2);
        obtainStyledAttributes.recycle();
        mo27480a(context, attributeSet);
    }
}
