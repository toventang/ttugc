package com.facebook.imagepipeline.p1889n;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.common.C24360a;
import com.facebook.imagepipeline.p1885j.C24456e;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.n.t */
public class C24614t {

    /* renamed from: d */
    public final AbstractC24596k<C24456e> f58494d;

    /* renamed from: e */
    public final AbstractC24545al f58495e;

    /* renamed from: f */
    public long f58496f;

    /* renamed from: g */
    public int f58497g;

    /* renamed from: h */
    public C24360a f58498h;

    static {
        Covode.recordClassIndex(28758);
    }

    /* renamed from: a */
    public final String mo40451a() {
        return this.f58495e.mo40415b();
    }

    /* renamed from: b */
    public final AbstractC24547an mo40452b() {
        return this.f58495e.mo40416c();
    }

    /* renamed from: c */
    public final Uri mo40453c() {
        return this.f58495e.mo40413a().mSourceUri;
    }

    /* renamed from: d */
    public final List<Uri> mo40454d() {
        return this.f58495e.mo40413a().mBackupUris;
    }

    public C24614t(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        this.f58494d = kVar;
        this.f58495e = alVar;
    }
}
