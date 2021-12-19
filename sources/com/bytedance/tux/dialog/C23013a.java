package com.bytedance.tux.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.internal.AbstractDialogInterfaceC23060a;
import com.bytedance.tux.dialog.internal.DialogC23070e;
import com.bytedance.tux.dialog.internal.area.AccessoryArea;
import com.bytedance.tux.dialog.internal.area.ActionArea;
import com.bytedance.tux.dialog.internal.area.CaptionArea;
import com.bytedance.tux.dialog.internal.area.ImageArea;
import com.bytedance.tux.dialog.p1712a.AbstractC23022e;
import com.bytedance.tux.dialog.p1713b.AbstractC23034g;
import com.bytedance.tux.dialog.p1714c.AbstractC23036a;
import com.bytedance.tux.dialog.p1714c.C23037b;
import com.bytedance.tux.dialog.p1715d.AbstractC23047c;
import com.bytedance.tux.dialog.p1716e.AbstractC23057h;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1722h.C23159f;
import com.bytedance.tux.widget.VisualLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.dialog.a */
public final class C23013a extends AbstractDialogInterfaceC23060a<C23023b> {

    /* renamed from: d */
    public static final C23015a f54480d = new C23015a((byte) 0);

    /* renamed from: a */
    public final ActionArea f54481a;

    /* renamed from: b */
    public boolean f54482b;

    /* renamed from: c */
    public final Dialog f54483c;

    /* renamed from: k */
    private final View f54484k;

    /* renamed from: l */
    private final VisualLayout f54485l;

    /* renamed from: m */
    private final ImageView f54486m;

    /* renamed from: n */
    private final ImageArea f54487n;

    /* renamed from: o */
    private final CaptionArea f54488o;

    /* renamed from: p */
    private final AccessoryArea f54489p;

    /* renamed from: q */
    private final AbstractC23036a f54490q;

    /* renamed from: r */
    private int f54491r;

    static {
        Covode.recordClassIndex(26933);
    }

    /* renamed from: com.bytedance.tux.dialog.a$a */
    public static final class C23015a {
        static {
            Covode.recordClassIndex(26935);
        }

        private C23015a() {
        }

        public /* synthetic */ C23015a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C23023b m43405a(Context context) {
            C89219l.m154719c(context, "");
            return new C23023b(context);
        }
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractDialogInterfaceC23060a
    /* renamed from: b */
    public final Dialog mo37396b() {
        return this.f54483c;
    }

    /* renamed from: a */
    public final void mo37395a() {
        this.f54482b = false;
        m43402a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.dialog.a$b */
    public static final class View$OnClickListenerC23016b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23013a f54493a;

        static {
            Covode.recordClassIndex(26936);
        }

        View$OnClickListenerC23016b(C23013a aVar) {
            this.f54493a = aVar;
        }

        public final void onClick(View view) {
            this.f54493a.dismiss();
        }
    }

