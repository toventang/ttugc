package com.google.firebase.messaging;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.t */
public final class C27882t {

    /* renamed from: d */
    private static final Pattern f65470d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f65471a;

    /* renamed from: b */
    public final String f65472b;

    /* renamed from: c */
    public final String f65473c;

    static {
        Covode.recordClassIndex(33475);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f65472b, this.f65471a});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C27882t)) {
            return false;
        }
        C27882t tVar = (C27882t) obj;
        if (!this.f65471a.equals(tVar.f65471a) || !this.f65472b.equals(tVar.f65472b)) {
            return false;
        }
        return true;
    }

    C27882t(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            C1764a.m5928a("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str});
            str3 = str2.substring(8);
        }
        if (str3 == null || !f65470d.matcher(str3).matches()) {
            throw new IllegalArgumentException(C1764a.m5928a("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f65471a = str3;
        this.f65472b = str;
        this.f65473c = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append("!").append(str2).toString();
    }
}
