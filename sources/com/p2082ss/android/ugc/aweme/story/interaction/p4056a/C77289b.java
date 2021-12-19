package com.p2082ss.android.ugc.aweme.story.interaction.p4056a;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.AbstractC76590b;
import com.p2082ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import com.p2082ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77305i;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77306j;
import com.p2082ss.android.ugc.aweme.story.interaction.p4059vm.StoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.model.C77385h;
import com.p2082ss.android.ugc.aweme.story.model.C77386i;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.a.b */
public final class C77289b extends AbstractC34586a implements AbstractC1214u<C33942b>, AbstractC36420f, AbstractC76590b {

    /* renamed from: l */
    public static final C77290a f173388l = new C77290a((byte) 0);

    /* renamed from: a */
    public StoryViewerListViewModel f173389a;

    /* renamed from: b */
    public String f173390b = "";

    /* renamed from: c */
    public int f173391c;

    /* renamed from: d */
    public Aweme f173392d;

    /* renamed from: e */
    public C77306j f173393e;

    /* renamed from: j */
    public int f173394j;

    /* renamed from: k */
    public AbstractC36419e f173395k;

    /* renamed from: m */
    private String f173396m = "";

    /* renamed from: n */
    private AbstractC17692b<Long> f173397n;

    /* renamed from: o */
    private boolean f173398o;

    /* renamed from: p */
    private C36500h f173399p;

    /* renamed from: q */
    private boolean f173400q;

    /* renamed from: r */
    private SparseArray f173401r;

    static {
        Covode.recordClassIndex(90306);
    }

