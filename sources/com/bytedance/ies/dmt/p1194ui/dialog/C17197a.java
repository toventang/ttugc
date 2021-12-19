package com.bytedance.ies.dmt.p1194ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.Window$CallbackC17224p;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.a */
public class C17197a {

    /* renamed from: h */
    public static float f40977h = 0.5f;

    /* renamed from: k */
    private static final Float f40978k = Float.valueOf(17.0f);

    /* renamed from: l */
    private static final Float f40979l;

    /* renamed from: m */
    private static final Float f40980m = Float.valueOf(0.75f);

    /* renamed from: n */
    private static final Float f40981n = Float.valueOf(16.0f);

    /* renamed from: o */
    private static final Float f40982o;

    /* renamed from: p */
    private static final Float f40983p = Float.valueOf(20.0f);

    /* renamed from: q */
    private static final Float f40984q = Float.valueOf(2.0f);

    /* renamed from: r */
    private static final Float f40985r;

    /* renamed from: s */
    private static final Float f40986s;

    /* renamed from: t */
    private static final Float f40987t = Float.valueOf(44.0f);

    /* renamed from: A */
    private DmtTextView f40988A;

    /* renamed from: B */
    private DmtTextView f40989B;

    /* renamed from: C */
    private DmtTextView f40990C;

    /* renamed from: D */
    private DmtTextView f40991D;

    /* renamed from: E */
    private CharSequence f40992E;

    /* renamed from: F */
    private ImageView f40993F;

    /* renamed from: G */
    private ImageView f40994G;

    /* renamed from: H */
    private View f40995H;

    /* renamed from: I */
    private View f40996I;

    /* renamed from: J */
    private View f40997J;

    /* renamed from: K */
    private View f40998K;

    /* renamed from: L */
    private View f40999L;

    /* renamed from: M */
    private View f41000M;

    /* renamed from: N */
    private FrameLayout f41001N;

    /* renamed from: O */
    private FrameLayout f41002O;

    /* renamed from: P */
    private FrameLayout f41003P;

    /* renamed from: Q */
    private FrameLayout f41004Q;

    /* renamed from: R */
    private FrameLayout f41005R;

    /* renamed from: S */
    private LinearLayout f41006S;

    /* renamed from: T */
    private RelativeLayout f41007T;

    /* renamed from: U */
    private RelativeLayout f41008U;

    /* renamed from: V */
    private String f41009V;

    /* renamed from: W */
    private String f41010W;

    /* renamed from: X */
    private String f41011X;

    /* renamed from: Y */
    private String f41012Y;

    /* renamed from: Z */
    private String f41013Z;

    /* renamed from: a */
    RelativeLayout f41014a;

    /* renamed from: aa */
    private String f41015aa;

    /* renamed from: ab */
    private int f41016ab;

    /* renamed from: ac */
    private int f41017ac;

    /* renamed from: ad */
    private int f41018ad;

    /* renamed from: ae */
    private int f41019ae;

    /* renamed from: af */
    private int f41020af;

    /* renamed from: ag */
    private View.OnClickListener f41021ag;

    /* renamed from: ah */
    private boolean f41022ah;

    /* renamed from: ai */
    private boolean f41023ai;

    /* renamed from: aj */
    private boolean f41024aj;

    /* renamed from: ak */
    private boolean f41025ak;

    /* renamed from: al */
    private boolean f41026al;

    /* renamed from: am */
    private boolean f41027am;

    /* renamed from: an */
    private boolean f41028an;

    /* renamed from: ao */
    private int f41029ao;

    /* renamed from: ap */
    private Window$CallbackC17224p.AbstractC17225a f41030ap;

    /* renamed from: aq */
    private DialogInterface.OnDismissListener f41031aq;

    /* renamed from: ar */
    private DialogInterface.OnShowListener f41032ar;

    /* renamed from: as */
    private int f41033as;

    /* renamed from: at */
    private int f41034at;

    /* renamed from: au */
    private boolean f41035au;

    /* renamed from: av */
    private View f41036av;

    /* renamed from: aw */
    private View f41037aw;

    /* renamed from: ax */
    private boolean f41038ax;

    /* renamed from: b */
    DialogInterface.OnClickListener f41039b;

