package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.alog.C2688c;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.xsearch.C81686a;
import com.p2082ss.android.ugc.aweme.xsearch.C81687b;
import com.p2082ss.android.ugc.aweme.xsearch.C81688c;
import com.p2082ss.android.ugc.aweme.xsearch.C81689d;
import com.p2082ss.android.ugc.aweme.xsearch.C81691f;
import com.p2082ss.android.ugc.aweme.xsearch.horizontallist.AbstractC81695b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g */
public final class C81704g extends FrameLayout implements AbstractC34186b.AbstractC34192d, AbstractC81695b {

    /* renamed from: f */
    public static final C81705a f182699f = new C81705a((byte) 0);

    /* renamed from: b */
    boolean f182700b;

    /* renamed from: c */
    public boolean f182701c;

    /* renamed from: d */
    public boolean f182702d;

    /* renamed from: e */
    public final C81719i f182703e;

    /* renamed from: g */
    private final AbstractC89244h f182704g;

    /* renamed from: h */
    private boolean f182705h;

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$e */
    static final class C81709e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C81709e f182709a = new C81709e();

        static {
            Covode.recordClassIndex(95114);
        }

        C81709e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$l */
    static final class C81716l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C81716l f182721a = new C81716l();

        static {
            Covode.recordClassIndex(95121);
        }

