package com.p2082ss.android.ugc.tools.view.widget.p4369c;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.C85058m;
import com.p2082ss.android.ugc.tools.view.widget.CircleProgressView;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.c.b */
public class C85037b extends C85035a {

    /* renamed from: g */
    public static final C85039b f190292g = new C85039b((byte) 0);

    /* renamed from: j */
    private static final int f190293j = ((int) C84912r.m145930a(C84401c.m145164a(), 2.0f));

    /* renamed from: k */
    private static final int f190294k = ((int) C84912r.m145930a(C84401c.m145164a(), 3.0f));

    /* renamed from: a */
    private CircleProgressView f190295a;

    /* renamed from: b */
    private boolean f190296b;

    /* renamed from: d */
    public ImageView f190297d;

    /* renamed from: e */
    public final Animation f190298e;

    /* renamed from: f */
    public final int f190299f;

    /* renamed from: h */
    private final int f190300h;

    /* renamed from: i */
    private final boolean f190301i;

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    /* renamed from: a */
    public int mo129964a() {
        return R.layout.b3j;
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.c.b$b */
    public static final class C85039b {
        static {
            Covode.recordClassIndex(99060);
        }

        private C85039b() {
        }

        public /* synthetic */ C85039b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final int getDownloadIconRes() {
        return this.f190299f;
    }

    public final boolean getEnableDotView() {
        return this.f190301i;
    }

    /* access modifiers changed from: protected */
    public final int getLoadingIconRes() {
        return this.f190300h;
    }

    /* renamed from: b */
    public final void mo129976b() {
        ImageView imageView = this.f190297d;
        if (imageView == null) {
            C89219l.m154710a("downloadImg");
        }
        imageView.setVisibility(4);
        CircleProgressView circleProgressView = this.f190295a;
        if (circleProgressView == null) {
            C89219l.m154710a("progressView");
        }
        circleProgressView.setVisibility(4);
    }

    static {
        Covode.recordClassIndex(99058);
    }

    /* renamed from: c */
    public final void mo129977c() {
        ImageView imageView = this.f190297d;
        if (imageView == null) {
            C89219l.m154710a("downloadImg");
        }
        imageView.setVisibility(4);
        CircleProgressView circleProgressView = this.f190295a;
        if (circleProgressView == null) {
            C89219l.m154710a("progressView");
        }
        circleProgressView.setVisibility(0);
        CircleProgressView circleProgressView2 = this.f190295a;
        if (circleProgressView2 == null) {
            C89219l.m154710a("progressView");
        }
        circleProgressView2.setProgress(0);
    }

    /* renamed from: d */
    public final void mo129978d() {
        if (this.f190296b) {
            ImageView imageView = this.f190297d;
            if (imageView == null) {
                C89219l.m154710a("downloadImg");
            }
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = this.f190297d;
            if (imageView2 == null) {
                C89219l.m154710a("downloadImg");
            }
            imageView2.setVisibility(4);
        }
        CircleProgressView circleProgressView = this.f190295a;
        if (circleProgressView == null) {
            C89219l.m154710a("progressView");
        }
        circleProgressView.setVisibility(4);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.c.b$a */
    public static class C85038a extends C85035a.C85036a {

        /* renamed from: a */
        public int f190302a = 2131230945;

        /* renamed from: b */
        public int f190303b = 2131230947;

        /* renamed from: c */
        public int f190304c = R.color.go;

        static {
            Covode.recordClassIndex(99059);
        }

        /* renamed from: a */
        public final C85037b mo122016b() {
            return new C85037b(this.f190291v, this.f190273d, this.f190274e, this.f190276g, this.f190277h, this.f190278i, this.f190279j, this.f190280k, this.f190281l, this.f190304c, this.f190283n, this.f190284o, this.f190286q, this.f190287r, this.f190288s, this.f190289t, mo129973c(), this.f190302a, this.f190303b, this.f190285p, this.f190290u);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85038a(Context context) {
            super(context);
            C89219l.m154721d(context, "");
        }
    }

    public final void setShowDownloadIcon(boolean z) {
        this.f190296b = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    /* renamed from: a */
    public View mo78372a(Context context) {
        C89219l.m154721d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        C85058m mVar = new C85058m(context, (byte) 0);
        mVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        mVar.setHorizontalFadingEdgeEnabled(true);
        mVar.setMaxEms(4);
        mVar.setLayoutParams(layoutParams);
        mVar.setGravity(17);
        return mVar;
    }

    /* renamed from: a */
    public final void mo129974a(int i) {
        ImageView imageView = this.f190297d;
        if (imageView == null) {
            C89219l.m154710a("downloadImg");
        }
        imageView.setVisibility(4);
        CircleProgressView circleProgressView = this.f190295a;
        if (circleProgressView == null) {
            C89219l.m154710a("progressView");
        }
        if (circleProgressView.getVisibility() != 0) {
            CircleProgressView circleProgressView2 = this.f190295a;
            if (circleProgressView2 == null) {
                C89219l.m154710a("progressView");
            }
            circleProgressView2.setVisibility(0);
        }
        CircleProgressView circleProgressView3 = this.f190295a;
        if (circleProgressView3 == null) {
            C89219l.m154710a("progressView");
        }
        circleProgressView3.setProgress(i);
    }

    /* renamed from: a */
    public final void mo129975a(int i, int i2) {
        if (i == 1) {
            mo129976b();
        } else if (i == 2) {
            mo129977c();
        } else if (i == 3) {
            mo129978d();
        } else if (i == 4) {
            mo129976b();
        } else if (i == 5) {
            mo129974a(i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85037b(Context context, boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, boolean z3, boolean z4, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z5, boolean z6) {
        super(context, z, i, i2, i3, i4, z2, i5, i6, i7, z3, z4, i8, i9, i10, i11, i12, z5, z6);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10090);
        this.f190299f = i13;
        this.f190300h = i14;
        this.f190301i = z5;
        this.f190298e = AnimationUtils.loadAnimation(context, R.anim.e6);
        View findViewById = findViewById(R.id.bmb);
        ImageView imageView = (ImageView) findViewById;
        imageView.setImageResource(i13);
        C89219l.m154716b(findViewById, "");
        this.f190297d = imageView;
        View findViewById2 = findViewById(R.id.bxi);
        CircleProgressView circleProgressView = (CircleProgressView) findViewById2;
        circleProgressView.setBgCircleColor(circleProgressView.getResources().getColor(R.color.tm));
        circleProgressView.setProgressColor(-1);
        circleProgressView.setMaxProgress(100);
        circleProgressView.setCircleWidth(f190293j);
        circleProgressView.setBgCircleWidth(f190294k);
        C89219l.m154716b(findViewById2, "");
        this.f190295a = circleProgressView;
        MethodCollector.m26664o(10090);
    }
}
