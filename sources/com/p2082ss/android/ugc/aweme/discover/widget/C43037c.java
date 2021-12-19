package com.p2082ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41491ab;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41932k;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67467ac;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.c */
public final class C43037c extends FrameLayout {

    /* renamed from: a */
    private SearchCorrectTextView f100324a;

    /* renamed from: b */
    private SearchCorrectTextView f100325b;

    /* renamed from: c */
    private SearchCorrectTextView f100326c;

    /* renamed from: d */
    private ViewGroup f100327d;

    /* renamed from: e */
    private ViewGroup f100328e;

    /* renamed from: f */
    private SparseArray f100329f;

    static {
        Covode.recordClassIndex(51185);
    }

    /* renamed from: a */
    private View m85871a(int i) {
        if (this.f100329f == null) {
            this.f100329f = new SparseArray();
        }
        View view = (View) this.f100329f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f100329f.put(i, findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C43037c(Context context) {
        this(context, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.widget.c$a */
    public static final class View$OnClickListenerC43038a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43037c f100330a;

        /* renamed from: b */
        final /* synthetic */ String f100331b;

        /* renamed from: c */
        final /* synthetic */ QueryCorrectInfo f100332c;

        /* renamed from: d */
        final /* synthetic */ String f100333d;

        static {
            Covode.recordClassIndex(51186);
        }

        View$OnClickListenerC43038a(C43037c cVar, String str, QueryCorrectInfo queryCorrectInfo, String str2) {
            this.f100330a = cVar;
            this.f100331b = str;
            this.f100332c = queryCorrectInfo;
            this.f100333d = str2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC81915c.m141874a(new C41932k(this.f100331b, this.f100332c.getCorrectedLevel()));
            C43037c.m85872a("click", this.f100332c.getCorrectedLevel(), this.f100332c.getCorrectedKeyword(), this.f100333d, this.f100332c.getRequestId(), "original_keyword");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.widget.c$b */
    public static final class View$OnClickListenerC43039b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43037c f100334a;

        /* renamed from: b */
        final /* synthetic */ QueryCorrectInfo f100335b;

        /* renamed from: c */
        final /* synthetic */ String f100336c;

        static {
            Covode.recordClassIndex(51187);
        }

        View$OnClickListenerC43039b(C43037c cVar, QueryCorrectInfo queryCorrectInfo, String str) {
            this.f100334a = cVar;
            this.f100335b = queryCorrectInfo;
            this.f100336c = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC81915c.m141874a(new C41932k(this.f100335b.getCorrectedKeyword(), this.f100335b.getCorrectedLevel()));
            C43037c.m85872a("click", this.f100335b.getCorrectedLevel(), this.f100335b.getCorrectedKeyword(), this.f100336c, this.f100335b.getRequestId(), "corrected_keyword");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.widget.c$c */
    public static final class View$OnClickListenerC43040c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43037c f100337a;

        /* renamed from: b */
        final /* synthetic */ String f100338b;

        /* renamed from: c */
        final /* synthetic */ QueryCorrectInfo f100339c;

        static {
            Covode.recordClassIndex(51188);
        }

        View$OnClickListenerC43040c(C43037c cVar, String str, QueryCorrectInfo queryCorrectInfo) {
            this.f100337a = cVar;
            this.f100338b = str;
            this.f100339c = queryCorrectInfo;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC81915c.m141874a(new C41932k(this.f100338b, this.f100339c.getCorrectedLevel()));
            C43037c.m85872a("click", this.f100339c.getCorrectedLevel(), this.f100339c.getCorrectedKeyword(), this.f100338b, this.f100339c.getRequestId(), "original_keyword");
        }
    }

    public final void setTopMargin(int i) {
        SearchCorrectTextView searchCorrectTextView = this.f100324a;
        if (searchCorrectTextView == null) {
            C89219l.m154710a("tvSearchResult");
        }
        SearchCorrectTextView searchCorrectTextView2 = this.f100324a;
        if (searchCorrectTextView2 == null) {
            C89219l.m154710a("tvSearchResult");
        }
        ViewGroup.LayoutParams layoutParams = searchCorrectTextView2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        }
        searchCorrectTextView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C43037c(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C43037c(Context context, char c) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7357);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.awq, this, true);
        View findViewById = findViewById(R.id.f38);
        C89219l.m154716b(findViewById, "");
        this.f100324a = (SearchCorrectTextView) findViewById;
        View findViewById2 = findViewById(R.id.eub);
        C89219l.m154716b(findViewById2, "");
        this.f100325b = (SearchCorrectTextView) findViewById2;
        View findViewById3 = findViewById(R.id.euc);
        C89219l.m154716b(findViewById3, "");
        this.f100326c = (SearchCorrectTextView) findViewById3;
        View findViewById4 = findViewById(R.id.e_k);
        C89219l.m154716b(findViewById4, "");
        this.f100327d = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(R.id.fia);
        C89219l.m154716b(findViewById5, "");
        this.f100328e = (ViewGroup) findViewById5;
        MethodCollector.m26664o(7357);
    }

    /* renamed from: b */
    private void m85873b(QueryCorrectInfo queryCorrectInfo, String str) {
        C89219l.m154721d(queryCorrectInfo, "");
        C89219l.m154721d(str, "");
        Context context = getContext();
        C89219l.m154716b(context, "");
        Resources resources = context.getResources();
        ViewGroup viewGroup = this.f100327d;
        if (viewGroup == null) {
            C89219l.m154710a("strongContainer");
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f100328e;
        if (viewGroup2 == null) {
            C89219l.m154710a("weakContainer");
        }
        viewGroup2.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) m85871a(R.id.crp);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        TuxTextView tuxTextView = (TuxTextView) m85871a(R.id.eua);
        C89219l.m154716b(tuxTextView, "");
        String correctedKeyword = queryCorrectInfo.getCorrectedKeyword();
        C89219l.m154716b(correctedKeyword, "");
        C43030a.m85862a(tuxTextView, correctedKeyword, resources.getColor(R.color.bh), queryCorrectInfo.getCorrectHighlightPosition().getPositions());
        ((TuxTextView) m85871a(R.id.eua)).setOnClickListener(new View$OnClickListenerC43039b(this, queryCorrectInfo, str));
        TuxTextView tuxTextView2 = (TuxTextView) m85871a(R.id.f0n);
        C89219l.m154716b(tuxTextView2, "");
        C43030a.m85861a(tuxTextView2, str);
        ((TuxTextView) m85871a(R.id.f0n)).setOnClickListener(new View$OnClickListenerC43040c(this, str, queryCorrectInfo));
        m85872a("show", queryCorrectInfo.getCorrectedLevel(), queryCorrectInfo.getCorrectedKeyword(), str, queryCorrectInfo.getRequestId(), "");
    }

    /* renamed from: a */
    public final void mo73231a(QueryCorrectInfo queryCorrectInfo, String str) {
        String correctedKeyword;
        C89219l.m154721d(queryCorrectInfo, "");
        C89219l.m154721d(str, "");
        if (!C41491ab.m83441a() || !queryCorrectInfo.isCorrectHighArrayAvailable()) {
            LinearLayout linearLayout = (LinearLayout) m85871a(R.id.crp);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            Context context = getContext();
            C89219l.m154716b(context, "");
            Resources resources = context.getResources();
            if (queryCorrectInfo.getCorrectedLevel() == 2) {
                ViewGroup viewGroup = this.f100327d;
                if (viewGroup == null) {
                    C89219l.m154710a("strongContainer");
                }
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = this.f100328e;
                if (viewGroup2 == null) {
                    C89219l.m154710a("weakContainer");
                }
                viewGroup2.setVisibility(8);
                SearchCorrectTextView searchCorrectTextView = this.f100324a;
                if (searchCorrectTextView == null) {
                    C89219l.m154710a("tvSearchResult");
                }
                searchCorrectTextView.mo73223a(R.string.fff, " “" + queryCorrectInfo.getCorrectedKeyword() + (char) 8221, resources.getColor(R.color.c4));
                SearchCorrectTextView searchCorrectTextView2 = this.f100325b;
                if (searchCorrectTextView2 == null) {
                    C89219l.m154710a("tvCorrectStrong");
                }
                searchCorrectTextView2.mo73223a(R.string.ffg, " “" + str + (char) 8221, resources.getColor(R.color.bh));
                correctedKeyword = str;
            } else {
                ViewGroup viewGroup3 = this.f100327d;
                if (viewGroup3 == null) {
                    C89219l.m154710a("strongContainer");
                }
                viewGroup3.setVisibility(8);
                ViewGroup viewGroup4 = this.f100328e;
                if (viewGroup4 == null) {
                    C89219l.m154710a("weakContainer");
                }
                viewGroup4.setVisibility(0);
                SearchCorrectTextView searchCorrectTextView3 = this.f100326c;
                if (searchCorrectTextView3 == null) {
                    C89219l.m154710a("tvCorrectWeak");
                }
                searchCorrectTextView3.mo73223a(R.string.ffh, " “" + queryCorrectInfo.getCorrectedKeyword() + (char) 8221, resources.getColor(R.color.bh));
                correctedKeyword = queryCorrectInfo.getCorrectedKeyword();
                C89219l.m154716b(correctedKeyword, "");
            }
            m85872a("show", queryCorrectInfo.getCorrectedLevel(), queryCorrectInfo.getCorrectedKeyword(), str, queryCorrectInfo.getRequestId(), "");
            setOnClickListener(new View$OnClickListenerC43038a(this, correctedKeyword, queryCorrectInfo, str));
            return;
        }
        m85873b(queryCorrectInfo, str);
    }

    /* renamed from: a */
    public static void m85872a(String str, int i, String str2, String str3, String str4, String str5) {
        String str6;
        if (i == 2) {
            str6 = "strong";
        } else {
            str6 = "weak";
        }
        ((C67467ac) new C67467ac().mo106488q(str).mo106483c(C48027ac.C48028a.f111257a.mo80055a(str4))).mo106418r(str6).mo106419s(str2).mo106420t(str3).mo106421u(str5).mo96792f();
    }
}
