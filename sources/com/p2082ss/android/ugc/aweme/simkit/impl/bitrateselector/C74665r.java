package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.r */
public final class C74665r {

    /* renamed from: a */
    private RateSettingsResponse f167826a;

    /* renamed from: b */
    private RateSettingsResponse f167827b;

    static {
        Covode.recordClassIndex(87488);
    }

    private C74665r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.r$a */
    public static class C74667a {

        /* renamed from: a */
        public static final C74665r f167829a = new C74665r((byte) 0);

        static {
            Covode.recordClassIndex(87490);
        }
    }

    /* renamed from: a */
    public final synchronized RateSettingsResponse mo117469a() {
        String str;
        MethodCollector.m26663i(9670);
        if (this.f167826a == null) {
            RateSettingsResponse rateSettingsResponse = AbstractC74616d.m131036a().mo117290b().getCommonConfig().getRateSettingsResponse();
            if (rateSettingsResponse != null) {
                this.f167826a = rateSettingsResponse;
            } else {
                if (this.f167827b == null) {
                    RateSettingsResponse defaultRateSettingsResponse = AbstractC74616d.m131036a().mo117290b().getCommonConfig().getDefaultRateSettingsResponse();
                    this.f167827b = defaultRateSettingsResponse;
                    if (defaultRateSettingsResponse == null) {
                        Application application = C84231a.f188309a;
                        String country = Resources.getSystem().getConfiguration().locale.getCountry();
                        if (C74668s.f167831b.contains(country)) {
                            str = "ng";
                        } else if (C74668s.f167830a.contains(country)) {
                            str = country.toLowerCase();
                        } else if (C74668s.f167832c.contains(country)) {
                            str = "pe";
                        } else {
                            str = "other";
                        }
                        this.f167827b = (RateSettingsResponse) new C27910f().mo46671a(m131128a(application, "simkit_rate_settings/" + str + ".json"), new C27895a<RateSettingsResponse>() {
                            /* class com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74665r.C746661 */

                            static {
                                Covode.recordClassIndex(87489);
                            }
                        }.type);
                    }
                }
                RateSettingsResponse rateSettingsResponse2 = this.f167827b;
                MethodCollector.m26664o(9670);
                return rateSettingsResponse2;
            }
        }
        RateSettingsResponse rateSettingsResponse3 = this.f167826a;
        MethodCollector.m26664o(9670);
        return rateSettingsResponse3;
    }

    /* synthetic */ C74665r(byte b) {
        this();
    }

    /* renamed from: a */
    private static String m131128a(Context context, String str) {
        MethodCollector.m26663i(9821);
        try {
            InputStream open = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                open.close();
                MethodCollector.m26664o(9821);
                return str2;
            } catch (Throwable th) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                MethodCollector.m26664o(9821);
                throw th;
            }
        } catch (IOException unused) {
            MethodCollector.m26664o(9821);
            return null;
        }
    }
}
