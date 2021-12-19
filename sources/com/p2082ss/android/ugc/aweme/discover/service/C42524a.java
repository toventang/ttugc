package com.p2082ss.android.ugc.aweme.discover.service;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41615ah;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41777h;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41786k;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42021i;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42023j;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42024k;
import com.p2082ss.android.ugc.aweme.discover.helper.C41977aa;
import com.p2082ss.android.ugc.aweme.discover.helper.C41980ab;
import com.p2082ss.android.ugc.aweme.discover.helper.C41981ac;
import com.p2082ss.android.ugc.aweme.discover.helper.C42002c;
import com.p2082ss.android.ugc.aweme.discover.helper.C42055v;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.AbstractC42367a;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41503ak;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41954a;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41957c;
import com.p2082ss.android.ugc.aweme.discover.p2777k.C42175a;
import com.p2082ss.android.ugc.aweme.discover.p2777k.C42180d;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.C42557d;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.C42611b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2799a.p2800a.C42607a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42618a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42619b;
import com.p2082ss.android.ugc.aweme.discover.service.C42529c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicTag;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67440e;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67438c;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67442g;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67511b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67544e;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67546f;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.service.a */
public final class C42524a implements AbstractC41955b {

    /* renamed from: b */
    public static final C42524a f99151b = new C42524a();

