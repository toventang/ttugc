package com.bytedance.android.livesdk.p562k;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.bytedance.android.live.design.widget.C4128c;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.Window$CallbackC17224p;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.dmt.p1194ui.widget.RectCornerRelativeLayout;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.k.b */
public class DialogC9148b extends Dialog {

    /* renamed from: E */
    public static float f22153E = 0.5f;

    /* renamed from: Q */
    private static final Float f22154Q = Float.valueOf(17.0f);

    /* renamed from: R */
    private static final Float f22155R;

    /* renamed from: S */
    private static final Float f22156S = Float.valueOf(0.75f);

    /* renamed from: T */
    private static final Float f22157T = Float.valueOf(16.0f);

    /* renamed from: U */
    private static final Float f22158U;

    /* renamed from: V */
    private static final Float f22159V = Float.valueOf(20.0f);

    /* renamed from: W */
    private static final Float f22160W = Float.valueOf(2.0f);

    /* renamed from: X */
    private static final Float f22161X;

    /* renamed from: Y */
    private static final Float f22162Y;

    /* renamed from: A */
    public boolean f22163A;

    /* renamed from: B */
    public boolean f22164B;

    /* renamed from: C */
    public boolean f22165C = true;

    /* renamed from: D */
    public boolean f22166D;

    /* renamed from: F */
    public int f22167F;

    /* renamed from: G */
    public Window$CallbackC17224p.AbstractC17225a f22168G;

    /* renamed from: H */
    public DialogInterface.OnDismissListener f22169H;

    /* renamed from: I */
    public DialogInterface.OnShowListener f22170I;

    /* renamed from: J */
    public int f22171J;

    /* renamed from: K */
    public int f22172K;

    /* renamed from: L */
    public boolean f22173L = true;

    /* renamed from: M */
    public View f22174M;

    /* renamed from: N */
    public boolean f22175N;

    /* renamed from: O */
    public int f22176O = -1;

    /* renamed from: P */
    public boolean f22177P;

    /* renamed from: Z */
    private Context f22178Z;

    /* renamed from: a */
    public LiveTextView f22179a;

    /* renamed from: aa */
    private LiveTextView f22180aa;

    /* renamed from: ab */
    private LiveTextView f22181ab;

    /* renamed from: ac */
    private LiveTextView f22182ac;

    /* renamed from: ad */
    private LiveTextView f22183ad;

    /* renamed from: ae */
    private LiveTextView f22184ae;

    /* renamed from: af */
    private LiveTextView f22185af;

    /* renamed from: ag */
    private ImageView f22186ag;

    /* renamed from: ah */
    private ImageView f22187ah;

    /* renamed from: ai */
    private View f22188ai;

    /* renamed from: aj */
    private View f22189aj;

    /* renamed from: ak */
    private View f22190ak;

    /* renamed from: al */
    private View f22191al;

    /* renamed from: am */
    private FrameLayout f22192am;

    /* renamed from: an */
    private FrameLayout f22193an;

    /* renamed from: ao */
    private FrameLayout f22194ao;

    /* renamed from: ap */
    private FrameLayout f22195ap;

    /* renamed from: aq */
    private FrameLayout f22196aq;

    /* renamed from: ar */
    private LinearLayout f22197ar;

    /* renamed from: as */
    private RelativeLayout f22198as;

    /* renamed from: at */
    private RelativeLayout f22199at;

    /* renamed from: au */
    private View f22200au;

    /* renamed from: b */
    public CharSequence f22201b;

    /* renamed from: c */
    public View f22202c;

    /* renamed from: d */
    public View f22203d;

    /* renamed from: e */
    public View f22204e;

    /* renamed from: f */
    public View f22205f;

    /* renamed from: g */
    RectCornerRelativeLayout f22206g;

    /* renamed from: h */
    public CharSequence f22207h;

    /* renamed from: i */
    public CharSequence f22208i;

    /* renamed from: j */
    public CharSequence f22209j;

    /* renamed from: k */
    public CharSequence f22210k;

    /* renamed from: l */
    public String f22211l;

    /* renamed from: m */
    public String f22212m;

    /* renamed from: n */
    public int f22213n;

    /* renamed from: o */
    public int f22214o;

    /* renamed from: p */
    public int f22215p;

    /* renamed from: q */
    public int f22216q;

    /* renamed from: r */
    public DialogInterface.OnClickListener f22217r;

    /* renamed from: s */
    public DialogInterface.OnClickListener f22218s;

    /* renamed from: t */
    public DialogInterface.OnClickListener f22219t;

    /* renamed from: u */
    public View.OnClickListener f22220u;

