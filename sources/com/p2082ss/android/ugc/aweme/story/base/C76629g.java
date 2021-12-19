package com.p2082ss.android.ugc.aweme.story.base;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.g */
public final class C76629g {
    static {
        Covode.recordClassIndex(89616);
    }

    /* renamed from: a */
    public static final Bundle m134217a(EnterStoryParam enterStoryParam) {
        String str;
        C89219l.m154721d(enterStoryParam, "");
        Bundle bundle = new Bundle();
        bundle.putBoolean("launch_as_activity", enterStoryParam.getLaunchAsActivity());
        bundle.putString("shoot_way", enterStoryParam.getShootWay());
        bundle.putString("enter_method", enterStoryParam.getEnterMethod());
        bundle.putString("enter_from", enterStoryParam.getEnterFrom());
        bundle.putBoolean("publish_with_anim", enterStoryParam.getNeedPublishWithAnim());
        bundle.putBoolean("is_story_mode", enterStoryParam.isStory());
        if (C89219l.m154714a((Object) enterStoryParam.getEnterMethod(), (Object) "slide_right")) {
            if (enterStoryParam.isWestWindowExist()) {
                str = "1";
            } else {
                str = "0";
            }
            bundle.putString("is_west_window_exist", str);
        }
        return bundle;
    }
}
