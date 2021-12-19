package com.bytedance.ies.dmt.p1194ui.common.views;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.AbstractC0706b;
import androidx.core.graphics.drawable.C0708d;
import androidx.core.p037h.p038a.C0733d;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.common.views.C17188b;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import com.squareup.p2081b.AbstractC29276e;
import com.squareup.p2081b.C29299t;
import com.squareup.p2081b.C29314x;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.CommonItemView */
public class CommonItemView extends RelativeLayout {

    /* renamed from: A */
    private int f40927A;

    /* renamed from: B */
    private int f40928B;

    /* renamed from: C */
    private int f40929C;

    /* renamed from: D */
    private View f40930D;

    /* renamed from: a */
    public TextView f40931a;

    /* renamed from: b */
    protected TextView f40932b;

    /* renamed from: c */
    public SimpleDraweeView f40933c;

    /* renamed from: d */
    public ImageView f40934d;

    /* renamed from: e */
    public C17187a f40935e;

    /* renamed from: f */
    public boolean f40936f;

    /* renamed from: g */
    public int f40937g;

    /* renamed from: h */
    private boolean f40938h;

    /* renamed from: i */
    private boolean f40939i;

    /* renamed from: j */
    private boolean f40940j;

    /* renamed from: k */
    private TextView f40941k;

    /* renamed from: l */
    private ViewGroup f40942l;

    /* renamed from: m */
    private ViewGroup f40943m;

    /* renamed from: n */
    private DmtSettingSwitch f40944n;

    /* renamed from: o */
    private CharSequence f40945o;

    /* renamed from: p */
    private CharSequence f40946p;

    /* renamed from: q */
    private CharSequence f40947q;

    /* renamed from: r */
    private CharSequence f40948r;

    /* renamed from: s */
    private boolean f40949s;

    /* renamed from: t */
    private boolean f40950t;

    /* renamed from: u */
    private boolean f40951u;

    /* renamed from: v */
    private boolean f40952v;

    /* renamed from: w */
    private int f40953w;

    /* renamed from: x */
    private EnumC17186b f40954x;

    /* renamed from: y */
    private int f40955y;

    /* renamed from: z */
    private int f40956z;

    static {
        Covode.recordClassIndex(19642);
    }

    public SimpleDraweeView getIvwLeft() {
        return this.f40933c;
    }

    public ImageView getIvwRight() {
        return this.f40934d;
    }

    public int getResLeft() {
        return this.f40955y;
    }

    public int getResRight() {
        return this.f40956z;
    }

    public DmtSettingSwitch getSwitchRight() {
        return this.f40944n;
    }

    public CharSequence getTextDesc() {
        return this.f40947q;
    }

    public CharSequence getTextLeft() {
        return this.f40945o;
    }

    public CharSequence getTextRight() {
        return this.f40946p;
    }

    public TextView getTvwDesc() {
        return this.f40941k;
    }

    public TextView getTvwLeft() {
        return this.f40931a;
    }

