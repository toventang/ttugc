package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.p048g.p049a.p050a.C0996c;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.t */
public final class C51749t extends C1434i {

    /* renamed from: n */
    private final List<RecyclerView.ViewHolder> f119259n = new ArrayList();

    /* renamed from: o */
    private final List<RecyclerView.ViewHolder> f119260o = new ArrayList();

    static {
        Covode.recordClassIndex(61112);
    }

    public C51749t() {
        this.f4467i = 300;
        this.f4468j = 300;
        this.f4469k = 300;
    }

    @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: b */
    public final boolean mo4668b() {
        if (!this.f119259n.isEmpty() || !this.f119260o.isEmpty() || super.mo4668b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: d */
    public final void mo4672d() {
        for (int size = this.f119259n.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder viewHolder = this.f119259n.get(size);
            m96420a(viewHolder.itemView);
            mo4674f(viewHolder);
            this.f119259n.remove(size);
        }
        for (int size2 = this.f119260o.size() - 1; size2 >= 0; size2--) {
            RecyclerView.ViewHolder viewHolder2 = this.f119260o.get(size2);
            m96420a(viewHolder2.itemView);
            mo4674f(viewHolder2);
            this.f119260o.remove(size2);
        }
        super.mo4672d();
    }

    @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: a */
    public final void mo4663a() {
        super.mo4663a();
        if (!this.f119259n.isEmpty()) {
            for (int size = this.f119259n.size() - 1; size >= 0; size--) {
                final RecyclerView.ViewHolder viewHolder = this.f119259n.get(size);
                viewHolder.itemView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(this.f4467i).setListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.C51749t.C517501 */

                    static {
                        Covode.recordClassIndex(61113);
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        C51749t.m96420a(viewHolder.itemView);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animator.getListeners().remove(this);
                        C51749t.m96420a(viewHolder.itemView);
                        C51749t.this.mo4674f(viewHolder);
                        C51749t.m96421a(C51749t.this);
                    }
                }).setInterpolator(new C0996c());
                this.f119259n.remove(size);
            }
        }
        if (!this.f119260o.isEmpty()) {
            for (int size2 = this.f119260o.size() - 1; size2 >= 0; size2--) {
                final RecyclerView.ViewHolder viewHolder2 = this.f119260o.get(size2);
                viewHolder2.itemView.animate().alpha(0.0f).translationX((float) (-viewHolder2.itemView.getWidth())).setDuration(this.f4468j).setListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.C51749t.C517512 */

                    static {
                        Covode.recordClassIndex(61114);
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        C51749t.m96420a(viewHolder2.itemView);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animator.getListeners().remove(this);
                        C51749t.m96420a(viewHolder2.itemView);
                        C51749t.this.mo4674f(viewHolder2);
                        C51749t.m96421a(C51749t.this);
                    }
                }).setInterpolator(new C0996c());
                this.f119260o.remove(size2);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m96421a(C51749t tVar) {
        if (!tVar.mo4668b()) {
            tVar.mo4673e();
        }
    }

    /* renamed from: a */
    public static void m96420a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: a */
    public final boolean mo4850a(RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof AbstractC51752u) && !(viewHolder instanceof AbstractC20630e)) {
            return super.mo4850a(viewHolder);
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        this.f119260o.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: b */
    public final boolean mo4853b(RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof AbstractC51752u)) {
            return super.mo4853b(viewHolder);
        }
        viewHolder.itemView.setAlpha(0.0f);
        viewHolder.itemView.setTranslationY((float) viewHolder.itemView.getHeight());
        viewHolder.itemView.setScaleX(0.5f);
        viewHolder.itemView.setScaleY(0.5f);
        this.f119259n.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: c */
    public final void mo4670c(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().cancel();
        if (this.f119259n.remove(viewHolder)) {
            mo4674f(viewHolder);
            m96420a(viewHolder.itemView);
        }
        if (this.f119260o.remove(viewHolder)) {
            mo4674f(viewHolder);
            m96420a(viewHolder.itemView);
        }
        super.mo4670c(viewHolder);
    }
}
