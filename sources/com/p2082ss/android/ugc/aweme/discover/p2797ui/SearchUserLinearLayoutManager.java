package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchUserLinearLayoutManager */
public final class SearchUserLinearLayoutManager extends WrapLinearLayoutManager {

    /* renamed from: a */
    public static long f99343a = -1;

    /* renamed from: b */
    public static final C42583a f99344b = new C42583a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchUserLinearLayoutManager$a */
    public static final class C42583a {
        static {
            Covode.recordClassIndex(50687);
        }

        private C42583a() {
        }

        public /* synthetic */ C42583a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(50686);
    }

    public SearchUserLinearLayoutManager(Context context) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i, com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(sVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        super.mo4337c(oVar, sVar);
        f99343a = C89271h.m154764a(System.currentTimeMillis() - currentTimeMillis, f99343a);
    }
}
