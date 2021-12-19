package com.bytedance.scene;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.p025c.C0498h;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.navigation.AbstractC22237b;
import com.bytedance.scene.p1621c.AbstractC22148a;
import com.bytedance.scene.p1621c.AbstractC22151d;
import com.bytedance.scene.p1622d.C22170j;
import com.bytedance.scene.p1622d.C22171k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.scene.k */
public class FragmentC22224k extends Fragment {

    /* renamed from: a */
    public final C0498h<AbstractC22148a> f52561a = new C0498h<>();

    /* renamed from: b */
    public final C0498h<AbstractC22151d> f52562b = new C0498h<>();

    /* renamed from: c */
    public final List<AbstractC22237b> f52563c = new ArrayList();

    /* renamed from: d */
    final Set<AbstractC22225a> f52564d = new HashSet();

    /* renamed from: com.bytedance.scene.k$a */
    public interface AbstractC22225a {
        static {
            Covode.recordClassIndex(26031);
        }

        /* renamed from: a */
        void mo36305a();
    }

    static {
        Covode.recordClassIndex(26030);
    }

    /* renamed from: a */
    private boolean m41819a(AbstractC1204m mVar) {
        C22170j.m41654a();
        if (C22171k.m41661a(getActivity()) && mVar.getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            return true;
        }
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        for (AbstractC22225a aVar : new HashSet(this.f52564d)) {
            aVar.mo36305a();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ArrayList arrayList = new ArrayList(this.f52563c);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC22148a a = this.f52561a.mo2183a(i, null);
        if (a != null) {
            a.mo36334a(i2, intent);
            this.f52561a.mo2185b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.f52562b.mo2183a(i, null) != null) {
            this.f52562b.mo2185b(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36495a(AbstractC1204m mVar, Intent intent, int i, AbstractC22148a aVar) {
        if (m41819a(mVar)) {
            if (i < 0) {
                startActivity(intent);
                return;
            }
            this.f52561a.mo2186b(i, aVar);
            startActivityForResult(intent, i);
            mVar.getLifecycle().mo4012a(new SceneActivityCompatibilityLayerFragment$1(this, mVar, i));
        }
    }
}
