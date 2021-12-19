package com.p2082ss.android.ugc.aweme.inbox;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.p048g.p049a.p050a.C0996c;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.p3270e.AbstractC56406a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.s */
public final class C56509s extends C1434i {

    /* renamed from: n */
    private final List<RecyclerView.ViewHolder> f128833n = new ArrayList();

    static {
        Covode.recordClassIndex(66329);
    }

    public C56509s() {
        this.f4469k = 220;
        this.f4468j = 110;
        this.f4467i = 110;
    }

    @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: b */
    public final boolean mo4668b() {
        if (super.mo4668b() || (!this.f128833n.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: a */
    public final void mo4663a() {
        super.mo4663a();
        if (!this.f128833n.isEmpty()) {
            for (T t : this.f128833n) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(t.itemView, "alpha", 1.0f, 0.0f, 1.0f).setDuration(this.f4469k);
                C89219l.m154716b(duration, "");
                duration.setInterpolator(new C0996c());
                duration.addListener(new C56510a(t, this));
                duration.start();
            }
            this.f128833n.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.s$a */
    public static final class C56510a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f128834a;

        /* renamed from: b */
        final /* synthetic */ C56509s f128835b;

        static {
            Covode.recordClassIndex(66330);
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            View view = this.f128834a.itemView;
            C89219l.m154716b(view, "");
            view.setAlpha(1.0f);
        }

        public final void onAnimationEnd(Animator animator) {
            ArrayList<Animator.AnimatorListener> listeners;
            if (animator != null && (listeners = animator.getListeners()) != null) {
                listeners.remove(this);
            }
        }

        C56510a(RecyclerView.ViewHolder viewHolder, C56509s sVar) {
            this.f128834a = viewHolder;
            this.f128835b = sVar;
        }
    }

    @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: a */
    public final boolean mo4851a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        if (i4 - i2 <= 0 || !(viewHolder instanceof AbstractC56406a)) {
            return super.mo4851a(viewHolder, i, i2, i3, i4);
        }
        this.f128833n.add(viewHolder);
        return super.mo4851a(viewHolder, i, i2, i3, i4);
    }
}
