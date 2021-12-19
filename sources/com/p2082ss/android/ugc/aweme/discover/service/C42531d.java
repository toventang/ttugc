package com.p2082ss.android.ugc.aweme.discover.service;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.service.d */
public final class C42531d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public TextView f99173a;

    /* renamed from: b */
    final AbstractC89244h f99174b;

    static {
        Covode.recordClassIndex(50622);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.service.d$a */
    static final class C42532a extends AbstractC89220m implements AbstractC89171a<RecyclerView.C1367j> {

        /* renamed from: a */
        final /* synthetic */ View f99175a;

        static {
            Covode.recordClassIndex(50623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42532a(View view) {
            super(0);
            this.f99175a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView.C1367j invoke() {
            RecyclerView.C1367j jVar = new RecyclerView.C1367j(-2, -2);
            jVar.setMargins(0, 0, (int) C13628n.m24520b(this.f99175a.getContext(), 4.0f), 0);
            return jVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42531d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f99174b = C89250i.m154773a((AbstractC89171a) new C42532a(view));
        this.f99173a = (TextView) view.findViewById(R.id.cog);
    }
}
