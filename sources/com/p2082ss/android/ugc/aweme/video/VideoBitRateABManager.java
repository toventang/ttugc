package com.p2082ss.android.ugc.aweme.video;

import android.content.Context;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.language.C58073f;
import com.p2082ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a;
import com.p2082ss.android.ugc.aweme.setting.C68052ce;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.p2082ss.android.ugc.aweme.simkit.model.p3912a.C74675a;
import com.p2082ss.android.ugc.aweme.video.api.BitRateSettingsApi;
import com.p2082ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.video.VideoBitRateABManager */
public final class VideoBitRateABManager implements AbstractC67176a, C68052ce.AbstractC68053a {

    /* renamed from: a */
    public static final VideoBitRateABManager f180314a = new VideoBitRateABManager();

    /* renamed from: g */
    private static HashSet<String> f180315g;

    /* renamed from: b */
    public RateSettingsResponse f180316b;

    /* renamed from: c */
    public volatile boolean f180317c;

    /* renamed from: d */
    public boolean f180318d;

    /* renamed from: e */
    public volatile RateSettingsResponse f180319e;

    /* renamed from: f */
    private Boolean f180320f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.VideoBitRateABManager$RequestConfigTask */
    public class RequestConfigTask implements AbstractC58084a, AbstractC58264w {
        static {
            Covode.recordClassIndex(93924);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
        /* renamed from: c */
        public final String[] mo28603c() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
        /* renamed from: d */
        public final int mo28604d() {
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
            return "task_";
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

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
        /* renamed from: e */
        public final EnumC58149ac mo28605e() {
            if (C58152b.m105085c()) {
                return EnumC58149ac.IO;
            }
            return EnumC58149ac.CPU;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        private RequestConfigTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            MethodCollector.m26663i(1450);
            C51423a.m95787a("RequestConfigTask");
            synchronized (VideoBitRateABManager.this) {
                try {
                    if (!VideoBitRateABManager.this.f180318d) {
                        try {
                            VideoBitRateABManager.this.mo123826a(BitRateSettingsApi.m139899a());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        MethodCollector.m26664o(1450);
                    }
                } finally {
                    MethodCollector.m26664o(1450);
                }
            }
        }

        /* synthetic */ RequestConfigTask(VideoBitRateABManager videoBitRateABManager, byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a
    /* renamed from: a */
    public final void mo96311a() {
        m139836g();
    }

    /* renamed from: c */
    public final void mo123828c() {
        if (!ColdLaunchRequestCombinerImpl.m104985b().mo95594a()) {
            cG_();
        }
    }

    /* renamed from: d */
    public final boolean mo123829d() {
        if (!C80695q.m139910c() || !this.f180317c) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m139837h() {
        new C58221f.C58224c().mo95703b((AbstractC58264w) new RequestConfigTask(this, (byte) 0)).mo95706a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Object mo123830e() {
        mo123826a(((RateSettingCombineModel) ColdLaunchRequestCombinerImpl.m104985b().mo95592a("/aweme/v1/rate/settings/")).getRateSetting());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Object mo123831f() {
        try {
            if (this.f180319e == null) {
                mo123827b();
            }
            m139835b(this.f180319e);
        } catch (Throwable th) {
            C13468b.m24211a(th, (String) null);
        }
        return null;
    }

    private VideoBitRateABManager() {
        C68052ce.f152437b.mo108671a(2, this);
        if (C80695q.m139910c()) {
            C1731i.m5640b(new CallableC81084y(this), C1731i.f5562a);
            ColdLaunchRequestCombinerImpl.m104985b().mo95593a(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.C68052ce.AbstractC68053a
    public final void cG_() {
        boolean c = C80695q.m139910c();
        Boolean bool = this.f180320f;
        if (bool == null || c != bool.booleanValue()) {
            this.f180320f = Boolean.valueOf(c);
            if (c) {
                m139836g();
            }
        } else if (c && !this.f180318d) {
            m139836g();
        }
    }

    /* renamed from: g */
    private void m139836g() {
        if (ColdLaunchRequestCombinerImpl.m104985b().mo95594a()) {
            RateSettingCombineModel rateSettingCombineModel = (RateSettingCombineModel) ColdLaunchRequestCombinerImpl.m104985b().mo95592a("/aweme/v1/rate/settings/");
            if (rateSettingCombineModel != null) {
                if (rateSettingCombineModel.httpCode == 200 && rateSettingCombineModel.getRateSetting().status_code == 0) {
                    if (C16048b.m29633a().mo25421a(true, "is_async_setting", true)) {
                        C1731i.m5640b(new CallableC81085z(this), C1731i.f5562a);
                        return;
                    } else {
                        mo123826a(((RateSettingCombineModel) ColdLaunchRequestCombinerImpl.m104985b().mo95592a("/aweme/v1/rate/settings/")).getRateSetting());
                        return;
                    }
                } else if (rateSettingCombineModel.httpCode == 509) {
                    return;
                }
            }
            m139837h();
            return;
        }
        m139837h();
    }

    static {
        Covode.recordClassIndex(93922);
        HashSet<String> hashSet = new HashSet<>();
        f180315g = hashSet;
        hashSet.add("DE");
        f180315g.add("FR");
        f180315g.add("GB");
        f180315g.add("BR");
        f180315g.add("RU");
        f180315g.add("AE");
        f180315g.add("SA");
        f180315g.add("IT");
        f180315g.add("MX");
        f180315g.add("ES");
        f180315g.add("TR");
        f180315g.add("PL");
        f180315g.add("BD");
        f180315g.add("IN");
        f180315g.add("ID");
        f180315g.add("JP");
        f180315g.add("MY");
        f180315g.add("PH");
        f180315g.add("TH");
        f180315g.add("VN");
        f180315g.add("CN");
    }

    /* renamed from: b */
    public final synchronized void mo123827b() {
        String lowerCase;
        MethodCollector.m26663i(2524);
        if (this.f180319e != null) {
            MethodCollector.m26664o(2524);
            return;
        }
        String string = C34822d.m71158a(C17867d.m33078a(), "bitrate_manager_sp_rate_setting", 0).getString("bitrate_manager_sp_rate_setting", null);
        if (string == null) {
            if (!f180315g.contains(C58073f.m104920a())) {
                lowerCase = "us";
            } else {
                lowerCase = C58073f.m104920a().toLowerCase(Locale.US);
            }
            string = m139834a(C17867d.m33078a(), "rate_settings/" + lowerCase + ".json");
        }
        this.f180319e = (RateSettingsResponse) new C27910f().mo46671a(string, new C27895a<RateSettingsResponse<C74675a>>() {
            /* class com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager.C806461 */

            static {
                Covode.recordClassIndex(93923);
            }
        }.type);
        MethodCollector.m26664o(2524);
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a
    /* renamed from: a */
    public final void mo96312a(Throwable th) {
        m139837h();
    }

    /* renamed from: b */
    private void m139835b(RateSettingsResponse rateSettingsResponse) {
        MethodCollector.m26663i(2532);
        if (rateSettingsResponse == null || !rateSettingsResponse.isValid()) {
            MethodCollector.m26664o(2532);
            return;
        }
        try {
            synchronized (this) {
                try {
                    this.f180316b = rateSettingsResponse;
                    C34822d.m71158a(C17867d.m33078a(), "bitrate_manager_sp_rate_setting", 0).edit().putString("bitrate_manager_sp_rate_setting", new C27910f().mo46674b(rateSettingsResponse)).apply();
                } catch (Throwable th) {
                    MethodCollector.m26664o(2532);
                    throw th;
                }
            }
            this.f180317c = true;
            MethodCollector.m26664o(2532);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(2532);
        }
    }

    /* renamed from: a */
    public final void mo123826a(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse != null) {
            try {
                if (rateSettingsResponse.isValid()) {
                    m139835b(rateSettingsResponse);
                    this.f180318d = true;
                    C68052ce.f152437b.mo108672a(2, true);
                    return;
                }
            } catch (Exception e) {
                C51423a.m95788a("", e);
                return;
            }
        }
        C68052ce.f152437b.mo108672a(2, false);
    }

    /* renamed from: a */
    private static String m139834a(Context context, String str) {
        Throwable th;
        InputStream inputStream;
        IOException e;
        MethodCollector.m26663i(2459);
        InputStream inputStream2 = null;
        try {
            inputStream = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                C13609b.m24451a(inputStream);
                MethodCollector.m26664o(2459);
                return str2;
            } catch (IOException e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    C13609b.m24451a(inputStream);
                    MethodCollector.m26664o(2459);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    C13609b.m24451a(inputStream2);
                    MethodCollector.m26664o(2459);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            e.printStackTrace();
            C13609b.m24451a(inputStream);
            MethodCollector.m26664o(2459);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C13609b.m24451a(inputStream2);
            MethodCollector.m26664o(2459);
            throw th;
        }
    }
}
