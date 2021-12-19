package com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar */
public final class ShareActionBar extends FrameLayout implements AbstractC69675c {

    /* renamed from: a */
    public List<? extends AbstractC69693h> f155512a = C89086z.INSTANCE;

    /* renamed from: b */
    public final RecyclerView f155513b;

    /* renamed from: c */
    private AbstractC69675c f155514c;

    /* renamed from: d */
    private final C69668a f155515d;

    /* renamed from: e */
    private final LinearLayoutManager f155516e;

    /* renamed from: f */
    private final Set<String> f155517f = new LinkedHashSet();

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar$c */
    final /* synthetic */ class RunnableC69667c implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f155519a;

        static {
            Covode.recordClassIndex(82042);
        }

        RunnableC69667c(AbstractC89171a aVar) {
            this.f155519a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f155519a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(82039);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar$b */
    static final /* synthetic */ class C69666b extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(82041);
        }

        C69666b(ShareActionBar shareActionBar) {
            super(0, shareActionBar, ShareActionBar.class, "filterVisible", "filterVisible()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((ShareActionBar) this.receiver).mo109812a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo109812a() {
        List<? extends AbstractC69693h> list = this.f155512a;
        if (list != null && !list.isEmpty()) {
            int m = this.f155516e.mo4373m();
            int k = this.f155516e.mo4371k();
            if (m >= 0 && k >= 0 && k <= m) {
                while (true) {
                    AbstractC69693h hVar = (AbstractC69693h) this.f155512a.get(k);
                    if (!this.f155517f.contains(hVar.mo61919c())) {
                        this.f155517f.add(hVar.mo61919c());
                        Context context = getContext();
                        C89219l.m154716b(context, "");
                        hVar.mo61914a(context);
                    }
                    if (k != m) {
                        k++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar$a */
    public static final class C69665a extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ ShareActionBar f155518a;

        static {
            Covode.recordClassIndex(82040);
        }

        C69665a(ShareActionBar shareActionBar) {
            this.f155518a = shareActionBar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            this.f155518a.mo109812a();
        }
    }

    /* renamed from: a */
    public final void mo109813a(AbstractC69675c cVar) {
        C89219l.m154721d(cVar, "");
        this.f155514c = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69675c
    /* renamed from: a */
    public final void mo109614a(AbstractC69693h hVar) {
        C89219l.m154721d(hVar, "");
        AbstractC69675c cVar = this.f155514c;
        if (cVar != null) {
            cVar.mo109614a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo109814a(List<? extends AbstractC69693h> list) {
        C89219l.m154721d(list, "");
        this.f155512a = list;
        this.f155515d.mo109819a(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(4367);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ah5, this, true);
        View findViewById = findViewById(R.id.ca);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f155513b = recyclerView;
        C69668a aVar = new C69668a(this);
        this.f155515d = aVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f155516e = linearLayoutManager;
        aVar.mo109819a(this.f155512a);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.mo4405a(new C69665a(this));
        MethodCollector.m26664o(4367);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(4346);
        super.onLayout(z, i, i2, i3, i4);
        postDelayed(new RunnableC69667c(new C69666b(this)), 300);
        MethodCollector.m26664o(4346);
    }
}
