package com.p2082ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.property.C65402co;
import com.p2082ss.android.ugc.aweme.record.AbstractC66812f;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import java.io.File;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.ss.android.ugc.aweme.photo.PhotoModule */
public class PhotoModule implements AbstractC33974au, AbstractC66812f {

    /* renamed from: g */
    private static final int[] f142534g = {C62870g.f142580a, C62870g.f142581b};

    /* renamed from: h */
    private static final int[] f142535h = {1080, 1920};

    /* renamed from: a */
    final AbstractC31133a f142536a;

    /* renamed from: b */
    AbstractC66812f.AbstractC66813a f142537b;

    /* renamed from: c */
    final C62857b f142538c = new C62857b();

    /* renamed from: d */
    boolean f142539d;

    /* renamed from: e */
    public List<String> f142540e;

    /* renamed from: f */
    List<String> f142541f;

    /* renamed from: i */
    private SafeHandler f142542i;

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66812f
    /* renamed from: a */
    public final List<String> mo100816a() {
        return this.f142540e;
    }

    /* renamed from: b */
    private static boolean m113262b() {
        if (SettingsManager.m29616a().mo25400a("enable_1080p_photo_mv", false) || C65402co.C65403a.m117104a().f147549a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(73683);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66812f
    /* renamed from: a */
    public final void mo100819a(String str) {
        this.f142538c.f142550b = str;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public PhotoModule(ActivityC0945e eVar, AbstractC31133a aVar, AbstractC66812f.AbstractC66813a aVar2) {
        this.f142536a = aVar;
        this.f142537b = aVar2;
        eVar.getLifecycle().mo4012a(this);
        this.f142542i = new SafeHandler(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66812f
    /* renamed from: a */
    public final void mo100817a(int i, int i2, boolean z) {
        if (!this.f142539d) {
            this.f142539d = true;
            this.f142538c.f142551c = Bitmap.CompressFormat.PNG;
            if (i == 0) {
                if (m113262b()) {
                    i = f142535h[0];
                } else {
                    i = f142534g[0];
                }
            }
            if (i2 == 0) {
                if (m113262b()) {
                    i2 = f142535h[1];
                } else {
                    i2 = f142534g[1];
                }
            }
            this.f142542i.post(new RunnableC62879n(this));
            AbstractC88979t.m154294a(new C62875l(this, i, i2)).mo143267a((AbstractC88434g) new C62872i(this, z, i, i2), false).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C62873j(this, System.currentTimeMillis()), new C62874k(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66812f
    /* renamed from: a */
    public final void mo100818a(int i, int i2, boolean z, List<String> list) {
        this.f142541f = list;
        mo100817a(i, i2, z);
    }
}
