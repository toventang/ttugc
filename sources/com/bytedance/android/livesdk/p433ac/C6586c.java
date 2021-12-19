package com.bytedance.android.livesdk.p433ac;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p405s.AbstractC6095a;
import com.bytedance.android.live.p405s.p406a.C6096a;
import com.bytedance.android.live.p405s.p406a.C6098b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.bytedance.android.livesdk.ac.c */
public final class C6586c extends AbstractC6583a implements AbstractC6095a {

    /* renamed from: b */
    TextView f16471b;

    /* renamed from: c */
    View f16472c;

    /* renamed from: d */
    public HSImageView f16473d;

    /* renamed from: e */
    Context f16474e;

    /* renamed from: f */
    C6096a f16475f;

    /* renamed from: g */
    long f16476g;

    /* renamed from: h */
    long f16477h;

    /* renamed from: i */
    String f16478i;

    /* renamed from: j */
    private VHeadView f16479j;

    /* renamed from: k */
    private View f16480k;

    /* renamed from: l */
    private TextView f16481l;

    /* renamed from: m */
    private TextView f16482m;

    /* renamed from: n */
    private boolean f16483n;

    static {
        Covode.recordClassIndex(7322);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6095a
    /* renamed from: a */
    public final void mo11956a(C6098b bVar, Exception exc) {
    }

    /* renamed from: a */
    public static boolean m14082a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6095a
    /* renamed from: b */
    public final void mo11958b(Exception exc) {
        this.f16471b.setVisibility(0);
        this.f16472c.setVisibility(8);
        C11264f.m19957a(this.f16474e, exc);
    }

    @Override // com.bytedance.android.livesdk.p433ac.AbstractC6583a
    /* renamed from: a */
    public final <T> void mo12739a(T t) {
        ImageModel o;
        int i;
        int i2;
        int i3;
        if (t instanceof C6096a) {
            T t2 = t;
            this.f16475f = t2;
            if (t2.f15235e != null) {
                C3951p.m9621a(this.f16479j, this.f16475f.f15235e);
            } else {
                this.f16479j.setImageResource(2131234441);
            }
            if (this.f16483n) {
                this.f16480k.setVisibility(0);
                boolean z = this.f16475f.f15237g;
                this.f16471b.setVisibility(0);
                TextView textView = this.f16471b;
                if (z) {
                    i = R.string.egm;
                } else {
                    i = R.string.egg;
                }
                textView.setText(i);
                TextView textView2 = this.f16471b;
                if (z) {
                    i2 = R.drawable.bq3;
                } else {
                    i2 = R.drawable.bpw;
                }
                textView2.setBackground(C3966y.m9665c(i2));
                TextView textView3 = this.f16471b;
                if (z) {
                    i3 = R.color.uu;
                } else {
                    i3 = R.color.a03;
                }
                textView3.setTextColor(C3966y.m9663b(i3));
                this.f16471b.setOnClickListener(new View$OnClickListenerC6588d(this));
            }
            this.f16479j.setOnClickListener(new View$OnClickListenerC6589e(this));
            this.f16482m.setText(this.f16475f.f15234d);
            this.f16481l.setText(this.f16475f.f15233c);
            if (this.f16475f.f15236f == null || (o = this.f16475f.f15236f.mo16485o()) == null || C13603b.m24435a((Collection) o.getUrls())) {
                this.f16473d.setVisibility(8);
                return;
            }
            C3951p.m9627a(this.f16473d, o, 0, new C3951p.AbstractC3953a() {
                /* class com.bytedance.android.livesdk.p433ac.C6586c.C65871 */

                static {
                    Covode.recordClassIndex(7323);
                }

                @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                /* renamed from: a */
                public final void mo9301a(ImageModel imageModel) {
                }

                @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                /* renamed from: a */
                public final void mo9303a(ImageModel imageModel, Exception exc) {
                }

                @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                /* renamed from: a */
                public final void mo9302a(ImageModel imageModel, int i, int i2) {
                    ViewGroup.LayoutParams layoutParams = C6586c.this.f16473d.getLayoutParams();
                    int a = C3966y.m9653a(32.0f);
                    layoutParams.width = a;
                    layoutParams.height = (i2 * a) / i;
                    C6586c.this.f16473d.setLayoutParams(layoutParams);
                }
            });
            this.f16473d.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6095a
    /* renamed from: a */
    public final void mo11957a(boolean z, long j) {
        this.f16472c.setVisibility(8);
        this.f16475f.f15237g = z;
        C6779a.m14563a().mo13053a(new C6590f(j));
    }

    public C6586c(View view, String str, long j, long j2, boolean z) {
        super(view);
        this.f16474e = view.getContext();
        this.f16476g = j;
        this.f16483n = z;
        this.f16477h = j2;
        this.f16478i = str;
        this.f16479j = (VHeadView) view.findViewById(R.id.be7);
        this.f16471b = (TextView) view.findViewById(R.id.a0z);
        this.f16480k = view.findViewById(R.id.a14);
        this.f16472c = view.findViewById(R.id.a16);
        this.f16481l = (TextView) view.findViewById(R.id.csj);
        this.f16482m = (TextView) view.findViewById(R.id.fa1);
        this.f16473d = (HSImageView) view.findViewById(R.id.f_l);
    }
}
