package com.p2082ss.android.ugc.tools.view.style;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.tools.p4336a.C84380c;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.style.j */
public final class C84984j extends LinearLayout {

    /* renamed from: c */
    public static final C84985a f190026c = new C84985a((byte) 0);

    /* renamed from: a */
    public final SimpleDraweeView f190027a;

    /* renamed from: b */
    public final TextView f190028b;

    /* renamed from: d */
    private final AbstractC89244h f190029d;

    /* renamed from: e */
    private int f190030e;

    /* renamed from: f */
    private int f190031f;

    /* renamed from: g */
    private boolean f190032g;

    /* renamed from: h */
    private boolean f190033h;

    static {
        Covode.recordClassIndex(98989);
    }

    private final View getDotView() {
        return (View) this.f190029d.getValue();
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.j$a */
    public static final class C84985a {
        static {
            Covode.recordClassIndex(98990);
        }

        private C84985a() {
        }

        public /* synthetic */ C84985a(byte b) {
            this();
        }
    }

    public final int getSelectColor() {
        return this.f190030e;
    }

    public final TextView getTextView() {
        return this.f190028b;
    }

    public final int getUnSelectColor() {
        return this.f190031f;
    }

    private final int getIconHeight() {
        Context context = getContext();
        C89219l.m154716b(context, "");
        return (int) C84912r.m145930a(context, 24.0f);
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.j$b */
    static final class C84986b extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C84984j f190034a;

        /* renamed from: b */
        final /* synthetic */ Context f190035b;

        static {
            Covode.recordClassIndex(98991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84986b(C84984j jVar, Context context) {
            super(0);
            this.f190034a = jVar;
            this.f190035b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View a = C1764a.m5927a(LayoutInflater.from(this.f190035b), R.layout.b41, this.f190034a, false);
            this.f190034a.addView(a);
            C89219l.m154716b(a, "");
            a.setBackground(C84984j.m146059a(this.f190035b.getResources().getColor(R.color.t7)));
            return a;
        }
    }

    /* renamed from: a */
    private final void m146060a() {
        int i;
        if (this.f190032g) {
            i = this.f190030e;
        } else {
            i = this.f190031f;
        }
        this.f190028b.setTextColor(i);
        this.f190027a.setImageAlpha(Color.alpha(i));
    }

    /* renamed from: b */
    private final void m146061b() {
        if (!this.f190033h) {
            C84981g.m146055a(this.f190028b);
        } else if (this.f190032g) {
            C84981g.m146055a(this.f190028b);
            this.f190028b.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            this.f190028b.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.j$c */
    public static final class C84987c extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C84984j f190036a;

        static {
            Covode.recordClassIndex(98992);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84987c(C84984j jVar) {
            this.f190036a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
            this.f190036a.mo129821a(fVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            this.f190036a.mo129821a(fVar);
        }
    }

    /* renamed from: a */
    public final void mo129822a(boolean z) {
        int i;
        View dotView = getDotView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        dotView.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo129823b(int i) {
        this.f190028b.setTextColor(i);
        this.f190027a.setImageAlpha(Color.alpha(i));
    }

    public final void setDotColor(int i) {
        getDotView().setBackground(m146059a(i));
    }

    public final void setImage(int i) {
        setImageVisibility(true);
        this.f190027a.setImageResource(i);
    }

    public final void setImageVisibility(boolean z) {
        int i;
        SimpleDraweeView simpleDraweeView = this.f190027a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        simpleDraweeView.setVisibility(i);
    }

    public final void setOnlyBoldOnSelection(boolean z) {
        if (z != this.f190033h) {
            this.f190033h = z;
            m146061b();
        }
    }

    public final void setSelectColor(int i) {
        if (this.f190030e != i) {
            this.f190030e = i;
            if (this.f190032g) {
                m146060a();
            }
        }
    }

    public final void setSelected(boolean z) {
        super.setSelected(z);
        this.f190032g = z;
        m146060a();
        m146061b();
    }

    public final void setTextVisibility(boolean z) {
        int i;
        TextView textView = this.f190028b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setUnSelectColor(int i) {
        if (this.f190031f != i) {
            this.f190031f = i;
            if (!this.f190032g) {
                m146060a();
            }
        }
    }

    /* renamed from: a */
    public static GradientDrawable m146059a(int i) {
        return C84966b.C84967a.m146038a().mo129752a(1).mo129755b(i).mo129753a(i, 0).mo129750a();
    }

    public final void setImage(Drawable drawable) {
        setImageVisibility(true);
        this.f190027a.setImageDrawable(drawable);
    }

    public final void setText(int i) {
        Context context = getContext();
        C89219l.m154716b(context, "");
        String string = context.getResources().getString(i);
        C89219l.m154716b(string, "");
        setText(string);
    }

    public final void setImage(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        setImageVisibility(true);
        C84402a.m145170a(this.f190027a, urlModel, Bitmap.Config.ARGB_8888, true, (AbstractC24203d<AbstractC24457f>) new C84987c(this));
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            setTextVisibility(true);
            this.f190028b.setText(str);
            return;
        }
        setTextVisibility(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C84984j(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8249);
        this.f190029d = C89250i.m154773a((AbstractC89171a) new C84986b(this, context));
        this.f190030e = context.getResources().getColor(R.color.ua);
        this.f190031f = context.getResources().getColor(R.color.ub);
        this.f190033h = true;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b42, this, true);
        View findViewById = a.findViewById(R.id.ee3);
        C89219l.m154716b(findViewById, "");
        this.f190027a = (SimpleDraweeView) findViewById;
        View findViewById2 = a.findViewById(R.id.ee5);
        C89219l.m154716b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.f190028b = textView;
        textView.setTextSize(15.0f);
        m146060a();
        m146061b();
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        C84380c.m145132a(textView);
        MethodCollector.m26664o(8249);
    }

    /* renamed from: a */
    public final void mo129821a(AbstractC24457f fVar) {
        if (fVar != null && (this.f190027a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f190027a.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int iconHeight = getIconHeight();
            float height = ((float) iconHeight) / ((float) fVar.getHeight());
            marginLayoutParams.height = iconHeight;
            marginLayoutParams.width = (int) (((float) fVar.getWidth()) * height);
            this.f190027a.setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            this.f190027a.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setImage(String str) {
        C89219l.m154721d(str, "");
        setImageVisibility(true);
        C84402a.m145173a(this.f190027a, str);
    }

    public /* synthetic */ C84984j(Context context, byte b) {
        this(context);
    }
}
