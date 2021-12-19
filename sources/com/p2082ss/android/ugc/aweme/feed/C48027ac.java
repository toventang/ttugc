package com.p2082ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.ac */
public final class C48027ac {

    /* renamed from: a */
    public Map<String, String> f111254a = new ConcurrentHashMap();

    /* renamed from: b */
    private Map<String, String> f111255b = new ConcurrentHashMap();

    /* renamed from: c */
    private C27910f f111256c = new C27910f();

    static {
        Covode.recordClassIndex(56754);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ac$a */
    public static class C48028a {

        /* renamed from: a */
        public static final C48027ac f111257a = new C48027ac();

        static {
            Covode.recordClassIndex(56755);
        }
    }

    /* renamed from: a */
    public final String mo80054a(LogPbBean logPbBean) {
        if (logPbBean == null) {
            return "";
        }
        return this.f111256c.mo46674b(logPbBean);
    }

    /* renamed from: a */
    public final String mo80055a(String str) {
        if (!TextUtils.isEmpty(str) && this.f111254a.containsKey(str)) {
            return this.f111254a.get(str);
        }
        return "";
    }

    /* renamed from: c */
    public final String mo80059c(String str) {
        if (!TextUtils.isEmpty(str) && this.f111255b.containsKey(str)) {
            return this.f111255b.get(str);
        }
        return "";
    }

    /* renamed from: b */
    public final String mo80057b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (this.f111254a.containsKey(str)) {
            return this.f111254a.get(str);
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        String b = this.f111256c.mo46674b(logPbBean);
        this.f111254a.put(str, b);
        return b;
    }

    /* renamed from: b */
    public final void mo80058b(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            this.f111255b.put(str, this.f111256c.mo46674b(logPbBean));
        }
    }

    /* renamed from: a */
    public final void mo80056a(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            this.f111254a.put(str, this.f111256c.mo46674b(logPbBean));
        }
    }
}
