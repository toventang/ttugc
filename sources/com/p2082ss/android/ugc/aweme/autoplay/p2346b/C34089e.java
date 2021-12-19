package com.p2082ss.android.ugc.aweme.autoplay.p2346b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d;
import com.p2082ss.android.ugc.aweme.autoplay.player.C34183a;
import com.p2082ss.android.ugc.aweme.discover.helper.C41985ae;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.b.e */
public final class C34089e extends AbstractC34057a {

    /* renamed from: g */
    public static boolean f80598g;

    /* renamed from: h */
    public static final C34090a f80599h = new C34090a((byte) 0);

    /* renamed from: e */
    public final Context f80600e;

    /* renamed from: f */
    public final C51060g f80601f;

    /* renamed from: j */
    private final AbstractC89244h f80602j;

    /* renamed from: k */
    private final AbstractC51043a f80603k;

    static {
        Covode.recordClassIndex(41023);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m69657a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.e$a */
    public static final class C34090a {
        static {
            Covode.recordClassIndex(41024);
        }

        private C34090a() {
        }

        public /* synthetic */ C34090a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.e$b */
    static final class C34091b extends AbstractC89220m implements AbstractC89171a<C340921> {

        /* renamed from: a */
        final /* synthetic */ C34089e f80604a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f80605b;

        static {
            Covode.recordClassIndex(41025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34091b(C34089e eVar, RecyclerView recyclerView) {
            super(0);
            this.f80604a = eVar;
            this.f80605b = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C340921 invoke() {
            return new AbstractC42293b.AbstractC42294a<C2954a>(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.C34089e.C34091b.C340921 */

                /* renamed from: a */
                final /* synthetic */ C34091b f80606a;

                static {
                    Covode.recordClassIndex(41026);
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final Class<C2954a> mo60371a() {
                    return C2954a.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f80606a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final /* synthetic */ void mo60372a(C2954a aVar) {
                    C2954a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    if (this.f80606a.f80604a.mo60373a().size() > 1 && C34089e.f80598g) {
                        C34089e.f80598g = false;
                        long j = aVar2.f8696a;
                        Iterator<T> it = this.f80606a.f80604a.mo60373a().iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = 0;
                                break;
                            }
                            T next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                C89070n.m154520a();
                            }
                            User author = next.getAuthor();
                            if (author != null && author.roomId == j) {
                                break;
                            }
                            i = i2;
                        }
                        RecyclerView.AbstractC1362i layoutManager = this.f80606a.f80605b.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                            linearLayoutManager.mo4347a(i, 0);
                            linearLayoutManager.mo4329a(true);
                        }
                    }
                }
            };
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (mo60373a().size() == 1) {
            return 1;
        }
        return mo60373a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (getItemViewType(i) == 1 && (viewHolder instanceof View$OnAttachStateChangeListenerC34066d)) {
            ((View$OnAttachStateChangeListenerC34066d) viewHolder).mo60355a(((AbstractC34057a) this).f80530a, mo60373a().get(i), this.f80532c, null, null);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m69657a(C34089e eVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(8645);
        C89219l.m154721d(viewGroup, "");
        View$OnAttachStateChangeListenerC34066d a2 = View$OnAttachStateChangeListenerC34066d.C34080a.m69656a(viewGroup, eVar.f80603k, eVar.f80601f, eVar);
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
        MethodCollector.m26664o(8645);
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34089e(Context context, AbstractC51043a aVar, C51060g gVar, RecyclerView recyclerView) {
        super(recyclerView);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(recyclerView, "");
        this.f80600e = context;
        this.f80603k = aVar;
        this.f80601f = gVar;
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) new C34091b(this, recyclerView));
        this.f80602j = a;
        gVar.f117776g = new C34183a(recyclerView, gVar);
        C41985ae.f97915a.mo71487a((AbstractC42293b.AbstractC42294a) a.getValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2346b.AbstractC34057a
    /* renamed from: a */
    public final void mo60345a(List<? extends Aweme> list, C42410g gVar, Long l, boolean z) {
        long j;
        String str;
        C89219l.m154721d(list, "");
        mo60376a(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : list) {
            User author = t.getAuthor();
            long j2 = 0;
            if (author != null) {
                j = author.roomId;
            } else {
                j = 0;
            }
            arrayList.add(Long.valueOf(j));
            User author2 = t.getAuthor();
            if (author2 != null) {
                j2 = author2.roomId;
            }
            User author3 = t.getAuthor();
            if (author3 == null || (str = author3.getUid()) == null) {
                str = "";
            }
            arrayList2.add(new RoomInfo(j2, str));
        }
        this.f80532c = new C34105h(gVar, this.f80531b, list, arrayList, arrayList2, l);
    }
}
