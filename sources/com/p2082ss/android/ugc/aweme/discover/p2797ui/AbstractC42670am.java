package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58186a;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67685a;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67694f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.am */
public abstract class AbstractC42670am extends AbstractC34586a implements AbstractC58186a.AbstractC58187a {

    /* renamed from: F */
    public static final String f99491F = "SearchFragment";

    /* renamed from: G */
    public static final String f99492G = "search_key";

    /* renamed from: H */
    public static final int f99493H = 0;

    /* renamed from: I */
    public static final int f99494I = 2483;

    /* renamed from: J */
    public static final C42671a f99495J = new C42671a((byte) 0);

    /* renamed from: A */
    public String f99496A = "";

    /* renamed from: B */
    public int f99497B;

    /* renamed from: C */
    public int f99498C = 1;

    /* renamed from: D */
    public C67437b f99499D;

    /* renamed from: E */
    public boolean f99500E = true;

    /* renamed from: a */
    private final AbstractC89244h f99501a = C89250i.m154773a((AbstractC89171a) new C42672b(this));

    /* renamed from: b */
    private String f99502b = "";

    /* renamed from: c */
    private boolean f99503c;

    /* renamed from: d */
    private SparseArray f99504d;

    /* renamed from: p */
    public final C67685a f99505p = new C67685a();

    /* renamed from: q */
    public final C67694f f99506q = new C67694f();

    /* renamed from: r */
    public C67678d f99507r;

    /* renamed from: s */
    public C67678d f99508s;

    /* renamed from: t */
    public int f99509t;

    /* renamed from: u */
    public String f99510u = "";

    /* renamed from: v */
    public String f99511v = "";

    /* renamed from: w */
    public String f99512w = "";

    /* renamed from: y */
    public String f99513y = "";

    /* renamed from: z */
    public String f99514z = "";

    /* renamed from: a */
    public View mo71296a(int i) {
        if (this.f99504d == null) {
            this.f99504d = new SparseArray();
        }
        View view = (View) this.f99504d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f99504d.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo71343a(C67678d dVar) {
        C89219l.m154721d(dVar, "");
    }

    public void bb_() {
        SparseArray sparseArray = this.f99504d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: c */
    public abstract String mo71298c();

    /* renamed from: e */
    public C42673an mo72875e() {
        return null;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bb_();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final AbstractC57066a.AbstractC57067a mo72880v() {
        return (AbstractC57066a.AbstractC57067a) this.f99501a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.am$a */
    public static final class C42671a {
        static {
            Covode.recordClassIndex(50775);
        }

        private C42671a() {
        }

        public /* synthetic */ C42671a(byte b) {
            this();
        }
    }

    /* renamed from: r */
    public boolean mo71311r() {
        return this.f99503c;
    }

    /* renamed from: u */
    public final String mo72879u() {
        return mo72880v().mo94218a().f129938a;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.am$b */
    static final class C42672b extends AbstractC89220m implements AbstractC89171a<AbstractC57066a.AbstractC57067a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42670am f99515a;

        static {
            Covode.recordClassIndex(50776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42672b(AbstractC42670am amVar) {
            super(0);
            this.f99515a = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC57066a.AbstractC57067a invoke() {
            ActivityC0945e activity = this.f99515a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            return new SearchKeywordPresenter(activity);
        }
    }

    static {
        Covode.recordClassIndex(50774);
    }

    /* renamed from: c */
    public final void mo72873c(String str) {
        C89219l.m154721d(str, "");
        this.f99510u = str;
    }

    /* renamed from: d */
    public final void mo72874d(String str) {
        C89219l.m154721d(str, "");
        this.f99511v = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo72876e(String str) {
        C89219l.m154721d(str, "");
        this.f99512w = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo72877f(String str) {
        C89219l.m154721d(str, "");
        this.f99513y = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo72878g(String str) {
        C89219l.m154721d(str, "");
        this.f99514z = str;
    }

    /* renamed from: b */
    public final void mo72872b(String str) {
        C89219l.m154721d(str, "");
        mo72880v().mo94219a(new C57071b(str, null, 2));
    }
}
