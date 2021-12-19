package com.bytedance.tux.status;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.bytedance.tux.widget.FlexLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

public final class TuxStatusView extends FrameLayout {

    /* renamed from: a */
    public static final C23261a f55111a = new C23261a((byte) 0);

    /* renamed from: b */
    private AbstractC23262b f55112b;

    /* renamed from: c */
    private boolean f55113c;

    /* renamed from: d */
    private final int f55114d;

    /* renamed from: e */
    private final float f55115e;

    /* renamed from: f */
    private final float f55116f;

    /* renamed from: g */
    private final int f55117g;

    /* renamed from: h */
    private final int f55118h;

    /* renamed from: i */
    private final int f55119i;

    /* renamed from: j */
    private final int f55120j;

    /* renamed from: k */
    private final int f55121k;

    /* renamed from: l */
    private HashMap f55122l;

    /* renamed from: com.bytedance.tux.status.TuxStatusView$b */
    public interface AbstractC23262b {
        static {
            Covode.recordClassIndex(27206);
        }

        /* renamed from: a */
        void mo37874a();

        /* renamed from: b */
        void mo37875b();
    }

    static {
        Covode.recordClassIndex(27204);
    }

    public TuxStatusView(Context context) {
        this(context, null, 0, 6);
    }

    public TuxStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: a */
    private View m43808a(int i) {
        if (this.f55122l == null) {
            this.f55122l = new HashMap();
        }
        View view = (View) this.f55122l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f55122l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.tux.status.TuxStatusView$a */
    public static final class C23261a {
        static {
            Covode.recordClassIndex(27205);
        }

        private C23261a() {
        }

        public /* synthetic */ C23261a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.tux.status.TuxStatusView$d */
    static final class C23264d implements AbstractC23262b {

        /* renamed from: a */
        public final View f55133a;

        static {
            Covode.recordClassIndex(27208);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.AbstractC23262b
        /* renamed from: a */
        public final void mo37874a() {
            this.f55133a.setVisibility(0);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.AbstractC23262b
        /* renamed from: b */
        public final void mo37875b() {
            this.f55133a.setVisibility(4);
        }

        public C23264d(View view) {
            C89219l.m154719c(view, "");
            this.f55133a = view;
        }
    }

    /* renamed from: com.bytedance.tux.status.TuxStatusView$e */
    public static final class C23265e implements AbstractC23262b {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f55134a;

        static {
            Covode.recordClassIndex(27209);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.AbstractC23262b
        /* renamed from: a */
        public final void mo37874a() {
            this.f55134a.element.setVisibility(0);
            this.f55134a.element.mo37884b();
        }

        @Override // com.bytedance.tux.status.TuxStatusView.AbstractC23262b
        /* renamed from: b */
        public final void mo37875b() {
            this.f55134a.element.setVisibility(4);
            this.f55134a.element.mo37885c();
        }

        C23265e(C89233z.C89238e eVar) {
            this.f55134a = eVar;
        }
    }

    /* renamed from: a */
    public final void mo37867a() {
        if (this.f55112b == null) {
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) findViewById(R.id.er8);
            if (eVar.element == null) {
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                T t = (T) new TuxDualBallView(context, (AttributeSet) null, 6);
                t.setId(R.id.er8);
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                int a = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
                layoutParams.gravity = 17;
                t.setLayoutParams(layoutParams);
                if (t.getParent() == null) {
                    addView(t);
                }
                eVar.element = t;
            }
            mo37869a(new C23265e(eVar));
        }
        AbstractC23262b bVar = this.f55112b;
        if (bVar != null) {
            bVar.mo37874a();
        }
        FlexLayout flexLayout = (FlexLayout) m43808a(R.id.e7m);
        if (flexLayout != null) {
            flexLayout.setVisibility(4);
        }
    }

    /* renamed from: b */
    private final void m43809b() {
        MethodCollector.m26663i(9385);
        if (!this.f55113c) {
            View.inflate(getContext(), R.layout.u, this);
            float f = this.f55115e;
            if (f > 0.0f) {
                setTopMarginInner(f);
            }
            float f2 = this.f55116f;
            if (f2 > 0.0f) {
                setButtonTopMarginInner(f2);
            }
            setLayoutVariantInner(this.f55114d);
            ((TuxTextView) m43808a(R.id.title_tv)).setTuxFont(this.f55120j);
            ((TuxTextView) m43808a(R.id.title_tv)).setTextColor(this.f55117g);
            ((TuxTextView) m43808a(R.id.message_tv)).setTuxFont(this.f55121k);
            ((TuxTextView) m43808a(R.id.message_tv)).setTextColor(this.f55118h);
            ((TuxButton) m43808a(R.id.button)).setButtonVariant(this.f55119i);
            FlexLayout flexLayout = (FlexLayout) m43808a(R.id.e7m);
            C89219l.m154709a((Object) flexLayout, "");
            flexLayout.setVisibility(4);
            this.f55113c = true;
        }
        MethodCollector.m26664o(9385);
    }

    public final void setButtonTopMargin(float f) {
        m43809b();
        setButtonTopMarginInner(f);
    }

    public final void setLayoutVariant(int i) {
        m43809b();
        setLayoutVariantInner(i);
    }

    public final void setTopMargin(float f) {
        m43809b();
        setTopMarginInner(f);
    }

    /* renamed from: com.bytedance.tux.status.TuxStatusView$c */
    public static final class C23263c {

        /* renamed from: a */
        public int f55123a = -1;

        /* renamed from: b */
        public Bitmap f55124b;

        /* renamed from: c */
        public Drawable f55125c;

        /* renamed from: d */
        public C22999a f55126d;

        /* renamed from: e */
        public int f55127e;

        /* renamed from: f */
        public int f55128f = -1;

        /* renamed from: g */
        public int f55129g = -1;

        /* renamed from: h */
        public String f55130h = "";

        /* renamed from: i */
        public CharSequence f55131i = "";

        /* renamed from: j */
        public AbstractC89172b<? super TuxButton, C89391z> f55132j;

        static {
            Covode.recordClassIndex(27207);
        }

        /* renamed from: a */
        public final C23263c mo37877a(C22999a aVar) {
            this.f55127e = 0;
            this.f55126d = aVar;
            return this;
        }

        /* renamed from: a */
        public final C23263c mo37878a(CharSequence charSequence) {
            C89219l.m154719c(charSequence, "");
            this.f55131i = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C23263c mo37879a(String str) {
            C89219l.m154719c(str, "");
            this.f55130h = str;
            return this;
        }

        /* renamed from: a */
        public final C23263c mo37876a(int i, int i2) {
            this.f55127e = i;
            this.f55123a = i2;
            return this;
        }

        /* renamed from: b */
        public final C23263c mo37880b(int i, int i2) {
            this.f55128f = i;
            this.f55129g = i2;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo37869a(AbstractC23262b bVar) {
        C89219l.m154719c(bVar, "");
        AbstractC23262b bVar2 = this.f55112b;
        if (bVar2 != null) {
            bVar2.mo37875b();
        }
        this.f55112b = bVar;
    }

    private final void setLayoutVariantInner(int i) {
        View a = m43808a(R.id.top_margin_view);
        C89219l.m154709a((Object) a, "");
        a.setTag(Integer.valueOf(i));
        m43808a(R.id.top_margin_view).requestLayout();
    }

    private final void setTopMarginInner(float f) {
        View a = m43808a(R.id.top_margin_view);
        C89219l.m154709a((Object) a, "");
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        if (layoutParams != null) {
            Context context = getContext();
            C89219l.m154709a((Object) context, "");
            ((FlexLayout.C23372am) layoutParams).f55444h = FlexLayout.C23376ao.C23377a.m44026a(context, f + "px", "layout_height");
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    private final void setButtonTopMarginInner(float f) {
        TuxButton tuxButton = (TuxButton) m43808a(R.id.button);
        C89219l.m154709a((Object) tuxButton, "");
        ViewGroup.LayoutParams layoutParams = tuxButton.getLayoutParams();
        if (layoutParams != null) {
            Context context = getContext();
            C89219l.m154709a((Object) context, "");
            ((FlexLayout.C23372am) layoutParams).f55439c = FlexLayout.C23376ao.C23377a.m44026a(context, "message_tv.bottom+" + f + "px", "layout_top");
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    public final void mo37868a(View view) {
        C89219l.m154719c(view, "");
        if (view.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            addView(view, layoutParams);
        }
        mo37869a(new C23264d(view));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStatus(com.bytedance.tux.status.TuxStatusView.C23263c r8) {
        /*
        // Method dump skipped, instructions count: 414
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.status.TuxStatusView.setStatus(com.bytedance.tux.status.TuxStatusView$c):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9532);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.fb, R.attr.fc, R.attr.fd, R.attr.fe, R.attr.ff, R.attr.aps, R.attr.ar1, R.attr.ar2}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        this.f55114d = obtainStyledAttributes.getInt(5, 0);
        this.f55115e = obtainStyledAttributes.getDimension(7, 0.0f);
        this.f55116f = obtainStyledAttributes.getDimension(6, 0.0f);
        this.f55117g = obtainStyledAttributes.getColor(3, -16777216);
        this.f55118h = obtainStyledAttributes.getColor(1, -16777216);
        this.f55119i = obtainStyledAttributes.getInt(0, 0);
        this.f55120j = obtainStyledAttributes.getInt(4, 0);
        this.f55121k = obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(9532);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxStatusView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.c7 : i);
    }
}
