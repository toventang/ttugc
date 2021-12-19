package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2587c.p2588a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2595c.C38113a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.a.a */
public final class C38082a implements IFrameSlot, AbstractC17046h.AbstractC17048b {

    /* renamed from: c */
    public static final C38083a f89978c = new C38083a((byte) 0);

    /* renamed from: a */
    public String f89979a = "";

    /* renamed from: b */
    public Bundle f89980b;

    /* renamed from: d */
    private BulletContainerView f89981d;

    static {
        Covode.recordClassIndex(45549);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.a.a$a */
    public static final class C38083a {
        static {
            Covode.recordClassIndex(45550);
        }

        private C38083a() {
        }

        public /* synthetic */ C38083a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    /* renamed from: a */
    public final Animation mo12052a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    /* renamed from: b */
    public final Animation mo12053b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    /* renamed from: a */
    public final View mo12051a(Context context) {
        String str;
        C89219l.m154721d(context, "");
        this.f89981d = new BulletContainerView(context, null, 6, (byte) 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C34728n.m70946a(300.0d), C34728n.m70946a(120.0d));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = C34728n.m70946a(12.0d);
        layoutParams.bottomMargin = C34728n.m70946a(8.0d);
        BulletContainerView bulletContainerView = this.f89981d;
        if (bulletContainerView != null) {
            bulletContainerView.setLayoutParams(layoutParams);
            bulletContainerView.mo25820a(C34963b.m71411a().mo61850a());
            Bundle bundle = this.f89980b;
            if (bundle == null || (str = C38113a.m77223a(this.f89979a, bundle)) == null) {
                str = this.f89979a;
            }
            bulletContainerView.mo26838a(C35301c.m72246a(str), (Bundle) null, bulletContainerView);
        }
        BulletContainerView bulletContainerView2 = this.f89981d;
        if (bulletContainerView2 != null) {
            bulletContainerView2.setLayoutParams(layoutParams);
        }
        return this.f89981d;
    }

    /* renamed from: a */
    public final void mo66351a(String str) {
        C89219l.m154721d(str, "");
        this.f89979a = str;
    }
}
