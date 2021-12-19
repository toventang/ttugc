package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42346a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42347b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42352e;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.ClickSearchWord;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41522at;
import com.p2082ss.android.ugc.aweme.search.C67435g;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67507ay;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67528bi;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67532bk;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80291cb;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchView */
public final class ClickSearchView extends FrameLayout {

    /* renamed from: k */
    private static final C42323a f98573k = new C42323a((byte) 0);

    /* renamed from: a */
    View f98574a;

    /* renamed from: b */
    View f98575b;

    /* renamed from: c */
    View f98576c;

    /* renamed from: d */
    LinearLayout f98577d;

    /* renamed from: e */
    public int f98578e;

    /* renamed from: f */
    public C67568r f98579f;

    /* renamed from: g */
    public C42340b f98580g;

    /* renamed from: h */
    private List<? extends View> f98581h;

    /* renamed from: i */
    private final Set<View> f98582i;

    /* renamed from: j */
    private AbstractC89172b<? super View, C89391z> f98583j;

    static {
        Covode.recordClassIndex(50266);
    }

    public ClickSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchView$a */
    static final class C42323a {
        static {
            Covode.recordClassIndex(50267);
        }

        private C42323a() {
        }

        public /* synthetic */ C42323a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super android.view.View, h.z>, h.f.a.b<android.view.View, h.z> */
    public final AbstractC89172b<View, C89391z> getOnCloseClickListener() {
        return this.f98583j;
    }

