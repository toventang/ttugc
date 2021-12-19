package com.bytedance.framwork.core.p999b.p1002c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.p1005c.AbstractC14801a;
import com.bytedance.framwork.core.p1005c.C14806c;
import com.bytedance.framwork.core.p999b.p1000a.C14769c;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.net.URL;
import java.util.List;

/* renamed from: com.bytedance.framwork.core.b.c.a */
public final class C14773a implements AbstractC14777b {

    /* renamed from: a */
    public AbstractC14801a f36015a;

    /* renamed from: b */
    volatile long f36016b;

    /* renamed from: c */
    boolean f36017c;

    /* renamed from: d */
    int f36018d;

    /* renamed from: e */
    Context f36019e;

    /* renamed from: f */
    String f36020f;

    /* renamed from: g */
    int f36021g;

    /* renamed from: h */
    volatile long f36022h;

    /* renamed from: i */
    volatile long f36023i;

    /* renamed from: j */
    String f36024j;

    /* renamed from: k */
    boolean f36025k = true;

    static {
        Covode.recordClassIndex(16873);
    }

    /* renamed from: a */
    public final void mo23802a() {
        if (this.f36025k) {
            int i = this.f36018d;
            if (i == 0) {
                this.f36016b = 300000;
                this.f36018d++;
            } else if (i == 1) {
                this.f36016b = 900000;
                this.f36018d++;
            } else {
                this.f36016b = 1800000;
                this.f36018d++;
            }
            SDKMonitorUtils.m27201a(this.f36020f).mo23862b(this.f36016b);
        }
    }

    /* renamed from: a */
    public final void mo23804a(String str) {
        if (this.f36025k) {
            this.f36024j = str;
        }
    }

    @Override // com.bytedance.framwork.core.p999b.p1002c.AbstractC14777b
    /* renamed from: b */
    public final boolean mo23805b(String str) {
        return this.f36015a.mo23833a(C14806c.m27182a(str));
    }

    /* renamed from: a */
    public final void mo23803a(long j) {
        if (this.f36025k) {
            this.f36023i = j * 1000;
            SDKMonitorUtils.m27201a(this.f36020f).mo23862b(this.f36023i);
        }
    }

