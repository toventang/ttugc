package com.bytedance.android.live.design.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0820e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.android.live.design.app.p231a.AbstractC4059a;
import com.bytedance.android.live.design.app.p232b.C4067d;
import com.bytedance.android.live.design.app.p232b.C4069e;
import com.bytedance.android.live.design.app.p232b.C4072h;
import com.bytedance.android.live.design.app.p232b.C4074i;
import com.bytedance.android.live.design.app.p233c.C4077a;
import com.bytedance.android.live.design.app.p233c.C4078b;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.List;

public class LiveDialog extends LifecycleAwareDialog implements AbstractC33974au {

    /* renamed from: A */
    private boolean f11194A;

    /* renamed from: B */
    private ColorStateList f11195B;

    /* renamed from: C */
    private C4067d f11196C;

    /* renamed from: D */
    private C4069e f11197D;

    /* renamed from: E */
    private C4078b f11198E;

    /* renamed from: F */
    private LinearLayout f11199F;

    /* renamed from: a */
    private View f11200a;

    /* renamed from: b */
    private View f11201b;

    /* renamed from: c */
    private ImageView f11202c;

    /* renamed from: d */
    private ImageView f11203d;

    /* renamed from: e */
    private ImageView f11204e;

    /* renamed from: f */
    private TextView f11205f;

    /* renamed from: g */
    private View f11206g;

    /* renamed from: h */
    private FrameLayout f11207h;

    /* renamed from: i */
    private LiveTextView f11208i;

    /* renamed from: j */
    private ImageView f11209j;

    /* renamed from: k */
    private FrameLayout f11210k;

    /* renamed from: l */
    private AbstractC4059a f11211l;

    /* renamed from: m */
    private FrameLayout f11212m;

    /* renamed from: n */
    private boolean f11213n;

    /* renamed from: o */
    private CharSequence f11214o;

    /* renamed from: p */
    private CharSequence f11215p;

    /* renamed from: q */
    private View f11216q;

    /* renamed from: r */
    private Drawable f11217r;

    /* renamed from: s */
    private Drawable f11218s;

    /* renamed from: t */
    private int f11219t;

    /* renamed from: u */
    private int f11220u;

    /* renamed from: v */
    private Drawable f11221v;

    /* renamed from: w */
    private int f11222w;

    /* renamed from: x */
    private boolean f11223x;

    /* renamed from: y */
    private float f11224y;

    /* renamed from: z */
    private boolean f11225z;

    /* renamed from: com.bytedance.android.live.design.app.LiveDialog$b */
    public interface AbstractC4057b {
        static {
            Covode.recordClassIndex(4601);
        }

        /* renamed from: a */
        void mo8359a(DialogInterface dialogInterface);
    }