    /* renamed from: b */
    public final boolean mo71508b() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo71507a() {
        ViewParent parent = getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            List<? extends View> list = this.f98581h;
            if ((list == null || !list.contains(childAt)) && childAt != this) {
                C89219l.m154716b(childAt, "");
                if (childAt.getVisibility() == 0) {
                    childAt.setVisibility(4);
                    this.f98582i.add(childAt);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo71509c() {
        if (mo71508b()) {
            setVisibility(4);
        }
        if (!this.f98582i.isEmpty()) {
            Iterator<T> it = this.f98582i.iterator();
            while (it.hasNext()) {
                it.next().setVisibility(0);
            }
            this.f98582i.clear();
        }
    }

    /* renamed from: d */
    private final void m84689d() {
        if (this.f98575b == null) {
            View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.awh, this, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a.getLayoutParams());
            layoutParams.gravity = 80;
            a.setLayoutParams(layoutParams);
            this.f98575b = a;
            addView(a);
            View view = this.f98575b;
            if (view == null) {
                C89219l.m154715b();
            }
            this.f98577d = (LinearLayout) view.findViewById(R.id.fjm);
            View view2 = this.f98575b;
            if (view2 == null) {
                C89219l.m154715b();
            }
            View findViewById = view2.findViewById(R.id.x_);
            findViewById.setOnClickListener(new View$OnClickListenerC42327e(this));
            this.f98576c = findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchView$b */
    static final class RunnableC42324b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ClickSearchView f98584a;

        /* renamed from: b */
        final /* synthetic */ C42340b f98585b;

        /* renamed from: c */
        final /* synthetic */ C67568r f98586c;

        /* renamed from: d */
        final /* synthetic */ List f98587d;

        /* renamed from: e */
        final /* synthetic */ int f98588e;

        /* renamed from: f */
        final /* synthetic */ boolean f98589f;

        static {
            Covode.recordClassIndex(50268);
        }

        RunnableC42324b(ClickSearchView clickSearchView, C42340b bVar, C67568r rVar, List list, int i, boolean z) {
            this.f98584a = clickSearchView;
            this.f98585b = bVar;
            this.f98586c = rVar;
            this.f98587d = list;
            this.f98588e = i;
            this.f98589f = z;
        }

        public final void run() {
            Drawable a;
            int i;
            MethodCollector.m26663i(7268);
            this.f98584a.f98580g = this.f98585b;
            this.f98584a.f98579f = this.f98586c;
            ClickSearchView clickSearchView = this.f98584a;
            List list = this.f98587d;
            int i2 = this.f98588e;
            int width = clickSearchView.getWidth();
            boolean z = this.f98589f;
            LinearLayout linearLayout = clickSearchView.f98577d;
            int i3 = 0;
            if (linearLayout != null) {
                if (linearLayout.getChildCount() > 0) {
                    linearLayout.removeAllViews();
                }
                int paddingLeft = (width - linearLayout.getPaddingLeft()) - linearLayout.getPaddingRight();
                list.size();
                C89233z.C89236c cVar = new C89233z.C89236c();
                cVar.element = 0;
                for (ClickSearchWord clickSearchWord : C89070n.m154571d((Iterable) list, 3)) {
                    Word word = clickSearchWord.wordRecord;
                    if (word != null) {
                        word.getWord();
                    }
                    Context context = clickSearchView.getContext();
                    C89219l.m154716b(context, "");
                    TuxTextView tuxTextView = new TuxTextView(context, null, i3, 6);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C42347b.f98657b);
                    layoutParams.bottomMargin = (int) C80284by.m139183a(8);
                    tuxTextView.setLayoutParams(layoutParams);
                    tuxTextView.setMaxLines(2);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextView.setGravity(17);
                    if (C41522at.m83463a()) {
                        a = C80291cb.m139199a(tuxTextView.getResources().getColor(R.color.a2k), C80284by.m139183a(2));
                    } else {
                        a = C0643b.m2369a(tuxTextView.getContext(), (int) R.drawable.bev);
                    }
                    tuxTextView.setBackground(a);
                    int i4 = C42347b.f98656a;
                    tuxTextView.setPadding(i4, i3, i4, i3);
                    tuxTextView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.a9));
                    if (C41522at.m83463a()) {
                        tuxTextView.setTuxFont(62);
                    } else {
                        tuxTextView.setTuxFont(52);
                    }
                    C17235c.m31810a(tuxTextView, 0.5f);
                    String str = null;
                    tuxTextView.setOnClickListener(new View$OnClickListenerC42325c(tuxTextView, clickSearchWord, clickSearchView, cVar, i2, paddingLeft, linearLayout));
                    if (C42346a.m84711a()) {
                        tuxTextView.setOnLongClickListener(new View$OnLongClickListenerC42326d(tuxTextView, clickSearchWord, clickSearchView, cVar, i2, paddingLeft, linearLayout));
                    }
                    tuxTextView.setText(clickSearchWord.word);
                    tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (tuxTextView.getLineCount() > 1) {
                        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                        layoutParams2.height = C42347b.f98658c;
                        tuxTextView.setLayoutParams(layoutParams2);
                    }
                    ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                    if (!(layoutParams3 instanceof LinearLayout.LayoutParams)) {
                        layoutParams3 = null;
                    }
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    if (layoutParams4 != null) {
                        i = layoutParams4.topMargin + layoutParams4.height + layoutParams4.bottomMargin;
                    } else {
                        i = 0;
                    }
                    if (cVar.element + i <= i2) {
                        cVar.element += i;
                        linearLayout.addView(tuxTextView);
                        C42340b bVar = clickSearchView.f98580g;
                        String str2 = bVar != null ? bVar.f98637c : null;
                        C42340b bVar2 = clickSearchView.f98580g;
                        String str3 = bVar2 != null ? bVar2.f98636b : null;
                        C67568r rVar = clickSearchView.f98579f;
                        C89219l.m154721d(clickSearchWord, "");
                        if (!clickSearchWord.isShowed) {
                            C67532bk bkVar = new C67532bk();
                            Word word2 = clickSearchWord.wordRecord;
                            C67530bj x = ((C67530bj) bkVar.mo106474v(word2 != null ? word2.getWordSource() : null).mo106480a(rVar != null ? rVar.f151314i : null).mo106484d(rVar != null ? rVar.f151315j : null)).mo106476x(str2);
                            Word word3 = clickSearchWord.wordRecord;
                            C67530bj w = x.mo106471d(word3 != null ? Integer.valueOf(word3.getWordPosition()) : null).mo106475w(clickSearchWord.word).mo106477y("general").mo106475w(clickSearchWord.word);
                            Word word4 = clickSearchWord.wordRecord;
                            if (word4 != null) {
                                str = word4.getId();
                            }
                            w.mo106453i(str).mo96788a(new C33744d().mo59983a("enter_group_id", str3).f79943a).mo96792f();
                            clickSearchWord.isShowed = true;
                        }
                    }
                    paddingLeft = paddingLeft;
                    cVar = cVar;
                    i3 = 0;
                }
                clickSearchView.mo71507a();
                if (clickSearchView.getVisibility() != 0) {
                    clickSearchView.setVisibility(0);
                    if (z) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(300);
                        View view = clickSearchView.f98574a;
                        if (view == null) {
                            C89219l.m154715b();
                        }
                        view.startAnimation(alphaAnimation);
                        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                        translateAnimation.setDuration(300);
                        View view2 = clickSearchView.f98575b;
                        if (view2 == null) {
                            C89219l.m154715b();
                        }
                        view2.startAnimation(translateAnimation);
                    }
                }
                i3 = linearLayout.getChildCount();
            }
            clickSearchView.f98578e = i3;
            C42352e.m84719a("click_recom", this.f98584a.f98578e, this.f98585b.f98637c, this.f98585b.f98636b, this.f98586c);
            MethodCollector.m26664o(7268);
        }
    }

