package com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49772a;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.p.b.a.c */
public final class C49788c implements AbstractC49787b {

    /* renamed from: a */
    public Activity f114536a;

    /* renamed from: b */
    public View f114537b;

    /* renamed from: c */
    public C49785a f114538c;

    /* renamed from: d */
    private int f114539d = -1;

    /* renamed from: e */
    private AbstractC89172b<Boolean, C89391z> f114540e;

    static {
        Covode.recordClassIndex(58893);
    }

    /* renamed from: b */
    public final void mo84327b() {
        C49785a aVar = this.f114538c;
        if (aVar != null) {
            FrameLayout frameLayout = aVar.f114534a;
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a.AbstractC49787b
    /* renamed from: a */
    public final void mo84326a() {
        try {
            mo84327b();
            AbstractC89172b<Boolean, C89391z> bVar = this.f114540e;
            C89219l.m154721d(bVar, "");
            if (C49783b.m93234a()) {
                C49772a.m93221a().mo84333b(bVar);
            }
            this.f114540e = null;
            this.f114539d = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C49788c m93240a(Activity activity, View view) {
        if (C49783b.m93234a()) {
            return new C49788c(activity, view);
        }
        return null;
    }

    private C49788c(Activity activity, View view) {
        C497891 r1 = new AbstractC89172b<Boolean, C89391z>() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a.C49788c.C497891 */

            static {
                Covode.recordClassIndex(58894);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                C34727m.m70944a(new RunnableC49790d(this, bool));
                return null;
            }
        };
        this.f114540e = r1;
        this.f114536a = activity;
        this.f114537b = view;
        C89219l.m154721d(r1, "");
        if (C49783b.m93234a()) {
            C49772a.m93221a().mo84330a(r1);
        }
    }
}
