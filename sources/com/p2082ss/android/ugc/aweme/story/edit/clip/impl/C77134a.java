package com.p2082ss.android.ugc.aweme.story.edit.clip.impl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.C77118b;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import dmt.p4542av.video.p4545b.AbstractC88181j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.clip.impl.a */
public final class C77134a {
    static {
        Covode.recordClassIndex(90139);
    }

    /* renamed from: a */
    public static final AbstractC31071f m134735a(VEEditClip vEEditClip) {
        C89219l.m154721d(vEEditClip, "");
        return vEEditClip.mo120644b().mo142739b();
    }

    /* renamed from: c */
    public static final VEEditClip m134738c(AbstractC77135b bVar) {
        C89219l.m154721d(bVar, "");
        return (VEEditClip) C77118b.m134706a(bVar.cF_());
    }

    /* renamed from: d */
    public static final StoryEditClipModel m134739d(AbstractC77135b bVar) {
        C89219l.m154721d(bVar, "");
        VEEditClip c = m134738c(bVar);
        if (c != null) {
            return c.f172984g;
        }
        return null;
    }

    /* renamed from: a */
    public static final AbstractC88181j m134736a(AbstractC77135b bVar) {
        C89219l.m154721d(bVar, "");
        VEEditClip c = m134738c(bVar);
        if (c != null) {
            return c.mo120644b();
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC31071f m134737b(AbstractC77135b bVar) {
        C89219l.m154721d(bVar, "");
        VEEditClip c = m134738c(bVar);
        if (c != null) {
            return m134735a(c);
        }
        return null;
    }
}
