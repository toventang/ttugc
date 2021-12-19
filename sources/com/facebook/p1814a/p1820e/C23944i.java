package com.facebook.p1814a.p1820e;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import java.util.UUID;

/* renamed from: com.facebook.a.e.i */
final class C23944i {

    /* renamed from: a */
    public Long f56682a;

    /* renamed from: b */
    public Long f56683b;

    /* renamed from: c */
    public int f56684c;

    /* renamed from: d */
    Long f56685d;

    /* renamed from: e */
    public C23946k f56686e;

    /* renamed from: f */
    public UUID f56687f;

    static {
        Covode.recordClassIndex(28065);
    }

    /* renamed from: a */
    public final long mo39442a() {
        Long l = this.f56685d;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: b */
    public final long mo39443b() {
        Long l;
        if (this.f56682a == null || (l = this.f56683b) == null) {
            return 0;
        }
        return l.longValue() - this.f56682a.longValue();
    }

    /* renamed from: c */
    public final void mo39444c() {
        C24699ae.m47299a();
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C24872m.f59047g).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f56682a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f56683b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f56684c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f56687f.toString());
        edit.apply();
        C23946k kVar = this.f56686e;
        if (kVar != null) {
            kVar.mo39445a();
        }
    }

    public C23944i(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    private C23944i(Long l, Long l2, UUID uuid) {
        this.f56682a = l;
        this.f56683b = l2;
        this.f56687f = uuid;
    }
}
