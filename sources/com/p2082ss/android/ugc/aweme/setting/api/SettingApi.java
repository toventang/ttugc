package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.google.gson.AbstractC28019l;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p2082ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88973n;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.SettingApi */
public interface SettingApi {
    static {
        Covode.recordClassIndex(80191);
    }

    @AbstractC89722f(mo144276a = "/common")
    AbstractC88973n<C22099u<AbstractC28019l>> queryABTestCommon(@AbstractC89736t(mo144292a = "aid") String str, @AbstractC89736t(mo144292a = "device_id") String str2, @AbstractC89736t(mo144292a = "client_version") long j, @AbstractC89736t(mo144292a = "new_cluster") int i, @AbstractC89736t(mo144292a = "cpu_model") String str3, @AbstractC89736t(mo144292a = "oid") int i2);

    @AbstractC89722f(mo144276a = "/aweme/v1/settings/")
    AbstractFutureC27655q<AbstractC28019l> queryRawSetting(@AbstractC89736t(mo144292a = "cpu_model") String str, @AbstractC89736t(mo144292a = "oid") int i, @AbstractC89736t(mo144292a = "last_settings_version") String str2);

    @AbstractC89722f(mo144276a = "/aweme/v1/settings/")
    AbstractFutureC27655q<IESSettings> querySetting(@AbstractC89736t(mo144292a = "cpu_model") String str, @AbstractC89736t(mo144292a = "oid") int i, @AbstractC89736t(mo144292a = "last_settings_version") String str2);

    @AbstractC89722f(mo144276a = "/passport/password/has_set/")
    C1731i<SettingUserHasSetPwd> queryUserHasSetPwd();

    @AbstractC89722f(mo144276a = "/service/settings/v3/")
    AbstractC88973n<C22099u<AbstractC28019l>> queryV3Setting(@AbstractC89736t(mo144292a = "cpu_model") String str, @AbstractC89736t(mo144292a = "oid") int i, @AbstractC89736t(mo144292a = "last_settings_version") String str2);
}
