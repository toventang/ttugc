package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.a.b */
public final class C57626b extends AbstractC57625a {

    /* renamed from: b */
    private ImageView f131529b;

    /* renamed from: c */
    private final int f131530c = 2131233030;

    /* renamed from: d */
    private final int f131531d = 2131233031;

    static {
        Covode.recordClassIndex(67587);
    }

    public final int getIconDarkRes() {
        return this.f131530c;
    }

    public final int getIconLightRes() {
        return this.f131531d;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a.AbstractC57625a
    /* renamed from: a */
    public final void mo94924a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f131529b, "scaleX", 1.0f, 1.2f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f131529b, "scaleY", 1.0f, 1.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57626b(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3099);
        View.inflate(context, R.layout.ad4, this);
        View findViewById = findViewById(R.id.bfg);
        C89219l.m154716b(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        this.f131529b = imageView;
        imageView.setImageDrawable(C0643b.m2369a(context, 2131233030));
        MethodCollector.m26664o(3099);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a.AbstractC57625a
    /* renamed from: a */
    public final void mo94925a(boolean z) {
        if (z) {
            this.f131529b.setImageDrawable(C0643b.m2369a(getContext(), this.f131530c));
        } else {
            this.f131529b.setImageDrawable(C0643b.m2369a(getContext(), this.f131531d));
        }
    }
}
