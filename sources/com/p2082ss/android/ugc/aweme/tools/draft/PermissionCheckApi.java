package com.p2082ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.io.Serializable;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.PermissionCheckApi */
public final class PermissionCheckApi {

    /* renamed from: a */
    public static final C78118a f175439a = new C78118a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.PermissionCheckApi$CheckPermissionRequest */
    public interface CheckPermissionRequest {
        static {
            Covode.recordClassIndex(91230);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/permission/check/")
        AbstractC21983b<C78210be> checkPermission(@AbstractC22018z(mo35807a = "check_entities") C78119b bVar);
    }

    static {
        Covode.recordClassIndex(91229);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.PermissionCheckApi$a */
    public static final class C78118a {
        static {
            Covode.recordClassIndex(91231);
        }

        private C78118a() {
        }

        public /* synthetic */ C78118a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C78210be m136578a(C78119b bVar) {
            C89219l.m154721d(bVar, "");
            try {
                return ((CheckPermissionRequest) C63244g.m114602a().mo73257C().createRetrofit(C63244g.m114602a().mo73257C().getApiHost(), true, CheckPermissionRequest.class)).checkPermission(bVar).execute().f52262b;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("permission check failed: ");
                e.printStackTrace();
                C73991bj.m130128a(sb.append(C89391z.f203057a).toString());
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.PermissionCheckApi$c */
    public static final class C78120c implements Serializable {
        @AbstractC27891c(mo46611a = "id_type")

        /* renamed from: a */
        private int f175441a;
        @AbstractC27891c(mo46611a = "id")

        /* renamed from: b */
        private String f175442b = "";
        @AbstractC27891c(mo46611a = "check_type")

        /* renamed from: c */
        private int f175443c;

        static {
            Covode.recordClassIndex(91233);
        }

        public final int getCheckType() {
            return this.f175443c;
        }

        public final String getId() {
            return this.f175442b;
        }

        public final int getIdType() {
            return this.f175441a;
        }

        public final void setCheckType(int i) {
            this.f175443c = i;
        }

        public final void setIdType(int i) {
            this.f175441a = i;
        }

        public final void setId(String str) {
            C89219l.m154721d(str, "");
            this.f175442b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.PermissionCheckApi$b */
    public static final class C78119b {

        /* renamed from: a */
        public List<C78120c> f175440a;

        static {
            Covode.recordClassIndex(91232);
        }

        public final String toString() {
            String b = new C27910f().mo46674b(this.f175440a);
            C89219l.m154716b(b, "");
            return b;
        }
    }
}
