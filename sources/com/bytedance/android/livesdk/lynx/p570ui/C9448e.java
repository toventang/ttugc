package com.bytedance.android.livesdk.lynx.p570ui;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2931h;
import com.bytedance.android.live.p176b.AbstractC2939m;
import com.bytedance.android.livesdk.browser.p463d.C6972a;
import com.bytedance.android.livesdk.browser.p466g.C7024a;
import com.bytedance.android.livesdk.browser.p469j.C7032a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.ui.e */
public final class C9448e implements AbstractC2939m {

    /* renamed from: b */
    public static final C9449a f22941b = new C9449a((byte) 0);

    /* renamed from: A */
    private String f22942A;

    /* renamed from: B */
    private String f22943B;

    /* renamed from: C */
    private boolean f22944C;

    /* renamed from: D */
    private boolean f22945D;

    /* renamed from: E */
    private boolean f22946E;

    /* renamed from: F */
    private boolean f22947F;

    /* renamed from: G */
    private String f22948G;

    /* renamed from: H */
    private float f22949H;

    /* renamed from: I */
    private int f22950I;

    /* renamed from: J */
    private boolean f22951J;

    /* renamed from: K */
    private int f22952K;

    /* renamed from: a */
    public final String f22953a;

    /* renamed from: c */
    private int f22954c;

    /* renamed from: d */
    private int f22955d;

    /* renamed from: e */
    private int f22956e;

    /* renamed from: f */
    private int f22957f;

    /* renamed from: g */
    private int f22958g;

    /* renamed from: h */
    private int f22959h;

    /* renamed from: i */
    private int f22960i;

    /* renamed from: j */
    private int f22961j;

    /* renamed from: k */
    private int f22962k;

    /* renamed from: l */
    private Integer f22963l;

    /* renamed from: m */
    private String f22964m;

    /* renamed from: n */
    private boolean f22965n;

    /* renamed from: o */
    private boolean f22966o;

    /* renamed from: p */
    private boolean f22967p;

    /* renamed from: q */
    private boolean f22968q;

    /* renamed from: r */
    private boolean f22969r;

    /* renamed from: s */
    private String f22970s;

    /* renamed from: t */
    private boolean f22971t;

    /* renamed from: u */
    private AbstractC2931h f22972u;

    /* renamed from: v */
    private boolean f22973v;

    /* renamed from: w */
    private EnumC9450b f22974w;

    /* renamed from: x */
    private String f22975x;

    /* renamed from: y */
    private String f22976y;

    /* renamed from: z */
    private AbstractC2928f.AbstractC2929a f22977z;

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.e$b */
    public enum EnumC9450b {
        H5,
        LYNX;

        static {
            Covode.recordClassIndex(10958);
        }
    }

