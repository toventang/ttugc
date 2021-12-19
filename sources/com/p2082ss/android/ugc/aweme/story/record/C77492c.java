package com.p2082ss.android.ugc.aweme.story.record;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.story.base.C76629g;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77610d;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.c */
public final class C77492c extends AbstractC77461a {

    /* renamed from: d */
    private final boolean f173828d = true;

    static {
        Covode.recordClassIndex(90527);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a, com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: c */
    public final void mo120321c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a
    /* renamed from: F */
    public final boolean mo121094F() {
        return this.f173828d;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a
    /* renamed from: G */
    public final void mo121095G() {
        Bundle bundle;
        int i;
        EnterStoryParam enterStoryParam = ((AbstractC77461a) this).f173789b;
        if (enterStoryParam != null) {
            bundle = C76629g.m134217a(enterStoryParam);
            if (!C80471gb.m139482a()) {
                i = 5;
            } else {
                i = 1;
            }
            bundle.putInt("translation_type", i);
        } else {
            bundle = null;
        }
        Activity activity = this.f52549m;
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        C77610d.m135605a(bundle, activity, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a, com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: a */
    public final void mo120626a(boolean z) {
        super.mo120626a(z);
        View c = mo36475c(R.id.blo);
        C89219l.m154716b(c, "");
        ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Activity activity = this.f52549m;
        if (activity == null) {
            C89219l.m154715b();
        }
        marginLayoutParams.topMargin = C70636dh.m124833c(activity) + mo36486t().getResources().getDimensionPixelSize(R.dimen.rk);
        c.setLayoutParams(marginLayoutParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.AbstractC77461a, com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: b */
    public final void mo120627b(boolean z) {
        if (z) {
            View c = mo36475c(R.id.dlt);
            C89219l.m154716b(c, "");
            ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin + C71812ep.m126783a(33.0d, C63247i.f143610a));
            c.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b21, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }
}
