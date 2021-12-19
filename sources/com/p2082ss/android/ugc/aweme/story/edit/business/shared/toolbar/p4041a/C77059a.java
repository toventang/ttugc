package com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.p4041a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a */
public final class C77059a extends FrameLayout {

    /* renamed from: a */
    public static final C77060a f172872a = new C77060a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f172873b;

    /* renamed from: c */
    private final AbstractC89244h f172874c;

    static {
        Covode.recordClassIndex(90060);
    }

    private final ImageView getIvTool() {
        return (ImageView) this.f172874c.getValue();
    }

    public final TextView getTvTool() {
        return (TextView) this.f172873b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a$a */
    public static final class C77060a {
        static {
            Covode.recordClassIndex(90061);
        }

        private C77060a() {
        }

        public /* synthetic */ C77060a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a$c */
    static final class C77062c extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C77059a f172876a;

        static {
            Covode.recordClassIndex(90063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77062c(C77059a aVar) {
            super(0);
            this.f172876a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f172876a.findViewById(R.id.bwm);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a$d */
    static final class C77063d extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C77059a f172877a;

        static {
            Covode.recordClassIndex(90064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77063d(C77059a aVar) {
            super(0);
            this.f172877a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f172877a.findViewById(R.id.f5s);
        }
    }

    public final Animator getTextFadeOutAnimation() {
        if (getTvTool().getVisibility() != 0) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getTvTool(), "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new C77061b(this));
        return ofFloat;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a$b */
    public static final class C77061b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C77059a f172875a;

        static {
            Covode.recordClassIndex(90062);
        }

        C77061b(C77059a aVar) {
            this.f172875a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f172875a.getTvTool().setVisibility(8);
        }
    }

    public final void setContentDescription(int i) {
        getTvTool().setContentDescription(getContext().getString(i));
    }

    public final void setIcon(int i) {
        getIvTool().setImageDrawable(getResources().getDrawable(i));
    }

    public final void setText(int i) {
        getTvTool().setText(getContext().getString(i));
    }

    public final void setTextEnable(boolean z) {
        int i;
        TextView tvTool = getTvTool();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        tvTool.setVisibility(i);
    }

    public final void setIcon(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        getIvTool().setImageDrawable(drawable);
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        getTvTool().setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C77059a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6128);
        this.f172873b = C89250i.m154773a((AbstractC89171a) new C77063d(this));
        this.f172874c = C89250i.m154773a((AbstractC89171a) new C77062c(this));
        C1764a.m5927a(LayoutInflater.from(context), R.layout.b1_, this, true);
        MethodCollector.m26664o(6128);
    }

    public /* synthetic */ C77059a(Context context, byte b) {
        this(context);
    }
}
