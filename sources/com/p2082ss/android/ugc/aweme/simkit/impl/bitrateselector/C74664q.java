package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74665r;
import com.p2082ss.android.ugc.playerkit.p4324d.C84189d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.q */
public final class C74664q implements AbstractC63032b {
    static {
        Covode.recordClassIndex(87487);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63033c
    /* renamed from: a */
    public final void mo101043a(int i, int i2, C63059e.C63060a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: b */
    public final boolean mo101045b(int i, int i2, C63059e eVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: a */
    public final boolean mo101044a(int i, int i2, C63059e eVar) {
        if (eVar != null && eVar.f143241f) {
            return false;
        }
        C74665r rVar = C74665r.C74667a.f167829a;
        C89219l.m154709a((Object) rVar, "");
        if (rVar.mo117469a() == null || eVar == null) {
            C74665r rVar2 = C74665r.C74667a.f167829a;
            C89219l.m154709a((Object) rVar2, "");
            rVar2.mo117469a();
            return false;
        }
        C84241i a = C84189d.m144772a(eVar);
        if (a == null) {
            return false;
        }
        AbstractC74608c a2 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a2, "");
        ISimKitConfig b = a2.mo117290b();
        C89219l.m154709a((Object) b, "");
        b.getCommonConfig().onPreGetProperBitrate(a);
        if (eVar.f143243h == null) {
            return false;
        }
        List<C63059e.C63060a> list = eVar.f143243h;
        C89219l.m154709a((Object) list, "");
        int i3 = 0;
        if (list != null) {
            while (i3 < list.size()) {
                if (list.get(i3) == null) {
                    list.remove(i3);
                } else {
                    i3++;
                }
            }
        }
        list.size();
        return false;
    }
}