    /* renamed from: v */
    public boolean f22221v;

    /* renamed from: w */
    public boolean f22222w;

    /* renamed from: x */
    public boolean f22223x;

    /* renamed from: y */
    public boolean f22224y;

    /* renamed from: z */
    public boolean f22225z;

    /* renamed from: a */
    private int mo11962a() {
        int b = (int) C13628n.m24520b(this.f22178Z, 310.0f);
        double a = (double) C13628n.m24504a(this.f22178Z);
        Double.isNaN(a);
        int i = (int) (a * 0.8d);
        return i > b ? b : i;
    }

    static {
        Covode.recordClassIndex(10052);
        Float valueOf = Float.valueOf(15.0f);
        f22155R = valueOf;
        Float valueOf2 = Float.valueOf(8.0f);
        f22158U = valueOf2;
        f22161X = valueOf2;
        f22162Y = valueOf;
    }

    /* renamed from: com.bytedance.android.livesdk.k.b$a */
    public static class C9149a {

        /* renamed from: A */
        private View.OnClickListener f22226A;

        /* renamed from: B */
        private Context f22227B;

        /* renamed from: C */
        private View f22228C;

        /* renamed from: D */
        private View f22229D;

        /* renamed from: E */
        private View f22230E;

        /* renamed from: F */
        private int f22231F;

        /* renamed from: G */
        private int f22232G;

        /* renamed from: H */
        private boolean f22233H;

        /* renamed from: I */
        private boolean f22234I;

        /* renamed from: J */
        private boolean f22235J;

        /* renamed from: K */
        private boolean f22236K;

        /* renamed from: L */
        private boolean f22237L;

        /* renamed from: M */
        private boolean f22238M;

        /* renamed from: N */
        private boolean f22239N;

        /* renamed from: O */
        private int f22240O = 17;

        /* renamed from: P */
        private LiveTextView f22241P;

        /* renamed from: Q */
        private boolean f22242Q = true;

        /* renamed from: R */
        private boolean f22243R;

        /* renamed from: a */
        public CharSequence f22244a;

        /* renamed from: b */
        public String f22245b;

        /* renamed from: c */
        public CharSequence f22246c;

        /* renamed from: d */
        public int f22247d;

        /* renamed from: e */
        public int f22248e;

        /* renamed from: f */
        public DialogInterface.OnDismissListener f22249f;

        /* renamed from: g */
        public DialogInterface.OnShowListener f22250g;

        /* renamed from: h */
        public View f22251h;

        /* renamed from: i */
        public View f22252i;

        /* renamed from: j */
        public boolean f22253j;

        /* renamed from: k */
        public int f22254k;

        /* renamed from: l */
        public int f22255l;

        /* renamed from: m */
        public boolean f22256m = true;

        /* renamed from: n */
        public int f22257n = -1;

        /* renamed from: o */
        public boolean f22258o;

        /* renamed from: p */
        public DialogInterface.OnKeyListener f22259p;

        /* renamed from: q */
        public DialogInterface.OnCancelListener f22260q;

        /* renamed from: r */
        private CharSequence f22261r;

        /* renamed from: s */
        private CharSequence f22262s;

        /* renamed from: t */
        private CharSequence f22263t;

        /* renamed from: u */
        private String f22264u;

        /* renamed from: v */
        private int f22265v;

        /* renamed from: w */
        private DialogInterface.OnClickListener f22266w;

        /* renamed from: x */
        private DialogInterface.OnClickListener f22267x;

        /* renamed from: y */
        private DialogInterface.OnClickListener f22268y;

        /* renamed from: z */
        private Window$CallbackC17224p.AbstractC17225a f22269z;

        static {
            Covode.recordClassIndex(10053);
        }

