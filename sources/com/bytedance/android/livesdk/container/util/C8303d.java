package com.bytedance.android.livesdk.container.util;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxDebugBadgeSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.ShowNewContainerLabel;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.util.d */
public final class C8303d {

    /* renamed from: a */
    public static final C8303d f20572a = new C8303d();

    /* renamed from: b */
    private static final AbstractC89244h f20573b = C11831d.m20835a(C8304a.f20575a);

    /* renamed from: c */
    private static final AbstractC89244h f20574c = C11831d.m20835a(C8305b.f20576a);

    /* renamed from: a */
    public static boolean m16458a() {
        return ((Boolean) f20574c.getValue()).booleanValue();
    }

    private C8303d() {
    }

    /* renamed from: com.bytedance.android.livesdk.container.util.d$b */
    static final class C8305b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C8305b f20576a = new C8305b();

        static {
            Covode.recordClassIndex(9142);
        }

        C8305b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            AbstractC2953a a = C6193a.m13435a(IHostContext.class);
            C89219l.m154716b(a, "");
            return Boolean.valueOf(((IHostContext) a).isLocalTest());
        }
    }

    static {
        Covode.recordClassIndex(9140);
    }

    /* renamed from: b */
    public static boolean m16459b() {
        if (!m16458a() || !ShowNewContainerLabel.INSTANCE.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.android.livesdk.container.util.d$a */
    static final class C8304a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C8304a f20575a = new C8304a();

        static {
            Covode.recordClassIndex(9141);
        }

        C8304a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            AbstractC2953a a = C6193a.m13435a(IHostContext.class);
            C89219l.m154716b(a, "");
            if (!((IHostContext) a).isLocalTest() || !EnableLynxDebugBadgeSetting.INSTANCE.getValue()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}