    /* renamed from: c */
    DialogInterface.OnClickListener f41040c;

    /* renamed from: d */
    DialogInterface.OnClickListener f41041d;

    /* renamed from: e */
    boolean f41042e;

    /* renamed from: f */
    boolean f41043f;

    /* renamed from: g */
    boolean f41044g;

    /* renamed from: i */
    AlertDialog f41045i;

    /* renamed from: j */
    public DialogContext f41046j;

    /* renamed from: u */
    private Context f41047u;

    /* renamed from: v */
    private DmtTextView f41048v;

    /* renamed from: w */
    private DmtTextView f41049w;

    /* renamed from: x */
    private DmtTextView f41050x;

    /* renamed from: y */
    private DmtTextView f41051y;

    /* renamed from: z */
    private DmtTextView f41052z;

    /* renamed from: d */
    public final void mo27186d() {
        AlertDialog alertDialog = this.f41045i;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: e */
    private int m31762e() {
        int b = (int) C13628n.m24520b(this.f41047u, 360.0f);
        double a = (double) C13628n.m24504a(this.f41047u);
        Double.isNaN(a);
        int i = (int) (a * 0.8d);
        return i > b ? b : i;
    }

    /* renamed from: a */
    public final boolean mo27183a() {
        AlertDialog alertDialog = this.f41045i;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.a$a */
    public static class C17200a {

        /* renamed from: A */
        public boolean f41055A;

        /* renamed from: B */
        public boolean f41056B;

        /* renamed from: C */
        public boolean f41057C;

        /* renamed from: D */
        public boolean f41058D;

        /* renamed from: E */
        public boolean f41059E;

        /* renamed from: F */
        public boolean f41060F;

        /* renamed from: G */
        public boolean f41061G;

        /* renamed from: H */
        public boolean f41062H;

        /* renamed from: I */
        public int f41063I = 17;

        /* renamed from: J */
        public DmtTextView f41064J;

        /* renamed from: K */
        public int f41065K;

        /* renamed from: L */
        public int f41066L;

        /* renamed from: M */
        public boolean f41067M = true;

        /* renamed from: N */
        public boolean f41068N = true;

        /* renamed from: O */
        public boolean f41069O;

        /* renamed from: a */
        public String f41070a;

        /* renamed from: b */
        public String f41071b;

        /* renamed from: c */
        public String f41072c;

        /* renamed from: d */
        public String f41073d;

        /* renamed from: e */
        public String f41074e;

        /* renamed from: f */
        public String f41075f;

        /* renamed from: g */
        public CharSequence f41076g;

        /* renamed from: h */
        public int f41077h;

        /* renamed from: i */
        public int f41078i;

        /* renamed from: j */
        public int f41079j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f41080k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f41081l;

        /* renamed from: m */
        public DialogInterface.OnClickListener f41082m;

        /* renamed from: n */
        public DialogInterface.OnDismissListener f41083n;

        /* renamed from: o */
        public DialogInterface.OnShowListener f41084o;

        /* renamed from: p */
        public Window$CallbackC17224p.AbstractC17225a f41085p;

        /* renamed from: q */
        public View.OnClickListener f41086q;

        /* renamed from: r */
        public Context f41087r;

        /* renamed from: s */
        public View f41088s;

        /* renamed from: t */
        public View f41089t;

        /* renamed from: u */
        public View f41090u;

        /* renamed from: v */
        public View f41091v;

        /* renamed from: w */
        public View f41092w;

        /* renamed from: x */
        public int f41093x;

        /* renamed from: y */
        public int f41094y;

        /* renamed from: z */
        public boolean f41095z;

        static {
            Covode.recordClassIndex(19660);
        }

        /* renamed from: a */
        public final C17197a mo27193a() {
            return new C17197a(this, (byte) 0);
        }

        public C17200a(Context context) {
            this.f41087r = context;
        }

        /* renamed from: a */
        public final C17200a mo27189a(int i) {
            this.f41070a = this.f41087r.getString(i);
            return this;
        }

        /* renamed from: b */
        public final C17200a mo27194b(int i) {
            this.f41071b = this.f41087r.getString(i);
            return this;
        }

        /* renamed from: a */
        public final C17200a mo27191a(View view, int i, int i2) {
            this.f41091v = view;
            this.f41065K = i;
            this.f41066L = i2;
            return this;
        }

        /* renamed from: b */
        public final C17200a mo27196b(String str, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f41074e = str;
            this.f41081l = onClickListener;
            this.f41057C = z;
            return this;
        }

        /* renamed from: c */
        public final C17200a mo27197c(String str, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f41075f = str;
            this.f41082m = onClickListener;
            this.f41058D = z;
            return this;
        }

        /* renamed from: a */
        public final C17200a mo27190a(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
            return mo27192a(this.f41087r.getString(i), onClickListener, z);
        }

        /* renamed from: b */
        public final C17200a mo27195b(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
            return mo27196b(this.f41087r.getString(i), onClickListener, z);
        }

        /* renamed from: a */
        public final C17200a mo27192a(String str, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f41073d = str;
            this.f41080k = onClickListener;
            this.f41056B = z;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(19657);
        Float valueOf = Float.valueOf(15.0f);
        f40979l = valueOf;
        Float valueOf2 = Float.valueOf(8.0f);
        f40982o = valueOf2;
        f40985r = valueOf2;
        f40986s = valueOf;
    }

    /* renamed from: b */
    public final Dialog mo27184b() {
        AlertDialog.Builder builder;
        int identifier;
        if (this.f41020af == 0) {
            builder = new AlertDialog.Builder(this.f41047u, R.style.wr);
        } else {
            builder = new AlertDialog.Builder(this.f41047u, this.f41020af);
        }
        if (!TextUtils.isEmpty(this.f41009V)) {
            builder.setTitle(this.f41009V);
        }
        if (!TextUtils.isEmpty(this.f40992E)) {
            builder.setMessage(this.f40992E);
        } else if (!TextUtils.isEmpty(this.f41010W)) {
            builder.setMessage(this.f41010W);
        }
        builder.setPositiveButton(this.f41012Y, new DialogInterface$OnClickListenerC17201b(this));
        if (!TextUtils.isEmpty(this.f41015aa)) {
            builder.setNeutralButton(this.f41015aa, new DialogInterface$OnClickListenerC17202c(this));
        }
        if (!TextUtils.isEmpty(this.f41013Z)) {
            builder.setNegativeButton(this.f41013Z, new DialogInterface$OnClickListenerC17215g(this));
        }
        builder.setCancelable(this.f41035au);
        AlertDialog create = builder.create();
        this.f41045i = create;
        create.getWindow();
        DialogInterface.OnDismissListener onDismissListener = this.f41031aq;
        if (onDismissListener != null) {
            this.f41045i.setOnDismissListener(onDismissListener);
        } else if (this.f41046j != null) {
            this.f41045i.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ies.dmt.p1194ui.dialog.C17197a.DialogInterface$OnDismissListenerC171981 */

                static {
                    Covode.recordClassIndex(19658);
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    C17205a.C17206a.f41116a.mo27210a(C17197a.this.f41046j.f41099a);
                }
            });
        }
        DialogInterface.OnShowListener onShowListener = this.f41032ar;
        if (onShowListener != null) {
            this.f41045i.setOnShowListener(onShowListener);
        }
        if (this.f41035au) {
            this.f41045i.setCanceledOnTouchOutside(true);
        }
        m31759a(this.f41045i);
        try {
            this.f41045i.show();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(this.f41009V) && (identifier = this.f41047u.getResources().getIdentifier("alertTitle", "id", "android")) > 0) {
            C17301b.m32033a().mo27614a((TextView) this.f41045i.getWindow().findViewById(identifier), C17303d.f41573g);
        }
        if (!TextUtils.isEmpty(this.f41010W)) {
            C17301b.m32033a().mo27614a((TextView) this.f41045i.getWindow().findViewById(16908299), C17303d.f41567a);
        }
        Button button = this.f41045i.getButton(-1);
        if (button != null) {
            button.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
        Button button2 = this.f41045i.getButton(-2);
        if (button2 != null) {
            button2.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
        return this.f41045i;
    }

    /* renamed from: c */
    public final Dialog mo27185c() {
        AlertDialog.Builder builder;
        int b;
        int b2;
        float f;
        MethodCollector.m26663i(5281);
        this.f41014a.setAlpha(0.0f);
        if (this.f41020af == 0) {
            builder = new AlertDialog.Builder(this.f41047u);
        } else {
            builder = new AlertDialog.Builder(this.f41047u, this.f41020af);
        }
        this.f41037aw.setVisibility(0);
        if (this.f40991D != null) {
            this.f41049w.setVisibility(8);
            this.f40991D.setTextColor(C0643b.m2378c(this.f41047u, R.color.c4));
            this.f40991D.setTextSize(1, 15.0f);
            this.f40991D.setFontType(C17303d.f41567a);
            int b3 = (int) C13628n.m24520b(this.f41047u, 8.0f);
            this.f40991D.setPadding(b3, 0, b3, 0);
            this.f40991D.setGravity(17);
            DmtTextView dmtTextView = this.f40991D;
            this.f41049w = dmtTextView;
            this.f41002O.addView(dmtTextView);
        } else {
            this.f41049w.setVisibility(0);
            if (!TextUtils.isEmpty(this.f40992E)) {
                this.f41049w.setText(this.f40992E);
            } else if (!TextUtils.isEmpty(this.f41010W)) {
                this.f41049w.setText(this.f41010W);
            } else {
                this.f41037aw.setVisibility(8);
            }
            this.f41049w.setGravity(this.f41029ao);
        }
        if (!TextUtils.isEmpty(this.f41009V)) {
            this.f41048v.setText(this.f41009V);
            this.f41049w.setTextSize(1, f40979l.floatValue());
            this.f41049w.setTextColor(C0643b.m2378c(this.f41047u, R.color.c4));
        } else {
            this.f41049w.setTextSize(1, f40978k.floatValue());
            this.f41049w.setTextColor(C0643b.m2378c(this.f41047u, R.color.ae));
        }
        if (this.f41011X != null) {
            this.f41050x.setVisibility(0);
            this.f41050x.setText(this.f41011X);
            if (this.f41021ag != null) {
                this.f41050x.setTextColor(C0643b.m2378c(this.f41047u, R.color.bh));
                this.f41050x.setOnClickListener(this.f41021ag);
            }
            int i = Build.VERSION.SDK_INT;
            this.f41050x.setCompoundDrawablesRelativeWithIntrinsicBounds(this.f41017ac, 0, this.f41018ad, 0);
        }
        this.f41052z.setText(this.f41012Y);
        this.f41001N.setBackgroundColor(this.f41019ae);
        if (this.f41019ae != 0) {
            this.f41001N.getLayoutParams().height = (int) C13628n.m24520b(this.f41047u, 140.0f);
        }
        if (this.f41023ai) {
            this.f40994G.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f41013Z)) {
            this.f41051y.setVisibility(8);
            this.f40989B.setVisibility(8);
            this.f41052z.setBackgroundResource(R.drawable.cbs);
        } else {
            this.f41051y.setText(this.f41013Z);
        }
        if (TextUtils.isEmpty(this.f41015aa)) {
            this.f41051y.setTextColor(C0643b.m2378c(this.f41047u, R.color.c4));
            this.f41051y.setFontType(C17303d.f41567a);
            this.f40988A.setVisibility(8);
            this.f40990C.setVisibility(8);
        } else {
            this.f40988A.setText(this.f41015aa);
        }
        if (this.f41025ak) {
            if (this.f41024aj) {
                this.f40998K.setVisibility(8);
                this.f40989B.setVisibility(8);
                this.f40990C.setVisibility(8);
                this.f41052z.setBackground(this.f41047u.getResources().getDrawable(R.drawable.bf_));
                this.f41052z.setHeight((int) C13628n.m24520b(this.f41047u, f40987t.floatValue()));
                int b4 = (int) C13628n.m24520b(this.f41047u, f40983p.floatValue());
                int b5 = (int) C13628n.m24520b(this.f41047u, f40984q.floatValue());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f41052z.getLayoutParams());
                layoutParams.setMargins(b4, b5, b4, b5);
                this.f41052z.setLayoutParams(layoutParams);
                this.f41052z.setTextColor(C0643b.m2378c(this.f41047u, R.color.l));
                if (TextUtils.isEmpty(this.f41013Z) || TextUtils.isEmpty(this.f41015aa)) {
                    f = C13628n.m24520b(this.f41047u, f40981n.floatValue());
                } else {
                    f = C13628n.m24520b(this.f41047u, f40982o.floatValue());
                }
                this.f41006S.setPadding(0, 0, 0, (int) f);
                this.f41051y.setBackground(null);
                this.f40988A.setBackground(null);
                DmtTextView dmtTextView2 = this.f41051y;
                Float f2 = f40980m;
                C17235c.m31810a(dmtTextView2, f2.floatValue());
                C17235c.m31810a(this.f40988A, f2.floatValue());
                if (TextUtils.isEmpty(this.f41015aa)) {
                    this.f41051y.setTextColor(C0643b.m2378c(this.f41047u, R.color.c5));
                } else {
                    this.f40988A.setTextColor(C0643b.m2378c(this.f41047u, R.color.c5));
                }
            } else {
                this.f41052z.setTextColor(C0643b.m2378c(this.f41047u, R.color.bd));
            }
        }
        if (this.f41026al) {
            this.f41051y.setFontType(C17303d.f41573g);
            this.f41051y.setTextColor(C0643b.m2378c(this.f41047u, R.color.bx));
        }
        if (this.f40996I != null) {
            this.f41049w.setVisibility(8);
            this.f41048v.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.f40998K.getLayoutParams()).topMargin = 0;
            this.f41007T.removeAllViews();
            this.f41007T.addView(this.f40996I);
        }
        if (this.f40999L != null) {
            this.f41001N.setVisibility(8);
            this.f41008U.setVisibility(0);
            this.f41008U.removeAllViews();
            this.f41008U.addView(this.f40999L);
        }
        if (TextUtils.isEmpty(this.f41009V)) {
            this.f41048v.setVisibility(8);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f41037aw.getLayoutParams();
            if (this.f41036av == null || this.f40997J != null || this.f41016ab > 0) {
                layoutParams2.topMargin = (int) C13628n.m24520b(this.f41047u, 24.0f);
            } else {
                layoutParams2.topMargin = (int) C13628n.m24520b(this.f41047u, 16.0f);
            }
            this.f41037aw.setLayoutParams(layoutParams2);
        }
        if (this.f40997J != null) {
            this.f41001N.removeView(this.f40993F);
            this.f41001N.addView(this.f40997J, 0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            int i2 = this.f41016ab;
            if (i2 > 0) {
                this.f40993F.setImageResource(i2);
            } else if (this.f41036av != null) {
                this.f41001N.setVisibility(8);
                this.f41003P.setVisibility(0);
                int i3 = this.f41033as;
                if (i3 == 0) {
                    b = -2;
                } else {
                    b = (int) C13628n.m24520b(this.f41047u, (float) i3);
                }
                int i4 = this.f41034at;
                if (i4 == 0) {
                    b2 = -2;
                } else {
                    b2 = (int) C13628n.m24520b(this.f41047u, (float) i4);
                }
                this.f41004Q.addView(this.f41036av, 0, new FrameLayout.LayoutParams(b, b2));
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f41048v.getLayoutParams();
                layoutParams3.setMargins(0, (int) C13628n.m24520b(this.f41047u, 16.0f), 0, 0);
                this.f41048v.setLayoutParams(layoutParams3);
            } else {
                this.f41001N.setVisibility(8);
            }
        }
        if (this.f41038ax) {
            this.f40994G.setImageResource(2131232594);
        }
        if (this.f41000M != null) {
            this.f41037aw.setVisibility(8);
            this.f41048v.setTextSize(1, f40978k.floatValue());
            this.f41005R.setVisibility(0);
            this.f41005R.addView(this.f41000M, 0, new FrameLayout.LayoutParams(-1, -2));
        }
        if (!this.f41027am) {
            mo27182a((Boolean) false);
        }
        if (this.f41028an) {
            if (TextUtils.isEmpty(this.f41010W)) {
                this.f41048v.setTextSize(1, f40978k.floatValue());
            }
            this.f41052z.setTextColor(C0643b.m2378c(this.f41047u, R.color.bx));
            this.f41052z.setBackground(this.f41047u.getResources().getDrawable(R.drawable.cdo));
            this.f41051y.setTextColor(C0643b.m2378c(this.f41047u, R.color.bx));
            this.f41051y.setBackground(this.f41047u.getResources().getDrawable(R.drawable.cdo));
            int b6 = (int) C13628n.m24520b(this.f41047u, f40983p.floatValue());
            int b7 = (int) C13628n.m24520b(this.f41047u, f40984q.floatValue());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(this.f41051y.getLayoutParams());
            layoutParams4.setMargins(b6, b7, b6, b7);
            this.f41051y.setLayoutParams(layoutParams4);
        }
        builder.setCancelable(this.f41035au);
        AlertDialog create = builder.create();
        this.f41045i = create;
        DialogInterface.OnDismissListener onDismissListener = this.f41031aq;
        if (onDismissListener != null) {
            create.setOnDismissListener(onDismissListener);
        } else if (this.f41046j != null) {
            create.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ies.dmt.p1194ui.dialog.C17197a.DialogInterface$OnDismissListenerC171992 */

                static {
                    Covode.recordClassIndex(19659);
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    C17205a.C17206a.f41116a.mo27210a(C17197a.this.f41046j.f41099a);
                }
            });
        }
        DialogInterface.OnShowListener onShowListener = this.f41032ar;
        if (onShowListener != null) {
            this.f41045i.setOnShowListener(onShowListener);
        }
        m31759a(this.f41045i);
        this.f41051y.setOnClickListener(new View$OnClickListenerC17216h(this));
        this.f41052z.setOnClickListener(new View$OnClickListenerC17217i(this));
        this.f40988A.setOnClickListener(new View$OnClickListenerC17218j(this));
        this.f40994G.setOnClickListener(new View$OnClickListenerC17219k(this));
        AlertDialog alertDialog = this.f41045i;
        try {
            m31761a(true, this.f41014a);
            alertDialog.show();
            alertDialog.setContentView(this.f40995H);
            Window window = alertDialog.getWindow();
            window.setWindowAnimations(R.style.wq);
            window.setBackgroundDrawableResource(R.color.c9);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = f40977h;
            window.addFlags(2);
            attributes.gravity = 1;
            attributes.width = m31762e();
            window.setAttributes(attributes);
        } catch (Exception unused) {
        }
        AlertDialog alertDialog2 = this.f41045i;
        MethodCollector.m26664o(5281);
        return alertDialog2;
    }

    /* renamed from: a */
    static void m31760a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m31759a(AlertDialog alertDialog) {
        if (this.f41030ap != null && alertDialog.getWindow() != null && alertDialog.getWindow().getCallback() != null) {
            Window$CallbackC17224p pVar = new Window$CallbackC17224p(alertDialog.getWindow().getCallback());
            pVar.f41137a = this.f41030ap;
            alertDialog.getWindow().setCallback(pVar);
        }
    }

    /* renamed from: a */
    public final void mo27182a(Boolean bool) {
        if (this.f41025ak) {
            if (bool.booleanValue()) {
                this.f41052z.setTextColor(C0643b.m2378c(this.f41047u, R.color.a9));
                this.f41052z.setBackground(this.f41047u.getResources().getDrawable(R.drawable.bf_));
            } else {
                this.f41052z.setTextColor(C0643b.m2378c(this.f41047u, R.color.bz));
                this.f41052z.setBackgroundColor(C0643b.m2378c(this.f41047u, R.color.g));
            }
        }
        this.f41052z.setEnabled(bool.booleanValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00f2, code lost:
        if (r6 > r4) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C17197a(com.bytedance.ies.dmt.p1194ui.dialog.C17197a.C17200a r9) {
        /*
        // Method dump skipped, instructions count: 642
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p1194ui.dialog.C17197a.<init>(com.bytedance.ies.dmt.ui.dialog.a$a):void");
    }

    /* synthetic */ C17197a(C17200a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static void m31761a(boolean z, View view) {
        if (view != null) {
            view.post(new RunnableC17220l(view, z));
        }
    }
}
