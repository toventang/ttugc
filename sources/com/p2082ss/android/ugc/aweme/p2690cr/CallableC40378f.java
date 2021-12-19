package com.p2082ss.android.ugc.aweme.p2690cr;

import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.cr.f */
public final /* synthetic */ class CallableC40378f implements Callable {

    /* renamed from: a */
    private final Throwable f94561a;

    /* renamed from: b */
    private final String f94562b;

    /* renamed from: c */
    private final File f94563c;

    /* renamed from: d */
    private final String f94564d;

    /* renamed from: e */
    private final boolean f94565e;

    static {
        Covode.recordClassIndex(48179);
    }

    CallableC40378f(Throwable th, String str, File file, String str2, boolean z) {
        this.f94561a = th;
        this.f94562b = str;
        this.f94563c = file;
        this.f94564d = str2;
        this.f94565e = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int lastIndexOf;
        Throwable th = this.f94561a;
        String str = this.f94562b;
        File file = this.f94563c;
        String str2 = this.f94564d;
        boolean z = this.f94565e;
        String a = C40353e.m81539a(th);
        if (a != null) {
            if (str != null) {
                int lastIndexOf2 = str.lastIndexOf(File.separator);
                a = ((lastIndexOf2 <= 0 || lastIndexOf2 >= str.length()) ? str : str.substring(lastIndexOf2 + 1)) + '#' + a;
            }
            if (file != null) {
                file.getAbsolutePath();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stack", a);
            String name = file.getName();
            String substring = (name == null || (lastIndexOf = name.lastIndexOf(46)) <= 0) ? null : name.substring(lastIndexOf);
            if (!TextUtils.isEmpty(substring)) {
                jSONObject.put(StringSet.name, substring);
            }
            if (z) {
                jSONObject.put("data_uri", file.getAbsolutePath());
            }
            jSONObject.put("call_type", str == null ? "1" : "0");
            C12290b.m22064a(str2, jSONObject);
        }
        return null;
    }
}