    /* renamed from: a */
    public final View mo120882a(int i) {
        if (this.f173401r == null) {
            this.f173401r = new SparseArray();
        }
        View view = (View) this.f173401r.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f173401r.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63720a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: b */
    public final void mo63721b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: i */
    public final void mo63726i() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.b$a */
    public static final class C77290a {
        static {
            Covode.recordClassIndex(90307);
        }

        private C77290a() {
        }

        public /* synthetic */ C77290a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.AbstractC76590b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC34586a mo120281a() {
        return this;
    }

    /* renamed from: j */
    private final void m135137j() {
        AbstractC17692b<Long> bVar = this.f173397n;
        if (bVar == null) {
            C89219l.m154710a("config");
        }
        bVar.f42330c.mo28163e();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: c */
    public final RecyclerView mo63722c() {
        PowerList powerList = (PowerList) mo120882a(R.id.c_1);
        C89219l.m154716b(powerList, "");
        return powerList;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: h */
    public final void mo63725h() {
        if (this.f173398o) {
            this.f173398o = true;
            m135135e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f173401r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public C77289b() {
        this.f173391c = C76660b.m134241a() != 1 ? 2 : 1;
    }

    /* renamed from: g */
    private final void m135136g() {
        StoryViewerListViewModel storyViewerListViewModel = this.f173389a;
        if (storyViewerListViewModel == null) {
            C89219l.m154710a("viewerVM");
        }
        storyViewerListViewModel.mo60189a("REFRESH_STORY_VIEWER_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        storyViewerListViewModel.mo60189a("REFRESH_STORY_VIEWER_LIST_FAIL", (AbstractC1214u<C33942b>) this);
    }

    /* renamed from: b */
    private final void m135134b() {
        String str;
        User user;
        Aweme aweme = this.f173392d;
        C36500h hVar = this.f173399p;
        String str2 = null;
        if (hVar != null) {
            str = hVar.getEnterFrom();
        } else {
            str = null;
        }
        String str3 = this.f173390b;
        Aweme aweme2 = this.f173392d;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        } else {
            user = null;
        }
        int a = C76598h.m134176a(user);
        Aweme aweme3 = this.f173392d;
        if (aweme3 != null) {
            str2 = C76706a.m134276b(aweme3);
        }
        this.f173393e = new C77306j(aweme, str, "viewer_list", str3, a, "story", str2);
    }

    /* renamed from: e */
    private final void m135135e() {
        StoryViewerListViewModel storyViewerListViewModel = this.f173389a;
        if (storyViewerListViewModel == null) {
            C89219l.m154710a("viewerVM");
        }
        Integer num = ((IStoryViewerListViewModel) storyViewerListViewModel).f171711d.get(this.f173390b);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                m135136g();
                return;
            } else if (intValue == 1) {
                m135137j();
                return;
            } else if (intValue == 2) {
                m135137j();
                return;
            } else if (intValue == 3) {
                return;
            } else {
                if (intValue == 4) {
                    m135137j();
                    return;
                }
            }
        }
        m135137j();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: d */
    public final String mo63724d() {
        if (this.f173394j > 999) {
            String string = C17867d.m33078a().getResources().getString(R.string.h_5);
            C89219l.m154716b(string, "");
            return string;
        }
        Resources resources = C17867d.m33078a().getResources();
        int i = this.f173394j;
        String quantityString = resources.getQuantityString(R.plurals.in, i, String.valueOf(i));
        C89219l.m154716b(quantityString, "");
        return quantityString;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.AbstractC76590b
    /* renamed from: b */
    public final void mo120282b(Aweme aweme) {
        this.f173392d = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63717a(AbstractC36419e eVar) {
        C89219l.m154721d(eVar, "");
        this.f173395k = eVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ StoryViewerListViewModel m135133a(C77289b bVar) {
        StoryViewerListViewModel storyViewerListViewModel = bVar.f173389a;
        if (storyViewerListViewModel == null) {
            C89219l.m154710a("viewerVM");
        }
        return storyViewerListViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63718a(C36500h hVar) {
        this.f173399p = hVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ActivityC0945e requireActivity = requireActivity();
        C89219l.m154716b(requireActivity, "");
        this.f173389a = StoryViewerListViewModel.C77345a.m135239a(requireActivity, requireActivity);
        m135134b();
        m135135e();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: c */
    public final void mo63723c(boolean z) {
        int i;
        this.f173400q = z;
        TuxTextView tuxTextView = (TuxTextView) mo120882a(R.id.eis);
        int i2 = 0;
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tuxTextView.setVisibility(i);
        }
        View a = mo120882a(R.id.amc);
        if (a != null) {
            if (!z) {
                i2 = 8;
            }
            a.setVisibility(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.b$b */
    public static final class C77291b extends AbstractC17692b<Long> {

        /* renamed from: a */
        final /* synthetic */ C77289b f173402a;

        /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.b$b$b */
        static final class C77293b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C77293b f173405a = new C77293b();

            static {
                Covode.recordClassIndex(90310);
            }

            C77293b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(90308);
        }

        /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.b$b$a */
        static final class C77292a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C77291b f173403a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89124d f173404b;

            static {
                Covode.recordClassIndex(90309);
            }

            C77292a(C77291b bVar, AbstractC89124d dVar) {
                this.f173403a = bVar;
                this.f173404b = dVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C77386i iVar = (C77386i) obj;
                List<C77385h> viewerList = iVar.getViewerList();
                if (viewerList == null) {
                    viewerList = C89086z.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) viewerList, 10));
                Iterator<T> it = viewerList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C77305i.m135168a(it.next(), this.f173403a.f173402a.f173391c, this.f173403a.f173402a.f173393e));
                }
                ArrayList arrayList2 = arrayList;
                if (iVar.getHasMore()) {
                    this.f173404b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, Long.valueOf(iVar.getCursor()), arrayList2, 1)));
                } else {
                    this.f173404b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                }
            }
        }

        @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
        /* renamed from: a */
        public final void mo23345a(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
            List<C77385h> list;
            int i;
            C89219l.m154721d(dVar, "");
            if (this.f173402a.af_()) {
                C77386i iVar = ((IStoryViewerListViewModel) C77289b.m135133a(this.f173402a)).f171710c.get(this.f173402a.f173390b);
                if (iVar == null || (list = iVar.getViewerList()) == null) {
                    list = C89086z.INSTANCE;
                }
                C77289b bVar = this.f173402a;
                C77386i iVar2 = ((IStoryViewerListViewModel) C77289b.m135133a(bVar)).f171710c.get(this.f173402a.f173390b);
                if (iVar2 != null) {
                    i = iVar2.getTotal();
                } else {
                    i = 0;
                }
                bVar.f173394j = i;
                AbstractC36419e eVar = this.f173402a.f173395k;
                if (eVar != null) {
                    eVar.mo63710a(this.f173402a);
                }
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C77305i.m135168a(it.next(), this.f173402a.f173391c, this.f173402a.f173393e));
                }
                ArrayList arrayList2 = arrayList;
                if (iVar == null || !iVar.getHasMore()) {
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                } else {
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, Long.valueOf(iVar.getCursor()), arrayList2, 1)));
                }
                if (!arrayList2.isEmpty()) {
                    LinearLayout linearLayout = (LinearLayout) this.f173402a.mo120882a(R.id.auu);
                    C89219l.m154716b(linearLayout, "");
                    linearLayout.setVisibility(8);
                    return;
                }
                LinearLayout linearLayout2 = (LinearLayout) this.f173402a.mo120882a(R.id.auu);
                C89219l.m154716b(linearLayout2, "");
                linearLayout2.setVisibility(0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77291b(C77289b bVar, C17693c cVar) {
            super(cVar);
            this.f173402a = bVar;
        }

        @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
        /* renamed from: b */
        public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
            long longValue = ((Number) obj).longValue();
            C89219l.m154721d(dVar, "");
            if (this.f173402a.af_()) {
                return;
            }
            if (TextUtils.isEmpty(this.f173402a.f173390b)) {
                C77283a.m135112c("StoryViewerListFragment", "dz[story id is empty]");
            } else {
                StoryInteractionApi.f173406a.getStoryViewerList(this.f173402a.f173390b, longValue, 30, null).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C77292a(this, dVar), C77293b.f173405a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63719a(Aweme aweme) {
        String str;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        this.f173390b = str;
        this.f173392d = aweme;
        this.f173398o = true;
        m135134b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -738219936) {
                if (hashCode == 1436898145 && str.equals("REFRESH_STORY_VIEWER_LIST_SUCCESS") && C89219l.m154714a(((C89378p) bVar2.mo60212a()).getFirst(), (Object) this.f173390b)) {
                    m135137j();
                }
            } else if (str.equals("REFRESH_STORY_VIEWER_LIST_FAIL")) {
                C89219l.m154714a(bVar2.mo60212a(), (Object) this.f173390b);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        int i;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("story_id")) == null) {
            str = "";
        }
        this.f173390b = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("viewer_id")) == null) {
            str2 = "";
        }
        this.f173396m = str2;
        TuxTextView tuxTextView = (TuxTextView) mo120882a(R.id.eis);
        C89219l.m154716b(tuxTextView, "");
        int i2 = 8;
        if (this.f173400q) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView.setVisibility(i);
        View a = mo120882a(R.id.amc);
        C89219l.m154716b(a, "");
        if (this.f173400q) {
            i2 = 0;
        }
        a.setVisibility(i2);
        ((TuxTextView) view.findViewById(R.id.auv)).setText(R.string.h5m);
        ((TuxTextView) view.findViewById(R.id.aur)).setText(R.string.h5l);
        ((PowerList) mo120882a(R.id.c_1)).mo28083a(StoryViewerAndLikerCell.class);
        RecyclerView recyclerView = (RecyclerView) mo120882a(R.id.c_1);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setItemAnimator(null);
        C17693c cVar = new C17693c();
        cVar.f42319a = 10;
        cVar.f42320b = false;
        this.f173397n = new C77291b(this, cVar);
        PowerList powerList = (PowerList) mo120882a(R.id.c_1);
        AbstractC17692b<Long> bVar = this.f173397n;
        if (bVar == null) {
            C89219l.m154710a("config");
        }
        powerList.mo28082a(bVar);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b1c, viewGroup, false);
    }
}
