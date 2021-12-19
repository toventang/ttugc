package com.p2082ss.android.ugc.aweme.story.live;

import android.content.Context;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.utils.C11223al;
import com.bytedance.android.livesdkapi.p699l.AbstractC11827c;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.C35470cg;
import com.p2082ss.android.ugc.aweme.C35478ch;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.live.AbstractC58725n;
import com.p2082ss.android.ugc.aweme.live.api.ILivePermissionApi;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.story.live.e */
public final class C77355e implements AbstractC58725n {

    /* renamed from: a */
    public static C77355e f173550a = new C77355e();

    /* renamed from: b */
    public static boolean f173551b = false;

    /* renamed from: c */
    static boolean f173552c = false;

    static {
        Covode.recordClassIndex(90384);
    }

    private C77355e() {
        if (C88925a.f201933a == null) {
            C88925a.m154177a(C77356f.f173553a);
        }
        IAccountService a = AccountService.m65215a();
        if (a != null) {
            a.mo57064a(C77357g.f173554a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58725n
    /* renamed from: b */
    public final void mo96133b() {
        if (!C11223al.f26868a) {
            C2690b.m7786a();
            ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).releaseToolbarView();
            C11223al.f26868a = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58725n
    /* renamed from: a */
    public final boolean mo96132a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || !createIUserServicebyMonsterPlugin.isLogin() || !f173551b) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58725n
    /* renamed from: a */
    public final void mo96131a(boolean z) {
        f173551b = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58725n
    /* renamed from: a */
    public final void mo96127a(Context context) {
        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).onLiveTabShow(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58725n
    /* renamed from: b */
    public final void mo96134b(boolean z) {
        AbstractC81915c.m141874a(new C77351a(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58725n
    /* renamed from: a */
    public final void mo96129a(C35470cg cgVar) {
        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).setApplyLivePermission(new C11825a(cgVar.f83651c, cgVar.f83650b, cgVar.f83649a));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58725n
    /* renamed from: a */
    public final void mo96128a(AbstractC11827c cVar) {
        ((ILivePermissionApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit("https://webcast.tiktokv.com").create(ILivePermissionApi.class)).getLivePodCast().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C77358h(cVar), new C77359i(cVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58725n
    /* renamed from: a */
    public final void mo96130a(C35478ch chVar) {
        f173552c = chVar.f83672d;
        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).setDetailLivePermission(new C11826b(chVar.f83672d, chVar.f83669a, chVar.f83671c, chVar.f83670b, chVar.f83673e));
    }
}
