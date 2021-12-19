package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41522at;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41554x;
import com.p2082ss.android.ugc.aweme.search.C67435g;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67528bi;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67532bk;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80590iv;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.f */
public final class C42356f extends RecyclerView.ViewHolder implements AbstractC67566p {

    /* renamed from: i */
    public static final C42357a f98677i = new C42357a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f98678a = C89250i.m154773a((AbstractC89171a) new C42363f(this));

    /* renamed from: b */
    int f98679b;

    /* renamed from: c */
    int f98680c;

    /* renamed from: d */
    int f98681d;

    /* renamed from: e */
    int f98682e;

    /* renamed from: f */
    public C67568r f98683f;

    /* renamed from: g */
    public C67678d f98684g;

    /* renamed from: h */
    public final View f98685h;

    /* renamed from: j */
    private final AbstractC89244h f98686j = C89250i.m154773a((AbstractC89171a) new C42364g(this));

    /* renamed from: k */
    private final AbstractC89244h f98687k = C89250i.m154773a((AbstractC89171a) new C42360c(this));

    /* renamed from: l */
    private C42411h f98688l;

    static {
        Covode.recordClassIndex(50301);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final LinearLayout mo71560a() {
        return (LinearLayout) this.f98686j.getValue();
    }

    /* renamed from: b */
    public final Context mo71562b() {
        return (Context) this.f98687k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.f$a */
    public static final class C42357a {
        static {
            Covode.recordClassIndex(50302);
        }

        private C42357a() {
        }

        public /* synthetic */ C42357a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.f$b */
    public static final class C42358b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42356f f98689a;

        /* renamed from: b */
        final /* synthetic */ C42411h f98690b;

        /* renamed from: c */
        final /* synthetic */ C67678d f98691c;

        static {
            Covode.recordClassIndex(50303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42358b(C42356f fVar, C42411h hVar, C67678d dVar) {
            super(0);
            this.f98689a = fVar;
            this.f98690b = hVar;
            this.f98691c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f98689a.f98685h.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42356f.C42358b.RunnableC423591 */

                /* renamed from: a */
                final /* synthetic */ C42358b f98692a;

                static {
                    Covode.recordClassIndex(50304);
                }

                {
                    this.f98692a = r1;
                }

                public final void run() {
                    boolean z;
                    int i;
                    int i2;
                    String str;
                    int i3;
                    String str2;
                    String str3;
                    C24246a a;
                    MethodCollector.m26663i(8362);
                    C42356f fVar = this.f98692a.f98689a;
                    C42411h hVar = this.f98692a.f98690b;
                    LinearLayout a2 = fVar.mo71560a();
                    C89219l.m154716b(a2, "");
                    int childCount = a2.getChildCount();
                    if (childCount > 1) {
                        fVar.f98682e = 0;
                        fVar.mo71560a().removeViews(1, childCount - 1);
                    }
                    boolean a3 = C41554x.m83488a();
                    if (C42348c.m84712a() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C41522at.m83463a()) {
                        i = 10;
                    } else {
                        i = 16;
                    }
                    int a4 = (int) C80284by.m139183a(i);
                    int i4 = 8;
                    if (a3) {
                        fVar.mo71560a().setPadding(0, a4, 0, 0);
                    } else {
                        int i5 = C42347b.f98656a;
                        fVar.mo71560a().setPadding(i5, a4, i5, (int) C80284by.m139183a(8));
                    }
                    LinearLayout a5 = fVar.mo71560a();
                    C89219l.m154716b(a5, "");
                    int height = a5.getHeight();
                    LinearLayout a6 = fVar.mo71560a();
                    C89219l.m154716b(a6, "");
                    int paddingTop = height - a6.getPaddingTop();
                    LinearLayout a7 = fVar.mo71560a();
                    C89219l.m154716b(a7, "");
                    int paddingBottom = paddingTop - a7.getPaddingBottom();
                    TextView textView = (TextView) fVar.f98678a.getValue();
                    C89219l.m154716b(textView, "");
                    fVar.f98679b = paddingBottom - textView.getHeight();
                    LinearLayout a8 = fVar.mo71560a();
                    C89219l.m154716b(a8, "");
                    int width = a8.getWidth();
                    LinearLayout a9 = fVar.mo71560a();
                    C89219l.m154716b(a9, "");
                    int paddingLeft = width - a9.getPaddingLeft();
                    LinearLayout a10 = fVar.mo71560a();
                    C89219l.m154716b(a10, "");
                    fVar.f98680c = paddingLeft - a10.getPaddingRight();
                    List<C42365g> list = hVar.f98796f;
                    if (list != null) {
                        i2 = list.size();
                    } else {
                        i2 = 0;
                    }
                    fVar.f98681d = i2;
                    C42348c.m84712a();
                    List<C42365g> list2 = hVar.f98796f;
                    if (list2 != null) {
                        Integer.valueOf(list2.size());
                    }
                    List<C42365g> list3 = hVar.f98796f;
                    C89219l.m154716b(list3, "");
                    Iterator it = C89070n.m154571d((Iterable) list3, 5).iterator();
                    int i6 = 0;
                    while (true) {
                        String str4 = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        C42365g gVar = (C42365g) it.next();
                        C89219l.m154716b(gVar, "");
                        FrameLayout frameLayout = new FrameLayout(fVar.mo71562b());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C42347b.f98657b);
                        layoutParams.topMargin = (int) C80284by.m139183a(i4);
                        frameLayout.setLayoutParams(layoutParams);
                        if (z) {
                            RemoteImageView remoteImageView = new RemoteImageView(fVar.mo71562b());
                            remoteImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            if (C41522at.m83463a()) {
                                C24247b bVar = new C24247b(Resources.getSystem());
                                bVar.f57495t = C24250e.m46055b(C80284by.m139183a(2));
                                a = bVar.mo39976a(C24229q.AbstractC24231b.f57458h).mo39973a();
                            } else {
                                C24247b bVar2 = new C24247b(Resources.getSystem());
                                bVar2.f57495t = C24250e.m46055b(C80284by.m139183a(4));
                                a = bVar2.mo39976a(C24229q.AbstractC24231b.f57458h).mo39973a();
                            }
                            remoteImageView.setHierarchy(a);
                            remoteImageView.setImageURI(gVar.f98702c);
                            frameLayout.addView(remoteImageView);
                        }
                        Context b = fVar.mo71562b();
                        C89219l.m154716b(b, "");
                        TuxTextView tuxTextView = new TuxTextView(b, null, 0, 6);
                        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        tuxTextView.setGravity(17);
                        if (z) {
                            tuxTextView.setBackground(C0643b.m2369a(tuxTextView.getContext(), (int) R.drawable.beq));
                            tuxTextView.setTextColor(-1);
                        } else {
                            tuxTextView.setBackground(C0643b.m2369a(tuxTextView.getContext(), (int) R.drawable.ber));
                            tuxTextView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.bx));
                        }
                        tuxTextView.setMaxLines(2);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        int i7 = C42347b.f98656a;
                        tuxTextView.setPadding(i7, 0, i7, 0);
                        if (C41522at.m83463a()) {
                            tuxTextView.setTuxFont(62);
                        } else {
                            tuxTextView.setTuxFont(52);
                        }
                        tuxTextView.setText(gVar.f98700a);
                        frameLayout.addView(tuxTextView);
                        tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(fVar.f98680c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if (tuxTextView.getLineCount() > 1 || fVar.f98681d <= 4) {
                            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                            layoutParams2.height = C42347b.f98658c;
                            frameLayout.setLayoutParams(layoutParams2);
                        }
                        C17235c.m31810a(frameLayout, 0.5f);
                        frameLayout.setOnClickListener(new View$OnClickListenerC42361d(fVar, gVar));
                        if (C42346a.m84711a()) {
                            frameLayout.setOnLongClickListener(new View$OnLongClickListenerC42362e(fVar, gVar));
                        }
                        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                        if (!(layoutParams3 instanceof LinearLayout.LayoutParams)) {
                            layoutParams3 = null;
                        }
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        if (layoutParams4 != null) {
                            i3 = layoutParams4.height + layoutParams4.topMargin + layoutParams4.bottomMargin;
                        } else {
                            i3 = 0;
                        }
                        if (fVar.f98682e + i3 <= fVar.f98679b) {
                            fVar.f98682e += i3;
                            fVar.mo71560a().addView(frameLayout);
                            Word word = gVar.f98701b;
                            if (word != null) {
                                C67678d dVar = fVar.f98684g;
                                if (dVar != null) {
                                    str2 = dVar.getKeyword();
                                } else {
                                    str2 = null;
                                }
                                C67568r rVar = fVar.f98683f;
                                C89219l.m154721d(word, "");
                                if (!word.isShowed()) {
                                    C67530bj v = new C67532bk().mo106474v(word.getWordSource());
                                    if (rVar != null) {
                                        str3 = rVar.f151314i;
                                    } else {
                                        str3 = null;
                                    }
                                    C67540c a11 = v.mo106480a(str3);
                                    if (rVar != null) {
                                        str4 = rVar.f151315j;
                                    }
                                    ((C67530bj) a11.mo106484d(str4)).mo106476x(str2).mo106471d(Integer.valueOf(word.getWordPosition())).mo106475w(word.getWord()).mo106477y("general").mo106475w(word.getWord()).mo106453i(word.getId()).mo96792f();
                                    word.setShowed(true);
                                }
                            }
                            i6++;
                        }
                        i4 = 8;
                    }
                    C67678d dVar2 = this.f98692a.f98691c;
                    if (dVar2 != null) {
                        str = dVar2.getKeyword();
                    } else {
                        str = null;
                    }
                    C42352e.m84719a("related_search", i6, str, null, this.f98692a.f98689a.f98683f);
                    MethodCollector.m26664o(8362);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.f$c */
    static final class C42360c extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        final /* synthetic */ C42356f f98693a;

        static {
            Covode.recordClassIndex(50305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42360c(C42356f fVar) {
            super(0);
            this.f98693a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Context invoke() {
            return this.f98693a.f98685h.getContext();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.f$f */
    static final class C42363f extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C42356f f98698a;

        static {
            Covode.recordClassIndex(50308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42363f(C42356f fVar) {
            super(0);
            this.f98698a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f98698a.f98685h.findViewById(R.id.f2a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.f$g */
    static final class C42364g extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C42356f f98699a;

        static {
            Covode.recordClassIndex(50309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42364g(C42356f fVar) {
            super(0);
            this.f98699a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f98699a.f98685h.findViewById(R.id.ce8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p
    /* renamed from: F */
    public final C67568r mo70877F() {
        C67568r rVar = this.f98683f;
        if (rVar == null) {
            return C67568r.C67569a.m119673a();
        }
        return rVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p
    /* renamed from: a */
    public final void mo70880a(C67568r rVar) {
        C89219l.m154721d(rVar, "");
        this.f98683f = rVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.f$e */
    static final class View$OnLongClickListenerC42362e implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C42356f f98696a;

        /* renamed from: b */
        final /* synthetic */ C42365g f98697b;

        static {
            Covode.recordClassIndex(50307);
        }

        View$OnLongClickListenerC42362e(C42356f fVar, C42365g gVar) {
            this.f98696a = fVar;
            this.f98697b = gVar;
        }

        public final boolean onLongClick(View view) {
            Context b = this.f98696a.mo71562b();
            C89219l.m154716b(b, "");
            C42352e.m84716a(b, this.f98696a.f98683f, this.f98697b.f98701b, "related_search");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42356f(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f98685h = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.f$d */
    static final class View$OnClickListenerC42361d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42356f f98694a;

        /* renamed from: b */
        final /* synthetic */ C42365g f98695b;

        static {
            Covode.recordClassIndex(50306);
        }

        View$OnClickListenerC42361d(C42356f fVar, C42365g gVar) {
            this.f98694a = fVar;
            this.f98695b = gVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            ClickAgent.onClick(view);
            Word word = this.f98695b.f98701b;
            if (word != null) {
                C67678d dVar = this.f98694a.f98684g;
                if (dVar != null) {
                    str2 = dVar.getKeyword();
                } else {
                    str2 = null;
                }
                C67568r rVar = this.f98694a.f98683f;
                C89219l.m154721d(word, "");
                C67530bj w = ((C67530bj) new C67528bi().mo106453i(word.getId())).mo106474v(word.getWordSource()).mo106471d(Integer.valueOf(word.getWordPosition())).mo106475w(word.getWord());
                if (rVar != null) {
                    str3 = rVar.f151314i;
                } else {
                    str3 = null;
                }
                C67540c a = w.mo106480a(str3);
                if (rVar != null) {
                    str4 = rVar.f151315j;
                } else {
                    str4 = null;
                }
                ((C67530bj) a.mo106484d(str4)).mo106476x(str2).mo106475w(word.getWord()).mo106477y("general").mo96792f();
            }
            C67678d searchFrom = new C67678d().setSearchFrom("related_search_keyword");
            C67568r rVar2 = this.f98694a.f98683f;
            if (rVar2 != null) {
                str = rVar2.f151314i;
            } else {
                str = null;
            }
            C67678d keyword = searchFrom.setLastSearchId(str).setKeyword(this.f98695b.f98700a);
            Context b = this.f98694a.mo71562b();
            C89219l.m154716b(keyword, "");
            C67435g.m119470a(b, keyword, keyword.getSearchEnterParam(), null);
        }
    }

    /* renamed from: a */
    public final void mo71561a(C42411h hVar, C67678d dVar) {
        getAdapterPosition();
        hashCode();
        this.f98685h.hashCode();
        if (hVar != null) {
            List<C42365g> list = hVar.f98796f;
            if (list != null) {
                Integer.valueOf(list.hashCode());
            }
            List<C42365g> list2 = hVar.f98796f;
            if (list2 != null) {
                Integer.valueOf(list2.size());
            }
            this.f98688l = hVar;
            this.f98684g = dVar;
            C80590iv.m139730a(this.f98685h, new C42358b(this, hVar, dVar));
        }
    }
}
