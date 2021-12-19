package com.bytedance.ies.powerlist;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1205n;
import androidx.recyclerview.widget.AbstractC1485u;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.debug.AbstractC17653c;
import com.bytedance.ies.powerlist.debug.C17648Dr;
import com.bytedance.ies.powerlist.footer.C17657a;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.ies.powerlist.header.C17660a;
import com.bytedance.ies.powerlist.optimize.C17670b;
import com.bytedance.ies.powerlist.optimize.Optimizer$init$1;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.p1232c.C17645a;
import com.bytedance.ies.powerlist.page.AbstractC17689c;
import com.bytedance.ies.powerlist.page.AbstractC17714i;
import com.bytedance.ies.powerlist.page.C17705g;
import com.bytedance.ies.powerlist.page.C17712h;
import com.bytedance.ies.powerlist.page.C17723m;
import com.bytedance.ies.powerlist.page.EnumC17688b;
import com.bytedance.ies.powerlist.page.EnumC17699e;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.powerlist.proxy.C17729b;
import com.bytedance.ies.powerlist.proxy.ListVMProxy;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tiktok.proxy.AbstractC22873a;
import com.bytedance.tiktok.proxy.AbstractC22874b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

public final class PowerAdapter extends RecyclerView.AbstractC1350a<PowerCell<? extends AbstractC17641a>> implements AbstractC1204m, AbstractC1485u, AbstractC33974au {

    /* renamed from: F */
    private static final ArrayList<Object> f42103F = new ArrayList<>();

    /* renamed from: o */
    public static final C17616a f42104o = new C17616a((byte) 0);

    /* renamed from: A */
    private C17693c f42105A;

    /* renamed from: B */
    private EnumC17688b f42106B;

    /* renamed from: C */
    private Class<? extends PowerLoadingCell> f42107C;

    /* renamed from: D */
    private Field f42108D;

    /* renamed from: E */
    private final AbstractC89244h f42109E;

    /* renamed from: a */
    public PowerStub f42110a;

    /* renamed from: b */
    public final List<PowerStub> f42111b = new ArrayList();

    /* renamed from: c */
    boolean f42112c = true;

    /* renamed from: d */
    public final Map<PowerStub, Integer> f42113d = new HashMap();

    /* renamed from: e */
    public C17648Dr.Tracker f42114e;

    /* renamed from: f */
    public final C88958b<C17693c> f42115f;

    /* renamed from: g */
    public final C17705g f42116g;

    /* renamed from: h */
    public final Map<C17618c, PowerStub> f42117h;

    /* renamed from: i */
    public final List<AbstractC17641a> f42118i;

    /* renamed from: j */
    public final List<Integer> f42119j;

    /* renamed from: k */
    AbstractC1204m f42120k;

    /* renamed from: l */
    boolean f42121l;

    /* renamed from: m */
    final C1205n f42122m;

    /* renamed from: n */
    public final PowerList f42123n;

    /* renamed from: p */
    private final Map<Integer, Class<? extends PowerCell<?>>> f42124p = new HashMap();

    /* renamed from: q */
    private final Map<Type, Integer> f42125q = new HashMap();

    /* renamed from: r */
    private PowerPageLoader<?> f42126r;

    /* renamed from: s */
    private final AbstractC89244h f42127s = C89250i.m154773a((AbstractC89171a) new C17630n(this));

    /* renamed from: t */
    private final C17657a f42128t = new C17657a((byte) 0);

    /* renamed from: u */
    private final AbstractC89244h f42129u = C89250i.m154773a((AbstractC89171a) C17632o.f42155a);

    /* renamed from: v */
    private Fragment f42130v;

    /* renamed from: w */
    private final AbstractC89244h f42131w = C89250i.m154773a((AbstractC89171a) new C17622g(this));

    /* renamed from: x */
    private final AbstractC89244h f42132x = C89250i.m154773a((AbstractC89171a) C17633p.f42156a);

    /* renamed from: y */
    private final AbstractC89244h f42133y = C89250i.m154773a((AbstractC89171a) C17629m.f42152a);

    /* renamed from: z */
    private int f42134z;

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$b */
    public interface AbstractC17617b {
        static {
            Covode.recordClassIndex(20167);
        }

        /* renamed from: a */
        void mo28063a(List<? extends AbstractC17641a> list);
    }

