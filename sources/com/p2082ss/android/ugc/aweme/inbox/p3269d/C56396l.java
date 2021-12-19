package com.p2082ss.android.ugc.aweme.inbox.p3269d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.d.l */
public final class C56396l<TYPE> {

    /* renamed from: d */
    public static final C56397a f128636d = new C56397a((byte) 0);

    /* renamed from: a */
    public final TYPE f128637a;

    /* renamed from: b */
    public final Throwable f128638b;

    /* renamed from: c */
    public final String f128639c;

    static {
        Covode.recordClassIndex(66216);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56396l)) {
            return false;
        }
        C56396l lVar = (C56396l) obj;
        return C89219l.m154714a(this.f128637a, lVar.f128637a) && C89219l.m154714a(this.f128638b, lVar.f128638b) && C89219l.m154714a(this.f128639c, lVar.f128639c);
    }

    public final int hashCode() {
        TYPE type = this.f128637a;
        int i = 0;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        Throwable th = this.f128638b;
        int hashCode2 = (hashCode + (th != null ? th.hashCode() : 0)) * 31;
        String str = this.f128639c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "RespMetaData(result=" + ((Object) this.f128637a) + ", error=" + this.f128638b + ", logId=" + this.f128639c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.l$a */
    public static final class C56397a {
        static {
            Covode.recordClassIndex(66217);
        }

        private C56397a() {
        }

        public /* synthetic */ C56397a(byte b) {
            this();
        }

        /* renamed from: a */
        public static <TYPE> C56396l<TYPE> m102365a(Throwable th) {
            String str;
            BaseResponse.ServerTimeExtra serverTimeExtra;
            C89219l.m154721d(th, "");
            if (!(th instanceof C34485a)) {
                return new C56396l<>(null, th, null);
            }
            Object rawResponse = ((C34485a) th).getRawResponse();
            if (!(rawResponse instanceof BaseResponse)) {
                rawResponse = null;
            }
            BaseResponse baseResponse = (BaseResponse) rawResponse;
            if (baseResponse == null || (serverTimeExtra = baseResponse.extra) == null) {
                str = null;
            } else {
                str = serverTimeExtra.logid;
            }
            return new C56396l<>(null, th, str);
        }
    }

    public C56396l(TYPE type, Throwable th, String str) {
        this.f128637a = type;
        this.f128638b = th;
        this.f128639c = str;
    }
}
