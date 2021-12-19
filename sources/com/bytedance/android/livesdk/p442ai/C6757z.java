package com.bytedance.android.livesdk.p442ai;

import android.content.Context;
import android.util.SparseIntArray;
import com.bytedance.android.live.p250i.p252b.C4365d;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.android.livesdk.livesetting.pullstream.DnsOptMethodSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHttpkDegradeEnabledSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.PlayerEnableUploadTimeLineSetting;
import com.bytedance.android.livesdk.p442ai.p444b.AbstractC6713a;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.videoarch.p4474a.AbstractC87123b;
import com.p2082ss.videoarch.p4474a.C87154g;

/* renamed from: com.bytedance.android.livesdk.ai.z */
public final class C6757z {

    /* renamed from: a */
    final Context f16786a;

    /* renamed from: b */
    boolean f16787b;

    /* renamed from: c */
    boolean f16788c = true;

    /* renamed from: d */
    SparseIntArray f16789d;

    /* renamed from: e */
    AbstractC6713a f16790e;

    /* renamed from: f */
    C87154g f16791f;

    /* renamed from: g */
    C6710aa f16792g;

    static {
        Covode.recordClassIndex(7495);
    }

    /* renamed from: a */
    public final C87154g mo12961a() {
        int i;
        this.f16792g = new C6710aa(this.f16790e);
        C87154g.C87163a a = C87154g.m151112a(m14470a(this.f16786a));
        a.f197374h = 300000;
        a.f197370d = new C6711ab();
        a.f197372f = false;
        a.f197373g = false;
        if (this.f16787b) {
            i = 2;
        } else {
            i = 1;
        }
        a.f197375i = i;
        a.f197368b = this.f16792g;
        a.f197371e = new AbstractC87123b() {
            /* class com.bytedance.android.livesdk.p442ai.C6757z.C67581 */

            static {
                Covode.recordClassIndex(7496);
            }

            @Override // com.p2082ss.videoarch.p4474a.AbstractC87123b
            /* renamed from: a */
            public final <T> T mo12962a(String str, T t) {
                return (T) C6802e.m14593a(str, t);
            }
        };
        if (ThreadPoolOptExperiment.INSTANCE.isEnablePlayer()) {
            C40787l.C40788a a2 = C40787l.m82269a(EnumC40793o.SERIAL);
            a2.f95504b = "player-work-threads";
            a.f197384r = C40780g.m82242a(a2.mo70028a());
        }
        this.f16791f = a.mo141018a();
        if (PlayerEnableUploadTimeLineSetting.INSTANCE.getValue()) {
            this.f16791f.mo140967a();
        }
        if (DnsOptMethodSetting.INSTANCE.getValue() == 1) {
            this.f16791f.mo140973a(C4365d.m10462g().mo10112c().mo11512b());
        }
        if (LiveHttpkDegradeEnabledSetting.INSTANCE.getValue()) {
            this.f16791f.mo140969a(39, 1);
        }
        return this.f16791f;
    }

    public C6757z(Context context) {
        this.f16786a = context;
        this.f16789d = new SparseIntArray();
    }

    /* renamed from: a */
    private static Context m14470a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }
}
