package com.p2082ss.android.ugc.aweme.share.more.p3770ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.share.more.p3769b.C69339a;
import com.p2082ss.android.ugc.aweme.share.more.p3770ui.p3771a.C69350a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69675c;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList */
public final class ShareActionVerticalList extends FrameLayout implements AbstractC69675c {

    /* renamed from: b */
    public static final C69345c f154917b = new C69345c((byte) 0);

    /* renamed from: a */
    public List<? extends AbstractC69693h> f154918a = C89086z.INSTANCE;

    /* renamed from: c */
    private AbstractC69675c f154919c;

    /* renamed from: d */
    private final C69350a f154920d;

    /* renamed from: e */
    private final RecyclerView f154921e;

    /* renamed from: f */
    private final LinearLayoutManager f154922f;

    /* renamed from: g */
    private final Set<String> f154923g = new LinkedHashSet();

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList$e */
    final /* synthetic */ class RunnableC69347e implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f154926a;

        static {
            Covode.recordClassIndex(81679);
        }

        RunnableC69347e(AbstractC89171a aVar) {
            this.f154926a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f154926a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(81674);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList$c */
    public static final class C69345c {
        static {
            Covode.recordClassIndex(81677);
        }

        private C69345c() {
        }

        public /* synthetic */ C69345c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList$d */
    static final /* synthetic */ class C69346d extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(81678);
        }

        C69346d(ShareActionVerticalList shareActionVerticalList) {
            super(0, shareActionVerticalList, ShareActionVerticalList.class, "filterVisible", "filterVisible()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((ShareActionVerticalList) this.receiver).mo109619a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo109619a() {
        List<? extends AbstractC69693h> list = this.f154918a;
        if (list != null && !list.isEmpty()) {
            int m = this.f154922f.mo4373m();
            int k = this.f154922f.mo4371k();
            if (m >= 0 && k >= 0 && k <= m) {
                while (true) {
                    AbstractC69693h hVar = (AbstractC69693h) this.f154918a.get(k);
                    if (!this.f154923g.contains(hVar.mo61919c())) {
                        this.f154923g.add(hVar.mo61919c());
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

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList$a */
    public static final class C69343a extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ ShareActionVerticalList f154924a;

        static {
            Covode.recordClassIndex(81675);
        }

        C69343a(ShareActionVerticalList shareActionVerticalList) {
            this.f154924a = shareActionVerticalList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            this.f154924a.mo109619a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69675c
    /* renamed from: a */
    public final void mo109614a(AbstractC69693h hVar) {
        C89219l.m154721d(hVar, "");
        AbstractC69675c cVar = this.f154919c;
        if (cVar != null) {
            cVar.mo109614a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo109621a(List<? extends AbstractC69693h> list) {
        C89219l.m154721d(list, "");
        this.f154918a = list;
        this.f154920d.mo109624a(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList$b */
    static final class C69344b extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ ShareActionVerticalList f154925a;

        static {
            Covode.recordClassIndex(81676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69344b(ShareActionVerticalList shareActionVerticalList) {
            super(1);
            this.f154925a = shareActionVerticalList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            int intValue = num.intValue();
            boolean z = false;
            if ((intValue >= this.f154925a.f154918a.size() || !(this.f154925a.f154918a.get(intValue) instanceof C69339a)) && ((intValue >= this.f154925a.f154918a.size() - 1 || !(this.f154925a.f154918a.get(intValue + 1) instanceof C69339a)) && intValue != this.f154925a.f154918a.size() - 1)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList$f */
    public static final class C69348f implements AbstractC69675c {

        /* renamed from: a */
        final /* synthetic */ C69684e f154927a;

        /* renamed from: b */
        final /* synthetic */ Context f154928b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f154929c;

        static {
            Covode.recordClassIndex(81680);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69675c
        /* renamed from: a */
        public final void mo109614a(AbstractC69693h hVar) {
            AbstractC89171a aVar;
            C89219l.m154721d(hVar, "");
            if (!this.f154927a.f155557i.mo109574a(hVar, this.f154928b)) {
                hVar.mo61915a(this.f154928b, this.f154927a.f155557i);
            }
            AbstractC69690f fVar = this.f154927a.f155560l;
            if (fVar != null) {
                fVar.mo60846a(hVar, this.f154927a.f155557i, this.f154928b);
            }
            if (hVar.mo61923f()) {
                AbstractC89171a aVar2 = this.f154929c;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else if (hVar.mo61922e() && (aVar = this.f154929c) != null) {
                aVar.invoke();
            }
        }

        C69348f(C69684e eVar, Context context, AbstractC89171a aVar) {
            this.f154927a = eVar;
            this.f154928b = context;
            this.f154929c = aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareActionVerticalList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(6331);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ayy, this, true);
        View findViewById = findViewById(R.id.cn);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f154921e = recyclerView;
        C69350a aVar = new C69350a(this);
        this.f154920d = aVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.f154922f = linearLayoutManager;
        aVar.mo109624a(this.f154918a);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.mo4405a(new C69343a(this));
        int b = (int) C13628n.m24520b(recyclerView.getContext(), 0.5f);
        int b2 = (int) C13628n.m24520b(recyclerView.getContext(), 16.0f);
        int b3 = (int) C13628n.m24520b(recyclerView.getContext(), 16.0f);
        C69349a aVar2 = new C69349a(b, Color.parseColor("#1F161823"), new C69344b(this));
        aVar2.f154930a = b2;
        aVar2.f154931b = b3;
        recyclerView.mo4415b(aVar2);
        MethodCollector.m26664o(6331);
    }

    /* renamed from: a */
    public final void mo109620a(C69684e eVar, Context context, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(context, "");
        this.f154919c = new C69348f(eVar, context, aVar);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(6174);
        super.onLayout(z, i, i2, i3, i4);
        postDelayed(new RunnableC69347e(new C69346d(this)), 300);
        MethodCollector.m26664o(6174);
    }
}
