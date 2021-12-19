package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4034a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71027i;
import com.p2082ss.android.ugc.aweme.sticker.C75864s;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.a.d */
public final class C76862d extends C75864s {

    /* renamed from: b */
    public boolean f172495b = true;

    static {
        Covode.recordClassIndex(89858);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.C75864s
    /* renamed from: c */
    public final boolean mo119533c() {
        if (!this.f172495b || !C16048b.m29633a().mo25421a(true, "story_editpage_enable_stickerpanel_swipup", false)) {
            return false;
        }
        return true;
    }

    public C76862d(AbstractC71027i iVar, View view) {
        super(iVar, view);
    }
}
