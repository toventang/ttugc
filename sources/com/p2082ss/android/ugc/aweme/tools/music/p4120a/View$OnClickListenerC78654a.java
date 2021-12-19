package com.p2082ss.android.ugc.aweme.tools.music.p4120a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.music.AbstractC60326a;
import com.p2082ss.android.ugc.aweme.music.p3468c.AbstractC60747a;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.service.IMusicService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40884a;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40892g;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40893h;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40896k;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40897l;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63146a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.C77792a;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.C78724c;
import com.p2082ss.android.ugc.aweme.tools.music.p4124c.AbstractC78743a;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78759b;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4126a.C78745a;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4126a.C78748b;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78821b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.tools.music.a.a */
public final class View$OnClickListenerC78654a implements View.OnClickListener, AbstractC61180m, AbstractC63154aa.AbstractC63159d {

    /* renamed from: B */
    public static final C78655a f176736B = new C78655a((byte) 0);

    /* renamed from: A */
    public final int f176737A;

    /* renamed from: C */
    private List<? extends MusicModel> f176738C;

    /* renamed from: D */
    private FrameLayout f176739D;

    /* renamed from: E */
    private View f176740E;

    /* renamed from: F */
    private View f176741F;

    /* renamed from: G */
    private View f176742G;

    /* renamed from: H */
    private List<MusicModel> f176743H = new ArrayList();

    /* renamed from: I */
    private final HashMap<String, Boolean> f176744I = new HashMap<>();

    /* renamed from: J */
    private final AbstractC89244h f176745J = C89250i.m154773a((AbstractC89171a) C78668g.f176788a);

    /* renamed from: K */
    private final AbstractC31071f f176746K;

    /* renamed from: L */
    private final AbstractC89171a<String> f176747L;

    /* renamed from: a */
    public String f176748a = "default_task_id";

    /* renamed from: b */
    public AbstractC40897l f176749b;

    /* renamed from: c */
    public AVDmtTabLayout f176750c;

    /* renamed from: d */
    public int f176751d = 3;

    /* renamed from: e */
    public C78759b f176752e;

    /* renamed from: f */
    public C78724c f176753f;

    /* renamed from: g */
    public AbstractC60326a f176754g;

    /* renamed from: h */
    public RecyclerView f176755h;

    /* renamed from: i */
    ViewGroup f176756i;

    /* renamed from: j */
    ViewGroup f176757j;

    /* renamed from: k */
    public RecyclerView f176758k;

    /* renamed from: l */
    public AVDmtTextView f176759l;

    /* renamed from: m */
    public View f176760m;

    /* renamed from: n */
    public int f176761n;

    /* renamed from: o */
    public C63146a f176762o;

    /* renamed from: p */
    public MusicModel f176763p;

    /* renamed from: q */
    public TextView f176764q;

    /* renamed from: r */
    public C78745a f176765r;

    /* renamed from: s */
    public AbstractC40895j f176766s;

    /* renamed from: t */
    public AbstractC40896k f176767t;

    /* renamed from: u */
    public AbstractC40892g f176768u;

    /* renamed from: v */
    public List<String> f176769v;

    /* renamed from: w */
    public AbstractC40893h f176770w;

    /* renamed from: x */
    public final ActivityC0218d f176771x;

    /* renamed from: y */
    public final AbstractC40884a f176772y;

    /* renamed from: z */
    public final boolean f176773z;

