package com.bytedance.android.livesdk.p442ai;

import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeBytevc1EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeH264EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurrySpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowSpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkFastOpenDisableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkNtpEnableSetting;
import com.bytedance.android.livesdk.p442ai.AbstractC6724g;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11663q;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.videoarch.p4474a.C87154g;
import com.p2082ss.videoarch.p4474a.p4477c.C87132c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.ai.u */
public final class C6751u implements AbstractC6724g {

    /* renamed from: e */
    private static final SparseIntArray f16760e;

    /* renamed from: a */
    C87154g f16761a;

    /* renamed from: b */
    C6710aa f16762b;

    /* renamed from: c */
    AbstractC6724g.AbstractC6725a f16763c;

    /* renamed from: d */
    AbstractC6724g.AbstractC6726b f16764d;

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12878a(int i) {
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12888a(boolean z, boolean z2, int i) {
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12887a(boolean z) {
        this.f16761a.mo140976a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12877a() {
        this.f16761a.mo140993e();
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: d */
    public final void mo12895d() {
        this.f16761a.mo140987c();
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: e */
    public final void mo12897e() {
        this.f16761a.mo140998h();
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: f */
    public final void mo12899f() {
        this.f16761a.mo140999i();
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: k */
    public final String mo12904k() {
        return this.f16761a.f196994P;
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: h */
    public final boolean mo12901h() {
        C87154g gVar = this.f16761a;
        if (gVar == null || !gVar.mo141000j()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: j */
    public final JSONObject mo12903j() {
        C87154g gVar = this.f16761a;
        if (gVar != null) {
            return gVar.mo141004n();
        }
        return new JSONObject();
    }

    static {
        Covode.recordClassIndex(7489);
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f16760e = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(3, 3);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: g */
    public final boolean mo12900g() {
        C87154g gVar = this.f16761a;
        if (gVar == null || gVar.f197336j == null || !gVar.f197336j.mo16728p()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: i */
    public final Point mo12902i() {
        return new Point(this.f16761a.mo141001k(), this.f16761a.mo141002l());
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: b */
    public final void mo12889b() {
        this.f16761a.mo140969a(2, 0);
        if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
            this.f16761a.mo140969a(18, 0);
            this.f16761a.mo140968a(19, LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue());
            this.f16761a.mo140969a(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
            this.f16761a.mo140968a(20, LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue());
            this.f16761a.mo140969a(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
        }
        if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
            this.f16761a.mo140969a(35, 1);
            this.f16761a.mo140969a(33, 1);
            this.f16761a.mo140969a(34, 0);
        }
        if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
            this.f16761a.mo140969a(36, 1);
        }
        if (LiveSdkFastOpenDisableSetting.INSTANCE.getValue() == 1) {
            this.f16761a.mo140969a(40, 0);
        }
        if (LiveSdkNtpEnableSetting.INSTANCE.getValue() == 1) {
            this.f16761a.mo140969a(42, 1);
        }
        this.f16761a.mo140969a(9, 2);
        this.f16761a.mo140983b();
        AbstractC6724g.AbstractC6726b bVar = this.f16764d;
        if (bVar != null) {
            bVar.mo12906h();
        }
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: c */
    public final void mo12892c() {
        if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
            this.f16761a.mo140969a(18, 0);
            this.f16761a.mo140968a(19, LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue());
            this.f16761a.mo140969a(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
            this.f16761a.mo140968a(20, LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue());
            this.f16761a.mo140969a(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
        }
        if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
            this.f16761a.mo140969a(35, 1);
            this.f16761a.mo140969a(33, 1);
            this.f16761a.mo140969a(34, 0);
        }
        if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
            this.f16761a.mo140969a(36, 1);
        }
        this.f16761a.mo140970a(72, C11265g.m19959a());
        this.f16761a.mo140969a(9, 2);
        this.f16761a.mo140983b();
        AbstractC6724g.AbstractC6726b bVar = this.f16764d;
        if (bVar != null) {
            bVar.mo12906h();
        }
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: b */
    public final void mo12890b(String str) {
        this.f16761a.mo140991d(str);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: c */
    public final void mo12894c(boolean z) {
        this.f16761a.mo140979a(z);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12879a(Surface surface) {
        this.f16761a.mo140971a(surface);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: b */
    public final void mo12891b(boolean z) {
        C87154g gVar;
        if (!z && (gVar = this.f16761a) != null) {
            gVar.mo140969a(41, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: c */
    public final void mo12893c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f16761a.mo140970a(86, str);
        }
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: d */
    public final void mo12896d(boolean z) {
        this.f16761a.mo140969a(76, z ? 1 : 0);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: e */
    public final void mo12898e(boolean z) {
        this.f16761a.mo140969a(56, z ? 1 : 0);
    }

    public C6751u(C6757z zVar) {
        this.f16761a = zVar.mo12961a();
        C6710aa aaVar = zVar.f16792g;
        this.f16762b = aaVar;
        AbstractC6724g.AbstractC6725a aVar = this.f16763c;
        if (aVar != null) {
            aaVar.f16642a = aVar;
            this.f16763c = null;
        }
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12880a(SurfaceHolder surfaceHolder) {
        this.f16761a.mo140972a(surfaceHolder);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12882a(C11690a aVar) {
        if (aVar == null) {
            aVar = new C11690a("", "", "");
        }
        this.f16761a.mo140970a(63, aVar.f27938a + "-" + aVar.f27939b);
        this.f16761a.mo140970a(64, aVar.f27940c);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12883a(String str) {
        this.f16761a.mo140982a(str);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12881a(AbstractC6724g.AbstractC6725a aVar, AbstractC6724g.AbstractC6726b bVar) {
        C6710aa aaVar = this.f16762b;
        if (aaVar != null) {
            aaVar.f16642a = aVar;
            this.f16762b.f16643b = bVar;
        } else {
            this.f16763c = aVar;
        }
        this.f16764d = bVar;
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12884a(String str, AbstractC11663q qVar) {
        this.f16761a.mo140982a(str);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12885a(String str, String str2) {
        this.f16761a.mo140985b(str);
        if (!C13627m.m24498a(str2)) {
            this.f16761a.mo140970a(43, str2);
        }
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12886a(String str, Map<String, String> map, AbstractC6724g.EnumC6728d dVar) {
        if (str.indexOf("://") <= 0) {
            this.f16761a.mo140988c(Uri.parse("file://".concat(String.valueOf(str))).toString());
            return;
        }
        this.f16761a.mo140980a(new C87132c[]{new C87132c(Uri.parse(str).toString(), map.get("sdk_params"))});
    }
}
