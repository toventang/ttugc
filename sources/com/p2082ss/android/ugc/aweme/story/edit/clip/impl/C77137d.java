package com.p2082ss.android.ugc.aweme.story.edit.clip.impl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77119c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.clip.impl.d */
public final class C77137d implements AbstractC77119c<VEEditClip> {

    /* renamed from: a */
    final List<VEEditClip> f173003a;

    /* renamed from: b */
    private final List<VEEditClip> f173004b;

    static {
        Covode.recordClassIndex(90142);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77119c
    public final List<VEEditClip> getClips() {
        return this.f173004b;
    }

    public C77137d() {
        ArrayList arrayList = new ArrayList();
        this.f173003a = arrayList;
        this.f173004b = arrayList;
    }

    /* renamed from: a */
    public final void add(VEEditClip vEEditClip, int i) {
        C89219l.m154721d(vEEditClip, "");
        if (i < 0 || i > this.f173003a.size()) {
            this.f173003a.add(vEEditClip);
        } else {
            this.f173003a.add(i, vEEditClip);
        }
    }
}
