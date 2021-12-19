package com.bytedance.android.livesdk.p434ad;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2930g;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p466g.C7024a;
import com.bytedance.android.livesdk.container.AbstractC8220c;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.container.config.base.PageConfig;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.config.base.ViewConfig;
import com.bytedance.android.livesdk.container.p512i.C8250a;
import com.bytedance.android.livesdk.container.p513j.C8270b;
import com.bytedance.android.livesdk.container.p513j.C8278d;
import com.bytedance.android.livesdk.container.p513j.C8286e;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardPriority;
import com.bytedance.android.livesdk.lynx.lynxcard.C9371e;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ad.b */
public class C6630b implements AbstractC2930g {
    static {
        Covode.recordClassIndex(7368);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    /* renamed from: com.bytedance.android.livesdk.ad.b$a */
    public static final class C6631a implements C9371e.AbstractC9372a {
        static {
            Covode.recordClassIndex(7369);
        }

        @Override // com.bytedance.android.livesdk.lynx.lynxcard.C9371e.AbstractC9372a
        /* renamed from: a */
        public final void mo12783a(String str) {
            C89219l.m154721d(str, "");
        }

        C6631a() {
        }
    }

    public AbstractC8220c createHybridView(Context context) {
        if (context != null) {
            return new C8270b(context);
        }
        return null;
    }

    private final void handleCard(Uri uri) {
        AbstractC2953a a = C6193a.m13435a(AbstractC2928f.class);
        C89219l.m154716b(a, "");
        ((AbstractC2928f) a).getLynxCardViewManager().mo7679a(new C9371e(uri, LynxCardPriority.INSTANCE.getPriority(uri.getQueryParameter("priority")), new C6631a()));
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2930g
    public boolean isContainerScheme(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        if (C8250a.f20478c.contains(host)) {
            return true;
        }
        if ((!C8250a.f20477b.contains(host) || !C89219l.m154714a((Object) "1", (Object) uri.getQueryParameter("use_new_container"))) && !C8250a.f20479d.contains(host)) {
            return false;
        }
        return true;
    }

    private final AbstractC8220c createHybridView(Context context, HybridConfig hybridConfig) {
        AbstractC8220c createHybridView;
        if (context == null || (createHybridView = createHybridView(context)) == null) {
            return null;
        }
        createHybridView.setConfig(hybridConfig);
        return createHybridView;
    }

    private final void handlePage(Uri uri, Context context) {
        ((IHostAction) C6193a.m13435a(IHostAction.class)).openLiveNewHybrid(uri, context, new Bundle());
    }

    private final void handlePopup(Uri uri, Context context) {
        C8286e a = C8286e.C8287a.m16450a(new PopupConfig(uri));
        if (context != null) {
            if (!(context instanceof Activity)) {
                AbstractC2953a a2 = C6193a.m13435a(IHostApp.class);
                C89219l.m154716b(a2, "");
                context = ((IHostApp) a2).getTopActivity();
            }
            ActivityC0945e b = C3888a.m9506b(context);
            if (b != null) {
                C4031a.m9839a(b, a);
            }
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2930g
    public AbstractC8220c createHybridView(Context context, Uri uri) {
        ViewConfig viewConfig;
        C89219l.m154721d(uri, "");
        if (context == null) {
            return null;
        }
        if (C8250a.f20476a.contains(uri.getHost())) {
            viewConfig = new ViewConfig(uri.buildUpon().appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis())).build());
        } else {
            viewConfig = new ViewConfig(uri);
        }
        return createHybridView(context, viewConfig);
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2930g
    public Fragment createPageFragment(Uri uri, Context context) {
        C89219l.m154721d(uri, "");
        PageConfig pageConfig = new PageConfig(uri);
        C89219l.m154721d(pageConfig, "");
        C8278d dVar = new C8278d();
        C7024a.m14981a(pageConfig.getUrl());
        Bundle bundle = new Bundle();
        bundle.putSerializable("argument_key_config", pageConfig);
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2930g
    public boolean handleScheme(Uri uri, Context context) {
        Uri uri2;
        if (uri == null) {
            return false;
        }
        if (C8250a.f20476a.contains(uri.getHost())) {
            uri2 = uri.buildUpon().appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis())).build();
        } else {
            uri2 = uri;
        }
        C89219l.m154716b(uri2, "");
        String host = uri2.getHost();
        if (C8250a.f20477b.contains(host)) {
            handlePage(uri2, context);
            return true;
        } else if (C8250a.f20478c.contains(host)) {
            handlePopup(uri2, context);
            return true;
        } else if (!C8250a.f20479d.contains(host)) {
            return false;
        } else {
            handleCard(uri);
            return true;
        }
    }
}