    static {
        Covode.recordClassIndex(10956);
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.e$a */
    public static final class C9449a {
        static {
            Covode.recordClassIndex(10957);
        }

        private C9449a() {
        }

        public /* synthetic */ C9449a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: a */
    public final C4031a mo7686a() {
        C6972a aVar = new C6972a();
        Bundle bundle = new Bundle();
        bundle.putString("arg_url", this.f22953a);
        bundle.putInt("arg_width", this.f22954c);
        bundle.putInt("arg_height", this.f22955d);
        bundle.putInt("arg_gravity", this.f22962k);
        bundle.putInt("arg_radius", this.f22957f);
        bundle.putInt("arg_margin", this.f22956e);
        bundle.putInt("arg_radius_top_left", this.f22958g);
        bundle.putInt("arg_radius_top_right", this.f22959h);
        bundle.putInt("arg_radius_bottom_right", this.f22960i);
        bundle.putInt("arg_radius_bottom_left", this.f22961j);
        Integer num = this.f22963l;
        if (num != null) {
            num.intValue();
            Integer num2 = this.f22963l;
            if (num2 == null) {
                C89219l.m154715b();
            }
            bundle.putInt("arg_background_res", num2.intValue());
        }
        bundle.putBoolean("arg_use_bottom_close", this.f22965n);
        bundle.putBoolean("arg_landscape_custom_height", this.f22966o);
        bundle.putBoolean("arg_landscape_custom_gravity", this.f22967p);
        bundle.putBoolean("arg_show_dim", this.f22968q);
        bundle.putString("arg_monitor_page_service", this.f22970s);
        bundle.putBoolean("arg_cancel_on_touch_outside", this.f22971t);
        bundle.putString("arg_original_scheme", this.f22976y);
        bundle.putString("fallback_schema", this.f22975x);
        bundle.putString("arg_from_label", this.f22964m);
        bundle.putInt("hybrid_type", this.f22974w.ordinal());
        bundle.putString("arg_enter_type", this.f22942A);
        bundle.putString("arg_title", this.f22943B);
        bundle.putBoolean("arg_enable_title_bar", this.f22944C);
        bundle.putBoolean("arg_enable_title_close", this.f22945D);
        bundle.putBoolean("arg_enable_title_share", this.f22946E);
        bundle.putBoolean("arg_enable_title_share_add_report_action", this.f22947F);
        bundle.putString("arg_report_schema", this.f22948G);
        bundle.putFloat("arg_mask_alpha", this.f22949H);
        bundle.putInt("arg_web_bg_color", this.f22950I);
        bundle.putBoolean("arg_enable_pull_down_close", this.f22951J);
        bundle.putInt("arg_variable_height", this.f22952K);
        aVar.setArguments(bundle);
        aVar.f17492r = this.f22972u;
        aVar.f17495u = this.f22977z;
        C7024a.m14981a(this.f22953a);
        C89219l.m154716b(aVar, "");
        return aVar;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC2939m mo7681a(int i) {
        this.f22954c = i;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC2939m mo7687b(int i) {
        this.f22955d = i;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC2939m mo7690c(int i) {
        this.f22956e = i;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: d */
    public final AbstractC2939m mo7695d(boolean z) {
        this.f22973v = z;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC2939m mo7696e(int i) {
        this.f22962k = i;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: f */
    public final AbstractC2939m mo7699f(int i) {
        this.f22952K = i;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: g */
    public final AbstractC2939m mo7702g(boolean z) {
        this.f22946E = z;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: h */
    public final AbstractC2939m mo7703h(boolean z) {
        this.f22951J = z;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: a */
    public final AbstractC2939m mo7683a(AbstractC2928f.AbstractC2929a aVar) {
        this.f22977z = aVar;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC2939m mo7689b(boolean z) {
        this.f22968q = z;
        this.f22969r = true;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC2939m mo7692c(boolean z) {
        this.f22971t = z;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: e */
    public final AbstractC2939m mo7698e(boolean z) {
        this.f22944C = z;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: f */
    public final AbstractC2939m mo7701f(boolean z) {
        this.f22945D = z;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: c */
    public final AbstractC2939m mo7691c(String str) {
        C89219l.m154721d(str, "");
        this.f22976y = str;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ AbstractC2939m mo7693d(int i) {
        this.f22957f = i;
        this.f22958g = 0;
        this.f22959h = 0;
        this.f22960i = 0;
        this.f22961j = 0;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: e */
    public final AbstractC2939m mo7697e(String str) {
        float f;
        if (str == null) {
            try {
                C89219l.m154715b();
            } catch (Exception unused) {
                f = 0.0f;
            }
        }
        f = Float.parseFloat(str);
        this.f22949H = f;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: f */
    public final AbstractC2939m mo7700f(String str) {
        C89219l.m154721d(str, "");
        this.f22943B = str;
        return this;
    }

    /* renamed from: a */
    public final AbstractC2939m mo16283a(EnumC9450b bVar) {
        C89219l.m154721d(bVar, "");
        this.f22974w = bVar;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: b */
    public final AbstractC2939m mo7688b(String str) {
        int i;
        if (str == null || str.length() == 0) {
            return this;
        }
        try {
            i = Color.parseColor(C7032a.m14989a(str));
        } catch (Exception unused) {
            i = -1;
        }
        this.f22950I = i;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: d */
    public final AbstractC2939m mo7694d(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "bottom";
            }
            this.f22942A = str;
        }
        return this;
    }

    public C9448e(String str) {
        C89219l.m154721d(str, "");
        this.f22953a = str;
        this.f22964m = "";
        this.f22971t = true;
        this.f22974w = EnumC9450b.H5;
        this.f22975x = "";
        this.f22976y = "";
        this.f22942A = "bottom";
        this.f22943B = "";
        this.f22948G = "";
        this.f22950I = -1;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: a */
    public final /* synthetic */ AbstractC2939m mo7684a(String str) {
        C89219l.m154721d(str, "");
        this.f22964m = str;
        return this;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC2939m mo7685a(boolean z) {
        this.f22966o = z;
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9448e(String str, String str2) {
        this(str);
        C89219l.m154721d(str, "");
        this.f22975x = str2 == null ? "" : str2;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2939m
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC2939m mo7682a(int i, int i2) {
        this.f22958g = i;
        this.f22959h = i2;
        this.f22960i = 0;
        this.f22961j = 0;
        return this;
    }
}
