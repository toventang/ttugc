package com.bytedance.frameworks.baselib.network.http.p995g;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g.c */
public final class C14753c {

    /* renamed from: a */
    static final Pattern f35958a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    static final Pattern f35959b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    static final Pattern f35960c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    static {
        Covode.recordClassIndex(16850);
    }
}
