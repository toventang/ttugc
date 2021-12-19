package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.model.emoji.C2972a;
import com.bytedance.android.livesdkapi.host.AbstractC11799c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46595g;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46605i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.t */
public final class C58703t implements AbstractC11799c {
    static {
        Covode.recordClassIndex(69005);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11799c
    /* renamed from: b */
    public final boolean mo18861b() {
        C46595g.C46596a.m89935a();
        return C46597h.m89940b(4);
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11799c
    /* renamed from: a */
    public final List<C2972a> mo18860a() {
        C46595g.C46596a.m89935a();
        List<C46605i> a = C46595g.m89932a(4);
        ArrayList arrayList = new ArrayList();
        for (C46605i iVar : a) {
            C2972a aVar = new C2972a();
            aVar.f8734a = iVar.getPreviewEmoji();
            List<String> emojiList = iVar.getEmojiList();
            if (emojiList == null) {
                emojiList = new ArrayList<>();
            }
            aVar.f8735b.addAll(emojiList);
            aVar.f8737d = iVar.getMiniSupportSysVersion();
            aVar.f8736c = iVar.getBusinessType();
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
