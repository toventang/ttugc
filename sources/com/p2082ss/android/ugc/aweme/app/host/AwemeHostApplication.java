package com.p2082ss.android.ugc.aweme.app.host;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.apm.agent.p757v2.instrumentation.AppAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.AwemeAppBuildConfig;
import com.p2082ss.android.ugc.aweme.application.AbstractC33904i;
import com.p2082ss.android.ugc.aweme.application.AwemeApplicationImpl;
import com.p2082ss.android.ugc.aweme.application.C33905j;
import com.p2082ss.android.ugc.aweme.compliance.api.p2640d.C39239a;
import com.p2082ss.android.ugc.aweme.p3682s.C67247c;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;

/* renamed from: com.ss.android.ugc.aweme.app.host.AwemeHostApplication */
public class AwemeHostApplication extends AbstractApplicationC33792k {

    /* renamed from: b */
    private AbstractC33904i f79971b;

    static {
        Covode.recordClassIndex(40654);
    }

    public Resources getResources() {
        return this.f79971b.mo60129a(super.getResources());
    }

    @Override // com.p2082ss.android.ugc.aweme.app.host.AbstractApplicationC33792k
    public void onCreate() {
        C84231a.m144835a(this);
        AppAgent.onTrace("onCreate", true);
        this.f79971b.mo60131a();
        super.onCreate();
        this.f79971b.mo60137b();
        AppAgent.onTrace("onCreate", false);
    }

    public AwemeHostApplication() {
        AppAgent.onTrace("<init>", true);
        if (C39239a.m79629c()) {
            this.f79971b = new C33905j(this, new AwemeAppBuildConfig(), new C33759a());
        } else {
            this.f79971b = new AwemeApplicationImpl(this, new AwemeAppBuildConfig(), new C33759a());
        }
        AppAgent.onTrace("<init>", false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f79971b.mo60140d()) {
            super.onConfigurationChanged(configuration);
            this.f79971b.mo60134a(configuration);
        }
    }

    public void onTrimMemory(int i) {
        if (!this.f79971b.mo60139c()) {
            super.onTrimMemory(i);
            this.f79971b.mo60132a(i);
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        AppAgent.onTrace("attachBaseContext", true);
        C17879g.f42648a = new C33760b(this);
        this.f79971b.mo60133a(context);
        super.attachBaseContext(context);
        C67247c.m119170a(this);
        this.f79971b.mo60138b(context);
        AppAgent.onTrace("attachBaseContext", false);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return super.openOrCreateDatabase(this.f79971b.mo60130a(str), i, cursorFactory);
    }
}