    public C14773a(Context context, final String str) {
        this.f36020f = str;
        this.f36019e = context;
        C147741 r4 = new AbstractC14801a.AbstractC14802a() {
            /* class com.bytedance.framwork.core.p999b.p1002c.C14773a.C147741 */

            static {
                Covode.recordClassIndex(16874);
            }

            @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14803b
            /* renamed from: a */
            public final String mo23806a() {
                return str + "sdk_monitor";
            }

            @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14803b
            /* renamed from: b */
            public final List<String> mo23807b() {
                String str = str;
                if (TextUtils.isEmpty(str) || C14769c.f35985b.get(str) == null) {
                    return C14769c.f35984a.mo23788c();
                }
                return C14769c.f35985b.get(str).mo23788c();
            }

            @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14802a, com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14803b
            /* renamed from: c */
            public final int mo23808c() {
                String str = str;
                if (TextUtils.isEmpty(str) || C14769c.f35985b.get(str) == null) {
                    return C14769c.f35984a.mo23790e();
                }
                return C14769c.f35985b.get(str).mo23790e();
            }

            @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14802a, com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14803b
            /* renamed from: d */
            public final long mo23809d() {
                int f;
                String str = str;
                if (TextUtils.isEmpty(str) || C14769c.f35985b.get(str) == null) {
                    f = C14769c.f35984a.mo23791f();
                } else {
                    f = C14769c.f35985b.get(str).mo23791f();
                }
                return (long) (f * 1000);
            }

            @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14802a, com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14803b
            /* renamed from: e */
            public final String mo23810e() {
                List<String> b;
                if (TextUtils.isEmpty(C14773a.this.f36024j) || (b = mo23807b()) == null || b.size() <= 0) {
                    return null;
                }
                try {
                    return "https://" + C14773a.this.f36024j + new URL(b.get(0)).getPath();
                } catch (Throwable unused) {
                    return null;
                }
            }
        };
        C147752 r5 = new AbstractC14801a.AbstractC14804c() {
            /* class com.bytedance.framwork.core.p999b.p1002c.C14773a.C147752 */

            static {
                Covode.recordClassIndex(16875);
            }

            @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14804c
            /* renamed from: c */
            public final boolean mo23813c() {
                return C14773a.this.f36017c;
            }

            @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14804c
            /* renamed from: b */
            public final long mo23812b() {
                long j;
                C14773a aVar = C14773a.this;
                if (!aVar.f36025k) {
                    return 0;
                }
                if (aVar.f36016b > aVar.f36022h) {
                    j = aVar.f36016b;
                } else {
                    j = aVar.f36022h;
                }
                if (j > aVar.f36023i) {
                    return j;
                }
                return aVar.f36023i;
            }

            @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14804c
            /* renamed from: a */
            public final boolean mo23811a() {
                String str = str;
                if (TextUtils.isEmpty(str) || C14769c.f35985b.get(str) == null) {
                    return C14769c.f35984a.mo23792g();
                }
                return C14769c.f35985b.get(str).mo23792g();
            }
        };
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f36015a = new AbstractC14801a(applicationContext, r4, r5) {
            /* class com.bytedance.framwork.core.p999b.p1002c.C14773a.C147763 */

            static {
                Covode.recordClassIndex(16876);
            }

            @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a
            /* renamed from: a */
            public final boolean mo23814a(String str, byte[] bArr) {
                if (C14779d.m27144a(str) != null) {
                    C14780e a = C14779d.m27144a(str).mo23815a(str, bArr);
                    C14773a.this.mo23804a((String) null);
                    if (a.f36034a > 0) {
                        C14773a.this.f36017c = false;
                        if (a.f36034a != 200 || a.f36035b == null) {
                            if (500 <= a.f36034a && a.f36034a <= 600) {
                                C14773a.this.mo23802a();
                                return false;
                            }
                        } else if ("success".equals(a.f36035b.opt("message"))) {
                            C14773a aVar = C14773a.this;
                            if (aVar.f36025k) {
                                SDKMonitorUtils.m27201a(aVar.f36020f).f36157d.mo23793a();
                                SDKMonitorUtils.m27201a(aVar.f36020f).mo23861a(false);
                                aVar.f36018d = 0;
                                aVar.f36016b = 0;
                                aVar.f36021g = 0;
                                aVar.f36022h = 0;
                                aVar.f36023i = 0;
                            }
                            String optString = a.f36035b.optString("redirect");
                            long optLong = a.f36035b.optLong("delay");
                            if (!TextUtils.isEmpty(optString)) {
                                C14773a.this.mo23804a(optString);
                            }
                            if (optLong > 0) {
                                C14773a.this.mo23803a(optLong);
                            }
                            return true;
                        } else {
                            boolean equals = "drop data".equals(a.f36035b.opt("message"));
                            boolean equals2 = "drop all data".equals(a.f36035b.opt("message"));
                            String optString2 = a.f36035b.optString("redirect");
                            long optLong2 = a.f36035b.optLong("delay");
                            if (!TextUtils.isEmpty(optString2)) {
                                C14773a.this.mo23804a(optString2);
                            }
                            if (optLong2 > 0) {
                                C14773a.this.mo23803a(optLong2);
                            }
                            if (equals) {
                                C14773a aVar2 = C14773a.this;
                                if (aVar2.f36025k) {
                                    aVar2.mo23802a();
                                    SDKMonitorUtils.m27201a(aVar2.f36020f).mo23861a(true);
                                }
                            } else {
                                C14773a aVar3 = C14773a.this;
                                if (aVar3.f36025k) {
                                    SDKMonitorUtils.m27201a(aVar3.f36020f).mo23861a(false);
                                }
                            }
                            if (equals2) {
                                C14773a aVar4 = C14773a.this;
                                if (aVar4.f36025k) {
                                    aVar4.mo23802a();
                                    SDKMonitorUtils.m27201a(aVar4.f36020f).mo23861a(true);
                                    C14827k a2 = SDKMonitorUtils.m27201a(aVar4.f36020f);
                                    try {
                                        a2.f36156c.mo23816a();
                                        a2.f36157d.mo23795b(2147483647L);
                                    } catch (Throwable unused) {
                                    }
                                    C14827k a3 = SDKMonitorUtils.m27201a(aVar4.f36020f);
                                    a3.f36157d.f35991f = true;
                                    a3.f36168o = true;
                                }
                            }
                            return false;
                        }
                    } else {
                        C14773a aVar5 = C14773a.this;
                        if (aVar5.f36025k) {
                            if (aVar5.f36021g == 0) {
                                aVar5.f36022h = 30000;
                                aVar5.f36021g++;
                            } else if (aVar5.f36021g == 1) {
                                aVar5.f36022h = 60000;
                                aVar5.f36021g++;
                            } else if (aVar5.f36021g == 2) {
                                aVar5.f36022h = 120000;
                                aVar5.f36021g++;
                            } else if (aVar5.f36021g == 3) {
                                aVar5.f36022h = 240000;
                                aVar5.f36021g++;
                            } else {
                                aVar5.f36022h = 300000;
                                aVar5.f36021g++;
                            }
                            SDKMonitorUtils.m27201a(aVar5.f36020f).mo23862b(aVar5.f36022h);
                        }
                        C14773a.this.f36017c = true;
                    }
                }
                return false;
            }
        };
    }
}
