package com.p2082ss.android.ugc.aweme.multi.maker;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.k */
public final class C60252k extends C60248j {

    /* renamed from: e */
    private String f137326e = "resso_exclusive";

    static {
        Covode.recordClassIndex(70784);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.C60248j, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.ANCHOR_RESSO_EXCLUSIVE.getTYPE();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.C60248j
    /* renamed from: n */
    public final boolean mo97934n() {
        List<AnchorCommonStruct> anchors;
        Aweme o = mo97949o();
        C89219l.m154721d(mo97952r(), "");
        T t = null;
        if (!(o == null || (anchors = o.getAnchors()) == null)) {
            Iterator<T> it = anchors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                if (t2.getType() == EnumC31359ab.ANCHOR_RESSO_EXCLUSIVE.getTYPE() && !TextUtils.isEmpty(t2.getKeyword()) && !TextUtils.isEmpty(t2.getSchema()) && !TextUtils.isEmpty(t2.getDeepLink()) && !TextUtils.isEmpty(t2.getUniversalLink())) {
                    t = next;
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                Integer.valueOf(t3.getType());
                t3.getKeyword();
                return true;
            }
        }
        return false;
    }
}
