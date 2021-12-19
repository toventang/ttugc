package com.p2082ss.android.ugc.aweme.notification;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34692l;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56386j;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notification.adapter.C61852k;
import com.p2082ss.android.ugc.aweme.notification.model.TranslationLikeListModel;
import com.p2082ss.android.ugc.aweme.notification.p3525f.C62003d;
import com.p2082ss.android.ugc.aweme.notification.utils.C62265i;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity */
public final class TranslationLikeListDetailActivity extends ActivityC17312a implements AbstractC39063h.AbstractC39067a, AbstractC39102c<User> {

    /* renamed from: c */
    public static final C61731a f140106c = new C61731a((byte) 0);

    /* renamed from: m */
    private static final int f140107m = ((int) C13628n.m24520b(C17867d.m33078a(), 8.0f));

    /* renamed from: a */
    final AbstractC89244h f140108a = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C61741j.f140128a, "last_read_time", Long.class);

    /* renamed from: b */
    final AbstractC89244h f140109b = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C61744m.f140131a, "subtitle_id", String.class);

    /* renamed from: d */
    private final AbstractC89244h f140110d = C89250i.m154774a(EnumC89331m.NONE, C61736e.f140123a);

    /* renamed from: e */
    private final AbstractC89244h f140111e = C89250i.m154774a(EnumC89331m.NONE, new C61743l(this));

    /* renamed from: f */
    private final AbstractC89244h f140112f = RouteArgExtension.INSTANCE.optionalArg(this, C61742k.f140129a, "nid", String.class);

    /* renamed from: g */
    private final AbstractC89244h f140113g = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C61737f.f140124a, "aweme_id", String.class);

    /* renamed from: h */
    private final AbstractC89244h f140114h = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C61739h.f140126a, "digg_type", Integer.class);

    /* renamed from: i */
    private final AbstractC89244h f140115i = RouteArgExtension.INSTANCE.optionalArg(this, C61738g.f140125a, "cover_url", String.class);

    /* renamed from: j */
    private final AbstractC89244h f140116j = RouteArgExtension.INSTANCE.optionalArg(this, C61745n.f140132a, "tab_name", String.class);

    /* renamed from: k */
    private final AbstractC89244h f140117k = RouteArgExtension.INSTANCE.optionalArg(this, C61740i.f140127a, "item_url", String.class);

    /* renamed from: l */
    private List<? extends User> f140118l;

    /* renamed from: n */
    private SparseArray f140119n;

    /* renamed from: d */
    private final C61852k m111763d() {
        return (C61852k) this.f140110d.getValue();
    }

    /* renamed from: h */
    private final C62003d m111764h() {
        return (C62003d) this.f140111e.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f140119n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f140119n == null) {
            this.f140119n = new SparseArray();
        }
        View view = (View) this.f140119n.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f140119n.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final String mo99859a() {
        return (String) this.f140113g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<User> list, boolean z) {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$a */
    public static final class C61731a {
        static {
            Covode.recordClassIndex(72463);
        }

        private C61731a() {
        }

        public /* synthetic */ C61731a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$e */
    static final class C61736e extends AbstractC89220m implements AbstractC89171a<C61852k> {

        /* renamed from: a */
        public static final C61736e f140123a = new C61736e();

        static {
            Covode.recordClassIndex(72468);
        }

        C61736e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61852k invoke() {
            return new C61852k((byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        m111763d().ao_();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$p */
    static final /* synthetic */ class C61748p extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(72480);
        }

        C61748p(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            super(0, translationLikeListDetailActivity, TranslationLikeListDetailActivity.class, "doRefresh", "doRefresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((TranslationLikeListDetailActivity) this.receiver).mo99861c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: i */
    private static boolean m111765i() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    private final void m111767k() {
        m111763d().ap_();
        m111763d().mo67829d(false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        m111764h().ck_();
    }

    static {
        Covode.recordClassIndex(72462);
    }

    /* renamed from: j */
    private static boolean m111766j() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean i = m111765i();
        C58029j.f132253e = i;
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).mo37867a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        C62003d h = m111764h();
        TranslationLikeListModel translationLikeListModel = (TranslationLikeListModel) h.f92286h;
        if (translationLikeListModel != null) {
            translationLikeListModel.loadMore();
        }
        h.mo57527b();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$d */
    static final class C61735d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TranslationLikeListDetailActivity f140122a;

        static {
            Covode.recordClassIndex(72467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61735d(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            super(0);
            this.f140122a = translationLikeListDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://aweme/detail/" + this.f140122a.mo99859a()).mo63248a("refer", "message").mo63249a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$l */
    static final class C61743l extends AbstractC89220m implements AbstractC89171a<C62003d> {

        /* renamed from: a */
        final /* synthetic */ TranslationLikeListDetailActivity f140130a;

        static {
            Covode.recordClassIndex(72475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61743l(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            super(0);
            this.f140130a = translationLikeListDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62003d invoke() {
            C62003d dVar = new C62003d();
            dVar.mo67838a(new TranslationLikeListModel((String) this.f140130a.f140109b.getValue(), this.f140130a.mo99859a(), ((Number) this.f140130a.f140108a.getValue()).longValue()));
            dVar.mo67839a_(this.f140130a);
            return dVar;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: c */
    public final void mo99861c() {
        if (m111766j()) {
            if (m111763d().getItemCount() == 0) {
                TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).mo37867a();
            }
            m111764h().mo100056e();
            C56386j.m102359a();
            return;
        }
        if (m111763d().getItemCount() == 0) {
            C1731i.m5631a(100).mo5534a(new C61733c(this), C1731i.f5564c, null);
        }
        C56386j.f128613a = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        if (m111763d().f92274v) {
            m111763d().mo67829d(false);
            m111763d().notifyDataSetChanged();
            m111767k();
        }
        if (m111763d().getItemCount() == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
            String string = getString(R.string.cej);
            C89219l.m154716b(string, "");
            TuxStatusView.C23263c a = cVar.mo37879a(string);
            String string2 = getString(R.string.cei);
            C89219l.m154716b(string2, "");
            ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).setStatus(a.mo37878a((CharSequence) string2));
        }
        C56386j.m102360a(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$f */
    static final class C61737f extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61737f f140124a = new C61737f();

        static {
            Covode.recordClassIndex(72469);
        }

        C61737f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$g */
    static final class C61738g extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61738g f140125a = new C61738g();

        static {
            Covode.recordClassIndex(72470);
        }

        C61738g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$i */
    static final class C61740i extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61740i f140127a = new C61740i();

        static {
            Covode.recordClassIndex(72472);
        }

        C61740i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$k */
    static final class C61742k extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61742k f140129a = new C61742k();

        static {
            Covode.recordClassIndex(72474);
        }

        C61742k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$m */
    static final class C61744m extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61744m f140131a = new C61744m();

        static {
            Covode.recordClassIndex(72476);
        }

        C61744m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$n */
    static final class C61745n extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61745n f140132a = new C61745n();

        static {
            Covode.recordClassIndex(72477);
        }

        C61745n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        m111763d().mo67824j();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$b */
    static final class View$OnClickListenerC61732b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslationLikeListDetailActivity f140120a;

        static {
            Covode.recordClassIndex(72464);
        }

        View$OnClickListenerC61732b(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            this.f140120a = translationLikeListDetailActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140120a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$h */
    static final class C61739h extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C61739h f140126a = new C61739h();

        static {
            Covode.recordClassIndex(72471);
        }

        C61739h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 9;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$j */
    static final class C61741j extends AbstractC89220m implements AbstractC89172b<Boolean, Long> {

        /* renamed from: a */
        public static final C61741j f140128a = new C61741j();

        static {
            Covode.recordClassIndex(72473);
        }

        C61741j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Long invoke(Boolean bool) {
            bool.booleanValue();
            return 0L;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$o */
    static final class C61746o extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C61746o f140133a = new C61746o();

        static {
            Covode.recordClassIndex(72478);
        }

        C61746o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C617471.f140134a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity$c */
    public static final class C61733c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TranslationLikeListDetailActivity f140121a;

        static {
            Covode.recordClassIndex(72465);
        }

        C61733c(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            this.f140121a = translationLikeListDetailActivity;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (!this.f140121a.isDestroyed()) {
                TuxStatusView tuxStatusView = (TuxStatusView) this.f140121a._$_findCachedViewById(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) this.f140121a._$_findCachedViewById(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this.f140121a) {
                    /* class com.p2082ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity.C61733c.C617341 */

                    static {
                        Covode.recordClassIndex(72466);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        ((TranslationLikeListDetailActivity) this.receiver).mo99861c();
                        return C89391z.f203057a;
                    }
                }));
                new C23144b(this.f140121a).mo37640e(R.string.dcq).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        if (m111763d().f92274v) {
            m111763d().mo67829d(false);
            m111763d().notifyDataSetChanged();
        }
        if (m111763d().getItemCount() == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C61748p(this)));
        }
        C56386j.m102360a(0);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onCreate", true);
        activityConfiguration(C61746o.f140133a);
        super.onCreate(bundle);
        C56386j.m102362a(C56386j.EnumC56387a.DETAIL_TYPE_TRANSLATION_LIKE_LIST, ((Number) this.f140114h.getValue()).intValue(), (String) this.f140112f.getValue());
        setContentView(R.layout.k1);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cv1);
        C89219l.m154716b(recyclerView, "");
        RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC1391ab) itemAnimator).f4621m = false;
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.cv1);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.cv1)).mo4415b(new C34692l((int) C13628n.m24520b(this, 1.0f), 0));
        ((RecyclerView) _$_findCachedViewById(R.id.cv1)).mo4405a(new C51425a(this));
        ((AutoRTLImageView) _$_findCachedViewById(R.id.pi)).setOnClickListener(new View$OnClickListenerC61732b(this));
        String a = mo99859a();
        if (!(a == null || a.length() == 0)) {
            m111763d().f140420b = (String) this.f140115i.getValue();
            C61852k d = m111763d();
            C61735d dVar = new C61735d(this);
            C89219l.m154721d(dVar, "");
            d.f140422d = dVar;
        }
        m111763d().mo67813a((AbstractC39063h.AbstractC39067a) this);
        m111763d().mo67829d(true);
        m111763d().ap_();
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.cv1);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setAdapter(m111763d());
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).mo37867a();
        mo99861c();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onCreate", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<User> list, boolean z) {
        int i;
        ArrayList arrayList;
        m111763d().mo67829d(true);
        if (!z) {
            m111767k();
        } else {
            m111763d().aq_();
        }
        int i2 = 0;
        if (m111764h().mo100055d() == 0) {
            i = f140107m;
        } else {
            i = 0;
        }
        ((FrameLayout) _$_findCachedViewById(R.id.cuo)).setPadding(0, i, 0, 0);
        m111763d().f140423e = m111764h().mo100055d();
        C61852k d = m111763d();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
            arrayList = arrayList2;
        } else {
            arrayList = C89086z.INSTANCE;
        }
        d.mo62377b_(arrayList);
        this.f140118l = list;
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(8);
        if (list != null) {
            i2 = list.size();
        }
        C56386j.m102360a(i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<User> list, boolean z) {
        Object obj;
        if (list == null || list.isEmpty() || !z) {
            m111767k();
        } else {
            m111763d().aq_();
        }
        m111763d().f140423e = m111764h().mo100055d();
        C61852k d = m111763d();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t != null) {
                    arrayList.add(t);
                }
            }
            obj = C89070n.m154585g((Collection) arrayList);
        } else {
            obj = new ArrayList();
        }
        d.mo63366c((List) obj);
        this.f140118l = list;
    }

    /* renamed from: a */
    public final void mo99860a(int i, String str, User user) {
        String str2;
        C33744d a = new C33744d().mo59983a("action_type", str).mo59983a("enter_from", "notification_page").mo59983a("account_type", "like_translation").mo59980a("client_order", i).mo59983a("tab_name", (String) this.f140116j.getValue());
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        C39162r.m79460a("notification_message_folded_message", a.mo59983a("from_user_id", str2).mo59983a("button_type", C62265i.m112641a(this, user)).mo59983a("group_id", mo99859a()).f79943a);
    }
}
