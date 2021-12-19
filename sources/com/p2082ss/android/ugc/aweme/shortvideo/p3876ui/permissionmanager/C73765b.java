package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.ArrayList;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.b */
public final class C73765b {

    /* renamed from: a */
    private static final Map<String, String> f165618a = C89041ag.m154421a(C89387v.m154943a("android.permission.RECORD_AUDIO", "mic"), C89387v.m154943a("android.permission.CAMERA", "camera"), C89387v.m154943a("android.permission.WRITE_EXTERNAL_STORAGE", "storage"));

    static {
        Covode.recordClassIndex(86504);
    }

    /* renamed from: a */
    private static Bundle m129812a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final void m129815b(String[] strArr, ActivityC0945e eVar) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(eVar, "");
        C39162r.m79460a("go_to_setting_show", m129817d(strArr, eVar));
    }

    /* renamed from: c */
    public static final void m129816c(String[] strArr, ActivityC0945e eVar) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(eVar, "");
        C39162r.m79460a("permission_rationale_page_show", m129817d(strArr, eVar));
    }

    /* renamed from: a */
    public static final void m129813a(String[] strArr, ActivityC0945e eVar) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(eVar, "");
        Intent intent = eVar.getIntent();
        C89219l.m154716b(intent, "");
        Bundle a = m129812a(intent);
        for (String str : strArr) {
            String str2 = null;
            C84425b a2 = new C84425b().mo129406a("enter_from", a != null ? a.getString("enter_from") : null).mo129406a("shoot_way", a != null ? a.getString("shoot_way") : null);
            if (a != null) {
                str2 = a.getString("creation_id");
            }
            C39162r.m79460a("asking_permission_show", a2.mo129406a("creationId", str2).mo129406a(StringSet.type, f165618a.get(str)).f188764a);
        }
    }

    /* renamed from: d */
    public static final Map<String, String> m129817d(String[] strArr, ActivityC0945e eVar) {
        Intent intent = eVar.getIntent();
        C89219l.m154716b(intent, "");
        Bundle a = m129812a(intent);
        String str = null;
        C84425b a2 = new C84425b().mo129406a("enter_from", a != null ? a.getString("enter_from") : null).mo129406a("shoot_way", a != null ? a.getString("shoot_way") : null);
        if (a != null) {
            str = a.getString("creation_id");
        }
        C84425b a3 = a2.mo129406a("creationId", str);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            arrayList.add(f165618a.get(str2));
        }
        Map<String, String> map = a3.mo129406a(StringSet.type, C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)).f188764a;
        C89219l.m154716b(map, "");
        return map;
    }

    /* renamed from: a */
    public static final void m129814a(String[] strArr, int[] iArr, ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        Intent intent = eVar.getIntent();
        C89219l.m154716b(intent, "");
        Bundle a = m129812a(intent);
        C89378p<String, Boolean>[] b = C73772f.m129827b(strArr, iArr);
        if (b != null) {
            for (C89378p<String, Boolean> pVar : b) {
                String str = null;
                C84425b a2 = new C84425b().mo129406a("enter_from", a != null ? a.getString("enter_from") : null).mo129406a("shoot_way", a != null ? a.getString("shoot_way") : null);
                if (a != null) {
                    str = a.getString("creation_id");
                }
                C39162r.m79460a("asking_permission_action", a2.mo129406a("creationId", str).mo129406a(StringSet.type, f165618a.get(pVar.getFirst())).mo129403a("status", pVar.getSecond().booleanValue() ? 1 : 0).f188764a);
            }
        }
    }
}
