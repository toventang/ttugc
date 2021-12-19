package com.bytedance.ies.uikit.p1279a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.AwemeAppData;
import com.p2082ss.android.ugc.aweme.kids.intergration.common.C57721a;
import com.p2082ss.android.ugc.aweme.lego.C58195d;

/* renamed from: com.bytedance.ies.uikit.a.d */
public final class C18236d {

    /* renamed from: a */
    public static AbstractC18240d f43453a;

    /* renamed from: b */
    public static AbstractC18237a f43454b;

    /* renamed from: c */
    static AbstractC18238b f43455c;

    /* renamed from: d */
    public static AbstractC18239c f43456d;

    /* renamed from: com.bytedance.ies.uikit.a.d$a */
    public interface AbstractC18237a {
        static {
            Covode.recordClassIndex(20896);
        }

        /* renamed from: a */
        void mo29097a(Activity activity);

        /* renamed from: b */
        void mo29098b(Activity activity);
    }

    /* renamed from: com.bytedance.ies.uikit.a.d$b */
    public interface AbstractC18238b {
        static {
            Covode.recordClassIndex(20897);
        }

        /* renamed from: a */
        boolean mo29099a();
    }

    /* renamed from: com.bytedance.ies.uikit.a.d$c */
    public interface AbstractC18239c {
        static {
            Covode.recordClassIndex(20898);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.a.d$d */
    public interface AbstractC18240d {
        static {
            Covode.recordClassIndex(20899);
        }
    }

    static {
        Covode.recordClassIndex(20895);
    }

    /* renamed from: a */
    public static AbstractC18237a m33937a() {
        if (!C58195d.m105112e()) {
            return f43454b;
        }
        if (C31575b.m65865g().isChildrenMode()) {
            return C57721a.f131706a;
        }
        return AwemeAppData.m60956a();
    }
}
