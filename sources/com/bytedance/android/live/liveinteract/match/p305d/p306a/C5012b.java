package com.bytedance.android.live.liveinteract.match.p305d.p306a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.model.message.C9615ao;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.match.d.a.b */
public final class C5012b extends AbstractC5877k<C9615ao> {
    static {
        Covode.recordClassIndex(5595);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        return ((C9615ao) this.f14737d).f23369i.f23479a.f23487a;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: h_ */
    public final int mo10712h_() {
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            return 2131234643;
        }
        return 2131234662;
    }

    public C5012b(C9615ao aoVar) {
        super(aoVar);
    }
}
