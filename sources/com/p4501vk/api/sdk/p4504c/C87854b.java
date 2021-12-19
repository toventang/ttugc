package com.p4501vk.api.sdk.p4504c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.c.b */
public final class C87854b extends C87852a {
    public static final C87855a Companion = new C87855a((byte) 0);
    public static final long serialVersionUID = 7524047853274172872L;

    /* renamed from: a */
    private final int f199558a;

    /* renamed from: b */
    private final String f199559b;

    /* renamed from: c */
    private final boolean f199560c;

    /* renamed from: d */
    private final String f199561d;

    /* renamed from: e */
    private final Bundle f199562e;

    /* renamed from: f */
    private final List<C87854b> f199563f;

    /* renamed from: g */
    private final String f199564g;

    static {
        Covode.recordClassIndex(103864);
    }

    public C87854b(int i, String str, boolean z, String str2) {
        this(i, str, z, str2, null, null, null, 112, null);
    }

    public C87854b(int i, String str, boolean z, String str2, Bundle bundle) {
        this(i, str, z, str2, bundle, null, null, 96, null);
    }

    public C87854b(int i, String str, boolean z, String str2, Bundle bundle, List<? extends C87854b> list) {
        this(i, str, z, str2, bundle, list, null, 64, null);
    }

    /* renamed from: com.vk.api.sdk.c.b$a */
    public static final class C87855a {
        static {
            Covode.recordClassIndex(103865);
        }

        private C87855a() {
        }

        public /* synthetic */ C87855a(byte b) {
            this();
        }
    }

    public final String getApiMethod() {
        return this.f199559b;
    }

    public final int getCode() {
        return this.f199558a;
    }

    public final String getDetailMessage() {
        return this.f199561d;
    }

    public final String getErrorMsg() {
        return this.f199564g;
    }

    public final List<C87854b> getExecuteErrors() {
        return this.f199563f;
    }

    public final Bundle getExtra() {
        return this.f199562e;
    }

    public final boolean getHasLocalizedMessage() {
        return this.f199560c;
    }

    public final String getExtensionHash() {
        String string;
        Bundle bundle = this.f199562e;
        if (bundle == null || (string = bundle.getString("extend_hash", null)) == null) {
            return "";
        }
        return string;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f199558a * 31;
        Bundle bundle = this.f199562e;
        if (bundle != null) {
            i = bundle.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final boolean isCaptchaError() {
        if (this.f199558a == 14) {
            return true;
        }
        return false;
    }

    public final boolean isCompositeError() {
        if (this.f199558a == Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean isInternalServerError() {
        int i = this.f199558a;
        if (i == 1 || i == 10 || i == 13) {
            return true;
        }
        return false;
    }

    public final boolean isInvalidCredentialsError() {
        int i = this.f199558a;
        if (i == 4 || i == 5) {
            return true;
        }
        return false;
    }

    public final boolean isPasswordConfirmRequired() {
        if (this.f199558a == 3609) {
            return true;
        }
        return false;
    }

    public final boolean isTokenConfirmationRequired() {
        if (this.f199558a == 25) {
            return true;
        }
        return false;
    }

    public final boolean isTooManyRequestsError() {
        if (this.f199558a != 6) {
            return false;
        }
        return true;
    }

    public final boolean isUserConfirmRequired() {
        if (this.f199558a == 24) {
            return true;
        }
        return false;
    }

    public final boolean isValidationRequired() {
        if (this.f199558a == 17) {
            return true;
        }
        return false;
    }

    public final String getCaptchaImg() {
        String string;
        Bundle bundle = this.f199562e;
        if (bundle == null || (string = bundle.getString("captcha_img", "")) == null) {
            return "";
        }
        return string;
    }

    public final String getCaptchaSid() {
        String string;
        Bundle bundle = this.f199562e;
        if (bundle == null || (string = bundle.getString("captcha_sid", "")) == null) {
            return "";
        }
        return string;
    }

    public final JSONObject getUserBanInfo() {
        String string;
        Bundle bundle = this.f199562e;
        if (bundle == null || (string = bundle.getString("user_ban_info")) == null) {
            return null;
        }
        return new JSONObject(string);
    }

    public final String getUserConfirmText() {
        String string;
        Bundle bundle = this.f199562e;
        if (bundle == null || (string = bundle.getString("confirmation_text", "")) == null) {
            return "";
        }
        return string;
    }

    public final String getValidationUrl() {
        String string;
        Bundle bundle = this.f199562e;
        if (bundle == null || (string = bundle.getString("validation_url", "")) == null) {
            return "";
        }
        return string;
    }

    public final boolean hasExtra() {
        Bundle bundle = this.f199562e;
        if (bundle == null || !(!C89219l.m154714a(bundle, Bundle.EMPTY))) {
            return false;
        }
        return true;
    }

    public final boolean isAccessError() {
        int i = this.f199558a;
        if (i == 15 || i == 30 || i == 203 || i == 200 || i == 201) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("VKApiExecutionException{code=").append(this.f199558a).append(", extra=").append(this.f199562e).append(", method=").append(this.f199559b).append(", executeErrors=");
        List<C87854b> list = this.f199563f;
        if (list != null) {
            str = C89070n.m154551a(list, (CharSequence) null, "[", "]", 0, (CharSequence) null, (AbstractC89172b) null, 57);
        } else {
            str = null;
        }
        return append.append(str).append(", super=").append(super.toString()).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87854b)) {
            return false;
        }
        C87854b bVar = (C87854b) obj;
        if (this.f199558a == bVar.f199558a) {
            Bundle bundle = this.f199562e;
            Bundle bundle2 = bVar.f199562e;
            if (bundle == null ? bundle2 == null : !(!C89219l.m154714a(bundle, bundle2))) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasError(int i) {
        if (this.f199558a == i) {
            return true;
        }
        List<C87854b> list = this.f199563f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.f199558a == i) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.vk.api.sdk.c.b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87854b(int i, String str, boolean z, String str2, Bundle bundle, List<? extends C87854b> list, String str3) {
        super(str2);
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f199558a = i;
        this.f199559b = str;
        this.f199560c = z;
        this.f199561d = str2;
        this.f199562e = bundle;
        this.f199563f = list;
        this.f199564g = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C87854b(int i, String str, boolean z, String str2, Bundle bundle, List list, String str3, int i2, C89214g gVar) {
        this(i, str, z, str2, (i2 & 16) != 0 ? Bundle.EMPTY : bundle, (i2 & 32) != 0 ? null : list, (i2 & 64) == 0 ? str3 : null);
    }
}
