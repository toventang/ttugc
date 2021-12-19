package com.p2082ss.android.ugc.aweme.recommend;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58243m;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask */
public final class RecommendUserDialogTask implements AbstractC58264w {

    /* renamed from: b */
    public static volatile AtomicBoolean f149735b = new AtomicBoolean(false);

    /* renamed from: c */
    public static volatile RecommendUserDialogList f149736c;

    /* renamed from: d */
    public static final C66608a f149737d = new C66608a((byte) 0);

    /* renamed from: a */
    int f149738a;

    /* renamed from: e */
    private AbstractC88412b f149739e;

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$a */
    public static final class C66608a {
        static {
            Covode.recordClassIndex(78163);
        }

        private C66608a() {
        }

        public /* synthetic */ C66608a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$d */
    public static final class C66611d implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ RecommendUserDialogTask f149742a;

        static {
            Covode.recordClassIndex(78166);
        }

        C66611d(RecommendUserDialogTask recommendUserDialogTask) {
            this.f149742a = recommendUserDialogTask;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            RecommendUserDialogTask.m118357a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(78162);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        int a = C89271h.m154763a(new C89269g(0, 1), AbstractC89255c.Default);
        String.valueOf(a);
        if (!((Boolean) C58243m.f132665m.getValue()).booleanValue() || a != 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo105603c() {
        AbstractC51500a a = C66652b.f149825a.mo105653a();
        C61504e eVar = C61504e.C61505a.f139616a;
        C89219l.m154716b(eVar, "");
        this.f149739e = a.mo87016a((Integer) 30, (Integer) 0, eVar.mo99159a()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143256a(new C66609b(this), new C66610c(this), new C66611d(this), new C66612e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$e */
    public static final class C66612e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ RecommendUserDialogTask f149743a;

        static {
            Covode.recordClassIndex(78167);
        }

        C66612e(RecommendUserDialogTask recommendUserDialogTask) {
            this.f149743a = recommendUserDialogTask;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            RecommendUserDialogTask.m118357a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$c */
    public static final class C66610c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ RecommendUserDialogTask f149741a;

        static {
            Covode.recordClassIndex(78165);
        }

        C66610c(RecommendUserDialogTask recommendUserDialogTask) {
            this.f149741a = recommendUserDialogTask;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            RecommendUserDialogTask recommendUserDialogTask = this.f149741a;
            if (recommendUserDialogTask.f149738a < 0) {
                recommendUserDialogTask.f149738a++;
                recommendUserDialogTask.mo105603c();
                return;
            }
            RecommendUserDialogTask.m118358b(false);
            RecommendUserDialogTask.m118357a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$b */
    public static final class C66609b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ RecommendUserDialogTask f149740a;

        static {
            Covode.recordClassIndex(78164);
        }

        C66609b(RecommendUserDialogTask recommendUserDialogTask) {
            this.f149740a = recommendUserDialogTask;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            User user;
            RecommendUserDialogList recommendUserDialogList = (RecommendUserDialogList) obj;
            List<User> recommendUsers = recommendUserDialogList.getRecommendUsers();
            if (!(recommendUsers == null || (user = (User) C89070n.m154583g((List) recommendUsers)) == null)) {
                user.getNickname();
            }
            RecommendUserDialogTask.m118358b(true);
            List<User> recommendUsers2 = recommendUserDialogList.getRecommendUsers();
            if (recommendUsers2 != null && !recommendUsers2.isEmpty()) {
                RecommendUserDialogTask.f149736c = recommendUserDialogList;
            }
        }
    }

    /* renamed from: a */
    public static void m118357a(boolean z) {
        f149735b.set(z);
        if (z) {
            Activity j = C17873f.m33102j();
            if (C66639l.f149799a != null) {
                C66640m mVar = C66639l.f149799a;
                if (mVar == null) {
                    C89219l.m154715b();
                }
                C66639l.m118407a(mVar);
            } else {
                if (!(j instanceof ActivityC0945e)) {
                    j = null;
                }
                C66639l.m118406a((ActivityC0945e) j, false);
            }
            C66639l.f149799a = null;
        }
    }

    /* renamed from: b */
    public static void m118358b(boolean z) {
        Activity j = C17873f.m33102j();
        f149735b.get();
        if (!(j instanceof ActivityC0945e)) {
            j = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) j;
        if (eVar != null) {
            ((RecommendUsersDialogViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(RecommendUsersDialogViewModel.class)).f149745a.postValue(Boolean.valueOf(z));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (!C80580in.m139687c()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                if (!C66642o.m118411a()) {
                    m118358b(false);
                    return;
                } else if (f149735b.get()) {
                    m118358b(false);
                    return;
                } else if (!C66643p.m118416a()) {
                    m118358b(false);
                    return;
                } else {
                    mo105603c();
                    return;
                }
            }
        }
        m118358b(false);
    }
}
