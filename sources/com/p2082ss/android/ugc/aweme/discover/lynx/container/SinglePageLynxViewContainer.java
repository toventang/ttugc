package com.p2082ss.android.ugc.aweme.discover.lynx.container;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42224d;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2781c.AbstractC42199a;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.SinglePageLynxViewContainer */
public final class SinglePageLynxViewContainer extends FrameLayout implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private C42200a f98359a;

    /* renamed from: b */
    private SparseArray f98360b;

    static {
        Covode.recordClassIndex(50139);
    }

    /* renamed from: a */
    private View m84463a() {
        if (this.f98360b == null) {
            this.f98360b = new SparseArray();
        }
        View view = (View) this.f98360b.get(R.id.dgl);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.dgl);
        this.f98360b.put(R.id.dgl, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(147, new RunnableC90250g(SinglePageLynxViewContainer.class, "onJsBroadcastReceiver", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.SinglePageLynxViewContainer$a */
    public static final class C42200a extends RecyclerView.AbstractC1350a<View$OnAttachStateChangeListenerC42258a> implements AbstractC42199a {

        /* renamed from: a */
        public String f98361a;

        /* renamed from: b */
        public C42345d f98362b;

        /* renamed from: c */
        public Map<String, String> f98363c;

        static {
            Covode.recordClassIndex(50140);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ View$OnAttachStateChangeListenerC42258a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m84465a(viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            if (this.f98362b == null) {
                return 0;
            }
            return 1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onViewRecycled(View$OnAttachStateChangeListenerC42258a aVar) {
            View$OnAttachStateChangeListenerC42258a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            super.onViewRecycled(aVar2);
            aVar2.mo71445C();
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.lynx.p2781c.AbstractC42199a
        /* renamed from: a */
        public final void mo71393a(int i, C42186b bVar) {
            C89219l.m154721d(bVar, "");
            this.f98361a = bVar.f98321c;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(View$OnAttachStateChangeListenerC42258a aVar, int i) {
            View$OnAttachStateChangeListenerC42258a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo71448a(this);
            aVar2.mo71452g();
            C42224d e = aVar2.mo71451e();
            if (e != null) {
                e.f98388b.f98330l = true;
            }
            C42345d dVar = this.f98362b;
            if (dVar == null) {
                C89219l.m154715b();
            }
            View$OnAttachStateChangeListenerC42258a.m84565a(aVar2, dVar, this.f98363c, 26);
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m84465a(ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(7706);
            C89219l.m154721d(viewGroup, "");
            View$OnAttachStateChangeListenerC42258a a2 = View$OnAttachStateChangeListenerC42258a.C42259a.m84600a(viewGroup, null);
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
            MethodCollector.m26664o(7706);
            return a2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C80298cg.m139205b(this);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadcastReceiver(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (C89219l.m154714a((Object) jVar.f111077b.optString("eventName"), (Object) "close_search_single_page_view")) {
            String optString = jVar.f111077b.optString("reactId");
            C42200a aVar = this.f98359a;
            if (aVar == null) {
                C89219l.m154710a("dynamicViewAdapter");
            }
            if (C89219l.m154714a((Object) aVar.f98361a, (Object) optString)) {
                mo71394a(null, null);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SinglePageLynxViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public final void mo71394a(C42345d dVar, Map<String, String> map) {
        if (dVar == null) {
            if (m84463a() != null) {
                C42200a aVar = this.f98359a;
                if (aVar == null) {
                    C89219l.m154710a("dynamicViewAdapter");
                }
                aVar.f98362b = null;
                C42200a aVar2 = this.f98359a;
                if (aVar2 == null) {
                    C89219l.m154710a("dynamicViewAdapter");
                }
                aVar2.f98363c = null;
                C42200a aVar3 = this.f98359a;
                if (aVar3 == null) {
                    C89219l.m154710a("dynamicViewAdapter");
                }
                aVar3.notifyDataSetChanged();
            }
            setVisibility(8);
            C80298cg.m139205b(this);
            return;
        }
        if (m84463a() == null) {
            C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.au0, this, true);
            RecyclerView recyclerView = (RecyclerView) m84463a();
            C89219l.m154716b(recyclerView, "");
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            this.f98359a = new C42200a();
            RecyclerView recyclerView2 = (RecyclerView) m84463a();
            C89219l.m154716b(recyclerView2, "");
            C42200a aVar4 = this.f98359a;
            if (aVar4 == null) {
                C89219l.m154710a("dynamicViewAdapter");
            }
            recyclerView2.setAdapter(aVar4);
        }
        C42200a aVar5 = this.f98359a;
        if (aVar5 == null) {
            C89219l.m154710a("dynamicViewAdapter");
        }
        aVar5.f98362b = dVar;
        C42200a aVar6 = this.f98359a;
        if (aVar6 == null) {
            C89219l.m154710a("dynamicViewAdapter");
        }
        aVar6.f98363c = map;
        C42200a aVar7 = this.f98359a;
        if (aVar7 == null) {
            C89219l.m154710a("dynamicViewAdapter");
        }
        aVar7.notifyDataSetChanged();
        setVisibility(0);
        C80298cg.m139204a(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SinglePageLynxViewContainer(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8697);
        MethodCollector.m26664o(8697);
    }
}
