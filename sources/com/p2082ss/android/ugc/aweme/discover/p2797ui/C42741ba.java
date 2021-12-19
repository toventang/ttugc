package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42749be;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ba */
public final class C42741ba<T> extends C42749be<C42680ao<T>> implements AbstractC42638ad<T> {

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ba$a */
    public interface AbstractC42742a<T> {
        static {
            Covode.recordClassIndex(50846);
        }

        /* renamed from: a */
        RecyclerView.ViewHolder mo73011a(ViewGroup viewGroup);

        /* renamed from: a */
        void mo73012a(RecyclerView.ViewHolder viewHolder, C42680ao<T> aoVar);
    }

    static {
        Covode.recordClassIndex(50845);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ba$b */
    static class C42743b<T> implements C42749be.AbstractC42750a<C42680ao<T>> {

        /* renamed from: a */
        private AbstractC42742a<T> f99703a;

        static {
            Covode.recordClassIndex(50847);
        }

        C42743b(AbstractC42742a<T> aVar) {
            this.f99703a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.C42749be.AbstractC42750a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder mo73013a(ViewGroup viewGroup) {
            return this.f99703a.mo73011a(viewGroup);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.C42749be.AbstractC42750a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo73014a(RecyclerView.ViewHolder viewHolder, Object obj) {
            this.f99703a.mo73012a(viewHolder, (C42680ao) obj);
        }
    }

    public C42741ba(AbstractC42742a<T> aVar) {
        super(new C42743b(aVar));
    }
}
