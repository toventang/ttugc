package android.p003ss.com.vboost.p006c;

import android.content.Context;
import android.os.Build;
import android.p003ss.com.vboost.EnumC0058e;
import android.p003ss.com.vboost.EnumC0065f;
import android.p003ss.com.vboost.p006c.C0040k;
import android.p003ss.com.vboost.p007d.C0048d;
import android.p003ss.com.vboost.p008e.C0059a;
import android.p003ss.com.vboost.p008e.C0063d;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: android.ss.com.vboost.c.c */
public class C0029c {

    /* renamed from: a */
    public static Context f107a;

    /* renamed from: b */
    private static final String f108b = C0029c.class.getSimpleName();

    /* renamed from: c */
    private AbstractC0037h f109c;

    /* renamed from: d */
    private AbstractC0037h f110d;

    /* renamed from: e */
    private AbstractC0037h f111e;

    /* access modifiers changed from: package-private */
    /* renamed from: android.ss.com.vboost.c.c$a */
    public static class C0031a {

        /* renamed from: a */
        public static final C0029c f114a = new C0029c((byte) 0);

        static {
            Covode.recordClassIndex(34);
        }
    }

    static {
        Covode.recordClassIndex(32);
    }

    /* renamed from: a */
    public static C0029c m64a() {
        if (f107a != null) {
            return C0031a.f114a;
        }
        if (!C0059a.m96a()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("registerApplication", -2);
            C0059a.m95a("vboost_event_launch", jSONObject);
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private C0029c() {
        C0063d.EnumC0064a aVar;
        if (this.f109c == null) {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.contains("samsung")) {
                aVar = C0063d.EnumC0064a.UNKNOWN;
            } else {
                aVar = C0063d.EnumC0064a.SS;
            }
            if (C0059a.m96a()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("vendor", aVar.name());
                    C0059a.m95a("vboost_event_launch", jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            int i = C00301.f112a[aVar.ordinal()];
            if (i == 1) {
                this.f109c = new C0042l(f107a);
            } else if (i == 2) {
                this.f109c = new C0028b();
            } else if (i == 3) {
                this.f109c = new C0033e();
            }
        }
        C0034f fVar = new C0034f(f107a);
        this.f110d = fVar;
        AbstractC0037h hVar = this.f109c;
        if (hVar != null) {
            this.f111e = hVar;
        } else {
            this.f111e = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.ss.com.vboost.c.c$1 */
    public static /* synthetic */ class C00301 {

        /* renamed from: a */
        static final /* synthetic */ int[] f112a;

        /* renamed from: b */
        static final /* synthetic */ int[] f113b;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00bc */
        static {
            /*
            // Method dump skipped, instructions count: 199
            */
            throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p006c.C0029c.C00301.<clinit>():void");
        }
    }

    /* synthetic */ C0029c(byte b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo30a(C0048d dVar) {
        AbstractC0037h hVar = this.f109c;
        if ((hVar == null || !hVar.mo28a(dVar.f168a)) && !this.f110d.mo28a(dVar.f168a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final Object mo31b(C0048d dVar) {
        C0038i d = m65d(dVar);
        if (d == null || d.f131b == null) {
            return null;
        }
        return d.f131b.mo27a(d);
    }

    /* renamed from: c */
    public final Object mo32c(C0048d dVar) {
        C0038i d;
        if (dVar.f176i) {
            d = dVar.f186s;
        } else {
            d = m65d(dVar);
        }
        if (d == null || d.f131b == null) {
            return null;
        }
        if (d.f133d != null) {
            d.f133d.f139b = EnumC0065f.END;
        }
        return d.f131b.mo29b(d);
    }

    /* renamed from: d */
    private C0038i m65d(C0048d dVar) {
        long j;
        long j2;
        AbstractC0037h hVar;
        AbstractC0037h hVar2;
        AbstractC0037h hVar3;
        AbstractC0037h hVar4;
        AbstractC0037h hVar5;
        AbstractC0037h hVar6;
        AbstractC0037h hVar7;
        AbstractC0037h hVar8;
        C0038i iVar = new C0038i(dVar.f168a);
        dVar.f186s = iVar;
        switch (C00301.f113b[iVar.f130a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                AbstractC0037h hVar9 = this.f109c;
                if (hVar9 == null || !hVar9.mo28a(iVar.f130a) || !this.f110d.mo28a(iVar.f130a)) {
                    AbstractC0037h hVar10 = this.f109c;
                    if (hVar10 != null && hVar10.mo28a(dVar.f168a)) {
                        AbstractC0037h hVar11 = this.f109c;
                        this.f111e = hVar11;
                        iVar.f131b = hVar11;
                        C0032d dVar2 = (C0032d) C0040k.C0041a.f143a.mo33a(EnumC0036g.VENDOR, iVar.f130a).get(dVar.f169b);
                        if (dVar2 == null) {
                            return null;
                        }
                        if (dVar.f170c > ((long) dVar2.f118c)) {
                            j2 = (long) dVar2.f118c;
                        } else {
                            j2 = dVar.f170c;
                        }
                        iVar.f135f = j2;
                        iVar.f132c = dVar2.f116a;
                    } else if (!this.f110d.mo28a(dVar.f168a)) {
                        return null;
                    } else {
                        iVar.f131b = this.f110d;
                        this.f111e = this.f110d;
                        C0032d dVar3 = (C0032d) C0040k.C0041a.f143a.mo33a(EnumC0036g.PLATFORM, iVar.f130a).get(dVar.f169b);
                        if (dVar3 == null) {
                            return null;
                        }
                        if (dVar.f170c > ((long) dVar3.f118c)) {
                            j = (long) dVar3.f118c;
                        } else {
                            j = dVar.f170c;
                        }
                        iVar.f135f = j;
                        iVar.f132c = dVar3.f116a;
                    }
                } else {
                    C0032d dVar4 = (C0032d) C0040k.C0041a.f143a.mo33a(EnumC0036g.VENDOR, iVar.f130a).get(dVar.f169b);
                    if (dVar4 == null) {
                        return null;
                    }
                    if (dVar.f170c > ((long) dVar4.f118c)) {
                        EnumC0058e eVar = dVar.f169b;
                        if (((int) dVar.f170c) - dVar4.f118c <= dVar4.f120e || eVar.ordinal() <= dVar4.f121f) {
                            iVar.f132c = dVar4.f116a;
                            iVar.f135f = (long) dVar4.f118c;
                            if (dVar4.f117b == EnumC0036g.PLATFORM) {
                                hVar3 = this.f110d;
                            } else {
                                hVar3 = this.f109c;
                            }
                            iVar.f131b = hVar3;
                            if (dVar4.f117b == EnumC0036g.PLATFORM) {
                                hVar4 = this.f110d;
                            } else {
                                hVar4 = this.f109c;
                            }
                            this.f111e = hVar4;
                        } else {
                            C0032d dVar5 = (C0032d) C0040k.C0041a.f143a.mo33a(EnumC0036g.VENDOR, iVar.f130a).get(dVar4.f119d);
                            if (dVar5 == null) {
                                return null;
                            }
                            iVar.f135f = dVar.f170c;
                            iVar.f132c = dVar5.f116a;
                            if (dVar5.f117b == EnumC0036g.PLATFORM) {
                                hVar5 = this.f110d;
                            } else {
                                hVar5 = this.f109c;
                            }
                            iVar.f131b = hVar5;
                            if (dVar5.f117b == EnumC0036g.PLATFORM) {
                                hVar6 = this.f110d;
                            } else {
                                hVar6 = this.f109c;
                            }
                            this.f111e = hVar6;
                        }
                    } else {
                        iVar.f135f = dVar.f170c;
                        iVar.f132c = dVar4.f116a;
                        if (dVar4.f117b == EnumC0036g.PLATFORM) {
                            hVar = this.f110d;
                        } else {
                            hVar = this.f109c;
                        }
                        iVar.f131b = hVar;
                        if (dVar4.f117b == EnumC0036g.PLATFORM) {
                            hVar2 = this.f110d;
                        } else {
                            hVar2 = this.f109c;
                        }
                        this.f111e = hVar2;
                    }
                }
                return iVar;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                iVar.f137h = dVar.f171d;
                iVar.f136g = dVar.f173f;
                AbstractC0037h hVar12 = this.f109c;
                if (hVar12 == null || !hVar12.mo28a(dVar.f168a)) {
                    AbstractC0037h hVar13 = this.f110d;
                    this.f111e = hVar13;
                    iVar.f131b = hVar13;
                } else {
                    AbstractC0037h hVar14 = this.f109c;
                    this.f111e = hVar14;
                    iVar.f131b = hVar14;
                }
                return iVar;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                C0032d dVar6 = (C0032d) C0040k.C0041a.f143a.mo33a(EnumC0036g.PLATFORM, iVar.f130a).get(dVar.f169b);
                if (dVar6 == null) {
                    return null;
                }
                iVar.f137h = dVar.f171d;
                iVar.f132c = dVar6.f116a;
                if (dVar6.f117b == EnumC0036g.PLATFORM) {
                    hVar7 = this.f110d;
                } else {
                    hVar7 = this.f109c;
                }
                iVar.f131b = hVar7;
                if (dVar6.f117b == EnumC0036g.PLATFORM) {
                    hVar8 = this.f110d;
                } else {
                    hVar8 = this.f109c;
                }
                this.f111e = hVar8;
                return iVar;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                if (this.f110d.mo28a(iVar.f130a)) {
                    AbstractC0037h hVar15 = this.f110d;
                    this.f111e = hVar15;
                    iVar.f131b = hVar15;
                } else if (this.f109c.mo28a(iVar.f130a)) {
                    AbstractC0037h hVar16 = this.f109c;
                    this.f111e = hVar16;
                    iVar.f131b = hVar16;
                }
                iVar.f133d = new C0039j(dVar.f174g);
                if (dVar.f176i) {
                    iVar.f133d.f139b = EnumC0065f.END;
                } else {
                    iVar.f133d.f139b = EnumC0065f.BEGIN;
                }
                return iVar;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                if (this.f110d.mo28a(iVar.f130a)) {
                    AbstractC0037h hVar17 = this.f110d;
                    this.f111e = hVar17;
                    iVar.f131b = hVar17;
                } else if (this.f109c.mo28a(iVar.f130a)) {
                    AbstractC0037h hVar18 = this.f109c;
                    this.f111e = hVar18;
                    iVar.f131b = hVar18;
                }
                return iVar;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                if (this.f110d.mo28a(iVar.f130a)) {
                    iVar.f134e = dVar.f175h;
                    AbstractC0037h hVar19 = this.f110d;
                    this.f111e = hVar19;
                    iVar.f131b = hVar19;
                } else if (this.f109c.mo28a(iVar.f130a)) {
                    AbstractC0037h hVar20 = this.f109c;
                    this.f111e = hVar20;
                    iVar.f131b = hVar20;
                }
                return iVar;
            default:
                return null;
        }
    }
}
