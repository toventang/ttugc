package com.bytedance.ies.ugc.aweme.ttsetting;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.ttsetting.C18161a;
import com.bytedance.ies.ugc.aweme.ttsetting.TTSettingDataApi;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58253o;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class FetchTTSettingTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C18160a f43257a = new C18160a((byte) 0);

    /* renamed from: b */
    private final String f43258b;

    static {
        Covode.recordClassIndex(20805);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return AbstractC58265x.m105222a();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return AbstractC58253o.m105189a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return AbstractC58253o.m105188a();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask$a */
    public static final class C18160a {
        static {
            Covode.recordClassIndex(20806);
        }

        private C18160a() {
        }

        public /* synthetic */ C18160a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    public FetchTTSettingTask(String str) {
        C89219l.m154719c(str, "");
        this.f43258b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154719c(context, "");
        if (System.currentTimeMillis() - Keva.getRepo("TTSettingData").getLong("last_get_setting_time", 0) > TimeUnit.HOURS.toMillis(6)) {
            String str = this.f43258b;
            C89219l.m154719c(str, "");
            IRetrofit createNewRetrofit = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str);
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = "";
            ((TTSettingDataApi.SettingApi) createNewRetrofit.create(TTSettingDataApi.SettingApi.class)).getResponse(!TextUtils.isEmpty(Keva.getRepo("TTSettingData").getString("settingData", "")), 1, 1).enqueue(new C18161a.C18162a(eVar));
            return;
        }
        C18161a.m33801a();
    }
}
