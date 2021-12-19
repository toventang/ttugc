package com.bytedance.ies.ugc.network.partner.p1276b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.ugc.network.partner.b.e */
public final class C18198e {

    /* renamed from: a */
    private final String f43338a = " \"'<>#";

    /* renamed from: b */
    private final String f43339b = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* renamed from: c */
    private final Map<String, List<String>> f43340c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(20854);
    }

    /* renamed from: b */
    public final void mo29055b(String str) {
        C89219l.m154721d(str, "");
        this.f43340c.remove(str);
    }

    /* renamed from: a */
    public final String mo29052a(String str) {
        C89219l.m154721d(str, "");
        List<String> list = this.f43340c.get(str);
        if (list != null) {
            return (String) C89070n.m154583g((List) list);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo29054a(StringBuilder sb) {
        C89219l.m154721d(sb, "");
        sb.append('?');
        for (Map.Entry<String, List<String>> entry : this.f43340c.entrySet()) {
            String a = C18194a.m33845a(entry.getKey(), this.f43339b, true, true);
            for (String str : entry.getValue()) {
                C89219l.m154716b(a, "");
                sb.append(a);
                if (str != null) {
                    sb.append('=');
                    sb.append(C18194a.m33845a(str, this.f43339b, true, true));
                }
                sb.append('&');
            }
        }
        sb.setLength(sb.length() - 1);
    }

    /* renamed from: c */
    public final void mo29057c(String str) {
        this.f43340c.clear();
        if (str != null) {
            int i = 0;
            while (i <= str.length()) {
                int a = C89361p.m154882a((CharSequence) str, '&', i, false, 4);
                if (a == -1) {
                    a = str.length();
                }
                int a2 = C89361p.m154882a((CharSequence) str, '=', i, false, 4);
                if (a2 == -1 || a2 > a) {
                    String substring = str.substring(i, a);
                    C89219l.m154716b(substring, "");
                    m33857c(substring, null);
                } else {
                    String substring2 = str.substring(i, a2);
                    C89219l.m154716b(substring2, "");
                    String substring3 = str.substring(a2 + 1, a);
                    C89219l.m154716b(substring3, "");
                    m33857c(substring2, substring3);
                }
                i = a + 1;
            }
        }
    }

    /* renamed from: b */
    public final void mo29056b(String str, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        String a = C18194a.m33845a(str, this.f43339b, true, true);
        C89219l.m154716b(a, "");
        if (str2 != null) {
            str3 = C18194a.m33845a(str2, this.f43339b, true, true);
        } else {
            str3 = null;
        }
        m33857c(a, str3);
    }

    /* renamed from: c */
    private final void m33857c(String str, String str2) {
        String a;
        String a2 = C18194a.m33846a(str, true);
        if (str2 == null) {
            a = null;
        } else {
            a = C18194a.m33846a(str2, true);
        }
        List<String> list = this.f43340c.get(a2);
        if (list == null) {
            list = new ArrayList<>();
            Map<String, List<String>> map = this.f43340c;
            C89219l.m154716b(a2, "");
            map.put(a2, list);
        }
        list.add(a);
    }

    /* renamed from: a */
    public final void mo29053a(String str, String str2) {
        C89219l.m154721d(str, "");
        List<String> list = this.f43340c.get(str);
        if (list != null) {
            list.clear();
        }
        mo29056b(str, str2);
    }
}
