package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.extension.player.AbstractC23075a;
import com.bytedance.tux.extension.player.C23098e;
import com.bytedance.tux.extension.player.EnumC23096c;
import com.bytedance.tux.extension.player.EnumC23097d;
import com.bytedance.tux.extension.player.p1718a.C23088d;
import com.bytedance.tux.extension.player.view.PlayerMaskView;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44758u;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$observer$1 */
public final class ProductDescVideoViewHolder$observer$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ ProductDescVideoViewHolder f104880a;

    static {
        Covode.recordClassIndex(53365);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        TuxPlayerView tuxPlayerView = this.f104880a.f104865j;
        if (tuxPlayerView != null) {
            tuxPlayerView.post(new RunnableC44949a(tuxPlayerView, this));
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95842p().mo96042a(false);
        TuxPlayerView tuxPlayerView = this.f104880a.f104865j;
        if (tuxPlayerView != null) {
            tuxPlayerView.mo37584e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$observer$1$a */
    public static final class RunnableC44949a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TuxPlayerView f104881a;

        /* renamed from: b */
        final /* synthetic */ ProductDescVideoViewHolder$observer$1 f104882b;

        static {
            Covode.recordClassIndex(53366);
        }

        RunnableC44949a(TuxPlayerView tuxPlayerView, ProductDescVideoViewHolder$observer$1 productDescVideoViewHolder$observer$1) {
            this.f104881a = tuxPlayerView;
            this.f104882b = productDescVideoViewHolder$observer$1;
        }

        public final void run() {
            boolean z;
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            Boolean a = s.mo95842p().mo96041a();
            if (a != null) {
                z = a.booleanValue();
            } else {
                z = false;
            }
            if (!ProductDescVideoViewHolder.m87636a((View) this.f104881a) && !z) {
                this.f104881a.mo37583d();
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        C44720k kVar;
        String str;
        Aweme aweme = this.f104880a.f104864g;
        if (!(aweme == null || aweme.getVideo() == null || (kVar = this.f104880a.mo70807n().f104162s) == null)) {
            Aweme aweme2 = this.f104880a.f104864g;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            int i = (int) this.f104880a.f104863f.f101672n;
            if (str == null) {
                str = "";
            }
            new C44758u(str, i).mo76746c(kVar.f104318a);
        }
        TuxPlayerView tuxPlayerView = this.f104880a.f104865j;
        if (tuxPlayerView != null) {
            tuxPlayerView.getMainHandler().removeCallbacksAndMessages(null);
            tuxPlayerView.f54702b = null;
            PlayerMaskView playerMaskView = (PlayerMaskView) tuxPlayerView.mo37581c(R.id.d3c);
            C23088d.m43534a().removeCallbacksAndMessages(null);
            C23088d.f54658a = null;
            playerMaskView.f54677a = null;
            playerMaskView.f54678b = false;
            playerMaskView.f54679c = false;
            playerMaskView.f54680d = false;
            AbstractC23075a aVar = tuxPlayerView.f54704d;
            if (aVar != null) {
                aVar.mo37510c();
            }
            tuxPlayerView.f54701a = false;
            tuxPlayerView.f54703c = true;
            C23098e.m43539a(EnumC23097d.PLAYER_IDLE);
            C23098e.m43538a(EnumC23096c.PREVIEW);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ProductDescVideoViewHolder$observer$1(ProductDescVideoViewHolder productDescVideoViewHolder) {
        this.f104880a = productDescVideoViewHolder;
    }
}
