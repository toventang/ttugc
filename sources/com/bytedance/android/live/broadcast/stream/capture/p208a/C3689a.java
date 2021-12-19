package com.bytedance.android.live.broadcast.stream.capture.p208a;

import android.text.TextUtils;
import com.bytedance.android.live.effect.model.AbstractC4314d;
import com.bytedance.android.live.effect.model.C4309a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bytedance.android.live.broadcast.stream.capture.a.a */
public class C3689a extends C4309a {
    static {
        Covode.recordClassIndex(4202);
    }

    /* renamed from: a */
    public final void mo8971a() {
        if (this.f11846a != null) {
            this.f11846a.mo8994a();
        }
    }

    /* renamed from: b */
    public final void mo8980b(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            this.f11846a.mo8990a(strArr);
        }
    }

    /* renamed from: c */
    public final void mo8982c(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            this.f11846a.mo9003b(strArr);
        }
    }

    /* renamed from: a */
    public final void mo8972a(int i) {
        if (i < 0) {
            throw new IllegalStateException("mode is " + i + "order type is 0");
        } else if (this.f11846a != null) {
            this.f11846a.mo8987a(i);
        }
    }

    /* renamed from: a */
    public final void mo8977a(boolean z) {
        if (this.f11846a != null) {
            this.f11846a.mo9002a(z);
        }
    }

    /* renamed from: a */
    public final void mo8978a(String[] strArr) {
        int i;
        if (this.f11846a != null) {
            AbstractC4314d dVar = this.f11846a;
            if (strArr != null) {
                i = strArr.length;
            } else {
                i = 0;
            }
            dVar.mo8991a(strArr, i);
        }
    }

    /* renamed from: b */
    public final void mo8981b(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr.length != 0) {
            this.f11846a.mo8993a(strArr, strArr2);
        }
    }

    /* renamed from: a */
    public final void mo8973a(String str, String str2) {
        if ("".equals(str)) {
            throw new RuntimeException("renderCacheKey is Null");
        } else if ("".equals(str2)) {
            throw new RuntimeException("resPath is Null");
        } else if (this.f11846a != null) {
            this.f11846a.mo9000a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo8976a(String str, boolean z) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            throw new FileNotFoundException("Filter file not exists:".concat(String.valueOf(str)));
        } else if (this.f11846a != null) {
            this.f11846a.mo9001a(str, z);
        }
    }

    /* renamed from: a */
    public final void mo8979a(String[] strArr, String[] strArr2) {
        if (this.f11846a != null) {
            this.f11846a.mo8992a(strArr, strArr.length, strArr2);
        }
    }

    /* renamed from: a */
    public final void mo8975a(String str, String str2, int[] iArr) {
        this.f11846a.mo8989a(str, str2, iArr);
    }

    /* renamed from: a */
    public final void mo8974a(String str, String str2, float f) {
        if (this.f11846a != null) {
            this.f11846a.mo8988a(str, str2, f);
        }
    }
}
