package com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.music.AbstractC60326a;
import com.p2082ss.android.ugc.aweme.music.p3468c.AbstractC60747a;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.service.IMusicService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63146a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.C63151d;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.C63152e;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p2082ss.android.ugc.aweme.themechange.base.C77792a;
import com.p2082ss.android.ugc.aweme.tools.music.C78653a;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4121a.C78697b;
import com.p2082ss.android.ugc.aweme.tools.music.p4120a.C78678b;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4126a.C78748b;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78821b;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78826e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g */
public final class C78775g implements AbstractC63147a {

    /* renamed from: x */
    public static final int f177042x = 30;

    /* renamed from: y */
    public static final C78776a f177043y = new C78776a((byte) 0);

    /* renamed from: A */
    private RecyclerView f177044A;

    /* renamed from: B */
    private TextView f177045B;

    /* renamed from: C */
    private View f177046C;

    /* renamed from: D */
    private View f177047D;

    /* renamed from: E */
    private View f177048E;

    /* renamed from: F */
    private View f177049F;

    /* renamed from: G */
    private View f177050G;

    /* renamed from: H */
    private DmtStatusView f177051H;

    /* renamed from: I */
    private FrameLayout f177052I;

    /* renamed from: J */
    private AbstractC60326a f177053J;

    /* renamed from: K */
    private final AbstractC89244h f177054K = C89250i.m154773a((AbstractC89171a) C78788h.f177093a);

    /* renamed from: L */
    private boolean f177055L;

    /* renamed from: a */
    AVDmtPanelRecycleView f177056a;

    /* renamed from: b */
    public C63151d f177057b;

    /* renamed from: c */
    public AVDmtTabLayout f177058c;

    /* renamed from: d */
    public TuxCheckBox f177059d;

    /* renamed from: e */
    public C63152e f177060e;

    /* renamed from: f */
    public TuxStatusView f177061f;

    /* renamed from: g */
    public TuxStatusView f177062g;

    /* renamed from: h */
    DmtStatusView f177063h;

    /* renamed from: i */
    public SafeHandler f177064i;

    /* renamed from: j */
    public C23226a f177065j;

    /* renamed from: k */
    public C78763a f177066k = new C78763a();

    /* renamed from: l */
    public C78763a f177067l = new C78763a();

    /* renamed from: m */
    public final C88411a f177068m = new C88411a();

    /* renamed from: n */
    public C78767d f177069n;

    /* renamed from: o */
    public C78767d f177070o;

    /* renamed from: p */
    public int f177071p;

    /* renamed from: q */
    public final HashSet<String> f177072q = new HashSet<>();

    /* renamed from: r */
    public boolean f177073r;

    /* renamed from: s */
    public boolean f177074s;

    /* renamed from: t */
    public boolean f177075t = true;

    /* renamed from: u */
    public String f177076u = "-1";

    /* renamed from: v */
    public boolean f177077v;

    /* renamed from: w */
    public final AbstractC61180m f177078w = new C78787g(this);

    /* renamed from: z */
    private View f177079z;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$a */
    public static final class C78776a {
        static {
            Covode.recordClassIndex(91919);
        }

        private C78776a() {
        }

        public /* synthetic */ C78776a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo122616a(boolean z, boolean z2) {
        if (z2) {
            TuxStatusView tuxStatusView = this.f177062g;
            if (tuxStatusView == null) {
                C89219l.m154710a("retryViewCollect");
            }
            tuxStatusView.setVisibility(8);
        } else if (!z) {
            this.f177067l.f177010a.clear();
            C78767d dVar = this.f177070o;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
            DmtStatusView dmtStatusView = this.f177063h;
            if (dmtStatusView == null) {
                C89219l.m154710a("mLoadingStatusViewCollect");
            }
            dmtStatusView.mo27379a(true);
            TuxStatusView tuxStatusView2 = this.f177062g;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("retryViewCollect");
            }
            tuxStatusView2.setVisibility(0);
            TuxStatusView tuxStatusView3 = this.f177062g;
            if (tuxStatusView3 == null) {
                C89219l.m154710a("retryViewCollect");
            }
            TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
            C63151d dVar2 = this.f177057b;
            if (dVar2 == null) {
                C89219l.m154710a("params");
            }
            String string = dVar2.f143506c.getString(R.string.ciz);
            C89219l.m154716b(string, "");
            TuxStatusView.C23263c a = cVar.mo37879a(string);
            C63151d dVar3 = this.f177057b;
            if (dVar3 == null) {
                C89219l.m154710a("params");
            }
            String string2 = dVar3.f143506c.getString(R.string.ciy);
            C89219l.m154716b(string2, "");
            TuxStatusView.C23263c a2 = a.mo37878a((CharSequence) string2);
            a2.f55132j = new C78809z(this);
            tuxStatusView3.setStatus(a2);
        } else {
            this.f177067l.f177010a.clear();
            C78767d dVar4 = this.f177070o;
            if (dVar4 != null) {
                dVar4.notifyDataSetChanged();
            }
            DmtStatusView dmtStatusView2 = this.f177063h;
            if (dmtStatusView2 == null) {
                C89219l.m154710a("mLoadingStatusViewCollect");
            }
            dmtStatusView2.mo27379a(true);
            TuxStatusView tuxStatusView4 = this.f177062g;
            if (tuxStatusView4 == null) {
                C89219l.m154710a("retryViewCollect");
            }
            tuxStatusView4.setVisibility(0);
            TuxStatusView tuxStatusView5 = this.f177062g;
            if (tuxStatusView5 == null) {
                C89219l.m154710a("retryViewCollect");
            }
            TuxStatusView.C23263c cVar2 = new TuxStatusView.C23263c();
            C63151d dVar5 = this.f177057b;
            if (dVar5 == null) {
                C89219l.m154710a("params");
            }
            String string3 = dVar5.f143506c.getString(R.string.dgv);
            C89219l.m154716b(string3, "");
            TuxStatusView.C23263c a3 = cVar2.mo37879a(string3);
            C63151d dVar6 = this.f177057b;
            if (dVar6 == null) {
                C89219l.m154710a("params");
            }
            String string4 = dVar6.f143506c.getString(R.string.dgu);
            C89219l.m154716b(string4, "");
            tuxStatusView5.setStatus(a3.mo37878a((CharSequence) string4));
        }
    }

    /* renamed from: a */
    public final void mo122615a(boolean z) {
        C63151d dVar = this.f177057b;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        new SafeHandler(dVar.f143506c).post(new RunnableC78800r(this, z));
    }

