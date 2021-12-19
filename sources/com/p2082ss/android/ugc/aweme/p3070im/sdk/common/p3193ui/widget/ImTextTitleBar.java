package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1722h.C23159f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar */
public class ImTextTitleBar extends FrameLayout {

    /* renamed from: a */
    public AvatarImageView f126433a;

    /* renamed from: b */
    public AbstractC55309a f126434b;

    /* renamed from: c */
    private boolean f126435c;

    /* renamed from: d */
    private String f126436d;

    /* renamed from: e */
    private String f126437e;

    /* renamed from: f */
    private String f126438f;

    /* renamed from: g */
    private int f126439g;

    /* renamed from: h */
    private int f126440h;

    /* renamed from: i */
    private int f126441i;

    /* renamed from: j */
    private int f126442j;

    /* renamed from: k */
    private TuxTextView f126443k;

    /* renamed from: l */
    private TuxTextView f126444l;

    /* renamed from: m */
    private AutoRTLImageView f126445m;

    /* renamed from: n */
    private View f126446n;

    /* renamed from: o */
    private TuxTextView f126447o;

    /* renamed from: p */
    private boolean f126448p;

    /* renamed from: q */
    private RelativeLayout f126449q;

    /* renamed from: r */
    private TuxTextView f126450r;

    /* renamed from: s */
    private TuxTextView f126451s;

    /* renamed from: t */
    private ImageView f126452t;

    /* renamed from: u */
    private ViewGroup f126453u;

    /* renamed from: v */
    private ViewGroup f126454v;

    /* renamed from: w */
    private View.OnClickListener f126455w;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar$a */
    public interface AbstractC55309a {
        static {
            Covode.recordClassIndex(65070);
        }

        /* renamed from: a */
        void mo91162a();

        /* renamed from: a */
        void mo91163a(int i);

        /* renamed from: b */
        void mo91164b();

        /* renamed from: c */
        void mo91165c();
    }

    static {
        Covode.recordClassIndex(65064);
    }

    public TextView getRightTexView() {
        return this.f126444l;
    }

    public View getRightView() {
        return this.f126454v;
    }

    /* renamed from: a */
    private void m101115a() {
        int i;
        int i2;
        int a = C13628n.m24504a(getContext());
        if (this.f126453u.getVisibility() == 8 && this.f126454v.getVisibility() == 8) {
            i = (int) C13628n.m24520b(getContext(), 32.0f);
        } else {
            i = 0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            if (this.f126453u.getVisibility() != 8) {
                this.f126453u.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = this.f126453u.getMeasuredWidth();
            } else {
                i2 = 0;
            }
            if (this.f126454v.getVisibility() != 8) {
                this.f126454v.measure(makeMeasureSpec, makeMeasureSpec2);
                i = this.f126454v.getMeasuredWidth();
            }
            if (this.f126448p) {
                a -= i2;
            } else {
                i = Math.max(i2, i) * 2;
            }
        }
        ViewGroup.LayoutParams layoutParams = this.f126446n.getLayoutParams();
        layoutParams.width = a - i;
        this.f126446n.setLayoutParams(layoutParams);
    }

    public void setOnTitlebarClickListener(AbstractC55309a aVar) {
        this.f126434b = aVar;
    }

    public void setRightDotVisibility(int i) {
        ImageView imageView = this.f126452t;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setRightTextVisibility(int i) {
        TuxTextView tuxTextView = this.f126444l;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(i);
        }
    }

