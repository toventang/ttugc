package com.p2082ss.android.ugc.aweme.setting;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.config.C12422d;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.abmock.C16089p;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.utils.C34725k;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52913d;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58452y;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.setting.api.SettingApi;
import com.p2082ss.android.ugc.aweme.setting.model.C68174d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.setting.bz */
public abstract class AbstractC68041bz implements WeakHandler.IHandler, AbstractC68022bh {

    /* renamed from: a */
    public static AbstractC68041bz f152407a = new C68017bc();

    /* renamed from: b */
    protected SettingApi f152408b = ((SettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(SettingApi.class));

    /* renamed from: c */
    protected WeakHandler f152409c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d */
    public String f152410d = "{}";

    /* renamed from: e */
    protected List<AbstractC68043a> f152411e = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.setting.bz$a */
    public interface AbstractC68043a {
        static {
            Covode.recordClassIndex(80239);
        }

        /* renamed from: a */
        void mo96447a(C68174d dVar);
    }

    /* renamed from: a */
    public void mo108642a(Object obj) {
    }

    static {
        Covode.recordClassIndex(80237);
    }

    protected AbstractC68041bz() {
    }

    /* renamed from: a */
    public final void mo108658a(AbstractC68043a aVar) {
        this.f152411e.add(aVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        mo108642a(message.obj);
    }

    /* renamed from: a */
    public final void mo108656a(Context context) {
        if (C16083j.m29874a().mo25538c()) {
            C12422d.C12423a a = C12422d.m22362a();
            a.f30138a = "settings_v3_fallback_to_v1";
            C12290b.m22059a(a.mo20217a());
        }
        C68056ch.m120361a();
        C52913d.m97751a().mo88580a(false);
        C34608n.m70658a().mo61083a(this.f152409c, new CallableC68048ca(this, context), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Object mo108660b(Context context) {
        try {
            String b = C36145b.m73641b().mo63268b(C17867d.m33078a(), "last_setting_version", "");
            int i = 0;
            if (context != null) {
                i = C34725k.m70937a(context);
            }
            AbstractC28019l lVar = this.f152408b.queryRawSetting(C58452y.m107035a(), i, b).get();
            C1731i.m5640b(new CallableC68051cd(this, lVar), C1731i.f5562a);
            return lVar;
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo108655a(AbstractC28019l lVar) {
        if (lVar == null || !(lVar instanceof C28022o)) {
            C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = false, is_v3 = " + C16083j.m29874a().mo25538c() + ", is_v3_api = false");
            return null;
        }
        mo108657a((C28022o) lVar, true);
        C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_finished, success = true, is_combine = false, is_v3 = " + C16083j.m29874a().mo25538c() + ", is_v3_api = false");
        String str = "";
        try {
            if (((C28022o) lVar).mo46803c("creator_fund_setting_entry_schema") != null) {
                str = ((C28022o) lVar).mo46803c("creator_fund_setting_entry_schema").mo46689c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_success, content = ".concat(String.valueOf(str)));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo108643b(final com.p2082ss.android.ugc.aweme.setting.model.C68174d r10) {
        /*
        // Method dump skipped, instructions count: 1962
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz.mo108643b(com.ss.android.ugc.aweme.setting.model.d):void");
    }

    /* renamed from: a */
    public final void mo108659a(Object obj, boolean z) {
        C1731i.m5640b(new CallableC68049cb(this, obj, z), C1731i.f5562a);
    }

    /* renamed from: a */
    public final void mo108657a(C28022o oVar, boolean z) {
        this.f152410d = oVar.toString();
        if (z) {
            SettingsManager a = SettingsManager.m29616a();
            C16089p.m29891a(oVar);
            C16065e.m29769a().mo25495b();
            a.mo25402c();
            return;
        }
        SettingsManager.m29616a();
        C16065e.m29769a().mo25495b();
        SettingsManager.m29616a().mo25402c();
    }
}
