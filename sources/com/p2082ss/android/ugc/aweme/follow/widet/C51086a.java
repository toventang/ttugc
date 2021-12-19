package com.p2082ss.android.ugc.aweme.follow.widet;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.C23035c;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.follow.widet.a */
public class C51086a implements AbstractC1214u<FollowStatus> {

    /* renamed from: a */
    public ActivityC0945e f117875a;

    /* renamed from: b */
    AbstractC51093f f117876b;

    /* renamed from: c */
    public AbstractC51089b f117877c;

    /* renamed from: d */
    public AbstractC51091d f117878d;

    /* renamed from: e */
    public AbstractC51090c f117879e;

    /* renamed from: f */
    public AbstractC51092e f117880f;

    /* renamed from: g */
    public AbstractC51088a f117881g;

    /* renamed from: h */
    public boolean f117882h;

    /* renamed from: i */
    public boolean f117883i;

    /* renamed from: j */
    private AbstractC51346a f117884j;

    /* renamed from: k */
    private User f117885k;

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$a */
    public interface AbstractC51088a {
        static {
            Covode.recordClassIndex(60285);
        }

        /* renamed from: a */
        void mo70870a();

        /* renamed from: b */
        void mo70871b();

        /* renamed from: c */
        void mo70872c();
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$b */
    public interface AbstractC51089b {
        static {
            Covode.recordClassIndex(60286);
        }

        /* renamed from: a */
        void mo70873a(FollowStatus followStatus);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$c */
    public interface AbstractC51090c {
        static {
            Covode.recordClassIndex(60287);
        }

        /* renamed from: a */
        boolean mo63341a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$d */
    public interface AbstractC51091d {
        static {
            Covode.recordClassIndex(60288);
        }

        /* renamed from: a */
        void mo63342a();

        /* renamed from: a */
        void mo63343a(FollowStatus followStatus);

        /* renamed from: b */
        void mo63344b();
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$e */
    public interface AbstractC51092e {
        static {
            Covode.recordClassIndex(60289);
        }

        /* renamed from: a */
        void mo63345a(FollowStatus followStatus);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$f */
    public interface AbstractC51093f {
        static {
            Covode.recordClassIndex(60290);
        }

        /* renamed from: a */
        void mo63346a(int i, User user);

        String getEnterFrom();

        String getEnterMethod();