    static {
        Covode.recordClassIndex(91795);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62876a(MusicModel musicModel, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: c */
    public final void mo62883c(MusicModel musicModel) {
    }

    /* renamed from: l */
    public final boolean mo122538l() {
        return ((Boolean) this.f176745J.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: r */
    public final void mo62890r() {
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$a */
    public static final class C78655a {
        static {
            Covode.recordClassIndex(91796);
        }

        private C78655a() {
        }

        public /* synthetic */ C78655a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: e */
    public final int mo101587e() {
        return this.f176761n;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: i */
    public final Activity mo62886i() {
        return this.f176771x;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final void mo101581a(List<String> list) {
        this.f176769v = list;
    }

    /* renamed from: a */
    public final void mo122537a(String str, boolean z) {
        C69905c cVar;
        List<? extends MusicModel> list;
        C78759b bVar;
        List<? extends MusicModel> list2;
        MusicModel musicModel;
        C78759b bVar2 = this.f176752e;
        if (bVar2 != null && (list = bVar2.f177005l) != null) {
            int i = 0;
            Iterator<? extends MusicModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!C89219l.m154714a((Object) ((MusicModel) it.next()).getMusicId(), (Object) str)) {
                    i++;
                } else if (i >= 0 && (bVar = this.f176752e) != null && (list2 = bVar.f177005l) != null && (musicModel = (MusicModel) list2.get(i)) != null) {
                    musicModel.setCollectionType(z ? MusicModel.CollectionType.COLLECTED : MusicModel.CollectionType.NOT_COLLECTED);
                }
            }
        }
        C69905c cVar2 = C70005cr.m123611a().f156482a;
        if (C89219l.m154714a((Object) (cVar2 != null ? cVar2.getMusicId() : null), (Object) str) && (cVar = C70005cr.m123611a().f156482a) != null) {
            cVar.setCollected(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122536a(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.music.p4120a.View$OnClickListenerC78654a.mo122536a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0107, code lost:
        if (r11 == null) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62880a(java.lang.String r10, com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.music.p4120a.View$OnClickListenerC78654a.mo62880a(java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62878a(MusicModel musicModel, Exception exc) {
        MusicModel m;
        MusicModel e;
        C89219l.m154721d(exc, "");
        String str = null;
        if (this.f176761n == 0) {
            C89219l.m154721d(exc, "");
            C78759b bVar = this.f176752e;
            String musicId = (bVar == null || (e = bVar.mo122595e()) == null) ? null : e.getMusicId();
            if (musicModel != null) {
                str = musicModel.getMusicId();
            }
            if (!(!C89219l.m154714a((Object) musicId, (Object) str))) {
                C78759b bVar2 = this.f176752e;
                if (bVar2 != null) {
                    bVar2.mo101605c();
                }
                C78759b bVar3 = this.f176752e;
                if (bVar3 != null) {
                    bVar3.f176995b = (bVar3.f176994a - 1) + 1;
                }
                mo101582a(false);
            }
        } else {
            C89219l.m154721d(exc, "");
            C78745a aVar = this.f176765r;
            String musicId2 = (aVar == null || (m = aVar.mo122583m()) == null) ? null : m.getMusicId();
            if (musicModel != null) {
                str = musicModel.getMusicId();
            }
            if (!(!C89219l.m154714a((Object) musicId2, (Object) str))) {
                C78745a aVar2 = this.f176765r;
                if (aVar2 != null) {
                    aVar2.mo122585o();
                }
                C78745a aVar3 = this.f176765r;
                if (aVar3 != null) {
                    aVar3.f176951e = aVar3.f176950d;
                }
                mo101582a(false);
            }
        }
        AbstractC40893h hVar = this.f176770w;
        if (hVar != null) {
            hVar.mo70090c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final void mo101582a(boolean z) {
        View view;
        if ((z || C70005cr.m123611a().f156482a != null) && (view = this.f176740E) != null) {
            view.setVisibility(0);
        }
        View view2 = this.f176740E;
        if (view2 != null) {
            view2.setAlpha(z ? 1.0f : 0.5f);
        }
        View view3 = this.f176740E;
        if (view3 != null) {
            view3.setEnabled(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$m */
    public static final class C78674m implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176794a;

        static {
            Covode.recordClassIndex(91815);
        }

        C78674m(View$OnClickListenerC78654a aVar) {
            this.f176794a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f176794a.mo122540n();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final void mo101574a() {
        C78724c cVar = this.f176753f;
        if (cVar != null) {
            cVar.mo122576b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    public final boolean bT_() {
        if (this.f176760m != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: g */
    public final void mo101589g() {
        C78759b bVar = this.f176752e;
        if (bVar != null) {
            bVar.mo122598h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$f */
    public static final class C78662f implements AbstractC63154aa.AbstractC63166k {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176780a;

        static {
            Covode.recordClassIndex(91803);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63166k
        /* renamed from: a */
        public final void mo101614a() {
            RecyclerView recyclerView = this.f176780a.f176755h;
            if (recyclerView != null) {
                recyclerView.post(new RunnableC78666c(this));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63166k
        /* renamed from: b */
        public final void mo101616b() {
            RecyclerView recyclerView = this.f176780a.f176755h;
            if (recyclerView != null) {
                recyclerView.post(new RunnableC78665b(this));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63166k
        /* renamed from: c */
        public final void mo101617c() {
            RecyclerView recyclerView = this.f176780a.f176755h;
            if (recyclerView != null) {
                recyclerView.post(new RunnableC78663a(this));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$f$b */
        static final class RunnableC78665b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C78662f f176783a;

            static {
                Covode.recordClassIndex(91806);
            }

            RunnableC78665b(C78662f fVar) {
                this.f176783a = fVar;
            }

            public final void run() {
                RecyclerView recyclerView = this.f176783a.f176780a.f176755h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                C78745a aVar = this.f176783a.f176780a.f176765r;
                if (aVar != null) {
                    aVar.f176949c = true;
                    aVar.f176956j = 1;
                    aVar.f176955i.clear();
                    aVar.f176954h.cancel();
                    aVar.f176954h.removeAllListeners();
                    RecyclerView recyclerView2 = aVar.f176952f;
                    if (recyclerView2 != null) {
                        recyclerView2.post(new C78745a.RunnableC78747b(aVar));
                    }
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$f$c */
        static final class RunnableC78666c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C78662f f176784a;

            static {
                Covode.recordClassIndex(91807);
            }

            RunnableC78666c(C78662f fVar) {
                this.f176784a = fVar;
            }

            public final void run() {
                C78745a aVar = this.f176784a.f176780a.f176765r;
                if (aVar != null) {
                    aVar.mo122584n();
                }
                RecyclerView recyclerView = this.f176784a.f176780a.f176755h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f176784a.f176780a.f176764q;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f176784a.f176780a.f176764q;
                if (textView2 != null) {
                    textView2.setText(this.f176784a.f176780a.f176771x.getResources().getString(R.string.ah6));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$f$a */
        static final class RunnableC78663a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C78662f f176781a;

            static {
                Covode.recordClassIndex(91804);
            }

            RunnableC78663a(C78662f fVar) {
                this.f176781a = fVar;
            }

            public final void run() {
                C78745a aVar = this.f176781a.f176780a.f176765r;
                if (aVar != null) {
                    aVar.mo122584n();
                }
                RecyclerView recyclerView = this.f176781a.f176780a.f176755h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f176781a.f176780a.f176764q;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f176781a.f176780a.f176764q;
                if (textView2 != null) {
                    textView2.setText(this.f176781a.f176780a.f176771x.getResources().getString(R.string.bop));
                }
                TextView textView3 = this.f176781a.f176780a.f176764q;
                if (textView3 != null) {
                    textView3.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.aweme.tools.music.p4120a.View$OnClickListenerC78654a.C78662f.RunnableC78663a.View$OnClickListenerC786641 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC78663a f176782a;

                        static {
                            Covode.recordClassIndex(91805);
                        }

                        {
                            this.f176782a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            C78748b.f176963h.mo122593b(this.f176782a.f176781a.f176780a.f176737A);
                        }
                    });
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$f$d */
        static final class RunnableC78667d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C78662f f176785a;

            /* renamed from: b */
            final /* synthetic */ List f176786b;

            /* renamed from: c */
            final /* synthetic */ boolean f176787c;

            static {
                Covode.recordClassIndex(91808);
            }

            RunnableC78667d(C78662f fVar, List list, boolean z) {
                this.f176785a = fVar;
                this.f176786b = list;
                this.f176787c = z;
            }

            public final void run() {
                String str;
                int i;
                String str2;
                MusicModel l;
                RecyclerView recyclerView = this.f176785a.f176780a.f176755h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                TextView textView = this.f176785a.f176780a.f176764q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                C78745a aVar = this.f176785a.f176780a.f176765r;
                if (aVar != null) {
                    aVar.mo122584n();
                }
                C78745a aVar2 = this.f176785a.f176780a.f176765r;
                if (aVar2 != null) {
                    aVar2.mo62377b_(this.f176786b);
                }
                C78745a aVar3 = this.f176785a.f176780a.f176765r;
                String str3 = null;
                if (aVar3 == null || (l = aVar3.mo122582l()) == null) {
                    str = null;
                } else {
                    str = l.getMusicId();
                }
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (cVar != null) {
                    str3 = cVar.getMusicId();
                }
                if (!C89219l.m154714a((Object) str, (Object) str3)) {
                    C78745a aVar4 = this.f176785a.f176780a.f176765r;
                    int i2 = -1;
                    if (aVar4 != null) {
                        C78745a aVar5 = this.f176785a.f176780a.f176765r;
                        if (aVar5 != null) {
                            C69905c cVar2 = C70005cr.m123611a().f156482a;
                            if (cVar2 == null || (str2 = cVar2.getMusicId()) == null) {
                                str2 = "";
                            }
                            C89219l.m154716b(str2, "");
                            C89219l.m154721d(str2, "");
                            List list = aVar5.f92236l;
                            if (list != null) {
                                Iterator it = list.iterator();
                                i = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    MusicModel musicModel = (MusicModel) it.next();
                                    C89219l.m154716b(musicModel, "");
                                    if (C89219l.m154714a((Object) musicModel.getMusicId(), (Object) str2)) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                        i = -1;
                        aVar4.f176951e = i;
                    }
                    C78745a aVar6 = this.f176785a.f176780a.f176765r;
                    if (aVar6 != null) {
                        C78745a aVar7 = this.f176785a.f176780a.f176765r;
                        if (aVar7 != null) {
                            i2 = aVar7.f176951e;
                        }
                        aVar6.mo101591a(i2);
                    }
                }
                C78745a aVar8 = this.f176785a.f176780a.f176765r;
                if (aVar8 != null) {
                    aVar8.mo67829d(true);
                }
                if (!this.f176787c) {
                    C78745a aVar9 = this.f176785a.f176780a.f176765r;
                    if (aVar9 != null) {
                        aVar9.ap_();
                    }
                    C78745a aVar10 = this.f176785a.f176780a.f176765r;
                    if (aVar10 != null) {
                        aVar10.mo67829d(false);
                        return;
                    }
                    return;
                }
                C78745a aVar11 = this.f176785a.f176780a.f176765r;
                if (aVar11 != null) {
                    aVar11.aq_();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78662f(View$OnClickListenerC78654a aVar) {
            this.f176780a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63166k
        /* renamed from: a */
        public final void mo101615a(List<? extends MusicModel> list, boolean z) {
            C89219l.m154721d(list, "");
            RecyclerView recyclerView = this.f176780a.f176755h;
            if (recyclerView != null) {
                recyclerView.post(new RunnableC78667d(this, list, z));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$o */
    static final class C78676o implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176797a;

        static {
            Covode.recordClassIndex(91817);
        }

        C78676o(View$OnClickListenerC78654a aVar) {
            this.f176797a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            C78748b.f176963h.mo122593b(this.f176797a.f176737A);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: d */
    public final void mo101586d() {
        RecyclerView recyclerView = this.f176758k;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: f */
    public final void mo101588f() {
        RecyclerView recyclerView;
        C78759b bVar = this.f176752e;
        if (bVar != null && (recyclerView = bVar.f176996c) != null) {
            recyclerView.mo4451f(bVar.f176994a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: h */
    public final MusicModel mo62885h() {
        C78759b bVar = this.f176752e;
        if (bVar != null) {
            return bVar.mo122599i();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: k */
    public final void mo101590k() {
        AVDmtTabLayout aVDmtTabLayout = this.f176750c;
        if (aVDmtTabLayout != null) {
            aVDmtTabLayout.mo115535b(aVDmtTabLayout.mo115520a(0), true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e */
    static final class C78661e implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176779a;

        static {
            Covode.recordClassIndex(91802);
        }

        C78661e(View$OnClickListenerC78654a aVar) {
            this.f176779a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            C78745a aVar = this.f176779a.f176765r;
            if (aVar != null) {
                aVar.ao_();
            }
            C78748b.f176963h.mo122594c(this.f176779a.f176737A);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$g */
    static final class C78668g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C78668g f176788a = new C78668g();

        static {
            Covode.recordClassIndex(91809);
        }

        C78668g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$p */
    public static final class RunnableC78677p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176798a;

        /* renamed from: b */
        final /* synthetic */ String f176799b;

        static {
            Covode.recordClassIndex(91818);
        }

        RunnableC78677p(View$OnClickListenerC78654a aVar, String str) {
            this.f176798a = aVar;
            this.f176799b = str;
        }

        public final void run() {
            C78759b bVar = this.f176798a.f176752e;
            if (bVar != null) {
                bVar.mo101606d();
            }
            this.f176798a.mo122536a(this.f176799b);
        }
    }

    /* renamed from: p */
    private final void m137262p() {
        this.f176762o = null;
        this.f176743H.clear();
        C78759b bVar = this.f176752e;
        if (bVar != null) {
            bVar.mo122597g();
            bVar.notifyDataSetChanged();
        }
    }

    /* renamed from: m */
    public final void mo122539m() {
        View view = this.f176740E;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.f176741F;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: b */
    public final void mo101584b() {
        C78724c cVar = this.f176753f;
        if (cVar != null) {
            cVar.f176915c.removeCallbacksAndMessages(null);
            cVar.f176915c.postDelayed(cVar.f176917e, cVar.f176916d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: c */
    public final void mo101585c() {
        C78748b.f176963h.f176965a = null;
        C78748b.f176963h.f176966b = null;
        C78678b.f176800c.f176802a = null;
        IMusicService m = MusicService.m81198m();
        C89219l.m154716b(m, "");
        m.mo69305a((AbstractC60747a) null);
        C78724c cVar = this.f176753f;
        if (cVar != null) {
            cVar.f176915c.removeCallbacksAndMessages(null);
        }
        AbstractC60326a aVar = this.f176754g;
        if (aVar != null) {
            aVar.mo63045d();
        }
    }

    /* renamed from: o */
    private final void m137261o() {
        String str;
        long j;
        String invoke = this.f176747L.invoke();
        if (invoke == null) {
            invoke = "default_task_id";
        }
        this.f176748a = invoke;
        if (!C89219l.m154714a((Object) this.f176744I.get(invoke), (Object) true)) {
            m137262p();
            C78759b bVar = this.f176752e;
            if (bVar != null) {
                bVar.mo122596f();
            }
            AbstractC40892g gVar = this.f176768u;
            if (gVar != null) {
                gVar.mo70085a();
            }
        }
        AIChooseMusicManager aIChooseMusicManager = AIChooseMusicManager.f176813c;
        if (C89219l.m154714a((Object) this.f176748a, (Object) "default_task_id")) {
            str = null;
        } else {
            str = this.f176748a;
        }
        AbstractC31071f fVar = this.f176746K;
        if (fVar != null) {
            j = (long) fVar.mo56368j();
        } else {
            j = 0;
        }
        aIChooseMusicManager.mo101557a(str, j, this.f176737A, 10, 20, false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C78656b(this), C78659c.f176777a);
    }

    /* renamed from: n */
    public final void mo122540n() {
        MusicModel l;
        boolean z;
        boolean z2;
        MusicModel i;
        String str;
        Activity c = C40964c.m82474c();
        if (!C63244g.m114602a().mo73255A().mo93903b()) {
            if (this.f176761n == 0) {
                str = "edit_page_recommend";
            } else {
                str = "edit_page_recommend_favourite";
            }
            C58957c.m108321a(c, "video_edit_page", str, new C78674m(this));
            return;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        T t = null;
        if (this.f176761n == 0) {
            C78759b bVar = this.f176752e;
            if (bVar == null || (i = bVar.mo122599i()) == null) {
                C78745a aVar = this.f176765r;
                if (aVar != null) {
                    t = (T) aVar.mo122582l();
                }
            } else {
                t = i;
            }
            eVar.element = t;
        } else {
            C78745a aVar2 = this.f176765r;
            if (aVar2 == null || (l = aVar2.mo122582l()) == null) {
                C78759b bVar2 = this.f176752e;
                if (bVar2 != null) {
                    t = (T) bVar2.mo122599i();
                }
            } else {
                t = l;
            }
            eVar.element = t;
        }
        if (eVar.element != null) {
            View view = this.f176741F;
            boolean z3 = false;
            if (view != null) {
                z = view.isSelected();
            } else {
                z = false;
            }
            if (z || MusicService.m81198m().mo69308a(eVar.element, c, true)) {
                View view2 = this.f176741F;
                if (view2 != null) {
                    view2.setSelected(!view2.isSelected());
                }
                AbstractC40893h hVar = this.f176770w;
                if (hVar != null) {
                    View view3 = this.f176741F;
                    if (view3 != null) {
                        z2 = view3.isSelected();
                    } else {
                        z2 = false;
                    }
                    hVar.mo70088a(z2, C78821b.m137586a((MusicModel) eVar.element));
                }
                String musicId = eVar.element.getMusicId();
                C89219l.m154716b(musicId, "");
                View view4 = this.f176741F;
                if (view4 != null) {
                    z3 = view4.isSelected();
                }
                C78748b.m137480a(musicId, z3, new C78675n(this, eVar));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final void mo101576a(AbstractC40892g gVar) {
        this.f176768u = gVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$d */
    public static final class C78660d implements AbstractC40895j {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176778a;

        static {
            Covode.recordClassIndex(91801);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78660d(View$OnClickListenerC78654a aVar) {
            this.f176778a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j
        /* renamed from: a */
        public final void mo70092a(View view, int i) {
            Integer num;
            Integer num2;
            C78745a aVar;
            C89219l.m154721d(view, "");
            C78745a aVar2 = this.f176778a.f176765r;
            MusicModel musicModel = null;
            if (aVar2 != null && aVar2.mo122581b(i) != null) {
                C78745a aVar3 = this.f176778a.f176765r;
                if (aVar3 != null) {
                    num = Integer.valueOf(aVar3.f176950d);
                } else {
                    num = null;
                }
                C78745a aVar4 = this.f176778a.f176765r;
                if (aVar4 != null) {
                    num2 = Integer.valueOf(aVar4.f176951e);
                } else {
                    num2 = null;
                }
                if (!C89219l.m154714a(num, num2) || (aVar = this.f176778a.f176765r) == null || aVar.f176950d != i) {
                    AbstractC40895j jVar = this.f176778a.f176766s;
                    if (jVar != null) {
                        jVar.mo70092a(view, i);
                    }
                    C78745a aVar5 = this.f176778a.f176765r;
                    if (aVar5 != null) {
                        musicModel = aVar5.mo122581b(i);
                    }
                    String a = View$OnClickListenerC78654a.m137259a(musicModel);
                    if (a == null || a.length() == 0) {
                        C78745a aVar6 = this.f176778a.f176765r;
                        if (aVar6 != null) {
                            aVar6.mo122580a(i, true);
                        }
                        AbstractC60326a aVar7 = this.f176778a.f176754g;
                        if (aVar7 != null) {
                            aVar7.mo97994b(musicModel, this.f176778a.f176751d, false);
                            return;
                        }
                        return;
                    }
                    C78745a aVar8 = this.f176778a.f176765r;
                    if (aVar8 != null) {
                        aVar8.mo122580a(i, false);
                    }
                    this.f176778a.mo62880a(a, musicModel, "");
                } else if (C84904k.m145909a(this.f176778a.f176769v)) {
                    if (this.f176778a.mo122538l() || !this.f176778a.f176773z) {
                        this.f176778a.mo101582a(false);
                        this.f176778a.mo122539m();
                        C78745a aVar9 = this.f176778a.f176765r;
                        if (aVar9 != null) {
                            aVar9.mo122586p();
                        }
                        C78724c cVar = this.f176778a.f176753f;
                        if (cVar != null) {
                            cVar.mo122576b();
                        }
                        AbstractC40893h hVar = this.f176778a.f176770w;
                        if (hVar != null) {
                            hVar.mo70087a(null, null, false);
                            return;
                        }
                        return;
                    }
                    String string = this.f176778a.f176771x.getResources().getString(R.string.b06);
                    C89219l.m154716b(string, "");
                    new C79459a(this.f176778a.f176771x).mo123052a(string).mo123053a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$h */
    public static final class C78669h implements AbstractC60747a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176789a;

        static {
            Covode.recordClassIndex(91810);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78669h(View$OnClickListenerC78654a aVar) {
            this.f176789a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3468c.AbstractC60747a
        /* renamed from: a */
        public final void mo98166a(String str, boolean z) {
            this.f176789a.mo122537a(str, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$i */
    public static final class C78670i implements AbstractC40895j {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176790a;

        static {
            Covode.recordClassIndex(91811);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78670i(View$OnClickListenerC78654a aVar) {
            this.f176790a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j
        /* renamed from: a */
        public final void mo70092a(View view, int i) {
            Integer num;
            Integer num2;
            C78759b bVar;
            C89219l.m154721d(view, "");
            if (i == -1) {
                this.f176790a.f176772y.mo70069a();
                AbstractC40893h hVar = this.f176790a.f176770w;
                if (hVar != null) {
                    hVar.mo70086a();
                    return;
                }
                return;
            }
            C78759b bVar2 = this.f176790a.f176752e;
            MusicModel musicModel = null;
            if (bVar2 != null && bVar2.mo101604c(i) != null) {
                C78759b bVar3 = this.f176790a.f176752e;
                if (bVar3 != null) {
                    num = Integer.valueOf(bVar3.f176994a - 1);
                } else {
                    num = null;
                }
                C78759b bVar4 = this.f176790a.f176752e;
                if (bVar4 != null) {
                    num2 = Integer.valueOf(bVar4.f176995b - 1);
                } else {
                    num2 = null;
                }
                if (!C89219l.m154714a(num, num2) || (bVar = this.f176790a.f176752e) == null || bVar.f176994a - 1 != i) {
                    AbstractC40895j jVar = this.f176790a.f176766s;
                    if (jVar != null) {
                        jVar.mo70092a(view, i);
                    }
                    C78759b bVar5 = this.f176790a.f176752e;
                    if (bVar5 != null) {
                        musicModel = bVar5.mo101604c(i);
                    }
                    String a = View$OnClickListenerC78654a.m137259a(musicModel);
                    if ((a == null || a.length() == 0) && (musicModel == null || !musicModel.isMvThemeMusic())) {
                        this.f176790a.mo101582a(false);
                        C78759b bVar6 = this.f176790a.f176752e;
                        if (bVar6 != null) {
                            bVar6.mo101598a(i, true);
                        }
                        AbstractC60326a aVar = this.f176790a.f176754g;
                        if (aVar != null) {
                            aVar.mo97994b(musicModel, this.f176790a.f176751d, false);
                        }
                    } else {
                        C78759b bVar7 = this.f176790a.f176752e;
                        if (bVar7 != null) {
                            bVar7.mo101598a(i, false);
                        }
                        this.f176790a.mo62880a(a, musicModel, "");
                    }
                    if (musicModel != null && musicModel.isMvThemeMusic()) {
                        this.f176790a.mo101582a(false);
                    }
                } else if (C84904k.m145909a(this.f176790a.f176769v)) {
                    if (this.f176790a.mo122538l() || !this.f176790a.f176773z) {
                        this.f176790a.mo101582a(false);
                        this.f176790a.mo122539m();
                        C78759b bVar8 = this.f176790a.f176752e;
                        if (bVar8 != null) {
                            bVar8.mo101603b(-1);
                        }
                        C78759b bVar9 = this.f176790a.f176752e;
                        if (bVar9 != null) {
                            bVar9.f176994a = 0;
                        }
                        AVDmtTextView aVDmtTextView = this.f176790a.f176759l;
                        if (aVDmtTextView != null) {
                            aVDmtTextView.setSelected(false);
                        }
                        AVDmtTextView aVDmtTextView2 = this.f176790a.f176759l;
                        if (aVDmtTextView2 != null) {
                            aVDmtTextView2.setText("");
                        }
                        C78724c cVar = this.f176790a.f176753f;
                        if (cVar != null) {
                            cVar.mo122576b();
                        }
                        AbstractC40893h hVar2 = this.f176790a.f176770w;
                        if (hVar2 != null) {
                            hVar2.mo70087a(null, null, true);
                            return;
                        }
                        return;
                    }
                    String string = this.f176790a.f176771x.getResources().getString(R.string.b06);
                    C89219l.m154716b(string, "");
                    new C79459a(this.f176790a.f176771x).mo123052a(string).mo123053a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$j */
    public static final class View$OnClickListenerC78671j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176791a;

        static {
            Covode.recordClassIndex(91812);
        }

        View$OnClickListenerC78671j(View$OnClickListenerC78654a aVar) {
            this.f176791a = aVar;
        }

        public final void onClick(View view) {
            TabLayout.C73104f fVar;
            ClickAgent.onClick(view);
            AbstractC40897l lVar = this.f176791a.f176749b;
            if (lVar != null) {
                lVar.mo70094a(true);
            }
            AVDmtTabLayout aVDmtTabLayout = this.f176791a.f176750c;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f176791a.f176750c;
                if (aVDmtTabLayout2 != null) {
                    fVar = aVDmtTabLayout2.mo115520a(0);
                } else {
                    fVar = null;
                }
                aVDmtTabLayout.mo115535b(fVar, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$k */
    public static final class View$OnClickListenerC78672k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176792a;

        static {
            Covode.recordClassIndex(91813);
        }

        View$OnClickListenerC78672k(View$OnClickListenerC78654a aVar) {
            this.f176792a = aVar;
        }

        public final void onClick(View view) {
            TabLayout.C73104f fVar;
            ClickAgent.onClick(view);
            AbstractC40897l lVar = this.f176792a.f176749b;
            if (lVar != null) {
                lVar.mo70094a(false);
            }
            AVDmtTabLayout aVDmtTabLayout = this.f176792a.f176750c;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f176792a.f176750c;
                if (aVDmtTabLayout2 != null) {
                    fVar = aVDmtTabLayout2.mo115520a(1);
                } else {
                    fVar = null;
                }
                aVDmtTabLayout.mo115535b(fVar, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$l */
    public static final class C78673l implements TabLayout.AbstractC73099c {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176793a;

        static {
            Covode.recordClassIndex(91814);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: b */
        public final void mo86254b(TabLayout.C73104f fVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: c */
        public final void mo86255c(TabLayout.C73104f fVar) {
        }

        C78673l(View$OnClickListenerC78654a aVar) {
            this.f176793a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: a */
        public final void mo86253a(TabLayout.C73104f fVar) {
            boolean z;
            MusicModel.CollectionType collectionType;
            C78745a aVar;
            MusicModel l;
            int i;
            View$OnClickListenerC78654a aVar2 = this.f176793a;
            if (fVar == null || fVar.f164124e != 0) {
                z = false;
            } else {
                z = true;
            }
            ViewGroup viewGroup = aVar2.f176757j;
            int i2 = 4;
            if (viewGroup != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 4;
                }
                viewGroup.setVisibility(i);
            }
            ViewGroup viewGroup2 = aVar2.f176756i;
            if (viewGroup2 != null) {
                if (!z) {
                    i2 = 0;
                }
                viewGroup2.setVisibility(i2);
            }
            if (!z) {
                aVar2.f176761n = 1;
                if (!C63244g.m114602a().mo73255A().mo93903b()) {
                    C58957c.m108321a(C40964c.m82474c(), "video_edit_page", "edit_page_recommend_favourite", new C78676o(aVar2));
                } else {
                    C78748b.f176963h.mo122593b(aVar2.f176737A);
                }
            } else {
                if (aVar2.f176761n == 1) {
                    C78745a aVar3 = aVar2.f176765r;
                    if (aVar3 == null || (l = aVar3.mo122582l()) == null) {
                        collectionType = null;
                    } else {
                        collectionType = l.getCollectionType();
                    }
                    if (collectionType == MusicModel.CollectionType.NOT_COLLECTED && (aVar = aVar2.f176765r) != null) {
                        aVar.mo122586p();
                    }
                    aVar2.mo122536a(aVar2.f176748a);
                }
                aVar2.f176761n = 0;
            }
        }
    }

    /* renamed from: b */
    private void m137260b(boolean z) {
        View view = this.f176741F;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f176741F;
        if (view2 != null) {
            view2.setSelected(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final C69905c mo101573a(int i) {
        MusicModel musicModel;
        C78745a aVar = this.f176765r;
        if (aVar != null) {
            musicModel = aVar.mo122581b(i);
        } else {
            musicModel = null;
        }
        return C78821b.m137586a(musicModel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$c */
    public static final class C78659c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C78659c f176777a = new C78659c();

        static {
            Covode.recordClassIndex(91800);
        }

        C78659c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C51423a.m95787a("Get AI Recommend Music Failed. Reason:" + ((Throwable) obj).getMessage());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final void mo101577a(AbstractC40893h hVar) {
        C89219l.m154721d(hVar, "");
        this.f176770w = hVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: b */
    public final C69905c mo101583b(int i) {
        MusicModel musicModel;
        List<? extends MusicModel> list;
        C63146a aVar = this.f176762o;
        if (aVar == null || (list = aVar.f143498a) == null) {
            musicModel = null;
        } else {
            musicModel = (MusicModel) C89070n.m154561b((List) list, i);
        }
        return C78821b.m137586a(musicModel);
    }

    /* renamed from: a */
    public static String m137259a(MusicModel musicModel) {
        String localPath;
        if (musicModel == null || (localPath = musicModel.getLocalPath()) == null || localPath.length() == 0) {
            return null;
        }
        AbstractC63154aa b = C63253l.f143623a.mo73306b();
        if (musicModel == null) {
            C89219l.m154715b();
        }
        String a = b.mo101741a(musicModel);
        if (TextUtils.isEmpty(a) || !C80720e.m139927b(a) || new File(a).length() <= 0) {
            return null;
        }
        return a;
    }

    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.c1i) {
                RecyclerView recyclerView = this.f176758k;
                if (recyclerView != null) {
                    recyclerView.setEnabled(false);
                }
                AbstractC40893h hVar = this.f176770w;
                if (hVar != null) {
                    hVar.mo70089b();
                }
            } else if (valueOf.intValue() == R.id.c1g) {
                mo122540n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$b */
    public static final class C78656b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176774a;

        static {
            Covode.recordClassIndex(91797);
        }

        C78656b(View$OnClickListenerC78654a aVar) {
            this.f176774a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f176774a.f176762o = (C63146a) obj;
            if (C84904k.m145909a(this.f176774a.f176769v)) {
                RecyclerView recyclerView = this.f176774a.f176758k;
                if (recyclerView != null) {
                    recyclerView.post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.tools.music.p4120a.View$OnClickListenerC78654a.C78656b.RunnableC786582 */

                        /* renamed from: a */
                        final /* synthetic */ C78656b f176776a;

                        static {
                            Covode.recordClassIndex(91799);
                        }

                        {
                            this.f176776a = r1;
                        }

                        public final void run() {
                            C78759b bVar = this.f176776a.f176774a.f176752e;
                            if (bVar != null) {
                                bVar.mo101606d();
                            }
                            this.f176776a.f176774a.mo122536a(this.f176776a.f176774a.f176748a);
                        }
                    });
                }
            } else if (this.f176774a.f176763p != null) {
                View$OnClickListenerC78654a aVar = this.f176774a;
                C63146a aVar2 = aVar.f176762o;
                MusicModel musicModel = this.f176774a.f176763p;
                if (musicModel == null) {
                    C89219l.m154715b();
                }
                aVar.mo122535a(aVar2, musicModel, this.f176774a.f176748a);
            } else {
                C78678b bVar = C78678b.f176800c;
                bVar.f176802a = new AbstractC78743a(this) {
                    /* class com.p2082ss.android.ugc.aweme.tools.music.p4120a.View$OnClickListenerC78654a.C78656b.C786571 */

                    /* renamed from: a */
                    final /* synthetic */ C78656b f176775a;

                    static {
                        Covode.recordClassIndex(91798);
                    }

                    {
                        this.f176775a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.tools.music.p4124c.AbstractC78743a
                    /* renamed from: a */
                    public final void mo122542a(MusicModel musicModel, boolean z) {
                        C89219l.m154721d(musicModel, "");
                        this.f176775a.f176774a.mo122535a(this.f176775a.f176774a.f176762o, musicModel, this.f176775a.f176774a.f176748a);
                    }
                };
                bVar.mo122552a(this.f176774a.f176769v);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$n */
    public static final class C78675n implements AbstractC63154aa.AbstractC63165j {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC78654a f176795a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f176796b;

        static {
            Covode.recordClassIndex(91816);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63165j
        /* renamed from: a */
        public final void mo101612a(boolean z) {
            Context context = null;
            if (z) {
                this.f176796b.element.setCollectionType(MusicModel.CollectionType.COLLECTED);
                this.f176795a.mo122537a(this.f176796b.element.getMusicId(), true);
                View view = this.f176795a.f176760m;
                if (view != null) {
                    context = view.getContext();
                }
                new C79459a(context).mo123050a(R.string.ah8).mo123053a();
                return;
            }
            View view2 = this.f176795a.f176760m;
            if (view2 != null) {
                context = view2.getContext();
            }
            new C79459a(context).mo123050a(R.string.ah3).mo123053a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63165j
        /* renamed from: b */
        public final void mo101613b(boolean z) {
            Context context = null;
            if (z) {
                this.f176796b.element.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                this.f176795a.mo122537a(this.f176796b.element.getMusicId(), false);
                View view = this.f176795a.f176760m;
                if (view != null) {
                    context = view.getContext();
                }
                new C79459a(context).mo123050a(R.string.a93).mo123053a();
                return;
            }
            View view2 = this.f176795a.f176760m;
            if (view2 != null) {
                context = view2.getContext();
            }
            new C79459a(context).mo123050a(R.string.a92).mo123053a();
        }

        C78675n(View$OnClickListenerC78654a aVar, C89233z.C89238e eVar) {
            this.f176795a = aVar;
            this.f176796b = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final void mo101578a(AbstractC40895j jVar) {
        this.f176766s = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final void mo101579a(AbstractC40896k kVar) {
        this.f176767t = kVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final void mo101580a(AbstractC40897l lVar) {
        this.f176749b = lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63159d
    /* renamed from: a */
    public final void mo101575a(ActivityC0218d dVar, FrameLayout frameLayout) {
        View view;
        C89219l.m154721d(dVar, "");
        if (this.f176760m == null) {
            View a = C1764a.m5927a(LayoutInflater.from(dVar), R.layout.ds, frameLayout, true);
            this.f176760m = a;
            if (a == null) {
                C89219l.m154715b();
            }
            this.f176750c = (AVDmtTabLayout) a.findViewById(R.id.eee);
            View view2 = this.f176760m;
            if (view2 == null) {
                C89219l.m154715b();
            }
            this.f176740E = view2.findViewById(R.id.c1i);
            View view3 = this.f176760m;
            if (view3 == null) {
                C89219l.m154715b();
            }
            this.f176741F = view3.findViewById(R.id.c1g);
            View view4 = this.f176760m;
            if (view4 == null) {
                C89219l.m154715b();
            }
            this.f176758k = (RecyclerView) view4.findViewById(R.id.dor);
            View view5 = this.f176760m;
            if (view5 == null) {
                C89219l.m154715b();
            }
            this.f176739D = (FrameLayout) view5.findViewById(R.id.ejb);
            View view6 = this.f176760m;
            if (view6 == null) {
                C89219l.m154715b();
            }
            this.f176757j = (ViewGroup) view6.findViewById(R.id.dfh);
            View view7 = this.f176760m;
            if (view7 == null) {
                C89219l.m154715b();
            }
            this.f176756i = (ViewGroup) view7.findViewById(R.id.a7n);
            View view8 = this.f176760m;
            if (view8 == null) {
                C89219l.m154715b();
            }
            this.f176755h = (RecyclerView) view8.findViewById(R.id.dop);
            View view9 = this.f176740E;
            if (view9 == null) {
                C89219l.m154715b();
            }
            view9.setOnClickListener(this);
            View view10 = this.f176741F;
            if (view10 == null) {
                C89219l.m154715b();
            }
            view10.setOnClickListener(this);
            AVDmtTabLayout aVDmtTabLayout = this.f176750c;
            if (aVDmtTabLayout != null) {
                aVDmtTabLayout.setVisibility(8);
            }
            View view11 = this.f176742G;
            if (view11 != null) {
                view11.setVisibility(8);
            }
            FrameLayout frameLayout2 = this.f176739D;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            AVDmtTabLayout aVDmtTabLayout2 = this.f176750c;
            if (aVDmtTabLayout2 != null) {
                aVDmtTabLayout2.setVisibility(0);
            }
            FrameLayout frameLayout3 = this.f176739D;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
            }
            AVDmtTabLayout aVDmtTabLayout3 = this.f176750c;
            if (aVDmtTabLayout3 != null) {
                if (AVUIUXBugsExperimentServiceDiff.m103001b().mo93971a()) {
                    AVDmtTabLayout aVDmtTabLayout4 = this.f176750c;
                    if (aVDmtTabLayout4 != null) {
                        aVDmtTabLayout4.setTabMode(0);
                    }
                } else {
                    AVDmtTabLayout aVDmtTabLayout5 = this.f176750c;
                    if (aVDmtTabLayout5 != null) {
                        aVDmtTabLayout5.setMaxTabModeForCount(2);
                    }
                }
                C77792a b = AVDmtTabLayout.C77790a.m135899b(aVDmtTabLayout3.getContext());
                aVDmtTabLayout3.mo115525a(aVDmtTabLayout3.mo115519a().mo115584a(b));
                b.setOnClickListener(new View$OnClickListenerC78671j(this));
                TabLayout.C73104f a2 = aVDmtTabLayout3.mo115520a(0);
                View view12 = null;
                if (a2 != null) {
                    view = a2.f164125f;
                } else {
                    view = null;
                }
                C77792a aVar = (C77792a) view;
                if (aVar != null) {
                    Context context = aVDmtTabLayout3.getContext();
                    C89219l.m154716b(context, "");
                    aVar.setText(context.getResources().getString(R.string.b9z));
                }
                C77792a b2 = AVDmtTabLayout.C77790a.m135899b(aVDmtTabLayout3.getContext());
                aVDmtTabLayout3.mo115525a(aVDmtTabLayout3.mo115519a().mo115584a(b2));
                b2.setOnClickListener(new View$OnClickListenerC78672k(this));
                TabLayout.C73104f a3 = aVDmtTabLayout3.mo115520a(1);
                if (a3 != null) {
                    view12 = a3.f164125f;
                }
                C77792a aVar2 = (C77792a) view12;
                if (aVar2 != null) {
                    Context context2 = aVDmtTabLayout3.getContext();
                    C89219l.m154716b(context2, "");
                    aVar2.setText(context2.getResources().getString(R.string.eup));
                }
                aVDmtTabLayout3.mo115524a(new C78673l(this));
                AVDmtTabLayout aVDmtTabLayout6 = this.f176750c;
                if (aVDmtTabLayout6 != null) {
                    aVDmtTabLayout6.mo115535b(aVDmtTabLayout6.mo115520a(0), true);
                }
            }
            RecyclerView recyclerView = this.f176758k;
            if (recyclerView != null) {
                RecyclerView recyclerView2 = this.f176758k;
                if (recyclerView2 != null) {
                    recyclerView2.getContext();
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            }
            View view13 = this.f176760m;
            if (view13 == null) {
                C89219l.m154715b();
            }
            this.f176764q = (TextView) view13.findViewById(R.id.ap2);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(0);
            RecyclerView recyclerView3 = this.f176755h;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(wrapLinearLayoutManager);
            }
            C78745a aVar3 = new C78745a(new C78660d(this));
            this.f176765r = aVar3;
            aVar3.f176958w = this.f176767t;
            C78745a aVar4 = this.f176765r;
            if (aVar4 != null) {
                aVar4.mo67813a((AbstractC39063h.AbstractC39067a) new C78661e(this));
            }
            RecyclerView recyclerView4 = this.f176755h;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(this.f176765r);
            }
            C78748b.f176963h.f176965a = new C78662f(this);
            this.f176754g = MusicService.m81198m().mo69292a(this);
            IMusicService m = MusicService.m81198m();
            C89219l.m154716b(m, "");
            m.mo69305a(new C78669h(this));
            C78724c cVar = new C78724c();
            this.f176753f = cVar;
            cVar.f176913a = this.f176746K;
            C78724c cVar2 = this.f176753f;
            if (cVar2 != null) {
                cVar2.f176916d = 10;
            }
            C78759b bVar = new C78759b(this.f176743H, new C78670i(this));
            this.f176752e = bVar;
            bVar.f176997d = this.f176767t;
            RecyclerView recyclerView5 = this.f176758k;
            if (recyclerView5 != null) {
                recyclerView5.setAdapter(this.f176752e);
            }
            m137261o();
            return;
        }
        m137261o();
    }

    /* renamed from: a */
    public final void mo122535a(C63146a aVar, MusicModel musicModel, String str) {
        C63146a aVar2;
        List<? extends MusicModel> list;
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(str, "");
        if (!(aVar == null || (aVar2 = this.f176762o) == null)) {
            List<? extends MusicModel> list2 = aVar.f143498a;
            if (list2 == null || list2.isEmpty()) {
                list = C89070n.m154524c(musicModel);
            } else {
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    if (t.getId() != musicModel.getId()) {
                        arrayList.add(t);
                    }
                }
                list = C89070n.m154585g((Collection) arrayList);
                list.add(0, musicModel);
            }
            aVar2.f143498a = list;
        }
        RecyclerView recyclerView = this.f176758k;
        if (recyclerView != null) {
            recyclerView.post(new RunnableC78677p(this, str));
        }
    }

    public View$OnClickListenerC78654a(ActivityC0218d dVar, AbstractC31071f fVar, AbstractC40884a aVar, boolean z, int i, AbstractC89171a<String> aVar2) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f176771x = dVar;
        this.f176746K = fVar;
        this.f176772y = aVar;
        this.f176773z = z;
        this.f176737A = i;
        this.f176747L = aVar2;
    }
}
