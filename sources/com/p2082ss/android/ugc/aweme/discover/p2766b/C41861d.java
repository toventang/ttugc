package com.p2082ss.android.ugc.aweme.discover.p2766b;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.fresco.animation.p1867c.AbstractC24295b;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;

/* renamed from: com.ss.android.ugc.aweme.discover.b.d */
public final class C41861d {
    static {
        Covode.recordClassIndex(49787);
    }

    /* renamed from: b */
    public static final int m83859b(AbstractC41858b bVar) {
        if (bVar != null) {
            return bVar.mo60380h().mo60387o();
        }
        return -1;
    }

    /* renamed from: c */
    public static final int m83861c(AbstractC41858b bVar) {
        if (bVar != null) {
            return bVar.mo60380h().mo60388p();
        }
        return -1;
    }

    /* renamed from: e */
    public static final boolean m83863e(AbstractC41858b bVar) {
        SearchPlayerCore a = m83857a(bVar);
        if (a == null || !a.aZ_()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final C24290a m83856a(SmartImageView smartImageView) {
        Animatable animatable;
        AbstractC24255a controller;
        C24290a aVar = null;
        if (smartImageView == null || (controller = smartImageView.getController()) == null) {
            animatable = null;
        } else {
            animatable = controller.mo39821i();
        }
        if (animatable instanceof C24290a) {
            aVar = animatable;
        }
        return aVar;
    }

    /* renamed from: b */
    public static final void m83860b(SmartImageView smartImageView) {
        if (smartImageView != null) {
            smartImageView.mo34198c();
            smartImageView.setVisibility(4);
            smartImageView.setUserVisibleHint(false);
        }
    }

    /* renamed from: d */
    public static final boolean m83862d(AbstractC41858b bVar) {
        SmartImageView s;
        C24290a a;
        if (bVar == null || (s = bVar.mo60391s()) == null || (a = m83856a(s)) == null || !a.isRunning()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final SearchPlayerCore m83857a(AbstractC41858b bVar) {
        AbstractC34186b.AbstractC34192d dVar;
        if (bVar != null) {
            dVar = bVar.mo60392t();
        } else {
            dVar = null;
        }
        if (dVar instanceof SearchVideoView) {
            return ((SearchVideoView) dVar).getCore();
        }
        return null;
    }

    /* renamed from: a */
    public static final void m83858a(SmartImageView smartImageView, AbstractC24295b bVar) {
        C24290a a;
        if (bVar != null && (a = m83856a(smartImageView)) != null) {
            a.mo40070a(bVar);
        }
    }
}
