package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48292q;
import com.p2082ss.android.ugc.aweme.feed.api.C48337k;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.aq */
public final class C50074aq extends LinearLayout {

    /* renamed from: a */
    public boolean f115605a;

    /* renamed from: b */
    C48292q f115606b;

    /* renamed from: c */
    private RecyclerView f115607c = ((RecyclerView) C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.a0h, this, true).findViewById(R.id.dgw));

    /* renamed from: d */
    private LinearLayoutManager f115608d;

    static {
        Covode.recordClassIndex(59200);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.aq$a */
    static final class C50075a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C50074aq f115609a;

        static {
            Covode.recordClassIndex(59201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50075a(C50074aq aqVar) {
            super(0);
            this.f115609a = aqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f115609a.f115605a = true;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85211a(int i) {
        RecyclerView.AbstractC1362i layoutManager;
        RecyclerView recyclerView = this.f115607c;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).mo4347a(i, 0);
        }
    }

    public final void setData(List<C48337k> list) {
        C89219l.m154721d(list, "");
        C48292q qVar = this.f115606b;
        if (qVar == null) {
            C89219l.m154710a("mAdapter");
        }
        qVar.mo62377b_(list);
        RecyclerView recyclerView = this.f115607c;
        if (recyclerView != null) {
            recyclerView.mo4413b(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50074aq(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12360);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        CallBackLinearLayoutManager callBackLinearLayoutManager = new CallBackLinearLayoutManager(context2, new C50075a(this));
        this.f115608d = callBackLinearLayoutManager;
        RecyclerView recyclerView = this.f115607c;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(callBackLinearLayoutManager);
        }
        C48292q qVar = new C48292q();
        this.f115606b = qVar;
        RecyclerView recyclerView2 = this.f115607c;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(qVar);
            MethodCollector.m26664o(12360);
            return;
        }
        MethodCollector.m26664o(12360);
    }
}
