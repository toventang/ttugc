package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2564l;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ui_component.AbstractC23517a;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.C37426a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.C37429b;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.QuestionStickerPanelRequestApi;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37355b;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37356c;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37360g;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.EnumC37354a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.EnumC37361h;
import com.p2082ss.android.ugc.aweme.property.C65412cv;
import com.p2082ss.android.ugc.aweme.sticker.data.EnumC75311f;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.widget.DoubleColorBallAnimationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.l */
public final class C37411l extends LinearLayout implements AbstractC20527q {

    /* renamed from: a */
    public RecyclerView f88284a;

    /* renamed from: b */
    public TuxTextView f88285b;

    /* renamed from: c */
    public DoubleColorBallAnimationView f88286c;

    /* renamed from: d */
    public View f88287d;

    /* renamed from: e */
    public int f88288e;

    /* renamed from: f */
    public boolean f88289f;

    /* renamed from: g */
    public CommentAndQuestionAndQuestionStickerPanelViewModel f88290g;

    /* renamed from: h */
    public List<Object> f88291h;

    /* renamed from: i */
    public List<Object> f88292i;

    /* renamed from: j */
    private View f88293j;

    /* renamed from: k */
    private View f88294k;

    /* renamed from: l */
    private TuxTextView f88295l;

    /* renamed from: m */
    private C2564l<Object> f88296m;

    /* renamed from: n */
    private final int f88297n;

    /* renamed from: o */
    private final EnumC37412a f88298o;

