package com.bytedance.lobby.line;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20879a;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.auth.AbstractC20888d;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20885b;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.linecorp.linesdk.EnumC28179b;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.linecorp.linesdk.p2028a.C28158c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class LineAuth extends LineProvider<AuthResult> implements AbstractC20888d {

    /* renamed from: b */
    private static final boolean f49488b = C20879a.f49364a;

    /* renamed from: d */
    private LobbyViewModel f49489d;

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34323a() {
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34324a(int i) {
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final String mo34327b() {
        return null;
    }

    static {
        Covode.recordClassIndex(24534);
    }

    /* renamed from: com.bytedance.lobby.line.LineAuth$1 */
    static /* synthetic */ class C209261 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49490a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 24535(0x5fd7, float:3.4381E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.linecorp.linesdk.b[] r0 = com.linecorp.linesdk.EnumC28179b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lobby.line.LineAuth.C209261.f49490a = r2
                com.linecorp.linesdk.b r0 = com.linecorp.linesdk.EnumC28179b.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lobby.line.LineAuth.C209261.f49490a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.linecorp.linesdk.b r0 = com.linecorp.linesdk.EnumC28179b.CANCEL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.lobby.line.LineAuth.C209261.f49490a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.linecorp.linesdk.b r0 = com.linecorp.linesdk.EnumC28179b.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.line.LineAuth.C209261.<clinit>():void");
        }
    }

    public LineAuth(C20892d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final void mo34328b(ActivityC0945e eVar, Bundle bundle) {
        C20885b.m39240a(this.f49489d, this.f49454c.f49402b);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34326a(ActivityC0945e eVar, Bundle bundle) {
        this.f49489d = (LobbyViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(LobbyViewModel.class);
        if (!mo34350t_()) {
            C20885b.m39241a(this.f49489d, "line", 1);
            return;
        }
        try {
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new LineAuthenticationConfig.C28165a(this.f49454c.f49403c), (byte) 0);
            List emptyList = Collections.emptyList();
            if (!lineAuthenticationConfig.f65908e && !C28158c.f65889b) {
                C28158c.f65889b = true;
                C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
                a.f95505c = 1;
                ExecutorService a2 = C40780g.m82242a(a.mo70028a());
                Context applicationContext = eVar.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                a2.execute(new C28158c.RunnableC28159a(applicationContext));
            }
            Intent intent = new Intent(eVar, LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("permissions", (String[]) emptyList.toArray(new String[emptyList.size()]));
            eVar.startActivityForResult(intent, 1);
        } catch (Throwable th) {
            AuthResult.C20883a aVar = new AuthResult.C20883a(this.f49454c.f49402b, 1);
            aVar.f49377a = false;
            aVar.f49378b = new C20891c(6, th.getMessage());
            this.f49489d.mo34361b(aVar.mo34319a());
        }
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34325a(ActivityC0945e eVar, int i, int i2, Intent intent) {
        LineLoginResult lineLoginResult;
        if (intent == null) {
            lineLoginResult = new LineLoginResult(EnumC28179b.INTERNAL_ERROR, new LineApiError("Callback intent is null"));
        } else {
            lineLoginResult = (LineLoginResult) intent.getParcelableExtra("authentication_result");
            if (lineLoginResult == null) {
                lineLoginResult = new LineLoginResult(EnumC28179b.INTERNAL_ERROR, new LineApiError("Authentication result is not found."));
            }
        }
        int i3 = C209261.f49490a[lineLoginResult.f65915b.ordinal()];
        if (i3 == 1) {
            LineCredential lineCredential = lineLoginResult.f65917d;
            if (lineCredential != null) {
                AuthResult.C20883a aVar = new AuthResult.C20883a("line", 1);
                aVar.f49377a = true;
                aVar.f49383g = lineCredential.f65850a.f65845b;
                aVar.f49381e = lineCredential.f65850a.f65844a;
                this.f49489d.mo34361b(aVar.mo34319a());
            }
        } else if (i3 != 2) {
            Bundle bundle = new Bundle();
            bundle.putInt("line_response_ordinal", lineLoginResult.f65915b.ordinal());
            AuthResult.C20883a aVar2 = new AuthResult.C20883a("line", 1);
            aVar2.f49377a = false;
            aVar2.f49378b = new C20891c(3, lineLoginResult.f65918e.f65849c);
            aVar2.f49385i = bundle;
            this.f49489d.mo34361b(aVar2.mo34319a());
        } else {
            AuthResult.C20883a aVar3 = new AuthResult.C20883a("line", 1);
            aVar3.f49377a = false;
            aVar3.f49378b = new C20891c(4, "Line login cancelled by user");
            this.f49489d.mo34361b(aVar3.mo34319a());
        }
    }
}
