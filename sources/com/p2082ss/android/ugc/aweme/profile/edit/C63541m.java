package com.p2082ss.android.ugc.aweme.profile.edit;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.awemelobby.C12909b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.p1971b.p1972a.p1975b.p1976a.p1977a.C27124a;
import com.google.p1971b.p1972a.p1978c.p1979a.p1980a.C27127b;
import com.google.p1971b.p1972a.p1983d.AbstractC27148h;
import com.google.p1971b.p1972a.p1986e.p1987a.C27151a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import net.openid.appauth.C89986f;
import net.openid.appauth.C89990h;
import net.openid.appauth.C89993i;
import p077b.AbstractC1729g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.m */
public final class C63541m implements WeakHandler.IHandler, AbstractC25357i.AbstractC25360c {

    /* renamed from: j */
    public static final boolean f144210j = false;

    /* renamed from: k */
    public static final C63542a f144211k = new C63542a((byte) 0);

    /* renamed from: a */
    public String f144212a = "";

    /* renamed from: b */
    public String f144213b = "";

    /* renamed from: c */
    public WeakHandler f144214c = new WeakHandler(this);

    /* renamed from: d */
    public C27127b f144215d;

    /* renamed from: e */
    public final AbstractC27148h f144216e = C27124a.m53885a();

    /* renamed from: f */
    public final C27151a f144217f = new C27151a();

    /* renamed from: g */
    public final AbstractC89244h f144218g = C89250i.m154773a((AbstractC89171a) new C63544c(this));

    /* renamed from: h */
    public final ActivityC0945e f144219h;

    /* renamed from: i */
    public final AbstractC63526d f144220i;