        /* renamed from: a */
        public final DialogC9148b mo15247a() {
            DialogC9148b bVar;
            if (this.f22232G == 0) {
                bVar = new DialogC9148b(this.f22227B);
            } else {
                bVar = new DialogC9148b(this.f22227B, this.f22232G);
            }
            bVar.f22213n = this.f22247d;
            bVar.f22207h = this.f22244a;
            bVar.f22211l = this.f22245b;
            bVar.f22208i = this.f22261r;
            bVar.f22210k = this.f22263t;
            bVar.f22209j = this.f22262s;
            bVar.f22212m = this.f22264u;
            bVar.f22217r = this.f22266w;
            bVar.f22218s = this.f22267x;
            bVar.f22219t = this.f22268y;
            bVar.f22204e = this.f22230E;
            bVar.f22202c = this.f22228C;
            bVar.f22203d = this.f22229D;
            bVar.f22216q = this.f22231F;
            bVar.f22221v = this.f22233H;
            bVar.f22223x = this.f22235J;
            bVar.f22222w = this.f22234I;
            bVar.f22224y = this.f22236K;
            bVar.f22167F = this.f22240O;
            bVar.f22225z = this.f22253j;
            bVar.f22163A = this.f22237L;
            bVar.f22220u = this.f22226A;
            bVar.f22179a = this.f22241P;
            bVar.f22201b = this.f22246c;
            bVar.f22169H = this.f22249f;
            bVar.f22168G = this.f22269z;
            bVar.f22214o = this.f22265v;
            bVar.f22215p = this.f22248e;
            bVar.f22170I = this.f22250g;
            bVar.f22171J = this.f22254k;
            bVar.f22172K = this.f22255l;
            bVar.f22173L = this.f22256m;
            bVar.f22174M = this.f22251h;
            bVar.f22175N = this.f22243R;
            bVar.f22205f = this.f22252i;
            bVar.f22165C = this.f22242Q;
            bVar.f22166D = this.f22239N;
            bVar.f22164B = this.f22238M;
            bVar.f22176O = this.f22257n;
            bVar.f22177P = this.f22258o;
            bVar.setOnKeyListener(this.f22259p);
            bVar.setOnCancelListener(this.f22260q);
            return bVar;
        }

        /* renamed from: a */
        public final C9149a mo15243a(int i) {
            this.f22244a = this.f22227B.getString(i);
            return this;
        }

        /* renamed from: b */
        public final C9149a mo15248b(int i) {
            this.f22245b = this.f22227B.getString(i);
            return this;
        }

        public C9149a(Context context) {
            this.f22227B = context;
        }

        /* renamed from: a */
        public final C9149a mo15246a(CharSequence charSequence, View.OnClickListener onClickListener) {
            this.f22261r = charSequence;
            this.f22226A = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C9149a mo15245a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f22262s = charSequence;
            this.f22266w = onClickListener;
            this.f22234I = z;
            return this;
        }

        /* renamed from: b */
        public final C9149a mo15250b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f22263t = charSequence;
            this.f22267x = onClickListener;
            this.f22235J = z;
            return this;
        }

        /* renamed from: a */
        public final C9149a mo15244a(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
            return mo15245a(this.f22227B.getString(i), onClickListener, z);
        }

