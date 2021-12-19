package com.bytedance.creativex.recorder.p938a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.a.f */
public final class C14109f {

    /* renamed from: a */
    public static final C14109f f34306a = new C14109f();

    private C14109f() {
    }

    static {
        Covode.recordClassIndex(16178);
    }

    /* renamed from: a */
    public static final List<BeautyComposerInfo> m25704a(List<BeautyComposerInfo> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!C89219l.m154714a((Object) t.f96060a, (Object) "EFFECT_ID_TYPE_FILTER")) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
