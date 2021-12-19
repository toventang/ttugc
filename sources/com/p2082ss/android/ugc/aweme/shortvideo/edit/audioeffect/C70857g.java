package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g */
public final class C70857g {

    /* renamed from: a */
    public C0490e<String, byte[]> f158636a;

    static {
        Covode.recordClassIndex(83348);
    }

    /* renamed from: a */
    public final void mo112027a() {
        this.f158636a.mo2094a(1);
    }

    private C70857g() {
        int min = Math.min((int) (Runtime.getRuntime().maxMemory() / 8), 1048576);
        this.f158636a = new C0490e<String, byte[]>(min, min) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70857g.C708581 */

            /* renamed from: a */
            final /* synthetic */ int f158637a;

            static {
                Covode.recordClassIndex(83349);
            }

            {
                this.f158637a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // androidx.p025c.C0490e
            /* renamed from: b */
            public final /* synthetic */ int mo2096b(String str, byte[] bArr) {
                byte[] bArr2 = bArr;
                C89219l.m154721d(str, "");
                C89219l.m154721d(bArr2, "");
                return bArr2.length;
            }
        };
    }

    public /* synthetic */ C70857g(byte b) {
        this();
    }

    /* renamed from: a */
    public final byte[] mo112029a(String str) {
        if (str == null) {
            return null;
        }
        return this.f158636a.mo2091a(str);
    }

    /* renamed from: a */
    public final void mo112028a(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            this.f158636a.mo2092a(str, bArr);
        }
    }
}
