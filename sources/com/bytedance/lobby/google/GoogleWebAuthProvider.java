package com.bytedance.lobby.google;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.sdk.p1625a.p1652k.p1654b.p1655a.C22473b;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22477d;

public class GoogleWebAuthProvider extends BaseProvider {
    static {
        Covode.recordClassIndex(24505);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    /* renamed from: d */
    public final void mo34346d() {
        Application application = LobbyCore.getApplication();
        C22473b[] bVarArr = {new C22473b("https://accounts.google.com/o/oauth2/v2/auth", "https://www.googleapis.com/oauth2/v4/token", this.f49454c.f49403c)};
        C22477d.f53135a = application;
        int i = 0;
        do {
            bVarArr[0].mo36767a(application);
            i++;
        } while (i <= 0);
    }

    protected GoogleWebAuthProvider(Application application, C20892d dVar) {
        super(application, dVar);
    }
}
