package com.p2082ss.android.ugc.aweme.emoji.systembigemoji;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.C46516b;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.PreloadBigEmojiTask */
public final class PreloadBigEmojiTask implements AbstractC58264w {

    /* renamed from: a */
    public final LinkedHashMap<C46516b, List<C46534a>> f108702a;

    static {
        Covode.recordClassIndex(55206);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    public PreloadBigEmojiTask(LinkedHashMap<C46516b, List<C46534a>> linkedHashMap) {
        this.f108702a = linkedHashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C51423a.m95784a(3, null, "PreloadBigEmojiTask begin preloadBigEmoji");
        LinkedHashMap<C46516b, List<C46534a>> linkedHashMap = this.f108702a;
        if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
            for (Map.Entry<C46516b, List<C46534a>> entry : this.f108702a.entrySet()) {
                C46516b key = entry.getKey();
                List<C46534a> value = entry.getValue();
                if ((value == null || value.isEmpty()) && key != null) {
                    C46616a.m89981a(key);
                }
            }
        }
    }
}
