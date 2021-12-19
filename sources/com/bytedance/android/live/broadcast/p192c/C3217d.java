package com.bytedance.android.live.broadcast.p192c;

import com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a;
import com.bytedance.android.live.broadcast.stream.capture.p208a.C3690b;
import com.bytedance.android.livesdk.chatroom.p488c.C7404u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.c.d */
public final class C3217d {

    /* renamed from: a */
    private C3690b f9249a;

    static {
        Covode.recordClassIndex(3698);
    }

    public C3217d(AbstractC3688a aVar) {
        C3690b bVar = new C3690b();
        this.f9249a = bVar;
        aVar.mo8964a(bVar);
    }

    public final void onEvent(C7404u uVar) {
        if (uVar != null) {
            int i = uVar.f18345a;
            C7404u.C7405a aVar = uVar.f18346b;
            switch (i) {
                case 201:
                    float f = aVar.f18348b;
                    float f2 = aVar.f18349c;
                    int i2 = aVar.f18347a;
                    C3690b bVar = this.f9249a;
                    if (bVar != null && bVar.f11846a != null) {
                        bVar.f11846a.mo8997a(f, f2, i2);
                        return;
                    }
                    return;
                case 202:
                    float f3 = aVar.f18348b;
                    float f4 = aVar.f18349c;
                    int i3 = aVar.f18347a;
                    C3690b bVar2 = this.f9249a;
                    if (bVar2 != null && bVar2.f11846a != null) {
                        bVar2.f11846a.mo9006b(f3, f4, i3);
                        return;
                    }
                    return;
                case 203:
                    float f5 = aVar.f18348b;
                    float f6 = aVar.f18349c;
                    float f7 = aVar.f18350d;
                    float f8 = aVar.f18351e;
                    float f9 = aVar.f18352f;
                    C3690b bVar3 = this.f9249a;
                    if (bVar3 != null && bVar3.f11846a != null) {
                        bVar3.f11846a.mo8996a(f5, f6, f7, f8, f9);
                        return;
                    }
                    return;
                case 204:
                    float f10 = aVar.f18348b;
                    float f11 = aVar.f18349c;
                    C3690b bVar4 = this.f9249a;
                    if (bVar4 != null && bVar4.f11846a != null) {
                        bVar4.f11846a.mo9005b(f10, f11);
                        return;
                    }
                    return;
                case 205:
                    float f12 = aVar.f18353g;
                    float f13 = aVar.f18352f;
                    C3690b bVar5 = this.f9249a;
                    if (bVar5 != null && bVar5.f11846a != null) {
                        bVar5.f11846a.mo9007c(f12, f13);
                        return;
                    }
                    return;
                case 206:
                    float f14 = aVar.f18348b;
                    float f15 = aVar.f18349c;
                    C3690b bVar6 = this.f9249a;
                    if (bVar6 != null && bVar6.f11846a != null) {
                        bVar6.f11846a.mo8995a(f14, f15);
                        return;
                    }
                    return;
                case 207:
                    long j = aVar.f18354h;
                    float f16 = aVar.f18348b;
                    float f17 = aVar.f18349c;
                    float f18 = aVar.f18355i;
                    float f19 = aVar.f18356j;
                    int i4 = aVar.f18357k;
                    int i5 = aVar.f18358l;
                    C3690b bVar7 = this.f9249a;
                    if (bVar7 != null && bVar7.f11846a != null) {
                        bVar7.f11846a.mo8998a(j, f16, f17, f18, f19, i4, i5);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
