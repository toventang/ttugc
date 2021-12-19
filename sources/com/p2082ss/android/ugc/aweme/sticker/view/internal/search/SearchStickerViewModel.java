package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75728c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76337f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76368m;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76400e;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.p4345g.AbstractC84433b;
import com.p2082ss.android.ugc.tools.p4345g.EnumC84434c;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.ugc.effectplatform.model.net.EffectNameModel;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsModel;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel */
public class SearchStickerViewModel extends StickerListViewModel implements AbstractC33974au, AbstractC76329a {

    /* renamed from: k */
    public static final C76327a f171446k = new C76327a((byte) 0);

    /* renamed from: a */
    final C1213t<C76363k> f171447a;

    /* renamed from: b */
    final C1213t<C89378p<String, List<String>>> f171448b;

    /* renamed from: c */
    final C1213t<AbstractC76337f> f171449c;

    /* renamed from: d */
    final C1213t<C76332d> f171450d;

    /* renamed from: e */
    boolean f171451e;

    /* renamed from: f */
    public C75728c f171452f;

    /* renamed from: g */
    public long f171453g;

    /* renamed from: h */
    long f171454h;

    /* renamed from: i */
    public C1213t<Boolean> f171455i = new C1213t<>();

    /* renamed from: j */
    public C1213t<String> f171456j = new C1213t<>();

    /* renamed from: t */
    private AbstractC76368m f171457t = AbstractC76368m.C76369a.f171554a;

    /* renamed from: u */
    private final LiveData<C76363k> f171458u;

    /* renamed from: v */
    private final LiveData<C89378p<String, List<String>>> f171459v;

    /* renamed from: w */
    private final LiveData<AbstractC76337f> f171460w;

    /* renamed from: x */
    private final LiveData<C76332d> f171461x;

    /* renamed from: y */
    private final LiveData<Boolean> f171462y;

    /* renamed from: z */
    private String f171463z;

