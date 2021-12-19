package com.p2082ss.android.ugc.aweme.story.edit.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.C76757c;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.model.c */
public final class C77156c {

    /* renamed from: a */
    private final Map<String, AbstractC70977bq> f173086a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(90164);
    }

    /* renamed from: a */
    public final AbstractC70977bq mo120775a(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        AbstractC70977bq bqVar = this.f173086a.get(storyEditClipModel.getClipId());
        if (bqVar != null) {
            return bqVar;
        }
        C76757c cVar = new C76757c(storyEditClipModel);
        this.f173086a.put(storyEditClipModel.getClipId(), cVar);
        return cVar;
    }
}
