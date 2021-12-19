package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.FadeImageView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.a.a.a */
public final class C1765a implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1935);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        MethodCollector.m26663i(3408);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.c9));
        constraintLayout.setId(R.id.a9e);
        if (TextView.class.isInstance(constraintLayout)) {
            C0174a.m580b(constraintLayout, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        } else {
            constraintLayout.setMinimumHeight((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        }
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.a95);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bj});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        tuxTextView.setVisibility(8);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a(-1, (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics()));
        tuxTextView.setGravity(17);
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2279q = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2270h = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2273k = R.id.a9e;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView, aVar);
        C79467f.m138187a(tuxTextView, aVar);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar);
        }
        FadeImageView fadeImageView = new FadeImageView(context);
        fadeImageView.setId(R.id.dih);
        fadeImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        fadeImageView.setVisibility(8);
        fadeImageView.setImageResource(2131231198);
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2279q = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2273k = R.id.a9e;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(fadeImageView);
        if (fadeImageView.getParent() == null) {
            constraintLayout.addView(fadeImageView, aVar2);
        }
        SmartCircleImageView smartCircleImageView = new SmartCircleImageView(context);
        smartCircleImageView.setId(R.id.a94);
        smartCircleImageView.setVisibility(8);
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2279q = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2273k = R.id.a9e;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i7 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        C1766a aVar4 = new C1766a();
        aVar4.mo5576a("app:placeholderImage", new C1863a.C1865b("2131232314", "drawable"), smartCircleImageView, aVar3);
        aVar4.mo5575a(smartCircleImageView, aVar3);
        C0174a.m578a(smartCircleImageView);
        if (smartCircleImageView.getParent() == null) {
            constraintLayout.addView(smartCircleImageView, aVar3);
        }
        View view = new View(context);
        view.setId(R.id.c3x);
        if (TextView.class.isInstance(view)) {
            C0174a.m580b(view, (int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()));
        } else {
            view.setMinimumHeight((int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()));
        }
        view.setBackgroundResource(R.drawable.l9);
        ConstraintLayout.C0547a aVar5 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2279q = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2270h = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2273k = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2281s = R.id.a9e;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i8 = Build.VERSION.SDK_INT;
            aVar5.setMarginEnd((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i9 = Build.VERSION.SDK_INT;
            aVar5.setMarginStart((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, aVar5);
        }
        MentionEditText mentionEditText = new MentionEditText(context);
        mentionEditText.setId(R.id.a9f);
        mentionEditText.setBackgroundColor(resources.getColor(R.color.c9));
        mentionEditText.setHint(context.getResources().getString(R.string.aj9));
        mentionEditText.setTextAlignment(5);
        mentionEditText.setTextColor(resources.getColorStateList(R.color.bx));
        mentionEditText.setHintTextColor(resources.getColor(R.color.bz));
        mentionEditText.setPadding(mentionEditText.getPaddingLeft(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), mentionEditText.getPaddingRight(), mentionEditText.getPaddingBottom());
        mentionEditText.setPadding(mentionEditText.getPaddingLeft(), mentionEditText.getPaddingTop(), mentionEditText.getPaddingRight(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (Build.VERSION.SDK_INT <= 28) {
            Integer valueOf = Integer.valueOf((int) R.drawable.lt);
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(mentionEditText, valueOf);
        } else {
            Method a2 = C0174a.m577a(TextView.class, "setTextCursorDrawable", Drawable.class);
            Object[] objArr = {context.getResources().getDrawable(R.drawable.lt)};
            Pair<Boolean, Object> a3 = C15346a.m28238a(a2, new Object[]{mentionEditText, objArr}, 110000, "java.lang.Object", true, "com_by_andInflater_aweme_comment_comment_edit_layout_new_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a3.first).booleanValue()) {
                Object obj = a3.second;
            } else {
                C15346a.m28242a(a2.invoke(mentionEditText, objArr), a2, new Object[]{mentionEditText, objArr}, "com_by_andInflater_aweme_comment_comment_edit_layout_new_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
        }
        mentionEditText.setTextSize(1, 15.0f);
        mentionEditText.setMaxLines(4);
        ConstraintLayout.C0547a aVar6 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        mentionEditText.setGravity(8388627);
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2279q = R.id.c3x;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            i = R.id.a9e;
            aVar6.f2270h = R.id.a9e;
        } else {
            i = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2273k = i;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2280r = R.id.bhp;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i10 = Build.VERSION.SDK_INT;
            aVar6.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i11 = Build.VERSION.SDK_INT;
            aVar6.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).topMargin = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).bottomMargin = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        mentionEditText.setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        C0174a.m578a(mentionEditText);
        if (mentionEditText.getParent() == null) {
            constraintLayout.addView(mentionEditText, aVar6);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.bhp);
        ConstraintLayout.C0547a aVar7 = new ConstraintLayout.C0547a(-2, -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar7)) {
            aVar7.f2281s = R.id.c3x;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar7)) {
            aVar7.f2273k = R.id.a9e;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar7)) {
            ((ViewGroup.MarginLayoutParams) aVar7).bottomMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.bsk);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        C79466e.m138186a("app:tux_iconWidth", new C1863a.C1867d("24", "dp"), tuxIconView, layoutParams2);
        C79466e.m138186a("app:tux_iconHeight", new C1863a.C1867d("24", "dp"), tuxIconView, layoutParams2);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755161", "raw"), tuxIconView, layoutParams2);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968652", "attr"), tuxIconView, layoutParams2);
        C79466e.m138185a(tuxIconView, layoutParams2);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.bvw);
        tuxIconView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        C79466e.m138186a("app:tux_iconWidth", new C1863a.C1867d("24", "dp"), tuxIconView2, layoutParams3);
        C79466e.m138186a("app:tux_iconHeight", new C1863a.C1867d("24", "dp"), tuxIconView2, layoutParams3);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755325", "raw"), tuxIconView2, layoutParams3);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968652", "attr"), tuxIconView2, layoutParams3);
        C79466e.m138185a(tuxIconView2, layoutParams3);
        C0174a.m578a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout.addView(tuxIconView2, layoutParams3);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.bv9);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        C79466e.m138186a("app:tux_iconWidth", new C1863a.C1867d("24", "dp"), tuxIconView3, layoutParams4);
        C79466e.m138186a("app:tux_iconHeight", new C1863a.C1867d("24", "dp"), tuxIconView3, layoutParams4);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755296", "raw"), tuxIconView3, layoutParams4);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968652", "attr"), tuxIconView3, layoutParams4);
        C79466e.m138185a(tuxIconView3, layoutParams4);
        C0174a.m578a(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            linearLayout.addView(tuxIconView3, layoutParams4);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, aVar7);
        }
        FadeImageView fadeImageView2 = new FadeImageView(context);
        fadeImageView2.setId(R.id.a_a);
        fadeImageView2.setImageResource(R.drawable.mp);
        fadeImageView2.setVisibility(8);
        ConstraintLayout.C0547a aVar8 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar8)) {
            i2 = R.id.a9e;
            aVar8.f2281s = R.id.a9e;
        } else {
            i2 = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar8)) {
            aVar8.f2273k = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            ((ViewGroup.MarginLayoutParams) aVar8).bottomMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            int i12 = Build.VERSION.SDK_INT;
            aVar8.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(fadeImageView2);
        if (fadeImageView2.getParent() == null) {
            constraintLayout.addView(fadeImageView2, aVar8);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.a__);
        tuxTextView2.setBackgroundResource(R.drawable.li);
        tuxTextView2.setText(R.string.bro);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        tuxTextView2.setVisibility(8);
        ConstraintLayout.C0547a aVar9 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar9)) {
            i3 = R.id.a9e;
            aVar9.f2281s = R.id.a9e;
        } else {
            i3 = R.id.a9e;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar9)) {
            aVar9.f2273k = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            ((ViewGroup.MarginLayoutParams) aVar9).bottomMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            int i13 = Build.VERSION.SDK_INT;
            i4 = 17;
            aVar9.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i4 = 17;
        }
        tuxTextView2.setGravity(i4);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P1_Semibold"), tuxTextView2, aVar9);
        C79467f.m138187a(tuxTextView2, aVar9);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar9);
        }
        C0174a.m578a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout, layoutParams);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(3408);
        return frameLayout;
    }
}
