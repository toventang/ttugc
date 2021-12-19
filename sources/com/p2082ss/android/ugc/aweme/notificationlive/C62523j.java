package com.p2082ss.android.ugc.aweme.notificationlive;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.C1764a;
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
import com.bytedance.common.utility.C13628n;
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
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.internal.AbstractC23064b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.notificationlive.C62577t;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63755f;
import com.p2082ss.android.ugc.aweme.profile.edit.C63529g;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63765ad;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.MusAvatarWithBorderView;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.user.repository.UserState;
import com.p2082ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.notificationlive.j */
public final class C62523j extends Fragment implements AbstractC12846h, AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: A */
    private ConstraintLayout f141806A;

    /* renamed from: B */
    private ImageView f141807B;

    /* renamed from: C */
    private ImageView f141808C;

    /* renamed from: D */
    private ImageView f141809D;

    /* renamed from: E */
    private ImageView f141810E;

    /* renamed from: F */
    private final lifecycleAwareLazy f141811F;

    /* renamed from: G */
    private final C12814b f141812G;

    /* renamed from: H */
    private final lifecycleAwareLazy f141813H;

    /* renamed from: I */
    private final boolean f141814I;

    /* renamed from: J */
    private final String f141815J;

    /* renamed from: K */
    private SparseArray f141816K;

    /* renamed from: a */
    public final C34499i f141817a;

    /* renamed from: b */
    public final DialogC62515c f141818b;

    /* renamed from: c */
    public FrameLayout f141819c;

    /* renamed from: d */
    public ConstraintLayout f141820d;

    /* renamed from: e */
    public MusAvatarWithBorderView f141821e;

    /* renamed from: f */
    public TextView f141822f;

    /* renamed from: g */
    public TuxButton f141823g;

    /* renamed from: h */
    public View f141824h;

    /* renamed from: i */
    public ScrollView f141825i;

    /* renamed from: j */
    public LinearLayout f141826j;

    /* renamed from: k */
    public CommonItemView f141827k;

    /* renamed from: l */
    public final DialogInterface.OnDismissListener f141828l;

    /* renamed from: m */
    public final DialogInterface.OnCancelListener f141829m;

    /* renamed from: n */
    public final User f141830n;

    /* renamed from: o */
    public final C62577t.AbstractC62578a f141831o;

    /* renamed from: p */
    public final String f141832p;

    /* renamed from: q */
    public final String f141833q;

    /* renamed from: r */
    public final String f141834r;

    /* renamed from: s */
    public final AwemeRawAd f141835s;

    /* renamed from: t */
    public final AbstractC63755f f141836t;

    /* renamed from: u */
    private TextView f141837u;

    /* renamed from: v */
    private ImageView f141838v;

    /* renamed from: w */
    private TextView f141839w;

    /* renamed from: x */
    private ConstraintLayout f141840x;

    /* renamed from: y */
    private TextView f141841y;

    /* renamed from: z */
    private ConstraintLayout f141842z;

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$b */
    public static final class C62527b extends AbstractC89220m implements AbstractC89172b<C62514b, C62514b> {
        public static final C62527b INSTANCE = new C62527b();

        static {
            Covode.recordClassIndex(73323);
        }

        public C62527b() {
            super(1);
        }

        public final C62514b invoke(C62514b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(73319);
    }

    public C62523j() {
        this((User) null, (C62577t.AbstractC62578a) null, false, (String) null, (String) null, (String) null, (String) null, (AwemeRawAd) null, 511);
    }

    /* renamed from: j */
    private final NotificationLiveViewModel m112962j() {
        return (NotificationLiveViewModel) this.f141811F.getValue();
    }

    /* renamed from: k */
    private final UserViewModel m112963k() {
        return (UserViewModel) this.f141813H.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final NotificationGameViewModel mo100487a() {
        return (NotificationGameViewModel) this.f141812G.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$d */
    public static final class C62529d extends AbstractC89220m implements AbstractC89171a<C62523j> {

        /* renamed from: a */
        final /* synthetic */ Fragment f141846a;

        static {
            Covode.recordClassIndex(73325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62529d(Fragment fragment) {
            super(0);
            this.f141846a = fragment;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.notificationlive.j, androidx.fragment.app.Fragment] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.notificationlive.C62523j invoke() {
            /*
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.f141846a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.C62523j.C62529d.invoke():androidx.fragment.app.Fragment");
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f141817a;
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

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$c */
    public static final class C62528c extends AbstractC89220m implements AbstractC89171a<C12874b<C62514b>> {
        public static final C62528c INSTANCE = new C62528c();

        static {
            Covode.recordClassIndex(73324);
        }

        public C62528c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C62514b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$f */
    public static final class C62531f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C62531f INSTANCE = new C62531f();

        static {
            Covode.recordClassIndex(73327);
        }

        public C62531f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$e */
    public static final class C62530e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f141847a;

        static {
            Covode.recordClassIndex(73326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62530e(Fragment fragment) {
            super(0);
            this.f141847a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f141847a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$g */
    public static final class C62532g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f141848a;

        static {
            Covode.recordClassIndex(73328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62532g(AbstractC89277c cVar) {
            super(0);
            this.f141848a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f141848a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$i */
    public static final class C62535i extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f141854a;

        static {
            Covode.recordClassIndex(73331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62535i(AbstractC89277c cVar) {
            super(0);
            this.f141854a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f141854a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$p */
    static final class View$OnClickListenerC62544p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141867a;

        static {
            Covode.recordClassIndex(73340);
        }

        View$OnClickListenerC62544p(C62523j jVar) {
            this.f141867a = jVar;
        }

        /* renamed from: a */
        private static boolean m112984a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            GeneralPermission generalPermission;
            int followToastType;
            int i;
            ClickAgent.onClick(view);
            this.f141867a.getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m112984a();
            }
            if (!C58029j.f132256h) {
                this.f141867a.mo100495h();
            } else if (this.f141867a.mo100491c()) {
                C62523j jVar = this.f141867a;
                User user = jVar.f141830n;
                if (user == null || (generalPermission = user.getGeneralPermission()) == null || !((followToastType = generalPermission.getFollowToastType()) == 2 || followToastType == 3 || followToastType == 4)) {
                    this.f141867a.mo100489b();
                    return;
                }
                Context context = jVar.getContext();
                if (context != null) {
                    C89219l.m154716b(context, "");
                    AbstractC23064b a = new C23023b(context).mo37479a(R.string.by0);
                    if (followToastType == 4) {
                        i = R.string.bz1;
                    } else {
                        i = R.string.bz5;
                    }
                    C23028c.m43435a((C23023b) a.mo37483b(i), new C62539l(jVar, followToastType)).mo37405a().mo37396b().show();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$t */
    static final class View$OnClickListenerC62548t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141871a;

        static {
            Covode.recordClassIndex(73344);
        }

        View$OnClickListenerC62548t(C62523j jVar) {
            this.f141871a = jVar;
        }

        /* renamed from: a */
        private static boolean m112987a() {
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
            this.f141871a.getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m112987a();
            }
            if (!C58029j.f132256h) {
                this.f141871a.mo100493f();
                return;
            }
            User user = this.f141871a.f141830n;
            if (user == null || user.getLivePushNotificationStatus() != 1) {
                this.f141871a.mo100488a(1);
                String str2 = this.f141871a.f141832p;
                User user2 = this.f141871a.f141830n;
                if (user2 != null) {
                    i = user2.getFollowStatus();
                } else {
                    i = 0;
                }
                User user3 = this.f141871a.f141830n;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                C64314y.m116178a(str2, i, str, this.f141871a.f141833q, "all");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$u */
    static final class View$OnClickListenerC62549u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141872a;

        static {
            Covode.recordClassIndex(73345);
        }

        View$OnClickListenerC62549u(C62523j jVar) {
            this.f141872a = jVar;
        }

        /* renamed from: a */
        private static boolean m112988a() {
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
            this.f141872a.getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m112988a();
            }
            if (!C58029j.f132256h) {
                this.f141872a.mo100493f();
                return;
            }
            User user = this.f141872a.f141830n;
            if (user == null || user.getLivePushNotificationStatus() != 2) {
                this.f141872a.mo100488a(2);
                String str2 = this.f141872a.f141832p;
                User user2 = this.f141872a.f141830n;
                if (user2 != null) {
                    i = user2.getFollowStatus();
                } else {
                    i = 0;
                }
                User user3 = this.f141872a.f141830n;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                C64314y.m116178a(str2, i, str, this.f141872a.f141833q, "personalized");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$v */
    static final class View$OnClickListenerC62550v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141873a;

        static {
            Covode.recordClassIndex(73346);
        }

        View$OnClickListenerC62550v(C62523j jVar) {
            this.f141873a = jVar;
        }

        /* renamed from: a */
        private static boolean m112989a() {
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
            this.f141873a.getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m112989a();
            }
            if (!C58029j.f132256h) {
                this.f141873a.mo100493f();
                return;
            }
            User user = this.f141873a.f141830n;
            if (user == null || user.getLivePushNotificationStatus() != 3) {
                this.f141873a.mo100488a(3);
                String str2 = this.f141873a.f141832p;
                User user2 = this.f141873a.f141830n;
                if (user2 != null) {
                    i = user2.getFollowStatus();
                } else {
                    i = 0;
                }
                User user3 = this.f141873a.f141830n;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                C64314y.m116178a(str2, i, str, this.f141873a.f141833q, "off");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$w */
    static final class View$OnClickListenerC62551w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141874a;

        static {
            Covode.recordClassIndex(73347);
        }

        View$OnClickListenerC62551w(C62523j jVar) {
            this.f141874a = jVar;
        }

        /* renamed from: a */
        private static boolean m112990a() {
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
            this.f141874a.getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m112990a();
            }
            if (!C58029j.f132256h) {
                this.f141874a.mo100494g();
            }
            C62523j jVar = this.f141874a;
            CommonItemView commonItemView = jVar.f141827k;
            if (commonItemView != null) {
                z = commonItemView.mo27138d();
            } else {
                z = true;
            }
            boolean z2 = !z;
            DialogC62515c cVar = jVar.f141818b;
            if (cVar != null) {
                cVar.show();
            }
            AwemeRawAd awemeRawAd = jVar.f141835s;
            if (awemeRawAd == null || (str = awemeRawAd.getLogExtra()) == null) {
                str = "";
            }
            String string = new JSONObject(str).getString("req_id");
            NotificationGameViewModel a = jVar.mo100487a();
            AwemeRawAd awemeRawAd2 = jVar.f141835s;
            if (awemeRawAd2 == null || (str2 = awemeRawAd2.getCreativeIdStr()) == null) {
                str2 = "";
            }
            C89219l.m154716b(string, "");
            a.mo100457a(new C62520g(z2, str2, string));
        }
    }

    /* renamed from: i */
    public final boolean mo100496i() {
        AwemeRawAd awemeRawAd = this.f141835s;
        if (awemeRawAd == null || awemeRawAd.getNotificationConfig() != 1) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f141816K;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$a */
    public static final class C62524a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f141843a;

        static {
            Covode.recordClassIndex(73320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62524a(AbstractC89277c cVar) {
            super(0);
            this.f141843a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f141843a).getName();
        }
    }

    /* renamed from: f */
    public final void mo100493f() {
        new C79459a(getContext()).mo123050a(R.string.djr).mo123053a();
    }

    /* renamed from: h */
    public final void mo100495h() {
        new C79459a(getContext()).mo123050a(R.string.fz3).mo123053a();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        /*
            r1 = this;
            super.onResume()
            android.content.Context r0 = r1.getContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80428fg.m139432a(r0)
            if (r0 == 0) goto L_0x0013
            boolean r0 = com.p2082ss.android.ugc.aweme.notificationlive.C62577t.m113008c()
            if (r0 != 0) goto L_0x0017
        L_0x0013:
            r0 = r1
            com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.C62523j.onResume():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$h */
    public static final class C62533h extends AbstractC89220m implements AbstractC89171a<NotificationLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f141849a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f141850b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f141851c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f141852d;

        static {
            Covode.recordClassIndex(73329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62533h(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f141849a = fragment;
            this.f141850b = aVar;
            this.f141851c = cVar;
            this.f141852d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f141849a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f141850b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f141851c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m112981x5a79d295(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel> r0 = com.p2082ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.j$h$1 r0 = new com.ss.android.ugc.aweme.notificationlive.j$h$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.C62523j.C62533h.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_notificationlive_NotificationLiveBottomDialog$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m112981x5a79d295(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$j */
    public static final class C62536j extends AbstractC89220m implements AbstractC89171a<UserViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f141855a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f141856b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f141857c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f141858d;

        static {
            Covode.recordClassIndex(73332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62536j(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f141855a = fragment;
            this.f141856b = aVar;
            this.f141857c = cVar;
            this.f141858d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.user.repository.UserViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.user.repository.UserViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f141855a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f141856b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f141857c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m112982x81c97997(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.user.repository.UserViewModel> r0 = com.p2082ss.android.ugc.aweme.user.repository.UserViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.j$j$1 r0 = new com.ss.android.ugc.aweme.notificationlive.j$j$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.C62523j.C62536j.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_notificationlive_NotificationLiveBottomDialog$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m112982x81c97997(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: c */
    public final boolean mo100491c() {
        Integer num;
        User user = this.f141830n;
        if (user != null && user.isBlocked()) {
            User user2 = this.f141830n;
            if (user2 != null) {
                num = Integer.valueOf(user2.getFollowStatus());
            } else {
                num = null;
            }
            if (!C80580in.m139679a(num.intValue())) {
                new C79459a(getContext()).mo123050a(R.string.bxy).mo123053a();
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo100494g() {
        C18129a.m33746a("homepage_ad", "save", this.f141835s).mo28900b("refer", "manage_page").mo28897a("enter_from", this.f141834r).mo28897a("success", 1).mo28901b();
        new C79459a(getContext()).mo123050a(R.string.c2w).mo123053a();
    }

    /* renamed from: e */
    public final void mo100492e() {
        String str;
        Resources resources;
        if (mo100496i()) {
            TextView textView = this.f141839w;
            if (textView == null) {
                C89219l.m154710a("pushSettingTitle");
            }
            Context context = getContext();
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.c2z);
            }
            textView.setText(str);
            LinearLayout linearLayout = this.f141826j;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            ConstraintLayout constraintLayout = this.f141840x;
            if (constraintLayout == null) {
                C89219l.m154710a("pushSettingAllLive");
            }
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            ConstraintLayout constraintLayout2 = this.f141840x;
            if (constraintLayout2 == null) {
                C89219l.m154710a("pushSettingAllLive");
            }
            constraintLayout2.setLayoutParams(marginLayoutParams);
            C18129a.m33746a("homepage_ad", "othershow", this.f141835s).mo28900b("refer", "manage_page").mo28897a("enter_from", this.f141834r).mo28901b();
            return;
        }
        LinearLayout linearLayout2 = this.f141826j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$q */
    public static final class ViewTreeObserver$OnPreDrawListenerC62545q implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141868a;

        static {
            Covode.recordClassIndex(73341);
        }

        public final boolean onPreDraw() {
            int i;
            int height = C62523j.m112959b(this.f141868a).getHeight() - C62523j.m112960c(this.f141868a).getHeight();
            TextView textView = this.f141868a.f141822f;
            if (textView == null) {
                C89219l.m154710a("followDoc");
            }
            int bottom = height - (textView.getBottom() - C62523j.m112958a(this.f141868a).getTop());
            View view = this.f141868a.f141824h;
            if (view == null) {
                C89219l.m154710a("followLine");
            }
            int bottom2 = (bottom - view.getBottom()) / 10;
            ViewGroup.LayoutParams layoutParams = C62523j.m112958a(this.f141868a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            ViewGroup.LayoutParams layoutParams2 = C62523j.m112960c(this.f141868a).getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
            ViewGroup.LayoutParams layoutParams3 = C62523j.m112959b(this.f141868a).getLayoutParams();
            int height2 = C62523j.m112959b(this.f141868a).getHeight();
            double b = (double) C13628n.m24521b(this.f141868a.getContext());
            Double.isNaN(b);
            if (height2 > ((int) (b * 0.73d))) {
                double b2 = (double) C13628n.m24521b(this.f141868a.getContext());
                Double.isNaN(b2);
                layoutParams3.height = (int) (b2 * 0.73d);
                C62523j.m112959b(this.f141868a).setLayoutParams(layoutParams3);
                return false;
            }
            int i2 = bottom2 * 4;
            if (aVar.topMargin == i2 && aVar2.topMargin == (i = bottom2 * 3) && aVar2.bottomMargin == i) {
                C62523j.m112961d(this.f141868a).getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            aVar.topMargin = i2;
            int i3 = bottom2 * 3;
            aVar2.topMargin = i3;
            aVar2.bottomMargin = i3;
            C62523j.m112958a(this.f141868a).setLayoutParams(aVar);
            C62523j.m112960c(this.f141868a).setLayoutParams(aVar2);
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnPreDrawListenerC62545q(C62523j jVar) {
            this.f141868a = jVar;
        }
    }

    /* renamed from: b */
    public final void mo100489b() {
        int i;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        int i3;
        int i4;
        User user = this.f141830n;
        boolean z = true;
        if (user == null || user.getFollowStatus() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        UserViewModel k = m112963k();
        C63847n.C63848a aVar = new C63847n.C63848a();
        User user2 = this.f141830n;
        String str5 = null;
        if (user2 != null) {
            str = user2.getUid();
        } else {
            str = null;
        }
        C63847n.C63848a a = aVar.mo103320a(str);
        User user3 = this.f141830n;
        if (user3 != null) {
            str2 = user3.getSecUid();
        } else {
            str2 = null;
        }
        String str6 = "other_places";
        C63847n.C63848a b = a.mo103325b(str2).mo103318a(i).mo103327c(str6).mo103324b(0);
        User user4 = this.f141830n;
        if (user4 != null) {
            i2 = user4.getFollowerStatus();
        } else {
            i2 = 0;
        }
        k.mo123556a(b.mo103328d(i2).mo103323a());
        User user5 = this.f141830n;
        if (user5 == null || user5.getFollowerStatus() != 1) {
            str3 = "single";
        } else {
            str3 = "mutual";
        }
        C59260v vVar = new C59260v();
        User user6 = this.f141830n;
        if (user6 != null) {
            str4 = user6.getUid();
        } else {
            str4 = null;
        }
        vVar.f135405e = str4;
        C59260v a2 = vVar.mo96847a(this.f141832p);
        a2.f135409s = "notification_bell";
        a2.f135402b = this.f141833q;
        if (!C89219l.m154714a((Object) this.f141815J, (Object) "")) {
            str6 = this.f141815J;
        }
        a2.f135403c = str6;
        a2.f135412v = str3;
        User user7 = this.f141830n;
        if (user7 == null || !user7.isSecret()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        a2.f135376aa = i3;
        a2.mo96846a(this.f141830n).mo96792f();
        User user8 = this.f141830n;
        if (user8 != null) {
            str5 = user8.getUid();
        }
        User user9 = this.f141830n;
        if (user9 != null) {
            i4 = user9.getFollowStatus();
        } else {
            i4 = 0;
        }
        User user10 = this.f141830n;
        if (user10 == null || user10.getAccountType() != 3) {
            z = false;
        }
        C63765ad.m115315a(str5, i4, z);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$aa */
    public static final class C62525aa implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141844a;

        static {
            Covode.recordClassIndex(73321);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62525aa(C62523j jVar) {
            this.f141844a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            ConstraintLayout d = C62523j.m112961d(this.f141844a);
            if (d != null) {
                d.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            ScrollView scrollView = this.f141844a.f141825i;
            if (scrollView == null) {
                C89219l.m154710a("pushSettingLayout");
            }
            scrollView.setVisibility(0);
            this.f141844a.mo100492e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$n */
    public static final class C62542n extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C62523j f141865a;

        static {
            Covode.recordClassIndex(73338);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62542n(C62523j jVar) {
            this.f141865a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            Animatable i;
            C89219l.m154721d(str, "");
            AbstractC24255a controller = C62523j.m112958a(this.f141865a).getController();
            if (controller != null && (i = controller.mo39821i()) != null) {
                if (C63529g.C63531b.m115126a()) {
                    i.stop();
                } else if (this.f141865a.getUserVisibleHint() && !i.isRunning()) {
                    i.start();
                } else if (!this.f141865a.getUserVisibleHint() && i.isRunning()) {
                    i.stop();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$o */
    static final class View$OnClickListenerC62543o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141866a;

        static {
            Covode.recordClassIndex(73339);
        }

        View$OnClickListenerC62543o(C62523j jVar) {
            this.f141866a = jVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.notificationlive.j r0 = r1.f141866a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.C62523j.View$OnClickListenerC62543o.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$x */
    static final class View$OnClickListenerC62552x implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141875a;

        static {
            Covode.recordClassIndex(73348);
        }

        View$OnClickListenerC62552x(C62523j jVar) {
            this.f141875a = jVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.notificationlive.j r0 = r1.f141875a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.C62523j.View$OnClickListenerC62552x.onClick(android.view.View):void");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MusAvatarWithBorderView m112958a(C62523j jVar) {
        MusAvatarWithBorderView musAvatarWithBorderView = jVar.f141821e;
        if (musAvatarWithBorderView == null) {
            C89219l.m154710a("followHeaderImage");
        }
        return musAvatarWithBorderView;
    }

    /* renamed from: b */
    public static final /* synthetic */ FrameLayout m112959b(C62523j jVar) {
        FrameLayout frameLayout = jVar.f141819c;
        if (frameLayout == null) {
            C89219l.m154710a("root");
        }
        return frameLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ TuxButton m112960c(C62523j jVar) {
        TuxButton tuxButton = jVar.f141823g;
        if (tuxButton == null) {
            C89219l.m154710a("followButton");
        }
        return tuxButton;
    }

    /* renamed from: d */
    public static final /* synthetic */ ConstraintLayout m112961d(C62523j jVar) {
        ConstraintLayout constraintLayout = jVar.f141820d;
        if (constraintLayout == null) {
            C89219l.m154710a("followLayout");
        }
        return constraintLayout;
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$l */
    static final class C62539l extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62523j f141861a;

        /* renamed from: b */
        final /* synthetic */ int f141862b;

        static {
            Covode.recordClassIndex(73335);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62539l(C62523j jVar, int i) {
            super(1);
            this.f141861a = jVar;
            this.f141862b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.bxs, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.C62523j.C62539l.C625401 */

                /* renamed from: a */
                final /* synthetic */ C62539l f141863a;

                static {
                    Covode.recordClassIndex(73336);
                }

                {
                    this.f141863a = r2;
                }

                /* renamed from: a */
                private static boolean m112983a() {
                    try {
                        return C34719f.C34720a.f82009a.mo61395c();
                    } catch (Exception unused) {
                        return false;
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f141863a.f141861a.getActivity();
                    if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132256h = m112983a();
                    }
                    if (!C58029j.f132256h) {
                        this.f141863a.f141861a.mo100495h();
                    }
                    this.f141863a.f141861a.mo100489b();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$k */
    static final class DialogInterface$OnCancelListenerC62538k implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141860a;

        static {
            Covode.recordClassIndex(73334);
        }

        DialogInterface$OnCancelListenerC62538k(C62523j jVar) {
            this.f141860a = jVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            LinearLayout linearLayout = this.f141860a.f141826j;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                C18129a.m33746a("homepage_ad", "otherclick", this.f141860a.f141835s).mo28900b("refer", "manage_page").mo28897a("enter_from", this.f141860a.f141834r).mo28897a("notification_choose_type", 2).mo28901b();
            }
            AbstractC63755f fVar = this.f141860a.f141836t;
            if (fVar != null) {
                fVar.mo96120b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$m */
    static final class DialogInterface$OnDismissListenerC62541m implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C62523j f141864a;

        static {
            Covode.recordClassIndex(73337);
        }

        DialogInterface$OnDismissListenerC62541m(C62523j jVar) {
            this.f141864a = jVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC63755f fVar = this.f141864a.f141836t;
            if (fVar != null) {
                fVar.mo96120b();
            }
            LinearLayout linearLayout = this.f141864a.f141826j;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                C18129a.m33746a("homepage_ad", "otherclick", this.f141864a.f141835s).mo28900b("refer", "manage_page").mo28897a("enter_from", this.f141864a.f141834r).mo28897a("notification_choose_type", 2).mo28901b();
            }
        }
    }

    /* renamed from: a */
    public final void mo100488a(int i) {
        String str;
        DialogC62515c cVar = this.f141818b;
        if (cVar != null) {
            cVar.show();
        }
        NotificationLiveViewModel j = m112962j();
        User user = this.f141830n;
        String str2 = "";
        if (user == null || (str = user.getSecUid()) == null) {
            str = str2;
        }
        j.mo100459a(new C62682v(i, str));
        AbstractC63755f fVar = this.f141836t;
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

    /* renamed from: b */
    public final void mo100490b(int i) {
        if (i == 1) {
            ImageView imageView = this.f141808C;
            if (imageView == null) {
                C89219l.m154710a("allLiveImage");
            }
            imageView.setImageResource(2131233413);
            ImageView imageView2 = this.f141809D;
            if (imageView2 == null) {
                C89219l.m154710a("recommendedLiveImage");
            }
            imageView2.setImageResource(2131233414);
            ImageView imageView3 = this.f141810E;
            if (imageView3 == null) {
                C89219l.m154710a("offLiveImage");
            }
            imageView3.setImageResource(2131233414);
        } else if (i == 2) {
            ImageView imageView4 = this.f141808C;
            if (imageView4 == null) {
                C89219l.m154710a("allLiveImage");
            }
            imageView4.setImageResource(2131233414);
            ImageView imageView5 = this.f141809D;
            if (imageView5 == null) {
                C89219l.m154710a("recommendedLiveImage");
            }
            imageView5.setImageResource(2131233413);
            ImageView imageView6 = this.f141810E;
            if (imageView6 == null) {
                C89219l.m154710a("offLiveImage");
            }
            imageView6.setImageResource(2131233414);
        } else if (i == 3) {
            ImageView imageView7 = this.f141808C;
            if (imageView7 == null) {
                C89219l.m154710a("allLiveImage");
            }
            imageView7.setImageResource(2131233414);
            ImageView imageView8 = this.f141809D;
            if (imageView8 == null) {
                C89219l.m154710a("recommendedLiveImage");
            }
            imageView8.setImageResource(2131233414);
            ImageView imageView9 = this.f141810E;
            if (imageView9 == null) {
                C89219l.m154710a("offLiveImage");
            }
            imageView9.setImageResource(2131233413);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$ab */
    static final class C62526ab extends AbstractC89220m implements AbstractC89183m<UserState, Bundle, UserState> {

        /* renamed from: a */
        final /* synthetic */ C62523j f141845a;

        static {
            Covode.recordClassIndex(73322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62526ab(C62523j jVar) {
            super(2);
            this.f141845a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ UserState invoke(UserState userState, Bundle bundle) {
            UserState userState2 = userState;
            C89219l.m154721d(userState2, "");
            User user = this.f141845a.f141830n;
            if (user == null) {
                user = new User();
            }
            return UserState.copy$default(userState2, user, false, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$z */
    static final class C62554z extends AbstractC89220m implements AbstractC89183m<ResponseState, Bundle, ResponseState> {

        /* renamed from: a */
        public static final C62554z f141877a = new C62554z();

        static {
            Covode.recordClassIndex(73350);
        }

        C62554z() {
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

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$y */
    static final class C62553y extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, UserState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62523j f141876a;

        static {
            Covode.recordClassIndex(73349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62553y(C62523j jVar) {
            super(2);
            this.f141876a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20477i r10, com.p2082ss.android.ugc.aweme.user.repository.UserState r11) {
            /*
            // Method dump skipped, instructions count: 206
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.C62523j.C62553y.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        String str2;
        UrlModel avatarVideoUri;
        List<String> urlList;
        UrlModel urlModel;
        boolean z;
        CommerceUserInfo commerceUserInfo;
        String c;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.dnb);
        C89219l.m154716b(findViewById, "");
        this.f141819c = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.b6q);
        C89219l.m154716b(findViewById2, "");
        this.f141820d = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.b6y);
        C89219l.m154716b(findViewById3, "");
        this.f141837u = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.b6m);
        Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView");
        MusAvatarWithBorderView musAvatarWithBorderView = (MusAvatarWithBorderView) findViewById4;
        this.f141821e = musAvatarWithBorderView;
        if (musAvatarWithBorderView == null) {
            C89219l.m154710a("followHeaderImage");
        }
        musAvatarWithBorderView.setBorderColor(R.color.j);
        MusAvatarWithBorderView musAvatarWithBorderView2 = this.f141821e;
        if (musAvatarWithBorderView2 == null) {
            C89219l.m154710a("followHeaderImage");
        }
        ((CircleImageView) musAvatarWithBorderView2).f81868f = true;
        MusAvatarWithBorderView musAvatarWithBorderView3 = this.f141821e;
        if (musAvatarWithBorderView3 == null) {
            C89219l.m154710a("followHeaderImage");
        }
        musAvatarWithBorderView3.setBorderWidth(0);
        View findViewById5 = view.findViewById(R.id.b6i);
        C89219l.m154716b(findViewById5, "");
        this.f141838v = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.b6k);
        C89219l.m154716b(findViewById6, "");
        this.f141822f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.b6g);
        C89219l.m154716b(findViewById7, "");
        this.f141823g = (TuxButton) findViewById7;
        View findViewById8 = view.findViewById(R.id.b6r);
        C89219l.m154716b(findViewById8, "");
        this.f141824h = findViewById8;
        View findViewById9 = view.findViewById(R.id.db1);
        C89219l.m154716b(findViewById9, "");
        this.f141825i = (ScrollView) findViewById9;
        View findViewById10 = view.findViewById(R.id.db5);
        C89219l.m154716b(findViewById10, "");
        this.f141839w = (TextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.dax);
        C89219l.m154716b(findViewById11, "");
        this.f141840x = (ConstraintLayout) findViewById11;
        View findViewById12 = view.findViewById(R.id.db7);
        C89219l.m154716b(findViewById12, "");
        this.f141841y = (TextView) findViewById12;
        View findViewById13 = view.findViewById(R.id.db4);
        C89219l.m154716b(findViewById13, "");
        this.f141842z = (ConstraintLayout) findViewById13;
        View findViewById14 = view.findViewById(R.id.db3);
        C89219l.m154716b(findViewById14, "");
        this.f141806A = (ConstraintLayout) findViewById14;
        View findViewById15 = view.findViewById(R.id.day);
        C89219l.m154716b(findViewById15, "");
        this.f141807B = (ImageView) findViewById15;
        View findViewById16 = view.findViewById(R.id.i9);
        C89219l.m154716b(findViewById16, "");
        this.f141808C = (ImageView) findViewById16;
        View findViewById17 = view.findViewById(R.id.dfv);
        C89219l.m154716b(findViewById17, "");
        this.f141809D = (ImageView) findViewById17;
        View findViewById18 = view.findViewById(R.id.cvv);
        C89219l.m154716b(findViewById18, "");
        this.f141810E = (ImageView) findViewById18;
        this.f141826j = (LinearLayout) view.findViewById(R.id.daw);
        this.f141827k = (CommonItemView) view.findViewById(R.id.db0);
        if (this.f141814I) {
            ConstraintLayout constraintLayout = this.f141820d;
            if (constraintLayout == null) {
                C89219l.m154710a("followLayout");
            }
            constraintLayout.setVisibility(0);
            ScrollView scrollView = this.f141825i;
            if (scrollView == null) {
                C89219l.m154710a("pushSettingLayout");
            }
            scrollView.setVisibility(4);
        } else {
            ConstraintLayout constraintLayout2 = this.f141820d;
            if (constraintLayout2 == null) {
                C89219l.m154710a("followLayout");
            }
            constraintLayout2.setVisibility(4);
            ScrollView scrollView2 = this.f141825i;
            if (scrollView2 == null) {
                C89219l.m154710a("pushSettingLayout");
            }
            scrollView2.setVisibility(0);
            mo100492e();
        }
        AbstractC63755f fVar = this.f141836t;
        if (!(fVar == null || (c = fVar.mo96121c()) == null || c.length() == 0)) {
            TextView textView = this.f141841y;
            if (textView == null) {
                C89219l.m154710a("pushSettingNoticeStr");
            }
            textView.setVisibility(0);
            TextView textView2 = this.f141841y;
            if (textView2 == null) {
                C89219l.m154710a("pushSettingNoticeStr");
            }
            textView2.setText(fVar.mo96121c());
        }
        ConstraintLayout constraintLayout3 = this.f141840x;
        if (constraintLayout3 == null) {
            C89219l.m154710a("pushSettingAllLive");
        }
        constraintLayout3.setOnClickListener(new View$OnClickListenerC62548t(this));
        ConstraintLayout constraintLayout4 = this.f141842z;
        if (constraintLayout4 == null) {
            C89219l.m154710a("pushSettingRecommendedLive");
        }
        constraintLayout4.setOnClickListener(new View$OnClickListenerC62549u(this));
        ConstraintLayout constraintLayout5 = this.f141806A;
        if (constraintLayout5 == null) {
            C89219l.m154710a("pushSettingOffLive");
        }
        constraintLayout5.setOnClickListener(new View$OnClickListenerC62550v(this));
        CommonItemView commonItemView = this.f141827k;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(new View$OnClickListenerC62551w(this));
        }
        CommonItemView commonItemView2 = this.f141827k;
        if (commonItemView2 != null) {
            User user = this.f141830n;
            if (user == null || (commerceUserInfo = user.getCommerceUserInfo()) == null || commerceUserInfo.getNotificationConfig() != 1) {
                z = false;
            } else {
                z = true;
            }
            commonItemView2.setChecked(z);
        }
        ImageView imageView = this.f141807B;
        if (imageView == null) {
            C89219l.m154710a("pushSettingClose");
        }
        imageView.setOnClickListener(new View$OnClickListenerC62552x(this));
        User user2 = this.f141830n;
        if (user2 != null) {
            i = user2.getLivePushNotificationStatus();
        } else {
            i = 1;
        }
        mo100490b(i);
        AbstractC63755f fVar2 = this.f141836t;
        if (fVar2 != null) {
            AbstractC63755f.C63756a a = fVar2.mo96118a();
            C39162r.m79460a("livesdk_live_notification_show", new C33744d().mo59983a("enter_from_merge", a.f144527c).mo59983a("enter_method", a.f144528d).mo59983a("room_id", a.f144525a).mo59983a("anchor_id", a.f144526b).mo59986a(a.f144529e).f79943a);
        }
        User user3 = this.f141830n;
        String str3 = null;
        if (user3 != null) {
            str = user3.getUniqueId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            User user4 = this.f141830n;
            if (user4 != null) {
                str2 = user4.getShortId();
            }
            str2 = null;
        } else {
            User user5 = this.f141830n;
            if (user5 != null) {
                str2 = user5.getUniqueId();
            }
            str2 = null;
        }
        TextView textView3 = this.f141837u;
        if (textView3 == null) {
            C89219l.m154710a("followTitle");
        }
        textView3.setText(str2);
        User user6 = this.f141830n;
        if (user6 == null || (avatarVideoUri = user6.getAvatarVideoUri()) == null || (urlList = avatarVideoUri.getUrlList()) == null || urlList.size() <= 0) {
            MusAvatarWithBorderView musAvatarWithBorderView4 = this.f141821e;
            if (musAvatarWithBorderView4 == null) {
                C89219l.m154710a("followHeaderImage");
            }
            C34577e.m70592a(musAvatarWithBorderView4, C80630u.m139797a(this.f141830n));
        } else {
            MusAvatarWithBorderView musAvatarWithBorderView5 = this.f141821e;
            if (musAvatarWithBorderView5 == null) {
                C89219l.m154710a("followHeaderImage");
            }
            User user7 = this.f141830n;
            if (user7 != null) {
                urlModel = user7.getAvatarVideoUri();
            } else {
                urlModel = null;
            }
            C34577e.m70597a((RemoteImageView) musAvatarWithBorderView5, urlModel, (AbstractC24203d<AbstractC24457f>) new C62542n(this), false);
        }
        ImageView imageView2 = this.f141838v;
        if (imageView2 == null) {
            C89219l.m154710a("followClose");
        }
        imageView2.setOnClickListener(new View$OnClickListenerC62543o(this));
        TextView textView4 = this.f141822f;
        if (textView4 == null) {
            C89219l.m154710a("followDoc");
        }
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            String string = context.getString(R.string.byv);
            C89219l.m154716b(string, "");
            str3 = C1764a.m5928a(string, Arrays.copyOf(new Object[]{str2}, 1));
            C89219l.m154716b(str3, "");
        }
        textView4.setText(str3);
        TuxButton tuxButton = this.f141823g;
        if (tuxButton == null) {
            C89219l.m154710a("followButton");
        }
        tuxButton.setOnClickListener(new View$OnClickListenerC62544p(this));
        ConstraintLayout constraintLayout6 = this.f141820d;
        if (constraintLayout6 == null) {
            C89219l.m154710a("followLayout");
        }
        constraintLayout6.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC62545q(this));
        AbstractC88412b unused = subscribe(m112963k(), new C20370ah(), new C62553y(this));
        AbstractC88412b unused2 = selectSubscribe(m112962j(), C62558n.f141881a, C62559o.f141882a, C62560p.f141883a, new C20370ah(), new C62547s(this));
        AbstractC12818f.C12819a.m23067a(this, mo100487a(), C62555k.f141878a, C62556l.f141879a, C62557m.f141880a, (C12854k) null, new C62546r(this), 24);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.amn, viewGroup, false);
        if (a == null) {
            C89219l.m154715b();
        }
        return a;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$r */
    static final class C62546r extends AbstractC89220m implements AbstractC89188r<AbstractC22876d, C62516d, AbstractC20362a<? extends Boolean>, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62523j f141869a;

        static {
            Covode.recordClassIndex(73342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62546r(C62523j jVar) {
            super(4);
            this.f141869a = jVar;
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
                DialogC62515c cVar = this.f141869a.f141818b;
                if (cVar != null) {
                    cVar.dismiss();
                }
                if (intValue == 0) {
                    CommonItemView commonItemView = this.f141869a.f141827k;
                    if (commonItemView != null) {
                        Boolean bool = (Boolean) aVar2.mo33695a();
                        if (bool != null) {
                            z2 = bool.booleanValue();
                        } else {
                            z2 = false;
                        }
                        commonItemView.setChecked(z2);
                    }
                    C62523j jVar = this.f141869a;
                    Boolean bool2 = (Boolean) aVar2.mo33695a();
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    } else {
                        z = true;
                    }
                    C18129a.m33746a("homepage_ad", "otherclick", jVar.f141835s).mo28900b("refer", "manage_page").mo28897a("enter_from", jVar.f141834r).mo28897a("notification_choose_type", Integer.valueOf(!z ? 1 : 0)).mo28901b();
                    new C79459a(C17867d.m33078a()).mo123050a(R.string.c2x).mo123053a();
                } else {
                    this.f141869a.mo100494g();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$s */
    static final class C62547s extends AbstractC89220m implements AbstractC89188r<AbstractC20477i, C62562r, Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62523j f141870a;

        static {
            Covode.recordClassIndex(73343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62547s(C62523j jVar) {
            super(4);
            this.f141870a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ p4600h.C89391z mo8774a(com.bytedance.jedi.arch.AbstractC20477i r5, com.p2082ss.android.ugc.aweme.notificationlive.C62562r r6, java.lang.Integer r7, java.lang.Integer r8) {
            /*
            // Method dump skipped, instructions count: 137
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.C62523j.C62547s.mo8774a(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
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

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
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
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C62523j(com.p2082ss.android.ugc.aweme.profile.model.User r12, com.p2082ss.android.ugc.aweme.notificationlive.C62577t.AbstractC62578a r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd r19, int r20) {
        /*
            r11 = this;
            r1 = r20
            r7 = r17
            r6 = r16
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0 = r1 & 1
            r9 = 0
            if (r0 == 0) goto L_0x0010
            r2 = r9
        L_0x0010:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0015
            r3 = r9
        L_0x0015:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001b
            r0 = 0
            r4 = 0
        L_0x001b:
            r0 = r1 & 8
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0022
            r5 = r8
        L_0x0022:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0027
            r6 = r8
        L_0x0027:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x002c
            r7 = r8
        L_0x002c:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x003d
        L_0x0030:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
        L_0x0034:
            r10 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x003a:
            r9 = r19
            goto L_0x0034
        L_0x003d:
            r8 = r18
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.C62523j.<init>(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.notificationlive.t$a, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.AwemeRawAd, int):void");
    }

    public C62523j(User user, C62577t.AbstractC62578a aVar, boolean z, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd, AbstractC63755f fVar) {
        DialogC62515c cVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f141830n = user;
        this.f141831o = aVar;
        this.f141814I = z;
        this.f141832p = str;
        this.f141833q = str2;
        this.f141815J = str3;
        this.f141834r = str4;
        this.f141835s = awemeRawAd;
        this.f141836t = fVar;
        this.f141817a = new C34499i();
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            cVar = new DialogC62515c(context);
        } else {
            cVar = null;
        }
        this.f141818b = cVar;
        C62554z zVar = C62554z.f141877a;
        AbstractC89277c a = C89204ab.m154669a(NotificationLiveViewModel.class);
        C62532g gVar = new C62532g(a);
        this.f141811F = new lifecycleAwareLazy(this, gVar, new C62533h(this, gVar, a, zVar));
        AbstractC89277c a2 = C89204ab.m154669a(NotificationGameViewModel.class);
        this.f141812G = new C12814b(a2, new C62524a(a2), C62528c.INSTANCE, new C62529d(this), new C62530e(this), C62531f.INSTANCE, C62527b.INSTANCE);
        C62526ab abVar = new C62526ab(this);
        AbstractC89277c a3 = C89204ab.m154669a(UserViewModel.class);
        C62535i iVar = new C62535i(a3);
        this.f141813H = new lifecycleAwareLazy(this, iVar, new C62536j(this, iVar, a3, abVar));
        this.f141828l = new DialogInterface$OnDismissListenerC62541m(this);
        this.f141829m = new DialogInterface$OnCancelListenerC62538k(this);
    }
}
