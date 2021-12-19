package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerRecommendViewModel */
public final class DuetStickerRecommendViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C1213t<LinkedHashSet<User>> f159283a = new C1213t<>();

    static {
        Covode.recordClassIndex(83621);
    }

    /* renamed from: a */
    public final void mo112412a(LinkedHashSet<User> linkedHashSet) {
        C89219l.m154721d(linkedHashSet, "");
        this.f159283a.setValue(linkedHashSet);
    }
}
