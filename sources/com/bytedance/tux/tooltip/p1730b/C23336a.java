package com.bytedance.tux.tooltip.p1730b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.C23342c;
import com.bytedance.tux.tooltip.C23346d;
import com.bytedance.tux.tooltip.C23347e;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.tooltip.b.a */
public final class C23336a implements AbstractC23317a {

    /* renamed from: a */
    public boolean f55305a;

    /* renamed from: b */
    public final Context f55306b;

    /* renamed from: c */
    private View f55307c;

    /* renamed from: d */
    private View f55308d;

    /* renamed from: e */
    private boolean f55309e = true;

    /* renamed from: f */
    private C23346d f55310f;

    /* renamed from: g */
    private C23347e f55311g;

    /* renamed from: h */
    private final int f55312h;

    /* renamed from: i */
    private int f55313i;

    static {
        Covode.recordClassIndex(27289);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.tooltip.b.a$b */
    public static final class RunnableC23338b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23336a f55315a;

        static {
            Covode.recordClassIndex(27291);
        }

        RunnableC23338b(C23336a aVar) {
            this.f55315a = aVar;
        }

        public final void run() {
            this.f55315a.dismiss();
        }
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: b */
    public final C23346d mo38007b() {
        return this.f55311g.f55353d;
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    public final boolean isShowing() {
        if (!this.f55309e) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.tooltip.b.a$a */
    public static final class RunnableC23337a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23336a f55314a;

        static {
            Covode.recordClassIndex(27290);
        }

        RunnableC23337a(C23336a aVar) {
            this.f55314a = aVar;
        }

        public final void run() {
            this.f55314a.mo38050c();
            this.f55314a.f55305a = false;
        }
    }

    /* renamed from: c */
    public final void mo38050c() {
        MethodCollector.m26663i(7859);
        this.f55307c.setVisibility(8);
        ViewGroup viewGroup = this.f55310f.f55325d;
        if (viewGroup != null) {
            viewGroup.removeView(this.f55307c);
        }
        this.f55309e = true;
        C23342c.AbstractC23344b bVar = this.f55310f.f55347z;
        if (bVar != null) {
            bVar.mo38048a();
            MethodCollector.m26664o(7859);
            return;
        }
        MethodCollector.m26664o(7859);
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    public final void dismiss() {
        if (this.f55309e) {
            return;
        }
        if (!this.f55310f.f55334m) {
            mo38050c();
        } else if (!this.f55305a) {
            C23347e eVar = this.f55311g;
            eVar.mo38057a(eVar.f55350a, false);
            this.f55305a = true;
            new Handler().postDelayed(new RunnableC23337a(this), this.f55310f.f55333l);
        }
    }

    /* renamed from: d */
    private final void m43964d() {
        MethodCollector.m26663i(7716);
        AbstractC23332b.AbstractC23333a aVar = this.f55310f.f55338q;
        if (aVar != null) {
            aVar.mo38047a();
        }
        ViewGroup viewGroup = this.f55310f.f55325d;
        if (viewGroup != null) {
            viewGroup.addView(this.f55307c);
        }
        this.f55307c.setVisibility(0);
        this.f55309e = false;
        this.f55308d.setX((float) this.f55311g.f55350a.f55368a);
        this.f55308d.setY((float) this.f55311g.f55350a.f55369b);
        C23347e eVar = this.f55311g;
        eVar.mo38057a(eVar.f55350a, true);
        C23342c.AbstractC23345c cVar = this.f55310f.f55320A;
        if (cVar != null) {
            cVar.onShow();
        }
        if (this.f55310f.f55330i != -1001) {
            new Handler().postDelayed(new RunnableC23338b(this), this.f55310f.f55330i);
        }
        MethodCollector.m26664o(7716);
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38001a() {
        if ((this.f55310f.f55324c == null && (this.f55310f.f55339r < 0 || this.f55310f.f55340s < 0)) || this.f55310f.f55325d == null || !this.f55309e) {
            return;
        }
        if (!this.f55311g.mo38058a()) {
            int i = C23341b.f55318a[this.f55310f.f55326e.ordinal()];
            if (i == 1) {
                this.f55310f.mo38055a(EnumC23352h.END);
            } else if (i == 2) {
                this.f55310f.mo38055a(EnumC23352h.START);
            } else if (i == 3) {
                this.f55310f.mo38055a(EnumC23352h.TOP);
            } else if (i == 4) {
                this.f55310f.mo38055a(EnumC23352h.BOTTOM);
            }
            this.f55311g.mo38060c();
            this.f55311g.mo38061d();
            if (this.f55311g.mo38058a() || this.f55310f.f55332k) {
                m43964d();
                return;
            }
            return;
        }
        m43964d();
    }

    /* renamed from: com.bytedance.tux.tooltip.b.a$c */
    static final class View$OnClickListenerC23339c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23336a f55316a;

        static {
            Covode.recordClassIndex(27292);
        }

        View$OnClickListenerC23339c(C23336a aVar) {
            this.f55316a = aVar;
        }

        public final void onClick(View view) {
            this.f55316a.dismiss();
        }
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38002a(C23342c.AbstractC23344b bVar) {
        this.f55310f.f55347z = bVar;
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38003a(C23342c.AbstractC23345c cVar) {
        this.f55310f.f55320A = cVar;
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38004a(C23346d dVar) {
        C89219l.m154719c(dVar, "");
        this.f55311g.mo38056a(dVar);
        this.f55310f = dVar;
        this.f55311g.mo38060c();
        this.f55311g.mo38061d();
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: b */
    public final void mo38008b(boolean z) {
        if (z) {
            this.f55307c.setOnClickListener(null);
            return;
        }
        mo38005a(true);
        this.f55307c.setOnClickListener(new View$OnClickListenerC23339c(this));
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38005a(boolean z) {
        this.f55310f.f55343v = z;
        if (this.f55310f.f55343v) {
            this.f55307c.setOnTouchListener(new View$OnTouchListenerC23340d(this));
        } else {
            this.f55307c.setOnTouchListener(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.tooltip.b.a$d */
    public static final class View$OnTouchListenerC23340d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C23336a f55317a;

        static {
            Covode.recordClassIndex(27293);
        }

        View$OnTouchListenerC23340d(C23336a aVar) {
            this.f55317a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f55317a.dismiss();
            return false;
        }
    }

    public C23336a(Context context, C23346d dVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(dVar, "");
        MethodCollector.m26663i(8032);
        this.f55306b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f, (ViewGroup) null);
        C89219l.m154709a((Object) inflate, "");
        this.f55307c = inflate;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
        this.f55312h = a;
        View findViewById = this.f55307c.findViewById(R.id.adu);
        C89219l.m154709a((Object) findViewById, "");
        this.f55308d = findViewById;
        C23347e eVar = new C23347e(context, dVar, this, this.f55308d, false);
        this.f55311g = eVar;
        this.f55310f = eVar.f55353d;
        this.f55311g.mo38059b();
        this.f55311g.mo38060c();
        this.f55311g.mo38061d();
        this.f55311g.f55351b = this.f55313i - a;
        MethodCollector.m26664o(8032);
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23317a
    /* renamed from: a */
    public final void mo38006a(boolean z, View.OnClickListener onClickListener) {
        this.f55310f.f55345x = onClickListener;
        this.f55308d.setOnClickListener(onClickListener);
        this.f55308d.setClickable(z);
    }
}