    public void setRightTuxFont(int i) {
        TuxTextView tuxTextView = this.f126444l;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(i);
        }
    }

    public void setTitleTextColor(int i) {
        this.f126442j = i;
        this.f126447o.setTextColor(i);
    }

    public void setHint(String str) {
        C17191a.C17192a aVar = new C17191a.C17192a();
        aVar.mo27177a(str);
        this.f126451s.setText(aVar.f40973a);
    }

    public void setLeftIcon(int i) {
        setLeftIcon(getContext().getResources().getDrawable(i));
    }

    public void setLeftText(int i) {
        setLeftText(getResources().getString(i));
    }

    public void setLeftTextColor(int i) {
        this.f126440h = i;
        TuxTextView tuxTextView = this.f126443k;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        }
    }

    public void setRightIcon(int i) {
        setRightIcons(i);
    }

    public void setRightText(int i) {
        setRightText(getResources().getString(i));
    }

    public void setRightTextColor(int i) {
        this.f126441i = i;
        TuxTextView tuxTextView = this.f126444l;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getResources().getString(i));
    }

    public void setRightIcon(C22999a aVar) {
        setRightIcons(aVar);
    }

    public void setTitle(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        this.f126438f = charSequence2;
        this.f126447o.setText(charSequence);
    }

    public void setRightIcons(int... iArr) {
        int length = iArr.length;
        C22999a[] aVarArr = new C22999a[length];
        for (int i = 0; i < length; i++) {
            C22999a aVar = new C22999a();
            aVar.f54431a = iArr[i];
            aVar.f54435e = Integer.valueOf((int) R.attr.bc);
            aVarArr[i] = aVar;
        }
        setRightIcons(aVarArr);
    }

    public void setTitle(String str) {
        this.f126438f = str;
        if (this.f126448p) {
            C17191a.C17192a aVar = new C17191a.C17192a();
            aVar.mo27177a(str);
            this.f126450r.setText(aVar.f40973a);
        } else {
            this.f126447o.setText(str);
        }
        this.f126447o.requestLayout();
    }

    public void setLeftIcon(Drawable drawable) {
        MethodCollector.m26663i(3567);
        if (this.f126445m == null) {
            this.f126445m = new AutoRTLImageView(getContext());
        }
        this.f126445m.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f126445m.setImageDrawable(drawable);
        this.f126453u.removeAllViews();
        this.f126453u.addView(this.f126445m);
        this.f126453u.setVisibility(0);
        this.f126453u.setContentDescription(getContext().getResources().getString(R.string.a20));
        m101115a();
        MethodCollector.m26664o(3567);
    }

    public void setLeftText(String str) {
        MethodCollector.m26663i(3510);
        this.f126436d = str;
        if (this.f126443k == null) {
            this.f126443k = new TuxTextView(getContext());
        }
        this.f126443k.setTuxFont(41);
        this.f126443k.setTextColor(this.f126440h);
        this.f126443k.setText(this.f126436d);
        this.f126453u.removeAllViews();
        this.f126453u.addView(this.f126443k);
        this.f126453u.setVisibility(0);
        this.f126453u.setContentDescription(this.f126436d);
        m101115a();
        MethodCollector.m26664o(3510);
    }

    public void setLeftTitleVisible(boolean z) {
        this.f126448p = true;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f126446n.getLayoutParams();
        if (z) {
            this.f126447o.setVisibility(8);
            this.f126449q.setVisibility(0);
            layoutParams.addRule(17, R.id.c83);
            layoutParams.addRule(1, R.id.c83);
            layoutParams.addRule(13, 0);
            layoutParams.addRule(15);
        } else {
            this.f126447o.setVisibility(0);
            this.f126449q.setVisibility(8);
            layoutParams.addRule(17, 0);
            layoutParams.addRule(1, 0);
            layoutParams.addRule(13);
        }
        this.f126446n.setLayoutParams(layoutParams);
    }

    public void setRightText(String str) {
        MethodCollector.m26663i(3575);
        this.f126437e = str;
        if (this.f126444l == null) {
            this.f126444l = new TuxTextView(getContext());
        }
        this.f126444l.setTuxFont(41);
        this.f126444l.setTextColor(this.f126441i);
        this.f126444l.setText(this.f126437e);
        this.f126454v.removeAllViews();
        this.f126454v.addView(this.f126444l);
        this.f126454v.setOnClickListener(this.f126455w);
        this.f126454v.setVisibility(0);
        this.f126454v.setContentDescription(this.f126437e);
        m101115a();
        MethodCollector.m26664o(3575);
    }

    public void setRightIcons(C22999a... aVarArr) {
        MethodCollector.m26663i(3613);
        int length = aVarArr.length;
        TuxIconView[] tuxIconViewArr = new TuxIconView[length];
        for (int i = 0; i < aVarArr.length; i++) {
            C22999a aVar = aVarArr[i];
            aVar.f54433c = C23159f.m43650b(24);
            aVar.f54432b = C23159f.m43650b(24);
            TuxIconView tuxIconView = new TuxIconView(getContext());
            tuxIconView.setTuxIcon(aVar);
            tuxIconView.setId(aVar.f54431a);
            if (i != aVarArr.length - 1) {
                tuxIconView.setPadding(0, 0, (int) C13628n.m24520b(getContext(), 16.0f), 0);
            }
            tuxIconViewArr[i] = tuxIconView;
        }
        this.f126454v.removeAllViews();
        this.f126454v.setOnClickListener(null);
        for (int i2 = 0; i2 < length; i2++) {
            TuxIconView tuxIconView2 = tuxIconViewArr[i2];
            tuxIconView2.setOnClickListener(this.f126455w);
            this.f126454v.addView(tuxIconView2);
        }
        this.f126454v.setVisibility(0);
        this.f126454v.setContentDescription(getResources().getString(R.string.cf5));
        m101115a();
        MethodCollector.m26664o(3613);
    }

    public ImTextTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ImTextTitleBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(3410);
        this.f126435c = true;
        this.f126455w = new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.View$OnClickListenerC553041 */

            static {
                Covode.recordClassIndex(65065);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f126434b != null) {
                    ImTextTitleBar.this.f126434b.mo91163a(view.getId());
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.w7, R.attr.w8, R.attr.w9, R.attr.w_, R.attr.wa, R.attr.wb, R.attr.wc, R.attr.wd, R.attr.we, R.attr.wf, R.attr.wg, R.attr.wh, R.attr.wi});
        this.f126435c = obtainStyledAttributes.getBoolean(12, true);
        this.f126436d = obtainStyledAttributes.getString(2);
        this.f126437e = obtainStyledAttributes.getString(7);
        this.f126438f = obtainStyledAttributes.getString(9);
        this.f126440h = obtainStyledAttributes.getColor(1, C0643b.m2378c(context, R.color.bx));
        if (TextUtils.isEmpty(this.f126437e)) {
            this.f126439g = obtainStyledAttributes.getResourceId(5, -1);
        }
        this.f126441i = obtainStyledAttributes.getColor(4, C0643b.m2378c(context, R.color.bx));
        this.f126442j = obtainStyledAttributes.getColor(10, C0643b.m2378c(context, R.color.bx));
        obtainStyledAttributes.recycle();
        inflate(context, R.layout.a72, this);
        this.f126453u = (ViewGroup) findViewById(R.id.c83);
        this.f126454v = (ViewGroup) findViewById(R.id.dk_);
        this.f126446n = findViewById(R.id.ejf);
        this.f126447o = (TuxTextView) findViewById(R.id.title_tv);
        this.f126452t = (ImageView) findViewById(R.id.dkn);
        this.f126449q = (RelativeLayout) findViewById(R.id.c8c);
        this.f126433a = (AvatarImageView) findViewById(R.id.bsr);
        this.f126450r = (TuxTextView) findViewById(R.id.b2z);
        this.f126451s = (TuxTextView) findViewById(R.id.dt4);
        if (!TextUtils.isEmpty(this.f126436d)) {
            setLeftText(this.f126436d);
            setLeftTextColor(this.f126440h);
        } else if (this.f126435c) {
            setLeftIcon(getResources().getDrawable(R.drawable.ccw));
        }
        if (!TextUtils.isEmpty(this.f126437e)) {
            setRightText(this.f126437e);
            setRightTextColor(this.f126441i);
        } else {
            int i = this.f126439g;
            if (i != -1) {
                setRightIcon(i);
            }
        }
        if (!TextUtils.isEmpty(this.f126438f)) {
            setTitle(this.f126438f);
            setTitleTextColor(this.f126442j);
        }
        this.f126453u.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.View$OnClickListenerC553052 */

            static {
                Covode.recordClassIndex(65066);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f126434b != null) {
                    ImTextTitleBar.this.f126434b.mo91162a();
                }
            }
        });
        this.f126447o.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.View$OnClickListenerC553063 */

            static {
                Covode.recordClassIndex(65067);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f126434b != null) {
                    ImTextTitleBar.this.f126434b.mo91165c();
                }
            }
        });
        this.f126450r.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.View$OnClickListenerC553074 */

            static {
                Covode.recordClassIndex(65068);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f126434b != null) {
                    ImTextTitleBar.this.f126434b.mo91165c();
                }
            }
        });
        this.f126433a.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.View$OnClickListenerC553085 */

            static {
                Covode.recordClassIndex(65069);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f126434b != null) {
                    ImTextTitleBar.this.f126434b.mo91164b();
                }
            }
        });
        this.f126454v.setOnClickListener(this.f126455w);
        C55173ae.m100882a(this.f126453u);
        C55173ae.m100882a(this.f126454v);
        MethodCollector.m26664o(3410);
    }
}
