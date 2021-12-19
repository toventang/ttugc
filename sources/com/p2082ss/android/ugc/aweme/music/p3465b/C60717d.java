package com.p2082ss.android.ugc.aweme.music.p3465b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2629a.C39057c;
import com.p2082ss.android.ugc.aweme.music.p3465b.p3466a.C60710a;
import com.p2082ss.android.ugc.aweme.music.p3465b.p3466a.C60711b;
import com.p2082ss.android.ugc.aweme.music.p3465b.p3467b.AbstractC60713a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.b.d */
public final class C60717d extends AbstractC39063h {

    /* renamed from: a */
    public List<AbstractC60713a> f137961a;

    /* renamed from: b */
    int f137962b;

    /* renamed from: c */
    RecyclerView f137963c;

    /* renamed from: d */
    private C39057c<List<AbstractC60713a>> f137964d;

    /* renamed from: e */
    private C60711b f137965e;

    /* renamed from: f */
    private C60710a f137966f;

    static {
        Covode.recordClassIndex(71273);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60933c() {
        return this.f137961a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.b.d$a */
    public enum EnumC60718a {
        BtnConfirmAndShoot,
        BtnConfirm;

        static {
            Covode.recordClassIndex(71274);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        C39057c<List<AbstractC60713a>> cVar = this.f137964d;
        if (cVar != null) {
            cVar.mo67795a();
        }
        this.f137963c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        C39057c<List<AbstractC60713a>> cVar = this.f137964d;
        if (cVar != null) {
            cVar.mo67799b();
        }
        this.f137963c = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        if (this.f137961a.size() > i) {
            return this.f137964d.mo67792a(this.f137961a, i);
        }
        return super.mo60936c(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return this.f137964d.mo67793a(viewGroup, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C60710a aVar = this.f137966f;
        if (aVar != null) {
            aVar.f137939c = this.f137962b;
        }
        C60711b bVar = this.f137965e;
        if (bVar != null) {
            bVar.f137947c = this.f137962b;
        }
        this.f137964d.mo67797a(this.f137961a, i, viewHolder);
    }
}
