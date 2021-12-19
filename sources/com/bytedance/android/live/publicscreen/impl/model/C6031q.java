package com.bytedance.android.live.publicscreen.impl.model;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.livesetting.message.LiveAnchorMessageFoldTypeSetting;
import com.bytedance.android.livesdk.model.message.C9719cc;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.q */
public class C6031q extends AbstractC5877k<C9719cc> {

    /* renamed from: e */
    private static final int f15111e = LiveAnchorMessageFoldTypeSetting.INSTANCE.getValue();

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9719cc) this.f14737d).f23688f;
    }

    static {
        Covode.recordClassIndex(6642);
    }

    /* renamed from: u */
    private boolean m13227u() {
        if (((C9719cc) this.f14737d).f23687a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo11904s() {
        if (((C9719cc) this.f14737d).f23687a == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo11905t() {
        if (((C9719cc) this.f14737d).f23687a == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: h_ */
    public final int mo10712h_() {
        if (((C9719cc) this.f14737d).f23687a == 1) {
            return 2131234679;
        }
        if (((C9719cc) this.f14737d).f23687a == 3) {
            return 2131234723;
        }
        return super.mo10712h_();
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        User user = ((C9719cc) this.f14737d).f23688f;
        C9719cc ccVar = (C9719cc) this.f14737d;
        String str = "";
        if (ccVar != null) {
            Context e = C3966y.m9669e();
            int i = (int) ccVar.f23687a;
            if (i == 1) {
                str = Build.VERSION.SDK_INT >= 24 ? C3966y.m9657a((int) R.string.e1m) : e.getResources().getString(R.string.e1m);
            } else if (i == 3) {
                str = Build.VERSION.SDK_INT >= 24 ? C3966y.m9657a((int) R.string.gsg) : e.getResources().getString(R.string.gsg);
            }
        }
        return C6022k.m13207a(user, " ", str, R.color.a1l, R.color.a07);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5871f
    /* renamed from: k */
    public final boolean mo11683k() {
        if (mo11702C()) {
            int i = f15111e;
            if ((i == 1 || (i == 2 && this.f14736c.f14757n.mo11671c())) && (mo11904s() || mo11905t() || m13227u())) {
                return true;
            }
            return false;
        } else if (mo11904s() || mo11905t() || m13227u()) {
            return true;
        } else {
            return false;
        }
    }

    public C6031q(C9719cc ccVar) {
        super(ccVar);
    }
}
