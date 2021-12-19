package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.ext.list.AbstractC20427a;
import com.bytedance.jedi.arch.ext.list.p1464a.C20431b;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41611ag;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41615ah;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41786k;
import com.p2082ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p2082ss.android.ugc.aweme.discover.mob.AbstractC42448c;
import com.p2082ss.android.ugc.aweme.discover.model.CardType;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60830h;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import com.p2082ss.android.ugc.aweme.search.p3686d.C67365d;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67461a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67582x;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67584y;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ae */
public final class C41605ae extends AbstractC41742q<SearchMusic> implements AbstractC20427a<SearchMusic>, C41611ag.AbstractC41614b, AbstractC41728j {

    /* renamed from: g */
    public static final C41606a f97037g = new C41606a((byte) 0);

    /* renamed from: h */
    private final C41610af f97038h;

    /* renamed from: i */
    private C67568r f97039i;

    /* renamed from: j */
    private final C20431b<SearchMusic> f97040j;

    /* renamed from: k */
    private final MusicPlayHelper f97041k;

    static {
        Covode.recordClassIndex(49518);
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final void mo33763a(List<? extends SearchMusic> list, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(list, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ae$a */
    public static final class C41606a {
        static {
            Covode.recordClassIndex(49519);
        }

        private C41606a() {
        }

        public /* synthetic */ C41606a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ae$b */
    public static final class C41607b extends C1445j.AbstractC1451e<SearchMusic> {
        static {
            Covode.recordClassIndex(49520);
        }

        C41607b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
        /* renamed from: a */
        public final /* synthetic */ boolean mo4953a(SearchMusic searchMusic, SearchMusic searchMusic2) {
            C89219l.m154721d(searchMusic, "");
            C89219l.m154721d(searchMusic2, "");
            return false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
        /* renamed from: b */
        public final /* synthetic */ boolean mo4954b(SearchMusic searchMusic, SearchMusic searchMusic2) {
            C89219l.m154721d(searchMusic, "");
            C89219l.m154721d(searchMusic2, "");
            return false;
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final C20431b<SearchMusic> mo33761a() {
        return this.f97040j;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final int getItemCount() {
        return super.getItemCount();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void ap_() {
        super.ap_();
        new C67584y().mo106459o("music_search_result").mo96792f();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ae$c */
    public static final class C41608c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f97042a;

        static {
            Covode.recordClassIndex(49521);
        }

        C41608c(C89233z.C89238e eVar) {
            this.f97042a = eVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C60830h.C60831a a = C60830h.m110432a(this.f97042a.element);
            a.mo98236a("enter_from", "music_search_result");
            C36125t.m73598a(C36125t.m73591a(), a.mo98235a().toString());
            new C67582x().mo106459o("music_search_result").mo96792f();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ SearchMusic mo33762a(int i) {
        return AbstractC20427a.C20428a.m38638a((AbstractC20427a) this, i, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<? extends SearchMusic> list) {
        MusicPlayHelper musicPlayHelper = this.f97041k;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo71126a();
        }
        C67365d dVar = this.f97370f;
        if (dVar != null) {
            dVar.f150937a = Integer.MIN_VALUE;
        }
        super.mo62377b_(this.f97038h.mo70829a(list));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.C41611ag.AbstractC41614b
    /* renamed from: a */
    public final void mo70826a(C41720f fVar) {
        C89219l.m154721d(fVar, "");
        List list = this.f92236l;
        C89219l.m154721d(fVar, "");
        List<Music> clusterList = fVar.getClusterList();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) clusterList, 10));
        Iterator<T> it = clusterList.iterator();
        while (it.hasNext()) {
            SearchMusic searchMusic = new SearchMusic();
            searchMusic.setMusic(it.next());
            arrayList.add(searchMusic);
        }
        List g = C89070n.m154585g((Collection) arrayList);
        int indexOf = list.indexOf(fVar);
        if (indexOf >= 0) {
            list.remove(fVar);
            notifyItemRemoved(indexOf);
            list.addAll(indexOf, g);
            notifyItemRangeInserted(indexOf, g.size());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b */
    public final void mo62376b(List<? extends SearchMusic> list) {
        C41610af afVar = this.f97038h;
        List<SearchMusic> list2 = this.f92236l;
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            int indexOf = list.indexOf(C89070n.m154586h((List) afVar.f97044a));
            if (indexOf < list.size() - 1) {
                if (indexOf <= 0) {
                    afVar.mo70830b(list);
                } else {
                    list2 = afVar.mo70829a(list.subList(indexOf + 1, list.size()));
                    list2.addAll(0, list2);
                    afVar.mo70830b(list);
                }
            }
            list = list2;
        } else if (list != null) {
            afVar.mo70830b(list);
        } else {
            list = null;
        }
        super.mo62376b(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: c */
    public final int mo60936c(int i) {
        Object obj = this.f92236l.get(i);
        C89219l.m154716b(obj, "");
        if (C41610af.m83559a((SearchMusic) obj)) {
            return 17;
        }
        if (((SearchMusic) this.f92236l.get(i)).getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
            return 18;
        }
        if (((SearchMusic) this.f92236l.get(i)).getCardType() == CardType.TYPE_TRENDING_SOUNDS_TITLE.getValue()) {
            return 20;
        }
        if (((SearchMusic) this.f92236l.get(i)).getMusic() != null || ((SearchMusic) this.f92236l.get(i)).getMusicList() != null) {
            return 16;
        }
        if (((SearchMusic) this.f92236l.get(i)).getCardType() == CardType.TYPE_USER_NOTE.getValue()) {
            return 19;
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41728j
    /* renamed from: a */
    public final int mo70825a(Music music) {
        C89219l.m154721d(music, "");
        if (C13603b.m24435a((Collection) this.f92236l)) {
            return -1;
        }
        int i = -1;
        for (SearchMusic searchMusic : this.f92236l) {
            if (music == searchMusic.getMusic()) {
                return i + 1;
            }
            if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue() && !C13603b.m24435a((Collection) searchMusic.getMusicList())) {
                List<Music> musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    C89219l.m154715b();
                }
                if (music == C89070n.m154579f((List) musicList)) {
                    return i + 1;
                }
            }
            C89219l.m154716b(searchMusic, "");
            if (!C41610af.m83559a(searchMusic)) {
                if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
                    if (!C13603b.m24435a((Collection) searchMusic.getMusicList())) {
                        List<Music> musicList2 = searchMusic.getMusicList();
                        if (musicList2 == null) {
                            C89219l.m154715b();
                        }
                        i += musicList2.size();
                    }
                    if (!searchMusic.getHasMore()) {
                    }
                }
                i++;
            }
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        boolean z;
        MethodCollector.m26663i(8886);
        C89219l.m154721d(viewGroup, "");
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean showMusicFeedbackEntrance = iESSettingsProxy.getShowMusicFeedbackEntrance();
            C89219l.m154716b(showMusicFeedbackEntrance, "");
            z = showMusicFeedbackEntrance.booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = "";
            try {
                IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy2, "");
                FeConfigCollection feConfigCollection = iESSettingsProxy2.getFeConfigCollection();
                C89219l.m154716b(feConfigCollection, "");
                FEConfig musicFaq = feConfigCollection.getMusicFaq();
                C89219l.m154716b(musicFaq, "");
                T t = (T) musicFaq.getSchema();
                C89219l.m154716b(t, "");
                eVar.element = t;
            } catch (Exception unused2) {
            }
            SpannableString spannableString = new SpannableString("");
            spannableString.setSpan(new C41608c(eVar), 9, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(viewGroup.getContext(), R.color.al)), 9, spannableString.length(), 33);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bif, (ViewGroup) null);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setTextColor(C0643b.m2378c(viewGroup.getContext(), R.color.c5));
                textView.setPadding(0, 20, 0, 0);
                View view = a_.itemView;
                if (view != null) {
                    DmtStatusView dmtStatusView = (DmtStatusView) view;
                    dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(textView));
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
                    MethodCollector.m26664o(8886);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.m26664o(8886);
                throw nullPointerException2;
            }
        }
        C89219l.m154716b(a_, "");
        MethodCollector.m26664o(8886);
        return a_;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ae$d */
    public static final class C41609d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f97043a;

        static {
            Covode.recordClassIndex(49522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41609d(ViewGroup viewGroup, View view) {
            super(view);
            this.f97043a = viewGroup;
        }
    }

    public /* synthetic */ C41605ae(C67678d dVar, AbstractC57066a.AbstractC57068b bVar) {
        this(null, dVar, bVar, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        MethodCollector.m26663i(8735);
        C89219l.m154721d(viewGroup, "");
        switch (i) {
            case 16:
                String l = mo70924l();
                C89219l.m154716b(l, "");
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(l, "");
                C89219l.m154721d(this, "");
                C41618ai a = C41618ai.C41623a.m83582a(viewGroup, this);
                C89219l.m154721d(l, "");
                a.f97061g = l;
                a.mo70820b("search_result");
                MethodCollector.m26664o(8735);
                return a;
            case 17:
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(this, "");
                View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.av1, viewGroup, false);
                C89219l.m154716b(a2, "");
                C41611ag agVar = new C41611ag(a2, this);
                MethodCollector.m26664o(8735);
                return agVar;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(this, "");
                View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aw3, viewGroup, false);
                C89219l.m154716b(a3, "");
                C41632aj ajVar = new C41632aj(a3, this);
                MethodCollector.m26664o(8735);
                return ajVar;
            case 19:
                C41615ah a4 = C41615ah.C41616a.m83569a(viewGroup);
                MethodCollector.m26664o(8735);
                return a4;
            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                RecyclerView.ViewHolder a5 = C41786k.C41787a.m83739a(viewGroup);
                MethodCollector.m26664o(8735);
                return a5;
            default:
                C41609d dVar = new C41609d(viewGroup, new View(viewGroup.getContext()));
                MethodCollector.m26664o(8735);
                return dVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41742q, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        List<Music> musicList;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        MethodCollector.m26663i(8882);
        C89219l.m154721d(viewHolder, "");
        try {
            if (viewHolder instanceof AbstractC67566p) {
                AbstractC67566p pVar = (AbstractC67566p) viewHolder;
                Object obj = this.f92236l.get(i);
                C89219l.m154716b(obj, "");
                SearchMusic searchMusic = (SearchMusic) obj;
                C89219l.m154721d(searchMusic, "");
                C67568r rVar = this.f97039i;
                if (rVar == null) {
                    AbstractC67567q a = C67486am.m119564a();
                    if (a != null) {
                        str2 = a.mo106431c().f151151a;
                        str3 = a.mo106431c().f151152b;
                        i2 = a.mo106426a();
                    } else {
                        str2 = "";
                        str3 = str2;
                        i2 = 0;
                    }
                    LogPbBean logPb = searchMusic.getLogPb();
                    if (logPb == null) {
                        logPb = new LogPbBean();
                    }
                    LogPbBean logPb2 = searchMusic.getLogPb();
                    if (logPb2 == null || (str4 = logPb2.getImprId()) == null) {
                        str4 = "";
                    }
                    String b = C48027ac.C48028a.f111257a.mo80057b(str4);
                    C67678d dVar = this.f97368d;
                    C89219l.m154716b(dVar, "");
                    dVar.getEnterMethod();
                    String a2 = AbstractC42448c.AbstractC42450b.C42451a.m84856a(1);
                    String a3 = AbstractC42448c.C42449a.m84855a(1);
                    C67568r g = C67568r.C67569a.m119673a().mo106518g("search_result");
                    g.f151306a = false;
                    C67568r i3 = g.mo106519h(str2).mo106520i(str4);
                    C89219l.m154716b(b, "");
                    C67568r a4 = i3.mo106521j(b).mo106507a(logPb);
                    a4.f151307b = i2;
                    a4.f151318m = i;
                    C67568r f = a4.mo106517f(str3);
                    f.f151308c = 1;
                    rVar = f.mo106515d(a2).mo106516e(a3);
                }
                pVar.mo70880a(rVar);
            }
            if (viewHolder instanceof C41618ai) {
                Music music = ((SearchMusic) this.f92236l.get(i)).getMusic();
                String l = mo70924l();
                C89219l.m154716b(l, "");
                ((C41618ai) viewHolder).mo70818a(music, l);
            } else if (viewHolder instanceof C41611ag) {
                C41611ag agVar = (C41611ag) viewHolder;
                SearchMusic searchMusic2 = (SearchMusic) this.f92236l.get(i);
                String l2 = mo70924l();
                C89219l.m154716b(l2, "");
                C89219l.m154721d(l2, "");
                if (searchMusic2 instanceof C41720f) {
                    int size = ((C41720f) searchMusic2).getClusterList().size();
                    View view = agVar.itemView;
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    String string = context.getResources().getString(R.string.fg4);
                    C89219l.m154716b(string, "");
                    TextView textView = agVar.f97046a;
                    String a5 = C1764a.m5928a(string, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    C89219l.m154716b(a5, "");
                    textView.setText(a5);
                    agVar.f97047b = (C41720f) searchMusic2;
                    agVar.f97048c = l2;
                    if (!((C41720f) searchMusic2).isMobShowSent()) {
                        agVar.mo70831a("matched_sounds_show", (C41720f) searchMusic2);
                        ((C41720f) searchMusic2).setMobShowSent(true);
                    }
                }
            } else if (viewHolder instanceof C41632aj) {
                C41632aj ajVar = (C41632aj) viewHolder;
                SearchMusic searchMusic3 = (SearchMusic) this.f92236l.get(i);
                String l3 = mo70924l();
                C89219l.m154716b(l3, "");
                C89219l.m154721d(l3, "");
                if (!(searchMusic3 == null || (musicList = searchMusic3.getMusicList()) == null || C13603b.m24435a((Collection) musicList))) {
                    ajVar.f97105f = searchMusic3;
                    ajVar.f97106g = l3;
                    TextView textView2 = ajVar.f97100a;
                    String string2 = ajVar.mo70878G().getString(R.string.dar, ((Music) C89070n.m154579f((List) musicList)).getAuthorName());
                    C89219l.m154716b(string2, "");
                    String a6 = C1764a.m5928a(string2, Arrays.copyOf(new Object[0], 0));
                    C89219l.m154716b(a6, "");
                    textView2.setText(a6);
                    ajVar.f97101b.removeAllViews();
                    Iterator<T> it = musicList.iterator();
                    while (it.hasNext()) {
                        C41618ai a7 = C41618ai.C41623a.m83582a(ajVar.f97101b, ajVar);
                        a7.mo70820b("search_result");
                        a7.mo70880a(ajVar.mo70877F());
                        a7.mo70818a(it.next(), l3);
                        ajVar.f97101b.addView(a7.mo70834I());
                    }
                    int i4 = 8;
                    if (searchMusic3.getHasMore()) {
                        ajVar.f97102c.setVisibility(0);
                        ajVar.f97104e.setVisibility(8);
                    } else {
                        ajVar.f97102c.setVisibility(8);
                        ajVar.f97104e.setVisibility(0);
                    }
                    View view2 = ajVar.f97103d;
                    if (!(ajVar.getAdapterPosition() == 0 || ajVar.getAdapterPosition() == 1)) {
                        i4 = 0;
                    }
                    view2.setVisibility(i4);
                    if (!searchMusic3.getHasMobShow()) {
                        C67461a aVar = (C67461a) new C67461a().mo106459o("search_result");
                        SearchMusic searchMusic4 = ajVar.f97105f;
                        if (searchMusic4 == null) {
                            C89219l.m154715b();
                        }
                        List<Music> musicList2 = searchMusic4.getMusicList();
                        if (musicList2 == null) {
                            C89219l.m154715b();
                        }
                        C67461a aVar2 = (C67461a) aVar.mo106452c("music_num", String.valueOf(musicList2.size()));
                        SearchMusic searchMusic5 = ajVar.f97105f;
                        if (searchMusic5 == null) {
                            C89219l.m154715b();
                        }
                        C67461a aVar3 = (C67461a) aVar2.mo106452c("music_list", C41632aj.m83585a(searchMusic5));
                        SearchMusic searchMusic6 = ajVar.f97105f;
                        if (searchMusic6 == null) {
                            C89219l.m154715b();
                        }
                        if (searchMusic6.getHasMore()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        C67461a aVar4 = (C67461a) ((C67461a) aVar3.mo106452c("is_more_sounds", str)).mo106482b(ajVar.f97106g);
                        C48027ac acVar = C48027ac.C48028a.f111257a;
                        SearchMusic searchMusic7 = ajVar.f97105f;
                        if (searchMusic7 == null) {
                            C89219l.m154715b();
                        }
                        List<Music> musicList3 = searchMusic7.getMusicList();
                        if (musicList3 == null) {
                            C89219l.m154715b();
                        }
                        ((C67461a) aVar4.mo106483c(acVar.mo80055a(musicList3.get(0).getRequestId()))).mo96792f();
                        searchMusic3.setHasMobShow(true);
                    }
                }
            } else if (viewHolder instanceof C41615ah) {
                ((C41615ah) viewHolder).mo60336a();
            }
            C67365d dVar2 = this.f97370f;
            if (dVar2 != null) {
                dVar2.mo106288a(i, mo60933c());
                MethodCollector.m26664o(8882);
                return;
            }
            MethodCollector.m26664o(8882);
        } catch (Throwable th) {
            C67365d dVar3 = this.f97370f;
            if (dVar3 != null) {
                dVar3.mo106288a(i, mo60933c());
            }
            MethodCollector.m26664o(8882);
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41605ae(MusicPlayHelper musicPlayHelper, C67678d dVar, AbstractC57066a.AbstractC57068b bVar, AbstractC67363b bVar2) {
        super(dVar, bVar, bVar2);
        C89219l.m154721d(bVar, "");
        this.f97041k = musicPlayHelper;
        this.f97038h = new C41610af();
        this.f97040j = new C20431b<>(this, new C41607b(), (byte) 0);
    }
}
