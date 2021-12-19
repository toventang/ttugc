package com.bytedance.jedi.ext.adapter.extension;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.p1464a.C20435c;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import com.bytedance.jedi.ext.adapter.extension.AbstractC20644a;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.extension.a */
public abstract class AbstractC20644a<T, BUILDER extends AbstractC20644a<T, BUILDER, VH>, VH extends AbstractC20630e<T>> {

    /* renamed from: a */
    public C20438e.AbstractC20440b f48816a;

    /* renamed from: b */
    public C20438e f48817b;

    /* renamed from: c */
    public final List<C89386u<AbstractC89172b<ViewGroup, VH>, AbstractC89183m<Integer, Object, Boolean>, AbstractC89183m<Integer, RecyclerView, C89391z>>> f48818c;

    /* renamed from: d */
    public final C20435c<T> f48819d;

    static {
        Covode.recordClassIndex(24178);
    }

    private AbstractC20644a(C20435c<T> cVar) {
        this.f48819d = cVar;
        this.f48818c = new ArrayList();
    }

    public /* synthetic */ AbstractC20644a(C20435c cVar, byte b) {
        this(cVar);
    }

    /* renamed from: a */
    public final BUILDER mo33901a(AbstractC89183m<? super Integer, Object, Boolean> mVar, AbstractC89183m<? super Integer, ? super RecyclerView, C89391z> mVar2, AbstractC89172b<? super ViewGroup, ? extends VH> bVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(bVar, "");
        this.f48818c.add(new C89386u<>(bVar, mVar, mVar2));
        return this;
    }
}
