package com.p2082ss.android.ugc.aweme.account.p2276o;

import android.os.Bundle;
import android.view.View;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22293f;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.p2082ss.android.ugc.aweme.account.experiment.C31663o;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.o.d */
public final class C32903d extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    public static final C32904a f78293a = new C32904a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f78294b = C89250i.m154773a((AbstractC89171a) new C32906c(this));

    /* renamed from: j */
    private HashMap f78295j;

    static {
        Covode.recordClassIndex(39691);
    }

    /* renamed from: g */
    private String m67534g() {
        return (String) this.f78294b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78295j == null) {
            this.f78295j = new HashMap();
        }
        View view = (View) this.f78295j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78295j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78295j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.d$a */
    public static final class C32904a {
        static {
            Covode.recordClassIndex(39692);
        }

        private C32904a() {
        }

        public /* synthetic */ C32904a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88973n<C22291d<C22419n>> m67541a(AbstractC32572b bVar, String str, String str2) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C32407x.m66795a(bVar, str, bVar.mo58458A(), bVar.mo58460Z_(), "", str2, (String) null, 192);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.d$c */
    static final class C32906c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32903d f78297a;

        static {
            Covode.recordClassIndex(39694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32906c(C32903d dVar) {
            super(0);
            this.f78297a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67069c(this.f78297a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.d$d */
    static final class C32907d implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C32903d f78298a;

        static {
            Covode.recordClassIndex(39695);
        }

        C32907d(C32903d dVar) {
            this.f78298a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f78298a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: e */
    public final C32680l mo57582e() {
        C32680l lVar = new C32680l();
        lVar.f77920b = true;
        lVar.mo58526a(m67534g());
        lVar.f77922d = C32582d.m67073d(this);
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        C32904a.m67541a(this, m67534g(), "resend").mo143235a(new C32907d(this)).mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        int i;
        if (C31663o.m65975a()) {
            i = R.string.aqj;
        } else {
            i = R.string.arh;
        }
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(i);
        Locale locale = Locale.US;
        String string = getString(R.string.aqh);
        C89219l.m154716b(string, "");
        String a = C1764a.m5929a(locale, string, Arrays.copyOf(new Object[]{m67534g()}, 1));
        C89219l.m154716b(a, "");
        bVar.f78107f = a;
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        C32407x.m66790a(this, str, 22, (Map<String, String>) null).mo143251d(new C32905b(this)).mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.d$b */
    static final class C32905b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32903d f78296a;

        static {
            Covode.recordClassIndex(39693);
        }

        C32905b(C32903d dVar) {
            this.f78296a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22293f fVar = (C22293f) obj;
            C32903d dVar = this.f78296a;
            C89219l.m154716b(fVar, "");
            String str = fVar.f52736j;
            C89219l.m154716b(str, "");
            C32582d.m67068b(dVar, str);
            C32903d dVar2 = this.f78296a;
            Bundle arguments = dVar2.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments, "");
            dVar2.mo58461a(arguments);
        }
    }
}
