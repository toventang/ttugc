package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.rank.api.model.h */
public class C10354h implements AbstractC10351e<C10354h> {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public User f25015a;
    @AbstractC27891c(mo46611a = "score")

    /* renamed from: b */
    public long f25016b;
    @AbstractC27891c(mo46611a = "rank")

    /* renamed from: c */
    public int f25017c;
    @AbstractC27891c(mo46611a = "gap_description")

    /* renamed from: d */
    public String f25018d;
    @AbstractC27891c(mo46611a = "delta")

    /* renamed from: e */
    public long f25019e;
    @AbstractC27891c(mo46611a = "rich_description")

    /* renamed from: f */
    public String f25020f;
    @AbstractC27891c(mo46611a = "city_code")

    /* renamed from: g */
    public String f25021g;
    @AbstractC27891c(mo46611a = "gap_rich_description")

    /* renamed from: h */
    public String f25022h;
    @AbstractC27891c(mo46611a = "user_restriction_level")

    /* renamed from: i */
    public int f25023i;

    static {
        Covode.recordClassIndex(11922);
    }

    /* renamed from: a */
    private long m18831a() {
        User user = this.f25015a;
        if (user == null) {
            return 0;
        }
        return user.getLiveRoomId();
    }

    public int hashCode() {
        int a = (((((int) (((long) (((int) this.f25016b) * 37)) + m18831a())) * 37) + this.f25015a.hashCode()) * 37) + this.f25017c;
        String str = this.f25018d;
        if (str != null) {
            return (a * 37) + str.hashCode();
        }
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.livesdk.rank.api.model.AbstractC10351e
    /* renamed from: a */
    public final /* synthetic */ boolean mo17142a(C10354h hVar) {
        if (this.f25015a.getId() == hVar.f25015a.getId()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals */
    public boolean mo17143b(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10354h)) {
            return false;
        }
        C10354h hVar = (C10354h) obj;
        long a = m18831a();
        if (this.f25016b == hVar.f25016b && a == hVar.m18831a() && this.f25017c == hVar.f25017c && this.f25015a.equals(hVar.f25015a) && (str = this.f25018d) != null) {
            return str.equals(hVar.f25018d);
        }
        return true;
    }
}
