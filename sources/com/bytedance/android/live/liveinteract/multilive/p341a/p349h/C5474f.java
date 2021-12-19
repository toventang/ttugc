package com.bytedance.android.live.liveinteract.multilive.p341a.p349h;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p355f.C5532h;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5595h;
import com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5698a;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7664c;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.f */
public final class C5474f {

    /* renamed from: a */
    public ViewGroup f14044a;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: b */
    public C5271a f14045b;

    /* renamed from: c */
    public AbstractC5622b f14046c;

    /* renamed from: d */
    public C5698a f14047d;

    /* renamed from: e */
    public boolean f14048e = true;

    /* renamed from: f */
    public final DataChannel f14049f;

    /* renamed from: g */
    private final AbstractC89244h f14050g = C89250i.m154773a((AbstractC89171a) C5476b.f14052a);

    static {
        Covode.recordClassIndex(6069);
    }

    /* renamed from: c */
    private final List<View> m11990c() {
        return (List) this.f14050g.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.f$b */
    static final class C5476b extends AbstractC89220m implements AbstractC89171a<ArrayList<View>> {

        /* renamed from: a */
        public static final C5476b f14052a = new C5476b();

        static {
            Covode.recordClassIndex(6071);
        }

        C5476b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayList<View> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final C5271a mo11286a() {
        C5271a aVar = this.f14045b;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        return aVar;
    }

    /* renamed from: b */
    public final EnumC4422k mo11291b() {
        EnumC4422k c;
        AbstractC5622b bVar = this.f14046c;
        if (bVar == null || (c = bVar.mo11262c()) == null) {
            return EnumC4422k.NORMAL;
        }
        return c;
    }

    public C5474f(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f14049f = dataChannel;
        C4431e.f12034a.mo10201a(this);
    }

    /* renamed from: a */
    public static void m11989a(C5235a aVar) {
        aVar.setPosInMultiLive((int) C6898g.C6899a.f17285a.mo13202c(C6898g.C6899a.f17285a.mo13195a(aVar.getInteractId())));
    }

    /* renamed from: a */
    public final void mo11287a(View view) {
        C89219l.m154721d(view, "");
        AbstractC5622b bVar = this.f14046c;
        if (bVar != null) {
            bVar.mo11274a(view);
            m11990c().remove(view);
        }
    }

    /* renamed from: a */
    public final void mo11289a(boolean z) {
        AbstractC5622b bVar = this.f14046c;
        if (bVar instanceof AbstractC5449a) {
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.window.BaseGuestLayout");
            ((AbstractC5449a) bVar).mo11257a(z);
        }
    }

    /* renamed from: a */
    public final boolean mo11290a(EnumC4422k kVar) {
        EnumC4422k kVar2;
        AbstractC5622b bVar;
        AbstractC5622b bVar2;
        MethodCollector.m26663i(5099);
        C89219l.m154721d(kVar, "");
        AbstractC5622b bVar3 = this.f14046c;
        if (bVar3 != null) {
            kVar2 = bVar3.mo11262c();
        } else {
            kVar2 = null;
        }
        if (kVar2 == kVar) {
            C5271a aVar = this.f14045b;
            if (aVar == null) {
                C89219l.m154710a("mDataHolder");
            }
            aVar.mo11109a(kVar);
            MethodCollector.m26664o(5099);
            return false;
        }
        for (T t : m11990c()) {
            if (t instanceof C5235a) {
                t.setAdjustParent(true);
            }
        }
        AbstractC5622b bVar4 = this.f14046c;
        if (bVar4 != null) {
            ViewGroup viewGroup = this.f14044a;
            if (viewGroup == null) {
                C89219l.m154710a("mContentView");
            }
            bVar4.mo11391b(viewGroup);
        }
        int i = C5478g.f14054a[kVar.ordinal()];
        if (i == 1) {
            bVar = new C5459c(this.f14049f);
        } else if (i == 2) {
            bVar = new C5451b(this.f14049f);
        } else if (i == 3) {
            bVar = new C5470e(this.f14049f);
        } else if (i == 4) {
            bVar = new C5463d(this.f14049f);
        } else if (i != 5) {
            MethodCollector.m26664o(5099);
            return false;
        } else {
            bVar = new C5532h(this.f14049f);
        }
        this.f14046c = bVar;
        ViewGroup viewGroup2 = this.f14044a;
        if (viewGroup2 == null) {
            C89219l.m154710a("mContentView");
        }
        bVar.mo11256a(viewGroup2);
        AbstractC5622b bVar5 = this.f14046c;
        if (bVar5 != null) {
            bVar5.mo11258b(this.f14048e);
        }
        if (m11990c().size() > 1) {
            List<View> c = m11990c();
            if (c.size() > 1) {
                C89070n.m154530a((List) c, (Comparator) new C5475a(this));
            }
        } else if (m11990c().size() == 1) {
            View view = m11990c().get(0);
            if (view instanceof C5235a) {
                m11989a((C5235a) view);
            }
        }
        for (T t2 : m11990c()) {
            int i2 = -1;
            boolean z = t2 instanceof C5235a;
            if (z) {
                T t3 = t2;
                i2 = t3.getPosInMultiLive();
                t3.setAdjustParent(true);
            }
            ViewParent parent = t2.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(t2);
            }
            AbstractC5622b bVar6 = this.f14046c;
            if (bVar6 != null) {
                bVar6.mo11260a(t2, i2);
            }
            if (z) {
                t2.setAdjustParent(false);
            }
        }
        if (m11990c().isEmpty() && (bVar2 = this.f14046c) != null) {
            bVar2.mo11396o();
        }
        C5271a aVar2 = this.f14045b;
        if (aVar2 == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar2.mo11109a(kVar);
        this.f14049f.mo28319c(C5595h.class);
        MethodCollector.m26664o(5099);
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.f$a */
    public static final class C5475a<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ C5474f f14051a;

        static {
            Covode.recordClassIndex(6070);
        }

        public C5475a(C5474f fVar) {
            this.f14051a = fVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i;
            T t3 = t;
            int i2 = -1;
            if (t3 instanceof C5235a) {
                T t4 = t3;
                C5474f.m11989a((C5235a) t4);
                i = t4.getPosInMultiLive();
            } else {
                i = -1;
            }
            Integer valueOf = Integer.valueOf(i);
            T t5 = t2;
            if (t5 instanceof C5235a) {
                T t6 = t5;
                C5474f.m11989a((C5235a) t6);
                i2 = t6.getPosInMultiLive();
            }
            return C89090a.m154604a(valueOf, Integer.valueOf(i2));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.f$c */
    public static final class C5477c<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ C5474f f14053a;

        static {
            Covode.recordClassIndex(6072);
        }

        public C5477c(C5474f fVar) {
            this.f14053a = fVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i;
            String str;
            String str2;
            T t3 = t;
            List<C7664c> list = this.f14053a.mo11286a().f13643n;
            int i2 = 0;
            if (list != null) {
                Iterator<C7664c> it = list.iterator();
                i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C7664c next = it.next();
                    if (t3 instanceof C5235a) {
                        str2 = t3.getInteractId();
                    } else {
                        str2 = "";
                    }
                    if (C89219l.m154714a((Object) next.f18995g, (Object) str2)) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            int i3 = Integer.MAX_VALUE;
            if (i == -1) {
                i = Integer.MAX_VALUE;
            }
            Integer valueOf = Integer.valueOf(i);
            T t4 = t2;
            List<C7664c> list2 = this.f14053a.mo11286a().f13643n;
            if (list2 != null) {
                Iterator<C7664c> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C7664c next2 = it2.next();
                    if (t4 instanceof C5235a) {
                        str = t4.getInteractId();
                    } else {
                        str = "";
                    }
                    if (!C89219l.m154714a((Object) next2.f18995g, (Object) str)) {
                        i2++;
                    } else if (i2 != -1) {
                        i3 = i2;
                    }
                }
            }
            return C89090a.m154604a(valueOf, Integer.valueOf(i3));
        }
    }

    /* renamed from: a */
    public final void mo11288a(View view, int i) {
        MethodCollector.m26663i(5146);
        C89219l.m154721d(view, "");
        AbstractC5622b bVar = this.f14046c;
        if (bVar == null || (bVar instanceof C5532h)) {
            C5271a aVar = this.f14045b;
            if (aVar == null) {
                C89219l.m154710a("mDataHolder");
            }
            mo11290a(aVar.f13646q);
        }
        AbstractC5622b bVar2 = this.f14046c;
        if (bVar2 != null) {
            bVar2.mo11260a(view, i);
            m11990c().add(view);
        }
        if (!this.f14048e && m11990c().size() > 1) {
            AbstractC5622b bVar3 = this.f14046c;
            if (bVar3 == null) {
                MethodCollector.m26664o(5146);
                return;
            } else if (bVar3.mo11263d()) {
                MethodCollector.m26664o(5146);
                return;
            } else {
                ArrayList arrayList = new ArrayList(m11990c());
                if (m11990c().size() > 1) {
                    List<View> c = m11990c();
                    if (c.size() > 1) {
                        C89070n.m154530a((List) c, (Comparator) new C5477c(this));
                    }
                }
                boolean z = false;
                int i2 = 0;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    if (!C89219l.m154714a(obj, m11990c().get(i2))) {
                        z = true;
                    }
                    i2 = i3;
                }
                if (z) {
                    int i4 = 0;
                    for (T t : m11990c()) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            C89070n.m154520a();
                        }
                        T t2 = t;
                        if (t2 instanceof C5235a) {
                            T t3 = t2;
                            t3.setAdjustParent(true);
                            t3.setPosInMultiLive(i5);
                        }
                        ViewParent parent = t2.getParent();
                        if (parent != null) {
                            ((ViewGroup) parent).removeView(t2);
                        }
                        i4 = i5;
                    }
                    int i6 = 0;
                    for (T t4 : m11990c()) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            C89070n.m154520a();
                        }
                        T t5 = t4;
                        AbstractC5622b bVar4 = this.f14046c;
                        if (bVar4 != null) {
                            bVar4.mo11260a(t5, i7);
                        }
                        if (t5 instanceof C5235a) {
                            t5.setAdjustParent(false);
                        }
                        i6 = i7;
                    }
                }
            }
        }
        MethodCollector.m26664o(5146);
    }
}