        /* renamed from: b */
        public final C9149a mo15249b(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
            return mo15250b(this.f22227B.getString(i), onClickListener, z);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        int b;
        int b2;
        float f;
        MethodCollector.m26663i(9851);
        super.onStart();
        this.f22206g.setAlpha(0.0f);
        this.f22200au.setVisibility(0);
        if (this.f22179a != null) {
            this.f22181ab.setVisibility(8);
            this.f22179a.setTextColor(C0643b.m2378c(this.f22178Z, R.color.c4));
            this.f22179a.setTextSize(1, 15.0f);
            C4128c.m10033a(this.f22179a, 400);
            int b3 = (int) C13628n.m24520b(this.f22178Z, 8.0f);
            this.f22179a.setPadding(b3, 0, b3, 0);
            this.f22179a.setGravity(17);
            LiveTextView liveTextView = this.f22179a;
            this.f22181ab = liveTextView;
            this.f22193an.addView(liveTextView);
        } else {
            this.f22181ab.setVisibility(0);
            this.f22181ab.setTextIsSelectable(this.f22177P);
            if (!TextUtils.isEmpty(this.f22201b)) {
                this.f22181ab.setText(this.f22201b);
            } else if (!TextUtils.isEmpty(this.f22211l)) {
                this.f22181ab.setText(this.f22211l);
            } else {
                this.f22200au.setVisibility(8);
            }
            this.f22181ab.setGravity(this.f22167F);
        }
        if (!TextUtils.isEmpty(this.f22207h)) {
            this.f22180aa.setText(this.f22207h);
            this.f22181ab.setTextSize(1, f22155R.floatValue());
            this.f22181ab.setTextColor(C0643b.m2378c(this.f22178Z, R.color.c4));
        } else {
            this.f22181ab.setTextSize(1, f22154Q.floatValue());
            this.f22181ab.setTextColor(C0643b.m2378c(this.f22178Z, R.color.bx));
        }
        if (this.f22208i != null) {
            this.f22182ac.setVisibility(0);
            this.f22182ac.setText(this.f22208i);
            if (this.f22220u != null) {
                this.f22182ac.setTextColor(C0643b.m2378c(this.f22178Z, R.color.bh));
                this.f22182ac.setOnClickListener(this.f22220u);
            }
            int i = Build.VERSION.SDK_INT;
            this.f22182ac.setCompoundDrawablesRelativeWithIntrinsicBounds(this.f22214o, 0, this.f22215p, 0);
        }
        this.f22184ae.setText(this.f22209j);
        this.f22192am.setBackgroundColor(this.f22216q);
        if (this.f22216q != 0) {
            this.f22192am.getLayoutParams().height = (int) C13628n.m24520b(this.f22178Z, 140.0f);
        }
        if (this.f22221v) {
            this.f22187ah.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f22210k)) {
            this.f22183ad.setVisibility(8);
            this.f22190ak.setVisibility(8);
            this.f22184ae.setBackgroundResource(R.drawable.cbs);
        } else {
            this.f22183ad.setText(this.f22210k);
        }
        if (TextUtils.isEmpty(this.f22212m)) {
            this.f22183ad.setTextColor(C0643b.m2378c(this.f22178Z, R.color.c4));
            C4128c.m10033a(this.f22183ad, 400);
            this.f22185af.setVisibility(8);
            this.f22191al.setVisibility(8);
        } else {
            this.f22185af.setText(this.f22212m);
        }
        if (this.f22163A) {
            if (this.f22225z) {
                this.f22189aj.setVisibility(8);
                this.f22190ak.setVisibility(8);
                this.f22191al.setVisibility(8);
                this.f22184ae.setBackground(this.f22178Z.getResources().getDrawable(R.drawable.bf_));
                int b4 = (int) C13628n.m24520b(this.f22178Z, f22159V.floatValue());
                int b5 = (int) C13628n.m24520b(this.f22178Z, f22160W.floatValue());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f22184ae.getLayoutParams());
                layoutParams.setMargins(b4, b5, b4, b5);
                this.f22184ae.setLayoutParams(layoutParams);
                this.f22184ae.setTextColor(C0643b.m2378c(this.f22178Z, R.color.a2j));
                if (TextUtils.isEmpty(this.f22210k) || TextUtils.isEmpty(this.f22212m)) {
                    f = C13628n.m24520b(this.f22178Z, f22157T.floatValue());
                } else {
                    f = C13628n.m24520b(this.f22178Z, f22158U.floatValue());
                }
                this.f22197ar.setPadding(0, 0, 0, (int) f);
                this.f22183ad.setBackground(null);
                this.f22185af.setBackground(null);
                LiveTextView liveTextView2 = this.f22183ad;
                Float f2 = f22156S;
                C17235c.m31810a(liveTextView2, f2.floatValue());
                C17235c.m31810a(this.f22185af, f2.floatValue());
                if (TextUtils.isEmpty(this.f22212m)) {
                    this.f22183ad.setTextColor(C0643b.m2378c(this.f22178Z, R.color.c5));
                } else {
                    this.f22185af.setTextColor(C0643b.m2378c(this.f22178Z, R.color.c5));
                }
            } else {
                this.f22184ae.setTextColor(C0643b.m2378c(this.f22178Z, R.color.bd));
            }
        }
        if (this.f22164B) {
            C4128c.m10033a(this.f22183ad, 600);
            this.f22183ad.setTextColor(C0643b.m2378c(this.f22178Z, R.color.bx));
        }
        if (this.f22202c != null) {
            this.f22181ab.setVisibility(8);
            this.f22180aa.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.f22189aj.getLayoutParams()).topMargin = 0;
            this.f22198as.removeAllViews();
            this.f22198as.addView(this.f22202c);
        }
        if (this.f22204e != null) {
            this.f22192am.setVisibility(8);
            this.f22199at.setVisibility(0);
            this.f22199at.removeAllViews();
            this.f22199at.addView(this.f22204e);
        }
        if (TextUtils.isEmpty(this.f22207h)) {
            this.f22180aa.setVisibility(8);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f22200au.getLayoutParams();
            if (this.f22174M == null || this.f22203d != null || this.f22213n > 0) {
                layoutParams2.topMargin = (int) C13628n.m24520b(this.f22178Z, 24.0f);
            } else {
                layoutParams2.topMargin = (int) C13628n.m24520b(this.f22178Z, 16.0f);
            }
            this.f22200au.setLayoutParams(layoutParams2);
            this.f22181ab.setTextSize(1, 17.0f);
        }
        if (this.f22203d != null) {
            this.f22192am.removeView(this.f22186ag);
            this.f22192am.addView(this.f22203d, 0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            int i2 = this.f22213n;
            if (i2 > 0) {
                this.f22186ag.setImageResource(i2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f22180aa.getLayoutParams();
                layoutParams3.setMargins(0, 0, 0, 0);
                this.f22180aa.setLayoutParams(layoutParams3);
            } else if (this.f22174M != null) {
                this.f22192am.setVisibility(8);
                this.f22194ao.setVisibility(0);
                int i3 = this.f22171J;
                if (i3 == 0) {
                    b = -2;
                } else {
                    b = (int) C13628n.m24520b(this.f22178Z, (float) i3);
                }
                int i4 = this.f22172K;
                if (i4 == 0) {
                    b2 = -2;
                } else {
                    b2 = (int) C13628n.m24520b(this.f22178Z, (float) i4);
                }
                this.f22195ap.addView(this.f22174M, 0, new FrameLayout.LayoutParams(b, b2));
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f22180aa.getLayoutParams();
                layoutParams4.setMargins(0, (int) C13628n.m24520b(this.f22178Z, 16.0f), 0, 0);
                this.f22180aa.setLayoutParams(layoutParams4);
            } else {
                this.f22192am.setVisibility(8);
            }
        }
        if (this.f22175N) {
            this.f22187ah.setImageResource(2131232594);
        }
        if (this.f22205f != null) {
            this.f22180aa.setTextSize(1, f22154Q.floatValue());
            this.f22196aq.setVisibility(0);
            this.f22196aq.addView(this.f22205f, 0, new FrameLayout.LayoutParams(-1, -2));
        }
        if (!this.f22165C) {
            Boolean bool = false;
            if (this.f22163A) {
                if (bool.booleanValue()) {
                    this.f22184ae.setTextColor(C0643b.m2378c(this.f22178Z, R.color.a9));
                    this.f22184ae.setBackground(this.f22178Z.getResources().getDrawable(R.drawable.bf_));
                } else {
                    this.f22184ae.setTextColor(C0643b.m2378c(this.f22178Z, R.color.bz));
                    this.f22184ae.setBackgroundColor(C0643b.m2378c(this.f22178Z, R.color.g));
                }
            }
            this.f22184ae.setEnabled(bool.booleanValue());
        }
        if (this.f22166D) {
            if (TextUtils.isEmpty(this.f22211l)) {
                this.f22180aa.setTextSize(1, f22154Q.floatValue());
            }
            this.f22184ae.setTextColor(C0643b.m2378c(this.f22178Z, R.color.bx));
            this.f22184ae.setBackground(this.f22178Z.getResources().getDrawable(R.drawable.cdo));
            this.f22183ad.setTextColor(C0643b.m2378c(this.f22178Z, R.color.bx));
            this.f22183ad.setBackground(this.f22178Z.getResources().getDrawable(R.drawable.cdo));
            int b6 = (int) C13628n.m24520b(this.f22178Z, f22159V.floatValue());
            int b7 = (int) C13628n.m24520b(this.f22178Z, f22160W.floatValue());
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(this.f22183ad.getLayoutParams());
            layoutParams5.setMargins(b6, b7, b6, b7);
            this.f22183ad.setLayoutParams(layoutParams5);
        }
        setCancelable(this.f22173L);
        DialogInterface.OnDismissListener onDismissListener = this.f22169H;
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnShowListener onShowListener = this.f22170I;
        if (onShowListener != null) {
            setOnShowListener(onShowListener);
        }
        if (!(this.f22168G == null || getWindow() == null || getWindow().getCallback() == null)) {
            Window$CallbackC17224p pVar = new Window$CallbackC17224p(getWindow().getCallback());
            pVar.f41137a = this.f22168G;
            getWindow().setCallback(pVar);
        }
        this.f22183ad.setOnClickListener(new View$OnClickListenerC9150c(this));
        this.f22184ae.setOnClickListener(new View$OnClickListenerC9151d(this));
        this.f22185af.setOnClickListener(new View$OnClickListenerC9153f(this));
        this.f22187ah.setOnClickListener(new View$OnClickListenerC9154g(this));
        try {
            m17362a(true, this.f22206g);
            setContentView(this.f22188ai);
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.wq);
                window.setBackgroundDrawableResource(R.color.c9);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = f22153E;
                window.addFlags(2);
                attributes.gravity = 1;
                attributes.width = mo11962a();
                window.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
        if (this.f22173L) {
            findViewById(R.id.fjq).setOnClickListener(new View$OnClickListenerC9155h(this));
        }
        MethodCollector.m26664o(9851);
    }

    /* renamed from: a */
    static void m17361a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    public DialogC9148b(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r5 > r3) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 501
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p562k.DialogC9148b.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public static void m17362a(boolean z, View view) {
        if (view != null) {
            view.post(new RunnableC9156i(view, z));
        }
    }

    protected DialogC9148b(Context context, int i) {
        super(context, i);
    }
}
