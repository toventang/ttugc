package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ch */
public final class C48242ch {
    static {
        Covode.recordClassIndex(56984);
    }

    /* renamed from: a */
    public static void m91650a(SimpleDraweeView simpleDraweeView) {
        try {
            simpleDraweeView.setBackgroundResource(R.drawable.a15);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static void m91649a(SmartImageView smartImageView, Context context) {
        smartImageView.setImageURI(Uri.parse("res://" + context.getPackageName() + "/2131233187"));
    }
}
