package com.p2082ss.android.ugc.asve.recorder;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a;
import com.p2082ss.android.ugc.asve.recorder.p2220b.AbstractC31130a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;

/* renamed from: com.ss.android.ugc.asve.recorder.d */
public interface AbstractC31191d {
    static {
        Covode.recordClassIndex(37836);
    }

    /* renamed from: a */
    void mo56536a(Context context);

    /* renamed from: a */
    void mo56537a(AbstractC30012b bVar);

    /* renamed from: a */
    void mo56538a(C85346av.AbstractC85365j jVar);

    /* renamed from: a */
    void mo56539a(AbstractC85541q qVar);

    /* renamed from: a */
    void mo56540a(AbstractC85556e eVar, String str);

    /* renamed from: a */
    void mo56541a(AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: a */
    void mo56542a(AbstractC89188r<? super Integer, ? super Integer, ? super String, ? super C85346av, C89391z> rVar);

    /* renamed from: b */
    AbstractC31123a mo56543b();

    /* renamed from: b */
    void mo56544b(AbstractC30012b bVar);

    /* renamed from: c */
    AbstractC31185d mo56545c();

    /* renamed from: d */
    AbstractC31130a mo56546d();

    /* renamed from: e */
    AbstractC31193a mo56547e();

    /* renamed from: f */
    AbstractC31133a mo56548f();

    /* renamed from: g */
    AbstractC31218a mo56549g();

    /* renamed from: h */
    AbstractC31049a mo56550h();
}
