package com.bytedance.android.live.liveinteract.cohost.p263a.p268e;

import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.utils.C11282q;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.e.b */
public final class C4595b {

    /* renamed from: a */
    private static int f12227a = 30;

    /* renamed from: b */
    private static int f12228b = 100;

    /* renamed from: c */
    private static int f12229c = 10;

    /* renamed from: d */
    private static int f12230d = 10;

    static {
        Covode.recordClassIndex(5171);
    }

    /* renamed from: a */
    public static final boolean m10701a() {
        if (C4502a.m10590f() && (System.currentTimeMillis() / 1000) - C4502a.f12080l < ((long) f12228b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m10702b() {
        m10705e();
        if (m10704d() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final long m10704d() {
        Integer valueOf = Integer.valueOf(f12229c);
        C6805b<List<Double>> bVar = AbstractC6804a.f16976bY;
        C89219l.m154716b(bVar, "");
        C11282q qVar = new C11282q(valueOf, bVar.mo13066a());
        long j = 0;
        if (qVar.mo18043d() < f12229c) {
            return 0;
        }
        Double d = (Double) qVar.mo18041b();
        if (d != null) {
            j = (long) d.doubleValue();
        }
        return (j + ((long) (f12227a * 60))) - (System.currentTimeMillis() / 1000);
    }

    /* renamed from: c */
    public static final void m10703c() {
        if (m10701a()) {
            Integer valueOf = Integer.valueOf(f12229c);
            C6805b<List<Double>> bVar = AbstractC6804a.f16976bY;
            C89219l.m154716b(bVar, "");
            C11282q qVar = new C11282q(valueOf, bVar.mo13066a());
            double currentTimeMillis = (double) System.currentTimeMillis();
            Double.isNaN(currentTimeMillis);
            qVar.mo18040a(Double.valueOf(currentTimeMillis / 1000.0d));
            while (!qVar.mo18044e()) {
                double currentTimeMillis2 = (double) (System.currentTimeMillis() / 1000);
                Object c = qVar.mo18042c();
                C89219l.m154716b(c, "");
                double doubleValue = ((Number) c).doubleValue();
                Double.isNaN(currentTimeMillis2);
                if ((currentTimeMillis2 - doubleValue) / 60.0d <= ((double) f12230d)) {
                    break;
                }
                qVar.mo18039a();
            }
            C6805b<List<Double>> bVar2 = AbstractC6804a.f16976bY;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a(bVar2, qVar.f26985a);
            if (m10702b()) {
                C5737w.m12602b();
            }
        }
    }

    /* renamed from: e */
    private static final void m10705e() {
        Integer num;
        int i;
        RandomLinkMicSetting.DisconnectJudge disconnectJudge;
        RandomLinkMicSetting.DisconnectJudge disconnectJudge2;
        RandomLinkMicSetting value = LiveRandomLinkmicSetting.INSTANCE.getValue();
        Integer num2 = null;
        if (value != null) {
            num = Integer.valueOf(value.banTime);
        } else {
            num = null;
        }
        f12227a = num.intValue();
        RandomLinkMicSetting value2 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        if (value2 != null) {
            num2 = Integer.valueOf(value2.disconnectTime);
        }
        f12228b = num2.intValue();
        RandomLinkMicSetting value3 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        int i2 = 10;
        if (value3 == null || (disconnectJudge2 = value3.disconnectJudge) == null) {
            i = 10;
        } else {
            i = disconnectJudge2.frequency;
        }
        f12229c = i;
        RandomLinkMicSetting value4 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        if (!(value4 == null || (disconnectJudge = value4.disconnectJudge) == null)) {
            i2 = disconnectJudge.period;
        }
        f12230d = i2;
    }
}
