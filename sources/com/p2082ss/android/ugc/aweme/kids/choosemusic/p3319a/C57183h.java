package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57236d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.h */
public final class C57183h extends AbstractC39060f<C57110d> {

    /* renamed from: a */
    public AbstractC57236d f130206a;

    static {
        Covode.recordClassIndex(67084);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new C57184a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa5, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.h$a */
    public class C57184a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        RemoteImageView f130207a;

        /* renamed from: b */
        TextView f130208b;

        /* renamed from: c */
        C57110d f130209c;

        static {
            Covode.recordClassIndex(67085);
        }

        C57184a(View view) {
            super(view);
            this.f130207a = (RemoteImageView) view.findViewById(R.id.coa);
            this.f130208b = (TextView) view.findViewById(R.id.cob);
            this.itemView.setOnClickListener(new View$OnClickListenerC57185i(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C57110d dVar;
        C57184a aVar = (C57184a) viewHolder;
        if (!C13603b.m24435a((Collection) this.f92236l) && i >= 0 && i < this.f92236l.size() && (dVar = (C57110d) this.f92236l.get(i)) != null) {
            aVar.f130209c = dVar;
            C34577e.m70592a(aVar.f130207a, dVar.f130026c);
            aVar.f130208b.setText(dVar.f130025b);
        }
    }
}
