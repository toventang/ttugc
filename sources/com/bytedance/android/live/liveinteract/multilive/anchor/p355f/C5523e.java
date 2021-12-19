package com.bytedance.android.live.liveinteract.multilive.anchor.p355f;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4432f;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5589b;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5603p;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5604q;
import com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a;
import com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC4432f(mo10206a = "LAYOUT_MANAGER")
/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.e */
public final class C5523e {

    /* renamed from: a */
    public ViewGroup f14105a;

    /* renamed from: b */
    public AbstractC5622b f14106b;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: c */
    public C5271a f14107c;

    /* renamed from: d */
    public final DataChannel f14108d;

    /* renamed from: e */
    private final AbstractC89244h f14109e = C89250i.m154773a((AbstractC89171a) C5525a.f14111a);

    static {
        Covode.recordClassIndex(6118);
    }

    /* renamed from: a */
    public final List<View> mo11310a() {
        return (List) this.f14109e.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.e$a */
    static final class C5525a extends AbstractC89220m implements AbstractC89171a<ArrayList<View>> {

        /* renamed from: a */
        public static final C5525a f14111a = new C5525a();

        static {
            Covode.recordClassIndex(6120);
        }

        C5525a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayList<View> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: b */
    public final EnumC4422k mo11313b() {
        EnumC4422k c;
        AbstractC5622b bVar = this.f14106b;
        if (bVar == null || (c = bVar.mo11262c()) == null) {
            return EnumC4422k.NORMAL;
        }
        return c;
    }

    /* renamed from: a */
    public final void mo11311a(View view) {
        C89219l.m154721d(view, "");
        AbstractC5622b bVar = this.f14106b;
        if (bVar != null) {
            bVar.mo11274a(view);
        }
        mo11310a().remove(view);
    }

    public C5523e(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f14108d = dataChannel;
        C4431e.f12034a.mo10201a(this);
        dataChannel.mo28312a(this, C5604q.class, new AbstractC89172b<C5603p, C89391z>(this) {
            /* class com.bytedance.android.live.liveinteract.multilive.anchor.p355f.C5523e.C55241 */

            /* renamed from: a */
            final /* synthetic */ C5523e f14110a;

            static {
                Covode.recordClassIndex(6119);
            }

            {
                this.f14110a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C5603p pVar) {
                C5603p pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                this.f14110a.mo11312a(pVar2.f14246a);
                return C89391z.f203057a;
            }
        });
        C4431e.f12034a.mo10198a(this, null);
    }

    /* renamed from: a */
    public final void mo11312a(EnumC4422k kVar) {
        EnumC4422k kVar2;
        AbstractC5612a aVar;
        AbstractC5622b bVar;
        int i;
        MethodCollector.m26663i(8152);
        C89219l.m154721d(kVar, "");
        AbstractC5622b bVar2 = this.f14106b;
        if (bVar2 != null) {
            bVar2.mo11394l();
        }
        AbstractC5622b bVar3 = this.f14106b;
        if (bVar3 != null) {
            kVar2 = bVar3.mo11262c();
        } else {
            kVar2 = null;
        }
        if (kVar2 == kVar) {
            C5271a aVar2 = this.f14107c;
            if (aVar2 == null) {
                C89219l.m154710a("mDataHolder");
            }
            aVar2.mo11109a(kVar);
            MethodCollector.m26664o(8152);
            return;
        }
        for (T t : mo11310a()) {
            if (t instanceof C5235a) {
                t.setAdjustParent(true);
            }
        }
        AbstractC5622b bVar4 = this.f14106b;
        if (bVar4 != null) {
            ViewGroup viewGroup = this.f14105a;
            if (viewGroup == null) {
                C89219l.m154710a("mContentView");
            }
            bVar4.mo11391b(viewGroup);
        }
        int i2 = C5526f.f14112a[kVar.ordinal()];
        if (i2 == 1) {
            aVar = new C5520b(this.f14108d);
        } else if (i2 == 2) {
            aVar = new C5518a(this.f14108d);
        } else if (i2 == 3) {
            aVar = new C5522d(this.f14108d);
        } else if (i2 == 4) {
            aVar = new C5521c(this.f14108d);
        } else if (i2 != 5) {
            MethodCollector.m26664o(8152);
            return;
        } else {
            aVar = new C5532h(this.f14108d);
        }
        ViewGroup viewGroup2 = this.f14105a;
        if (viewGroup2 == null) {
            C89219l.m154710a("mContentView");
        }
        aVar.mo11256a(viewGroup2);
        for (T t2 : mo11310a()) {
            ViewParent parent = t2.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(t2);
            }
            boolean z = t2 instanceof C5235a;
            if (z) {
                i = C6898g.C6899a.f17285a.mo13200b(t2.getInteractId());
            } else {
                i = 0;
            }
            int a = aVar.mo11260a(t2, i);
            if (z) {
                t2.setPosInMultiLive(a);
                t2.setAdjustParent(false);
            }
        }
        this.f14106b = aVar;
        if (mo11310a().isEmpty() && (bVar = this.f14106b) != null) {
            bVar.mo11396o();
        }
        C5271a aVar3 = this.f14107c;
        if (aVar3 == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar3.mo11109a(kVar);
        this.f14108d.mo28320c(C5589b.class, kVar);
        MethodCollector.m26664o(8152);
    }
}
