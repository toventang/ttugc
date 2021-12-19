package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a */
public final class C70825a {
    static {
        Covode.recordClassIndex(83316);
    }

    /* renamed from: a */
    public static final int m125084a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !videoPublishEditModel.isFastImport) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static final boolean m125085a(Effect effect) {
        String effectId;
        Integer e;
        if (effect == null || (effectId = effect.getEffectId()) == null || (e = C89361p.m154863e(effectId)) == null || e.intValue() < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final String m125087b(Effect effect) {
        List<String> tags;
        Boolean bool;
        boolean z;
        if (!(effect == null || (tags = effect.getTags()) == null)) {
            Iterator<T> it = tags.iterator();
            while (true) {
                bool = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t = next;
                if (t != null) {
                    if (t.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                if (bool.booleanValue()) {
                    bool = next;
                    break;
                }
            }
            String str = (String) bool;
            if (str == null) {
                return "";
            }
            return str;
        }
        return "";
    }

    /* renamed from: a */
    public static final boolean m125086a(Effect effect, String str) {
        List<String> tags;
        if (str != null && effect != null && (tags = effect.getTags()) != null) {
            Iterator<T> it = tags.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next, (Object) str)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
