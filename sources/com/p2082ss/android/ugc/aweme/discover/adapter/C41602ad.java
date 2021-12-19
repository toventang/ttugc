package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42662aj;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ad */
public final class C41602ad extends RecyclerView.ViewHolder {

    /* renamed from: a */
    View f97029a;

    /* renamed from: b */
    public TextView f97030b;

    /* renamed from: c */
    public SearchHistory f97031c;

    /* renamed from: d */
    public AbstractC42664al.AbstractC42666b f97032d;

    static {
        Covode.recordClassIndex(49515);
    }

    public C41602ad(View view, AbstractC42664al.AbstractC42666b bVar) {
        super(view);
        this.f97029a = view.findViewById(R.id.buv);
        this.f97030b = (TextView) view.findViewById(R.id.eu6);
        this.f97032d = bVar;
        this.f97029a.setOnTouchListener(new AbstractC42662aj() {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41602ad.C416031 */

            static {
                Covode.recordClassIndex(49516);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42662aj
            /* renamed from: a */
            public final void mo70824a(View view) {
                if (C41602ad.this.f97032d != null) {
                    C41602ad.this.f97032d.mo72864b(C41602ad.this.f97031c, C41602ad.this.getAdapterPosition());
                }
            }
        });
        this.f97030b.setMaxLines(2);
    }
}
