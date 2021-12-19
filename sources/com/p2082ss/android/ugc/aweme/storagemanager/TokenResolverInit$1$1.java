package com.p2082ss.android.ugc.aweme.storagemanager;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p961e.p963b.AbstractC14445b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.storagemanager.C76422a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.storagemanager.TokenResolverInit$1$1 */
class TokenResolverInit$1$1 implements AbstractC58264w {

    /* renamed from: a */
    final /* synthetic */ AbstractC14445b f171666a;

    /* renamed from: b */
    final /* synthetic */ Object f171667b;

    /* renamed from: c */
    final /* synthetic */ int f171668c;

    /* renamed from: d */
    final /* synthetic */ C76422a.C764231 f171669d;

    static {
        Covode.recordClassIndex(89385);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        int i = this.f171668c;
        if (i == 2) {
            return EnumC58151ae.APP_BACKGROUND;
        }
        if (i == 3) {
            return EnumC58151ae.SPARSE;
        }
        if (i != 4) {
            return EnumC58151ae.IDLE;
        }
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        this.f171666a.mo23273a(this.f171667b);
    }

    TokenResolverInit$1$1(C76422a.C764231 r1, AbstractC14445b bVar, Object obj, int i) {
        this.f171669d = r1;
        this.f171666a = bVar;
        this.f171667b = obj;
        this.f171668c = i;
    }
}
