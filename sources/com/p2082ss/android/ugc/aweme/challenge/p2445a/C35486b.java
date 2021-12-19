package com.p2082ss.android.ugc.aweme.challenge.p2445a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.a.b */
public final class C35486b extends AbstractC39058d {

    /* renamed from: d */
    public boolean f83679d;

    /* renamed from: e */
    private String f83680e;

    /* renamed from: f */
    private AbstractC35500d f83681f;

    /* renamed from: g */
    private AbstractC39097c<AbstractC39059e> f83682g;

    /* renamed from: h */
    private C35658s.AbstractC35663b f83683h;

    static {
        Covode.recordClassIndex(42674);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final int getItemCount() {
        if (this.f92274v) {
            return mo60933c() + 1;
        }
        return mo60933c();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<Aweme> list) {
        this.f92237m = 0;
        if (TextUtils.equals(this.f83680e, "challenge")) {
            this.f92236l = list;
            m72561e(this.f92236l);
            super.mo62377b_(this.f92236l);
            return;
        }
        super.mo62377b_(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: c */
    public final int mo60936c(int i) {
        int c = super.mo60936c(i);
        if (c == 0) {
            C35658s.AbstractC35663b bVar = this.f83683h;
            if (bVar instanceof C35658s.AbstractC35665d) {
                return ((C35658s.AbstractC35665d) bVar).getDetailAwemeViewType(i, (Aweme) this.f92236l.get(i));
            }
        }
        return c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC39097c<AbstractC39059e> cVar;
        super.onViewAttachedToWindow(viewHolder);
        if (this.f83679d && viewHolder.getItemViewType() == 0 && (cVar = this.f83682g) != null) {
            cVar.mo67855a(viewHolder);
        }
    }

    /* renamed from: e */
    private List<Integer> m72561e(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        for (int max = Math.max(0, this.f92237m - 1); max < size; max++) {
            Aweme aweme = list.get(max);
            aweme.setOriginalPos(max);
            if (aweme.getIsTop() == 1) {
                list.remove(aweme);
                list.add(i, aweme);
                i++;
                arrayList.add(Integer.valueOf(max));
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b */
    public final void mo62376b(List<Aweme> list) {
        if (TextUtils.equals(this.f83680e, "challenge")) {
            this.f92236l = list;
            List<Integer> e = m72561e(this.f92236l);
            super.mo62376b(list);
            if (e.size() > 0) {
                notifyItemRangeInserted(0, e.size());
                return;
            }
            return;
        }
        super.mo62376b(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC35485a) viewHolder).mo62375a((Aweme) this.f92236l.get(i), i, this.f83679d);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        AbstractC35485a onCreateDetailAwemeViewHolder;
        C35658s.AbstractC35663b bVar = this.f83683h;
        if (bVar instanceof C35658s.AbstractC35665d) {
            onCreateDetailAwemeViewHolder = ((C35658s.AbstractC35665d) bVar).onCreateDetailAwemeViewHolder(viewGroup, i, this.f83680e, this.f83681f);
        } else {
            onCreateDetailAwemeViewHolder = this.f83683h.onCreateDetailAwemeViewHolder(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.w3, viewGroup, false), this.f83680e, this.f83681f);
        }
        if (!(onCreateDetailAwemeViewHolder == null || onCreateDetailAwemeViewHolder.itemView.getParent() == null)) {
            ALog.m59869i("DetailAwemeAdapter", onCreateDetailAwemeViewHolder.getClass() + " itemView already attached !!");
        }
        return onCreateDetailAwemeViewHolder;
    }

    public C35486b(String str, AbstractC35500d dVar, AbstractC39097c<AbstractC39059e> cVar, C35658s.AbstractC35663b bVar) {
        this.f83680e = str;
        this.f83681f = dVar;
        this.f83682g = cVar;
        this.f83683h = bVar;
    }
}
