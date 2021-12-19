package com.bytedance.ies.abmock.datacenter.p1117b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.AbstractC16067f;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.abmock.datacenter.p1118c.C16057a;
import com.bytedance.keva.Keva;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.abmock.datacenter.b.a */
public final class C16054a {

    /* renamed from: a */
    public static final Keva f38671a = Keva.getRepoSync("precise_exposure_repo", 1);

    /* renamed from: b */
    public static final List<String> f38672b = new ArrayList();

    /* renamed from: c */
    public static final Map<String, String> f38673c = new LinkedHashMap();

    /* renamed from: d */
    public static final C16054a f38674d = new C16054a();

    private C16054a() {
    }

    /* renamed from: b */
    public static void m29672b() {
        String c = m29674c();
        C16065e a = C16065e.m29769a();
        C89219l.m154709a((Object) a, "");
        if (a.f38695b != null) {
            C16065e a2 = C16065e.m29769a();
            C89219l.m154709a((Object) a2, "");
            a2.f38695b.mo25496a(c);
        }
    }

    /* renamed from: d */
    private static String[] m29675d() {
        String[] stringArray = f38671a.getStringArray("__client_exp_vids", new String[0]);
        C89219l.m154709a((Object) stringArray, "");
        return stringArray;
    }

    static {
        Covode.recordClassIndex(18325);
    }

    /* renamed from: a */
    public static String m29670a() {
        String str;
        C16065e a = C16065e.m29769a();
        C89219l.m154709a((Object) a, "");
        AbstractC16067f fVar = a.f38695b;
        if (fVar == null || (str = fVar.mo25500d()) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str) || C89219l.m154714a((Object) "0", (Object) str)) {
            return "";
        }
        return str;
    }

    /* renamed from: c */
    public static String m29674c() {
        String[] d = m29675d();
        Keva keva = f38671a;
        String[] stringArray = keva.getStringArray("__exposed_vids", new String[0]);
        ArrayList arrayList = new ArrayList();
        C89070n.m154536a((Collection) arrayList, (Object[]) d);
        C89219l.m154709a((Object) stringArray, "");
        C89070n.m154536a((Collection) arrayList, (Object[]) stringArray);
        C16065e a = C16065e.m29769a();
        C89219l.m154709a((Object) a, "");
        if (a.f38695b != null) {
            String[] stringArray2 = keva.getStringArray("{__exposed_vids_for_current_user}_{" + m29670a() + '}', new String[0]);
            C89219l.m154709a((Object) stringArray2, "");
            C89070n.m154536a((Collection) arrayList, (Object[]) stringArray2);
        }
        return C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
    }

    /* renamed from: a */
    public final void mo25444a(String str) {
        C89219l.m154719c(str, "");
        Keva keva = f38671a;
        if (keva.contains(str)) {
            String a = m29670a();
            if (f38672b.contains(str)) {
                String[] stringArray = keva.getStringArray("{__exposed_vids_for_current_user}_{" + a + '}', new String[0]);
                String string = keva.getString(str, "");
                C89219l.m154709a((Object) string, "");
                if (string.length() > 0) {
                    C89219l.m154709a((Object) stringArray, "");
                    if (!C89064i.m154489a(stringArray, string)) {
                        List j = C89064i.m154509j(stringArray);
                        j.add(string);
                        String str2 = "{__exposed_vids_for_current_user}_{" + a + '}';
                        Object[] array = j.toArray(new String[0]);
                        if (array != null) {
                            keva.storeStringArray(str2, (String[]) array);
                            m29672b();
                            return;
                        }
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                    return;
                }
                return;
            }
            String[] stringArray2 = keva.getStringArray("__exposed_vids", new String[0]);
            String string2 = keva.getString(str, "");
            C89219l.m154709a((Object) string2, "");
            if (string2.length() > 0) {
                C89219l.m154709a((Object) stringArray2, "");
                if (!C89064i.m154489a(stringArray2, string2)) {
                    List j2 = C89064i.m154509j(stringArray2);
                    j2.add(string2);
                    Object[] array2 = j2.toArray(new String[0]);
                    if (array2 != null) {
                        keva.storeStringArray("__exposed_vids", (String[]) array2);
                        m29672b();
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }

    /* renamed from: a */
    public static void m29671a(C28022o oVar, String str) {
        C28025r d;
        String c;
        try {
            C28022o f = oVar.mo46807f(str);
            if (f != null && (d = f.mo46804d("vid")) != null && (c = d.mo46689c()) != null) {
                f38671a.storeString(str, c);
                f38673c.put(c, str);
            }
        } catch (Throwable th) {
            C13468b.m24209a("PreciseExposureManager saveKeyVid failed, " + th + " , key: " + str);
        }
    }

    /* renamed from: b */
    public static void m29673b(C28022o oVar, String str) {
        AbstractC28019l c;
        try {
            m29671a(oVar, str);
            C28022o f = oVar.mo46807f(str);
            if (f != null && (c = f.mo46803c("val")) != null) {
                C16057a.f38676a.mo25459b(str, c.toString());
            } else if (oVar.mo46802b(str)) {
                C16057a.f38676a.mo25459b(str, (String) null);
            } else {
                C16057a.f38676a.mo25462c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a("PreciseExposureManager " + th + "  , key: " + str);
        }
    }
}