    public final void setOnCloseClickListener(AbstractC89172b<? super View, C89391z> bVar) {
        this.f98583j = bVar;
    }

    public final void setAlwaysShowingViews(List<? extends View> list) {
        if (list != null) {
            this.f98581h = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchView$d */
    static final class View$OnLongClickListenerC42326d implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ TuxTextView f98597a;

        /* renamed from: b */
        final /* synthetic */ ClickSearchWord f98598b;

        /* renamed from: c */
        final /* synthetic */ ClickSearchView f98599c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f98600d;

        /* renamed from: e */
        final /* synthetic */ int f98601e;

        /* renamed from: f */
        final /* synthetic */ int f98602f;

        /* renamed from: g */
        final /* synthetic */ LinearLayout f98603g;

        static {
            Covode.recordClassIndex(50270);
        }

        View$OnLongClickListenerC42326d(TuxTextView tuxTextView, ClickSearchWord clickSearchWord, ClickSearchView clickSearchView, C89233z.C89236c cVar, int i, int i2, LinearLayout linearLayout) {
            this.f98597a = tuxTextView;
            this.f98598b = clickSearchWord;
            this.f98599c = clickSearchView;
            this.f98600d = cVar;
            this.f98601e = i;
            this.f98602f = i2;
            this.f98603g = linearLayout;
        }

        public final boolean onLongClick(View view) {
            Context context = this.f98597a.getContext();
            C89219l.m154716b(context, "");
            C42352e.m84716a(context, this.f98599c.f98579f, this.f98598b.wordRecord, "click_recom");
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchView$c */
    static final class View$OnClickListenerC42325c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TuxTextView f98590a;

        /* renamed from: b */
        final /* synthetic */ ClickSearchWord f98591b;

        /* renamed from: c */
        final /* synthetic */ ClickSearchView f98592c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f98593d;

        /* renamed from: e */
        final /* synthetic */ int f98594e;

        /* renamed from: f */
        final /* synthetic */ int f98595f;

        /* renamed from: g */
        final /* synthetic */ LinearLayout f98596g;

        static {
            Covode.recordClassIndex(50269);
        }

        View$OnClickListenerC42325c(TuxTextView tuxTextView, ClickSearchWord clickSearchWord, ClickSearchView clickSearchView, C89233z.C89236c cVar, int i, int i2, LinearLayout linearLayout) {
            this.f98590a = tuxTextView;
            this.f98591b = clickSearchWord;
            this.f98592c = clickSearchView;
            this.f98593d = cVar;
            this.f98594e = i;
            this.f98595f = i2;
            this.f98596g = linearLayout;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            Integer num;
            String str5;
            String str6;
            String str7;
            ClickAgent.onClick(view);
            ClickSearchWord clickSearchWord = this.f98591b;
            C42340b bVar = this.f98592c.f98580g;
            if (bVar != null) {
                str = bVar.f98637c;
            } else {
                str = null;
            }
            C42340b bVar2 = this.f98592c.f98580g;
            if (bVar2 != null) {
                str2 = bVar2.f98636b;
            } else {
                str2 = null;
            }
            C67568r rVar = this.f98592c.f98579f;
            C89219l.m154721d(clickSearchWord, "");
            C67528bi biVar = new C67528bi();
            Word word = clickSearchWord.wordRecord;
            if (word != null) {
                str3 = word.getId();
            } else {
                str3 = null;
            }
            C67530bj bjVar = (C67530bj) biVar.mo106453i(str3);
            Word word2 = clickSearchWord.wordRecord;
            if (word2 != null) {
                str4 = word2.getWordSource();
            } else {
                str4 = null;
            }
            C67530bj v = bjVar.mo106474v(str4);
            Word word3 = clickSearchWord.wordRecord;
            if (word3 != null) {
                num = Integer.valueOf(word3.getWordPosition());
            } else {
                num = null;
            }
            C67530bj w = v.mo106471d(num).mo106475w(clickSearchWord.word);
            if (rVar != null) {
                str5 = rVar.f151314i;
            } else {
                str5 = null;
            }
            C67540c a = w.mo106480a(str5);
            if (rVar != null) {
                str6 = rVar.f151315j;
            } else {
                str6 = null;
            }
            ((C67530bj) a.mo106484d(str6)).mo106476x(str).mo106475w(clickSearchWord.word).mo106477y("general").mo96788a(new C33744d().mo59983a("enter_group_id", str2).f79943a).mo96792f();
            C67678d dVar = new C67678d();
            C67568r rVar2 = this.f98592c.f98579f;
            if (rVar2 != null) {
                str7 = rVar2.f151314i;
            } else {
                str7 = null;
            }
            C67678d keyword = dVar.setLastSearchId(str7).setSearchFrom("click_recom").setKeyword(this.f98591b.word);
            Context context = this.f98590a.getContext();
            C89219l.m154716b(keyword, "");
            C67435g.m119470a(context, keyword, keyword.getSearchEnterParam(), null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchView$e */
    public static final class View$OnClickListenerC42327e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ClickSearchView f98604a;

        static {
            Covode.recordClassIndex(50271);
        }

        View$OnClickListenerC42327e(ClickSearchView clickSearchView) {
            this.f98604a = clickSearchView;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            this.f98604a.mo71509c();
            AbstractC89172b<View, C89391z> onCloseClickListener = this.f98604a.getOnCloseClickListener();
            if (onCloseClickListener != null) {
                onCloseClickListener.invoke(this.f98604a);
            }
            C67530bj c = new C67507ay().mo106474v("click_recom").mo106470c(Integer.valueOf(this.f98604a.f98578e));
            C67568r rVar = this.f98604a.f98579f;
            String str4 = null;
            if (rVar != null) {
                str = rVar.f151314i;
            } else {
                str = null;
            }
            C67540c a = c.mo106480a(str);
            C67568r rVar2 = this.f98604a.f98579f;
            if (rVar2 != null) {
                str2 = rVar2.f151315j;
            } else {
                str2 = null;
            }
            C67530bj bjVar = (C67530bj) a.mo106484d(str2);
            C42340b bVar = this.f98604a.f98580g;
            if (bVar != null) {
                str3 = bVar.f98637c;
            } else {
                str3 = null;
            }
            C67540c q = bjVar.mo106476x(str3).mo106477y("general").mo106488q("clear");
            C33744d dVar = new C33744d();
            C42340b bVar2 = this.f98604a.f98580g;
            if (bVar2 != null) {
                str4 = bVar2.f98636b;
            }
            q.mo96788a(dVar.mo59983a("enter_group_id", str4).f79943a).mo96792f();
        }
    }

    private /* synthetic */ ClickSearchView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ClickSearchView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7691);
        this.f98582i = new HashSet();
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(C0643b.m2369a(context, (int) R.drawable.bes));
        this.f98574a = view;
        addView(view);
        m84689d();
        MethodCollector.m26664o(7691);
    }
}
