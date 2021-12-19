package com.bytedance.creativex.recorder.p938a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.a.h */
public final class C14116h {

    /* renamed from: a */
    public static final C14116h f34321a = new C14116h();

    private C14116h() {
    }

    static {
        Covode.recordClassIndex(16185);
    }

    /* renamed from: a */
    public static List<ComposerInfo> m25714a(List<BeautyComposerInfo> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        if ((!list.isEmpty()) && list != null) {
            for (T t : list) {
                C89219l.m154721d(t, "");
                arrayList.add(new ComposerInfo(t.f96060a, t.f96061b, t.f96062c));
            }
        }
        return arrayList;
    }
}
