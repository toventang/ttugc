package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.p2636h.C39127c;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2762a.AbstractC41595a;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2762a.AbstractC41596b;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42024k;
import com.p2082ss.android.ugc.aweme.discover.helper.C41981ac;
import com.p2082ss.android.ugc.aweme.discover.helper.C42014f;
import com.p2082ss.android.ugc.aweme.discover.helper.C42043p;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42314a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41898d;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.discover.p2787m.C42292a;
import com.p2082ss.android.ugc.aweme.metrics.C59248m;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicTag;
import com.p2082ss.android.ugc.aweme.music.service.IMusicService;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.C67361d;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67498at;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67511b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67515bb;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67548g;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67552i;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.utils.C80457fu;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai */
public final class C41618ai extends AbstractView$OnAttachStateChangeListenerC41671b implements AbstractC34186b.AbstractC34192d, C39127c.AbstractC39131d, AbstractC41595a, AbstractC41596b {

    /* renamed from: p */
    public static final C41623a f97054p = new C41623a((byte) 0);

    /* renamed from: a */
    public final ImageView f97055a;

    /* renamed from: b */
    public final FrameLayout f97056b;

    /* renamed from: c */
    public Music f97057c;

    /* renamed from: d */
    public String f97058d;

    /* renamed from: e */
    public C41898d f97059e;

    /* renamed from: f */
    public C42043p f97060f;

    /* renamed from: g */
    public String f97061g;

    /* renamed from: h */
    public boolean f97062h;

    /* renamed from: i */
    public C42314a f97063i;

    /* renamed from: m */
    public int f97064m;

    /* renamed from: n */
    public final AbstractC41624b f97065n = null;

    /* renamed from: o */
    public final AbstractC41728j f97066o;

    /* renamed from: q */
    private final AbstractC89244h f97067q;

    /* renamed from: r */
    private final SmartRoundImageView f97068r;

    /* renamed from: s */
    private final ImageView f97069s;

    /* renamed from: t */
    private final TextView f97070t;

    /* renamed from: u */
    private final TextView f97071u;

    /* renamed from: v */
    private final TextView f97072v;

    /* renamed from: w */
    private final TextView f97073w;

    /* renamed from: x */
    private final RecyclerView f97074x;

    /* renamed from: y */
    private AbstractC42024k f97075y;

    /* renamed from: z */
    private C42014f f97076z;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai$b */
    public interface AbstractC41624b {
        static {
            Covode.recordClassIndex(49537);
        }
    }

    static {
        Covode.recordClassIndex(49531);
    }

