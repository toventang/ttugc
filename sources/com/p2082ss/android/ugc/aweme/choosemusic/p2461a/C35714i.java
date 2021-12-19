package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

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
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35829d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.i */
public final class C35714i extends AbstractC39060f<MusicCollectionItem> {

    /* renamed from: a */
    public AbstractC35829d f84246a;

    static {
        Covode.recordClassIndex(42946);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new C35715a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa5, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.a.i$a */
    public class C35715a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        RemoteImageView f84247a;

        /* renamed from: b */
        TextView f84248b;

        /* renamed from: c */
        MusicCollectionItem f84249c;

        static {
            Covode.recordClassIndex(42947);
        }

        C35715a(View view) {
            super(view);
            this.f84247a = (RemoteImageView) view.findViewById(R.id.coa);
            this.f84248b = (TextView) view.findViewById(R.id.cob);
            this.itemView.setOnClickListener(new View$OnClickListenerC35716j(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        MusicCollectionItem musicCollectionItem;
        C35715a aVar = (C35715a) viewHolder;
        if (!C13603b.m24435a((Collection) this.f92236l) && i >= 0 && i < this.f92236l.size() && (musicCollectionItem = (MusicCollectionItem) this.f92236l.get(i)) != null) {
            aVar.f84249c = musicCollectionItem;
            C34577e.m70592a(aVar.f84247a, musicCollectionItem.cover);
            aVar.f84248b.setText(musicCollectionItem.mcName);
        }
    }
}
