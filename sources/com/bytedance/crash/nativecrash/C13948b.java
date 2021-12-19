package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.C14069r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.crash.nativecrash.b */
public final class C13948b {

    /* renamed from: a */
    public Map<String, String> f33992a;

    static {
        Covode.recordClassIndex(16011);
    }

    /* renamed from: a */
    public final boolean mo22422a() {
        Map<String, String> map = this.f33992a;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(this.f33992a.get("process_name")) || TextUtils.isEmpty(this.f33992a.get("crash_thread_name")) || TextUtils.isEmpty(this.f33992a.get("pid")) || TextUtils.isEmpty(this.f33992a.get("tid")) || TextUtils.isEmpty(this.f33992a.get("start_time")) || TextUtils.isEmpty(this.f33992a.get("crash_time")) || TextUtils.isEmpty(this.f33992a.get("signal_line"))) {
            return false;
        }
        return true;
    }

    public C13948b(File file) {
        String doGetCrashHeader;
        MethodCollector.m26663i(1703);
        File b = C14069r.m25625b(file);
        if (!b.exists() || b.length() == 0) {
            MethodCollector.m26664o(1703);
            return;
        }
        String absolutePath = b.getAbsolutePath();
        if (NativeImpl.f33976a && (doGetCrashHeader = NativeImpl.doGetCrashHeader(absolutePath)) != null) {
            String[] split = doGetCrashHeader.split("\n");
            this.f33992a = new HashMap();
            for (String str : split) {
                String[] split2 = str.split("=");
                if (split2.length == 2) {
                    this.f33992a.put(split2[0], split2[1]);
                }
            }
            MethodCollector.m26664o(1703);
            return;
        }
        MethodCollector.m26664o(1703);
    }
}
