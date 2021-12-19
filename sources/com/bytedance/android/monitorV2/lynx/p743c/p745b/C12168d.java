package com.bytedance.android.monitorV2.lynx.p743c.p745b;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p728a.AbstractC12068c;
import com.bytedance.android.monitorV2.p728a.AbstractC12071f;
import com.bytedance.android.monitorV2.p731d.C12081a;
import com.bytedance.android.monitorV2.p731d.C12082b;
import com.bytedance.android.monitorV2.p731d.C12090i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.c.b.d */
public final class C12168d extends AbstractC12068c {

    /* renamed from: a */
    public String f29283a;

    /* renamed from: b */
    public final C12090i f29284b;

    /* renamed from: c */
    public final AbstractC12067b f29285c;

    /* renamed from: d */
    private final C12081a f29286d;

    /* renamed from: e */
    private final C12082b f29287e;

    static {
        Covode.recordClassIndex(13897);
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: c */
    public final JSONObject mo19422c() {
        return null;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: d */
    public final JSONObject mo19423d() {
        return null;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12068c
    /* renamed from: a */
    public final C12090i mo19419a() {
        return this.f29284b;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g, com.bytedance.android.monitorV2.p728a.AbstractC12068c
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC12071f mo19420b() {
        return this.f29284b;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: e */
    public final AbstractC12067b mo19424e() {
        return this.f29285c;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: f */
    public final AbstractC12071f mo19425f() {
        return this.f29287e;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: g */
    public final AbstractC12071f mo19426g() {
        return this.f29286d;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: i */
    public final String mo19428i() {
        return this.f29284b.f29011c;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: h */
    public final String mo19427h() {
        AbstractC12067b bVar = this.f29285c;
        if (bVar != null) {
            return bVar.f28927a;
        }
        return "";
    }

    public final String toString() {
        return "LynxMonitorReportData{bid=" + this.f29283a + ", eventType=" + mo19427h() + ", nativeBase=" + this.f29284b + ", nativeInfo=" + this.f29285c + "}";
    }

    public C12168d(C12090i iVar, AbstractC12067b bVar, C12081a aVar, C12082b bVar2) {
        C89219l.m154719c(iVar, "");
        this.f29284b = iVar;
        this.f29285c = bVar;
        this.f29286d = aVar;
        this.f29287e = bVar2;
    }
}