    /* renamed from: a */
    private final void m43402a(boolean z) {
        if (z) {
            this.f54484k.setOnClickListener(new View$OnClickListenerC23016b(this));
        } else {
            this.f54484k.setOnClickListener(null);
        }
        this.f54483c.setCancelable(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23013a(C23023b bVar) {
        super(bVar);
        int i;
        int i2;
        C89219l.m154719c(bVar, "");
        MethodCollector.m26663i(9347);
        View inflate = LayoutInflater.from(this.f54573f).inflate(R.layout.h, (ViewGroup) null);
        C89219l.m154709a((Object) inflate, "");
        this.f54484k = inflate;
        View findViewById = inflate.findViewById(R.id.fgw);
        C89219l.m154709a((Object) findViewById, "");
        VisualLayout visualLayout = (VisualLayout) findViewById;
        this.f54485l = visualLayout;
        View findViewById2 = inflate.findViewById(R.id.a70);
        C89219l.m154709a((Object) findViewById2, "");
        ImageView imageView = (ImageView) findViewById2;
        this.f54486m = imageView;
        View findViewById3 = inflate.findViewById(R.id.elc);
        C89219l.m154709a((Object) findViewById3, "");
        ImageArea imageArea = (ImageArea) findViewById3;
        this.f54487n = imageArea;
        View findViewById4 = inflate.findViewById(R.id.a1m);
        C89219l.m154709a((Object) findViewById4, "");
        CaptionArea captionArea = (CaptionArea) findViewById4;
        this.f54488o = captionArea;
        View findViewById5 = inflate.findViewById(R.id.bl);
        C89219l.m154709a((Object) findViewById5, "");
        AccessoryArea accessoryArea = (AccessoryArea) findViewById5;
        this.f54489p = accessoryArea;
        View findViewById6 = inflate.findViewById(R.id.bw);
        C89219l.m154709a((Object) findViewById6, "");
        ActionArea actionArea = (ActionArea) findViewById6;
        this.f54481a = actionArea;
        AbstractC23036a aVar = bVar.f54507f;
        aVar = aVar == null ? new C23037b() : aVar;
        this.f54490q = aVar;
        this.f54491r = -1;
        this.f54482b = bVar.f54591m;
        this.f54483c = new DialogC23070e(this, inflate, aVar, visualLayout);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 480.0f, system.getDisplayMetrics()));
        Context context = this.f54573f;
        C89219l.m154719c(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            i = displayMetrics.heightPixels;
        } else {
            i = 0;
        }
        double d = (double) i;
        Double.isNaN(d);
        int min = Math.min((int) (d * 0.9d), a);
        this.f54491r = min;
        visualLayout.setMaxHeight(min);
        if (bVar.f54502a) {
            C23001b bVar2 = new C23001b(this.f54573f, this.f54572e.f54615q);
            bVar2.mo37377c(this.f54572e.f54607i);
            imageView.setImageDrawable(bVar2);
            imageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.bytedance.tux.dialog.C23013a.View$OnClickListenerC230141 */

                /* renamed from: a */
                final /* synthetic */ C23013a f54492a;

                static {
                    Covode.recordClassIndex(26934);
                }

                {
                    this.f54492a = r1;
                }

                public final void onClick(View view) {
                    this.f54492a.mo37470a("button_close");
                }
            });
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        visualLayout.setBackgroundColor(this.f54572e.f54609k);
        visualLayout.setRadius((int) this.f54572e.f54605g);
        AbstractC23057h hVar = bVar.f54503b;
        C89219l.m154719c(this, "");
        imageArea.f54584a = hVar;
        if (hVar == null) {
            imageArea.mo37478a();
        } else {
            imageArea.removeAllViews();
            hVar.mo37401a(this);
            imageArea.addView(hVar.mo37400a());
        }
        AbstractC23047c cVar = bVar.f54504c;
        C89219l.m154719c(this, "");
        captionArea.removeAllViews();
        captionArea.f54583a = cVar;
        if (cVar != null) {
            cVar.mo37401a(this);
            captionArea.addView(cVar.mo37400a());
        }
        AbstractC23022e eVar = bVar.f54505d;
        C89219l.m154719c(this, "");
        accessoryArea.removeAllViews();
        accessoryArea.f54581a = eVar;
        if (eVar == null) {
            accessoryArea.setVisibility(8);
        } else {
            accessoryArea.setVisibility(0);
            eVar.mo37401a(this);
            accessoryArea.addView(eVar.mo37400a());
        }
        AbstractC23034g gVar = bVar.f54506e;
        C89219l.m154719c(this, "");
        actionArea.removeAllViews();
        actionArea.f54582a = gVar;
        if (gVar != null) {
            gVar.mo37401a(this);
            actionArea.addView(gVar.mo37400a());
        }
        mo37471c();
        Context context2 = visualLayout.getContext();
        C89219l.m154709a((Object) context2, "");
        double a2 = (double) C23159f.m43649a(context2);
        Double.isNaN(a2);
        int i3 = (int) (a2 * 0.08d);
        ViewGroup.LayoutParams layoutParams = visualLayout.getLayoutParams();
        if (layoutParams != null) {
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            int a3 = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i3, a3, i3, C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system3.getDisplayMetrics())));
            m43402a(bVar.f54591m);
            MethodCollector.m26664o(9347);
            return;
        }
        C89388w wVar = new C89388w("null cannot be cast to non-null type");
        MethodCollector.m26664o(9347);
        throw wVar;
    }
}
