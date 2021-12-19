package com.bytedance.android.live.publicscreen.impl.model;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9726ci;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.s */
public final class C6035s extends AbstractC5877k<C9726ci> {

    /* renamed from: e */
    private AbstractC2994b f15113e = C2997d.C2998a.m8305a();

    static {
        Covode.recordClassIndex(6646);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9726ci) this.f14737d).f23719a;
    }

    /* renamed from: s */
    private int m13237s() {
        if (this.f15113e == null || ((C9726ci) this.f14737d).f23719a == null) {
            return 0;
        }
        return R.color.a18;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        String str;
        String str2;
        if (!(this.f15113e == null || ((C9726ci) this.f14737d).f23719a == null)) {
            if (this.f15113e.getId() == ((C9726ci) this.f14737d).f23719a.getId() && ((C9726ci) this.f14737d).f23720f != null) {
                C6779a.m14563a().mo13053a(new C6036a(((C9726ci) this.f14737d).f23720f.f23724d));
            }
        }
        User user = ((C9726ci) this.f14737d).f23719a;
        C9726ci.C9727a aVar = ((C9726ci) this.f14737d).f23720f;
        if (user != null) {
            str = user.getNickName();
        } else {
            str = null;
        }
        if (aVar != null) {
            str2 = String.valueOf(aVar.f23721a);
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + C3966y.m9660a((int) R.string.gtn, str2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3966y.m9663b(m13237s())), 0, str.length(), 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3966y.m9663b((int) R.color.a17)), str.length(), str.length() + 6, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3966y.m9663b(m13237s())), str.length() + 6, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.s$a */
    public static class C6036a {

        /* renamed from: a */
        public String f15114a;

        static {
            Covode.recordClassIndex(6647);
        }

        C6036a(String str) {
            this.f15114a = str;
        }
    }

    public C6035s(C9726ci ciVar) {
        super(ciVar);
    }
}
