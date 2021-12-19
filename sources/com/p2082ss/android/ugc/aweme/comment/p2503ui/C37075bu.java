package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2385bd.C34791a;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74147f;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bu */
public final class C37075bu implements AbstractC37083by {

    /* renamed from: a */
    public MentionTextView f87352a;

    /* renamed from: b */
    public Context f87353b;

    static {
        Covode.recordClassIndex(44429);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37083by
    /* renamed from: a */
    public final AbstractC1204m mo64583a() {
        return (AbstractC1204m) C34729o.m70950a(this.f87353b);
    }

    public C37075bu(Context context, MentionTextView mentionTextView) {
        this.f87353b = context;
        this.f87352a = mentionTextView;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37083by
    /* renamed from: a */
    public final void mo64584a(final CharSequence charSequence, final List<TextExtraStruct> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f87352a, "alpha", 0.0f).setDuration(100L);
        duration.setInterpolator(new C34791a());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f87352a, "alpha", 0.0f, 1.0f).setDuration(100L);
        duration2.setInterpolator(new C34791a());
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37075bu.C370761 */

            static {
                Covode.recordClassIndex(44430);
            }

            public final void onAnimationEnd(Animator animator) {
                C37075bu.this.f87352a.setText(charSequence);
                C46579b.m89899a(C37075bu.this.f87352a);
                C37075bu.this.f87352a.mo124999a(list, new C74147f(), (MentionTextView.AbstractC81407d) null);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.start();
    }
}
