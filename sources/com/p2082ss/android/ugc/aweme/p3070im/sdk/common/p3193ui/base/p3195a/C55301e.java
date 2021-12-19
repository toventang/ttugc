package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1350a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.e */
public final class C55301e<T extends RecyclerView.AbstractC1350a<?>> implements AbstractC55303g {

    /* renamed from: a */
    private final T f126429a;

    /* renamed from: b */
    private final AbstractC89172b<Integer, Integer> f126430b;

    static {
        Covode.recordClassIndex(65058);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a.AbstractC55303g
    /* renamed from: a */
    public final void mo92320a() {
        this.f126429a.notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public C55301e(T t, AbstractC89172b<? super Integer, Integer> bVar) {
        C89219l.m154721d(t, "");
        C89219l.m154721d(bVar, "");
        this.f126429a = t;
        this.f126430b = bVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3773a(int i, int i2) {
        if (i2 != 0) {
            this.f126429a.notifyItemRangeInserted(this.f126430b.invoke(Integer.valueOf(i)).intValue(), i2);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: b */
    public final void mo3775b(int i, int i2) {
        if (i2 != 0) {
            if (i == 0 && i2 == this.f126429a.getItemCount()) {
                this.f126429a.notifyDataSetChanged();
            }
            this.f126429a.notifyItemRangeRemoved(this.f126430b.invoke(Integer.valueOf(i)).intValue(), i2);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: c */
    public final void mo3776c(int i, int i2) {
        this.f126429a.notifyItemMoved(this.f126430b.invoke(Integer.valueOf(i)).intValue(), this.f126430b.invoke(Integer.valueOf(i2)).intValue());
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3774a(int i, int i2, Object obj) {
        this.f126429a.notifyItemRangeChanged(this.f126430b.invoke(Integer.valueOf(i)).intValue(), i2, obj);
    }
}
