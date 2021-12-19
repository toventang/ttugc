package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e;

import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20751h;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42368b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42400g;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.SearchOperation;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.PleaseNotice;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.SearchDialInfo;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.SearchSuicideInfo;
import com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e.C42859h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c;
import com.p2082ss.android.ugc.aweme.search.p3686d.C67362a;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.e.d */
public final class C42850d extends AbstractC34766g<SearchSuicideInfo> implements AbstractC67364c {

    /* renamed from: d */
    public GlobalDoodleConfig f99924d;

    /* renamed from: e */
    LogPbBean f99925e = new LogPbBean();

    /* renamed from: f */
    public final AbstractC42844b f99926f;

    static {
        Covode.recordClassIndex(50954);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c
    /* renamed from: a */
    public final void mo71301a() {
    }

    /* renamed from: l */
    public final boolean mo73097l() {
        List list = this.f92236l;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SearchSuicideInfo) next).type == 5) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c
    /* renamed from: a */
    public final void mo71306a(C67362a aVar) {
        C89219l.m154721d(aVar, "");
        this.f99926f.mo73089a(aVar.f150932a, aVar.f150933b);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((SearchSuicideInfo) this.f92236l.get(i)).type;
    }

    public C42850d(AbstractC42844b bVar) {
        C89219l.m154721d(bVar, "");
        this.f99926f = bVar;
        new LinkedHashSet();
        this.f92247s = new GridLayoutManager.AbstractC1337c(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e.C42850d.C428511 */

            /* renamed from: e */
            final /* synthetic */ C42850d f99927e;

            /* renamed from: f */
            private final int f99928f = 1;

            /* renamed from: g */
            private final int f99929g = 2;

            static {
                Covode.recordClassIndex(50955);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f99927e = r2;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
            /* renamed from: a */
            public final int mo4342a(int i) {
                if (this.f99927e.mo60936c(i) == 6) {
                    return this.f99928f;
                }
                return this.f99929g;
            }
        };
    }

    /* renamed from: a */
    public final void mo73096a(SearchSuicideInfo searchSuicideInfo) {
        C89219l.m154721d(searchSuicideInfo, "");
        int indexOf = this.f92236l.indexOf(searchSuicideInfo);
        this.f92236l.remove(searchSuicideInfo);
        if (indexOf >= 0) {
            notifyItemRemoved(indexOf);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: b */
    public final void mo67817b(View view) {
        if (view != null) {
            view.setPadding(0, 0, 0, (int) C13628n.m24520b(view.getContext(), 40.5f));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: c_ */
    public final int mo63367c_(View view) {
        C89219l.m154721d(view, "");
        return (int) C13628n.m24520b(view.getContext(), 95.0f);
    }

    /* renamed from: a */
    private final C67568r m85560a(int i) {
        int i2;
        String str;
        String str2;
        String str3;
        AbstractC67567q a = C67486am.m119564a();
        String str4 = "normal";
        if (a != null) {
            str2 = a.mo106431c().f151151a;
            str3 = a.mo106431c().f151152b;
            i2 = a.mo106426a();
            str = a.mo106431c().f151154d;
            str4 = a.mo106431c().f151153c;
        } else {
            i2 = 0;
            str = str4;
            str2 = "";
            str3 = str2;
        }
        LogPbBean logPbBean = this.f99925e;
        logPbBean.setImprId(str2);
        C67568r g = C67568r.C67569a.m119673a().mo106518g(C67458j.m119528a(i2));
        g.f151306a = true;
        C67568r h = g.mo106519h(str2);
        String imprId = logPbBean.getImprId();
        C89219l.m154716b(imprId, "");
        C67568r a2 = h.mo106520i(imprId).mo106521j(str2).mo106507a(logPbBean);
        a2.f151307b = i2;
        a2.f151318m = i;
        return a2.mo106517f(str3).mo106523l(str4).mo106524m(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b */
    public final void mo62376b(List<SearchSuicideInfo> list) {
        int i;
        if (!(list == null || C13603b.m24435a((Collection) list))) {
            if (this.f92236l == null) {
                this.f92236l = new ArrayList();
            }
            List list2 = this.f92236l;
            if (list2 != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            for (T t : list) {
                if (!this.f92236l.contains(t)) {
                    this.f92236l.add(t);
                }
            }
            notifyItemRangeInserted(i, list.size());
        }
    }

    /* renamed from: a */
    public final int mo73095a(String str) {
        String str2;
        C89219l.m154721d(str, "");
        if (this.f92236l != null && !this.f92236l.isEmpty() && !TextUtils.isEmpty(str)) {
            int size = this.f92236l.size();
            for (int i = 0; i < size; i++) {
                SearchSuicideInfo searchSuicideInfo = (SearchSuicideInfo) this.f92236l.get(i);
                if (!(searchSuicideInfo == null || searchSuicideInfo.aweme == null)) {
                    Aweme aweme = searchSuicideInfo.aweme;
                    if (aweme != null) {
                        str2 = aweme.getAid();
                    } else {
                        str2 = null;
                    }
                    if (C13627m.m24499a(str, str2)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.d$a */
    public static final class C42852a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f99930a;

        static {
            Covode.recordClassIndex(50956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42852a(ViewGroup viewGroup, View view) {
            super(view);
            this.f99930a = viewGroup;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        MethodCollector.m26663i(7311);
        C89219l.m154721d(viewGroup, "");
        switch (i) {
            case 1:
                C42400g a = C42400g.C42402a.m84775a(viewGroup);
                MethodCollector.m26664o(7311);
                return a;
            case 2:
            case 3:
                C89219l.m154721d(viewGroup, "");
                C42845c cVar = new C42845c(C67641m.m119786a(viewGroup, R.layout.aw4), viewGroup);
                MethodCollector.m26664o(7311);
                return cVar;
            case 4:
                AbstractC42844b bVar = this.f99926f;
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(bVar, "");
                C42859h hVar = new C42859h(C67641m.m119786a(viewGroup, R.layout.auq), bVar);
                MethodCollector.m26664o(7311);
                return hVar;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                C42368b a2 = C42368b.C42369a.m84730a(viewGroup);
                MethodCollector.m26664o(7311);
                return a2;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.awp, viewGroup, false);
                C89219l.m154716b(a3, "");
                View$OnClickListenerC42476c cVar2 = new View$OnClickListenerC42476c(a3, "selfharm", this);
                MethodCollector.m26664o(7311);
                return cVar2;
            default:
                C42852a aVar = new C42852a(viewGroup, new View(viewGroup.getContext()));
                MethodCollector.m26664o(7311);
                return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        SearchSuicideInfo searchSuicideInfo = (SearchSuicideInfo) this.f92236l.get(i);
        SearchOperation searchOperation = 0;
        switch (mo60936c(i)) {
            case 1:
                SearchOperation searchOperation2 = searchSuicideInfo.searchOperation;
                if (searchOperation2 != null) {
                    String uri = Uri.parse(searchOperation2.getLink()).buildUpon().appendQueryParameter("enter_from", "discover_page_banner").build().toString();
                    C89219l.m154716b(uri, "");
                    searchOperation2.setLink(uri);
                    searchOperation = searchOperation2;
                }
                C67568r a = m85560a(i);
                C42400g gVar = (C42400g) viewHolder;
                if (searchOperation == null) {
                    C89219l.m154715b();
                }
                gVar.mo71590a(searchOperation);
                ((C42400g) viewHolder).mo70880a(a);
                gVar.mo70881a("tns_show_see_support_resources");
                return;
            case 2:
                C67568r a2 = m85560a(i);
                C42845c cVar = (C42845c) viewHolder;
                SearchDialInfo searchDialInfo = searchSuicideInfo.searchDialInfo;
                if (searchDialInfo == null) {
                    C89219l.m154715b();
                }
                cVar.mo73091a(searchDialInfo, searchSuicideInfo.type);
                ((C42845c) viewHolder).mo70880a(a2);
                cVar.mo70881a("tns_show_call_button");
                return;
            case 3:
                C67568r a3 = m85560a(i);
                C42845c cVar2 = (C42845c) viewHolder;
                SearchDialInfo searchDialInfo2 = searchSuicideInfo.searchDialInfo;
                if (searchDialInfo2 == null) {
                    C89219l.m154715b();
                }
                cVar2.mo73091a(searchDialInfo2, searchSuicideInfo.type);
                ((C42845c) viewHolder).mo70880a(a3);
                cVar2.mo70881a("tns_show_text_button");
                return;
            case 4:
                C67568r a4 = m85560a(i);
                C42859h hVar = (C42859h) viewHolder;
                PleaseNotice pleaseNotice = searchSuicideInfo.pleaseNotice;
                if (pleaseNotice == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(pleaseNotice, "");
                String str = pleaseNotice.text;
                if (str != null) {
                    View view = hVar.itemView;
                    C89219l.m154716b(view, "");
                    ((TuxTextView) view.findViewById(R.id.d3i)).setText(str);
                }
                String str2 = pleaseNotice.buttonText;
                if (str2 != null) {
                    View view2 = hVar.itemView;
                    C89219l.m154716b(view2, "");
                    ((TuxTextView) view2.findViewById(R.id.e0z)).setText(str2);
                }
                View view3 = hVar.itemView;
                C89219l.m154716b(view3, "");
                ((TuxTextView) view3.findViewById(R.id.e0z)).setOnClickListener(new C42859h.View$OnClickListenerC42861b(hVar));
                ((C42859h) viewHolder).mo70880a(a4);
                hVar.mo70881a("tns_show_showresults_button");
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                String string = C20751h.f48987a.getString(R.string.ff5);
                C89219l.m154716b(string, "");
                ((C42368b) viewHolder).mo71569b(string);
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                C67568r a5 = m85560a(i);
                if (viewHolder instanceof View$OnClickListenerC42476c) {
                    searchOperation = viewHolder;
                }
                View$OnClickListenerC42476c cVar3 = (View$OnClickListenerC42476c) searchOperation;
                if (cVar3 != null) {
                    cVar3.mo72641a(searchSuicideInfo.aweme, i, cVar3.getAdapterPosition(), true);
                    ((View$OnClickListenerC42476c) viewHolder).mo70880a(a5);
                    cVar3.mo72645a("tns_aid_search");
                    return;
                }
                return;
            default:
                return;
        }
    }
}
