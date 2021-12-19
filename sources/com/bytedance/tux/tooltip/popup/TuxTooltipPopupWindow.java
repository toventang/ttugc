package com.bytedance.tux.tooltip.popup;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.C23342c;
import com.bytedance.tux.tooltip.C23346d;
import com.bytedance.tux.tooltip.C23347e;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxTooltipPopupWindow extends PopupWindow implements AbstractC23317a, AbstractC33974au {

    /* renamed from: a */
    public C23346d f55373a;

    /* renamed from: b */
    public boolean f55374b;

    /* renamed from: c */
    public final Context f55375c;

    /* renamed from: d */
    private View f55376d;

    /* renamed from: e */
    private final C23347e f55377e;

    static {
        Covode.recordClassIndex(27306);
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: b */
    public final void mo38008b(boolean z) {
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
    /* renamed from: com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow$b */
    public static final class RunnableC23355b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TuxTooltipPopupWindow f55380a;

        static {
            Covode.recordClassIndex(27309);
        }

        RunnableC23355b(TuxTooltipPopupWindow tuxTooltipPopupWindow) {
            this.f55380a = tuxTooltipPopupWindow;
        }

        public final void run() {
            this.f55380a.dismiss();
        }
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: b */
    public final C23346d mo38007b() {
        return this.f55377e.f55353d;
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    public final boolean isShowing() {
        return super.isShowing();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow$a */
    public static final class RunnableC23354a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TuxTooltipPopupWindow f55379a;

        static {
            Covode.recordClassIndex(27308);
        }

        RunnableC23354a(TuxTooltipPopupWindow tuxTooltipPopupWindow) {
            this.f55379a = tuxTooltipPopupWindow;
        }

        public final void run() {
            TuxTooltipPopupWindow.super.dismiss();
            this.f55379a.f55374b = false;
        }
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    public final void dismiss() {
        if (!this.f55373a.f55334m) {
            super.dismiss();
        } else if (!this.f55374b) {
            C23347e eVar = this.f55377e;
            eVar.mo38057a(eVar.f55350a, false);
            this.f55374b = true;
            new Handler().postDelayed(new RunnableC23354a(this), this.f55373a.f55333l);
        }
    }

    /* renamed from: c */
    private final void m43988c() {
        Context context = this.f55375c;
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            AbstractC23332b.AbstractC23333a aVar = this.f55373a.f55338q;
            if (aVar != null) {
                aVar.mo38047a();
            }
            if (this.f55373a.f55324c == null) {
                Window window = ((Activity) this.f55375c).getWindow();
                C89219l.m154709a((Object) window, "");
                showAtLocation(window.getDecorView(), 0, this.f55377e.f55350a.f55368a, this.f55377e.f55350a.f55369b);
            } else {
                showAtLocation(this.f55373a.f55324c, 0, this.f55377e.f55350a.f55368a, this.f55377e.f55350a.f55369b);
            }
            C23342c.AbstractC23345c cVar = this.f55373a.f55320A;
            if (cVar != null) {
                cVar.onShow();
            }
            C23347e eVar = this.f55377e;
            eVar.mo38057a(eVar.f55350a, true);
            if (this.f55373a.f55330i != -1001) {
                new Handler().postDelayed(new RunnableC23355b(this), this.f55373a.f55330i);
            }
        }
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38001a() {
        if (this.f55373a.f55324c == null && (this.f55373a.f55339r < 0 || this.f55373a.f55340s < 0)) {
            return;
        }
        if (!this.f55377e.mo38058a()) {
            int i = C23356a.f55381a[this.f55373a.f55326e.ordinal()];
            if (i == 1) {
                this.f55373a.mo38055a(EnumC23352h.END);
            } else if (i == 2) {
                this.f55373a.mo38055a(EnumC23352h.START);
            } else if (i == 3) {
                this.f55373a.mo38055a(EnumC23352h.TOP);
            } else if (i == 4) {
                this.f55373a.mo38055a(EnumC23352h.BOTTOM);
            }
            mo38004a(this.f55373a);
            if (this.f55377e.mo38058a() || this.f55373a.f55332k) {
                m43988c();
                return;
            }
            return;
        }
        m43988c();
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38002a(C23342c.AbstractC23344b bVar) {
        this.f55373a.f55347z = bVar;
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38003a(C23342c.AbstractC23345c cVar) {
        this.f55373a.f55320A = cVar;
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38004a(C23346d dVar) {
        C89219l.m154719c(dVar, "");
        this.f55377e.mo38056a(dVar);
        this.f55373a = dVar;
        this.f55377e.mo38060c();
        this.f55377e.mo38061d();
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38005a(boolean z) {
        setOutsideTouchable(z);
    }

    public TuxTooltipPopupWindow(Context context, C23346d dVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(dVar, "");
        MethodCollector.m26663i(8029);
        this.f55375c = context;
        this.f55373a = dVar;
        if (context instanceof AbstractC1204m) {
            ((AbstractC1204m) context).getLifecycle().mo4012a(this);
        }
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        View inflate = LayoutInflater.from(context).inflate(R.layout.e, (ViewGroup) null);
        C89219l.m154709a((Object) inflate, "");
        this.f55376d = inflate;
        setContentView(inflate);
        C23347e eVar = new C23347e(context, this.f55373a, this, this.f55376d, true);
        this.f55377e = eVar;
        setOnDismissListener(new PopupWindow.OnDismissListener(this) {
            /* class com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow.C233531 */

            /* renamed from: a */
            final /* synthetic */ TuxTooltipPopupWindow f55378a;

            static {
                Covode.recordClassIndex(27307);
            }

            {
                this.f55378a = r1;
            }

            public final void onDismiss() {
                C23342c.AbstractC23344b bVar = this.f55378a.f55373a.f55347z;
                if (bVar != null) {
                    bVar.mo38048a();
                }
            }
        });
        eVar.mo38059b();
        mo38004a(this.f55373a);
        MethodCollector.m26664o(8029);
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38006a(boolean z, View.OnClickListener onClickListener) {
        this.f55373a.f55345x = onClickListener;
        if (z) {
            setTouchable(true);
            ((FrameLayout) this.f55376d.findViewById(R.id.acq)).setOnClickListener(onClickListener);
            return;
        }
        setTouchable(false);
    }
}
