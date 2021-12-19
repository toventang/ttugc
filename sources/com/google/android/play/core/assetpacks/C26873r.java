package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.AbstractC26937ca;
import com.google.android.play.core.p1963b.C26903au;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1963b.C26952l;
import com.google.android.play.core.p1965d.C26991q;
import com.google.android.play.core.tasks.AbstractC27062d;
import com.google.android.play.core.tasks.C27064f;
import com.google.android.play.core.tasks.C27071m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.r */
public final class C26873r implements AbstractC26857dj {

    /* renamed from: a */
    static final C26909b f63751a = new C26909b("AssetPackServiceImpl");

    /* renamed from: g */
    private static final Intent f63752g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: b */
    final String f63753b;

    /* renamed from: c */
    final C26791ay f63754c;

    /* renamed from: d */
    C26952l<AbstractC26937ca> f63755d;

    /* renamed from: e */
    C26952l<AbstractC26937ca> f63756e;

    /* renamed from: f */
    final AtomicBoolean f63757f = new AtomicBoolean();

    static {
        Covode.recordClassIndex(32348);
    }

    C26873r(Context context, C26791ay ayVar) {
        this.f63753b = context.getPackageName();
        this.f63754c = ayVar;
        if (C26903au.m53445a(context)) {
            Context a = C26991q.m53630a(context);
            C26909b bVar = f63751a;
            Intent intent = f63752g;
            this.f63755d = new C26952l<>(a, bVar, "AssetPackService", intent, C26858dk.f63713a);
            this.f63756e = new C26952l<>(C26991q.m53630a(context), bVar, "AssetPackService-keepAlive", intent, C26859dl.f63714a);
        }
        f63751a.mo44595a("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: b */
    static Bundle m53357b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10803);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    /* renamed from: b */
    static Bundle m53358b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* renamed from: b */
    static Bundle m53359b(int i, String str) {
        Bundle b = m53358b(i);
        b.putString("module_name", str);
        return b;
    }

    /* renamed from: c */
    static /* synthetic */ Bundle m53360c(int i, String str, String str2, int i2) {
        Bundle b = m53359b(i, str);
        b.putString("slice_id", str2);
        b.putInt("chunk_number", i2);
        return b;
    }

    /* renamed from: c */
    private static <T> AbstractC27062d<T> m53361c() {
        f63751a.mo44596b("onError(%d)", -11);
        return C27064f.m53800a((Exception) new C26765a(-11));
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final AbstractC27062d<List<String>> mo44502a(Map<String, Long> map) {
        if (this.f63755d == null) {
            return m53361c();
        }
        f63751a.mo44598d("syncPacks", new Object[0]);
        C27071m mVar = new C27071m();
        this.f63755d.mo44652a(new C26862g(this, mVar, map, mVar));
        return mVar.f64055a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final synchronized void mo44503a() {
        MethodCollector.m26663i(11169);
        if (this.f63756e == null) {
            f63751a.mo44599e("Keep alive connection manager is not initialized.", new Object[0]);
            MethodCollector.m26664o(11169);
            return;
        }
        C26909b bVar = f63751a;
        bVar.mo44598d("keepAlive", new Object[0]);
        if (!this.f63757f.compareAndSet(false, true)) {
            bVar.mo44598d("Service is already kept alive.", new Object[0]);
            MethodCollector.m26664o(11169);
            return;
        }
        C27071m mVar = new C27071m();
        this.f63756e.mo44652a(new C26867l(this, mVar, mVar));
        MethodCollector.m26664o(11169);
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final void mo44504a(int i) {
        if (this.f63755d != null) {
            f63751a.mo44598d("notifySessionFailed", new Object[0]);
            C27071m mVar = new C27071m();
            this.f63755d.mo44652a(new C26865j(this, mVar, i, mVar));
            return;
        }
        throw new C26787au("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final void mo44505a(int i, String str) {
        mo44557a(i, str, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44557a(int i, String str, int i2) {
        if (this.f63755d != null) {
            f63751a.mo44598d("notifyModuleCompleted", new Object[0]);
            C27071m mVar = new C27071m();
            this.f63755d.mo44652a(new C26864i(this, mVar, i, str, mVar, i2));
            return;
        }
        throw new C26787au("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final void mo44506a(int i, String str, String str2, int i2) {
        if (this.f63755d != null) {
            f63751a.mo44598d("notifyChunkTransferred", new Object[0]);
            C27071m mVar = new C27071m();
            this.f63755d.mo44652a(new C26863h(this, mVar, i, str, str2, i2, mVar));
            return;
        }
        throw new C26787au("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final void mo44507a(List<String> list) {
        if (this.f63755d != null) {
            f63751a.mo44598d("cancelDownloads(%s)", list);
            C27071m mVar = new C27071m();
            this.f63755d.mo44652a(new C26861f(this, mVar, list, mVar));
        }
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: b */
    public final AbstractC27062d<ParcelFileDescriptor> mo44509b(int i, String str, String str2, int i2) {
        if (this.f63755d == null) {
            return m53361c();
        }
        f63751a.mo44598d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C27071m mVar = new C27071m();
        this.f63755d.mo44652a(new C26866k(this, mVar, i, str, str2, i2, mVar));
        return mVar.f64055a;
    }
}
