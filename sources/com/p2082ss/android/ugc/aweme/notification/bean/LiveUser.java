package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.LiveUser */
public final class LiveUser {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public final long f140446id;

    static {
        Covode.recordClassIndex(72610);
    }

    public LiveUser() {
        this(0, 1, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notification_bean_LiveUser_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m112004x2c8e5521(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ LiveUser copy$default(LiveUser liveUser, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = liveUser.f140446id;
        }
        return liveUser.copy(j);
    }

    public final LiveUser copy(long j) {
        return new LiveUser(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveUser) && this.f140446id == ((LiveUser) obj).f140446id;
        }
        return true;
    }

    public final int hashCode() {
        return m112004x2c8e5521(this.f140446id);
    }

    public final String toString() {
        return "LiveUser(id=" + this.f140446id + ")";
    }

    public LiveUser(long j) {
        this.f140446id = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveUser(long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : j);
    }
}
