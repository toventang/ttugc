package com.p2082ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.C74825a;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.e */
public final class C74832e extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final C74833a f168195b = new C74833a((byte) 0);

    /* renamed from: a */
    public final RecommendUserCell<? extends C74825a> f168196a;

    static {
        Covode.recordClassIndex(87690);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.e$a */
    public static final class C74833a {
        static {
            Covode.recordClassIndex(87691);
        }

        private C74833a() {
        }

        public /* synthetic */ C74833a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74832e(RecommendUserCell<? extends C74825a> recommendUserCell, View view) {
        super(view);
        C89219l.m154721d(recommendUserCell, "");
        C89219l.m154721d(view, "");
        this.f168196a = recommendUserCell;
    }
}
