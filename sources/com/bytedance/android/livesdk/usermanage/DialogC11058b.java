package com.bytedance.android.livesdk.usermanage;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.p405s.AbstractC6100b;
import com.bytedance.android.live.p405s.AbstractC6104f;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.android.livesdk.event.C8462o;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.usermanage.b */
public final class DialogC11058b extends DialogC9148b implements AbstractC6100b {

    /* renamed from: Q */
    long f26612Q;

    /* renamed from: R */
    long f26613R;

    /* renamed from: S */
    Context f26614S;

    /* renamed from: T */
    AbstractC6104f f26615T;

    /* renamed from: U */
    private long f26616U;

    static {
        Covode.recordClassIndex(12679);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: a */
    public final void mo11962a() {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: b */
    public final void mo11964b(C6099c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: d */
    public final void mo11966d() {
    }

    /* renamed from: b */
    public static boolean m19687b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<String, String> mo17886c() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f26616U));
        hashMap.put("room_id", String.valueOf(this.f26612Q));
        hashMap.put("user_id", String.valueOf(this.f26613R));
        if (C11115u.m19743a().mo17915b().mo13161c() == this.f26616U) {
            str = "anchor";
        } else {
            str = "admin";
        }
        hashMap.put("admin_type", str);
        return hashMap;
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: b */
    public final void mo11965b(boolean z) {
        if (isShowing()) {
            dismiss();
            C6779a.m14563a().mo13053a(new C11061e(0));
        }
        C6779a.m14563a().mo13053a(new C8462o(true, this.f26613R));
    }

    @Override // com.bytedance.android.livesdk.p562k.DialogC9148b
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22201b = getContext().getString(R.string.glh);
        String string = getContext().getString(R.string.gw2);
        DialogInterface$OnClickListenerC11059c cVar = new DialogInterface$OnClickListenerC11059c(this);
        this.f22209j = string;
        this.f22217r = cVar;
        String string2 = getContext().getString(R.string.gw0);
        DialogInterface$OnClickListenerC11060d dVar = new DialogInterface$OnClickListenerC11060d(this);
        this.f22210k = string2;
        this.f22218s = dVar;
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6100b
    /* renamed from: a */
    public final void mo11963a(boolean z, Exception exc) {
        C11264f.m19957a(getContext(), exc);
        if (isShowing()) {
            dismiss();
            C6779a.m14563a().mo13053a(new C11061e(0));
        }
    }

    public DialogC11058b(Context context, long j, long j2, long j3, AbstractC6104f fVar) {
        super(context);
        this.f26614S = context;
        this.f26612Q = j;
        this.f26616U = j2;
        this.f26613R = j3;
        this.f26615T = fVar;
    }
}
