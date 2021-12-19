package com.p2082ss.android.ugc.aweme.net.p3493f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.p1902j.p1903a.C24804d;

/* renamed from: com.ss.android.ugc.aweme.net.f.c */
public final class C61345c implements AbstractC61346d {

    /* renamed from: a */
    private boolean f139320a;

    /* renamed from: b */
    private String f139321b;

    static {
        Covode.recordClassIndex(71978);
    }

    @Override // com.p2082ss.android.ugc.aweme.net.p3493f.AbstractC61346d
    /* renamed from: a */
    public final void mo98954a(String str) {
        if (!this.f139320a) {
            C24804d.C24805a.f58857a.mo40617a();
            this.f139321b = str;
            this.f139320a = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.p3493f.AbstractC61346d
    /* renamed from: b */
    public final void mo98955b(String str) {
        if (this.f139320a && TextUtils.equals(this.f139321b, str)) {
            C24804d.C24805a.f58857a.mo40618b();
            this.f139320a = false;
        }
    }
}
