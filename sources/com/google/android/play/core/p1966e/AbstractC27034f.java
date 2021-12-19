package com.google.android.play.core.p1966e;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.e.f */
public abstract class AbstractC27034f {
    static {
        Covode.recordClassIndex(32510);
    }

    /* renamed from: a */
    public static AbstractC27034f m53721a(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2) {
        if (i2 != 8) {
            return new C27036h(i, i2, i3, j, j2, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    /* renamed from: a */
    public static AbstractC27034f m53722a(Bundle bundle) {
        return new C27036h(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    /* renamed from: a */
    public abstract int mo44734a();

    /* renamed from: b */
    public abstract int mo44735b();

    /* renamed from: c */
    public abstract int mo44736c();

    /* renamed from: d */
    public abstract long mo44737d();

    /* renamed from: e */
    public abstract long mo44738e();

    /* renamed from: f */
    public final List<String> mo44739f() {
        return mo44742i() != null ? new ArrayList(mo44742i()) : new ArrayList();
    }

    /* renamed from: g */
    public final List<String> mo44740g() {
        return mo44743j() != null ? new ArrayList(mo44743j()) : new ArrayList();
    }

    /* renamed from: h */
    public abstract PendingIntent mo44741h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract List<String> mo44742i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract List<String> mo44743j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract List<Intent> mo44744k();
}