    static {
        Covode.recordClassIndex(89276);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    /* renamed from: a */
    public final void mo119126a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel$a */
    public static final class C76327a {
        static {
            Covode.recordClassIndex(89281);
        }

        private C76327a() {
        }

        public /* synthetic */ C76327a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: b */
    public final String mo120033b() {
        return this.f171463z;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: c */
    public final AbstractC76368m mo120035c() {
        return this.f171457t;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ LiveData mo120036d() {
        return this.f171456j;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: e */
    public final LiveData<C76363k> mo120037e() {
        return this.f171458u;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: f */
    public final LiveData<AbstractC76337f> mo120038f() {
        return this.f171460w;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: g */
    public final LiveData<C76332d> mo120039g() {
        return this.f171461x;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: h */
    public final LiveData<Boolean> mo120040h() {
        return this.f171462y;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    /* renamed from: i */
    public final AbstractC76400e<Effect> mo120041i() {
        return new C76328b();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel$b */
    public static final class C76328b implements AbstractC76400e<Effect> {

        /* renamed from: a */
        private final HashMap<String, Integer> f171471a = new HashMap<>();

        static {
            Covode.recordClassIndex(89282);
        }

        C76328b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76400e
        /* renamed from: a */
        public final /* synthetic */ int mo120043a(Effect effect) {
            Integer num;
            Effect effect2 = effect;
            if (effect2 == null || (num = this.f171471a.get(effect2.getId())) == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76400e
        /* renamed from: a */
        public final void mo120044a(List<? extends Effect> list) {
            C89219l.m154721d(list, "");
            if (list.isEmpty()) {
                this.f171471a.clear();
                return;
            }
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                this.f171471a.put(t.getId(), Integer.valueOf(i));
                i = i2;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: a */
    public final void mo120030a() {
        this.f171456j.setValue("");
        mo120032a((AbstractC76368m) AbstractC76368m.C76369a.f171554a);
    }

    /* renamed from: j */
    public final C75728c mo120042j() {
        C75728c cVar = this.f171452f;
        if (cVar == null) {
            return new C75728c(null, "", 0, null, null, 93);
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo120032a(AbstractC76368m mVar) {
        C89219l.m154721d(mVar, "");
        this.f171457t = mVar;
    }

    /* renamed from: b */
    public final void mo120034b(String str) {
        C89219l.m154721d(str, "");
        this.f171463z = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: a */
    public void mo120031a(C75728c cVar) {
        C89219l.m154721d(cVar, "");
        this.f171456j.setValue(cVar.f170142b);
        this.f171452f = cVar;
        this.f171453g = System.currentTimeMillis();
        this.f171593o.mo119291c().mo119453a(cVar);
    }

    /* renamed from: a */
    static void m133783a(Effect effect, List<Effect> list) {
        if (effect != null) {
            Iterator<T> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (C89219l.m154714a((Object) it.next().getEffectId(), (Object) effect.getEffectId())) {
                    list.remove(i);
                    list.add(0, effect);
                    return;
                }
                i++;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchStickerViewModel(final AbstractC1204m mVar, final AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar) {
        super(mVar, oVar, dVar, gVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
        C1213t<C76363k> tVar = new C1213t<>();
        this.f171447a = tVar;
        C1213t<C89378p<String, List<String>>> tVar2 = new C1213t<>();
        this.f171448b = tVar2;
        C1213t<AbstractC76337f> tVar3 = new C1213t<>();
        this.f171449c = tVar3;
        C1213t<C76332d> tVar4 = new C1213t<>();
        this.f171450d = tVar4;
        this.f171458u = tVar;
        this.f171459v = tVar2;
        this.f171460w = tVar3;
        this.f171461x = tVar4;
        this.f171462y = this.f171455i;
        this.f171463z = "";
        oVar.mo119291c().mo119464j().mo119474f().observe(mVar, new AbstractC1214u<C35324a<SearchEffectResponseV2>>(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel.C763231 */

            /* renamed from: a */
            final /* synthetic */ SearchStickerViewModel f171464a;

            static {
                Covode.recordClassIndex(89277);
            }

            {
                this.f171464a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C35324a<SearchEffectResponseV2> aVar) {
                int i;
                Object obj;
                String str;
                int i2;
                Boolean bool;
                String str2;
                SearchEffectModel data;
                SearchEffectModel data2;
                List<Effect> effectList;
                SearchEffectModel data3;
                String search_id;
                List<Effect> list;
                SearchEffectModel data4;
                String search_id2;
                Boolean bool2;
                String str3;
                String str4;
                String str5;
                Boolean bool3;
                String str6;
                SearchEffectModel data5;
                C35324a<SearchEffectResponseV2> aVar2 = aVar;
                SearchStickerViewModel searchStickerViewModel = this.f171464a;
                String str7 = "";
                C89219l.m154716b(aVar2, str7);
                C35324a.EnumC35325a aVar3 = aVar2.f83351b;
                if (aVar3 != null) {
                    int i3 = C76373o.f171560c[aVar3.ordinal()];
                    if (i3 == 1) {
                        i = 1;
                    } else if (i3 == 2) {
                        i = 0;
                    }
                    AbstractC84433b bVar = C84401c.f188721e;
                    EnumC84434c cVar = EnumC84434c.SEARCH_PROP;
                    JSONObject jSONObject = new JSONObject();
                    M m = aVar2.f83350a;
                    if (m != null) {
                        obj = Integer.valueOf(m.status_code);
                    } else {
                        obj = str7;
                    }
                    jSONObject.put("error_code", obj);
                    M m2 = aVar2.f83350a;
                    if (m2 == null || (str = m2.message) == null) {
                        str = str7;
                    }
                    jSONObject.put("error_desc", str);
                    jSONObject.put("duration", System.currentTimeMillis() - searchStickerViewModel.f171453g);
                    M m3 = aVar2.f83350a;
                    if (!(m3 == null || (data3 = m3.getData()) == null || (search_id = data3.getSearch_id()) == null)) {
                        str7 = search_id;
                    }
                    jSONObject.put("search_id", str7);
                    M m4 = aVar2.f83350a;
                    if (m4 == null || (data2 = m4.getData()) == null || (effectList = data2.getEffectList()) == null) {
                        i2 = 0;
                    } else {
                        i2 = effectList.size();
                    }
                    jSONObject.put("effect_size", i2);
                    M m5 = aVar2.f83350a;
                    if (m5 == null || (data = m5.getData()) == null) {
                        bool = null;
                    } else {
                        bool = data.getUse_hot();
                    }
                    if (C89219l.m154714a((Object) bool, (Object) true)) {
                        str2 = "recommend";
                    } else {
                        str2 = "search";
                    }
                    jSONObject.put("search_method", str2);
                    bVar.mo61817a(cVar, i, jSONObject);
                }
                C35324a.EnumC35325a aVar4 = aVar2.f83351b;
                if (aVar4 != null) {
                    int i4 = C76373o.f171558a[aVar4.ordinal()];
                    if (i4 == 1) {
                        searchStickerViewModel.f171591m.setValue(EnumC85026a.LOADING);
                    } else if (i4 == 2) {
                        searchStickerViewModel.f171591m.setValue(EnumC85026a.ERROR);
                    } else if (i4 == 3) {
                        M m6 = aVar2.f83350a;
                        if (m6 == null || (data5 = m6.getData()) == null) {
                            list = null;
                        } else {
                            list = data5.getEffectList();
                        }
                        String str8 = "0";
                        if (m6 == null || list == null || list.isEmpty()) {
                            searchStickerViewModel.f171591m.setValue(EnumC85026a.ERROR);
                            C75728c cVar2 = searchStickerViewModel.f171452f;
                            if (cVar2 != null) {
                                if (!(m6 == null || (data4 = m6.getData()) == null || (search_id2 = data4.getSearch_id()) == null)) {
                                    str8 = search_id2;
                                }
                                searchStickerViewModel.f171449c.setValue(new AbstractC76337f.C76340c("", cVar2.f170142b, str8, "0", String.valueOf(System.currentTimeMillis() - searchStickerViewModel.f171453g)));
                                return;
                            }
                            return;
                        }
                        searchStickerViewModel.f171591m.setValue(EnumC85026a.NONE);
                        Effect f = searchStickerViewModel.f171593o.mo119294f();
                        List<? extends Effect> g = C89070n.m154585g((Collection) list);
                        SearchStickerViewModel.m133783a(f, (List<Effect>) g);
                        searchStickerViewModel.mo120112a(g);
                        SearchEffectModel data6 = m6.getData();
                        if (data6 != null) {
                            bool2 = data6.getUse_hot();
                        } else {
                            bool2 = null;
                        }
                        if (C89219l.m154714a((Object) bool2, (Object) true)) {
                            C1213t<C76363k> tVar = searchStickerViewModel.f171447a;
                            SearchEffectModel data7 = m6.getData();
                            if (data7 == null || (str6 = data7.getSearch_id()) == null) {
                                str6 = str8;
                            }
                            tVar.setValue(new C76363k(true, g, str6));
                            searchStickerViewModel.mo120032a((AbstractC76368m) AbstractC76368m.C76371c.f171556a);
                        } else {
                            C1213t<C76363k> tVar2 = searchStickerViewModel.f171447a;
                            SearchEffectModel data8 = m6.getData();
                            if (data8 == null || (str3 = data8.getSearch_id()) == null) {
                                str3 = str8;
                            }
                            tVar2.setValue(new C76363k(false, g, str3));
                            searchStickerViewModel.mo120032a((AbstractC76368m) AbstractC76368m.C76370b.f171555a);
                        }
                        C75728c cVar3 = searchStickerViewModel.f171452f;
                        if (cVar3 != null) {
                            if (cVar3.f170146f) {
                                str4 = "search_rec";
                            } else {
                                str4 = "search_sug";
                            }
                            SearchEffectModel data9 = m6.getData();
                            if (data9 == null || (str5 = data9.getSearch_id()) == null) {
                                str5 = str8;
                            }
                            SearchEffectModel data10 = m6.getData();
                            if (data10 != null) {
                                bool3 = data10.getUse_hot();
                            } else {
                                bool3 = null;
                            }
                            if (!C89219l.m154714a((Object) bool3, (Object) true)) {
                                str8 = "1";
                            }
                            searchStickerViewModel.f171449c.setValue(new AbstractC76337f.C76340c(str4, cVar3.f170142b, str5, str8, String.valueOf(System.currentTimeMillis() - searchStickerViewModel.f171453g)));
                        }
                        SearchEffectModel data11 = m6.getData();
                        if (data11 != null) {
                            data11.setEffectList(g);
                        }
                    }
                }
            }
        });
        oVar.mo119291c().mo119464j().mo119475g().observe(mVar, new AbstractC1214u<C35324a<RecommendSearchWordsResponse>>(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel.C763242 */

            /* renamed from: a */
            final /* synthetic */ SearchStickerViewModel f171465a;

            static {
                Covode.recordClassIndex(89278);
            }

            {
                this.f171465a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C35324a<RecommendSearchWordsResponse> aVar) {
                int i;
                Integer num;
                String str;
                int i2;
                RecommendSearchWordsModel data;
                List<EffectNameModel> effects;
                RecommendSearchWordsModel data2;
                List<EffectNameModel> effects2;
                RecommendSearchWordsModel data3;
                C35324a<RecommendSearchWordsResponse> aVar2 = aVar;
                SearchStickerViewModel searchStickerViewModel = this.f171465a;
                if (aVar2 != null) {
                    C35324a.EnumC35325a aVar3 = aVar2.f83351b;
                    if (aVar3 != null) {
                        int i3 = C76373o.f171561d[aVar3.ordinal()];
                        if (i3 == 1) {
                            i = 1;
                        } else if (i3 == 2) {
                            i = 0;
                        }
                        AbstractC84433b bVar = C84401c.f188721e;
                        EnumC84434c cVar = EnumC84434c.SEARCH_PROP_RECOMMEND_LIST;
                        JSONObject jSONObject = new JSONObject();
                        M m = aVar2.f83350a;
                        if (m != null) {
                            num = Integer.valueOf(m.getStatus_code());
                        } else {
                            num = "";
                        }
                        jSONObject.put("error_code", num);
                        M m2 = aVar2.f83350a;
                        if (m2 == null || (str = m2.getMessage()) == null) {
                            str = "";
                        }
                        jSONObject.put("error_desc", str);
                        M m3 = aVar2.f83350a;
                        if (m3 == null || (data = m3.getData()) == null || (effects = data.getEffects()) == null) {
                            i2 = 0;
                        } else {
                            i2 = effects.size();
                        }
                        jSONObject.put("recommendation_list_count", i2);
                        jSONObject.put("duration", System.currentTimeMillis() - searchStickerViewModel.f171454h);
                        bVar.mo61817a(cVar, i, jSONObject);
                    }
                    C35324a.EnumC35325a aVar4 = aVar2.f83351b;
                    if (aVar4 != null && C76373o.f171559b[aVar4.ordinal()] == 1) {
                        M m4 = aVar2.f83350a;
                        ArrayList arrayList = null;
                        String search_tips = (m4 == null || (data3 = m4.getData()) == null) ? null : data3.getSearch_tips();
                        M m5 = aVar2.f83350a;
                        if (!(m5 == null || (data2 = m5.getData()) == null || (effects2 = data2.getEffects()) == null)) {
                            ArrayList arrayList2 = new ArrayList();
                            for (T t : effects2) {
                                String name = t.getName();
                                if (!(name == null || name.length() == 0)) {
                                    arrayList2.add(t);
                                }
                            }
                            ArrayList<T> arrayList3 = arrayList2;
                            ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList3, 10));
                            for (T t2 : arrayList3) {
                                String name2 = t2.getName();
                                if (name2 == null) {
                                    name2 = "";
                                }
                                arrayList4.add(name2);
                            }
                            arrayList = arrayList4;
                        }
                        if (!(search_tips == null || search_tips.length() == 0 || arrayList == null || arrayList.isEmpty())) {
                            searchStickerViewModel.f171448b.setValue(C89387v.m154943a(search_tips, arrayList));
                            searchStickerViewModel.f171451e = true;
                        }
                    }
                }
            }
        });
        oVar.mo119291c().mo119464j().mo119469b().observe(mVar, new AbstractC1214u<C35324a<PanelInfoModel>>(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel.C763253 */

            /* renamed from: a */
            final /* synthetic */ SearchStickerViewModel f171466a;

            static {
                Covode.recordClassIndex(89279);
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel$3$a */
            public static final class C76326a implements AbstractC1214u<C35324a<CategoryEffectModel>> {

                /* renamed from: a */
                final /* synthetic */ CategoryEffectModel f171469a;

                /* renamed from: b */
                final /* synthetic */ C763253 f171470b;

                static {
                    Covode.recordClassIndex(89280);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(C35324a<CategoryEffectModel> aVar) {
                    M m;
                    C35324a<CategoryEffectModel> aVar2 = aVar;
                    if (aVar2 != null && (m = aVar2.f83350a) != null) {
                        oVar.mo119291c().mo119464j().mo119465a(this.f171469a.getCategoryKey(), true).removeObserver(this);
                        SearchStickerViewModel searchStickerViewModel = this.f171470b.f171466a;
                        C89219l.m154716b(m, "");
                        C89219l.m154721d(m, "");
                        List<Effect> effects = m.getEffects();
                        if (effects != null && !effects.isEmpty()) {
                            searchStickerViewModel.f171450d.setValue(new C76332d(effects));
                        }
                    }
                }

                C76326a(CategoryEffectModel categoryEffectModel, C763253 r2) {
                    this.f171469a = categoryEffectModel;
                    this.f171470b = r2;
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C35324a<PanelInfoModel> aVar) {
                M m;
                CategoryEffectModel categoryEffectModel;
                String categoryKey;
                C35324a<PanelInfoModel> aVar2 = aVar;
                if (aVar2 != null && (m = aVar2.f83350a) != null && (categoryEffectModel = m.getCategoryEffectModel()) != null && (categoryKey = categoryEffectModel.getCategoryKey()) != null && categoryKey.length() != 0 && categoryEffectModel != null) {
                    oVar.mo119291c().mo119464j().mo119469b().removeObserver(this);
                    oVar.mo119291c().mo119464j().mo119465a(categoryEffectModel.getCategoryKey(), true).observe(mVar, new C76326a(categoryEffectModel, this));
                }
            }

            {
                this.f171466a = r1;
            }
        });
        this.f171593o.mo119291c().mo119451a();
        this.f171454h = System.currentTimeMillis();
    }
}
