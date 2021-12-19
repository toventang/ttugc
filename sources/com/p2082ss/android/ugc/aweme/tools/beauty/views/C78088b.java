package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2740a.C41095a;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.tools.view.style.C84981g;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.b */
public final class C78088b extends C85035a {

    /* renamed from: b */
    public static final C78090b f175330b = new C78090b((byte) 0);

    /* renamed from: a */
    public ImageView f175331a;

    /* renamed from: d */
    private C78091c f175332d;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.b$c */
    public static final class C78091c {

        /* renamed from: a */
        public boolean f175336a;

        /* renamed from: b */
        public int f175337b;

        /* renamed from: c */
        public int f175338c;

        /* renamed from: d */
        public int f175339d;

        /* renamed from: e */
        public int f175340e;

        /* renamed from: f */
        public boolean f175341f = true;

        /* renamed from: g */
        public int f175342g = 4;

        /* renamed from: h */
        public int f175343h = 4;

        /* renamed from: i */
        public int f175344i = R.color.te;

        /* renamed from: j */
        public boolean f175345j = true;

        /* renamed from: k */
        public boolean f175346k = true;

        /* renamed from: l */
        public int f175347l = 2;

        /* renamed from: m */
        public int f175348m = R.color.te;

        /* renamed from: n */
        public int f175349n = R.color.a2j;

        /* renamed from: o */
        public int f175350o = 2;

        /* renamed from: p */
        public int f175351p = 8;

        /* renamed from: q */
        public int f175352q = R.color.a2j;

        /* renamed from: r */
        public int f175353r = R.color.a2j;

        static {
            Covode.recordClassIndex(91189);
        }
    }

    static {
        Covode.recordClassIndex(91186);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.b$b */
    public static final class C78090b {
        static {
            Covode.recordClassIndex(91188);
        }

        private C78090b() {
        }

        public /* synthetic */ C78090b(byte b) {
            this();
        }

        /* renamed from: a */
        public static C78088b m136507a(Context context, AbstractC89172b<? super C78089a, C89391z> bVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(bVar, "");
            C78089a aVar = new C78089a(context);
            bVar.invoke(aVar);
            C78088b a = aVar.mo122016b();
            TextView textView = a.getTextView();
            if (textView != null) {
                if (C84370a.f188623l.f188630f) {
                    textView.setTextSize(12.0f);
                    C84981g.m146055a(textView);
                } else {
                    textView.setTextSize(11.0f);
                    textView.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
            return a;
        }
    }

    public final C78091c getConfig() {
        return this.f175332d;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.b$a */
    public static final class C78089a extends C85035a.C85036a {

        /* renamed from: a */
        public int f175333a = R.color.a2j;

        /* renamed from: b */
        public int f175334b = R.color.a2j;

        /* renamed from: c */
        private int f175335c = 8;

        static {
            Covode.recordClassIndex(91187);
        }

        /* renamed from: a */
        public final C78088b mo122016b() {
            C78091c cVar = new C78091c();
            cVar.f175336a = this.f190273d;
            cVar.f175337b = this.f190274e;
            cVar.f175338c = this.f190276g;
            cVar.f175339d = this.f190277h;
            cVar.f175340e = this.f190278i;
            cVar.f175341f = this.f190279j;
            cVar.f175342g = this.f190280k;
            cVar.f175343h = this.f190281l;
            cVar.f175344i = this.f190282m;
            cVar.f175345j = this.f190283n;
            cVar.f175346k = this.f190284o;
            cVar.f175347l = this.f190286q;
            cVar.f175348m = this.f190287r;
            cVar.f175349n = this.f190288s;
            cVar.f175350o = this.f190289t;
            cVar.f175351p = this.f175335c;
            cVar.f175352q = this.f175333a;
            cVar.f175353r = this.f175334b;
            return new C78088b(this.f190291v, cVar);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78089a(Context context) {
            super(context);
            C89219l.m154721d(context, "");
        }
    }

    public final void setConfig(C78091c cVar) {
        C89219l.m154721d(cVar, "");
        this.f175332d = cVar;
    }

    public final void setEnableUI(boolean z) {
        mo122008a(z, false);
    }

    private final void setIconEnableUi(boolean z) {
        if (z) {
            getImageView().clearColorFilter();
        } else {
            getImageView().setColorFilter(R.color.d9, PorterDuff.Mode.DST_IN);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    /* renamed from: a */
    public final View mo78372a(Context context) {
        C89219l.m154721d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C41095a.m82771a(context), -2);
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setLayoutParams(layoutParams);
        styleTextView.setGravity(17);
        return styleTextView;
    }

    public final void setTextEnableUi(boolean z) {
        Resources resources;
        int i;
        if (z) {
            resources = getResources();
            i = this.f175332d.f175353r;
        } else {
            resources = getResources();
            i = R.color.d9;
        }
        int color = resources.getColor(i);
        TextView textView = getTextView();
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    /* renamed from: a */
    public final void mo122007a(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (z) {
            View dotView = getDotView();
            if (dotView != null) {
                layoutParams = dotView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 81;
            Context context = getContext();
            C89219l.m154716b(context, "");
            layoutParams2.topMargin = (int) C84912r.m145930a(context, (float) this.f175332d.f175351p);
            View dotView2 = getDotView();
            if (dotView2 != null) {
                dotView2.setLayoutParams(layoutParams2);
            }
        }
        super.mo122007a(z);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    /* renamed from: b */
    public final View mo122009b(Context context) {
        MethodCollector.m26663i(13201);
        C89219l.m154721d(context, "");
        int a = (int) C84912r.m145930a(context, 4.0f);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(a, a);
        View view = new View(context);
        view.setLayoutParams(layoutParams);
        MethodCollector.m26664o(13201);
        return view;
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    public final void setCustomSelected(boolean z) {
        Resources resources;
        int i;
        super.setCustomSelected(z);
        if (z) {
            resources = getResources();
            i = this.f175332d.f175344i;
        } else {
            resources = getResources();
            i = this.f175332d.f175353r;
        }
        int color = resources.getColor(i);
        TextView textView = getTextView();
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    /* renamed from: a */
    public final void mo122008a(boolean z, boolean z2) {
        setIconEnableUi(z);
        m136500b(z2, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78088b(Context context, C78091c cVar) {
        super(context, cVar.f175336a, cVar.f175337b, cVar.f175338c, cVar.f175339d, cVar.f175340e, cVar.f175341f, cVar.f175342g, cVar.f175343h, cVar.f175344i, cVar.f175345j, cVar.f175346k, cVar.f175347l, cVar.f175348m, cVar.f175349n, cVar.f175350o);
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        this.f175332d = cVar;
        View findViewById = findViewById(R.id.bv6);
        C89219l.m154716b(findViewById, "");
        this.f175331a = (ImageView) findViewById;
    }

    /* renamed from: b */
    private final void m136500b(boolean z, boolean z2) {
        int color;
        if (z) {
            if (z2) {
                color = getResources().getColor(this.f175332d.f175352q);
            }
            color = getResources().getColor(R.color.d9);
        } else {
            if (z2) {
                color = getResources().getColor(this.f175332d.f175349n);
            }
            color = getResources().getColor(R.color.d9);
        }
        View dotView = getDotView();
        if (dotView != null) {
            C84966b b = C84966b.C84967a.m146038a().mo129752a(1).mo129755b(color);
            Context context = getContext();
            C89219l.m154716b(context, "");
            dotView.setBackground(b.mo129753a(color, (int) C84912r.m145930a(context, (float) this.f175332d.f175350o)).mo129750a());
        }
    }
}
