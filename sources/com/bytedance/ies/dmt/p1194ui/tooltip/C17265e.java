package com.bytedance.ies.dmt.p1194ui.tooltip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17167b;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17168c;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.ies.dmt.ui.tooltip.e */
public final class C17265e implements AbstractC17256a {

    /* renamed from: a */
    public boolean f41274a;

    /* renamed from: b */
    public final Context f41275b;

    /* renamed from: c */
    private View f41276c;

    /* renamed from: d */
    private View f41277d;

    /* renamed from: e */
    private boolean f41278e = true;

    /* renamed from: f */
    private C17257b.AbstractC17259b f41279f;

    /* renamed from: g */
    private C17257b.AbstractC17260c f41280g;

    /* renamed from: h */
    private C17261c f41281h;

    /* renamed from: i */
    private C17262d f41282i;

    /* renamed from: j */
    private final int f41283j;

    /* renamed from: k */
    private int f41284k;

    static {
        Covode.recordClassIndex(19733);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.e$b */
    public static final class RunnableC17267b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17265e f41286a;

        static {
            Covode.recordClassIndex(19735);
        }

        RunnableC17267b(C17265e eVar) {
            this.f41286a = eVar;
        }

        public final void run() {
            this.f41286a.dismiss();
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    public final boolean isShowing() {
        if (!this.f41278e) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.e$a */
    public static final class RunnableC17266a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17265e f41285a;

        static {
            Covode.recordClassIndex(19734);
        }

        RunnableC17266a(C17265e eVar) {
            this.f41285a = eVar;
        }

        public final void run() {
            this.f41285a.mo27365b();
            this.f41285a.f41274a = false;
        }
    }

    /* renamed from: b */
    public final void mo27365b() {
        MethodCollector.m26663i(4392);
        this.f41276c.setVisibility(8);
        ViewGroup viewGroup = this.f41281h.f41237f;
        if (viewGroup != null) {
            viewGroup.removeView(this.f41276c);
        }
        this.f41278e = true;
        C17257b.AbstractC17259b bVar = this.f41279f;
        if (bVar != null) {
            bVar.mo27360a();
            MethodCollector.m26664o(4392);
            return;
        }
        MethodCollector.m26664o(4392);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    public final void dismiss() {
        if (this.f41278e) {
            return;
        }
        if (!this.f41281h.f41246o) {
            mo27365b();
        } else if (!this.f41274a) {
            C17262d dVar = this.f41282i;
            dVar.mo27363a(dVar.f41261c, false);
            this.f41274a = true;
            new Handler().postDelayed(new RunnableC17266a(this), this.f41281h.f41245n);
        }
    }

    /* renamed from: c */
    private final void m31878c() {
        MethodCollector.m26663i(4229);
        ViewGroup viewGroup = this.f41281h.f41237f;
        if (viewGroup != null) {
            viewGroup.addView(this.f41276c);
        }
        this.f41276c.setVisibility(0);
        this.f41278e = false;
        this.f41277d.setX((float) this.f41282i.f41261c.f41270a);
        this.f41277d.setY((float) this.f41282i.f41261c.f41271b);
        C17262d dVar = this.f41282i;
        dVar.mo27363a(dVar.f41261c, true);
        C17257b.AbstractC17260c cVar = this.f41280g;
        if (cVar != null) {
            cVar.mo27361a();
        }
        if (this.f41281h.f41242k != -1001) {
            new Handler().postDelayed(new RunnableC17267b(this), this.f41281h.f41242k);
        }
        MethodCollector.m26664o(4229);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    /* renamed from: a */
    public final void mo27341a() {
        if ((this.f41281h.f41236e != null || (this.f41281h.f41250s >= 0 && this.f41281h.f41251t >= 0)) && this.f41281h.f41237f != null && this.f41278e) {
            C17262d dVar = this.f41282i;
            if (!dVar.mo27364a(dVar.f41261c)) {
                int i = this.f41281h.f41238g;
                if (i == 48) {
                    this.f41281h.f41238g = 80;
                } else if (i == 80) {
                    this.f41281h.f41238g = 48;
                } else if (i == 8388611) {
                    this.f41281h.f41238g = 8388613;
                } else if (i == 8388613) {
                    this.f41281h.f41238g = 8388611;
                }
                m31880e();
                m31879d();
                C17262d dVar2 = this.f41282i;
                if (dVar2.mo27364a(dVar2.f41261c) || this.f41281h.f41244m) {
                    m31878c();
                    return;
                }
                return;
            }
            m31878c();
        }
    }

    /* renamed from: e */
    private final void m31880e() {
        if (this.f41281h.f41238g == 3) {
            this.f41281h.f41238g = 8388611;
        } else if (this.f41281h.f41238g == 5) {
            this.f41281h.f41238g = 8388613;
        }
        if (C80471gb.m139483a(this.f41275b)) {
            if (this.f41281h.f41238g == 8388611) {
                this.f41281h.f41238g = 8388613;
            } else if (this.f41281h.f41238g == 8388613) {
                this.f41281h.f41238g = 8388611;
            }
        }
        this.f41284k = this.f41281h.f41243l;
        if (this.f41283j > this.f41281h.f41243l) {
            this.f41284k = this.f41283j;
        }
        C17262d dVar = this.f41282i;
        if (dVar != null) {
            dVar.f41263e = this.f41284k - this.f41283j;
        }
        if (this.f41281h.f41242k < 0 && this.f41281h.f41242k != -1001) {
            this.f41281h.f41242k = 3000;
        }
        if (this.f41281h.f41245n < 0) {
            this.f41281h.f41245n = 300;
        }
        if (this.f41281h.f41248q == null) {
            this.f41281h.f41248q = new C17167b();
        }
        if (this.f41281h.f41249r == null) {
            this.f41281h.f41249r = new C17168c();
        }
        m31876a(this.f41281h.f41253v);
        m31877a(this.f41281h.f41255x, this.f41281h.f41254w);
    }

    /* renamed from: d */
    private final void m31879d() {
        MethodCollector.m26663i(4322);
        if (C80471gb.m139483a(this.f41275b)) {
            int i = Build.VERSION.SDK_INT;
            RelativeLayout relativeLayout = (RelativeLayout) this.f41276c.findViewById(R.id.acq);
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setLayoutDirection(1);
        }
        if (Build.VERSION.SDK_INT < 21) {
            ImageView imageView = (ImageView) this.f41276c.findViewById(R.id.la);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) this.f41276c.findViewById(R.id.kw);
            C89219l.m154716b(imageView2, "");
            imageView2.setVisibility(8);
            ImageView imageView3 = (ImageView) this.f41276c.findViewById(R.id.l8);
            C89219l.m154716b(imageView3, "");
            imageView3.setVisibility(8);
            ImageView imageView4 = (ImageView) this.f41276c.findViewById(R.id.kz);
            C89219l.m154716b(imageView4, "");
            imageView4.setVisibility(8);
        }
        if (this.f41281h.f41252u != null) {
            ((RelativeLayout) this.f41276c.findViewById(R.id.acq)).removeAllViews();
            ((RelativeLayout) this.f41276c.findViewById(R.id.acq)).addView(this.f41281h.f41252u);
        } else {
            DmtTextView dmtTextView = (DmtTextView) this.f41276c.findViewById(R.id.adm);
            C89219l.m154716b(dmtTextView, "");
            dmtTextView.setText(this.f41281h.f41232a);
            if (this.f41281h.f41230B >= 0) {
                DmtTextView dmtTextView2 = (DmtTextView) this.f41276c.findViewById(R.id.adm);
                C89219l.m154716b(dmtTextView2, "");
                dmtTextView2.setMaxWidth(this.f41281h.f41230B);
            }
            if (this.f41281h.f41233b > 0) {
                ImageView imageView5 = (ImageView) this.f41276c.findViewById(R.id.adc);
                C89219l.m154716b(imageView5, "");
                imageView5.setVisibility(0);
                ((ImageView) this.f41276c.findViewById(R.id.adc)).setImageResource(this.f41281h.f41233b);
            } else {
                ImageView imageView6 = (ImageView) this.f41276c.findViewById(R.id.adc);
                C89219l.m154716b(imageView6, "");
                imageView6.setVisibility(8);
            }
        }
        if (this.f41281h.f41229A) {
            FrameLayout frameLayout = (FrameLayout) this.f41276c.findViewById(R.id.ade);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setBackground(null);
        } else {
            FrameLayout frameLayout2 = (FrameLayout) this.f41276c.findViewById(R.id.ade);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setBackground(C0643b.m2369a(this.f41275b, (int) R.drawable.cca));
        }
        if (this.f41281h.f41235d != 0) {
            Drawable e = C0705a.m2506e(this.f41275b.getResources().getDrawable(R.drawable.cca));
            C0705a.m2494a(e, this.f41281h.f41235d);
            FrameLayout frameLayout3 = (FrameLayout) this.f41276c.findViewById(R.id.ade);
            C89219l.m154716b(frameLayout3, "");
            frameLayout3.setBackground(e);
        }
        if (this.f41281h.f41234c != 0) {
            ((DmtTextView) this.f41276c.findViewById(R.id.adm)).setTextColor(this.f41281h.f41234c);
        }
        if (this.f41281h.f41247p) {
            int i2 = this.f41281h.f41238g;
            if (i2 != 48) {
                if (i2 == 80) {
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.f41276c.findViewById(R.id.l6);
                    C89219l.m154716b(relativeLayout2, "");
                    relativeLayout2.setVisibility(8);
                    RelativeLayout relativeLayout3 = (RelativeLayout) this.f41276c.findViewById(R.id.kx);
                    C89219l.m154716b(relativeLayout3, "");
                    relativeLayout3.setVisibility(8);
                    RelativeLayout relativeLayout4 = (RelativeLayout) this.f41276c.findViewById(R.id.ku);
                    C89219l.m154716b(relativeLayout4, "");
                    relativeLayout4.setVisibility(8);
                    RelativeLayout relativeLayout5 = (RelativeLayout) this.f41276c.findViewById(R.id.l9);
                    C89219l.m154716b(relativeLayout5, "");
                    relativeLayout5.setVisibility(0);
                    if (this.f41281h.f41235d != 0) {
                        Drawable a = C0643b.m2369a(this.f41275b, 2131235004);
                        if (a == null) {
                            C89219l.m154715b();
                        }
                        Drawable e2 = C0705a.m2506e(a);
                        C0705a.m2494a(e2, this.f41281h.f41235d);
                        ((ImageView) this.f41276c.findViewById(R.id.l_)).setImageDrawable(e2);
                    }
                } else if (i2 == 8388611) {
                    RelativeLayout relativeLayout6 = (RelativeLayout) this.f41276c.findViewById(R.id.l9);
                    C89219l.m154716b(relativeLayout6, "");
                    relativeLayout6.setVisibility(8);
                    RelativeLayout relativeLayout7 = (RelativeLayout) this.f41276c.findViewById(R.id.l6);
                    C89219l.m154716b(relativeLayout7, "");
                    relativeLayout7.setVisibility(8);
                    RelativeLayout relativeLayout8 = (RelativeLayout) this.f41276c.findViewById(R.id.ku);
                    C89219l.m154716b(relativeLayout8, "");
                    relativeLayout8.setVisibility(8);
                    RelativeLayout relativeLayout9 = (RelativeLayout) this.f41276c.findViewById(R.id.kx);
                    C89219l.m154716b(relativeLayout9, "");
                    relativeLayout9.setVisibility(0);
                    if (this.f41281h.f41235d != 0) {
                        Drawable a2 = C0643b.m2369a(this.f41275b, 2131235005);
                        if (a2 == null) {
                            C89219l.m154715b();
                        }
                        Drawable e3 = C0705a.m2506e(a2);
                        C0705a.m2494a(e3, this.f41281h.f41235d);
                        ((ImageView) this.f41276c.findViewById(R.id.ky)).setImageDrawable(e3);
                        MethodCollector.m26664o(4322);
                        return;
                    }
                } else if (i2 == 8388613) {
                    RelativeLayout relativeLayout10 = (RelativeLayout) this.f41276c.findViewById(R.id.l9);
                    C89219l.m154716b(relativeLayout10, "");
                    relativeLayout10.setVisibility(8);
                    RelativeLayout relativeLayout11 = (RelativeLayout) this.f41276c.findViewById(R.id.kx);
                    C89219l.m154716b(relativeLayout11, "");
                    relativeLayout11.setVisibility(8);
                    RelativeLayout relativeLayout12 = (RelativeLayout) this.f41276c.findViewById(R.id.ku);
                    C89219l.m154716b(relativeLayout12, "");
                    relativeLayout12.setVisibility(8);
                    RelativeLayout relativeLayout13 = (RelativeLayout) this.f41276c.findViewById(R.id.l6);
                    C89219l.m154716b(relativeLayout13, "");
                    relativeLayout13.setVisibility(0);
                    if (this.f41281h.f41235d != 0) {
                        Drawable a3 = C0643b.m2369a(this.f41275b, 2131235005);
                        if (a3 == null) {
                            C89219l.m154715b();
                        }
                        Drawable e4 = C0705a.m2506e(a3);
                        C0705a.m2494a(e4, this.f41281h.f41235d);
                        ((ImageView) this.f41276c.findViewById(R.id.l7)).setImageDrawable(e4);
                        MethodCollector.m26664o(4322);
                        return;
                    }
                }
                MethodCollector.m26664o(4322);
                return;
            }
            RelativeLayout relativeLayout14 = (RelativeLayout) this.f41276c.findViewById(R.id.l9);
            C89219l.m154716b(relativeLayout14, "");
            relativeLayout14.setVisibility(8);
            RelativeLayout relativeLayout15 = (RelativeLayout) this.f41276c.findViewById(R.id.l6);
            C89219l.m154716b(relativeLayout15, "");
            relativeLayout15.setVisibility(8);
            RelativeLayout relativeLayout16 = (RelativeLayout) this.f41276c.findViewById(R.id.kx);
            C89219l.m154716b(relativeLayout16, "");
            relativeLayout16.setVisibility(8);
            RelativeLayout relativeLayout17 = (RelativeLayout) this.f41276c.findViewById(R.id.ku);
            C89219l.m154716b(relativeLayout17, "");
            relativeLayout17.setVisibility(0);
            if (this.f41281h.f41235d != 0) {
                Drawable a4 = C0643b.m2369a(this.f41275b, 2131235004);
                if (a4 == null) {
                    C89219l.m154715b();
                }
                Drawable e5 = C0705a.m2506e(a4);
                C0705a.m2494a(e5, this.f41281h.f41235d);
                ((ImageView) this.f41276c.findViewById(R.id.kv)).setImageDrawable(e5);
                MethodCollector.m26664o(4322);
                return;
            }
        } else {
            RelativeLayout relativeLayout18 = (RelativeLayout) this.f41276c.findViewById(R.id.l9);
            C89219l.m154716b(relativeLayout18, "");
            relativeLayout18.setVisibility(8);
            RelativeLayout relativeLayout19 = (RelativeLayout) this.f41276c.findViewById(R.id.l6);
            C89219l.m154716b(relativeLayout19, "");
            relativeLayout19.setVisibility(8);
            RelativeLayout relativeLayout20 = (RelativeLayout) this.f41276c.findViewById(R.id.kx);
            C89219l.m154716b(relativeLayout20, "");
            relativeLayout20.setVisibility(8);
            RelativeLayout relativeLayout21 = (RelativeLayout) this.f41276c.findViewById(R.id.ku);
            C89219l.m154716b(relativeLayout21, "");
            relativeLayout21.setVisibility(8);
        }
        MethodCollector.m26664o(4322);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    /* renamed from: a */
    public final void mo27342a(C17257b.AbstractC17259b bVar) {
        C89219l.m154721d(bVar, "");
        this.f41279f = bVar;
    }

    /* renamed from: a */
    private void m31876a(boolean z) {
        this.f41281h.f41253v = z;
        if (this.f41281h.f41253v) {
            this.f41276c.setOnTouchListener(new View$OnTouchListenerC17268c(this));
        } else {
            this.f41276c.setOnTouchListener(null);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    /* renamed from: a */
    public final void mo27343a(C17257b.AbstractC17260c cVar) {
        C89219l.m154721d(cVar, "");
        this.f41280g = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.e$c */
    public static final class View$OnTouchListenerC17268c implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C17265e f41287a;

        static {
            Covode.recordClassIndex(19736);
        }

        View$OnTouchListenerC17268c(C17265e eVar) {
            this.f41287a = eVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f41287a.dismiss();
            return false;
        }
    }

    /* renamed from: a */
    private void m31877a(boolean z, View.OnClickListener onClickListener) {
        this.f41281h.f41254w = onClickListener;
        this.f41277d.setOnClickListener(onClickListener);
        this.f41277d.setClickable(z);
    }

    public C17265e(Context context, C17261c cVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        MethodCollector.m26663i(4411);
        this.f41275b = context;
        int a = C89241a.m154730a(C13628n.m24520b(context, 4.0f));
        this.f41283j = a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.bh8, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        this.f41276c = inflate;
        View findViewById = inflate.findViewById(R.id.adu);
        C89219l.m154716b(findViewById, "");
        this.f41277d = findViewById;
        this.f41281h = cVar;
        m31880e();
        m31879d();
        C17262d dVar = new C17262d(context, this.f41281h, this.f41277d, false);
        this.f41282i = dVar;
        dVar.f41263e = this.f41284k - a;
        MethodCollector.m26664o(4411);
    }
}
