package com.p2082ss.android.ugc.aweme.settingsrequest;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.settingsrequest.j */
public final /* synthetic */ class CallableC68810j implements Callable {

    /* renamed from: a */
    private final AbstractC68806f f153894a;

    /* renamed from: b */
    private final SharedPreferences.Editor f153895b;

    /* renamed from: c */
    private final IESSettingsProxy f153896c;

    static {
        Covode.recordClassIndex(81087);
    }

    CallableC68810j(AbstractC68806f fVar, SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        this.f153894a = fVar;
        this.f153895b = editor;
        this.f153896c = iESSettingsProxy;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f153894a.f153887a = SettingsRequestServiceImpl.m65417i().mo57273a(this.f153895b, this.f153896c);
        return null;
    }
}
