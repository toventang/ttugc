package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31186e;
import com.p2082ss.android.ugc.asve.recorder.camera.C31161a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65492o;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.af */
public final class C73366af implements AbstractC31186e {

    /* renamed from: a */
    private final boolean f164856a;

    /* renamed from: b */
    private boolean f164857b;

    /* renamed from: c */
    private final AbstractC31186e f164858c;

    static {
        Covode.recordClassIndex(86103);
    }

    public C73366af(byte b) {
        this();
    }

    private /* synthetic */ C73366af() {
        this(C31161a.f74700a);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31186e
    /* renamed from: a */
    public final boolean mo56704a() {
        if (C65492o.m117216a() || C65492o.m117217b()) {
            return true;
        }
        return false;
    }

    private C73366af(AbstractC31186e eVar) {
        boolean z;
        C89219l.m154721d(eVar, "");
        this.f164858c = eVar;
        if (C63244g.m114602a().mo73255A().mo93901a() || !C63244g.m114602a().mo73255A().mo93903b()) {
            z = true;
        } else {
            z = false;
        }
        this.f164856a = z;
        this.f164857b = C65492o.m117217b();
        if (z) {
            C84911q.m145922a("CameraAntiShakeV1", " -> initialize: The user is not logged in or in FTC mode");
        }
        if (this.f164857b) {
            C84911q.m145922a("CameraAntiShakeV1", " -> initialize: current anti-shake experiment version is v2");
        }
        if (mo56704a() && !this.f164857b) {
            C84911q.m145922a("CameraAntiShakeV1", " -> initialize: current anti-shake experiment version is v1");
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31186e
    /* renamed from: a */
    public final boolean mo56705a(Context context, AbstractC31185d dVar, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(dVar, "");
        if (this.f164856a) {
            return false;
        }
        if (this.f164857b) {
            return true;
        }
        return this.f164858c.mo56705a(context, dVar, i);
    }
}