        int getFollowFromType();
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$g */
    public static class C51094g implements AbstractC51093f {
        static {
            Covode.recordClassIndex(60291);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public void mo63346a(int i, User user) {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        public String getEnterFrom() {
            return "";
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        public String getEnterMethod() {
            return "";
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        public int getFollowFromType() {
            return 0;
        }
    }

    static {
        Covode.recordClassIndex(60283);
    }

    /* renamed from: a */
    public static boolean m95513a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo86511c(User user) {
        int i;
        boolean z;
        if (user.getFollowStatus() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        AbstractC51093f fVar = this.f117876b;
        if (fVar != null) {
            fVar.mo63346a(i, user);
        }
        if (user.isSecret() || user.isPrivateAccount()) {
            z = true;
        } else {
            z = false;
        }
        mo86509a(user.getUid(), user.getSecUid(), i, user.getFollowerStatus(), z);
    }

    /* renamed from: a */
    private static void m95512a(Activity activity) {
        C33594aj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = privacyAccountFollowCount.mo59941c().intValue();
        if (intValue == 0) {
            new C17197a.C17200a(activity).mo27194b(R.string.esu).mo27190a(R.string.cbc, (DialogInterface.OnClickListener) null, false).mo27193a().mo27184b();
        } else if (intValue > 0 && intValue < 4) {
            new C23144b(activity).mo37640e(R.string.esv).mo37637b();
        }
        privacyAccountFollowCount.mo59940b(Integer.valueOf(intValue + 1));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (followStatus2 != null && TextUtils.equals(followStatus2.userId, this.f117885k.getUid())) {
            this.f117885k.setFollowStatus(followStatus2.followStatus);
            AbstractC51089b bVar = this.f117877c;
            if (bVar != null) {
                bVar.mo70873a(followStatus2);
            }
            AbstractC51091d dVar = this.f117878d;
            if (dVar != null) {
                dVar.mo63343a(followStatus2);
            }
            AbstractC51346a aVar = this.f117884j;
            int i = followStatus2.followStatus;
            int i2 = 1;
            if (this.f117885k.getFollowerStatus() != 1) {
                i2 = 0;
            }
            aVar.mo86406a(i, i2, this.f117885k.getUid());
        }
    }

    /* renamed from: a */
    public final void mo86508a(User user) {
        if (this.f117885k != null) {
            UserService.m138861d().mo123566b().removeObserver(this);
        }
        this.f117885k = user;
        int followStatus = user.getFollowStatus();
        int i = 0;
        if (TextUtils.equals(user.getUid(), C31575b.m65865g().getCurUserId())) {
            AbstractC51346a aVar = this.f117884j;
            if (this.f117885k.getFollowerStatus() == 1) {
                i = 1;
            }
            aVar.mo73175a(3, i);
            return;
        }
        AbstractC51346a aVar2 = this.f117884j;
        if (this.f117885k.getFollowerStatus() == 1) {
            i = 1;
        }
        aVar2.mo86406a(followStatus, i, this.f117885k.getUid());
        UserService.m138861d().mo123566b().observe(this.f117884j.getLifeCycleOwner(), this);
        this.f117884j.setOnClickListener(new View$OnClickListenerC51095b(this, user));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo86510b(User user) {
        int i;
        if (user.getFollowStatus() != 0) {
            i = 0;
        } else if (user.isSecret()) {
            i = 4;
        } else if (user.getFollowerStatus() == 1) {
            i = 2;
        } else {
            i = 1;
        }
        if (user.getFollowStatus() == 2 && !user.isEnableDirectMessage() && this.f117881g != null) {
            C23025b bVar = new C23025b(this.f117875a);
            bVar.mo37416a(R.string.h4x, new C51096c(this, user, i));
            bVar.mo37418b(R.string.bz7, new C51097d(this, user));
            ((C23023b) C23035c.m43448a(this.f117875a).mo37482a(false).mo37483b(R.string.h0e)).mo37407a(bVar).mo37405a().mo37396b().show();
            AbstractC51088a aVar = this.f117881g;
            user.getFollowStatus();
            aVar.mo70870a();
        } else if (user.getFollowStatus() == 0 && user.getBlockStatus() == 1 && this.f117882h) {
            C23025b bVar2 = new C23025b(this.f117875a);
            bVar2.mo37416a(R.string.as0, new C51098e(this, i, user));
            bVar2.mo37418b(R.string.bz7, (AbstractC89172b<? super C23024a, C89391z>) null);
            ((C23023b) C23035c.m43448a(this.f117875a).mo37482a(false).mo37483b(R.string.h0x)).mo37407a(bVar2).mo37405a().mo37396b().show();
        } else if (user.getFollowStatus() != 4 || this.f117881g == null) {
            if (i == 4) {
                m95512a(this.f117875a);
            }
            mo86511c(user);
        } else if (!this.f117883i) {
            C23025b bVar3 = new C23025b(this.f117875a);
            bVar3.mo37416a(R.string.bz6, new C51099f(this, user, i));
            bVar3.mo37418b(R.string.fgv, new C51100g(this, user));
            ((C23023b) C23035c.m43448a(this.f117875a).mo37482a(false).mo37483b(R.string.bz8)).mo37407a(bVar3).mo37405a().mo37396b().show();
            AbstractC51088a aVar2 = this.f117881g;
            user.getFollowStatus();
            aVar2.mo70870a();
            this.f117883i = true;
        }
    }

    public C51086a(AbstractC51346a aVar, AbstractC51093f fVar) {
        this.f117884j = aVar;
        this.f117875a = (ActivityC0945e) C34729o.m70950a(aVar.getContext());
        this.f117876b = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo86507a(int i, User user) {
        if (i == 4) {
            m95512a(this.f117875a);
        }
        mo86511c(user);
        return C89391z.f203057a;
    }

    /* renamed from: a */
    public final void mo86509a(String str, String str2, int i, int i2, boolean z) {
        String enterFrom;
        int followFromType;
        final AbstractC51754w i3 = C51648a.f118980a.mo87329i();
        i3.mo87468a(new AbstractC63854r() {
            /* class com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C510871 */

            static {
                Covode.recordClassIndex(60284);
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
            /* renamed from: b */
            public final void mo71320b(FollowStatus followStatus) {
                C51086a.this.f117883i = false;
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
            /* renamed from: c */
            public final void mo71321c(FollowStatus followStatus) {
                if (C51086a.this.f117880f != null) {
                    C51086a.this.f117880f.mo63345a(followStatus);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
            /* renamed from: d_ */
            public final void mo71322d_(Exception exc) {
                C51086a.this.f117883i = false;
                CaptchaHelperServiceImpl.m72448a();
                C39143l.m79438a(C34729o.m70950a((Context) C51086a.this.f117875a), C33615a.m68844a(exc));
                if (C51086a.this.f117878d != null) {
                    C51086a.this.f117878d.mo63344b();
                }
            }
        });
        C63847n.C63848a a = new C63847n.C63848a().mo103320a(str).mo103325b(str2).mo103322a(z).mo103318a(i);
        AbstractC51093f fVar = this.f117876b;
        if (fVar == null) {
            enterFrom = "";
        } else {
            enterFrom = fVar.getEnterFrom();
        }
        C63847n.C63848a c = a.mo103327c(enterFrom);
        AbstractC51093f fVar2 = this.f117876b;
        if (fVar2 == null) {
            followFromType = 0;
        } else {
            followFromType = fVar2.getFollowFromType();
        }
        i3.mo87469a(c.mo103324b(followFromType).mo103328d(i2).mo103323a());
        this.f117884j.getLifeCycleOwner().getLifecycle().mo4012a(new FollowUserBlock$2(this, i3));
    }
}
