package com.p2082ss.android.ugc.gamora.recorder.p4306m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.C35407r;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.m.c */
public final class C83890c {
    static {
        Covode.recordClassIndex(97781);
    }

    /* renamed from: a */
    public static final void m144278a(TabHost tabHost) {
        if (tabHost.getCurrentIndex() > 0) {
            tabHost.mo116830a(tabHost.getCurrentIndex() - 1, 3);
        }
    }

    /* renamed from: b */
    public static final void m144280b(TabHost tabHost) {
        if (tabHost.getCurrentIndex() < tabHost.getTabCount() - 1) {
            tabHost.mo116830a(tabHost.getCurrentIndex() + 1, 3);
        }
    }

    /* renamed from: a */
    public static final boolean m144279a(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        if (C35407r.f83543a) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e() || shortVideoContext.f155817b.mo109889b() || shortVideoContext.f155817b.mo109890c() || shortVideoContext.mo110022c()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
