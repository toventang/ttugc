package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53627f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53660b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.activity.RelationSelectActivity;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.i */
final /* synthetic */ class View$OnClickListenerC54398i implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC54386c.View$OnLongClickListenerC543892 f124614a;

    /* renamed from: b */
    private final View f124615b;

    static {
        Covode.recordClassIndex(64101);
    }

    View$OnClickListenerC54398i(AbstractC54386c.View$OnLongClickListenerC543892 r1, View view) {
        this.f124614a = r1;
        this.f124615b = view;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC54386c.View$OnLongClickListenerC543892 r5 = this.f124614a;
        Context context = this.f124615b.getContext();
        Bundle bundle = new Bundle();
        SharePackage generateSharePackage = r5.f124603b.generateSharePackage();
        Bundle bundle2 = generateSharePackage.f155492i;
        bundle2.putString("enter_method", "forward");
        bundle2.putString("platform", "chat_forward");
        bundle.putParcelable("share_package", generateSharePackage);
        bundle.putSerializable("share_content", r5.f124603b);
        bundle.putLong("forward_origin_msgid", r5.f124604c.getMsgId());
        String str = generateSharePackage.f155487d;
        if ("aweme".equals(str) || "story_video".equals(str)) {
            C19538ai aiVar = r5.f124604c;
            C89219l.m154721d(generateSharePackage, "");
            C89219l.m154721d(aiVar, "");
            String str2 = aiVar.getLocalExt().get("feed_video_status_flag");
            if (str2 == null) {
                str2 = "0";
            }
            if ((!C89219l.m154714a((Object) str2, (Object) "0")) || C53660b.m98945a(aiVar)) {
                generateSharePackage.f155492i.remove("video_cover");
            }
        }
        RelationSelectActivity.C55896a.m101700a(context, bundle);
        C53627f.m98869a(AbstractC54386c.this.f124584n.isGroupChat(), "forward");
    }
}
