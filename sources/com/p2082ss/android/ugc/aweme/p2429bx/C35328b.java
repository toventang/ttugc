package com.p2082ss.android.ugc.aweme.p2429bx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75659q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bx.b */
public final class C35328b implements AbstractC75659q {
    static {
        Covode.recordClassIndex(42496);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75659q
    /* renamed from: a */
    public final Intent mo62205a(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        intent.setClass(activity, VECutVideoActivity.class);
        return intent;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75659q
    /* renamed from: a */
    public final Intent mo62206a(Activity activity, Bundle bundle, int i) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i);
        return intent;
    }
}