    static {
        Covode.recordClassIndex(4599);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.design.app.LiveDialog$a */
    public static class C4056a extends LifecycleAwareDialog.C4055a<C4056a> {

        /* renamed from: A */
        private C4074i f11226A;

        /* renamed from: c */
        public CharSequence f11227c;

        /* renamed from: d */
        public View f11228d;

        /* renamed from: e */
        public CharSequence f11229e;

        /* renamed from: f */
        public Drawable f11230f;

        /* renamed from: g */
        public Drawable f11231g;

        /* renamed from: h */
        public int f11232h;

        /* renamed from: i */
        public int f11233i;

        /* renamed from: j */
        public Drawable f11234j;

        /* renamed from: k */
        public int f11235k;

        /* renamed from: l */
        public boolean f11236l;

        /* renamed from: m */
        public float f11237m;

        /* renamed from: n */
        public boolean f11238n;

        /* renamed from: o */
        public boolean f11239o;

        /* renamed from: p */
        public ColorStateList f11240p;

        /* renamed from: q */
        public boolean f11241q = true;

        /* renamed from: r */
        public boolean f11242r = true;

        /* renamed from: s */
        public DialogInterface.OnShowListener f11243s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f11244t;

        /* renamed from: u */
        public DialogInterface.OnCancelListener f11245u;

        /* renamed from: v */
        public DialogInterface.OnKeyListener f11246v;

        /* renamed from: w */
        public AbstractC4059a f11247w;

        /* renamed from: x */
        public C4067d f11248x;

        /* renamed from: y */
        public C4078b f11249y;

        /* renamed from: z */
        private C4072h f11250z;

        static {
            Covode.recordClassIndex(4600);
        }

        /* renamed from: b */
        private C4056a m9862b() {
            C4067d.C4068a aVar = new C4067d.C4068a();
            aVar.mo9515a(this.f11250z);
            aVar.mo9515a(this.f11226A);
            return mo9501a(aVar.mo9516a());
        }

        /* renamed from: a */
        public final LiveDialog mo9503a() {
            return new LiveDialog(this.f11193b, this, (byte) 0);
        }

        public C4056a(Context context) {
            super(C4054a.m9853a(context));
        }

        /* renamed from: a */
        public final C4056a mo9499a(int i) {
            this.f11227c = this.f11193b.getResources().getString(i);
            return this;
        }

        /* renamed from: b */
        public final C4056a mo9504b(int i) {
            return mo9502a(this.f11193b.getResources().getString(i));
        }

        /* renamed from: a */
        public final C4056a mo9501a(C4067d dVar) {
            if (!(this.f11248x == null && dVar == null)) {
                this.f11248x = dVar;
                this.f11249y = null;
            }
            return this;
        }

        /* renamed from: a */
        public final C4056a mo9502a(CharSequence charSequence) {
            if (!TextUtils.isEmpty(this.f11229e) || !TextUtils.isEmpty(charSequence)) {
                this.f11229e = charSequence;
                this.f11228d = null;
            }
            return this;
        }

        /* renamed from: a */
        public final C4056a mo9500a(int i, AbstractC4057b bVar) {
            String string = this.f11193b.getResources().getString(i);
            C4072h.C4073a aVar = new C4072h.C4073a();
            aVar.f11261a = string;
            aVar.f11263c = bVar;
            this.f11250z = aVar.mo9524a();
            return m9862b();
        }

        /* renamed from: b */
        public final C4056a mo9505b(int i, AbstractC4057b bVar) {
            String string = this.f11193b.getResources().getString(i);
            C4074i.C4075a aVar = new C4074i.C4075a();
            aVar.f11261a = string;
            aVar.f11263c = bVar;
            this.f11226A = aVar.mo9525a();
            return m9862b();
        }
    }

    /* renamed from: b */
    private void m9857b() {
        ImageView imageView = this.f11204e;
        if (imageView != null) {
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) imageView.getLayoutParams();
            if (this.f11223x) {
                aVar.height = this.f11222w;
                aVar.f2225B = null;
            } else if (this.f11225z) {
                aVar.height = 0;
                aVar.f2225B = "w, " + this.f11224y;
            } else {
                aVar.height = -2;
                aVar.f2225B = null;
            }
            this.f11204e.setLayoutParams(aVar);
        }
    }

