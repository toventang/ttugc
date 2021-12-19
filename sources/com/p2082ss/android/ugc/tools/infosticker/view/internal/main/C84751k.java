package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84681e;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.k */
public class C84751k extends AbstractC84681e<EffectCategoryResponse, Effect> {
    static {
        Covode.recordClassIndex(98727);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84751k(TabLayout tabLayout) {
        super(tabLayout);
        C89219l.m154721d(tabLayout, "");
    }

    /* renamed from: a */
    public View mo128391a(Context context, EffectCategoryResponse effectCategoryResponse) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(effectCategoryResponse, "");
        C84750j jVar = new C84750j(context, (byte) 0);
        jVar.getTextView().setText(effectCategoryResponse.getName());
        String icon_selected_url = effectCategoryResponse.getIcon_selected_url();
        if (icon_selected_url != null) {
            C84402a.m145173a(jVar.getIconImgView(), icon_selected_url);
        }
        jVar.getIconImgView().setAlpha(0.5f);
        return jVar;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84681e
    /* renamed from: a */
    public void mo128392a(View view, int i) {
        if (!(view instanceof C84750j)) {
            view = null;
        }
        C84750j jVar = (C84750j) view;
        if (jVar != null) {
            jVar.getContentView().setBackground(null);
            jVar.getIconImgView().setAlpha(0.5f);
            TextView textView = jVar.getTextView();
            Context context = jVar.getContext();
            C89219l.m154716b(context, "");
            textView.setTextColor(context.getResources().getColor(R.color.a1y));
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84681e
    /* renamed from: b */
    public void mo128396b(View view, int i) {
        if (!(view instanceof C84750j)) {
            view = null;
        }
        C84750j jVar = (C84750j) view;
        if (jVar != null) {
            View contentView = jVar.getContentView();
            Context context = jVar.getContext();
            C89219l.m154716b(context, "");
            contentView.setBackground(context.getResources().getDrawable(R.drawable.s2));
            jVar.getIconImgView().setAlpha(1.0f);
            TextView textView = jVar.getTextView();
            Context context2 = jVar.getContext();
            C89219l.m154716b(context2, "");
            textView.setTextColor(context2.getResources().getColor(R.color.a1x));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo128394a(View view, EffectCategoryResponse effectCategoryResponse, int i, int i2) {
        float a;
        float a2;
        C89219l.m154721d(view, "");
        C89219l.m154721d(effectCategoryResponse, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            if (i == 0) {
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                a = C84912r.m145930a(context, 12.0f);
            } else {
                Context context2 = view.getContext();
                C89219l.m154716b(context2, "");
                a = C84912r.m145930a(context2, 5.0f);
            }
            int i3 = (int) a;
            if (i == i2 - 1) {
                Context context3 = view.getContext();
                C89219l.m154716b(context3, "");
                a2 = C84912r.m145930a(context3, 12.0f);
            } else {
                Context context4 = view.getContext();
                C89219l.m154716b(context4, "");
                a2 = C84912r.m145930a(context4, 5.0f);
            }
            int i4 = (int) a2;
            int i5 = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginStart(i3);
            marginLayoutParams.setMarginEnd(i4);
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            view.setLayoutParams(marginLayoutParams);
            view.invalidate();
        }
    }
}