    /* renamed from: g */
    private final AbstractC41955b m83572g() {
        return (AbstractC41955b) this.f97067q.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai$a */
    public static final class C41623a {
        static {
            Covode.recordClassIndex(49536);
        }

        private C41623a() {
        }

        public /* synthetic */ C41623a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C41618ai m83582a(ViewGroup viewGroup, AbstractC41728j jVar) {
            C89219l.m154721d(viewGroup, "");
            return new C41618ai(C67641m.m119786a(viewGroup, R.layout.av0), jVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return this.itemView;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    /* renamed from: I */
    public final View mo70834I() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai$c */
    static final class RunnableC41625c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C41618ai f97089a;

        static {
            Covode.recordClassIndex(49538);
        }

        RunnableC41625c(C41618ai aiVar) {
            this.f97089a = aiVar;
        }

        public final void run() {
            C42043p pVar = this.f97089a.f97060f;
            if (pVar != null) {
                pVar.f98018b = this.f97089a.mo70877F();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai$h */
    public static final class C41630h implements C42014f.AbstractC42017c {

        /* renamed from: a */
        final /* synthetic */ C41618ai f97097a;

        static {
            Covode.recordClassIndex(49543);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42014f.AbstractC42017c
        /* renamed from: a */
        public final List<C67361d> mo70843a() {
            Music music = this.f97097a.f97057c;
            if (music != null) {
                return music.getHighlightInfoList();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41630h(C41618ai aiVar) {
            this.f97097a = aiVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42014f.AbstractC42017c
        /* renamed from: a */
        public final List<Object> mo70844a(String str, String str2, Position position) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(position, "");
            int hashCode = str2.hashCode();
            if (hashCode != 1257385826) {
                if (hashCode != 1257679708 || !str2.equals("search_music_name")) {
                    return null;
                }
                View view = this.f97097a.itemView;
                C89219l.m154716b(view, "");
                return C89070n.m154524c(new C42292a(C17300a.m32029a().mo27610a(C17303d.f41573g)), new ForegroundColorSpan(C0643b.m2378c(view.getContext(), R.color.bx)));
            } else if (!str2.equals("search_music_desc")) {
                return null;
            } else {
                View view2 = this.f97097a.itemView;
                C89219l.m154716b(view2, "");
                return C89070n.m154524c(new ForegroundColorSpan(C0643b.m2378c(view2.getContext(), R.color.bx)), new C42292a(C17300a.m32029a().mo27610a(C17303d.f41573g)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai$i */
    static final class C41631i extends AbstractC89220m implements AbstractC89171a<AbstractC41955b> {

        /* renamed from: a */
        public static final C41631i f97098a = new C41631i();

        static {
            Covode.recordClassIndex(49544);
        }

        C41631i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC41955b invoke() {
            return SearchServiceImpl.m119336t().mo106217f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        C41898d dVar = this.f97059e;
        if (dVar != null) {
            return dVar.mo71060b(this.f97057c);
        }
        return false;
    }

    /* renamed from: e */
    public final int mo70835e() {
        Music music;
        int a;
        AbstractC41728j jVar = this.f97066o;
        if (jVar == null || (music = this.f97057c) == null || (a = jVar.mo70825a(music)) < 0) {
            return getAdapterPosition();
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1.mo71131b(r2) != false) goto L_0x0026;
     */
    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bi_() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.discover.c.d r5 = r6.f97059e
            if (r5 == 0) goto L_0x002b
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r4 = r5.f97750a
            com.ss.android.ugc.aweme.music.model.Music r0 = r5.f97754e
            r2 = -1
            if (r0 == 0) goto L_0x002f
            long r0 = r0.getId()
        L_0x0010:
            boolean r0 = r4.mo71130a(r0)
            if (r0 != 0) goto L_0x0026
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r1 = r5.f97750a
            com.ss.android.ugc.aweme.music.model.Music r0 = r5.f97754e
            if (r0 == 0) goto L_0x0020
            long r2 = r0.getId()
        L_0x0020:
            boolean r0 = r1.mo71131b(r2)
            if (r0 == 0) goto L_0x002b
        L_0x0026:
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r5.f97750a
            r0.mo71126a()
        L_0x002b:
            r0 = 0
            r6.f97062h = r0
            return
        L_0x002f:
            r0 = -1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai.bi_():void");
    }

    /* renamed from: a */
    public final String mo60336a() {
        String str;
        String str2;
        String mid;
        if (C89219l.m154714a((Object) this.f97058d, (Object) "search_result")) {
            Music music = this.f97057c;
            if (music == null || (str = music.getMid()) == null) {
                return "";
            }
        } else if (!C89219l.m154714a((Object) this.f97058d, (Object) "general_search")) {
            return "";
        } else {
            C42314a aVar = this.f97063i;
            if (aVar != null) {
                str2 = aVar.getSearchResultId();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C42314a aVar2 = this.f97063i;
                if (aVar2 == null || (str = aVar2.getSearchResultId()) == null) {
                    return "";
                }
            } else {
                Music music2 = this.f97057c;
                if (music2 == null || (mid = music2.getMid()) == null) {
                    return "";
                }
                return mid;
            }
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai$f */
    static final class CallableC41628f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C41618ai f97092a;

        /* renamed from: b */
        final /* synthetic */ Music f97093b;

        /* renamed from: c */
        final /* synthetic */ C42314a f97094c;

        /* renamed from: d */
        final /* synthetic */ int f97095d;

        static {
            Covode.recordClassIndex(49541);
        }

        CallableC41628f(C41618ai aiVar, Music music, C42314a aVar, int i) {
            this.f97092a = aiVar;
            this.f97093b = music;
            this.f97094c = aVar;
            this.f97095d = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            List<MusicTag> list;
            String str2;
            String str3;
            String str4;
            User user;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String tokenType;
            User user2;
            C67498at a = C42317b.m84679a(this.f97092a.mo70877F());
            C42314a aVar = this.f97092a.f97063i;
            String str10 = null;
            if (aVar == null || (user2 = aVar.getUser()) == null) {
                str = null;
            } else {
                str = user2.getUniqueId();
            }
            a.mo106494u(str);
            GsonProvider c = GsonHolder.m138943c();
            String str11 = "";
            C89219l.m154716b(c, str11);
            C27910f b = c.mo123620b();
            Music music = this.f97092a.f97057c;
            if (music != null) {
                list = music.getMusicTags();
            } else {
                list = null;
            }
            a.mo106499z(b.mo46674b(list));
            String str12 = "search_result";
            if (this.f97093b.getSoundsListType() == 0) {
                C67540c x = a.mo106497x("music");
                Music music2 = this.f97092a.f97057c;
                if (music2 == null || (str5 = music2.getMid()) == null) {
                    str5 = str11;
                }
                String str13 = "0";
                C67540c a2 = ((C67542d) x.mo106487g(str5)).mo106496w(str13).mo106479a(Integer.valueOf(this.f97092a.mo70877F().f151318m));
                String str14 = this.f97092a.f97058d;
                if (str14 != null) {
                    str12 = str14;
                }
                C67540c cVar = (C67540c) a2.mo106459o(str12);
                C67568r F = this.f97092a.mo70877F();
                if (F != null) {
                    str6 = F.f151314i;
                } else {
                    str6 = null;
                }
                C67540c a3 = cVar.mo106480a(str6);
                C67568r F2 = this.f97092a.mo70877F();
                if (F2 != null) {
                    str7 = F2.f151317l;
                } else {
                    str7 = null;
                }
                a3.mo106483c(str7);
                if (C89219l.m154714a((Object) this.f97092a.f97058d, (Object) "general_search")) {
                    a.mo106498y(String.valueOf(this.f97092a.getAdapterPosition()));
                }
                if (C89219l.m154714a((Object) this.f97092a.f97058d, (Object) "general_search") && this.f97094c != null) {
                    C42314a aVar2 = this.f97092a.f97063i;
                    if (aVar2 == null || (str8 = aVar2.getSearchResultId()) == null) {
                        str8 = str11;
                    }
                    C67542d dVar = (C67542d) a.mo106487g(str8);
                    C42314a aVar3 = this.f97092a.f97063i;
                    if (aVar3 != null && aVar3.isAladdin()) {
                        str13 = "1";
                    }
                    C67542d dVar2 = (C67542d) dVar.mo106496w(str13).mo106479a(Integer.valueOf(this.f97092a.mo70877F().f151318m));
                    C42314a aVar4 = this.f97092a.f97063i;
                    if (!(aVar4 == null || (tokenType = aVar4.getTokenType()) == null)) {
                        str11 = tokenType;
                    }
                    C67542d dVar3 = (C67542d) ((C67542d) dVar2.mo106497x(str11)).mo106491r("top_music");
                    Music music3 = this.f97093b;
                    if (music3 != null) {
                        str9 = music3.getMid();
                    } else {
                        str9 = null;
                    }
                    C67542d dVar4 = (C67542d) dVar3.mo106495v(str9);
                    Music music4 = this.f97093b;
                    if (music4 != null) {
                        str10 = music4.getSearchMusicName();
                    }
                    ((C67542d) dVar4.mo106492s(str10)).mo106490d(Integer.valueOf(this.f97095d));
                }
            } else if (this.f97093b.getSoundsListType() == 2) {
                C67540c x2 = a.mo106497x("tiktok_playlist_search");
                String mid = this.f97093b.getMid();
                if (mid != null) {
                    str11 = mid;
                }
                C67540c a4 = x2.mo106487g(str11).mo106479a(Integer.valueOf(this.f97092a.mo70877F().f151318m));
                String str15 = this.f97092a.f97058d;
                if (str15 != null) {
                    str12 = str15;
                }
                ((C67542d) ((C67542d) ((C67542d) ((C67542d) ((C67540c) a4.mo106459o(str12)).mo106480a(this.f97092a.mo70877F().f151314i)).mo106491r("music")).mo106495v(this.f97093b.getMid())).mo106490d(Integer.valueOf(this.f97092a.getAdapterPosition()))).mo106492s(this.f97093b.getSearchMusicName());
            } else if (this.f97093b.getSoundsListType() == 3) {
                C42314a aVar5 = this.f97092a.f97063i;
                if (aVar5 != null) {
                    str4 = aVar5.getTokenType();
                } else {
                    str4 = null;
                }
                C67540c x3 = a.mo106497x(str4);
                C42314a aVar6 = this.f97092a.f97063i;
                if (!(aVar6 == null || (user = aVar6.getUser()) == null)) {
                    str10 = user.getUid();
                }
                ((C67542d) ((C67542d) ((C67542d) ((C67542d) ((C67540c) ((C67542d) x3.mo106487g(str10).mo106479a(Integer.valueOf(this.f97092a.mo70877F().f151318m)).mo106456l(this.f97092a.mo70877F().f151323r)).mo106493t(this.f97092a.mo70877F().f151324s).mo106459o(this.f97092a.f97058d)).mo106480a(this.f97092a.mo70877F().f151314i)).mo106491r("top_music")).mo106495v(this.f97093b.getMid())).mo106490d(Integer.valueOf(this.f97092a.getAdapterPosition()))).mo106492s(this.f97093b.getSearchMusicName());
            } else {
                C42410g gVar = (C42410g) this.f97093b.getExtraParamFromPretreatment().get(C42410g.class);
                if (gVar == null || (str2 = gVar.f98786b) == null) {
                    str2 = str11;
                }
                C67540c x4 = a.mo106497x(str2);
                if (!(gVar == null || (str3 = gVar.f98785a) == null)) {
                    str11 = str3;
                }
                C67540c a5 = x4.mo106487g(str11).mo106479a(Integer.valueOf(this.f97092a.mo70877F().f151318m));
                String str16 = this.f97092a.f97058d;
                if (str16 != null) {
                    str12 = str16;
                }
                ((C67542d) ((C67542d) ((C67542d) ((C67542d) ((C67540c) a5.mo106459o(str12)).mo106480a(this.f97092a.mo70877F().f151314i)).mo106491r("music")).mo106495v(this.f97093b.getMid())).mo106490d(Integer.valueOf(this.f97092a.getAdapterPosition()))).mo106492s(this.f97093b.getSearchMusicName());
            }
            a.mo96792f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai$e */
    public static final class View$OnClickListenerC41627e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41618ai f97091a;

        static {
            Covode.recordClassIndex(49540);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC41627e(C41618ai aiVar) {
            this.f97091a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f97091a.itemView.performClick();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai$d */
    static final class View$OnClickListenerC41626d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41618ai f97090a;

        static {
            Covode.recordClassIndex(49539);
        }

        View$OnClickListenerC41626d(C41618ai aiVar) {
            this.f97090a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f97090a.f97055a.performClick();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.p2762a.AbstractC41595a
    /* renamed from: b */
    public final void mo70820b(String str) {
        C89219l.m154721d(str, "");
        this.f97058d = str;
        C41898d dVar = this.f97059e;
        if (dVar != null) {
            dVar.mo71058a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public final void onViewAttachedToWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewAttachedToWindow(view);
        C34181a.m69857a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public final void onViewDetachedFromWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewDetachedFromWindow(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ai$g */
    public static final class C41629g extends AbstractC89220m implements AbstractC89172b<View, Integer> {

        /* renamed from: a */
        final /* synthetic */ C41618ai f97096a;

        static {
            Covode.recordClassIndex(49542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41629g(C41618ai aiVar) {
            super(1);
            this.f97096a = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(View view) {
            MethodCollector.m26663i(8207);
            View view2 = view;
            C89219l.m154721d(view2, "");
            this.f97096a.f97056b.addView(view2);
            Integer valueOf = Integer.valueOf(C80471gb.m139483a(this.f97096a.f97056b.getContext()) ? 1 : 0);
            MethodCollector.m26664o(8207);
            return valueOf;
        }
    }

    /* renamed from: a */
    private final void m83570a(Music music) {
        if (music.getSoundsListType() == 2) {
            if (this.f97075y == null) {
                this.f97075y = new C41981ac(new AbstractC42024k.C42026b(this.f97056b, new C41629g(this)));
            }
            AbstractC42024k kVar = this.f97075y;
            if (kVar == null) {
                C89219l.m154715b();
            }
            AbstractC42024k.C42025a aVar = new AbstractC42024k.C42025a();
            aVar.f97979a = ((Number) music.getExtraParamFromPretreatment().get("rank", (Object) -1)).intValue();
            kVar.mo71152a(aVar);
            return;
        }
        AbstractC42024k kVar2 = this.f97075y;
        if (kVar2 != null) {
            kVar2.mo71152a(new AbstractC42024k.C42025a());
        }
    }

    /* renamed from: b */
    private final void m83571b(Music music) {
        boolean z;
        if (music.getHighlightInfoList() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f97070t.setTypeface(C17300a.m32029a().mo27610a(C17303d.f41567a));
            TextView textView = this.f97070t;
            View view = this.itemView;
            C89219l.m154716b(view, "");
            textView.setTextColor(C0643b.m2378c(view.getContext(), R.color.c4));
            this.f97076z = new C42014f(new C41630h(this));
            return;
        }
        this.f97070t.setTypeface(C17300a.m32029a().mo27610a(C17303d.f41573g));
        TextView textView2 = this.f97070t;
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        textView2.setTextColor(C0643b.m2378c(view2.getContext(), R.color.bx));
        this.f97076z = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41618ai(final View view, AbstractC41728j jVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f97066o = jVar;
        this.f97067q = C89250i.m154773a((AbstractC89171a) C41631i.f97098a);
        View findViewById = view.findViewById(R.id.byl);
        C89219l.m154716b(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        this.f97055a = imageView;
        View findViewById2 = view.findViewById(R.id.bsr);
        C89219l.m154716b(findViewById2, "");
        this.f97068r = (SmartRoundImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.by7);
        C89219l.m154716b(findViewById3, "");
        this.f97069s = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ezv);
        C89219l.m154716b(findViewById4, "");
        this.f97070t = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ezp);
        C89219l.m154716b(findViewById5, "");
        this.f97071u = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.f6r);
        C89219l.m154716b(findViewById6, "");
        this.f97072v = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.ezr);
        C89219l.m154716b(findViewById7, "");
        this.f97073w = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.coi);
        C89219l.m154716b(findViewById8, "");
        this.f97074x = (RecyclerView) findViewById8;
        View findViewById9 = view.findViewById(R.id.b3h);
        C89219l.m154716b(findViewById9, "");
        this.f97056b = (FrameLayout) findViewById9;
        this.f97061g = "";
        this.f97064m = -1;
        C41898d dVar = new C41898d(imageView, mo70879H(), jVar, new AbstractC89171a<C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai.C416191 */

            /* renamed from: a */
            final /* synthetic */ C41618ai f97077a;

            static {
                Covode.recordClassIndex(49532);
            }

            {
                this.f97077a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                final String str;
                C41898d dVar;
                C41898d dVar2;
                C41898d dVar3 = this.f97077a.f97059e;
                if (dVar3 == null || !dVar3.mo71060b(this.f97077a.f97057c)) {
                    str = "click_pause_music";
                } else {
                    str = "click_play_music";
                }
                C41618ai aiVar = this.f97077a;
                aiVar.f97062h = !aiVar.f97062h;
                final C42314a aVar = this.f97077a.f97063i;
                final Music music = this.f97077a.f97057c;
                final int i = this.f97077a.f97064m;
                C41898d dVar4 = this.f97077a.f97059e;
                if (dVar4 == null || !dVar4.mo71060b(this.f97077a.f97057c)) {
                    C42043p pVar = this.f97077a.f97060f;
                    if (!(pVar == null || pVar.f98019c || (dVar = pVar.f98017a) == null)) {
                        dVar.f97750a.mo71129a(pVar);
                    }
                } else {
                    C34181a.m69861d(this.f97077a);
                    C42043p pVar2 = this.f97077a.f97060f;
                    if (!(pVar2 == null || (dVar2 = pVar2.f98017a) == null)) {
                        dVar2.f97750a.mo71128a(dVar2.f97758i, pVar2);
                    }
                }
                C1731i.m5640b(new Callable(this) {
                    /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai.C416191.CallableC416201 */

                    /* renamed from: a */
                    final /* synthetic */ C416191 f97078a;

                    static {
                        Covode.recordClassIndex(49533);
                    }

                    {
                        this.f97078a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        List<MusicTag> list;
                        String str;
                        C42410g gVar;
                        int i;
                        String str2;
                        String str3;
                        String str4;
                        String str5;
                        String str6;
                        String str7;
                        User user;
                        String str8;
                        String str9;
                        String mid;
                        String str10;
                        String str11;
                        String str12;
                        String str13;
                        String str14;
                        String str15;
                        C80457fu extraParamFromPretreatment;
                        User user2;
                        C67496as b = C42317b.m84680b(this.f97078a.f97077a.mo70877F());
                        GsonProvider c = GsonHolder.m138943c();
                        String str16 = "";
                        C89219l.m154716b(c, str16);
                        C27910f b2 = c.mo123620b();
                        Music music = this.f97078a.f97077a.f97057c;
                        String str17 = null;
                        if (music != null) {
                            list = music.getMusicTags();
                        } else {
                            list = null;
                        }
                        b.mo106499z(b2.mo46674b(list));
                        C42314a aVar = this.f97078a.f97077a.f97063i;
                        if (aVar == null || (user2 = aVar.getUser()) == null) {
                            str = null;
                        } else {
                            str = user2.getUniqueId();
                        }
                        b.mo106494u(str);
                        Music music2 = music;
                        if (music2 == null || (extraParamFromPretreatment = music2.getExtraParamFromPretreatment()) == null) {
                            gVar = null;
                        } else {
                            gVar = (C42410g) extraParamFromPretreatment.get(C42410g.class);
                        }
                        Music music3 = music;
                        if (music3 != null) {
                            i = music3.getSoundsListType();
                        } else {
                            i = 0;
                        }
                        String str18 = "search_result";
                        if (i == 0) {
                            C67540c x = b.mo106497x("music");
                            Music music4 = this.f97078a.f97077a.f97057c;
                            if (music4 == null || (str10 = music4.getMid()) == null) {
                                str10 = str16;
                            }
                            String str19 = "0";
                            C67540c a = ((C67542d) x.mo106487g(str10)).mo106496w(str19).mo106479a(Integer.valueOf(this.f97078a.f97077a.mo70877F().f151318m));
                            String str20 = this.f97078a.f97077a.f97058d;
                            if (str20 != null) {
                                str18 = str20;
                            }
                            C67496as A = ((C67496as) a.mo106459o(str18)).mo106439A(str);
                            C67568r F = this.f97078a.f97077a.mo70877F();
                            if (F != null) {
                                str11 = F.f151314i;
                            } else {
                                str11 = null;
                            }
                            C67540c a2 = A.mo106480a(str11);
                            C67568r F2 = this.f97078a.f97077a.mo70877F();
                            if (F2 != null) {
                                str12 = F2.f151317l;
                            } else {
                                str12 = null;
                            }
                            a2.mo106483c(str12);
                            if (C89219l.m154714a((Object) this.f97078a.f97077a.f97058d, (Object) "general_search")) {
                                b.mo106498y(String.valueOf(this.f97078a.f97077a.getAdapterPosition()));
                            }
                            if (C89219l.m154714a((Object) this.f97078a.f97077a.f97058d, (Object) "general_search") && aVar != null) {
                                C42314a aVar2 = this.f97078a.f97077a.f97063i;
                                if (aVar2 == null || (str13 = aVar2.getSearchResultId()) == null) {
                                    str13 = str16;
                                }
                                C67542d dVar = (C67542d) b.mo106487g(str13);
                                C42314a aVar3 = this.f97078a.f97077a.f97063i;
                                if (aVar3 != null && aVar3.isAladdin()) {
                                    str19 = "1";
                                }
                                C67542d dVar2 = (C67542d) dVar.mo106496w(str19).mo106479a(Integer.valueOf(this.f97078a.f97077a.mo70877F().f151318m));
                                C42314a aVar4 = this.f97078a.f97077a.f97063i;
                                if (aVar4 == null || (str14 = aVar4.getTokenType()) == null) {
                                    str14 = str16;
                                }
                                C67542d dVar3 = (C67542d) ((C67542d) dVar2.mo106497x(str14)).mo106491r("top_music");
                                Music music5 = music;
                                if (music5 != null) {
                                    str15 = music5.getMid();
                                } else {
                                    str15 = null;
                                }
                                C67542d dVar4 = (C67542d) dVar3.mo106495v(str15);
                                Music music6 = music;
                                if (music6 != null) {
                                    str17 = music6.getSearchMusicName();
                                }
                                ((C67496as) ((C67496as) dVar4.mo106492s(str17)).mo106440B(str).mo106490d(Integer.valueOf(i))).mo106439A(str16);
                            }
                        } else {
                            Music music7 = music;
                            if (music7 == null || music7.getSoundsListType() != 2) {
                                Music music8 = music;
                                if (music8 == null || music8.getSoundsListType() != 3) {
                                    if (gVar == null || (str2 = gVar.f98786b) == null) {
                                        str2 = str16;
                                    }
                                    C67540c x2 = b.mo106497x(str2);
                                    if (!(gVar == null || (str4 = gVar.f98785a) == null)) {
                                        str16 = str4;
                                    }
                                    C67540c a3 = x2.mo106487g(str16).mo106479a(Integer.valueOf(this.f97078a.f97077a.mo70877F().f151318m));
                                    String str21 = this.f97078a.f97077a.f97058d;
                                    if (str21 != null) {
                                        str18 = str21;
                                    }
                                    C67542d dVar5 = (C67542d) ((C67542d) ((C67540c) a3.mo106459o(str18)).mo106480a(this.f97078a.f97077a.mo70877F().f151314i)).mo106491r("music");
                                    Music music9 = music;
                                    if (music9 != null) {
                                        str3 = music9.getMid();
                                    } else {
                                        str3 = null;
                                    }
                                    C67542d dVar6 = (C67542d) ((C67542d) dVar5.mo106495v(str3)).mo106490d(Integer.valueOf(this.f97078a.f97077a.getAdapterPosition()));
                                    Music music10 = music;
                                    if (music10 != null) {
                                        str17 = music10.getSearchMusicName();
                                    }
                                    ((C67496as) dVar6.mo106492s(str17)).mo106440B(str);
                                } else {
                                    C42314a aVar5 = this.f97078a.f97077a.f97063i;
                                    if (aVar5 != null) {
                                        str5 = aVar5.getTokenType();
                                    } else {
                                        str5 = null;
                                    }
                                    C67540c x3 = b.mo106497x(str5);
                                    C42314a aVar6 = this.f97078a.f97077a.f97063i;
                                    if (aVar6 == null || (user = aVar6.getUser()) == null) {
                                        str6 = null;
                                    } else {
                                        str6 = user.getUid();
                                    }
                                    C67542d dVar7 = (C67542d) ((C67542d) ((C67542d) ((C67540c) x3.mo106487g(str6).mo106479a(Integer.valueOf(this.f97078a.f97077a.mo70877F().f151318m)).mo106459o(this.f97078a.f97077a.f97058d)).mo106480a(this.f97078a.f97077a.mo70877F().f151314i).mo106456l(this.f97078a.f97077a.mo70877F().f151323r)).mo106493t(this.f97078a.f97077a.mo70877F().f151324s)).mo106491r("top_music");
                                    Music music11 = music;
                                    if (music11 != null) {
                                        str7 = music11.getMid();
                                    } else {
                                        str7 = null;
                                    }
                                    C67542d dVar8 = (C67542d) ((C67542d) dVar7.mo106495v(str7)).mo106490d(Integer.valueOf(this.f97078a.f97077a.getAdapterPosition()));
                                    Music music12 = music;
                                    if (music12 != null) {
                                        str17 = music12.getSearchMusicName();
                                    }
                                    ((C67496as) dVar8.mo106492s(str17)).mo106440B(str);
                                }
                            } else {
                                if (gVar == null || (str8 = gVar.f98786b) == null) {
                                    str8 = "tiktok_playlist_search";
                                }
                                C67540c x4 = b.mo106497x(str8);
                                Music music13 = music;
                                if (!(music13 == null || (mid = music13.getMid()) == null)) {
                                    str16 = mid;
                                }
                                C67540c a4 = x4.mo106487g(str16).mo106479a(Integer.valueOf(this.f97078a.f97077a.mo70877F().f151318m));
                                String str22 = this.f97078a.f97077a.f97058d;
                                if (str22 != null) {
                                    str18 = str22;
                                }
                                C67542d dVar9 = (C67542d) ((C67542d) ((C67540c) a4.mo106459o(str18)).mo106480a(this.f97078a.f97077a.mo70877F().f151314i)).mo106491r("music");
                                Music music14 = music;
                                if (music14 != null) {
                                    str9 = music14.getMid();
                                } else {
                                    str9 = null;
                                }
                                C67542d dVar10 = (C67542d) ((C67542d) dVar9.mo106495v(str9)).mo106490d(Integer.valueOf(this.f97078a.f97077a.getAdapterPosition()));
                                Music music15 = music;
                                if (music15 != null) {
                                    str17 = music15.getSearchMusicName();
                                }
                                ((C67496as) dVar10.mo106492s(str17)).mo106440B(str);
                            }
                        }
                        b.mo96792f();
                        return C89391z.f203057a;
                    }
                }, C39162r.m79452a());
                return C89391z.f203057a;
            }
        });
        C42043p pVar = new C42043p();
        C89219l.m154721d(dVar, "");
        pVar.f98017a = dVar;
        this.f97060f = pVar;
        this.f97059e = dVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai.View$OnClickListenerC416212 */

            /* renamed from: a */
            final /* synthetic */ C41618ai f97083a;

            static {
                Covode.recordClassIndex(49534);
            }

            {
                this.f97083a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200)) {
                    int e = this.f97083a.mo70835e();
                    if (this.f97083a.f97057c != null) {
                        IMusicService m = MusicService.m81198m();
                        Music music = this.f97083a.f97057c;
                        if (music == null) {
                            C89219l.m154715b();
                        }
                        if (!m.mo69308a(music.convertToMusicModel(), view.getContext(), true)) {
                            C67511b j = new C67552i().mo106453i("").mo106454j("");
                            Music music2 = this.f97083a.f97057c;
                            if (music2 == null) {
                                C89219l.m154715b();
                            }
                            j.mo106455k(music2.getMid()).mo106459o(this.f97083a.f97058d).mo96792f();
                            return;
                        }
                        if (TextUtils.isEmpty(this.f97083a.f97061g)) {
                            Object[] objArr = new Object[3];
                            int i = e + 1;
                            objArr[0] = Integer.valueOf(i);
                            Music music3 = this.f97083a.f97057c;
                            if (music3 == null) {
                                C89219l.m154715b();
                            }
                            objArr[1] = music3.getMid();
                            Music music4 = this.f97083a.f97057c;
                            if (music4 == null) {
                                C89219l.m154715b();
                            }
                            objArr[2] = music4.getSearchMusicName();
                            C89219l.m154716b(C1764a.m5928a("click_search_music(%d-%s): %s", Arrays.copyOf(objArr, 3)), "");
                            C67548g gVar = new C67548g();
                            Music music5 = this.f97083a.f97057c;
                            if (music5 == null) {
                                C89219l.m154715b();
                            }
                            gVar.mo106452c("music_id", music5.getMid()).mo106452c("client_order", Integer.toString(i)).mo96792f();
                        }
                        final C42314a aVar = this.f97083a.f97063i;
                        final Music music6 = this.f97083a.f97057c;
                        final int i2 = this.f97083a.f97064m;
                        C1731i.m5640b(new Callable(this) {
                            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai.View$OnClickListenerC416212.CallableC416221 */

                            /* renamed from: a */
                            final /* synthetic */ View$OnClickListenerC416212 f97085a;

                            static {
                                Covode.recordClassIndex(49535);
                            }

                            {
                                this.f97085a = r1;
                            }

                            /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ea, code lost:
                                if (r0 != null) goto L_0x02ed;
                             */
                            @Override // java.util.concurrent.Callable
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final /* synthetic */ java.lang.Object call() {
                                /*
                                // Method dump skipped, instructions count: 917
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai.View$OnClickListenerC416212.CallableC416221.call():java.lang.Object");
                            }
                        }, C39162r.m79452a());
                    }
                    String uuid = UUID.randomUUID().toString();
                    C89219l.m154716b(uuid, "");
                    SmartRoute buildRoute = SmartRouter.buildRoute(this.f97083a.mo70878G(), "//music/detail");
                    Music music7 = this.f97083a.f97057c;
                    if (music7 != null) {
                        str = music7.getMid();
                    } else {
                        str = null;
                    }
                    buildRoute.withParam("id", str).withParam("extra_music_from", this.f97083a.f97058d).withParam("previous_page_position", "music_card").withParam("process_id", uuid).open();
                    if (this.f97083a.f97065n == null) {
                        int i3 = this.f97083a.mo70877F().f151308c;
                        View view2 = view;
                        String str2 = this.f97083a.f97061g;
                        Music music8 = this.f97083a.f97057c;
                        if (music8 == null) {
                            C89219l.m154715b();
                        }
                        String requestId = music8.getRequestId();
                        Music music9 = this.f97083a.f97057c;
                        if (music9 == null) {
                            C89219l.m154715b();
                        }
                        String a = this.f97083a.mo60336a();
                        if (TextUtils.isEmpty(requestId)) {
                            requestId = C42452d.m84857a();
                        }
                        C59248m mVar = new C59248m();
                        C59248m mVar2 = (C59248m) mVar.mo96742b();
                        mVar2.f135272p = music9.getMid();
                        C59248m mVar3 = (C59248m) mVar2.mo96819o(C42467o.m84875a(i3)).mo96744c().mo96743b(String.valueOf(e));
                        mVar3.f135274r = uuid;
                        mVar3.f135273q = requestId;
                        C42410g gVar2 = (C42410g) music9.getExtraParamFromPretreatment().get(C42410g.class);
                        C67568r a2 = C42460j.C42461a.m84864a(view2);
                        HashMap hashMap = new HashMap();
                        if (gVar2 != null && (music9.getSoundsListType() == 1 || music9.getSoundsListType() == 2)) {
                            C59248m mVar4 = (C59248m) mVar.mo96810l(a2.f151314i).mo96804f(gVar2.f98785a);
                            mVar4.f135257Z = "aladdin_music_card";
                            mVar4.mo96807i(music9.getMid());
                            hashMap.put("list_item_id", music9.getMid());
                        } else if (music9.getSoundsListType() == 3) {
                            C59248m mVar5 = (C59248m) mVar.mo96810l(a2.f151314i);
                            mVar5.f135257Z = "user_music_card";
                            mVar5.mo96804f(a);
                        } else if (music9.getSoundsListType() == 0) {
                            C59248m mVar6 = (C59248m) mVar.mo96810l(a2.f151314i);
                            mVar6.f135257Z = "music_card";
                            mVar6.mo96804f(a);
                        } else if (music9.getSoundsListType() == 2 && i3 == 1) {
                            C59248m mVar7 = (C59248m) mVar.mo96810l(a2.f151314i);
                            mVar7.f135257Z = "aladdin_music_card";
                            mVar7.mo96804f(a);
                        }
                        C42452d.m84859a(view2, music9.getMid(), e, hashMap);
                        C42467o.m84878a(e, str2, requestId, mVar, i3, "click_search_result");
                        if (i3 != 3) {
                            C33743c cVar = new C33743c();
                            if (!TextUtils.isEmpty(str2)) {
                                cVar.mo59976a("search_keyword", str2);
                                C39162r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setExtValueString(music9.getMid()).setJsonObject(cVar.mo59977a()));
                                return;
                            }
                            cVar.mo59976a("source", "recommend");
                            cVar.mo59976a("id", music9.getMid());
                            C39162r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setJsonObject(cVar.mo59977a()));
                            return;
                        }
                        C39162r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("general_search").setValue(music9.getMid()));
                    } else if (this.f97083a.f97057c == null) {
                        C89219l.m154715b();
                    }
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2636h.C39127c.AbstractC39131d
    /* renamed from: a */
    public final void mo67889a(int i, int i2) {
        if (i == 0 && i2 != 0 && this.f97057c != null && TextUtils.isEmpty(this.f97061g)) {
            Object[] objArr = new Object[3];
            int e = mo70835e() + 1;
            objArr[0] = Integer.valueOf(e);
            Music music = this.f97057c;
            if (music == null) {
                C89219l.m154715b();
            }
            objArr[1] = music.getMid();
            Music music2 = this.f97057c;
            if (music2 == null) {
                C89219l.m154715b();
            }
            objArr[2] = music2.getSearchMusicName();
            C89219l.m154716b(C1764a.m5928a("show_search_music(%d-%s): %s", Arrays.copyOf(objArr, 3)), "");
            C67515bb bbVar = new C67515bb();
            Music music3 = this.f97057c;
            if (music3 == null) {
                C89219l.m154715b();
            }
            bbVar.mo106452c("music_id", music3.getMid()).mo106452c("client_order", Integer.toString(e)).mo96792f();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0161  */
    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.p2762a.AbstractC41595a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70818a(com.p2082ss.android.ugc.aweme.music.model.Music r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai.mo70818a(com.ss.android.ugc.aweme.music.model.Music, java.lang.String):void");
    }
}