    /* renamed from: l */
    private final RecyclerView.AbstractC1371n m32684l() {
        return (RecyclerView.AbstractC1371n) this.f42127s.getValue();
    }

    /* renamed from: b */
    public final C17729b mo28053b() {
        return (C17729b) this.f42129u.getValue();
    }

    /* renamed from: d */
    public final ActivityC0945e mo28055d() {
        return (ActivityC0945e) this.f42131w.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Map<Class<? extends PowerCell<?>>, Object> mo28056e() {
        return (Map) this.f42132x.getValue();
    }

    /* renamed from: f */
    public final CopyOnWriteArrayList<AbstractC17689c> mo28057f() {
        return (CopyOnWriteArrayList) this.f42133y.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C17670b mo28062k() {
        return (C17670b) this.f42109E.getValue();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ PowerCell<? extends AbstractC17641a> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m32681a(this, viewGroup, i);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onLifecycleOwnerDestroy();
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$a */
    public static final class C17616a {
        static {
            Covode.recordClassIndex(20166);
        }

        private C17616a() {
        }

        public /* synthetic */ C17616a(byte b) {
            this();
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f42122m;
    }

    /* renamed from: a */
    public final void mo28052a(boolean z) {
        m32682a(new C17627k(this, z));
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$m */
    static final class C17629m extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArrayList<AbstractC17689c>> {

        /* renamed from: a */
        public static final C17629m f42152a = new C17629m();

        static {
            Covode.recordClassIndex(20179);
        }

        C17629m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArrayList<AbstractC17689c> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$o */
    static final class C17632o extends AbstractC89220m implements AbstractC89171a<C17729b> {

        /* renamed from: a */
        public static final C17632o f42155a = new C17632o();

        static {
            Covode.recordClassIndex(20182);
        }

        C17632o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17729b invoke() {
            return new C17729b();
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$p */
    static final class C17633p extends AbstractC89220m implements AbstractC89171a<Map<Class<? extends PowerCell<?>>, Object>> {

        /* renamed from: a */
        public static final C17633p f42156a = new C17633p();

        static {
            Covode.recordClassIndex(20183);
        }

        C17633p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Class<? extends PowerCell<?>>, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: m */
    private final int m32685m() {
        int i = this.f42134z;
        this.f42134z = i + 1;
        return i;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    private final void onLifecycleOwnerDestroy() {
        this.f42122m.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$l */
    static final class C17628l extends AbstractC89220m implements AbstractC89171a<C17670b> {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42151a;

        static {
            Covode.recordClassIndex(20178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17628l(PowerAdapter powerAdapter) {
            super(0);
            this.f42151a = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17670b invoke() {
            return new C17670b(this.f42151a.f42123n, this.f42151a.f42115f, this.f42151a);
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$n */
    static final class C17630n extends AbstractC89220m implements AbstractC89171a<C17723m> {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42153a;

        static {
            Covode.recordClassIndex(20180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17630n(PowerAdapter powerAdapter) {
            super(0);
            this.f42153a = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17723m invoke() {
            return new C17723m(this.f42153a.f42123n, new AbstractC89172b<Integer, C89391z>(this) {
                /* class com.bytedance.ies.powerlist.PowerAdapter.C17630n.C176311 */

                /* renamed from: a */
                final /* synthetic */ C17630n f42154a;

                static {
                    Covode.recordClassIndex(20181);
                }

                {
                    this.f42154a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Integer num) {
                    int intValue = num.intValue();
                    if (intValue >= 0 && intValue < this.f42154a.f42153a.mo28059h().size()) {
                        RecyclerView.ViewHolder f = this.f42154a.f42153a.f42123n.mo4451f(intValue);
                        if ((f instanceof PowerCell) && f != null) {
                            this.f42154a.f42153a.mo28047a(intValue);
                        }
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: g */
    public final PowerStub mo28058g() {
        PowerStub powerStub = this.f42110a;
        if (powerStub == null) {
            C89219l.m154710a("mainStub");
        }
        return powerStub;
    }

    /* renamed from: i */
    public final void mo28060i() {
        m32682a(new C17624h(this));
    }

    static {
        Covode.recordClassIndex(20165);
    }

    /* renamed from: a */
    public final List<PowerStub> mo28046a() {
        if (!this.f42112c) {
            return this.f42111b;
        }
        PowerStub powerStub = this.f42110a;
        if (powerStub == null) {
            C89219l.m154710a("mainStub");
        }
        return C89070n.m154516a(powerStub);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List h;
        C17693c cVar = this.f42105A;
        if (cVar == null || !cVar.f42322d) {
            h = mo28059h();
        } else {
            h = this.f42116g.f42341b;
        }
        return h.size();
    }

    /* renamed from: j */
    public final AbstractC1204m mo28061j() {
        AbstractC1204m mVar = this.f42120k;
        if (mVar != null || (mVar = mo28054c()) != null || (mVar = mo28055d()) != null) {
            return mVar;
        }
        throw new RuntimeException("Can not find lifecycleOwner !");
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$g */
    static final class C17622g extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42142a;

        static {
            Covode.recordClassIndex(20172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17622g(PowerAdapter powerAdapter) {
            super(0);
            this.f42142a = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            Object obj;
            Iterator a = C89309k.m154794a(this.f42142a.f42123n.getContext(), C176231.f42143a).mo2926a();
            while (true) {
                if (!a.hasNext()) {
                    obj = null;
                    break;
                }
                obj = a.next();
                if (obj instanceof Activity) {
                    break;
                }
            }
            if (!(obj instanceof ActivityC0945e)) {
                return null;
            }
            return obj;
        }
    }

    /* renamed from: c */
    public final Fragment mo28054c() {
        Fragment fragment = this.f42130v;
        if (fragment == null) {
            ActivityC0945e d = mo28055d();
            if (d != null) {
                PowerList powerList = this.f42123n;
                C89219l.m154719c(d, "");
                C89219l.m154719c(powerList, "");
                AbstractC0952i supportFragmentManager = d.getSupportFragmentManager();
                C89219l.m154709a((Object) supportFragmentManager, "");
                List<Fragment> a = C17645a.m32761a(supportFragmentManager);
                int size = a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    fragment = a.get(size);
                    if (C17645a.m32762a(fragment.getView(), powerList)) {
                        break;
                    }
                }
            }
            fragment = null;
            this.f42130v = fragment;
        }
        return fragment;
    }

    /* renamed from: h */
    public final List<AbstractC17641a> mo28059h() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = mo28046a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().f42178j);
        }
        if (this.f42107C != null) {
            AbstractC17714i iVar = this.f42128t.f42224a.f42308b;
            if (iVar.f42365b != EnumC17699e.Refresh ? !(iVar instanceof AbstractC17714i.C17719e) : (iVar instanceof AbstractC17714i.C17715a)) {
                arrayList.add(this.f42128t);
            }
        }
        return arrayList;
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$h */
    public static final class C17624h implements AbstractC17617b {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42144a;

        static {
            Covode.recordClassIndex(20174);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C17624h(PowerAdapter powerAdapter) {
            this.f42144a = powerAdapter;
        }

        @Override // com.bytedance.ies.powerlist.PowerAdapter.AbstractC17617b
        /* renamed from: a */
        public final void mo28063a(List<? extends AbstractC17641a> list) {
            C89219l.m154719c(list, "");
            this.f42144a.f42117h.clear();
            int i = 0;
            for (PowerStub powerStub : this.f42144a.mo28046a()) {
                int d = powerStub.mo28102d() + i;
                this.f42144a.f42117h.put(new C17618c(i, d), powerStub);
                i = d;
            }
            this.f42144a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo28049a(AbstractC17689c cVar) {
        mo28057f().add(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewRecycled(PowerCell<? extends AbstractC17641a> powerCell) {
        PowerCell<? extends AbstractC17641a> powerCell2 = powerCell;
        C89219l.m154719c(powerCell2, "");
        super.onViewRecycled(powerCell2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewAttachedToWindow(PowerCell<? extends AbstractC17641a> powerCell) {
        PowerCell<? extends AbstractC17641a> powerCell2 = powerCell;
        C89219l.m154719c(powerCell2, "");
        super.onViewAttachedToWindow(powerCell2);
        powerCell2.mo28073l();
        this.f42123n.mo4405a(m32684l());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewDetachedFromWindow(PowerCell<? extends AbstractC17641a> powerCell) {
        PowerCell<? extends AbstractC17641a> powerCell2 = powerCell;
        C89219l.m154719c(powerCell2, "");
        super.onViewDetachedFromWindow(powerCell2);
        powerCell2.mo28074m();
        this.f42123n.mo4418b(m32684l());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$j */
    public static final class C17626j extends AbstractC89220m implements AbstractC89172b<C17712h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42148a;

        static {
            Covode.recordClassIndex(20176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17626j(PowerAdapter powerAdapter) {
            super(1);
            this.f42148a = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C17712h hVar) {
            C17712h hVar2 = hVar;
            C89219l.m154719c(hVar2, "");
            Iterator<T> it = this.f42148a.mo28057f().iterator();
            while (it.hasNext()) {
                it.next().mo28146a(hVar2);
            }
            this.f42148a.mo28052a(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final PowerStub m32683b(int i) {
        for (Map.Entry<C17618c, PowerStub> entry : this.f42117h.entrySet()) {
            if (entry.getKey().f42135a <= i && i < entry.getKey().f42136b) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int mo28045a(PowerStub powerStub) {
        if (powerStub == null) {
            return -1;
        }
        int i = 0;
        for (T t : mo28046a()) {
            if (C89219l.m154714a((Object) t, (Object) powerStub)) {
                return i;
            }
            i += t.mo28102d();
        }
        return i;
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$i */
    static final class C17625i extends AbstractC89220m implements AbstractC89172b<PowerStub, Integer> {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42145a;

        /* renamed from: b */
        final /* synthetic */ AbstractC17641a f42146b;

        /* renamed from: c */
        final /* synthetic */ Type f42147c;

        static {
            Covode.recordClassIndex(20175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17625i(PowerAdapter powerAdapter, AbstractC17641a aVar, Type type) {
            super(1);
            this.f42145a = powerAdapter;
            this.f42146b = aVar;
            this.f42147c = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(PowerStub powerStub) {
            int i;
            Integer num;
            int i2;
            PowerStub powerStub2 = powerStub;
            C89219l.m154719c(powerStub2, "");
            AbstractC17641a aVar = this.f42146b;
            if (aVar instanceof C17660a) {
                num = Integer.valueOf(((C17660a) aVar).f42229b);
            } else {
                Map<Type, Integer> map = powerStub2.f42173e;
                if (map != null) {
                    num = map.get(this.f42147c);
                }
                i = -1;
                return Integer.valueOf(i);
            }
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = this.f42145a.f42113d.get(powerStub2);
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                i = intValue + i2;
                return Integer.valueOf(i);
            }
            i = -1;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    private final void m32682a(AbstractC17617b bVar) {
        for (T t : mo28046a()) {
            t.f42178j.clear();
            t.f42178j.addAll(t.f42175g);
            t.f42178j.addAll(t.f42174f);
            t.f42178j.addAll(t.f42176h);
        }
        List<AbstractC17641a> h = mo28059h();
        bVar.mo28063a(h);
        this.f42118i.clear();
        this.f42118i.addAll(h);
        this.f42119j.clear();
        int size = this.f42118i.size();
        for (int i = 0; i < size; i++) {
            this.f42119j.add(Integer.valueOf(this.f42118i.get(i).hashCode()));
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$k */
    public static final class C17627k implements AbstractC17617b {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42149a;

        /* renamed from: b */
        final /* synthetic */ boolean f42150b;

        static {
            Covode.recordClassIndex(20177);
        }

        @Override // com.bytedance.ies.powerlist.PowerAdapter.AbstractC17617b
        /* renamed from: a */
        public final void mo28063a(List<? extends AbstractC17641a> list) {
            ArrayList arrayList;
            ArrayList arrayList2;
            C89219l.m154719c(list, "");
            if (!this.f42150b) {
                this.f42149a.f42117h.clear();
                boolean z = false;
                int i = 0;
                for (PowerStub powerStub : this.f42149a.mo28046a()) {
                    int d = powerStub.mo28102d() + i;
                    this.f42149a.f42117h.put(new C17618c(i, d), powerStub);
                    i = d;
                }
                C17705g gVar = this.f42149a.f42116g;
                List<Integer> list2 = this.f42149a.f42119j;
                List<AbstractC17641a> list3 = this.f42149a.f42118i;
                C89219l.m154719c(list2, "");
                C89219l.m154719c(list3, "");
                C89219l.m154719c(list, "");
                gVar.f42340a++;
                int i2 = gVar.f42340a;
                C17693c i3 = gVar.f42346g.mo143221i();
                if (i3 == null || !i3.f42322d) {
                    arrayList = new ArrayList(list3);
                    arrayList2 = new ArrayList(list2);
                } else {
                    z = true;
                    arrayList = new ArrayList(gVar.f42341b);
                    arrayList2 = new ArrayList(gVar.f42342c);
                }
                ArrayList arrayList3 = new ArrayList(list);
                C17705g.C17711e eVar = new C17705g.C17711e(arrayList, arrayList3, arrayList2);
                Executor executor = (Executor) gVar.f42344e.getValue();
                if (!z || executor == null) {
                    C1445j.C1450d a = C1445j.m4921a(eVar);
                    C89219l.m154709a((Object) a, "");
                    a.mo4952a(gVar.f42345f);
                    return;
                }
                executor.execute(new C17705g.RunnableC17709d(gVar, eVar, i2, arrayList3));
            }
        }

        C17627k(PowerAdapter powerAdapter, boolean z) {
            this.f42149a = powerAdapter;
            this.f42150b = z;
        }
    }

    public PowerAdapter(PowerList powerList) {
        C89219l.m154719c(powerList, "");
        this.f42123n = powerList;
        C88958b<C17693c> a = C88958b.m154214a(new C17693c());
        C89219l.m154709a((Object) a, "");
        this.f42115f = a;
        this.f42116g = new C17705g(this, a);
        this.f42134z = 30000;
        this.f42106B = EnumC17688b.Default;
        this.f42117h = new LinkedHashMap();
        this.f42118i = new ArrayList();
        this.f42119j = new ArrayList();
        this.f42122m = new C1205n(this);
        this.f42109E = C89250i.m154773a((AbstractC89171a) new C17628l(this));
        if (C17648Dr.f42204b) {
            this.f42114e = new C17648Dr.Tracker();
        }
        try {
            Field declaredField = RecyclerView.ViewHolder.class.getDeclaredField("itemView");
            if (declaredField != null) {
                this.f42108D = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        mo28049a(this.f42128t);
        mo28048a(new C17659h());
        C17670b k = mo28062k();
        k.f42262f.getLifecycle().mo4012a(new Optimizer$init$1(k));
        if (!(k.f42260d.getContext() instanceof AbstractC17653c)) {
            k.f42259c = k.f42261e.mo143289d((AbstractC88433f<? super C17693c>) new C17670b.C17671a(k));
        }
    }

    /* renamed from: a */
    public final void mo28047a(int i) {
        PowerStub powerStub;
        if (this.f42126r != null && (powerStub = (PowerStub) C89070n.m154588i((List) mo28046a())) != null) {
            int a = powerStub.mo28096a();
            int b = powerStub.mo28100b();
            PowerPageLoader<?> powerPageLoader = this.f42126r;
            if (powerPageLoader != null) {
                powerPageLoader.mo28157b().post(new PowerPageLoader.RunnableC17678f(powerPageLoader, (i + 0) - a, ((getItemCount() + 0) - a) - b));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        List h;
        C17693c cVar = this.f42105A;
        if (cVar == null || !cVar.f42322d) {
            h = mo28059h();
        } else {
            h = this.f42116g.f42341b;
        }
        AbstractC17641a aVar = (AbstractC17641a) h.get(i);
        Class<?> cls = aVar.getClass();
        C17625i iVar = new C17625i(this, aVar, cls);
        PowerStub b = m32683b(i);
        Integer num = null;
        if (b != null) {
            Object invoke = iVar.invoke(b);
            if (((Number) invoke).intValue() == -1) {
                invoke = null;
            }
            Integer num2 = (Integer) invoke;
            if (num2 != null) {
                return num2.intValue();
            }
        }
        PowerStub g = mo28058g();
        if (g != null) {
            Object invoke2 = iVar.invoke(g);
            if (((Number) invoke2).intValue() != -1) {
                num = invoke2;
            }
            Integer num3 = num;
            if (num3 != null) {
                return num3.intValue();
            }
        }
        Integer num4 = this.f42125q.get(cls);
        if (num4 != null) {
            return num4.intValue();
        }
        throw new RuntimeException("not registerCells for: " + aVar.getClass());
    }

    /* renamed from: a */
    public final void mo28048a(AbstractC17654e eVar) {
        C89219l.m154719c(eVar, "");
        this.f42112c = eVar instanceof C17659h;
        eVar.f42221b = this.f42123n.getContext();
        PowerStub powerStub = new PowerStub(eVar, new C17619d(this, eVar), new C17620e(this, eVar), new C17621f(this));
        int i = 0;
        if (this.f42112c) {
            this.f42110a = powerStub;
        } else {
            List<PowerStub> a = mo28046a();
            if (!(a instanceof Collection) || !a.isEmpty()) {
                Iterator<T> it = a.iterator();
                while (it.hasNext()) {
                    if (C89219l.m154714a(it.next().f42179k.getClass(), eVar.getClass())) {
                        throw new IllegalStateException(("Registered duplicate PowerChunk class : " + eVar.getClass().getName()).toString());
                    }
                }
            }
            this.f42111b.add(powerStub);
        }
        PowerStub powerStub2 = this.f42110a;
        if (powerStub2 == null) {
            C89219l.m154710a("mainStub");
        }
        powerStub.f42170b = powerStub2;
        eVar.f42220a = powerStub;
        if (this.f42121l) {
            powerStub.mo28098a(mo28061j());
        }
        PowerStub powerStub3 = this.f42110a;
        if (powerStub3 == null) {
            C89219l.m154710a("mainStub");
        }
        Integer num = this.f42113d.get(C89070n.m154588i(C89070n.m154572d((Collection) C89070n.m154516a(powerStub3), (Iterable) this.f42111b)));
        if (num != null) {
            i = num.intValue();
        }
        int i2 = i + 100;
        Map<PowerStub, Integer> map = this.f42113d;
        PowerStub powerStub4 = eVar.f42220a;
        if (powerStub4 == null) {
            C89219l.m154707a();
        }
        map.put(powerStub4, Integer.valueOf(i2));
        PowerPageLoader<?> powerPageLoader = this.f42126r;
        if (powerPageLoader != null) {
            powerPageLoader.mo28164f();
        }
        this.f42126r = null;
        this.f42107C = null;
        AbstractC17692b<?> a2 = eVar.mo28123a();
        if (a2 != null) {
            mo28050a(a2, true, eVar.mo28125b());
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$c */
    public static final class C17618c {

        /* renamed from: a */
        public final int f42135a;

        /* renamed from: b */
        public final int f42136b;

        static {
            Covode.recordClassIndex(20168);
        }

        public C17618c(int i, int i2) {
            this.f42135a = i;
            this.f42136b = i2;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3773a(int i, int i2) {
        mo28053b().mo28198a(i, i2);
        notifyItemRangeInserted(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$f */
    public static final class C17621f extends AbstractC89220m implements AbstractC89183m<Boolean, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42141a;

        static {
            Covode.recordClassIndex(20171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17621f(PowerAdapter powerAdapter) {
            super(2);
            this.f42141a = powerAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Boolean bool2) {
            boolean booleanValue = bool.booleanValue();
            if (bool2.booleanValue()) {
                this.f42141a.mo28060i();
            } else {
                this.f42141a.mo28052a(booleanValue);
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: b */
    public final void mo3775b(int i, int i2) {
        mo28053b().mo28199b(i, i2);
        notifyItemRangeRemoved(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$d */
    public static final class C17619d extends AbstractC89220m implements AbstractC89183m<Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42137a;

        /* renamed from: b */
        final /* synthetic */ AbstractC17654e f42138b;

        static {
            Covode.recordClassIndex(20169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17619d(PowerAdapter powerAdapter, AbstractC17654e eVar) {
            super(2);
            this.f42137a = powerAdapter;
            this.f42138b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Integer num2) {
            num.intValue();
            this.f42137a.mo28053b().mo28198a(this.f42137a.mo28045a(this.f42138b.f42220a), num2.intValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerlist.PowerAdapter$e */
    public static final class C17620e extends AbstractC89220m implements AbstractC89183m<Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PowerAdapter f42139a;

        /* renamed from: b */
        final /* synthetic */ AbstractC17654e f42140b;

        static {
            Covode.recordClassIndex(20170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17620e(PowerAdapter powerAdapter, AbstractC17654e eVar) {
            super(2);
            this.f42139a = powerAdapter;
            this.f42140b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Integer num2) {
            num.intValue();
            this.f42139a.mo28053b().mo28199b(this.f42139a.mo28045a(this.f42140b.f42220a), num2.intValue());
            return C89391z.f203057a;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: c */
    public final void mo3776c(int i, int i2) {
        notifyItemMoved(i, i2);
        C17729b b = mo28053b();
        int size = b.mo28197a().size();
        if (i >= 0 && size > i && i2 >= 0 && size > i2 && i != i2) {
            ListVMProxy<?, ?> listVMProxy = b.mo28197a().get(i);
            b.mo28197a().remove(listVMProxy);
            b.mo28197a().add(i2, listVMProxy);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(PowerCell<? extends AbstractC17641a> powerCell, int i) {
        List h;
        AbstractC1196i.EnumC1199b bVar;
        C1205n b;
        PowerCell<? extends AbstractC17641a> powerCell2 = powerCell;
        C89219l.m154719c(powerCell2, "");
        C17648Dr.Tracker tracker = this.f42114e;
        if (tracker != null) {
            tracker.f42209d = SystemClock.uptimeMillis();
            tracker.f42211f++;
        }
        ArrayList<Object> arrayList = f42103F;
        C17693c cVar = this.f42105A;
        if (cVar == null || !cVar.f42322d) {
            h = mo28059h();
        } else {
            h = this.f42116g.f42341b;
        }
        T t = (T) ((AbstractC17641a) h.get(i));
        if (powerCell2 != null) {
            powerCell2.f42162f = m32683b(i);
            C89219l.m154719c(t, "");
            powerCell2.f42160d = t;
            C17729b b2 = mo28053b();
            C89219l.m154719c(powerCell2, "");
            C89219l.m154719c(t, "");
            if (b2.mo28197a().size() > i) {
                if (b2.mo28197a().get(i) == null) {
                    b2.mo28197a().set(i, new ListVMProxy<>(powerCell2.mo23353f()));
                }
                ListVMProxy<PowerCell<T>, T> listVMProxy = powerCell2.f42165i;
                if (listVMProxy != null) {
                    listVMProxy.mo28195c();
                }
                ListVMProxy<?, ?> listVMProxy2 = b2.mo28197a().get(i);
                if (listVMProxy2 != null) {
                    ListVMProxy<?, ?> listVMProxy3 = listVMProxy2;
                    if (listVMProxy3 != null) {
                        C17729b.C17730a aVar = new C17729b.C17730a(b2, listVMProxy3);
                        C17729b.C17731b bVar2 = new C17729b.C17731b(b2, listVMProxy3);
                        C89219l.m154719c(powerCell2, "");
                        C89219l.m154719c(t, "");
                        C89219l.m154719c(aVar, "");
                        C89219l.m154719c(bVar2, "");
                        listVMProxy3.mo28195c();
                        powerCell2.mo28066a((AbstractC22873a) listVMProxy3);
                        listVMProxy3.f42387b = powerCell2;
                        AbstractC1196i a = listVMProxy3.mo28191a();
                        if (a != null && (!listVMProxy3.f42386a)) {
                            a.mo4012a(listVMProxy3);
                            listVMProxy3.f42386a = true;
                        }
                        AbstractC22874b<R, ITEM> bVar3 = listVMProxy3.f42388c;
                        if (bVar3 != null) {
                            bVar3.mo23355a(i, powerCell2, t, arrayList, aVar, bVar2);
                        }
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            ListVMProxy<PowerCell<T>, T> listVMProxy4 = powerCell2.f42165i;
            if (listVMProxy4 == null || (b = listVMProxy4.getLifecycle()) == null || (bVar = b.mo4011a()) == null) {
                bVar = AbstractC1196i.EnumC1199b.INITIALIZED;
            }
            C89219l.m154709a((Object) bVar, "");
            if (powerCell2.getLifecycle().mo4011a().compareTo((Enum) bVar) < 0 && bVar == AbstractC1196i.EnumC1199b.RESUMED) {
                powerCell2.mo28075n();
                powerCell2.f42163g = true;
            }
            powerCell2.mo28078p();
            powerCell2.mo28075n();
            powerCell2.mo28076o();
            if (t != null) {
                if (arrayList == null || arrayList.isEmpty()) {
                    powerCell2.mo23350a((Object) t);
                } else {
                    powerCell2.mo28065a(t, arrayList);
                }
            }
            mo28047a(i);
            C17648Dr.Tracker tracker2 = this.f42114e;
            if (tracker2 != null) {
                tracker2.f42210e = (long) ((((float) ((tracker2.f42210e * ((long) (tracker2.f42211f - 1))) + (SystemClock.uptimeMillis() - tracker2.f42209d))) * 1.0f) / ((float) tracker2.f42211f));
                return;
            }
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    public final void mo28051a(C17693c cVar, EnumC17688b bVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(bVar, "");
        if (bVar.ordinal() >= this.f42106B.ordinal()) {
            this.f42106B = bVar;
            this.f42105A = cVar;
            if (cVar.f42321c != null) {
                int m = m32685m();
                this.f42125q.put(C17657a.class, Integer.valueOf(m));
                Map<Integer, Class<? extends PowerCell<?>>> map = this.f42124p;
                Integer valueOf = Integer.valueOf(m);
                Class<? extends PowerLoadingCell> cls = cVar.f42321c;
                if (cls != null) {
                    map.put(valueOf, cls);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                Integer remove = this.f42125q.remove(C17657a.class);
                Map<Integer, Class<? extends PowerCell<?>>> map2 = this.f42124p;
                if (map2 != null) {
                    C89206ad.m154686h(map2).remove(remove);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            this.f42107C = cVar.f42321c;
            this.f42115f.onNext(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3774a(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m32681a(PowerAdapter powerAdapter, ViewGroup viewGroup, int i) {
        int i2;
        MethodCollector.m26663i(5415);
        C89219l.m154719c(viewGroup, "");
        C17648Dr.Tracker tracker = powerAdapter.f42114e;
        boolean z = true;
        if (tracker != null) {
            tracker.f42207b = SystemClock.uptimeMillis();
            tracker.f42212g++;
            if (C89219l.m154714a(Thread.currentThread(), tracker.f42206a.getValue())) {
                tracker.f42213h++;
            }
        }
        Class<? extends PowerCell<?>> cls = powerAdapter.f42124p.get(Integer.valueOf(i));
        if (cls == null) {
            PowerStub powerStub = powerAdapter.f42110a;
            if (powerStub == null) {
                C89219l.m154710a("mainStub");
            }
            for (PowerStub powerStub2 : C89070n.m154572d((Collection) C89070n.m154516a(powerStub), (Iterable) powerAdapter.f42111b)) {
                Map<Integer, Class<? extends PowerCell<?>>> map = powerStub2.f42172d;
                Integer num = powerAdapter.f42113d.get(powerStub2);
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                Class<? extends PowerCell<?>> cls2 = map.get(Integer.valueOf(i - i2));
                if (cls2 != null) {
                    cls = cls2;
                }
            }
            if (cls == null) {
                RuntimeException runtimeException = new RuntimeException("onCreateViewHolder itemToType error!!");
                MethodCollector.m26664o(5415);
                throw runtimeException;
            }
        }
        PowerCell powerCell = (PowerCell) cls.newInstance();
        powerCell.f42159c = powerAdapter.mo28061j();
        powerCell.f42161e = powerAdapter;
        View a = powerCell.mo23349a(viewGroup);
        Field field = powerAdapter.f42108D;
        if (field != null) {
            field.set(powerCell, a);
        }
        powerCell.mo28072k();
        Object obj = powerAdapter.mo28056e().get(cls);
        if (obj != null) {
            powerCell.mo28067a(obj);
        }
        C17648Dr.Tracker tracker2 = powerAdapter.f42114e;
        if (tracker2 != null) {
            tracker2.f42208c = (long) ((((float) ((tracker2.f42208c * ((long) (tracker2.f42212g - 1))) + (SystemClock.uptimeMillis() - tracker2.f42207b))) * 1.0f) / ((float) tracker2.f42212g));
        }
        C89219l.m154709a((Object) powerCell, "");
        try {
            if (powerCell.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(powerCell.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) powerCell.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(powerCell.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = powerCell.getClass().getName();
        MethodCollector.m26664o(5415);
        return powerCell;
    }

    /* renamed from: a */
    public final void mo28050a(AbstractC17692b<?> bVar, boolean z, C17656f<AbstractC17641a> fVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(fVar, "");
        if (!this.f42112c ? !z : z) {
            throw new IllegalStateException("chunk cannot use PowerList.load!".toString());
        }
        PowerPageLoader<?> powerPageLoader = this.f42126r;
        if (powerPageLoader != null) {
            powerPageLoader.mo28164f();
        }
        this.f42126r = new PowerPageLoader<>(bVar, this.f42115f, this, fVar, new C17626j(this));
        mo28051a(bVar.f42318b, EnumC17688b.PageConfig);
        this.f42128t.f42225b = this.f42126r;
        PowerPageLoader<?> powerPageLoader2 = this.f42126r;
        if (powerPageLoader2 != null) {
            powerPageLoader2.mo28161d();
        }
    }
}
