package com.p2082ss.ugc.live.sdk.msg.p4472c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87081e;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87083f;
import com.p2082ss.ugc.live.sdk.msg.p4473d.AbstractC87110f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4632k.C89427i;

/* renamed from: com.ss.ugc.live.sdk.msg.c.d */
public final class C87098d {

    /* renamed from: a */
    public AbstractC87110f<C87083f, ? extends Exception> f196352a;

    /* renamed from: b */
    public AbstractC87110f<C87083f, ? extends Exception> f196353b;

    /* renamed from: c */
    C87083f f196354c;

    /* renamed from: d */
    public final C87100f f196355d;

    /* renamed from: e */
    public Runnable f196356e;

    /* renamed from: f */
    public final long f196357f;

    /* renamed from: g */
    public final long f196358g;

    /* renamed from: h */
    public final long f196359h;

    /* renamed from: i */
    public final C87081e f196360i;

    /* renamed from: j */
    public final AbstractC87079c f196361j;

    /* renamed from: k */
    private SdkUplinkPacket f196362k;

    /* renamed from: l */
    private Exception f196363l;

    /* renamed from: m */
    private boolean f196364m;

    static {
        Covode.recordClassIndex(102894);
    }

    /* renamed from: a */
    public final SdkUplinkPacket mo140807a() {
        String str;
        Map<String, String> map = this.f196360i.f196303c;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = this.f196360i.f196304d;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        byte[] a = this.f196360i.mo140790a();
        C89219l.m154709a((Object) a, "");
        try {
            Uri parse = Uri.parse(this.f196360i.f196302b);
            C89219l.m154709a((Object) parse, "");
            str = parse.getPath();
            if (str == null) {
                str = this.f196360i.f196302b;
            }
        } catch (Exception unused) {
            str = this.f196360i.f196302b;
        }
        SdkUplinkPacket build = new SdkUplinkPacket.Builder().uniqueID(Long.valueOf(this.f196357f)).serviceID(Long.valueOf(this.f196358g)).uri(str).queryParams(map2).headers(map).payload(C89427i.m155136of(Arrays.copyOf(a, a.length))).build();
        C89219l.m154709a((Object) build, "");
        return build;
    }

    /* renamed from: b */
    public final AbstractC87110f<C87083f, Exception> mo140810b() {
        byte[] bArr;
        int i;
        SdkUplinkPacket sdkUplinkPacket = this.f196362k;
        C87083f fVar = this.f196354c;
        Exception exc = this.f196363l;
        if (sdkUplinkPacket != null) {
            C89427i iVar = sdkUplinkPacket.payload;
            if (iVar == null || (bArr = iVar.toByteArray()) == null) {
                bArr = new byte[0];
            }
            C87083f.C87084a aVar = new C87083f.C87084a();
            Integer num = sdkUplinkPacket.statusCode;
            C89219l.m154709a((Object) num, "");
            C87083f.C87084a a = aVar.mo140795a(num.intValue()).mo140797a(sdkUplinkPacket.statusMessage).mo140799a(bArr);
            if (this.f196364m) {
                i = 1;
            } else {
                i = 2;
            }
            C87083f.C87084a b = a.mo140800b(i);
            if (!(bArr.length == 0 || this.f196360i.f196310j == null)) {
                b.mo140796a(this.f196360i.f196310j.mo13094a(bArr));
            }
            return AbstractC87110f.C87111a.m150861a(b.f196318a);
        } else if (fVar != null) {
            byte[] bArr2 = fVar.f196315d;
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            C87083f.C87084a b2 = new C87083f.C87084a().mo140795a(fVar.f196312a).mo140797a(fVar.f196313b).mo140799a(bArr2).mo140800b(0);
            if (!(bArr2.length == 0 || this.f196360i.f196310j == null)) {
                b2.mo140796a(this.f196360i.f196310j.mo13094a(bArr2));
            }
            return AbstractC87110f.C87111a.m150861a(b2.f196318a);
        } else if (exc != null) {
            return AbstractC87110f.C87111a.m150860a(exc);
        } else {
            return AbstractC87110f.C87111a.m150860a((Exception) new C87097c(-3, "request not finish", null, 4, null));
        }
    }

    /* renamed from: a */
    public final void mo140809a(Exception exc, EnumC87101g gVar, boolean z) {
        C89219l.m154719c(exc, "");
        C89219l.m154719c(gVar, "");
        this.f196363l = exc;
        this.f196355d.mo140815a(exc, gVar, z);
    }

    /* renamed from: a */
    public final void mo140808a(SdkUplinkPacket sdkUplinkPacket, EnumC87101g gVar, boolean z, boolean z2) {
        C89219l.m154719c(sdkUplinkPacket, "");
        C89219l.m154719c(gVar, "");
        this.f196364m = z2;
        this.f196362k = sdkUplinkPacket;
        this.f196355d.mo140814a(sdkUplinkPacket, gVar, z);
    }

    public C87098d(long j, long j2, long j3, C87081e eVar, AbstractC87079c cVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(cVar, "");
        this.f196357f = j;
        this.f196358g = j2;
        this.f196359h = j3;
        this.f196360i = eVar;
        this.f196361j = cVar;
        this.f196355d = new C87100f(j, j2);
    }
}