    public TextView getTvwRight() {
        return this.f40932b;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public final boolean mo27138d() {
        DmtSettingSwitch dmtSettingSwitch = this.f40944n;
        if (dmtSettingSwitch == null) {
            return false;
        }
        return dmtSettingSwitch.f41436b;
    }

    /* renamed from: k */
    private boolean m31729k() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) m31721a(getContext(), "accessibility");
        if (accessibilityManager != null) {
            return accessibilityManager.isEnabled();
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.dmt.ui.common.views.CommonItemView$a */
    public enum EnumC17185a {
        CIRCULAR,
        DEFAULT;

        static {
            Covode.recordClassIndex(19645);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.common.views.CommonItemView$b */
    public enum EnumC17186b {
        NONE,
        IMAGE,
        ICON;

        static {
            Covode.recordClassIndex(19646);
        }
    }

    /* renamed from: f */
    private void mo95150f() {
        if (this.f40953w == 1) {
            mo95153i();
        } else {
            mo95152h();
        }
        if (this.f40955y == 0) {
            this.f40933c.setVisibility(8);
        } else {
            this.f40933c.setVisibility(0);
            this.f40933c.setImageResource(this.f40955y);
        }
        this.f40931a.setText(this.f40945o);
        this.f40931a.setTextColor(this.f40927A);
        mo95151g();
    }

    /* renamed from: c */
    public final void mo27136c() {
        TextView textView;
        this.f40936f = false;
        C17187a aVar = this.f40935e;
        if (aVar != null) {
            aVar.setVisibility(8);
            int i = this.f40937g;
            if ((i == 3 || i == 2) && (textView = this.f40932b) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                marginLayoutParams.rightMargin = 0;
                int i2 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                this.f40938h = true;
            }
        }
    }

    /* renamed from: e */
    private void mo95149e() {
        MethodCollector.m26663i(11903);
        if (this.f40952v) {
            View view = this.f40930D;
            if (view != null) {
                view.setVisibility(0);
                MethodCollector.m26664o(11903);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) C13628n.m24520b(getContext(), 0.5f));
            layoutParams.topMargin = (int) C13628n.m24520b(getContext(), 16.0f);
            layoutParams.addRule(3, R.id.cf5);
            View view2 = new View(getContext());
            this.f40930D = view2;
            view2.setBackgroundColor(C0643b.m2378c(view2.getContext(), R.color.b6));
            addView(this.f40930D, layoutParams);
            MethodCollector.m26664o(11903);
            return;
        }
        View view3 = this.f40930D;
        if (view3 != null) {
            view3.setVisibility(4);
        }
        MethodCollector.m26664o(11903);
    }

    /* renamed from: j */
    private void m31728j() {
        Context context;
        int i;
        if (m31729k()) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f40945o)) {
                sb.append(this.f40945o);
            }
            if (!TextUtils.isEmpty(this.f40946p)) {
                sb.append(this.f40946p);
            }
            DmtSettingSwitch dmtSettingSwitch = this.f40944n;
            if (dmtSettingSwitch != null && dmtSettingSwitch.getVisibility() == 0) {
                if (this.f40944n.f41436b) {
                    context = getContext();
                    i = R.string.dkl;
                } else {
                    context = getContext();
                    i = R.string.dkc;
                }
                sb.append(context.getString(i));
            }
            if (!TextUtils.isEmpty(this.f40947q)) {
                sb.append(this.f40947q);
            }
            String sb2 = sb.toString();
            this.f40948r = sb2;
            setContentDescription(sb2);
        }
    }

    /* renamed from: g */
    private void mo95151g() {
        if (this.f40947q == null) {
            TextView textView = this.f40941k;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f40941k == null) {
            DmtTextView dmtTextView = new DmtTextView(getContext());
            this.f40941k = dmtTextView;
            dmtTextView.setId(R.id.f7g);
            this.f40941k.setLineSpacing(C13628n.m24520b(getContext(), 2.0f), 1.0f);
            this.f40941k.setTextSize(1, 13.0f);
            this.f40941k.setTextColor(this.f40929C);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) C13628n.m24520b(getContext(), 6.0f);
            layoutParams.addRule(3, R.id.cf5);
            addView(this.f40941k, layoutParams);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f40941k.setBreakStrategy(0);
            }
            View view = this.f40930D;
            if (view != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams2.addRule(3, this.f40941k.getId());
                this.f40930D.setLayoutParams(layoutParams2);
            }
        }
        this.f40941k.setText(this.f40947q);
        this.f40941k.setVisibility(0);
        this.f40940j = true;
    }

    /* renamed from: h */
    private void mo95152h() {
        float f;
        MethodCollector.m26663i(12437);
        DmtSettingSwitch dmtSettingSwitch = this.f40944n;
        if (dmtSettingSwitch != null) {
            dmtSettingSwitch.setVisibility(8);
        }
        if (this.f40946p == null && this.f40954x == EnumC17186b.NONE) {
            this.f40942l.setVisibility(8);
            MethodCollector.m26664o(12437);
            return;
        }
        if (!this.f40951u && this.f40934d == null) {
            AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
            this.f40934d = autoRTLImageView;
            autoRTLImageView.setId(R.id.c1l);
            Context context = getContext();
            if (this.f40954x == EnumC17186b.ICON) {
                f = 20.0f;
            } else {
                f = 32.0f;
            }
            int b = (int) C13628n.m24520b(context, f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b);
            int i = Build.VERSION.SDK_INT;
            layoutParams.addRule(21);
            this.f40942l.addView(this.f40934d, layoutParams);
        }
        if (!this.f40951u && this.f40934d != null) {
            if (this.f40954x == EnumC17186b.NONE) {
                this.f40934d.setVisibility(8);
            } else {
                if (this.f40954x == EnumC17186b.ICON) {
                    this.f40934d.setImageResource(this.f40956z);
                }
                this.f40934d.setVisibility(0);
            }
        }
        if (this.f40946p != null && this.f40932b == null) {
            DmtTextView dmtTextView = new DmtTextView(getContext());
            this.f40932b = dmtTextView;
            dmtTextView.setId(R.id.f7i);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(15);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.addRule(16, R.id.c1l);
            this.f40932b.setTextColor(this.f40928B);
            this.f40932b.setEllipsize(TextUtils.TruncateAt.END);
            this.f40932b.setMaxLines(1);
            this.f40932b.setTextSize(1, 15.0f);
            this.f40942l.addView(this.f40932b, layoutParams2);
        }
        CharSequence charSequence = this.f40946p;
        if (charSequence != null) {
            this.f40932b.setText(charSequence);
            this.f40932b.setVisibility(0);
        } else {
            TextView textView = this.f40932b;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        this.f40942l.setVisibility(0);
        MethodCollector.m26664o(12437);
    }

    /* renamed from: i */
    private void mo95153i() {
        MethodCollector.m26663i(12441);
        ImageView imageView = this.f40934d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.f40932b;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.f40944n == null) {
            DmtSettingSwitch dmtSettingSwitch = new DmtSettingSwitch(getContext());
            this.f40944n = dmtSettingSwitch;
            dmtSettingSwitch.setId(R.id.ed6);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) C13628n.m24520b(getContext(), 36.0f), -2);
            layoutParams.addRule(15);
            this.f40944n.setTrackRadius((int) C13628n.m24520b(getContext(), 42.0f));
            this.f40944n.setEnableTouch(false);
            this.f40944n.setTrackPadding((int) C13628n.m24520b(getContext(), 3.0f));
            this.f40944n.setThumbDrawable(getResources().getDrawable(R.drawable.cdu));
            this.f40944n.setTrackTintList(m31720a(getContext()));
            this.f40942l.addView(this.f40944n, layoutParams);
        }
        this.f40942l.setVisibility(0);
        this.f40944n.setVisibility(0);
        MethodCollector.m26664o(12441);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27130a() {
        this.f40943m = (ViewGroup) findViewById(R.id.cf5);
        this.f40942l = (ViewGroup) findViewById(R.id.cf6);
        this.f40931a = (TextView) this.f40943m.findViewById(R.id.f7j);
        this.f40933c = (SimpleDraweeView) this.f40943m.findViewById(R.id.c1j);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f40931a.setBreakStrategy(0);
        }
        mo95149e();
        mo95150f();
    }

    /* renamed from: b */
    public final void mo27134b() {
        if (this.f40935e == null) {
            C17187a aVar = new C17187a(getContext());
            this.f40935e = aVar;
            addView(aVar, new RelativeLayout.LayoutParams(-2, -2));
        }
        int i = this.f40937g;
        if (i == 3 || i == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40935e.getLayoutParams();
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.addRule(21);
            layoutParams.addRule(10);
            int measuredHeight = this.f40942l.getMeasuredHeight();
            if (measuredHeight == 0) {
                measuredHeight = this.f40931a.getLineHeight();
            }
            if (this.f40937g == 3) {
                layoutParams.topMargin = (measuredHeight - this.f40935e.getMeasuredHeight()) / 2;
            } else {
                layoutParams.topMargin = 0;
            }
            if (this.f40953w == 1) {
                layoutParams.rightMargin = (int) (((float) m31719a(this.f40942l)) + C13628n.m24520b(getContext(), 8.0f));
                int i3 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd(layoutParams.rightMargin);
            } else {
                ImageView imageView = this.f40934d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    layoutParams.rightMargin = 0;
                } else {
                    layoutParams.rightMargin = this.f40934d.getMeasuredWidth();
                }
                int i4 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                TextView textView = this.f40932b;
                if (textView != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                    marginLayoutParams.rightMargin = (int) C13628n.m24520b(getContext(), 10.0f);
                    int i5 = Build.VERSION.SDK_INT;
                    marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                    this.f40938h = true;
                }
            }
        } else if (!this.f40945o.equals(this.f40931a.getText())) {
            this.f40935e.setVisibility(0);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f40945o);
            spannableStringBuilder.append((CharSequence) " ");
            C17188b bVar = new C17188b();
            bVar.f40969a = new C17188b.AbstractC17189a() {
                /* class com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView.C171842 */

                static {
                    Covode.recordClassIndex(19644);
                }

                @Override // com.bytedance.ies.dmt.p1194ui.common.views.C17188b.AbstractC17189a
                /* renamed from: a */
                public final void mo27161a(int i, int i2) {
                    if (CommonItemView.this.f40936f) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) CommonItemView.this.f40935e.getLayoutParams();
                        int b = (int) C13628n.m24520b(CommonItemView.this.getContext(), 1.0f);
                        Layout layout = CommonItemView.this.f40931a.getLayout();
                        if (layout != null && layout.getLineCount() > 0) {
                            i = (int) layout.getLineWidth(layout.getLineCount() - 1);
                        }
                        if (CommonItemView.this.f40937g == 1) {
                            i2 += (CommonItemView.this.f40931a.getLineHeight() - CommonItemView.this.f40935e.getMeasuredHeight()) / 2;
                            i = (int) (((float) i) + C13628n.m24520b(CommonItemView.this.getContext(), 4.0f));
                        }
                        if (CommonItemView.this.f40933c.getVisibility() == 0) {
                            int i3 = Build.VERSION.SDK_INT;
                            i = i + ((ViewGroup.MarginLayoutParams) CommonItemView.this.f40933c.getLayoutParams()).getMarginEnd() + CommonItemView.this.f40933c.getMeasuredWidth();
                        }
                        marginLayoutParams.leftMargin = i + b;
                        int i4 = Build.VERSION.SDK_INT;
                        marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
                        marginLayoutParams.topMargin = (int) (CommonItemView.this.f40931a.getY() + ((float) i2));
                        CommonItemView.this.f40935e.requestLayout();
                    }
                }
            };
            spannableStringBuilder.setSpan(bVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            this.f40931a.setText(spannableStringBuilder);
        }
        this.f40936f = true;
    }

    public void setLeftIcon(int i) {
        m31722b(this.f40945o, i);
    }

    public void setLeftText(CharSequence charSequence) {
        m31722b(charSequence, this.f40955y);
    }

    public void setOnCheckedChangeListener(DmtSettingSwitch.AbstractC17285a aVar) {
        this.f40944n.setOnCheckedChangeListener(aVar);
    }

    public void setRightIconRes(int i) {
        mo27132a(this.f40946p, i);
    }

    public void setRightText(CharSequence charSequence) {
        mo27132a(charSequence, this.f40956z);
    }

    public void setShowBottomDivider(boolean z) {
        this.f40952v = z;
        mo95149e();
    }

    public void setDesc(CharSequence charSequence) {
        this.f40947q = charSequence;
        mo95151g();
        m31728j();
    }

    /* renamed from: a */
    private static ColorStateList m31720a(Context context) {
        int i;
        Resources resources = context.getResources();
        if (C17175b.m31708b(context)) {
            i = R.color.fi;
        } else {
            i = R.color.fh;
        }
        return resources.getColorStateList(i);
    }

    public void setLeftIconImageUrl(String str) {
        this.f40933c.setVisibility(0);
        this.f40933c.setImageURI(str);
        this.f40938h = true;
        this.f40939i = true;
    }

    /* renamed from: a */
    private static int m31719a(ViewGroup viewGroup) {
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = i + childAt.getMeasuredWidth();
            int i3 = Build.VERSION.SDK_INT;
            i = measuredWidth + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        return i;
    }

    public void setChecked(boolean z) {
        DmtSettingSwitch dmtSettingSwitch = this.f40944n;
        if (dmtSettingSwitch != null) {
            boolean z2 = dmtSettingSwitch.f41436b;
            this.f40944n.setChecked(z);
            m31728j();
            if (z2 != z && m31729k()) {
                if (Build.VERSION.SDK_INT < 21) {
                    AccessibilityNodeInfo createAccessibilityNodeInfo = createAccessibilityNodeInfo();
                    if (createAccessibilityNodeInfo != null && C0733d.m2596a(createAccessibilityNodeInfo).mo2837a()) {
                        this.f40944n.announceForAccessibility(this.f40948r);
                    }
                } else if (isAccessibilityFocused()) {
                    this.f40944n.announceForAccessibility(this.f40948r);
                }
            }
        }
    }

    public CommonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static int m31718a(Context context, int i) {
        return context.getResources().getColor(i);
    }

    /* renamed from: b */
    private void m31722b(CharSequence charSequence, int i) {
        this.f40955y = i;
        if (i != 0) {
            this.f40933c.setImageResource(i);
            if (this.f40933c.getVisibility() != 0) {
                this.f40933c.setVisibility(0);
            }
        }
        this.f40945o = charSequence;
        this.f40931a.setText(charSequence);
        if (this.f40936f) {
            mo27134b();
        }
        this.f40938h = true;
        this.f40939i = true;
        m31728j();
    }

    /* renamed from: a */
    private static Object m31721a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13673);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(13673);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27131a(Context context, AttributeSet attributeSet) {
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bh2, this, true);
        mo27135b(context, attributeSet);
        mo27130a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo27135b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.r7, R.attr.r8, R.attr.vk, R.attr.a1u, R.attr.a1v, R.attr.a1w, R.attr.a_4, R.attr.a_5, R.attr.a_6, R.attr.a_7, R.attr.ac8, R.attr.ach, R.attr.asr, R.attr.ass, R.attr.aue});
        this.f40945o = obtainStyledAttributes.getString(4);
        this.f40946p = obtainStyledAttributes.getString(7);
        int i = 0;
        this.f40947q = obtainStyledAttributes.getString(0);
        this.f40955y = obtainStyledAttributes.getResourceId(3, 0);
        this.f40956z = obtainStyledAttributes.getResourceId(6, R.drawable.ccl);
        this.f40927A = obtainStyledAttributes.getColor(5, m31718a(getContext(), (int) R.color.bx));
        this.f40928B = obtainStyledAttributes.getColor(8, m31718a(getContext(), (int) R.color.c5));
        this.f40929C = obtainStyledAttributes.getColor(1, m31718a(getContext(), (int) R.color.c5));
        this.f40949s = obtainStyledAttributes.getBoolean(13, true);
        this.f40950t = obtainStyledAttributes.getBoolean(12, true);
        this.f40936f = obtainStyledAttributes.getBoolean(11, false);
        this.f40951u = obtainStyledAttributes.getBoolean(2, false);
        this.f40952v = obtainStyledAttributes.getBoolean(10, false);
        this.f40953w = obtainStyledAttributes.getInt(9, 0);
        this.f40937g = obtainStyledAttributes.getInt(14, 0);
        obtainStyledAttributes.recycle();
        if (this.f40949s) {
            int b = (int) C13628n.m24520b(context, 16.0f);
            if (!this.f40952v) {
                i = b;
            }
            setPadding(b, b, b, i);
        }
        if (this.f40950t) {
            setBackground(C17177c.m31711c(context));
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        TextView textView;
        MethodCollector.m26663i(6642);
        boolean z = this.f40938h;
        if (z || this.f40940j) {
            if (z) {
                if (this.f40942l.getVisibility() == 8) {
                    this.f40943m.getLayoutParams().width = -1;
                } else {
                    int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                    if (this.f40953w == 1) {
                        this.f40942l.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
                        this.f40943m.getLayoutParams().width = size - m31719a(this.f40942l);
                    } else {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                        this.f40943m.measure(makeMeasureSpec, i2);
                        this.f40942l.measure(makeMeasureSpec, i2);
                        int measuredWidth = this.f40943m.getMeasuredWidth();
                        int a = m31719a(this.f40942l);
                        if (measuredWidth + a <= size) {
                            this.f40943m.getLayoutParams().width = measuredWidth;
                            this.f40942l.getLayoutParams().width = size - measuredWidth;
                        } else {
                            double d = (double) size;
                            Double.isNaN(d);
                            int i3 = (int) (0.204d * d);
                            if (a <= i3) {
                                this.f40942l.getLayoutParams().width = i3;
                                this.f40943m.getLayoutParams().width = size - i3;
                            } else if (measuredWidth <= i3) {
                                this.f40942l.getLayoutParams().width = size - i3;
                                this.f40943m.getLayoutParams().width = i3;
                            } else {
                                Double.isNaN(d);
                                int i4 = (int) (0.372d * d);
                                if (measuredWidth <= i4) {
                                    this.f40943m.getLayoutParams().width = i4;
                                    this.f40942l.getLayoutParams().width = size - i4;
                                } else if (a <= i4) {
                                    this.f40943m.getLayoutParams().width = size - i4;
                                    this.f40942l.getLayoutParams().width = i4;
                                } else {
                                    Double.isNaN(d);
                                    int i5 = (int) (d * 0.29d);
                                    this.f40943m.getLayoutParams().width = size - i5;
                                    this.f40942l.getLayoutParams().width = i5;
                                }
                            }
                        }
                    }
                }
                this.f40938h = false;
            }
            if (this.f40939i) {
                C13628n.m24520b(getContext(), 8.0f);
                if (this.f40954x == EnumC17186b.IMAGE) {
                    this.f40943m.setPadding(0, (int) C13628n.m24520b(getContext(), 6.0f), 0, 0);
                } else {
                    this.f40943m.setPadding(0, 0, 0, 0);
                }
                this.f40939i = false;
            }
            if (!(!this.f40940j || (textView = this.f40941k) == null || textView.getVisibility() == 8)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40941k.getLayoutParams();
                if (this.f40933c.getVisibility() != 0) {
                    marginLayoutParams.leftMargin = 0;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f40933c.getLayoutParams();
                    marginLayoutParams.leftMargin = marginLayoutParams2.rightMargin + marginLayoutParams2.width;
                }
                int i6 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
                this.f40940j = false;
            }
            if (this.f40936f) {
                mo27134b();
            }
        } else if (this.f40936f) {
            mo27134b();
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(6642);
    }

    /* renamed from: a */
    public final void mo27132a(CharSequence charSequence, int i) {
        this.f40946p = charSequence;
        this.f40956z = i;
        if (this.f40953w != 1) {
            if (i == 0) {
                this.f40954x = EnumC17186b.NONE;
            } else {
                this.f40954x = EnumC17186b.ICON;
            }
            mo95152h();
            this.f40938h = true;
            m31728j();
        }
    }

    /* renamed from: a */
    public final void mo27133a(String str, final EnumC17185a aVar) {
        if (str != null && !str.isEmpty() && this.f40953w != 1) {
            this.f40954x = EnumC17186b.IMAGE;
            mo95152h();
            this.f40938h = true;
            this.f40939i = true;
            m31728j();
            C29299t a = C29299t.m58690a(getContext());
            if (str.trim().length() != 0) {
                new C29314x(a, Uri.parse(str)).mo51134a(this.f40934d, new AbstractC29276e() {
                    /* class com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView.C171831 */

                    static {
                        Covode.recordClassIndex(19643);
                    }

                    @Override // com.squareup.p2081b.AbstractC29276e
                    /* renamed from: a */
                    public final void mo27160a() {
                        if (aVar == EnumC17185a.CIRCULAR) {
                            Bitmap bitmap = ((BitmapDrawable) CommonItemView.this.f40934d.getDrawable()).getBitmap();
                            AbstractC0706b a = C0708d.m2514a(CommonItemView.this.getResources(), bitmap);
                            a.f2789h = true;
                            a.f2788g = true;
                            a.mo2740b();
                            a.f2784c.setShader(a.f2785d);
                            a.invalidateSelf();
                            a.mo2738a(((float) Math.max(bitmap.getWidth(), bitmap.getHeight())) / 2.0f);
                            CommonItemView.this.f40934d.setImageDrawable(a);
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Path must not be empty.");
        }
    }

    public CommonItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9749);
        this.f40938h = true;
        this.f40939i = true;
        this.f40940j = true;
        this.f40949s = true;
        this.f40950t = true;
        this.f40953w = -1;
        this.f40954x = EnumC17186b.NONE;
        mo27131a(context, attributeSet);
        MethodCollector.m26664o(9749);
    }
}
