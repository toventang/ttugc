package com.bytedance.android.live.publicscreen.impl.p393a;

import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.model.C6022k;
import com.bytedance.android.live.publicscreen.impl.model.chat.C5993b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.chatroom.p499ui.C7759an;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.a.b */
public final class C5896b extends C5993b {
    static {
        Covode.recordClassIndex(6503);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: o */
    public final boolean mo11689o() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.impl.model.chat.C5993b
    /* renamed from: a */
    public final CharSequence mo10374a() {
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        User user = ((C9878i) this.f14737d).f23854g;
        String a = C4054a.m9854a(((C9878i) this.f14737d).f23853f);
        if (user == null || TextUtils.isEmpty(C6581g.m14075a(user)) || TextUtils.isEmpty(C6581g.m14075a(user)) || TextUtils.isEmpty(a)) {
            return C7557c.f18769a;
        }
        C7759an anVar = new C7759an(user, C6022k.m13206a((int) R.color.a06));
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(anVar, 0, a.length(), 33);
        return spannableString;
    }

    public C5896b(C9878i iVar) {
        super(iVar);
    }
}
