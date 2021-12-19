package com.p2082ss.ugc.live.p4460a.p4461a.p4464c;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;

/* renamed from: com.ss.ugc.live.a.a.c.a */
public class C87021a extends RuntimeException {

    /* renamed from: a */
    private C87020c f196197a;

    static {
        Covode.recordClassIndex(102787);
    }

    public C87020c getResourceRequest() {
        return this.f196197a;
    }

    public long getResourceId() {
        return this.f196197a.f196190b;
    }

    public String toString() {
        String runtimeException = super.toString();
        Throwable cause = getCause();
        if (cause == null || cause == this) {
            return runtimeException;
        }
        return runtimeException + "\n" + cause.toString();
    }

    public String getMessage() {
        StringBuilder append = new StringBuilder().append(this.f196197a.toString()).append("\navailable disk space:");
        String path = Environment.getDataDirectory().getPath();
        int i = Build.VERSION.SDK_INT;
        StatFs statFs = new StatFs(path);
        return append.append((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024).append("KB\n").append(super.getMessage()).toString();
    }

    public C87021a(C87020c cVar) {
        this.f196197a = cVar;
    }

    public C87021a(String str, C87020c cVar) {
        super(str);
        this.f196197a = cVar;
    }

    public C87021a(String str, Throwable th, C87020c cVar) {
        super(str, th);
        this.f196197a = cVar;
    }
}
