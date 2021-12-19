package com.p2082ss.android.ugc.aweme.account.login.p2259d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22297c;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22299e;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22316c;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22321h;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32404v;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32334a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.d.b */
public final class C31899b extends AbstractC32572b implements WeakHandler.IHandler {

    /* renamed from: a */
    public boolean f76209a;

    /* renamed from: b */
    public boolean f76210b;

    /* renamed from: c */
    public boolean f76211c;

    /* renamed from: d */
    public boolean f76212d;

    /* renamed from: e */
    private final AbstractC89244h f76213e = C89250i.m154773a((AbstractC89171a) new C31902c(this));

    /* renamed from: j */
    private final AbstractC89244h f76214j = C89250i.m154773a((AbstractC89171a) new C31906g(this));

    /* renamed from: k */
    private final AbstractC89244h f76215k = C89250i.m154773a((AbstractC89171a) new C31907h(this));

    /* renamed from: l */
    private final AbstractC89244h f76216l = C89250i.m154773a((AbstractC89171a) C31903d.f76222a);

    /* renamed from: m */
    private HashMap f76217m;

    static {
        Covode.recordClassIndex(38643);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f76217m == null) {
            this.f76217m = new HashMap();
        }
        View view = (View) this.f76217m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76217m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public final WeakHandler mo57830e() {
        return (WeakHandler) this.f76213e.getValue();
    }

