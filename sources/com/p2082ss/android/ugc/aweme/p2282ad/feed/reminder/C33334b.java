package com.p2082ss.android.ugc.aweme.p2282ad.feed.reminder;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.b */
public final class C33334b {

    /* renamed from: a */
    public static final C33334b f79189a = new C33334b();

    private C33334b() {
    }

    static {
        Covode.recordClassIndex(40170);
    }

    /* renamed from: a */
    public static final ActivityC0945e m68335a(Context context) {
        ActivityC0945e eVar = null;
        if (!(context instanceof ActivityC0945e)) {
            if (context instanceof ContextThemeWrapper) {
                ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
                if (contextThemeWrapper.getBaseContext() instanceof ActivityC0945e) {
                    Context baseContext = contextThemeWrapper.getBaseContext();
                    if (baseContext instanceof ActivityC0945e) {
                        eVar = baseContext;
                    }
                    return eVar;
                }
            }
            context = C17873f.m33102j();
            if (!(context instanceof ActivityC0945e)) {
                context = null;
            }
        }
        return (ActivityC0945e) context;
    }
}
