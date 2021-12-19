package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3243b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.a */
public final class C55977a {

    /* renamed from: a */
    public static final C55977a f127642a = new C55977a();

    /* renamed from: b */
    private static final int f127643b = C34728n.m70946a(56.0d);

    private C55977a() {
    }

    static {
        Covode.recordClassIndex(65771);
    }

    /* renamed from: a */
    public static void m101851a(SharePackage sharePackage, View view) {
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(view, "");
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.cmu);
        ImageView imageView = (ImageView) view.findViewById(R.id.bzp);
        C24250e eVar = new C24250e();
        eVar.mo39978a(C13628n.m24520b(C17867d.m33078a(), 2.0f));
        String str = sharePackage.f155487d;
        int hashCode = str.hashCode();
        if (hashCode != 3178685) {
            if (hashCode == 603552178 && str.equals("good_window")) {
                C89219l.m154716b(remoteImageView, "");
                ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
                int i = f127643b;
                layoutParams.width = i;
                layoutParams.height = i;
                remoteImageView.setLayoutParams(layoutParams);
                eVar.f57500b = true;
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(0);
            }
        } else if (str.equals("good")) {
            imageView.setImageResource(2131232838);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(0);
        }
        C89219l.m154716b(remoteImageView, "");
        C24246a aVar = (C24246a) remoteImageView.getHierarchy();
        C89219l.m154716b(aVar, "");
        aVar.mo39959a(eVar);
    }
}
