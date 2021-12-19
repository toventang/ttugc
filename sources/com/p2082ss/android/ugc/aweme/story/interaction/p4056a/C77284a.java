package com.p2082ss.android.ugc.aweme.story.interaction.p4056a;

import android.content.res.Resources;
import android.os.Bundle;
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
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.AbstractC76590b;
import com.p2082ss.android.ugc.aweme.story.api.IStoryLikedListViewModel;
import com.p2082ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import com.p2082ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77305i;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77306j;
import com.p2082ss.android.ugc.aweme.story.interaction.p4059vm.StoryLikedListViewModel;
import com.p2082ss.android.ugc.aweme.story.model.C77383f;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
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

/* renamed from: com.ss.android.ugc.aweme.story.interaction.a.a */
public final class C77284a extends AbstractC34586a implements AbstractC1214u<C33942b>, AbstractC36420f, AbstractC76590b {

    /* renamed from: k */
    public static final C77285a f173373k = new C77285a((byte) 0);

    /* renamed from: a */
    public StoryLikedListViewModel f173374a;

    /* renamed from: b */
    public String f173375b = "";

    /* renamed from: c */
    public Aweme f173376c;

    /* renamed from: d */
    public int f173377d;

    /* renamed from: e */
    public AbstractC36419e f173378e;

    /* renamed from: j */
    public C77306j f173379j;

    /* renamed from: l */
    private AbstractC17692b<Long> f173380l;

    /* renamed from: m */
    private boolean f173381m;

    /* renamed from: n */
    private C36500h f173382n;

    /* renamed from: o */
    private SparseArray f173383o;

    static {
        Covode.recordClassIndex(90301);
    }