    /* renamed from: a */
    public final void mo122614a(C78767d dVar, MusicModel musicModel) {
        boolean z;
        if (!C63244g.m114602a().mo73255A().mo93903b()) {
            String str = this.f177071p == 0 ? "edit_page_recommend" : "edit_page_recommend_favourite";
            C63151d dVar2 = this.f177057b;
            if (dVar2 == null) {
                C89219l.m154710a("params");
            }
            C58957c.m108321a(dVar2.f143506c, "video_edit_page", str, new C78801s(this, dVar, musicModel));
            return;
        }
        this.f177055L = true;
        if (musicModel.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z = true;
        } else {
            z = false;
        }
        int b = C78826e.m137593b(this.f177066k.f177010a, musicModel);
        if (z) {
            musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
            if (b >= 0) {
                MusicModel musicModel2 = this.f177066k.f177010a.get(b);
                C89219l.m154716b(musicModel2, "");
                musicModel2.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
            }
        } else {
            musicModel.setCollectionType(MusicModel.CollectionType.COLLECTED);
            if (b >= 0) {
                MusicModel musicModel3 = this.f177066k.f177010a.get(b);
                C89219l.m154716b(musicModel3, "");
                musicModel3.setCollectionType(MusicModel.CollectionType.COLLECTED);
            }
        }
        m137514a(musicModel.getMusicId(), !z);
        HashMap<String, Boolean> hashMap = C78766c.f177018a;
        String musicId = musicModel.getMusicId();
        C89219l.m154716b(musicId, "");
        hashMap.put(musicId, Boolean.valueOf(!z));
        dVar.notifyDataSetChanged();
        C63151d dVar3 = this.f177057b;
        if (dVar3 == null) {
            C89219l.m154710a("params");
        }
        dVar3.f143516m.mo101522a(!z, musicModel);
        String musicId2 = musicModel.getMusicId();
        C89219l.m154716b(musicId2, "");
        C78748b.m137480a(musicId2, true ^ z, new C78802t(this, musicModel));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$f */
    public static final class C78786f implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ C78775g f177091a;

        static {
            Covode.recordClassIndex(91929);
        }

        C78786f(C78775g gVar) {
            this.f177091a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f177091a.mo122619g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$e */
    public static final class C78782e implements AbstractC63154aa.AbstractC63166k {

        /* renamed from: a */
        final /* synthetic */ C78775g f177085a;

        static {
            Covode.recordClassIndex(91925);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63166k
        /* renamed from: b */
        public final void mo101616b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$e$b */
        static final class RunnableC78784b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C78782e f177087a;

            static {
                Covode.recordClassIndex(91927);
            }

            RunnableC78784b(C78782e eVar) {
                this.f177087a = eVar;
            }

            public final void run() {
                this.f177087a.f177085a.mo122616a(true, false);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63166k
        /* renamed from: a */
        public final void mo101614a() {
            C78775g.m137519e(this.f177085a).post(new RunnableC78784b(this));
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63166k
        /* renamed from: c */
        public final void mo101617c() {
            C78775g.m137519e(this.f177085a).post(new RunnableC78783a(this));
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$e$a */
        static final class RunnableC78783a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C78782e f177086a;

            static {
                Covode.recordClassIndex(91926);
            }

            RunnableC78783a(C78782e eVar) {
                this.f177086a = eVar;
            }

            public final void run() {
                this.f177086a.f177085a.f177067l.f177016g = false;
                ArrayList<MusicModel> arrayList = this.f177086a.f177085a.f177067l.f177010a;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.f177086a.f177085a.mo122616a(false, false);
                } else {
                    this.f177086a.f177085a.mo122615a(true);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$e$c */
        static final class RunnableC78785c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C78782e f177088a;

            /* renamed from: b */
            final /* synthetic */ List f177089b;

            /* renamed from: c */
            final /* synthetic */ boolean f177090c;

            static {
                Covode.recordClassIndex(91928);
            }

            RunnableC78785c(C78782e eVar, List list, boolean z) {
                this.f177088a = eVar;
                this.f177089b = list;
                this.f177090c = z;
            }

            public final void run() {
                int i;
                this.f177088a.f177085a.f177067l.f177016g = true;
                this.f177088a.f177085a.mo122616a(false, true);
                C63146a aVar = new C63146a(this.f177089b, 0, 0, 0, this.f177090c, null, 46);
                C78775g gVar = this.f177088a.f177085a;
                C78763a aVar2 = this.f177088a.f177085a.f177067l;
                boolean z = this.f177088a.f177085a.f177077v;
                if (z) {
                    aVar2.f177010a.clear();
                }
                ArrayList<MusicModel> arrayList = aVar2.f177010a;
                List<? extends MusicModel> list = aVar.f143498a;
                if (list != null) {
                    arrayList.addAll(list);
                }
                aVar2.f177012c = aVar.f143501d;
                aVar2.f177013d = aVar.f143502e;
                List<? extends MusicModel> list2 = aVar.f143498a;
                if (list2 != null) {
                    i = list2.size();
                } else {
                    i = 0;
                }
                aVar2.f177014e = i;
                if (gVar.f177070o == null) {
                    gVar.f177070o = new C78767d(new C78798p(gVar));
                    C78767d dVar = gVar.f177070o;
                    if (dVar != null) {
                        dVar.mo62377b_(gVar.f177067l.f177010a);
                    }
                    if (gVar.f177057b == null) {
                        C89219l.m154710a("params");
                    }
                    WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
                    AVDmtPanelRecycleView aVDmtPanelRecycleView = gVar.f177056a;
                    if (aVDmtPanelRecycleView == null) {
                        C89219l.m154710a("collectionRecycerView");
                    }
                    aVDmtPanelRecycleView.setLayoutManager(wrapLinearLayoutManager);
                    AVDmtPanelRecycleView aVDmtPanelRecycleView2 = gVar.f177056a;
                    if (aVDmtPanelRecycleView2 == null) {
                        C89219l.m154710a("collectionRecycerView");
                    }
                    aVDmtPanelRecycleView2.setAdapter(gVar.f177070o);
                    if (!gVar.f177067l.f177013d) {
                        gVar.mo122615a(true);
                    }
                    DmtStatusView dmtStatusView = gVar.f177063h;
                    if (dmtStatusView == null) {
                        C89219l.m154710a("mLoadingStatusViewCollect");
                    }
                    dmtStatusView.mo27379a(true);
                    C78767d dVar2 = gVar.f177070o;
                    if (dVar2 != null) {
                        dVar2.mo122605a((AbstractC84926c.AbstractC84928a) new C78799q(gVar));
                    }
                } else if (z) {
                    C78767d dVar3 = gVar.f177070o;
                    if (dVar3 != null) {
                        dVar3.mo62377b_(gVar.f177067l.f177010a);
                    }
                    C78767d dVar4 = gVar.f177070o;
                    if (dVar4 != null) {
                        dVar4.notifyDataSetChanged();
                    }
                    AVDmtPanelRecycleView aVDmtPanelRecycleView3 = gVar.f177056a;
                    if (aVDmtPanelRecycleView3 == null) {
                        C89219l.m154710a("collectionRecycerView");
                    }
                    aVDmtPanelRecycleView3.mo4413b(0);
                } else {
                    C78767d dVar5 = gVar.f177070o;
                    if (dVar5 != null) {
                        dVar5.mo62376b(gVar.f177067l.f177010a);
                    }
                    SafeHandler safeHandler = gVar.f177064i;
                    if (safeHandler == null) {
                        C89219l.m154710a("safeHander");
                    }
                    safeHandler.post(new RunnableC78808y(gVar));
                }
                this.f177088a.f177085a.f177077v = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78782e(C78775g gVar) {
            this.f177085a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63166k
        /* renamed from: a */
        public final void mo101615a(List<? extends MusicModel> list, boolean z) {
            C89219l.m154721d(list, "");
            C78775g.m137519e(this.f177085a).post(new RunnableC78785c(this, list, z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$g */
    public static final class C78787g implements AbstractC61180m {

        /* renamed from: a */
        final /* synthetic */ C78775g f177092a;

        static {
            Covode.recordClassIndex(91930);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: a */
        public final void mo62876a(MusicModel musicModel, long j) {
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: a */
        public final void mo62878a(MusicModel musicModel, Exception exc) {
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: c */
        public final void mo62883c(MusicModel musicModel) {
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: h */
        public final MusicModel mo62885h() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: r */
        public final void mo62890r() {
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        public final boolean bT_() {
            if (this.f177092a.f177065j != null) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: i */
        public final Activity mo62886i() {
            return C78775g.m137513a(this.f177092a).f143506c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78787g(C78775g gVar) {
            this.f177092a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: a */
        public final void mo62880a(String str, MusicModel musicModel, String str2) {
            String str3;
            if (musicModel == null || !C89219l.m154714a((Object) C78774f.f177040a, (Object) musicModel.getMusicId())) {
                return;
            }
            if (this.f177092a.f177071p == 0) {
                String str4 = this.f177092a.f177076u;
                if (musicModel != null) {
                    str3 = musicModel.getMusicId();
                } else {
                    str3 = null;
                }
                if (C89219l.m154714a((Object) str4, (Object) str3)) {
                    C78775g.m137513a(this.f177092a).f143515l.mo101512a(true);
                }
                C78775g.m137513a(this.f177092a).f143515l.mo101511a(str, C78821b.m137586a(musicModel), true);
                C78767d dVar = this.f177092a.f177069n;
                if (dVar != null) {
                    dVar.mo122604a(-1);
                    return;
                }
                return;
            }
            C78775g.m137513a(this.f177092a).f143515l.mo101511a(str, C78821b.m137586a(musicModel), false);
            C78767d dVar2 = this.f177092a.f177070o;
            if (dVar2 != null) {
                dVar2.mo122604a(-1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$s */
    public static final class C78801s implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ C78775g f177110a;

        /* renamed from: b */
        final /* synthetic */ C78767d f177111b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f177112c;

        static {
            Covode.recordClassIndex(91944);
        }

        C78801s(C78775g gVar, C78767d dVar, MusicModel musicModel) {
            this.f177110a = gVar;
            this.f177111b = dVar;
            this.f177112c = musicModel;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f177110a.mo122614a(this.f177111b, this.f177112c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$h */
    static final class C78788h extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C78788h f177093a = new C78788h();

        static {
            Covode.recordClassIndex(91931);
        }

        C78788h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$q */
    public static final class C78799q implements AbstractC84926c.AbstractC84928a {

        /* renamed from: a */
        final /* synthetic */ C78775g f177107a;

        static {
            Covode.recordClassIndex(91942);
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c.AbstractC84928a
        /* renamed from: a */
        public final void mo112467a() {
            C78767d dVar = this.f177107a.f177070o;
            if (dVar != null) {
                dVar.ao_();
            }
            if (this.f177107a.f177067l.f177013d) {
                C78748b.f176963h.mo122594c(C78775g.m137513a(this.f177107a).f143508e);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78799q(C78775g gVar) {
            this.f177107a = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$r */
    public static final class RunnableC78800r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78775g f177108a;

        /* renamed from: b */
        final /* synthetic */ boolean f177109b;

        static {
            Covode.recordClassIndex(91943);
        }

        RunnableC78800r(C78775g gVar, boolean z) {
            this.f177108a = gVar;
            this.f177109b = z;
        }

        public final void run() {
            if (this.f177109b) {
                C78767d dVar = this.f177108a.f177070o;
                if (dVar != null) {
                    dVar.mo67829d(false);
                    return;
                }
                return;
            }
            C78767d dVar2 = this.f177108a.f177069n;
            if (dVar2 != null) {
                dVar2.mo67829d(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$y */
    static final class RunnableC78808y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78775g f177120a;

        static {
            Covode.recordClassIndex(91951);
        }

        RunnableC78808y(C78775g gVar) {
            this.f177120a = gVar;
        }

        public final void run() {
            if (this.f177120a.f177067l.f177013d) {
                C78767d dVar = this.f177120a.f177070o;
                if (dVar != null) {
                    dVar.aq_();
                    return;
                }
                return;
            }
            this.f177120a.mo122615a(true);
        }
    }

    static {
        Covode.recordClassIndex(91918);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a
    /* renamed from: b */
    public final void mo101505b() {
        mo122620h();
        C23226a aVar = this.f177065j;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a
    /* renamed from: d */
    public final void mo101507d() {
        if (this.f177073r) {
            this.f177073r = false;
            this.f177074s = true;
            m137520i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$n */
    public static final class C78794n implements AbstractC63153f {

        /* renamed from: a */
        final /* synthetic */ C78775g f177102a;

        static {
            Covode.recordClassIndex(91937);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: a */
        public final boolean mo101527a() {
            String musicId;
            List<String> list;
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null || (musicId = cVar.getMusicId()) == null || (list = C78775g.m137513a(this.f177102a).f143504a) == null || !list.contains(musicId)) {
                return C78775g.m137513a(this.f177102a).f143515l.mo101515d();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78794n(C78775g gVar) {
            this.f177102a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: a */
        public final void mo101526a(MusicModel musicModel, int i) {
            C89219l.m154721d(musicModel, "");
            this.f177102a.mo122611a(musicModel, true, i);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: b */
        public final void mo101528b(View view, int i) {
            C89219l.m154721d(view, "");
            if (i >= 0) {
                C78775g.m137513a(this.f177102a).f143515l.mo101513b();
                C78775g.m137513a(this.f177102a).f143516m.mo101517a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: c */
        public final void mo101529c(View view, int i) {
            C89219l.m154721d(view, "");
            if (i >= 0) {
                MusicModel musicModel = this.f177102a.f177066k.f177010a.get(i);
                C89219l.m154716b(musicModel, "");
                MusicModel musicModel2 = musicModel;
                C78775g gVar = this.f177102a;
                C78767d dVar = gVar.f177069n;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                gVar.mo122614a(dVar, musicModel2);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: a */
        public final void mo101525a(View view, int i) {
            String str;
            C89219l.m154721d(view, "");
            if (i >= 0) {
                MusicModel musicModel = this.f177102a.f177066k.f177010a.get(i);
                C89219l.m154716b(musicModel, "");
                MusicModel musicModel2 = musicModel;
                if (this.f177102a.f177069n != null) {
                    str = C78767d.m137505l();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) musicModel2.getMusicId())) {
                    C78775g.m137513a(this.f177102a).f143516m.mo101519a(musicModel2, "recommend");
                    C78775g gVar = this.f177102a;
                    C78767d dVar = gVar.f177069n;
                    if (dVar == null) {
                        C89219l.m154715b();
                    }
                    gVar.mo122613a(dVar);
                    return;
                }
                C78767d dVar2 = this.f177102a.f177069n;
                if (dVar2 != null) {
                    dVar2.mo122604a(i);
                }
                this.f177102a.mo122610a(musicModel2, false);
                C78775g.m137513a(this.f177102a).f143516m.mo101518a(musicModel2, i, "recommend", false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$p */
    public static final class C78798p implements AbstractC63153f {

        /* renamed from: a */
        final /* synthetic */ C78775g f177106a;

        static {
            Covode.recordClassIndex(91941);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: a */
        public final boolean mo101527a() {
            String musicId;
            List<String> list;
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null || (musicId = cVar.getMusicId()) == null || (list = C78775g.m137513a(this.f177106a).f143504a) == null || !list.contains(musicId)) {
                return C78775g.m137513a(this.f177106a).f143515l.mo101515d();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78798p(C78775g gVar) {
            this.f177106a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: a */
        public final void mo101526a(MusicModel musicModel, int i) {
            C89219l.m154721d(musicModel, "");
            this.f177106a.mo122611a(musicModel, false, i);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: b */
        public final void mo101528b(View view, int i) {
            C89219l.m154721d(view, "");
            if (i >= 0) {
                C78775g.m137513a(this.f177106a).f143515l.mo101513b();
                C78775g.m137513a(this.f177106a).f143516m.mo101517a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: c */
        public final void mo101529c(View view, int i) {
            C89219l.m154721d(view, "");
            if (i >= 0) {
                MusicModel musicModel = this.f177106a.f177067l.f177010a.get(i);
                C89219l.m154716b(musicModel, "");
                MusicModel musicModel2 = musicModel;
                C78775g gVar = this.f177106a;
                C78767d dVar = gVar.f177070o;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                gVar.mo122614a(dVar, musicModel2);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f
        /* renamed from: a */
        public final void mo101525a(View view, int i) {
            String str;
            C89219l.m154721d(view, "");
            if (i >= 0) {
                MusicModel musicModel = this.f177106a.f177067l.f177010a.get(i);
                C89219l.m154716b(musicModel, "");
                MusicModel musicModel2 = musicModel;
                if (this.f177106a.f177070o != null) {
                    str = C78767d.m137505l();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) musicModel2.getMusicId())) {
                    C78775g.m137513a(this.f177106a).f143516m.mo101519a(musicModel2, "favorite");
                    C78775g gVar = this.f177106a;
                    C78767d dVar = gVar.f177070o;
                    if (dVar == null) {
                        C89219l.m154715b();
                    }
                    gVar.mo122613a(dVar);
                    return;
                }
                C78767d dVar2 = this.f177106a.f177070o;
                if (dVar2 != null) {
                    dVar2.mo122604a(i);
                }
                this.f177106a.mo122610a(musicModel2, false);
                C78775g.m137513a(this.f177106a).f143516m.mo101518a(musicModel2, i, "favorite", false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$w */
    public static final class RunnableC78805w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78775g f177117a;

        static {
            Covode.recordClassIndex(91948);
        }

        RunnableC78805w(C78775g gVar) {
            this.f177117a = gVar;
        }

        public final void run() {
            if (!this.f177117a.f177066k.f177013d || this.f177117a.f177066k.f177014e < C78775g.f177042x) {
                this.f177117a.mo122615a(false);
                return;
            }
            C78767d dVar = this.f177117a.f177069n;
            if (dVar != null) {
                dVar.aq_();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a
    /* renamed from: c */
    public final void mo101506c() {
        C78748b.f176963h.f176965a = null;
        C78748b.f176963h.f176966b = null;
        IMusicService m = MusicService.m81198m();
        C89219l.m154716b(m, "");
        m.mo69305a((AbstractC60747a) null);
        this.f177068m.dispose();
        AbstractC60326a aVar = this.f177053J;
        if (aVar != null) {
            aVar.mo63045d();
        }
    }

    /* renamed from: g */
    public final void mo122619g() {
        DmtStatusView dmtStatusView = this.f177063h;
        if (dmtStatusView == null) {
            C89219l.m154710a("mLoadingStatusViewCollect");
        }
        dmtStatusView.mo27384f();
        this.f177067l.f177015f = true;
        this.f177067l.f177016g = null;
        C78748b.f176963h.f176965a = new C78782e(this);
        C78748b bVar = C78748b.f176963h;
        C63151d dVar = this.f177057b;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        bVar.mo122593b(dVar.f143508e);
    }

    /* renamed from: h */
    public final void mo122620h() {
        float f;
        C78774f.f177040a = "-1";
        C63152e eVar = this.f177060e;
        if (eVar == null) {
            C89219l.m154710a("originSoundParams");
        }
        if (eVar.f143517a) {
            C63152e eVar2 = this.f177060e;
            if (eVar2 == null) {
                C89219l.m154710a("originSoundParams");
            }
            f = eVar2.f143518b;
        } else {
            f = 0.0f;
        }
        C63151d dVar = this.f177057b;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        AbstractC63148b bVar = dVar.f143515l;
        C63152e eVar3 = this.f177060e;
        if (eVar3 == null) {
            C89219l.m154710a("originSoundParams");
        }
        bVar.mo101510a(eVar3, f);
    }

    /* renamed from: k */
    private final void m137522k() {
        ArrayList<MusicModel> arrayList = this.f177066k.f177010a;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f177066k.f177016g = false;
            m137516b(false);
            return;
        }
        C78767d dVar = this.f177069n;
        if (dVar == null) {
            m137521j();
            return;
        }
        dVar.mo62376b(this.f177066k.f177010a);
        C63151d dVar2 = this.f177057b;
        if (dVar2 == null) {
            C89219l.m154710a("params");
        }
        new SafeHandler(dVar2.f143506c).post(new RunnableC78805w(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$o */
    public static final class C78795o implements AbstractC84926c.AbstractC84928a {

        /* renamed from: a */
        final /* synthetic */ C78775g f177103a;

        static {
            Covode.recordClassIndex(91938);
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c.AbstractC84928a
        /* renamed from: a */
        public final void mo112467a() {
            AbstractC88979t<SuggestMusicList> a;
            if (!this.f177103a.f177066k.f177013d || this.f177103a.f177066k.f177014e < C78775g.f177042x / 2) {
                this.f177103a.mo122615a(false);
                return;
            }
            C78767d dVar = this.f177103a.f177069n;
            if (dVar != null) {
                dVar.ao_();
            }
            C78653a aVar = new C78653a(this.f177103a.f177066k.f177011b, C78775g.m137513a(this.f177103a).f143509f, "", (long) C78775g.m137513a(this.f177103a).f143507d, C78775g.f177042x, C78775g.m137513a(this.f177103a).f143508e, this.f177103a.f177066k.f177012c);
            C89219l.m154721d(aVar, "");
            if (TextUtils.isEmpty(aVar.f176729a)) {
                C89219l.m154721d(aVar, "");
                a = AIChooseMusicManager.m137314a(aVar.f176735g, aVar.f176733e, aVar.f176734f);
            } else {
                C89219l.m154721d(aVar, "");
                a = C78697b.f176839a.mo122556a(aVar.f176729a, aVar.f176730b, aVar.f176731c, aVar.f176732d, aVar.f176733e, aVar.f176735g);
            }
            this.f177103a.f177068m.mo142945a(a.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C78796a(this), new C78797b(this)));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78795o(C78775g gVar) {
            this.f177103a = gVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$o$b */
        static final class C78797b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C78795o f177105a;

            static {
                Covode.recordClassIndex(91940);
            }

            C78797b(C78795o oVar) {
                this.f177105a = oVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f177105a.f177103a.mo122615a(false);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$o$a */
        static final class C78796a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C78795o f177104a;

            static {
                Covode.recordClassIndex(91939);
            }

            C78796a(C78795o oVar) {
                this.f177104a = oVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                SuggestMusicList suggestMusicList = (SuggestMusicList) obj;
                C78775g gVar = this.f177104a.f177103a;
                C78763a aVar = this.f177104a.f177103a.f177066k;
                C89219l.m154716b(suggestMusicList, "");
                gVar.mo122612a(aVar, new C63146a(suggestMusicList.musicList, 0, 0, suggestMusicList.cursor, suggestMusicList.hasMore, aVar.f177011b, 6));
            }
        }
    }

    /* renamed from: i */
    private final void m137520i() {
        C63151d dVar = this.f177057b;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        if (!dVar.f143512i || this.f177073r) {
            TuxCheckBox tuxCheckBox = this.f177059d;
            if (tuxCheckBox == null) {
                C89219l.m154710a("tuxCheckBox");
            }
            tuxCheckBox.setChecked(false);
            TuxCheckBox tuxCheckBox2 = this.f177059d;
            if (tuxCheckBox2 == null) {
                C89219l.m154710a("tuxCheckBox");
            }
            tuxCheckBox2.setAlpha(0.7f);
            TextView textView = this.f177045B;
            if (textView == null) {
                C89219l.m154710a("tuxCheckBoxTextView");
            }
            textView.setAlpha(0.7f);
            TuxCheckBox tuxCheckBox3 = this.f177059d;
            if (tuxCheckBox3 == null) {
                C89219l.m154710a("tuxCheckBox");
            }
            tuxCheckBox3.setEnabled(false);
            View view = this.f177046C;
            if (view == null) {
                C89219l.m154710a("tuxCheckBoxTextViewParent");
            }
            view.setEnabled(false);
            return;
        }
        TuxCheckBox tuxCheckBox4 = this.f177059d;
        if (tuxCheckBox4 == null) {
            C89219l.m154710a("tuxCheckBox");
        }
        tuxCheckBox4.setOnCheckedChangeListener(new C78803u(this));
        TuxCheckBox tuxCheckBox5 = this.f177059d;
        if (tuxCheckBox5 == null) {
            C89219l.m154710a("tuxCheckBox");
        }
        tuxCheckBox5.setChecked(true);
        TuxCheckBox tuxCheckBox6 = this.f177059d;
        if (tuxCheckBox6 == null) {
            C89219l.m154710a("tuxCheckBox");
        }
        tuxCheckBox6.setAlpha(1.0f);
        TextView textView2 = this.f177045B;
        if (textView2 == null) {
            C89219l.m154710a("tuxCheckBoxTextView");
        }
        textView2.setAlpha(1.0f);
        TuxCheckBox tuxCheckBox7 = this.f177059d;
        if (tuxCheckBox7 == null) {
            C89219l.m154710a("tuxCheckBox");
        }
        tuxCheckBox7.setEnabled(true);
        View view2 = this.f177046C;
        if (view2 == null) {
            C89219l.m154710a("tuxCheckBoxTextViewParent");
        }
        view2.setEnabled(true);
        TuxCheckBox tuxCheckBox8 = this.f177059d;
        if (tuxCheckBox8 == null) {
            C89219l.m154710a("tuxCheckBox");
        }
        C63152e eVar = this.f177060e;
        if (eVar == null) {
            C89219l.m154710a("originSoundParams");
        }
        tuxCheckBox8.setChecked(eVar.f143517a);
        View view3 = this.f177046C;
        if (view3 == null) {
            C89219l.m154710a("tuxCheckBoxTextViewParent");
        }
        view3.setOnClickListener(new View$OnClickListenerC78804v(this));
    }

    /* renamed from: j */
    private final void m137521j() {
        C78767d dVar;
        C78767d dVar2 = new C78767d(new C78794n(this));
        this.f177069n = dVar2;
        dVar2.mo62377b_(this.f177066k.f177010a);
        if (this.f177057b == null) {
            C89219l.m154710a("params");
        }
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        RecyclerView recyclerView = this.f177044A;
        if (recyclerView == null) {
            C89219l.m154710a("aiRecycerView");
        }
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = this.f177044A;
        if (recyclerView2 == null) {
            C89219l.m154710a("aiRecycerView");
        }
        recyclerView2.setVisibility(0);
        RecyclerView recyclerView3 = this.f177044A;
        if (recyclerView3 == null) {
            C89219l.m154710a("aiRecycerView");
        }
        recyclerView3.setAdapter(this.f177069n);
        if (!this.f177066k.f177013d && (dVar = this.f177069n) != null) {
            RecyclerView.C1367j jVar = new RecyclerView.C1367j(1, 1);
            View view = dVar.f177021b;
            if (view != null) {
                view.setLayoutParams(jVar);
            }
        }
        DmtStatusView dmtStatusView = this.f177051H;
        if (dmtStatusView == null) {
            C89219l.m154710a("mLoadingStatusViewAI");
        }
        dmtStatusView.mo27379a(true);
        C78767d dVar3 = this.f177069n;
        if (dVar3 != null) {
            dVar3.mo122605a((AbstractC84926c.AbstractC84928a) new C78795o(this));
        }
        C63151d dVar4 = this.f177057b;
        if (dVar4 == null) {
            C89219l.m154710a("params");
        }
        if (dVar4.f143514k && C70005cr.m123611a().f156482a == null && this.f177066k.f177010a.size() > 3) {
            C78767d dVar5 = this.f177069n;
            if (dVar5 != null) {
                dVar5.mo122604a(0);
            }
            MusicModel musicModel = this.f177066k.f177010a.get(0);
            C89219l.m154716b(musicModel, "");
            String musicId = musicModel.getMusicId();
            if (musicId == null) {
                musicId = "";
            }
            this.f177076u = musicId;
            MusicModel musicModel2 = this.f177066k.f177010a.get(0);
            C89219l.m154716b(musicModel2, "");
            mo122610a(musicModel2, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a
    /* renamed from: a */
    public final void mo101502a() {
        TabLayout.C73104f a;
        C23226a.C23227a aVar = new C23226a.C23227a();
        View view = this.f177079z;
        if (view == null) {
            C89219l.m154710a("thisView");
        }
        C23226a.C23227a a2 = aVar.mo37816a(view).mo37812a(1);
        C63151d dVar = this.f177057b;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        C23226a.C23227a b = a2.mo37821b(C13628n.m24521b(dVar.f143506c) / 2);
        b.f55057a.f54974e = Integer.valueOf((int) R.style.o_);
        this.f177065j = b.mo37819a(false).mo37822b(false).mo37815a(new DialogInterface$OnDismissListenerC78777aa(this)).mo37814a(new DialogInterface$OnCancelListenerC78778ab(this)).f55057a;
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f177056a;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("collectionRecycerView");
        }
        aVDmtPanelRecycleView.mo4413b(0);
        RecyclerView recyclerView = this.f177044A;
        if (recyclerView == null) {
            C89219l.m154710a("aiRecycerView");
        }
        recyclerView.mo4413b(0);
        C78767d dVar2 = this.f177069n;
        if (dVar2 != null) {
            dVar2.notifyDataSetChanged();
        }
        C78767d dVar3 = this.f177070o;
        if (dVar3 != null) {
            dVar3.notifyDataSetChanged();
        }
        this.f177055L = true;
        if (this.f177058c == null) {
            C89219l.m154710a("tablayout");
        } else {
            AVDmtTabLayout aVDmtTabLayout = this.f177058c;
            if (aVDmtTabLayout == null) {
                C89219l.m154710a("tablayout");
            } else {
                AVDmtTabLayout aVDmtTabLayout2 = this.f177058c;
                if (aVDmtTabLayout2 == null) {
                    C89219l.m154710a("tablayout");
                    a = null;
                } else {
                    a = aVDmtTabLayout2.mo115520a(0);
                }
                aVDmtTabLayout.mo115535b(a, true);
            }
            mo122609a(0);
        }
        C63151d dVar4 = this.f177057b;
        if (dVar4 == null) {
            C89219l.m154710a("params");
        }
        if (dVar4.f143512i && !this.f177073r) {
            TuxCheckBox tuxCheckBox = this.f177059d;
            if (tuxCheckBox == null) {
                C89219l.m154710a("tuxCheckBox");
            }
            C63152e eVar = this.f177060e;
            if (eVar == null) {
                C89219l.m154710a("originSoundParams");
            }
            tuxCheckBox.setChecked(eVar.f143517a);
        }
        mo122617e();
        C23226a aVar2 = this.f177065j;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        C63151d dVar5 = this.f177057b;
        if (dVar5 == null) {
            C89219l.m154710a("params");
        }
        aVar2.show(dVar5.f143506c.getSupportFragmentManager(), "VerticalMusicView");
        if (!this.f177066k.f177015f) {
            this.f177066k.f177015f = true;
            mo122618f();
        }
        this.f177074s = false;
    }

    /* renamed from: e */
    public final void mo122617e() {
        MusicModel musicModel;
        List e;
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null) {
            musicModel = C78826e.m137591a(cVar);
        } else {
            musicModel = null;
        }
        if (musicModel != null) {
            if (C89219l.m154714a((Object) this.f177066k.f177016g, (Object) true)) {
                if (C78826e.m137592a(this.f177066k.f177010a, musicModel)) {
                    int b = C78826e.m137593b(this.f177066k.f177010a, musicModel);
                    if (b > 0) {
                        MusicModel remove = this.f177066k.f177010a.remove(b);
                        C89219l.m154716b(remove, "");
                        this.f177066k.f177010a.add(0, remove);
                        C78767d dVar = this.f177069n;
                        if (dVar != null) {
                            dVar.mo62377b_(this.f177066k.f177010a);
                        }
                        C78767d dVar2 = this.f177069n;
                        if (dVar2 != null) {
                            dVar2.notifyDataSetChanged();
                        }
                    }
                } else {
                    this.f177066k.f177010a.add(0, musicModel);
                    C78767d dVar3 = this.f177069n;
                    if (dVar3 != null) {
                        dVar3.mo62377b_(this.f177066k.f177010a);
                    }
                    C78767d dVar4 = this.f177069n;
                    if (dVar4 != null) {
                        dVar4.notifyDataSetChanged();
                    }
                }
            }
            if (C89219l.m154714a((Object) this.f177066k.f177016g, (Object) false)) {
                this.f177066k.f177010a.clear();
                this.f177066k.f177010a.add(musicModel);
                m137516b(true);
                m137522k();
            }
        } else if (C89219l.m154714a((Object) this.f177066k.f177016g, (Object) false)) {
            C78767d dVar5 = this.f177069n;
            if (!(dVar5 == null || (e = dVar5.mo63369e()) == null)) {
                e.clear();
            }
            C78767d dVar6 = this.f177069n;
            if (dVar6 != null) {
                dVar6.notifyDataSetChanged();
            }
            m137516b(false);
        }
    }

    /* renamed from: f */
    public final void mo122618f() {
        this.f177066k.f177016g = null;
        C78678b bVar = C78678b.f176800c;
        C63151d dVar = this.f177057b;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        AbstractC88979t a = AbstractC88979t.m154294a(new C78678b.C78683e(bVar, dVar.f143504a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        AIChooseMusicManager aIChooseMusicManager = AIChooseMusicManager.f176813c;
        C63151d dVar2 = this.f177057b;
        if (dVar2 == null) {
            C89219l.m154710a("params");
        }
        long j = (long) dVar2.f143507d;
        C63151d dVar3 = this.f177057b;
        if (dVar3 == null) {
            C89219l.m154710a("params");
        }
        int i = dVar3.f143508e;
        int i2 = f177042x;
        this.f177068m.mo142945a(AbstractC88979t.m154296a(aIChooseMusicManager.mo101557a(null, j, i, i2, i2, true).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)), a, new C78779b(this)).mo143254a(new C78780c(this), new C78781d(this)));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$m */
    public static final class C78793m implements AbstractC60747a {

        /* renamed from: a */
        final /* synthetic */ C78775g f177101a;

        static {
            Covode.recordClassIndex(91936);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78793m(C78775g gVar) {
            this.f177101a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3468c.AbstractC60747a
        /* renamed from: a */
        public final void mo98166a(String str, boolean z) {
            C78775g.m137514a(str, z);
            for (T t : this.f177101a.f177066k.f177010a) {
                if (C89219l.m154714a((Object) t.getMusicId(), (Object) str)) {
                    if (z) {
                        t.setCollectionType(MusicModel.CollectionType.COLLECTED);
                    } else {
                        t.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                    }
                }
            }
            C78767d dVar = this.f177101a.f177069n;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a
    /* renamed from: a */
    public final void mo101504a(C63152e eVar) {
        C89219l.m154721d(eVar, "");
        this.f177060e = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$l */
    static final class View$OnClickListenerC78792l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C63151d f177100a;

        static {
            Covode.recordClassIndex(91935);
        }

        View$OnClickListenerC78792l(C63151d dVar) {
            this.f177100a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f177100a.f143515l.mo101516e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C63151d m137513a(C78775g gVar) {
        C63151d dVar = gVar.f177057b;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ AVDmtTabLayout m137515b(C78775g gVar) {
        AVDmtTabLayout aVDmtTabLayout = gVar.f177058c;
        if (aVDmtTabLayout == null) {
            C89219l.m154710a("tablayout");
        }
        return aVDmtTabLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ C63152e m137517c(C78775g gVar) {
        C63152e eVar = gVar.f177060e;
        if (eVar == null) {
            C89219l.m154710a("originSoundParams");
        }
        return eVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ TuxCheckBox m137518d(C78775g gVar) {
        TuxCheckBox tuxCheckBox = gVar.f177059d;
        if (tuxCheckBox == null) {
            C89219l.m154710a("tuxCheckBox");
        }
        return tuxCheckBox;
    }

    /* renamed from: e */
    public static final /* synthetic */ SafeHandler m137519e(C78775g gVar) {
        SafeHandler safeHandler = gVar.f177064i;
        if (safeHandler == null) {
            C89219l.m154710a("safeHander");
        }
        return safeHandler;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$aa */
    static final class DialogInterface$OnDismissListenerC78777aa implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C78775g f177080a;

        static {
            Covode.recordClassIndex(91920);
        }

        DialogInterface$OnDismissListenerC78777aa(C78775g gVar) {
            this.f177080a = gVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f177080a.mo122620h();
            C78775g.m137513a(this.f177080a).f143515l.mo101508a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$ab */
    static final class DialogInterface$OnCancelListenerC78778ab implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C78775g f177081a;

        static {
            Covode.recordClassIndex(91921);
        }

        DialogInterface$OnCancelListenerC78778ab(C78775g gVar) {
            this.f177081a = gVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f177081a.mo122620h();
            C78775g.m137513a(this.f177081a).f143515l.mo101508a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$j */
    public static final class View$OnClickListenerC78790j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVDmtTabLayout f177096a;

        /* renamed from: b */
        final /* synthetic */ C78775g f177097b;

        /* renamed from: c */
        final /* synthetic */ C63151d f177098c;

        static {
            Covode.recordClassIndex(91933);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AVDmtTabLayout aVDmtTabLayout = this.f177096a;
            aVDmtTabLayout.mo115535b(aVDmtTabLayout.mo115520a(1), true);
            this.f177097b.mo122609a(1);
        }

        View$OnClickListenerC78790j(AVDmtTabLayout aVDmtTabLayout, C78775g gVar, C63151d dVar) {
            this.f177096a = aVDmtTabLayout;
            this.f177097b = gVar;
            this.f177098c = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$k */
    static final class View$OnClickListenerC78791k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C63151d f177099a;

        static {
            Covode.recordClassIndex(91934);
        }

        View$OnClickListenerC78791k(C63151d dVar) {
            this.f177099a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f177099a.f143515l.mo101514c();
            this.f177099a.f143516m.mo101523b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$v */
    public static final class View$OnClickListenerC78804v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78775g f177116a;

        static {
            Covode.recordClassIndex(91947);
        }

        View$OnClickListenerC78804v(C78775g gVar) {
            this.f177116a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C78775g.m137518d(this.f177116a).setChecked(!C78775g.m137518d(this.f177116a).isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$c */
    public static final class C78780c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78775g f177083a;

        static {
            Covode.recordClassIndex(91923);
        }

        C78780c(C78775g gVar) {
            this.f177083a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C63146a aVar = (C63146a) obj;
            List<? extends MusicModel> list = aVar.f143498a;
            if (list == null || list.isEmpty()) {
                this.f177083a.f177066k.f177016g = false;
                this.f177083a.mo122617e();
                return;
            }
            this.f177083a.f177066k.f177016g = true;
            C78775g gVar = this.f177083a;
            C78763a aVar2 = gVar.f177066k;
            C89219l.m154716b(aVar, "");
            gVar.mo122612a(aVar2, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$d */
    public static final class C78781d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78775g f177084a;

        static {
            Covode.recordClassIndex(91924);
        }

        C78781d(C78775g gVar) {
            this.f177084a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C51423a.m95787a("Get AI Recommend Music Failed. Reason:" + ((Throwable) obj).getMessage());
            this.f177084a.f177066k.f177016g = false;
            this.f177084a.mo122617e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$i */
    public static final class View$OnClickListenerC78789i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78775g f177094a;

        /* renamed from: b */
        final /* synthetic */ C63151d f177095b;

        static {
            Covode.recordClassIndex(91932);
        }

        public final void onClick(View view) {
            TabLayout.C73104f fVar;
            ClickAgent.onClick(view);
            AVDmtTabLayout b = C78775g.m137515b(this.f177094a);
            if (b != null) {
                AVDmtTabLayout b2 = C78775g.m137515b(this.f177094a);
                if (b2 != null) {
                    fVar = b2.mo115520a(0);
                } else {
                    fVar = null;
                }
                b.mo115535b(fVar, true);
            }
            this.f177094a.mo122609a(0);
        }

        View$OnClickListenerC78789i(C78775g gVar, C63151d dVar) {
            this.f177094a = gVar;
            this.f177095b = dVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$x */
    public static final class C78806x extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78775g f177118a;

        static {
            Covode.recordClassIndex(91949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78806x(C78775g gVar) {
            super(1);
            this.f177118a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setText(C78775g.m137513a(this.f177118a).f143506c.getString(R.string.cj0));
            tuxButton2.setButtonSize(3);
            tuxButton2.setButtonVariant(2);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b.C78775g.C78806x.View$OnClickListenerC788071 */

                /* renamed from: a */
                final /* synthetic */ C78806x f177119a;

                static {
                    Covode.recordClassIndex(91950);
                }

                {
                    this.f177119a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    TuxStatusView tuxStatusView = this.f177119a.f177118a.f177061f;
                    if (tuxStatusView == null) {
                        C89219l.m154710a("retryViewAI");
                    }
                    tuxStatusView.setVisibility(4);
                    this.f177119a.f177118a.mo122618f();
                }
            });
            tuxButton2.setButtonStartIcon(2131232408);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$z */
    public static final class C78809z extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78775g f177121a;

        static {
            Covode.recordClassIndex(91952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78809z(C78775g gVar) {
            super(1);
            this.f177121a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setText(C78775g.m137513a(this.f177121a).f143506c.getString(R.string.cj0));
            tuxButton2.setButtonVariant(1);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b.C78775g.C78809z.View$OnClickListenerC788101 */

                /* renamed from: a */
                final /* synthetic */ C78809z f177122a;

                static {
                    Covode.recordClassIndex(91953);
                }

                {
                    this.f177122a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    TuxStatusView tuxStatusView = this.f177122a.f177121a.f177062g;
                    if (tuxStatusView == null) {
                        C89219l.m154710a("retryViewCollect");
                    }
                    tuxStatusView.setVisibility(4);
                    this.f177122a.f177121a.mo122619g();
                }
            });
            tuxButton2.setButtonStartIcon(2131232408);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$t */
    public static final class C78802t implements AbstractC63154aa.AbstractC63165j {

        /* renamed from: a */
        final /* synthetic */ C78775g f177113a;

        /* renamed from: b */
        final /* synthetic */ MusicModel f177114b;

        static {
            Covode.recordClassIndex(91945);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63165j
        /* renamed from: a */
        public final void mo101612a(boolean z) {
            if (z) {
                this.f177114b.setCollectionType(MusicModel.CollectionType.COLLECTED);
                C78775g.m137514a(this.f177114b.getMusicId(), true);
                new C79459a(C78775g.m137513a(this.f177113a).f143506c).mo123050a(R.string.ah8).mo123053a();
                return;
            }
            new C79459a(C78775g.m137513a(this.f177113a).f143506c).mo123050a(R.string.ah3).mo123053a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63165j
        /* renamed from: b */
        public final void mo101613b(boolean z) {
            if (z) {
                this.f177114b.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                C78775g.m137514a(this.f177114b.getMusicId(), false);
                new C79459a(C78775g.m137513a(this.f177113a).f143506c).mo123050a(R.string.a93).mo123053a();
                return;
            }
            new C79459a(C78775g.m137513a(this.f177113a).f143506c).mo123050a(R.string.a92).mo123053a();
        }

        C78802t(C78775g gVar, MusicModel musicModel) {
            this.f177113a = gVar;
            this.f177114b = musicModel;
        }
    }

    /* renamed from: b */
    private final void m137516b(boolean z) {
        if (z) {
            TuxStatusView tuxStatusView = this.f177061f;
            if (tuxStatusView == null) {
                C89219l.m154710a("retryViewAI");
            }
            tuxStatusView.setVisibility(8);
            return;
        }
        DmtStatusView dmtStatusView = this.f177051H;
        if (dmtStatusView == null) {
            C89219l.m154710a("mLoadingStatusViewAI");
        }
        dmtStatusView.mo27379a(true);
        TuxStatusView tuxStatusView2 = this.f177061f;
        if (tuxStatusView2 == null) {
            C89219l.m154710a("retryViewAI");
        }
        tuxStatusView2.setVisibility(0);
        TuxStatusView tuxStatusView3 = this.f177061f;
        if (tuxStatusView3 == null) {
            C89219l.m154710a("retryViewAI");
        }
        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
        C63151d dVar = this.f177057b;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        String string = dVar.f143506c.getString(R.string.ciz);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a = cVar.mo37879a(string);
        C63151d dVar2 = this.f177057b;
        if (dVar2 == null) {
            C89219l.m154710a("params");
        }
        String string2 = dVar2.f143506c.getString(R.string.ciy);
        C89219l.m154716b(string2, "");
        TuxStatusView.C23263c a2 = a.mo37878a((CharSequence) string2);
        a2.f55132j = new C78806x(this);
        tuxStatusView3.setStatus(a2);
    }

    /* renamed from: a */
    public final void mo122609a(int i) {
        C78767d dVar;
        C78767d dVar2;
        C69905c cVar;
        MusicModel a;
        if (i != this.f177071p) {
            C78774f.f177040a = "-1";
            C78767d dVar3 = this.f177069n;
            if (dVar3 != null) {
                dVar3.mo122604a(-1);
            }
            C78767d dVar4 = this.f177070o;
            if (dVar4 != null) {
                dVar4.mo122604a(-1);
            }
            if (i == 0 && C89219l.m154714a((Object) this.f177066k.f177016g, (Object) true) && (cVar = C70005cr.m123611a().f156482a) != null && (a = C78826e.m137591a(cVar)) != null && C89219l.m154714a((Object) this.f177066k.f177016g, (Object) true) && !C78826e.m137592a(this.f177066k.f177010a, a)) {
                this.f177066k.f177010a.add(0, a);
                C78767d dVar5 = this.f177069n;
                if (dVar5 != null) {
                    dVar5.mo62377b_(this.f177066k.f177010a);
                }
                C78767d dVar6 = this.f177069n;
                if (dVar6 != null) {
                    dVar6.notifyDataSetChanged();
                }
            }
        }
        C78766c.f177018a.clear();
        if (i == 0) {
            C63151d dVar7 = this.f177057b;
            if (dVar7 == null) {
                C89219l.m154710a("params");
            }
            dVar7.f143516m.mo101524b(true);
            this.f177071p = 0;
            View view = this.f177049F;
            if (view == null) {
                C89219l.m154710a("viewGroupAI");
            }
            view.setVisibility(0);
            View view2 = this.f177050G;
            if (view2 == null) {
                C89219l.m154710a("viewGroupCollect");
            }
            view2.setVisibility(4);
            ArrayList<MusicModel> arrayList = this.f177066k.f177010a;
            if (arrayList != null && !arrayList.isEmpty() && (dVar2 = this.f177069n) != null) {
                dVar2.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.f177071p = 1;
        C63151d dVar8 = this.f177057b;
        if (dVar8 == null) {
            C89219l.m154710a("params");
        }
        dVar8.f143516m.mo101524b(false);
        View view3 = this.f177049F;
        if (view3 == null) {
            C89219l.m154710a("viewGroupAI");
        }
        view3.setVisibility(4);
        View view4 = this.f177050G;
        if (view4 == null) {
            C89219l.m154710a("viewGroupCollect");
        }
        view4.setVisibility(0);
        if (!this.f177067l.f177015f) {
            this.f177055L = false;
            if (!C63244g.m114602a().mo73255A().mo93903b()) {
                C58957c.m108321a(C40964c.m82474c(), "video_edit_page", "edit_page_recommend_favourite", new C78786f(this));
            } else {
                mo122619g();
            }
        } else {
            ArrayList<MusicModel> arrayList2 = this.f177067l.f177010a;
            if (!(arrayList2 == null || arrayList2.isEmpty() || (dVar = this.f177070o) == null)) {
                dVar.notifyDataSetChanged();
            }
            if (this.f177055L) {
                this.f177055L = false;
                this.f177077v = true;
                C78748b bVar = C78748b.f176963h;
                C63151d dVar9 = this.f177057b;
                if (dVar9 == null) {
                    C89219l.m154710a("params");
                }
                bVar.mo122593b(dVar9.f143508e);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a
    /* renamed from: a */
    public final void mo101503a(C63151d dVar) {
        View view;
        View view2;
        MethodCollector.m26663i(3334);
        C89219l.m154721d(dVar, "");
        this.f177057b = dVar;
        this.f177073r = dVar.f143513j;
        this.f177064i = new SafeHandler(dVar.f143506c);
        ActivityC0945e eVar = dVar.f143506c;
        if (eVar != null) {
            TabLayout.C73104f fVar = null;
            View inflate = LayoutInflater.from(eVar).inflate(R.layout.bip, (ViewGroup) null);
            C89219l.m154716b(inflate, "");
            this.f177079z = inflate;
            if (inflate == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById = inflate.findViewById(R.id.doo);
            C89219l.m154716b(findViewById, "");
            this.f177044A = (RecyclerView) findViewById;
            View view3 = this.f177079z;
            if (view3 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById2 = view3.findViewById(R.id.eee);
            C89219l.m154716b(findViewById2, "");
            this.f177058c = (AVDmtTabLayout) findViewById2;
            View view4 = this.f177079z;
            if (view4 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById3 = view4.findViewById(R.id.cfy);
            C89219l.m154716b(findViewById3, "");
            this.f177051H = (DmtStatusView) findViewById3;
            View view5 = this.f177079z;
            if (view5 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById4 = view5.findViewById(R.id.cfz);
            C89219l.m154716b(findViewById4, "");
            this.f177063h = (DmtStatusView) findViewById4;
            View view6 = this.f177079z;
            if (view6 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById5 = view6.findViewById(R.id.dop);
            C89219l.m154716b(findViewById5, "");
            this.f177056a = (AVDmtPanelRecycleView) findViewById5;
            View view7 = this.f177079z;
            if (view7 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById6 = view7.findViewById(R.id.dkq);
            C89219l.m154716b(findViewById6, "");
            this.f177052I = (FrameLayout) findViewById6;
            View view8 = this.f177079z;
            if (view8 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById7 = view8.findViewById(R.id.fh4);
            C89219l.m154716b(findViewById7, "");
            this.f177047D = findViewById7;
            View view9 = this.f177079z;
            if (view9 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById8 = view9.findViewById(R.id.eqs);
            C89219l.m154716b(findViewById8, "");
            this.f177059d = (TuxCheckBox) findViewById8;
            View view10 = this.f177079z;
            if (view10 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById9 = view10.findViewById(R.id.eqt);
            C89219l.m154716b(findViewById9, "");
            this.f177045B = (TextView) findViewById9;
            View view11 = this.f177079z;
            if (view11 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById10 = view11.findViewById(R.id.equ);
            C89219l.m154716b(findViewById10, "");
            this.f177046C = findViewById10;
            View view12 = this.f177079z;
            if (view12 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById11 = view12.findViewById(R.id.b2b);
            C89219l.m154716b(findViewById11, "");
            this.f177048E = findViewById11;
            View view13 = this.f177079z;
            if (view13 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById12 = view13.findViewById(R.id.e7j);
            C89219l.m154716b(findViewById12, "");
            this.f177061f = (TuxStatusView) findViewById12;
            View view14 = this.f177079z;
            if (view14 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById13 = view14.findViewById(R.id.e7k);
            C89219l.m154716b(findViewById13, "");
            this.f177062g = (TuxStatusView) findViewById13;
            View view15 = this.f177079z;
            if (view15 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById14 = view15.findViewById(R.id.ffc);
            C89219l.m154716b(findViewById14, "");
            this.f177049F = findViewById14;
            View view16 = this.f177079z;
            if (view16 == null) {
                C89219l.m154710a("thisView");
            }
            View findViewById15 = view16.findViewById(R.id.ffb);
            C89219l.m154716b(findViewById15, "");
            this.f177050G = findViewById15;
            View view17 = this.f177049F;
            if (view17 == null) {
                C89219l.m154710a("viewGroupAI");
            }
            view17.setVisibility(0);
            View view18 = this.f177050G;
            if (view18 == null) {
                C89219l.m154710a("viewGroupCollect");
            }
            view18.setVisibility(4);
            TuxStatusView tuxStatusView = this.f177061f;
            if (tuxStatusView == null) {
                C89219l.m154710a("retryViewAI");
            }
            tuxStatusView.setButtonTopMargin(C13628n.m24520b(dVar.f143506c, 20.0f));
            TuxStatusView tuxStatusView2 = this.f177062g;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("retryViewCollect");
            }
            tuxStatusView2.setButtonTopMargin(C13628n.m24520b(dVar.f143506c, 20.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (C13628n.m24521b(dVar.f143506c) / 2) - ((int) C13628n.m24520b(dVar.f143506c, 107.0f)));
            FrameLayout frameLayout = this.f177052I;
            if (frameLayout == null) {
                C89219l.m154710a("contentListParentView");
            }
            frameLayout.setLayoutParams(layoutParams);
            DmtStatusView dmtStatusView = this.f177051H;
            if (dmtStatusView == null) {
                C89219l.m154710a("mLoadingStatusViewAI");
            }
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(dVar.f143506c);
            a.f41304g = 1;
            dmtStatusView.setBuilder(a);
            DmtStatusView dmtStatusView2 = this.f177051H;
            if (dmtStatusView2 == null) {
                C89219l.m154710a("mLoadingStatusViewAI");
            }
            dmtStatusView2.mo27384f();
            DmtStatusView dmtStatusView3 = this.f177063h;
            if (dmtStatusView3 == null) {
                C89219l.m154710a("mLoadingStatusViewCollect");
            }
            DmtStatusView.C17269a a2 = DmtStatusView.C17269a.m31905a(dVar.f143506c);
            a2.f41304g = 1;
            dmtStatusView3.setBuilder(a2);
            DmtStatusView dmtStatusView4 = this.f177063h;
            if (dmtStatusView4 == null) {
                C89219l.m154710a("mLoadingStatusViewCollect");
            }
            dmtStatusView4.mo27384f();
            this.f177053J = MusicService.m81198m().mo69292a(this.f177078w);
            RecyclerView recyclerView = this.f177044A;
            if (recyclerView == null) {
                C89219l.m154710a("aiRecycerView");
            }
            C78764b.m137502a(recyclerView);
            AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f177056a;
            if (aVDmtPanelRecycleView == null) {
                C89219l.m154710a("collectionRecycerView");
            }
            C78764b.m137502a(aVDmtPanelRecycleView);
            View view19 = this.f177047D;
            if (view19 == null) {
                C89219l.m154710a("volumeView");
            }
            view19.setOnClickListener(new View$OnClickListenerC78791k(dVar));
            this.f177060e = dVar.f143511h;
            m137520i();
            View view20 = this.f177048E;
            if (view20 == null) {
                C89219l.m154710a("findMore");
            }
            view20.setOnClickListener(new View$OnClickListenerC78792l(dVar));
            AVDmtTabLayout aVDmtTabLayout = this.f177058c;
            if (aVDmtTabLayout == null) {
                C89219l.m154710a("tablayout");
            } else {
                aVDmtTabLayout.setTabMode(0);
                C77792a b = AVDmtTabLayout.C77790a.m135899b(aVDmtTabLayout.getContext());
                aVDmtTabLayout.mo115525a(aVDmtTabLayout.mo115519a().mo115584a(b));
                b.setOnClickListener(new View$OnClickListenerC78789i(this, dVar));
                TabLayout.C73104f a3 = aVDmtTabLayout.mo115520a(0);
                if (a3 != null) {
                    view = a3.f164125f;
                } else {
                    view = null;
                }
                C77792a aVar = (C77792a) view;
                if (aVar != null) {
                    aVar.setText(dVar.f143506c.getString(R.string.b9z));
                    aVar.setTextPaddingLR(8.0f);
                }
                C77792a b2 = AVDmtTabLayout.C77790a.m135899b(dVar.f143506c);
                aVDmtTabLayout.mo115525a(aVDmtTabLayout.mo115519a().mo115584a(b2));
                b2.setOnClickListener(new View$OnClickListenerC78790j(aVDmtTabLayout, this, dVar));
                TabLayout.C73104f a4 = aVDmtTabLayout.mo115520a(1);
                if (a4 != null) {
                    view2 = a4.f164125f;
                } else {
                    view2 = null;
                }
                C77792a aVar2 = (C77792a) view2;
                if (aVar2 != null) {
                    aVar2.setText(dVar.f143506c.getString(R.string.eup));
                    aVar2.setTextPaddingLR(8.0f);
                }
                AVDmtTabLayout aVDmtTabLayout2 = this.f177058c;
                if (aVDmtTabLayout2 == null) {
                    C89219l.m154710a("tablayout");
                } else {
                    AVDmtTabLayout aVDmtTabLayout3 = this.f177058c;
                    if (aVDmtTabLayout3 == null) {
                        C89219l.m154710a("tablayout");
                    } else {
                        fVar = aVDmtTabLayout3.mo115520a(0);
                    }
                    aVDmtTabLayout2.mo115534b(fVar);
                }
                ViewParent parent = b.getParent();
                if (parent != null) {
                    ViewGroup.LayoutParams layoutParams2 = ((View) parent).getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                        ViewParent parent2 = b.getParent();
                        if (parent2 != null) {
                            ((View) parent2).setLayoutParams(marginLayoutParams);
                            ViewParent parent3 = b2.getParent();
                            if (parent3 != null) {
                                ViewGroup.LayoutParams layoutParams3 = ((View) parent3).getLayoutParams();
                                if (layoutParams3 != null) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                    marginLayoutParams2.leftMargin = 0;
                                    marginLayoutParams2.rightMargin = 0;
                                    ViewParent parent4 = b2.getParent();
                                    if (parent4 != null) {
                                        ((View) parent4).setLayoutParams(marginLayoutParams2);
                                    } else {
                                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.View");
                                        MethodCollector.m26664o(3334);
                                        throw nullPointerException;
                                    }
                                } else {
                                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    MethodCollector.m26664o(3334);
                                    throw nullPointerException2;
                                }
                            } else {
                                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.View");
                                MethodCollector.m26664o(3334);
                                throw nullPointerException3;
                            }
                        } else {
                            NullPointerException nullPointerException4 = new NullPointerException("null cannot be cast to non-null type android.view.View");
                            MethodCollector.m26664o(3334);
                            throw nullPointerException4;
                        }
                    } else {
                        NullPointerException nullPointerException5 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        MethodCollector.m26664o(3334);
                        throw nullPointerException5;
                    }
                } else {
                    NullPointerException nullPointerException6 = new NullPointerException("null cannot be cast to non-null type android.view.View");
                    MethodCollector.m26664o(3334);
                    throw nullPointerException6;
                }
            }
            IMusicService m = MusicService.m81198m();
            C89219l.m154716b(m, "");
            m.mo69305a(new C78793m(this));
            MethodCollector.m26664o(3334);
            return;
        }
        NullPointerException nullPointerException7 = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.m26664o(3334);
        throw nullPointerException7;
    }

    /* renamed from: a */
    public final void mo122613a(C78767d dVar) {
        C89219l.m154721d(dVar, "");
        C78774f.f177040a = "-1";
        C63151d dVar2 = this.f177057b;
        if (dVar2 == null) {
            C89219l.m154710a("params");
        }
        dVar2.f143515l.mo101512a(false);
        C63151d dVar3 = this.f177057b;
        if (dVar3 == null) {
            C89219l.m154710a("params");
        }
        if (C84904k.m145909a(dVar3.f143504a)) {
            if (!((Boolean) this.f177054K.getValue()).booleanValue()) {
                C63151d dVar4 = this.f177057b;
                if (dVar4 == null) {
                    C89219l.m154710a("params");
                }
                if (dVar4.f143510g) {
                    C63151d dVar5 = this.f177057b;
                    if (dVar5 == null) {
                        C89219l.m154710a("params");
                    }
                    String string = dVar5.f143506c.getString(R.string.b06);
                    C89219l.m154716b(string, "");
                    C63151d dVar6 = this.f177057b;
                    if (dVar6 == null) {
                        C89219l.m154710a("params");
                    }
                    new C79459a(dVar6.f143506c).mo123052a(string).mo123053a();
                    return;
                }
            }
            dVar.f177020a = -1;
            dVar.notifyDataSetChanged();
            C63151d dVar7 = this.f177057b;
            if (dVar7 == null) {
                C89219l.m154710a("params");
            }
            dVar7.f143515l.mo101511a(null, null, false);
        }
    }

    /* renamed from: a */
    public static void m137514a(String str, boolean z) {
        String str2;
        C69905c cVar;
        C69905c cVar2 = C70005cr.m123611a().f156482a;
        if (cVar2 != null) {
            str2 = cVar2.getMusicId();
        } else {
            str2 = null;
        }
        if (C89219l.m154714a((Object) str2, (Object) str) && (cVar = C70005cr.m123611a().f156482a) != null) {
            cVar.setCollected(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$b */
    public static final class C78779b<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        final /* synthetic */ C78775g f177082a;

        static {
            Covode.recordClassIndex(91922);
        }

        C78779b(C78775g gVar) {
            this.f177082a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            C63146a aVar = (C63146a) obj;
            MusicModel musicModel = (MusicModel) obj2;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(musicModel, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(musicModel, "");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(musicModel.getMusicId())) {
                arrayList.add(musicModel);
            }
            List<? extends MusicModel> list = aVar.f143498a;
            if (list != null) {
                arrayList.addAll(list);
            }
            aVar.f143498a = arrayList;
            return aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo122610a(MusicModel musicModel, boolean z) {
        C89219l.m154721d(musicModel, "");
        String musicId = musicModel.getMusicId();
        C89219l.m154716b(musicId, "");
        C78774f.f177040a = musicId;
        C63151d dVar = this.f177057b;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        dVar.f143515l.mo101512a(false);
        if (!z) {
            this.f177076u = "-1";
        } else {
            C63151d dVar2 = this.f177057b;
            if (dVar2 == null) {
                C89219l.m154710a("params");
            }
            dVar2.f143516m.mo101518a(musicModel, 0, "recommend", z);
        }
        AbstractC60326a aVar = this.f177053J;
        if (aVar != null) {
            aVar.mo97994b(musicModel, 3, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.g$u */
    public static final class C78803u implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C78775g f177115a;

        static {
            Covode.recordClassIndex(91946);
        }

        C78803u(C78775g gVar) {
            this.f177115a = gVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f177115a.f177074s) {
                this.f177115a.f177074s = false;
                C78775g.m137517c(this.f177115a).f143518b = 1.0f;
                this.f177115a.f177075t = false;
                C78775g.m137513a(this.f177115a).f143515l.mo101509a(C78775g.m137517c(this.f177115a).f143518b);
                return;
            }
            C78775g.m137517c(this.f177115a).f143517a = z;
            if (z) {
                C78775g.m137513a(this.f177115a).f143515l.mo101509a(C78775g.m137517c(this.f177115a).f143518b);
            } else {
                C78775g.m137513a(this.f177115a).f143515l.mo101509a(0.0f);
            }
            if (!this.f177115a.f177075t) {
                C78775g.m137513a(this.f177115a).f143516m.mo101521a(z);
            }
            this.f177115a.f177075t = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo122612a(C78763a aVar, C63146a aVar2) {
        MusicModel musicModel;
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null) {
            musicModel = C78821b.C78822a.m137588a(cVar);
        } else {
            musicModel = null;
        }
        int i = 0;
        if (!C78826e.m137592a(aVar.f177010a, musicModel) && musicModel != null) {
            aVar.f177010a.add(0, musicModel);
        }
        List<? extends MusicModel> list = aVar2.f143498a;
        if (list != null) {
            ArrayList<Object> arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                ArrayList<MusicModel> arrayList2 = aVar.f177010a;
                C89219l.m154721d(arrayList2, "");
                if (t2 != null && !arrayList2.isEmpty()) {
                    MusicModel musicModel2 = arrayList2.get(0);
                    C89219l.m154716b(musicModel2, "");
                    if (C89219l.m154714a((Object) musicModel2.getMusicId(), (Object) t2.getMusicId())) {
                    }
                }
                arrayList.add(t);
            }
            for (Object obj : arrayList) {
                aVar.f177010a.add(obj);
            }
        }
        aVar.f177012c = aVar2.f143501d;
        String str = aVar2.f143503f;
        C89219l.m154721d(str, "");
        aVar.f177011b = str;
        aVar.f177013d = aVar2.f143502e;
        List<? extends MusicModel> list2 = aVar2.f143498a;
        if (list2 != null) {
            i = list2.size();
        }
        aVar.f177014e = i;
        m137522k();
    }

    /* renamed from: a */
    public final void mo122611a(MusicModel musicModel, boolean z, int i) {
        String musicId = musicModel.getMusicId();
        if (musicId != null && !this.f177072q.contains(musicId)) {
            C63151d dVar = this.f177057b;
            if (dVar == null) {
                C89219l.m154710a("params");
            }
            dVar.f143516m.mo101520a(musicModel, z, i);
            this.f177072q.add(musicId);
        }
    }
}
