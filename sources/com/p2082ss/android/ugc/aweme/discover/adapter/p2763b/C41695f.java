package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42295c;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67688c;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67694f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.f */
public final class C41695f extends RecyclerView.ViewHolder {

    /* renamed from: e */
    public static final C41696a f97264e = new C41696a((byte) 0);

    /* renamed from: i */
    private static final int f97265i;

    /* renamed from: a */
    SearchSugMobHelper f97266a;

    /* renamed from: b */
    final int f97267b = 1;

    /* renamed from: c */
    public final String f97268c;

    /* renamed from: d */
    public final AbstractC41953a f97269d;

    /* renamed from: f */
    private Integer f97270f;

    /* renamed from: g */
    private final String f97271g;

    /* renamed from: h */
    private final AbstractC89244h f97272h;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.f$b */
    public interface AbstractC41697b {
        static {
            Covode.recordClassIndex(49610);
        }

        /* renamed from: a */
        void mo70895a(int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC41955b mo70896a() {
        return (AbstractC41955b) this.f97272h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.f$a */
    public static final class C41696a {
        static {
            Covode.recordClassIndex(49609);
        }

        private C41696a() {
        }

        public /* synthetic */ C41696a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.f$f */
    static final class C41701f extends AbstractC89220m implements AbstractC89171a<AbstractC41955b> {

        /* renamed from: a */
        public static final C41701f f97284a = new C41701f();

        static {
            Covode.recordClassIndex(49614);
        }

        C41701f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC41955b invoke() {
            return SearchServiceImpl.m119336t().mo106217f();
        }
    }

    static {
        Covode.recordClassIndex(49608);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f97265i = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.f$e */
    static final class RunnableC41700e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C41695f f97282a;

        /* renamed from: b */
        final /* synthetic */ C67679e f97283b;

        static {
            Covode.recordClassIndex(49613);
        }

        RunnableC41700e(C41695f fVar, C67679e eVar) {
            this.f97282a = fVar;
            this.f97283b = eVar;
        }

        public final void run() {
            ImageView imageView;
            C41695f fVar = this.f97282a;
            int i = 8;
            if (!this.f97283b.mo106740a()) {
                View view = fVar.itemView;
                C89219l.m154716b(view, "");
                imageView = (ImageView) view.findViewById(R.id.bwd);
                C89219l.m154716b(imageView, "");
            } else {
                View view2 = fVar.itemView;
                C89219l.m154716b(view2, "");
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.ad6);
                C89219l.m154716b(linearLayout, "");
                float width = (float) linearLayout.getWidth();
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                float applyDimension = width - TypedValue.applyDimension(1, 15.0f, system.getDisplayMetrics());
                View view3 = fVar.itemView;
                C89219l.m154716b(view3, "");
                TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.eu6);
                C89219l.m154716b(tuxTextView, "");
                TextPaint paint = tuxTextView.getPaint();
                C89219l.m154716b(paint, "");
                View view4 = fVar.itemView;
                C89219l.m154716b(view4, "");
                TuxTextView tuxTextView2 = (TuxTextView) view4.findViewById(R.id.eu6);
                C89219l.m154716b(tuxTextView2, "");
                float measureText = paint.measureText(tuxTextView2.getText().toString());
                View view5 = fVar.itemView;
                C89219l.m154716b(view5, "");
                imageView = (ImageView) view5.findViewById(R.id.bwd);
                C89219l.m154716b(imageView, "");
                if (measureText < applyDimension) {
                    i = 0;
                }
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.f$c */
    public static final class C41698c extends AbstractC42295c {

        /* renamed from: a */
        final /* synthetic */ C41695f f97273a;

        /* renamed from: b */
        final /* synthetic */ C67679e f97274b;

        /* renamed from: c */
        final /* synthetic */ String f97275c;

        /* renamed from: d */
        final /* synthetic */ int f97276d;

        /* renamed from: e */
        final /* synthetic */ String f97277e;

        static {
            Covode.recordClassIndex(49611);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42295c
        /* renamed from: a */
        public final void mo70884a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42662aj
        /* renamed from: a */
        public final void mo70824a(View view) {
            C67679e eVar;
            if (!C58001a.m104815a(view, 1200) && (eVar = this.f97274b) != null) {
                AbstractC41953a aVar = this.f97273a.f97269d;
                if (aVar != null) {
                    aVar.mo71103a(eVar, this.f97275c, this.f97276d);
                }
                C41702g.m83661b(this.f97273a.f97268c, this.f97276d, eVar, this.f97277e);
            }
        }

        C41698c(C41695f fVar, C67679e eVar, String str, int i, String str2) {
            this.f97273a = fVar;
            this.f97274b = eVar;
            this.f97275c = str;
            this.f97276d = i;
            this.f97277e = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.f$d */
    static final class View$OnClickListenerC41699d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41695f f97278a;

        /* renamed from: b */
        final /* synthetic */ C67679e f97279b;

        /* renamed from: c */
        final /* synthetic */ int f97280c;

        /* renamed from: d */
        final /* synthetic */ AbstractC41697b f97281d;

        static {
            Covode.recordClassIndex(49612);
        }

        View$OnClickListenerC41699d(C41695f fVar, C67679e eVar, int i, AbstractC41697b bVar) {
            this.f97278a = fVar;
            this.f97279b = eVar;
            this.f97280c = i;
            this.f97281d = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C41695f fVar = this.f97278a;
            C67679e eVar = this.f97279b;
            int i = this.f97280c;
            this.f97281d.mo70895a(fVar.getAdapterPosition());
            SearchHistoryManager.inst("").deleteSearchHistory(new SearchHistory(eVar.f151667b, fVar.f97269d.mo71102a()));
            SearchSugMobHelper searchSugMobHelper = fVar.f97266a;
            if (searchSugMobHelper != null) {
                searchSugMobHelper.mo71676a("history", Integer.valueOf(i), "clear", eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70897a(int i) {
        if (i <= 0) {
            i = f97265i;
        }
        Integer num = this.f97270f;
        if (num == null || num.intValue() != i) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            this.f97270f = Integer.valueOf(i);
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41695f(View view, String str, int i, AbstractC41953a aVar) {
        super(view);
        String str2;
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f97269d = aVar;
        this.f97271g = str;
        this.f97272h = C89250i.m154773a((AbstractC89171a) C41701f.f97284a);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        Context context = view2.getContext();
        ActivityC0945e eVar = (ActivityC0945e) (!(context instanceof ActivityC0945e) ? null : context);
        if (eVar != null) {
            this.f97266a = (SearchSugMobHelper) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SearchSugMobHelper.class);
        }
        mo70897a(i);
        C67694f b = C67688c.C67689a.m119841b();
        if (!(b == null || (str2 = b.f151724b) == null || str2.length() <= 0)) {
            str = str2;
        }
        this.f97268c = str;
    }
}
