package com.p2082ss.android.ugc.aweme.specact;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.attribution.C33970a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.shortcut.C69718g;
import com.p2082ss.android.ugc.aweme.specact.api.AbstractC74934a;
import com.p2082ss.android.ugc.aweme.specact.api.ISpecActService;
import com.p2082ss.android.ugc.aweme.specact.pendant.SpecActNewPendant;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3927a.C74951a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75021b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75029a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75040b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75049c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75083m;
import com.p2082ss.android.ugc.aweme.specact.popup.p3944c.C75183a;
import com.p2082ss.android.ugc.aweme.utils.CallableC80505gm;
import java.util.Iterator;
import java.util.List;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.specact.SpecActServiceImpl */
public final class SpecActServiceImpl implements ISpecActService {

    /* renamed from: e */
    public static final C74928a f168448e = new C74928a((byte) 0);

    /* renamed from: a */
    public UgAwemeActivitySetting f168449a;

    /* renamed from: b */
    public C74951a f168450b = C74951a.C74952a.m131613a();

    /* renamed from: c */
    public AbstractC75021b f168451c = SpecActNewPendant.C74947a.m131596a();

    /* renamed from: d */
    public int f168452d;

    static {
        Covode.recordClassIndex(87794);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.SpecActServiceImpl$a */
    public static final class C74928a {
        static {
            Covode.recordClassIndex(87795);
        }

        private C74928a() {
        }

        public /* synthetic */ C74928a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: a */
    public final AbstractC74934a mo118019a() {
        return C33970a.f80349e;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: d */
    public final void mo118032d() {
        mo118030c();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: g */
    public final void mo118035g() {
        C75049c.m131768b();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: c */
    public final void mo118030c() {
        this.f168449a = null;
        this.f168450b.f168503e = null;
        this.f168451c.mo118055d();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: e */
    public final void mo118033e() {
        C75049c.f168680a = null;
        C75049c.m131768b();
        if (this.f168449a != null) {
            this.f168451c.mo118078m();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: h */
    public final void mo118036h() {
        C1731i.m5640b(CallableC80505gm.f180103a, C40780g.m82246c());
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: f */
    public final void mo118034f() {
        C75049c.m131770c();
        Iterator<T> it = C75049c.f168681b.iterator();
        while (it.hasNext()) {
            it.next().mo118091b();
        }
    }

    /* renamed from: i */
    public static ISpecActService m131497i() {
        MethodCollector.m26663i(11393);
        Object a = C81908b.m141854a(ISpecActService.class, false);
        if (a != null) {
            ISpecActService iSpecActService = (ISpecActService) a;
            MethodCollector.m26664o(11393);
            return iSpecActService;
        }
        if (C81908b.f183380ej == null) {
            synchronized (ISpecActService.class) {
                try {
                    if (C81908b.f183380ej == null) {
                        C81908b.f183380ej = new SpecActServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11393);
                    throw th;
                }
            }
        }
        SpecActServiceImpl specActServiceImpl = (SpecActServiceImpl) C81908b.f183380ej;
        MethodCollector.m26664o(11393);
        return specActServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: b */
    public final void mo118027b() {
        LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
        C89219l.m154716b(localTestApi, "");
        localTestApi.getSpecActDebugService().mo106976a("SpecApi", "onSettingSynced");
        AbstractC88979t.m154294a(C74929b.f168453a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C74930c(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: a */
    public final void mo118023a(Aweme aweme) {
        C75049c.f168680a = aweme;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.SpecActServiceImpl$b */
    static final class C74929b<T> implements AbstractC88983w {

        /* renamed from: a */
        public static final C74929b f168453a = new C74929b();

        static {
            Covode.recordClassIndex(87796);
        }

        C74929b() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Integer> vVar) {
            C89219l.m154721d(vVar, "");
            vVar.mo143031a((Integer) 1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: b */
    public final void mo118028b(Aweme aweme) {
        if (this.f168449a != null) {
            this.f168451c.mo118071a(aweme);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: a */
    public final void mo118021a(Context context) {
        C89219l.m154721d(context, "");
        if (context != null) {
            SharedPreferences a = C34822d.m71158a(context, "pref_name", 0);
            if (!a.getBoolean("pref_short_cut", false)) {
                C69718g.m123133a(context, context.getPackageName());
                a.edit().putBoolean("pref_short_cut", true).apply();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: c */
    public final void mo118031c(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "/activity/referral", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/ug_activity_referral", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/activity/armor", false)) {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            C39162r.m79460a("leave_page_click", new C33744d().mo59983a("position", parse.getLastPathSegment()).mo59983a("button_name", "client").f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.SpecActServiceImpl$c */
    static final class C74930c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SpecActServiceImpl f168454a;

        static {
            Covode.recordClassIndex(87797);
        }

        C74930c(SpecActServiceImpl specActServiceImpl) {
            this.f168454a = specActServiceImpl;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 210
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl.C74930c.accept(java.lang.Object):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: a */
    public final void mo118025a(String str) {
        C89219l.m154721d(str, "");
        if (this.f168449a != null) {
            this.f168451c.mo118075c(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: b */
    public final void mo118029b(String str) {
        C89219l.m154721d(str, "");
        if (this.f168449a != null) {
            this.f168451c.mo118074b(str);
            C74951a aVar = this.f168450b;
            C89219l.m154721d(str, "");
            List<? extends UgActivityTasks> list = aVar.f168501c;
            if (!(list == null || list.isEmpty() || 0 != 0)) {
                for (UgActivityTasks ugActivityTasks : list) {
                    if (C89219l.m154714a((Object) ugActivityTasks.getTaskId(), (Object) "like_comment_tribute")) {
                        aVar.f168499a.storeBoolean(C75083m.m131848a("do_like_or_comment_tribute_action"), true);
                        long j = aVar.f168500b;
                        Integer time = ugActivityTasks.getTime();
                        C89219l.m154716b(time, "");
                        if (j < ((long) time.intValue())) {
                            C39162r.m79460a("interact_task_complete", new C33744d().mo59983a("task_name", str).mo59983a("task_id", ugActivityTasks.getTaskId()).f79943a);
                            return;
                        } else if (!aVar.f168499a.getBoolean(C75083m.m131848a("has_report_like_and_comment_tribute"), false)) {
                            aVar.f168504f = null;
                            aVar.mo118089a(ugActivityTasks);
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: a */
    public final void mo118026a(boolean z) {
        C75183a a = C75183a.C75184a.m131921a();
        if (z) {
            a.f169052g++;
        } else {
            a.f169052g--;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: a */
    public final void mo118020a(Activity activity, Aweme aweme) {
        C89219l.m154721d(activity, "");
        C75183a.C75184a.m131921a().mo118341a(activity, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: a */
    public final void mo118022a(Fragment fragment, ViewGroup viewGroup) {
        C89219l.m154721d(fragment, "");
        this.f168451c.mo118048a(fragment, viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.api.ISpecActService
    /* renamed from: a */
    public final void mo118024a(Long l, Boolean bool, Boolean bool2) {
        if (l != null && bool != null && bool2 != null) {
            SpecActNewPendant a = SpecActNewPendant.C74947a.m131596a();
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            if (a.f168493h) {
                C75029a.C75030a.m131750a().mo118161a(booleanValue, booleanValue2);
            }
            if (a.f168494i) {
                C75040b a2 = C75040b.C75041a.m131765a();
                AbstractC75024e eVar = a2.f168669f;
                if ((eVar == null || eVar.mo118080o()) && !a2.f168668e && !a2.f168667d.isEmpty() && booleanValue && !a2.mo118159c()) {
                    a2.f168668e = true;
                    a2.mo118171d().storeBoolean(C75083m.m131848a("pendant_has_active"), true);
                    a2.mo118172e().mo118152b(a2.f168668e);
                    UgActivityTasks i = a2.mo118176i();
                    if (i != null) {
                        a2.mo118170a(i);
                    }
                }
            }
        }
    }
}