    /* renamed from: a */
    public final View mo120881a(int i) {
        if (this.f173383o == null) {
            this.f173383o = new SparseArray();
        }
        View view = (View) this.f173383o.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f173383o.put(i, findViewById);
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

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.a$a */
    public static final class C77285a {
        static {
            Covode.recordClassIndex(90302);
        }

        private C77285a() {
        }

        public /* synthetic */ C77285a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.AbstractC76590b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC34586a mo120281a() {
        return this;
    }

    /* renamed from: j */
    private final void m135116j() {
        AbstractC17692b<Long> bVar = this.f173380l;
        if (bVar == null) {
            C89219l.m154710a("config");
        }
        bVar.f42330c.mo28163e();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: c */
    public final RecyclerView mo63722c() {
        PowerList powerList = (PowerList) mo120881a(R.id.c_1);
        C89219l.m154716b(powerList, "");
        return powerList;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: h */
    public final void mo63725h() {
        if (this.f173381m) {
            this.f173381m = false;
            m135117k();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f173383o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: g */
    private final void m135115g() {
        StoryLikedListViewModel storyLikedListViewModel = this.f173374a;
        if (storyLikedListViewModel == null) {
            C89219l.m154710a("likerVM");
        }
        storyLikedListViewModel.mo60189a("REFRESH_STORY_LIKED_LIST_SUCCESS", (AbstractC1214u<C33942b>) this);
        storyLikedListViewModel.mo60189a("REFRESH_STORY_LIKED_LIST_FAIL", (AbstractC1214u<C33942b>) this);
    }

    /* renamed from: b */
    private final void m135113b() {
        String str;
        User user;
        Aweme aweme = this.f173376c;
        C36500h hVar = this.f173382n;
        String str2 = null;
        if (hVar != null) {
            str = hVar.getEnterFrom();
        } else {
            str = null;
        }
        String str3 = this.f173375b;
        Aweme aweme2 = this.f173376c;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        } else {
            user = null;
        }
        int a = C76598h.m134176a(user);
        Aweme aweme3 = this.f173376c;
        if (aweme3 != null) {
            str2 = C76706a.m134276b(aweme3);
        }
        this.f173379j = new C77306j(aweme, str, "like_list", str3, a, "story", str2);
    }

    /* renamed from: k */
    private final void m135117k() {
        String str;
        C36500h hVar = this.f173382n;
        String str2 = null;
        if (hVar != null) {
            str = hVar.getEventType();
        } else {
            str = null;
        }
        if (!C89219l.m154714a((Object) "homepage_follow", (Object) str)) {
            C36500h hVar2 = this.f173382n;
            if (hVar2 != null) {
                str2 = hVar2.getEventType();
            }
            if (!C89219l.m154714a((Object) "homepage_hot", (Object) str2)) {
                m135114e();
                return;
            }
        }
        m135115g();
        StoryLikedListViewModel storyLikedListViewModel = this.f173374a;
        if (storyLikedListViewModel == null) {
            C89219l.m154710a("likerVM");
        }
        storyLikedListViewModel.mo120923a(this.f173375b, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: d */
    public final String mo63724d() {
        Resources resources = C17867d.m33078a().getResources();
        int i = this.f173377d;
        String quantityString = resources.getQuantityString(R.plurals.io, i, C53437b.m98615a((long) i));
        C89219l.m154716b(quantityString, "");
        return quantityString;
    }

    /* renamed from: e */
    private final void m135114e() {
        StoryLikedListViewModel storyLikedListViewModel = this.f173374a;
        if (storyLikedListViewModel == null) {
            C89219l.m154710a("likerVM");
        }
        Integer num = ((IStoryLikedListViewModel) storyLikedListViewModel).f171708d.get(this.f173375b);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                m135115g();
                return;
            } else if (intValue == 1) {
                m135116j();
                m135115g();
                return;
            } else if (intValue == 2) {
                m135116j();
                m135115g();
                return;
            } else if (intValue == 3) {
                return;
            } else {
                if (intValue == 4) {
                    m135116j();
                    return;
                }
            }
        }
        m135116j();
        m135115g();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.AbstractC76590b
    /* renamed from: b */
    public final void mo120282b(Aweme aweme) {
        this.f173376c = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63717a(AbstractC36419e eVar) {
        C89219l.m154721d(eVar, "");
        this.f173378e = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63718a(C36500h hVar) {
        this.f173382n = hVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63719a(Aweme aweme) {
        String str;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        this.f173375b = str;
        this.f173376c = aweme;
        this.f173381m = true;
        m135113b();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: c */
    public final void mo63723c(boolean z) {
        int i;
        TuxTextView tuxTextView = (TuxTextView) mo120881a(R.id.eis);
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tuxTextView.setVisibility(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ActivityC0945e requireActivity = requireActivity();
        C89219l.m154716b(requireActivity, "");
        this.f173374a = StoryLikedListViewModel.C77342a.m135237a(requireActivity, requireActivity);
        m135113b();
        m135117k();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.a$b */
    public static final class C77286b extends AbstractC17692b<Long> {

        /* renamed from: a */
        final /* synthetic */ C77284a f173384a;

        /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.a$b$b */
        static final class C77288b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C77288b f173387a = new C77288b();

            static {
                Covode.recordClassIndex(90305);
            }

            C77288b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(90303);
        }

        /* renamed from: com.ss.android.ugc.aweme.story.interaction.a.a$b$a */
        static final class C77287a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C77286b f173385a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89124d f173386b;

            static {
                Covode.recordClassIndex(90304);
            }

            C77287a(C77286b bVar, AbstractC89124d dVar) {
                this.f173385a = bVar;
                this.f173386b = dVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C77383f fVar = (C77383f) obj;
                List<User> likedList = fVar.getLikedList();
                if (likedList == null) {
                    likedList = C89086z.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) likedList, 10));
                Iterator<T> it = likedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C77305i.m135167a(it.next(), this.f173385a.f173384a.f173379j));
                }
                ArrayList arrayList2 = arrayList;
                if (fVar.getHasMore()) {
                    this.f173386b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, Long.valueOf(fVar.getCursor()), arrayList2, 1)));
                } else {
                    this.f173386b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                }
            }
        }

        @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
        /* renamed from: a */
        public final void mo23345a(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
            List<User> list;
            boolean z;
            int i;
            Long l;
            C89219l.m154721d(dVar, "");
            if (this.f173384a.af_()) {
                StoryLikedListViewModel storyLikedListViewModel = this.f173384a.f173374a;
                if (storyLikedListViewModel == null) {
                    C89219l.m154710a("likerVM");
                }
                C77383f fVar = ((IStoryLikedListViewModel) storyLikedListViewModel).f171707c.get(this.f173384a.f173375b);
                if (fVar == null || (list = fVar.getLikedList()) == null) {
                    list = C89086z.INSTANCE;
                }
                if (fVar != null) {
                    z = fVar.getHasMore();
                } else {
                    z = false;
                }
                C77284a aVar = this.f173384a;
                if (!z) {
                    i = list.size();
                } else {
                    Aweme aweme = aVar.f173376c;
                    if (aweme != null) {
                        i = aweme.getUserDigg();
                    } else {
                        i = 0;
                    }
                }
                aVar.f173377d = i;
                AbstractC36419e eVar = this.f173384a.f173378e;
                if (eVar != null) {
                    eVar.mo63710a(this.f173384a);
                }
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C77305i.m135167a(it.next(), this.f173384a.f173379j));
                }
                ArrayList arrayList2 = arrayList;
                if (z) {
                    if (fVar != null) {
                        l = Long.valueOf(fVar.getCursor());
                    } else {
                        l = null;
                    }
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, l, arrayList2, 1)));
                } else {
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                }
                if (!arrayList2.isEmpty()) {
                    LinearLayout linearLayout = (LinearLayout) this.f173384a.mo120881a(R.id.auu);
                    C89219l.m154716b(linearLayout, "");
                    linearLayout.setVisibility(8);
                    return;
                }
                LinearLayout linearLayout2 = (LinearLayout) this.f173384a.mo120881a(R.id.auu);
                C89219l.m154716b(linearLayout2, "");
                linearLayout2.setVisibility(0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77286b(C77284a aVar, C17693c cVar) {
            super(cVar);
            this.f173384a = aVar;
        }

        @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
        /* renamed from: b */
        public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
            long longValue = ((Number) obj).longValue();
            C89219l.m154721d(dVar, "");
            if (!this.f173384a.af_()) {
                StoryInteractionApi.f173406a.fetchStoryLikedList(this.f173384a.f173375b, longValue, 30).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C77287a(this, dVar), C77288b.f173387a);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 1000683874) {
                if (hashCode == 1736731135 && str.equals("REFRESH_STORY_LIKED_LIST_FAIL")) {
                    C89219l.m154714a(bVar2.mo60212a(), (Object) this.f173375b);
                }
            } else if (str.equals("REFRESH_STORY_LIKED_LIST_SUCCESS") && C89219l.m154714a(((C89378p) bVar2.mo60212a()).getFirst(), (Object) this.f173375b)) {
                m135116j();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) mo120881a(R.id.eis);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("story_id")) == null) {
            str = "";
        }
        this.f173375b = str;
        ((TuxTextView) view.findViewById(R.id.auv)).setText(R.string.dg2);
        ((TuxTextView) view.findViewById(R.id.aur)).setText(R.string.dg3);
        ((PowerList) mo120881a(R.id.c_1)).mo28083a(StoryViewerAndLikerCell.class);
        RecyclerView recyclerView = (RecyclerView) mo120881a(R.id.c_1);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setItemAnimator(null);
        C17693c cVar = new C17693c();
        cVar.f42319a = 10;
        cVar.f42320b = false;
        this.f173380l = new C77286b(this, cVar);
        PowerList powerList = (PowerList) mo120881a(R.id.c_1);
        AbstractC17692b<Long> bVar = this.f173380l;
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