    static {
        Covode.recordClassIndex(44792);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final EnumC37412a getItemType() {
        return this.f88298o;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.l$a */
    public enum EnumC37412a {
        InvitationQuestion,
        RecommendQuestion,
        RecommendComment,
        FavoriteQuestion,
        FavoriteComment;

        static {
            Covode.recordClassIndex(44793);
        }

        public final String getNameForMob() {
            int i = C37418m.f88306b[ordinal()];
            if (i == 1) {
                return "invitation";
            }
            if (i == 2) {
                return "recommendation";
            }
            if (i != 3) {
                return "";
            }
            return "favorite";
        }

        public final EnumC75311f getSource() {
            int i = C37418m.f88307c[ordinal()];
            if (i == 1) {
                return EnumC75311f.Invitation;
            }
            if (i == 2) {
                return EnumC75311f.Recommendation;
            }
            if (i != 3) {
                return EnumC75311f.Favorite;
            }
            return EnumC75311f.Favorite;
        }

        public final CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a getCurrentTabType() {
            int i = C37418m.f88305a[ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.SuggestTab;
            }
            if (i == 4 || i == 5) {
                return CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.FavoriteTab;
            }
            throw new C89376n();
        }
    }

    /* renamed from: a */
    public final boolean mo65058a() {
        List<Object> list = this.f88291h;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        Activity activity;
        Context context = getContext();
        C89219l.m154716b(context, "");
        while (true) {
            activity = null;
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1196i lifecycle = ((ActivityC0580d) activity).getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: c */
    private void m75458c() {
        Activity activity;
        int i = C37419n.f88309b[this.f88298o.ordinal()];
        if (i == 1) {
            this.f88296m = this.f88290g.f88081n;
        } else if (i == 2) {
            this.f88296m = this.f88290g.f88083p;
        } else if (i == 3) {
            this.f88296m = this.f88290g.f88085r;
        } else if (i == 4) {
            this.f88296m = this.f88290g.f88082o;
        } else if (i == 5) {
            this.f88296m = this.f88290g.f88084q;
        }
        C2564l<Object> lVar = this.f88296m;
        if (lVar == null) {
            C89219l.m154710a("initDataEvent");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        while (true) {
            activity = null;
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        lVar.mo7036a((ActivityC0945e) activity, new C37413b(this));
    }

    /* renamed from: b */
    public final void mo65059b() {
        int i;
        if (this.f88284a != null) {
            RecyclerView recyclerView = this.f88284a;
            if (recyclerView == null) {
                C89219l.m154710a("recycleView");
            }
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                layoutManager = null;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (staggeredGridLayoutManager != null) {
                int[] a = staggeredGridLayoutManager.mo4790a((int[]) null);
                int[] b = staggeredGridLayoutManager.mo4791b((int[]) null);
                C89219l.m154716b(a, "");
                Integer c = C89064i.m154499c(a);
                int i2 = 0;
                if (c != null) {
                    i = c.intValue();
                } else {
                    i = a[0];
                }
                C89219l.m154716b(b, "");
                Integer b2 = C89064i.m154494b(b);
                if (b2 != null) {
                    i2 = b2.intValue();
                }
                if (i <= i2) {
                    while (true) {
                        try {
                            View c2 = staggeredGridLayoutManager.mo4358c(i);
                            if (c2 != null && c2.getGlobalVisibleRect(new Rect()) && !this.f88292i.contains(this.f88291h.get(i))) {
                                int i3 = C37419n.f88312e[this.f88298o.ordinal()];
                                if (i3 == 1 || i3 == 2) {
                                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f88290g;
                                    Object obj = this.f88291h.get(i);
                                    if (!(obj instanceof CommentVideoModel)) {
                                        obj = null;
                                    }
                                    commentAndQuestionAndQuestionStickerPanelViewModel.mo64945b((CommentVideoModel) obj);
                                } else {
                                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel2 = this.f88290g;
                                    Object obj2 = this.f88291h.get(i);
                                    if (!(obj2 instanceof QaStruct)) {
                                        obj2 = null;
                                    }
                                    commentAndQuestionAndQuestionStickerPanelViewModel2.mo64939a((QaStruct) obj2, this.f88298o);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (i != i2) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private final void m75460d() {
        addView(C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.tu, this, false));
        View findViewById = findViewById(R.id.title);
        C89219l.m154716b(findViewById, "");
        this.f88295l = (TuxTextView) findViewById;
        if (C65412cv.m117127a() != 0) {
            TuxTextView tuxTextView = this.f88295l;
            if (tuxTextView == null) {
                C89219l.m154710a("title");
            }
            tuxTextView.setText(getResources().getString(this.f88297n));
        } else {
            TuxTextView tuxTextView2 = this.f88295l;
            if (tuxTextView2 == null) {
                C89219l.m154710a("title");
            }
            tuxTextView2.setVisibility(8);
        }
        View findViewById2 = findViewById(R.id.dgn);
        C89219l.m154716b(findViewById2, "");
        this.f88284a = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(R.id.cf9);
        C89219l.m154716b(findViewById3, "");
        TuxTextView tuxTextView3 = (TuxTextView) findViewById3;
        this.f88285b = tuxTextView3;
        if (tuxTextView3 == null) {
            C89219l.m154710a("loadMoreText");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        tuxTextView3.setText(context.getResources().getString(R.string.bua));
        TuxTextView tuxTextView4 = this.f88285b;
        if (tuxTextView4 == null) {
            C89219l.m154710a("loadMoreText");
        }
        tuxTextView4.setOnClickListener(new View$OnClickListenerC37415d(this));
        View findViewById4 = findViewById(R.id.cg5);
        C89219l.m154716b(findViewById4, "");
        this.f88286c = (DoubleColorBallAnimationView) findViewById4;
        View findViewById5 = findViewById(R.id.cg6);
        C89219l.m154716b(findViewById5, "");
        this.f88287d = findViewById5;
        View findViewById6 = getRootView().findViewById(R.id.cg6);
        C89219l.m154716b(findViewById6, "");
        this.f88293j = findViewById6;
        View findViewById7 = getRootView().findViewById(R.id.cg5);
        C89219l.m154716b(findViewById7, "");
        this.f88294k = findViewById7;
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        staggeredGridLayoutManager.f4478C = true;
        RecyclerView recyclerView = this.f88284a;
        if (recyclerView == null) {
            C89219l.m154710a("recycleView");
        }
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        recyclerView.mo4402a(new C37390i(context2));
        RecyclerView recyclerView2 = this.f88284a;
        if (recyclerView2 == null) {
            C89219l.m154710a("recycleView");
        }
        recyclerView2.setLayoutManager(staggeredGridLayoutManager);
        RecyclerView recyclerView3 = this.f88284a;
        if (recyclerView3 == null) {
            C89219l.m154710a("recycleView");
        }
        recyclerView3.setItemAnimator(null);
        Context context3 = getContext();
        C89219l.m154716b(context3, "");
        C37432p pVar = new C37432p(context3, this.f88298o, this.f88290g, this.f88291h, new C37417e(this));
        RecyclerView recyclerView4 = this.f88284a;
        if (recyclerView4 == null) {
            C89219l.m154710a("recycleView");
        }
        recyclerView4.setAdapter(pVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ DoubleColorBallAnimationView m75455a(C37411l lVar) {
        DoubleColorBallAnimationView doubleColorBallAnimationView = lVar.f88286c;
        if (doubleColorBallAnimationView == null) {
            C89219l.m154710a("loadMoreDoubleBall");
        }
        return doubleColorBallAnimationView;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m75456b(C37411l lVar) {
        View view = lVar.f88287d;
        if (view == null) {
            C89219l.m154710a("loadMoreContainer");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ TuxTextView m75457c(C37411l lVar) {
        TuxTextView tuxTextView = lVar.f88285b;
        if (tuxTextView == null) {
            C89219l.m154710a("loadMoreText");
        }
        return tuxTextView;
    }

    /* renamed from: d */
    public static final /* synthetic */ RecyclerView m75459d(C37411l lVar) {
        RecyclerView recyclerView = lVar.f88284a;
        if (recyclerView == null) {
            C89219l.m154710a("recycleView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.l$d */
    public static final class View$OnClickListenerC37415d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37411l f88302a;

        static {
            Covode.recordClassIndex(44796);
        }

        View$OnClickListenerC37415d(C37411l lVar) {
            this.f88302a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C37411l.m75457c(this.f88302a).setVisibility(4);
            C37411l.m75455a(this.f88302a).setVisibility(0);
            C37411l.m75455a(this.f88302a).mo129911a();
            CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f88302a.f88290g;
            EnumC37412a itemType = this.f88302a.getItemType();
            int i = this.f88302a.f88288e;
            C374161 r1 = new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.commentStickerPanel.C37411l.View$OnClickListenerC37415d.C374161 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC37415d f88303a;

                static {
                    Covode.recordClassIndex(44797);
                }

                {
                    this.f88303a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    if (C37411l.m75455a(this.f88303a.f88302a).f190120a) {
                        C37411l.m75455a(this.f88303a.f88302a).mo129912b();
                        C37411l.m75455a(this.f88303a.f88302a).setVisibility(8);
                    }
                    return C89391z.f203057a;
                }
            };
            C89219l.m154721d(itemType, "");
            C89219l.m154721d(r1, "");
            int i2 = C37366c.f88166b[itemType.ordinal()];
            if (i2 == 1) {
                C37429b bVar = commentAndQuestionAndQuestionStickerPanelViewModel.f88080m;
                CommentAndQuestionAndQuestionStickerPanelViewModel.C37339i iVar = new CommentAndQuestionAndQuestionStickerPanelViewModel.C37339i(commentAndQuestionAndQuestionStickerPanelViewModel, r1);
                C89219l.m154721d(iVar, "");
                QuestionStickerPanelRequestApi questionStickerPanelRequestApi = bVar.f88342a;
                if (questionStickerPanelRequestApi != null) {
                    questionStickerPanelRequestApi.mo65068a(i, iVar, EnumC37361h.QuestionCollectionINVITATION.ordinal());
                }
            } else if (i2 == 2) {
                C37429b bVar2 = commentAndQuestionAndQuestionStickerPanelViewModel.f88080m;
                CommentAndQuestionAndQuestionStickerPanelViewModel.C37340j jVar = new CommentAndQuestionAndQuestionStickerPanelViewModel.C37340j(commentAndQuestionAndQuestionStickerPanelViewModel, r1);
                C89219l.m154721d(jVar, "");
                QuestionStickerPanelRequestApi questionStickerPanelRequestApi2 = bVar2.f88342a;
                if (questionStickerPanelRequestApi2 != null) {
                    questionStickerPanelRequestApi2.mo65068a(i, jVar, EnumC37361h.QuestionCollectionRECOMMEND.ordinal());
                }
            } else if (i2 == 3) {
                C37429b bVar3 = commentAndQuestionAndQuestionStickerPanelViewModel.f88080m;
                CommentAndQuestionAndQuestionStickerPanelViewModel.C37341k kVar = new CommentAndQuestionAndQuestionStickerPanelViewModel.C37341k(commentAndQuestionAndQuestionStickerPanelViewModel, r1);
                C89219l.m154721d(kVar, "");
                QuestionStickerPanelRequestApi questionStickerPanelRequestApi3 = bVar3.f88342a;
                if (questionStickerPanelRequestApi3 != null) {
                    questionStickerPanelRequestApi3.mo65068a(i, kVar, EnumC37361h.QuestionCollectionFAVORITE.ordinal());
                }
            } else if (i2 == 4) {
                CommentStickerPanelRequestApi.m75464a(C37426a.f88331a, i, 0, new C37426a.C37428b(new CommentAndQuestionAndQuestionStickerPanelViewModel.C37342l(commentAndQuestionAndQuestionStickerPanelViewModel, r1)), EnumC37354a.Favorites.getValue(), 2);
            } else if (i2 == 5) {
                CommentStickerPanelRequestApi.m75464a(C37426a.f88331a, i, 0, new CommentAndQuestionAndQuestionStickerPanelViewModel.C37343m(commentAndQuestionAndQuestionStickerPanelViewModel, r1), EnumC37354a.Recommended.getValue(), 2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.l$e */
    public static final class C37417e extends AbstractC89220m implements AbstractC89172b<Object, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37411l f88304a;

        static {
            Covode.recordClassIndex(44798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37417e(C37411l lVar) {
            super(1);
            this.f88304a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            Object obj2;
            C89219l.m154721d(obj, "");
            int i = C37419n.f88311d[this.f88304a.getItemType().ordinal()];
            Map<String, String> map = null;
            if (i == 1 || i == 2 || i == 3) {
                QaStruct qaStruct = (QaStruct) obj;
                qaStruct.setSource(this.f88304a.getItemType().getSource());
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f88304a.f88290g;
                C89219l.m154721d(qaStruct, "");
                commentAndQuestionAndQuestionStickerPanelViewModel.mo33689c(new CommentAndQuestionAndQuestionStickerPanelViewModel.C37333c(qaStruct));
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel2 = this.f88304a.f88290g;
                String nameForMob = this.f88304a.getItemType().getNameForMob();
                C89219l.m154721d(nameForMob, "");
                C37410k kVar = commentAndQuestionAndQuestionStickerPanelViewModel2.f88089v;
                C89219l.m154721d(qaStruct, "");
                C89219l.m154721d(nameForMob, "");
                C84425b a = kVar.mo65055a();
                if (a != null) {
                    a.mo129404a("question_id", qaStruct.getQuestionId());
                    a.mo129406a("qa_sticker_category", nameForMob);
                    map = a.f188764a;
                }
                C80322d.m139251a("prop_click", map);
            } else if (i == 4 || i == 5) {
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel3 = this.f88304a.f88290g;
                if (!(obj instanceof CommentVideoModel)) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                CommentVideoModel commentVideoModel = (CommentVideoModel) obj2;
                String nameForMob2 = this.f88304a.getItemType().getNameForMob();
                C89219l.m154721d(nameForMob2, "");
                String str = commentAndQuestionAndQuestionStickerPanelViewModel3.f88073b.get(nameForMob2);
                if (str != null) {
                    C37410k kVar2 = commentAndQuestionAndQuestionStickerPanelViewModel3.f88089v;
                    C89219l.m154721d(str, "");
                    if (commentVideoModel != null) {
                        C84425b a2 = kVar2.mo65055a();
                        if (a2 != null) {
                            a2.mo129406a("tab_name", str);
                            a2.mo129406a("comment_id", commentVideoModel.getCommentId());
                            a2.mo129406a("comment_user_id", commentVideoModel.getUserId());
                            a2.mo129406a("group_id", commentVideoModel.getAwemeId());
                            a2.mo129406a("author_id", commentVideoModel.getAwemeUserId());
                            map = a2.f188764a;
                        }
                        C80322d.m139251a("select_reply_comment", map);
                    }
                }
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel4 = this.f88304a.f88290g;
                CommentVideoModel commentVideoModel2 = (CommentVideoModel) obj;
                EnumC37412a itemType = this.f88304a.getItemType();
                C89219l.m154721d(commentVideoModel2, "");
                C89219l.m154721d(itemType, "");
                commentAndQuestionAndQuestionStickerPanelViewModel4.f88074c = itemType.getCurrentTabType();
                commentAndQuestionAndQuestionStickerPanelViewModel4.mo33689c(new CommentAndQuestionAndQuestionStickerPanelViewModel.C37332b(commentVideoModel2));
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.l$b */
    public static final class C37413b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C37411l f88300a;

        static {
            Covode.recordClassIndex(44794);
        }

        C37413b(C37411l lVar) {
            this.f88300a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final void onChanged(Object obj) {
            List<C37355b> list;
            ArrayList arrayList;
            int i;
            Integer num;
            Integer num2;
            List<C37355b> list2;
            List<QaStruct> list3;
            Collection<? extends Object> collection;
            int i2;
            int i3 = C37419n.f88310c[this.f88300a.getItemType().ordinal()];
            boolean z = true;
            if (i3 == 1 || i3 == 2) {
                if (C37411l.m75455a(this.f88300a).f190120a) {
                    C37411l.m75455a(this.f88300a).mo129912b();
                    C37411l.m75455a(this.f88300a).setVisibility(8);
                }
                if (!(obj instanceof C37356c)) {
                    obj = null;
                }
                C37356c cVar = (C37356c) obj;
                if (cVar != null && (list = cVar.f88139a) != null && !list.isEmpty()) {
                    this.f88300a.setVisibility(0);
                    int size = this.f88300a.f88291h.size();
                    List<Object> list4 = this.f88300a.f88291h;
                    if (cVar == null || (list2 = cVar.f88139a) == null) {
                        arrayList = C89086z.INSTANCE;
                    } else {
                        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(C37426a.m75468a(it.next()));
                        }
                        arrayList = arrayList2;
                    }
                    list4.addAll(arrayList);
                    C37411l lVar = this.f88300a;
                    if (cVar == null || (num2 = cVar.f88140b) == null) {
                        i = this.f88300a.f88288e;
                    } else {
                        i = num2.intValue();
                    }
                    lVar.f88288e = i;
                    C37411l lVar2 = this.f88300a;
                    if (cVar == null || (num = cVar.f88141c) == null || num.intValue() != 1) {
                        z = false;
                    }
                    lVar2.f88289f = z;
                    if (this.f88300a.f88289f) {
                        C37411l.m75456b(this.f88300a).setVisibility(0);
                        C37411l.m75457c(this.f88300a).setVisibility(0);
                    } else {
                        C37411l.m75456b(this.f88300a).setVisibility(8);
                        C37411l.m75457c(this.f88300a).setVisibility(8);
                    }
                    RecyclerView.AbstractC1350a adapter = C37411l.m75459d(this.f88300a).getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemInserted(size);
                    }
                } else if (this.f88300a.f88291h.isEmpty()) {
                    this.f88300a.setVisibility(8);
                }
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                if (C37411l.m75455a(this.f88300a).f190120a) {
                    C37411l.m75455a(this.f88300a).mo129912b();
                    C37411l.m75455a(this.f88300a).setVisibility(8);
                }
                if (!(obj instanceof C37360g)) {
                    obj = null;
                }
                C37360g gVar = (C37360g) obj;
                if (gVar != null && (list3 = gVar.f88151b) != null && !list3.isEmpty()) {
                    this.f88300a.setVisibility(0);
                    int size2 = this.f88300a.f88291h.size();
                    List<Object> list5 = this.f88300a.f88291h;
                    if (gVar == null || (collection = gVar.f88151b) == null) {
                        collection = C89086z.INSTANCE;
                    }
                    list5.addAll(collection);
                    C37411l lVar3 = this.f88300a;
                    if (gVar != null) {
                        i2 = gVar.f88152c;
                    } else {
                        i2 = lVar3.f88288e;
                    }
                    lVar3.f88288e = i2;
                    C37411l lVar4 = this.f88300a;
                    if (gVar == null || gVar.f88153d != 1) {
                        z = false;
                    }
                    lVar4.f88289f = z;
                    if (this.f88300a.f88289f) {
                        C37411l.m75456b(this.f88300a).setVisibility(0);
                        C37411l.m75457c(this.f88300a).setVisibility(0);
                    } else {
                        C37411l.m75456b(this.f88300a).setVisibility(8);
                        C37411l.m75457c(this.f88300a).setVisibility(8);
                    }
                    RecyclerView.AbstractC1350a adapter2 = C37411l.m75459d(this.f88300a).getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemInserted(size2);
                    }
                } else if (this.f88300a.f88291h.isEmpty()) {
                    this.f88300a.setVisibility(8);
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.l$c */
    static final class C37414c extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, AbstractC23517a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37411l f88301a;

        static {
            Covode.recordClassIndex(44795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37414c(C37411l lVar) {
            super(2);
            this.f88301a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, AbstractC23517a aVar) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(aVar, "");
            if (aVar instanceof AbstractC23517a.C23518a) {
                this.f88301a.f88292i.clear();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C37411l(Context context, EnumC37412a aVar) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(7266);
        this.f88298o = aVar;
        int i = C37419n.f88308a[aVar.ordinal()];
        int i2 = R.string.f3n;
        if (i == 1) {
            i2 = R.string.f3o;
        } else if (i == 2) {
            i2 = R.string.f3p;
        } else if (i != 3) {
            if (i == 4) {
                i2 = R.string.f3m;
            } else if (i != 5) {
                C89376n nVar = new C89376n();
                MethodCollector.m26664o(7266);
                throw nVar;
            }
        }
        this.f88297n = i2;
        while (true) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
                        C89219l.m154716b(a, "");
                        this.f88290g = (CommentAndQuestionAndQuestionStickerPanelViewModel) a;
                        this.f88291h = new ArrayList();
                        this.f88292i = new ArrayList();
                        m75460d();
                        m75458c();
                        AbstractC88412b unused = selectSubscribe(this.f88290g, C37431o.f88349a, new C20370ah(), new C37414c(this));
                        MethodCollector.m26664o(7266);
                        return;
                    }
                }
            } else {
                break;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(7266);
        throw nullPointerException;
    }

    public /* synthetic */ C37411l(Context context, EnumC37412a aVar, byte b) {
        this(context, aVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
