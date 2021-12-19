package com.p2082ss.android.ugc.aweme.story.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.services.story.IStoryService;
import com.p2082ss.android.ugc.aweme.services.story.IStoryView;
import com.p2082ss.android.ugc.aweme.story.base.p4023ui.C76640a;
import com.p2082ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77610d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.f */
public final class C76628f implements IStoryService {
    static {
        Covode.recordClassIndex(89615);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryService
    public final IStoryView createStoryView(EnterStoryParam enterStoryParam) {
        C89219l.m154721d(enterStoryParam, "");
        C76640a aVar = new C76640a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("enter_story_param", enterStoryParam);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryService
    public final void showPublishingToast(Context context) {
        C89219l.m154721d(context, "");
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        new C79459a(applicationContext).mo123050a(R.string.f94).mo123053a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryService
    public final void startStoryActivity(Context context, EnterStoryParam enterStoryParam) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(enterStoryParam, "");
        if (StoryPublishServiceImpl.m135314a().isPublishing(context)) {
            showPublishingToast(context);
        } else if (C63244g.m114602a().mo73287o().mo104784d() && C63244g.m114602a().mo73287o().mo104786f()) {
            showPublishingToast(context);
        } else if (enterStoryParam.isStory()) {
            SmartRouter.buildRoute(context, "//studio/story").withNavArg(new StoryActivityArg(EnterStoryParam.copy$default(enterStoryParam, null, null, null, false, true, false, false, 111, null))).open();
        } else {
            Bundle a = C76629g.m134217a(enterStoryParam);
            a.putInt("translation_type", 6);
            if (context instanceof Activity) {
                C77610d.m135605a(a, (Activity) context, false);
                return;
            }
            throw new IllegalArgumentException("use activity as context to launch record page please");
        }
    }
}
