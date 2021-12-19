package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1481d.C20744c;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.autoplay.p2346b.C34105h;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41742q;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mob.AbstractC42448c;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41541n;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42831h;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67482ak;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67573s;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.c.c */
public final class C42820c extends AbstractC41742q<SearchLiveStruct> {

    /* renamed from: g */
    public C42826f f99865g;

    /* renamed from: h */
    public C51060g f99866h;

    /* renamed from: i */
    String f99867i = "";

    /* renamed from: j */
    public C67568r f99868j;

    /* renamed from: k */
    private final C42821a f99869k;

    static {
        Covode.recordClassIndex(50924);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.c$b */
    static final class RunnableC42822b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42820c f99872a;

        static {
            Covode.recordClassIndex(50926);
        }

        RunnableC42822b(C42820c cVar) {
            this.f99872a = cVar;
        }

        public final void run() {
            if (this.f99872a.f99866h != null) {
                C51060g gVar = this.f99872a.f99866h;
                if (gVar == null) {
                    C89219l.m154715b();
                }
                gVar.mo86403h();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.c$a */
    public static final class C42821a implements C42831h.AbstractC42833a {

        /* renamed from: a */
        final /* synthetic */ C42820c f99870a;

        /* renamed from: b */
        final /* synthetic */ C42815b.AbstractC42817b f99871b;

        static {
            Covode.recordClassIndex(50925);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
            if (r4 != null) goto L_0x002d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> m85526a() {
            /*
                r7 = this;
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                com.ss.android.ugc.aweme.discover.ui.c.c r0 = r7.f99870a
                java.util.List r0 = r0.mo63369e()
                java.util.Iterator r5 = r0.iterator()
            L_0x000f:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x004d
                java.lang.Object r4 = r5.next()
                com.ss.android.ugc.aweme.discover.model.SearchLiveStruct r4 = (com.p2082ss.android.ugc.aweme.discover.model.SearchLiveStruct) r4
                com.bytedance.android.livesdkapi.depend.model.live.RoomInfo r3 = new com.bytedance.android.livesdkapi.depend.model.live.RoomInfo
                if (r4 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getLiveAweme()
                if (r0 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
                if (r0 == 0) goto L_0x0048
                long r1 = r0.roomId
            L_0x002d:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getLiveAweme()
                if (r0 == 0) goto L_0x003f
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
                if (r0 == 0) goto L_0x003f
                java.lang.String r0 = r0.getUid()
                if (r0 != 0) goto L_0x0041
            L_0x003f:
                java.lang.String r0 = ""
            L_0x0041:
                r3.<init>(r1, r0)
                r6.add(r3)
                goto L_0x000f
            L_0x0048:
                r1 = 0
                if (r4 == 0) goto L_0x003f
                goto L_0x002d
            L_0x004d:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42820c.C42821a.m85526a():java.util.List");
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42831h.AbstractC42833a
        /* renamed from: a */
        public final void mo73073a(Aweme aweme) {
            long j;
            String str;
            Long l;
            User author;
            long j2;
            Aweme liveAweme;
            User author2;
            User author3;
            if (this.f99870a.f99865g != null) {
                C50529ae.f116790a = this.f99870a.f99865g;
            }
            if (aweme == null || (author3 = aweme.getAuthor()) == null) {
                j = 0;
            } else {
                j = author3.roomId;
            }
            ArrayList arrayList = new ArrayList();
            for (SearchLiveStruct searchLiveStruct : this.f99870a.mo63369e()) {
                if (searchLiveStruct == null || (liveAweme = searchLiveStruct.getLiveAweme()) == null || (author2 = liveAweme.getAuthor()) == null) {
                    j2 = 0;
                } else {
                    j2 = author2.roomId;
                }
                arrayList.add(Long.valueOf(j2));
            }
            List<RoomInfo> a = m85526a();
            String str2 = C42820c.m85520a(this.f99870a).f151314i;
            String str3 = C42820c.m85520a(this.f99870a).f151311f;
            String str4 = C42820c.m85520a(this.f99870a).f151309d;
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f28232b.f28280x = str2;
            enterRoomConfig.f28232b.f28281y = str3;
            enterRoomConfig.f28232b.f28244A = str4;
            enterRoomConfig.f28232b.f28257a = str2;
            EnterRoomConfig.LogData logData = enterRoomConfig.f28232b;
            if (aweme == null || (author = aweme.getAuthor()) == null || (str = author.getUid()) == null) {
                str = "";
            }
            logData.f28258b = str;
            enterRoomConfig.f28233c.f28295L = "live_cell_more";
            enterRoomConfig.f28233c.f28293J = "general_search";
            if (C41541n.m83478a()) {
                C67568r a2 = C42820c.m85520a(this.f99870a);
                C42826f fVar = this.f99870a.f99865g;
                ArrayList arrayList2 = null;
                if (fVar != null) {
                    Object obj = fVar.mData;
                    C89219l.m154716b(obj, "");
                    l = Long.valueOf(((SearchLiveList) obj).cursor);
                } else {
                    l = null;
                }
                List<SearchLiveStruct> e = this.f99870a.mo63369e();
                if (e != null) {
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) e, 10));
                    for (SearchLiveStruct searchLiveStruct2 : e) {
                        C89219l.m154716b(searchLiveStruct2, "");
                        arrayList3.add(searchLiveStruct2.getLiveAweme());
                    }
                    arrayList2 = arrayList3;
                }
                C42813a.m85512a(aweme, new C34105h(a2, arrayList2, l, 25), enterRoomConfig, this.f99871b);
                return;
            }
            Context context = GlobalContext.getContext();
            C89219l.m154716b(context, "");
            C42813a.m85511a(context, j, arrayList, a, enterRoomConfig, "general_search");
        }

        C42821a(C42820c cVar, C42815b.AbstractC42817b bVar) {
            this.f99870a = cVar;
            this.f99871b = bVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C67568r m85520a(C42820c cVar) {
        C67568r rVar = cVar.f99868j;
        if (rVar == null) {
            C89219l.m154710a("itemMobParam");
        }
        return rVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<? extends SearchLiveStruct> list) {
        C89219l.m154721d(list, "");
        this.f97370f.f150937a = Integer.MIN_VALUE;
        super.mo62377b_(list);
        C34727m.m70944a(new RunnableC42822b(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41742q, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: c_ */
    public final int mo63367c_(View view) {
        C89219l.m154721d(view, "");
        return (int) C13628n.m24520b(view.getContext(), 120.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: b */
    public final void mo67817b(View view) {
        if (view != null) {
            view.setPadding(0, 0, 0, (int) C13628n.m24520b(view.getContext(), 40.5f));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C89219l.m154715b();
        }
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.auo, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C42831h(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41742q, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        User author;
        Long l;
        Long l2;
        String str5;
        User author2;
        User author3;
        User author4;
        User author5;
        String str6;
        User author6;
        User author7;
        UrlModel urlModel;
        User author8;
        UrlModel urlModel2;
        User author9;
        User author10;
        C89219l.m154721d(viewHolder, "");
        super.mo60186a(viewHolder, i);
        SearchLiveStruct searchLiveStruct = (SearchLiveStruct) this.f92236l.get(i);
        C89219l.m154716b(searchLiveStruct, "");
        C89219l.m154721d(searchLiveStruct, "");
        AbstractC67567q a = C67486am.m119564a();
        int i3 = 0;
        if (a != null) {
            str = a.mo106431c().f151151a;
            str2 = a.mo106431c().f151152b;
            i2 = a.mo106426a();
        } else {
            str = "";
            str2 = str;
            i2 = 0;
        }
        LogPbBean logPbBean = searchLiveStruct.getLogPbBean();
        if (logPbBean == null) {
            logPbBean = new LogPbBean();
            logPbBean.setImprId("");
        }
        String imprId = logPbBean.getImprId();
        String b = C48027ac.C48028a.f111257a.mo80057b(imprId);
        String a2 = AbstractC42448c.AbstractC42450b.C42451a.m84856a(7);
        String a3 = AbstractC42448c.C42449a.m84855a(7);
        C67568r g = C67568r.C67569a.m119673a().mo106518g("");
        g.f151306a = false;
        C67568r h = g.mo106519h(str);
        C89219l.m154716b(imprId, "");
        C67568r i4 = h.mo106520i(imprId);
        C89219l.m154716b(b, "");
        C67568r a4 = i4.mo106521j(b).mo106507a(logPbBean);
        a4.f151307b = i2;
        a4.f151318m = i;
        C67568r f = a4.mo106517f(str2);
        f.f151308c = 7;
        C67568r e = f.mo106515d(a2).mo106516e(a3);
        this.f99868j = e;
        if (viewHolder instanceof C42831h) {
            C42831h hVar = (C42831h) viewHolder;
            if (e == null) {
                C89219l.m154710a("itemMobParam");
            }
            hVar.mo70880a(e);
            String l3 = mo70924l();
            hVar.f99887a = searchLiveStruct;
            hVar.f99888b = searchLiveStruct.getLiveAweme();
            if (hVar.f99888b != null) {
                hVar.f99889c = l3;
                String str7 = null;
                if (hVar.f99890d != null) {
                    SmartImageView smartImageView = hVar.f99890d;
                    if (smartImageView == null) {
                        C89219l.m154715b();
                    }
                    hVar.mo73077a(smartImageView);
                    Aweme aweme = hVar.f99888b;
                    if (aweme == null || (author10 = aweme.getAuthor()) == null || (urlModel2 = author10.roomCover) == null) {
                        Aweme aweme2 = hVar.f99888b;
                        if (aweme2 == null || (author9 = aweme2.getAuthor()) == null) {
                            urlModel2 = null;
                        } else {
                            urlModel2 = author9.getAvatarLarger();
                        }
                    }
                    C20766v a5 = C20761r.m39060a(C34735v.m70965a(urlModel2));
                    a5.f49092E = hVar.f99890d;
                    Context G = hVar.mo70878G();
                    C20745e.C20746a aVar = new C20745e.C20746a();
                    aVar.f48963g = new C20745e.C20747b(C20744c.m39047a(G, 2.0f), C20744c.m39047a(G, 2.0f));
                    aVar.f48958b = C20744c.m39047a(G, 0.0f);
                    C20745e a6 = aVar.mo34169a();
                    C89219l.m154716b(a6, "");
                    a5.f49126w = a6;
                    a5.mo34186c();
                }
                if (hVar.f99891e != null) {
                    Aweme aweme3 = hVar.f99888b;
                    if (aweme3 == null || (author8 = aweme3.getAuthor()) == null) {
                        urlModel = null;
                    } else {
                        urlModel = author8.getAvatarThumb();
                    }
                    C20766v b2 = C20761r.m39060a(C34735v.m70965a(urlModel)).mo34185b(C80397em.m139369a(100));
                    b2.f49092E = hVar.f99891e;
                    b2.mo34186c();
                }
                Aweme aweme4 = hVar.f99888b;
                if (aweme4 == null || (author7 = aweme4.getAuthor()) == null) {
                    str3 = null;
                } else {
                    str3 = author7.getRoomTitle();
                }
                if (TextUtils.isEmpty(str3)) {
                    TextView textView = hVar.f99892f;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                } else {
                    TextView textView2 = hVar.f99892f;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    TextView textView3 = hVar.f99892f;
                    if (textView3 != null) {
                        Aweme aweme5 = hVar.f99888b;
                        if (aweme5 == null || (author = aweme5.getAuthor()) == null) {
                            str4 = null;
                        } else {
                            str4 = author.getRoomTitle();
                        }
                        textView3.setText(str4);
                    }
                }
                if (hVar.f99894h != null) {
                    View view = hVar.f99894h;
                    if (view == null) {
                        C89219l.m154715b();
                    }
                    hVar.mo73077a(view);
                }
                TextView textView4 = hVar.f99893g;
                if (textView4 != null) {
                    Aweme aweme6 = hVar.f99888b;
                    if (aweme6 == null || (author6 = aweme6.getAuthor()) == null) {
                        str6 = null;
                    } else {
                        str6 = author6.getSearchUserName();
                    }
                    textView4.setText(str6);
                }
                Aweme liveAweme = searchLiveStruct.getLiveAweme();
                C67540c w = ((C67542d) C42317b.m84679a(hVar.mo70877F()).mo106497x("live_card").mo106479a(Integer.valueOf(hVar.getAdapterPosition()))).mo106496w("0");
                Aweme aweme7 = hVar.f99888b;
                if (aweme7 == null || (author5 = aweme7.getAuthor()) == null) {
                    l = null;
                } else {
                    l = Long.valueOf(author5.roomId);
                }
                w.mo106487g(String.valueOf(l)).mo106459o("search_result").mo96792f();
                HashMap hashMap = new HashMap();
                hashMap.put("sdk_version", "2150");
                hashMap.put("_param_live_platform", "live");
                C67568r F = hVar.mo70877F();
                C67482ak akVar = (C67482ak) new C67573s().mo106433s("general_search").mo106460p("live_cell_more");
                if (liveAweme == null || (author4 = liveAweme.getAuthor()) == null) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(author4.roomId);
                }
                C67540c t = akVar.mo106434t(String.valueOf(l2));
                if (liveAweme == null || (author3 = liveAweme.getAuthor()) == null) {
                    str5 = null;
                } else {
                    str5 = author3.getUid();
                }
                C67540c b3 = t.mo106485e(str5).mo106488q("click").mo106480a(F.f151314i).mo106486f(F.f151309d).mo106482b(F.f151311f);
                if (liveAweme != null) {
                    str7 = liveAweme.getRequestId();
                }
                C67573s sVar = (C67573s) b3.mo106458n(str7).mo96788a(hashMap);
                Aweme aweme8 = hVar.f99888b;
                if (!(aweme8 == null || (author2 = aweme8.getAuthor()) == null)) {
                    i3 = author2.getFollowStatus();
                }
                sVar.mo106525a(i3).mo96792f();
            }
            C42821a aVar2 = this.f99869k;
            C89219l.m154721d(aVar2, "");
            hVar.f99895i = aVar2;
        }
        this.f97370f.mo106288a(i, mo60933c());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42820c(C67678d dVar, AbstractC57066a.AbstractC57068b bVar, AbstractC67363b bVar2, C42815b.AbstractC42817b bVar3) {
        super(dVar, bVar, bVar2);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(bVar3, "");
        this.f99869k = new C42821a(this, bVar3);
    }
}
