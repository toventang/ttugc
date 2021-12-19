package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.b */
public final class C57935b extends C57927a {

    /* renamed from: m */
    ImageView f132078m;

    /* renamed from: n */
    public AbstractC57937a f132079n;

    /* renamed from: o */
    private TextView f132080o;

    /* renamed from: p */
    private TextView f132081p;

    /* renamed from: q */
    private View f132082q;

    /* renamed from: r */
    private RadioSettingGroup f132083r;

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.b$a */
    public interface AbstractC57937a {
        static {
            Covode.recordClassIndex(67959);
        }

        /* renamed from: a */
        boolean mo95238a();
    }

    static {
        Covode.recordClassIndex(67957);
    }

    /* renamed from: c */
    private void m104716c() {
        if (this.f132083r == null && (getParent() instanceof RadioSettingGroup)) {
            this.f132083r = (RadioSettingGroup) getParent();
        }
    }

    public final void setOnSettingItemClickListener(AbstractC57937a aVar) {
        this.f132079n = aVar;
    }

    public C57935b(Context context) {
        this(context, (byte) 0);
    }

    public final void setStartSubTextColor(int i) {
        TextView textView = this.f132081p;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setStartText(String str) {
        this.f132080o.setText(str);
    }

    public final void setStartTextColor(int i) {
        TextView textView = this.f132080o;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setStartSubText(String str) {
        TextView textView = this.f132081p;
        if (textView != null) {
            textView.setVisibility(0);
            this.f132081p.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void setSelfChecked(boolean z) {
        this.f132078m.setSelected(z);
        if (z) {
            this.f132078m.setImageDrawable(C17867d.m33078a().getResources().getDrawable(2131232992));
            return;
        }
        this.f132078m.setImageDrawable(null);
    }

    public final void setChecked(boolean z) {
        boolean z2;
        if (!this.f132078m.isSelected()) {
            m104716c();
            if (this.f132083r != null) {
                for (int i = 0; i < this.f132083r.getChildCount(); i++) {
                    if (this.f132083r.getChildAt(i) instanceof C57935b) {
                        C57935b bVar = (C57935b) this.f132083r.getChildAt(i);
                        if (equals(bVar)) {
                            z2 = z;
                        } else if (!z) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bVar.setSelfChecked(z2);
                    }
                }
                return;
            }
            setSelfChecked(z);
        }
    }

    private C57935b(Context context, byte b) {
        this(context, (char) 0);
    }

    private C57935b(Context context, char c) {
        super(context, null);
        MethodCollector.m26663i(12354);
        View inflate = View.inflate(context, R.layout.ac2, this);
        this.f132082q = inflate.findViewById(R.id.dnh);
        this.f132080o = (TextView) inflate.findViewById(R.id.eyf);
        this.f132078m = (ImageView) inflate.findViewById(R.id.c89);
        this.f132081p = (TextView) inflate.findViewById(R.id.eye);
        m104716c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.sv, R.attr.sw, R.attr.vj, R.attr.xj, R.attr.af7, R.attr.af9, R.attr.af_, R.attr.afr, R.attr.afs, R.attr.ai8, R.attr.aif});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 6) {
                this.f132080o.setText(obtainStyledAttributes.getString(index));
            } else if (index == 10) {
                this.f132080o.setTextSize((float) obtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(2, 15.0f, getResources().getDisplayMetrics())));
            } else if (index == 9) {
                this.f132080o.setTextColor(obtainStyledAttributes.getColor(index, C0643b.m2378c(getContext(), R.color.bx)));
            }
        }
        obtainStyledAttributes.recycle();
        this.f132082q.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.C57935b.View$OnClickListenerC579361 */

            static {
                Covode.recordClassIndex(67958);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (C57935b.this.f132079n == null) {
                    C57935b bVar = C57935b.this;
                    bVar.setChecked(!bVar.f132078m.isSelected());
                    return;
                }
                C57935b.this.f132079n.mo95238a();
                C57935b bVar2 = C57935b.this;
                bVar2.setChecked(!bVar2.f132078m.isSelected());
            }
        });
        MethodCollector.m26664o(12354);
    }
}