        C81716l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(95109);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
    }

    public final List<AbstractC88412b> getDisposableList() {
        return (List) this.f182704g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$a */
    public static final class C81705a {
        static {
            Covode.recordClassIndex(95110);
        }

        private C81705a() {
        }

        public /* synthetic */ C81705a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$g */
    public static final class RunnableC81711g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C81704g f182712a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f182713b;

        static {
            Covode.recordClassIndex(95116);
        }

        RunnableC81711g(C81704g gVar, ArrayList arrayList) {
            this.f182712a = gVar;
            this.f182713b = arrayList;
        }

        public final void run() {
            this.f182712a.mo125381a(this.f182713b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$h */
    static final class C81712h extends AbstractC89220m implements AbstractC89171a<List<AbstractC88412b>> {

        /* renamed from: a */
        public static final C81712h f182714a = new C81712h();

        static {
            Covode.recordClassIndex(95117);
        }

        C81712h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<AbstractC88412b> invoke() {
            return new ArrayList();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        if (this.f182703e.mo125394c() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final C81733l getHolderWrapper() {
        return this.f182703e.f182731e.mo60489h();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return this.f182703e.f182731e.mo60468z();
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$f */
    static final class C81710f implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C81704g f182710a;

        /* renamed from: b */
        final /* synthetic */ int f182711b;

        static {
            Covode.recordClassIndex(95115);
        }

        C81710f(C81704g gVar, int i) {
            this.f182710a = gVar;
            this.f182711b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            if (this.f182711b < this.f182710a.getDisposableList().size()) {
                this.f182710a.getDisposableList().remove(this.f182711b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$m */
    static final class C81717m implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C81704g f182722a;

        /* renamed from: b */
        final /* synthetic */ int f182723b;

        static {
            Covode.recordClassIndex(95122);
        }

        C81717m(C81704g gVar, int i) {
            this.f182722a = gVar;
            this.f182723b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            if (this.f182723b < this.f182722a.getDisposableList().size()) {
                this.f182722a.getDisposableList().remove(this.f182723b);
            }
        }
    }

    /* renamed from: e */
    private final boolean m141560e() {
        if (!this.f182700b || !this.f182701c || !this.f182705h || !this.f182702d) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (AbstractC88412b bVar : getDisposableList()) {
            if (!bVar.isDisposed()) {
                bVar.dispose();
            }
        }
        getDisposableList().clear();
        this.f182705h = false;
        this.f182700b = false;
        this.f182701c = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        C81719i iVar = this.f182703e;
        if (!iVar.f182730d) {
            return;
        }
        if (iVar.f182733g != null) {
            AbstractC34186b.AbstractC34192d dVar = iVar.f182733g;
            if (dVar == null) {
                C89219l.m154715b();
            }
            dVar.mo60424A();
            iVar.f182727a.removeCallbacks(iVar.mo125395d());
            iVar.f182727a.postDelayed(iVar.mo125395d(), 50);
            return;
        }
        C2688c.m7778a(1, "SearchHorizontalForLynx", "try resume");
        iVar.mo125393b();
        iVar.f182727a.removeCallbacks(iVar.mo125395d());
        iVar.f182727a.postDelayed(iVar.mo125395d(), 100);
    }

    /* renamed from: a */
    public final boolean mo125382a() {
        if (!m141560e() || !this.f182703e.mo60336a()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$k */
    static final class C81715k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f182720a;

        static {
            Covode.recordClassIndex(95120);
        }

        C81715k(AbstractC89172b bVar) {
            this.f182720a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(T t) {
            this.f182720a.invoke(t);
        }
    }

    public final void setEventChangeListener(C81687b bVar) {
        this.f182703e.f182729c = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$j */
    static final class C81714j<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C81704g f182718a;

        /* renamed from: b */
        final /* synthetic */ Class f182719b;

        static {
            Covode.recordClassIndex(95119);
        }

        C81714j(C81704g gVar, Class cls) {
            this.f182718a = gVar;
            this.f182719b = cls;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            JavaOnlyMap javaOnlyMap = (JavaOnlyMap) obj;
            C89219l.m154721d(javaOnlyMap, "");
            return this.f182718a.mo125379a(javaOnlyMap, this.f182719b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$b */
    static final class C81706b extends AbstractC89220m implements AbstractC89172b<AbstractC81695b.C81696a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81733l f182706a;

        static {
            Covode.recordClassIndex(95111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81706b(C81733l lVar) {
            super(1);
            this.f182706a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC81695b.C81696a aVar) {
            AbstractC81695b.C81696a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C81733l lVar = this.f182706a;
            if (aVar2 != null) {
                C81718h hVar = lVar.f182771k;
                if (hVar != null) {
                    hVar.mo125389a(aVar2.getX(), aVar2.getY(), aVar2.getWidth(), aVar2.getHeight());
                }
                lVar.f182772l = aVar2;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$d */
    static final class C81708d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C81704g f182708a;

        static {
            Covode.recordClassIndex(95113);
        }

        C81708d(C81704g gVar) {
            this.f182708a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList<C81701d> arrayList = (ArrayList) obj;
            this.f182708a.f182701c = true;
            if (this.f182708a.mo125382a()) {
                C81719i iVar = this.f182708a.f182703e;
                C89219l.m154716b(arrayList, "");
                iVar.mo125391a(arrayList);
                return;
            }
            C81704g gVar = this.f182708a;
            C89219l.m154716b(arrayList, "");
            gVar.mo125381a(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo125381a(ArrayList<C81701d> arrayList) {
        if (mo125382a()) {
            this.f182703e.mo125391a(arrayList);
        } else {
            C34727m.m70945a(new RunnableC81711g(this, arrayList), 40);
        }
    }

    public final void setSessionIdFromLynx(int i) {
        C81719i iVar = this.f182703e;
        C2688c.m7778a(1, "HorizontalContainer", "SearchHorizontalViewHolder:  generateDataProvider".concat(String.valueOf(i)));
        iVar.mo125390a(new C81703f(C81689d.f182658b.mo125341b(i)));
        C81688c b = C81689d.f182658b.mo125341b(i);
        if (b != null) {
            int i2 = b.f182654h;
            C81719i iVar2 = this.f182703e;
            iVar2.f182732f = i2;
            iVar2.mo70877F().f151318m = i2;
            this.f182705h = true;
            b.f182650d = new WeakReference<>(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$c */
    static final class C81707c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C81704g f182707a;

        static {
            Covode.recordClassIndex(95112);
        }

        C81707c(C81704g gVar) {
            this.f182707a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            ReadableMap readableMap = (ReadableMap) obj;
            C89219l.m154721d(readableMap, "");
            ArrayList arrayList = new ArrayList();
            ReadableMap map = readableMap.getMap("common_data");
            if (readableMap.hasKey("card_list")) {
                Iterator<Object> it = readableMap.getArray("card_list").toArrayList().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JavaOnlyMap) {
                        C81701d dVar = new C81701d((C81700c) this.f182707a.mo125379a((JavaOnlyMap) next, C81700c.class));
                        dVar.f182688a = map;
                        arrayList.add(dVar);
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$i */
    static final class C81713i extends AbstractC89220m implements AbstractC89172b<AbstractC81695b.C81699c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81733l f182715a;

        /* renamed from: b */
        final /* synthetic */ C81704g f182716b;

        /* renamed from: c */
        final /* synthetic */ ReadableMap f182717c;

        static {
            Covode.recordClassIndex(95118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81713i(C81733l lVar, C81704g gVar, ReadableMap readableMap) {
            super(1);
            this.f182715a = lVar;
            this.f182716b = gVar;
            this.f182717c = readableMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC81695b.C81699c cVar) {
            Context context;
            AbstractC81695b.C81699c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C81733l lVar = this.f182715a;
            if (!(cVar2 == null || (context = lVar.f182773m.getContext()) == null)) {
                lVar.f182773m.setPadding(C51428b.m95803a(context, cVar2.getLeftMargin()), lVar.f182773m.getPaddingTop(), C51428b.m95803a(context, cVar2.getRightMargin()), lVar.f182773m.getPaddingBottom());
                if (lVar.f182773m.getItemDecorationCount() <= 0) {
                    lVar.f182773m.mo4402a(lVar.mo125406h());
                }
                lVar.mo125406h().f96778a = C13628n.m24520b(context, cVar2.getItemSpace());
            }
            this.f182716b.f182703e.f182734h = cVar2;
            this.f182716b.f182702d = true;
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C81704g(Context context) {
        super(context, null, 0);
        AbstractC51043a aVar;
        C89219l.m154721d(context, "");
        AbstractC51044b bVar = null;
        MethodCollector.m26663i(9102);
        this.f182704g = C89250i.m154773a((AbstractC89171a) C81712h.f182714a);
        C81686a a = C81691f.m141555a(this);
        C89219l.m154721d("SearchHorizontalForLynx createHorizontalView", "");
        if (a != null) {
            aVar = a.f182643b;
            bVar = a.f182644c;
        } else {
            aVar = null;
        }
        C89219l.m154721d(this, "");
        C81719i iVar = new C81719i(C67641m.m119786a(this, R.layout.awx), aVar, bVar);
        this.f182703e = iVar;
        iVar.mo70880a(C67568r.C67569a.m119673a());
        addView(iVar.itemView);
        MethodCollector.m26664o(9102);
    }

    /* renamed from: a */
    private final JavaOnlyMap m141559a(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry entry : javaOnlyMap.entrySet()) {
            if (entry.getValue() instanceof JavaOnlyMap) {
                Object value = entry.getValue();
                Objects.requireNonNull(value, "null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyMap");
                JavaOnlyMap javaOnlyMap2 = (JavaOnlyMap) value;
                if (javaOnlyMap2.containsKey("__lynx_val__")) {
                    javaOnlyMap.put(entry.getKey(), javaOnlyMap2.get("__lynx_val__"));
                } else {
                    javaOnlyMap.put(entry.getKey(), m141559a(javaOnlyMap2));
                }
            } else {
                javaOnlyMap.put(entry.getKey(), entry.getValue());
            }
        }
        return javaOnlyMap;
    }

    public /* synthetic */ C81704g(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final <T> T mo125379a(JavaOnlyMap javaOnlyMap, Class<T> cls) {
        return (T) C80342dg.m139301a(C80342dg.m139300a().mo46674b(m141559a(javaOnlyMap)), cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> void mo125380a(JavaOnlyMap javaOnlyMap, Class<T> cls, AbstractC89172b<? super T, C89391z> bVar) {
        AbstractC88412b a = AbstractC88924h.m154135a(javaOnlyMap).mo143205b(new C81714j(this, cls)).mo143204b(C88925a.m154160a(C88946a.f201990b)).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143191a(new C81715k(bVar), C81716l.f182721a, new C81717m(this, getDisposableList().size()));
        List<AbstractC88412b> disposableList = getDisposableList();
        C89219l.m154716b(a, "");
        disposableList.add(a);
    }
}
