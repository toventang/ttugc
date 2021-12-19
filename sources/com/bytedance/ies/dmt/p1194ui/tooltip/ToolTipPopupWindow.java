package com.bytedance.ies.dmt.p1194ui.tooltip;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17167b;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17168c;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.ies.dmt.ui.tooltip.ToolTipPopupWindow */
public final class ToolTipPopupWindow extends PopupWindow implements AbstractC17256a, AbstractC33974au {

    /* renamed from: a */
    public boolean f41215a;

    /* renamed from: b */
    public final Context f41216b;

    /* renamed from: c */
    private C17261c f41217c;

    /* renamed from: d */
    private View f41218d;

    /* renamed from: e */
    private final C17262d f41219e;

    /* renamed from: f */
    private final int f41220f;

    /* renamed from: g */
    private int f41221g;

    static {
        Covode.recordClassIndex(19720);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.ToolTipPopupWindow$b */
    public static final class RunnableC17254b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ToolTipPopupWindow f41223a;

        static {
            Covode.recordClassIndex(19722);
        }

        RunnableC17254b(ToolTipPopupWindow toolTipPopupWindow) {
            this.f41223a = toolTipPopupWindow;
        }

        public final void run() {
            this.f41223a.dismiss();
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.ToolTipPopupWindow$c */
    static final class C17255c implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C17257b.AbstractC17259b f41224a;

        static {
            Covode.recordClassIndex(19723);
        }

        C17255c(C17257b.AbstractC17259b bVar) {
            this.f41224a = bVar;
        }

        public final void onDismiss() {
            this.f41224a.mo27360a();
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    public final boolean isShowing() {
        return super.isShowing();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.ToolTipPopupWindow$a */
    public static final class RunnableC17253a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ToolTipPopupWindow f41222a;

        static {
            Covode.recordClassIndex(19721);
        }

        RunnableC17253a(ToolTipPopupWindow toolTipPopupWindow) {
            this.f41222a = toolTipPopupWindow;
        }

        public final void run() {
            ToolTipPopupWindow.super.dismiss();
            this.f41222a.f41215a = false;
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    public final void dismiss() {
        if (!this.f41217c.f41246o) {
            super.dismiss();
        } else if (!this.f41215a) {
            C17262d dVar = this.f41219e;
            dVar.mo27363a(dVar.f41261c, false);
            this.f41215a = true;
            new Handler().postDelayed(new RunnableC17253a(this), this.f41217c.f41245n);
        }
    }

    /* renamed from: b */
    private final void m31847b() {
        Context context = this.f41216b;
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            if (this.f41217c.f41236e == null) {
                Window window = ((Activity) this.f41216b).getWindow();
                C89219l.m154716b(window, "");
                showAtLocation(window.getDecorView(), 0, this.f41219e.f41261c.f41270a, this.f41219e.f41261c.f41271b);
            } else {
                showAtLocation(this.f41217c.f41236e, 0, this.f41219e.f41261c.f41270a, this.f41219e.f41261c.f41271b);
            }
            C17262d dVar = this.f41219e;
            dVar.mo27363a(dVar.f41261c, true);
            if (this.f41217c.f41242k != -1001) {
                new Handler().postDelayed(new RunnableC17254b(this), this.f41217c.f41242k);
            }
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    /* renamed from: a */
    public final void mo27341a() {
        if (this.f41217c.f41236e != null || (this.f41217c.f41250s >= 0 && this.f41217c.f41251t >= 0)) {
            C17262d dVar = this.f41219e;
            if (!dVar.mo27364a(dVar.f41261c)) {
                int i = this.f41217c.f41238g;
                if (i == 48) {
                    this.f41217c.f41238g = 80;
                } else if (i == 80) {
                    this.f41217c.f41238g = 48;
                } else if (i == 8388611) {
                    this.f41217c.f41238g = 8388613;
                } else if (i == 8388613) {
                    this.f41217c.f41238g = 8388611;
                }
                m31849d();
                m31848c();
                C17262d dVar2 = this.f41219e;
                if (dVar2.mo27364a(dVar2.f41261c) || this.f41217c.f41244m) {
                    m31847b();
                    return;
                }
                return;
            }
            m31847b();
        }
    }

    /* renamed from: d */
    private final void m31849d() {
        setOutsideTouchable(this.f41217c.f41253v);
        m31846a(this.f41217c.f41255x, this.f41217c.f41254w);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        this.f41221g = this.f41217c.f41243l;
        if (this.f41220f > this.f41217c.f41243l) {
            this.f41221g = this.f41220f;
        }
        C17262d dVar = this.f41219e;
        if (dVar != null) {
            dVar.f41263e = this.f41221g - this.f41220f;
        }
        if (this.f41217c.f41238g == 3) {
            this.f41217c.f41238g = 8388611;
        } else if (this.f41217c.f41238g == 5) {
            this.f41217c.f41238g = 8388613;
        }
        if (C80471gb.m139483a(this.f41216b)) {
            if (this.f41217c.f41238g == 8388611) {
                this.f41217c.f41238g = 8388613;
            } else if (this.f41217c.f41238g == 8388613) {
                this.f41217c.f41238g = 8388611;
            }
        }
        if (this.f41217c.f41242k < 0 && this.f41217c.f41242k != -1001) {
            this.f41217c.f41242k = 3000;
        }
        if (this.f41217c.f41245n < 0) {
            this.f41217c.f41245n = 300;
        }
        if (this.f41217c.f41248q == null) {
            this.f41217c.f41248q = new C17167b();
        }
        if (this.f41217c.f41249r == null) {
            this.f41217c.f41249r = new C17168c();
        }
    }

    /* renamed from: c */
    private final void m31848c() {
        MethodCollector.m26663i(5894);
        if (C80471gb.m139483a(this.f41216b)) {
            int i = Build.VERSION.SDK_INT;
            RelativeLayout relativeLayout = (RelativeLayout) this.f41218d.findViewById(R.id.acq);
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setLayoutDirection(1);
        }
        if (Build.VERSION.SDK_INT < 21) {
            ImageView imageView = (ImageView) this.f41218d.findViewById(R.id.la);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) this.f41218d.findViewById(R.id.kw);
            C89219l.m154716b(imageView2, "");
            imageView2.setVisibility(8);
            ImageView imageView3 = (ImageView) this.f41218d.findViewById(R.id.l8);
            C89219l.m154716b(imageView3, "");
            imageView3.setVisibility(8);
            ImageView imageView4 = (ImageView) this.f41218d.findViewById(R.id.kz);
            C89219l.m154716b(imageView4, "");
            imageView4.setVisibility(8);
        }
        if (this.f41217c.f41252u != null) {
            ((RelativeLayout) this.f41218d.findViewById(R.id.acq)).removeAllViews();
            ((RelativeLayout) this.f41218d.findViewById(R.id.acq)).addView(this.f41217c.f41252u);
        } else {
            DmtTextView dmtTextView = (DmtTextView) this.f41218d.findViewById(R.id.adm);
            C89219l.m154716b(dmtTextView, "");
            dmtTextView.setText(this.f41217c.f41232a);
            if (this.f41217c.f41230B >= 0) {
                DmtTextView dmtTextView2 = (DmtTextView) this.f41218d.findViewById(R.id.adm);
                C89219l.m154716b(dmtTextView2, "");
                dmtTextView2.setMaxWidth(this.f41217c.f41230B);
            }
            if (this.f41217c.f41233b > 0) {
                ImageView imageView5 = (ImageView) this.f41218d.findViewById(R.id.adc);
                C89219l.m154716b(imageView5, "");
                imageView5.setVisibility(0);
                ((ImageView) this.f41218d.findViewById(R.id.adc)).setImageResource(this.f41217c.f41233b);
            } else {
                ImageView imageView6 = (ImageView) this.f41218d.findViewById(R.id.adc);
                C89219l.m154716b(imageView6, "");
                imageView6.setVisibility(8);
            }
        }
        if (this.f41217c.f41229A) {
            FrameLayout frameLayout = (FrameLayout) this.f41218d.findViewById(R.id.ade);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setBackground(null);
        } else {
            FrameLayout frameLayout2 = (FrameLayout) this.f41218d.findViewById(R.id.ade);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setBackground(C0643b.m2369a(this.f41216b, (int) R.drawable.cca));
        }
        if (this.f41217c.f41235d != 0) {
            Drawable e = C0705a.m2506e(this.f41216b.getResources().getDrawable(R.drawable.cca));
            C0705a.m2494a(e, this.f41217c.f41235d);
            FrameLayout frameLayout3 = (FrameLayout) this.f41218d.findViewById(R.id.ade);
            C89219l.m154716b(frameLayout3, "");
            frameLayout3.setBackground(e);
        }
        if (this.f41217c.f41234c != 0) {
            ((DmtTextView) this.f41218d.findViewById(R.id.adm)).setTextColor(this.f41217c.f41234c);
        }
        if (this.f41217c.f41247p) {
            int i2 = this.f41217c.f41238g;
            if (i2 != 48) {
                if (i2 == 80) {
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.f41218d.findViewById(R.id.l6);
                    C89219l.m154716b(relativeLayout2, "");
                    relativeLayout2.setVisibility(8);
                    RelativeLayout relativeLayout3 = (RelativeLayout) this.f41218d.findViewById(R.id.kx);
                    C89219l.m154716b(relativeLayout3, "");
                    relativeLayout3.setVisibility(8);
                    RelativeLayout relativeLayout4 = (RelativeLayout) this.f41218d.findViewById(R.id.ku);
                    C89219l.m154716b(relativeLayout4, "");
                    relativeLayout4.setVisibility(8);
                    RelativeLayout relativeLayout5 = (RelativeLayout) this.f41218d.findViewById(R.id.l9);
                    C89219l.m154716b(relativeLayout5, "");
                    relativeLayout5.setVisibility(0);
                    if (this.f41217c.f41235d != 0) {
                        Drawable a = C0643b.m2369a(this.f41216b, 2131235004);
                        if (a == null) {
                            C89219l.m154715b();
                        }
                        Drawable e2 = C0705a.m2506e(a);
                        C0705a.m2494a(e2, this.f41217c.f41235d);
                        ((ImageView) this.f41218d.findViewById(R.id.l_)).setImageDrawable(e2);
                    }
                } else if (i2 == 8388611) {
                    RelativeLayout relativeLayout6 = (RelativeLayout) this.f41218d.findViewById(R.id.l9);
                    C89219l.m154716b(relativeLayout6, "");
                    relativeLayout6.setVisibility(8);
                    RelativeLayout relativeLayout7 = (RelativeLayout) this.f41218d.findViewById(R.id.l6);
                    C89219l.m154716b(relativeLayout7, "");
                    relativeLayout7.setVisibility(8);
                    RelativeLayout relativeLayout8 = (RelativeLayout) this.f41218d.findViewById(R.id.ku);
                    C89219l.m154716b(relativeLayout8, "");
                    relativeLayout8.setVisibility(8);
                    RelativeLayout relativeLayout9 = (RelativeLayout) this.f41218d.findViewById(R.id.kx);
                    C89219l.m154716b(relativeLayout9, "");
                    relativeLayout9.setVisibility(0);
                    if (this.f41217c.f41235d != 0) {
                        Drawable a2 = C0643b.m2369a(this.f41216b, 2131235005);
                        if (a2 == null) {
                            C89219l.m154715b();
                        }
                        Drawable e3 = C0705a.m2506e(a2);
                        C0705a.m2494a(e3, this.f41217c.f41235d);
                        ((ImageView) this.f41218d.findViewById(R.id.ky)).setImageDrawable(e3);
                        MethodCollector.m26664o(5894);
                        return;
                    }
                } else if (i2 == 8388613) {
                    RelativeLayout relativeLayout10 = (RelativeLayout) this.f41218d.findViewById(R.id.l9);
                    C89219l.m154716b(relativeLayout10, "");
                    relativeLayout10.setVisibility(8);
                    RelativeLayout relativeLayout11 = (RelativeLayout) this.f41218d.findViewById(R.id.kx);
                    C89219l.m154716b(relativeLayout11, "");
                    relativeLayout11.setVisibility(8);
                    RelativeLayout relativeLayout12 = (RelativeLayout) this.f41218d.findViewById(R.id.ku);
                    C89219l.m154716b(relativeLayout12, "");
                    relativeLayout12.setVisibility(8);
                    RelativeLayout relativeLayout13 = (RelativeLayout) this.f41218d.findViewById(R.id.l6);
                    C89219l.m154716b(relativeLayout13, "");
                    relativeLayout13.setVisibility(0);
                    if (this.f41217c.f41235d != 0) {
                        Drawable a3 = C0643b.m2369a(this.f41216b, 2131235005);
                        if (a3 == null) {
                            C89219l.m154715b();
                        }
                        Drawable e4 = C0705a.m2506e(a3);
                        C0705a.m2494a(e4, this.f41217c.f41235d);
                        ((ImageView) this.f41218d.findViewById(R.id.l7)).setImageDrawable(e4);
                        MethodCollector.m26664o(5894);
                        return;
                    }
                }
                MethodCollector.m26664o(5894);
                return;
            }
            RelativeLayout relativeLayout14 = (RelativeLayout) this.f41218d.findViewById(R.id.l9);
            C89219l.m154716b(relativeLayout14, "");
            relativeLayout14.setVisibility(8);
            RelativeLayout relativeLayout15 = (RelativeLayout) this.f41218d.findViewById(R.id.l6);
            C89219l.m154716b(relativeLayout15, "");
            relativeLayout15.setVisibility(8);
            RelativeLayout relativeLayout16 = (RelativeLayout) this.f41218d.findViewById(R.id.kx);
            C89219l.m154716b(relativeLayout16, "");
            relativeLayout16.setVisibility(8);
            RelativeLayout relativeLayout17 = (RelativeLayout) this.f41218d.findViewById(R.id.ku);
            C89219l.m154716b(relativeLayout17, "");
            relativeLayout17.setVisibility(0);
            if (this.f41217c.f41235d != 0) {
                Drawable a4 = C0643b.m2369a(this.f41216b, 2131235004);
                if (a4 == null) {
                    C89219l.m154715b();
                }
                Drawable e5 = C0705a.m2506e(a4);
                C0705a.m2494a(e5, this.f41217c.f41235d);
                ((ImageView) this.f41218d.findViewById(R.id.kv)).setImageDrawable(e5);
                MethodCollector.m26664o(5894);
                return;
            }
        } else {
            RelativeLayout relativeLayout18 = (RelativeLayout) this.f41218d.findViewById(R.id.l9);
            C89219l.m154716b(relativeLayout18, "");
            relativeLayout18.setVisibility(8);
            RelativeLayout relativeLayout19 = (RelativeLayout) this.f41218d.findViewById(R.id.l6);
            C89219l.m154716b(relativeLayout19, "");
            relativeLayout19.setVisibility(8);
            RelativeLayout relativeLayout20 = (RelativeLayout) this.f41218d.findViewById(R.id.kx);
            C89219l.m154716b(relativeLayout20, "");
            relativeLayout20.setVisibility(8);
            RelativeLayout relativeLayout21 = (RelativeLayout) this.f41218d.findViewById(R.id.ku);
            C89219l.m154716b(relativeLayout21, "");
            relativeLayout21.setVisibility(8);
        }
        MethodCollector.m26664o(5894);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    /* renamed from: a */
    public final void mo27343a(C17257b.AbstractC17260c cVar) {
        C89219l.m154721d(cVar, "");
        this.f41217c.f41257z = cVar;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a
    /* renamed from: a */
    public final void mo27342a(C17257b.AbstractC17259b bVar) {
        C89219l.m154721d(bVar, "");
        this.f41217c.f41256y = bVar;
        setOnDismissListener(new C17255c(bVar));
    }

    /* renamed from: a */
    private void m31846a(boolean z, View.OnClickListener onClickListener) {
        this.f41217c.f41254w = onClickListener;
        if (z) {
            setTouchable(true);
            ((RelativeLayout) this.f41218d.findViewById(R.id.acq)).setOnClickListener(onClickListener);
            return;
        }
        setTouchable(false);
    }

    public ToolTipPopupWindow(Context context, C17261c cVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        MethodCollector.m26663i(6041);
        this.f41216b = context;
        this.f41217c = cVar;
        int a = C89241a.m154730a(C13628n.m24520b(context, 4.0f));
        this.f41220f = a;
        if (context instanceof AbstractC1204m) {
            ((AbstractC1204m) context).getLifecycle().mo4012a(this);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.bh9, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        this.f41218d = inflate;
        setContentView(inflate);
        m31849d();
        m31848c();
        C17262d dVar = new C17262d(context, this.f41217c, this.f41218d, true);
        this.f41219e = dVar;
        dVar.f41263e = this.f41221g - a;
        MethodCollector.m26664o(6041);
    }
}
