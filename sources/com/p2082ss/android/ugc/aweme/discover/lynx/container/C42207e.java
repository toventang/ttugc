package com.p2082ss.android.ugc.aweme.discover.lynx.container;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42224d;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67562n;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.e */
public final class C42207e extends FrameLayout implements AbstractC42208f {

    /* renamed from: a */
    public RecyclerView f98377a;

    /* renamed from: b */
    public C42203c f98378b;

    static {
        Covode.recordClassIndex(50147);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    public final View getRealView() {
        return this;
    }

    public final C42203c getContainerAdapter() {
        C42203c cVar = this.f98378b;
        if (cVar == null) {
            C89219l.m154710a("dynamicViewAdapter");
        }
        return cVar;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f98377a;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        return recyclerView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C42207e(Context context) {
        this(context, (byte) 0);
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: b */
    public final void mo71406b(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: a */
    public final void mo71402a(C42345d dVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: a */
    public final void mo71405a(List<C42201a> list) {
        C89219l.m154721d(list, "");
        if (this.f98378b != null) {
            C42203c cVar = this.f98378b;
            if (cVar == null) {
                C89219l.m154710a("dynamicViewAdapter");
            }
            cVar.mo62377b_(list);
        }
    }

    /* renamed from: a */
    public final void mo71401a(TemplateData templateData) {
        C89219l.m154721d(templateData, "");
        C42203c cVar = this.f98378b;
        if (cVar == null) {
            C89219l.m154710a("dynamicViewAdapter");
            return;
        }
        C89219l.m154721d(templateData, "");
        RecyclerView.ViewHolder a = cVar.f98371d.mo4392a(0, false);
        if (a != null && (a instanceof View$OnAttachStateChangeListenerC42258a)) {
            View$OnAttachStateChangeListenerC42258a aVar = (View$OnAttachStateChangeListenerC42258a) a;
            if (aVar.mo71446D()) {
                C89219l.m154721d(templateData, "");
                C42224d e = aVar.mo71451e();
                if (e != null) {
                    LynxView lynxView = e.f98388b.f98322d;
                    if (lynxView != null) {
                        lynxView.updateData(templateData);
                    }
                    if (C89219l.m154714a((Object) "guessSearchDataProcess", (Object) templateData.f66712b)) {
                        C67562n.C67563a.m119642a(1);
                        C67562n.C67563a.m119643a("lynx");
                        return;
                    }
                    return;
                }
                return;
            }
        }
        List<Object> list = cVar.f98369b.get(0);
        if (list == null) {
            list = new ArrayList<>();
        }
        Map<Integer, List<Object>> map = cVar.f98369b;
        list.add(templateData);
        map.put(0, list);
    }

    /* renamed from: a */
    public final void mo71403a(String str) {
        LynxView lynxView;
        C89219l.m154721d(str, "");
        C42203c cVar = this.f98378b;
        if (cVar == null) {
            C89219l.m154710a("dynamicViewAdapter");
            return;
        }
        C89219l.m154721d(str, "");
        RecyclerView.ViewHolder a = cVar.f98371d.mo4392a(0, false);
        if (a != null && (a instanceof View$OnAttachStateChangeListenerC42258a)) {
            View$OnAttachStateChangeListenerC42258a aVar = (View$OnAttachStateChangeListenerC42258a) a;
            if (aVar.mo71446D()) {
                C89219l.m154721d(str, "");
                C42224d e = aVar.mo71451e();
                if (e != null && (lynxView = e.f98388b.f98322d) != null) {
                    lynxView.updateData(str);
                    return;
                }
                return;
            }
        }
        List<Object> list = cVar.f98369b.get(0);
        if (list == null) {
            list = new ArrayList<>();
        }
        Map<Integer, List<Object>> map = cVar.f98369b;
        list.add(str);
        map.put(0, list);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: a */
    public final void mo71400a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(layoutParams, "");
        AbstractC42208f.C42209a.m84487a(this, viewGroup, 0, layoutParams);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C42207e(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C42207e(Context context, char c) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8155);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.au0, this, true);
        View findViewById = findViewById(R.id.dgl);
        C89219l.m154716b(findViewById, "");
        this.f98377a = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f98377a;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        this.f98378b = new C42203c(recyclerView);
        RecyclerView recyclerView2 = this.f98377a;
        if (recyclerView2 == null) {
            C89219l.m154710a("recyclerView");
        } else {
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView3 = this.f98377a;
        if (recyclerView3 == null) {
            C89219l.m154710a("recyclerView");
        }
        C42203c cVar = this.f98378b;
        if (cVar == null) {
            C89219l.m154710a("dynamicViewAdapter");
        }
        recyclerView3.setAdapter(cVar);
        MethodCollector.m26664o(8155);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[LOOP:0: B:8:0x0028->B:21:0x0059, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0011 A[SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71404a(java.lang.String r11, org.json.JSONObject r12) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.lynx.container.C42207e.mo71404a(java.lang.String, org.json.JSONObject):void");
    }
}
