package com.p2082ss.android.ugc.aweme.notification.tutorial;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.C61569d;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel */
public final class TutorialVideoViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C1213t<TutorialVideoResp> f141268a = new C1213t<>();

    /* renamed from: b */
    public final AbstractC89244h f141269b = C89250i.m154773a((AbstractC89171a) C62241a.f141271a);

    /* renamed from: c */
    private WeakReference<Context> f141270c;

    /* renamed from: com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel$c */
    public static final class C62243c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C62243c f141273a = new C62243c();

        static {
            Covode.recordClassIndex(73014);
        }

        C62243c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(73011);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel$a */
    static final class C62241a extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C62241a f141271a = new C62241a();

        static {
            Covode.recordClassIndex(73012);
        }

        C62241a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<TutorialVideoResp> mo100240a() {
        AbstractC88979t<TutorialVideoResp> a = AbstractC88979t.m154294a(new C62244d(this));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    public final TutorialVideoResp mo100242b() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        try {
            AbstractC61571e eVar = (AbstractC61571e) C61569d.C61570a.m111506a(AbstractC61571e.class);
            str6 = eVar.mo60986a("");
            str5 = eVar.mo60988c("");
            str4 = eVar.mo60990e(m112593a(R.string.dd1));
            if (TextUtils.isEmpty(str4)) {
                str4 = m112593a(R.string.dd1);
            }
            str3 = eVar.mo60992g(m112593a(R.string.dd2));
            if (TextUtils.isEmpty(str3)) {
                str3 = m112593a(R.string.dd2);
            }
            str2 = eVar.mo60994i(m112593a(R.string.dd3));
            if (TextUtils.isEmpty(str2)) {
                str2 = m112593a(R.string.dd3);
            }
            str = eVar.mo60996k("");
        } catch (Exception unused) {
            str4 = m112593a(R.string.dd1);
            str3 = m112593a(R.string.dd1);
            str2 = m112593a(R.string.dd1);
            str6 = "";
            str5 = str6;
            str = str5;
        }
        if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str)) {
            return new TutorialVideoResp(null);
        }
        return new TutorialVideoResp(new TutorialVideoInfo(str6, str5, str4, str3, str2, str));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel$b */
    public static final class C62242b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ TutorialVideoViewModel f141272a;

        static {
            Covode.recordClassIndex(73013);
        }

        public C62242b(TutorialVideoViewModel tutorialVideoViewModel) {
            this.f141272a = tutorialVideoViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f141272a.f141268a.postValue(obj);
        }
    }

    /* renamed from: a */
    private final String m112593a(int i) {
        Context context;
        WeakReference<Context> weakReference = this.f141270c;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = C17867d.m33078a();
        }
        String string = context.getString(i);
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: a */
    public final C89391z mo100241a(Context context) {
        if (context == null) {
            return null;
        }
        this.f141270c = new WeakReference<>(context);
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel$d */
    public static final class C62244d<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ TutorialVideoViewModel f141274a;

        static {
            Covode.recordClassIndex(73015);
        }

        C62244d(TutorialVideoViewModel tutorialVideoViewModel) {
            this.f141274a = tutorialVideoViewModel;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<TutorialVideoResp> vVar) {
            C89219l.m154721d(vVar, "");
            TutorialVideoViewModel tutorialVideoViewModel = this.f141274a;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            Keva repo = Keva.getRepo("top_message_keva_repo");
            String string = repo.getString("msg_id_".concat(String.valueOf(curUserId)), "");
            long j = repo.getLong("first_show_time_".concat(String.valueOf(curUserId)), 0);
            long j2 = repo.getLong("current_show_time_".concat(String.valueOf(curUserId)), 0);
            int i = repo.getInt("clicked_".concat(String.valueOf(curUserId)), 0);
            C89219l.m154716b(string, "");
            TutorialVideoApiManager.C61614a.m111625a(string, j, j2, i).mo5532a(new C62245e(tutorialVideoViewModel, string, repo, curUserId, vVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel$e */
    static final class C62245e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TutorialVideoViewModel f141275a;

        /* renamed from: b */
        final /* synthetic */ String f141276b;

        /* renamed from: c */
        final /* synthetic */ Keva f141277c;

        /* renamed from: d */
        final /* synthetic */ String f141278d;

        /* renamed from: e */
        final /* synthetic */ AbstractC88982v f141279e;

        static {
            Covode.recordClassIndex(73016);
        }

        C62245e(TutorialVideoViewModel tutorialVideoViewModel, String str, Keva keva, String str2, AbstractC88982v vVar) {
            this.f141275a = tutorialVideoViewModel;
            this.f141276b = str;
            this.f141277c = keva;
            this.f141278d = str2;
            this.f141279e = vVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            TutorialVideoInfo info;
            C89219l.m154716b(iVar, "");
            if (iVar.mo5535a()) {
                TutorialVideoResp tutorialVideoResp = (TutorialVideoResp) iVar.mo5545d();
                if (!(tutorialVideoResp == null || (info = tutorialVideoResp.getInfo()) == null)) {
                    AbstractC61571e eVar = (AbstractC61571e) C61569d.C61570a.m111506a(AbstractC61571e.class);
                    if (!TextUtils.isEmpty(info.getMsgId())) {
                        if (eVar != null) {
                            eVar.mo60987b(info.getMsgId());
                        }
                        if (!TextUtils.equals(this.f141276b, info.getMsgId())) {
                            this.f141277c.storeString("msg_id_" + this.f141278d, info.getMsgId());
                            this.f141277c.storeLong("first_show_time_" + this.f141278d, System.currentTimeMillis());
                            this.f141277c.storeInt("clicked_" + this.f141278d, 0);
                        }
                        this.f141277c.storeLong("current_show_time_" + this.f141278d, System.currentTimeMillis());
                    }
                    if (eVar != null) {
                        eVar.mo60989d(info.getIcon());
                        eVar.mo60991f(info.getTitle());
                        eVar.mo60993h(info.getDesc());
                        eVar.mo60995j(info.getButton());
                        eVar.mo60997l(info.getDeepLink());
                    }
                }
                AbstractC88982v vVar = this.f141279e;
                if (vVar == null) {
                    return null;
                }
                C39077ac.m79342a(vVar, this.f141275a.mo100242b());
                return null;
            }
            AbstractC88982v vVar2 = this.f141279e;
            if (vVar2 == null) {
                return null;
            }
            Exception e = iVar.mo5546e();
            if (e == null) {
                e = new IllegalStateException("Unknown exception");
            }
            C39077ac.m79343a(vVar2, (Throwable) e);
            return null;
        }
    }
}
