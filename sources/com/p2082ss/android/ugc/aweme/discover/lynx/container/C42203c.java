package com.p2082ss.android.ugc.aweme.discover.lynx.container;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2781c.AbstractC42199a;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.AbstractC42367a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.c */
public final class C42203c extends AbstractC39060f<C42201a> implements AbstractC42199a {

    /* renamed from: a */
    public Map<Integer, List<C89378p<String, JSONObject>>> f98368a = new LinkedHashMap();

    /* renamed from: b */
    public final Map<Integer, List<Object>> f98369b = new LinkedHashMap();

    /* renamed from: c */
    public Object f98370c;

    /* renamed from: d */
    public final RecyclerView f98371d;

    static {
        Covode.recordClassIndex(50143);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        Object obj = this.f92236l.get(i);
        C89219l.m154716b(obj, "");
        return ((C42201a) obj).f98364a;
    }

    public C42203c(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f98371d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof AbstractC42367a) {
            ((AbstractC42367a) viewHolder).mo71445C();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.c$a */
    public static final class C42204a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f98372a;

        static {
            Covode.recordClassIndex(50144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42204a(ViewGroup viewGroup, View view) {
            super(view);
            this.f98372a = viewGroup;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        MethodCollector.m26663i(7845);
        C89219l.m154721d(viewGroup, "");
        if (i == C42202b.f98366a) {
            View$OnAttachStateChangeListenerC42258a a = View$OnAttachStateChangeListenerC42258a.C42259a.m84600a(viewGroup, null);
            MethodCollector.m26664o(7845);
            return a;
        }
        C42204a aVar = new C42204a(viewGroup, new View(viewGroup.getContext()));
        MethodCollector.m26664o(7845);
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.p2781c.AbstractC42199a
    /* renamed from: a */
    public final void mo71393a(int i, C42186b bVar) {
        List<Object> remove;
        C89219l.m154721d(bVar, "");
        List<C89378p<String, JSONObject>> remove2 = this.f98368a.remove(Integer.valueOf(i));
        if (remove2 != null) {
            for (T t : remove2) {
                bVar.mo71386a((String) t.getFirst(), (JSONObject) t.getSecond());
            }
        }
        LynxView lynxView = bVar.f98322d;
        if (!(lynxView == null || (remove = this.f98369b.remove(Integer.valueOf(i))) == null)) {
            for (T t2 : remove) {
                if (t2 instanceof TemplateData) {
                    lynxView.updateData((TemplateData) t2);
                } else if (t2 instanceof String) {
                    lynxView.updateData((String) t2);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof View$OnAttachStateChangeListenerC42258a) {
            ((View$OnAttachStateChangeListenerC42258a) viewHolder).mo71447a().f98333o = this.f98370c;
            ((View$OnAttachStateChangeListenerC42258a) viewHolder).mo71448a(this);
            ((View$OnAttachStateChangeListenerC42258a) viewHolder).mo71452g();
            C42345d dVar = ((C42201a) this.f92236l.get(i)).f98365b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rank", Integer.valueOf(i));
            View$OnAttachStateChangeListenerC42258a.m84565a((View$OnAttachStateChangeListenerC42258a) viewHolder, dVar, linkedHashMap, 26);
        }
    }
}
