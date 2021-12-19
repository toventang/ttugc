package com.p2082ss.android.ugc.aweme.recommend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.recommend.g */
public final class C66623g implements Serializable {
    public static final C66624a Companion = new C66624a((byte) 0);

    /* renamed from: a */
    private final String f149752a;

    /* renamed from: b */
    private final String f149753b;

    /* renamed from: c */
    private final C59256u.EnumC59259c f149754c;

    /* renamed from: d */
    private final String f149755d;

    /* renamed from: e */
    private final C59256u.EnumC59258b f149756e;

    /* renamed from: f */
    private final String f149757f;

    /* renamed from: g */
    private final String f149758g;

    /* renamed from: h */
    private final String f149759h;

    /* renamed from: i */
    private final String f149760i;

    /* renamed from: j */
    private final String f149761j;

    /* renamed from: k */
    private final String f149762k;

    /* renamed from: l */
    private final String f149763l;

    static {
        Covode.recordClassIndex(78181);
    }

    public static final C59256u.EnumC59258b getFollowType(User user) {
        return C66624a.m118386a(user);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.g$a */
    public static final class C66624a {
        static {
            Covode.recordClassIndex(78182);
        }

        private C66624a() {
        }

        public /* synthetic */ C66624a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C59256u.EnumC59258b m118386a(User user) {
            if (user == null) {
                return null;
            }
            if (user.getFollowerStatus() == 1) {
                return C59256u.EnumC59258b.MUTUAL;
            }
            return C59256u.EnumC59258b.SINGLE;
        }
    }

    public final String getAuthorId() {
        return this.f149759h;
    }

    public final String getEnterFrom() {
        return this.f149752a;
    }

    public final C59256u.EnumC59258b getFollowType() {
        return this.f149756e;
    }

    public final String getFriendTypeStr() {
        return this.f149762k;
    }

    public final String getGroupId() {
        return this.f149758g;
    }

    public final String getHomepageUserId() {
        return this.f149761j;
    }

    public final String getPreviousPage() {
        return this.f149753b;
    }

    public final String getRecType() {
        return this.f149755d;
    }

    public final String getReqId() {
        return this.f149760i;
    }

    public final C59256u.EnumC59259c getSceneType() {
        return this.f149754c;
    }

    public final String getSocialInfo() {
        return this.f149763l;
    }

    public final String getToUserId() {
        return this.f149757f;
    }

    public C66623g(String str, String str2, C59256u.EnumC59259c cVar, String str3, C59256u.EnumC59258b bVar, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f149752a = str;
        this.f149753b = str2;
        this.f149754c = cVar;
        this.f149755d = str3;
        this.f149756e = bVar;
        this.f149757f = str4;
        this.f149758g = str5;
        this.f149759h = str6;
        this.f149760i = str7;
        this.f149761j = str8;
        this.f149762k = str9;
        this.f149763l = str10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C66623g(String str, String str2, C59256u.EnumC59259c cVar, String str3, C59256u.EnumC59258b bVar, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, C89214g gVar) {
        this(str, str2, cVar, str3, bVar, str4, str5, str6, str7, str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? null : str10);
    }
}