    /* renamed from: g */
    public final String mo57831g() {
        return (String) this.f76214j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f76217m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: i */
    public final String mo57832i() {
        return (String) this.f76215k.getValue();
    }

    /* renamed from: j */
    public final HashSet<String> mo57833j() {
        return (HashSet) this.f76216l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.b$c */
    static final class C31902c extends AbstractC89220m implements AbstractC89171a<WeakHandler> {

        /* renamed from: a */
        final /* synthetic */ C31899b f76221a;

        static {
            Covode.recordClassIndex(38646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31902c(C31899b bVar) {
            super(0);
            this.f76221a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(this.f76221a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.b$d */
    static final class C31903d extends AbstractC89220m implements AbstractC89171a<HashSet<String>> {

        /* renamed from: a */
        public static final C31903d f76222a = new C31903d();

        static {
            Covode.recordClassIndex(38647);
        }

        C31903d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f76210b = true;
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: q */
    public final boolean mo57458q() {
        if (!this.f76209a) {
            mo57829a(false);
            this.f76209a = true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.b$g */
    static final class C31906g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31899b f76225a;

        static {
            Covode.recordClassIndex(38650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31906g(C31899b bVar) {
            super(0);
            this.f76225a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f76225a.getArguments();
            if (arguments == null || (string = arguments.getString("extra_previous_page")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.b$h */
    static final class C31907h extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31899b f76226a;

        static {
            Covode.recordClassIndex(38651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31907h(C31899b bVar) {
            super(0);
            this.f76226a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f76226a.getArguments();
            if (arguments == null || (string = arguments.getString("previous_page_location")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: k */
    public final void mo57834k() {
        m66243m();
        C31901b bVar = new C31901b(this);
        mo58464b(bVar);
        mo57827a(bVar);
        mo58469z().mo36636a(C31908c.f76227a, bVar);
    }

    /* renamed from: m */
    private void m66243m() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo57434c(R.id.e7i);
        C89219l.m154716b(dmtStatusView, "");
        if (dmtStatusView.getVisibility() != 0) {
            DmtStatusView dmtStatusView2 = (DmtStatusView) mo57434c(R.id.e7i);
            C89219l.m154716b(dmtStatusView2, "");
            dmtStatusView2.setVisibility(0);
        }
        ((DmtStatusView) mo57434c(R.id.e7i)).mo27384f();
    }

    /* renamed from: l */
    public final void mo57835l() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo57434c(R.id.e7i);
        C89219l.m154716b(dmtStatusView, "");
        if (dmtStatusView.getVisibility() != 8) {
            DmtStatusView dmtStatusView2 = (DmtStatusView) mo57434c(R.id.e7i);
            C89219l.m154716b(dmtStatusView2, "");
            dmtStatusView2.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        boolean z = true;
        this.f76211c = true;
        mo57830e().removeMessages(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        super.onDestroyView();
        ArrayList<AbstractC22288a<? extends C22289b>> arrayList = this.f77724u;
        if (arrayList == null || arrayList.size() <= 0) {
            z = false;
        }
        this.f76212d = z;
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.b$b */
    public static final class C31901b extends AbstractC22299e {

        /* renamed from: c */
        final /* synthetic */ C31899b f76220c;

        static {
            Covode.recordClassIndex(38645);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31901b(C31899b bVar) {
            this.f76220c = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: e */
        public final /* synthetic */ void mo36686e(C22321h hVar) {
            C22321h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (!this.f76220c.af_()) {
                C39162r.m79460a("account_debug_info", new C33744d().mo59983a("info", "GetQRCodeCallback onSuccess" + this.f52711a + ' ' + this.f76220c.mo57827a(this)).f79943a);
                return;
            }
            this.f76220c.mo57835l();
            String str = hVar2.f52760j;
            C89219l.m154716b(str, "");
            ((ImageView) this.f76220c.mo57434c(R.id.bru)).setImageBitmap(C31899b.m66242b(str));
            C31899b bVar = this.f76220c;
            String str2 = hVar2.f52762l;
            C89219l.m154716b(str2, "");
            bVar.mo57828a(str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: a */
        public final /* synthetic */ void mo36681a(C22321h hVar, int i) {
            String str;
            C22321h hVar2 = hVar;
            if (!this.f76220c.af_()) {
                C39162r.m79460a("account_debug_info", new C33744d().mo59983a("info", "GetQRCodeCallback onError" + this.f52711a + ' ' + this.f76220c.mo57827a(this)).f79943a);
                return;
            }
            ((DmtStatusView) this.f76220c.mo57434c(R.id.e7i)).mo27387h();
            C31899b bVar = this.f76220c;
            if (hVar2 == null || (str = hVar2.f52717f) == null) {
                str = "";
            }
            bVar.mo57442a(i, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.b$f */
    public static final class C31905f implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C31899b f76224a;

        static {
            Covode.recordClassIndex(38649);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31905f(C31899b bVar) {
            this.f76224a = bVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            ActivityC0945e activity = this.f76224a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: b_ */
    public final void mo57470b_(int i) {
        if (i == 1) {
            m66243m();
        } else if (i == 0) {
            mo57835l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.b$e */
    static final class View$OnClickListenerC31904e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31899b f76223a;

        static {
            Covode.recordClassIndex(38648);
        }

        View$OnClickListenerC31904e(C31899b bVar) {
            this.f76223a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f76223a.mo57434c(R.id.e7i);
            C89219l.m154716b(dmtStatusView, "");
            if (dmtStatusView.mo27391l()) {
                this.f76223a.mo57834k();
            }
        }
    }

    /* renamed from: b */
    public static Bitmap m66242b(String str) {
        MethodCollector.m26663i(10655);
        C89219l.m154721d(str, "");
        byte[] decode = Base64.decode(str, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        C89219l.m154716b(decodeByteArray, "");
        MethodCollector.m26664o(10655);
        return decodeByteArray;
    }

    /* renamed from: a */
    public final void mo57828a(String str) {
        C31900a aVar = new C31900a(this, str);
        mo58464b(aVar);
        mo58469z().mo36643a(str, C31908c.f76227a, aVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 2000) {
            mo57830e().removeMessages(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            if (af_()) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                if (C17873f.f42636l) {
                    WeakHandler e = mo57830e();
                    Message obtain = Message.obtain();
                    obtain.what = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                    obtain.obj = str;
                    e.sendMessageDelayed(obtain, 2300);
                    return;
                }
                mo57828a(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39162r.m79460a("login_qr_page_show", new C33744d().mo59983a("previous_page", mo57831g()).mo59983a("previous_page_location", mo57832i()).f79943a);
    }

    /* renamed from: a */
    public final <T extends C22289b> String mo57827a(AbstractC22288a<T> aVar) {
        int i;
        C89219l.m154721d(aVar, "");
        try {
            StringBuilder append = new StringBuilder("hdv:").append(this.f76211c).append(" hd:").append(this.f76210b).append(" callBackList size:");
            ArrayList<AbstractC22288a<? extends C22289b>> arrayList = this.f77724u;
            boolean z = false;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            StringBuilder append2 = append.append(i).append("  contain:");
            ArrayList<AbstractC22288a<? extends C22289b>> arrayList2 = this.f77724u;
            if (arrayList2 != null) {
                z = arrayList2.contains(aVar);
            }
            return append2.append(z).toString();
        } catch (Exception unused) {
            return "Exception";
        }
    }

    /* renamed from: a */
    public final void mo57829a(boolean z) {
        C39162r.m79460a("login_qr_page_time", new C33744d().mo59983a("previous_page", mo57831g()).mo59983a("previous_page_location", mo57832i()).mo59981a("stay_time", System.currentTimeMillis() - this.f77723t).mo59980a("is_success", z ? 1 : 0).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.b$a */
    public static final class C31900a extends AbstractC22297c {

        /* renamed from: c */
        final /* synthetic */ C31899b f76218c;

        /* renamed from: d */
        final /* synthetic */ String f76219d;

        static {
            Covode.recordClassIndex(38644);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: e */
        public final /* synthetic */ void mo36686e(C22316c cVar) {
            C22316c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            if (C89219l.m154714a((Object) cVar2.f52746y, (Object) "confirmed")) {
                this.f76218c.mo57829a(true);
                this.f76218c.f76209a = true;
                C32404v.m66778a(false, "qr_switch_new_device", (AbstractC32584f) this.f76218c, cVar2.f52724j, C89041ag.m154421a(new C89378p("previous_page", this.f76218c.mo57831g()), new C89378p("previous_page_location", this.f76218c.mo57832i())), false, 32);
                C31899b bVar = this.f76218c;
                EnumC32592i A = bVar.mo58458A();
                EnumC32594j Z_ = this.f76218c.mo58460Z_();
                C22507a aVar = cVar2.f52724j;
                C89219l.m154716b(aVar, "");
                C32334a.m66709a(bVar, A, Z_, aVar);
                return;
            }
            long j = 1500;
            if (!C89219l.m154714a((Object) cVar2.f52746y, (Object) "expired") && !C89219l.m154714a((Object) cVar2.f52746y, (Object) "refuse")) {
                if (C89219l.m154714a((Object) cVar2.f52746y, (Object) "scanned") && !this.f76218c.mo57833j().contains(this.f76219d)) {
                    this.f76218c.mo57833j().add(this.f76219d);
                    C39162r.m79460a("login_qr_page_scaned", new C33744d().mo59983a("previous_page", this.f76218c.mo57831g()).mo59983a("previous_page_location", this.f76218c.mo57832i()).f79943a);
                }
                WeakHandler e = this.f76218c.mo57830e();
                Message obtain = Message.obtain();
                obtain.what = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                obtain.obj = this.f76219d;
                if (!C89219l.m154714a((Object) cVar2.f52746y, (Object) "scanned")) {
                    j = 2300;
                }
                e.sendMessageDelayed(obtain, j);
            } else if (!this.f76218c.af_()) {
                C39162r.m79460a("account_debug_info", new C33744d().mo59983a("info", "CheckQRCodeStatusCallback onSuccess" + this.f52711a + ' ' + this.f76218c.mo57827a(this)).f79943a);
            } else {
                String str = cVar2.f52743v;
                C89219l.m154716b(str, "");
                ((ImageView) this.f76218c.mo57434c(R.id.bru)).setImageBitmap(C31899b.m66242b(str));
                WeakHandler e2 = this.f76218c.mo57830e();
                Message obtain2 = Message.obtain();
                obtain2.what = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                obtain2.obj = cVar2.f52747z;
                e2.sendMessageDelayed(obtain2, 1500);
            }
        }

        C31900a(C31899b bVar, String str) {
            this.f76218c = bVar;
            this.f76219d = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: a */
        public final /* synthetic */ void mo36681a(C22316c cVar, int i) {
            String str;
            C22316c cVar2 = cVar;
            if (!this.f76218c.af_()) {
                C39162r.m79460a("account_debug_info", new C33744d().mo59983a("info", "CheckQRCodeStatusCallback onError" + this.f52711a + ' ' + this.f76218c.mo57827a(this)).f79943a);
                return;
            }
            C31899b bVar = this.f76218c;
            if (cVar2 == null || (str = cVar2.f52717f) == null) {
                str = "";
            }
            C32334a.m66708a(bVar, i, str, this.f76218c.mo58458A(), this.f76218c.mo58460Z_(), null);
            WeakHandler e = this.f76218c.mo57830e();
            Message obtain = Message.obtain();
            obtain.what = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            obtain.obj = this.f76219d;
            e.sendMessageDelayed(obtain, 1500);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        new C79459a(getContext()).mo123052a(str).mo123053a();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.m26663i(10488);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) mo57434c(R.id.eiz);
        C89219l.m154716b(buttonTitleBar, "");
        ((AbstractC17250a) mo57434c(R.id.eiz)).setDividerLineBackground(C0643b.m2378c(buttonTitleBar.getContext(), R.color.l));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131231098);
        DmtStatusView dmtStatusView = (DmtStatusView) mo57434c(R.id.e7i);
        C89219l.m154716b(dmtStatusView, "");
        ((DmtStatusView) mo57434c(R.id.e7i)).setBuilder(DmtStatusView.C17269a.m31905a(dmtStatusView.getContext()).mo27408c(imageView));
        ((DmtStatusView) mo57434c(R.id.e7i)).setOnClickListener(new View$OnClickListenerC31904e(this));
        ((ButtonTitleBar) mo57434c(R.id.eiz)).setOnTitleBarClickListener(new C31905f(this));
        int a = (int) (((float) C17234b.m31806a(getContext())) - (C13628n.m24520b(getContext(), 58.0f) * 2.0f));
        ImageView imageView2 = (ImageView) mo57434c(R.id.bru);
        C89219l.m154716b(imageView2, "");
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        layoutParams.height = a;
        layoutParams.width = a;
        ImageView imageView3 = (ImageView) mo57434c(R.id.bru);
        C89219l.m154716b(imageView3, "");
        imageView3.setLayoutParams(layoutParams);
        ImageSpan imageSpan = new ImageSpan(view.getContext(), 2131231143);
        String string = getString(R.string.aop, "placeHolder");
        C89219l.m154716b(string, "");
        int a2 = C89361p.m154888a((CharSequence) string, "placeHolder", 0, false, 6);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(imageSpan, a2, a2 + 11, 33);
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bf4);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(spannableString);
        mo57834k();
        MethodCollector.m26664o(10488);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.fl, viewGroup, false);
    }
}