    private C42524a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final void mo71114a(String str, Fragment fragment) {
        C89219l.m154721d(str, "");
        if (fragment != null && (fragment instanceof C42611b)) {
            ((C42611b) fragment).mo72811c();
            C42618a a = C42619b.f99427b.mo72818a(str);
            if (a != null) {
                C67438c cVar = a.f99423b;
                if (cVar != null) {
                    cVar.reset();
                }
                C67438c cVar2 = a.f99424c;
                if (cVar2 != null) {
                    cVar2.reset();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final void mo71113a(C67437b bVar, Fragment fragment) {
        C67442g gVar;
        Map<String, String> map;
        Map<String, String> map2;
        if (fragment != null && (fragment instanceof C42611b)) {
            C42611b bVar2 = (C42611b) fragment;
            bVar2.f99406c = bVar;
            C67442g gVar2 = null;
            if (bVar != null) {
                gVar = bVar.getFilterByStruct();
                gVar2 = bVar.getSortTypeStruct();
            } else {
                gVar = null;
            }
            Map<String, String> map3 = bVar2.f99407d;
            C67544e eVar = new C67544e();
            AbstractC67567q a = C67486am.m119564a();
            C67540c f = eVar.mo106486f(C67458j.m119528a(a != null ? a.mo106426a() : 0));
            if (map3 == null) {
                map3 = new LinkedHashMap<>();
            }
            C67511b b = f.mo106450b(map3);
            if (gVar == null || (map = gVar.getLogInfo()) == null) {
                map = new LinkedHashMap<>();
            }
            C67511b b2 = b.mo106450b(map);
            if (gVar2 == null || (map2 = gVar2.getLogInfo()) == null) {
                map2 = new LinkedHashMap<>();
            }
            b2.mo106450b(map2).mo96792f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final boolean mo71117a(String str) {
        C89219l.m154721d(str, "");
        C42180d.C42181a a = C42180d.m84432a(str);
        String schema = a != null ? a.getSchema() : null;
        return (schema == null || schema.length() == 0) ? false : true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final void mo71112a(AbstractC42021i.C42022a aVar) {
        C89219l.m154721d(aVar, "");
        C42055v.m84170a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final void mo71115a(String str, MusicModel musicModel, int i) {
        C89219l.m154721d(str, "");
        if (musicModel != null) {
            C1731i.m5640b(new CallableC42526b(musicModel, str, i), C39162r.m79452a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final void mo71116a(String str, MusicModel musicModel, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (musicModel != null) {
            C1731i.m5640b(new CallableC42525a(musicModel, str, str2, i), C39162r.m79452a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: b */
    public final AbstractC42023j mo71118b() {
        return new C41980ab();
    }

    static {
        Covode.recordClassIndex(50615);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final AbstractC41957c mo71108a() {
        if (C42175a.m84430a() == null) {
            return null;
        }
        return new C41977aa();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: c */
    public final boolean mo71121c() {
        if (!C42619b.m85133a(C42619b.f99427b.mo72818a("music")) || !C41503ak.f96822a) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.service.a$a */
    static final class CallableC42525a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ MusicModel f99152a;

        /* renamed from: b */
        final /* synthetic */ String f99153b;

        /* renamed from: c */
        final /* synthetic */ String f99154c;

        /* renamed from: d */
        final /* synthetic */ int f99155d;

        static {
            Covode.recordClassIndex(50616);
        }

        CallableC42525a(MusicModel musicModel, String str, String str2, int i) {
            this.f99152a = musicModel;
            this.f99153b = str;
            this.f99154c = str2;
            this.f99155d = i;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            MusicModel musicModel = this.f99152a;
            if (musicModel == null) {
                C89219l.m154715b();
            }
            LogPbBean logPb = musicModel.getLogPb();
            C89219l.m154716b(logPb, "");
            logPb.getImprId();
            LogPbBean logPb2 = this.f99152a.getLogPb();
            C89219l.m154716b(logPb2, "");
            String imprId = logPb2.getImprId();
            GsonProvider c = GsonHolder.m138943c();
            C89219l.m154716b(c, "");
            C33744d a = new C33744d().mo59983a("enter_from", "general_search").mo59983a("search_id", this.f99152a.getSearchId()).mo59983a("search_keyword", this.f99152a.getSearchKeyWords()).mo59983a("log_pb", c.mo123620b().mo46674b(this.f99152a.getLogPb())).mo59983a("impr_id", imprId).mo59983a("enter_from", this.f99153b).mo59983a("button_type", this.f99154c).mo59983a("is_aladdin", "1").mo59983a("search_result_id", this.f99152a.getMusicId()).mo59983a("token_type", "music").mo59983a("is_aladdin", "0").mo59983a("rank", String.valueOf(this.f99155d));
            MusicModel musicModel2 = this.f99152a;
            if (!(musicModel2 == null || musicModel2.getMusic() == null)) {
                Music music = this.f99152a.getMusic();
                C89219l.m154716b(music, "");
                if (music.getMusicTags() != null) {
                    GsonProvider c2 = GsonHolder.m138943c();
                    C89219l.m154716b(c2, "");
                    C27910f b = c2.mo123620b();
                    Music music2 = this.f99152a.getMusic();
                    C89219l.m154716b(music2, "");
                    a.mo59983a("music_tag_info", b.mo46674b(music2.getMusicTags()));
                    C39162r.m79460a("search_result_click", a.f79943a);
                    return null;
                }
            }
            a.mo59983a("music_tag_info", "");
            C39162r.m79460a("search_result_click", a.f79943a);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.service.a$b */
    static final class CallableC42526b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ MusicModel f99156a;

        /* renamed from: b */
        final /* synthetic */ String f99157b;

        /* renamed from: c */
        final /* synthetic */ int f99158c;

        static {
            Covode.recordClassIndex(50617);
        }

        CallableC42526b(MusicModel musicModel, String str, int i) {
            this.f99156a = musicModel;
            this.f99157b = str;
            this.f99158c = i;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            MusicModel musicModel = this.f99156a;
            if (musicModel == null) {
                C89219l.m154715b();
            }
            LogPbBean logPb = musicModel.getLogPb();
            C89219l.m154716b(logPb, "");
            logPb.getImprId();
            LogPbBean logPb2 = this.f99156a.getLogPb();
            C89219l.m154716b(logPb2, "");
            String imprId = logPb2.getImprId();
            GsonProvider c = GsonHolder.m138943c();
            C89219l.m154716b(c, "");
            C33744d a = new C33744d().mo59983a("enter_from", "general_search").mo59983a("search_id", this.f99156a.getSearchId()).mo59983a("search_keyword", this.f99156a.getSearchKeyWords()).mo59983a("log_pb", c.mo123620b().mo46674b(this.f99156a.getLogPb())).mo59983a("impr_id", imprId).mo59983a("enter_from", this.f99157b).mo59983a("is_aladdin", "1").mo59983a("search_result_id", this.f99156a.getMusicId()).mo59983a("token_type", "music").mo59983a("is_aladdin", "0").mo59983a("rank", String.valueOf(this.f99158c));
            MusicModel musicModel2 = this.f99156a;
            if (!(musicModel2 == null || musicModel2.getMusic() == null)) {
                Music music = this.f99156a.getMusic();
                C89219l.m154716b(music, "");
                if (music.getMusicTags() != null) {
                    GsonProvider c2 = GsonHolder.m138943c();
                    C89219l.m154716b(c2, "");
                    C27910f b = c2.mo123620b();
                    Music music2 = this.f99156a.getMusic();
                    C89219l.m154716b(music2, "");
                    a.mo59983a("music_tag_info", b.mo46674b(music2.getMusicTags()));
                    C39162r.m79460a("search_result_show", a.f79943a);
                    return null;
                }
            }
            a.mo59983a("music_tag_info", "");
            C39162r.m79460a("search_result_show", a.f79943a);
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final AbstractC41954a mo71107a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return C41615ah.C41616a.m83569a(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: b */
    public final AbstractC42367a mo71119b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return View$OnAttachStateChangeListenerC42258a.C42259a.m84600a(viewGroup, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: d */
    public final RecyclerView.ViewHolder mo71122d(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return C41786k.C41787a.m83739a(viewGroup);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.service.a$c */
    static final class View$OnClickListenerC42527c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f99159a;

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f99160b;

        /* renamed from: c */
        final /* synthetic */ Map f99161c;

        /* renamed from: d */
        final /* synthetic */ View.OnClickListener f99162d;

        /* renamed from: e */
        final /* synthetic */ Fragment f99163e;

        static {
            Covode.recordClassIndex(50618);
        }

        View$OnClickListenerC42527c(ActivityC0945e eVar, View.OnClickListener onClickListener, Map map, View.OnClickListener onClickListener2, Fragment fragment) {
            this.f99159a = eVar;
            this.f99160b = onClickListener;
            this.f99161c = map;
            this.f99162d = onClickListener2;
            this.f99163e = fragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C42524a.m85007a("close_filter", this.f99161c);
            View.OnClickListener onClickListener = this.f99162d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: c */
    public final RecyclerView.ViewHolder mo71120c(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aud, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C41777h(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final AbstractC42024k mo71109a(AbstractC42024k.C42026b bVar) {
        C89219l.m154721d(bVar, "");
        return new C41981ac(bVar);
    }

    /* renamed from: a */
    public static void m85007a(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        new C67546f().mo106500r("by_all").mo96788a(map).mo96786a("button_type", str).mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final SpannableString mo71105a(Context context, String str, List<? extends Position> list) {
        SpannableString spannableString;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || C13603b.m24435a((Collection) list)) {
            spannableString = new SpannableString(str);
        } else {
            spannableString = new SpannableString(str);
            for (Position position : list) {
                if (position != null) {
                    int begin = position.getBegin();
                    int end = position.getEnd() + 1;
                    int max = Math.max(0, begin);
                    if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                        spannableString.setSpan(new StyleSpan(1), max, end, 17);
                    }
                }
            }
        }
        C89219l.m154716b(spannableString, "");
        return spannableString;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final Fragment mo71106a(String str, boolean z, AbstractC67440e eVar) {
        String schema;
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
        C42611b bVar = new C42611b();
        bVar.f99404a = eVar;
        C42618a a = C42619b.f99427b.mo72818a(str);
        if (C42619b.m85133a(a) && a != null) {
            C67438c cVar = a.f99423b;
            if (cVar != null) {
                cVar.reset();
            }
            C67438c cVar2 = a.f99424c;
            if (cVar2 != null) {
                cVar2.reset();
            }
        }
        C42607a a2 = bVar.mo72808a();
        List<? extends Object> list = null;
        if (!z) {
            a = null;
        }
        a2.f99396a = a;
        C42607a a3 = bVar.mo72808a();
        C42180d.C42181a a4 = C42180d.m84432a(str);
        if (!(a4 == null || (schema = a4.getSchema()) == null || schema.length() == 0)) {
            list = C89070n.m154524c(new SearchUserFeedback(schema));
        }
        a3.f99397b = list;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final void mo71111a(RecyclerView recyclerView, List<MusicTag> list, View.OnClickListener onClickListener) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(onClickListener, "");
        Context context = recyclerView.getContext();
        C89219l.m154716b(context, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(onClickListener, "");
        recyclerView.setVisibility(0);
        if (recyclerView.getAdapter() == null) {
            recyclerView.setLayoutManager(new SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1(recyclerView, context, onClickListener, list));
            recyclerView.setAdapter(new C42528b(onClickListener, recyclerView));
            if (C80471gb.m139483a(context)) {
                recyclerView.addOnAttachStateChangeListener(new C42529c.View$OnAttachStateChangeListenerC42530a(recyclerView, context, onClickListener, list));
            }
        }
        if (recyclerView.getAdapter() != null) {
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.service.SearchMusicTagAdapter");
            C42528b bVar = (C42528b) adapter;
            C89219l.m154721d(list, "");
            bVar.f99165b = new int[2];
            bVar.f99164a.clear();
            bVar.f99164a.addAll(list);
            bVar.notifyDataSetChanged();
            RecyclerView.AbstractC1362i layoutManager = bVar.f99166c.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo4363e(0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b
    /* renamed from: a */
    public final void mo71110a(ActivityC0945e eVar, Fragment fragment, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, Map<String, String> map) {
        String str;
        String str2;
        Fragment fragment2;
        String string;
        String str3 = "";
        C89219l.m154721d(fragment, str3);
        C89219l.m154721d(onClickListener, str3);
        C89219l.m154721d(map, str3);
        if (eVar != null) {
            C42557d.C42559b bVar = new C42557d.C42559b();
            Resources resources = eVar.getResources();
            if (resources == null || (str = resources.getString(R.string.daq)) == null) {
                str = str3;
            }
            bVar.mo72732a(str);
            Resources resources2 = eVar.getResources();
            if (resources2 == null || (str2 = resources2.getString(R.string.a94)) == null) {
                str2 = str3;
            }
            bVar.mo72733b(str2);
            Resources resources3 = eVar.getResources();
            if (!(resources3 == null || (string = resources3.getString(R.string.uz)) == null)) {
                str3 = string;
            }
            bVar.mo72734c(str3);
            bVar.f99285i = onClickListener;
            bVar.f99284h = false;
            bVar.f99283g = R.color.bz;
            bVar.f99282f = R.color.bh;
            bVar.f99280d = new View$OnClickListenerC42527c(eVar, onClickListener, map, onClickListener2, fragment);
            boolean z = fragment instanceof C42611b;
            if (!z) {
                fragment2 = null;
            } else {
                fragment2 = fragment;
            }
            C42611b bVar2 = (C42611b) fragment2;
            if (bVar2 != null) {
                bVar.f99278b = C42002c.m84069a(eVar, bVar2.mo72808a().f99396a, ((C42611b) fragment).f99410k);
                bVar.f99286j = C42002c.m84070a(bVar2.mo72808a().f99396a);
            }
            C42557d a = C42557d.C42558a.m85060a(R.id.dnh, eVar, fragment, bVar);
            if (z) {
                C42611b bVar3 = (C42611b) fragment;
                bVar3.f99405b = a;
                bVar3.f99407d = map;
            }
            m85007a("open_filter", map);
        }
    }
}
