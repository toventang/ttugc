package com.p2082ss.android.ugc.aweme.notificationlive.p3537ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notificationlive.C62514b;
import com.p2082ss.android.ugc.aweme.notificationlive.C62516d;
import com.p2082ss.android.ugc.aweme.notificationlive.C62520g;
import com.p2082ss.android.ugc.aweme.notificationlive.C62562r;
import com.p2082ss.android.ugc.aweme.notificationlive.C62577t;
import com.p2082ss.android.ugc.aweme.notificationlive.C62682v;
import com.p2082ss.android.ugc.aweme.notificationlive.NotificationGameViewModel;
import com.p2082ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel;
import com.p2082ss.android.ugc.aweme.notificationlive.ResponseState;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63755f;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.user.repository.UserState;
import com.p2082ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a */
public final class C62605a extends AbstractC11293v implements AbstractC12846h, AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: t */
    public static final String f141960t = "data_user_key";

    /* renamed from: u */
    public static final String f141961u = "data_enter_from_key";

    /* renamed from: v */
    public static final String f141962v = "data_previous_page_key";

    /* renamed from: w */
    public static final String f141963w = "data_click_from_key";

    /* renamed from: x */
    public static final String f141964x = "data_aweme_raw_ad_key";

    /* renamed from: y */
    public static final C62618k f141965y = new C62618k((byte) 0);

    /* renamed from: A */
    private TextView f141966A;

    /* renamed from: B */
    private ConstraintLayout f141967B;

    /* renamed from: C */
    private TextView f141968C;

    /* renamed from: D */
    private ConstraintLayout f141969D;

    /* renamed from: E */
    private ConstraintLayout f141970E;

    /* renamed from: F */
    private ImageView f141971F;

    /* renamed from: G */
    private ImageView f141972G;

    /* renamed from: H */
    private ImageView f141973H;

    /* renamed from: I */
    private ImageView f141974I;

    /* renamed from: J */
    private final lifecycleAwareLazy f141975J;

    /* renamed from: K */
    private final C12814b f141976K;

    /* renamed from: L */
    private final lifecycleAwareLazy f141977L;

    /* renamed from: M */
    private SparseArray f141978M;

    /* renamed from: a */
    public final C34499i f141979a = new C34499i();

    /* renamed from: b */
    public final DialogC62660h f141980b;

    /* renamed from: c */
    public LinearLayout f141981c;

    /* renamed from: d */
    public CommonItemView f141982d;

    /* renamed from: e */
    public User f141983e;

    /* renamed from: f */
    public C62577t.AbstractC62578a f141984f;

    /* renamed from: g */
    public String f141985g;

    /* renamed from: h */
    public String f141986h;

    /* renamed from: i */
    public String f141987i;

    /* renamed from: j */
    public AwemeRawAd f141988j;

    /* renamed from: k */
    public AbstractC63755f f141989k;

    /* renamed from: l */
    public DialogInterface.OnCancelListener f141990l;

    /* renamed from: m */
    public final DialogInterface.OnDismissListener f141991m;

    /* renamed from: n */
    public final DialogInterface.OnCancelListener f141992n;

    /* renamed from: z */
    private ScrollView f141993z;

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$b */
    public static final class C62607b extends AbstractC89220m implements AbstractC89172b<C62514b, C62514b> {
        public static final C62607b INSTANCE = new C62607b();

        static {
            Covode.recordClassIndex(73406);
        }

        public C62607b() {
            super(1);
        }

        public final C62514b invoke(C62514b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    /* renamed from: h */
    private final NotificationLiveViewModel m113020h() {
        return (NotificationLiveViewModel) this.f141975J.getValue();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        SparseArray sparseArray = this.f141978M;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f141978M == null) {
            this.f141978M = new SparseArray();
        }
        View view = (View) this.f141978M.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f141978M.put(i, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final NotificationGameViewModel mo100559e() {
        return (NotificationGameViewModel) this.f141976K.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$d */
    public static final class C62609d extends AbstractC89220m implements AbstractC89171a<C62605a> {

        /* renamed from: a */
        final /* synthetic */ Fragment f141995a;

        static {
            Covode.recordClassIndex(73408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62609d(Fragment fragment) {
            super(0);
            this.f141995a = fragment;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.notificationlive.ui.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62605a invoke() {
            /*
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.f141995a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62605a.C62609d.invoke():androidx.fragment.app.Fragment");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$k */
    public static final class C62618k {
        static {
            Covode.recordClassIndex(73417);
        }

        private C62618k() {
        }

        public /* synthetic */ C62618k(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo9929d() {
        return this.f141979a;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$c */
    public static final class C62608c extends AbstractC89220m implements AbstractC89171a<C12874b<C62514b>> {
        public static final C62608c INSTANCE = new C62608c();

        static {
            Covode.recordClassIndex(73407);
        }

        public C62608c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C62514b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$f */
    public static final class C62611f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C62611f INSTANCE = new C62611f();

        static {
            Covode.recordClassIndex(73410);
        }

        public C62611f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$e */
    public static final class C62610e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f141996a;

        static {
            Covode.recordClassIndex(73409);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62610e(Fragment fragment) {
            super(0);
            this.f141996a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f141996a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$g */
    public static final class C62612g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f141997a;

        static {
            Covode.recordClassIndex(73411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62612g(AbstractC89277c cVar) {
            super(0);
            this.f141997a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f141997a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$i */
    public static final class C62615i extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f142003a;

        static {
            Covode.recordClassIndex(73414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62615i(AbstractC89277c cVar) {
            super(0);
            this.f142003a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f142003a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$p */
    static final class View$OnClickListenerC62623p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62605a f142013a;

        static {
            Covode.recordClassIndex(73422);
        }

        View$OnClickListenerC62623p(C62605a aVar) {
            this.f142013a = aVar;
        }

        /* renamed from: a */
        private static boolean m113040a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickAgent.onClick(view);
            this.f142013a.getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m113040a();
            }
            if (!C58029j.f132256h) {
                this.f142013a.mo100560f();
                return;
            }
            User user = this.f142013a.f141983e;
            if (user == null || user.getLivePushNotificationStatus() != 1) {
                this.f142013a.mo100557b(1);
                String str2 = this.f142013a.f141985g;
                User user2 = this.f142013a.f141983e;
                if (user2 != null) {
                    i = user2.getFollowStatus();
                } else {
                    i = 0;
                }
                User user3 = this.f142013a.f141983e;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                C64314y.m116178a(str2, i, str, this.f142013a.f141986h, "all");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$q */
    static final class View$OnClickListenerC62624q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62605a f142014a;

        static {
            Covode.recordClassIndex(73423);
        }

        View$OnClickListenerC62624q(C62605a aVar) {
            this.f142014a = aVar;
        }

        /* renamed from: a */
        private static boolean m113041a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickAgent.onClick(view);
            this.f142014a.getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m113041a();
            }
            if (!C58029j.f132256h) {
                this.f142014a.mo100560f();
                return;
            }
            User user = this.f142014a.f141983e;
            if (user == null || user.getLivePushNotificationStatus() != 2) {
                this.f142014a.mo100557b(2);
                String str2 = this.f142014a.f141985g;
                User user2 = this.f142014a.f141983e;
                if (user2 != null) {
                    i = user2.getFollowStatus();
                } else {
                    i = 0;
                }
                User user3 = this.f142014a.f141983e;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                C64314y.m116178a(str2, i, str, this.f142014a.f141986h, "personalized");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$r */
    static final class View$OnClickListenerC62625r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62605a f142015a;

        static {
            Covode.recordClassIndex(73424);
        }

        View$OnClickListenerC62625r(C62605a aVar) {
            this.f142015a = aVar;
        }

        /* renamed from: a */
        private static boolean m113042a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickAgent.onClick(view);
            this.f142015a.getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m113042a();
            }
            if (!C58029j.f132256h) {
                this.f142015a.mo100560f();
                return;
            }
            User user = this.f142015a.f141983e;
            if (user == null || user.getLivePushNotificationStatus() != 3) {
                this.f142015a.mo100557b(3);
                String str2 = this.f142015a.f141985g;
                User user2 = this.f142015a.f141983e;
                if (user2 != null) {
                    i = user2.getFollowStatus();
                } else {
                    i = 0;
                }
                User user3 = this.f142015a.f141983e;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                C64314y.m116178a(str2, i, str, this.f142015a.f141986h, "off");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$s */
    static final class View$OnClickListenerC62626s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62605a f142016a;

        static {
            Covode.recordClassIndex(73425);
        }

        View$OnClickListenerC62626s(C62605a aVar) {
            this.f142016a = aVar;
        }

        /* renamed from: a */
        private static boolean m113043a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            String str2;
            ClickAgent.onClick(view);
            this.f142016a.getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m113043a();
            }
            if (!C58029j.f132256h) {
                this.f142016a.mo100561g();
            }
            C62605a aVar = this.f142016a;
            CommonItemView commonItemView = aVar.f141982d;
            if (commonItemView != null) {
                z = commonItemView.mo27138d();
            } else {
                z = true;
            }
            boolean z2 = !z;
            DialogC62660h hVar = aVar.f141980b;
            if (hVar != null) {
                hVar.show();
            }
            AwemeRawAd awemeRawAd = aVar.f141988j;
            if (awemeRawAd == null || (str = awemeRawAd.getLogExtra()) == null) {
                str = "";
            }
            String string = new JSONObject(str).getString("req_id");
            NotificationGameViewModel e = aVar.mo100559e();
            AwemeRawAd awemeRawAd2 = aVar.f141988j;
            if (awemeRawAd2 == null || (str2 = awemeRawAd2.getCreativeIdStr()) == null) {
                str2 = "";
            }
            C89219l.m154716b(string, "");
            e.mo100457a(new C62520g(z2, str2, string));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$a */
    public static final class C62606a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f141994a;

        static {
            Covode.recordClassIndex(73405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62606a(AbstractC89277c cVar) {
            super(0);
            this.f141994a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f141994a).getName();
        }
    }

    /* renamed from: f */
    public final void mo100560f() {
        new C79459a(getContext()).mo123050a(R.string.djr).mo123053a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!C80428fg.m139432a(getContext()) || !C62577t.m113008c()) {
            dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$h */
    public static final class C62613h extends AbstractC89220m implements AbstractC89171a<NotificationLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f141998a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f141999b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f142000c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f142001d;

        static {
            Covode.recordClassIndex(73412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62613h(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f141998a = fragment;
            this.f141999b = aVar;
            this.f142000c = cVar;
            this.f142001d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f141998a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f141999b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f142000c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m113036xe8eb190b(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel> r0 = com.p2082ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.ui.a$h$1 r0 = new com.ss.android.ugc.aweme.notificationlive.ui.a$h$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62605a.C62613h.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_notificationlive_ui_HorizontalNotificationDialog$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m113036xe8eb190b(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$j */
    public static final class C62616j extends AbstractC89220m implements AbstractC89171a<UserViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f142004a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f142005b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f142006c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f142007d;

        static {
            Covode.recordClassIndex(73415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62616j(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f142004a = fragment;
            this.f142005b = aVar;
            this.f142006c = cVar;
            this.f142007d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.user.repository.UserViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.user.repository.UserViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f142004a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f142005b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f142006c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m113037x103ac00d(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.user.repository.UserViewModel> r0 = com.p2082ss.android.ugc.aweme.user.repository.UserViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.ui.a$j$1 r0 = new com.ss.android.ugc.aweme.notificationlive.ui.a$j$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62605a.C62616j.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_notificationlive_ui_HorizontalNotificationDialog$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m113037x103ac00d(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    static {
        Covode.recordClassIndex(73404);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.amn);
        bVar.f27020g = 8388613;
        bVar.f27021h = C3966y.m9653a(375.0f);
        bVar.f27017d = false;
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            bVar.f27022i = C3966y.m9656a(activity).heightPixels;
        }
        return bVar;
    }

    /* renamed from: g */
    public final void mo100561g() {
        C18129a.m33746a("homepage_ad", "save", this.f141988j).mo28900b("refer", "manage_page").mo28897a("enter_from", this.f141987i).mo28897a("success", 1).mo28901b();
        new C79459a(getContext()).mo123050a(R.string.c2w).mo123053a();
    }

    public C62605a() {
        DialogC62660h hVar;
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            hVar = new DialogC62660h(context);
        } else {
            hVar = null;
        }
        this.f141980b = hVar;
        this.f141985g = "";
        this.f141986h = "";
        this.f141987i = "";
        C62628u uVar = C62628u.f142018a;
        AbstractC89277c a = C89204ab.m154669a(NotificationLiveViewModel.class);
        C62612g gVar = new C62612g(a);
        this.f141975J = new lifecycleAwareLazy(this, gVar, new C62613h(this, gVar, a, uVar));
        AbstractC89277c a2 = C89204ab.m154669a(NotificationGameViewModel.class);
        this.f141976K = new C12814b(a2, new C62606a(a2), C62608c.INSTANCE, new C62609d(this), new C62610e(this), C62611f.INSTANCE, C62607b.INSTANCE);
        C62629v vVar = new C62629v(this);
        AbstractC89277c a3 = C89204ab.m154669a(UserViewModel.class);
        C62615i iVar = new C62615i(a3);
        this.f141977L = new lifecycleAwareLazy(this, iVar, new C62616j(this, iVar, a3, vVar));
        this.f141991m = new DialogInterface$OnDismissListenerC62620m(this);
        this.f141992n = new DialogInterface$OnCancelListenerC62619l(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$t */
    static final class View$OnClickListenerC62627t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62605a f142017a;

        static {
            Covode.recordClassIndex(73426);
        }

        View$OnClickListenerC62627t(C62605a aVar) {
            this.f142017a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f142017a.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.f141990l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$l */
    static final class DialogInterface$OnCancelListenerC62619l implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C62605a f142009a;

        static {
            Covode.recordClassIndex(73418);
        }

        DialogInterface$OnCancelListenerC62619l(C62605a aVar) {
            this.f142009a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            LinearLayout linearLayout = this.f142009a.f141981c;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                C18129a.m33746a("homepage_ad", "otherclick", this.f142009a.f141988j).mo28900b("refer", "manage_page").mo28897a("enter_from", this.f142009a.f141987i).mo28897a("notification_choose_type", 2).mo28901b();
            }
            AbstractC63755f fVar = this.f142009a.f141989k;
            if (fVar != null) {
                fVar.mo96120b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$m */
    static final class DialogInterface$OnDismissListenerC62620m implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C62605a f142010a;

        static {
            Covode.recordClassIndex(73419);
        }

        DialogInterface$OnDismissListenerC62620m(C62605a aVar) {
            this.f142010a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC63755f fVar = this.f142010a.f141989k;
            if (fVar != null) {
                fVar.mo96120b();
            }
            LinearLayout linearLayout = this.f142010a.f141981c;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                C18129a.m33746a("homepage_ad", "otherclick", this.f142010a.f141988j).mo28900b("refer", "manage_page").mo28897a("enter_from", this.f142010a.f141987i).mo28897a("notification_choose_type", 2).mo28901b();
            }
        }
    }

    /* renamed from: b */
    public final void mo100557b(int i) {
        String str;
        DialogC62660h hVar = this.f141980b;
        if (hVar != null) {
            hVar.show();
        }
        NotificationLiveViewModel h = m113020h();
        User user = this.f141983e;
        String str2 = "";
        if (user == null || (str = user.getSecUid()) == null) {
            str = str2;
        }
        h.mo100459a(new C62682v(i, str));
        AbstractC63755f fVar = this.f141989k;
        if (fVar != null) {
            AbstractC63755f.C63756a a = fVar.mo96118a();
            if (i == 1) {
                str2 = "all";
            } else if (i == 2) {
                str2 = "personalized";
            } else if (i == 3) {
                str2 = "off";
            }
            C39162r.m79460a("livesdk_live_notification_choose", new C33744d().mo59983a("enter_from_merge", a.f144527c).mo59983a("enter_method", a.f144528d).mo59983a("room_id", a.f144525a).mo59983a("anchor_id", a.f144526b).mo59983a("setting_type", str2).mo59986a(a.f144529e).f79943a);
        }
    }

    /* renamed from: c */
    public final void mo100558c(int i) {
        if (i == 1) {
            ImageView imageView = this.f141972G;
            if (imageView == null) {
                C89219l.m154710a("allLiveImage");
            }
            imageView.setImageResource(2131233413);
            ImageView imageView2 = this.f141973H;
            if (imageView2 == null) {
                C89219l.m154710a("recommendedLiveImage");
            }
            imageView2.setImageResource(2131233414);
            ImageView imageView3 = this.f141974I;
            if (imageView3 == null) {
                C89219l.m154710a("offLiveImage");
            }
            imageView3.setImageResource(2131233414);
        } else if (i == 2) {
            ImageView imageView4 = this.f141972G;
            if (imageView4 == null) {
                C89219l.m154710a("allLiveImage");
            }
            imageView4.setImageResource(2131233414);
            ImageView imageView5 = this.f141973H;
            if (imageView5 == null) {
                C89219l.m154710a("recommendedLiveImage");
            }
            imageView5.setImageResource(2131233413);
            ImageView imageView6 = this.f141974I;
            if (imageView6 == null) {
                C89219l.m154710a("offLiveImage");
            }
            imageView6.setImageResource(2131233414);
        } else if (i == 3) {
            ImageView imageView7 = this.f141972G;
            if (imageView7 == null) {
                C89219l.m154710a("allLiveImage");
            }
            imageView7.setImageResource(2131233414);
            ImageView imageView8 = this.f141973H;
            if (imageView8 == null) {
                C89219l.m154710a("recommendedLiveImage");
            }
            imageView8.setImageResource(2131233414);
            ImageView imageView9 = this.f141974I;
            if (imageView9 == null) {
                C89219l.m154710a("offLiveImage");
            }
            imageView9.setImageResource(2131233413);
        }
    }

    /* renamed from: a */
    private static Object m113019a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$u */
    static final class C62628u extends AbstractC89220m implements AbstractC89183m<ResponseState, Bundle, ResponseState> {

        /* renamed from: a */
        public static final C62628u f142018a = new C62628u();

        static {
            Covode.recordClassIndex(73427);
        }

        C62628u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ ResponseState invoke(ResponseState responseState, Bundle bundle) {
            ResponseState responseState2 = responseState;
            C89219l.m154721d(responseState2, "");
            return ResponseState.copy$default(responseState2, -1, -1, null, null, 12, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$v */
    static final class C62629v extends AbstractC89220m implements AbstractC89183m<UserState, Bundle, UserState> {

        /* renamed from: a */
        final /* synthetic */ C62605a f142019a;

        static {
            Covode.recordClassIndex(73428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62629v(C62605a aVar) {
            super(2);
            this.f142019a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ UserState invoke(UserState userState, Bundle bundle) {
            UserState userState2 = userState;
            C89219l.m154721d(userState2, "");
            User user = this.f142019a.f141983e;
            if (user == null) {
                user = new User();
            }
            return UserState.copy$default(userState2, user, false, null, null, null, 30, null);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CommerceUserInfo commerceUserInfo;
        String c;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f141983e = (User) arguments.getSerializable(f141960t);
            Object a = m113019a(arguments, f141961u);
            Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.String");
            this.f141985g = (String) a;
            Object a2 = m113019a(arguments, f141962v);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.String");
            this.f141986h = (String) a2;
            Object a3 = m113019a(arguments, f141963w);
            Objects.requireNonNull(a3, "null cannot be cast to non-null type kotlin.String");
            this.f141987i = (String) a3;
            this.f141988j = (AwemeRawAd) m113019a(arguments, f141964x);
        }
        C89219l.m154721d(view, "");
        view.findViewById(R.id.dnb).setBackgroundResource(R.drawable.bu3);
        View findViewById = view.findViewById(R.id.b6q);
        C89219l.m154716b(findViewById, "");
        findViewById.setVisibility(8);
        View findViewById2 = view.findViewById(R.id.db1);
        C89219l.m154716b(findViewById2, "");
        ScrollView scrollView = (ScrollView) findViewById2;
        this.f141993z = scrollView;
        if (scrollView == null) {
            C89219l.m154710a("pushSettingLayout");
        }
        boolean z = false;
        scrollView.setVisibility(0);
        View findViewById3 = view.findViewById(R.id.db5);
        C89219l.m154716b(findViewById3, "");
        this.f141966A = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.dax);
        C89219l.m154716b(findViewById4, "");
        this.f141967B = (ConstraintLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.db7);
        C89219l.m154716b(findViewById5, "");
        this.f141968C = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.db4);
        C89219l.m154716b(findViewById6, "");
        this.f141969D = (ConstraintLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.db3);
        C89219l.m154716b(findViewById7, "");
        this.f141970E = (ConstraintLayout) findViewById7;
        View findViewById8 = view.findViewById(R.id.day);
        C89219l.m154716b(findViewById8, "");
        this.f141971F = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(R.id.i9);
        C89219l.m154716b(findViewById9, "");
        this.f141972G = (ImageView) findViewById9;
        View findViewById10 = view.findViewById(R.id.dfv);
        C89219l.m154716b(findViewById10, "");
        this.f141973H = (ImageView) findViewById10;
        View findViewById11 = view.findViewById(R.id.cvv);
        C89219l.m154716b(findViewById11, "");
        this.f141974I = (ImageView) findViewById11;
        this.f141981c = (LinearLayout) view.findViewById(R.id.daw);
        this.f141982d = (CommonItemView) view.findViewById(R.id.db0);
        AbstractC63755f fVar = this.f141989k;
        int i = 1;
        if (!(fVar == null || (c = fVar.mo96121c()) == null || c.length() == 0)) {
            TextView textView = this.f141968C;
            if (textView == null) {
                C89219l.m154710a("pushSettingNoticeStr");
            }
            textView.setVisibility(0);
            TextView textView2 = this.f141968C;
            if (textView2 == null) {
                C89219l.m154710a("pushSettingNoticeStr");
            }
            textView2.setText(fVar.mo96121c());
        }
        ConstraintLayout constraintLayout = this.f141967B;
        if (constraintLayout == null) {
            C89219l.m154710a("pushSettingAllLive");
        }
        constraintLayout.setOnClickListener(new View$OnClickListenerC62623p(this));
        ConstraintLayout constraintLayout2 = this.f141969D;
        if (constraintLayout2 == null) {
            C89219l.m154710a("pushSettingRecommendedLive");
        }
        constraintLayout2.setOnClickListener(new View$OnClickListenerC62624q(this));
        ConstraintLayout constraintLayout3 = this.f141970E;
        if (constraintLayout3 == null) {
            C89219l.m154710a("pushSettingOffLive");
        }
        constraintLayout3.setOnClickListener(new View$OnClickListenerC62625r(this));
        CommonItemView commonItemView = this.f141982d;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(new View$OnClickListenerC62626s(this));
        }
        CommonItemView commonItemView2 = this.f141982d;
        if (commonItemView2 != null) {
            User user = this.f141983e;
            if (!(user == null || (commerceUserInfo = user.getCommerceUserInfo()) == null || commerceUserInfo.getNotificationConfig() != 1)) {
                z = true;
            }
            commonItemView2.setChecked(z);
        }
        ImageView imageView = this.f141971F;
        if (imageView == null) {
            C89219l.m154710a("pushSettingClose");
        }
        imageView.setOnClickListener(new View$OnClickListenerC62627t(this));
        User user2 = this.f141983e;
        if (user2 != null) {
            i = user2.getLivePushNotificationStatus();
        }
        mo100558c(i);
        AbstractC63755f fVar2 = this.f141989k;
        if (fVar2 != null) {
            AbstractC63755f.C63756a a4 = fVar2.mo96118a();
            C39162r.m79460a("livesdk_live_notification_show", new C33744d().mo59983a("enter_from_merge", a4.f144527c).mo59983a("enter_method", a4.f144528d).mo59983a("room_id", a4.f144525a).mo59983a("anchor_id", a4.f144526b).mo59986a(a4.f144529e).f79943a);
        }
        AbstractC88412b unused = selectSubscribe(m113020h(), C62657e.f142070a, C62658f.f142071a, C62659g.f142072a, new C20370ah(), new C62622o(this));
        AbstractC12818f.C12819a.m23067a(this, mo100559e(), C62654b.f142067a, C62655c.f142068a, C62656d.f142069a, (C12854k) null, new C62621n(this), 24);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$n */
    static final class C62621n extends AbstractC89220m implements AbstractC89188r<AbstractC22876d, C62516d, AbstractC20362a<? extends Boolean>, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62605a f142011a;

        static {
            Covode.recordClassIndex(73420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62621n(C62605a aVar) {
            super(4);
            this.f142011a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(AbstractC22876d dVar, C62516d dVar2, AbstractC20362a<? extends Boolean> aVar, Integer num) {
            boolean z;
            boolean z2;
            AbstractC20362a<? extends Boolean> aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar2, "");
            if (dVar2 != null) {
                DialogC62660h hVar = this.f142011a.f141980b;
                if (hVar != null) {
                    hVar.dismiss();
                }
                if (intValue == 0) {
                    CommonItemView commonItemView = this.f142011a.f141982d;
                    if (commonItemView != null) {
                        Boolean bool = (Boolean) aVar2.mo33695a();
                        if (bool != null) {
                            z2 = bool.booleanValue();
                        } else {
                            z2 = false;
                        }
                        commonItemView.setChecked(z2);
                    }
                    C62605a aVar3 = this.f142011a;
                    Boolean bool2 = (Boolean) aVar2.mo33695a();
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    } else {
                        z = true;
                    }
                    C18129a.m33746a("homepage_ad", "otherclick", aVar3.f141988j).mo28900b("refer", "manage_page").mo28897a("enter_from", aVar3.f141987i).mo28897a("notification_choose_type", Integer.valueOf(!z ? 1 : 0)).mo28901b();
                    new C79459a(C17867d.m33078a()).mo123050a(R.string.c2x).mo123053a();
                } else {
                    this.f142011a.mo100561g();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$o */
    static final class C62622o extends AbstractC89220m implements AbstractC89188r<AbstractC20477i, C62562r, Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62605a f142012a;

        static {
            Covode.recordClassIndex(73421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62622o(C62605a aVar) {
            super(4);
            this.f142012a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(AbstractC20477i iVar, C62562r rVar, Integer num, Integer num2) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            C89219l.m154721d(iVar, "");
            if (rVar != null) {
                DialogC62660h hVar = this.f142012a.f141980b;
                if (hVar != null) {
                    hVar.dismiss();
                }
                if (intValue2 == 0) {
                    this.f142012a.mo100558c(intValue);
                    AwemeRawAd awemeRawAd = this.f142012a.f141988j;
                    if (awemeRawAd == null || awemeRawAd.getNotificationConfig() != 1) {
                        this.f142012a.dismiss();
                    }
                    C62605a aVar = this.f142012a;
                    if (intValue == 1) {
                        new C79459a(aVar.getContext()).mo123050a(R.string.sb).mo123053a();
                    } else if (intValue == 2) {
                        new C79459a(aVar.getContext()).mo123050a(R.string.g8g).mo123053a();
                    } else if (intValue == 3) {
                        new C79459a(aVar.getContext()).mo123050a(R.string.dkd).mo123053a();
                    }
                    AbstractC63755f fVar = this.f142012a.f141989k;
                    if (fVar != null) {
                        fVar.mo96119a(intValue);
                    }
                } else {
                    this.f142012a.mo100560f();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
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

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
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

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
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

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
