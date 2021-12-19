package com.bytedance.android.live.wallet.p418e;

import android.content.Context;
import com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.e.a */
public class C6341a implements AbstractC6358b, AbstractC18293d {

    /* renamed from: a */
    public C18297h f15851a;

    /* renamed from: b */
    public JSONObject f15852b;

    /* renamed from: c */
    public Context f15853c;

    /* renamed from: d */
    public C18288a f15854d;

    static {
        Covode.recordClassIndex(7063);
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: a */
    public final void mo12256a(int i) {
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: a */
    public void mo12257a(int i, int i2, int i3, Exception exc) {
        C89219l.m154721d(exc, "");
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: a */
    public void mo12281a(DiamondPackageExtra diamondPackageExtra, List<C11314c> list) {
        C89219l.m154721d(list, "");
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: a */
    public void mo12282a(Exception exc, int i) {
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: b */
    public void mo12261b(int i) {
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: c */
    public final void mo12262c() {
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: l */
    public final void mo12290l() {
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: m */
    public final void mo12291m() {
    }

    /* renamed from: a */
    public final C18297h mo12391a() {
        C18297h hVar = this.f15851a;
        if (hVar == null) {
            C89219l.m154710a("jsMsg");
        }
        return hVar;
    }

    /* renamed from: b */
    public final JSONObject mo12394b() {
        JSONObject jSONObject = this.f15852b;
        if (jSONObject == null) {
            C89219l.m154710a("jsResult");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo12392a(C18297h hVar) {
        C89219l.m154721d(hVar, "");
        this.f15851a = hVar;
    }

    /* renamed from: a */
    public final void mo12393a(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        this.f15852b = jSONObject;
    }

    public C6341a(Context context, C18288a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f15853c = context;
        this.f15854d = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public void call(C18297h hVar, JSONObject jSONObject) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(jSONObject, "");
        this.f15851a = hVar;
        this.f15852b = jSONObject;
    }
}
