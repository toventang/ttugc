package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class ControlButton extends LinearLayout {

    /* renamed from: a */
    public boolean f10371a;

    /* renamed from: b */
    public AbstractC3754a f10372b;

    /* renamed from: c */
    private View f10373c = findViewById(R.id.acn);

    /* renamed from: d */
    private int f10374d;

    /* renamed from: e */
    private int f10375e;

    /* renamed from: f */
    private int f10376f;

    /* renamed from: g */
    private int f10377g;

    /* renamed from: h */
    private int f10378h;

    /* renamed from: i */
    private int f10379i;

    /* renamed from: j */
    private ImageView f10380j = ((ImageView) findViewById(R.id.bwm));

    /* renamed from: k */
    private TextView f10381k = ((TextView) findViewById(R.id.ev0));

    /* renamed from: com.bytedance.android.live.broadcast.widget.ControlButton$a */
    public interface AbstractC3754a {
        static {
            Covode.recordClassIndex(4274);
        }

        /* renamed from: a */
        void mo8401a();
    }

    static {
        Covode.recordClassIndex(4272);
    }

    private int getLayoutId() {
        return R.layout.bdy;
    }

    /* renamed from: a */
    public final void mo9063a() {
        if (this.f10371a) {
            this.f10380j.setImageResource(this.f10375e);
            if (this.f10377g != -1) {
                this.f10381k.setTextColor(getResources().getColor(this.f10377g));
            }
            int i = this.f10379i;
            if (i != -1) {
                this.f10381k.setText(i);
                return;
            }
            return;
        }
        this.f10380j.setImageResource(this.f10374d);
        if (this.f10376f != -1) {
            this.f10381k.setTextColor(getResources().getColor(this.f10376f));
        }
        int i2 = this.f10378h;
        if (i2 != -1) {
            this.f10381k.setText(i2);
        }
    }

    public void setOnViewClickListener(AbstractC3754a aVar) {
        this.f10372b = aVar;
    }

    public void setChecked(boolean z) {
        this.f10371a = z;
        mo9063a();
    }

    public void setDescVisibility(int i) {
        this.f10381k.setVisibility(i);
    }

    public ControlButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(6698);
        inflate(getContext(), getLayoutId(), this);
        this.f10373c.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.live.broadcast.widget.ControlButton.View$OnClickListenerC37531 */

            static {
                Covode.recordClassIndex(4273);
            }

            public final void onClick(View view) {
                ControlButton controlButton = ControlButton.this;
                controlButton.f10371a = !controlButton.f10371a;
                ControlButton.this.mo9063a();
                if (ControlButton.this.f10372b != null) {
                    ControlButton.this.f10372b.mo8401a();
                }
            }
        });
        MethodCollector.m26664o(6698);
    }

    /* renamed from: a */
    public final void mo9064a(int i, int i2, int i3, int i4, boolean z) {
        this.f10374d = i;
        this.f10375e = i2;
        this.f10376f = R.color.x_;
        this.f10377g = R.color.x_;
        this.f10378h = i3;
        this.f10379i = i4;
        this.f10371a = z;
        mo9063a();
    }
}
