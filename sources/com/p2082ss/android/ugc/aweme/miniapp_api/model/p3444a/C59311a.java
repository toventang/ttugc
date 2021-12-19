package com.p2082ss.android.ugc.aweme.miniapp_api.model.p3444a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a.a */
public final class C59311a implements Serializable {
    public int code;
    public String message;
    public boolean success;
    public String type;

    static {
        Covode.recordClassIndex(69689);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean isSuccess() {
        return this.success;
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a.a$a */
    public static final class C59312a {

        /* renamed from: a */
        public String f135523a;

        /* renamed from: b */
        public int f135524b;

        /* renamed from: c */
        public String f135525c;

        /* renamed from: d */
        private boolean f135526d;

        static {
            Covode.recordClassIndex(69690);
        }

        /* renamed from: a */
        public final C59311a mo96909a() {
            C59311a aVar = new C59311a();
            aVar.type = this.f135523a;
            aVar.message = this.f135525c;
            aVar.code = this.f135524b;
            aVar.success = this.f135526d;
            return aVar;
        }
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
