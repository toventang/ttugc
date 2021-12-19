package com.p2082ss.android.ugc.aweme.base.arch;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20628c;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.bytedance.jedi.ext.adapter.p1467b.C20633f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.arch.h */
public abstract class AbstractC34497h<VH extends AbstractC20630e<?>, M extends C20633f<VH>> extends AbstractC39063h implements AbstractC20628c<VH, M> {

    /* renamed from: c */
    public static final C34498a f81482c = new C34498a((byte) 0);

    /* renamed from: b */
    public View f81483b;

    static {
        Covode.recordClassIndex(41455);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo60935a(AbstractC20638g<VH> gVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo60932b(int i);

    /* renamed from: com.ss.android.ugc.aweme.base.arch.h$a */
    public static final class C34498a {
        static {
            Covode.recordClassIndex(41456);
        }

        private C34498a() {
        }

        public /* synthetic */ C34498a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    public final int mo60937d() {
        if (this.f81483b == null) {
            return 0;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public int mo60936c(int i) {
        if (i < mo60937d()) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        mo33883b().mo33894a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        mo33883b().mo33896b(recyclerView);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i != Integer.MAX_VALUE) {
            return mo33883b().mo33890a(viewGroup, i);
        }
        View view = this.f81483b;
        if (view == null) {
            C89219l.m154715b();
        }
        return new C34495f(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            super.onBindViewHolder(viewHolder, i, list);
        } else if (getItemViewType(i) != Integer.MAX_VALUE) {
            mo33883b();
            C20633f.m38860a((AbstractC20630e) viewHolder, mo60932b(i), i - mo60937d(), list);
        }
    }
}
