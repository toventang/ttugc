package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SaveConfigType;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.abmock.datacenter.p1118c.C16057a;
import com.bytedance.ies.abmock.p1115a.AbstractC16045a;
import com.bytedance.ies.abmock.p1115a.AbstractC16046b;
import com.bytedance.ies.abmock.p1115a.C16047c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.C28025r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4586g.AbstractC88922b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.abmock.g */
public final class C16076g {

    /* renamed from: a */
    static long f38717a;

    /* renamed from: b */
    static long f38718b;

    /* renamed from: c */
    static AbstractC16046b f38719c;

    /* renamed from: d */
    static C16047c f38720d;

    /* renamed from: e */
    static final C28024q f38721e = new C28024q();

    /* renamed from: f */
    public static List<AbstractC16045a> f38722f = new ArrayList();

    /* renamed from: g */
    public static final C16076g f38723g = new C16076g();

    /* renamed from: h */
    private static final C88958b<C16047c> f38724h;

    /* renamed from: i */
    private static final List<C16047c> f38725i = new ArrayList();

    /* renamed from: j */
    private static final List<Object> f38726j = new ArrayList();

    /* renamed from: k */
    private static List<Object> f38727k = new ArrayList();

    private C16076g() {
    }

    static {
        Covode.recordClassIndex(18352);
        C88958b<C16047c> bVar = new C88958b<>();
        C89219l.m154709a((Object) bVar, "");
        f38724h = bVar;
        try {
            bVar.mo143268a(C160771.f38728a).mo143292d(C160782.f38729a).mo143291d(5000, TimeUnit.MILLISECONDS).mo143292d(C160793.f38730a).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143062b(new AbstractC88922b<String>() {
                /* class com.bytedance.ies.abmock.C16076g.C160804 */

                static {
                    Covode.recordClassIndex(18356);
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onComplete() {
                    C16076g.f38720d = null;
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onError(Throwable th) {
                    C89219l.m154719c(th, "");
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final /* synthetic */ void onNext(Object obj) {
                    C28022o oVar;
                    long j;
                    C28025r d;
                    String str = (String) obj;
                    C89219l.m154719c(str, "");
                    try {
                        AbstractC28019l a = C28024q.m56139a(str);
                        C89219l.m154709a((Object) a, "");
                        C28022o f = a.mo46789j().mo46807f("data");
                        if (f == null || (d = f.mo46804d("settings_time")) == null) {
                            j = 0;
                        } else {
                            j = d.mo46693f();
                        }
                        C16076g.f38717a = j;
                        C16057a.f38676a.mo25458b("lastSyncTimeStamp", C16076g.f38717a);
                        if (!(f == null || (oVar = f.mo46807f("settings")) == null)) {
                            try {
                                Set<String> keySet = oVar.f65804a.keySet();
                                C89219l.m154709a((Object) keySet, "");
                                ArrayList<String> arrayList = new ArrayList();
                                for (T t : keySet) {
                                    if (SaveConfigType.getConfigTypeMap().containsKey(t)) {
                                        arrayList.add(t);
                                    }
                                }
                                for (String str2 : arrayList) {
                                    SaveConfigType.ConfigType configType = (SaveConfigType.ConfigType) SaveConfigType.getConfigTypeMap().get(str2);
                                    if (configType != null) {
                                        int i = 1;
                                        switch (C16081h.f38731a[configType.ordinal()]) {
                                            case 1:
                                                C28025r d2 = oVar.mo46804d(str2);
                                                if (d2 == null) {
                                                    continue;
                                                } else {
                                                    boolean h = d2.f65806a instanceof Number ? !C89219l.m154714a((Object) d2.mo46688b(), (Object) 0) : d2.mo46695h();
                                                    C16057a.f38676a.mo25460b(str2, h);
                                                    C16048b a2 = C16048b.m29633a();
                                                    C89219l.m154709a((Object) a2, "");
                                                    a2.f38663a.mo25436b(str2, h);
                                                    SettingsManager a3 = SettingsManager.m29616a();
                                                    C89219l.m154709a((Object) a3, "");
                                                    a3.getSettingsValueProvider().mo25509a(str2, h);
                                                }
                                                C16048b.m29633a().mo25418a(str2);
                                                C16065e.m29769a().mo25492a(str2);
                                            case 2:
                                                C28025r d3 = oVar.mo46804d(str2);
                                                if (d3 == null) {
                                                    continue;
                                                } else {
                                                    if (!(d3.f65806a instanceof Boolean)) {
                                                        i = d3.mo46694g();
                                                    } else if (!d3.mo46695h()) {
                                                        i = 0;
                                                    }
                                                    C16057a.f38676a.mo25457b(str2, i);
                                                    C16048b a4 = C16048b.m29633a();
                                                    C89219l.m154709a((Object) a4, "");
                                                    a4.f38663a.mo25433b(str2, i);
                                                    SettingsManager a5 = SettingsManager.m29616a();
                                                    C89219l.m154709a((Object) a5, "");
                                                    a5.getSettingsValueProvider().mo25506a(str2, i);
                                                }
                                                C16048b.m29633a().mo25418a(str2);
                                                C16065e.m29769a().mo25492a(str2);
                                            case 3:
                                                AbstractC28019l c = oVar.mo46803c(str2);
                                                if (c != null) {
                                                    long f2 = c.mo46693f();
                                                    C16057a.f38676a.mo25458b(str2, f2);
                                                    C16048b a6 = C16048b.m29633a();
                                                    C89219l.m154709a((Object) a6, "");
                                                    a6.f38663a.mo25434b(str2, f2);
                                                    SettingsManager a7 = SettingsManager.m29616a();
                                                    C89219l.m154709a((Object) a7, "");
                                                    a7.getSettingsValueProvider().mo25507a(str2, f2);
                                                } else {
                                                    continue;
                                                }
                                                C16048b.m29633a().mo25418a(str2);
                                                C16065e.m29769a().mo25492a(str2);
                                            case 4:
                                                AbstractC28019l c2 = oVar.mo46803c(str2);
                                                if (c2 != null) {
                                                    float e = c2.mo46691e();
                                                    C16057a.f38676a.mo25456b(str2, e);
                                                    C16048b a8 = C16048b.m29633a();
                                                    C89219l.m154709a((Object) a8, "");
                                                    a8.f38663a.mo25432b(str2, e);
                                                    SettingsManager a9 = SettingsManager.m29616a();
                                                    C89219l.m154709a((Object) a9, "");
                                                    a9.getSettingsValueProvider().mo25505a(str2, e);
                                                } else {
                                                    continue;
                                                }
                                                C16048b.m29633a().mo25418a(str2);
                                                C16065e.m29769a().mo25492a(str2);
                                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                                AbstractC28019l c3 = oVar.mo46803c(str2);
                                                if (c3 != null) {
                                                    double d4 = c3.mo46690d();
                                                    C16057a.f38676a.mo25455b(str2, d4);
                                                    C16048b a10 = C16048b.m29633a();
                                                    C89219l.m154709a((Object) a10, "");
                                                    a10.f38663a.mo25431b(str2, d4);
                                                    SettingsManager a11 = SettingsManager.m29616a();
                                                    C89219l.m154709a((Object) a11, "");
                                                    a11.getSettingsValueProvider().mo25504a(str2, d4);
                                                } else {
                                                    continue;
                                                }
                                                C16048b.m29633a().mo25418a(str2);
                                                C16065e.m29769a().mo25492a(str2);
                                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                                AbstractC28019l c4 = oVar.mo46803c(str2);
                                                if (c4 != null) {
                                                    String c5 = c4.mo46689c();
                                                    C89219l.m154709a((Object) c5, "");
                                                    C16057a.f38676a.mo25459b(str2, c5);
                                                    C16048b a12 = C16048b.m29633a();
                                                    C89219l.m154709a((Object) a12, "");
                                                    a12.f38663a.mo25435b(str2, c5);
                                                    SettingsManager a13 = SettingsManager.m29616a();
                                                    C89219l.m154709a((Object) a13, "");
                                                    a13.getSettingsValueProvider().mo25508a(str2, c5);
                                                } else {
                                                    continue;
                                                }
                                                C16048b.m29633a().mo25418a(str2);
                                                C16065e.m29769a().mo25492a(str2);
                                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                                AbstractC28019l c6 = oVar.mo46803c(str2);
                                                if (c6 != null) {
                                                    C16057a aVar = C16057a.f38676a;
                                                    C89219l.m154709a((Object) aVar, "");
                                                    C16057a.f38676a.mo25452a(str2, (String[]) aVar.mo25449a().mo46667a(c6, String[].class));
                                                    C16048b a14 = C16048b.m29633a();
                                                    C89219l.m154709a((Object) a14, "");
                                                    a14.f38663a.mo25428a(str2, c6);
                                                    SettingsManager a15 = SettingsManager.m29616a();
                                                    C89219l.m154709a((Object) a15, "");
                                                    a15.getSettingsValueProvider().mo25516b(str2, c6.toString());
                                                } else {
                                                    continue;
                                                }
                                                C16048b.m29633a().mo25418a(str2);
                                                C16065e.m29769a().mo25492a(str2);
                                        }
                                    }
                                    AbstractC28019l c7 = oVar.mo46803c(str2);
                                    if (c7 != null) {
                                        C16057a.f38676a.mo25459b(str2, c7.toString());
                                        C16048b a16 = C16048b.m29633a();
                                        C89219l.m154709a((Object) a16, "");
                                        a16.f38663a.mo25437c(str2, c7.toString());
                                        SettingsManager a17 = SettingsManager.m29616a();
                                        C89219l.m154709a((Object) a17, "");
                                        a17.getSettingsValueProvider().mo25516b(str2, c7.toString());
                                    }
                                    C16048b.m29633a().mo25418a(str2);
                                    C16065e.m29769a().mo25492a(str2);
                                }
                                Iterator<T> it = C16076g.f38722f.iterator();
                                while (it.hasNext()) {
                                    it.next().mo25404a();
                                }
                            } catch (Exception e2) {
                                System.out.print(e2);
                            }
                        }
                    } catch (Exception unused) {
                        oVar = new C28022o();
                    }
                    C16076g.f38720d = null;
                }
            });
        } catch (Throwable unused) {
        }
    }
}
