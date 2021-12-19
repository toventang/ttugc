package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.utils.C80286c;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.r */
public final class C49527r {

    /* renamed from: a */
    public static int f113905a = -1;

    static {
        Covode.recordClassIndex(58341);
    }

    /* renamed from: a */
    public static int m92768a() {
        int b = m92769b();
        if (b == 1) {
            return 2;
        }
        if (b == 2) {
            return 3;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: d */
    public static PreloadStrategyConfig m92771d() {
        try {
            PreloadStrategyConfig preloadStrategyConfig = (PreloadStrategyConfig) C16048b.m29633a().mo25415a(true, "preload_strategy_hp", PreloadStrategyConfig.class);
            if (preloadStrategyConfig == null) {
                return m92770c();
            }
            return preloadStrategyConfig;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static int m92769b() {
        int a;
        if (C80286c.f179804a) {
            if (f113905a == -1) {
                f113905a = C16048b.m29633a().mo25412a(true, "share_guide", 0);
            }
            a = f113905a;
        } else {
            a = C16048b.m29633a().mo25412a(true, "share_guide", 0);
        }
        if (a < 0 || a > 2) {
            return 0;
        }
        return a;
    }

    /* renamed from: c */
    public static PreloadStrategyConfig m92770c() {
        try {
            PreloadStrategyConfig preloadStrategyConfig = (PreloadStrategyConfig) C16048b.m29633a().mo25415a(true, "preload_strategy", PreloadStrategyConfig.class);
            if (preloadStrategyConfig == null) {
                return PreloadStrategyConfig.convertOldConfig(C16048b.m29633a().mo25412a(true, "video_preload_number", 5), C16048b.m29633a().mo25412a(true, "video_preload_size", 800));
            }
            return preloadStrategyConfig;
        } catch (Throwable unused) {
        }
    }
}