    @Override // com.google.android.gms.common.api.internal.AbstractC25462m
    /* renamed from: a */
    public final void mo41581a(ConnectionResult connectionResult) {
        C89219l.m154721d(connectionResult, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.m$a */
    public static final class C63542a {
        static {
            Covode.recordClassIndex(74857);
        }

        private C63542a() {
        }

        public /* synthetic */ C63542a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(74856);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.m$b */
    public static final class RunnableC63543b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C63541m f144221a;

        static {
            Covode.recordClassIndex(74858);
        }

        public RunnableC63543b(C63541m mVar) {
            this.f144221a = mVar;
        }

        public final void run() {
            try {
                C89986f.C89987a aVar = new C89986f.C89987a(new C89993i(Uri.parse("https://accounts.google.com/o/oauth2/v2/auth"), Uri.parse("https://www.googleapis.com/oauth2/v4/token")), this.f144221a.f144213b, "code", Uri.parse(this.f144221a.f144212a));
                aVar.mo144644a(Arrays.asList("https://www.googleapis.com/auth/youtube.readonly"));
                C89986f a = aVar.mo144646a();
                C89219l.m154716b(a, "");
                this.f144221a.f144219h.startActivityForResult(new C89990h(this.f144221a.f144219h).mo144658a(a), 1001);
            } catch (Exception e) {
                C63541m.m115144a(this.f144221a, e, (String) null, "before_goto_URL", (YoutubeApi.C63518a) null, 10);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.m$c */
    static final class C63544c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C63541m f144222a;

        static {
            Covode.recordClassIndex(74859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63544c(C63541m mVar) {
            super(0);
            this.f144222a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            ActivityC0945e eVar = this.f144222a.f144219h;
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(eVar);
            if (isGooglePlayServicesAvailable == 0) {
                z = true;
                C63541m mVar = this.f144222a;
                C89219l.m154716b("1096011445005-qqsj3hcu9s53dv6pbdrl6vs8ls649v01.apps.googleusercontent.com", "");
                mVar.f144213b = "1096011445005-qqsj3hcu9s53dv6pbdrl6vs8ls649v01.apps.googleusercontent.com";
                C63541m mVar2 = this.f144222a;
                C89219l.m154716b("com.googleusercontent.apps.1096011445005-qqsj3hcu9s53dv6pbdrl6vs8ls649v01:/oauthredirect", "");
                mVar2.f144212a = "com.googleusercontent.apps.1096011445005-qqsj3hcu9s53dv6pbdrl6vs8ls649v01:/oauthredirect";
                this.f144222a.f144215d = new C27127b.C27128a().mo45162a(this.f144222a.f144216e).mo45163a(this.f144222a.f144217f).mo45171b(this.f144222a.f144213b).mo45168a();
            } else {
                Dialog errorDialog = instance.getErrorDialog(eVar, isGooglePlayServicesAvailable, 9000, new C12909b.DialogInterface$OnCancelListenerC12911b(eVar));
                if (errorDialog != null) {
                    errorDialog.setOnDismissListener(new C12909b.DialogInterface$OnDismissListenerC12910a(eVar, instance, isGooglePlayServicesAvailable));
                    C80273bt.m139145a(errorDialog);
                    C51423a.m95790a((Throwable) new IllegalStateException(instance.getErrorString(isGooglePlayServicesAvailable)));
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.m$d */
    public static final class CallableC63545d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C63541m f144223a;

        /* renamed from: b */
        final /* synthetic */ Intent f144224b;

        static {
            Covode.recordClassIndex(74860);
        }

        public CallableC63545d(C63541m mVar, Intent intent) {
            this.f144223a = mVar;
            this.f144224b = intent;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x004f */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [net.openid.appauth.e] */
        /* JADX WARN: Type inference failed for: r4v0, types: [com.ss.android.ugc.aweme.profile.edit.m] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Exception] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.edit.C63541m.CallableC63545d.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.m$f */
    public static final class RunnableC63549f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C63541m f144229a;

        static {
            Covode.recordClassIndex(74864);
        }

        public RunnableC63549f(C63541m mVar) {
            this.f144229a = mVar;
        }

        public final void run() {
            if (YoutubeApi.m115113a()) {
                C31575b.m65865g().queryUser(this.f144229a.f144214c);
                this.f144229a.f144220i.mo102186e(null);
                C39162r.m79460a("social_account_unbind_success", new C33744d().mo59983a("platform", "youtube").f79943a);
                return;
            }
            this.f144229a.f144220i.mo102187f(this.f144229a.f144219h.getString(R.string.h1d));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.m$e */
    public static final class C63548e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C63541m f144228a;

        static {
            Covode.recordClassIndex(74863);
        }

        public C63548e(C63541m mVar) {
            this.f144228a = mVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            if (((java.lang.Boolean) r9.mo5545d()).booleanValue() == false) goto L_0x0017;
         */
        @Override // p077b.AbstractC1729g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p077b.C1731i r9) {
            /*
                r8 = this;
                boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80214ai.m139043a(r9)
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0017
                p4600h.p4611f.p4613b.C89219l.m154716b(r9, r1)
                java.lang.Object r0 = r9.mo5545d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x002e
            L_0x0017:
                com.ss.android.ugc.aweme.profile.edit.m r2 = r8.f144228a
                java.lang.Exception r3 = new java.lang.Exception
                p4600h.p4611f.p4613b.C89219l.m154716b(r9, r1)
                java.lang.Exception r0 = r9.mo5546e()
                r3.<init>(r0)
                r4 = 0
                r6 = 0
                r7 = 10
                java.lang.String r5 = "send_token_to_sever"
                com.p2082ss.android.ugc.aweme.profile.edit.C63541m.m115144a(r2, r3, r4, r5, r6, r7)
            L_0x002e:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.edit.C63541m.C63548e.then(b.i):java.lang.Object");
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        if (message != null && !(message.obj instanceof Exception) && message.obj != null) {
            if (message.obj instanceof UserResponse) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                user = ((UserResponse) obj).getUser();
            } else {
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                user = (User) obj2;
            }
            if (message.what == 112 && user != null) {
                C31575b.m65865g().updateCurUser(user);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                AbstractC81915c.m141874a(new C34572c(g.getCurUser()));
            }
        }
    }

    public C63541m(ActivityC0945e eVar, AbstractC63526d dVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        this.f144219h = eVar;
        this.f144220i = dVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m115144a(C63541m mVar, Exception exc, String str, String str2, YoutubeApi.C63518a aVar, int i) {
        String str3 = str;
        Exception exc2 = exc;
        YoutubeApi.C63518a aVar2 = null;
        if ((i & 1) != 0) {
            exc2 = null;
        }
        String str4 = "";
        if ((i & 2) != 0) {
            str3 = str4;
        }
        if ((i & 4) == 0) {
            str4 = str2;
        }
        if ((i & 8) == 0) {
            aVar2 = aVar;
        }
        mVar.mo102200a(false, (Integer) null, str3, exc2, aVar2, str4);
    }

    /* renamed from: a */
    public final void mo102200a(boolean z, Integer num, String str, Exception exc, YoutubeApi.C63518a aVar, String str2) {
        C39162r.m79460a("social_account_bind_failure", new C33744d().mo59983a("platform", "youtube").mo59983a("error_desc", YoutubeApi.m115112a(this.f144219h, exc, num, aVar)).mo59983a("error_code", str2).f79943a);
        if (z) {
            this.f144220i.mo102186e(null);
        } else {
            this.f144220i.mo102187f(str);
        }
    }
}