    /* renamed from: c */
    private void m9859c() {
        MethodCollector.m26663i(11900);
        List unmodifiableList = Collections.unmodifiableList(this.f11198E.f11286a);
        int size = unmodifiableList.size();
        for (int i = 0; i < size; i++) {
            C4077a aVar = (C4077a) unmodifiableList.get(i);
            LiveButton liveButton = new LiveButton(getContext());
            liveButton.mo9603b(aVar.f11283b);
            if (aVar.f11284c != null) {
                liveButton.setOnClickListener(new View$OnClickListenerC4076c(this, aVar));
            }
            liveButton.setText(aVar.f11282a);
            liveButton.setEnabled(aVar.f11285d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i > 0) {
                layoutParams.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.nb);
            }
            liveButton.setLayoutParams(layoutParams);
            this.f11199F.addView(liveButton);
        }
        if (size > 1) {
            LinearLayout linearLayout = this.f11199F;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), this.f11199F.getPaddingTop(), this.f11199F.getPaddingRight(), getContext().getResources().getDimensionPixelSize(R.dimen.o3));
            MethodCollector.m26664o(11900);
            return;
        }
        LinearLayout linearLayout2 = this.f11199F;
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.f11199F.getPaddingTop(), this.f11199F.getPaddingRight(), getContext().getResources().getDimensionPixelSize(R.dimen.nk));
        MethodCollector.m26664o(11900);
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f11213n = z;
        View view = this.f11200a;
        if (view == null) {
            return;
        }
        if (z) {
            view.setOnClickListener(new View$OnClickListenerC4062b(this));
        } else {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: a */
    private void m9855a(Drawable drawable) {
        ImageView imageView = this.f11202c;
        if (imageView != null && this.f11201b != null) {
            if (drawable == null) {
                imageView.setImageDrawable(null);
                this.f11202c.setVisibility(8);
                this.f11201b.setVisibility(8);
                return;
            }
            imageView.setImageDrawable(drawable);
            this.f11202c.setVisibility(0);
            this.f11201b.setVisibility(0);
        }
    }

    /* renamed from: c */
    private void m9860c(Drawable drawable) {
        ImageView imageView = this.f11204e;
        if (imageView != null && this.f11201b != null) {
            if (drawable == null) {
                imageView.setImageDrawable(null);
                this.f11204e.setVisibility(8);
                this.f11201b.setVisibility(8);
                return;
            }
            imageView.setImageDrawable(drawable);
            this.f11204e.setVisibility(0);
            this.f11201b.setVisibility(0);
        }
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f11214o = charSequence;
        if (this.f11205f != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.f11205f.setText("");
                this.f11205f.setVisibility(8);
            } else {
                this.f11205f.setText(this.f11214o);
                this.f11205f.setVisibility(0);
            }
        }
        m9856a(this.f11215p, this.f11216q);
    }

    /* renamed from: b */
    private void m9858b(Drawable drawable) {
        ImageView imageView = this.f11203d;
        if (imageView != null && this.f11201b != null) {
            if (drawable == null) {
                imageView.setImageDrawable(null);
                this.f11203d.setVisibility(8);
                this.f11201b.setVisibility(8);
                return;
            }
            imageView.setImageDrawable(drawable);
            this.f11203d.setVisibility(0);
            this.f11201b.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo9497a(AbstractC4059a aVar) {
        MethodCollector.m26663i(11731);
        this.f11211l = aVar;
        FrameLayout frameLayout = this.f11210k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            AbstractC4059a aVar2 = this.f11211l;
            if (aVar2 != null) {
                View a = aVar2.mo9507a(getContext());
                ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                } else if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = new FrameLayout.LayoutParams(layoutParams);
                }
                this.f11210k.addView(a, layoutParams);
                this.f11210k.setVisibility(0);
                MethodCollector.m26664o(11731);
                return;
            }
            this.f11210k.setVisibility(8);
        }
        MethodCollector.m26664o(11731);
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public void onCreate(Bundle bundle) {
        MethodCollector.m26663i(11405);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 23) {
                    window.addFlags(67108864);
                    window.addFlags(134217728);
                }
            }
            window.getDecorView().setSystemUiVisibility(512);
            window.setLayout(-1, -1);
        }
        setContentView(View.inflate(getContext(), R.layout.ajk, null), new ViewGroup.LayoutParams(-1, -1));
        this.f11200a = findViewById(R.id.caq);
        setCanceledOnTouchOutside(this.f11213n);
        this.f11201b = findViewById(R.id.cak);
        this.f11202c = (ImageView) findViewById(R.id.cai);
        this.f11203d = (ImageView) findViewById(R.id.caj);
        this.f11204e = (ImageView) findViewById(R.id.cah);
        Drawable drawable = this.f11217r;
        if (drawable != null) {
            m9858b(null);
            m9860c(null);
            this.f11217r = drawable;
            m9855a(drawable);
        } else {
            Drawable drawable2 = this.f11218s;
            if (drawable2 != null) {
                int i = this.f11219t;
                int i2 = this.f11220u;
                m9855a((Drawable) null);
                m9860c(null);
                this.f11218s = drawable2;
                m9858b(drawable2);
                this.f11219t = i;
                this.f11220u = i2;
                ImageView imageView = this.f11203d;
                if (imageView != null) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.width = this.f11219t;
                    layoutParams.height = this.f11220u;
                    this.f11203d.setLayoutParams(layoutParams);
                }
            } else {
                Drawable drawable3 = this.f11221v;
                if (drawable3 != null) {
                    if (this.f11223x) {
                        int i3 = this.f11222w;
                        m9855a((Drawable) null);
                        m9858b(null);
                        this.f11221v = drawable3;
                        m9860c(drawable3);
                        this.f11222w = i3;
                        this.f11223x = true;
                        this.f11225z = false;
                        m9857b();
                    } else if (this.f11225z) {
                        float f = this.f11224y;
                        m9855a((Drawable) null);
                        m9858b(null);
                        this.f11221v = drawable3;
                        m9860c(drawable3);
                        this.f11224y = f;
                        this.f11225z = true;
                        this.f11223x = false;
                        m9857b();
                    }
                }
            }
        }
        this.f11205f = (TextView) findViewById(R.id.cap);
        setTitle(this.f11214o);
        this.f11206g = findViewById(R.id.can);
        this.f11207h = (FrameLayout) findViewById(R.id.cam);
        LiveTextView liveTextView = (LiveTextView) findViewById(R.id.cao);
        this.f11208i = liveTextView;
        liveTextView.setMovementMethod(LinkMovementMethod.getInstance());
        m9856a(this.f11215p, this.f11216q);
        ImageView imageView2 = (ImageView) findViewById(R.id.caf);
        this.f11209j = imageView2;
        imageView2.setOnClickListener(new View$OnClickListenerC4058a(this));
        boolean z = this.f11194A;
        this.f11194A = z;
        ImageView imageView3 = this.f11209j;
        if (imageView3 != null) {
            if (z) {
                imageView3.setVisibility(0);
            } else {
                imageView3.setVisibility(8);
            }
        }
        ColorStateList colorStateList = this.f11195B;
        this.f11195B = colorStateList;
        ImageView imageView4 = this.f11209j;
        if (imageView4 != null) {
            C0820e.m2895a(imageView4, colorStateList);
        }
        this.f11210k = (FrameLayout) findViewById(R.id.cad);
        mo9497a(this.f11211l);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.cae);
        this.f11212m = frameLayout;
        C4067d dVar = this.f11196C;
        if (dVar != null) {
            this.f11198E = null;
            this.f11196C = dVar;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                if (this.f11196C != null) {
                    if (this.f11197D == null) {
                        this.f11197D = new C4069e(getContext());
                    }
                    this.f11197D.mo9517a(this, Collections.unmodifiableList(this.f11196C.f11266a));
                    this.f11197D.setOrientation(this.f11196C.f11267b);
                    this.f11212m.addView(this.f11197D, -1, -2);
                } else {
                    C4069e eVar = this.f11197D;
                    if (eVar != null) {
                        eVar.mo9517a(this, Collections.emptyList());
                    }
                }
            }
        }
        C4078b bVar = this.f11198E;
        if (bVar != null) {
            this.f11196C = null;
            this.f11198E = bVar;
            FrameLayout frameLayout2 = this.f11212m;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
                if (this.f11198E != null) {
                    LinearLayout linearLayout = this.f11199F;
                    if (linearLayout == null) {
                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                        linearLayout2.setOrientation(1);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.na);
                        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.o0);
                        layoutParams2.rightMargin = dimensionPixelSize;
                        layoutParams2.leftMargin = dimensionPixelSize;
                        linearLayout2.setLayoutParams(layoutParams2);
                        this.f11199F = linearLayout2;
                    } else {
                        linearLayout.removeAllViews();
                    }
                    m9859c();
                    this.f11212m.addView(this.f11199F);
                    MethodCollector.m26664o(11405);
                    return;
                }
                this.f11199F.removeAllViews();
            }
        }
        MethodCollector.m26664o(11405);
    }

    private LiveDialog(Context context, C4056a aVar) {
        super(context, aVar);
        this.f11217r = aVar.f11230f;
        this.f11218s = aVar.f11231g;
        this.f11219t = aVar.f11232h;
        this.f11220u = aVar.f11233i;
        this.f11221v = aVar.f11234j;
        this.f11222w = aVar.f11235k;
        this.f11224y = aVar.f11237m;
        this.f11223x = aVar.f11236l;
        this.f11225z = aVar.f11238n;
        this.f11214o = aVar.f11227c;
        this.f11215p = aVar.f11229e;
        this.f11216q = aVar.f11228d;
        this.f11194A = aVar.f11239o;
        this.f11195B = aVar.f11240p;
        this.f11211l = aVar.f11247w;
        setOnShowListener(aVar.f11243s);
        setOnCancelListener(aVar.f11245u);
        setOnDismissListener(aVar.f11244t);
        setOnKeyListener(aVar.f11246v);
        setCancelable(aVar.f11242r);
        setCanceledOnTouchOutside(aVar.f11241q);
        this.f11196C = aVar.f11248x;
        this.f11198E = aVar.f11249y;
    }

    /* renamed from: a */
    private void m9856a(CharSequence charSequence, View view) {
        FrameLayout frameLayout;
        MethodCollector.m26663i(11570);
        if (this.f11206g == null || this.f11208i == null || (frameLayout = this.f11207h) == null) {
            MethodCollector.m26664o(11570);
            return;
        }
        View view2 = this.f11216q;
        if (view2 != null) {
            frameLayout.removeView(view2);
        }
        this.f11215p = charSequence;
        this.f11216q = view;
        if (!TextUtils.isEmpty(charSequence)) {
            this.f11208i.setText(this.f11215p);
            if (TextUtils.isEmpty(this.f11214o)) {
                this.f11208i.mo9623a(R.style.tj);
            } else {
                this.f11208i.mo9623a(R.style.tm);
            }
            this.f11208i.setVisibility(0);
            this.f11206g.setVisibility(0);
            MethodCollector.m26664o(11570);
            return;
        }
        View view3 = this.f11216q;
        if (view3 != null) {
            this.f11207h.addView(view3, -1, -2);
            this.f11208i.setText("");
            this.f11208i.setVisibility(8);
            this.f11206g.setVisibility(0);
            MethodCollector.m26664o(11570);
            return;
        }
        this.f11208i.setText("");
        this.f11208i.setVisibility(8);
        this.f11206g.setVisibility(8);
        MethodCollector.m26664o(11570);
    }

    /* synthetic */ LiveDialog(Context context, C4056a aVar, byte b) {
        this(context, aVar);
    }
}
