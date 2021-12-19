package com.bytedance.android.live.wallet.model;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.livesdk.model.EnumC9534ar;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.wallet.model.a */
public abstract class AbstractC6377a {

    /* renamed from: b */
    public ViewGroup f15920b;

    /* renamed from: c */
    public ImageView f15921c;

    /* renamed from: d */
    public TextView f15922d;

    /* renamed from: e */
    public TextView f15923e;

    /* renamed from: f */
    public TextView f15924f;

    /* renamed from: g */
    public TextView f15925g;

    /* renamed from: h */
    public CheckBox f15926h;

    /* renamed from: i */
    public View f15927i;

    /* renamed from: j */
    public long f15928j;

    /* renamed from: k */
    int f15929k;

    /* renamed from: l */
    int f15930l;

    /* renamed from: m */
    String f15931m;

    /* renamed from: n */
    public String f15932n;

    /* renamed from: o */
    public String f15933o;

    /* renamed from: p */
    public boolean f15934p;

    /* renamed from: q */
    public EnumC9534ar f15935q;

    /* renamed from: r */
    public AbstractC6378a f15936r;

    /* renamed from: com.bytedance.android.live.wallet.model.a$a */
    public interface AbstractC6378a {
        static {
            Covode.recordClassIndex(7108);
        }

        /* renamed from: a */
        void mo12277a(AbstractC6377a aVar, boolean z);
    }

    static {
        Covode.recordClassIndex(7107);
    }

    /* renamed from: a */
    public abstract boolean mo12268a();

    /* renamed from: b */
    public abstract void mo12269b();

    /* renamed from: a */
    public final void mo12500a(boolean z) {
        int childCount = this.f15920b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f15920b.getChildAt(i).setEnabled(false);
        }
        if (z) {
            this.f15921c.setImageResource(this.f15929k);
        } else {
            this.f15921c.setImageResource(this.f15930l);
        }
    }

    /* renamed from: a */
    public final void mo12499a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_v, viewGroup, false);
        this.f15920b = viewGroup2;
        this.f15921c = (ImageView) viewGroup2.findViewById(R.id.by9);
        this.f15922d = (TextView) this.f15920b.findViewById(R.id.f0s);
        this.f15923e = (TextView) this.f15920b.findViewById(R.id.f0q);
        this.f15924f = (TextView) this.f15920b.findViewById(R.id.f0r);
        this.f15925g = (TextView) this.f15920b.findViewById(R.id.f28);
        this.f15926h = (CheckBox) this.f15920b.findViewById(R.id.a4l);
        this.f15927i = this.f15920b.findViewById(R.id.amc);
        this.f15921c.setBackgroundResource(this.f15929k);
        this.f15922d.setText(this.f15931m);
        this.f15923e.setText(this.f15932n);
        if (!TextUtils.isEmpty(this.f15933o)) {
            this.f15924f.setVisibility(0);
            this.f15924f.setText(this.f15933o);
        }
        if (this.f15934p) {
            this.f15925g.setVisibility(0);
        }
        if (!mo12268a()) {
            mo12500a(false);
        }
        this.f15920b.setOnClickListener(new View$OnClickListenerC6379b(this));
        mo12269b();
        viewGroup.addView(this.f15920b);
    }

    public AbstractC6377a(long j, int i, int i2, String str, EnumC9534ar arVar) {
        this.f15928j = j;
        this.f15929k = i;
        this.f15930l = i2;
        this.f15931m = str;
        this.f15935q = arVar;
    }
}
