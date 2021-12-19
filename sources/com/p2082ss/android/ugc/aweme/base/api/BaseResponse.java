package com.p2082ss.android.ugc.aweme.base.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.api.BaseResponse */
public class BaseResponse extends AbstractC34479a {
    public int error_code;
    public ServerTimeExtra extra;
    public Map<String, String> extraMap;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    static {
        Covode.recordClassIndex(41432);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.ugc.aweme.base.api.BaseResponse */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a
    public <T> T checkValid() {
        checkStatusCode();
        super.checkValid();
        return this;
    }

    private void checkStatusCode() {
        if (this.status_code != 0) {
            throw new C34485a(this.status_code).setErrorMsg(this.status_msg).setPrompt(this.prompts).setResponse(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra */
    public static class ServerTimeExtra {
        public String logid;
        public long now;

        static {
            Covode.recordClassIndex(41433);
        }

        public String toString() {
            return "{now=" + this.now + ", logid='" + this.logid + '\'' + '}';
        }
    }

    public String toString() {
        return "BaseResponse{status_code=" + this.status_code + ", message='" + this.message + '\'' + ", status_msg='" + this.status_msg + '\'' + ", prompts='" + this.prompts + '\'' + ", extra=" + this.extra + '}';
    }
}
