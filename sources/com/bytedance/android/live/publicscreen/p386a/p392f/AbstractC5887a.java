package com.bytedance.android.live.publicscreen.p386a.p392f;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.a.f.a */
public abstract class AbstractC5887a<MODEL extends AbstractC5873h> extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public C5889g f14742b;

    /* renamed from: c */
    public MODEL f14743c;

    static {
        Covode.recordClassIndex(6494);
    }

    /* renamed from: a */
    public void mo11738a() {
    }

    /* renamed from: a */
    public abstract void mo10370a(C5889g gVar, MODEL model);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC5887a(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: a */
    public final void mo11739a(C5889g gVar, MODEL model, List<Object> list) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(model, "");
        C89219l.m154721d(list, "");
        this.f14742b = gVar;
        this.f14743c = model;
        mo10370a(gVar, model);
    }
}
