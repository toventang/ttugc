package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import org.json.JSONObject;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.e.a */
public final class C78947a {

    /* renamed from: a */
    public static final C78947a f177441a = new C78947a();

    private C78947a() {
    }

    static {
        Covode.recordClassIndex(92096);
    }

    /* renamed from: b */
    private static boolean m137761b(MvThemeData mvThemeData) {
        if (mvThemeData != null && !TextUtils.isEmpty(mvThemeData.mo122668c()) && !TextUtils.isEmpty(mvThemeData.mo122665a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m137758a(MvThemeData mvThemeData) {
        if (mvThemeData != null) {
            C40982q.m82520a("mv_resource_download_error_state", 11, new C69840ar().mo110189a("url", mvThemeData.mo122668c()).mo110189a("mv_res_id", mvThemeData.mo122665a()).mo110189a("mv_res_name", mvThemeData.mo122672f()).mo110191a());
        }
    }

    /* renamed from: a */
    public static void m137759a(MvThemeData mvThemeData, ExceptionResult exceptionResult, boolean z) {
        String str;
        String str2;
        if (mvThemeData != null) {
            if (!m137761b(mvThemeData)) {
                m137758a(mvThemeData);
            }
            if (z) {
                C40982q.m82520a("mv_resource_download_error_state", 0, (JSONObject) null);
                return;
            }
            C69840ar a = new C69840ar().mo110189a("url", mvThemeData.mo122668c()).mo110189a("mv_res_id", mvThemeData.mo122665a()).mo110189a("mv_res_name", mvThemeData.mo122672f());
            String str3 = "";
            if (exceptionResult == null || (str = String.valueOf(exceptionResult.getErrorCode())) == null) {
                str = str3;
            }
            C69840ar a2 = a.mo110189a("error_code", str);
            if (exceptionResult == null || (str2 = exceptionResult.toString()) == null) {
                str2 = str3;
            }
            C69840ar a3 = a2.mo110189a("error_message", str2);
            if (!(exceptionResult == null || exceptionResult.getException() == null)) {
                str3 = C24098m.m45633c(exceptionResult.getException());
            }
            C40982q.m82520a("mv_resource_download_error_state", 1, a3.mo110189a("exception", str3).mo110191a());
        }
    }

    /* renamed from: a */
    public static void m137760a(boolean z, MvThemeData mvThemeData, C89378p<Integer, String> pVar) {
        String str;
        String str2;
        String str3;
        String second;
        Integer first;
        if (z) {
            C40982q.m82520a("mv_template_process_error_rate", 0, (JSONObject) null);
            return;
        }
        C69840ar arVar = new C69840ar();
        String str4 = "";
        if (mvThemeData == null || (str = mvThemeData.mo122668c()) == null) {
            str = str4;
        }
        C69840ar a = arVar.mo110189a("url", str);
        if (mvThemeData == null || (str2 = mvThemeData.mo122665a()) == null) {
            str2 = str4;
        }
        C69840ar a2 = a.mo110189a("mv_res_id", str2);
        if (pVar == null || (first = pVar.getFirst()) == null || (str3 = String.valueOf(first.intValue())) == null) {
            str3 = str4;
        }
        C69840ar a3 = a2.mo110189a("error_code", str3);
        if (!(pVar == null || (second = pVar.getSecond()) == null)) {
            str4 = second;
        }
        C40982q.m82520a("mv_template_process_error_rate", 1, a3.mo110189a("error_message", str4).mo110191a());
    }
}
