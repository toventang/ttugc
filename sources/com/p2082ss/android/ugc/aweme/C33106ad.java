package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad */
public final class C33106ad {

    /* renamed from: a */
    public static final C33106ad f78679a = new C33106ad();

    private C33106ad() {
    }

    static {
        Covode.recordClassIndex(39918);
    }

    /* renamed from: a */
    public static AnchorCommonStruct m67807a(Aweme aweme, Context context) {
        List<AnchorCommonStruct> anchors;
        C89219l.m154721d(context, "");
        T t = null;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<T> it = anchors.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t2 = next;
            if (t2.getType() == EnumC31359ab.ANCHOR_RESSO.getTYPE() && !TextUtils.isEmpty(t2.getKeyword()) && !TextUtils.isEmpty(t2.getSchema()) && !TextUtils.isEmpty(t2.getDeepLink()) && !TextUtils.isEmpty(t2.getUniversalLink())) {
                t = next;
                break;
            }
        }
        return t;
    }
}
