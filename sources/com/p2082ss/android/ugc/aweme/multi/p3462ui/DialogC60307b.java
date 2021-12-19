package com.p2082ss.android.ugc.aweme.multi.p3462ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.C17317c;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.C33506b;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2314ui.BoundedRelativeLayout;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.ui.b */
public final class DialogC60307b extends DialogC26609a {

    /* renamed from: a */
    public static final C60308a f137437a = new C60308a((byte) 0);

    /* renamed from: b */
    private C60306a f137438b;

    /* renamed from: c */
    private final Context f137439c;

    /* renamed from: d */
    private final C60202d f137440d;

    /* renamed from: e */
    private final boolean f137441e;

    static {
        Covode.recordClassIndex(70843);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.b$a */
    public static final class C60308a {
        static {
            Covode.recordClassIndex(70844);
        }

        private C60308a() {
        }

        public /* synthetic */ C60308a(byte b) {
            this();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C60306a aVar = this.f137438b;
        if (aVar != null) {
            C89219l.m154721d(aVar, "");
            C17317c cVar = ActivityC17312a.callback;
            C89219l.m154721d(aVar, "");
            cVar.f41603a.remove(aVar);
            this.f137438b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final BottomSheetBehavior<View> mo9590b() {
        try {
            BoundedRelativeLayout boundedRelativeLayout = (BoundedRelativeLayout) findViewById(R.id.ji);
            C89219l.m154716b(boundedRelativeLayout, "");
            ViewParent parent = boundedRelativeLayout.getParent();
            if (parent != null) {
                return BottomSheetBehavior.m52754a((View) parent);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void dismiss() {
        super.dismiss();
        for (AbstractC60201c cVar : this.f137440d.f137229a) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            while (true) {
                if (context == null) {
                    break;
                } else if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        cVar.mo97865a(activity, this);
                    }
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (AbstractC60201c cVar : this.f137440d.f137229a) {
            if (cVar instanceof AbstractC60267o) {
                ((AbstractC60267o) cVar).f137359i = SystemClock.elapsedRealtime();
            }
        }
        C60306a aVar = new C60306a(this.f137440d, this);
        this.f137438b = aVar;
        ActivityC17312a.C17313a.m32060a(aVar);
    }

    /* renamed from: c */
    private final void m110017c() {
        for (AbstractC60201c cVar : this.f137440d.f137229a) {
            if (this.f137441e) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.is);
                C89219l.m154716b(linearLayout, "");
                cVar.mo97890b(linearLayout, this, C33506b.m68655b(this.f137440d, cVar, true));
            } else {
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.is);
                C89219l.m154716b(linearLayout2, "");
                cVar.mo97866a(linearLayout2, this, C33506b.m68655b(this.f137440d, cVar, true));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.b$b */
    public static final class View$OnLayoutChangeListenerC60309b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ DialogC60307b f137442a;

        static {
            Covode.recordClassIndex(70845);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnLayoutChangeListenerC60309b(DialogC60307b bVar) {
            this.f137442a = bVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C89219l.m154721d(view, "");
            DialogC60307b bVar = this.f137442a;
            int measuredHeight = view.getMeasuredHeight();
            BottomSheetBehavior<View> b = bVar.mo9590b();
            if (b != null) {
                b.mo43976b(measuredHeight);
            }
            view.removeOnLayoutChangeListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.b$c */
    static final class View$OnClickListenerC60310c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC60307b f137443a;

        static {
            Covode.recordClassIndex(70846);
        }

        View$OnClickListenerC60310c(DialogC60307b bVar) {
            this.f137443a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137443a.dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int b = C13628n.m24521b(this.f137439c) - C13628n.m24525e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b == 0) {
                b = -1;
            }
            window.setLayout(-1, b);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.c9);
            View findViewById = window.findViewById(R.id.ajx);
            if (findViewById != null) {
                findViewById.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        setContentView(R.layout.x0);
        double b2 = (double) C13628n.m24521b(getContext());
        Double.isNaN(b2);
        ((BoundedRelativeLayout) findViewById(R.id.ji)).setMaxHeight((int) (b2 * 0.73d));
        m110017c();
        ((TuxIconView) findViewById(R.id.jh)).setOnClickListener(new View$OnClickListenerC60310c(this));
        BoundedRelativeLayout boundedRelativeLayout = (BoundedRelativeLayout) findViewById(R.id.ji);
        C89219l.m154716b(boundedRelativeLayout, "");
        boundedRelativeLayout.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC60309b(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC60307b(Context context, C60202d dVar, boolean z) {
        super(context, R.style.wn);
        C89219l.m154721d(context, "");
        C89219l.m154721d(dVar, "");
        this.f137439c = context;
        this.f137440d = dVar;
        this.f137441e = z;
    }
}
