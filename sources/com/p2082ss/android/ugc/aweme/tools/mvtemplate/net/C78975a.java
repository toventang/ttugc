package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.a */
public final class C78975a {

    /* renamed from: a */
    public static final C78976a f177488a = new C78976a((byte) 0);

    /* renamed from: b */
    private final Map<String, MvNetFileBean> f177489b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, String> f177490c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(92133);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.a$a */
    public static final class C78976a {
        static {
            Covode.recordClassIndex(92134);
        }

        private C78976a() {
        }

        public /* synthetic */ C78976a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo122793a(String str) {
        C89219l.m154721d(str, "");
        String b = C13607d.m24442b(str);
        Map<String, String> map = this.f177490c;
        C89219l.m154716b(b, "");
        map.put(b, str);
        return b;
    }

    /* renamed from: b */
    public final String mo122795b(String str) {
        C89219l.m154721d(str, "");
        if (!this.f177490c.containsKey(str)) {
            return "";
        }
        for (Map.Entry<String, String> entry : this.f177490c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (C89219l.m154714a((Object) str, (Object) key)) {
                return value;
            }
        }
        return "";
    }

    /* renamed from: a */
    public final MvNetFileBean mo122792a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f177489b.get(str + str2);
    }

    /* renamed from: a */
    public final void mo122794a(String str, String str2, MvNetFileBean mvNetFileBean) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(mvNetFileBean, "");
        String str3 = str + str2;
        if (!this.f177489b.containsKey(str3)) {
            this.f177489b.put(str3, mvNetFileBean);
        }
    }
}
