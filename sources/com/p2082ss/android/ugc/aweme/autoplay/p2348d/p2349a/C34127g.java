package com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.g */
public final class C34127g extends AbstractC34151g {

    /* renamed from: h */
    public static final C34128a f80699h = new C34128a((byte) 0);

    /* renamed from: a */
    public AwemeRawAd f80700a;

    /* renamed from: b */
    public C67568r f80701b;

    /* renamed from: c */
    public String f80702c;

    /* renamed from: d */
    List<? extends Aweme> f80703d;

    /* renamed from: e */
    public final Context f80704e;

    /* renamed from: f */
    public final AbstractC41814c f80705f;

    /* renamed from: g */
    public final C51060g f80706g;

    /* renamed from: j */
    private final C34108a<Aweme> f80707j;

    /* renamed from: k */
    private final boolean f80708k = true;

    /* renamed from: l */
    private final AbstractC41814c f80709l;

    /* renamed from: m */
    private final AbstractC51043a f80710m;

    /* renamed from: n */
    private final AbstractC34259f f80711n;

    static {
        Covode.recordClassIndex(41061);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m69715a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.g$a */
    public static final class C34128a {
        static {
            Covode.recordClassIndex(41062);
        }

        private C34128a() {
        }

        public /* synthetic */ C34128a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g
    /* renamed from: a */
    public final List<Aweme> mo60373a() {
        return this.f80703d;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.g$c */
    static final class View$OnClickListenerC34130c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34127g f80713a;

        /* renamed from: b */
        final /* synthetic */ int f80714b;

        /* renamed from: c */
        final /* synthetic */ Aweme f80715c;

        static {
            Covode.recordClassIndex(41064);
        }

        View$OnClickListenerC34130c(C34127g gVar, int i, Aweme aweme) {
            this.f80713a = gVar;
            this.f80714b = i;
            this.f80715c = aweme;
        }

        /* renamed from: a */
        private static boolean m69719a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m69719a();
            }
            if (!C58029j.f132256h) {
                new C79459a(this.f80713a.f80704e).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            AbstractC41814c cVar = this.f80713a.f80705f;
            int i = this.f80714b;
            C89219l.m154716b(view, "");
            cVar.mo60417a(i, view, this.f80715c, this.f80713a.f80703d);
        }
    }

    /* renamed from: f */
    private final boolean m69716f() {
        if (this.f80703d.size() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (m69716f()) {
            return 1;
        }
        return this.f80703d.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.g$b */
    static final class C34129b extends AbstractC89220m implements AbstractC89172b<Aweme, Aweme> {

        /* renamed from: a */
        public static final C34129b f80712a = new C34129b();

        static {
            Covode.recordClassIndex(41063);
        }

        C34129b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ Aweme invoke(Aweme aweme) {
            return aweme;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g
    /* renamed from: a */
    public final void mo60376a(List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        this.f80703d = list;
        notifyDataSetChanged();
        C34108a<Aweme> aVar = this.f80707j;
        C34129b bVar = C34129b.f80712a;
        C89219l.m154721d(bVar, "");
        aVar.f80646a.clear();
        if (list != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                Aweme aweme = (Aweme) bVar.invoke(t);
                if (aweme != null) {
                    Map<String, C89378p<Integer, Aweme>> map = aVar.f80646a;
                    String aid = aweme.getAid();
                    C89219l.m154716b(aid, "");
                    map.put(aid, new C89378p<>(Integer.valueOf(i), aweme));
                    aVar.mo60407b().mo60677a(aweme);
                }
                i = i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0328, code lost:
        if (r10 != null) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        if (r0 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02b4  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r19, int r20) {
        /*
        // Method dump skipped, instructions count: 1143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a.C34127g.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m69715a(C34127g gVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(8828);
        C89219l.m154721d(viewGroup, "");
        AbstractC51043a aVar = gVar.f80710m;
        C51060g gVar2 = gVar.f80706g;
        AbstractC34259f fVar = gVar.f80711n;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(gVar2, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(fVar, "");
        View$OnAttachStateChangeListenerC34123f fVar2 = new View$OnAttachStateChangeListenerC34123f(C67641m.m119786a(viewGroup, R.layout.atu), aVar, gVar2, gVar, viewGroup, fVar);
        fVar2.f80677a = gVar.f80708k;
        fVar2.f80678b = gVar.f80709l;
        try {
            if (fVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(fVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) fVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(fVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = fVar2.getClass().getName();
        MethodCollector.m26664o(8828);
        return fVar2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34127g(Context context, AbstractC41814c cVar, AbstractC41814c cVar2, AbstractC51043a aVar, C51060g gVar, RecyclerView recyclerView, AbstractC34259f fVar) {
        super(recyclerView);
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(cVar2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(fVar, "");
        this.f80704e = context;
        this.f80709l = cVar;
        this.f80705f = cVar2;
        this.f80710m = aVar;
        this.f80706g = gVar;
        this.f80711n = fVar;
        this.f80701b = C67568r.C67569a.m119673a();
        this.f80702c = "";
        this.f80707j = new C34108a<>(recyclerView);
        this.f80703d = new ArrayList();
    }
}
