package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.r */
public final class View$OnAttachStateChangeListenerC20591r implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public RecyclerView f48743a;

    /* renamed from: b */
    private final AbstractC89172b<RecyclerView, C89391z> f48744b;

    /* renamed from: c */
    private final AbstractC89172b<RecyclerView, C89391z> f48745c;

    static {
        Covode.recordClassIndex(24123);
    }

    private View$OnAttachStateChangeListenerC20591r() {
        this.f48744b = null;
        this.f48745c = null;
    }

    public /* synthetic */ View$OnAttachStateChangeListenerC20591r(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo33872a(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        this.f48743a = recyclerView;
        recyclerView.addOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public final void mo33873b(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        this.f48743a = null;
        recyclerView.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        C89219l.m154719c(view, "");
        this.f48743a = null;
        AbstractC89172b<RecyclerView, C89391z> bVar = this.f48745c;
        if (bVar != null) {
            bVar.invoke(view);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        C89219l.m154719c(view, "");
        this.f48743a = (RecyclerView) view;
        AbstractC89172b<RecyclerView, C89391z> bVar = this.f48744b;
        if (bVar != null) {
            bVar.invoke(view);
        }
    }
}
