package com.bytedance.android.live.publicscreen.impl.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.p386a.p388b.C5860a;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j;
import com.bytedance.android.livesdk.model.message.C9689bu;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.n */
public final class C6028n extends AbstractC5876j<C9689bu> {

    /* renamed from: e */
    private static final String[] f15108e = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    /* renamed from: f */
    private final boolean f15109f;

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j
    /* renamed from: v */
    public final boolean mo11696v() {
        return this.f15109f;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        return ((C9689bu) this.f14737d).f23597n;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j
    /* renamed from: s */
    public final ImageModel mo11693s() {
        return ((C9689bu) this.f14737d).f23591h;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j
    /* renamed from: t */
    public final int mo11694t() {
        return ((C9689bu) this.f14737d).f23598o;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j
    /* renamed from: u */
    public final ImageModel mo11695u() {
        return ((C9689bu) this.f14737d).f23595l;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j
    /* renamed from: x */
    public final String mo11698x() {
        return ((C9689bu) this.f14737d).f23589f;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j
    /* renamed from: y */
    public final ImageModel mo11699y() {
        return ((C9689bu) this.f14737d).f23596m;
    }

    static {
        Covode.recordClassIndex(6639);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j
    /* renamed from: w */
    public final void mo11697w() {
        C6779a.m14563a().mo13053a(new C5860a((C9689bu) this.f14737d));
    }

    public C6028n(C9689bu buVar) {
        super(buVar);
        boolean z = false;
        int i = 0;
        while (true) {
            String[] strArr = f15108e;
            if (i >= strArr.length) {
                break;
            } else if (TextUtils.equals(strArr[i], buVar.f23593j)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.f15109f = z;
    }
}
