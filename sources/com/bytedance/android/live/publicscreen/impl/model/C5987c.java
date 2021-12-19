package com.bytedance.android.live.publicscreen.impl.model;

import android.content.res.Resources;
import android.os.Build;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.c */
public final class C5987c extends AbstractC5877k<C9883n> {
    static {
        Covode.recordClassIndex(6597);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        C9883n nVar = (C9883n) this.f14737d;
        if (nVar == null) {
            return "";
        }
        Resources resources = C3966y.m9669e().getResources();
        int i = nVar.f23882a;
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            if (Build.VERSION.SDK_INT >= 24) {
                return C3966y.m9657a((int) R.string.gr5);
            }
            return resources.getString(R.string.gr5);
        } else if (Build.VERSION.SDK_INT >= 24) {
            return C3966y.m9657a((int) R.string.gpd);
        } else {
            return resources.getString(R.string.gpd);
        }
    }

    public C5987c(C9883n nVar) {
        super(nVar);
    }
}
