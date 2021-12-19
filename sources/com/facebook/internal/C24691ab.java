package com.facebook.internal;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.facebook.internal.ab */
public final class C24691ab {

    /* renamed from: a */
    public static final Collection<String> f58619a = Collections.unmodifiableCollection(Arrays.asList("service_disabled", "AndroidAuthKillSwitchException"));

    /* renamed from: b */
    public static final Collection<String> f58620b = Collections.unmodifiableCollection(Arrays.asList("access_denied", "OAuthAccessDeniedException"));

    /* renamed from: c */
    private static final String f58621c = C24691ab.class.getName();

    /* renamed from: a */
    public static final String m47224a() {
        return C1764a.m5928a("m.%s", new Object[]{C24872m.f59044d});
    }

    /* renamed from: b */
    public static final String m47225b() {
        return C1764a.m5928a("https://graph.%s", new Object[]{C24872m.m47691d()});
    }

    static {
        Covode.recordClassIndex(28844);
    }
}
