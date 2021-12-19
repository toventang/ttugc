package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42534b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.c */
public final class C41711c extends AbstractC39058d implements AbstractC35500d, AbstractC42534b {

    /* renamed from: k */
    public static final C41712a f97312k = new C41712a((byte) 0);

    /* renamed from: d */
    public AbstractC41715c f97313d;

    /* renamed from: e */
    public TrendingTopic f97314e;

    /* renamed from: f */
    public int f97315f;

    /* renamed from: g */
    public String f97316g;

    /* renamed from: h */
    public boolean f97317h = true;

    /* renamed from: i */
    public int f97318i = -1;

    /* renamed from: j */
    public final AbstractC42534b f97319j;

    /* renamed from: w */
    private String f97320w = "discovery";

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.c$c */
    public interface AbstractC41715c {
        static {
            Covode.recordClassIndex(49628);
        }

        /* renamed from: a */
        void mo70802a();
    }

    static {
        Covode.recordClassIndex(49624);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a */
    public final void mo63355a(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.c$a */
    public static final class C41712a {
        static {
            Covode.recordClassIndex(49625);
        }

        private C41712a() {
        }

        public /* synthetic */ C41712a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42534b
    /* renamed from: l */
    public final void mo70806l() {
        this.f97319j.mo70806l();
    }

    public C41711c(AbstractC42534b bVar) {
        C89219l.m154721d(bVar, "");
        this.f97319j = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        MethodCollector.m26663i(5854);
        C89219l.m154721d(viewGroup, "");
        if (C80580in.m139687c()) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams((int) C13628n.m24520b(viewGroup.getContext(), 14.0f), -1));
            C41713b bVar = new C41713b(view, null);
            MethodCollector.m26664o(5854);
            return bVar;
        }
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.xs, viewGroup, false);
        C89219l.m154716b(a, "");
        C41713b bVar2 = new C41713b(a, this.f97313d);
        MethodCollector.m26664o(5854);
        return bVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.c$b */
    static final class C41713b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(49626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41713b(View view, final AbstractC41715c cVar) {
            super(view);
            C89219l.m154721d(view, "");
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41711c.C41713b.View$OnClickListenerC417141 */

                static {
                    Covode.recordClassIndex(49627);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    AbstractC41715c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo70802a();
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.xq, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C41721g(this, a, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final void mo61483b(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        C41721g gVar = (C41721g) viewHolder;
        if (!C89219l.m154714a(gVar.f97337a, this)) {
            gVar.f97337a = this;
        }
        gVar.mo67806a((Aweme) ((AbstractC39058d) this).f92236l.get(i), i);
        gVar.f92234p = this.f97317h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    @Override // com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62403a(android.view.View r20, com.p2082ss.android.ugc.aweme.feed.model.Aweme r21, java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 820
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.C41711c.mo62403a(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }
}
