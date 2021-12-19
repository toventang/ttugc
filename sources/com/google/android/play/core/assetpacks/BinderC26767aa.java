package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.google.android.play.core.p1963b.AbstractBinderC26940cd;
import com.google.android.play.core.p1963b.AbstractC26943cg;
import com.google.android.play.core.p1963b.C26903au;
import com.google.android.play.core.p1963b.C26909b;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.aa */
final class BinderC26767aa extends AbstractBinderC26940cd {

    /* renamed from: a */
    private final C26909b f63421a = new C26909b("AssetPackExtractionService");

    /* renamed from: b */
    private final Context f63422b;

    /* renamed from: c */
    private final AssetPackExtractionService f63423c;

    /* renamed from: d */
    private final C26769ac f63424d;

    static {
        Covode.recordClassIndex(32242);
    }

    BinderC26767aa(Context context, AssetPackExtractionService assetPackExtractionService, C26769ac acVar) {
        this.f63422b = context;
        this.f63423c = assetPackExtractionService;
        this.f63424d = acVar;
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26941ce
    /* renamed from: a */
    public final void mo44438a(Bundle bundle, AbstractC26943cg cgVar) {
        Object[] packagesForUid;
        this.f63421a.mo44595a("updateServiceState AIDL call", new Object[0]);
        if (C26903au.m53445a(this.f63422b)) {
            PackageManager packageManager = this.f63422b.getPackageManager();
            int callingUid = Binder.getCallingUid();
            Pair<Boolean, Object> a = C15346a.m28238a(packageManager, new Object[]{Integer.valueOf(callingUid)}, 101310, "java.lang.String[]", false, null);
            if (((Boolean) a.first).booleanValue()) {
                packagesForUid = (Object[]) a.second;
            } else {
                packagesForUid = packageManager.getPackagesForUid(callingUid);
                C15346a.m28240a(packagesForUid, packageManager, new Object[]{Integer.valueOf(callingUid)}, 101310, "com_google_android_play_core_assetpacks_b_android_content_pm_PackageManager_getPackagesForUid(Landroid/content/pm/PackageManager;I)[Ljava/lang/String;");
            }
            if (packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
                cgVar.mo44646a(this.f63423c.mo44424a(bundle), new Bundle());
                return;
            }
        }
        cgVar.mo44645a(new Bundle());
        this.f63423c.mo44425a();
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26941ce
    /* renamed from: a */
    public final void mo44439a(AbstractC26943cg cgVar) {
        C26769ac.m53178c(this.f63424d.mo44450c());
        cgVar.mo44647b(new Bundle());
    }
}
