package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.alog.C2688c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.View$OnAttachStateChangeListenerC34193c;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42226e;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42230f;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42235g;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42237h;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42242i;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.AbstractC42263c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.C42261b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.xsearch.C81688c;
import com.p2082ss.android.ugc.aweme.xsearch.C81689d;
import com.p2082ss.android.ugc.aweme.xsearch.horizontallist.AbstractC81695b;
import com.p2082ss.android.ugc.aweme.xsearch.video.C81753b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.j */
public final class C81723j extends AbstractC34151g {

    /* renamed from: h */
    public static final C81724a f182743h = new C81724a((byte) 0);

    /* renamed from: a */
    public C67568r f182744a;

    /* renamed from: b */
    public List<C81701d> f182745b = new ArrayList();

    /* renamed from: c */
    public List<? extends Aweme> f182746c;

    /* renamed from: d */
    public final Context f182747d;

    /* renamed from: e */
    public final AbstractC41814c f182748e;

    /* renamed from: f */
    public final C51060g f182749f;

    /* renamed from: g */
    public C81703f f182750g;

    /* renamed from: j */
    private int f182751j = -1;

    /* renamed from: k */
    private Map<String, Integer> f182752k = new HashMap();

    static {
        Covode.recordClassIndex(95128);
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b, com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g
    /* renamed from: a */
    public final void mo60482a(Aweme aweme) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g, com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g.AbstractC51062a
    /* renamed from: e */
    public final boolean mo60483e() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m141584a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.j$a */
    public static final class C81724a {
        static {
            Covode.recordClassIndex(95129);
        }

        private C81724a() {
        }

        public /* synthetic */ C81724a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.j$c */
    public static final class C81726c implements AbstractC42263c {
        static {
            Covode.recordClassIndex(95131);
        }

        C81726c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.AbstractC42263c
        /* renamed from: a */
        public final List<AbstractC42218b> mo71317a(C42186b bVar) {
            C89219l.m154721d(bVar, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C42237h(bVar));
            arrayList.add(new C42226e(bVar));
            arrayList.add(new C42235g(bVar));
            arrayList.add(new C42230f(bVar));
            arrayList.add(new C42242i(bVar));
            return arrayList;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f182745b.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34107a, com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g
    /* renamed from: b */
    public final void mo60404b() {
        if (m141587g()) {
            m141586a(C81727d.f182754a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34107a, com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g
    /* renamed from: c */
    public final void mo60405c() {
        if (m141587g()) {
            m141586a(C81725b.f182753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.j$e */
    static final class RunnableC81728e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C81723j f182755a;

        /* renamed from: b */
        final /* synthetic */ View f182756b;

        /* renamed from: c */
        final /* synthetic */ boolean f182757c;

        static {
            Covode.recordClassIndex(95133);
        }

        RunnableC81728e(C81723j jVar, View view, boolean z) {
            this.f182755a = jVar;
            this.f182756b = view;
            this.f182757c = z;
        }

        public final void run() {
            for (View view = this.f182756b; view instanceof ViewGroup; view = ((ViewGroup) view).getChildAt(0)) {
                if (view instanceof C81753b) {
                    C81753b bVar = (C81753b) view;
                    if (bVar != null) {
                        bVar.setAutoPlay(this.f182757c);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private final boolean m141587g() {
        if (this.f80756i.getLayoutManager() != null && this.f80756i.getChildCount() > 0) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* renamed from: f */
    public final List<Aweme> mo125400f() {
        List<? extends Aweme> list = this.f182746c;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        List list2 = this.f182746c;
        if (list2 == null) {
            C89219l.m154715b();
        }
        return list2;
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.j$b */
    static final class C81725b extends AbstractC89220m implements AbstractC89172b<C81688c, Object> {

        /* renamed from: a */
        public static final C81725b f182753a = new C81725b();

        static {
            Covode.recordClassIndex(95130);
        }

        C81725b() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(C81688c cVar) {
            AbstractC34186b.AbstractC34189c cVar2;
            C81688c cVar3 = cVar;
            C89219l.m154721d(cVar3, "");
            WeakReference<AbstractC34186b.AbstractC34189c> weakReference = cVar3.f182651e;
            if (weakReference == null || (cVar2 = weakReference.get()) == null) {
                return null;
            }
            cVar2.bg_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.j$d */
    static final class C81727d extends AbstractC89220m implements AbstractC89172b<C81688c, Object> {

        /* renamed from: a */
        public static final C81727d f182754a = new C81727d();

        static {
            Covode.recordClassIndex(95132);
        }

        C81727d() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(C81688c cVar) {
            AbstractC34186b.AbstractC34189c cVar2;
            C81688c cVar3 = cVar;
            C89219l.m154721d(cVar3, "");
            WeakReference<AbstractC34186b.AbstractC34189c> weakReference = cVar3.f182651e;
            if (weakReference == null || (cVar2 = weakReference.get()) == null) {
                return null;
            }
            cVar2.bi_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo125399b(List<C81701d> list) {
        C89219l.m154721d(list, "");
        this.f182745b = list;
        this.f182746c = list.get(0).f182689b;
        this.f182751j = -1;
        this.f182752k.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        String cardName;
        Integer num;
        C81700c cVar = this.f182745b.get(i).f182694g;
        if (cVar == null || (cardName = cVar.getCardName()) == null) {
            return -1;
        }
        if (this.f182752k.containsKey(cardName) && (num = this.f182752k.get(cardName)) != null) {
            return num.intValue();
        }
        int i2 = this.f182751j + 1;
        this.f182751j = i2;
        this.f182752k.put(cardName, Integer.valueOf(i2));
        return i2;
    }

    /* renamed from: a */
    private final void m141586a(AbstractC89172b<? super C81688c, ? extends Object> bVar) {
        C81688c cVar;
        List<Integer> list;
        C81703f fVar = this.f182750g;
        if (!(fVar == null || (cVar = fVar.f182698c) == null || (list = cVar.f182653g) == null)) {
            for (Integer num : list) {
                C81688c b = C81689d.f182658b.mo125341b(num.intValue());
                if (b != null) {
                    bVar.invoke(b);
                }
            }
        }
    }

    /* renamed from: a */
    private static Map<String, Object> m141585a(C42345d dVar, int i) {
        HashMap hashMap = new HashMap();
        try {
            List<Map<?, ?>> awemeListRawByPosition = dVar.getAwemeListRawByPosition(i);
            C89219l.m154716b(awemeListRawByPosition, "");
            hashMap.put("aweme_list", awemeListRawByPosition);
        } catch (Exception e) {
            String exc = e.toString();
            C2688c.m7778a(3, "HorizontalAdapter", exc);
            C51423a.m95791b(4, "HorizontalAdapter", exc);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m141584a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(9093);
        C89219l.m154721d(viewGroup, "");
        View$OnAttachStateChangeListenerC42258a a2 = View$OnAttachStateChangeListenerC42258a.C42259a.m84600a(viewGroup, new C81726c());
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        MethodCollector.m26664o(9093);
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.discover.mixfeed.d */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Integer height;
        C89219l.m154721d(viewHolder, "");
        C81701d dVar = this.f182745b.get(i);
        C42345d dVar2 = new C42345d();
        C0484a aVar = new C0484a();
        C81700c cVar = dVar.f182694g;
        String str = null;
        if (!(cVar == null || cVar.getRawData() == null)) {
            JavaOnlyMap rawData = dVar.f182694g.getRawData();
            if (rawData == null) {
                C89219l.m154715b();
            }
            C0484a<String, Object> arrayMap = rawData.toArrayMap();
            C89219l.m154716b(arrayMap, "");
            for (Map.Entry<String, Object> entry : arrayMap.entrySet()) {
                aVar.put(entry.getKey(), entry.getValue());
            }
        }
        if (dVar.f182692e != null) {
            ReadableMap readableMap = dVar.f182692e;
            if (readableMap == null) {
                C89219l.m154715b();
            }
            C0484a<String, Object> arrayMap2 = readableMap.toArrayMap();
            C89219l.m154716b(arrayMap2, "");
            arrayMap2.put("rank_index", Integer.valueOf(i));
            aVar.put("log_extra", arrayMap2);
        } else {
            C0484a aVar2 = new C0484a();
            aVar2.put("rank_index", Integer.valueOf(i));
            aVar.put("log_extra", aVar2);
        }
        if (dVar.f182691d != null) {
            aVar.put("total", dVar.f182691d);
        }
        C81700c cVar2 = dVar.f182694g;
        if (cVar2 != null) {
            str = cVar2.getSchema();
        }
        dVar2.setSchema(str);
        dVar2.setRawData(C80342dg.m139300a().mo46674b(aVar));
        dVar2.setAwemeList(dVar.f182689b);
        C81700c cVar3 = dVar.f182694g;
        if (cVar3 == null || (height = cVar3.getHeight()) == null) {
            i2 = 0;
        } else {
            i2 = height.intValue();
        }
        dVar2.setHeight(i2);
        if (dVar.f182693f == null) {
            dVar2.setWidth(-2);
        } else {
            AbstractC81695b.C81699c cVar4 = dVar.f182693f;
            if (cVar4 == null) {
                C89219l.m154715b();
            }
            dVar2.setWidth((int) cVar4.getPreferItemWidth());
        }
        View$OnAttachStateChangeListenerC42258a aVar3 = (View$OnAttachStateChangeListenerC42258a) viewHolder;
        ViewParent viewParent = this.f80756i;
        while (true) {
            if (viewParent.getParent() == null) {
                break;
            }
            viewParent = viewParent.getParent();
            if (viewParent == null) {
                C89219l.m154715b();
            }
            if (viewParent instanceof C42261b) {
                C42261b bVar = (C42261b) viewParent;
                if (bVar.getTag() != null && (bVar.getTag() instanceof C67568r)) {
                    Object tag = bVar.getTag();
                    Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.mob.ItemMobParam");
                    C67568r rVar = (C67568r) tag;
                    if (rVar != null) {
                        aVar3.mo70880a(rVar);
                    }
                }
            }
        }
        aVar3.mo71450a(dVar2, m141585a(dVar2, i));
        if (this.f80756i.getTag() != null) {
            Object tag2 = this.f80756i.getTag();
            Objects.requireNonNull(tag2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) tag2).booleanValue();
            View view = viewHolder.itemView;
            C89219l.m154716b(view, "");
            view.post(new RunnableC81728e(this, view, booleanValue));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81723j(Context context, AbstractC41814c cVar, AbstractC51043a aVar, C51060g gVar, RecyclerView recyclerView, C81703f fVar) {
        super(recyclerView);
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(recyclerView, "");
        this.f182747d = context;
        this.f182748e = cVar;
        this.f182749f = gVar;
        this.f182750g = fVar;
        recyclerView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC34193c(gVar, aVar, this, recyclerView));
    }
}
