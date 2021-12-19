package com.bytedance.android.live.publicscreen.impl.model;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9690bv;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.m */
public final class C6027m extends AbstractC5877k<C9690bv> {
    static {
        Covode.recordClassIndex(6638);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        String str = ((C9690bv) this.f14737d).f23599a;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(C6022k.m13206a((int) R.color.a07)), 0, spannableString.length(), 18);
        return spannableString;
    }

    public C6027m(C9690bv bvVar) {
        super(bvVar);
    }
}
