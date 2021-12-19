package com.p2082ss.android.ugc.aweme.p4173ug;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C46714av;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.p2433ca.C35350g;
import com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.AbstractC79620l;
import com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.C79607d;
import com.p2082ss.android.ugc.aweme.p4173ug.p4174a.C79561b;
import com.p2082ss.android.ugc.aweme.p4173ug.p4176b.C79583a;
import com.p2082ss.android.ugc.aweme.p4173ug.p4176b.C79584b;
import com.p2082ss.android.ugc.aweme.p4173ug.p4177c.C79591a;
import com.p2082ss.android.ugc.aweme.p4173ug.p4178d.C79599c;
import com.p2082ss.android.ugc.aweme.p4173ug.p4178d.C79600d;
import com.p2082ss.android.ugc.aweme.p4173ug.p4178d.C79601e;
import com.p2082ss.android.ugc.aweme.p4173ug.p4180f.C79628a;
import com.p2082ss.android.ugc.aweme.p4173ug.p4180f.C79629b;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.C79698c;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.p4185b.C79692a;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.p4186c.C79701b;
import com.p2082ss.android.ugc.aweme.share.ShareServiceImpl;
import com.p2082ss.android.ugc.awemepushlib.interaction.PushService;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.UgCommonServiceImpl */
public final class UgCommonServiceImpl implements IUgCommonService {
    static {
        Covode.recordClassIndex(92764);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: a */
    public final AbstractC79589c mo123092a() {
        return C79561b.f178539b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: b */
    public final AbstractC79596d mo123100b() {
        return C79591a.f178594f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: c */
    public final AbstractC79620l mo123103c() {
        return C79607d.f178625e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: g */
    public final boolean mo123109g() {
        return C79584b.f178579a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: e */
    public final long mo123107e() {
        return new C79698c(C79684b.EnumC79686b.LIKE).f178822e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: f */
    public final SQLiteDatabase mo123108f() {
        SQLiteDatabase sQLiteDatabase = C79583a.m138334a().f178578b;
        C89219l.m154716b(sQLiteDatabase, "");
        return sQLiteDatabase;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: h */
    public final AbstractC79622e mo123110h() {
        if (mo123111i()) {
            return C79629b.f178667a;
        }
        return C79628a.f178666a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: i */
    public final boolean mo123111i() {
        if (C16048b.m29633a().mo25421a(true, "launch_mob_refactored_version_ab", false)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: d */
    public final void mo123105d() {
        C1731i.m5631a(500).mo5534a(C79701b.C79702a.f178829a, C1731i.f5562a, null).mo5534a(C79701b.C79703b.f178830a, C1731i.f5564c, null);
    }

    /* renamed from: j */
    public static IUgCommonService m138290j() {
        MethodCollector.m26663i(6150);
        Object a = C81908b.m141854a(IUgCommonService.class, false);
        if (a != null) {
            IUgCommonService iUgCommonService = (IUgCommonService) a;
            MethodCollector.m26664o(6150);
            return iUgCommonService;
        }
        if (C81908b.f183388er == null) {
            synchronized (IUgCommonService.class) {
                try {
                    if (C81908b.f183388er == null) {
                        C81908b.f183388er = new UgCommonServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6150);
                    throw th;
                }
            }
        }
        UgCommonServiceImpl ugCommonServiceImpl = (UgCommonServiceImpl) C81908b.f183388er;
        MethodCollector.m26664o(6150);
        return ugCommonServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: c */
    public final void mo123104c(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        C79584b.f178580b.mo89376c((ActivityC0945e) aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: a */
    public final void mo123094a(Context context) {
        C1731i.m5631a(300).mo5534a(new C79692a.C79693a(context), C1731i.f5562a, null).mo5534a(new C79692a.C79694b(context), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: a */
    public final String mo123093a(EnumC79674h hVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(hVar, "");
        C79599c cVar = (C79599c) SettingsManager.m29616a().mo25397a("ug_resources_cdn_url_settings", C79599c.class, C79600d.f178610a);
        int i = C79601e.f178612a[hVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new C89376n();
            } else if (cVar != null) {
                return cVar.f178609b;
            } else {
                return null;
            }
        } else if (cVar != null) {
            return cVar.f178608a;
        } else {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: b */
    public final void mo123102b(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        AbstractC1196i lifecycle = aVar.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
            C79584b.f178580b.mo89374b((ActivityC0945e) aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: b */
    public final void mo123101b(Context context) {
        if (C79692a.f178810a) {
            C79692a.f178810a = false;
            C1731i.m5631a(300).mo5534a(new C79692a.C79695c(context), C1731i.f5562a, null).mo5534a(new C79692a.C79696d(context), C1731i.f5564c, null);
            return;
        }
        C79698c.C79699a.m138519a(C79684b.EnumC79686b.LIKE + " :conditions not met or not return from 「thumbs-up」list");
        if (context != null) {
            NoticeServiceImpl.m112566f().mo99374a(context);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: a */
    public final void mo123096a(Intent intent) {
        Uri data;
        if (intent != null && (data = intent.getData()) != null) {
            String host = data.getHost();
            String path = data.getPath();
            if (C89219l.m154714a((Object) "mine", (Object) host) || C89219l.m154714a((Object) "user/homepage", (Object) C89219l.m154704a(host, (Object) path))) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: a */
    public final void mo123097a(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        Intent intent = aVar.getIntent();
        if (!(intent == null || C79584b.m138335a(intent) == null)) {
            Bundle a = C79584b.m138335a(intent);
            if (a == null) {
                C89219l.m154715b();
            }
            String string = a.getString("payload");
            Bundle a2 = C79584b.m138335a(intent);
            if (a2 == null) {
                C89219l.m154715b();
            }
            String string2 = a2.getString("from");
            try {
                JSONObject jSONObject = new JSONObject(string);
                PushService.createIPushApibyMonsterPlugin(false).onGcmNotificationClick(jSONObject, aVar, jSONObject.optInt("id", 0), string2, jSONObject.optInt("pass_through", 1), null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (C46714av.m90100b()) {
            C35350g.m72350a(new C79584b.RunnableC79585a(aVar));
            return;
        }
        C79591a.m138345a(aVar);
        ShareServiceImpl.m121448d().mo109418c().mo109465a();
        C79584b.f178580b.mo89370a((ActivityC0945e) aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123106d(com.bytedance.ies.foundation.activity.ActivityC17312a r10) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl.mo123106d(com.bytedance.ies.foundation.activity.a):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: a */
    public final void mo123099a(boolean z) {
        if (z) {
            C79692a.f178810a = true;
            C79698c.C79699a.m138519a(C79684b.EnumC79686b.LIKE + " :into the 「thumbs-up」list,Condition is met");
            return;
        }
        C79698c.C79699a.m138519a(C79684b.EnumC79686b.LIKE + " :into the 「thumbs-up」list,But conditions not met");
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: a */
    public final void mo123098a(ActivityC17312a aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        if (z) {
            if (!C79584b.f178579a) {
                C29339a.m58753a(C79584b.RunnableC79587c.f178584a, 200);
            }
            if (aVar.getIntent().getBooleanExtra("unlogin_deeplink_third_part", false)) {
                new C23144b(aVar).mo37640e(R.string.b4u).mo37637b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService
    /* renamed from: a */
    public final void mo123095a(Context context, int i, int i2, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        if (i == 18 && i2 == -1 && intent != null) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }
        C79591a aVar = C79591a.f178594f;
        if (i == 19 && i2 == -1) {
            aVar.mo123140a("app_update_click");
        }
    }
}
