package com.p2082ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.SilentSharePopupWindow */
public final class SilentSharePopupWindow extends PopupWindow implements AbstractC33974au {

    /* renamed from: f */
    public static final C69424a f155082f = new C69424a((byte) 0);

    /* renamed from: a */
    final Runnable f155083a;

    /* renamed from: b */
    int f155084b;

    /* renamed from: c */
    int f155085c;

    /* renamed from: d */
    final Context f155086d;

    /* renamed from: e */
    final int f155087e;

    /* renamed from: g */
    private final TextView f155088g;

    /* renamed from: h */
    private final FrameLayout f155089h;

    /* renamed from: i */
    private final String f155090i;

    static {
        Covode.recordClassIndex(81761);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onHostDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.SilentSharePopupWindow$a */
    public static final class C69424a {
        static {
            Covode.recordClassIndex(81762);
        }

        private C69424a() {
        }

        public /* synthetic */ C69424a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.SilentSharePopupWindow$b */
    static final class RunnableC69425b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SilentSharePopupWindow f155091a;

        static {
            Covode.recordClassIndex(81763);
        }

        RunnableC69425b(SilentSharePopupWindow silentSharePopupWindow) {
            this.f155091a = silentSharePopupWindow;
        }

        public final void run() {
            this.f155091a.dismiss();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.f155083a);
    }

    public final void dismiss() {
        if (isShowing()) {
            Context context = this.f155086d;
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                int i = Build.VERSION.SDK_INT;
                Context context2 = this.f155086d;
                if (!(context2 instanceof Activity) || !((Activity) context2).isDestroyed()) {
                    super.dismiss();
                }
            }
        }
    }

    private SilentSharePopupWindow(Context context, String str, int i) {
        Context context2;
        AbstractC1196i lifecycle;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        MethodCollector.m26663i(6574);
        this.f155086d = context;
        this.f155090i = str;
        this.f155087e = i;
        this.f155083a = new RunnableC69425b(this);
        if (!(context instanceof AbstractC1204m)) {
            context2 = null;
        } else {
            context2 = context;
        }
        AbstractC1204m mVar = (AbstractC1204m) context2;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.mo4012a(this);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.az4, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.eu6);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f155088g = textView;
        textView.setText(str);
        if (UIUXBugsExperimentService.m65442b().mo57250a()) {
            textView.setTextColor(C0643b.m2378c(context, R.color.a_));
            textView.setBackgroundColor(C0643b.m2378c(context, R.color.bm));
        }
        View findViewById2 = inflate.findViewById(R.id.b59);
        C89219l.m154716b(findViewById2, "");
        this.f155089h = (FrameLayout) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.fo);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        C89219l.m154716b(inflate, "");
        this.f155085c = inflate.getMeasuredHeight();
        this.f155084b = inflate.getMeasuredWidth();
        MethodCollector.m26664o(6574);
    }

    public /* synthetic */ SilentSharePopupWindow(Context context, String str, int i, byte b) {
        this(context, str, i);
    }
}
