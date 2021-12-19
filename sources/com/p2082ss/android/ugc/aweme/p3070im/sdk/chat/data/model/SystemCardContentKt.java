package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContentKt */
public final class SystemCardContentKt {
    static {
        Covode.recordClassIndex(63479);
    }

    public static final int colorTypeToColor(Integer num) {
        int i;
        if (!(num == null || num.intValue() == 0)) {
            if (num.intValue() == 1) {
                i = R.color.c4;
            } else if (num.intValue() == 2) {
                i = R.color.c5;
            } else if (num.intValue() == 3) {
                i = R.color.bz;
            } else if (num.intValue() == 4) {
                i = R.color.bh;
            } else if (num.intValue() == 5) {
                i = R.color.bd;
            }
            return C17867d.m33078a().getResources().getColor(i);
        }
        i = R.color.bx;
        return C17867d.m33078a().getResources().getColor(i);
    }

    public static final void open(LinkInfo linkInfo, Context context) {
        C89219l.m154721d(linkInfo, "");
        C89219l.m154721d(context, "");
        int actionType = linkInfo.getActionType();
        if (actionType == 1) {
            SmartRouter.buildRoute(context, "//webview/").withParam("url", linkInfo.getLinkUrl()).open();
        } else if (actionType == 2) {
            SmartRouter.buildRoute(context, linkInfo.getLinkUrl()).open();
        }
    }
}
