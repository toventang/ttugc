package com.p2082ss.android.ugc.aweme.trending.p4149ui.list;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.powerlist.PowerList;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.aweme.trending.p4145a.C79041a;
import com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79128b;
import com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79130c;
import com.p2082ss.android.ugc.aweme.utils.C80590iv;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a */
public final class C79117a extends Fragment {

    /* renamed from: f */
    public static final C79119b f177812f = new C79119b((byte) 0);

    /* renamed from: a */
    public AbstractC79118a f177813a;

    /* renamed from: b */
    public List<C67590l> f177814b;

    /* renamed from: c */
    public PowerList f177815c;

    /* renamed from: d */
    public int f177816d;

    /* renamed from: e */
    public boolean f177817e;

    /* renamed from: g */
    private String f177818g = "";

    /* renamed from: h */
    private final AbstractC89244h f177819h = C89250i.m154773a((AbstractC89171a) C79123e.f177830a);

    /* renamed from: i */
    private String f177820i;

    /* renamed from: j */
    private View f177821j;

    /* renamed from: k */
    private boolean f177822k = true;

    /* renamed from: l */
    private final AbstractC89244h f177823l = C89250i.m154773a((AbstractC89171a) new C79121d(this));

    /* renamed from: m */
    private final AbstractC89244h f177824m = C89250i.m154773a((AbstractC89171a) new C79126h(this));

    /* renamed from: n */
    private SparseArray f177825n;

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a$a */
    public interface AbstractC79118a {
        static {
            Covode.recordClassIndex(92301);
        }

        /* renamed from: a */
        void mo122904a();

        /* renamed from: a */
        void mo122905a(C67590l lVar);

        /* renamed from: a */
        void mo122906a(boolean z, C67590l lVar);
    }

    static {
        Covode.recordClassIndex(92300);
    }

    /* renamed from: a */
    private final boolean m137951a() {
        return ((Boolean) this.f177819h.getValue()).booleanValue();
    }

    /* renamed from: c */
    private final C79121d.C791221 m137953c() {
        return (C79121d.C791221) this.f177823l.getValue();
    }

    /* renamed from: d */
    private final C79126h.C791271 m137954d() {
        return (C79126h.C791271) this.f177824m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a$b */
    static final class C79119b {
        static {
            Covode.recordClassIndex(92302);
        }

        private C79119b() {
        }

        public /* synthetic */ C79119b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a$d */
    static final class C79121d extends AbstractC89220m implements AbstractC89171a<C791221> {

        /* renamed from: a */
        final /* synthetic */ C79117a f177828a;

        static {
            Covode.recordClassIndex(92304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79121d(C79117a aVar) {
            super(0);
            this.f177828a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C791221 invoke() {
            return new C79128b.AbstractC79129a(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79117a.C79121d.C791221 */

                /* renamed from: a */
                final /* synthetic */ C79121d f177829a;

                static {
                    Covode.recordClassIndex(92305);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f177829a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79128b.AbstractC79129a
                /* renamed from: a */
                public final void mo122915a(View view, C79128b bVar) {
                    C89219l.m154721d(view, "");
                    C89219l.m154721d(bVar, "");
                    AbstractC79118a aVar = this.f177829a.f177828a.f177813a;
                    if (aVar != null) {
                        aVar.mo122905a(bVar.f177835a);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79128b.AbstractC79129a
                /* renamed from: a */
                public final void mo122916a(boolean z, C67590l lVar) {
                    C89219l.m154721d(lVar, "");
                    AbstractC79118a aVar = this.f177829a.f177828a.f177813a;
                    if (aVar != null) {
                        aVar.mo122906a(z, lVar);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a$h */
    static final class C79126h extends AbstractC89220m implements AbstractC89171a<C791271> {

        /* renamed from: a */
        final /* synthetic */ C79117a f177833a;

        static {
            Covode.recordClassIndex(92309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79126h(C79117a aVar) {
            super(0);
            this.f177833a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C791271 invoke() {
            return new C79130c.AbstractC79131a(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79117a.C79126h.C791271 */

                /* renamed from: a */
                final /* synthetic */ C79126h f177834a;

                static {
                    Covode.recordClassIndex(92310);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f177834a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79130c.AbstractC79131a
                /* renamed from: a */
                public final void mo122918a(View view, C79130c cVar) {
                    C89219l.m154721d(view, "");
                    C89219l.m154721d(cVar, "");
                    AbstractC79118a aVar = this.f177834a.f177833a.f177813a;
                    if (aVar != null) {
                        aVar.mo122905a(cVar.f177838a);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79130c.AbstractC79131a
                /* renamed from: a */
                public final void mo122919a(boolean z, C67590l lVar) {
                    C89219l.m154721d(lVar, "");
                    AbstractC79118a aVar = this.f177834a.f177833a.f177813a;
                    if (aVar != null) {
                        aVar.mo122906a(z, lVar);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a$g */
    static final class C79125g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79117a f177832a;

        static {
            Covode.recordClassIndex(92308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79125g(C79117a aVar) {
            super(0);
            this.f177832a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C79117a aVar = this.f177832a;
            aVar.f177816d = C79117a.m137950a(aVar).getHeight();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f177825n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a$e */
    static final class C79123e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C79123e f177830a = new C79123e();

        static {
            Covode.recordClassIndex(92306);
        }

        C79123e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "billboard_style", 0) != C79041a.f177664a) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a$c */
    public static final class RunnableC79120c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C79117a f177826a;

        /* renamed from: b */
        final /* synthetic */ Integer f177827b;

        static {
            Covode.recordClassIndex(92303);
        }

        RunnableC79120c(C79117a aVar, Integer num) {
            this.f177826a = aVar;
            this.f177827b = num;
        }

        public final void run() {
            int i = (int) (((float) this.f177826a.f177816d) * 0.3f);
            RecyclerView.AbstractC1362i layoutManager = C79117a.m137950a(this.f177826a).getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                linearLayoutManager.mo4347a(this.f177827b.intValue(), i);
            }
            this.f177826a.f177817e = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m137952b() {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79117a.m137952b():void");
    }

    /* renamed from: a */
    public final void mo122912a(AbstractC79118a aVar) {
        C89219l.m154721d(aVar, "");
        this.f177813a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a$f */
    static final class View$OnClickListenerC79124f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79117a f177831a;

        static {
            Covode.recordClassIndex(92307);
        }

        View$OnClickListenerC79124f(C79117a aVar) {
            this.f177831a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC79118a aVar = this.f177831a.f177813a;
            if (aVar != null) {
                aVar.mo122904a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PowerList m137950a(C79117a aVar) {
        PowerList powerList = aVar.f177815c;
        if (powerList == null) {
            C89219l.m154710a("powerList");
        }
        return powerList;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        m137952b();
        this.f177822k = false;
        PowerList powerList = this.f177815c;
        if (powerList == null) {
            C89219l.m154710a("powerList");
        }
        int height = powerList.getHeight();
        this.f177816d = height;
        if (height <= 0) {
            PowerList powerList2 = this.f177815c;
            if (powerList2 == null) {
                C89219l.m154710a("powerList");
            }
            C80590iv.m139730a(powerList2, new C79125g(this));
        }
    }

    /* renamed from: a */
    public final void mo122913a(List<C67590l> list, String str, String str2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str2, "");
        this.f177814b = list;
        if (str == null) {
            str = "";
        }
        this.f177820i = str;
        this.f177818g = str2;
        list.size();
        isAdded();
        if (isAdded()) {
            m137952b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b4_, viewGroup, false);
        C89219l.m154716b(a, "");
        View findViewById = a.findViewById(R.id.eo5);
        C89219l.m154716b(findViewById, "");
        PowerList powerList = (PowerList) findViewById;
        this.f177815c = powerList;
        if (powerList == null) {
            C89219l.m154710a("powerList");
        }
        powerList.mo28083a(TrendingSheetCell.class, TrendingSheetRichCell.class);
        View findViewById2 = a.findViewById(R.id.eo4);
        C89219l.m154716b(findViewById2, "");
        this.f177821j = findViewById2;
        if (findViewById2 == null) {
            C89219l.m154710a("closeButton");
        }
        findViewById2.setOnClickListener(new View$OnClickListenerC79124f(this));
        return a;
    }
}
